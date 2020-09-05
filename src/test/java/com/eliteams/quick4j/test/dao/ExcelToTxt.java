package com.eliteams.quick4j.test.dao;

import org.apache.poi.ss.usermodel.*;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class ExcelToTxt {

//    private static FindFile[] getFiles(String path) {
//        FindFile file = new FindFile(path);
//        // get the folder list
//        FindFile[] array = file.listFiles();
//        return array;
//    }
//
//    public static void main(String[] args) throws IOException {
//        FindFile[] files = getFiles("C:\\Users\\Administrator\\Desktop\\haha");
//        for (int i = 0; i < files.length; i++) {
//            if (files[i].isFile()) {
//                System.out.println("f==" + files[i].getPath() + "  " + files[i].getName());
//                publishTxt(files[i].getPath());
//            }
//            if (files[i].isDirectory()) {
//                System.out.println("d==" + files[i].getPath() + "  " + files[i].getName());
//                FindFile[] files2 = getFiles(files[i].getPath());
//                for (int j = 0; j < files2.length; j++) {
//                    publishTxt(files2[j].getPath());
//                }
//
//            }
//        }
//    }

    public static void publishTxt(String excelPath) {
        String columns[] = {"时间", "上游水位", "下游水位"};
        Workbook wb = null;
        Sheet sheet = null;
        Row row = null;
        List<Map<String, String>> list = null;
        String cellData = null;
        String fileType = excelPath.substring(excelPath.indexOf('.') + 1);



        // 遍历解析出来的list
        StringBuffer sb = new StringBuffer();
        sb.append("\r\n");
        for (int i = 0; i < list.size(); i++) {
            for (Map.Entry<String, String> entry : list.get(i).entrySet()) {
                String value = entry.getValue();
                sb.append(value + "\t");
            }
            sb.append("\r\n");
        }
        System.out.println("*************转成TXT格式成功*************");

    }

//    // 读取excel
//    public static Workbook readExcel(String filePath) {
//        Workbook wb = null;
//        if (filePath == null) {
//            return null;
//        }
//        String extString = filePath.substring(filePath.lastIndexOf("."));
//        InputStream is = null;
//        try {
//            is = new FileInputStream(filePath);
//            if (".xls".equals(extString)) {
//                return wb = new HSSFWorkbook(is);
//            } else if (".xlsx".equals(extString)) {
//                return wb = new XSSFWorkbook(is);
//            } else {
//                return wb = null;
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return wb;
//    }
//    public static String getCellFormatValue(Cell cell) {
//        //判断是否为null或空串
//        if (cell == null || cell.toString().trim().equals("")) {
//            return "";
//        }
//        String cellValue = "";
//        int cellType = cell.getCellType();
//        switch (cellType) {
//            case Cell.CELL_TYPE_NUMERIC: // 数字
//                short format = cell.getCellStyle().getDataFormat();
//                if (DateUtil.isCellDateFormatted(cell)) {
//                    SimpleDateFormat sdf = null;
//                    //System.out.println("cell.getCellStyle().getDataFormat()="+cell.getCellStyle().getDataFormat());
//                    if (format == 20 || format == 32) {
//                        sdf = new SimpleDateFormat("HH:mm");
//                    } else if (format == 14 || format == 31 || format == 57 || format == 58) {
//                        // 处理自定义日期格式：m月d日(通过判断单元格的格式id解决，id的值是58)
//                        sdf = new SimpleDateFormat("yyyy-MM-dd");
//                        double value = cell.getNumericCellValue();
//                        Date date = org.apache.poi.ss.usermodel.DateUtil
//                                .getJavaDate(value);
//                        cellValue = sdf.format(date);
//                    } else {// 日期
//                        sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//
//
//                    }
//                    try {
//                        cellValue = sdf.format(cell.getDateCellValue());// 日期
//                    } catch (Exception e) {
//                        try {
//                            throw new Exception("exception on get date data !".concat(e.toString()));
//                        } catch (Exception e1) {
//                            e1.printStackTrace();
//                        }
//                    } finally {
//                        sdf = null;
//                    }
//                } else {
//                  BigDecimal bd = new BigDecimal(cell.getNumericCellValue());
//                    BigDecimal newt1 = BigDecimal.ZERO;
//
//
//
//                    newt1 = newt1.add(bd.setScale(5,RoundingMode.FLOOR));
//               //     bd.setScale(2, RoundingMode.HALF_UP);
//                    cellValue = newt1.toPlainString();// 数值 这种用BigDecimal包装再获取plainString，可以防止获取到科学计数值
//                    //  cellValue = cell.getNumericCellValue()+"";
//
//
//                }
//                break;
//            case Cell.CELL_TYPE_STRING: // 字符串
//                cellValue = cell.getStringCellValue();
//                break;
//            case Cell.CELL_TYPE_BOOLEAN: // Boolean
//                cellValue = cell.getBooleanCellValue() + "";
//                ;
//                break;
//            case Cell.CELL_TYPE_FORMULA: // 公式
//                cellValue = cell.getCellFormula();
//                break;
//            case Cell.CELL_TYPE_BLANK: // 空值
//                cellValue = "";
//                break;
//            case Cell.CELL_TYPE_ERROR: // 故障
//                cellValue = "ERROR VALUE";
//                break;
//            default:
//                cellValue = "UNKNOW VALUE";
//                break;
//        }
//        return cellValue;
//    }

    /**
     * 生成文件
     *
     * @param str
     * @param filePath
     * @throws IOException
     */

    public static void WriteToFile(String str, String filePath) throws IOException {
        BufferedWriter bw = null;
        try {
            FileOutputStream out = new FileOutputStream(filePath, true);// true,表示:文件追加内容，不重新生成,默认为false
            bw = new BufferedWriter(new OutputStreamWriter(out, "GBK"));
            bw.write(str += "\r\n");// 换行
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bw.close();
        }
    }


    public static boolean isNumber(Object o) {
        return (Pattern.compile("[0-9]*")).matcher(String.valueOf(o)).matches();
    }



}