package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.JkzjGyzj;
import com.eliteams.quick4j.web.model.JkzjGyzjExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface JkzjGyzjMapper {
    int countByExample(JkzjGyzjExample example);

    int deleteByExample(JkzjGyzjExample example);

    int insert(JkzjGyzj record);

    int insertSelective(JkzjGyzj record);

    /**
     * 城市各月扣缴总计
     * @param example
     * @return
     */
    List<JkzjGyzj> selectByExample(JkzjGyzjExample example);

    int updateByExampleSelective(@Param("record") JkzjGyzj record, @Param("example") JkzjGyzjExample example);

    int updateByExample(@Param("record") JkzjGyzj record, @Param("example") JkzjGyzjExample example);


    List<String> selectCity();

    /**
     * 城市扣缴总计
     * @return
     */
    List<Map<String,Object>> selectJkzjZj();

    /**
     * 各月扣缴总计
     * @return
     */
    List<Map<String,Object>> selectJkzjGyZj();

    /**
     * 扣缴总计
     * @return
     */
    int selectJkzjAllZj();
}