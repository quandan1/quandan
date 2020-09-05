package com.eliteams.quick4j.web.controller;

import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.model.Dmzljs;
import com.eliteams.quick4j.web.model.QmpWrxx;
import com.eliteams.quick4j.web.model.QmpWrxxYear;
import com.eliteams.quick4j.web.model.charts.*;
import com.eliteams.quick4j.web.service.QmpWrxxService;
import com.eliteams.quick4j.web.service.QmpWrxxYearService;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by FYZBXX on 2017/8/14.
 */
@Controller
@RequestMapping(value = "/qmpa")
public class QmpWrxxController {

    @Resource
    private QmpWrxxService qmpWrxxService;
    @Resource
    private QmpWrxxYearService qmpWrxxYearService;

    private String[] dics;
    private Double[] dlevels;
    private Map<String, String> map = new HashMap<String, String>();

    {
        map.put("ad", "氨氮");
        map.put("hxxyl", "化学需氧量");
        map.put("zd", "总氮");
        map.put("zl", "总磷");
        map.put("sum", "总指数");
        dics = QmpYearWrxxFormat.getDics();
        dlevels = QmpYearWrxxFormat.getDlevels();
    }

    public List<String> getElemLegendName() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("氨氮");
        list.add("化学需氧量");
        list.add("总氮");
        list.add("总磷");
        list.add("总指数");
        return list;
    }


    /**
     * @return
     */
    @RequestMapping("/prewrxx")
    public @ResponseBody
    Object getPreData(HttpServletRequest request) {


        String target = request.getParameter("target");
        String colname = null;
        String tname = null;

        switch (target) {
            case "yearCircle"://总指标逐年水质分析
                tname = "qmp_wrxx_year";
                colname = "dmmc";
                break;
            case "YearEq"://各指标多年单月水质分析
                tname = "tablecircle";
                colname = "section";
                break;
            case "MonthWrxx"://各指标一年逐月水质分析
                tname = "qmp_wrxx";
                colname = "section_name";
                break;
            case "YearOne"://某指标逐年逐月水质分析
                tname = "qmp_wrxx";
                colname = "section_name";
                break;
        }

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/new_env";
        String sql = "select distinct " + colname + " from " + tname;//从数据库表中取出唯一不同的值
        java.sql.PreparedStatement pstmt = null;
        LinkedList<String> slist = new LinkedList<String>();
//        LinkedList<String> dabiaoslist = new LinkedList<String>();
//        LinkedList<String> feidabiaoslist = new LinkedList<String>();
//        LinkedList<DuanMianDemo> sList2=new LinkedList<DuanMianDemo>(); //tom注释
        try {
            Class.forName(driver);//调用DriverManager的getConnection方法之前，保证相应的Driver类已经被加载到jvm中，并且完成了类的初始化工作
            Connection conn = DriverManager.getConnection(url, "root", "981225" );
            pstmt = conn.prepareStatement(sql);
            //pstmt.setString(1,colname);
            ResultSet rs = pstmt.executeQuery();//查找所有断面

            // section,year
            while (rs.next()) {
                String name = rs.getString(colname);
                //判断name是否达标
                //如果达标放在dabiaoslist中。如果不达标，放在feidabiaoslist中

                slist.add(name);
                
               /* DuanMianDemo duanMianDemo= new DuanMianDemo();
                duanMianDemo.setName(name);
                duanMianDemo.setType("1");
                sList2.add(duanMianDemo);
                
                DuanMianDemo duanMianDemo= new DuanMianDemo();
                duanMianDemo.setName(name);
                duanMianDemo.setType("0");
                sList2.add(duanMianDemo);*///tom注释
            }
            conn.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }

        Map<String, List> map = new HashMap<String, List>();
        map.put("section", slist);//添加元素
//		map.put("dabiaosection",dabiaoslist);
//		map.put("feidabiaosection",feidabiaoslist);
        return map;
    }

    /**
     * 年环比表
     *
     * @param year
     * @param section
     * @return
     */
    public List<Object> getYearCircle(String year, String section) {

        QmpWrxxYear qmpWrxxYear = qmpWrxxYearService.getBySection(section);
        QmpYearWrxxFormat qmpYearWrxxFormat = new QmpYearWrxxFormat();
        qmpYearWrxxFormat.Assign(qmpWrxxYear);
        //取年的总指数
        SumSeries yearSumSeries = new SumSeries();
        LinkedList<Integer> years = new LinkedList<Integer>();
        years.add(2014);
        years.add(2015);
        years.add(2016);
        yearSumSeries.Assign(qmpYearWrxxFormat, years);

        ChartSeries chartSeries = new ChartSeries();
        LinkedList<String> list = new LinkedList<String>();
        list.add("总指标");
        LinkedList<List<Double>> ydata = new LinkedList<List<Double>>();
        ydata.add(yearSumSeries.getLevels());
        chartSeries.Assign(section + "逐年总指标水质分析", "2014-2016", "时间", "污染指数", "年", "", years, list, ydata, null);

        LinkedList<Object> datas = new LinkedList<Object>();
        datas.add(chartSeries);
        return datas;
    }

    /**
     * 将得到的整理好格式的数据转换月份图表数据
     *
     * @param fomats
     * @return
     */
    private Object getMonthWrxxSeries(String section, String year, List<QmpWrxxFomat> fomats) {
        // 转化为序列化数据
        SplitSeries splitSeries = new SplitSeries();
        splitSeries.Assign(fomats, 12);
        List<String> legends = getElemLegendName();
        List<List<Double>> ydatas = splitSeries.getyData();
        ChartSeries chartSeries = new ChartSeries();
        chartSeries.Assign(section + year + "年逐月多指标分析",
                year, "月份", "污染指数", "", "", splitSeries.getMonths(),
                legends, ydatas, null
        );
        return chartSeries;
    }


    private List<QmpWrxxFomat> getMonthWrxxSql(String year, String section) {

        List<QmpWrxxFomat> list = new LinkedList<QmpWrxxFomat>();
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/new_env";
        String col = "id,section,year,month,ad,zd,zl,hxxyl ";
        String sql = "select " + col + "from tablecircle where section = \'" + section + "\' AND year=\'" + year + '\'';
        java.sql.PreparedStatement pstmt;

        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, "root", "981225");
            pstmt = conn.prepareStatement(sql);
            // pstmt.setString();
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                QmpWrxxFomat qmpWrxxFomat = new QmpWrxxFomat();
                String sad = rs.getString("ad");
                String shxxyl = rs.getString("hxxyl");
                String szd = rs.getString("zd");
                String szl = rs.getString("zl");
                String syear = rs.getString("year");
                String smonth = rs.getString("month");
                qmpWrxxFomat.Assign(syear, smonth, sad, shxxyl, szd, szl, "0.0");
                list.add(qmpWrxxFomat);
            }
            conn.close();
            return list;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 月份环比表
     *
     * @param begin
     * @param end
     * @param section
     * @return
     */
    private List<Object> getMonthWrxx(String begin, String end, String section) {

//        QmpWrxx qmpWrxx = new QmpWrxx();
//        qmpWrxx.setYear(begin);
//        qmpWrxx.setSectionName(section);

        // 从数据库中取到数据
//        List<QmpWrxx> list = qmpWrxxService.getByTime(qmpWrxx);
//        List<QmpWrxxFomat> fomats = new LinkedList<QmpWrxxFomat>();
//
//        // 转化为统一格式
//        for (QmpWrxx wrxx:list) {
//            fomats.add(new QmpWrxxFomat(wrxx));
//        }

        List<QmpWrxxFomat> fomats = getMonthWrxxSql(begin, section);

        // 污染指数
        Collections.sort(fomats);
        ChartSeries chartSeries = (ChartSeries) getMonthWrxxSeries(section, begin, fomats);
        LinkedList<Object> datas = new LinkedList<Object>();
        datas.add(chartSeries);

        return datas;
    }


//    /**
//     * 通过sql来获取数据
//     * @param month
//     * @param section
//     * @return
//     */
//    public ChartSeries getSqlData(String month,String section){
//
//        String driver="com.mysql.jdbc.Driver";
//        String url = "jdbc:mysql://60.205.177.82:3306/quick4j";
//        String sql = "select * from tablecircle where month = \'"+ month+"\' And section = \'" + section+"\'";
//        java.sql.PreparedStatement pstmt;
////        List<Map<String, Object>> maps = jdbctemplate.queryForList("select * from tablem4 where month =? And section =?", month, section);
////        System.out.println("map:"+maps.size());
////        for (Map<String, Object> stringObjectMap : maps) {
////            System.out.println(stringObjectMap.get("section"));
////        }
//        ChartSeries chartSeries = null;
//        try{
//            Class.forName(driver);
//            Connection conn= DriverManager.getConnection(url,"root","18342212808y");
//            pstmt = conn.prepareStatement(sql);
//            // pstmt.setString();
//            ResultSet rs = pstmt.executeQuery();
//
//            // section,year,month,ad,zl,zd,hxxyl,goal
//             chartSeries = new ChartSeries();
//
//            // 多年单月某指标分析
//            chartSeries.setName("多年"+month+"月多指标分析");
//            chartSeries.setSubname(section);
//            chartSeries.setSubname(month+"月");
//            chartSeries.setXpostname("年");
//            chartSeries.setYpostname("");
//            chartSeries.setXname("年份");
//            chartSeries.setYname("污染指数");
//            List<String> legends = getElemLegendName();
//            chartSeries.setLegenddata(legends);
//            List<List<Double>> ydatas = new LinkedList<>();
//            List<Integer> xdata = new LinkedList<>();
//            xdata.add(2014);
//            xdata.add(2015);
//            xdata.add(2016);
//            chartSeries.setXdata(xdata);
//            SplitSeries splitSeries = new SplitSeries();
//            splitSeries.initYdata();
//            while (rs.next()) {
//                String sad = rs.getString("ad");
//                String shxxyl = rs.getString("hxxyl");
//                String szd = rs.getString("zd");
//                String szl = rs.getString("zl");
//                String ssum = rs.getString("goal");
//
//                double ad=0,hxxyl=0,zd=0,zl=0,sum=0;
//                for (int i = 0; i < dics.length; i+=2) {
//                    if(sad.contains(dics[i])){
//                        ad = dlevels[i];
//                    }else if(sad.contains(dics[i+1])){
//                        ad = dlevels[i+1];
//                    }
//                    if(shxxyl.contains(dics[i])){
//                        hxxyl = dlevels[i];
//                    }else if(shxxyl.contains(dics[i+1])){
//                        hxxyl = dlevels[i];
//                    }
//                    if (szd.contains(dics[i])){
//                        zd = dlevels[i];
//                    }else if(szd.contains(dics[i+1])){
//                        zd = dlevels[i];
//                    }
//                    if (szl.contains(dics[i])){
//                        zl = dlevels[i];
//                    }else if(szl.contains(dics[i+1])){
//                        zl = dlevels[i];
//                    }
//                    if (ssum.contains(dics[i])){
//                        sum = dlevels[i];
//                    }else if(ssum.contains(dics[i+1])){
//                        sum = dlevels[i];
//                    }
//                }
//                splitSeries.addYdata(ad,hxxyl,zd,zl,sum);
//            }
//            conn.close();
//            ydatas = splitSeries.getyData();
//            chartSeries.setYdata(ydatas);
//            return  chartSeries;
//        }catch(ClassNotFoundException | SQLException e){
//            e.printStackTrace();
//            return null;
//        }
//    }


    /**
     * 通过sql来获取数据
     *
     * @param month
     * @param section
     * @return
     */
    public ChartSeries getSqlData(String month, String section) {

        if (month.length() == 1) month = "0" + month;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/new_env";
        String sql = "select * from tablecircle where month = \'" + month + "\' And section = \'" + section + "\'";
        java.sql.PreparedStatement pstmt;
//        List<Map<String, Object>> maps = jdbctemplate.queryForList("select * from tablem4 where month =? And section =?", month, section);
//        System.out.println("map:"+maps.size());
//        for (Map<String, Object> stringObjectMap : maps) {
//            System.out.println(stringObjectMap.get("section"));
//        }
        ChartSeries chartSeries = null;
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, "root", "981225");
            pstmt = conn.prepareStatement(sql);
            // pstmt.setString();
            ResultSet rs = pstmt.executeQuery();

            // section,year,month,ad,zl,zd,hxxyl,goal
            chartSeries = new ChartSeries();

            // 多年单月某指标分析
            chartSeries.setName(section + "各指标逐年" + month + "月水质分析");
            chartSeries.setSubname(section);
            chartSeries.setSubname(month + "月");
            chartSeries.setXpostname("年");
            chartSeries.setYpostname("");
            chartSeries.setXname("年份");
            chartSeries.setYname("污染指数");
            List<String> legends = getElemLegendName();
            chartSeries.setLegenddata(legends);
            List<List<Double>> ydatas = new LinkedList<>();
            List<Integer> xdata = new LinkedList<>();
            xdata.add(2014);
            xdata.add(2015);
            xdata.add(2016);
            chartSeries.setXdata(xdata);
            SplitSeries splitSeries = new SplitSeries();
            splitSeries.initYdata();
            while (rs.next()) {
                String sad = rs.getString("ad");
                String shxxyl = rs.getString("hxxyl");
                String szd = rs.getString("zd");
                String szl = rs.getString("zl");
                double ad, hxxyl = 0, zd = 0, zl = 0, sum = 0;
                ad = Double.parseDouble(sad);
                hxxyl = Double.parseDouble(shxxyl);
                zd = Double.parseDouble(szd);
                zl = Double.parseDouble(szl);
                sum = 0.0;
                splitSeries.addYdata(ad, hxxyl, zd, zl, sum);
            }
            conn.close();
            ydatas = splitSeries.getyData();
            chartSeries.setYdata(ydatas);
            return chartSeries;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


    public ChartSeries getYearEqSeries(String section, String month) {

        ChartSeries chartSeries = getSqlData(month, section);

        return chartSeries;

    }

    /**
     * 年同比表，多年某月
     *
     * @param begin
     * @param end
     * @param section
     * @return
     */
    private List<Object> getYearEq(String begin, String end, String section, String month) {
        ChartSeries chartSeries = new ChartSeries();
        LinkedList<Object> data = new LinkedList<Object>();
        chartSeries = getYearEqSeries(section, month);

        data.add(chartSeries);
        return data;
    }

    /**
     * 将统一格式数据fomats转化为画图所需的序列化数据。
     *
     * @param fomats 根据不同年自动分为多个不同组
     * @return
     */
    private Object getYearOneSeries(String section, String elem, List<QmpWrxxFomat> fomats) {

        // 遍历并合成
        // legend坐标
        LinkedList<Integer> years = new LinkedList<Integer>();
        // x坐标
        LinkedList<Integer> months = new LinkedList<Integer>();
        // 元素名称subname
        String elemname = map.get(elem);
        // 某元素year
        List<String> legends = new LinkedList<>();
        // 多年某元素的数据
        List<List<Double>> ydatas = new LinkedList<List<Double>>();


        List<Double> ydata = null;
        int count = 12, i = 0, year = 0;
        for (int j = 1; j <= count; j++) {
            months.add(j);
        }
        String es = "";
        for (QmpWrxxFomat wrxx : fomats) {
            Double e = 0.0;
            switch (elem) {
                case "ad":
                    e = wrxx.getAd();
                    es = "氨氮";
                    break;
                case "hxxyl":
                    e = wrxx.getHxxyl();
                    es = "化学需氧量";
                    break;
                case "zl":
                    e = wrxx.getZl();
                    es = "总磷";
                    break;
                case "zd":
                    e = wrxx.getZd();
                    es = "总氮";
                    break;
                case "sum":
                    e = wrxx.getSum();
                    break;
            }
            i++;
            if (year == wrxx.getYear()) {
                while (wrxx.getMonth() != i) {
                    ydata.add(0.0);
                    i++;
                }
                ydata.add(e);
            } else {
                // 第一个数据
                year = wrxx.getYear();
                legends.add(wrxx.getYear().toString());
                years.add(wrxx.getYear());
                if (ydata != null && ydata.size() != 0) {
                    // 第一条ydata
                    while (wrxx.getMonth() > i) {
                        ydata.add(0.0);
                        i++;
                    }
                    for (int j = ydata.size(); j <= count; j++)
                        ydata.add(0.0);
                    ydatas.add(ydata);
                    i = 0;
                }
                ydata = new LinkedList<>();
                ydata.add(e);
            }
        }
        for (int j = ydata.size(); j <= count; j++)
            ydata.add(0.0);
        ydatas.add(ydata);
//        SplitSeries splitSeries = new SplitSeries();
//        splitSeries.Assign(fomats,12);

        ChartSeries chartSeries = new ChartSeries();
        chartSeries.Assign(section + es + "逐年逐月水质分析",
                elemname, "月份", "污染指数", "", "", months,
                legends, ydatas, null);

        return chartSeries;
    }


    private List<QmpWrxxFomat> getYearOneSql(String section, String elem) {
        List<QmpWrxxFomat> list = new LinkedList<QmpWrxxFomat>();

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/new_env";
        String sql = "select * from tablecircle where section = \'" + section + "\'";
        java.sql.PreparedStatement pstmt;

        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, "root", "981225");
            pstmt = conn.prepareStatement(sql);
            // pstmt.setString();
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                QmpWrxxFomat qmpWrxxFomat = new QmpWrxxFomat();
                String sad = rs.getString("ad");
                String shxxyl = rs.getString("hxxyl");
                String szd = rs.getString("zd");
                String szl = rs.getString("zl");
                String syear = rs.getString("year");
                String smonth = rs.getString("month");
                qmpWrxxFomat.Assign(syear, smonth, sad, shxxyl, szd, szl, "0.0");
                list.add(qmpWrxxFomat);
            }
            conn.close();
            return list;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // 获取多年一元素多月比
    private List<Object> getYearOne(String begin, String end, String section, String elem) {

        QmpWrxx qmpWrxx = new QmpWrxx();
        qmpWrxx.setSectionName(section);

        // 从数据库中获取数据并进行处理。
        // 多年某月的图
//        List<QmpWrxx> list = qmpWrxxService.findList(qmpWrxx);
//        List<QmpWrxxFomat> fomats = new LinkedList<QmpWrxxFomat>();
//        for (QmpWrxx wrxx:list) {
//            fomats.add(new QmpWrxxFomat(wrxx));
//        }
        List<QmpWrxxFomat> fomats = getYearOneSql(section, elem);
        // 按年份月份排序
        Collections.sort(fomats);
        ChartSeries chartSeries =
                (ChartSeries) getYearOneSeries(section, elem, fomats);

        LinkedList<Object> data = new LinkedList<Object>();
        data.add(chartSeries);

        return data;
    }

    /**
     * 请求图表信息
     */
    @RequestMapping("/qmpwrxx")
    public @ResponseBody
    List<Object> getQmpwrxx(HttpServletRequest request) {

        String year = request.getParameter("year");
        String section = request.getParameter("section");
        String target = request.getParameter("target");
        String type = request.getParameter("type");
        String month = request.getParameter("month");

        List<Object> datas = null;
        switch (target) {
            case "yearCircle":
                datas = getYearCircle(year, section);
                break;
            case "YearEq":
                datas = getYearEq(null, null, section, month);
                break;
            case "MonthWrxx":
                datas = getMonthWrxx(year, null, section);
                break;
            case "YearOne":
                datas = getYearOne(null, null, section, type);
                break;
        }

        // 数据整理
        //data.add(SplitSeries);
        //data.add(yearSumSeries);
//        Gson gson = new Gson();
//        String string = gson.toJson(data);
        //model.addAttribute("qmpWrxx",qmpWrxx);
        return datas;
    }

    /**
     * 搜索污染信息
     *
     * @param request
     * @param m
     * @return
     */
    @RequestMapping("/searchw")
    @ResponseBody
    public ModelAndView searchw(HttpServletRequest request, ModelAndView m) {
        Map map = new HashMap();
        map.put("watershed", (String) request.getParameter("watershed"));
        map.put("river_name", (String) request.getParameter("river_name"));
        map.put("river_level", (String) request.getParameter("river_level"));
        map.put("river_to", (String) request.getParameter("river_to"));
        map.put("section_name", (String) request.getParameter("section_name"));
        map.put("section_property", (String) request.getParameter("section_property"));
        map.put("loc_province", (String) request.getParameter("loc_province"));
        map.put("loc_city", (String) request.getParameter("loc_city"));
        map.put("loc_county", (String) request.getParameter("loc_county"));
        map.put("test_by", (String) request.getParameter("test_by"));
        map.put("section_level", (String) request.getParameter("section_level"));
        map.put("section_type", (String) request.getParameter("section_type"));
        map.put("is_urban", (String) request.getParameter("is_urban"));
        map.put("is_addition", (String) request.getParameter("is_addition"));
        map.put("test_frequency", (String) request.getParameter("test_frequency"));
        map.put("test_items", (String) request.getParameter("test_items"));
        map.put("loc_lon_d", (String) request.getParameter("loc_lon_d"));
        map.put("loc_lon_m", (String) request.getParameter("loc_lon_m"));
        map.put("loc_lon_s", (String) request.getParameter("loc_lon_s"));
        map.put("loc_lat_d", (String) request.getParameter("loc_lat_d"));
        map.put("loc_lat_m", (String) request.getParameter("loc_lat_m"));
        map.put("loc_lat_s", (String) request.getParameter("loc_lat_s"));

        map.put("username", (String) request.getSession().getAttribute("userName"));

        if (request.getParameter("id") != null) {
            map.put("id", (String) request.getParameter("id"));
        }

        String pageNow = request.getParameter("pageNow");
        String month = request.getParameter("szsb_month");
        String szsb_type = request.getParameter("szsb_type");
        String szsb_std = request.getParameter("szsb_std");
        if (month != null) {
            map.put("szsb_month", month);
        } else {
            map.put("szsb_month", 1);
        }
        map.put("szsb_type", szsb_type);
        map.put("szsb_std", szsb_std);
        List<QmpWrxx> list = qmpWrxxService.searchByPage(pageNow, map, month);
        Page page = qmpWrxxService.getSearchPage(pageNow, map);
        System.out.println("总页数：" + page.getTotalPageCount());
        m.addObject("list", list);
        m.addObject("page", page);
        m.setViewName("qmp/qmpList_water");
        return m;
    }


    /**
     * 断面面源总量计算
     *
     * @param zhibiao 指标名
     * @param request
     * @return key：断面名，value：0-... ：点源量-各月面源量.....
     */
    @RequestMapping("/dmmyjs")
    @ResponseBody
    public List<Dmzljs> dmmyjs(@RequestParam(value = "zhibiao", required = true) String zhibiao, HttpServletRequest request) {
        Map map = new HashMap();
        map.put("username", (String) request.getSession().getAttribute("userName"));
        map.put("zhibiao", zhibiao);
        List<Dmzljs> dmzljsList = qmpWrxxService.getDmmy(map);//数据库中每条记录
        return qmpWrxxService.getDmmy(map);
    }
}
