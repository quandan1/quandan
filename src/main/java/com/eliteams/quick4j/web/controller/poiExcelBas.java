package com.eliteams.quick4j.web.controller;

import java.io.*;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.util.ArrayList;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.eliteams.quick4j.web.controller.QmpController;

public class poiExcelBas {
    private static final String EXCEL_XLS = "xls";
    private static final String EXCEL_XLSX = "xlsx";
    public static boolean checkHasExist(String section_name) throws ClassNotFoundException, SQLException {
        System.out.println(section_name);
        String sql = "SELECT * FROM qmp_bas_info WHERE section_name="+ section_name;
        System.out.println(sql);
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/new_env";
//        String url = "jdbc:mysql://127.0.0.1:3306/quick4j";
        String username = "root";
        String password = "18342212808y";
//        String password = "123456";

        Connection conn = null;

        Class.forName(driver);
        conn = DriverManager.getConnection(url, username, password);
        if (!conn.isClosed()) {
            System.out.println("数据库链接成功——查询！");
        }
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        if(rs.next()){
            conn.close();
            return true;
        }
        else {
            conn.close();
            return false;
        }
    }

    public static boolean checkHasExistPanduan(String section_name) throws ClassNotFoundException, SQLException {
        System.out.println(section_name);
        String sql = "SELECT * FROM qmp_bas_info WHERE section_name="+ section_name;
        System.out.println(sql);
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/new_env";
//        String url = "jdbc:mysql://127.0.0.1:3306/quick4j";
        String username = "root";
        String password = "18342212808y";
//        String password = "123456";

        Connection conn = null;

        Class.forName(driver);
        conn = DriverManager.getConnection(url, username, password);
        if (!conn.isClosed()) {
            System.out.println("数据库链接成功——查询！");
        }
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        if(rs.next()){
            conn.close();
            return true;
        }
        else {
            conn.close();
            return false;
        }


    }

    public static ArrayList<String> sectionLike(String section_name) throws ClassNotFoundException, SQLException {
        System.out.println(section_name);
        ArrayList<String> list = new ArrayList<String>();
        String sql = "SELECT section_name FROM qmp_bas_info WHERE section_name LIKE "+"\'"+"%"+ section_name +"%"+"\'";
        System.out.println(sql);
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/new_env";
//        String url = "jdbc:mysql://127.0.0.1:3306/quick4j";
        String username = "root";
        String password = "18342212808y";
//        String password = "123456";

        Connection conn = null;

        Class.forName(driver);
        conn = DriverManager.getConnection(url, username, password);
        if (!conn.isClosed()) {
            System.out.println("数据库链接成功——查询！");
        }
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        ResultSetMetaData md = rs.getMetaData(); //获得结果集结构信息,元数据
        int columnCount = md.getColumnCount();   //获得列数
        while (rs.next()) {
            list.add(rs.getString(1));
        }

        return list;


    }

    public static String executeInsert(String rowValue) {
        System.out.println("-----------------------------------");
        System.out.println(rowValue);
        String[] clean_row_list = rowValue.split(",");
        String clean_row = "";
        for (int i = 0; i < clean_row_list.length; i++) {
            if (i != 0) {
                clean_row += clean_row_list[i] + ",";

            }
        }
        String new_rowValue = clean_row + "0";


        String columnName = "(section_level, ykh_108, hlsz_90," +
                " original_id, loc_province, loc_city, loc_district, cz_name" +
                ",section_name, basin, river_name, section_sx, river_level" +
                ",sksk, longitude, latitude, is_del) ";
        String sql = "";
        sql = "INSERT INTO qmp_bas_info"+columnName +"VALUES(" + new_rowValue + ");" + "\n";
        System.out.println(sql);
        return sql;
    }

    public static String executeUpdate(String rowValue, String section_name) {

        String new_rowValue = rowValue.substring(0, rowValue.length() - 1) + ",0";
        String[] rowValue_list = new_rowValue.split(",");

        String sql = "";
        sql = "UPDATE qmp_bas_info SET section_level="+rowValue_list[1]+",ykh_108="+rowValue_list[2]+
                ",hlsz_90="+rowValue_list[3]+",original_id=" +rowValue_list[4]+
                ",loc_province="+rowValue_list[5]+",loc_city="+rowValue_list[6]+",loc_district="+rowValue_list[7]+",cz_name="+rowValue_list[8]+
                ",section_name="+rowValue_list[9]+",basin="+rowValue_list[10]+",river_name="+rowValue_list[11]+
                ",section_sx="+rowValue_list[12]+",river_level="+rowValue_list[13]+",sksk="+rowValue_list[14]+",longitude="+rowValue_list[15]+
                ",latitude="+rowValue_list[16]+",is_del="+rowValue_list[17]+
                " WHERE section_name="+section_name;
        System.out.println(sql);
        return sql;
    }


    public static int[] connectMySQL(String rowValue) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/new_env";
//        String url = "jdbc:mysql://127.0.0.1:3306/quick4j";
        String username = "root";
        String password = "18342212808y";
//        String password = "123456";

        Connection conn = null;
        Class.forName(driver);
        conn = DriverManager.getConnection(url, username, password);
        if (!conn.isClosed()) {
            System.out.println("数据库链接成功！");

        }
        int[] rs_count = new int[2];
        int rs_count_insert = 0;
        int rs_count_update = 0;
        String sql = "";
        // 创建statement类对象，用来执行SQL语句
        Statement statement = conn.createStatement();
        String section_name = rowValue.split(",")[9];
        System.out.println(section_name);
        if(checkHasExist(section_name)){
            sql = executeUpdate(rowValue, section_name);
            rs_count_update = rs_count_update + statement.executeUpdate(sql);
        }
        else{
            sql = executeInsert(rowValue);
            rs_count_insert += statement.executeUpdate(sql);
        }
        System.out.println(rs_count_update);
        System.out.println(rs_count_insert);
        rs_count[0]=rs_count_update;
        rs_count[1]=rs_count_insert;


        conn.close();
        return rs_count;
    }

    public static Workbook getWorkbook(InputStream in, File file) throws IOException {
        Workbook wb = null;
        if (file.getName().endsWith(EXCEL_XLS)) {  //Excel 2003
            wb = new HSSFWorkbook(in);
        } else if (file.getName().endsWith(EXCEL_XLSX)) {  // Excel 2007/2010
            wb = new XSSFWorkbook(in);
        }
        return wb;
    }


    public static String poiExceltoSql(String getString, String localFileName, String localFilePath, String localFileUploadTime) throws Exception {

        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        int[] rs_count = new int[2];
        int updateCount = 0;
        int insertCount = 0;
        try {
//            QmpController qmp = new QmpController();
//            String localFileName = localFileName;
//            String localFilePath = localFilePath;
//            String localFileUploadTime = localFileUploadTime;
//            String localFileOriName = localFileName.split("_")[0];
            String[] fopt = getString.split("\\.");
//            fopt[1] = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1);
//            String realname = fopt[0];
            String checkFileName = fopt[0].replaceFirst("上传成功! ", "") + "_" + localFileUploadTime + "." + fopt[1];
            System.out.println(localFileName);
            System.out.println(localFilePath);
            System.out.println(checkFileName);
            System.out.println(fopt[0]);
            System.out.println(fopt[1]);

            // 同时支持Excel 2003、2007
            if (checkFileName.equals(localFileName)) {
                File excelFile = new File(localFilePath); // 创建文件对象
//                checkExcelVaild(excelFile);

                FileInputStream fis = new FileInputStream(excelFile); // 文件流

                Workbook workbook = getWorkbook(fis, excelFile);
//                Workbook workbook = WorkbookFactory.create(fis); // 这种方式 Excel2003/2007/2010都是可以处理的

                int sheetCount = workbook.getNumberOfSheets(); // Sheet的数量
                /**
                 * 设置当前excel中sheet的下标：0开始
                 */
                Sheet sheet = workbook.getSheetAt(0);   // 遍历第一个Sheet

                sheet.setDisplayGridlines(true);
                int rowStart = 2;
                int rowEnd = sheet.getLastRowNum();

                Row row_title = sheet.getRow(0);
                int max_column = row_title.getLastCellNum();
                System.out.println(max_column);
                for (int rowNum = rowStart; rowNum <= rowEnd; rowNum++) {

                    Row row = sheet.getRow(rowNum);
                    StringBuilder rowValue = new StringBuilder();
                    for (int cn = 0; cn < max_column; cn++) {
                        Cell cell = row.getCell(cn, Row.RETURN_BLANK_AS_NULL);

                        String cellValue = "";
                        if (cell == null) {
                            cellValue = "\"\",";
                            rowValue.append(cellValue);
                        } else {
                            int cellType = cell.getCellType();

                            switch (cellType) {
                                case Cell.CELL_TYPE_STRING:     // 文本
                                    cellValue = '"' + cell.getRichStringCellValue().getString() + '"' + ',';
                                    break;
                                case Cell.CELL_TYPE_NUMERIC:    // 数字、日期
                                    if (DateUtil.isCellDateFormatted(cell)) {
                                        cellValue = fmt.format(cell.getDateCellValue()) + ",";
                                    } else {
                                        cell.setCellType(Cell.CELL_TYPE_STRING);
                                        cellValue = String.valueOf(cell.getRichStringCellValue().getString()) + ",";
                                    }
                                    break;
                                case Cell.CELL_TYPE_BOOLEAN:    // 布尔型
                                    cellValue = String.valueOf(cell.getBooleanCellValue()) + ",";
                                    break;
                                case Cell.CELL_TYPE_BLANK: // 空白
                                    cellValue = '"' + cell.getStringCellValue() + '"' + ",";
                                    break;
                                case Cell.CELL_TYPE_ERROR: // 错误
                                    cellValue = "错误#";
                                    break;
                                case Cell.CELL_TYPE_FORMULA:    // 公式
                                    // 得到对应单元格的公式
                                    //cellValue = cell.getCellFormula() + "#";
                                    // 得到对应单元格的字符串
                                    cell.setCellType(Cell.CELL_TYPE_STRING);
                                    cellValue = String.valueOf(cell.getRichStringCellValue().getString()) + ",";
                                    break;
                                default:
                                    cellValue = ",";
                            }

                            rowValue.append(cellValue);
                        }
                    }
                    rs_count = connectMySQL(rowValue.toString());
                    updateCount += rs_count[0];
                    insertCount += rs_count[1];
                    System.out.println("更新了"+updateCount+"条信息");
                    System.out.println("新增了"+insertCount+"条信息");

//                    System.out.println();
                }
            } else {
                return "文件不存在，请重新上传！";
            }


//            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            bw.close();
        }
        return "文件批量导入成功 "+updateCount+" "+insertCount;
    }

    public static ArrayList<String> poiExceltoSqlPanduan(String getString, String localFileName, String localFilePath, String localFileUploadTime) throws Exception {

        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        int[] rs_count = new int[2];
        ArrayList<String> sectionList = new ArrayList<String>();

        try {
//            QmpController qmp = new QmpController();
//            String localFileName = localFileName;
//            String localFilePath = localFilePath;
//            String localFileUploadTime = localFileUploadTime;
//            String localFileOriName = localFileName.split("_")[0];
            String[] fopt = getString.split("\\.");
//            fopt[1] = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1);
//            String realname = fopt[0];
            String checkFileName = fopt[0].replaceFirst("上传成功! ", "") + "_" + localFileUploadTime + "." + fopt[1];
            System.out.println(localFileName);
            System.out.println(localFilePath);
            System.out.println(checkFileName);
            System.out.println(fopt[0]);
            System.out.println(fopt[1]);

            // 同时支持Excel 2003、2007
            if (checkFileName.equals(localFileName)) {
                File excelFile = new File(localFilePath); // 创建文件对象
//                checkExcelVaild(excelFile);

                FileInputStream fis = new FileInputStream(excelFile); // 文件流

                Workbook workbook = getWorkbook(fis, excelFile);
//                Workbook workbook = WorkbookFactory.create(fis); // 这种方式 Excel2003/2007/2010都是可以处理的

                int sheetCount = workbook.getNumberOfSheets(); // Sheet的数量
                /**
                 * 设置当前excel中sheet的下标：0开始
                 */
                Sheet sheet = workbook.getSheetAt(0);   // 遍历第一个Sheet

                sheet.setDisplayGridlines(true);
                int rowStart = 2;
                int rowEnd = sheet.getLastRowNum();

                Row row_title = sheet.getRow(0);
                int max_column = row_title.getLastCellNum();
                System.out.println(max_column);
                for (int rowNum = rowStart; rowNum <= rowEnd; rowNum++) {

                    Row row = sheet.getRow(rowNum);
                    StringBuilder rowValue = new StringBuilder();
                    for (int cn = 0; cn < max_column; cn++) {
                        Cell cell = row.getCell(cn, Row.RETURN_BLANK_AS_NULL);

                        String cellValue = "";
                        if (cell == null) {
                            cellValue = "\"\",";
                            rowValue.append(cellValue);
                        } else {
                            int cellType = cell.getCellType();

                            switch (cellType) {
                                case Cell.CELL_TYPE_STRING:     // 文本
                                    cellValue = '"' + cell.getRichStringCellValue().getString() + '"' + ',';
                                    break;
                                case Cell.CELL_TYPE_NUMERIC:    // 数字、日期
                                    if (DateUtil.isCellDateFormatted(cell)) {
                                        cellValue = fmt.format(cell.getDateCellValue()) + ",";
                                    } else {
                                        cell.setCellType(Cell.CELL_TYPE_STRING);
                                        cellValue = String.valueOf(cell.getRichStringCellValue().getString()) + ",";
                                    }
                                    break;
                                case Cell.CELL_TYPE_BOOLEAN:    // 布尔型
                                    cellValue = String.valueOf(cell.getBooleanCellValue()) + ",";
                                    break;
                                case Cell.CELL_TYPE_BLANK: // 空白
                                    cellValue = '"' + cell.getStringCellValue() + '"' + ",";
                                    break;
                                case Cell.CELL_TYPE_ERROR: // 错误
                                    cellValue = "错误#";
                                    break;
                                case Cell.CELL_TYPE_FORMULA:    // 公式
                                    // 得到对应单元格的公式
                                    //cellValue = cell.getCellFormula() + "#";
                                    // 得到对应单元格的字符串
                                    cell.setCellType(Cell.CELL_TYPE_STRING);
                                    cellValue = String.valueOf(cell.getRichStringCellValue().getString()) + ",";
                                    break;
                                default:
                                    cellValue = ",";
                            }
                            rowValue.append(cellValue);
                        }
                    }
                    //rowValue = connectMySQL(rowValue.toString());
                    String driver = "com.mysql.jdbc.Driver";
                    String url = "jdbc:mysql://localhost:3306/new_env";
                    //        String url = "jdbc:mysql://127.0.0.1:3306/quick4j";
                    String username = "root";
                    String password = "18342212808y";
                    //        String password = "123456";

                    Connection conn = null;
                    Class.forName(driver);
                    conn = DriverManager.getConnection(url, username, password);
                    if (!conn.isClosed()) {
                        System.out.println("数据库链接成功！");

                    }
                    String sql = "";
                    // 创建statement类对象，用来执行SQL语句
                    Statement statement = conn.createStatement();
                    String section_tmp = rowValue.toString();
                    System.out.println(section_tmp);
                    String section_name = section_tmp.split(",")[9];
                    System.out.println(section_name);
                    if(!checkHasExistPanduan(section_name)){
                        sectionList.add(section_name);
                        String section1 = section_name.substring(1,section_name.length()-1);
                        ArrayList<String> list = sectionLike(section1);
                        String str = "可能相关的断面为:";
                        for (Object obj : list) {
                            str += " ";
                            str += obj;

                        }
                        str += "\n";
                        sectionList.add(str);
                    }

                    System.out.println(sectionList);
                    conn.close();


                }
            } /*else {
                return "文件不存在，请重新上传！";
            }*/
            System.out.println(sectionList);

//            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            bw.close();
        }
        return sectionList;
    }

    public static void main(String args[]) throws Exception {
        String OriFileName = "上报总站监测司-辽宁省点位信息及数据---2013.xls";
        String localFileName = "上报总站监测司-辽宁省点位信息及数据---2013_20170817161501.xls";
        String localFilePath = "C:/Users/笑笑/Desktop/断面基本信息模板.xls";
        String localFileUploadTime = "20170817161501";


        String sa = poiExceltoSql(OriFileName, localFileName, localFilePath, localFileUploadTime);
        System.out.println(sa);

    }
}
