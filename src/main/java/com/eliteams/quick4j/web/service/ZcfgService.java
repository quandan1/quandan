package com.eliteams.quick4j.web.service;

import java.util.List;

import org.springframework.ui.Model;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.web.model.Zcfg;

public interface ZcfgService extends GenericService<Zcfg, Integer>{
	  /**
     * 插入对象
     *
     * @param model 对象
     */
    int insert(Zcfg model);

    /**
     * 更新对象
     *
     * @param model 对象
     */
    int update(Zcfg model);

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
    Zcfg selectById(Integer id);
    
    Zcfg selectByName(String name);

    Model selectByType(String pageNow,Model model,String type);

    Model selectByTypeWithoutGJAndS(String pageNow,Model model);
    /**
     * 查询单个对象
     *
     * @return 对象
     */
    Zcfg selectOne();
    
    List<Zcfg> listAll();


    /**
     * 查询多个对象
     *
     * @return 对象集合
     */
    List<Zcfg> selectList();
    
    /*
     * 分页
     */
    Model selectCUByPage(String pageNow,Model model);
    
    Model selectByTypeForFolder(String type,String pageNow,Model model);
    
    Model selectByTypeForSH(String pageNow,Model model,String type,String final_type);
    
    Model selectSJByPage(String pageNow,Model model);


}
