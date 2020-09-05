package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.web.dao.CalcViewMapper;
import com.eliteams.quick4j.web.model.CalcView;
import com.eliteams.quick4j.web.model.User;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 用户 业务 接口
 * 
 * @author StarZou
 * @since 2014年7月5日 上午11:53:33
 **/
public interface CalcService extends GenericService<CalcView, Long> {

    Map<String,CalcView> getCalcMap();

}
