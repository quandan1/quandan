package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.Dmbczj;
import com.eliteams.quick4j.web.model.DmbczjExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface DmbczjMapper {
    int countByExample(DmbczjExample example);

    int deleteByExample(DmbczjExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dmbczj record);

    int replace(Dmbczj record);

    int insertD(Dmbczj record);

    int insertSelective(Dmbczj record);

    List<Dmbczj> selectByExample(DmbczjExample example);

    List<Map<String,String>> selectDmbczjByYearAndMonth(@Param(value = "map") Map map);

    List<Map<String,String>> selectDmbczjByYearBetweenMonth(@Param(value = "map") Map map);

    List<Map<String, Object>> selectDmbczjByYear(@Param(value = "map") Map map);

    List<Map<String, Object>> selectDmbczjByYearWithMonth(@Param(value = "map") Map map);

    List<Map<String, Object>> selectDmbczjByYearWithMonth_kj(@Param(value = "map") Map map);

    List<Map<String, Object>> selectDmbczjByYearWithMonthWithRegion(@Param(value = "map") Map map);

    Dmbczj selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dmbczj record, @Param("example") DmbczjExample example);

    int updateByExample(@Param("record") Dmbczj record, @Param("example") DmbczjExample example);

    int updateByPrimaryKeySelective(Dmbczj record);

    int updateByPrimaryKey(Dmbczj record);
}