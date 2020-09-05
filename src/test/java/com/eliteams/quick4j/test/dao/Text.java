package com.eliteams.quick4j.test.dao;

import java.io.*;
import java.util.*;



public class Text {

    public static void writeDiskInfo(String a ) {



        File file = new File("C:\\Users\\Administrator\\Desktop\\project\\1.txt");

// 当文件目录不存在时
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();// 创建文件目录
        }

        try {

            file.createNewFile();// 创建文件
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            PrintStream printStream = new PrintStream(fileOutputStream);

            System.setOut(printStream);// 重新分配标准输出流
            System.out.println(a);

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }


}
