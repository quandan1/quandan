package com.eliteams.quick4j.web.util;

import freemarker.template.Configuration;
import freemarker.template.Template;

//import javax.print.Doc;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class DocUtil {
    private static Configuration configuration = null;
    private static Map<String, Template> allTemplates = null;

//    static {
//        configuration = new Configuration();
//        configuration.setDefaultEncoding("utf-8");
//        configuration.setClassForTemplateLoading(DocUtil.class, "/com/eliteams/quick4j/web/util");
//        allTemplates = new HashMap<>();   //
//        try {
//            allTemplates.put("resume", configuration.getTemplate("city.ftl"));
//        } catch (IOException e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }
//    }

    public static File createDoc(Map<?, ?> dataMap, String type,String city) {
        configuration = new Configuration();
        configuration.setDefaultEncoding("utf-8");
        configuration.setClassForTemplateLoading(DocUtil.class, "/");
        allTemplates = new HashMap<>();   //
        try {
            allTemplates.put("resume", configuration.getTemplate("city.ftl"));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        String name = "temp" + (int) (Math.random() * 100000) +"-"+city+ ".doc";
        File f = new File(name);
        Template t = allTemplates.get(type);
        try {
            // 这个地方不能使用FileWriter因为需要指定编码类型否则生成的Word文档会因为有无法识别的编码而无法打开
            Writer w = new OutputStreamWriter(new FileOutputStream(f), "utf-8");
            t.process(dataMap, w);
            w.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return f;
    }
}
