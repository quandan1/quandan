package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.web.model.Qmp;
import com.eliteams.quick4j.web.model.QmpBaseInfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

import com.eliteams.quick4j.web.model.*;

import com.eliteams.quick4j.core.page.Page;


/**
 * Created by Administrator on 2018/04/21.
 */
public interface QmpBaseInfoService extends GenericService<QmpBaseInfo, Long> {
    List<QmpBaseInfo> selectForMap(Map map);

    List<QmpBaseInfo> searchByPage(String pageNow,Map map);

    Page getSearchPage(String pageNow,Map map);

    /**
     * 通过主键, 查询对象
     *
     * @param id 主键
     * @return model 对象
     */
    QmpBaseInfo selectById(int id);

    /**
     * 通过主键, 删除对象
     *
     * @param id 主键
     */
    int delete(int id);

    /**
     * 更新对象
     *
     * @param model 对象
     */

    int update(QmpBaseInfo model);

    /*
     * 分页
     */
    List<QmpBaseInfo> selectByPage(String pageNow);

    Page getPage(String pageNow);



}
