package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.MikeJbxx;
import com.eliteams.quick4j.web.model.MikeJbxxExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MikeJbxxMapper {
    int countByExample(MikeJbxxExample example);

    int deleteByExample(MikeJbxxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MikeJbxx record);

    int insertSelective(MikeJbxx record);

    List<MikeJbxx> selectByExample(MikeJbxxExample example);

    MikeJbxx selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MikeJbxx record, @Param("example") MikeJbxxExample example);

    int updateByExample(@Param("record") MikeJbxx record, @Param("example") MikeJbxxExample example);

    int updateByPrimaryKeySelective(MikeJbxx record);

    int updateByPrimaryKey(MikeJbxx record);

    List<MikeJbxx> selectAll();

    List<MikeJbxx> selectOne(@Param(value = "map") Map map);
}