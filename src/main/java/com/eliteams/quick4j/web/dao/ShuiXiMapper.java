package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.ShuiXi;
import com.eliteams.quick4j.web.model.ShuiXiExample;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ShuiXiMapper {
    int countByExample(ShuiXiExample example);

    int deleteByExample(ShuiXiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShuiXi record);

    int insertSelective(ShuiXi record);

    List<ShuiXi> selectByExample(ShuiXiExample example);

    ShuiXi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShuiXi record, @Param("example") ShuiXiExample example);

    int updateByExample(@Param("record") ShuiXi record, @Param("example") ShuiXiExample example);

    int updateByPrimaryKeySelective(ShuiXi record);

    int updateByPrimaryKey(ShuiXi record);

    ArrayList<ShuiXi> getRiverName(@Param(value = "map") Map map);


    ShuiXi  getRiverMessage(@Param(value = "map") Map map);


}