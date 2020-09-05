package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.web.model.PollFactory;
 

import java.util.List;
import java.util.Map;

import com.eliteams.quick4j.web.model.PollSource;
import org.apache.ibatis.annotations.Param;

public interface PollFactoryMapper extends GenericDao<PollFactory, Long>{

    int insertSelective(PollFactory record);///
    
    int updateByPrimaryKeySelective(PollFactory record);///
    
    int deleteById(Long id);///
    
    PollFactory selectByPrimaryKey(Long id);///
    
    List<PollFactory> listAll();///
    
    List<PollFactory> selectByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize);
    
    long getCount();
	
    List<PollFactory> searchByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "map") Map map);
	
    int getSearchCount(@Param(value = "map") Map map);

    List<PollFactory> selectForMap(@Param(value = "map") Map map);
    
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

    List<PollFactory> getWsc(@Param(value = "map") Map map);
}