package com.eliteams.quick4j.web.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.dao.PollYangZhiMapper;
import com.eliteams.quick4j.web.dao.QmpMapper;
import com.eliteams.quick4j.web.dao.RoleMapper;
import com.eliteams.quick4j.web.dao.UserMapper;
import com.eliteams.quick4j.web.model.PollYangZhi;
import com.eliteams.quick4j.web.model.Qmp;
 
 
import com.eliteams.quick4j.web.service.PollYangZhiService;


@Service
public class PollYangZhiServiceImpl extends GenericServiceImpl<PollYangZhi, Integer> implements PollYangZhiService {

    @Resource
    private PollYangZhiMapper pollYangZhiMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private RoleMapper roleMapper;
    
    @Override
    public int insert(PollYangZhi model) {
    	System.out.println("-------------insertSelective.xml");
        return pollYangZhiMapper.insertSelective(model);
    }

    @Override
    public int update(PollYangZhi model) {
    	System.out.println("-------------updateByPrimaryKeySelective.xml");
        return pollYangZhiMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public int delete(Integer id) {
        System.out.println("-------------deleteById.xml");
        return pollYangZhiMapper.deleteById(id);
    }

    @Override
    public PollYangZhi selectById(Integer id) {
    	System.out.println("-------------selectByPrimaryKey.xml");
        return pollYangZhiMapper.selectByPrimaryKey(id);
    }

    @Override
    public GenericDao<PollYangZhi, Integer> getDao() {
        return (GenericDao<PollYangZhi, Integer>) pollYangZhiMapper;
    }

	@Override
	public List<PollYangZhi> listAll() {
		System.out.println("-------------listAll.xml");
		return pollYangZhiMapper.listAll();
	}

	@Override
	public List<PollYangZhi> selectByPage(String pageNow) {
		Page page = null;		  
	    List<PollYangZhi> pollYangZhi = new ArrayList<PollYangZhi>();  	     
	    int totalCount = (int)pollYangZhiMapper.getCount();  	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        pollYangZhi = pollYangZhiMapper.selectByPage(page.getStartPos(), page.getPageSize());  
	    } else {  
	        page = new Page(totalCount, 1);  
	        pollYangZhi = pollYangZhiMapper.selectByPage(page.getStartPos(), page.getPageSize());  
	    }  
	    return pollYangZhi;
	}

	@Override
	public Page getPage(String pageNow) {
		Page page = null;
		int totalCount = (int)pollYangZhiMapper.getCount();  		  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	    } else {  
	        page = new Page(totalCount, 1);  
	    } 
	    return page;
	}
	
	@Override
	public List<PollYangZhi> searchByPage(String pageNow, Map map) {
		System.out.println("----333---"+map.get("username").toString().trim());
		Long userId = userMapper.getIdByName(map.get("username").toString().trim());
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("dzS", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			//System.out.println("----x-x-x-x-x-x-x---"+arr[0]+arr[1]);
			map.put("dzS", arr[0]);
			map.put("dzX", arr[1]);
		}
		
		Page page = null;		  
	    List<PollYangZhi> pollYangZhi = new ArrayList<PollYangZhi>();  	  
	    int totalCount = (int)pollYangZhiMapper.getSearchCount(map); 
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        pollYangZhi = pollYangZhiMapper.searchByPage(page.getStartPos(), page.getPageSize(),map);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        pollYangZhi = pollYangZhiMapper.searchByPage(page.getStartPos(), page.getPageSize(),map);  
	    }  
	    return pollYangZhi;
	}

	@Override
	public Page getSearchPage(String pageNow, Map map) {
		Long userId = userMapper.getIdByName(map.get("username").toString().trim());
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("dzS", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			System.out.println("----x-x-x-x-x-x-x---"+arr[0]+arr[1]);
			map.put("dzS", arr[0]);
			map.put("dzX", arr[1]);
		}
		
		Page page = null;
		int totalCount = (int)pollYangZhiMapper.getSearchCount(map);  		  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	    } else {  
	        page = new Page(totalCount, 1);  
	    } 
	    return page;
	}

	@Override
	public PollYangZhi selectByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public List<PollYangZhi> selectForMap(Map map) {
		Long userId = userMapper.getIdByName(map.get("username").toString().trim());
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("dzS", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			System.out.println("----x-x-x-x-x-x-x---"+arr[0]+arr[1]);
			map.put("dzS", arr[0]);
			map.put("dzX", arr[1]);
		}

		return pollYangZhiMapper.selectForMap(map);
	}
	
	
	
	
}
