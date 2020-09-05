package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.web.model.ShuiXi;

import java.util.ArrayList;
import java.util.Map;

public interface ShuiXiService extends GenericService<ShuiXi, Integer> {

    ArrayList<ShuiXi> getRiverName(Map map);


    ShuiXi getRiverMessage(Map map);
}
