package com.eliteams.quick4j.web.controller;

//import com.sun.org.apache.xpath.internal.SourceTree;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.text.SimpleDateFormat;

public class poiExcelCu {
    private static final String EXCEL_XLS = "xls";
    private static final String EXCEL_XLSX = "xlsx";

    public static boolean checkHasExist(String unit_name) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM control_unit WHERE unit_name=" + unit_name;
        System.out.println(sql);

        String driver = "com.mysql.jdbc.Driver";

        String url = "jdbc:mysql://localhost:3306/new_env";
//        String url = "jdbc:mysql://127.0.0.1:3306/quick4j";
        String password = "18342212808y";
//        String password = "123456";

        String username = "root";

        Connection conn = null;
        Class.forName(driver);
        conn = DriverManager.getConnection(url, username, password);
        if (!conn.isClosed()) {
            System.out.println("数据库链接成功——查询！");
        }
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        if (rs.next()) {
            conn.close();
            return true;
        } else {
            conn.close();
            return false;
        }


    }

    public static String executeInsert(String rowValue) {
        System.out.println("-----------------------------------");
        System.out.println(rowValue);
        String[] clean_row_list = rowValue.split(",");
        String clean_row = "";
        for (int i = 0; i < clean_row_list.length; i++) {
            if (i != 0) {
                if(clean_row_list[8].equals("\"\"") ||clean_row_list[8].equals("\'\'") ){
                    clean_row_list[8]= "0";
                }
                System.out.println(clean_row_list[8]);
                clean_row += clean_row_list[i] + ",";

            }






        }
        System.out.println(clean_row);
        String new_rowValue = clean_row + "0";


/**
 * unit_name
 include_section
 watershed
 loc_province
 involve_city
 involve_county
 involve_village
 village_amount
 involve_river
 unit_type
 water_resource
 is_del
 hr_river
 *
 *
 * */

        String columnName = "(unit_name, include_section, watershed," +
                " loc_province,involve_city, involve_county, involve_village, village_amount" +
                ",involve_river, unit_type, water_resource, hr_river,is_del) ";
        String sql = "";
        sql = "INSERT INTO control_unit" + columnName + "VALUES(" + new_rowValue + ");" + "\n";
        System.out.println("insert语句：\n" + sql);
        return sql;
    }

    public static String executeUpdate(String rowValue, String unit_name) {

        String new_rowValue = rowValue.substring(0, rowValue.length() - 1) + ",0";
        System.out.println("new_rowValue:" + new_rowValue);
        String[] rowValue_list = new_rowValue.split(",");
        if(rowValue_list[8].equals("\"\"")){
            rowValue_list[8] = "0";
        }
        String sql = "";
        sql = "UPDATE control_unit SET include_section=" + rowValue_list[2] + ",watershed=" + rowValue_list[3] +
                ",loc_province=" + rowValue_list[4] + ",involve_city=" + rowValue_list[5] + ",involve_county=" + rowValue_list[6] +
                ",involve_village=" + rowValue_list[7] + ",village_amount=" + rowValue_list[8] + ",involve_river=" + rowValue_list[9] + ",unit_type=" + rowValue_list[10] +
                ",water_resource=" + rowValue_list[11] +",hr_river=" + rowValue_list[12] + ",is_del=" + rowValue_list[13] + " WHERE unit_name=" + unit_name;
        System.out.println(sql);
        return sql;
    }


    public static int[] connectMySQL(String rowValue) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";

        String url = "jdbc:mysql://localhost:3306/new_env";
//        String url = "jdbc:mysql://127.0.0.1:3306/quick4j";
        String password = "18342212808y";
//        String password = "123456";
        String username = "root";
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
        String unit_name = rowValue.split(",")[1];
        System.out.println(unit_name);
        if (checkHasExist(unit_name)) {
            sql = executeUpdate(rowValue, unit_name);
            rs_count_update = rs_count_update + statement.executeUpdate(sql);
        } else {
            sql = executeInsert(rowValue);
            rs_count_insert += statement.executeUpdate(sql);
        }
        System.out.println(rs_count_update);
        System.out.println(rs_count_insert);
        rs_count[0] = rs_count_update;
        rs_count[1] = rs_count_insert;


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

            String[] fopt = getString.split("\\.");

            String checkFileName = fopt[0].replaceFirst("上传成功! ", "") + "_" + localFileUploadTime + "." + fopt[1];
            System.out.println(localFileName);
            System.out.println(localFilePath);
            System.out.println(checkFileName);
            System.out.println(fopt[0]);
            System.out.println(fopt[1]);

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
                System.out.println("pre_rowEnd");
                System.out.println(rowEnd);
                System.out.println(sheet.getRow(rowEnd).getCell(0));
                while(sheet.getRow(rowEnd).getCell(0).toString().equals("")){
                    rowEnd = rowEnd -1;
                    System.out.println(rowEnd);
                }
                System.out.println("rowEnd:");
                System.out.println(rowEnd);
                Row row_title = sheet.getRow(1);
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
                                case Cell.CELL_TYPE_STRING:
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
                    System.out.println("更新了" + updateCount + "条信息");
                    System.out.println("新增了" + insertCount + "条信息");
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
        return "文件批量导入成功 " + updateCount + " " + insertCount;
    }

    public static void main(String args[]) throws Exception {
        String OriFileName = "上报总站监测司-辽宁省点位信息及数据---2013.xls";
        String localFileName = "上报总站监测司-辽宁省点位信息及数据---2013_20170817161501.xls";
        String localFilePath = "D:/EnvironmentalProtection/EnvironmentalProtection/target/quick4j/upload/qmp/上报总站监测司-辽宁省点位信息及数据---2013_20170817161501.xls";
        String localFileUploadTime = "20170817161501";


        String sa = poiExceltoSql(OriFileName, localFileName, localFilePath, localFileUploadTime);
        System.out.println(sa);

    }
}
