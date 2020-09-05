package com.eliteams.quick4j.web.service;

import java.util.List;

import org.springframework.ui.Model;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.web.model.User;

/**
 * 用户 业务 接口
 * 
 * @author StarZou
 * @since 2014年7月5日 上午11:53:33
 **/
public interface UserService extends GenericService<User, Long> {

    /**
     * 用户验证
     * 
     * @param user
     * @return
     */
    User authentication(User user);

    /**
     * 根据用户名查询用户
     * 
     * @param username
     * @return
     */
    User selectByUsername(String username);
    
    int isAdmin(String username);
    
    /*
     * 分页
     */
    Model selectUserByPage(String pageNow, Model model);
    
    int insert(User model);
    
    int delete(Integer id);
    
    List<String> getCountyByCity(String countyName);
    
    int setRole(String username, String role);

    Long getIdByName(String username);
    String selectRoleNameById(Long id);

//    int getUserIdByUsername(String username);
    //找回密码
    String findByUsername(String username);
    void updatePwd(String pwd);//修改密码
}
