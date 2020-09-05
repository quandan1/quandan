package com.eliteams.quick4j.test.dao;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;

public class Test2 {
    public static void main(String[] args) {
        try {
            HSSFWorkbook work = new HSSFWorkbook(new FileInputStream("C:\\Users\\Administrator\\Desktop\\1\\temp.xls"));// 得到这个excel表格对象
            HSSFSheet sheet = work.getSheetAt(0); //得到第一个sheet
            int rowNo = sheet.getLastRowNum(); //得到行数
            for (int i = 1; i < rowNo; i++) {
                HSSFRow row = sheet.getRow(i);
                HSSFCell cell1 = row.getCell((short) 1);
                HSSFCell cell2 = row.getCell((short) 2);
                HSSFCell cell3 = row.getCell((short) 3);
                SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

                String ce1 = cell1 == null ? "空" :  df.format((cell1.getDateCellValue()));
                String ce2 = cell2 == null ? "空" : String.valueOf(cell2.getNumericCellValue());
                String ce3 = cell3 == null ? "空" : String.valueOf(cell3.getNumericCellValue());

                System.out.println(ce1 + "\t" + ce2 + "\t" + ce3);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


