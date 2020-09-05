package com.eliteams.quick4j.web.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.ui.Model;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.model.ControlUnit;
import com.eliteams.quick4j.web.model.Dmzljs;
import com.eliteams.quick4j.web.model.Qmp;

public interface ControlUnitService extends GenericService<ControlUnit, Integer>{

    /**
     * 插入对象
     *
     * @param model 对象
     */
    int insert(ControlUnit model);

    /**
     * 更新对象
     *
     * @param model 对象
     */
    int update(ControlUnit model);

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
    ControlUnit selectById(Integer id);
    
    ControlUnit selectByName(String name);

    /**
     * 查询单个对象
     *
     * @return 对象
     */
    ControlUnit selectOne();
    
    List<ControlUnit> listAll();


    /**
     * 查询多个对象
     *
     * @return 对象集合
     */
    List<ControlUnit> selectList();
    
    /*
     * 分页
     */
    Model selectCUByPage(String pageNow,Model model,String userName);
    
    List<ControlUnit> searchByPage(String pageNow,Map map);
    
    Page getSearchPage(String pageNow,Map map);
    
    List<ControlUnit> selectForMap(Map map);

    List<Map<String,String>> selectKzdyTotal(String userName,Map map, List list);
    List<Map<String,String>> selectKzdyTotal(String pageNow,String userName,Map map, List list);
    
    Page getKzdyPage(String pageNow,String userName,Map map, List list);

    List<Map<String,String>> selectKzdyTotalByName(String name,String userName);
    List<Map<String,String>> selectKzdyTotalByName(String pageNow,String name,String userName);
    
    Page getKzdyPageByName(String pageNow,String name,String userName);
    
    String getRoleSign(String name);
    
    int computeKzdyTotal(Map map);
    
    ControlUnit selectForInfo(String name);
    
    List<ControlUnit> selectAllForLeft(Map map);

    List<Map<String,String>> selectKzdyYangZhiTotal(String userName, Map map, List list);
    List<Map<String,String>> selectKzdyYangZhiTotal(String pageNow,String userName, Map map, List list);
    
    Page getKzdyYangZhiPage(String pageNow,String userName, Map map, List list);

    List<Map<String,String>> selectKzdyYangZhiTotalByName(String name,String userName);
    List<Map<String,String>> selectKzdyYangZhiTotalByName(String pageNow,String name,String userName);
    
    Page getKzdyYangZhiPageByName(String pageNow,String name,String userName);

    List<Map<String,String>> selectKzdyFactoryAll(String userName, Map map, List list);
    List<Map<String,String>> selectKzdyFactoryTotal(String pageNow,String userName, Map map, List list);
    
    Page getKzdyFactoryPage(String pageNow,String userName, Map map, List list);

    List<Map<String,String>> selectKzdyFactoryTotalByName(String name,String userName);
    List<Map<String,String>> selectKzdyFactoryTotalByName(String pageNow,String name,String userName);
    
    Page getKzdyFactoryPageByName(String pageNow,String name,String userName);
    
    //选出污染源的水域信息
    List<Map<String,String>> selectWater();
    
    //选出污染源的水域信息
    List<Map<String,String>> selectWaterYangZhi();
    
    //选出污染源的水域信息
    List<Map<String,String>> selectWaterFactory();
    List<ControlUnit> searchByPage_youkong(Map map);
    List<ControlUnit> searchByPage_youkong(String pageNow,Map map);
    
    Page getSearchPage_youkong(String pageNow,Map map);
    
    List<String> searchCu_youkong(Map map);
    
    //污染源求和计算
    List<Map<String,String>> selectKzdySumSource(Map map);
    //畜禽养殖求和计算
    List<Map<String,String>> selectKzdySumYangZhi(Map map);
    //污水处理厂求和计算
    List<Map<String,String>> selectKzdySumFactory(Map map);
    
    List<String> getRoleNameOfCountry(String username);
    
    List<ControlUnit> selectCuAndQmp();
    
    List<Dmzljs> getCuMianyuan(Map map);
}
