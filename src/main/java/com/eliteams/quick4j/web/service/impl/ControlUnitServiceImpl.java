package com.eliteams.quick4j.web.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.dao.ControlUnitMapper;
import com.eliteams.quick4j.web.dao.PollFactoryMapper;
import com.eliteams.quick4j.web.dao.PollSourceMapper;
import com.eliteams.quick4j.web.dao.PollYangZhiMapper;
import com.eliteams.quick4j.web.dao.QmpMapper;
import com.eliteams.quick4j.web.dao.QmpWrxxMapper;
import com.eliteams.quick4j.web.dao.QmpWrxxYearMapper;
import com.eliteams.quick4j.web.dao.RoleMapper;
import com.eliteams.quick4j.web.dao.UserMapper;
import com.eliteams.quick4j.web.model.ControlUnit;
import com.eliteams.quick4j.web.model.Dmzljs;
import com.eliteams.quick4j.web.model.Qmp;
import com.eliteams.quick4j.web.model.QmpWrxx;
import com.eliteams.quick4j.web.model.QmpWrxxYear;
import com.eliteams.quick4j.web.service.ControlUnitService;
@Service
public class ControlUnitServiceImpl extends GenericServiceImpl<ControlUnit, Integer> implements ControlUnitService{

	
	@Resource
	private ControlUnitMapper controlUnitMapper;
	@Resource
	private PollSourceMapper pollSourceMapper;
	@Resource
    private UserMapper userMapper;
    @Resource
    private RoleMapper roleMapper;

    @Resource
	private PollYangZhiMapper pollYangZhiMapper;
    
    @Resource
	private PollFactoryMapper pollFactoryMapper;
    
	@Resource
	private QmpMapper qmpMapper;
	@Resource
	private QmpWrxxYearMapper qmpWrxxYearMapper;
    
	@Resource
	private QmpWrxxMapper qmpWrxxMapper;
	
	@Override
	public int update(ControlUnit model){
     	return controlUnitMapper.updateByPrimaryKeySelective(model);
	}
	
	@Override
	public int insert(ControlUnit model){
		return controlUnitMapper.insertSelective(model);
	}
	
	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return controlUnitMapper.deleteById(id);
	}
    
	
	@Override
	public ControlUnit selectById(Integer id) {
		// TODO Auto-generated method stub
		return controlUnitMapper.selectByPrimaryKey(id);
	}

	@Override
	public ControlUnit selectByName(String name) {
		// TODO Auto-generated method stub
		return controlUnitMapper.selectByName(name);
	}

	@Override
	public List<ControlUnit> listAll() {
		// TODO Auto-generated method stub
		return controlUnitMapper.listAll();
	}

	
	@Override
	public Model selectCUByPage(String pageNow,Model model,String userName){
		//System.out.println("在这里");
		Map map = new HashMap<String, String>();
   		map.put("involve_city","");
   		map.put("involve_county","");
   		Long userId = userMapper.getIdByName(userName.trim());
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("involve_city", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("involve_city", arr[0]);
			map.put("involve_county", arr[1]);
		}
	    Page page = null;  
	  
	    List<ControlUnit> controlUnit = new ArrayList<ControlUnit>();  
	     
	    int totalCount = (int)controlUnitMapper.getCUCount(map);  
	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        controlUnit = controlUnitMapper.selectCUByPage(page.getStartPos(), page.getPageSize(),map);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        controlUnit = controlUnitMapper.selectCUByPage(page.getStartPos(), page.getPageSize(),map);  
	    }  
	    model.addAttribute("clist",controlUnit);
	    model.addAttribute("page",page);
	    return model;
	}

	@SuppressWarnings("unchecked")
	@Override
	public GenericDao<ControlUnit, Integer> getDao() {
		// TODO Auto-generated method stub
		return (GenericDao<ControlUnit, Integer>) controlUnitMapper;
	}

	@Override
	public List<ControlUnit> searchByPage(String pageNow, Map map) {
		Long userId = userMapper.getIdByName(map.get("username").toString().trim());
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("involve_city", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("involve_city", arr[0]);
			map.put("involve_county", arr[1]);
		}
		System.out.println(map.get("involve_city"));
		// TODO Auto-generated method stub
		Page page = null;		  
	    List<ControlUnit> controlUnit = new ArrayList<ControlUnit>();  	  
	    int totalCount = (int)controlUnitMapper.getSearchCount(map); 
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        controlUnit = controlUnitMapper.searchByPage(page.getStartPos(), page.getPageSize(),map);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        controlUnit = controlUnitMapper.searchByPage(page.getStartPos(), page.getPageSize(),map);  
	    }  
	    return controlUnit;
	}

	@Override
	public Page getSearchPage(String pageNow, Map map) {
		Long userId = userMapper.getIdByName(map.get("username").toString().trim());
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("involve_city", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("involve_city", arr[0]);
			map.put("involve_county", arr[1]);
		}
		// TODO Auto-generated method stub
		Page page = null;
		int totalCount = (int)controlUnitMapper.getSearchCount(map);  		  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	    } else {  
	        page = new Page(totalCount, 1);  
	    } 
	    return page;
	}

	@Override
	public List<ControlUnit> selectForMap(Map map) {
		Long userId = userMapper.getIdByName(map.get("username").toString().trim());
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("involve_city", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("involve_city", arr[0]);
			map.put("involve_county", arr[1]);
		}
		// TODO Auto-generated method stub
		return controlUnitMapper.selectForMap(map);
	}


	@Override
	public List<Map<String,String>> selectKzdyTotal(String userName,Map map, List list) {
		// TODO Auto-generated method stub
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		Page page = null;
		List<Map<String, String>> kzdy = new ArrayList<Map<String,String>>();
		int totalCount = pollSourceMapper.getKzdyCount(map,list);

		kzdy = pollSourceMapper.selectKzdyTotal(0, totalCount,map,list);

		return kzdy;
	}

	@Override
	public List<Map<String,String>> selectKzdyTotal(String pageNow,String userName,Map map, List list) {
		// TODO Auto-generated method stub
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		Page page = null;		  
	    List<Map<String, String>> kzdy = new ArrayList<Map<String,String>>();  	  
	    int totalCount = pollSourceMapper.getKzdyCount(map,list); 
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        kzdy = pollSourceMapper.selectKzdyTotal(page.getStartPosZcfg(), page.getZcfgPageSize(),map,list);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        kzdy = pollSourceMapper.selectKzdyTotal(page.getStartPosZcfg(), page.getZcfgPageSize(),map,list);  
	    }  
	    return kzdy;
	}

	@Override
	public Page getKzdyPage(String pageNow,String userName,Map map, List list) {
		// TODO Auto-generated method stub
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		Page page = null;
		int totalCount = pollSourceMapper.getKzdyCount(map,list);  		  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	    } else {  
	        page = new Page(totalCount, 1);  
	    } 
	    return page;
	}

	@Override
	public List<Map<String, String>> selectKzdyTotalByName(String name,String userName) {
		Map map = new HashMap();
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}

		int totalCount = pollSourceMapper.getKzdyCountByName(name,map);
		List<Map<String, String>> kzdy = pollSourceMapper.selectKzdyTotalByName(0,totalCount,name,map);

		return kzdy;
	}

	@Override
	public List<Map<String, String>> selectKzdyTotalByName(String pageNow,
			String name,String userName) {
		Map map = new HashMap();
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		Page page = null;		  
	    List<Map<String, String>> kzdy = new ArrayList<Map<String,String>>();  	  
	    int totalCount = pollSourceMapper.getKzdyCountByName(name,map); 
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        kzdy = pollSourceMapper.selectKzdyTotalByName(page.getStartPosZcfg(), page.getZcfgPageSize(),name,map);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        kzdy = pollSourceMapper.selectKzdyTotalByName(page.getStartPosZcfg(), page.getZcfgPageSize(),name,map);  
	    }  
	    return kzdy;
	}

	@Override
	public Page getKzdyPageByName(String pageNow, String name,String userName) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		Page page = null;
		int totalCount = pollSourceMapper.getKzdyCountByName(name,map);  		  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	    } else {  
	        page = new Page(totalCount, 1);  
	    } 
	    return page;
	}

	@Override
	public String getRoleSign(String name) {
		// TODO Auto-generated method stub
		Long userId = userMapper.getIdByName(name.trim());
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
//		if(roleSign.equals("1")){		
//		}else if(roleSign.equals("2")){
//		}else if(roleSign.equals("3")){
//		}
		return roleSign;
	}

	@Override
	public int computeKzdyTotal(Map map) {
		int result = pollSourceMapper.computeKzdyTotal(map);
		System.out.println(result);
		return result;
	}

	@Override
	public ControlUnit selectForInfo(String name) {
		// TODO Auto-generated method stub
		return controlUnitMapper.selectForInfo(name);
	}

	@Override
	public List<ControlUnit> selectAllForLeft(Map map) {
		// TODO Auto-generated method stub
		Long userId = userMapper.getIdByName(map.get("username").toString().trim());
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("involve_city", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("involve_city", arr[0]);
			map.put("involve_county", arr[1]);
		}
		return controlUnitMapper.selectAllForLeft(map);
	}



	@Override
	public List<Map<String,String>> selectKzdyYangZhiTotal(String userName, Map map, List list) {
		// TODO Auto-generated method stub
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		Page page = null;
		List<Map<String, String>> kzdy = new ArrayList<Map<String,String>>();
		int totalCount = pollYangZhiMapper.getKzdyCount(map,list);
		kzdy = pollYangZhiMapper.selectKzdyTotal(1,totalCount,map,list);
		return kzdy;
	}

	//畜禽养殖总量计算
	
	@Override
	public List<Map<String,String>> selectKzdyYangZhiTotal(String pageNow,String userName, Map map, List list) {
		// TODO Auto-generated method stub
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		Page page = null;		  
	    List<Map<String, String>> kzdy = new ArrayList<Map<String,String>>();  	  
	    int totalCount = pollYangZhiMapper.getKzdyCount(map,list); 
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        kzdy = pollYangZhiMapper.selectKzdyTotal(page.getStartPosZcfg(), page.getZcfgPageSize(),map,list);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        kzdy = pollYangZhiMapper.selectKzdyTotal(page.getStartPosZcfg(), page.getZcfgPageSize(),map,list);  
	    }  
	    return kzdy;
	}

	@Override
	public Page getKzdyYangZhiPage(String pageNow,String userName, Map map, List list) {
		// TODO Auto-generated method stub
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		Page page = null;
		int totalCount = pollYangZhiMapper.getKzdyCount(map,list);  		  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	    } else {  
	        page = new Page(totalCount, 1);  
	    } 
	    return page;
	}

	@Override
	public List<Map<String, String>> selectKzdyYangZhiTotalByName(String name,String userName) {
		Map map = new HashMap();
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		Page page = null;
		List<Map<String, String>> kzdy = new ArrayList<Map<String,String>>();
		int totalCount = pollYangZhiMapper.getKzdyCountByName(name,map);

		kzdy = pollYangZhiMapper.selectKzdyTotalByName(0,totalCount,name,map);

		return kzdy;
	}

	@Override
	public List<Map<String, String>> selectKzdyYangZhiTotalByName(String pageNow,
			String name,String userName) {
		Map map = new HashMap();
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		Page page = null;		  
	    List<Map<String, String>> kzdy = new ArrayList<Map<String,String>>();  	  
	    int totalCount = pollYangZhiMapper.getKzdyCountByName(name,map); 
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        kzdy = pollYangZhiMapper.selectKzdyTotalByName(page.getStartPosZcfg(), page.getZcfgPageSize(),name,map);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        kzdy = pollYangZhiMapper.selectKzdyTotalByName(page.getStartPosZcfg(), page.getZcfgPageSize(),name,map);  
	    }  
	    return kzdy;
	}

	@Override
	public Page getKzdyYangZhiPageByName(String pageNow, String name,String userName) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		Page page = null;
		int totalCount = pollYangZhiMapper.getKzdyCountByName(name,map);  		  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	    } else {  
	        page = new Page(totalCount, 1);  
	    } 
	    return page;
	}


	//污水处理厂总量计算
	@Override
	public List<Map<String,String>> selectKzdyFactoryAll(String userName, Map map, List list) {
		// TODO Auto-generated method stub
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}

		int totalCount = pollFactoryMapper.getKzdyCount(map,list);
		List<Map<String, String>> kzdy = pollFactoryMapper.selectKzdyTotal(1, totalCount,map,list);

		return kzdy;
	}

	//污水处理厂总量计算
	@Override
	public List<Map<String,String>> selectKzdyFactoryTotal(String pageNow,String userName, Map map, List list) {
		// TODO Auto-generated method stub
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		Page page = null;		  
	    List<Map<String, String>> kzdy = new ArrayList<Map<String,String>>();  	  
	    int totalCount = pollFactoryMapper.getKzdyCount(map,list); 
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        kzdy = pollFactoryMapper.selectKzdyTotal(page.getStartPosZcfg(), page.getZcfgPageSize(),map,list);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        kzdy = pollFactoryMapper.selectKzdyTotal(page.getStartPosZcfg(), page.getZcfgPageSize(),map,list);  
	    }  
	    return kzdy;
	}

	@Override
	public Page getKzdyFactoryPage(String pageNow,String userName, Map map, List list) {
		// TODO Auto-generated method stub
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		Page page = null;
		int totalCount = pollFactoryMapper.getKzdyCount(map,list);  		  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	    } else {  
	        page = new Page(totalCount, 1);  
	    } 
	    return page;
	}

	@Override
	public List<Map<String, String>> selectKzdyFactoryTotalByName(String name,String userName) {
		Map map = new HashMap();
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}

		List<Map<String, String>> kzdy = new ArrayList<Map<String,String>>();
		int totalCount = pollFactoryMapper.getKzdyCountByName(name,map);
		kzdy = pollFactoryMapper.selectKzdyTotalByName(1,totalCount,name,map);
		return kzdy;
	}

	@Override
	public List<Map<String, String>> selectKzdyFactoryTotalByName(String pageNow,
			String name,String userName) {
		Map map = new HashMap();
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		Page page = null;		  
	    List<Map<String, String>> kzdy = new ArrayList<Map<String,String>>();  	  
	    int totalCount = pollFactoryMapper.getKzdyCountByName(name,map); 
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        kzdy = pollFactoryMapper.selectKzdyTotalByName(page.getStartPosZcfg(), page.getZcfgPageSize(),name,map);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        kzdy = pollFactoryMapper.selectKzdyTotalByName(page.getStartPosZcfg(), page.getZcfgPageSize(),name,map);  
	    }  
	    return kzdy;
	}

	@Override
	public Page getKzdyFactoryPageByName(String pageNow, String name,String userName) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if(roleSign.equals("1")){		
		}else if(roleSign.equals("2")){
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		}else if(roleSign.equals("3")){
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		Page page = null;
		int totalCount = pollFactoryMapper.getKzdyCountByName(name,map);  		  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	    } else {  
	        page = new Page(totalCount, 1);  
	    } 
	    return page;
	}

	@Override
	public List<Map<String, String>> selectWater() {
		// TODO Auto-generated method stub        
		return pollSourceMapper.selectWater();
	}

	@Override
	public List<Map<String, String>> selectWaterYangZhi() {
		// TODO Auto-generated method stub
		return pollYangZhiMapper.selectWater();
	}

	@Override
	public List<Map<String, String>> selectWaterFactory() {
		// TODO Auto-generated method stub
		return pollFactoryMapper.selectWater();
	}

	public List<ControlUnit> searchByPage_youkong(Map map) {
		Long userId = userMapper.getIdByName(map.get("username").toString().trim());
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if (roleSign.equals("1")) {
		} else if (roleSign.equals("2")) {
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("loc_city", roleName);
		} else if (roleSign.equals("3")) {
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("loc_city", arr[0]);
			map.put("loc_county", arr[1]);
		}

		List<Qmp> qmp = new LinkedList<Qmp>();
		qmp = qmpMapper.selectForMap(map);

		List<QmpWrxxYear> qmp_goal = new LinkedList<QmpWrxxYear>();
		qmp_goal = qmpWrxxYearMapper.selectQmpGoal();

		List<Qmp> qmp_y = new LinkedList<Qmp>();
		List<Qmp> qmp_n = new LinkedList<Qmp>();

		for (int i = 0; i < qmp.size(); i++) {
			String goal = qmp.get(i).getQualityTarget();
			String qmpName = qmp.get(i).getSectionName();

			for (int j = 0; j < qmp_goal.size(); j++) {
				String now = qmp_goal.get(j).getNjlb();
				String qmpGoalName = qmp_goal.get(j).getDmmc();
				if (qmpName.equals(qmpGoalName)) {
					if (changeType(goal) >= changeType(now)) {
						qmp_y.add(qmp.get(i));
						System.out.println(qmpName+"达标"+"水质类别"+changeType(now)+"水质目标"+changeType(goal));
					} else {
						qmp_n.add(qmp.get(i));
						System.out.println(qmpName+"不达标"+"水质类别"+changeType(now)+"水质目标"+changeType(goal));
					}
					break;
				}
			}
		}

		List<ControlUnit> cu_result = new LinkedList<ControlUnit>();
		List<ControlUnit> cu_y = new LinkedList<ControlUnit>();
		List<ControlUnit> cu_n = new LinkedList<ControlUnit>();
		List<ControlUnit> cu_all = controlUnitMapper.selectForMap(map);

		for (int i = 0; i < cu_all.size(); i++) {
			for (int j = 0; j < qmp_y.size(); j++) {
				if(cu_all.get(i).getIncludeSection().indexOf(qmp_y.get(j).getSectionName())!=-1){
					cu_y.add(cu_all.get(i));
					break;
				}
			}
			for (int k = 0; k < qmp_n.size(); k++) {
				if(cu_all.get(i).getIncludeSection().indexOf(qmp_n.get(k).getSectionName())!=-1){
					cu_n.add(cu_all.get(i));
					break;
				}
			}
		}

		int count_y = cu_y.size();
		int count_n = cu_n.size();

		if (map.get("youkong").toString().equals("1")) {
			// 不达标
				try {
					for (int k = 0; k < count_n; k++) {
						cu_result.add(cu_n.get(k));
					}
				} catch (Exception e) {
					System.out.println("Nothing");
				}
		} else {
				try {
					for (int k = 0; k < count_y; k++) {
						cu_result.add(cu_y.get(k));
					}
				} catch (Exception e) {
					System.out.println("Nothing");
				}
		}
		return cu_result;
	}

	public List<ControlUnit> searchByPage_youkong(String pageNow, Map map) {
		Long userId = userMapper.getIdByName(map.get("username").toString().trim());
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if (roleSign.equals("1")) {
		} else if (roleSign.equals("2")) {
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("loc_city", roleName);
		} else if (roleSign.equals("3")) {
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("loc_city", arr[0]);
			map.put("loc_county", arr[1]);
		}

		Page page = null;
		List<Qmp> qmp = new LinkedList<Qmp>();
		qmp = qmpMapper.selectForMap(map);

		List<QmpWrxxYear> qmp_goal = new LinkedList<QmpWrxxYear>();
		qmp_goal = qmpWrxxYearMapper.selectQmpGoal();

		List<Qmp> qmp_y = new LinkedList<Qmp>();
		List<Qmp> qmp_n = new LinkedList<Qmp>();

		for (int i = 0; i < qmp.size(); i++) {
			String goal = qmp.get(i).getQualityTarget();
			String qmpName = qmp.get(i).getSectionName();

			for (int j = 0; j < qmp_goal.size(); j++) {
				String now = qmp_goal.get(j).getNjlb();
				String qmpGoalName = qmp_goal.get(j).getDmmc();
				if (qmpName.equals(qmpGoalName)) {
					if (changeType(goal) >= changeType(now)) {
						qmp_y.add(qmp.get(i));
						System.out.println(qmpName+"达标"+"水质类别"+changeType(now)+"水质目标"+changeType(goal));
					} else {
						qmp_n.add(qmp.get(i));
						System.out.println(qmpName+"不达标"+"水质类别"+changeType(now)+"水质目标"+changeType(goal));
					}
					break;
				}
			}
		}

		List<ControlUnit> cu_result = new LinkedList<ControlUnit>();	
		List<ControlUnit> cu_y = new LinkedList<ControlUnit>();
		List<ControlUnit> cu_n = new LinkedList<ControlUnit>();
		List<ControlUnit> cu_all = controlUnitMapper.selectForMap(map);
		
		for (int i = 0; i < cu_all.size(); i++) {
			for (int j = 0; j < qmp_y.size(); j++) {
				if(cu_all.get(i).getIncludeSection().indexOf(qmp_y.get(j).getSectionName())!=-1){
					cu_y.add(cu_all.get(i));
					break;
				}
			}
			for (int k = 0; k < qmp_n.size(); k++) {
				if(cu_all.get(i).getIncludeSection().indexOf(qmp_n.get(k).getSectionName())!=-1){
					cu_n.add(cu_all.get(i));
					break;
				}
			}
		}
		
		int count_y = cu_y.size();
		int count_n = cu_n.size();

		if (map.get("youkong").toString().equals("1")) {
			// 不达标
			if (pageNow != null) {
				page = new Page(count_n, Integer.parseInt(pageNow));
	
				try {
					for (int k = page.getStartPos(); k < page.getStartPos() + page.getPageSize(); k++) {
						cu_result.add(cu_n.get(k));
					}
				} catch (Exception e) {
					System.out.println("Nothing");
				}

			} else {
				page = new Page(count_n, 1);
				for (int k = page.getStartPos(); k < page.getStartPos() + page.getPageSize(); k++) {
					cu_result.add(cu_n.get(k));
				}
			}
		} else {
			if (pageNow != null) {
				page = new Page(count_y, Integer.parseInt(pageNow));
				try {
					for (int k = page.getStartPos(); k < page.getStartPos() + page.getPageSize(); k++) {
						cu_result.add(cu_y.get(k));
					}
				} catch (Exception e) {
					System.out.println("Nothing");
				}
			} else {
				page = new Page(count_y, 1);
				for (int k = page.getStartPos(); k < page.getStartPos() + page.getPageSize(); k++) {
					cu_result.add(cu_y.get(k));
				}
			}

		}
		return cu_result;
	}

	@Override
	public Page getSearchPage_youkong(String pageNow, Map map) {
		Long userId = userMapper.getIdByName(map.get("username").toString().trim());
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if (roleSign.equals("1")) {
		} else if (roleSign.equals("2")) {
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("loc_city", roleName);
		} else if (roleSign.equals("3")) {
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("loc_city", arr[0]);
			map.put("loc_county", arr[1]);
		}

		Page page = null;
		List<Qmp> qmp = new LinkedList<Qmp>();
		qmp = qmpMapper.selectForMap(map);

		List<QmpWrxxYear> qmp_goal = new LinkedList<QmpWrxxYear>();
		qmp_goal = qmpWrxxYearMapper.selectQmpGoal();

		List<Qmp> qmp_y = new LinkedList<Qmp>();
		List<Qmp> qmp_n = new LinkedList<Qmp>();

		for (int i = 0; i < qmp.size(); i++) {
			String goal = qmp.get(i).getQualityTarget();
			String qmpName = qmp.get(i).getSectionName();

			for (int j = 0; j < qmp_goal.size(); j++) {
				String now = qmp_goal.get(j).getNjlb();
				String qmpGoalName = qmp_goal.get(j).getDmmc();
				if (qmpName.equals(qmpGoalName)) {
					if (changeType(goal) >= changeType(now)) {
						qmp_y.add(qmp.get(i));
					} else {
						qmp_n.add(qmp.get(i));
					}
					break;
				}
			}
		}

		List<ControlUnit> cu_y = new LinkedList<ControlUnit>();
		List<ControlUnit> cu_n = new LinkedList<ControlUnit>();
		List<ControlUnit> cu_all = controlUnitMapper.selectForMap(map);
		
		for (int i = 0; i < cu_all.size(); i++) {
			for (int j = 0; j < qmp_y.size(); j++) {
				if(cu_all.get(i).getIncludeSection().indexOf(qmp_y.get(j).getSectionName())!=-1){
					cu_y.add(cu_all.get(i));
					break;
				}
			}
			for (int k = 0; k < qmp_n.size(); k++) {
				if(cu_all.get(i).getIncludeSection().indexOf(qmp_n.get(k).getSectionName())!=-1){
					cu_n.add(cu_all.get(i));
					break;
				}
			}	
		}
		
		int count_y = cu_y.size();
		int count_n = cu_n.size();
		
		if (map.get("youkong").toString().equals("1")) {
			if (pageNow != null) {
				page = new Page(count_n, Integer.parseInt(pageNow));
			} else {
				page = new Page(count_n, 1);
			}
		} else {
			if (pageNow != null) {
				page = new Page(count_y, Integer.parseInt(pageNow));
			} else {
				page = new Page(count_y, 1);
			}
		}
		return page;
	}
	
	private double changeType(String para) {
		if (para.indexOf("Ⅴ") != -1) {
			if (para.indexOf("劣") != -1) {
				return 4.5;
			} else {
				return 5;
			}
		} else if (para.indexOf("Ⅳ") != -1) {
			if (para.indexOf("劣") != -1) {
				return 3.5;
			} else {
				return 4;
			}
		} else if (para.indexOf("Ⅲ") != -1) {
			if (para.indexOf("劣") != -1) {
				return 2.5;
			} else {
				return 3;
			}
		} else if (para.indexOf("Ⅱ") != -1) {
			if (para.indexOf("劣") != -1) {
				return 1.5;
			} else {
				return 2;
			}
		} else if (para.indexOf("Ⅰ") != -1) {
			if (para.indexOf("劣") != -1) {
				return 0.5;
			} else {
				return 1;
			}
		}
		return 0;
	}
	
	public List<String> searchCu_youkong(Map map) {
		Long userId = userMapper.getIdByName(map.get("username").toString().trim());
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if (roleSign.equals("1")) {
		} else if (roleSign.equals("2")) {
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("loc_city", roleName);
		} else if (roleSign.equals("3")) {
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("loc_city", arr[0]);
			map.put("loc_county", arr[1]);
		}

		Page page = null;
		List<Qmp> qmp = new LinkedList<Qmp>();
		qmp = qmpMapper.selectForMap(map);

		List<QmpWrxxYear> qmp_goal = new LinkedList<QmpWrxxYear>();
		qmp_goal = qmpWrxxYearMapper.selectQmpGoal();

		List<Qmp> qmp_y = new LinkedList<Qmp>();
		List<Qmp> qmp_n = new LinkedList<Qmp>();

		for (int i = 0; i < qmp.size(); i++) {
			String goal = qmp.get(i).getQualityTarget();
			String qmpName = qmp.get(i).getSectionName();

			for (int j = 0; j < qmp_goal.size(); j++) {
				String now = qmp_goal.get(j).getNjlb();
				String qmpGoalName = qmp_goal.get(j).getDmmc();
				if (qmpName.equals(qmpGoalName)) {
					if (changeType(goal) >= changeType(now)) {
						qmp_y.add(qmp.get(i));
						System.out.println(qmpName+"达标"+"水质类别"+changeType(now)+"水质目标"+changeType(goal));
					} else {
						qmp_n.add(qmp.get(i));
						System.out.println(qmpName+"不达标"+"水质类别"+changeType(now)+"水质目标"+changeType(goal));
					}
					break;
				}
			}
		}

		List<ControlUnit> cu_result = new LinkedList<ControlUnit>();	
		List<ControlUnit> cu_y = new LinkedList<ControlUnit>();
		List<ControlUnit> cu_n = new LinkedList<ControlUnit>();
		List<ControlUnit> cu_all = controlUnitMapper.selectForMap(map);
		
		for (int i = 0; i < cu_all.size(); i++) {
			for (int j = 0; j < qmp_y.size(); j++) {
				if(cu_all.get(i).getIncludeSection().indexOf(qmp_y.get(j).getSectionName())!=-1){
					cu_y.add(cu_all.get(i));
					break;
				}
			}
			for (int k = 0; k < qmp_n.size(); k++) {
				if(cu_all.get(i).getIncludeSection().indexOf(qmp_n.get(k).getSectionName())!=-1){
					cu_n.add(cu_all.get(i));
					break;
				}
			}
		}
		if (map.get("youkong")==null || map.get("youkong").toString().equals("0")) {
			
		}else if(map.get("youkong").toString().equals("1")){
			//达标
			cu_result = cu_y;
		}else{
			//不达标
		    cu_result = cu_n;
		}
		List<String> list = new LinkedList<String>();
		for(int i=0;i<cu_result.size();i++){
			list.add(cu_result.get(i).getUnitName());
		}
		return list;
	}
    //污染源
	@Override
	public List<Map<String, String>> selectKzdySumSource(Map map) {
		// TODO Auto-generated method stub
		return pollSourceMapper.selectKzdySum(map);
	}
    //畜禽养殖
	@Override
	public List<Map<String, String>> selectKzdySumYangZhi(Map map) {
		// TODO Auto-generated method stub
		return pollYangZhiMapper.selectKzdySum(map);
	}
    //污水处理厂
	@Override
	public List<Map<String, String>> selectKzdySumFactory(Map map) {
		// TODO Auto-generated method stub
		return pollFactoryMapper.selectKzdySum(map);
	}

	@Override
	public List<String> getRoleNameOfCountry(String username) {
		// TODO Auto-generated method stub
		Long userId = userMapper.getIdByName(username);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		String loc_city = "";
		if (roleSign.equals("1")) {
		} else if (roleSign.equals("2")) {
			String roleName = roleMapper.getRoleNameByID(roleId);
		    loc_city = roleName;
		} else if (roleSign.equals("3")) {
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			loc_city = arr[0];
			String loc_county = arr[1];
		}
		List<String> list = roleMapper.getRoleNameOfCountry(loc_city);
		List<String> list_final = new ArrayList<String>();
		for(int i=0;i<list.size();i++){
			String[] arr = list.get(i).split("_");
			list_final.add(arr[1]);
		}
		return list_final;
	}

	@Override
	public List<ControlUnit> selectCuAndQmp() {
		// TODO Auto-generated method stub
		return controlUnitMapper.selectCuAndQmp();
	}

	@Override
	public List<Dmzljs> getCuMianyuan(Map map) {
		// TODO Auto-generated method stub
		Long userId = userMapper.getIdByName(map.get("username").toString().trim());
	    Long roleId = roleMapper.getRoleIdByUserId(userId);
	    String roleSign = roleMapper.getRoleSignByID(roleId);
	    if (roleSign.equals("1")) {
	    } else if (roleSign.equals("2")) {
	      String roleName = roleMapper.getRoleNameByID(roleId);
	      map.put("loc_city", roleName);
	    } else if (roleSign.equals("3")) {
	      String role = roleMapper.getRoleNameByID(roleId);
	      String[] arr = role.split("_");
	      map.put("loc_city", arr[0]);
	      map.put("loc_county", arr[1]);
	    }
	    String zhibiao = (String) map.get("zhibiao");
	    List<QmpWrxx> qmpWrxxes = qmpWrxxMapper.selectCuMianyuan(map);//数据库中每条记录
	    List<QmpWrxx> qmpDianyuan = qmpWrxxMapper.selectCuDianyuan(map);
	    Map<String,String> section_names = new HashMap<String,String>(); //去重
	    for(int i = 0; i < qmpWrxxes.size(); i++){
	    	String sectionName = qmpWrxxes.get(i).getSectionName();
	        //去重加加入点源数据
	    	for(int j=0;j<qmpDianyuan.size();j++){
	    		if(sectionName.equals(qmpDianyuan.get(j).getSectionName())){
	    	    	if(zhibiao.equals("ad")){
	    			   section_names.put(sectionName,String.valueOf(qmpDianyuan.get(j).getAd()));
	    	    	}if(zhibiao.equals("hxxyl")){
	    	    	   section_names.put(sectionName,String.valueOf(qmpDianyuan.get(j).getHxxyl()));
	    	    	}if(zhibiao.equals("zl")){
	    	    	   section_names.put(sectionName,String.valueOf(qmpDianyuan.get(j).getZl()));
	    	    	}
	    		}
	    	}
	    }
	    List<Dmzljs> dm_total = new ArrayList<Dmzljs>();
	    for (Entry<String, String> entry : section_names.entrySet()) {
	    	Dmzljs dm = new Dmzljs();
	    	String sectionName = entry.getKey();
	    	dm.setName(sectionName);
	    	for(int j = 0;j<qmpWrxxes.size();j++){
	    		if(sectionName.equals(qmpWrxxes.get(j).getSectionName())){
	    			 switch(qmpWrxxes.get(j).getMonth()){
	    			   case 4:
	    				   if(zhibiao.equals("ad")){
							   //dm.setApr(String.valueOf(Double.parseDouble(qmpWrxxes.get(j).getAd())-Double.parseDouble(entry.getValue())));
							   dm.setApr(String.valueOf(qmpWrxxes.get(j).getAd()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   if(zhibiao.equals("hxxyl")){
	    					   dm.setApr(String.valueOf(qmpWrxxes.get(j).getHxxyl()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   if(zhibiao.equals("zl")){
	    					   dm.setApr(String.valueOf(qmpWrxxes.get(j).getZl()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   break;
	    			   case 5:
	    				   if(zhibiao.equals("ad")){
	    					   dm.setMay(String.valueOf(qmpWrxxes.get(j).getAd()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   if(zhibiao.equals("hxxyl")){
	    					   dm.setMay(String.valueOf(qmpWrxxes.get(j).getHxxyl()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   if(zhibiao.equals("zl")){
	    					   dm.setMay(String.valueOf(qmpWrxxes.get(j).getZl()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   break;
	    			   case 6:
	    				   if(zhibiao.equals("ad")){
	    					   dm.setJune(String.valueOf(qmpWrxxes.get(j).getAd()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   if(zhibiao.equals("hxxyl")){
	    					   dm.setJune(String.valueOf(qmpWrxxes.get(j).getHxxyl()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   if(zhibiao.equals("zl")){
	    					   dm.setJune(String.valueOf(qmpWrxxes.get(j).getZl()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   break;
	    			   case 7:
	    				   if(zhibiao.equals("ad")){
	    					   dm.setJuly(String.valueOf(qmpWrxxes.get(j).getAd()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   if(zhibiao.equals("hxxyl")){
	    					   dm.setJuly(String.valueOf(qmpWrxxes.get(j).getHxxyl()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   if(zhibiao.equals("zl")){
	    					   dm.setJuly(String.valueOf(qmpWrxxes.get(j).getZl()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   break;
	    			   case 8:
	    				   if(zhibiao.equals("ad")){
	    					   dm.setAug(String.valueOf(qmpWrxxes.get(j).getAd()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   if(zhibiao.equals("hxxyl")){
	    					   dm.setAug(String.valueOf(qmpWrxxes.get(j).getHxxyl()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   if(zhibiao.equals("zl")){
	    					   dm.setAug(String.valueOf(qmpWrxxes.get(j).getZl()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   break;
	    			   case 9:
	    				   if(zhibiao.equals("ad")){
	    					   dm.setSept(String.valueOf(qmpWrxxes.get(j).getAd()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   if(zhibiao.equals("hxxyl")){
	    					   dm.setSept(String.valueOf(qmpWrxxes.get(j).getHxxyl()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   if(zhibiao.equals("zl")){
	    					   dm.setSept(String.valueOf(qmpWrxxes.get(j).getZl()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   break;
	    			   case 10:
	    				   if(zhibiao.equals("ad")){
	    					   dm.setOct(String.valueOf(qmpWrxxes.get(j).getAd()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   if(zhibiao.equals("hxxyl")){
	    					   dm.setOct(String.valueOf(qmpWrxxes.get(j).getHxxyl()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   if(zhibiao.equals("zl")){
	    					   dm.setOct(String.valueOf(qmpWrxxes.get(j).getZl()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   break;
	    			   case 11:
	    				   if(zhibiao.equals("ad")){
	    					   dm.setNov(String.valueOf(qmpWrxxes.get(j).getAd()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   if(zhibiao.equals("hxxyl")){
	    					   dm.setNov(String.valueOf(qmpWrxxes.get(j).getHxxyl()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   if(zhibiao.equals("zl")){
	    					   dm.setNov(String.valueOf(qmpWrxxes.get(j).getZl()-Double.parseDouble(entry.getValue())));
 	    				   }
	    				   break;
	    			   default: 
                           break;
	    			 }
	    		}
	    	}
	    	dm_total.add(dm);
        }
		return dm_total;
	}

	
}
