package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.QmpTestData;
import com.eliteams.quick4j.web.model.QmpTestDataExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface QmpTestDataMapper {
    int countByExample(QmpTestDataExample example);

    int deleteByExample(QmpTestDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QmpTestData record);

    int insertSelective(QmpTestData record);

    List<QmpTestData> selectByExample(QmpTestDataExample example);

    QmpTestData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QmpTestData record, @Param("example") QmpTestDataExample example);

    int updateByExample(@Param("record") QmpTestData record, @Param("example") QmpTestDataExample example);

    int updateByPrimaryKeySelective(QmpTestData record);

    int updateByPrimaryKey(QmpTestData record);

    List<QmpTestData> searchByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "map") Map map);

    int getSearchCount(@Param(value = "map") Map map);

    int deleteById(Integer id);

    int getCount();

    Map<String,String> getCbyzInfos(@Param(value = "map") Map map);

    Map<String,String> getCbyzAddInfos(@Param(value = "map") Map map);

    List<QmpTestData> selectByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize);

    List<QmpTestData> selectForMap(@Param(value = "map") Map map);
}