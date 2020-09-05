package com.eliteams.quick4j.web.model.charts;

import java.util.List;

/**
 * Created by FYZBXX on 2017/8/14.
 * 一张图表对应的数据结构
 */
public class ChartSeries {

    /**
     * 图名
     */
    private String name;
    /**
     * 子名称
     */
    private String subname;
    /**
     * x名称
     */
    private String xname;
    /**
     * y名称
     */
    private String yname;
    /**
     * x后缀
     */
    private String xpostname;
    /**
     * y后缀
     */
    private String ypostname;
    /**
     * x数据
     */
    private List<Integer> xdata;
    /**
     * 图例
     */
    private List<String> legenddata;
    /**
     * y数据
     */
    private List<List<Double>> ydata;

    /**
     * 辅助参量
     */
    private List<Object> object;


    public ChartSeries() {
        this.setXpostname("");
        this.setYpostname("");
    }

    /**
     *  @param name
     * @param subname
     * @param xname
     * @param yname
     * @param xpostname
     * @param ypostname
     * @param xdata
     * @param legenddata
     * @param ydata
     * @param object
     */
    public ChartSeries(String name, String subname, String xname, String yname, String xpostname, String ypostname, List<Integer> xdata, List<String> legenddata, List<List<Double>> ydata, List<Object> object) {
        this.Assign(name,subname,xname,yname,xpostname,ypostname,xdata,legenddata,ydata,object);
    }

    /**
     *
     * @param name
     * @param subname
     * @param xname
     * @param yname
     * @param xpostname
     * @param ypostname
     */
    public ChartSeries(String name, String subname, String xname, String yname, String xpostname, String ypostname) {
        this.name = name;
        this.subname = subname;
        this.xname = xname;
        this.yname = yname;
        this.xpostname = xpostname;
        this.ypostname = ypostname;
    }

    public void Assign(String name, String subname, String xname, String yname, String xpostname, String ypostname, List<Integer> xdata, List<String> legenddata, List<List<Double>> ydata, List<Object> object) {
        this.name = name;
        this.subname = subname;
        this.xname = xname;
        this.yname = yname;
        this.xpostname = xpostname;
        this.ypostname = ypostname;
        this.xdata = xdata;
        this.legenddata = legenddata;
        this.ydata = ydata;
        this.object = object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public String getXname() {
        return xname;
    }

    public void setXname(String xname) {
        this.xname = xname;
    }

    public String getYname() {
        return yname;
    }

    public void setYname(String yname) {
        this.yname = yname;
    }

    public String getXpostname() {
        return xpostname;
    }

    public void setXpostname(String xpostname) {
        this.xpostname = xpostname;
    }

    public String getYpostname() {
        return ypostname;
    }

    public void setYpostname(String ypostname) {
        this.ypostname = ypostname;
    }

    public List<Integer> getXdata() {
        return xdata;
    }

    public void setXdata(List<Integer> xdata) {
        this.xdata = xdata;
    }

    public List<String> getLegenddata() {
        return legenddata;
    }

    public void setLegenddata(List<String> legenddata) {
        this.legenddata = legenddata;
    }

    public List<List<Double>> getYdata() {
        return ydata;
    }

    public void setYdata(List<List<Double>> ydata) {
        this.ydata = ydata;
    }

    public List<Object> getObject() {
        return object;
    }

    public void setObject(List<Object> object) {
        this.object = object;
    }
}
