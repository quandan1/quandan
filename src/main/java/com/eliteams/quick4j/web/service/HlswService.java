package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.web.model.Hlsw;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public interface HlswService extends GenericService<Hlsw, Integer> {

    ArrayList<Integer> selectDate(Map map);
 }
