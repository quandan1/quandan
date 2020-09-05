package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.web.model.MikeJbxx;

import java.util.List;
import java.util.Map;

public interface MikeService extends GenericService<MikeJbxx, Integer> {


    List<MikeJbxx> selectAll();

    List<MikeJbxx> selectOne(Map map);

}
