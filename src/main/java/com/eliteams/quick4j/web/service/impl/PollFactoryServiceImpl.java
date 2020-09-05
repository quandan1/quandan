package com.eliteams.quick4j.web.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.dao.PollFactoryMapper;
import com.eliteams.quick4j.web.dao.QmpMapper;
import com.eliteams.quick4j.web.dao.RoleMapper;
import com.eliteams.quick4j.web.dao.UserMapper;
import com.eliteams.quick4j.web.model.PollFactory;
import com.eliteams.quick4j.web.model.Qmp;
 
 
import com.eliteams.quick4j.web.service.PollFactoryService;


@Service
public class PollFactoryServiceImpl extends GenericServiceImpl<PollFactory, Long> implements PollFactoryService {

    @Resource
    private PollFactoryMapper pollfactoryMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private RoleMapper roleMapper;
    
    @Override
    public int insert(PollFactory model) {
    	System.out.println("-------------insertSelective.xml");
        return pollfactoryMapper.insertSelective(model);
    }

    @Override
    public int update(PollFactory model) {
    	System.out.println("-------------updateByPrimaryKeySelective.xml");
        return pollfactoryMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public int delete(Long id) {
        System.out.println("-------------deleteById.xml");
        return pollfactoryMapper.deleteById(id);
    }

    @Override
    public PollFactory selectById(Long id) {
    	System.out.println("-------------selectByPrimaryKey.xml");
        return pollfactoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public GenericDao<PollFactory, Long> getDao() {
        return pollfactoryMapper;
    }

	@Override
	public List<PollFactory> listAll() {
		System.out.println("-------------listAll.xml");
		return pollfactoryMapper.listAll();
	}

	@Override
	public List<PollFactory> selectByPage(String pageNow) {
		Page page = null;		  
	    List<PollFactory> pollfactory = new ArrayList<PollFactory>();  	     
	    int totalCount = (int)pollfactoryMapper.getCount();  	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        pollfactory = pollfactoryMapper.selectByPage(page.getStartPos(), page.getPageSize());  
	    } else {  
	        page = new Page(totalCount, 1);  
	        pollfactory = pollfactoryMapper.selectByPage(page.getStartPos(), page.getPageSize());  
	    }  
	    return pollfactory;
	}

	@Override
	public Page getPage(String pageNow) {
		Page page = null;
		int totalCount = (int)pollfactoryMapper.getCount();  		  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	    } else {  
	        page = new Page(totalCount, 1);  
	    } 
	    return page;
	}
	
	@Override
	public List<PollFactory> searchByPage(String pageNow, Map map) {
		System.out.println("----333---"+map.get("username").toString().trim());
		Long userId = userMapper.getIdByName(map.get("username").toString().trim());
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("qyxxdzDqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			//System.out.println("----x-x-x-x-x-x-x---"+arr[0]+arr[1]);
			map.put("qyxxdzDqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		
		Page page = null;		  
	    List<PollFactory> pollfactory = new ArrayList<PollFactory>();  	  
	    int totalCount = (int)pollfactoryMapper.getSearchCount(map); 
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        pollfactory = pollfactoryMapper.searchByPage(page.getStartPos(), page.getPageSize(),map);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        pollfactory = pollfactoryMapper.searchByPage(page.getStartPos(), page.getPageSize(),map);  
	    }  
	    return pollfactory;
	}

	@Override
	public Page getSearchPage(String pageNow, Map map) {
		Long userId = userMapper.getIdByName(map.get("username").toString().trim());
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("qyxxdzDqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			System.out.println("----x-x-x-x-x-x-x---"+arr[0]+arr[1]);
			map.put("qyxxdzDqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		
		Page page = null;
		int totalCount = (int)pollfactoryMapper.getSearchCount(map);  		  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	    } else {  
	        page = new Page(totalCount, 1);  
	    } 
	    return page;
	}

	@Override
	public PollFactory selectByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public List<PollFactory> selectForMap(Map map) {
		Long userId = userMapper.getIdByName(map.get("username").toString().trim());
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("qyxxdzDqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("qyxxdzDqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}

		return pollfactoryMapper.selectForMap(map);
	}

	@Override
	public List<PollFactory> getWsc(Map map) {
		return pollfactoryMapper.getWsc(map);
	}


}
