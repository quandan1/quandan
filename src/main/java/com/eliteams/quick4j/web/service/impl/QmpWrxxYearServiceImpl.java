package com.eliteams.quick4j.web.service.impl;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.web.dao.QmpWrxxYearMapper;
import com.eliteams.quick4j.web.model.QmpWrxxYear;
import com.eliteams.quick4j.web.service.QmpWrxxYearService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by FYZBXX on 2017/8/15.
 */
@Service
public class QmpWrxxYearServiceImpl extends GenericServiceImpl<QmpWrxxYear, Long> implements QmpWrxxYearService {

    @Resource
    private QmpWrxxYearMapper qmpWrxxYearMapper;

    @Override
    public GenericDao<QmpWrxxYear, Long> getDao() {
        return null;
    }

    @Override
    public QmpWrxxYear getBySection(String section) {
        return qmpWrxxYearMapper.getBySection(section);
    }
}
