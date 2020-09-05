package com.eliteams.quick4j.web.service;

/**
 * Created by FYZBXX on 2017/8/15.
 */

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.web.model.QmpWrxxYear;

public interface QmpWrxxYearService extends GenericService<QmpWrxxYear, Long> {
    /**
     *
     * 通过给定的断面名称，返回3年内的数据。
     * @param section 断面名称
     * @return
     */
    public QmpWrxxYear getBySection(String section);
}
