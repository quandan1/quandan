package com.eliteams.quick4j.web.security;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Resource;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.eliteams.quick4j.web.model.Permission;
import com.eliteams.quick4j.web.model.Role;
import com.eliteams.quick4j.web.model.User;
import com.eliteams.quick4j.web.service.PermissionService;
import com.eliteams.quick4j.web.service.RoleService;
import com.eliteams.quick4j.web.service.UserService;
import sun.security.krb5.Credentials;

/**
 * 用户身份验证,授权 Realm 组件
 * 
 * @author StarZou
 * @since 2014年6月11日 上午11:35:28
 **/
@Component(value = "securityRealm")
public class SecurityRealm extends AuthorizingRealm {

    @Resource
    private UserService userService;

    @Resource
    private RoleService roleService;

    @Resource
    private PermissionService permissionService;



    /**
     * 权限检查
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        String username = String.valueOf(principals.getPrimaryPrincipal());

        final User user = userService.selectByUsername(username);
        final List<Role> roleInfos = roleService.selectRolesByUserId(user.getId());
        for (Role role : roleInfos) {
            // 添加角色
            System.err.println(role);
            authorizationInfo.addRole(role.getRoleSign());

            final List<Permission> permissions = permissionService.selectPermissionsByRoleId(role.getId());
            for (Permission permission : permissions) {
                // 添加权限
                System.err.println(permission);
                authorizationInfo.addStringPermission(permission.getPermissionSign());
            }
        }
        return authorizationInfo;
    }

    /**
     * 登录验证
     */

    @Autowired
    private EhCacheManager shiroEhcacheManager;
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = String.valueOf(token.getPrincipal());
        String password = new String((char[]) token.getCredentials());
        Cache passwordRetryCache = shiroEhcacheManager.getCache("passwordRetryCache_admp");
        AtomicInteger retryCount = (AtomicInteger) passwordRetryCache.get(username);
        if (null != retryCount && retryCount.get() > 5) {
            throw new LockedAccountException("账户被锁定");

        }
            // 通过数据库进行验证
            final User authentication = userService.authentication(new User(username, password));
            if (authentication == null) {
                throw new UnknownAccountException("用户不存在.");

            }
            ByteSource credentialsSalt = ByteSource.Util.bytes(username);

        return new SimpleAuthenticationInfo(username, authentication.getPassword(), credentialsSalt, getName());
        }
        public static void main(String[] args) {
            Object result = new SimpleHash("md5", "123456", ByteSource.Util.bytes("starzou"), 1024);
            System.out.println(result);
    }
}









