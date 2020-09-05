package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.Qmp;
import com.eliteams.quick4j.web.model.QmpWrxxYear;
import com.eliteams.quick4j.web.model.QmpWrxxYearExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QmpWrxxYearMapper {
    int countByExample(QmpWrxxYearExample example);

    int deleteByExample(QmpWrxxYearExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QmpWrxxYear record);

    int insertSelective(QmpWrxxYear record);

    List<QmpWrxxYear> selectByExample(QmpWrxxYearExample example);

    QmpWrxxYear selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QmpWrxxYear record, @Param("example") QmpWrxxYearExample example);

    int updateByExample(@Param("record") QmpWrxxYear record, @Param("example") QmpWrxxYearExample example);

    int updateByPrimaryKeySelective(QmpWrxxYear record);

    int updateByPrimaryKey(QmpWrxxYear record);

    /**
     *
     * @param section 必须设定year属性，必须设定section_name属性
     * @return 当前断面3年内的数据
     */
    public QmpWrxxYear getBySection(@Param("section") String section);
    
    List<QmpWrxxYear> selectQmpGoal();
}