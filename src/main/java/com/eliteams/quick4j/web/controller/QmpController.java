package com.eliteams.quick4j.web.controller;

import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.dao.DmbczjMapper;
import com.eliteams.quick4j.web.dao.RoleMapper;
import com.eliteams.quick4j.web.dao.UserMapper;
import com.eliteams.quick4j.web.model.*;
import com.eliteams.quick4j.web.service.*;
import com.eliteams.quick4j.web.util.DBUtil;
import com.eliteams.quick4j.web.util.DocUtil;
//import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import org.apache.poi.ss.util.CellRangeAddress;
import com.google.gson.Gson;

import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.RegionUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.*;

import com.eliteams.quick4j.web.model.Qmp;
import com.eliteams.quick4j.web.model.QmpWrxx;
import com.eliteams.quick4j.web.service.QmpService;
import com.eliteams.quick4j.web.service.QmpBaseInfoService;

class formatResult {
    List<Map<String, String>> result;
    List chengshiCount;
    List duanmianCount;
    List zongjiCount;
    List chengshiList;
    List duanmianList;
    List zongji2List;
}

@SuppressWarnings("deprecation")
@Controller
@RequestMapping(value = "/qmp")
public class QmpController {

    @Resource
    KjbczjhjService kjbczjhjService;
    @Resource
    private QmpService qmpService;
    @Resource
    private RoleService roleService;
    @Resource
    private QmpBaseInfoService qmpBaseInfoService;
    @Resource
    private UserMapper userMapper;
    @Resource
    private RoleMapper roleMapper;
    @Resource
    private UserService userService;

    @Resource
    private CalcService calcService;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static List<Map<String, String>> result1;
    public static List<Map<String, String>> FILTERLIST = new ArrayList<Map<String, String>>();
    @Resource
    private DmbczjMapper dmbczjMapper;


    @RequestMapping("/getCity")
    public void getCity(HttpServletRequest request, HttpServletResponse response) {

        String roleSign = (String) request.getParameter("roleSign");
        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (roleSign == null) {
            out.write("err");
        } else {
            if (roleSign.equals("2")) {
                String sql = "SELECT DISTINCT loc_county FROM qmp WHERE loc_city = '" + (String) request.getParameter("loc_city") + "' AND tjnf = '" + (String) request.getParameter("tjnf") + "' ";
                PreparedStatement pstmt;
                List<String> rlt = new ArrayList<String>();
                List<String> list = new ArrayList<String>();
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_env", "root", "981225");
                    pstmt = (PreparedStatement) conn.prepareStatement(sql);
                    ResultSet rs = pstmt.executeQuery();
                    int col = rs.getMetaData().getColumnCount();
                    while (rs.next()) {
                        for (int i = 1; i <= col; i++) {
                            //System.out.print(rs.getString(i) + "\t");
                            rlt.add(rs.getString(i));
                        }
                    }
                    for (int i = 0; i < rlt.size(); i++) {
                        boolean unique = true;
                        for (int j = 0; j < list.size(); j++) {
                            if (list.get(j).toString().replaceAll("[市区县]", "").equals(
                                    rlt.get(i).toString().replaceAll("[市区县]", ""))) {
                                unique = false;
                            }
                        }
                        if (unique) {
                            list.add(rlt.get(i).toString());
                        }
                    }
                    rlt = null;
                    conn.close();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                Gson gson = new Gson();
                out.write(gson.toJson(list));//写入字符串
            } else {
                out.write("ZeroChildren");
            }
        }
    }

    public List<Map<String, String>> formatResult(List<Map<String, Object>> result, String[] title) {
        String[] str = new String[]{"id", "month", "city", "loc_river", "section_name", "section_sx",
                "objective_2018", "szlb", "cbxm", "jl_jnzj", "lwjf_jnzj", "hj_jnzj", "bcxy_jnzj", "bccs_jnzj",
                "bcsl_jnzj"};
        int length = title.length;
        int count = 0;
//      System.out.println("length");
//      System.out.println(length);
        List<Map<String, String>> newResult = new ArrayList<Map<String, String>>();
        for (Map<String, Object> item : result) {
            Map<String, String> newItem = new HashMap<String, String>();
            newItem.put("id", Integer.toString(count + 1));
            newItem.put("month", item.get("month").toString());
            newItem.put("city", item.get("city").toString());
            newItem.put("loc_river", item.get("loc_river").toString());
            newItem.put("section_name", item.get("section_name").toString());
            newItem.put("section_sx", item.get("section_sx").toString());
            newItem.put("objective_2018", item.get("objective_2018").toString());
            newItem.put("szlb", item.get("szlb").toString());
            newItem.put("cbxm", item.get("cbxm").toString());
            newItem.put("jl_jnzj", item.get("jl_jnzj").toString());
            newItem.put("lwjf_jnzj", item.get("lwjf_jnzj").toString());
            newItem.put("hj_jnzj", item.get("hj_jnzj").toString());
            newItem.put("bcxy_jnzj", item.get("bcxy_jnzj") == null ? "0" : item.get("bcxy_jnzj").toString());
            newItem.put("bccs_jnzj", item.get("bccs_jnzj") == null ? "" : item.get("bccs_jnzj").toString());
            newItem.put("bcsl_jnzj", item.get("bcsl_jnzj") == null ? "0" : item.get("bcsl_jnzj").toString());
            newResult.add(count, newItem);
            count++;
        }
        return newResult;
    }

    public Map<String, Integer> getMonthMap(List<Map<String, String>> map, String sm, String em) {
        int startMonth = Integer.parseInt(sm);
        int endMonth = Integer.parseInt(em);
        if (map.size() == 0) {
            Map<String, Integer> monthMap = new HashMap<String, Integer>();

            for (int month = startMonth; month <= endMonth; month++) {
                monthMap.put(Integer.toString(month), 0);

            }
            System.out.println(monthMap);
            return monthMap;
        } else {
            Map<String, Integer> monthMap = new HashMap<String, Integer>();
            int count = 0;
            String thisMonth = null;
            int int_thisMonth;
            int max_month = endMonth;
//            for (Map<String, String> item : map){
//                thisMonth = item.get("month");
//                int_thisMonth = Integer.parseInt(thisMonth);
//                if (max_month < int_thisMonth){
//                    max_month = int_thisMonth;
//                }
//                else {
//                    continue;
//                }
//
//            }
            System.out.print("max_month: ");
            System.out.println(max_month);
            for (int i = 1; i <= max_month; i++) {
                monthMap.put(Integer.toString(i), 0);
            }
            System.out.println(monthMap);
            for (Map<String, String> item : map) {
                thisMonth = item.get("month");
//            if (monthMap.containsKey(thisMonth)) {
                monthMap.put(thisMonth, monthMap.get(thisMonth) + 1);
//            } else {
//                monthMap.put(thisMonth, 1);
//            }

            }
//      System.out.println(monthMap);
            System.out.println(monthMap);
            return monthMap;
        }

    }

    public Map<String, Map<String, Integer>> getCityByMonthMap(List<Map<String, String>> map) {
        Map<String, Map<String, Integer>> cityMonthMap = new HashMap<>();

        int cityCount = 0;
        String monthFlag = null;
        String cityName = null;
        String thisCity = null;
        String thisMonth;
        for (Map<String, String> item : map) {
            thisCity = item.get("city");
            thisMonth = item.get("month").toString();
            if (cityMonthMap.containsKey(thisMonth)) {
                if (cityMonthMap.get(thisMonth).containsKey(thisCity)) {
                    cityMonthMap.get(thisMonth).put(thisCity, cityMonthMap.get(thisMonth).get(thisCity) + 1);

                } else {
                    cityMonthMap.get(thisMonth).put(thisCity, 1);
                }

            } else {
                Map<String, Integer> cityMap = new HashMap<>();
                cityMonthMap.put(thisMonth, cityMap);
                cityMonthMap.get(thisMonth).put(thisCity, 1);
            }
        }
//    System.out.println(cityMonthMap);
        return cityMonthMap;
    }

    public double addByColumn(Row row, int startColumn, int length) {
        int i = startColumn;
        double sum = 0;
        for (; i < startColumn + length; i++) {
            Cell cell = row.getCell(i);
            if (cell.getCellType() == XSSFCell.CELL_TYPE_BLANK) {
                sum += 0;
                System.out.println(sum);
            } else if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
                sum += Integer.parseInt(cell.getStringCellValue());
                System.out.println(sum);
            } else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
                sum += cell.getNumericCellValue();
                System.out.println(sum);
            } else {
                sum += 0;
            }

        }
        return sum;
    }

    public double addByRow(Sheet sheet, int column, int startRow, int length) {
        int i = startRow;
        double sum = 0;
        for (; i < startRow + length; i++) {
            Row row = sheet.getRow(i);
            Cell cell = row.getCell(column);
            if (cell.getCellType() == XSSFCell.CELL_TYPE_BLANK) {
                System.out.println("blank");
                sum += 0;
            } else if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
                System.out.println(cell.getStringCellValue());
                if (cell.getStringCellValue() == "") {
                    sum += 0;
                } else {
                    sum += Integer.parseInt(cell.getStringCellValue());
                }

            } else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
                sum += cell.getNumericCellValue();
            } else {
                sum += 0;
            }

        }
        return sum;
    }

    public Workbook formatExcel(Workbook wb, Map<String, Map<String, Integer>> cityMonthMap, Map<String, Integer> monthMap, int length, String sm) {
        Workbook new_wb = wb;
        XSSFCellStyle titleStyle = (XSSFCellStyle) new_wb.createCellStyle();
        XSSFCellStyle contentStyle = (XSSFCellStyle) new_wb.createCellStyle();
        Font titleFont = new_wb.createFont();
        Font contentFont = new_wb.createFont();

        titleFont.setFontName("宋体");
        titleFont.setBold(true);
        titleFont.setFontHeightInPoints((short) 11);
        titleStyle.setFont(titleFont);
        titleStyle.setBorderBottom(CellStyle.BORDER_THIN);
        titleStyle.setBorderTop(CellStyle.BORDER_THIN);
        titleStyle.setBorderLeft(CellStyle.BORDER_THIN);
        titleStyle.setBorderRight(CellStyle.BORDER_THIN);
        titleStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
        titleStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);


        contentFont.setFontName("宋体");
        contentFont.setFontHeightInPoints((short) 10);
        contentStyle.setFont(contentFont);
        contentStyle.setBorderBottom(CellStyle.BORDER_THIN);
        contentStyle.setBorderTop(CellStyle.BORDER_THIN);
        contentStyle.setBorderLeft(CellStyle.BORDER_THIN);
        contentStyle.setBorderRight(CellStyle.BORDER_THIN);
        contentStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
        contentStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
        Sheet sheet = new_wb.getSheetAt(0);
//    System.out.println(monthMap.values());
//        int insertRowNum[] = new int[monthMap.size()];
        int insertRowNum[] = new int[length];
        int thisRow = 3;
        int i = 0;
        int j = 1;
//        int firstMonth = Integer.parseInt(sheet.getRow(3).getCell(1).getStringCellValue());
        int firstMonth = Integer.parseInt(sm);
//        for (int count = 0; count < monthMap.size(); count++) {
        for (int count = 0; count < length; count++) {
            int monthRow = monthMap.get(Integer.toString(count + firstMonth));
            thisRow += monthRow;
            insertRowNum[count] = thisRow;
            thisRow++;
        }
//    System.out.println("insertRowNum");
//    for(int a : insertRowNum){
//        System.out.println(a);
//    }

        int start = 3;
        for (int item : insertRowNum) {

            sheet.shiftRows(item, sheet.getLastRowNum() + insertRowNum.length, 1, true, false);
            CellRangeAddress cra = new CellRangeAddress(item, item, 0, 11);
            sheet.addMergedRegion(cra);
            RegionUtil.setBorderBottom(CellStyle.BORDER_THIN, cra, sheet); // 下边框
            RegionUtil.setBorderLeft(CellStyle.BORDER_THIN, cra, sheet); // 左边框
            RegionUtil.setBorderRight(CellStyle.BORDER_THIN, cra, sheet); // 有边框
            RegionUtil.setBorderTop(CellStyle.BORDER_THIN, cra, sheet); // 上边框
            String title = Integer.toString(firstMonth) + "月合计";
            Row row = sheet.getRow(item);
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(title);
            cell0.setCellStyle(contentStyle);
            Cell cell1 = row.createCell(12);
            Cell cell2 = row.createCell(13);
            Cell cell3 = row.createCell(14);
            Cell cell4 = row.createCell(15);
            double sum = addByRow(sheet, 11, start, item - start);
//        System.out.println(sum);
            double xy_sum = addByRow(sheet, 13, start, item - start);
//        System.out.println(xy_sum);
            double sl_sum = addByRow(sheet, 15, start, item - start);
//        System.out.println(sl_sum);
            cell1.setCellValue(sum);
            cell1.setCellStyle(contentStyle);
            cell2.setCellValue(xy_sum);
            cell2.setCellStyle(contentStyle);
            cell3.setCellValue("");
            cell3.setCellStyle(contentStyle);
            cell4.setCellValue(sl_sum);
            cell4.setCellStyle(contentStyle);
            for (Cell cel : row) {
                cel.setCellStyle(contentStyle);
            }
            start = item + 1;
            j++;
            firstMonth++;

//        System.out.println(item);
        }
        int startrow = 3;
        for (; startrow < sheet.getLastRowNum(); ) {
            Row nowRow = sheet.getRow(startrow);
            try {
                String month = nowRow.getCell(1).getStringCellValue();

                System.out.println("month");
                System.out.println(month);
                String city = nowRow.getCell(2).getStringCellValue();
                int thisCityCount = cityMonthMap.get(month).get(city);
//        System.out.println(city);
                double sum = addByRow(sheet, 11, startrow, thisCityCount);
                if (thisCityCount == 1) {
                    Cell cell = nowRow.getCell(12);
                    cell.setCellStyle(contentStyle);
//            System.out.println(sum);
                    cell.setCellValue(sum);
                } else {
                    System.out.println(startrow);
                    System.out.println(thisCityCount + startrow - 1);

                    CellRangeAddress cra = new CellRangeAddress(startrow, startrow + thisCityCount - 1, 12, 12);
                    sheet.addMergedRegion(cra);
//          RegionUtil.setBorderBottom(CellStyle.BORDER_THIN, cra, sheet); // 下边框
//          RegionUtil.setBorderLeft(CellStyle.BORDER_THIN, cra, sheet); // 左边框
//          RegionUtil.setBorderRight(CellStyle.BORDER_THIN, cra, sheet); // 有边框
//          RegionUtil.setBorderTop(CellStyle.BORDER_THIN, cra, sheet); // 上边框
//          sheet.addMergedRegion(new CellRangeAddress(startrow, startrow + thisCityCount - 1, 12, 12));
                    Cell cell = nowRow.getCell(12);

//            System.out.println(sum);
                    cell.setCellValue(sum);
//        cell.setCellStyle(contentStyle);
                }
                startrow += thisCityCount;

            } catch (Exception e) {
                startrow += 1;
            }

        }


//    System.out.println(insertRowNum);
        return new_wb;
    }


    @RequestMapping(value = "/dmbczjExportToExcel", method = RequestMethod.POST, produces = {"application/vnd.ms-excel;charset=UTF-8"})
    @ResponseBody
    public String dmbczjExportToExcel(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 查询出的内容
//        List<Map<String, String>> result1 = (List<Map<String, String>>) request.getSession().getAttribute("dmbczjexcel");
//        System.out.println(result1.size());
//        System.out.println(request);
        if (request.getParameter("断面补偿资金计算表") != null) {
            String year = request.getParameter("exportnf");
            String sm = request.getParameter("exportsm");
            String em = request.getParameter("exportem");
            String region = request.getParameter("exportreg");
//        System.out.println("year="+year);
            String excelTitle;
            List<Map<String, Object>> result;
            if (!region.equals("all")) {
                if (sm.equals(em)) {
                    excelTitle = year + "年" + sm + "月" + region + "超标河流断面补偿资金清单";
                } else {
                    excelTitle = year + "年" + sm + "月-" + em + "月" + region + "超标河流断面补偿资金清单";
                }
                String userName = (String) request.getSession().getAttribute("userName");
                //List<Map<String, Object>> result = qmpService.selectDmbczjByYear(year, userName);
                region = region + "市";
                result = qmpService.selectDmbczjByYearWithMonthWithRrgion(year, sm, em, region, userName);
            } else {
                if (sm.equals(em)) {
                    excelTitle = year + "年" + sm + "月" + "超标河流断面补偿资金清单";
                } else {
                    excelTitle = year + "年" + sm + "月-" + em + "月" + "超标河流断面补偿资金清单";
                }
                String userName = (String) request.getSession().getAttribute("userName");
                //List<Map<String, Object>> result = qmpService.selectDmbczjByYear(year, userName);
                result = qmpService.selectDmbczjByYearWithMonth(year, sm, em, userName);
            }

//        System.out.println(result.size());
//        System.out.println(result);
            Workbook wb = new XSSFWorkbook();
            XSSFCellStyle warpContentStyle = (XSSFCellStyle) wb.createCellStyle();
            XSSFCellStyle titleStyle = (XSSFCellStyle) wb.createCellStyle();
            XSSFCellStyle contentStyle = (XSSFCellStyle) wb.createCellStyle();
//        XSSFCellStyle boldStyle = (XSSFCellStyle)wb.createCellStyle();
            Font titleFont = wb.createFont();
            Font contentFont = wb.createFont();
            Font warpContentFont = wb.createFont();

            titleFont.setFontName("宋体");
            titleFont.setBold(true);
            titleFont.setFontHeightInPoints((short) 11);
            titleStyle.setFont(titleFont);
            titleStyle.setBorderBottom(CellStyle.BORDER_THIN);
            titleStyle.setBorderTop(CellStyle.BORDER_THIN);
            titleStyle.setBorderLeft(CellStyle.BORDER_THIN);
            titleStyle.setBorderRight(CellStyle.BORDER_THIN);
            titleStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
            titleStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);


            contentFont.setFontName("宋体");
            contentFont.setFontHeightInPoints((short) 10);
            contentStyle.setFont(contentFont);
            contentStyle.setBorderBottom(CellStyle.BORDER_THIN);
            contentStyle.setBorderTop(CellStyle.BORDER_THIN);
            contentStyle.setBorderLeft(CellStyle.BORDER_THIN);
            contentStyle.setBorderRight(CellStyle.BORDER_THIN);
            contentStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
            contentStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
            contentStyle.setWrapText(true);


            warpContentFont.setFontName("宋体");
            warpContentFont.setFontHeightInPoints((short) 10);
            warpContentStyle.setFont(warpContentFont);
            warpContentStyle.setBorderBottom(CellStyle.BORDER_THIN);
            warpContentStyle.setBorderTop(CellStyle.BORDER_THIN);
            warpContentStyle.setBorderLeft(CellStyle.BORDER_THIN);
            warpContentStyle.setBorderRight(CellStyle.BORDER_THIN);
            warpContentStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
            warpContentStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
            warpContentStyle.setWrapText(true);
//        ztFont.setBold(true);
            //Workbook wb = new XSSFWorkbook();
            CreationHelper createHelper = wb.getCreationHelper();
            Sheet sheet = wb.createSheet(excelTitle);
//        sheet.setDisplayGridlines(true);
            //合并单元格
            CellRangeAddress cra = new CellRangeAddress(0, 0, 0, 15);
            sheet.addMergedRegion(cra);
            RegionUtil.setBorderBottom(CellStyle.BORDER_THIN, cra, sheet); // 下边框
            RegionUtil.setBorderLeft(CellStyle.BORDER_THIN, cra, sheet); // 左边框
            RegionUtil.setBorderRight(CellStyle.BORDER_THIN, cra, sheet); // 有边框
            RegionUtil.setBorderTop(CellStyle.BORDER_THIN, cra, sheet); // 上边框
            for (int i = 0; i < 9; i++) {
                CellRangeAddress cra1 = new CellRangeAddress(1, 2, i, i);
                sheet.addMergedRegion(cra1);
                RegionUtil.setBorderBottom(CellStyle.BORDER_THIN, cra1, sheet); // 下边框
                RegionUtil.setBorderLeft(CellStyle.BORDER_THIN, cra1, sheet); // 左边框
                RegionUtil.setBorderRight(CellStyle.BORDER_THIN, cra1, sheet); // 有边框
                RegionUtil.setBorderTop(CellStyle.BORDER_THIN, cra1, sheet); // 上边框
//            sheet.addMergedRegion(new CellRangeAddress(1,2,i,i));
            }
            CellRangeAddress cra2 = new CellRangeAddress(1, 1, 9, 15);
            sheet.addMergedRegion(cra2);
            RegionUtil.setBorderBottom(CellStyle.BORDER_THIN, cra2, sheet); // 下边框
            RegionUtil.setBorderLeft(CellStyle.BORDER_THIN, cra2, sheet); // 左边框
            RegionUtil.setBorderRight(CellStyle.BORDER_THIN, cra2, sheet); // 有边框
            RegionUtil.setBorderTop(CellStyle.BORDER_THIN, cra2, sheet); // 上边框
//        sheet.addMergedRegion(new CellRangeAddress(1,1,9,15));
            //第一行，标题
            int i = 3;
            Row row = sheet.getRow(0);
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(excelTitle);
//        row.createCell(0).setCellValue(excelTitle);
//        cell0.setCellStyle(titleStyle);
            int num = 0;
            for (Cell cel : row) {
//            System.out.println("num");
//            System.out.println(num);
                cel.setCellStyle(titleStyle);

            }
            //表头
            Row row1 = sheet.getRow(1);
            Cell cell1 = row1.getCell(0);
            cell1.setCellValue("序号");
            Cell cell2 = row1.createCell(1);
            cell2.setCellValue("月份");
            Cell cell3 = row1.createCell(2);
            cell3.setCellValue("城市");
            Cell cell4 = row1.createCell(3);
            cell4.setCellValue("所属河流");
            Cell cell5 = row1.createCell(4);
            cell5.setCellValue("断面名称");
            Cell cell6 = row1.createCell(5);
            cell6.setCellValue("断面属性");
            Cell cell7 = row1.createCell(6);
            cell7.setCellValue("2018目标");
            Cell cell8 = row1.createCell(7);
            cell8.setCellValue("水质类别");
            Cell cell9 = row1.createCell(8);
            cell9.setCellValue("超标项目");
            Cell cell10 = row1.createCell(9);
            cell10.setCellValue("缴纳资金核算（万元)");
            Row row2 = sheet.getRow(2);
            Cell cell11 = row2.createCell(9);
            cell11.setCellValue("降类");
            Cell cell12 = row2.createCell(10);
            cell12.setCellValue("劣Ⅴ加罚");
            Cell cell13 = row2.createCell(11);
            cell13.setCellValue("合计");
            Cell cell14 = row2.createCell(12);
            cell14.setCellValue("市总计");
            Cell cell15 = row2.createCell(13);
            cell15.setCellValue("补偿下游");
            Cell cell16 = row2.createCell(14);
            cell16.setCellValue("补偿城市");
            Cell cell17 = row2.createCell(15);
            cell17.setCellValue("补偿省里");
            for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
                Row rowLine = sheet.getRow(rowNum);
                int count = 0;
                if (rowLine != null) {
                    for (Cell cel : rowLine) {
                        System.out.println("count");
                        System.out.println(count);
                        cel.setCellStyle(titleStyle);
                        count++;
                    }
                }
            }
            String[] str = new String[]{"id", "month", "city", "loc_river", "section_name", "section_sx",
                    "objective_2018", "szlb", "cbxm", "jl_jnzj", "lwjf_jnzj", "hj_jnzj", "bcxy_jnzj", "bccs_jnzj",
                    "bcsl_jnzj"};
            System.out.println("*********************************************************************************");
            String a = "";
            List<Map<String, String>> newResult = formatResult(result, str);
            QmpController.result1 = newResult;
            for (Map<String, String> map : newResult) {//每一行
                Row row3 = sheet.createRow(i++);
                for (int k = 0; k < 16; k++) {
                    if (k < 2) {
                        Cell cel = row3.createCell(k);
                        cel.setCellValue(map.get(str[k]).toString());
                        cel.setCellStyle(contentStyle);
                        sheet.setColumnWidth(cel.getColumnIndex(), 6 * 256);
                    }
                    if (k == 2) {
                        Cell cel = row3.createCell(k);
                        cel.setCellValue(map.get(str[k]).toString());
                        cel.setCellStyle(contentStyle);
                        sheet.setColumnWidth(cel.getColumnIndex(), 7 * 256);
                    }
                    if (k >= 3 && k < 9) {
                        Cell cel = row3.createCell(k);
                        cel.setCellValue(map.get(str[k]).toString());
                        cel.setCellStyle(contentStyle);
                    }
                    if (k >= 9 && k < 12) {
                        Cell cel = row3.createCell(k);
                        cel.setCellValue(Integer.valueOf(map.get(str[k]).toString()));
                        cel.setCellStyle(contentStyle);
                    }
                    if (k == 12) {
                        Cell cel = row3.createCell(k);
                        cel.setCellValue("");
                        cel.setCellStyle(contentStyle);
                        continue;
                    }
                    if (k == 13) {
                        if (map.get(str[k - 1]).toString().equals("") || map.get(str[k - 1]).toString() == "") {
                            Cell cel = row3.createCell(k);
                            cel.setCellValue(map.get(str[k - 1]).toString());
                            cel.setCellStyle(contentStyle);
                        } else {
                            Cell cel = row3.createCell(k);
                            cel.setCellValue(Integer.valueOf(map.get(str[k - 1]).toString()));
                            cel.setCellStyle(contentStyle);
                        }
                    }
                    if (k == 14) {
                        Cell cel = row3.createCell(k);
                        cel.setCellValue(map.get(str[k - 1]).toString());
                        cel.setCellStyle(contentStyle);
                    }
                    if (k > 14) {
                        if (map.get(str[k - 1]).toString().equals("") || map.get(str[k - 1]).toString() == "") {
                            Cell cel = row3.createCell(k);
                            cel.setCellValue(map.get(str[k - 1]).toString());
                            cel.setCellStyle(contentStyle);
                        } else {
                            Cell cel = row3.createCell(k);
                            cel.setCellValue(Integer.valueOf(map.get(str[k - 1]).toString()));
                            cel.setCellStyle(contentStyle);
                        }
                    }
                }
            }

            Map<String, Integer> monthMap = getMonthMap(newResult, sm, em);
            Map<String, Map<String, Integer>> cityMonthMap = getCityByMonthMap(newResult);
            Workbook new_wb = formatExcel(wb, cityMonthMap, monthMap, Integer.parseInt(em) - Integer.parseInt(sm) + 1, sm);
            Row lastRow = sheet.getRow(sheet.getLastRowNum());
            for (Cell cel : lastRow) {
                cel.setCellStyle(contentStyle);
            }
            sheet.setDisplayGridlines(true);
            sheet.setColumnWidth(8, 30 * 256);


            ByteArrayOutputStream os = new ByteArrayOutputStream();
            try {
                new_wb.write(os);
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] content = os.toByteArray();
            InputStream is = new ByteArrayInputStream(content);
            // 设置response参数
            response.reset();
            response.setContentType("application/vnd.ms-excel;charset=utf-8");
            response.setHeader("Content-Disposition", "attachment;filename=" + new String((excelTitle + ".xlsx").getBytes(), "iso-8859-1"));
            ServletOutputStream out = response.getOutputStream();
            BufferedInputStream bis = null;
            BufferedOutputStream bos = null;
            try {
                bis = new BufferedInputStream(is);
                bos = new BufferedOutputStream(out);
                byte[] buff = new byte[2048];
                int bytesRead;
                while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                    bos.write(buff, 0, bytesRead);
                }
            } catch (final IOException e) {
                throw e;
            } finally {
                if (bis != null)
                    bis.close();
                if (bos != null)
                    bos.close();
            }
            System.out.println("导出excel");
            return "excel";
        } else if (request.getParameter("扣缴补偿资金详表") != null) {
            System.out.println("扣缴补偿资金详表");
            String year = request.getParameter("exportnf");
            String sm = request.getParameter("exportsm");
            String em = request.getParameter("exportem");
            String region = request.getParameter("exportreg");
            String userName = (String) request.getSession().getAttribute("userName");
            String excelTitle = year + "年各市扣缴补偿资金详表";
            List<Map<String, Object>> result;
            result = qmpService.selectDmbczjByYearWithMonth_kj(year, sm, em, userName);
            System.out.println(result);
            Workbook wb = new XSSFWorkbook();
            // 设置样式
            XSSFCellStyle subtitleStyle = (XSSFCellStyle) wb.createCellStyle();
            XSSFCellStyle cityStyle = (XSSFCellStyle) wb.createCellStyle();
            XSSFCellStyle titleStyle = (XSSFCellStyle) wb.createCellStyle();
            XSSFCellStyle contentStyle = (XSSFCellStyle) wb.createCellStyle();
            XSSFCellStyle lastStyle = (XSSFCellStyle) wb.createCellStyle();
            XSSFCellStyle xiaojiStyle = (XSSFCellStyle) wb.createCellStyle();

            Font titleFont = wb.createFont();
            Font contentFont = wb.createFont();
            Font subtitleFont = wb.createFont();
            Font cityFont = wb.createFont();
            Font xiaojiFont = wb.createFont();

            xiaojiFont.setFontName("宋体");
            xiaojiFont.setBold(false);
            xiaojiFont.setFontHeightInPoints((short) 14);
            xiaojiStyle.setFont(xiaojiFont);
            xiaojiStyle.setBorderBottom(CellStyle.BORDER_THIN);
            xiaojiStyle.setBorderTop(CellStyle.BORDER_THIN);
            xiaojiStyle.setBorderLeft(CellStyle.BORDER_THIN);
            xiaojiStyle.setBorderRight(CellStyle.BORDER_THIN);
            xiaojiStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
            xiaojiStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);

            titleFont.setFontName("宋体");
            titleFont.setBold(true);
            titleFont.setFontHeightInPoints((short) 17);
            titleStyle.setFont(titleFont);
            titleStyle.setBorderBottom(CellStyle.BORDER_THIN);
            titleStyle.setBorderTop(CellStyle.BORDER_THIN);
            titleStyle.setBorderLeft(CellStyle.BORDER_THIN);
            titleStyle.setBorderRight(CellStyle.BORDER_THIN);
            titleStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
            titleStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
            cityFont.setFontName("宋体");
            cityFont.setBold(false);
            cityFont.setFontHeightInPoints((short) 14);
            cityStyle.setFont(cityFont);
            cityStyle.setBorderBottom(CellStyle.BORDER_THIN);
            cityStyle.setBorderTop(CellStyle.BORDER_THIN);
            cityStyle.setBorderLeft(CellStyle.BORDER_THIN);
            cityStyle.setBorderRight(CellStyle.BORDER_THIN);
            cityStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
            cityStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
            contentFont.setFontName("宋体");
            contentFont.setFontHeightInPoints((short) 10);
            contentStyle.setFont(contentFont);
            contentStyle.setBorderBottom(CellStyle.BORDER_THIN);
            contentStyle.setBorderTop(CellStyle.BORDER_THIN);
            contentStyle.setBorderLeft(CellStyle.BORDER_THIN);
            contentStyle.setBorderRight(CellStyle.BORDER_THIN);
            contentStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
            contentStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
            contentStyle.setWrapText(true);
            subtitleFont.setFontName("宋体");
            subtitleFont.setBold(true);
            subtitleFont.setFontHeightInPoints((short) 11);
            subtitleStyle.setFont(subtitleFont);
            subtitleStyle.setBorderBottom(CellStyle.BORDER_THIN);
            subtitleStyle.setBorderTop(CellStyle.BORDER_THIN);
            subtitleStyle.setBorderLeft(CellStyle.BORDER_THIN);
            subtitleStyle.setBorderRight(CellStyle.BORDER_THIN);
            subtitleStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
            subtitleStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
            subtitleStyle.setWrapText(true);
            lastStyle.setBorderTop(CellStyle.BORDER_THIN);
            lastStyle.setBorderBottom(CellStyle.BORDER_THIN);
            lastStyle.setBorderRight(CellStyle.BORDER_THIN);
            lastStyle.setBorderLeft(CellStyle.BORDER_THIN);
            //创建excel工作表
            CreationHelper createHelper = wb.getCreationHelper();
            Sheet sheet = wb.createSheet(excelTitle);
            CellRangeAddress cra = new CellRangeAddress(0, 0, 0, 10);
            sheet.addMergedRegion(cra);
            RegionUtil.setBorderBottom(CellStyle.BORDER_THIN, cra, sheet); // 下边框
            RegionUtil.setBorderLeft(CellStyle.BORDER_THIN, cra, sheet); // 左边框
            RegionUtil.setBorderRight(CellStyle.BORDER_THIN, cra, sheet); // 有边框
            RegionUtil.setBorderTop(CellStyle.BORDER_THIN, cra, sheet); // 上边框
            // 第一行大标题
            Row row0 = sheet.getRow(0);
            Cell cell0 = row0.createCell(0);
            cell0.setCellValue(excelTitle);
            int num = 0;
            for (Cell cel : row0) {
                cel.setCellStyle(titleStyle);
                System.out.println(num);
                num++;
            }
            // 第二行副标题
            Row row1 = sheet.createRow(1);
            System.out.println(row1);
            Cell cell1 = row1.createCell(0);
            cell1.setCellValue("考核城市");
            Cell cell2 = row1.createCell(1);
            cell2.setCellValue("序号");
            Cell cell3 = row1.createCell(2);
            cell3.setCellValue("月份");
            Cell cell4 = row1.createCell(3);
            cell4.setCellValue("断面名称");
            Cell cell5 = row1.createCell(4);
            cell5.setCellValue("河流名称");
            Cell cell6 = row1.createCell(5);
            cell6.setCellValue("考核目标");
            Cell cell7 = row1.createCell(6);
            cell7.setCellValue("断面类别");
            Cell cell8 = row1.createCell(7);
            cell8.setCellValue("监测类别");
            Cell cell9 = row1.createCell(8);
            cell9.setCellValue("扣缴额");
            Cell cell10 = row1.createCell(9);
            cell10.setCellValue("补偿城市");
            Cell cell11 = row1.createCell(10);
            cell11.setCellValue("合计");
            for (Cell cell : row1) {
                cell.setCellStyle(subtitleStyle);
            }
            System.out.println("*********************************************************************************");
            formatResult resultList = formatResult_kj(result);
            List<Map<String, String>> newResult = resultList.result;
            System.out.println(newResult);
            List chengshiCount = resultList.chengshiCount;
            List zongjiList = resultList.zongjiCount;
            List duanmianCount = resultList.duanmianCount;
            List duanmianList = resultList.duanmianList;
            List chengshiList = resultList.chengshiList;
            List zongji2List = resultList.zongji2List;
//            System.out.println(newResult);
//            System.out.println(zongjiList);
//            System.out.println("================================================");
//            System.out.println(chengshiCount);
//            System.out.println(duanmianCount);
//            System.out.println(chengshiCount.size());
//            System.out.println(duanmianCount.size());
//            System.out.println(chengshiList);
//            System.out.println(duanmianList);
//            System.out.println(chengshiList.size());
//            System.out.println(duanmianList.size());
            // 插入内容
            String title[] = new String[]{"city", "id", "month", "dmmc", "hlmc", "khmb", "dmsx", "jclb", "kje", "bccs"};
            int chengshijishu = 1;
            int jishu = 0;
            int i = 2;
            for (Map<String, String> map : newResult) {//每一行
                System.out.println(i);
                Row row3 = sheet.createRow(i++);
                for (int k = 0; k <= 10; k++) {
                    if (k == 10) {
                        Cell cel = row3.createCell(k);

                        cel.setCellStyle(contentStyle);
                    } else {
                        Cell cel = row3.createCell(k);
                        cel.setCellValue(map.get(title[k]));
                        cel.setCellStyle(contentStyle);
                    }

                }
                jishu++;
                if (jishu == (int) chengshiCount.get(chengshijishu)) {
                    Row row4 = sheet.createRow(i);
                    Cell cel_1 = row4.createCell(1);
                    cel_1.setCellValue("小计");
                    cel_1.setCellStyle(xiaojiStyle);
                    i++;
                    chengshijishu++;
                    jishu = 0;
                }
            }


            int count_cs = 1;
            int cs_first_row = 2;
            for (; count_cs < chengshiCount.size(); count_cs++) {
                int len_cs = Integer.parseInt(chengshiCount.get(count_cs).toString());
                CellRangeAddress cs_cell = new CellRangeAddress(cs_first_row, cs_first_row + len_cs, 0, 0);
                sheet.addMergedRegion(cs_cell);
                RegionUtil.setBorderBottom(CellStyle.BORDER_THIN, cs_cell, sheet); // 下边框
                RegionUtil.setBorderLeft(CellStyle.BORDER_THIN, cs_cell, sheet); // 左边框
                RegionUtil.setBorderRight(CellStyle.BORDER_THIN, cs_cell, sheet); // 有边框
                RegionUtil.setBorderTop(CellStyle.BORDER_THIN, cs_cell, sheet); // 上边框
//                System.out.println(cs_first_row+len_cs);
                Cell cell_city = sheet.getRow(cs_first_row).getCell(0);
                cell_city.setCellValue(chengshiList.get(count_cs - 1).toString());
                cell_city.setCellStyle(cityStyle);
                CellRangeAddress new_cs_cell = new CellRangeAddress(cs_first_row + len_cs, cs_first_row + len_cs, 1, 9);
                RegionUtil.setBorderBottom(CellStyle.BORDER_THIN, new_cs_cell, sheet); // 下边框
                RegionUtil.setBorderLeft(CellStyle.BORDER_THIN, new_cs_cell, sheet); // 左边框
                RegionUtil.setBorderRight(CellStyle.BORDER_THIN, new_cs_cell, sheet); // 有边框
                RegionUtil.setBorderTop(CellStyle.BORDER_THIN, new_cs_cell, sheet); // 上边框
                Cell xiaoji_cell = sheet.getRow(cs_first_row + len_cs).createCell(10);
                xiaoji_cell.setCellValue(zongji2List.get(count_cs - 1).toString());
                xiaoji_cell.setCellStyle(contentStyle);
                sheet.addMergedRegion(new_cs_cell);
                cs_first_row = cs_first_row + len_cs + 1;
            }
            int dm_count = 1;
            int dm_first_row = 2;
            jishu = 0;
            chengshijishu = 1;
            for (; dm_count < duanmianCount.size(); dm_count++) {
                int len_dm = Integer.parseInt(duanmianCount.get(dm_count).toString());
                jishu += len_dm;
                if (len_dm == 1) {
//                    CellRangeAddress dm_cell = new CellRangeAddress(dm_first_row, dm_first_row+len_dm-1,1,1);
//                    sheet.getRow(dm_first_row).getCell(1).setCellValue("aa");
                    Row thisRow = sheet.getRow(dm_first_row);
                    Cell duanmian = thisRow.getCell(1);
                    Cell hj_cell = thisRow.getCell(10);
                    duanmian.setCellStyle(cityStyle);
                    duanmian.setCellValue(duanmianList.get(dm_count - 1).toString());
                    hj_cell.setCellValue(zongjiList.get(dm_count - 1).toString());
                    hj_cell.setCellStyle(contentStyle);
//                    System.out.println(hj_cell.getAddress());
                    if (jishu == (int) chengshiCount.get(chengshijishu)) {
                        dm_first_row += 2;
                        chengshijishu++;
                        jishu = 0;
                    } else {
                        dm_first_row++;
                    }
                } else {
                    if (jishu == (int) chengshiCount.get(chengshijishu)) {
                        CellRangeAddress dm_cell = new CellRangeAddress(dm_first_row, dm_first_row + len_dm - 1, 1, 1);
                        CellRangeAddress hj_cell = new CellRangeAddress(dm_first_row, dm_first_row + len_dm - 1, 10, 10);
                        sheet.addMergedRegion(dm_cell);
                        sheet.addMergedRegion(hj_cell);
                        RegionUtil.setBorderBottom(CellStyle.BORDER_THIN, dm_cell, sheet); // 下边框
                        RegionUtil.setBorderLeft(CellStyle.BORDER_THIN, dm_cell, sheet); // 左边框
                        RegionUtil.setBorderRight(CellStyle.BORDER_THIN, dm_cell, sheet); // 有边框
                        RegionUtil.setBorderTop(CellStyle.BORDER_THIN, dm_cell, sheet); // 上边框
                        Row thisRow = sheet.getRow(dm_first_row);
                        Cell duanmian = thisRow.getCell(1);
                        duanmian.setCellValue(duanmianList.get(dm_count - 1).toString());
                        duanmian.setCellStyle(cityStyle);
                        Cell heji = thisRow.getCell(10);
                        heji.setCellValue(zongjiList.get(dm_count - 1).toString());
                        heji.setCellStyle(contentStyle);
                        dm_first_row = dm_first_row + len_dm + 1;
                        chengshijishu++;
                        jishu = 0;
                    } else {
                        CellRangeAddress dm_cell = new CellRangeAddress(dm_first_row, dm_first_row + len_dm - 1, 1, 1);
                        CellRangeAddress hj_cell = new CellRangeAddress(dm_first_row, dm_first_row + len_dm - 1, 10, 10);
                        sheet.addMergedRegion(dm_cell);
                        sheet.addMergedRegion(hj_cell);
                        RegionUtil.setBorderBottom(CellStyle.BORDER_THIN, dm_cell, sheet); // 下边框
                        RegionUtil.setBorderLeft(CellStyle.BORDER_THIN, dm_cell, sheet); // 左边框
                        RegionUtil.setBorderRight(CellStyle.BORDER_THIN, dm_cell, sheet); // 有边框
                        RegionUtil.setBorderTop(CellStyle.BORDER_THIN, dm_cell, sheet); // 上边框
                        Row thisRow = sheet.getRow(dm_first_row);
                        Cell duanmian = thisRow.getCell(1);
                        duanmian.setCellValue(duanmianList.get(dm_count - 1).toString());
                        duanmian.setCellStyle(cityStyle);
                        Cell heji = thisRow.getCell(10);
                        heji.setCellValue(zongjiList.get(dm_count - 1).toString());
                        heji.setCellStyle(contentStyle);
                        dm_first_row = dm_first_row + len_dm;
                    }
                }
            }
//            Row lastRow = sheet.getRow(sheet.getLastRowNum()+1);
//            System.out.println("lastRowNum");
//            System.out.println(sheet.getLastRowNum()+1);
//            for(int a=0;i<=10;i++){
//                Cell c = lastRow.createCell(a);
//                System.out.println(c.getAddress());
//                c.setCellStyle(lastStyle);
//            }


            ByteArrayOutputStream os = new ByteArrayOutputStream();
            try {
                wb.write(os);
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] content = os.toByteArray();
            InputStream is = new ByteArrayInputStream(content);
            // 设置response参数
            response.reset();
            response.setContentType("application/vnd.ms-excel;charset=utf-8");
            response.setHeader("Content-Disposition", "attachment;filename=" + new String((excelTitle + ".xlsx").getBytes(), "iso-8859-1"));
            ServletOutputStream out = response.getOutputStream();
            BufferedInputStream bis = null;
            BufferedOutputStream bos = null;
            try {
                bis = new BufferedInputStream(is);
                bos = new BufferedOutputStream(out);
                byte[] buff = new byte[2048];
                int bytesRead;
                while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                    bos.write(buff, 0, bytesRead);
                }
            } catch (final IOException e) {
                throw e;
            } finally {
                if (bis != null)
                    bis.close();
                if (bos != null)
                    bos.close();
            }
            System.out.println("导出扣缴补偿资金详表");
            return "excel";
        } else {

//            System.out.println("扣缴及补偿资金合计表");
            String year = request.getParameter("exportnf");
            String sm = request.getParameter("exportsm");
            String em = request.getParameter("exportem");
            String region = request.getParameter("exportreg");
            String userName = (String) request.getSession().getAttribute("userName");
            String excelTitle = year + "年各市各月扣缴补偿资金合计表";
            List<Map<String, Object>> result;
            result = qmpService.selectDmbczjByYearWithMonth_kj(year, sm, em, userName);
            System.out.println(result);
            Workbook wb = new XSSFWorkbook();

            // TODO: 2018/7/21 扣缴及补偿资金合计表
            // 填充表格
            kjbczjhjService.fillTable(wb, year);

            /**
             * -------------------------------------------
             */
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            try {
                wb.write(os);
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] content = os.toByteArray();
            InputStream is = new ByteArrayInputStream(content);
            // 设置response参数
            response.reset();
            response.setContentType("application/vnd.ms-excel;charset=utf-8");
            response.setHeader("Content-Disposition", "attachment;filename=" + new String((excelTitle + ".xlsx").getBytes(), "iso-8859-1"));
            ServletOutputStream out = response.getOutputStream();
            BufferedInputStream bis = null;
            BufferedOutputStream bos = null;
            try {
                bis = new BufferedInputStream(is);
                bos = new BufferedOutputStream(out);
                byte[] buff = new byte[2048];
                int bytesRead;
                while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                    bos.write(buff, 0, bytesRead);
                }
            } catch (final IOException e) {
                throw e;
            } finally {
                if (bis != null)
                    bis.close();
                if (bos != null)
                    bos.close();
            }
            System.out.println("扣缴及补偿资金合计表");

            return "excel";
        }


    }

    public formatResult formatResult_kj(List<Map<String, Object>> result) {
        List<Object> resultList = new ArrayList<Object>();
        String[] title = new String[]{"city", "id", "month", "section_name", "loc_river", "objective_2018", "section_sx", "szlb", "hj_jnzj", "bccs",};
        int length = title.length;
        int count = 0;
        int count_a = 0;
        int dm_count = 1;
        int cs_count = 1;
        int hj_count = 0;
        int dmtj = 0;
        int kje_zongji = 0;
        String temp_section_name = "";
        String temp_city = "";
        String temp_city_a = "";
        List duanmianjishu = new ArrayList();
        List chengshijishu = new ArrayList();
        List zongjiList = new ArrayList();
        List chengshiList = new ArrayList();
        List duanmianList = new ArrayList();
        List zongji2List = new ArrayList();
        List<Map<String, String>> newResult = new ArrayList<Map<String, String>>();
        for (Map<String, Object> item : result) {
            String city = item.get("city").toString();
            String kje = item.get("hj_jnzj").toString();
            if (count_a == 0) {
                kje_zongji += Integer.parseInt(kje);
                temp_city_a = city;
            } else {
                if (temp_city_a.equals(city)) {
                    kje_zongji += Integer.parseInt(kje);
                } else {
                    zongji2List.add(kje_zongji);
                    kje_zongji = Integer.parseInt(kje);
                    temp_city_a = city;
                }
            }
            count_a++;
        }
        zongji2List.add(kje_zongji);
        System.out.println(zongji2List);
        for (Map<String, Object> item : result) {
            String city = item.get("city").toString().replace("市", "");
            String id = Integer.toString(dm_count);
            String month = item.get("month").toString() + "月";
            String dmmc = item.get("section_name").toString();
            String hlmc = item.get("loc_river").toString();
            String khmb = item.get("objective_2018").toString();
            String dmsx = item.get("section_sx").toString();
            String jclb = item.get("szlb").toString();
            String kje = item.get("hj_jnzj").toString();
            String bccs = item.get("section_sx").toString();
            if (count == 0) {
                hj_count += Integer.parseInt(kje);
//                temp_section_name = dmmc;
            } else {
                if (temp_section_name.equals(dmmc)) {
                    hj_count += Integer.parseInt(kje);
                } else {
                    zongjiList.add(hj_count);
                    hj_count = Integer.parseInt(kje);
                }
            }
            if (temp_city.equals(city)) {
                cs_count++;
            } else {
                chengshijishu.add(cs_count);
                chengshiList.add(city);
                temp_city = city;
                cs_count = 1;
                dmtj = 1;
            }
            if (temp_section_name.equals(dmmc)) {
                dm_count++;
            } else {
                duanmianjishu.add(dm_count);
                duanmianList.add(dmtj);
                temp_section_name = dmmc;
                dm_count = 1;
                dmtj++;
            }
            if (bccs.contains("-")) {
                bccs = bccs.split("-")[1];
            } else {
                bccs = "省";
            }
            if (dmsx.contains("-")) {
                dmsx = "跨界";
            } else {
                dmsx = "入河口";
            }
            Map<String, String> newItem = new HashMap<String, String>();
            System.out.println(city);


            newItem.put("city", city);
            newItem.put("id", id);
            newItem.put("month", month);
            newItem.put("dmmc", dmmc);
            newItem.put("hlmc", hlmc);
            newItem.put("khmb", khmb);
            newItem.put("dmsx", dmsx);
            newItem.put("jclb", jclb);
            newItem.put("kje", kje);
            newItem.put("bccs", bccs);
            newResult.add(count, newItem);
            count++;
        }
        chengshijishu.add(cs_count);
        duanmianjishu.add(dm_count);
        zongjiList.add(hj_count);
        zongji2List.add(kje_zongji);
        formatResult new_result = new formatResult();
        new_result.result = newResult;
        new_result.chengshiCount = chengshijishu;
        new_result.zongjiCount = zongjiList;
        new_result.duanmianCount = duanmianjishu;
        new_result.duanmianList = duanmianList;
        new_result.chengshiList = chengshiList;
        new_result.chengshiList = chengshiList;
        new_result.zongji2List = zongji2List;
        System.out.println(zongjiList);
        return new_result;
    }


    @RequestMapping(value = "/exportToExcel", method = RequestMethod.POST, produces = {"application/vnd.ms-excel;charset=UTF-8"})
    @ResponseBody
    public String exportToExcel(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Map<String, Object>> result = (List<Map<String, Object>>) request.getSession().getAttribute("szxzexcel");
        Workbook wb = new XSSFWorkbook();
        //Workbook wb = new XSSFWorkbook();
        CreationHelper createHelper = wb.getCreationHelper();
        Sheet sheet = wb.createSheet("sheet0");
        //第一行，表头
        int i = 1;
        Row row = sheet.createRow(0);
        Cell cell1 = row.createCell(0);
        cell1.setCellValue("断面性质");
        Cell cell2 = row.createCell(1);
        cell2.setCellValue("原考核108");
        Cell cell3 = row.createCell(2);
        cell3.setCellValue("河流水质90");
        Cell cell4 = row.createCell(3);
        cell4.setCellValue("原序号");
        Cell cell5 = row.createCell(4);
        cell5.setCellValue("城市");
        Cell cell6 = row.createCell(5);
        cell6.setCellValue("断面名称");
        Cell cell7 = row.createCell(6);
        cell7.setCellValue("所属流域");
        Cell cell8 = row.createCell(7);
        cell8.setCellValue("所属河流");
        Cell cell9 = row.createCell(8);
        cell9.setCellValue("断面属性");
        Cell cell10 = row.createCell(9);
        cell10.setCellValue("受控水库");
        Cell cell11 = row.createCell(10);
        cell11.setCellValue("2020年目标");
        Cell cell12 = row.createCell(11);
        cell12.setCellValue("2016年目标");
        Cell cell13 = row.createCell(12);
        cell13.setCellValue("2017年目标");
        Cell cell14 = row.createCell(13);
        cell14.setCellValue("2018年目标");
        Cell cell15 = row.createCell(14);
        cell15.setCellValue("1月");
        Cell cell16 = row.createCell(15);
        cell16.setCellValue("2月");
        Cell cell17 = row.createCell(16);
        cell17.setCellValue("3月");
        Cell cell18 = row.createCell(17);
        cell18.setCellValue("4月");
        Cell cell19 = row.createCell(18);
        cell19.setCellValue("5月");
        Cell cell20 = row.createCell(19);
        cell20.setCellValue("6月");
        Cell cell21 = row.createCell(20);
        cell21.setCellValue("7月");
        Cell cell22 = row.createCell(21);
        cell22.setCellValue("8月");
        Cell cell23 = row.createCell(22);
        cell23.setCellValue("9月");
        Cell cell24 = row.createCell(23);
        cell24.setCellValue("10月");
        Cell cell25 = row.createCell(24);
        cell25.setCellValue("11月");
        Cell cell26 = row.createCell(25);
        cell26.setCellValue("12月");
        Cell cell27 = row.createCell(26);
        cell27.setCellValue("2018平均");
        String[] str = new String[]{"section_level", "ykh_108", "hlsz_90", "original_id", "loc_city", "section_name", "basin",
                "river_name", "section_sx", "sksk", "target_2020", "target_2016", "target_2017", "target_2018", "category_info1",
                "category_info2", "category_info3", "category_info4", "category_info5", "category_info6", "category_info7", "category_info8",
                "category_info9", "category_info10", "category_info11", "category_info12", "aver"};
        for (Map<String, Object> map : result) {//每一行
            Row row2 = sheet.createRow(i++);
            for (int k = 0; k < str.length; k++) {//每一列
                Cell cel = row2.createCell(k);
                cel.setCellValue(String.valueOf(map.get(str[k]) == null ? "" : map.get(str[k])));
            }
        }

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            wb.write(os);
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] content = os.toByteArray();
        InputStream is = new ByteArrayInputStream(content);
        // 设置response参数
        response.reset();
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        String fileName = "水质现状报表" + dateString + ".xlsx";
        response.setHeader("Content-Disposition", "attachment;filename=" + new String(fileName.getBytes(), "iso-8859-1"));
        ServletOutputStream out = response.getOutputStream();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(out);
            byte[] buff = new byte[2048];
            int bytesRead;
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        } catch (final IOException e) {
            throw e;
        } finally {
            if (bis != null)
                bis.close();
            if (bos != null)
                bos.close();
        }
        System.out.println("导出excel");
        return "excel";
    }

    @RequestMapping(value = "/exportToExcelCbyz", method = RequestMethod.POST, produces = {"application/vnd.ms-excel;charset=UTF-8"})
    @ResponseBody
    public String exportToExcelCbyz(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Map<String, String>> result = (List<Map<String, String>>) request.getSession().getAttribute("cbyzexcel");
        String year = request.getParameter("exportnf");
        String excelTitle = year + "年" + "断面超标因子月现状水质数据累计表";
        ;
        Workbook wb = new XSSFWorkbook();
        XSSFCellStyle warpContentStyle = (XSSFCellStyle) wb.createCellStyle();
        XSSFCellStyle titleStyle = (XSSFCellStyle) wb.createCellStyle();
        XSSFCellStyle contentStyle = (XSSFCellStyle) wb.createCellStyle();
        Font titleFont = wb.createFont();
        Font contentFont = wb.createFont();
        Font warpContentFont = wb.createFont();

        titleFont.setFontName("宋体");
        titleFont.setBold(true);
        titleFont.setFontHeightInPoints((short) 11);
        titleStyle.setFont(titleFont);
        titleStyle.setBorderBottom(CellStyle.BORDER_THIN);
        titleStyle.setBorderTop(CellStyle.BORDER_THIN);
        titleStyle.setBorderLeft(CellStyle.BORDER_THIN);
        titleStyle.setBorderRight(CellStyle.BORDER_THIN);
        titleStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
        titleStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);

        contentFont.setFontName("宋体");
        contentFont.setFontHeightInPoints((short) 10);
        contentStyle.setFont(contentFont);
        contentStyle.setBorderBottom(CellStyle.BORDER_THIN);
        contentStyle.setBorderTop(CellStyle.BORDER_THIN);
        contentStyle.setBorderLeft(CellStyle.BORDER_THIN);
        contentStyle.setBorderRight(CellStyle.BORDER_THIN);
        contentStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
        contentStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
        contentStyle.setWrapText(true);

        warpContentFont.setFontName("宋体");
        warpContentFont.setFontHeightInPoints((short) 10);
        warpContentStyle.setFont(warpContentFont);
        warpContentStyle.setBorderBottom(CellStyle.BORDER_THIN);
        warpContentStyle.setBorderTop(CellStyle.BORDER_THIN);
        warpContentStyle.setBorderLeft(CellStyle.BORDER_THIN);
        warpContentStyle.setBorderRight(CellStyle.BORDER_THIN);
        warpContentStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
        warpContentStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
        warpContentStyle.setWrapText(true);
        CreationHelper createHelper = wb.getCreationHelper();
        Sheet sheet = wb.createSheet("sheet0");
        //合并单元格
        CellRangeAddress cra = new CellRangeAddress(0, 0, 0, 25);
        sheet.addMergedRegion(cra);
        RegionUtil.setBorderBottom(CellStyle.BORDER_THIN, cra, sheet); // 下边框
        RegionUtil.setBorderLeft(CellStyle.BORDER_THIN, cra, sheet); // 左边框
        RegionUtil.setBorderRight(CellStyle.BORDER_THIN, cra, sheet); // 有边框
        RegionUtil.setBorderTop(CellStyle.BORDER_THIN, cra, sheet); // 上边框

        for (int i = 0; i < 8; i++) {
            CellRangeAddress cra1 = new CellRangeAddress(1, 2, i, i);
            sheet.addMergedRegion(cra1);
            RegionUtil.setBorderBottom(CellStyle.BORDER_THIN, cra1, sheet); // 下边框
            RegionUtil.setBorderLeft(CellStyle.BORDER_THIN, cra1, sheet); // 左边框
            RegionUtil.setBorderRight(CellStyle.BORDER_THIN, cra1, sheet); // 有边框
            RegionUtil.setBorderTop(CellStyle.BORDER_THIN, cra1, sheet); // 上边框
        }
        for (int i = 8; i < 26; i += 2) {
            CellRangeAddress cra2 = new CellRangeAddress(1, 1, i, i + 1);
            sheet.addMergedRegion(cra2);
            RegionUtil.setBorderBottom(CellStyle.BORDER_THIN, cra2, sheet); // 下边框
            RegionUtil.setBorderLeft(CellStyle.BORDER_THIN, cra2, sheet); // 左边框
            RegionUtil.setBorderRight(CellStyle.BORDER_THIN, cra2, sheet); // 有边框
            RegionUtil.setBorderTop(CellStyle.BORDER_THIN, cra2, sheet); // 上边框
        }

        //第一行，标题
        int i = 3;


        Row row = sheet.getRow(0);
        Cell cell0 = row.createCell(0);
        cell0.setCellValue(excelTitle);
        int num = 0;
        for (Cell cel : row) {
            cel.setCellStyle(titleStyle);

        }

        //表头
        Row row1 = sheet.getRow(1);
        Cell cell1 = row1.getCell(0);
        cell1.setCellValue("城市");
        Cell cell2 = row1.createCell(1);
        cell2.setCellValue("序号");


        Cell cell3 = row1.createCell(2);
        cell3.setCellValue("月份");

        Cell cell4 = row1.createCell(3);
        cell4.setCellValue("断面名称");


        Cell cell5 = row1.createCell(4);
        cell5.setCellValue("所属河流");


        Cell cell6 = row1.createCell(5);
        cell6.setCellValue("目标");


        Cell cell7 = row1.createCell(6);
        cell7.setCellValue("水质类别");


        Cell cell8 = row1.createCell(7);
        cell8.setCellValue("超标指标");


        Cell cell9 = row1.createCell(8);
        cell9.setCellValue("高锰酸盐指数（mg/L)");


        Cell cell10 = row1.createCell(10);
        cell10.setCellValue("化学需氧量（mg/L)");
        Cell cell11 = row1.createCell(12);
        cell11.setCellValue("氨氮（mg/L)");
        Cell cell12 = row1.createCell(14);
        cell12.setCellValue("总磷（mg/L)");
        Cell cell13 = row1.createCell(16);
        cell13.setCellValue("生化需氧量（mg/L)");
        Cell cell14 = row1.createCell(18);
        cell14.setCellValue("氟化物（mg/L)");
        Cell cell15 = row1.createCell(20);
        cell15.setCellValue("挥发酚（mg/L)");
        Cell cell16 = row1.createCell(22);
        cell16.setCellValue("石油类（mg/L)");
        Cell cell17 = row1.createCell(24);
        cell17.setCellValue("阴离子表面活性剂（mg/L)");


        Row row2 = sheet.getRow(2);
        Cell cell18 = row2.createCell(8);
        cell18.setCellValue("现状值");
        Cell cell19 = row2.createCell(9);
        cell19.setCellValue("累加值");
        Cell cell20 = row2.createCell(10);
        cell20.setCellValue("现状值");
        Cell cell21 = row2.createCell(11);
        cell21.setCellValue("累加值");
        Cell cell22 = row2.createCell(12);
        cell22.setCellValue("现状值");
        Cell cell23 = row2.createCell(13);
        cell23.setCellValue("累加值");
        Cell cell24 = row2.createCell(14);
        cell24.setCellValue("现状值");
        Cell cell25 = row2.createCell(15);
        cell25.setCellValue("累加值");
        Cell cell26 = row2.createCell(16);
        cell26.setCellValue("现状值");
        Cell cell27 = row2.createCell(17);
        cell27.setCellValue("累加值");
        Cell cell28 = row2.createCell(18);
        cell28.setCellValue("现状值");
        Cell cell29 = row2.createCell(19);
        cell29.setCellValue("累加值");
        Cell cell30 = row2.createCell(20);
        cell30.setCellValue("现状值");
        Cell cell31 = row2.createCell(21);
        cell31.setCellValue("累加值");
        Cell cell32 = row2.createCell(22);
        cell32.setCellValue("现状值");
        Cell cell33 = row2.createCell(23);
        cell33.setCellValue("累加值");
        Cell cell34 = row2.createCell(24);
        cell34.setCellValue("现状值");
        Cell cell35 = row2.createCell(25);
        cell35.setCellValue("累加值");
        for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
            Row rowLine = sheet.getRow(rowNum);
            int count = 0;
            if (rowLine != null) {
                for (Cell cel : rowLine) {
                    System.out.println("count");
                    System.out.println(count);
                    cel.setCellStyle(titleStyle);
                    count++;
                }
            }

        }
        String[] str = new String[]{"loc_city", "num", "month", "section_name", "river_name", "quality_target", "category_info", "cbxm",
                "cod_mn", "cod_mn_add", "cod_cr", "cod_cr_add", "nh_n", "nh_n_add", "t_p", "t_p_add",
                "bod5", "bod5_add", "f_", "f__add", "hff", "hff_add", "syl",
                "syl_add", "las", "las_add"};
        for (Map<String, String> map : result) {//每一行
            Row row3 = sheet.createRow(i++);
            for (int k = 0; k < str.length; k++) {//每一列

                Cell cel = row3.createCell(k);
                String value = String.valueOf(map.get(str[k]));
                cel.setCellValue(value);
            }
        }
        if (sheet.getLastRowNum() > 3) {//获取最后一行行标，比行数小  满足合并的条件，3是数据行的开始，0 1 2行为表头
            Row row_1 = sheet.getRow(3);
            Cell cell_0 = row_1.getCell(0);
            Cell cell_1 = row_1.getCell(1);


            String city_name = cell_0.getStringCellValue();
            String num1 = cell_1.getStringCellValue();


            for (int j = 4; j <= sheet.getLastRowNum(); j++) {//除第一个外，循环将内容相同的单元格设为""，这里体现出为什么原数据要有序
                Row rows = sheet.getRow(j);
                //此处表示对4个单元格进行内容相同合并处理
                Cell cells_0 = rows.getCell(0);
                Cell cells_1 = rows.getCell(1);

                if (city_name.equals(cells_0.getStringCellValue())) {
                    cells_0.setCellValue("");
                } else {
                    city_name = cells_0.getStringCellValue();
                }

                if (num1.equals(cells_1.getStringCellValue())) {
                    cells_1.setCellValue("");
                } else {
                    num1 = cells_1.getStringCellValue();
                }

            }
        }
        int sk;
        if (sheet.getLastRowNum() > 3) {//将为空的单元格与之前不为空的合并
            sk = 3;
            for (int j = 4; j <= sheet.getLastRowNum(); j++) {
                Row rows = sheet.getRow(j);
                Cell cell_0 = rows.getCell(0);
                if (cell_0.getStringCellValue() == "") {
                    if (j == sheet.getLastRowNum()) {
                        sheet.addMergedRegion(new CellRangeAddress(sk, j, 0, 0));
                    }
                } else {
                    if (sk != j - 1) {
                        sheet.addMergedRegion(new CellRangeAddress(sk, j - 1, 0, 0));//起始行号，终止行号， 起始列号，终止列号
                    }
                    sk = j;
                }
            }
            sk = 3;
            for (int j = 4; j <= sheet.getLastRowNum(); j++) {
                Row rows = sheet.getRow(j);
                Cell cell_1 = rows.getCell(1);
                if (cell_1.getStringCellValue() == "") {
                    if (j == sheet.getLastRowNum()) {
                        sheet.addMergedRegion(new CellRangeAddress(sk, j, 1, 1));
                    }
                } else {
                    if (sk != j - 1) {
                        sheet.addMergedRegion(new CellRangeAddress(sk, j - 1, 1, 1));//起始行号，终止行号， 起始列号，终止列号
                    }
                    sk = j;
                }
            }
        }
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            wb.write(os);
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] content = os.toByteArray();
        InputStream is = new ByteArrayInputStream(content);
        // 设置response参数
        response.reset();
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        String fileName = excelTitle + dateString + ".xlsx";
        response.setHeader("Content-Disposition", "attachment;filename=" + new String(fileName.getBytes(), "iso-8859-1"));
        ServletOutputStream out = response.getOutputStream();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(out);
            byte[] buff = new byte[2048];
            int bytesRead;
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        } catch (final IOException e) {
            throw e;
        } finally {
            if (bis != null)
                bis.close();
            if (bos != null)
                bos.close();
        }
        System.out.println("导出excel");
        return "excel";
    }

    /**
     * 生成断面罚金通知qmp/qmpBczjtz单
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/get_bczjtz", method = RequestMethod.POST)
    public String get_bczjtz(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String region = request.getParameter("region");
        String month = request.getParameter("month");
        String year = request.getParameter("year");
        StringBuffer content = new StringBuffer();
        StringBuffer dms = new StringBuffer();
//        List<Map<String, String>> badDms = getResult1(request, region, year, month);
        String sql = "select*from dmbczj where city like '%" + region + "%' and month='" + month + "' and year='" + year + "' and cbxm!=''";
        List<Map<String, Object>> badDms = jdbcTemplate.queryForList(sql);
        if (badDms.size() == 0) {
            return "redirect:/?name=qmpBczjtz";
        }
        int money_total = 0;
        for (Map<String, Object> badDm : badDms) {
            String cbxm = String.valueOf(badDm.get("cbxm"));
            String szlb = String.valueOf(badDm.get("szlb"));
            String year_target = String.valueOf(badDm.get("objective_2018"));
            int howmuch = getNum(szlb, year_target);
            String[] split = cbxm.split(",");
            cbxm = cbxm.replace("(", "超标");
            cbxm = cbxm.replace(")", "倍");
            szlb = szlb.replace("（氨氮3）", "");
            szlb = szlb.replace("（氨氮4）", "");
            szlb = szlb.replace("（氨氮5）", "");
            year_target = year_target.replace("（氨氮3）", "");
            year_target = year_target.replace("（氨氮4）", "");
            year_target = year_target.replace("（氨氮5）", "");
            content.append(badDm.get("section_name")).append("断面为").append(szlb).append("类,")
                    .append("超考核目标").append(year_target).append("类").append(formatInteger(String.valueOf(howmuch))).append("个类别,").append("其中")
                    .append(cbxm).append(";");
            dms.append(badDm.get("section_name")).append("断面缴纳补偿资金").append(badDm.get("hj_jnzj")).append("万元,");
            money_total += Integer.valueOf(String.valueOf(badDm.get("hj_jnzj")));
        }
        StringBuilder money_total_str = new StringBuilder();
        if (badDms.size() > 1) {
            money_total_str.append(",合计").append(money_total).append("万元");
        }
        content.replace(content.lastIndexOf(";"), content.lastIndexOf(";") + 1, "");
        dms.replace(dms.lastIndexOf(","), dms.lastIndexOf(",") + 1, "");

        StringBuilder bccs = new StringBuilder();
        StringBuilder bcsl = new StringBuilder();
        //补偿数据
        //List<Map<String, Object>> bcsj_all = jdbcTemplate.queryForList("select bcxy_jnzj,bccs_jnzj,bcsl_jnzj from dmbczj where month=? and year=? and city like ? and cbxm!=''", month, year, "%" + region + "%");
        List<Map<String, Object>> bcsj_all = jdbcTemplate.queryForList("SELECT sum(a.bcxy_jnzj) bcxy_jnzj,\n" +
                "       a.bccs_jnzj,\n" +
                "       a.bcsl_jnzj\n" +
                "  FROM (select bcxy_jnzj, bccs_jnzj, bcsl_jnzj\n" +
                "          from dmbczj\n" +
                "         where month = ?\n" +
                "           and year = ?\n" +
                "           and city like ?\n" +
                "           and cbxm != '') a\n" +
                " GROUP by bccs_jnzj, bcsl_jnzj", month, year, "%" + region + "%");//jmc改，之前无法查到城市相同时的总和金额
        int bcsl_total = 0;
        for (Map<String, Object> bcsj : bcsj_all) {
            //补偿市里的资金
            System.out.println(bcsj.get("bcxy_jnzj"));
            String bcxy_jnzj = String.valueOf(bcsj.get("bcxy_jnzj"));
            if(bcxy_jnzj.indexOf(".") > 0){
                bcxy_jnzj = bcxy_jnzj.replaceAll("0+?$", "");//去掉多余的0
                bcxy_jnzj = bcxy_jnzj.replaceAll("[.]$", "");//如最后一位是.则去掉
            }
            //补偿市名称
            String bccs_jnzj = (String) bcsj.get("bccs_jnzj");
            //补偿省里资金
            String bcsl_jnzj = (String) bcsj.get("bcsl_jnzj");
            //补偿城市不为空,且补偿市里资金不为0
            if ((bccs_jnzj != null) && !bccs_jnzj.trim().equals("") && !(bcxy_jnzj.equals('0'))) {
                bccs.append("将").append(bcxy_jnzj).append("万元支付").append(bccs_jnzj).append("市,");
            }
            //补偿省里不为空时
            if ((bcsl_jnzj != null) && !bcsl_jnzj.trim().equals("")) {
                bcsl_total += Integer.parseInt(bcsl_jnzj.trim());
            }
        }
        if (bcsl_total != 0) {
            bcsl.append("将").append(bcsl_total).append("万元上交省财政厅，");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("year", year);
        map.put("city", region+"市");
        map.put("year0", year);
        map.put("month", month);
        map.put("content", content.toString());
        map.put("dms", dms.toString());
        map.put("money_total", money_total_str.toString());
        map.put("bccs", bccs.toString());
        map.put("bcsl", bcsl.toString());
        Calendar calendar = Calendar.getInstance();
        int year_now = calendar.get(Calendar.YEAR);
        String year_now1 = year_now + "";
        int month_now = calendar.get(Calendar.MONTH) + 1;
        int day_now = calendar.get(Calendar.DAY_OF_MONTH);
        map.put("year1", year_now1);
        map.put("month1", month_now);
        map.put("day1", day_now);
        map.put("year2", year_now1);
        map.put("month2", month_now);
        map.put("day2", day_now);
        map.put("city2",region+"市");

        // 提示：在调用工具类生成Word文档之前应当检查所有字段是否完整
        // 否则Freemarker的模板殷勤在处理时可能会因为找不到值而报错 这里暂时忽略这个步骤了
        File file = null;
        InputStream fin = null;
        ServletOutputStream out = null;
        BufferedOutputStream bos = null;
        file = DocUtil.createDoc(map, "resume", region);
//        request.getSession().setAttribute("bczjtz", file.getAbsolutePath());
        String originname = file.getName();
        originname = originname.substring(originname.indexOf("-"), originname.indexOf("."));
        HttpHeaders headers = new HttpHeaders();
        String filename = "补偿资金通知单" + originname;
//        headers.setContentDispositionFormData("attachment", new String(filename.getBytes("UTF-8"), "ISO-8859-1") + ".doc");
//        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
//        ResponseEntity<byte[]> re = new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
//        file.delete();

        response.reset();
        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(filename + ".doc", "UTF-8"));
        response.setHeader("Connection", "close");
        response.setHeader("Content-Type", "application/octet-stream");
        OutputStream ops = null;
        FileInputStream fis = null;
        byte[] buffer = new byte[8192];
        int bytesRead = 0;
        try {
            ops = response.getOutputStream();
            fis = new FileInputStream(file.getAbsolutePath());
            while ((bytesRead = fis.read(buffer, 0, 8192)) != -1) {
                ops.write(buffer, 0, bytesRead);
            }
            ops.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (ops != null) {
                    ops.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            file.delete();
        }
        return null;
    }

    /**
     * 计算水质超年度标准的数量
     *
     * @param szlb        水质类别
     * @param year_target 年度目标
     * @return
     */
    private int getNum(String szlb, String year_target) {
        int szlb_num = convertLevel(szlb);
        int year_tar = convertLevel(year_target);
        return szlb_num - year_tar;
    }

    private String formatInteger(String string) {
        String[] s1 = {"零", "一", "两", "三", "四", "五", "六", "七", "八", "九"};
        String[] s2 = {"十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千"};
        StringBuilder result = new StringBuilder();
        int n = string.length();
        for (int i = 0; i < n; i++) {
            int num = string.charAt(i) - '0';
            if (i != n - 1 && num != 0) {
                result.append(s1[num]).append(s2[n - 2 - i]);
            } else {
                result.append(s1[num]);
            }
        }
        System.out.println(result);
        return result.toString();
    }

    /**
     * 断面补偿资金通知
     */
    public List<Map<String, String>> getResult1(HttpServletRequest request, String qysx, String nf, String month) {

        calcAll();
        String userName = (String) request.getSession().getAttribute("userName");
        List<Map<String, String>> allList = null;
        List<Map<String, String>> allListPrese = new ArrayList<Map<String, String>>();
        Map<String, String> tempItem = null;
        allList = qmpService.selectDmbczjByYearAndMonth(qysx, nf, month, userName);
        String content;
        for (Map<String, String> item : allList) {
            tempItem = item;
            System.out.println(item);
            System.out.println(item.get("cbxm"));
            if (item.get("cbxm").equals("")) {
                continue;
            } else {
                allListPrese.add(tempItem);
            }
        }
        return allListPrese;
    }


    /**
     * 生成水质数据累计报表
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/count_cbyz", method = RequestMethod.POST)
    public ModelAndView count_cbyz(HttpServletRequest request, HttpServletResponse response, ModelAndView model) {
        String region = request.getParameter("region");
        String year = request.getParameter("year");
        String start_m = request.getParameter("start_m");
        String end_m = request.getParameter("end_m");
        String level = request.getParameter("level"); //  86/24/7/all
        Map<String, String> last = (Map<String, String>) request.getSession().getAttribute("last_count");
//    if (last != null) {
//      if (region.equals(last.get("region")) && year.equals(last.get("year")) && start_m.equals(last.get("start_m")) && end_m.equals(last.get("end_m"))) {
//        model.addObject("result", request.getSession().getAttribute("szxzexcel"));
//        model.setViewName("qmp/qmpSzxz_S");
//        return model;
//      }
//    }
        Map<String, String> last_count = new HashMap<>();
        last_count.put("region", region);
        last_count.put("year", year);
        last_count.put("start_m", start_m);
        last_count.put("end_m", end_m);

        List<Map<String, String>> result = new ArrayList<>();
        if ("all".equals(region)) {//该用户下辖所有市
            List<String> regions = getRegions(request.getSession().getAttribute("userName").toString());
            for (String reg : regions) {//遍历下辖市
                getRegionDmCbyzResults(year, start_m, end_m, result, reg, level);
            }
        } else {//指定市
            getRegionDmCbyzResults(year, start_m, end_m, result, region, level);
        }
        /*Collections.sort(result, new Comparator<Map<String, String>>() {//将result按正序排序
            @Override
            public int compare(Map<String, String> o1, Map<String, String> o2) {
                return Integer.valueOf(o1.get("original_id")) - Integer.valueOf(o2.get("original_id"));
            }
        });*/
        model.addObject("result", result);
        request.getSession().setAttribute("cbyzexcel", result);
        request.getSession().setAttribute("last_count", last_count);
        model.setViewName("qmp/qmpCbyz_S");
        return model;
    }

    /**
     * 获取市级下断面水质数据累计现状
     *
     * @param year
     * @param start_m
     * @param end_m
     * @param result
     * @param reg     辖域名
     */
    private void getRegionDmCbyzResults(String year, String start_m, String
            end_m, List<Map<String, String>> result, String reg, String level) {
        Map<String, String> map = new HashMap<>();
        map.put("loc_city", reg);
        map.put("level", level);
        List<String> dMs = qmpService.getDMs(map);//市下辖断面 qmp_quality_target_info表
        String month_sql = "select Max(month) month from qmp_test_data";
        int monthMax = 1;
        try {
            monthMax = jdbcTemplate.queryForObject(month_sql, Integer.class);//实测数据月份
        } catch (Exception e) {
            System.out.println("month error!");
        }
        int num = 0;
        for (String dm : dMs) {
            String quality_sql = "select quality_target from qmp_year_water_target where section_name='" +
                    dm + "' and year='" + year + "'";
            String quality_target = "";
            try {
                quality_target = jdbcTemplate.queryForObject(quality_sql, String.class);//水质年度目标
            } catch (Exception e) {//没有水质年度目标,此断面计算无意义
                continue;
            }
            Map<String, String> dmPartBasInfos = qmpService.getDmPartBasInfos(dm);
            num += 1;
            if (!start_m.equals(end_m)) {//起止月份不同
                int start = Integer.valueOf(start_m);
                int end = Integer.valueOf(end_m);
                //getTargets(dm, dmquality_targetInfos); //qmp_year_water_target 表
                for (int i = start; i <= end; i++) {//遍历月份
                    if (i > monthMax)
                        break;
                    Map<String, String> dmBasInfos = new HashMap<String, String>();
                    dmBasInfos.put("num", num + "");
                    dmBasInfos.put("month", i + "");
                    dmBasInfos.put("loc_city", dmPartBasInfos.get("loc_city"));
                    dmBasInfos.put("section_level", dmPartBasInfos.get("section_level"));
                    dmBasInfos.put("section_name", dmPartBasInfos.get("section_name"));
                    dmBasInfos.put("river_name", dmPartBasInfos.get("river_name"));
                    dmBasInfos.put("quality_target", quality_target);
                    /*Map<String, String> category_info = countCategory(dm, i, year, quality_target); //qmp_quality_target_info qmp_test_data szzbbz
                    if (category_info.get("dmcategory") == null) {
                        dmBasInfos.put("category_info", "");
                    } else {
                        dmBasInfos.put("category_info", category_info.get("dmcategory"));
                    }*/
                    String category_sql = "select category_info" + i + " from qmp_test_data_result where section_name='" + dm + "' and year='" + year + "'";
                    // System.out.println(category_sql);
                    String dmcategory = "";
                    try {
                        dmcategory = jdbcTemplate.queryForObject(category_sql, String.class);
                    } catch (Exception e) {
                        System.out.println("category为空");
                        ;
                    }
                    dmBasInfos.put("category_info", dmcategory);
                    /*String cbxm_sql = "select cbxm from dmbczj where section_name='" +
                            dm + "' and year='" + year + "'" + " and month='" + i + "'";
                    //System.out.println(cbxm_sql);
                    String cbxm = "";
                    try {
                        cbxm = jdbcTemplate.queryForObject(cbxm_sql, String.class);
                    } catch (Exception e) {
                        System.out.println("cbxm为空");;
                    }
                    dmBasInfos.put("cbxm",cbxm);*/
                    Map<String, String> cbyz_info = getBadZb(String.valueOf(i), year, dm);
                    String cbzy = "";
                    for (String key : cbyz_info.keySet()) {//遍历map的键
                        switch (key) {
                            case "ph":
                                cbzy += "pH值，";
                                continue;
                            case "rjy":
                                cbzy += "溶解氧，";
                                continue;
                            case "cod_mn":
                                cbzy += "高锰酸盐指数，";
                                continue;
                            case "cod_cr":
                                cbzy += "化学需氧量，";
                                continue;
                            case "nh_n":
                                cbzy += "氨氮，";
                                continue;
                            case "t_p":
                                cbzy += "总磷，";
                                continue;
                            case "cu":
                                cbzy += "铜，";
                                continue;
                            case "zn":
                                cbzy += "锌，";
                                continue;
                            case "pb":
                                cbzy += "铅，";
                                continue;
                            case "cd":
                                cbzy += "镉，";
                                continue;
                            case "bod5":
                                cbzy += "生化需氧量，";
                                continue;
                            case "t_as":
                                cbzy += "砷，";
                                continue;
                            case "t_se":
                                cbzy += "硒，";
                                continue;
                            case "t_hg":
                                cbzy += "汞，";
                                continue;
                            case "cr_6":
                                cbzy += "六价铬，";
                                continue;
                            case "f_":
                                cbzy += "氟化物，";
                                continue;
                            case "cn_":
                                cbzy += "氰化物，";
                                continue;
                            case "hff":
                                cbzy += "挥发酚，";
                                continue;
                            case "syl":
                                cbzy += "石油类，";
                                continue;
                            case "las":
                                cbzy += "阴离子表面活性剂，";
                                continue;
                            case "s2_":
                                cbzy += "硫化物，";
                                continue;
                        }
                    }
                    if (cbzy.length() != 0) {
                        cbzy = cbzy.substring(0, cbzy.length() - 1);
                    }
                    dmBasInfos.put("cbxm", cbzy);
                    getAddValue(String.valueOf(i), year, dm, dmBasInfos);
                    result.add(dmBasInfos);
                }


            } else {
                Map<String, String> dmBasInfos = new HashMap<String, String>();
                dmBasInfos.put("num", num + "");
                dmBasInfos.put("month", start_m);
                dmBasInfos.put("section_name", dmPartBasInfos.get("section_name"));
                dmBasInfos.put("loc_city", dmPartBasInfos.get("loc_city"));
                dmBasInfos.put("section_level", dmPartBasInfos.get("section_level"));
                dmBasInfos.put("river_name", dmPartBasInfos.get("river_name"));
                dmBasInfos.put("quality_target", quality_target);
                /*Map<String, String> category_info = countCategory(dm, Integer.valueOf(start_m), year, quality_target); //qmp_quality_target_info qmp_test_data szzbbz
                dmBasInfos.put("category_info" + start_m, category_info.get("dmcategory"));*/
                String category_sql = "select category_info" + start_m + " from qmp_test_data_result where section_name='" + dm + "' and year='" + year + "'";
                // System.out.println(category_sql);
                String dmcategory = "";
                try {
                    dmcategory = jdbcTemplate.queryForObject(category_sql, String.class);
                } catch (Exception e) {
                    System.out.println("category为空");
                    ;
                }
                dmBasInfos.put("category_info", dmcategory);
                Map<String, String> cbyz_info = getBadZb(start_m, year, dm);
                String cbzy = "";
                for (String key : cbyz_info.keySet()) {//遍历map的键
                    switch (key) {
                        case "rjy":
                            cbzy += "溶解氧，";
                            continue;
                        case "cod_mn":
                            cbzy += "高锰酸盐指数，";
                            continue;
                        case "cod_cr":
                            cbzy += "化学需氧量，";
                            continue;
                        case "nh_n":
                            cbzy += "氨氮，";
                            continue;
                        case "t_p":
                            cbzy += "总磷，";
                            continue;
                        case "cu":
                            cbzy += "铜，";
                            continue;
                        case "zn":
                            cbzy += "锌，";
                            continue;
                        case "pb":
                            cbzy += "铅，";
                            continue;
                        case "cd":
                            cbzy += "镉，";
                            continue;
                        case "bod5":
                            cbzy += "生化需氧量，";
                            continue;
                        case "t_as":
                            cbzy += "砷，";
                            continue;
                        case "t_se":
                            cbzy += "硒，";
                            continue;
                        case "t_hg":
                            cbzy += "汞，";
                            continue;
                        case "cr_6":
                            cbzy += "六价铬，";
                            continue;
                        case "f_":
                            cbzy += "氟化物，";
                            continue;
                        case "cn_":
                            cbzy += "氰化物，";
                            continue;
                        case "hff":
                            cbzy += "挥发酚，";
                            continue;
                        case "syl":
                            cbzy += "石油类，";
                            continue;
                        case "las":
                            cbzy += "阴离子表面活性剂，";
                            continue;
                        case "s2_":
                            cbzy += "硫化物，";
                            continue;
                    }
                }
                if (cbzy.length() != 0) {
                    cbzy = cbzy.substring(0, cbzy.length() - 1);
                }
                dmBasInfos.put("cbxm", cbzy);
                getAddValue(start_m, year, dm, dmBasInfos);
                result.add(dmBasInfos);
            }

        }
    }

    /**
     * 计算某月超标因子累加和
     *
     * @param month 月份
     * @param year  年份
     * @param dm    断面名称
     */
    private String getAddValue(String month, String year, String dm, Map<String, String> dmBasInfos) {
        Map<String, String> dmCbyzInfos = qmpService.getCbyzInfos(dm, year, month);
        Map<String, String> dmCbyzAddInfos = qmpService.getCbyzAddInfos(dm, year, month);
        System.out.println(dmCbyzInfos);
        if (dmCbyzInfos == null || dmCbyzInfos.size() < 1) {
            dmBasInfos.put("cod_mn", "0.0");//此处报错，若dmCbyzInfos为空时，无法put插入
            dmBasInfos.put("cod_cr", "0.0");
            dmBasInfos.put("nh_n", "0.0");
            dmBasInfos.put("t_p", "0.0");
            dmBasInfos.put("bod5", "0.0");
            dmBasInfos.put("f_", "0.0");
            dmBasInfos.put("hff", "0.0");
            dmBasInfos.put("syl", "0.0");
            dmBasInfos.put("las", "0.0");
        } else {
            dmBasInfos.put("cod_mn", dmCbyzInfos.get("cod_mn"));//此处报错，若dmCbyzInfos为空时，无法put插入
            dmBasInfos.put("cod_cr", dmCbyzInfos.get("cod_cr"));
            dmBasInfos.put("nh_n", dmCbyzInfos.get("nh_n"));
            dmBasInfos.put("t_p", dmCbyzInfos.get("t_p"));
            dmBasInfos.put("bod5", dmCbyzInfos.get("bod5"));
            dmBasInfos.put("f_", dmCbyzInfos.get("f_"));
            dmBasInfos.put("hff", dmCbyzInfos.get("hff"));
            dmBasInfos.put("syl", dmCbyzInfos.get("syl"));
            dmBasInfos.put("las", dmCbyzInfos.get("las"));
        }
        if (dmCbyzAddInfos == null || dmCbyzAddInfos.size() < 1) {
            dmBasInfos.put("cod_mn_add", "0.0");
            dmBasInfos.put("cod_cr_add", "0.0");
            dmBasInfos.put("nh_n_add", "0.0");
            dmBasInfos.put("t_p_add", "0.0");
            dmBasInfos.put("bod5_add", "0.0");
            dmBasInfos.put("f__add", "0.0");
            dmBasInfos.put("hff_add", "0.0");
            dmBasInfos.put("syl_add", "0.0");
            dmBasInfos.put("las_add", "0.0");
        } else {
            dmBasInfos.put("cod_mn_add", dmCbyzAddInfos.get("cod_mn_add"));
            dmBasInfos.put("cod_cr_add", dmCbyzAddInfos.get("cod_cr_add"));
            dmBasInfos.put("nh_n_add", dmCbyzAddInfos.get("nh_n_add"));
            dmBasInfos.put("t_p_add", dmCbyzAddInfos.get("t_p_add"));
            dmBasInfos.put("bod5_add", dmCbyzAddInfos.get("bod5_add"));
            dmBasInfos.put("f__add", dmCbyzAddInfos.get("f__add"));
            dmBasInfos.put("hff_add", dmCbyzAddInfos.get("hff_add"));
            dmBasInfos.put("syl_add", dmCbyzAddInfos.get("syl_add"));
            dmBasInfos.put("las_add", dmCbyzAddInfos.get("las_add"));
        }
        return "";
    }


    /**
     * 生成水质现状报表
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/count_szxz", method = RequestMethod.POST)
    public ModelAndView count_szxz(HttpServletRequest request, HttpServletResponse response, ModelAndView model) throws Exception {
        String region = request.getParameter("region");
        final String year = request.getParameter("year");
        String start_m = request.getParameter("start_m");
        String end_m = request.getParameter("end_m");
        String level = request.getParameter("level"); //  86/24/7/all

        final List<Map<String, String>> result = new ArrayList<>();
        //检查qmp_test_data_result是否为空
        Integer rowcount = jdbcTemplate.queryForObject("select count(*) from qmp_test_data_result where year=?", Integer.class, year);
        if (rowcount == 0) {//空表示该表无数据，需要重新计算
            System.out.println("重新计算");
            List<String> regions = getRegions("liaoning");//计算出辽宁下所有城市
            for (String reg : regions) {//遍历下辖市
                getRegionDmResults(year, "1", "12", result, reg, level);
            }
            if (result.size() == 0) {
                model.setViewName("qmp/qmpSzxz_S");
            }
            String sql1 = "insert into qmp_test_data_result(section_level,ykh_108,hlsz_90,original_id,loc_city," +
                    "section_name,basin,river_name,section_sx,sksk,target_2020,target_2016,target_2017,target_2018," +
                    "category_info1,category_info2,category_info3,category_info4,category_info5,category_info6,category_info7," +
                    "category_info8,category_info9,category_info10,category_info11,category_info12,aver,year) " +
                    "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            jdbcTemplate.batchUpdate(sql1, new BatchPreparedStatementSetter() {//批量插入
                @Override
                public void setValues(PreparedStatement ps, int i) throws SQLException {
                    ps.setString(1, result.get(i).get("section_level"));
                    ps.setString(2, result.get(i).get("ykh_108"));
                    ps.setString(3, result.get(i).get("hlsz_90"));
                    ps.setString(4, result.get(i).get("original_id"));
                    ps.setString(5, result.get(i).get("loc_city"));
                    ps.setString(6, result.get(i).get("section_name"));
                    ps.setString(7, result.get(i).get("basin"));
                    ps.setString(8, result.get(i).get("river_name"));
                    ps.setString(9, result.get(i).get("section_sx"));
                    ps.setString(10, result.get(i).get("sksk"));
                    ps.setString(11, result.get(i).get("target_2020"));
                    ps.setString(12, result.get(i).get("target_2016"));
                    ps.setString(13, result.get(i).get("target_2017"));
                    ps.setString(14, result.get(i).get("target_2018"));
                    ps.setString(15, result.get(i).get("category_info1"));
                    ps.setString(16, result.get(i).get("category_info2"));
                    ps.setString(17, result.get(i).get("category_info3"));
                    ps.setString(18, result.get(i).get("category_info4"));
                    ps.setString(19, result.get(i).get("category_info5"));
                    ps.setString(20, result.get(i).get("category_info6"));
                    ps.setString(21, result.get(i).get("category_info7"));
                    ps.setString(22, result.get(i).get("category_info8"));
                    ps.setString(23, result.get(i).get("category_info9"));
                    ps.setString(24, result.get(i).get("category_info10"));
                    ps.setString(25, result.get(i).get("category_info11"));
                    ps.setString(26, result.get(i).get("category_info12"));
                    ps.setString(27, result.get(i).get("aver"));
                    ps.setString(28, year);
                }

                @Override
                public int getBatchSize() {
                    return result.size();
                }
            });

        }

        System.out.println("直接取出");
        region = region.equals("all") ? "" : region;
        level = level.equals("all") ? "" : level;
        String sql = "select*from qmp_test_data_result where year='" + year + "' and loc_city like '%" + region + "%' " +
                "and section_level like '%" + level + "%'";
        System.out.println(sql);
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        for (int i = 1; i < 13; i++) {
            if (i < Integer.valueOf(start_m) || i > Integer.valueOf(end_m)) {//不在在选择的月份区间
                for (Map<String, Object> map : maps) {
                    map.put("category_info" + i, "");
                }
            }
        }
        Collections.sort(maps, new Comparator<Map<String, Object>>() {//将result按正序排序
            @Override
            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                return Integer.valueOf(String.valueOf(o1.get("original_id"))) - Integer.valueOf(String.valueOf(o2.get("original_id")));
            }
        });
        model.addObject("result", maps);
        request.getSession().setAttribute("szxzexcel", maps);

        model.setViewName("qmp/qmpSzxz_S");
        return model;
    }


    /**
     * 获取市级下断面水质现状
     *
     * @param year
     * @param start_m
     * @param end_m
     * @param result
     * @param reg     辖域名
     */
    private void getRegionDmResults(String year, String start_m, String
            end_m, List<Map<String, String>> result, String reg, String level) {
        String data_of_year = "select count(*) from qmp_test_data where year='" + year + "'";
        if (0 == jdbcTemplate.queryForObject(data_of_year, Integer.class)) {//没有该年的数据
            return;
        }
        Map<String, String> map = new HashMap<>();
        map.put("loc_city", reg);
        map.put("level", level);
        List<String> dMs = qmpService.getDMs(map);//市下辖断面 qmp_bas_info表
        String month_sql = "select Max(month) month from qmp_test_data";
        int monthMax = 1;
        try {
            monthMax = jdbcTemplate.queryForObject(month_sql, Integer.class);//实测数据月份
        } catch (Exception e) {
            System.out.println("month error!");
        }
        for (String dm : dMs) {//计算每个断面的类别

            //取出断面年度目标，为后面判断是否含氨氮准备
            String quality_sql = "select quality_target from qmp_year_water_target where section_name='" +
                    dm + "' and year='" + year + "'";
            String quality_target = "";
            try {
                quality_target = jdbcTemplate.queryForObject(quality_sql, String.class);//水质年度目标
            } catch (Exception e) {//没有水质年度目标,此断面计算无意义
                continue;
            }

            if (!start_m.equals(end_m)) {//起止月份不同
                int start = Integer.valueOf(start_m);
                int end = Integer.valueOf(end_m);
                Map<String, String> dmBasInfos = qmpService.getDmBasInfos(dm); //qmp_bas_info 表
                getTargets(dm, dmBasInfos); //qmp_year_water_target 表
                for (int i = start; i <= end; i++) {//遍历月份
                    if (i > monthMax)
                        break;
                    Map<String, String> category_info = countCategory(dm, i, year, quality_target); //qmp_bas_info qmp_test_data szzbbz
                    dmBasInfos.put("category_info" + i, category_info.get("dmcategory"));
                }
                String averLevel = getAverageLevel(start_m, end_m, year, dm, quality_target);
                if (!"".equals(averLevel)) {
                    averLevel = numStdToStr(averLevel);
                }
                dmBasInfos.put("aver", averLevel);
                result.add(dmBasInfos);
            } else {
                Map<String, String> dmBasInfos = qmpService.getDmBasInfos(dm);
                Map<String, String> category_info = countCategory(dm, Integer.valueOf(start_m), year, quality_target);
                dmBasInfos.put("category_info" + start_m, category_info.get("dmcategory"));
                getTargets(dm, dmBasInfos); //qmp_year_water_target
                result.add(dmBasInfos);
            }

        }
    }


    /**
     * 计算断面平均级别
     *
     * @param start_m 开始月份
     * @param end_m   终止月份
     * @param year    年份
     * @param dm      断面名称
     * @return 平均级别
     */
    private String getAverageLevel(String start_m, String end_m, String year, String dm, String quality_target) {
        Map<String, String> param = new HashMap<>();
        param.put("start_m", start_m);
        param.put("end_m", end_m);
        param.put("year", year);
        param.put("dm", dm);
        int totalmonth = Integer.valueOf(end_m) - Integer.valueOf(start_m);
        Map<String, String> zbs = new HashMap<>();
        Map<String, Double> totalZbs = qmpService.getTotalZbs(param);
        if (totalZbs != null) {
            for (Map.Entry<String, Double> entry : totalZbs.entrySet()) {
                zbs.put(entry.getKey(), String.valueOf(entry.getValue() / totalmonth));
            }
            String dmProp = qmpService.getDmProp(dm);//得到断面river_level属性,库体，干流，其它 qmp_bas_info
            param.put("section_name", dm);
            param.put("quality_target", quality_target);
            return getDmLevel(zbs, dmProp, param);
        }
        return "";
    }

    /**
     * 获取2016,2017,2018,2020水质目标以及经纬度
     *
     * @param dm
     * @param dmBasInfos
     */
    private void getTargets(String dm, Map<String, String> dmBasInfos) {
        try {
            String target_2016 = jdbcTemplate.queryForObject("select quality_target from qmp_year_water_target " +
                            "where year=? and section_name=?",
                    new String[]{"2016", dm}, String.class);
            String target_2017 = jdbcTemplate.queryForObject("select quality_target from qmp_year_water_target " +
                            "where year=? and section_name=?",
                    new String[]{"2017", dm}, String.class);
            String target_2018 = jdbcTemplate.queryForObject("select quality_target from qmp_year_water_target " +
                            "where year=? and section_name=?",
                    new String[]{"2018", dm}, String.class);
            String target_2020 = jdbcTemplate.queryForObject("select quality_target from qmp_year_water_target " +
                            "where year=? and section_name=?",
                    new String[]{"2020", dm}, String.class);
            target_2016 = removeAdField(target_2016);
            target_2017 = removeAdField(target_2017);
            target_2018 = removeAdField(target_2018);
            target_2020 = removeAdField(target_2020);
            String longitude = jdbcTemplate.queryForObject("select longitude from qmp_bas_info " + "where section_name=?", new String[]{dm}, String.class);
            String latitude = jdbcTemplate.queryForObject("select latitude from qmp_bas_info " + "where section_name=?", new String[]{dm}, String.class);
            String id = jdbcTemplate.queryForObject("select id from qmp_bas_info " + "where section_name=?", new String[]{dm}, String.class);
            dmBasInfos.put("longitude", longitude);
            dmBasInfos.put("latitude", latitude);
            dmBasInfos.put("target_2016", target_2016);
            dmBasInfos.put("target_2017", target_2017);
            dmBasInfos.put("target_2018", target_2018);
            dmBasInfos.put("target_2020", target_2020);
            dmBasInfos.put("id", id);
        } catch (Exception e) {
            dmBasInfos.put("id", "0");
            dmBasInfos.put("longitude", "0");
            dmBasInfos.put("latitude", "0");
            dmBasInfos.put("target_2016", "0");
            dmBasInfos.put("target_2017", "0");
            dmBasInfos.put("target_2018", "0");
            dmBasInfos.put("target_2020", "0");
        }

    }

    private String removeAdField(String year_target) {
        year_target = year_target.replace("（氨氮3）", "");
        year_target = year_target.replace("（氨氮4）", "");
        year_target = year_target.replace("（氨氮5）", "");
        return year_target;
    }

    /**
     * 计算断面指定年月的水质类别
     *
     * @param dm    断面名称
     * @param month 月份
     * @param year  年份
     * @return 断面指定年月的水质现状信息
     * map{section_name:xx;month:xx;year:xx;dmcategory:xx}
     */
    private Map<String, String> countCategory(String dm, int month, String year, String quality_target) {
        Map<String, String> params = new HashMap<>();
        params.put("section_name", dm);
        params.put("month", String.valueOf(month));
        params.put("year", year);
        String dmProp = qmpService.getDmProp(dm);//得到断面river_level属性,库体，干流，其它 qmp_bas_info
        List<Map<String, String>> dmZbs = qmpService.getDmZbs(params);//得到断面指标信息，list.size()==1 qmp_test_data
        params.put("quality_target", quality_target);
        for (Map<String, String> map : dmZbs) {//只循环一次
            String dmcategory = getDmLevel(map, dmProp, params);
            dmcategory = numStdToStr(dmcategory);
            dmcategory = removeAdField(dmcategory);
            params.put("dmcategory", dmcategory);
        }
        return params;
    }

    /**
     * 计算断面指定年月的水质类别
     *
     * @param dm    断面名称
     * @param month 月份
     * @param year  年份
     * @return 断面指定年月的水质现状信息
     * map{section_name:xx;month:xx;year:xx;dmcategory:xx},有可能指标为空字符串。
     */
    private Map<String, String> countCategory_copy(String dm, int month, String year, String quality_target) {
        Map<String, String> params = new HashMap<>();
        params.put("section_name", dm);
        params.put("month", String.valueOf(month));
        params.put("year", year);
        String dmProp = qmpService.getDmProp(dm);//得到断面river_level属性,库体，干流，其它 qmp_bas_info
        List<Map<String, String>> dmZbs = qmpService.getDmZbs(params);//得到断面指标信息，list.size()==1 qmp_test_data
        params.put("quality_target", quality_target);
        for (Map<String, String> map : dmZbs) {//只循环一次
            String dmcategory = getDmLevel(map, dmProp, params);
            dmcategory = numStdToStr(dmcategory);
            params.put("dmcategory", dmcategory);
        }
        return params;
    }

    /**
     * 计算断面水质级别
     *
     * @param map         断面21个化学指标信息
     * @param river_level 断面属性 干流，库体，其它，数据库断面属性值
     * @param params
     * @return 断面级别
     */
    private String getDmLevel(Map<String, String> map, String river_level, Map<String, String> params) {
        float level = 0f;//类别
        switch (river_level) {
            case "干流":
                level = getDmLevel(map, "河流", level, params);
                break;
            case "库体":
                level = getDmLevel(map, "水库", level, params);
                break;
            default:
                level = getDmLevel(map, "河流", level, params);
                break;
        }
        return String.valueOf(level);
    }

    /**
     * @param map
     * @param river_level 标准表中的三个类型，河流，水库，湖泊
     * @param level
     * @return
     */
    private float getDmLevel(Map<String, String> map, String river_level, float level, Map<String, String> params) {
        for (Map.Entry<String, String> entry : map.entrySet()) {//遍历各个指标
            level = getLevel(level, entry, river_level, params);
        }
        return level;
    }

    String getMaxOfThisRiverLevel(String river_level, Map.Entry<String, String> entry, String quality_target) {
        String std = entry.getKey() + "_std";
        std = std.replace("__", "_");
        String sql = null;
        if (entry.getKey().equals("ph")) {
            return "Ⅰ";
        }
        if (quality_target.contains("氨氮3")) { //忽略氨氮4和氨氮5
            sql = "SELECT quality_target from szzbbz " +
                    "WHERE water_type='" + river_level + "' " +
                    "AND " + std + " in (SELECT MAX(CONVERT(" + std + ",DECIMAL(10,7))) FROM szzbbz WHERE water_type='" + river_level + "' and quality_target not like '%氨氮4%' and quality_target not like '%氨氮5%' and quality_target not like '%总磷%' ) " +
                    " and quality_target not like '%氨氮4%' and quality_target not like '%氨氮5%' and quality_target not like '%总磷%' ORDER BY quality_target DESC LIMIT 1";
        } else if (quality_target.contains("氨氮4")) {//忽略氨氮3和氨氮5
            sql = "SELECT quality_target from szzbbz " +
                    "WHERE water_type='" + river_level + "' " +
                    "AND " + std + " in (SELECT MAX(CONVERT(" + std + ",DECIMAL(10,7))) FROM szzbbz WHERE water_type='" + river_level + "'  and quality_target not like '%氨氮3%' and quality_target not like '%氨氮5%' and quality_target not like '%总磷%' ) " +
                    " and quality_target not like '%氨氮3%' and quality_target not like '%氨氮5%' and quality_target not like '%总磷%' ORDER BY quality_target DESC LIMIT 1";
        } else if (quality_target.contains("氨氮5")) {//忽略氨氮4和氨氮3
            sql = "SELECT quality_target from szzbbz " +
                    "WHERE water_type='" + river_level + "' " +
                    "AND " + std + " in (SELECT MAX(CONVERT(" + std + ",DECIMAL(10,7))) FROM szzbbz WHERE water_type='" + river_level + "'  and quality_target not like '%氨氮4%' and quality_target not like '%氨氮3%' and quality_target not like '%总磷%' ) " +
                    " and quality_target not like '%氨氮4%' and quality_target not like '%氨氮3%' and quality_target not like '%总磷%' ORDER BY quality_target DESC LIMIT 1";
        } else if (quality_target.contains("总磷")) {
            sql = "SELECT quality_target from szzbbz " +
                    "WHERE water_type='" + river_level + "' " +
                    "AND " + std + " in (SELECT MAX(CONVERT(" + std + ",DECIMAL(10,7))) FROM szzbbz WHERE water_type='" + river_level + "'  and quality_target not like '%氨氮%' ) " +
                    " and quality_target not like '%氨氮%' ORDER BY quality_target DESC LIMIT 1";
        } else {
            sql = "SELECT quality_target from szzbbz " +
                    "WHERE water_type='" + river_level + "' " +
                    "AND " + std + " in (SELECT MAX(CONVERT(" + std + ",DECIMAL(10,7))) FROM szzbbz WHERE water_type='" + river_level + "'  and quality_target not like '%氨氮%' and quality_target not like '%总磷%' ) " +
                    " and quality_target not like '%氨氮%' and quality_target not like '%总磷%' ORDER BY quality_target DESC LIMIT 1";
        }
//    String sql = "SELECT quality_target from szzbbz " +
//            "WHERE water_type='" + river_level + "' " +
//            "AND " + std + " in (SELECT MAX(CONVERT(" + std + ",DECIMAL(10,7))) FROM szzbbz WHERE water_type='" + river_level + "') " +
//            "ORDER BY quality_target DESC LIMIT 1";
        return jdbcTemplate.queryForObject(sql, String.class);
    }

    private float getLevel(float level, Map.Entry<String, String> entry, String river_level, Map<String, String> params) {
        Float current_level = 0f;
        String target = "";
        String quality_target = params.get("quality_target");

        try {
            String std = entry.getKey() + "_std";
            std = std.replace("__", "_");
            if (!entry.getValue().equals("-1")) {
                if (entry.getKey().equals("ph")) {
                    if (Float.parseFloat(entry.getValue()) < 6 || Float.parseFloat(entry.getValue()) > 9) {
                        target = "劣Ⅴ";
                    }
                } else if (quality_target.contains("氨氮3")) { //忽略氨氮4和氨氮5
                    target = jdbcTemplate.queryForObject("select quality_target from szzbbz where water_type=? and " + std + ">=" + entry.getValue() + " and quality_target not like '%氨氮4%' and quality_target not like '%氨氮5%' and quality_target not like '%总磷%' limit 0,1",
                            new String[]{river_level}, String.class);
                } else if (quality_target.contains("氨氮4")) {//忽略氨氮3和氨氮5
                    target = jdbcTemplate.queryForObject("select quality_target from szzbbz where water_type=? and " + std + ">=" + entry.getValue() + " and quality_target not like '%氨氮3%' and quality_target not like '%氨氮5%' and quality_target not like '%总磷%' limit 0,1",
                            new String[]{river_level}, String.class);
                } else if (quality_target.contains("氨氮5")) {//忽略氨氮4和氨氮3
                    target = jdbcTemplate.queryForObject("select quality_target from szzbbz where water_type=? and " + std + ">=" + entry.getValue() + " and quality_target not like '%氨氮3%' and quality_target not like '%氨氮4%' and quality_target not like '%总磷%' limit 0,1",
                            new String[]{river_level}, String.class);
                } else if (quality_target.contains("总磷")) {
                    target = jdbcTemplate.queryForObject("select quality_target from szzbbz where water_type=? and " + std + ">=" + entry.getValue() + " and quality_target not like '%氨氮%' limit 0,1",
                            new String[]{river_level}, String.class);
                } else {
                    target = jdbcTemplate.queryForObject("select quality_target from szzbbz where water_type=? and " + std + ">=" + entry.getValue() + " and quality_target not like '%氨氮%' and quality_target not like '%总磷%' limit 0,1",
                            new String[]{river_level}, String.class);
                }
//        target = jdbcTemplate.queryForObject("select quality_target from szzbbz where water_type=? and " + std + ">=" + entry.getValue() + " limit 0,1",
//                new String[]{river_level}, String.class);
            } else {//如果为-1,当前指标为标准值

            }
        } catch (Exception e) {
            //返回size为0时抛出异常，target设置为次类中最大值
            target = getMaxOfThisRiverLevel(river_level, entry, quality_target);
        }
        //将类别转为数字表示
        current_level = Float.valueOf(strStdToNum(target));
        if (current_level > level) {
            level = current_level;
        }
        return level;
    }

    /**
     * 查询断面指定年月超标指标及倍数
     *
     * @param map {month:xx;year:xx;section_name:xx}
     * @return map{指标名：超标倍数,指标类别;......}
     */
    private Map<String, String> getBadZb(Map<String, String> map) {
        Map<String, String> result = new HashMap<>();

        String section_name = map.get("section_name");
        String month = map.get("month");
        String year = map.get("year");
        String quality_target = null;
        try {
            quality_target = jdbcTemplate.queryForObject("select quality_target from qmp_year_water_target where section_name=? and year=?",
                    new String[]{section_name, year}, String.class);//水质年度目标
        } catch (Exception e) {
            return result;
        }
        String quality_target_tmp = quality_target;
        quality_target = strStdToNum(quality_target);
        String dmProp = qmpService.getDmProp(section_name);//得到断面river_level属性,库体，干流，其它
        switch (dmProp) {//对应到szszbz表里的类别，河流，水库，湖泊
            case "干流":
                dmProp = "河流";
                break;
            case "库体":
                dmProp = "水库";
                break;
            default:
                dmProp = "河流";
                break;
        }
        List<Map<String, String>> dmZbs = qmpService.getDmZbs(map);//得到断面指标信息，list.size()==1
        for (Map<String, String> dmzb : dmZbs) {
            for (Map.Entry<String, String> entry : dmzb.entrySet()) {//遍历每一个指标
                if (entry.getKey().equals("ph") && !entry.getValue().equals("")) {//ph值大于9和小于6直接算为劣V类，超标倍数计算公式为（6-ph）/6,或（ph-9）/9
                    String zb = "6.00";
                    if (6.00 > Float.valueOf(entry.getValue())) {//如果指标值小于6
                        if (Float.parseFloat(entry.getValue()) < 6) {
                            String zbval = entry.getValue();
                            if (zbval.contains("L")) {
                                zbval = zbval.replace("L", "");
                            }
                            String cbbs = String.valueOf((6 - Float.valueOf(zbval)) / 6);

                            DecimalFormat decimalFormat = new DecimalFormat(".00");//构造方法的字符格式这里如果小数不足2位,会以0补足.
                            decimalFormat.setRoundingMode(RoundingMode.DOWN);
                            float cbbsdouble = Float.valueOf(cbbs);
                            if (cbbsdouble < 0.1 && cbbsdouble > 0) {//当为0.0？时
                                cbbsdouble = 0.1f;
                            }
                            cbbs = decimalFormat.format(cbbsdouble);
                            float res = Math.round(Double.valueOf(cbbs) * 10);
                            res = res / 10.0f;
                            zb = numStdToStr(zb);
                            result.put(entry.getKey(), res + "," + zb);
                        } else if (Float.valueOf(entry.getValue()) > 9) {//如果指标值大于9
                            String zbval = entry.getValue();
                            if (zbval.contains("L")) {
                                zbval = zbval.replace("L", "");
                            }
                            String cbbs = String.valueOf((Float.valueOf(zbval) - 9) / 9);

                            DecimalFormat decimalFormat = new DecimalFormat(".00");//构造方法的字符格式这里如果小数不足2位,会以0补足.
                            decimalFormat.setRoundingMode(RoundingMode.DOWN);
                            float cbbsdouble = Float.valueOf(cbbs);
                            if (cbbsdouble < 0.1 && cbbsdouble > 0) {//当为0.0？时
                                cbbsdouble = 0.1f;
                            }
                            cbbs = decimalFormat.format(cbbsdouble);
                            float res = Math.round(Double.valueOf(cbbs) * 10);
                            res = res / 10.0f;
                            zb = numStdToStr(zb);
                            result.put(entry.getKey(), res + "," + zb);
                        }
                    }
                } else {
                    String zb_std = entry.getKey() + "_std";
                    zb_std = zb_std.replace("__", "_");
                    //得到该指标的类别
                    String zb = null;
                    try {
                        String sql = "";
                        if (quality_target.contains("氨氮3")) { //忽略氨氮4和氨氮5
                            sql = "select quality_target from szzbbz where water_type=\"" + dmProp + "\" and " + zb_std + ">=" + entry.getValue() + " and quality_target not like '%氨氮4%' and quality_target not like '%氨氮5%' and quality_target not like '%总磷%' limit 0,1";
                        } else if (quality_target.contains("氨氮4")) {//忽略氨氮3和氨氮5
                            sql = "select quality_target from szzbbz where water_type=\"" + dmProp + "\" and " + zb_std + ">=" + entry.getValue() + " and quality_target not like '%氨氮3%' and quality_target not like '%氨氮5%' and quality_target not like '%总磷%' limit 0,1";
                        } else if (quality_target.contains("氨氮5")) {//忽略氨氮4和氨氮3
                            sql = "select quality_target from szzbbz where water_type=\"" + dmProp + "\" and " + zb_std + ">=" + entry.getValue() + " and quality_target not like '%氨氮4%' and quality_target not like '%氨氮3%' and quality_target not like '%总磷%' limit 0,1";
                        } else if (quality_target.contains("总磷")) {
                            sql = "select quality_target from szzbbz where water_type=\"" + dmProp + "\" and " + zb_std + ">=" + entry.getValue() + " and quality_target not like '%氨氮%' limit 0,1";
                        } else {
                            sql = "select quality_target from szzbbz where water_type=\"" + dmProp + "\" and " + zb_std + ">=" + entry.getValue() + " and quality_target not like '%氨氮%' and quality_target not like '%总磷%' limit 0,1";
                        }
                        zb = jdbcTemplate.queryForObject(sql, String.class);
                    } catch (Exception e) {
                        //e.printStackTrace();
                        zb = getMaxOfThisRiverLevel(dmProp, entry, quality_target);
                    }
                    zb = strStdToNum(zb);
                    if (Float.valueOf(zb) > Float.valueOf(quality_target)) {//如果指标类别大于年度目标类别
                        //获取该指标的标准数值，准备计算超标倍数
                        String zb_std_num = jdbcTemplate.queryForObject("select " + zb_std + " from szzbbz where quality_target= \"" + quality_target_tmp + "\" and water_type= \"" + dmProp + "\"",
                                String.class);
                        //计算超标倍数
                        String zbval = entry.getValue();
                        if (zbval.contains("L")) {
                            zbval = zbval.replace("L", "");
                        }
                        String cbbs = String.valueOf(Double.valueOf(zbval) / Double.valueOf(zb_std_num) - 0.9999999999999);

                        DecimalFormat decimalFormat = new DecimalFormat(".00");//构造方法的字符格式这里如果小数不足2位,会以0补足.
                        decimalFormat.setRoundingMode(RoundingMode.DOWN);
                        Double cbbsdouble = Double.valueOf(cbbs);
                        if (cbbsdouble < 0.1 && cbbsdouble > 0) {//当为0.0？时
                            cbbsdouble = 0.1;
                        }
                        cbbs = decimalFormat.format(cbbsdouble);
                        float res = Math.round(Double.valueOf(cbbs) * 10);
                        res = res / 10.0f;
                        zb = numStdToStr(zb);
                        result.put(entry.getKey(), res + "," + zb);
                    }
                }
            }
        }
        return result;
    }

    /**
     * 查询断面指定年月超标指标及倍数
     *
     * @param month:xx;year:xx;section_name:xx
     * @return map{指标名：超标倍数,指标类别;......}
     */
    private Map<String, String> getBadZb(String month, String year, String section_name) {
        Map<String, String> result = new HashMap<>();

        String quality_target = null;
        try {
            quality_target = jdbcTemplate.queryForObject("select quality_target from qmp_year_water_target where section_name=? and year=?",
                    new String[]{section_name, year}, String.class);//水质年度目标
        } catch (Exception e) {
            return result;
        }
        String quality_target_tmp = quality_target;
        quality_target = strStdToNum(quality_target);
        String dmProp = qmpService.getDmProp(section_name);//得到断面river_level属性,库体，干流，其它
        switch (dmProp) {//对应到szszbz表里的类别，河流，水库，湖泊
            case "干流":
                dmProp = "河流";
                break;
            case "库体":
                dmProp = "水库";
                break;
            default:
                dmProp = "河流";
                break;
        }
        List<Map<String, String>> dmZbs = qmpService.getDmZbsPar(month, year, section_name);//得到断面指标信息，list.size()==1
        for (Map<String, String> dmzb : dmZbs) {
            for (Map.Entry<String, String> entry : dmzb.entrySet()) {//遍历每一个指标
                if (entry.getKey().equals("ph") && !entry.getValue().equals("")) {
                    String zb = "6.00";
                    if (6.00 > Float.valueOf(quality_target)) {//如果指标类别大于年度目标类别
                        if (Float.parseFloat(entry.getValue()) < 6) {
                            String zbval = entry.getValue();
                            if (zbval.contains("L")) {
                                zbval = zbval.replace("L", "");
                            }
                            String cbbs = String.valueOf((6 - Float.valueOf(zbval)) / 6);

                            DecimalFormat decimalFormat = new DecimalFormat(".00");//构造方法的字符格式这里如果小数不足2位,会以0补足.
                            decimalFormat.setRoundingMode(RoundingMode.DOWN);
                            float cbbsdouble = Float.valueOf(cbbs);
                            if (cbbsdouble < 0.1 && cbbsdouble > 0) {//当为0.0？时
                                cbbsdouble = 0.1f;
                            }
                            cbbs = decimalFormat.format(cbbsdouble);
                            float res = Math.round(Double.valueOf(cbbs) * 10);
                            res = res / 10.0f;
                            zb = numStdToStr(zb);
                            result.put(entry.getKey(), res + "," + zb);
                        } else if (Float.valueOf(entry.getValue()) > 9) {
                            String zbval = entry.getValue();
                            if (zbval.contains("L")) {
                                zbval = zbval.replace("L", "");
                            }
                            String cbbs = String.valueOf((Float.valueOf(zbval) - 9) / 9);

                            DecimalFormat decimalFormat = new DecimalFormat(".00");//构造方法的字符格式这里如果小数不足2位,会以0补足.
                            decimalFormat.setRoundingMode(RoundingMode.DOWN);
                            float cbbsdouble = Float.valueOf(cbbs);
                            if (cbbsdouble < 0.1 && cbbsdouble > 0) {//当为0.0？时
                                cbbsdouble = 0.1f;
                            }
                            cbbs = decimalFormat.format(cbbsdouble);
                            float res = Math.round(Double.valueOf(cbbs) * 10);
                            res = res / 10.0f;
                            zb = numStdToStr(zb);
                            result.put(entry.getKey(), res + "," + zb);
                        }
                    }
                } else {
                    String zb_std = entry.getKey() + "_std";
                    zb_std = zb_std.replace("__", "_");
                    //得到该指标的类别
                    String zb = null;
                    try {
                        String sql = "";
                        if (quality_target.contains("氨氮3")) { //忽略氨氮4和氨氮5
                            sql = "select quality_target from szzbbz where water_type=\"" + dmProp + "\" and " + zb_std + ">=" + entry.getValue() + " and quality_target not like '%氨氮4%' and quality_target not like '%氨氮5%' and quality_target not like '%总磷%' limit 0,1";
                        } else if (quality_target.contains("氨氮4")) {//忽略氨氮3和氨氮5
                            sql = "select quality_target from szzbbz where water_type=\"" + dmProp + "\" and " + zb_std + ">=" + entry.getValue() + " and quality_target not like '%氨氮3%' and quality_target not like '%氨氮5%' and quality_target not like '%总磷%' limit 0,1";
                        } else if (quality_target.contains("氨氮5")) {//忽略氨氮4和氨氮3
                            sql = "select quality_target from szzbbz where water_type=\"" + dmProp + "\" and " + zb_std + ">=" + entry.getValue() + " and quality_target not like '%氨氮4%' and quality_target not like '%氨氮3%' and quality_target not like '%总磷%' limit 0,1";
                        } else if (quality_target.contains("总磷")) {
                            sql = "select quality_target from szzbbz where water_type=\"" + dmProp + "\" and " + zb_std + ">=" + entry.getValue() + " and quality_target not like '%氨氮%' limit 0,1";
                        } else {
                            sql = "select quality_target from szzbbz where water_type=\"" + dmProp + "\" and " + zb_std + ">=" + entry.getValue() + " and quality_target not like '%氨氮%' and quality_target not like '%总磷%' limit 0,1";
                        }
                        zb = jdbcTemplate.queryForObject(sql, String.class);
                    } catch (Exception e) {
                        //e.printStackTrace();
                        zb = getMaxOfThisRiverLevel(dmProp, entry, quality_target);
                    }
                    zb = strStdToNum(zb);
                    if (Float.valueOf(zb) > Float.valueOf(quality_target)) {//如果指标类别大于年度目标类别
                        //获取该指标的标准数值，准备计算超标倍数
                        String zb_std_num = jdbcTemplate.queryForObject("select " + zb_std + " from szzbbz where quality_target= \"" + quality_target_tmp + "\" and water_type= \"" + dmProp + "\"",
                                String.class);
                        //计算超标倍数
                        String zbval = entry.getValue();
                        if (zbval.contains("L")) {
                            zbval = zbval.replace("L", "");
                        }
                        String cbbs = String.valueOf(Float.valueOf(zbval) / Float.valueOf(zb_std_num) - 0.9999999);

                        DecimalFormat decimalFormat = new DecimalFormat(".00");//构造方法的字符格式这里如果小数不足2位,会以0补足.
                        decimalFormat.setRoundingMode(RoundingMode.DOWN);
                        float cbbsdouble = Float.valueOf(cbbs);
                        if (cbbsdouble < 0.1 && cbbsdouble > 0) {//当为0.0？时
                            cbbsdouble = 0.1f;
                        }
                        cbbs = decimalFormat.format(cbbsdouble);
                        float res = Math.round(Double.valueOf(cbbs) * 10);
                        res = res / 10.0f;
                        zb = numStdToStr(zb);
                        result.put(entry.getKey(), res + "," + zb);
                    }
                }
            }
        }
        return result;
    }


    /**
     * 查询断面指定年月超标指标及倍数
     *
     * @param map {month:xx;year:xx;section_name:xx}
     * @return map{指标名：超标倍数;......}
     */
    private Map<String, String> getBadZb_copy(Map<String, String> map) {
        Map<String, String> result = new HashMap<>();

        String section_name = map.get("section_name");
        String month = map.get("month");
        String year = map.get("year");
        String quality_target = jdbcTemplate.queryForObject("select quality_target from qmp_year_water_target where section_name=? and year=?",
                new String[]{section_name, year}, String.class);//水质年度目标
        String quality_target_tmp = quality_target;
        quality_target = strStdToNum(quality_target);
        String dmProp = qmpService.getDmProp(section_name);//得到断面river_level属性,库体，干流，其它
        switch (dmProp) {//对应到szszbz表里的类别，河流，水库，湖泊
            case "干流":
                dmProp = "河流";
                break;
            case "库体":
                dmProp = "水库";
                break;
            default:
                dmProp = "湖泊";
                break;
        }
        List<Map<String, String>> dmZbs = qmpService.getDmZbs(map);//得到断面指标信息，list.size()==1
        for (Map<String, String> dmzb : dmZbs) {
            for (Map.Entry<String, String> entry : dmzb.entrySet()) {//遍历每一个指标
                String zb_std = entry.getKey() + "_std";
                zb_std = zb_std.replace("__", "_");
                //得到该指标的类别
                String zb = null;
                try {
                    String sql = "select quality_target from szzbbz where water_type=\"" + dmProp + "\" and " + zb_std + ">=" + entry.getValue() + " limit 0,1";
                    zb = jdbcTemplate.queryForObject(sql, String.class);
                    zb = strStdToNum(zb);
                    if (Float.valueOf(zb) > Float.valueOf(quality_target)) {//如果指标类别大于年度目标类别
                        //获取该指标的标准数值，准备计算超标倍数
                        String zb_std_num = jdbcTemplate.queryForObject("select " + zb_std + " from szzbbz where quality_target= \"" + quality_target_tmp + "\" and water_type= \"" + dmProp + "\"",
                                String.class);
                        //计算超标倍数
                        String cbbs = String.valueOf(Float.valueOf(entry.getValue()) / Float.valueOf(zb_std_num) - 1);
                        result.put(entry.getKey(), cbbs);
                    }
                } catch (EmptyResultDataAccessException e) {
                    //e.printStackTrace();
                }
            }
        }
        return result;
    }

    private int convertLevel(String strstd) {
        if (strstd.contains("Ⅰ")) {
            return 1;
        } else if (strstd.contains("Ⅱ")) {
            return 2;
        } else if (strstd.contains("Ⅲ")) {
            return 3;
        } else if (strstd.contains("Ⅳ")) {
            return 4;
        } else if (strstd.contains("劣Ⅴ")) {
            return 6;
        } else if (strstd.contains("Ⅴ")) {
            return 5;
        }
        return -1;
    }

    /**
     * 将字符串的标准转换为数字的标准，V->5
     *
     * @param strstd
     * @return
     */
    private String strStdToNum(String strstd) {
        switch (strstd) {
            case "Ⅰ":
                return "1.00";
            case "Ⅱ":
                return "2";
            case "Ⅱ（总磷0.05）":
                return "2.05";
            case "Ⅲ":
                return "3.00";
            case "Ⅳ":
                return "4.00";
            case "Ⅴ":
                return "5.00";
            case "Ⅴ（氨氮3）":
                return "5.30";
            case "Ⅴ（氨氮4）":
                return "5.40";
            case "Ⅴ（氨氮5）":
                return "5.50";
            case "劣Ⅴ":
                return "6.00";
            case "劣Ⅴ（氨氮3）":
                return "6.30";
            case "劣Ⅴ（氨氮4）":
                return "6.40";
            case "劣Ⅴ（氨氮5）":
                return "6.50";
        }
        return "0";
    }

    private String numStdToStr(String std) {
        DecimalFormat decimalFormat = new DecimalFormat(".00");//构造方法的字符格式这里如果小数不足2位,会以0补足.
        std = decimalFormat.format(Double.valueOf(std));
        switch (std.trim()) {
            case "1.00":
                return "Ⅰ";
            case "2.00":
                return "Ⅱ";
            case "2.05":
                return "Ⅱ（总磷0.05）";
            case "3.00":
                return "Ⅲ";
            case "4.00":
                return "Ⅳ";
            case "5.00":
                return "Ⅴ";
            case "5.30":
                return "Ⅴ（氨氮3）";
            case "5.40":
                return "Ⅴ（氨氮4）";
            case "5.50":
                return "Ⅴ（氨氮5）";
            case "6.00":
                return "劣Ⅴ";
            case "6.30":
                return "劣Ⅴ（氨氮3）";
            case "6.40":
                return "劣Ⅴ（氨氮4）";
            case "6.50":
                return "劣Ⅴ（氨氮5）";
            default:
                return "";
        }

    }

    /**
     * 获取用户管辖区域
     *
     * @param userName
     * @return
     */
    private List<String> getRegions(String userName) {
        List<String> citylist = new ArrayList<>();
        String sql = "SELECT role_sign from role WHERE id in(SELECT role_id FROM user_role " +
                "WHERE user_id in(SELECT id from user where username=?))";
        //根据用户名获取权限标识
        String role_sign = jdbcTemplate.queryForObject(sql, new String[]{userName}, String.class);
        if ("1".equals(role_sign) || "admin".equals(role_sign)) {
            List<Map<String, Object>> list = jdbcTemplate.queryForList("select role_name from role where role_sign='2'");
            for (Map<String, Object> map : list) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    citylist.add(entry.getValue().toString());
                }
            }
        } else if ("2".equals(role_sign)) {
            citylist = userService.getCountyByCity(roleService.getRoleNameByUname(userName));
        }
        return citylist;
    }

    /**
     * 查询用户列表
     */
    @RequestMapping("/list")
    public String userList(HttpServletRequest request, Model model) {
//        List<Qmp> list = qmpService.listAll();
//        model.addAttribute("ulist", list);
//        request.setAttribute("ulist", list);

        String pageNow = request.getParameter("pageNow");
        List<Qmp> list = qmpService.selectByPage(pageNow);
        Page page = qmpService.getPage(pageNow);
        model.addAttribute("list", list);
        model.addAttribute("page", page);
        return "qmp/qmpList";
    }


/*
    @RequestMapping("/list")
    public String list(HttpServletRequest request, Model model) {
//        List<Qmp> list = qmpService.listAll();
//        model.addAttribute("ulist", list);
//        request.setAttribute("ulist", list);

        String pageNow = request.getParameter("pageNow");
        List<Qmp> list = qmpService.selectByPage(pageNow);
        Page page = qmpService.getPage(pageNow);
        model.addAttribute("list", list);
        model.addAttribute("page", page);
        return "qmp/qmpList";
    }
*/
    /**
     * 查询qmp_bas_info列表
     */
    @RequestMapping("/listBas")
    public String listBas(HttpServletRequest request, Model model) {
//        List<Qmp> list = qmpService.listAll();
//        model.addAttribute("ulist", list);
//        request.setAttribute("ulist", list);

        String pageNow = request.getParameter("pageNow");
        List<QmpBaseInfo> list = qmpBaseInfoService.selectByPage(pageNow);
        Page page = qmpBaseInfoService.getPage(pageNow);
        model.addAttribute("list", list);
        model.addAttribute("page", page);
        return "qmp/qmpBasList";
    }

    /**
     * 查询qmp_test_data列表
     */
    @RequestMapping("/listTest")
    public String listTest(HttpServletRequest request, Model model) {

        String pageNow = request.getParameter("pageNow");
        List<QmpTestData> list = qmpService.selectByPageSzxz(pageNow);
        Page page = qmpService.getPageSzxz(pageNow);
        model.addAttribute("list", list);
        model.addAttribute("page", page);
        return "qmp/qmpTestList";
    }

    /**
     * 查询修改用户信息的id
     */
    @RequestMapping("/id")
    public String updateid(HttpServletRequest request, Long id, Model model) {
        Qmp qmp = qmpService.selectById(id);
        request.setAttribute("qmp", qmp);
        model.addAttribute("qmp", qmp);
        return "qmp/editQmp";
    }


    @RequestMapping("/Basid")
    public String updateBasid(HttpServletRequest request, int id, Model model) {
        //System.out.println(id);
        QmpBaseInfo qmpBaseInfo = qmpBaseInfoService.selectById(id);
        request.setAttribute("qmpBaseInfo", qmpBaseInfo);
        model.addAttribute("qmpBaseInfo", qmpBaseInfo);
        return "qmp/editQmpBas";
    }

    @RequestMapping("/Testid")
    public String updateTestid(HttpServletRequest request, int id, Model model) {
        System.out.println(id);
        QmpTestData qmpTestData = qmpService.selectByIdSzxz(id);
        request.setAttribute("qmpTestData", qmpTestData);
        model.addAttribute("qmpTestData", qmpTestData);
        return "qmp/editQmpTest";
    }

    /**
     * 修改用户信息
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public String update(HttpServletRequest request, Qmp qmp) {
        int result = qmpService.update(qmp);

        request.setAttribute("result", result);
        return "success";
    }

    /**
     * 修改qmp_bas_info信息
     */
    @RequestMapping(value = "/updateBas")
    @ResponseBody
    public String updateBas(HttpServletRequest request, QmpBaseInfo qmpBaseInfo) {
        int result = qmpBaseInfoService.update(qmpBaseInfo);
        request.setAttribute("result", result);
        return "success";
    }

    /**
     * 修改qmp_test_data信息
     */
    @RequestMapping(value = "/updateTest")
    @ResponseBody
    public String updateTest(HttpServletRequest request, QmpTestData qmpTestData) {
        int result = qmpService.updateSzxz(qmpTestData);
        request.setAttribute("result", result);
        return "success";
    }

    /**
     * 添加用户信息
     */
    @RequestMapping("/insert")
    @ResponseBody
    public String insert(HttpServletRequest request, Qmp qmp) {
        int result = qmpService.insert(qmp);
        request.setAttribute("result", result);
        return "success";
    }

    /**
     * 添加qmptestdata信息
     */
    @RequestMapping("/insertTestData")
    @ResponseBody
    public String insert(HttpServletRequest request, QmpTestData qmpTestData) {
        int result = qmpService.insertTestData(qmpTestData);
        request.setAttribute("result", result);
        return "success";
    }

    /**
     * 添加qmpbasinfo信息
     */
    @RequestMapping("/insertQmpBaseInfo")
    @ResponseBody
    public String insertQmpBaseInfo(HttpServletRequest request, QmpBaseInfo qmpBaseInfo) {
        System.out.println(qmpBaseInfo);
        int result = qmpService.insertQmpBaseInfo(qmpBaseInfo);
        request.setAttribute("result", result);
        return "success";
    }

    /*
     * 单条校验断面是否存在
     */
    @RequestMapping("/insertTestDataPanduan")
    @ResponseBody
    public String insertTestDataPanduan(HttpServletRequest request) {
        String section_name = request.getParameter("section_name");
        String sectionPanduan;
        System.out.println(section_name);
        String sql = "select section_name from qmp_test_data where section_name= " + '"' + section_name + '"' + " limit 1";
        System.out.println(sql);
        try {
            sectionPanduan = jdbcTemplate.queryForObject(sql, String.class);
            System.out.println(sectionPanduan);
        } catch (Exception e) {
            return null;
        }
        System.out.println(sectionPanduan);
        return sectionPanduan;
    }

    /**
     * 删除用户 ，根据id删除
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public String delete(HttpServletRequest request, HttpServletResponse response, int id) {
        int result = qmpService.delete(id);
        request.setAttribute("result", result);
        return "success";
    }

    /**
     * 删除qmp_bas_info ，根据id删除
     */
    @RequestMapping(value = "/deleteBas")
    @ResponseBody
    public String deleteBas(HttpServletRequest request, HttpServletResponse response, int id) {
        int result = qmpBaseInfoService.delete(id);
        request.setAttribute("result", result);
        return "success";
    }

    /**
     * 删除qmp_test_data ，根据id删除
     */
    @RequestMapping(value = "/deleteTest")
    @ResponseBody
    public String deleteTest(HttpServletRequest request, HttpServletResponse response, int id) {
        int result = qmpService.deleteSzxz(id);
        request.setAttribute("result", result);
        return "success";
    }

    @RequestMapping("/getTableName")
    public void getTableName(HttpServletRequest request, HttpServletResponse response) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/new_env";
        String sql = "select column_name from information_schema.columns where table_schema='new_env' and table_name='qmp';";
        PreparedStatement pstmt;
        List list = new ArrayList<String>();

        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_env", "root", "981225");
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= col; i++) {
                    System.out.print(rs.getString(i) + "\t");
                    list.add(rs.getString(i));
                }
            }
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Gson gson = new Gson();
        String str = gson.toJson(list);
        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.write(str);//写入字符串
    }

    @RequestMapping("/getQmpBasInfoTableName")
    public void getQmpBasInfoTableName(HttpServletRequest request, HttpServletResponse response) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/new_env";
        String sql = "select column_name from information_schema.columns where table_schema='new_env' and table_name='qmp_bas_info';";
        PreparedStatement pstmt;
        List list = new ArrayList<String>();

        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_env", "root", "981225");
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= col; i++) {
                    System.out.print(rs.getString(i) + "\t");
                    list.add(rs.getString(i));
                }
            }
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();

        }

        Gson gson = new Gson();
        String str = gson.toJson(list);
        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.write(str);//写入字符串
    }

    @RequestMapping("/getQmpTestDataTableName")
    public void getQmpTestDataTableName(HttpServletRequest request, HttpServletResponse response) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/new_env";
        String sql = "select column_name from information_schema.columns where table_schema='new_env' and table_name='qmp_test_data';";
        PreparedStatement pstmt;
        List list = new ArrayList<String>();

        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_env", "root", "18342212808y");
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= col; i++) {
                    System.out.print(rs.getString(i) + "\t");
                    list.add(rs.getString(i));
                }
            }
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Gson gson = new Gson();
        String str = gson.toJson(list);
        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.write(str);//写入字符串
    }

    @RequestMapping("/search")
    @ResponseBody
    public ModelAndView search(HttpServletRequest request, ModelAndView m) {
        Map map = new HashMap();

        map.put("section_bh", (String) request.getParameter("section_bh"));
        map.put("section_dybh", (String) request.getParameter("section_dybh"));
        map.put("section_dymc", (String) request.getParameter("section_dymc"));
        map.put("section_shhl", (String) request.getParameter("section_shhl"));

        map.put("tjnf", (String) request.getParameter("tjnf"));
        map.put("watershed", (String) request.getParameter("watershed"));
        map.put("river_name", (String) request.getParameter("river_name"));
        map.put("river_level", (String) request.getParameter("river_level"));
        map.put("river_to", (String) request.getParameter("river_to"));
        map.put("section_name", (String) request.getParameter("section_name"));
        map.put("section_property", (String) request.getParameter("section_property"));
        map.put("loc_province", (String) request.getParameter("loc_province"));
        map.put("loc_city", (String) request.getParameter("loc_city"));
        map.put("loc_county", (String) request.getParameter("loc_county"));
        map.put("test_by", (String) request.getParameter("test_by"));
        map.put("section_level", (String) request.getParameter("section_level"));
        map.put("section_type", (String) request.getParameter("section_type"));
        map.put("is_urban", (String) request.getParameter("is_urban"));
        map.put("is_addition", (String) request.getParameter("is_addition"));
        map.put("test_frequency", (String) request.getParameter("test_frequency"));
        map.put("test_items", (String) request.getParameter("test_items"));
        map.put("quality_target", (String) request.getParameter("quality_target"));
        map.put("loc_lon_d", (String) request.getParameter("loc_lon_d"));
        map.put("loc_lon_m", (String) request.getParameter("loc_lon_m"));
        map.put("loc_lon_s", (String) request.getParameter("loc_lon_s"));
        map.put("loc_lat_d", (String) request.getParameter("loc_lat_d"));
        map.put("loc_lat_m", (String) request.getParameter("loc_lat_m"));
        map.put("loc_lat_s", (String) request.getParameter("loc_lat_s"));

        map.put("loc_lon", (String) request.getParameter("loc_lon"));
        map.put("loc_lat", (String) request.getParameter("loc_lat"));

        map.put("username", (String) request.getSession().getAttribute("userName"));

        if (request.getParameter("id") != null) {
            map.put("id", (String) request.getParameter("id"));
        }

        String pageNow = request.getParameter("pageNow");
        List<Qmp> list = qmpService.searchByPage(pageNow, map);
        Page page = qmpService.getSearchPage(pageNow, map);

        m.addObject("list", list);
        m.addObject("page", page);
        m.setViewName("qmp/qmpList_S");
        return m;
    }

    @RequestMapping("/searchQmpBaeInfo")
    @ResponseBody
    public ModelAndView searchQmpBaeInfo(HttpServletRequest request, ModelAndView m) {
        Map map = new HashMap();

        map.put("section_level", (String) request.getParameter("section_level"));
        map.put("ykh_108", (String) request.getParameter("ykh_108"));
        map.put("hlsz_90", (String) request.getParameter("hlsz_90"));
        map.put("original_id", (String) request.getParameter("original_id"));
        map.put("loc_province", (String) request.getParameter("loc_province"));
        map.put("loc_city", (String) request.getParameter("loc_city"));
        map.put("loc_district", (String) request.getParameter("loc_district"));
        map.put("cz_name", (String) request.getParameter("cz_name"));
        map.put("section_name", (String) request.getParameter("section_name"));
        map.put("basin", (String) request.getParameter("basin"));
        map.put("river_name", (String) request.getParameter("river_name"));
        map.put("section_sx", (String) request.getParameter("section_sx"));
        map.put("river_level", (String) request.getParameter("river_level"));
        map.put("sksk", (String) request.getParameter("sksk"));
        map.put("longitude", (String) request.getParameter("longitude"));
        map.put("latitude", (String) request.getParameter("latitude"));


        map.put("username", (String) request.getSession().getAttribute("userName"));

        if (request.getParameter("id") != null) {
            map.put("id", (String) request.getParameter("id"));
        }

        String pageNow = request.getParameter("pageNow");
        List<QmpBaseInfo> list = qmpBaseInfoService.searchByPage(pageNow, map);
        System.out.println(list);
        Page page = qmpBaseInfoService.getSearchPage(pageNow, map);

        m.addObject("list", list);
        m.addObject("page", page);
        m.setViewName("qmp/qmpBasList_S");
        return m;
    }

    @RequestMapping("/searchSzxz")
    @ResponseBody
    public ModelAndView searchSzxz(HttpServletRequest request, ModelAndView m) {
        Map map = new HashMap();

        map.put("year", (String) request.getParameter("year"));
        map.put("month", (String) request.getParameter("month"));
        map.put("section_bm", (String) request.getParameter("section_bm"));
        map.put("section_name", (String) request.getParameter("section_name"));
        map.put("loc_city", (String) request.getParameter("loc_city"));
        map.put("loc_river", (String) request.getParameter("loc_river"));
        map.put("ddl", (String) request.getParameter("ddl"));
        map.put("water_temperature", (String) request.getParameter("water_temperature"));
        map.put("ph", (String) request.getParameter("ph"));
        map.put("rjy", (String) request.getParameter("rjy"));
        map.put("tmd", (String) request.getParameter("tmd"));
        map.put("yd", (String) request.getParameter("yd"));
        map.put("cod_mn", (String) request.getParameter("cod_mn"));
        map.put("cod_cr", (String) request.getParameter("cod_cr"));
        map.put("nh_n", (String) request.getParameter("nh_n"));
        map.put("t_p", (String) request.getParameter("t_p"));
        map.put("t_n", (String) request.getParameter("t_n"));
        map.put("cu", (String) request.getParameter("cu"));
        map.put("zu", (String) request.getParameter("zu"));
        map.put("pb", (String) request.getParameter("pb"));
        map.put("cd", (String) request.getParameter("cd"));
        map.put("bod5", (String) request.getParameter("bod5"));
        map.put("t_as", (String) request.getParameter("t_as"));
        map.put("t_se", (String) request.getParameter("t_se"));
        map.put("t_hg", (String) request.getParameter("t_hg"));
        map.put("cr_6", (String) request.getParameter("cr_6"));
        map.put("f_", (String) request.getParameter("f_"));
        map.put("cn_", (String) request.getParameter("cn_"));
        map.put("hff", (String) request.getParameter("hff"));
        map.put("syl", (String) request.getParameter("syl"));
        map.put("las", (String) request.getParameter("las"));
        map.put("s2_", (String) request.getParameter("s2_"));
        map.put("chla", (String) request.getParameter("chla"));
        map.put("no3", (String) request.getParameter("no3"));
        map.put("no2", (String) request.getParameter("no2"));
        map.put("ll", (String) request.getParameter("ll"));
        map.put("sw", (String) request.getParameter("sw"));
        map.put("fdcjqbz", (String) request.getParameter("fdcjqbz"));
    /*map.put("loc_lon_d", (String) request.getParameter("loc_lon_d"));
    map.put("loc_lon_m", (String) request.getParameter("loc_lon_m"));
    map.put("loc_lon_s", (String) request.getParameter("loc_lon_s"));
    map.put("loc_lat_d", (String) request.getParameter("loc_lat_d"));
    map.put("loc_lat_m", (String) request.getParameter("loc_lat_m"));
    map.put("loc_lat_s", (String) request.getParameter("loc_lat_s"));*/

        map.put("username", (String) request.getSession().getAttribute("userName"));

        if (request.getParameter("id") != null) {
            map.put("id", (String) request.getParameter("id"));
        }

        String pageNow = request.getParameter("pageNow");
        List<QmpTestData> list = qmpService.searchByPageSzxz(pageNow, map);
        System.out.println(list);
        Page page = qmpService.getSearchPageSzxz(pageNow, map);

        m.addObject("list", list);
        m.addObject("page", page);
        m.setViewName("qmp/qmpTestList_S");
        return m;
    }

    @RequestMapping("/searchAllQmp")
    @ResponseBody
    public List<Qmp> searchAllQmp(HttpServletRequest request) {
        Map map = new HashMap();

        map.put("tjnf", (String) request.getParameter("tjnf"));
        map.put("watershed", (String) request.getParameter("watershed"));
        map.put("river_name", (String) request.getParameter("river_name"));
        map.put("river_level", (String) request.getParameter("river_level"));
        map.put("river_to", (String) request.getParameter("river_to"));
        map.put("section_name", (String) request.getParameter("section_name"));
        map.put("section_property", (String) request.getParameter("section_property"));
        map.put("loc_province", (String) request.getParameter("loc_province"));
        map.put("loc_city", (String) request.getParameter("loc_city"));
        map.put("loc_county", (String) request.getParameter("loc_county"));
        map.put("test_by", (String) request.getParameter("test_by"));
        map.put("section_level", (String) request.getParameter("section_level"));
        map.put("section_type", (String) request.getParameter("section_type"));
        map.put("is_urban", (String) request.getParameter("is_urban"));
        map.put("is_addition", (String) request.getParameter("is_addition"));
        map.put("test_frequency", (String) request.getParameter("test_frequency"));
        map.put("test_items", (String) request.getParameter("test_items"));
        map.put("quality_target", (String) request.getParameter("quality_target"));
        map.put("username", (String) request.getSession().getAttribute("userName"));

        map.put("section_dymc", (String) request.getParameter("section_dymc"));
        map.put("section_shhl", (String) request.getParameter("section_shhl"));

        if (request.getParameter("id") != null) {
            map.put("id", (String) request.getParameter("id"));
        }
        List<Qmp> allList = qmpService.selectForMap(map);
        return allList;
    }

    @RequestMapping("/searchQmpBaseInfo")
    @ResponseBody
    public List<QmpBaseInfo> searchQmpBaseInfo(HttpServletRequest request) {
        Map map = new HashMap();

        map.put("section_level", (String) request.getParameter("section_level"));
        map.put("ykh_108", (String) request.getParameter("ykh_108"));
        map.put("hlsz_90", (String) request.getParameter("hlsz_90"));
        map.put("original_id", (String) request.getParameter("original_id"));
        map.put("loc_province", (String) request.getParameter("loc_province"));
        map.put("loc_city", (String) request.getParameter("loc_city"));
        map.put("loc_district", (String) request.getParameter("loc_district"));
        map.put("cz_name", (String) request.getParameter("cz_name"));
        map.put("section_name", (String) request.getParameter("section_name"));
        map.put("basin", (String) request.getParameter("basin"));
        map.put("river_name", (String) request.getParameter("river_name"));
        map.put("section_sx", (String) request.getParameter("section_sx"));
        map.put("river_level", (String) request.getParameter("river_level"));
        map.put("sksk", (String) request.getParameter("sksk"));
        map.put("longitude", (String) request.getParameter("longitude"));
        map.put("latitude", (String) request.getParameter("latitude"));
        map.put("username", (String) request.getSession().getAttribute("userName"));
        if (request.getParameter("id") != null) {
            map.put("id", (String) request.getParameter("id"));
        }
        List<QmpBaseInfo> allList = qmpBaseInfoService.selectForMap(map);
        return allList;
    }


    @RequestMapping("/allQmp")
    @ResponseBody
    public List<Qmp> allQmp(HttpServletRequest request) {
        List<Qmp> list = qmpService.listAll();
        return list;
    }

    /**
     * 控制断面总量计算
     */
    @RequestMapping("/total")
    public String kzdmTotal(HttpServletRequest request, Model model) {
        Map map = new HashMap();

        map.put("section_bh", (String) request.getParameter("section_bh"));
        map.put("section_dybh", (String) request.getParameter("section_dybh"));
        map.put("section_dymc", (String) request.getParameter("section_dymc"));
        map.put("section_shhl", (String) request.getParameter("section_shhl"));

        map.put("tjnf", (String) request.getParameter("tjnf"));
        map.put("youkong", (String) request.getParameter("youkong"));
        map.put("watershed", (String) request.getParameter("watershed"));
        map.put("river_name", (String) request.getParameter("river_name"));
        map.put("river_level", (String) request.getParameter("river_level"));
        map.put("river_to", (String) request.getParameter("river_to"));
        map.put("section_name", (String) request.getParameter("section_name"));
        map.put("section_property", (String) request.getParameter("section_property"));
        map.put("loc_province", (String) request.getParameter("loc_province"));
        map.put("loc_city", (String) request.getParameter("loc_city"));
        map.put("loc_county", (String) request.getParameter("loc_county"));
        map.put("test_by", (String) request.getParameter("test_by"));
        map.put("section_level", (String) request.getParameter("section_level"));
        map.put("section_type", (String) request.getParameter("section_type"));
        map.put("is_urban", (String) request.getParameter("is_urban"));
        map.put("is_addition", (String) request.getParameter("is_addition"));
        map.put("test_frequency", (String) request.getParameter("test_frequency"));
        map.put("test_items", (String) request.getParameter("test_items"));
        map.put("loc_lon_d", (String) request.getParameter("loc_lon_d"));
        map.put("loc_lon_m", (String) request.getParameter("loc_lon_m"));
        map.put("loc_lon_s", (String) request.getParameter("loc_lon_s"));
        map.put("loc_lat_d", (String) request.getParameter("loc_lat_d"));
        map.put("loc_lat_m", (String) request.getParameter("loc_lat_m"));
        map.put("loc_lat_s", (String) request.getParameter("loc_lat_s"));

        map.put("username", (String) request.getSession().getAttribute("userName"));
        //System.out.println("优控："+map.get("youkong"));
        if (request.getParameter("id") != null) {
            map.put("id", (String) request.getParameter("id"));
        }
        System.out.println("优控" + map.get("youkong"));
        List<String> list_youkong = qmpService.searchQmp_youkong(map);
        String sy = request.getParameter("sy");

        String pageNow = request.getParameter("pageNow");
        String userName = (String) request.getSession().getAttribute("userName");
        Map<String, String> map_sy = new HashMap<String, String>();
        map_sy.put("sy", sy);

        List<Map<String, String>> list = constructKzdmInfo(pageNow, userName, map, map_sy, list_youkong, "KZDM", "loc_city", "loc_county");
        List<Map<String, String>> alllist = constructKzdmInfo(null, userName, map, map_sy, list_youkong, "KZDM", "loc_city", "loc_county");

        Page page = qmpService.getKzdmPage(pageNow, userName, map_sy, list_youkong);
        model.addAttribute("clist", list);
        model.addAttribute("alllist", alllist);
        model.addAttribute("page", page);
        return "qmp/kzdmSource";
    }

    public List<Map<String, String>>
    constructKzdmInfo(String pageNow, String userName, Map map, Map<String, String> map_sy, List<String> list_youkong,
                      String p1, String p2, String p3) {

        List<Map<String, String>> list = null;
        List<Map<String, String>> nlist = new ArrayList<Map<String, String>>();
        list = (pageNow != null ? qmpService.selectKzdmTotal(pageNow, userName, map_sy, list_youkong)
                : qmpService.selectKzdmAll(userName, map_sy, list_youkong));
        List<Qmp> list_kzdm = qmpService.selectForMap(map);
        //List<Map<String,String>> list_final = new LinkedList<Map<String,String>>();
        for (int i = 0; i < list.size(); i++) {
            String kzdm = list.get(i).get(p1);
            for (int j = 0; j < list_kzdm.size(); j++) {
                if (kzdm.equals(list_kzdm.get(j).getSectionName()) && (!kzdm.equals("兴安"))) {

                    list.get(i).put(p2, list_kzdm.get(j).getLocCity());
                    list.get(i).put(p3, list_kzdm.get(j).getLocCounty());
                    nlist.add(list.get(i));
                }
            }
        }


        return nlist;
    }

    /**
     * 控制断面总量计算
     */
    @RequestMapping("/totalpoll")
    @ResponseBody
    public List<Map<String, String>> kzdmpollTotal(HttpServletRequest request) {
        Map map = new HashMap();
        map.put("youkong", (String) request.getParameter("youkong"));
        map.put("username", (String) request.getSession().getAttribute("userName"));
        if (request.getParameter("id") != null) {
            map.put("id", (String) request.getParameter("id"));
        }
        List<String> list_youkong = qmpService.searchQmp_youkong(map);
        String sy = request.getParameter("sy");
        Map<String, String> map_sy = new HashMap<String, String>();
        map_sy.put("sy", sy);
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        String userName = (String) request.getSession().getAttribute("userName");
        list = qmpService.selectKzdmAll(userName, map_sy, list_youkong);
        List<Qmp> list_kzdm = qmpService.selectForMap(map);
        List<Map<String, String>> nlist = new ArrayList<Map<String, String>>();
        for (int i = 0; i < list.size(); i++) {
            String kzdm = list.get(i).get("KZDM");
            for (int j = 0; j < list_kzdm.size(); j++) {
                if (kzdm.equals(list_kzdm.get(j).getSectionName()) && (!kzdm.equals("兴安"))) {
                    list.get(i).put("loc_city", list_kzdm.get(j).getLocCity());
                    list.get(i).put("loc_county", list_kzdm.get(j).getLocCounty());
                    nlist.add(list.get(i));
                }
            }
        }
        return nlist;
    }

    /**
     * 控制断面总量选择
     */
    @RequestMapping("/selectTotal")
    public String selectTotal(HttpServletRequest request, String name, Model model) {
        Map map = new HashMap();

        map.put("section_bh", (String) request.getParameter("section_bh"));
        map.put("section_dybh", (String) request.getParameter("section_dybh"));
        map.put("section_dymc", (String) request.getParameter("section_dymc"));
        map.put("section_shhl", (String) request.getParameter("section_shhl"));

        map.put("tjnf", (String) request.getParameter("tjnf"));
        map.put("youkong", (String) request.getParameter("youkong"));
        map.put("watershed", (String) request.getParameter("watershed"));
        map.put("river_name", (String) request.getParameter("river_name"));
        map.put("river_level", (String) request.getParameter("river_level"));
        map.put("river_to", (String) request.getParameter("river_to"));
        map.put("section_name", (String) request.getParameter("section_name"));
        map.put("section_property", (String) request.getParameter("section_property"));
        map.put("loc_province", (String) request.getParameter("loc_province"));
        map.put("loc_city", (String) request.getParameter("loc_city"));
        map.put("loc_county", (String) request.getParameter("loc_county"));
        map.put("test_by", (String) request.getParameter("test_by"));
        map.put("section_level", (String) request.getParameter("section_level"));
        map.put("section_type", (String) request.getParameter("section_type"));
        map.put("is_urban", (String) request.getParameter("is_urban"));
        map.put("is_addition", (String) request.getParameter("is_addition"));
        map.put("test_frequency", (String) request.getParameter("test_frequency"));
        map.put("test_items", (String) request.getParameter("test_items"));
        map.put("loc_lon_d", (String) request.getParameter("loc_lon_d"));
        map.put("loc_lon_m", (String) request.getParameter("loc_lon_m"));
        map.put("loc_lon_s", (String) request.getParameter("loc_lon_s"));
        map.put("loc_lat_d", (String) request.getParameter("loc_lat_d"));
        map.put("loc_lat_m", (String) request.getParameter("loc_lat_m"));
        map.put("loc_lat_s", (String) request.getParameter("loc_lat_s"));

        map.put("username", (String) request.getSession().getAttribute("userName"));
        //System.out.println("优控："+map.get("youkong"));
        if (request.getParameter("id") != null) {
            map.put("id", (String) request.getParameter("id"));
        }
        try {
            name = URLDecoder.decode(name, "utf-8");
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(name);
        String pageNow = request.getParameter("pageNow");
        String userName = (String) request.getSession().getAttribute("userName");

        List<Map<String, String>> list = constructTotalInfo(pageNow, name, userName, map, "KZDM", "loc_city", "loc_county");
        List<Map<String, String>> alllist = constructTotalInfo(null, name, userName, map, "KZDM", "loc_city", "loc_county");

        Page page = qmpService.getKzdmPageByName(pageNow, name, userName);
        model.addAttribute("clist", list);
        model.addAttribute("alllist", alllist);
        model.addAttribute("page", page);
        return "qmp/kzdmSource";
    }

    public List<Map<String, String>>
    constructTotalInfo(String pageNow, String name, String userName, Map map, String p1, String p2, String p3) {

        List<Map<String, String>> list = null;
        list = (pageNow != null ? qmpService.selectKzdmTotalByName(pageNow, name, userName)
                : qmpService.selectKzdmAllByName(name, userName));
        List<Map<String, String>> nlist = new ArrayList<Map<String, String>>();
        List<Qmp> list_kzdm = qmpService.selectForMap(map);
        //List<Map<String,String>> list_final = new LinkedList<Map<String,String>>();
        for (int i = 0; i < list.size(); i++) {
            String kzdm = list.get(i).get(p1);
            for (int j = 0; j < list_kzdm.size(); j++) {
                if (kzdm.equals(list_kzdm.get(j).getSectionName())) {
                    list.get(i).put(p2, list_kzdm.get(j).getLocCity());
                    list.get(i).put(p3, list_kzdm.get(j).getLocCounty());
                    nlist.add(list.get(i));
                }
            }
        }
        return nlist;
    }

    /**
     * 定制计算控制断面总量
     */
    @RequestMapping("/compute")
    @ResponseBody
    public String compute(HttpServletRequest request, Model model) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("prop", (String) request.getParameter("prop"));
        map.put("kzdm", (String) request.getParameter("kzdm"));
        //System.out.println("prop"+map.get("prop"));
        String result = String.valueOf(qmpService.computeKzdmTotal(map));
        return result;
    }

    /**
     * 定制计算控制断面超标倍数
     */
    @RequestMapping("/compute_chaobiao")
    @ResponseBody
    public String compute_chaobiao(HttpServletRequest request, Model model) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("prop", (String) request.getParameter("prop_chaobiao"));
        map.put("kzdm", (String) request.getParameter("kzdm"));
        System.out.println("prop_chaobiao:" + map.get("prop"));
        System.out.println("kzdm:" + map.get("kzdm"));
        int i = qmpService.computeKzdmTotal(map);
        float j = (float) (qmpService.computeKzdmTotal_std(map) * 2.592);
        int result_std = (int) (i / j);
        String result = String.valueOf(result_std);
        return result;
    }

    /**
     * 断面补偿资金
     */
    @RequestMapping(value = "/dmbczj")
    public ModelAndView dmbczj(HttpServletRequest request, ModelAndView model) {
        /*
                "qysx": qysx 区域筛选
        "nf": nf 年份
        "start_month": start_month, 开始月份
        "end_month": end_month, 结束月份
         */
        String sql = "select count(*) from dmbczj";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        if (count == 0) {
            calcAll();
        }
        String qysx = request.getParameter("qysx");
        String nf = request.getParameter("nf");
        String start_month = request.getParameter("start_month");
        String end_month = request.getParameter("end_month");
        //String section_level = request.getParameter("section_level");
        String userName = (String) request.getSession().getAttribute("userName");
        String month;
        List<Map<String, String>> allList = null;
        List<Map<String, String>> allListPrese = new ArrayList<Map<String, String>>();
        Map<String, String> tempItem = null;
        if (start_month.toString().equals(end_month.toString())) {
            month = start_month;
            allList = qmpService.selectDmbczjByYearAndMonth(qysx, nf, month, userName);

        } else {
            allList = qmpService.selectDmbczjByYearBetweenMonth(qysx, nf, start_month, end_month, userName);
        }
        String content;
        for (Map<String, String> item : allList) {
            tempItem = item;
            System.out.println(item);
            System.out.println(item.get("cbxm"));
            if (item.get("cbxm").equals("")) {
                continue;
            } else {
                allListPrese.add(tempItem);
            }
        }
        FILTERLIST = allListPrese;
        model.addObject("qmp_list", allListPrese);
        request.getSession().setAttribute("dmbczj", allListPrese);
        model.setViewName("qmp/qmpZijinCount_S");
        System.out.println(model);
        return model;
    }


    /**
     * 断面水质识别
     */
    @RequestMapping("/szsb")
    @ResponseBody
    public List<QmpWrxx> szsb(HttpServletRequest request, Model model) {
        String szsb_month = request.getParameter("szsb_month");
        String szsb_type = request.getParameter("szsb_type");
        String userName = (String) request.getSession().getAttribute("userName");
        List<QmpWrxx> allList = qmpService.searchQmpWrxx(szsb_month, userName);

        return allList;
    }

    @RequestMapping("/szlb")
    @ResponseBody
    public List<Map<String, String>> szlb(HttpServletRequest request, HttpServletResponse response, ModelAndView model) {
        String region = request.getParameter("region");
        String year = request.getParameter("year");
        String start_m = request.getParameter("start_m");
        String end_m = request.getParameter("end_m");
        String level = request.getParameter("level");
        List<Map<String, String>> result = new ArrayList<>();

        if ("all".equals(region)) {//该用户下辖所有市
            List<String> regions = getRegions(request.getSession().getAttribute("userName").toString());
            for (String reg : regions) {//遍历下辖市
                getRegionDmResults(year, start_m, end_m, result, reg, level);
            }
        } else {//指定市
//            Map<String, String> category_info = countCategory("小渔场", 3, "2018");
            getRegionDmResults(year, start_m, end_m, result, region, level);
        }
        //在已取出的result中，取出断面名称，与baseinfo比较，若一致，则加入坐标
        System.out.println(result);
        return result;
    }


    @RequestMapping("/filter")
    @ResponseBody
    public List<Map<String, String>> filter(HttpServletRequest request, HttpServletResponse response, ModelAndView model) {
        String region = request.getParameter("region");
        String year = request.getParameter("year");
        String start_m = request.getParameter("start_m");
        String end_m = request.getParameter("end_m");
//    for()
//    List<Map<String, String>> result = new ArrayList<>();

//    if ("all".equals(region)) {//该用户下辖所有市
//      List<String> regions = getRegions(request.getSession().getAttribute("userName").toString());
//      for (String reg : regions) {//遍历下辖市
//        getRegionDmResults(year, start_m, end_m, result, reg);
//      }
//    } else {//指定市
//           Map<String, String> category_info = countCategory("小渔场", 3, "2018");
//      getRegionDmResults(year, start_m, end_m, result, region);
//    }
//    //在已取出的result中，取出断面名称，与baseinfo比较，若一致，则加入坐标
//    System.out.println(result);
        System.out.println("**************************");
        System.out.println(FILTERLIST);
        System.out.println("**************************");
        return FILTERLIST;
    }


    public String getFileUploadName() {
        return fileUploadName;
    }

    public void setFileUploadName(String fileUploadName) {
        this.fileUploadName = fileUploadName;
    }

    /**
     * 保存数据
     */
    private String fileUploadName;

    public String getFileUploadPath() {
        return fileUploadPath;
    }

    public void setFileUploadPath(String fileUploadPath) {
        this.fileUploadPath = fileUploadPath;
    }

    private String fileUploadPath;

    public String getFileUploadTime() {
        return fileUploadTime;
    }

    public void setFileUploadTime(String fileUploadTime) {
        this.fileUploadTime = fileUploadTime;
    }

    private String fileUploadTime;

    @RequestMapping("/fileUpload")
    @ResponseBody
    public String fileUpload(HttpServletRequest request) throws Exception {
//        QmpController qmp = new QmpController();
        Map<String, Object> err = new HashMap<String, Object>();
        err.put("status", "myerror");
        Gson gson = new Gson();
        long startTime = System.currentTimeMillis();
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        String dir = request.getSession().getServletContext().getRealPath("upload/qmp");

        if (multipartResolver.isMultipart(request)) {

            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            Iterator<?> iter = multiRequest.getFileNames();
            while (iter.hasNext()) {

                MultipartFile file = multiRequest.getFile(iter.next().toString());
                String path = "";
                String filename_forPath = "\\";

                if (file != null) {
                    String TIME = new SimpleDateFormat("yyyyMMddHHmmss").format(Calendar.getInstance().getTime());
                    this.setFileUploadTime(TIME);
                    String[] fopt = file.getOriginalFilename().split("\\.");
                    System.out.println("orifilename:");
                    System.out.println(file.getOriginalFilename());
                    fopt[1] = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
                    filename_forPath += fopt[0] + '_' + TIME + '.' + fopt[1];
                    String filename = fopt[0] + '_' + TIME + '.' + fopt[1];
                    this.setFileUploadName(filename);
                    System.out.println("filename:");
                    System.out.println(filename);
                    path = dir + filename_forPath;
                    this.setFileUploadPath(path);
                    System.out.println("path:");
                    System.out.println(path);
                    File newFile = new File(path);
                    //上传
                    file.transferTo(newFile);

                } else {

                }
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("上传花费时间：" + String.valueOf(endTime - startTime) + "ms");

        Map<String, Object> result = new HashMap<String, Object>();
        result.put("status", "success");

        return gson.toJson(result);
    }

    @RequestMapping("/bulkImport")
    @ResponseBody
    public String bulkImport(HttpServletRequest request) throws Exception {
        long startTime = System.currentTimeMillis();
        String oriFileName = request.getParameter("name");
        String fileName = this.getFileUploadName();
        String filePath = this.getFileUploadPath();
        String fileUploadTime = this.getFileUploadTime();

        String msg = poiExcel.poiExceltoSql(oriFileName, fileName, filePath, fileUploadTime);
        String[] message = msg.split(" ");
        long endTime = System.currentTimeMillis();
        String timeCost = String.valueOf(endTime - startTime) + "ms";
        System.out.println("批量导入花费时间：" + timeCost);
        Gson gson = new Gson();
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("msg", message[0]);
        result.put("updateCount", message[1]);
        result.put("insertCount", message[2]);
        System.out.println(message[0]);
        System.out.println(message[1]);
        System.out.println(message[2]);
        result.put("time", timeCost);
        return gson.toJson(result);

    }

    @RequestMapping("/bulkImportSzxz")
    @ResponseBody
    public String bulkImportSzxz(HttpServletRequest request) throws Exception {
        poiExcelSzxz poiExcelSzxz = new poiExcelSzxz();
        //String fileType = this.getFileType();
        long startTime = System.currentTimeMillis();
        String oriFileName = request.getParameter("name");
        String fileName = this.getFileUploadName();
        String filePath = this.getFileUploadPath();
        String fileUploadTime = this.getFileUploadTime();

        String msg = poiExcelSzxz.poiExceltoSql(oriFileName, fileName, filePath, fileUploadTime);
        String[] message = msg.split(" ");
        long endTime = System.currentTimeMillis();
        String timeCost = String.valueOf(endTime - startTime) + "ms";
        System.out.println("批量导入花费时间：" + timeCost);
        Gson gson = new Gson();
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("msg", message[0]);
        result.put("updateCount", message[1]);
        result.put("insertCount", message[2]);
        System.out.println(message[0]);
        System.out.println(message[1]);
        System.out.println(message[2]);
        result.put("time", timeCost);
        return gson.toJson(result);

    }


    @RequestMapping("/bulkImportBas")
    @ResponseBody
    public String bulkImportBas(HttpServletRequest request) throws Exception {
        poiExcelBas poiExcelBas = new poiExcelBas();
        //String fileType = this.getFileType();
        long startTime = System.currentTimeMillis();
        String oriFileName = request.getParameter("name");
        String fileName = this.getFileUploadName();
        String filePath = this.getFileUploadPath();
        String fileUploadTime = this.getFileUploadTime();

        String msg = poiExcelBas.poiExceltoSql(oriFileName, fileName, filePath, fileUploadTime);
        String[] message = msg.split(" ");
        long endTime = System.currentTimeMillis();
        String timeCost = String.valueOf(endTime - startTime) + "ms";
        System.out.println("批量导入花费时间：" + timeCost);
        Gson gson = new Gson();
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("msg", message[0]);
        result.put("updateCount", message[1]);
        result.put("insertCount", message[2]);
        System.out.println(message[0]);
        System.out.println(message[1]);
        System.out.println(message[2]);
        result.put("time", timeCost);
        return gson.toJson(result);

    }

    @RequestMapping("/bulkImportSzxzPanduan")
    @ResponseBody
    public ArrayList<String> bulkImportSzxzPanduan(HttpServletRequest request) throws Exception {
        poiExcelSzxz poiExcelSzxz = new poiExcelSzxz();
        //String fileType = this.getFileType();
        long startTime = System.currentTimeMillis();
        String oriFileName = request.getParameter("name");
        String fileName = this.getFileUploadName();
        String filePath = this.getFileUploadPath();
        String fileUploadTime = this.getFileUploadTime();

        ArrayList<String> sectionList = poiExcelSzxz.poiExceltoSqlPanduan(oriFileName, fileName, filePath, fileUploadTime);
        //String[] message = msg.split(" ");
        //long endTime = System.currentTimeMillis();
        //String timeCost = String.valueOf(endTime - startTime) + "ms";
        //System.out.println("批量导入花费时间：" + timeCost);
        //Gson gson = new Gson();
        //Map<String, Object> result = new HashMap<String, Object>();
        //result.put("msg", message[0]);
        //result.put("updateCount", message[1]);
        //result.put("insertCount", message[2]);
        //System.out.println(message[0]);
        //System.out.println(message[1]);
        //System.out.println(message[2]);
        //result.put("time", timeCost);
        System.out.println(sectionList);
        return sectionList;

    }

    @RequestMapping("/bulkImportBasPanduan")
    @ResponseBody
    public ArrayList<String> bulkImportBasPanduan(HttpServletRequest request) throws Exception {
        poiExcelBas poiExcelBas = new poiExcelBas();
        //String fileType = this.getFileType();
        long startTime = System.currentTimeMillis();
        String oriFileName = request.getParameter("name");
        String fileName = this.getFileUploadName();
        String filePath = this.getFileUploadPath();
        String fileUploadTime = this.getFileUploadTime();

        ArrayList<String> sectionList = poiExcelBas.poiExceltoSqlPanduan(oriFileName, fileName, filePath, fileUploadTime);
        //String[] message = msg.split(" ");
        //long endTime = System.currentTimeMillis();
        //String timeCost = String.valueOf(endTime - startTime) + "ms";
        //System.out.println("批量导入花费时间：" + timeCost);
        //Gson gson = new Gson();
        //Map<String, Object> result = new HashMap<String, Object>();
        //result.put("msg", message[0]);
        //result.put("updateCount", message[1]);
        //result.put("insertCount", message[2]);
        //System.out.println(message[0]);
        //System.out.println(message[1]);
        //System.out.println(message[2]);
        //result.put("time", timeCost);
        System.out.println(sectionList);
        return sectionList;

    }


    @RequestMapping(value = "/getInitialExtent")
    public void getInitialExtent(HttpServletRequest request, HttpServletResponse response) {
        String rolename = roleService.getRoleNameByUname(request.getParameter("username").trim());
        if (rolename.contains("_")) {
            rolename = rolename.substring(0, rolename.indexOf("_"));
        }
        System.out.println("rolenameya:" + rolename);
        String result = "";
        switch (rolename.trim()) {
            case "admin":
                result = "117.309229,39.137731,129.957720,43.380153";
                break;
            case "辽宁":
                result = "117.309229,39.137731,129.957720,43.380153";
                break;
            case "沈阳":
                result = "120.344180,41.038634,126.162792,43.148180";
                break;
            case "大连":
                result = "120.304673,38.684751,124.589340,40.245249";
                break;
            case "鞍山":
                result = "120.654886,40.025895,125.149073,41.654445";
                break;
            case "抚顺":
                result = "122.925499,41.209812,126.512294,42.482913";
                break;
            case "本溪":
                result = "123.398631,40.740022,125.936511,41.637172";
                break;
            case "丹东":
                result = "122.309634,39.673381,126.586062,41.213798";
                break;
            case "锦州":
                result = "119.431423,40.729618,123.581508,42.211277";
                break;
            case "营口":
                result = "120.694250,39.753728,124.190971,41.048150";
                break;
            case "阜新":
                result = "119.195495,41.535575,124.155844,43.299593";
                break;
            case "辽阳":
                result = "121.430973,40.460256,125.309147,41.800736";
                break;
            case "盘锦":
                result = "120.835854,40.610362,123.252882,41.494596";
                break;
            case "铁岭":
                result = "121.683328,41.840331,126.582710,43.573067";
                break;
            case "朝阳":
                result = "117.205270,40.391405,123.074377,42.504821";
                break;
            case "葫芦岛":
                result = "118.172417,39.834530,122.336235,41.369228";
                break;
        }
        try {
            response.getWriter().write(result.trim());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/searchYoukong")
    @ResponseBody
    public ModelAndView searchYoukong(HttpServletRequest request, ModelAndView m) {
        Map map = new HashMap();

        map.put("section_bh", (String) request.getParameter("section_bh"));
        map.put("section_dybh", (String) request.getParameter("section_dybh"));
        map.put("section_dymc", (String) request.getParameter("section_dymc"));
        map.put("section_shhl", (String) request.getParameter("section_shhl"));

        map.put("tjnf", (String) request.getParameter("tjnf"));
        map.put("youkong", (String) request.getParameter("youkong"));
        map.put("watershed", (String) request.getParameter("watershed"));
        map.put("river_name", (String) request.getParameter("river_name"));
        map.put("river_level", (String) request.getParameter("river_level"));
        map.put("river_to", (String) request.getParameter("river_to"));
        map.put("section_name", (String) request.getParameter("section_name"));
        map.put("section_property", (String) request.getParameter("section_property"));
        map.put("loc_province", (String) request.getParameter("loc_province"));
        map.put("loc_city", (String) request.getParameter("loc_city"));
        map.put("loc_county", (String) request.getParameter("loc_county"));
        map.put("test_by", (String) request.getParameter("test_by"));
        map.put("section_level", (String) request.getParameter("section_level"));
        map.put("section_type", (String) request.getParameter("section_type"));
        map.put("is_urban", (String) request.getParameter("is_urban"));
        map.put("is_addition", (String) request.getParameter("is_addition"));
        map.put("test_frequency", (String) request.getParameter("test_frequency"));
        map.put("test_items", (String) request.getParameter("test_items"));
        map.put("loc_lon_d", (String) request.getParameter("loc_lon_d"));
        map.put("loc_lon_m", (String) request.getParameter("loc_lon_m"));
        map.put("loc_lon_s", (String) request.getParameter("loc_lon_s"));
        map.put("loc_lat_d", (String) request.getParameter("loc_lat_d"));
        map.put("loc_lat_m", (String) request.getParameter("loc_lat_m"));
        map.put("loc_lat_s", (String) request.getParameter("loc_lat_s"));

        map.put("username", (String) request.getSession().getAttribute("userName"));

        if (request.getParameter("id") != null) {
            map.put("id", (String) request.getParameter("id"));
        }

        String pageNow = request.getParameter("pageNow");
        List<Qmp> list = qmpService.searchByPage_youkong(pageNow, map);
        Page page = qmpService.getSearchPage_youkong(pageNow, map);

        m.addObject("list", list);
        m.addObject("page", page);
        m.setViewName("qmp/qmpList_YK");
        return m;
    }

    /**
     * 畜禽养殖控制断面总量计算
     */
    @RequestMapping("/yangZhiTotal")
    public String kzdmYangZhiTotal(HttpServletRequest request, Model model) {
        Map map = new HashMap();

        map.put("section_bh", (String) request.getParameter("section_bh"));
        map.put("section_dybh", (String) request.getParameter("section_dybh"));
        map.put("section_dymc", (String) request.getParameter("section_dymc"));
        map.put("section_shhl", (String) request.getParameter("section_shhl"));

        map.put("tjnf", (String) request.getParameter("tjnf"));
        map.put("youkong", (String) request.getParameter("youkong"));
        map.put("watershed", (String) request.getParameter("watershed"));
        map.put("river_name", (String) request.getParameter("river_name"));
        map.put("river_level", (String) request.getParameter("river_level"));
        map.put("river_to", (String) request.getParameter("river_to"));
        map.put("section_name", (String) request.getParameter("section_name"));
        map.put("section_property", (String) request.getParameter("section_property"));
        map.put("loc_province", (String) request.getParameter("loc_province"));
        map.put("loc_city", (String) request.getParameter("loc_city"));
        map.put("loc_county", (String) request.getParameter("loc_county"));
        map.put("test_by", (String) request.getParameter("test_by"));
        map.put("section_level", (String) request.getParameter("section_level"));
        map.put("section_type", (String) request.getParameter("section_type"));
        map.put("is_urban", (String) request.getParameter("is_urban"));
        map.put("is_addition", (String) request.getParameter("is_addition"));
        map.put("test_frequency", (String) request.getParameter("test_frequency"));
        map.put("test_items", (String) request.getParameter("test_items"));
        map.put("loc_lon_d", (String) request.getParameter("loc_lon_d"));
        map.put("loc_lon_m", (String) request.getParameter("loc_lon_m"));
        map.put("loc_lon_s", (String) request.getParameter("loc_lon_s"));
        map.put("loc_lat_d", (String) request.getParameter("loc_lat_d"));
        map.put("loc_lat_m", (String) request.getParameter("loc_lat_m"));
        map.put("loc_lat_s", (String) request.getParameter("loc_lat_s"));

        map.put("username", (String) request.getSession().getAttribute("userName"));
        //System.out.println("优控："+map.get("youkong"));
        if (request.getParameter("id") != null) {
            map.put("id", (String) request.getParameter("id"));
        }
        System.out.println("优控" + map.get("youkong"));
        List<String> list_youkong = qmpService.searchQmp_youkong(map);
        String sy = request.getParameter("sy");
        Map<String, String> map_sy = new HashMap<String, String>();
        map_sy.put("sy", sy);
        String pageNow = request.getParameter("pageNow");
        String userName = (String) request.getSession().getAttribute("userName");

        List<Map<String, String>> list = constructYangZhiInfo(pageNow, userName, map, map_sy, list_youkong,
                "KZDM", "loc_city", "loc_country");
        List<Map<String, String>> alllist = constructYangZhiInfo(null, userName, map, map_sy, list_youkong,
                "KZDM", "loc_city", "loc_country");

        Page page = qmpService.getKzdmYangZhiPage(pageNow, userName, map_sy, list_youkong);
        model.addAttribute("clist", list);
        model.addAttribute("alllist", alllist);
        model.addAttribute("page", page);
        return "qmp/kzdmYangZhi";
    }

    public List<Map<String, String>>
    constructYangZhiInfo(String pageNow, String userName, Map map, Map<String, String> map_sy, List<String> list_youkong,
                         String p1, String p2, String p3) {

        List<Map<String, String>> list = null;
        list = (pageNow != null ? qmpService.selectKzdmYangZhiTotal(pageNow, userName, map_sy, list_youkong)
                : qmpService.selectKzdmYangZhiAll(userName, map_sy, list_youkong));
        List<Map<String, String>> nlist = new ArrayList<Map<String, String>>();
        List<Qmp> list_kzdm = qmpService.selectForMap(map);
        //List<Map<String,String>> list_final = new LinkedList<Map<String,String>>();
        for (int i = 0; i < list.size(); i++) {
            String kzdm = list.get(i).get(p1);
            for (int j = 0; j < list_kzdm.size(); j++) {
                if (kzdm.equals(list_kzdm.get(j).getSectionName()) && (!kzdm.equals("兴安"))) {
                    list.get(i).put(p2, list_kzdm.get(j).getLocCity());
                    list.get(i).put(p3, list_kzdm.get(j).getLocCounty());
                    nlist.add(list.get(i));
                }
            }
        }
        return nlist;
    }


    /**
     * 畜禽养殖控制断面总量选择
     */
    @RequestMapping("/selectYangZhiTotal")
    public String selectYangZhiTotal(HttpServletRequest request, String name, Model model) {
        Map map = new HashMap();

        map.put("section_bh", (String) request.getParameter("section_bh"));
        map.put("section_dybh", (String) request.getParameter("section_dybh"));
        map.put("section_dymc", (String) request.getParameter("section_dymc"));
        map.put("section_shhl", (String) request.getParameter("section_shhl"));

        map.put("tjnf", (String) request.getParameter("tjnf"));
        map.put("youkong", (String) request.getParameter("youkong"));
        map.put("watershed", (String) request.getParameter("watershed"));
        map.put("river_name", (String) request.getParameter("river_name"));
        map.put("river_level", (String) request.getParameter("river_level"));
        map.put("river_to", (String) request.getParameter("river_to"));
        map.put("section_name", (String) request.getParameter("section_name"));
        map.put("section_property", (String) request.getParameter("section_property"));
        map.put("loc_province", (String) request.getParameter("loc_province"));
        map.put("loc_city", (String) request.getParameter("loc_city"));
        map.put("loc_county", (String) request.getParameter("loc_county"));
        map.put("test_by", (String) request.getParameter("test_by"));
        map.put("section_level", (String) request.getParameter("section_level"));
        map.put("section_type", (String) request.getParameter("section_type"));
        map.put("is_urban", (String) request.getParameter("is_urban"));
        map.put("is_addition", (String) request.getParameter("is_addition"));
        map.put("test_frequency", (String) request.getParameter("test_frequency"));
        map.put("test_items", (String) request.getParameter("test_items"));
        map.put("loc_lon_d", (String) request.getParameter("loc_lon_d"));
        map.put("loc_lon_m", (String) request.getParameter("loc_lon_m"));
        map.put("loc_lon_s", (String) request.getParameter("loc_lon_s"));
        map.put("loc_lat_d", (String) request.getParameter("loc_lat_d"));
        map.put("loc_lat_m", (String) request.getParameter("loc_lat_m"));
        map.put("loc_lat_s", (String) request.getParameter("loc_lat_s"));

        map.put("username", (String) request.getSession().getAttribute("userName"));
        //System.out.println("优控："+map.get("youkong"));
        if (request.getParameter("id") != null) {
            map.put("id", (String) request.getParameter("id"));
        }
        try {
            name = URLDecoder.decode(name, "utf-8");
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(name);
        String pageNow = request.getParameter("pageNow");
        String userName = (String) request.getSession().getAttribute("userName");
        List<Map<String, String>> list = constructYangZhiByNameInfo(pageNow, userName, name, map, "KZDM", "loc_city", "loc_country");
        List<Map<String, String>> alllist = constructYangZhiByNameInfo(null, userName, name, map, "KZDM", "loc_city", "loc_country");

        Page page = qmpService.getKzdmYangZhiPageByName(pageNow, name, userName);
        model.addAttribute("clist", list);
        model.addAttribute("alllist", alllist);
        model.addAttribute("page", page);
        return "qmp/kzdmYangZhi";
    }


    public List<Map<String, String>>
    constructYangZhiByNameInfo(String pageNow, String userName, String name, Map map, String p1, String p2, String p3) {

        List<Map<String, String>> list = null;
        list = (pageNow != null ? qmpService.selectKzdmYangZhiTotalByName(pageNow, name, userName)
                : qmpService.selectKzdmYangZhiAllByName(name, userName));

        List<Qmp> list_kzdm = qmpService.selectForMap(map);
        List<Map<String, String>> nlist = new ArrayList<Map<String, String>>();
        //List<Map<String,String>> list_final = new LinkedList<Map<String,String>>();
        for (int i = 0; i < list.size(); i++) {
            String kzdm = list.get(i).get(p1);
            for (int j = 0; j < list_kzdm.size(); j++) {
                if (kzdm.equals(list_kzdm.get(j).getSectionName()) && (!kzdm.equals("兴安"))) {
                    list.get(i).put(p2, list_kzdm.get(j).getLocCity());
                    list.get(i).put(p3, list_kzdm.get(j).getLocCounty());
                    nlist.add(list.get(i));
                }
            }
        }
        return nlist;
    }


    /**
     * 污水处理厂控制断面总量计算
     */
    @RequestMapping("/factoryTotal")
    public String kzdmFactoryTotal(HttpServletRequest request, Model model) {
        Map map = new HashMap();

        map.put("section_bh", (String) request.getParameter("section_bh"));
        map.put("section_dybh", (String) request.getParameter("section_dybh"));
        map.put("section_dymc", (String) request.getParameter("section_dymc"));
        map.put("section_shhl", (String) request.getParameter("section_shhl"));

        map.put("tjnf", (String) request.getParameter("tjnf"));
        map.put("youkong", (String) request.getParameter("youkong"));
        map.put("watershed", (String) request.getParameter("watershed"));
        map.put("river_name", (String) request.getParameter("river_name"));
        map.put("river_level", (String) request.getParameter("river_level"));
        map.put("river_to", (String) request.getParameter("river_to"));
        map.put("section_name", (String) request.getParameter("section_name"));
        map.put("section_property", (String) request.getParameter("section_property"));
        map.put("loc_province", (String) request.getParameter("loc_province"));
        map.put("loc_city", (String) request.getParameter("loc_city"));
        map.put("loc_county", (String) request.getParameter("loc_county"));
        map.put("test_by", (String) request.getParameter("test_by"));
        map.put("section_level", (String) request.getParameter("section_level"));
        map.put("section_type", (String) request.getParameter("section_type"));
        map.put("is_urban", (String) request.getParameter("is_urban"));
        map.put("is_addition", (String) request.getParameter("is_addition"));
        map.put("test_frequency", (String) request.getParameter("test_frequency"));
        map.put("test_items", (String) request.getParameter("test_items"));
        map.put("loc_lon_d", (String) request.getParameter("loc_lon_d"));
        map.put("loc_lon_m", (String) request.getParameter("loc_lon_m"));
        map.put("loc_lon_s", (String) request.getParameter("loc_lon_s"));
        map.put("loc_lat_d", (String) request.getParameter("loc_lat_d"));
        map.put("loc_lat_m", (String) request.getParameter("loc_lat_m"));
        map.put("loc_lat_s", (String) request.getParameter("loc_lat_s"));

        map.put("username", (String) request.getSession().getAttribute("userName"));
        //System.out.println("优控："+map.get("youkong"));
        if (request.getParameter("id") != null) {
            map.put("id", (String) request.getParameter("id"));
        }
        System.out.println("优控" + map.get("youkong"));
        List<String> list_youkong = qmpService.searchQmp_youkong(map);
        String sy = request.getParameter("sy");
        Map<String, String> map_sy = new HashMap<String, String>();
        map_sy.put("sy", sy);
        String pageNow = request.getParameter("pageNow");
        String userName = (String) request.getSession().getAttribute("userName");

        List<Map<String, String>> list = constructFactoryTotal(pageNow, userName, map, map_sy, list_youkong);
        List<Map<String, String>> alllist = constructFactoryTotal(null, userName, map, map_sy, list_youkong);

        Page page = qmpService.getKzdmFactoryPage(pageNow, userName, map_sy, list_youkong);
        model.addAttribute("clist", list);
        model.addAttribute("alllist", alllist);
        model.addAttribute("page", page);
        return "qmp/kzdmFactory";
    }

    public List<Map<String, String>>
    constructFactoryTotal(String pageNow, String userName, Map map, Map<String, String> map_sy, List<String> list_youkong) {

        List<Map<String, String>> list = null;
        list = (pageNow != null ? qmpService.selectKzdmFactoryTotal(pageNow, userName, map_sy, list_youkong) : qmpService.selectKzdmFactoryAll(userName, map_sy, list_youkong));
        List<Qmp> list_kzdm = qmpService.selectForMap(map);
        //List<Map<String,String>> list_final = new LinkedList<Map<String,String>>();
        List<Map<String, String>> nlist = new ArrayList<Map<String, String>>();
        for (int i = 0; i < list.size(); i++) {
            String kzdm = list.get(i).get("KZDM");
            for (int j = 0; j < list_kzdm.size(); j++) {
                if (kzdm.equals(list_kzdm.get(j).getSectionName()) && (!kzdm.equals("兴安"))) {
                    list.get(i).put("loc_city", list_kzdm.get(j).getLocCity());
                    list.get(i).put("loc_county", list_kzdm.get(j).getLocCounty());
                    nlist.add(list.get(i));
                }
            }
        }
        return nlist;
    }

    /**
     * 污水处理厂控制断面总量选择
     */
    @RequestMapping("/selectFactoryTotal")
    public String selectFactoryTotal(HttpServletRequest request, String name, Model model) {
        Map map = new HashMap();

        map.put("section_bh", (String) request.getParameter("section_bh"));
        map.put("section_dybh", (String) request.getParameter("section_dybh"));
        map.put("section_dymc", (String) request.getParameter("section_dymc"));
        map.put("section_shhl", (String) request.getParameter("section_shhl"));


        map.put("tjnf", (String) request.getParameter("tjnf"));
        map.put("youkong", (String) request.getParameter("youkong"));
        map.put("watershed", (String) request.getParameter("watershed"));
        map.put("river_name", (String) request.getParameter("river_name"));
        map.put("river_level", (String) request.getParameter("river_level"));
        map.put("river_to", (String) request.getParameter("river_to"));
        map.put("section_name", (String) request.getParameter("section_name"));
        map.put("section_property", (String) request.getParameter("section_property"));
        map.put("loc_province", (String) request.getParameter("loc_province"));
        map.put("loc_city", (String) request.getParameter("loc_city"));
        map.put("loc_county", (String) request.getParameter("loc_county"));
        map.put("test_by", (String) request.getParameter("test_by"));
        map.put("section_level", (String) request.getParameter("section_level"));
        map.put("section_type", (String) request.getParameter("section_type"));
        map.put("is_urban", (String) request.getParameter("is_urban"));
        map.put("is_addition", (String) request.getParameter("is_addition"));
        map.put("test_frequency", (String) request.getParameter("test_frequency"));
        map.put("test_items", (String) request.getParameter("test_items"));
        map.put("loc_lon_d", (String) request.getParameter("loc_lon_d"));
        map.put("loc_lon_m", (String) request.getParameter("loc_lon_m"));
        map.put("loc_lon_s", (String) request.getParameter("loc_lon_s"));
        map.put("loc_lat_d", (String) request.getParameter("loc_lat_d"));
        map.put("loc_lat_m", (String) request.getParameter("loc_lat_m"));
        map.put("loc_lat_s", (String) request.getParameter("loc_lat_s"));

        map.put("username", (String) request.getSession().getAttribute("userName"));
        //System.out.println("优控："+map.get("youkong"));
        if (request.getParameter("id") != null) {
            map.put("id", (String) request.getParameter("id"));
        }
        try {
            name = URLDecoder.decode(name, "utf-8");
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(name);
        String pageNow = request.getParameter("pageNow");


        String userName = (String) request.getSession().getAttribute("userName");

        List<Map<String, String>> list = constructFactoryInfo(pageNow, name, userName, map, "KZDM", "loc_city", "loc_county");
        List<Map<String, String>> alllist = constructFactoryInfo(null, name, userName, map, "KZDM", "loc_city", "loc_county");
        Page page = qmpService.getKzdmFactoryPageByName(pageNow, name, userName);

        model.addAttribute("clist", list);
        model.addAttribute("alllist", alllist);
        model.addAttribute("page", page);
        return "qmp/kzdmFactory";
    }

    /**
     * 构造分页和不分页的信息
     *
     * @param pageNow
     * @param name
     * @param userName
     * @param map
     * @param p1
     * @param p2
     * @param p3
     * @return
     */
    public List<Map<String, String>>
    constructFactoryInfo(String pageNow, String name, String userName,
                         Map map, String p1, String p2, String p3) {

        List<Map<String, String>> list = null;
        list = (pageNow != null ? qmpService.selectKzdmFactoryTotalByName(pageNow, name, userName)
                : qmpService.selectKzdmFactoryAllByName(name, userName));
        List<Qmp> list_kzdm = qmpService.selectForMap(map);
        //List<Map<String,String>> list_final = new LinkedList<Map<String,String>>();
        for (int i = 0; i < list.size(); i++) {
            String kzdm = list.get(i).get(p1);
            for (int j = 0; j < list_kzdm.size(); j++) {
                if (kzdm.equals(list_kzdm.get(j).getSectionName())) {
                    list.get(i).put(p2, list_kzdm.get(j).getLocCity());
                    list.get(i).put(p3, list_kzdm.get(j).getLocCounty());
                }
            }
        }
        return list;
    }


    //控制断面水域选择
    @RequestMapping("/water")
    public String water(HttpServletRequest request, String name, Model model) {
        System.out.println("调用");
        List<Map<String, String>> water = new ArrayList<Map<String, String>>();
        water = qmpService.selectWater();
        model.addAttribute("water", water);
        return "qmp/watershed";
    }

    //控制断面水域选择
    @RequestMapping("/waterYangZhi")
    public String waterYangZhi(HttpServletRequest request, String name, Model model) {
        System.out.println("调用");
        List<Map<String, String>> water = new ArrayList<Map<String, String>>();
        water = qmpService.selectWaterYangZhi();
        model.addAttribute("water", water);
        return "qmp/watershed";
    }

    //控制断面水域选择
    @RequestMapping("/waterFactory")
    public String waterFactory(HttpServletRequest request, String name, Model model) {
        System.out.println("调用");
        List<Map<String, String>> water = new ArrayList<Map<String, String>>();
        water = qmpService.selectWaterFactory();
        model.addAttribute("water", water);
        return "qmp/watershed";
    }

    @RequestMapping("/exportExcel")
    public void exportExcel(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Map map = new HashMap();

        map.put("section_bh", (String) request.getParameter("section_bh"));
        map.put("section_dybh", (String) request.getParameter("section_dybh"));
        map.put("section_dymc", (String) request.getParameter("section_dymc"));
        map.put("section_shhl", (String) request.getParameter("section_shhl"));

        map.put("tjnf", (String) request.getParameter("tjnf"));
        map.put("watershed", (String) request.getParameter("watershed"));
        map.put("river_name", (String) request.getParameter("river_name"));
        map.put("river_level", (String) request.getParameter("river_level"));
        map.put("river_to", (String) request.getParameter("river_to"));
        map.put("section_name", (String) request.getParameter("section_name"));
        map.put("section_property", (String) request.getParameter("section_property"));
        map.put("loc_province", (String) request.getParameter("loc_province"));
        map.put("loc_city", (String) request.getParameter("loc_city"));
        map.put("loc_county", (String) request.getParameter("loc_county"));
        map.put("test_by", (String) request.getParameter("test_by"));
        map.put("section_level", (String) request.getParameter("section_level"));
        map.put("section_type", (String) request.getParameter("section_type"));
        map.put("is_urban", (String) request.getParameter("is_urban"));
        map.put("is_addition", (String) request.getParameter("is_addition"));
        map.put("test_frequency", (String) request.getParameter("test_frequency"));
        map.put("test_items", (String) request.getParameter("test_items"));
        map.put("quality_target", (String) request.getParameter("quality_target"));
        map.put("username", (String) request.getSession().getAttribute("userName"));
        if (request.getParameter("id") != null) {
            map.put("id", (String) request.getParameter("id"));
        }
        List<Qmp> allList = qmpService.selectForMap(map);

        ArrayList<String> title = new ArrayList<String>();
        Field[] fields = allList.get(0).getClass().getDeclaredFields();

        title.add("序号");
        title.add("断面编号");
        title.add("所属控制单元编号");
        title.add("所属控制单元名称");
        title.add("收纳河流");

        title.add("流域名称");
        title.add("所在河流（湖库）");
        title.add("河流级别/湖库属性");
        title.add("汇入河流（湖库、海洋）");
        title.add("断面名称");
        title.add("断面属性");
        title.add("所属省份");
        title.add("所属地市");
        title.add("所属区县");
        title.add("测站名称");
        title.add("断面级别");
        title.add("断面类型");
        title.add("是否在城市建成区");
        title.add("现有/拟增设");
        title.add("监测频次");
        title.add("监测项目");
        title.add("经度/度");
        title.add("经度/分");
        title.add("经度/秒");
        title.add("纬度/度");
        title.add("纬度/分");
        title.add("纬度/秒");
        title.add("功能区水质目标");

        response.setContentType("application/binary;charset=UTF-8");
        String fileName = new String(("temp").getBytes(), "UTF-8");
        String path = request.getSession().getServletContext().getRealPath("export/qmp");
        try {
            ServletOutputStream out = response.getOutputStream();
            response.setHeader("Content-disposition", "attachment; filename=" + fileName + ".xls");
            genExcel(allList, title, out, fields, path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/exportExcelBas")
    public void exportExcelBas(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Map map = new HashMap();

        map.put("section_level", (String) request.getParameter("section_level"));
        map.put("ykh_108", (String) request.getParameter("ykh_108"));
        map.put("hlsz_90", (String) request.getParameter("hlsz_90"));
        map.put("original_id", (String) request.getParameter("original_id"));
        map.put("loc_province", (String) request.getParameter("loc_province"));
        map.put("loc_city", (String) request.getParameter("loc_city"));
        map.put("loc_district", (String) request.getParameter("loc_district"));
        map.put("cz_name", (String) request.getParameter("cz_name"));
        map.put("section_name", (String) request.getParameter("section_name"));
        map.put("basin", (String) request.getParameter("basin"));
        map.put("river_name", (String) request.getParameter("river_name"));
        map.put("section_sx", (String) request.getParameter("section_sx"));
        map.put("river_level", (String) request.getParameter("river_level"));
        map.put("sksk", (String) request.getParameter("sksk"));
        map.put("longitude", (String) request.getParameter("longitude"));
        map.put("latitude", (String) request.getParameter("latitude"));
        map.put("username", (String) request.getSession().getAttribute("userName"));
        if (request.getParameter("id") != null) {
            map.put("id", (String) request.getParameter("id"));
        }
        List<QmpBaseInfo> allList = qmpBaseInfoService.selectForMap(map);

        ArrayList<String> title = new ArrayList<String>();
        Field[] fields = allList.get(0).getClass().getDeclaredFields();

        title.add("序号");
        title.add("断面级别");
        title.add("原考核108");
        title.add("河流水质90");
        title.add("原序号");
        title.add("所属省份");
        title.add("所属地市");
        title.add("所属区县");
        title.add("测站名称");
        title.add("断面名称");
        title.add("所属流域");
        title.add("所属河流");
        title.add("断面属性");
        title.add("河流级别");
        title.add("受控水库");
        title.add("经度（度）");
        title.add("纬度（度）");


        response.setContentType("application/binary;charset=UTF-8");
        String fileName = new String(("temp").getBytes(), "UTF-8");
        //Timestamp ts = new Timestamp(System.currentTimeMillis());
        //String fileName ="断面基本信息"+ ts;
        String path = request.getSession().getServletContext().getRealPath("export/qmp");
        try {
            ServletOutputStream out = response.getOutputStream();
            response.setHeader("Content-disposition", "attachment; filename=" + fileName + ".xls");
            genExcelBas(allList, title, out, fields, path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/exportExcelTest")
    public void exportExcelTest(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Map map = new HashMap();

        map.put("year", (String) request.getParameter("year"));
        map.put("month", (String) request.getParameter("month"));
        map.put("section_bm", (String) request.getParameter("section_bm"));
        map.put("section_name", (String) request.getParameter("section_name"));
        map.put("loc_city", (String) request.getParameter("loc_city"));
        map.put("loc_river", (String) request.getParameter("loc_river"));
        map.put("ddl", (String) request.getParameter("ddl"));
        map.put("water_temperature", (String) request.getParameter("water_temperature"));
        map.put("ph", (String) request.getParameter("ph"));
        map.put("rjy", (String) request.getParameter("rjy"));
        map.put("tmd", (String) request.getParameter("tmd"));
        map.put("yd", (String) request.getParameter("yd"));
        map.put("cod_mn", (String) request.getParameter("cod_mn"));
        map.put("cod_cr", (String) request.getParameter("cod_cr"));
        map.put("nh_n", (String) request.getParameter("nh_n"));
        map.put("t_p", (String) request.getParameter("t_p"));
        map.put("t_n", (String) request.getParameter("t_n"));
        map.put("cu", (String) request.getParameter("cu"));
        map.put("zu", (String) request.getParameter("zu"));
        map.put("pb", (String) request.getParameter("pb"));
        map.put("cd", (String) request.getParameter("cd"));
        map.put("bod5", (String) request.getParameter("bod5"));
        map.put("t_as", (String) request.getParameter("t_as"));
        map.put("t_se", (String) request.getParameter("t_se"));
        map.put("t_hg", (String) request.getParameter("t_hg"));
        map.put("cr_6", (String) request.getParameter("cr_6"));
        map.put("f_", (String) request.getParameter("f_"));
        map.put("cn_", (String) request.getParameter("cn_"));
        map.put("hff", (String) request.getParameter("hff"));
        map.put("syl", (String) request.getParameter("syl"));
        map.put("las", (String) request.getParameter("las"));
        map.put("s2_", (String) request.getParameter("s2_"));
        map.put("chla", (String) request.getParameter("chla"));
        map.put("no3", (String) request.getParameter("no3"));
        map.put("no2", (String) request.getParameter("no2"));
        map.put("ll", (String) request.getParameter("ll"));
        map.put("sw", (String) request.getParameter("sw"));
        map.put("fdcjqbz", (String) request.getParameter("fdcjqbz"));
        map.put("username", (String) request.getSession().getAttribute("userName"));
        if (request.getParameter("id") != null) {
            map.put("id", (String) request.getParameter("id"));
        }
        List<QmpTestData> allList = qmpService.selectForMapSzxz(map);

        ArrayList<String> title = new ArrayList<String>();
        Field[] fields = allList.get(0).getClass().getDeclaredFields();
        title.add("序号");
        title.add("年份");
        title.add("月份");
        title.add("断面编码");
        title.add("断面名称");
        title.add("所在地区");
        title.add("所在河流");
        title.add("电导率(ms/m)");
        title.add("水温(℃)");
        title.add("pH值");
        title.add("溶解氧(mg/L)");
        title.add("透明度(cm)");
        title.add("盐度(‰)");
        title.add("COD Mn(mg/L)");
        title.add("COD Cr(mg/L)");
        title.add("NH3-N(mg/L)");
        title.add("T-P(mg/L)");
        title.add("T-N(mg/L)");
        title.add("Cu(mg/L)");
        title.add("Zn(mg/L)");
        title.add("Pb(mg/L)");
        title.add("Cd(mg/L)");
        title.add("BOD5(mg/L)");
        title.add("T-As(mg/L)");
        title.add("T-Se(mg/L)");
        title.add("T-Hg(mg/L)");
        title.add("Cr6+(mg/L)");
        title.add("F-(mg/L)");
        title.add("CN-(mg/L)");
        title.add("挥发酚(mg/L)");
        title.add("石油类(mg/L)");
        title.add("LAS(mg/L)");
        title.add("S2-(mg/L)");
        title.add("Chla(mg/L)");
        title.add("NO3-(mg/L)");
        title.add("NO2-(mg/L)");
        title.add("流量(m3/s)");
        title.add("水位");
        title.add("粪大肠菌群标准（个/L)");

        response.setContentType("application/binary;charset=UTF-8");
        String fileName = new String(("temp").getBytes(), "UTF-8");
        String path = request.getSession().getServletContext().getRealPath("export/qmp");
        try {
            ServletOutputStream out = response.getOutputStream();
            response.setHeader("Content-disposition", "attachment; filename=" + fileName + ".xls");
            genExcelTest(allList, title, out, fields, path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/upload")
    public ResponseEntity<byte[]> upload(HttpSession session, HttpServletRequest request) throws IOException {
        File file = new File(request.getSession().getServletContext().getRealPath("export/qmp") + "/temp.xls");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDispositionFormData("attachment", Long.toString(System.currentTimeMillis()) + ".xls");
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        ResponseEntity<byte[]> re = new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
        file.delete();
        return re;
    }

    @RequestMapping("/uploadBas")
    public ResponseEntity<byte[]> uploadBas(HttpSession session, HttpServletRequest request) throws IOException {
        File file = new File(request.getSession().getServletContext().getRealPath("export/qmp") + "/temp.xls");
        HttpHeaders headers = new HttpHeaders();
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        String fileName = "断面基本信息表" + dateString + ".xls";
        //headers.setContentDispositionFormData("attachment", Long.toString(System.currentTimeMillis()) + ".xls");
        headers.setContentDispositionFormData("attachment", new String(fileName.getBytes("UTF-8"), "iso8859-1"));
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        ResponseEntity<byte[]> re = new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
        file.delete();
        return re;
    }

    @RequestMapping("/uploadTest")
    public ResponseEntity<byte[]> uploadTest(HttpSession session, HttpServletRequest request) throws IOException {
        File file = new File(request.getSession().getServletContext().getRealPath("export/qmp") + "/temp.xls");
        HttpHeaders headers = new HttpHeaders();
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        String fileName = "断面实测数据表" + dateString + ".xls";
        //headers.setContentDispositionFormData("attachment", Long.toString(System.currentTimeMillis()) + ".xls");
        headers.setContentDispositionFormData("attachment", new String(fileName.getBytes("UTF-8"), "iso8859-1"));
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        ResponseEntity<byte[]> re = new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
        file.delete();
        return re;
    }

    private void genExcel(List<Qmp> allList, ArrayList<String> title, ServletOutputStream out, Field[] fields, String path) {
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("控制断面");
        HSSFRow row;
        HSSFCell cell;

        row = sheet.createRow(0);//创建表格行
        for (int j = 0; j < title.size(); j++) {
            cell = row.createCell(j);//根据表格行创建单元格
            cell.setCellValue(String.valueOf(title.get(j)));
        }

        try {
            for (int i = 0; i < allList.size(); i++) {
                row = sheet.createRow(i + 1);//创建表格行
                Qmp temp = allList.get(i);
                for (int j = 0; j < fields.length - 1; j++) {
                    Field f = temp.getClass().getDeclaredField(fields[j].getName());
                    f.setAccessible(true);
                    Object o = f.get(temp);
                    cell = row.createCell(j);
                    cell.setCellValue(o.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("error1");
        }

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path + "/temp.xls");
            wb.write(fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void genExcelBas(List<QmpBaseInfo> allList, ArrayList<String> title, ServletOutputStream out, Field[] fields, String path) {
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("控制断面");
        HSSFRow row;
        HSSFCell cell;

        row = sheet.createRow(0);//创建表格行
        for (int j = 0; j < title.size(); j++) {
            cell = row.createCell(j);//根据表格行创建单元格
            cell.setCellValue(String.valueOf(title.get(j)));
        }

        try {
            for (int i = 0; i < allList.size(); i++) {
                row = sheet.createRow(i + 1);//创建表格行
                QmpBaseInfo temp = allList.get(i);
                for (int j = 0; j < fields.length - 1; j++) {
                    Field f = temp.getClass().getDeclaredField(fields[j].getName());
                    f.setAccessible(true);
                    Object o = f.get(temp);
                    cell = row.createCell(j);
                    cell.setCellValue(o.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("error1");
        }

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path + "/temp.xls");
            wb.write(fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void genExcelTest(List<QmpTestData> allList, ArrayList<String> title, ServletOutputStream out, Field[] fields, String path) {
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("实测数据");
        HSSFRow row;
        HSSFCell cell;

        row = sheet.createRow(0);//创建表格行
        for (int j = 0; j < title.size(); j++) {
            cell = row.createCell(j);//根据表格行创建单元格
            cell.setCellValue(String.valueOf(title.get(j)));
        }

        try {
            for (int i = 0; i < allList.size(); i++) {
                row = sheet.createRow(i + 1);//创建表格行
                QmpTestData temp = allList.get(i);
                for (int j = 0; j < fields.length - 1; j++) {
                    if (j != fields.length - 2) {
                        Field f = temp.getClass().getDeclaredField(fields[j].getName());
                        f.setAccessible(true);
                        Object o = f.get(temp);
                        cell = row.createCell(j);
                        cell.setCellValue(o.toString());
                    } else {
                        Field f = temp.getClass().getDeclaredField(fields[j + 1].getName());
                        f.setAccessible(true);
                        Object o = f.get(temp);
                        cell = row.createCell(j + 1);
                        cell.setCellValue(o.toString());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("error1");
        }

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path + "/temp.xls");
            wb.write(fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 求和总量计算
     */
    @RequestMapping("/sum")
    public String kzdmSum(HttpServletRequest request, Model model) {
        Map map = new HashMap();

        map.put("section_bh", (String) request.getParameter("section_bh"));
        map.put("section_dybh", (String) request.getParameter("section_dybh"));
        map.put("section_dymc", (String) request.getParameter("section_dymc"));
        map.put("section_shhl", (String) request.getParameter("section_shhl"));

        map.put("tjnf", (String) request.getParameter("tjnf"));
        map.put("youkong", (String) request.getParameter("youkong"));
        map.put("watershed", (String) request.getParameter("watershed"));
        map.put("river_name", (String) request.getParameter("river_name"));
        map.put("river_level", (String) request.getParameter("river_level"));
        map.put("river_to", (String) request.getParameter("river_to"));
        map.put("section_name", (String) request.getParameter("section_name"));
        map.put("section_property", (String) request.getParameter("section_property"));
        map.put("loc_province", (String) request.getParameter("loc_province"));
        map.put("loc_city", (String) request.getParameter("loc_city"));
        map.put("loc_county", (String) request.getParameter("loc_county"));
        map.put("test_by", (String) request.getParameter("test_by"));
        map.put("section_level", (String) request.getParameter("section_level"));
        map.put("section_type", (String) request.getParameter("section_type"));
        map.put("is_urban", (String) request.getParameter("is_urban"));
        map.put("is_addition", (String) request.getParameter("is_addition"));
        map.put("test_frequency", (String) request.getParameter("test_frequency"));
        map.put("test_items", (String) request.getParameter("test_items"));
        map.put("quality_target", (String) request.getParameter("quality_target"));
        map.put("username", (String) request.getSession().getAttribute("userName"));
        if (request.getParameter("id") != null) {
            map.put("id", (String) request.getParameter("id"));
        }
        List<String> list_youkong = qmpService.searchQmp_youkong(map);
        List<Map<String, String>> list = new LinkedList<Map<String, String>>();
        List<Map<String, String>> list1 = new ArrayList<Map<String, String>>();
        List<Map<String, String>> list2 = new ArrayList<Map<String, String>>();
        List<Map<String, String>> list3 = new ArrayList<Map<String, String>>();
        list1 = qmpService.selectKzdmSumSource(map);
        list2 = qmpService.selectKzdmSumYangZhi(map);
        list3 = qmpService.selectKzdmSumFactory(map);
        List<Qmp> list_kzdy = qmpService.selectForMap(map);

        for (int i = 0; i < list_kzdy.size(); i++) {
            Map<String, String> m = new HashMap<String, String>();
            String k = list_kzdy.get(i).getSectionName();
            String loc_city = list_kzdy.get(i).getLocCity();
            String loc_county = list_kzdy.get(i).getLocCounty();
            m.put("KZDM", k);
            m.put("loc_city", loc_city);
            m.put("loc_county", loc_county);
            m.put("HXXYL", "0");
            m.put("ADPFL", "0");
            list.add(m);
        }
        //求和
        for (int i = 0; i < list1.size(); i++) {
            String kzdy_s = String.valueOf(list1.get(i).get("KZDM"));
            for (int j = 0; j < list.size(); j++) {
                String kzdy = String.valueOf(list.get(j).get("KZDM"));
                if (kzdy_s.equals(kzdy)) {
                    int HXXYL = Integer.parseInt(String.valueOf(list1.get(i).get("HXXYLPFL_D"))) + Integer.parseInt(String.valueOf(list.get(j).get("HXXYL")));
                    int ADPFL = Integer.parseInt(String.valueOf(list1.get(i).get("ADPFL_D"))) + Integer.parseInt(String.valueOf(list.get(j).get("ADPFL")));
                    list.get(j).put("HXXYL", String.valueOf(HXXYL));
                    list.get(j).put("ADPFL", String.valueOf(ADPFL));
                }
            }
        }
        for (int i = 0; i < list2.size(); i++) {
            String kzdy_s = list2.get(i).get("KZDM");
            for (int j = 0; j < list.size(); j++) {
                String kzdy = list.get(j).get("KZDM");
                if (kzdy_s.equals(kzdy)) {
                    int HXXYL = Integer.parseInt(String.valueOf(list2.get(i).get("PFL_HXXYL"))) + Integer.parseInt(String.valueOf(list.get(j).get("HXXYL")));
                    int ADPFL = Integer.parseInt(String.valueOf(list2.get(i).get("PFL_AD"))) + Integer.parseInt(String.valueOf(list.get(j).get("ADPFL")));
                    list.get(j).put("HXXYL", String.valueOf(HXXYL));
                    list.get(j).put("ADPFL", String.valueOf(ADPFL));
                }
            }
        }
        for (int i = 0; i < list3.size(); i++) {
            String kzdy_s = list3.get(i).get("KZDM");
            for (int j = 0; j < list.size(); j++) {
                String kzdy = list.get(j).get("KZDM");
                if (kzdy_s.equals(kzdy)) {
                    int HXXYL = Integer.parseInt(String.valueOf(list3.get(i).get("HXXYLQCL_D"))) + Integer.parseInt(String.valueOf(list.get(j).get("HXXYL")));
                    int ADPFL = Integer.parseInt(String.valueOf(list3.get(i).get("ADQCL_D"))) + Integer.parseInt(String.valueOf(list.get(j).get("ADPFL")));
                    list.get(j).put("HXXYL", String.valueOf(HXXYL));
                    list.get(j).put("ADPFL", String.valueOf(ADPFL));
                }
            }
        }
        String name = request.getParameter("name");
        //优控选择
        List<Map<String, String>> list_total = new LinkedList<Map<String, String>>();
        if (list_youkong.size() != 0) {
            for (int i = 0; i < list_youkong.size(); i++) {
                String kzdy_youkong = list_youkong.get(i);
                for (int j = 0; j < list.size(); j++) {
                    String kzdy = list.get(j).get("KZDM");
                    if (kzdy_youkong.equals(kzdy)) {
                        list_total.add(list.get(j));
                    }
                }
            }
        } else {
            list_total = list;
        }
        //查询功能
        List<Map<String, String>> list_select = new LinkedList<Map<String, String>>();
        if (("").equals(name) || name == null) {
            list_select = list_total;
        } else {
            for (int i = 0; i < list_total.size(); i++) {
                String kzdy = list_total.get(i).get("KZDM");
                if (kzdy.contains(name)) {
                    list_select.add(list_total.get(i));
                }
            }
        }

        //分页
        List<Map<String, String>> list_final = new LinkedList<Map<String, String>>();
        Page page = null;
        String pageNow = request.getParameter("pageNow");
        int totalCount = list_select.size();
        if (pageNow != null) {
            page = new Page(totalCount, Integer.parseInt(pageNow));
        } else {
            page = new Page(totalCount, 1);
        }
        int start = page.getStartPosZcfg();
        int end = start + page.getZcfgPageSize();
        for (int i = 0; i < list_select.size(); i++) {
            if (i + 1 > start && i + 1 <= end) {
                list_final.add(list_select.get(i));
            }
        }
        model.addAttribute("alllist", list_select);
        model.addAttribute("list", list_final);
        model.addAttribute("page", page);
        return "qmp/kzdmTotal";
    }


    @RequestMapping("/qmpDMs")
    @ResponseBody
    public String getDMs(HttpServletRequest request, HttpServletResponse response, Model model) {
        Long userId = userMapper.getIdByName((String) request.getSession().getAttribute("userName").toString().trim());
        Long roleId = roleMapper.getRoleIdByUserId(userId);
        String roleSign = roleMapper.getRoleSignByID(roleId);
        String rolename = roleMapper.getRoleNameByID(roleId);
        System.out.println(rolename);
        System.out.println(roleSign);
        if (roleSign.equals("admin") || roleSign.equals("1")) {
            List<Map<String, Object>> maps = jdbcTemplate.queryForList("SELECT section_name from qmp WHERE section_type='控制断面'");
            for (int i = 0; i < maps.size(); i++) {
                System.out.println(maps.get(i).get("section_name"));
            }
            Gson gson = new Gson();
            return gson.toJson(maps);
        } else if (roleSign.equals("2")) {
            List<Map<String, Object>> maps = jdbcTemplate.queryForList("SELECT section_name from qmp WHERE section_type='控制断面' AND loc_city LIKE '%" + rolename + "%'");
            System.out.println(maps.size());
            for (int i = 0; i < maps.size(); i++) {
                System.out.println(maps.get(i).get("section_name"));
            }
            Gson gson = new Gson();
            return gson.toJson(maps);
        } else if (roleSign.equals("3")) {
            List<Map<String, Object>> maps = jdbcTemplate.queryForList("SELECT section_name from qmp WHERE section_type='控制断面' AND loc_county LIKE '%" + rolename.substring(rolename.indexOf("_") + 1) + "%'");
            for (int i = 0; i < maps.size(); i++) {
                System.out.println(maps.get(i).get("section_name"));
            }
            Gson gson = new Gson();
            return gson.toJson(maps);
        }
        return "";
    }

    @RequestMapping("/qmpDMrate")
    @ResponseBody
    public String getDMrate(HttpServletRequest request, HttpServletResponse response, Model model) throws
            UnsupportedEncodingException {

        String polls = request.getParameter("polls");
        String year = request.getParameter("year");

        Long userId = userMapper.getIdByName((String) request.getSession().getAttribute("userName").toString().trim());
        Long roleId = roleMapper.getRoleIdByUserId(userId);
        String roleSign = roleMapper.getRoleSignByID(roleId);

        String roleStr = "and qmp.section_type='控制断面' ";

        if (roleSign.equals("1")) {
        } else if (roleSign.equals("2")) {
            String roleName = roleMapper.getRoleNameByID(roleId);
            roleStr = "and qmp_wrxx.test_by like '%" + roleName + "%' ";
        } else if (roleSign.equals("3")) {
            String role = roleMapper.getRoleNameByID(roleId);
            String[] arr = role.split("_");
            roleStr = "and qmp_wrxx.test_by like '%" + arr[0] + "%' and section_name in (select section_name from qmp where loc_county like '" + arr[1] + "')";
            //roleStr = "and test_by like '%"+roleName+"%' ";
            //map.put("loc_county", arr[1]);
        }


        String sql = "select qmp.section_name,month,flow_rate," + polls
                + " from qmp_wrxx,qmp where  year = '" + year + "'  " + roleStr;
        PreparedStatement pstmt;
        List list = new ArrayList<String>();
        List name = new ArrayList<String>();
        int col = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/new_env?useUnicode=true&characterEncoding=utf8&useSSL=true", "root", "18342212808y");
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            col = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= col; i++) {
                    //System.out.print(rs.getString(i) + "\t");
                    list.add(rs.getString(i));
                    name.add(rs.getString(1));
                }
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        if (list.isEmpty() || list.size() == 0) {
            return "null";
        } else {
            HashSet h = new HashSet(name);
            name.clear();
            name.addAll(h);
            Map<String, Double> map = new LinkedHashMap<String, Double>();
            int pp = 0;

            while (true) {
                //清洗
                for (int j = 0; j < col; j++) {
                    if ((list.get(pp + j).equals("-") || list.get(pp + j).equals("无") || list.get(pp + j).equals("")))
                        list.set(pp + j, 0 + "");
                }
                //计算
                map.put(list.get(pp + 0) + "," + list.get(pp + 1),
                        Double.valueOf((String) list.get(pp + 2)) * Double.valueOf((String) list.get(pp + 3)) * 2.592);
                pp = pp + col;
                //System.out.println();
                if (pp >= list.size()) break;
            }
            Set set = map.entrySet();
            Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                Map.Entry mapentry = (Map.Entry) iterator.next();
                //System.out.println(mapentry.getKey() + "\t\t" + ((Double)mapentry.getValue()));
            }

            //五个月份平均值-点源
            int avg[] = {12, 1, 2, 3, 4};
            //其余月份面源
            int mian[] = {5, 6, 7, 8, 9, 10, 11};
            Map<String, Double> mianp = new LinkedHashMap<String, Double>();

            int allmn[] = {5, 6, 7, 8, 9, 10, 11};


            Gson gson = new Gson();
            List<Rate> rate = new ArrayList<Rate>();

            int mark = 0;

            for (int i = 0; i < name.size(); i++) {
                String thisname = (String) name.get(i);
                double a = 0;
                for (int k = 0; k < avg.length; k++) { //五个月份平均值-点源
                    if (map.get(thisname + "," + avg[k]) == null) continue;
                    a += ((Double) map.get(thisname + "," + avg[k]));
                    mark++;
                }
                a = a / mark;
                //rate.add(new Rate(URLEncoder.encode(thisname, "UTF-8").replace("+","%20"),a+"",0+""));
                for (int k = 0; k < mian.length; k++) { //其余月份面源
                    if (map.get(thisname + "," + mian[k]) == null) continue;
                    mianp.put(thisname + "," + mian[k], (Double) map.get(thisname + "," + mian[k]) - a);
                }
                for (int k = 0; k < allmn.length; k++) {
                    if (map.get(thisname + "," + allmn[k]) == null) continue;
                    rate.add(new Rate(URLEncoder.encode(thisname + "," + allmn[k], "UTF-8").replace("+", "%20"),
                            String.valueOf(a / ((Double) map.get(thisname + "," + allmn[k]))),
                            String.valueOf(1 - (a / ((Double) map.get(thisname + "," + allmn[k]))))));
                }

            }
            //System.out.println(gson.toJson(rate));
            return gson.toJson(rate);
        }
    }

    public class Rate {
        private String name;
        private String dRate;
        private String mRate;

        public Rate(String name, String dRate, String mRate) {
            super();
            this.name = name;
            this.dRate = dRate;
            this.mRate = mRate;
        }
    }


    private String getMapKey(String key) {
        switch (key) {
            case "ddl":
                return "电导率";
            case "water_temperature":
                return "水温";
            case "ph":
                return "PH值";
            case "rjy":
                return "溶解氧";
            case "tmd":
                return "透明度";
            case "yd":
                return "盐度";
            case "cod_mn":
                return "高锰酸盐指数";
            case "cod_cr":
                return "化学需氧量";
            case "nh_n":
                return "氨氮";
            case "t_p":
                return "总磷";
            case "t_n":
                return "总氮";
            case "cu":
                return "铜";
            case "zn":
                return "锌";
            case "pb":
                return "铅";
            case "cd":
                return "镉";
            case "bod5":
                return "生化需氧量";
            case "t_as":
                return "砷";
            case "t_se":
                return "硒";
            case "t_hg":
                return "汞";
            case "cr_6":
                return "六价铬";
            case "f_":
                return "氟化物";
            case "cn_":
                return "氰化物";
            case "hff":
                return "挥发酚";
            case "syl":
                return "石油类";
            case "las":
                return "阴离子表面活性剂";
            case "s2_":
                return "硫化物";
            case "chla":
                return "Chla";
            case "no3":
                return "NO3";
            case "no2":
                return "NO2";
            case "ll":
                return "流量";
            case "sw":
                return "水位";
            case "fdcjqbz":
                return "粪大肠菌群";
            default:
                return "";
        }
    }

    /**
     * 拼接where语句筛选section
     *
     * @param sections
     * @return
     */
    public String getWhereIn(List sections) {
        StringBuffer in = new StringBuffer();
        int len = sections.size();
        if (len > 0) {
            in.append(" where section_name IN (");
            in.append("\"" + sections.get(0) + "\"");
        }
        for (int i = 1; i < len; i++) {
            in.append("," + "\"" + sections.get(i) + "\"");
        }
        if (len > 0) {
            in.append(")");
        }
        return in.toString();
    }

    /**
     * 更新补偿资金中的断面
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/updateZjbcDm")
    public ResponseEntity<String> updateZjbcDm(@RequestParam(value = "dms") String dms) {
        String[] result = dms.split(",");
        List<String> origin = getSectionNameList();
        String sql = "";
        List<String> todel = new ArrayList<>();
        List<String> toinsert = new ArrayList<>();
        for (String temp : result) {
//      sql = "insert into par_section_list(section_name) values(?)";
//      jdbcTemplate.update(sql, temp);
            if (!origin.contains(temp)) {//原来没有的要新增
                toinsert.add(temp);
            } else {//原来有的去掉，剩下要删除的
                todel.add(temp);
            }
        }

        for (String dm : todel) {
            origin.remove(dm);
        }

        for (String dm : origin) {
            jdbcTemplate.update("delete from par_section_list where section_name=?", dm);
        }

        for (String dm : toinsert) {
            jdbcTemplate.update("insert into par_section_list(section_name) values(?)", dm);
        }
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    /**
     * 获取不在补偿断面中的断面
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/getNotZjbcDm")
    @ResponseBody
    public List<String> getNotZjbcDm() {
        return jdbcTemplate.queryForList("select DISTINCT section_name from qmp_bas_info WHERE section_name not in(SELECT DISTINCT section_name from par_section_list)", String.class);
    }

    /**
     * 获取补偿资金的断面
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/getZjbcDm")
    @ResponseBody
    public List<String> getZjbcDm() {
        return getSectionNameList();
    }

    /**
     * 获取断面列表
     *
     * @return
     */
    public List getSectionNameList() {
        List<String> list = new LinkedList();
        DBUtil dbUtil = new DBUtil();
        try {
            dbUtil.initConnection();
            String sql = "select section_name from par_section_list";
            ResultSet resultSet = dbUtil.doResultSet(sql);
            while (resultSet.next()) {
                String str = resultSet.getString("section_name");
                list.add(str);
            }
            // 断面名称
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                dbUtil.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    /**
     * 获取断面列表
     *
     * @return [(一列信息), (一列信息), (一列信息), (一列信息)]
     */
    public List getAllInfo(List sections) {
        List<Map<String, String>> list = new LinkedList<>();
        DBUtil dbUtil = new DBUtil();
        try {
            dbUtil.initConnection();
            String sql = "select loc_province,loc_city,loc_district,cz_name,section_name,basin,river_name,section_sx,river_level from par_section_list";
            String where = getWhereIn(sections);
            sql = sql + where;
            ResultSet resultSet = dbUtil.doResultSet(sql);
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int count = rsmd.getColumnCount();
            while (resultSet.next()) {
                Map map = new HashMap<String, String>();
                for (int i = 1; i <= count; i++) {
                    String value = resultSet.getString(rsmd.getColumnName(i));
                    map.put(rsmd.getColumnName(i), value);
                }
                list.add(map);
            }
            // 断面名称
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                dbUtil.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }


    /**
     * 获取断面列表
     *
     * @return [(一列信息), (一列信息), (一列信息), (一列信息)]
     */
    public List getInfo(List sections) {
        List<Map<String, String>> list = new LinkedList<>();
        DBUtil dbUtil = new DBUtil();
        try {
            dbUtil.initConnection();
            //String sql = "select year,month,section_name,loc_city,loc_river,quality_target,section_sx from pre_dmbczj ";
            String sql = "select year,month,section_name,loc_city,loc_river,quality_target,section_sx from pre_dmbczj";
            String where = getWhereIn(sections);
            sql = sql + where + "order by CONVERT(loc_city USING gbk),section_level DESC,CONVERT(section_name USING gbk),month ASC";//改为按城市首字母，断面首字母以及月份排序
            System.out.println(sql);
            ResultSet resultSet = dbUtil.doResultSet(sql);
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int count = rsmd.getColumnCount();
            while (resultSet.next()) {
                Map map = new HashMap<String, String>();
                for (int i = 1; i <= count; i++) {
                    String value = resultSet.getString(rsmd.getColumnName(i));
                    map.put(rsmd.getColumnName(i), value);
                }
                list.add(map);
            }
            // 断面名称
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                dbUtil.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public Map getAward() {
        Map map = new HashMap<String, String>();
        DBUtil dbUtil = new DBUtil();
        try {
            dbUtil.initConnection();
            String sql = "select dmmc,bcshs from bcshs_buchang_shengcuo";
            ResultSet resultSet = dbUtil.doResultSet(sql);
            while (resultSet.next()) {
                String dmmc = resultSet.getString("dmmc").trim();
                String bcshs = resultSet.getString("bcshs").trim();
                map.put(dmmc, bcshs);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                dbUtil.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return map;
    }

    /**
     * 计算所有的偏差数据
     *
     * @return
     */
    @RequestMapping("/calcAll")
    public List calcAll() {
        List<String> list = getSectionNameList();
        List<Map<String, String>> lmaps = getInfo(list);
        List<Dmbczj> saves = new LinkedList<>();


        // 得到断面名称、河流名称、断面属性、河流等级，放在CalcView中
        Map<String, CalcView> calcViews = calcService.getCalcMap();

        for (Map map : lmaps) {
            Dmbczj dmbczj = new Dmbczj();
            String year = (String) map.get("year");
            dmbczj.setYear(year);
            String month = (String) map.get("month");
            dmbczj.setMonth(Integer.parseInt(month));
            String city = (String) map.get("loc_city");
            dmbczj.setCity(city);
            String loc_river = (String) map.get("loc_river");
            dmbczj.setLocRiver(loc_river);
            String section = (String) map.get("section_name");
            dmbczj.setSectionName(section);
            String section_sx = (String) map.get("section_sx");
            dmbczj.setSectionSx(section_sx);
            String stdsqi = (String) map.get("quality_target");
            dmbczj.setObjective2018(stdsqi);
            // 无关量
            String river = (String) map.get("loc_river");
            String sdsqi = strStdToNum(stdsqi);

            Map<String, String> rets = calculate(calcViews, Integer.parseInt(month), year, section, river, sdsqi);
            if (rets == null) {
                continue;
            }
            for (Map.Entry<String, String> entry : rets.entrySet()) {
                //System.out.println(entry.getKey() + ":" + entry.getValue().toString());
                map.put(entry.getKey(), entry.getValue());
            }
            String sqi = (String) map.get("sqi");
            dmbczj.setSzlb(sqi);
            String overflow = (String) map.get("overflow");
            dmbczj.setCbxm(overflow);
            String fine = (String) map.get("fine");
            dmbczj.setJlJnzj(fine);
            String incFine = (String) map.get("incFine");
            dmbczj.setLwjfJnzj(incFine);
            String si = (String) map.get("si");
            dmbczj.setHjJnzj(si);

            Map mp = null;
            mp = getAward();
            String bcshs = (String) mp.get(section);
            if (!"省".equals(bcshs)) {
                dmbczj.setBcxyJnzj(si);
                dmbczj.setBccsJnzj(bcshs);
                dmbczj.setBcslJnzj("");
            } else {
                dmbczj.setBcxyJnzj("");
                dmbczj.setBccsJnzj("");
                dmbczj.setBcslJnzj(si);
            }
            saves.add(dmbczj);
        }

//    System.out.println("--------------------------------");
//    for (Map<String, String> map : lmaps) {
//      for (Map.Entry<String, String> entry : map.entrySet()) {
//        System.out.println(entry.getKey() + ":" + entry.getValue().toString());
//      }
//    }
//    System.out.println("--------------------------------");
//        DBUtil dbUtil =new DBUtil();
//      dbUtil.initConnection();
//      for (Dmbczj dmbczj:saves) {
//        String sql = "select id from dmbczj where year=\""
//                +dmbczj.getYear() + "\" and month="+dmbczj.getMonth()
//        dbUtil.doResultSet(sql);
        System.out.println(saves.size());
        int excuteNum = 0;
        for (Dmbczj dmbczj : saves) {
            System.out.println("dmbczj");

            System.out.println(dmbczj);
            int excute = dmbczjMapper.insert(dmbczj);
            System.out.println("excute");
            System.out.println(excute);
            excuteNum += excute;
        }
        System.out.println("excuteNum");
        System.out.println(excuteNum);
        System.out.println("lmaps");
        System.out.println(lmaps.size());
        System.out.println(lmaps);
        return lmaps;
    }


    private double drd(double f, int scale) {
        BigDecimal b = new BigDecimal(new Double(f).toString());
        double f1 = b.setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
        return f1;
    }

    /**
     * 计算指定月份、指定城市、指定断面的数值。
     *
     * @param month
     * @param section
     * @return
     */
    private Map calculate(Map<String, CalcView> calcViews, Integer month, String year, String section, String river, String stdsqi) {

        //取出断面年度目标，为后面判断是否含氨氮准备
        String quality_sql = "select quality_target from qmp_year_water_target where section_name='" +
                section + "' and year='" + year + "'";
        String quality_target = "";
        try {
            quality_target = jdbcTemplate.queryForObject(quality_sql, String.class);//水质年度目标
        } catch (Exception e) {//没有水质年度目标,此断面计算无意义
            //e.printStackTrace();
            return null;
        }

        Map map = countCategory_copy(section, month, year, quality_target);
        // 实测水质类别
        String sqi = (String) map.get("dmcategory");
        if ("".equals(sqi)) {
            // 空字符串表示没有测试数据
            return null;
        }
        //String stdsqi = getStdQi(month,city,section);   // 标准
//    String level = (String) map.get("level");       // 河流等级
        String level = calcViews.get(section).getRiverLevel();       // 河流等级
        double stdqi = Double.parseDouble(stdsqi);

        Map<String, String> params = new HashMap();
        params.put("month", month.toString());
        params.put("year", year);
        params.put("section_name", section);
        double rateSum = 0.0;
        params = getBadZb(params);
        int i = 0;
        StringBuffer buf = new StringBuffer();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            String key = getMapKey(entry.getKey());
            String[] value = entry.getValue().trim().split(",");
            if (value.length != 2) {
                System.out.println(value);
                params.remove(key);
                continue;
            }

//      Double qi = Double.parseDouble(value[0]);
//      qi = drd(qi,1);
//      value[0] = qi.toString();
            int end = value[0].indexOf(".");
            value[0] = value[0].substring(0, end + 2);

            if (i == 0) {
                buf.append(key + "(" + value[0] + ")");//+ "(" + value[1] + ")");
            } else {
                buf.append("," + key + "(" + value[0] + ")");//+ "(" + value[1] + ")");
            }
            i++;

            //rateSum += qi;
            rateSum += Double.parseDouble(value[0]);
        }

        // 求出的params为超标项目及其倍率
        Map lrets = calculateOne(sqi, stdqi, level, rateSum);
        lrets.put("overflow", buf.toString());
        lrets.put("sqi", sqi);
        return lrets;
    }

    /**
     * 返回查表数据
     *
     * @return
     */
    public Map<String, double[]> getFineTable() {
        Map<String, double[]> map = new HashMap();
        map.put("干流", new double[]{100, 100, 10});
        map.put("其他", new double[]{50, 50, 10});
        return map;
    }

    /**
     * /**
     * 计算函数,计算某年某月某断面总罚金
     *
     * @param stdqi
     * @param sqi
     * @param level
     * @return
     */
    private Map calculateOne(String sqi, double stdqi, String level, double rateSum) {
        Double si = 0.0; // 合计缴纳罚金
        Double fine = 0.0;
        Double incFine = 0.0;
        String dsqi = strStdToNum(sqi);
        Double qi = Double.parseDouble(dsqi);
        Map ret = new HashMap();
        Map map = getFineTable();
        if (qi > stdqi) {// Si.Qi > Si的水质级别
            if (sqi.indexOf("劣Ⅴ") > -1) {
                // 如果是劣V,返回倍数加和
                double[] fines = (double[]) map.get("干流");
                // 加罚金
                incFine = rateSum * fines[2];
            }
            // 计算超标等级数
            Integer mul = (int) (qi - stdqi - 1);
            double[] fines = null;
            if ("干流".equals(level)) {
                fines = (double[]) map.get("干流");
            } else {
                fines = (double[]) map.get("其他");
            }
            fine = fines[0] + mul * fines[1];
            // 返回总的数
            si = incFine + fine;
        }

        // 四舍五入
        fine = drd(fine, 0);
        incFine = drd(incFine, 0);
        si = drd(si, 0);

        ret.put("fine", new Integer(fine.intValue()).toString());
        ret.put("incFine", new Integer(incFine.intValue()).toString());
        ret.put("si", new Integer(si.intValue()).toString());
        return ret;
    }


}
