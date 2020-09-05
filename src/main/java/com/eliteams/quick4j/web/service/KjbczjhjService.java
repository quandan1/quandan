package com.eliteams.quick4j.web.service;


import org.apache.poi.ss.usermodel.Workbook;

import java.util.Map;

/**
 * 扣缴补偿资金合计
 * 
 * @author ZC
 * @since 2018年07月20日21:58:44
 **/
public interface KjbczjhjService {


    /**
     * 扣缴资金
     * @return
     */
    Map<String,Object> getKjzj();

    /**
     * 补偿资金
     * @return
     */
    Map<String,Object> getBczj();

    Map<String,Object> getTable();

    /**
     * 填充execl表格
     * @return
     * @param wb
     */
    Workbook fillTable(Workbook wb, String year);


}
