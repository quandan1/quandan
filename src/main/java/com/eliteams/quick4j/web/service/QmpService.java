package com.eliteams.quick4j.web.service;

import java.util.List;
import java.util.Map;

import com.eliteams.quick4j.web.model.*;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.core.page.Page;

public interface QmpService extends GenericService<Qmp, Long> {


    /**
     * 插入对象
     *
     * @param model 对象
     */
    int insert(Qmp model);

    /**
     * 更新对象
     *
     * @param model 对象
     */

    int insertTestData(QmpTestData model);

    /**
     * 更新对象
     *
     * @param model 对象
     */

    int insertQmpBaseInfo(QmpBaseInfo model);

    /**
     * 更新对象
     *
     * @param model 对象
     */

    int update(Qmp model);

    /**
     * 通过主键, 删除对象
     *
     * @param id 主键
     */
    int delete(int id);

    /**
     * 通过主键, 查询对象
     *
     * @param id 主键
     * @return model 对象
     */
    Qmp selectById(int id);
    
    Qmp selectByName(String name);

    /**
     * 查询单个对象
     *
     * @return 对象
     */
    Qmp selectOne();
    
    List<Qmp> listAll();


    /**
     * 查询多个对象
     *
     * @return 对象集合
     */
    List<Qmp> selectList();
    
    /*
     * 分页
     */
    List<Qmp> selectByPage(String pageNow);
    
    Page getPage(String pageNow);
    
    List<Qmp> searchByPage(String pageNow,Map map);


    
    List<Qmp> searchByPage_youkong(String pageNow,Map map);
    
    Page getSearchPage(String pageNow,Map map);


    
    Page getSearchPage_youkong(String pageNow,Map map);
    
    List<Qmp> selectForMap(Map map);



    List<Map<String,String>> selectKzdmTotal(String pageNow,String userName, Map map, List list);
    List<Map<String,String>> selectKzdmAll(String userName, Map map, List list);

    Page getKzdmPage(String pageNow,String userName, Map map, List list);
    
    List<Map<String,String>> selectKzdmTotalByName(String pageNow,String name,String userName);
    
    Page getKzdmPageByName(String pageNow,String name,String userName);
    
    int computeKzdmTotal(Map map);
    
    float computeKzdmTotal_std(Map map);

    List<QmpWrxx> searchQmpWrxx(String szsb_month,String userName);
    //断面补偿资金
    List<Map<String,String>> selectDmbczjByYearAndMonth(String qysx, String nf , String month, String  userName);
    List<Map<String,String>> selectDmbczjByYearBetweenMonth(String qysx, String nf , String start_month, String end_month, String  userName);
    List<Map<String, Object>> selectDmbczjByYear(String nf , String userName);
    List<Map<String, Object>> selectDmbczjByYearWithMonth(String nf, String sm, String em, String userName);
    List<Map<String, Object>> selectDmbczjByYearWithMonth_kj(String nf, String sm, String em, String userName);
    List<Map<String, Object>> selectDmbczjByYearWithMonthWithRrgion(String nf, String sm, String em, String region, String userName);


    public List<Map<String, String>> selectKzdmAllByName(String name, String userName);

    public List<Map<String, String>> selectKzdmYangZhiAll(String userName, Map map,List list);
    List<Map<String,String>> selectKzdmYangZhiTotal(String pageNow,String userName, Map map,List list);
    
    Page getKzdmYangZhiPage(String pageNow,String userName, Map map,List list);

    List<Map<String,String>> selectKzdmYangZhiAllByName(String name,String userName);
    List<Map<String,String>> selectKzdmYangZhiTotalByName(String pageNow,String name,String userName);


    Page getKzdmYangZhiPageByName(String pageNow,String name,String userName);

    List<Map<String,String>> selectKzdmFactoryAll(String userName, Map map,List list);
    List<Map<String,String>> selectKzdmFactoryTotal(String pageNow,String userName, Map map,List list);
    
    Page getKzdmFactoryPage(String pageNow,String userName, Map map,List list);

    List<Map<String,String>> selectKzdmFactoryAllByName(String name,String userName);
    List<Map<String,String>> selectKzdmFactoryTotalByName(String pageNow,String name,String userName);
    
    Page getKzdmFactoryPageByName(String pageNow,String name,String userName);
    
    //选出污染源的水域信息
    List<Map<String,String>> selectWater();
    
    //选出污染源的水域信息
    List<Map<String,String>> selectWaterYangZhi();
    
    //选出污染源的水域信息
    List<Map<String,String>> selectWaterFactory();
    
    List<String> searchQmp_youkong(Map map);
    
    //控制断面
    //污染源求和计算
    List<Map<String,String>> selectKzdmSumSource(Map map);
    //畜禽养殖求和计算
    List<Map<String,String>> selectKzdmSumYangZhi(Map map);
    //污水处理厂求和计算
    List<Map<String,String>> selectKzdmSumFactory(Map map);

    //从qmp_bas_info中获取断面列表
    List<String> getDMs(Map map);

    /**
     * 从qmp_test_data中获取断面指标数据
     * @param params
     * @return
     */
    List<Map<String, String>> getDmZbs(Map<String,String> params);

    /**
     * 从qmp_test_data中获取断面指标数据
     * @param
     * @return
     */
    List<Map<String, String>> getDmZbsPar(String month, String year, String section_name);


    /**
     * 获取断面属性 river_level
     * @param section_name
     * @return
     */
    String getDmProp(String section_name);

    /**
     * 从qmp_bas_info中获取断面的基本信息
     * @param section_name
     * @return
     */
    Map<String, String> getDmBasInfos(String section_name);

    /**
     * 从qmp_bas_info中获取断面的部分基本信息
     * @param section_name
     * @return
     */
    Map<String, String> getDmPartBasInfos(String section_name);

    List<Map<String,String>> getSzzbbz();

    Map<String,Double> getTotalZbs(Map<String, String> param);

    Map<String, String> getCbyzInfos(String section_name,String year,String month);

    Map<String, String> getCbyzAddInfos(String section_name,String year,String month);

    List<QmpTestData> searchByPageSzxz(String pageNow,Map map);

    Page getSearchPageSzxz(String pageNow,Map map);

    /**
     * 通过主键, 查询对象
     *
     * @param id 主键
     * @return model 对象
     */
    QmpTestData selectByIdSzxz(int id);

    /**
     * 通过主键, 删除对象
     *
     * @param id 主键
     */
    int deleteSzxz(int id);

    /**
     * 更新对象
     *
     * @param model 对象
     */

    int updateSzxz(QmpTestData model);

    List<QmpTestData> selectByPageSzxz(String pageNow);

    Page getPageSzxz(String pageNow);

    List<QmpTestData> selectForMapSzxz(Map map);

    int storeCountRes(List<Map<String,String>> result);

    List<Map<String,String>> getStoredRes(Map<String,String> param);
}
