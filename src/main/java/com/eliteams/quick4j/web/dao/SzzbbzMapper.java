package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.Szzbbz;
import com.eliteams.quick4j.web.model.SzzbbzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SzzbbzMapper {
    int countByExample(SzzbbzExample example);

    int deleteByExample(SzzbbzExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Szzbbz record);

    int insertSelective(Szzbbz record);

    List<Szzbbz> selectByExample(SzzbbzExample example);

    Szzbbz selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Szzbbz record, @Param("example") SzzbbzExample example);

    int updateByExample(@Param("record") Szzbbz record, @Param("example") SzzbbzExample example);

    int updateByPrimaryKeySelective(Szzbbz record);

    int updateByPrimaryKey(Szzbbz record);
}