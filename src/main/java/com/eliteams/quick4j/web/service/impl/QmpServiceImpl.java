package com.eliteams.quick4j.web.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.eliteams.quick4j.web.dao.*;
import com.eliteams.quick4j.web.model.*;
import org.springframework.stereotype.Service;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.service.QmpService;

@Service
public class QmpServiceImpl extends GenericServiceImpl<Qmp, Long> implements QmpService {

	@Resource
	private QmpMapper qmpMapper;
	@Resource
	private QmpTestDataMapper qmpTestDataMapper;
	@Resource
	private QmpBaseInfoMapper qmpBaseInfoMapper;
	@Resource
	private UserMapper userMapper;
	@Resource
	private RoleMapper roleMapper;
	@Resource
	private PollSourceMapper pollSourceMapper;
    @Resource
	private PollYangZhiMapper pollYangZhiMapper;
    @Resource
	private PollFactoryMapper pollFactoryMapper;
    @Resource
	private QmpWrxxMapper qmpWrxxMapper;
	@Resource
	private QmpWrxxYearMapper qmpWrxxYearMapper;

	@Resource
	private DmbczjMapper dmbczjMapper;

	@Override
	public int insert(Qmp model) {
		return qmpMapper.insertSelective(model);
	}

	@Override
	public int insertTestData(QmpTestData model) {
		return qmpTestDataMapper.insertSelective(model);
	}

	@Override
	public int insertQmpBaseInfo(QmpBaseInfo model) {
		return qmpBaseInfoMapper.insertSelective(model);
	}

	@Override
	public int update(Qmp model) {
		return qmpMapper.updateByPrimaryKey(model);
	}

	@Override
	public int delete(int id) {
		return qmpMapper.deleteById(id);
	}

	@Override
	public Qmp selectById(int id) {
		return qmpMapper.selectByPrimaryKey(id);
	}

	@Override
	public GenericDao<Qmp, Long> getDao() {
		return qmpMapper;
	}

	@Override
	public List<Qmp> listAll() {
		return qmpMapper.listAll();
	}

	@Override
	public Qmp selectByName(String name) {
		return qmpMapper.selectByName(name);
	}

	@Override
	public List<Qmp> selectByPage(String pageNow) {
		Page page = null;
		List<Qmp> qmp = new ArrayList<Qmp>();
		int totalCount = (int) qmpMapper.getCount();
		if (pageNow != null) {
			page = new Page(totalCount, Integer.parseInt(pageNow));
			qmp = qmpMapper.selectByPage(page.getStartPos(), page.getPageSize());
		} else {
			page = new Page(totalCount, 1);
			qmp = qmpMapper.selectByPage(page.getStartPos(), page.getPageSize());
		}
		return qmp;
	}

	@Override
	public Page getPage(String pageNow) {
		Page page = null;
		int totalCount = (int) qmpMapper.getCount();
		if (pageNow != null) {
			page = new Page(totalCount, Integer.parseInt(pageNow));
		} else {
			page = new Page(totalCount, 1);
		}
		return page;
	}

	@Override
	public List<Qmp> searchByPage(String pageNow, Map map) {
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
		List<Qmp> qmp = new ArrayList<Qmp>();
		int totalCount = (int) qmpMapper.getSearchCount(map);
		if (pageNow != null) {
			page = new Page(totalCount, Integer.parseInt(pageNow));
			qmp = qmpMapper.searchByPage(page.getStartPos(), page.getPageSize(), map);
		} else {
			page = new Page(totalCount, 1);
			qmp = qmpMapper.searchByPage(page.getStartPos(), page.getPageSize(), map);
		}
		return qmp;
	}

	@Override
	public Page getSearchPage(String pageNow, Map map) {
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
		int totalCount = (int) qmpMapper.getSearchCount(map);
		if (pageNow != null) {
			page = new Page(totalCount, Integer.parseInt(pageNow));
		} else {
			page = new Page(totalCount, 1);
		}
		return page;
	}

	@Override
	public List<Qmp> selectForMap(Map map) {
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

		return qmpMapper.selectForMap(map);
	}

	@Override

	public List<Map<String, String>> selectKzdmTotal(String pageNow,
			String userName, Map map, List list) {
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if (roleSign.equals("1")) {
		} else if (roleSign.equals("2")) {
			 String roleName = roleMapper.getRoleNameByID(roleId);
			 map.put("xxdzdqSZM", roleName);
		} else if (roleSign.equals("3")) {
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		Page page = null;
		List<Map<String, String>> kzdm = new ArrayList<Map<String, String>>();
		int totalCount = pollSourceMapper.getKzdmCount(map,list);
		if (pageNow != null) {
			page = new Page(totalCount, Integer.parseInt(pageNow));
			kzdm = pollSourceMapper.selectKzdmTotal(page.getStartPosZcfg(), page.getZcfgPageSize(), map, list);
		} else {
			page = new Page(totalCount, 1);
			kzdm = pollSourceMapper.selectKzdmTotal(page.getStartPosZcfg(), page.getZcfgPageSize(), map, list);
		}
		return kzdm;
	}

	public List<Map<String, String>> selectKzdmAll(String userName, Map map, List list) {
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if (roleSign.equals("1")) {
		} else if (roleSign.equals("2")) {
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		} else if (roleSign.equals("3")) {
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		List<Map<String, String>> kzdm = new ArrayList<Map<String, String>>();
		kzdm = pollSourceMapper.selectKzdmAll(map, list);
		return kzdm;
	}

	@Override
	public Page getKzdmPage(String pageNow, String userName, Map map, List list) {
		// TODO Auto-generated method stub
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if (roleSign.equals("1")) {
		} else if (roleSign.equals("2")) {
			 String roleName = roleMapper.getRoleNameByID(roleId);
			 map.put("xxdzdqSZM", roleName);
		} else if (roleSign.equals("3")) {
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		Page page = null;
		int totalCount = pollSourceMapper.getKzdmCount(map,list);
		if (pageNow != null) {
			page = new Page(totalCount, Integer.parseInt(pageNow));
		} else {
			page = new Page(totalCount, 1);
		}
		return page;
	}


	@Override
	public List<Map<String, String>> selectKzdmAllByName(String name, String userName) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if (roleSign.equals("1")) {
		} else if (roleSign.equals("2")) {
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("xxdzdqSZM", roleName);
		} else if (roleSign.equals("3")) {
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}

		int totalCount = pollSourceMapper.getKzdmCountByName(name, map);
		List<Map<String, String>> kzdm = pollSourceMapper.selectKzdmTotalByName(0, totalCount, name, map);
		return kzdm;
	}


	@Override
	public List<Map<String, String>> selectKzdmTotalByName(String pageNow, String name, String userName) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if (roleSign.equals("1")) {
		} else if (roleSign.equals("2")) {
			 String roleName = roleMapper.getRoleNameByID(roleId);
			 map.put("xxdzdqSZM", roleName);
		} else if (roleSign.equals("3")) {
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		Page page = null;
		List<Map<String, String>> kzdm = new ArrayList<Map<String, String>>();
		int totalCount = pollSourceMapper.getKzdmCountByName(name, map);
		if (pageNow != null) {
			page = new Page(totalCount, Integer.parseInt(pageNow));
			kzdm = pollSourceMapper.selectKzdmTotalByName(page.getStartPosZcfg(), page.getZcfgPageSize(), name, map);
		} else {
			page = new Page(totalCount, 1);
			kzdm = pollSourceMapper.selectKzdmTotalByName(page.getStartPosZcfg(), page.getZcfgPageSize(), name, map);
		}
		return kzdm;
	}

	@Override
	public Page getKzdmPageByName(String pageNow, String name, String userName) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		Long userId = userMapper.getIdByName(userName);
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if (roleSign.equals("1")) {
		} else if (roleSign.equals("2")) {
			 String roleName = roleMapper.getRoleNameByID(roleId);
			 map.put("xxdzdqSZM", roleName);
		} else if (roleSign.equals("3")) {
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("xxdzdqSZM", arr[0]);
			map.put("xzqhmc", arr[1]);
		}
		Page page = null;
		int totalCount = pollSourceMapper.getKzdmCountByName(name, map);
		if (pageNow != null) {
			page = new Page(totalCount, Integer.parseInt(pageNow));
		} else {
			page = new Page(totalCount, 1);
		}
		return page;
	}

	public int computeKzdmTotal(Map map) {
		int result = pollSourceMapper.computeKzdmTotal(map);
		System.out.println(result);
		return result;
	}

	public float computeKzdmTotal_std(Map map) {
		if(map.get("prop").equals("HXXYLCSL_D") || map.get("prop").equals("HXXYLPFL_D"))
			map.put("prop", "hxxyl_std");
		else if(map.get("prop").equals("ADCSL_D") || map.get("prop").equals("ADPFL_D"))
			map.put("prop", "ad_std");
		else if(map.get("prop").equals("SYLCSL_D") || map.get("prop").equals("SYLPFL_D"))
			map.put("prop", "syl_std");
		else if(map.get("prop").equals("HFFPFL_QK"))
			map.put("prop", "hff_std");
		else if(map.get("prop").equals("QHWPFL_QK"))
			map.put("prop", "qhw_std");
		else if(map.get("prop").equals("FSSPFL_QK"))
			map.put("prop", "shen_std");
		else if(map.get("prop").equals("FSQPFL_QK"))
			map.put("prop", "qian_std");
		else if(map.get("prop").equals("FSGPFL_QK"))
			map.put("prop", "ge_std");
		else if(map.get("prop").equals("FSGPFL_QK_DUP1"))
			map.put("prop", "gong_std");
		else if(map.get("prop").equals("FSLJGPFL_QK"))
			map.put("prop", "ljg_std");
		System.out.println(map.get("prop"));
		String result1 = qmpWrxxMapper.computeKzdmTotal_std(map).substring(1);
		System.out.println(result1);
	
		float result = Float.valueOf(result1);
		System.out.println(result);
		return result;
	}

	@Override
	public List<QmpWrxx> searchQmpWrxx(String szsb_month, String userName) {
		Map map = new HashMap();
		map.put("szsb_month", szsb_month);
		Long userId = userMapper.getIdByName(userName.trim());
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		if (roleSign.equals("1")) {
		} else if (roleSign.equals("2")) {
			String roleName = roleMapper.getRoleNameByID(roleId);
			map.put("test_by", roleName);
		} else if (roleSign.equals("3")) {
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			map.put("test_by", arr[0]);
		}

		return qmpWrxxMapper.searchQmpWrxx(map);
	}

	@Override
	public List<Map<String,String>> selectDmbczjByYearAndMonth(String qysx, String nf, String month, String userName) {
        Map<String,String> map = new HashMap();
        System.out.println(qysx);
        System.out.println(nf);
        System.out.println(month);
		//System.out.println(section_level);
		System.out.println(qysx.equals("all"));
		if (qysx.equals("all")){
			map.put("year",nf);
			map.put("month", month);
			//map.put("section_level",section_level);
		}
		else{
			String city = qysx.toString()+"市";
			map.put("city", city);
			map.put("year",nf);
			map.put("month", month);
			//map.put("section_level",section_level);
		}

		System.out.println(map);
		System.out.println("selectDmbczjByYearAndMonth");

		return dmbczjMapper.selectDmbczjByYearAndMonth(map);
	}



	@Override
	public List<Map<String,String>> selectDmbczjByYearBetweenMonth(String qysx, String nf, String start_month, String end_month, String userName) {
		Map map = new HashMap();
		if (qysx.equals("all")){
			map.put("year",nf);
			map.put("start_month", start_month);
			map.put("end_month",end_month);
			//map.put("section_level",section_level);
		}
		else{
			String city = qysx.toString()+"市";
			map.put("city", city);
			map.put("year",nf);
			map.put("start_month", start_month);
			map.put("end_month",end_month);
			//map.put("section_level",section_level);
		}
		System.out.println(map);
		System.out.println("selectDmbczjByYearBetweenMonth");

		return dmbczjMapper.selectDmbczjByYearBetweenMonth(map);
	}

	//selectDmbczjByYear
	@Override
	public List<Map<String, Object>> selectDmbczjByYear(String nf, String userName) {
		Map map = new HashMap();
		map.put("year",nf);
		System.out.println(map);
		System.out.println("selectDmbczjByYear");

		return dmbczjMapper.selectDmbczjByYear(map);
	}

	@Override
	public List<Map<String, Object>> selectDmbczjByYearWithMonth(String nf, String sm, String em, String userName) {
		Map map = new HashMap();
		map.put("year",nf);
		map.put("start_month",sm);
		map.put("end_month",em);
//		System.out.println(map);
		System.out.println("selectDmbczjByYearWithMonth");

		return dmbczjMapper.selectDmbczjByYearWithMonth(map);
	}
//	selectDmbczjByYearWithMonth_kj
	@Override
	public List<Map<String, Object>> selectDmbczjByYearWithMonth_kj(String nf, String sm, String em, String userName) {
		Map map = new HashMap();
		map.put("year",nf);
		map.put("start_month",sm);
		map.put("end_month",em);
//		System.out.println(map);
		System.out.println("selectDmbczjByYearWithMonth_kj");

		return dmbczjMapper.selectDmbczjByYearWithMonth_kj(map);
	}
	@Override
	public List<Map<String, Object>> selectDmbczjByYearWithMonthWithRrgion(String nf, String sm, String em, String region, String userName) {
		Map map = new HashMap();
		map.put("year",nf);
		map.put("start_month",sm);
		map.put("end_month",em);
		map.put("region",region);
		System.out.println(map);
		System.out.println("selectDmbczjByYearWithMonthWithRegion");

		return dmbczjMapper.selectDmbczjByYearWithMonthWithRegion(map);
	}
	@Override
	public List<Qmp> searchByPage_youkong(String pageNow, Map map) {
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

		List<Qmp> qmp_result = new LinkedList<Qmp>();

		int count_y = qmp_y.size();
		int count_n = qmp_n.size();

		if (map.get("youkong").toString().equals("1")) {
			// 不达标
			if (pageNow != null) {
				page = new Page(count_n, Integer.parseInt(pageNow));
				try {
					for (int k = page.getStartPos(); k < page.getStartPos() + page.getPageSize(); k++) {
						qmp_result.add(qmp_n.get(k));
					}
				} catch (Exception e) {
					System.out.println("Nothing");
				}
				
			} else {
				page = new Page(count_n, 1);
				for (int k = page.getStartPos(); k < page.getStartPos() + page.getPageSize(); k++) {
					qmp_result.add(qmp_n.get(k));
				}
			}
		} else {
			if (pageNow != null) {
				page = new Page(count_y, Integer.parseInt(pageNow));				
				try {
					for (int k = page.getStartPos(); k < page.getStartPos() + page.getPageSize(); k++) {
						qmp_result.add(qmp_y.get(k));
					}
				} catch (Exception e) {
					System.out.println("Nothing");
				}

			} else {
				page = new Page(count_y, 1);
				for (int k = page.getStartPos(); k < page.getStartPos() + page.getPageSize(); k++) {
					qmp_result.add(qmp_y.get(k));
				}
			}

		}
		return qmp_result;

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

		int count_y = qmp_y.size();
		int count_n = qmp_n.size();
		
		if (map.get("youkong").toString().equals("1")) {
			System.out.println("不达标");
			if (pageNow != null) {
				page = new Page(count_n, Integer.parseInt(pageNow));
			} else {
				page = new Page(count_n, 1);
			}
		} else {
			System.out.println("达标");
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


	//畜禽养殖
	@Override
	public List<Map<String, String>> selectKzdmYangZhiAll(String userName, Map map,List list) {
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

		int totalCount = pollYangZhiMapper.getKzdmCount(map,list);
		List<Map<String, String>> kzdm = pollYangZhiMapper.selectKzdmTotal(0, totalCount,map,list);
		return kzdm;
	}
	
	//畜禽养殖
	@Override
	public List<Map<String, String>> selectKzdmYangZhiTotal(String pageNow,
			String userName, Map map,List list) {
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
	    List<Map<String, String>> kzdm = new ArrayList<Map<String,String>>();  	  
	    int totalCount = pollYangZhiMapper.getKzdmCount(map,list); 
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        kzdm = pollYangZhiMapper.selectKzdmTotal(page.getStartPosZcfg(), page.getZcfgPageSize(),map,list);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        kzdm = pollYangZhiMapper.selectKzdmTotal(page.getStartPosZcfg(), page.getZcfgPageSize(),map,list);  
	    }  
	    return kzdm;
	}

	@Override
	public Page getKzdmYangZhiPage(String pageNow, String userName, Map map,List list) {
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
		int totalCount = pollYangZhiMapper.getKzdmCount(map,list);  		  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	    } else {  
	        page = new Page(totalCount, 1);  
	    } 
	    return page;
	}

	@Override
	public List<Map<String, String>> selectKzdmYangZhiAllByName(String name, String userName) {
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

		int totalCount = pollYangZhiMapper.getKzdmCountByName(name,map);
		List<Map<String, String>>kzdm = pollSourceMapper.selectKzdmTotalByName(0, totalCount,name,map);

		return kzdm;
	}

	@Override
	public List<Map<String, String>> selectKzdmYangZhiTotalByName(String pageNow,
			String name, String userName) {
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
	    List<Map<String, String>> kzdm = new ArrayList<Map<String,String>>();  	  
	    int totalCount = pollYangZhiMapper.getKzdmCountByName(name,map); 
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        kzdm = pollYangZhiMapper.selectKzdmTotalByName(page.getStartPosZcfg(), page.getZcfgPageSize(),name,map);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        kzdm = pollSourceMapper.selectKzdmTotalByName(page.getStartPosZcfg(), page.getZcfgPageSize(),name,map);  
	    }  
	    return kzdm;
	}

	@Override
	public Page getKzdmYangZhiPageByName(String pageNow, String name, String userName) {
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
		int totalCount = pollYangZhiMapper.getKzdmCountByName(name,map);  		  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	    } else {  
	        page = new Page(totalCount, 1);  
	    } 
	    return page;
	}

	public int computeKzdmYangZhiTotal(Map map) {
		int result = pollYangZhiMapper.computeKzdmTotal(map);
		System.out.println(result);
		return result;
	}

	//污水处理厂
	@Override
	public List<Map<String, String>> selectKzdmFactoryAll(String userName, Map map,List list) {
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

		int totalCount = pollFactoryMapper.getKzdmCount(map,list);
		List<Map<String, String>> kzdm = pollFactoryMapper.selectKzdmTotal(1,totalCount,map,list);

		return kzdm;
	}

	//污水处理厂
	@Override
	public List<Map<String, String>> selectKzdmFactoryTotal(String pageNow,
			String userName, Map map,List list) {
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
	    List<Map<String, String>> kzdm = new ArrayList<Map<String,String>>();  	  
	    int totalCount = pollFactoryMapper.getKzdmCount(map,list); 
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        kzdm = pollFactoryMapper.selectKzdmTotal(page.getStartPosZcfg(), page.getZcfgPageSize(),map,list);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        kzdm = pollFactoryMapper.selectKzdmTotal(page.getStartPosZcfg(), page.getZcfgPageSize(),map,list);  
	    }  
	    return kzdm;
	}

	@Override
	public Page getKzdmFactoryPage(String pageNow, String userName, Map map,List list) {
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
		int totalCount = pollFactoryMapper.getKzdmCount(map,list);  		  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	    } else {  
	        page = new Page(totalCount, 1);  
	    } 
	    return page;
	}

	@Override
	public List<Map<String, String>> selectKzdmFactoryAllByName(String name, String userName) {
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

		int totalCount = pollFactoryMapper.getKzdmCountByName(name,map);
		List<Map<String, String>> kzdm = pollFactoryMapper.selectKzdmTotalByName(0,totalCount,name,map);
		return kzdm;
	}

	@Override
	public List<Map<String, String>> selectKzdmFactoryTotalByName(String pageNow,
			String name, String userName) {
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
	    List<Map<String, String>> kzdm = new ArrayList<Map<String,String>>();  	  
	    int totalCount = pollFactoryMapper.getKzdmCountByName(name,map); 
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        kzdm = pollFactoryMapper.selectKzdmTotalByName(page.getStartPosZcfg(), page.getZcfgPageSize(),name,map);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        kzdm = pollFactoryMapper.selectKzdmTotalByName(page.getStartPosZcfg(), page.getZcfgPageSize(),name,map);  
	    }  
	    return kzdm;
	}

	@Override
	public Page getKzdmFactoryPageByName(String pageNow, String name, String userName) {
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
		int totalCount = pollFactoryMapper.getKzdmCountByName(name,map);  		  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	    } else {  
	        page = new Page(totalCount, 1);  
	    } 
	    return page;
	}

	public int computeKzdmFactoryTotal(Map map) {
		int result = pollFactoryMapper.computeKzdmTotal(map);
		System.out.println(result);
		return result;
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
	
	//优控判断选择
	@Override
	public List<String> searchQmp_youkong(Map map) {
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

		List<Qmp> qmp_result = new LinkedList<Qmp>();

		int count_y = qmp_y.size();
		int count_n = qmp_n.size();
        if (map.get("youkong")==null || map.get("youkong").toString().equals("0")) {
			
		}else if(map.get("youkong").toString().equals("1")){
			//达标
			qmp_result = qmp_y;
		}else{
			//不达标
		    qmp_result = qmp_n;
		}
		List<String> list = new LinkedList<String>();
		for(int i=0;i<qmp_result.size();i++){
			list.add(qmp_result.get(i).getSectionName());
		}
		return list;

	}

	@Override
	public List<Map<String, String>> selectKzdmSumSource(Map map) {
		// TODO Auto-generated method stub
		return pollSourceMapper.selectKzdmSum(map);
	}

	@Override
	public List<Map<String, String>> selectKzdmSumYangZhi(Map map) {
		// TODO Auto-generated method stub
		return pollYangZhiMapper.selectKzdmSum(map);
	}

	@Override
	public List<Map<String, String>> selectKzdmSumFactory(Map map) {
		// TODO Auto-generated method stub
		return pollFactoryMapper.selectKzdmSum(map);
	}

	@Override
	public List<String> getDMs(Map map) {
		return qmpMapper.getDMs(map);
	}

	@Override
	public List<Map<String, String>> getDmZbs(Map<String, String> params) {
		return qmpMapper.getDmZbs(params);
	}

	@Override
	public List<Map<String, String>> getDmZbsPar(String month, String year, String section_name) {
		return qmpMapper.getDmZbsPar(month, year ,section_name);
	}

	@Override
	public String getDmProp(String section_name) {
		return qmpMapper.getDmProp(section_name);
	}

	@Override
	public Map<String, String> getDmBasInfos(String section_name) {
		return qmpMapper.getDmBasInfos(section_name);
	}

    @Override
    public Map<String, String> getDmPartBasInfos(String section_name) {
        return qmpMapper.getDmPartBasInfos(section_name);
    }

	@Override
	public List<Map<String, String>> getSzzbbz() {
		return qmpMapper.getSzzbbz();
	}

	@Override
	public Map<String, Double> getTotalZbs(Map<String, String> param) {
		return qmpMapper.getTotalZbs(param);
	}

    @Override
    public Map<String, String> getCbyzInfos(String section_name,String year,String month) {
        Map map = new HashMap();
        map.put("section_name",section_name);
        map.put("year",year);
        map.put("month",month);
		return qmpTestDataMapper.getCbyzInfos(map);
    }

    @Override
    public Map<String, String> getCbyzAddInfos(String section_name,String year,String month) {
        Map map = new HashMap();
        map.put("section_name",section_name);
        map.put("year",year);
        map.put("month",month);
        return qmpTestDataMapper.getCbyzAddInfos(map);
    }

	@Override
	public List<QmpTestData> searchByPageSzxz(String pageNow, Map map) {
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
		List<QmpTestData> qmpTestData = new ArrayList<QmpTestData>();
		int totalCount = (int) qmpTestDataMapper.getSearchCount(map);
		if (pageNow != null) {
			page = new Page(totalCount, Integer.parseInt(pageNow));
			qmpTestData = qmpTestDataMapper.searchByPage(page.getStartPos(), page.getPageSize(), map);
		} else {
			page = new Page(totalCount, 1);
			qmpTestData = qmpTestDataMapper.searchByPage(page.getStartPos(), page.getPageSize(), map);
		}
		return qmpTestData;
	}

	@Override
	public Page getSearchPageSzxz(String pageNow, Map map) {
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
		int totalCount = (int) qmpTestDataMapper.getSearchCount(map);
		if (pageNow != null) {
			page = new Page(totalCount, Integer.parseInt(pageNow));
		} else {
			page = new Page(totalCount, 1);
		}
		return page;
	}

	@Override
	public QmpTestData selectByIdSzxz(int id) {
		System.out.println(id);
		return qmpTestDataMapper.selectByPrimaryKey(id);
	}

	@Override
	public int deleteSzxz(int id) {
		return qmpTestDataMapper.deleteById(id);
	}

	@Override
	public int updateSzxz(QmpTestData model) {
		return qmpTestDataMapper.updateByPrimaryKey(model);
	}

	@Override
	public List<QmpTestData> selectByPageSzxz(String pageNow) {
		Page page = null;
		List<QmpTestData> qmpTestData = new ArrayList<QmpTestData>();
		int totalCount = (int) qmpTestDataMapper.getCount();
		if (pageNow != null) {
			page = new Page(totalCount, Integer.parseInt(pageNow));
			qmpTestData = qmpTestDataMapper.selectByPage(page.getStartPos(), page.getPageSize());
			} else {
			page = new Page(totalCount, 1);
			qmpTestData = qmpTestDataMapper.selectByPage(page.getStartPos(), page.getPageSize());
			}
			return qmpTestData;
	}

	@Override
	public Page getPageSzxz(String pageNow) {
		Page page = null;
		int totalCount = (int) qmpTestDataMapper.getCount();
		if (pageNow != null) {
			page = new Page(totalCount, Integer.parseInt(pageNow));
			} else {
			page = new Page(totalCount, 1);
			}
			return page;
	}
	@Override
	public List<QmpTestData> selectForMapSzxz(Map map) {
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
			map.put("loc_district", arr[1]);
		}

		return qmpTestDataMapper.selectForMap(map);
	}

	@Override
	public int storeCountRes(List<Map<String, String>> result) {
		return qmpMapper.storeCountRes(result);
	}

	@Override
	public List<Map<String,String>> getStoredRes(Map<String, String> param) {
		return qmpMapper.getStoredRes(param);
	}

}
