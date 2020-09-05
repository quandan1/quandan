package com.eliteams.quick4j.test.main;

import org.junit.Test;

public class Main {

    @Test
    public void testFind(){
        String str = "0.123";
        int end = str.indexOf(".");
        System.out.println(str.substring(0,end+2));

    }

}
