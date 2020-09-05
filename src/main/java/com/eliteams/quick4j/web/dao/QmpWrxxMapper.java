package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.QmpWrxx;
import com.eliteams.quick4j.web.model.QmpWrxxExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface QmpWrxxMapper {
    long countByExample(QmpWrxxExample example);

    int deleteByExample(QmpWrxxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QmpWrxx record);

    int insertSelective(QmpWrxx record);

    List<QmpWrxx> selectByExample(QmpWrxxExample example);

    QmpWrxx selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QmpWrxx record, @Param("example") QmpWrxxExample example);

    int updateByExample(@Param("record") QmpWrxx record, @Param("example") QmpWrxxExample example);

    int updateByPrimaryKeySelective(QmpWrxx record);

    int updateByPrimaryKey(QmpWrxx record);
    
    String computeKzdmTotal_std(@Param(value = "map") Map map);
    
    List<QmpWrxx> searchQmpWrxx(@Param(value = "map") Map map);

    /**
     *
     * @param entity 必须设定year属性，必须设定section_name属性
     * @return
     */
    public List<QmpWrxx> getByTime(QmpWrxx entity);

    /**
     * 查询数据列表，如果需要分页，请设置分页对象，如：entity.setPage(new Page<T>());
     * @param entity
     * @return
     */
    public List<QmpWrxx> findList(QmpWrxx entity);

    /**
     * 查询所有数据列表
     * @param entity
     * @return
     */
    public List<QmpWrxx> findAllList(QmpWrxx entity);

    List<QmpWrxx> getSearchCount(@Param(value = "map") Map map);

    List<QmpWrxx> searchByPage(@Param(value = "startPos") int startPos, @Param(value = "pageSize") int pageSize, @Param(value = "map") Map map, @Param(value = "month") int month);

    List<QmpWrxx> selectAllIWant(@Param(value = "map") Map map);
    
    List<QmpWrxx> selectCuMianyuan(@Param(value = "map") Map map);
    
    List<QmpWrxx> selectCuDianyuan(@Param(value = "map") Map map);
}
