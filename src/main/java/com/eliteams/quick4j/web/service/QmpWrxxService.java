package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.model.Dmzljs;
import com.eliteams.quick4j.web.model.Qmp;
import com.eliteams.quick4j.web.model.QmpWrxx;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by FYZBXX on 2017/8/14.
 */
@Service
public interface QmpWrxxService extends GenericService<QmpWrxx, Long> {
    /**
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

    List<QmpWrxx> searchByPage(String pageNow, Map map,String month);

    Page getSearchPage(String pageNow, Map map);

    List<Dmzljs> getDmmy(Map map);
}
