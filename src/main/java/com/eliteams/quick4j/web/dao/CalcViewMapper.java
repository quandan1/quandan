package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.CalcView;
import com.eliteams.quick4j.web.model.CalcViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CalcViewMapper {
    int countByExample(CalcViewExample example);

    int deleteByExample(CalcViewExample example);

    int insert(CalcView record);

    int insertSelective(CalcView record);

    List<CalcView> selectByExample(CalcViewExample example);

    int updateByExampleSelective(@Param("record") CalcView record, @Param("example") CalcViewExample example);

    int updateByExample(@Param("record") CalcView record, @Param("example") CalcViewExample example);
}