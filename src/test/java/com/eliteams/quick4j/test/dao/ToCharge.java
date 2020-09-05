package com.eliteams.quick4j.test.dao;

import java.io.*;

public class ToCharge {



        public static void main(String[] args) {
            FileReader fr = null; //原始的字符输入流
            BufferedReader br = null; //缓冲字符输入流

            FileWriter fw = null; //原始的字符输出流
            BufferedWriter bw = null; //缓冲字符输出流

            try {
                fr = new FileReader("d://1.txt");
                br = new BufferedReader(fr);

                fw = new FileWriter("d://2.txt");
                bw = new BufferedWriter(fw);

                String line = br.readLine(); //读取源文件中的一行文本
                while(line != null) { //如果不为null则认为读取到了文本
                    System.out.println(line); //在控制台上显示文本
                    bw.write(line); //在目标文件中写该行文本
                    bw.newLine(); //目标文件新起一行
                    bw.flush(); //刷入目标文件
                    line = br.readLine(); //读取源文件的下一行文本
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if(fr != null) {
                        fr.close();
                    }
                    if(fw != null) {
                        fw.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

}
