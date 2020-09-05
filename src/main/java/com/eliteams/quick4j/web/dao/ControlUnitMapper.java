package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.ControlUnit;
import com.eliteams.quick4j.web.model.ControlUnitExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ControlUnitMapper {
    int countByExample(ControlUnitExample example);

    int deleteByExample(ControlUnitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ControlUnit record);

    int insertSelective(ControlUnit record);

    List<ControlUnit> selectByExample(ControlUnitExample example);

    ControlUnit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ControlUnit record, @Param("example") ControlUnitExample example);

    int updateByExample(@Param("record") ControlUnit record, @Param("example") ControlUnitExample example);

    int updateByPrimaryKeySelective(ControlUnit record);

    int updateByPrimaryKey(ControlUnit record);
    
    
    ControlUnit selectByName(String name);
    
    List<ControlUnit> listAll();
    
    int deleteById(Integer id);
    
    /** 
             分页 
     */  
    List<ControlUnit> selectCUByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "map") Map map);
      
    /** 
             分页页数
     */  
    long getCUCount(@Param(value = "map") Map map);
    
    int getSearchCount(@Param(value = "map") Map map);
	
	List<ControlUnit> searchByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "map") Map map);

	List<ControlUnit> selectForMap(@Param(value = "map") Map map);
	
	ControlUnit selectForInfo(@Param(value = "name") String name);
	
	List<ControlUnit> selectAllForLeft(@Param(value = "map") Map map);
	
	List<ControlUnit> selectCuAndQmp();
}