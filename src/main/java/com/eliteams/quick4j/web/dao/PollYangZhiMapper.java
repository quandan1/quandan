package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.PollYangZhi;
import com.eliteams.quick4j.web.model.PollYangZhiExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PollYangZhiMapper {
    int countByExample(PollYangZhiExample example);

    int deleteByExample(PollYangZhiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PollYangZhi record);

    int insertSelective(PollYangZhi record);

    List<PollYangZhi> selectByExample(PollYangZhiExample example);

    PollYangZhi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PollYangZhi record, @Param("example") PollYangZhiExample example);

    int updateByExample(@Param("record") PollYangZhi record, @Param("example") PollYangZhiExample example);

    int updateByPrimaryKeySelective(PollYangZhi record);

    int updateByPrimaryKey(PollYangZhi record);
    
    //新增内容
    
    int deleteById(Integer id);///
        
    List<PollYangZhi> listAll();///
    
    List<PollYangZhi> selectByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize);
    
    long getCount();
	
    List<PollYangZhi> searchByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "map") Map map);

    int getSearchCount(@Param(value = "map") Map map);

    List<PollYangZhi> selectForMap(@Param(value = "map") Map map);
    
    List<Map<String,String>> selectKzdyTotal(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "map") Map map, @Param(value = "list") List list);
    
    int getKzdyCount(@Param(value = "map") Map map, @Param(value = "list") List list);
    
    List<Map<String,String>> selectKzdyTotalByName(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "name") String name, @Param(value = "map") Map map);
    
    int getKzdyCountByName(@Param(value = "name") String name, @Param(value = "map") Map map);
    
    int computeKzdyTotal(@Param(value = "map") Map map);
    
    List<Map<String,String>> selectKzdmTotal(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "map") Map map, @Param(value = "list") List list);
    
    int getKzdmCount(@Param(value = "map") Map map, @Param(value = "list") List list);
    
    List<Map<String,String>> selectKzdmTotalByName(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "name") String name, @Param(value = "map") Map map);
    
    int getKzdmCountByName(@Param(value = "name") String name, @Param(value = "map") Map map);

    int computeKzdmTotal(@Param(value = "map") Map map);
    
    List<Map<String,String>> selectWater();

    List<Map<String,String>> selectKzdySum(@Param(value = "map") Map map);
    
    List<Map<String,String>> selectKzdmSum(@Param(value = "map") Map map);


}