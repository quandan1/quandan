package com.eliteams.quick4j.web.controller;

import java.io.*;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.util.*;
import java.lang.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.eliteams.quick4j.web.controller.QmpController;

public class poiExcelSzxz {
    private static final String EXCEL_XLS = "xls";
    private static final String EXCEL_XLSX = "xlsx";
    public static boolean checkHasExist(String section_name, String year, String month) throws ClassNotFoundException, SQLException {
        System.out.println(section_name);
        String sql = "SELECT * FROM qmp_test_data WHERE section_name="+ section_name + " AND year="+ year + " AND month="+ month;
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
//        String sql = "SELECT * FROM qmp_test_data WHERE section_name LIKE '%"+ section_name +"%'";
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
        for (int i = 1; i < clean_row_list.length-1; i++) {
           /* if (i != 0) {
                clean_row += clean_row_list[i] + ",";

            }
            if (i == clean_row_list.length-1) {
                clean_row += clean_row_list[i];
            }
            else {
                clean_row += clean_row_list[i] + ",";
            }*/
            clean_row += clean_row_list[i] + ",";

        }
        System.out.println(clean_row);
        String new_rowValue = clean_row + "0";



        /*id	year	month	section_bm	section_name
        loc_city	loc_river	ddl	water_temperature	ph
        rjy	tmd	yd	cod_mn	cod_cr	nh_n	t_p	t_n	cu	zn
        pb	cd	bod5	t_as	t_se	t_hg	cr_6	f_
        cn_	hff	syl	las	s2_	chla	no3	no2	ll	sw	fdcjqbz
        */
        String columnName = "(year, month, section_bm," +
                " section_name,loc_city, loc_river, ddl, water_temperature" +
                ",ph, rjy, tmd, yd, cod_mn" +
                ",cod_cr, nh_n, t_p, t_n, cu" +
                ",zn, pb, cd, bod5, t_as, t_se " +
                ",t_hg, cr_6, f_, cn_, hff, syl, las, s2_, chla, no3, no2" +
                ", ll, sw, fdcjqbz,is_del) ";
        String sql = "";
        sql = "INSERT INTO qmp_test_data"+columnName +"VALUES(" + new_rowValue + ");" + "\n";
        System.out.println(sql);
        return sql;
    }

    public static String executeUpdate(String rowValue, String section_name, String year, String month) {

        String new_rowValue = rowValue.substring(0, rowValue.length() - 1) + ",0";
        System.out.println("new_rowValue:" + new_rowValue);
        String[] rowValue_list = new_rowValue.split(",");

        String sql = "";
        sql = "UPDATE qmp_test_data SET year="+rowValue_list[1]+",month="+rowValue_list[2]+
                ",section_bm="+rowValue_list[3]+",section_name=" +rowValue_list[4]+",loc_city=" +rowValue_list[5]+",loc_river=" +rowValue_list[6]+
                ",ddl="+rowValue_list[7]+",water_temperature="+rowValue_list[8]+",ph="+rowValue_list[9]+",rjy="+rowValue_list[10]+
                ",tmd="+rowValue_list[11]+",yd="+rowValue_list[12]+",cod_mn="+rowValue_list[13]+
                ",cod_cr="+rowValue_list[14]+",nh_n="+rowValue_list[15]+",t_p="+rowValue_list[16]+",t_n="+rowValue_list[17]+
                ",cu="+rowValue_list[18]+",zn="+rowValue_list[19]+",pb="+rowValue_list[20]+",cd="+rowValue_list[21]+
                ",bod5="+rowValue_list[22]+",t_as="+rowValue_list[23]+",t_se="+rowValue_list[24]+",t_hg="+rowValue_list[25]+
                ",cr_6="+rowValue_list[26]+",f_="+rowValue_list[27]+",cn_="+rowValue_list[28]+",hff="+rowValue_list[29]+
                ",syl="+rowValue_list[30]+",las="+rowValue_list[31]+",s2_="+rowValue_list[32]+",chla="+rowValue_list[33]+
                ",no3="+rowValue_list[34]+",no2="+rowValue_list[35]+",ll="+rowValue_list[36]+",sw="+rowValue_list[37]+
                ",fdcjqbz="+rowValue_list[38]+",is_del="+rowValue_list[39]+
                " WHERE section_name="+section_name+" AND year="+year+" And month="+month;
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
        String section_name = rowValue.split(",")[4];
        String year = rowValue.split(",")[1];
        String month = rowValue.split(",")[2];
        String province = rowValue.split(",")[39];
        System.out.println(section_name);
        if(checkHasExist(section_name, year, month)){
            sql = executeUpdate(rowValue, section_name, year, month);
            rs_count_update = rs_count_update + statement.executeUpdate(sql);
        }
        else{
            if(province.equals("\"辽宁省\"")||province.equals("\"辽宁\"")) {
                sql = executeInsert(rowValue);
                rs_count_insert += statement.executeUpdate(sql);
            }
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

    public static String match (String rowNameValue1,String rowValue1){
        String[] clean_row_list = rowValue1.split(",");
        String[] clean_row_list_name = rowNameValue1.split(",");
        String[] clean_row = new String[40];
        clean_row[0] = "1"+ ",";
        String clean_row1 = "";
        int j = 1;
        for (int i = 0; i < clean_row_list_name.length; i++) {
            System.out.println(clean_row_list[i]);
            if(clean_row_list[i].length() >= 2) {
                if (clean_row_list[i].substring(clean_row_list[i].length() - 2).equals("L\"") || clean_row_list[i].substring(clean_row_list[i].length() - 2) == "L\"")
                    clean_row_list[i] = clean_row_list[i].substring(0, clean_row_list[i].length() - 2) + "\"";
            }
            if (clean_row_list_name[i].equals("\"年份\"")){
                clean_row[1] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"月份\"")){
                clean_row[2] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"断面编码\"")){
                clean_row[3] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"断面名称\"")){
                clean_row[4] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"所在地区\"") || clean_row_list_name[i].equals("\"测站名称\"")){
                clean_row[5] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"所在河流\"") || clean_row_list_name[i].equals("\"河流名称\"")){
                clean_row[6] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"电导率(ms/m)\"")){
                clean_row[7] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"水温(℃)\"")){
                clean_row[8] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"pH值\"") || clean_row_list_name[i].equals("\"pH\"")){
                clean_row[9] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"溶解氧(mg/L)\"") || clean_row_list_name[i].equals("\"溶解氧\"")){
                clean_row[10] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"透明度(cm)\"")){
                clean_row[11] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"盐度(‰)\"")){
                clean_row[12] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"高锰酸盐指数标准\nCOD Mn(mg/L)\"") || clean_row_list_name[i].equals("\"COD Mn(mg/L)\"") || clean_row_list_name[i].equals("\"高锰酸盐指数\"")){
                clean_row[13] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"化学需氧量标准\nCOD Cr(mg/L)\"") || clean_row_list_name[i].equals("\"COD Cr(mg/L)\"") || clean_row_list_name[i].equals("\"化学需氧量\"")){
                clean_row[14] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"氨氮标准\nNH3-N(mg/L)\"") || clean_row_list_name[i].equals("\"NH3-N(mg/L)\"") || clean_row_list_name[i].equals("\"氨氮\"")){
                clean_row[15] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"总磷标准\nT-P(mg/L)\"") || clean_row_list_name[i].equals("\"T-P(mg/L)\"") || clean_row_list_name[i].equals("\"总磷\"")){
                clean_row[16] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"总氮标准\nT-N(mg/L)\"") || clean_row_list_name[i].equals("\"T-N(mg/L)\"") || clean_row_list_name[i].equals("\"总氮\"")){
                clean_row[17] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"铜标准\nCu(mg/L)\"") || clean_row_list_name[i].equals("\"Cu(mg/L)\"") || clean_row_list_name[i].equals("\"总铜\"")){
                clean_row[18] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"锌标准\nZn(mg/L)\"") || clean_row_list_name[i].equals("\"Zn(mg/L)\"") || clean_row_list_name[i].equals("\"总锌\"")){
                clean_row[19] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"铅标准\nPb(mg/L)\"") || clean_row_list_name[i].equals("\"Pb(mg/L)\"") || clean_row_list_name[i].equals("\"总铅\"")){
                clean_row[20] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"镉标准\nCd(mg/L)\"") || clean_row_list_name[i].equals("\"Cd(mg/L)\"") || clean_row_list_name[i].equals("\"总镉\"")){
                clean_row[21] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"生化需氧量标准\nBOD5(mg/L)\"") || clean_row_list_name[i].equals("\"BOD5(mg/L)\"") || clean_row_list_name[i].equals("\"生化需氧量\"")){
                clean_row[22] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"砷标准\nT-As(mg/L)\"") || clean_row_list_name[i].equals("\"T-As(mg/L)\"") || clean_row_list_name[i].equals("\"总砷\"")){
                clean_row[23] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"硒标准\nT-Se(mg/L)\"") || clean_row_list_name[i].equals("\"T-Se(mg/L)\"") || clean_row_list_name[i].equals("\"硒\"")){
                clean_row[24] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"汞标准\nT-Hg(mg/L)\"") || clean_row_list_name[i].equals("\"T-Hg(mg/L)\"") || clean_row_list_name[i].equals("\"总汞\"")){
                clean_row[25] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"六价铬标准\nCr6+(mg/L)\"") || clean_row_list_name[i].equals("\"Cr6+(mg/L)\"") || clean_row_list_name[i].equals("\"铬（六价）\"")){
                clean_row[26] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"氟化物标准\nF-(mg/L)\"") || clean_row_list_name[i].equals("\"F-(mg/L)\"") || clean_row_list_name[i].equals("\"氟化物\"")){
                clean_row[27] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"氰化物标准\nCN-(mg/L)\"") || clean_row_list_name[i].equals("\"CN-(mg/L)\"") || clean_row_list_name[i].equals("\"氰化物\"")){
                clean_row[28] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"挥发酚(mg/L)\"") || clean_row_list_name[i].equals("\"挥发酚\"")){
                clean_row[29] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"石油类(mg/L)\"") || clean_row_list_name[i].equals("\"石油类\"")){
                clean_row[30] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"阴离子表面活性剂标准\nLAS(mg/L)\"") || clean_row_list_name[i].equals("\"LAS(mg/L)\"") || clean_row_list_name[i].equals("\"阴离子表面活性剂\"")){
                clean_row[31] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"硫化物标准\nS2-(mg/L)\"") || clean_row_list_name[i].equals("\"S2-(mg/L)\"") || clean_row_list_name[i].equals("\"硫化物\"")){
                clean_row[32] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"Chla(mg/L)\"")){
                clean_row[33] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"NO3-(mg/L)\"")){
                clean_row[34] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"NO2-(mg/L)\"")){
                clean_row[35] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"流量(m3/s)\"")){
                clean_row[36] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"水位\"")){
                clean_row[37] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"粪大肠菌群标准（个/L)\"")){
                clean_row[38] = clean_row_list[i] + ",";
                j++;

            }else if(clean_row_list_name[i].equals("\"所属省份\"")){
                clean_row[39] = clean_row_list[i] + ",";
                j++;

            }
        }
        for (int n = 0; n < clean_row.length; n++){
            if(clean_row[n] == null || clean_row[n].isEmpty()){
                clean_row[n] = "\"\""+ ",";
            }
            clean_row1 += clean_row[n];
        }
        return clean_row1;
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
            int fopt_num = fopt.length-1;
//            fopt[1] = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1);
//            String realname = fopt[0];
            String checkFileName = fopt[0].replaceFirst("上传成功! ", "") + "_" + localFileUploadTime + "." + fopt[fopt_num];
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
                int rowStart = 1;
                int rowEnd = sheet.getLastRowNum();

                Row row_title = sheet.getRow(0);
                int max_column = row_title.getLastCellNum();
                System.out.println(max_column);

                Row rowColumNmae = sheet.getRow(0);
                StringBuilder rowNameValue = new StringBuilder();
                for (int cn = 0; cn < max_column; cn++) {
                    Cell cellName = rowColumNmae.getCell(cn, Row.RETURN_BLANK_AS_NULL);

                    String cellValue = "";
                    if (cellName == null) {
                        cellValue = "\"\",";
                        rowNameValue.append(cellValue);
                    } else {
                        int cellType = cellName.getCellType();

                        switch (cellType) {
                            case Cell.CELL_TYPE_STRING:     // 文本
                                cellValue = '"' + cellName.getRichStringCellValue().getString() + '"' + ',';
                                break;
                            case Cell.CELL_TYPE_NUMERIC:    // 数字、日期
                                if (DateUtil.isCellDateFormatted(cellName)) {
                                    cellValue = fmt.format(cellName.getDateCellValue()) + ",";
                                } else {
                                    cellName.setCellType(Cell.CELL_TYPE_STRING);
                                    cellValue = String.valueOf(cellName.getRichStringCellValue().getString()) + ",";
                                }
                                break;
                            case Cell.CELL_TYPE_BOOLEAN:    // 布尔型
                                cellValue = String.valueOf(cellName.getBooleanCellValue()) + ",";
                                break;
                            case Cell.CELL_TYPE_BLANK: // 空白
                                cellValue = '"' + cellName.getStringCellValue() + '"' + ",";
                                break;
                            case Cell.CELL_TYPE_ERROR: // 错误
                                cellValue = "错误#";
                                break;
                            case Cell.CELL_TYPE_FORMULA:    // 公式
                                // 得到对应单元格的公式
                                //cellValue = cell.getCellFormula() + "#";
                                // 得到对应单元格的字符串
                                cellName.setCellType(Cell.CELL_TYPE_STRING);
                                cellValue = String.valueOf(cellName.getRichStringCellValue().getString()) + ",";
                                break;
                            default:
                                cellValue = ",";
                        }

                        rowNameValue.append(cellValue);
                    }
                }



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
                    String rowNameValue1 = rowNameValue.toString();
                    String rowValue1 = rowValue.toString();
                    //String[] clean_row_list = rowValue1.split(",");
                    //String[] clean_row_list_name = rowNameValue1.split(",");
                    String match = match(rowNameValue1,rowValue1);
                    rs_count = connectMySQL(match);
                    //rs_count = connectMySQL(rowValue.toString());
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
            int fopt_num = fopt.length-1;
            String checkFileName = fopt[0].replaceFirst("上传成功! ", "") + "_" + localFileUploadTime + "." + fopt[fopt_num];
            System.out.println(localFileName);
            System.out.println(localFilePath);
            System.out.println(checkFileName);
            System.out.println(fopt[0]);
            System.out.println(fopt[fopt_num]);

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
                int rowStart = 1;
                int rowEnd = sheet.getLastRowNum();

                Row row_title = sheet.getRow(0);
                int max_column = row_title.getLastCellNum();
                System.out.println(max_column);

                Row rowColumNmae = sheet.getRow(0);
                StringBuilder rowNameValue = new StringBuilder();
                for (int cn = 0; cn < max_column; cn++) {
                    Cell cellName = rowColumNmae.getCell(cn, Row.RETURN_BLANK_AS_NULL);

                    String cellValue = "";
                    if (cellName == null) {
                        cellValue = "\"\",";
                        rowNameValue.append(cellValue);
                    } else {
                        int cellType = cellName.getCellType();

                        switch (cellType) {
                            case Cell.CELL_TYPE_STRING:     // 文本
                                cellValue = '"' + cellName.getRichStringCellValue().getString() + '"' + ',';
                                break;
                            case Cell.CELL_TYPE_NUMERIC:    // 数字、日期
                                if (DateUtil.isCellDateFormatted(cellName)) {
                                    cellValue = fmt.format(cellName.getDateCellValue()) + ",";
                                } else {
                                    cellName.setCellType(Cell.CELL_TYPE_STRING);
                                    cellValue = String.valueOf(cellName.getRichStringCellValue().getString()) + ",";
                                }
                                break;
                            case Cell.CELL_TYPE_BOOLEAN:    // 布尔型
                                cellValue = String.valueOf(cellName.getBooleanCellValue()) + ",";
                                break;
                            case Cell.CELL_TYPE_BLANK: // 空白
                                cellValue = '"' + cellName.getStringCellValue() + '"' + ",";
                                break;
                            case Cell.CELL_TYPE_ERROR: // 错误
                                cellValue = "错误#";
                                break;
                            case Cell.CELL_TYPE_FORMULA:    // 公式
                                // 得到对应单元格的公式
                                //cellValue = cell.getCellFormula() + "#";
                                // 得到对应单元格的字符串
                                cellName.setCellType(Cell.CELL_TYPE_STRING);
                                cellValue = String.valueOf(cellName.getRichStringCellValue().getString()) + ",";
                                break;
                            default:
                                cellValue = ",";
                        }

                        rowNameValue.append(cellValue);
                    }
                }

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
                    String rowNameValue1 = rowNameValue.toString();
                    String rowValue1 = rowValue.toString();
                    //String[] clean_row_list = rowValue1.split(",");
                    //String[] clean_row_list_name = rowNameValue1.split(",");
                    String match = match(rowNameValue1,rowValue1);
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
                    String section_tmp = match.toString();
                    System.out.println(section_tmp);
                    String section_name = section_tmp.split(",")[4];
                    String province = section_tmp.split(",")[39];
                    System.out.println(section_name);
                    System.out.println(province);
                    if(province.equals("\"辽宁省\"")||province.equals("\"辽宁\"")) {
                        if (!checkHasExistPanduan(section_name)) {
                            sectionList.add(section_name);
                            //此处展开提示

                            String section1 = section_name.substring(1, section_name.length() - 1);
                            ArrayList<String> list = sectionLike(section1);
                            String str = "可能相关的断面为:";
                            for (Object obj : list) {
                                str += " ";
                                str += obj;

                            }
                            str += "\n";
                            sectionList.add(str);
                            //此处结束提示

                        }
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
       /* String localFilePath = "D:/EnvironmentalProtection/EnvironmentalProtection/target/quick4j/upload/qmp/上报总站监测司-辽宁省点位信息及数据---2013_20170817161501.xls";*/
        String localFilePath = "C:/Users/jmc87/Desktop/四月实测数据.xls";
        String localFileUploadTime = "20170817161501";


        String sa = poiExceltoSql(OriFileName, localFileName, localFilePath, localFileUploadTime);
        System.out.println(sa);

    }
}
