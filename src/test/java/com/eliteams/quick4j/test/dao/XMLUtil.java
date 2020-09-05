package com.eliteams.quick4j.test.dao;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class XMLUtil {

    public String getAddress(String name) throws DocumentException {
        Document document = new SAXReader().read("D://ProgramFiles//IntelliJ IDEA 2019.3.1//project//quich4j//src//main//resources//address.xml");
        //获取根元素
        Element root = document.getRootElement();
        List<Element> address = root.elements();
        String b="";
        for (Element bookElement : address) {
            if (bookElement.attributeValue("name").equals(name)) {
                String textValue = bookElement.elementText("address");
                b=textValue;
                break;
            }else{
                b="找不到值";
            }
        }
        return b;
    }
}