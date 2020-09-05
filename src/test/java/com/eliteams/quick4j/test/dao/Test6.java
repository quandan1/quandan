package com.eliteams.quick4j.test.dao;

public class Test6 {

    public static void main(String[] args) {

        String date = "2017-09-19 14:40:01";
        String response = date.replaceAll("[[\\s-:punct:]]","");
        System.out.println(response);
    }
}
