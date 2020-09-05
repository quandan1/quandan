package com.eliteams.quick4j.test.dao;

import com.eliteams.quick4j.web.model.Qmp;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import javax.servlet.ServletOutputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Test8 {

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
}
