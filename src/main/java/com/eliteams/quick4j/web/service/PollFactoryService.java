package com.eliteams.quick4j.web.service;

import java.util.List;
import java.util.Map;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.model.PollFactory;
import com.eliteams.quick4j.web.model.PollSource;
import com.eliteams.quick4j.web.model.Qmp;
 
 

public interface PollFactoryService extends GenericService<PollFactory, Long> {


    /**
     * 插入对象
     *
     * @param model 对象
     */
    int insert(PollFactory model);

    /**
     * 更新对象
     *
     * @param model 对象
     */
    int update(PollFactory model);

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
    PollFactory selectById(Long id);
//    PollFactory selectByZzjgdm(String zzlgdm);
    PollFactory selectByName(String name);

    /**
     * 查询单个对象
     *
     * @return 对象
     */
    PollFactory selectOne();
    
    List<PollFactory> listAll();


    /**
     * 查询多个对象
     *
     * @return 对象集合
     */
    List<PollFactory> selectList();
    
    /*
     * 分页
     */
    List<PollFactory> selectByPage(String pageNow);
    
    Page getPage(String pageNow);
    
    List<PollFactory> searchByPage(String pageNow,Map map);
    
    Page getSearchPage(String pageNow,Map map);
    
    List<PollFactory> selectForMap(Map map);


    List<PollFactory> getWsc(Map map);
    
}
