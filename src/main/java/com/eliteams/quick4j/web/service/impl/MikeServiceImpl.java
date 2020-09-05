package com.eliteams.quick4j.web.service.impl;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.web.dao.MikeJbxxMapper;
import com.eliteams.quick4j.web.model.MikeJbxx;
import com.eliteams.quick4j.web.service.MikeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service
    public class MikeServiceImpl extends GenericServiceImpl<MikeJbxx, Integer> implements MikeService {

    @Resource
    private MikeJbxxMapper mikeJbxxMapper;

    @Override
    public GenericDao<MikeJbxx, Integer> getDao() {
        return (GenericDao<MikeJbxx, Integer>) mikeJbxxMapper ;
    }

    @Override
    public List<MikeJbxx> selectAll() {
        return mikeJbxxMapper.selectAll();
    }

    @Override
    public List<MikeJbxx> selectOne(Map map) {
        return mikeJbxxMapper.selectOne(map);
    }
}
