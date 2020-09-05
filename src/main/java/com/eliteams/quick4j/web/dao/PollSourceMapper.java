package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.web.model.PollSource;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PollSourceMapper extends GenericDao<PollSource, Long> {

    int insertSelective(PollSource record);///
    
    int updateByPrimaryKeySelective(PollSource record);///
    
    int deleteById(Long id);///
    
    PollSource selectByPrimaryKey(Long id);///
    
    List<PollSource> listAll();///
    
    List<PollSource> selectByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize);
    
    long getCount();
	
    List<PollSource> searchByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "map") Map map);
	
    int getSearchCount(@Param(value = "map") Map map);

    List<PollSource> selectForMap(@Param(value = "map") Map map);
    
    List<Map<String,String>> selectKzdyTotal(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "map") Map map, @Param(value = "list") List list);
    
    int getKzdyCount(@Param(value = "map") Map map, @Param(value = "list") List list);
    
    List<Map<String,String>> selectKzdyTotalByName(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "name") String name, @Param(value = "map") Map map);
    
    int getKzdyCountByName(@Param(value = "name") String name, @Param(value = "map") Map map);
    
    int computeKzdyTotal(@Param(value = "map") Map map);

    List<Map<String,String>> selectKzdmTotal(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "map") Map map, @Param(value = "list") List list);
    List<Map<String,String>> selectKzdmAll(@Param(value = "map") Map map, @Param(value = "list") List list);

    int getKzdmCount(@Param(value = "map") Map map, @Param(value = "list") List list);

    List<Map<String,String>> selectKzdmTotalByName(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "name") String name, @Param(value = "map") Map map);
    
    int getKzdmCountByName(@Param(value = "name") String name, @Param(value = "map") Map map);

    int computeKzdmTotal(@Param(value = "map") Map map);

    String computeKzdmTotal_std(@Param(value = "map") Map map);
    
    List<Map<String,String>> selectWater();
    
    List<Map<String,String>> selectKzdySum(@Param(value = "map") Map map);

    List<Map<String,String>> selectKzdmSum(@Param(value = "map") Map map);

    List<PollSource> getShuiwennf(@Param(value = "map") Map map);

    List<PollSource> getQiye(@Param(value = "map") Map map);
}