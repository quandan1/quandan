package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.JkzjData;
import com.eliteams.quick4j.web.model.JkzjDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JkzjDataMapper {
    int countByExample(JkzjDataExample example);

    int deleteByExample(JkzjDataExample example);

    int insert(JkzjData record);

    int insertSelective(JkzjData record);

    List<JkzjData> selectByExample(JkzjDataExample example);

    int updateByExampleSelective(@Param("record") JkzjData record, @Param("example") JkzjDataExample example);

    int updateByExample(@Param("record") JkzjData record, @Param("example") JkzjDataExample example);
}