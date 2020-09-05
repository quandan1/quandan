package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.Hlsw;
import com.eliteams.quick4j.web.model.HlswExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.*;

public interface HlswMapper {
    int countByExample(HlswExample example);

    int deleteByExample(HlswExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Hlsw record);

    int insertSelective(Hlsw record);

    List<Hlsw> selectByExample(HlswExample example);

    Hlsw selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Hlsw record, @Param("example") HlswExample example);

    int updateByExample(@Param("record") Hlsw record, @Param("example") HlswExample example);

    int updateByPrimaryKeySelective(Hlsw record);

    int updateByPrimaryKey(Hlsw record);

    ArrayList<Integer> selectDate(@Param(value = "map") Map map);
}