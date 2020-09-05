package com.eliteams.quick4j.test.dao;

import java.io.*;
import java.text.SimpleDateFormat;

public class Test13 {

    public static void main(String[] args)  {
        File file =new File("C:\\Users\\Administrator\\Desktop\\用list方法加载流量步骤.mslf");
        if(file.exists()){
            long mysize = file.length();
            long lastModified = file.lastModified();
            SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");//注意大小写是不一样的，一般返回时间和日期都是以毫秒和字节这些基本的单位

// dateFormat.format(lastModified);
            System.out.println("修改时间"+":"+ dateFormat.format(lastModified));
        }
    }


}