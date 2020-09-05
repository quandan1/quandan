package com.eliteams.quick4j.web.service.impl;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.web.dao.ShuiXiMapper;
import com.eliteams.quick4j.web.model.ShuiXi;
import com.eliteams.quick4j.web.service.ShuiXiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Map;

@Service
public class ShuiXiServiceImpl extends GenericServiceImpl<ShuiXi, Integer> implements ShuiXiService {

    @Resource
    private ShuiXiMapper shuixiMapper;

    @Override
    public GenericDao<ShuiXi, Integer> getDao() {
        return null;
    }

    @Override
    public ArrayList<ShuiXi> getRiverName(Map map) {
        return shuixiMapper.getRiverName(map);
    }

    @Override
    public ShuiXi getRiverMessage(Map map) {

        return shuixiMapper.getRiverMessage(map);
    }
}
