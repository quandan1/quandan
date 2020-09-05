package com.eliteams.quick4j.test.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GetFiles {


    ArrayList<Object> list=new ArrayList<Object>();
    

    public  List<Object> getFiles(String path){

        File file = new File(path);
       String hehe= "";

        if(file.isDirectory()){
            //获取路径下的所有文件
            File[] files = file.listFiles();
            for(int i = 0;i<files.length;i++){
                //如果还是文件夹，递归获取里面的文件文件夹
                if(files[i].isDirectory()){

                     hehe= files[i].getPath();
                    list.add(hehe);
                   // System.out.println("目录"+files[i].getPath());
                    getFiles(files[i].getPath());

                }else{
                    //      System.out.println("文件"+files[i].getPath());
                }
            }
        }else{
    //  System.out.println("文件"+file.getPath());
        }
return list;
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\Administrator\\Desktop\\project";

        List<Object> list=new GetFiles().getFiles(path);
        List<String> bb= new ArrayList<String>();
        List<String> shuixi= new ArrayList<String>();
        for(Object obj:list){

           // System.out.println(obj);
            String a =(String)obj;
            String b ="C:\\Users\\Administrator\\Desktop\\project\\";

            String c = a.replace(b,"");
            bb.add(c);

        }
        for(String str:bb){
           int a = str.length();
           String str2 =str.replace("\\","");
           int b = str2.length();
           if(a==b){
               System.out.println("水系"+str);
           }else if(a-b==1){
               System.out.println("一级河流"+str);
           }else{
               System.out.println(str);
           }



        }
      //  System.out.println("文件总数："+list.size());


}
//ArrayList<Object> list=new ArrayList<Object>();
//
//    public List<Object> getFiles(File file){
//
//        File[] a=file.listFiles();
//
//        for(File file1:a){
//
//            if(file1.isDirectory()){
//
//                getFiles(new File(file1.getAbsolutePath()));
//
//            }else if(file1.isFile()){
//
//                this.list.add(file1.getAbsolutePath());
//
//            }
//        }
//        return list;
//
//    }
//
//
//    public static void main(String[] args) {
//
//        List<Object> list=new GetFiles().getFiles(new File("C:\\\\Users\\\\Administrator\\\\Desktop\\\\project"));
//
//        for(Object obj:list){
//
//            System.out.println(obj);
//
//        }
//        System.out.println("文件总数："+list.size());
//    }

}
