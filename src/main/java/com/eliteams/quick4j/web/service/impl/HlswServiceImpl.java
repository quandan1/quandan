package com.eliteams.quick4j.web.service.impl;


import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.web.dao.HlswMapper;
import com.eliteams.quick4j.web.model.Hlsw;
import com.eliteams.quick4j.web.service.HlswService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class HlswServiceImpl extends GenericServiceImpl<Hlsw, Integer> implements HlswService {

    @Resource
    private HlswMapper hlswMapper;



    @Override
    public GenericDao<Hlsw, Integer> getDao() {
        return null;
    }

    @Override
    public ArrayList<Integer> selectDate(Map map) {
        return hlswMapper.selectDate(map);
    }
}
