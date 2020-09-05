package com.eliteams.quick4j.web.service.impl;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.dao.CalcViewMapper;
import com.eliteams.quick4j.web.dao.UserMapper;
import com.eliteams.quick4j.web.model.CalcView;
import com.eliteams.quick4j.web.model.User;
import com.eliteams.quick4j.web.model.UserExample;
import com.eliteams.quick4j.web.service.CalcService;
import com.eliteams.quick4j.web.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户Service实现类
 *
 * @author StarZou
 * @since 2014年7月5日 上午11:54:24
 */
@Service
public class CalcServiceImpl extends GenericServiceImpl<CalcView, Long> implements CalcService {

	@Resource
	CalcViewMapper calcViewMapper;

	@Override
	public GenericDao<CalcView, Long> getDao() {
		return (GenericDao<CalcView, Long>) new CalcServiceImpl();
	}

	@Override
	public List<CalcView> selectList() {
		return calcViewMapper.selectByExample(null);
	}

	public Map<String,CalcView> getCalcMap(){
		List<CalcView> list = calcViewMapper.selectByExample(null);
		Map<String,CalcView> map = new HashMap<>();
		for (CalcView calc:list
			 ) {
			map.put(calc.getSectionName(),calc);
		}
		return map;
	}
}
