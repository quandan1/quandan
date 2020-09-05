package com.eliteams.quick4j.test.dao;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void getAllFileName(String path, ArrayList<String> listFileName) {
        File file = new File(path);
        File[] files = file.listFiles();
        String[] names = file.list();
        if (names != null) {
            String[] completNames = new String[names.length];
            for (int i = 0; i < names.length; i++) {
                completNames[i] = path + names[i];
            }
            listFileName.addAll(Arrays.asList(completNames));
        }
        for (File a : files) {
            if (a.isDirectory()) {//如果文件夹下有子文件夹，获取子文件夹下的所有文件全路径。
                getAllFileName(a.getAbsolutePath() + "\\", listFileName);
            }
        }
    }
        public static void main (String[]args){

            ArrayList<String> listFileName = new ArrayList<String>();
            ArrayList<String> fileList = new ArrayList<String>();
            getAllFileName("C:\\Users\\Administrator\\Desktop\\2017社河模拟\\", listFileName);
            for (String name : listFileName) {
                if (name.contains(".sim11") ) {
                    fileList.add(name);
                }
            }
            for(String n :fileList ){
                System.out.println(n);
            }

        }

    }
