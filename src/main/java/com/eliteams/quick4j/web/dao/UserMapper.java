package com.eliteams.quick4j.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.eliteams.quick4j.core.feature.orm.mybatis.Page;
import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.web.model.User;
import com.eliteams.quick4j.web.model.UserExample;
import com.eliteams.quick4j.web.model.Zcfg;

/**
 * 用户Dao接口
 * 
 * @author StarZou
 * @since 2014年7月5日 上午11:49:57
 **/
public interface UserMapper extends GenericDao<User, Long> {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 用户登录验证查询
     * 
     * @param record
     * @return
     */
    User authentication(@Param("record") User record);

    /**
     * 分页条件查询
     * 
     * @param page
     * @param example
     * @return
     */
    List<User> selectByExampleAndPage(Page<User> page, UserExample example);
    
    Long getIdByName(String username);
    
    Long isAdmin(String username);
    
    String selectRoleNameById(Long id);
    
    List<User> selectUserByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize);
    
    int getUserCount();
    
    int deleteById(Integer id);
    
    List<String> getCountyByCity(String countyName);
    
    int setRoleByUsername(@Param(value = "username") String username, @Param(value = "role") String role);
//    User fromusernameGetRoleName(String username);
//    int getUserIdByUsername(String username);
    String findByUsername(String username); // 找回密码
    int updatePWD(String pwd);//修改密码
}