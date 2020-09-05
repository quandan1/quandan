package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.web.model.Zcfg;
import com.eliteams.quick4j.web.model.ZcfgExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ZcfgMapper extends GenericDao<Zcfg , Integer>{
    int countByExample(ZcfgExample example);

    int deleteByExample(ZcfgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Zcfg record);

    int insertSelective(Zcfg record);

    List<Zcfg> selectByExample(ZcfgExample example);

    Zcfg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Zcfg record, @Param("example") ZcfgExample example);

    int updateByExample(@Param("record") Zcfg record, @Param("example") ZcfgExample example);

    int updateByPrimaryKeySelective(Zcfg record);

    int updateByPrimaryKey(Zcfg record);
    
    int deleteById(Integer id);
    
    Zcfg selectByName(String name);

    List<Zcfg> selectByType(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "type") String type);

    List<Zcfg> selectByTypeWithoutGJAndS(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize);
    
    List<Zcfg> listAll();
    
    List<Zcfg> selectCUByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize);
    
    int getCUCount();
    
    int getCountByType(@Param(value = "type") String type);
    
    int selectWithoutGJAndSCount();
    
    List<Zcfg> selectByTypeForFolder(@Param(value = "type") String type, @Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize);
    
    int selectByTypeForFolderCount(@Param(value = "type") String type);
    
    List<Zcfg> selectByTypeForSH(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "type") String type, @Param(value = "final_type") String final_type);

    int getCountByTypeForSH(@Param(value = "type") String type, @Param(value = "final_type") String final_type);
    
    List<Zcfg> selectSJByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize);
    
    int getSJCount();

}