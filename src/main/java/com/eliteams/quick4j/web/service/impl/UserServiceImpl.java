package com.eliteams.quick4j.web.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.dao.UserMapper;
import com.eliteams.quick4j.web.model.User;
import com.eliteams.quick4j.web.model.UserExample;
import com.eliteams.quick4j.web.service.UserService;

/**
 * 用户Service实现类
 *
 * @author StarZou
 * @since 2014年7月5日 上午11:54:24
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<User, Long> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int insert(User model) {
        return userMapper.insertSelective(model);
    }

    @Override
    public int update(User model) {
        return userMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public int delete(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User authentication(User user) {
        return userMapper.authentication(user);
    }

    @Override
    public User selectById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
	public Long getIdByName(String username){
    	return userMapper.getIdByName(username);
	}
    @Override
    public GenericDao<User, Long> getDao() {
        return userMapper;
    }

    @Override
    public User selectByUsername(String username) {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        final List<User> list = userMapper.selectByExample(example);
        return list.get(0);
    }

	@Override
	public int isAdmin(String username) {
		long t = 1;
		if(userMapper.isAdmin(username)==t){
			return 1;
		}else{
			return 0;
		}
	}

	@Override
	public Model selectUserByPage(String pageNow, Model model) {
		Page page = null;  
		  
	    List<User> user = new ArrayList<User>();  
	     
	    int totalCount = userMapper.getUserCount();  
	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        user = userMapper.selectUserByPage(page.getStartPosZcfg(), page.getZcfgPageSize());  
	    } else {  
	        page = new Page(totalCount, 1);  
	        user = userMapper.selectUserByPage(page.getStartPosZcfg(), page.getZcfgPageSize());  
	    }
	    for (User u : user) {
			Long id = u.getId();
			String role = userMapper.selectRoleNameById(id);
			u.setState(role);
		}
	    model.addAttribute("ulist",user);
	    model.addAttribute("page",page);
	    return model;
	}

	public int delete(Integer id) {
		return userMapper.deleteById(id);
	}

	@Override
	public List<String> getCountyByCity(String countyName) {
		List<String> n = new ArrayList<String>();
		List<String> o = userMapper.getCountyByCity(countyName);
		for(String str : o) {
			String[] temp = str.split("_");
			if(temp.length>=2){
				n.add(temp[1]);
			}
		}
		return n;
	}

	@Override
	public int setRole(String username, String role) {
		return userMapper.setRoleByUsername(username, role);
	}
	public String selectRoleNameById(Long id){
		return userMapper.selectRoleNameById(id);
	}

	@Override
	public String findByUsername(String username) {
		return userMapper.findByUsername(username);
	}

	@Override
	public void updatePwd(String pwd) {
		userMapper.updatePWD(pwd);
	}
}
