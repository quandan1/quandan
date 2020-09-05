package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.CsbcGyzj;
import com.eliteams.quick4j.web.model.CsbcGyzjExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CsbcGyzjMapper {
    int countByExample(CsbcGyzjExample example);

    int deleteByExample(CsbcGyzjExample example);

    int insert(CsbcGyzj record);

    int insertSelective(CsbcGyzj record);

    /**
     * example为空时，市里各月补偿总计
     * @param example
     * @return
     */
    List<CsbcGyzj> selectByExample(CsbcGyzjExample example);

    int updateByExampleSelective(@Param("record") CsbcGyzj record, @Param("example") CsbcGyzjExample example);

    int updateByExample(@Param("record") CsbcGyzj record, @Param("example") CsbcGyzjExample example);

    /**
     * 省里各月补偿总计
     * @return
     */
    List<Map<String,Object>> selectSlBczjGy();

    /**
     * 省里补偿合计
     * @return
     */
    int selectSlBczjZj();

    /**
     * 市里补偿总计
     * @return
     */
    List<Map<String,Object>> selectBczjZj();

    /**
     * 补偿总计
     * @return
     */
    int selectBczjAllZj();
}