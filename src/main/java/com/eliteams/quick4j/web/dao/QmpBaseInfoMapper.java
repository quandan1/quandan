package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.Qmp;
import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.web.model.ControlUnit;
import com.eliteams.quick4j.web.model.QmpBaseInfo;
import com.eliteams.quick4j.web.model.QmpBaseInfoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface QmpBaseInfoMapper {
    int countByExample(QmpBaseInfoExample example);

    int deleteByExample(QmpBaseInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QmpBaseInfo record);

    int insertSelective(QmpBaseInfo record);

    List<QmpBaseInfo> selectByExample(QmpBaseInfoExample example);

    List<QmpBaseInfo> selectForMap(@Param(value = "map") Map map);

    QmpBaseInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QmpBaseInfo record, @Param("example") QmpBaseInfoExample example);

    int updateByExample(@Param("record") QmpBaseInfo record, @Param("example") QmpBaseInfoExample example);

    int updateByPrimaryKeySelective(QmpBaseInfo record);

    int updateByPrimaryKey(QmpBaseInfo record);

    int getSearchCount(@Param(value = "map") Map map);

    List<QmpBaseInfo> searchByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "map") Map map);

    int deleteById(Integer id);

    /**
     * 分页页数
     */
    int getCount();

    /**
     * 分页
     */
    List<QmpBaseInfo> selectByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize);
}