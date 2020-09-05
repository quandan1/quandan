package com.eliteams.quick4j.test.dao;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ToDfs0 {


    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("\r\n");
        sb.append("时间");
        sb.append("\t");//服务器的DHI地址；
        sb.append("下游边界水位");
        sb.append("\t");
        sb.append("上游边界流量");
        sb.append("\r\n");
        sb.append("1996-08-11 08:00:00");
        sb.append("\t");
        sb.append("4.21356");
        sb.append("\t");
        sb.append("9.21356");
        sb.append("\r\n");
        sb.append("1996-08-11 08:30:00");
        sb.append("\t");
        sb.append("4.265456");
        sb.append("\t");
        sb.append("9.217856");
        sb.append("\r\n");

        String dateb = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
        String date = dateb.replaceAll("[[\\s-:punct:]]", "");

        // File f = new File("C:\\Users\\Administrator\\Desktop" + "\\" + "txt" + date + ".txt");//新建文件
        try {
//            BufferedWriter bw = null;
//            FileWriter fw = null;
//
//           // fw = new FileWriter(f);
//            bw = new BufferedWriter(fw);
//            bw.write(sb.toString());
//            bw.flush();
//            bw.close();
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Administrator\\Desktop" + "\\" + "dfs0" + date + ".dfs0"));
            osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Administrator\\Desktop" + "\\" + "dfs0" + date + ".dfs0", true), "GBK");
            osw.write(String.valueOf(sb));
            osw.flush();
            osw.close();
            System.out.println("dfs0文件生成成功");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
