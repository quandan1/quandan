package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.web.model.Qmp;
import com.eliteams.quick4j.web.model.QmpExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

	public interface QmpMapper extends GenericDao<Qmp, Long> {
		long countByExample(QmpExample example);

		int deleteByExample(QmpExample example);

		int insert(Qmp record);
		int insertSelective(Qmp record);

		List<Qmp> selectByExample(QmpExample example);

		int updateByExampleSelective(@Param("record") Qmp record, @Param("example") QmpExample example);

		int updateByExample(@Param("record") Qmp record, @Param("example") QmpExample example);
		Qmp selectByPrimaryKey(Integer id);

		Qmp selectByName(String name);

		int updateByPrimaryKeySelective(Qmp record);

		int updateByPrimaryKey(Qmp record);

		int deleteByPrimaryKey(Integer id);

		List<Qmp> listAll();

		int deleteById(Integer id);

		/**
		 * 分页
		 */
		List<Qmp> selectByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize);

		/**
		 * 分页页数
		 */
		int getCount();

		int getSearchCount(@Param(value = "map") Map map);

		List<Qmp> searchByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "map") Map map);

		List<Qmp> selectForMap(@Param(value = "map") Map map);

		List<Qmp> selectQmpGoal();

		List<String> getSections(@Param(value = "map") Map map);

		//从qmp_bas_info中获取断面
		List<String> getDMs(@Param(value = "map") Map map);

		//qmp_test_data中获取各个指标值
		List<Map<String, String>> getDmZbs(@Param(value = "map") Map map);

		//获取断面属性：干流，库体，其它
		String getDmProp(@Param(value = "section_name") String section_name);

		//从qmp_bas_info中获取断面的基本信息
		Map<String,String> getDmBasInfos(@Param(value = "section_name") String section_name);

		//从qmp_bas_info中获取断面的部分基本信息
		Map<String,String> getDmPartBasInfos(@Param(value = "section_name") String section_name);

		List<Map<String,String>> getSzzbbz();

		Map<String,Double> getTotalZbs(@Param(value = "param") Map<String, String> param);

		List<Map<String, String>> getDmZbsPar(@Param(value = "month") String month, @Param(value = "year") String year, @Param(value = "section_name") String section_name);

		int storeCountRes(List<Map<String, String>> result);

		List<Map<String,String>> getStoredRes(Map<String, String> param);
	}

	