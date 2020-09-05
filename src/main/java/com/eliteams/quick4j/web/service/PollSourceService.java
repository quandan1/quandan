package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.model.PollSource;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface PollSourceService extends GenericService<PollSource, Long> {


    /**
     * 插入对象
     *
     * @param model 对象
     */
    int insert(PollSource model);

    /**
     * 更新对象
     *
     * @param model 对象
     */
    int update(PollSource model);

    /**
     * 通过主键, 删除对象
     *
     * @param id 主键
     */
    int delete(Long id);

    /**
     * 通过主键, 查询对象
     *
     * @param id 主键
     * @return model 对象
     */
    PollSource selectById(Long id);
    
    PollSource selectByName(String name);

    /**
     * 查询单个对象
     *
     * @return 对象
     */
    PollSource selectOne();
    
    List<PollSource> listAll();


    /**
     * 查询多个对象
     *
     * @return 对象集合
     */
    List<PollSource> selectList();
    
    /*
     * 分页
     */
    List<PollSource> selectByPage(String pageNow);
    
    Page getPage(String pageNow);
    
    List<PollSource> searchByPage(String pageNow, Map map);

    Page getSearchPage(String pageNow, Map map);
    
    List<PollSource> selectForMap(Map map);

    List<PollSource> getShuiwennf(Map map);

    List<PollSource> getQiye(Map map);
    
}
