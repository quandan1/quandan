package com.eliteams.quick4j.test.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Test3 {


    private static double[] dArrs;

    public static void main(String[] args) {

        System.out.println("文件测试数据如下");
        try {
            double[] file = getFile("数据结构第二阶段.txt");

            for (int i = 0; i < file.length; i++) {

                System.out.print(file[i] + " ");

            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("正在写入文件数据......");
        try {
            toFile("inputFile.txt");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    //从文件中读取数据
    private static double[] getFile(String pathName) throws Exception {
        //【1】先创建一个File的实体对象
        File file = new File(pathName);
        if (!file.exists())
            throw new RuntimeException("找不到文件!");
        //【2】加载BUfferedReader流
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;

        //【3】一行一行读取
        while ((str = br.readLine()) != null) {

            int s = 0;
            //文件中数据的分割我用的是‘，’具体根据自己的情况调用下面的split（）函数
            String[] arr = str.split(",");

            dArrs = new double[arr.length];
            for (int i = 0; i < arr.length; i++) {
                String string = arr[i];
                int parseInt = Integer.parseInt(string);
                dArrs[i] = parseInt;

            }
        }
        return dArrs;
    }

    //将数据存储到文件中
    private static void toFile(String path) throws Exception {
        File file = null;
        FileWriter fWriter = null;
        file = new File(path);
        try {
            if (!file.exists()) {
                System.out.println("要读入数据的文件不存在");
            }
            fWriter = new FileWriter(file);
            fWriter.write(String.valueOf(dArrs[0]));
            fWriter.flush();
            System.out.println("写入数据成功！");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            if (fWriter != null) {
                fWriter.close();
            }
        }


    }

}
