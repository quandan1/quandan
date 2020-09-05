package com.eliteams.quick4j.web.service.impl;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.web.dao.RoleMapper;
import com.eliteams.quick4j.web.model.Role;
import com.eliteams.quick4j.web.service.RoleService;

/**
 * 角色Service实现类
 *
 * @author StarZou
 * @since 2014年6月10日 下午4:16:33
 */
@Service
public class RoleServiceImpl extends GenericServiceImpl<Role, Long> implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public GenericDao<Role, Long> getDao() {
        return roleMapper;
    }

    @Override
    public List<Role> selectRolesByUserId(Long userId) {
        return roleMapper.selectRolesByUserId(userId);
    }

    @Override
    public List<String> getCitys() {
        return roleMapper.getCitys();
    }

    @Override
    public long selectUserIdByUname(String uname) {
        return roleMapper.getUserIdByUname(uname);
    }

    @Override
    public String getRoleNameByUname(String name) {
        long uid= selectUserIdByUname(name);
        long rid = selectRoleIdByUid(uid);
        return roleMapper.getRoleNameByID(rid);
    }

    @Override
    public long selectRoleIdByUid(long uid) {
        return roleMapper.getRoleIdByUserId(uid);
    }

}
