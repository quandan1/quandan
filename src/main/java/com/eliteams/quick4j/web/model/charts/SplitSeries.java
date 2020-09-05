package com.eliteams.quick4j.web.model.charts;

import java.util.LinkedList;
import java.util.List;

/**
 * 每个元素代表一条线的时候，适合用该模型，否则不适用。
 * Created by FYZBXX on 2017/8/14.
 */
public class SplitSeries {
    private Integer id;     // 曲线名称
    private Integer year;
    private List<Integer> months;
    private List<Double> ads; //曲线的纵坐标
    private List<Double> hxxyls; //曲线的纵坐标
    private List<Double> zds; //曲线的纵坐标
    private List<Double> zls; //曲线的纵坐标
    private List<Double> sums; //曲线的纵坐标


    public List<List<Double>> getyData(){
        LinkedList<List<Double>> list = new LinkedList<List<Double>>();
        list.add(ads);
        list.add(hxxyls);
        list.add(zds);
        list.add(zls);
        list.add(sums);
        return list;
    }

    /**
     * 和AddYdata配合使用
     */
    public void initYdata(){
        LinkedList<Double> ads =new LinkedList<Double>();
        LinkedList<Double> hxxyls =new LinkedList<Double>();
        LinkedList<Double> zds =new LinkedList<Double>();
        LinkedList<Double> zls =new LinkedList<Double>();
        LinkedList<Double> sums=new LinkedList<Double>();
        setYData(ads,hxxyls,zds,zls,sums);
    }

    /**
     * 使用前需要使用initYdata
     * @param ad
     * @param hxxyl
     * @param zd
     * @param zl
     * @param sum
     */
    public void addYdata(Double ad,Double hxxyl,Double zd,Double zl,Double sum){
        ads.add(ad);
        hxxyls.add(hxxyl);
        zds.add(zd);
        zls.add(zl);
        sums.add(sum);
    }

    /**
     * 添加Y坐标数据
     * @param sad
     * @param shxxyl
     * @param szd
     * @param szl
     * @param ssum
     */
    public void addYdata(String sad,String shxxyl,String szd,String szl,String ssum){
        if(sad==null)sad="0.0";
        if(shxxyl==null)shxxyl="0.0";
        if(szd==null)szd="0.0";
        if(szl==null)szl="0.0";
        if(ssum==null)ssum="0.0";
        
        ads.add(Double.parseDouble(sad));
        hxxyls.add(Double.parseDouble(shxxyl));
        zds.add(Double.parseDouble(szd));
        zls.add(Double.parseDouble(szl));
        sums.add(Double.parseDouble(ssum));
    }
    /**
     * 添加完整数据
     * @param ads
     * @param hxxyls
     * @param zds
     * @param zls
     * @param sums
     * @return
     */
    public void setYData(List ads,List hxxyls,List zds,List zls,List sums){
        this.setAds(ads);
        this.setZds(zds);
        this.setZls(zls);
        this.setHxxyls(hxxyls);
        this.setSums(sums);
    }
    /**
     *
     * @param list 传入的为QmpWrxxFormat集合，
     *             该集合将数据转换为标准格式。
     *             当count为12时，该集合被转换为标准12个的集合。
     * @param count 数据集合的个数。
     */
    public void Assign(List list,int count){
        List<QmpWrxxFomat> qmpWrxxs = list;
        if(qmpWrxxs==null||qmpWrxxs.size()==0) return;

        LinkedList<Integer> months =new LinkedList<Integer>();
        LinkedList<Double> ads =new LinkedList<Double>();
        LinkedList<Double> hxxyls =new LinkedList<Double>();
        LinkedList<Double> zds =new LinkedList<Double>();
        LinkedList<Double> zls =new LinkedList<Double>();
        LinkedList<Double> sums=new LinkedList<Double>();

        QmpWrxxFomat qmpw = qmpWrxxs.get(0);
        this.setId(qmpw.getId());
        this.setYear(qmpw.getYear());
        int len = qmpWrxxs.size();
        QmpWrxxFomat qmp = null;

        for (int i = 1,j=0; i <= count; i++) {
            if(j < len && qmp == null ) {
                qmp = qmpWrxxs.get(j++);
            }
            if(qmp!=null&&qmp.getMonth()==i) {
                months.add(qmp.getMonth());
                ads.add(qmp.getAd());
                zds.add(qmp.getZd());
                zls.add(qmp.getZl());
                hxxyls.add(qmp.getHxxyl());
                sums.add(qmp.getSum());
                qmp=null;
                continue;
            }
            months.add(i);
            ads.add(0.0);
            zds.add(0.0);
            zls.add(0.0);
            hxxyls.add(0.0);
            sums.add(0.0);
        }

        this.setMonths(months);
        this.setAds(ads);
        this.setZds(zds);
        this.setZls(zls);
        this.setHxxyls(hxxyls);
        this.setSums(sums);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer name) {
        this.id = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<Integer> getMonths() {
        return months;
    }

    public void setMonths(List<Integer> month) {
        this.months = month;
    }

    public List<Double> getAds() {
        return ads;
    }

    public void setAds(List<Double> ads) {
        this.ads = ads;
    }

    public List<Double> getZds() {
        return zds;
    }

    public void setZds(List<Double> zds) {
        this.zds = zds;
    }

    public List<Double> getZls() {
        return zls;
    }

    public void setZls(List<Double> zls) {
        this.zls = zls;
    }

    public List<Double> getHxxyls() {
        return hxxyls;
    }

    public void setHxxyls(List<Double> hxxyls) {
        this.hxxyls = hxxyls;
    }

    public List<Double> getSums() {
        return sums;
    }

    public void setSums(List<Double> sums) {
        this.sums = sums;
    }
}
