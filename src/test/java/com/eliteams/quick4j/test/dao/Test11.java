package com.eliteams.quick4j.test.dao;

public class Test11 {

    public static void openExe() {

        String path = "C:\\Users\\Administrator\\Desktop\\用list方法加载流量步骤.mslf";

        String str = "D:\\Program Files (x86)\\AutoMouseKey\\automousekey.exe" +""+path ;

        try {

            Runtime.getRuntime().exec(str);
        } catch (Exception e) {
            System.out.println("open failure");
        }


    }

    public static void main(String[] args) {
        openExe();
    }
}
