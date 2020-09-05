package com.eliteams.quick4j.test.dao;


import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Test9{

    public static void main(String[] args) throws DocumentException {
     XMLUtil x = new XMLUtil();

System.out.println(x.getAddress("sql"));
    }

}



