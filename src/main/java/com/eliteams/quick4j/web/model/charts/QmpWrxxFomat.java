package com.eliteams.quick4j.web.model.charts;

import com.eliteams.quick4j.web.model.QmpWrxx;

/**
 * Created by FYZBXX on 2017/8/14.
 */
public class QmpWrxxFomat implements Comparable<QmpWrxxFomat>{
    private Integer id; //
    private Integer year;
    private Integer month;
    private double ad; //曲线的纵坐标
    private double hxxyl; //曲线的横坐标s
    private double zd; //曲线的横坐标
    private double zl; //曲线的纵坐标
    private double sum; //曲线的纵坐标

    public void Assign(String syear,String smonth,String sad,String shxxyl,String szd,String szl,String ssum){
        year = Integer.parseInt(syear);
        month = Integer.parseInt(smonth);
        ad = Double.parseDouble(sad);
        hxxyl = Double.parseDouble(shxxyl);
        zd = Double.parseDouble(szd);
        zl = Double.parseDouble(szl);
        sum = Double.parseDouble(ssum);
    }

    public QmpWrxxFomat(){
    }
    public QmpWrxxFomat(QmpWrxx qmpWrxx){
        this.Assign(qmpWrxx);
    }

    public void Assign(QmpWrxx qmpWrxx){
        this.setId(qmpWrxx.getId());
        this.setYear(Integer.parseInt(String.valueOf(qmpWrxx.getYear()).substring(0,4)));
        this.setMonth(qmpWrxx.getMonth());

        this.setAd(qmpWrxx.getAd());
        this.setHxxyl(qmpWrxx.getHxxyl());
        this.setZd(qmpWrxx.getZd());
        this.setZl(qmpWrxx.getZl());
    }

    @Override
    public int compareTo(QmpWrxxFomat o) {
        int y1 = this.getYear(),y2 = o.getYear();
        int m1 = this.getMonth(),m2 = o.getMonth();
        if(y1==y2){
            if(m1==m2)return 0;
            else if(m1>m2)return 1;
            else return -1;
        }else if(y1>y2)return 1;
        else return -1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public double getAd() {
        return ad;
    }

    public void setAd(double ad) {
        this.ad = ad;
    }

    public double getHxxyl() {
        return hxxyl;
    }

    public void setHxxyl(double hxxyl) {
        this.hxxyl = hxxyl;
    }

    public double getZd() {
        return zd;
    }

    public void setZd(double zd) {
        this.zd = zd;
    }

    public double getZl() {
        return zl;
    }

    public void setZl(double zl) {
        this.zl = zl;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
