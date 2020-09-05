package com.eliteams.quick4j.web.model.charts;

/**
 * Created by FYZBXX on 2017/8/15.
 */


import java.util.List;

/**
 *
 * 用于年份表的环比数据
 *
 */
public class SumSeries {

    private String sectionName;
    private List<Integer> years;
    private List<Double> levels;

    public void Assign(QmpYearWrxxFormat format, List<Integer> years){
        this.setSectionName(format.getSection());
        this.setLevels(format.getLevels());
        this.setYears(years);
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public List<Integer> getYears() {
        return years;
    }

    public void setYears(List<Integer> years) {
        this.years = years;
    }

    public List<Double> getLevels() {
        return levels;
    }

    public void setLevels(List<Double> levels) {
        this.levels = levels;
    }
}
