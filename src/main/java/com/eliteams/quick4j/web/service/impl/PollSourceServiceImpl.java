package com.eliteams.quick4j.web.service.impl;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.dao.PollSourceMapper;
import com.eliteams.quick4j.web.dao.RoleMapper;
import com.eliteams.quick4j.web.dao.UserMapper;
import com.eliteams.quick4j.web.model.PollSource;
import com.eliteams.quick4j.web.service.PollSourceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service
public class PollSourceServiceImpl extends GenericServiceImpl<PollSource, Long> implements PollSourceService {

    @Resource
    private PollSourceMapper pollsourceMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private RoleMapper roleMapper;
    
    @Override
    public int insert(PollSource model) {
    	System.out.println("-------------insertSelective.xml");
        return pollsourceMapper.insertSelective(model);
    }

    @Override
    public int update(PollSource model) {
    	System.out.println("-------------updateByPrimaryKeySelective.xml");
        return pollsourceMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public int delete(Long id) {
        System.out.println("-------------deleteById.xml");
        return pollsourceMapper.deleteById(id);
    }

    @Override
    public PollSource selectById(Long id) {
    	System.out.println("-------------selectByPrimaryKey.xml");
        return pollsourceMapper.selectByPrimaryKey(id);
    }

    @Override
    public GenericDao<PollSource, Long> getDao() {
        return pollsourceMapper;
    }

	@Override
	public List<PollSource> listAll() {
		System.out.println("-------------listAll.xml");
		return pollsourceMapper.listAll();
	}

	@Override
	public List<PollSource> selectByPage(String pageNow) {
		Page page = null;
	    List<PollSource> pollsource = new ArrayList<PollSource>();
	    int totalCount = (int)pollsourceMapper.getCount();  	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));
	        pollsource = pollsourceMapper.selectByPage(page.getStartPos(), page.getPageSize());  
	    } else {  
	        page = new Page(totalCount, 1);
	        pollsource = pollsourceMapper.selectByPage(page.getStartPos(), page.getPageSize());  
	    }  
	    return pollsource;
	}

	@Override
	public Page getPage(String pageNow) {
		Page page = null;
		int totalCount = (int)pollsourceMapper.getCount();  		  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));
	    } else {  
	        page = new Page(totalCount, 1);
	    } 
	    return page;
	}
	
	@Override
	public List<PollSource> searchByPage(String pageNow, Map map) {
		System.out.println("----333---"+map.get("username").toString().trim());
		Long userId = userMapper.getIdByName(map.get("username").toString().trim());
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
 
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			//
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		
		Page page = null;
	    List<PollSource> pollsource = new ArrayList<PollSource>();
	    int totalCount = (int)pollsourceMapper.getSearchCount(map); 
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));
	        pollsource = pollsourceMapper.searchByPage(page.getStartPos(), page.getPageSize(),map);  
	    } else {  
	        page = new Page(totalCount, 1);
	        pollsource = pollsourceMapper.searchByPage(page.getStartPos(), page.getPageSize(),map);  
	    }  
	    return pollsource;
	}

	@Override
	public Page getSearchPage(String pageNow, Map map) {
		Long userId = userMapper.getIdByName(map.get("username").toString().trim());
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			System.out.println("----x-x-x-x-x-x-x---"+arr[0]+arr[1]);
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		
		Page page = null;
		int totalCount = (int)pollsourceMapper.getSearchCount(map);  		  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));
	    } else {  
	        page = new Page(totalCount, 1);
	    } 
	    return page;
	}

	@Override
	public PollSource selectByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public List<PollSource> selectForMap(Map map) {
		Long userId = userMapper.getIdByName(map.get("username").toString().trim());
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			System.out.println("----x-x-x-x-x-x-x---"+arr[0]+arr[1]);
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}

		return pollsourceMapper.selectForMap(map);
	}

	@Override
	public List<PollSource> getShuiwennf(Map map) {
		return pollsourceMapper.getShuiwennf( map);
	}

	@Override
	public List<PollSource> getQiye(Map map) {
		return pollsourceMapper.getQiye(map);
	}


}
