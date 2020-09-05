package com.eliteams.quick4j.test.dao;

public class Mike11Test {

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process p = null;
        String fileLac = "";
        try {
//            fileLac =
//
//            "C:\\Program Files (x86)\\DHI\\2014\\bin\\x64\\MzShell-Chinese.exe";// 要调用的程序路径
//            p = rt.exec(fileLac);
            String str = "C:\\Program Files (x86)\\DHI\\2014\\bin\\x64\\MzShell-Chinese.exe  C:\\Users\\Administrator\\Desktop\\2017社河模拟\\Untitled1.sim11";
            Runtime.getRuntime().exec(str);
        } catch (Exception e) {
            System.out.println("open failure");
        }
    }

}




