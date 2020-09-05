package com.eliteams.quick4j.web.service;

import java.util.List;
import java.util.Map;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.model.PollYangZhi;
 
 

public interface PollYangZhiService extends GenericService<PollYangZhi, Integer> {


    /**
     * 插入对象
     *
     * @param model 对象
     */
    int insert(PollYangZhi model);

    /**
     * 更新对象
     *
     * @param model 对象
     */
    int update(PollYangZhi model);

    /**
     * 通过主键, 删除对象
     *
     * @param id 主键
     */
    int delete(Integer id);

    /**
     * 通过主键, 查询对象
     *
     * @param id 主键
     * @return model 对象
     */
    PollYangZhi selectById(Integer id);
    
    PollYangZhi selectByName(String name);

    /**
     * 查询单个对象
     *
     * @return 对象
     */
    PollYangZhi selectOne();
    
    List<PollYangZhi> listAll();


    /**
     * 查询多个对象
     *
     * @return 对象集合
     */
    List<PollYangZhi> selectList();
    
    /*
     * 分页
     */
    List<PollYangZhi> selectByPage(String pageNow);
    
    Page getPage(String pageNow);
    
    List<PollYangZhi> searchByPage(String pageNow,Map map);
    
    Page getSearchPage(String pageNow,Map map);
    
    List<PollYangZhi> selectForMap(Map map);
    
    
    
}
