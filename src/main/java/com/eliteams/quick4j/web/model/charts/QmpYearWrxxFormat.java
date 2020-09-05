package com.eliteams.quick4j.web.model.charts;

import com.eliteams.quick4j.web.model.QmpWrxxYear;

import java.util.HashMap;
import java.util.LinkedList;


/**
 * Created by FYZBXX on 2017/8/15.
 */
public class QmpYearWrxxFormat {

    private static String[] dics = {"劣Ⅰ","Ⅰ","劣Ⅱ","Ⅱ","劣Ⅲ","Ⅲ","劣Ⅳ","Ⅳ","劣Ⅴ","Ⅴ"};
    public static String[] getDics() { return dics; }

    private static Double[] dlevels = {1.5, 1.0, 2.5, 2.0, 3.5, 3.0, 4.5, 4.0, 5.5, 5.0};
    public static Double[] getDlevels() { return dlevels; }

    private String section;
    private LinkedList<Double> levels;

    public void Assign(QmpWrxxYear qmpWrxxYear){

        levels = new LinkedList<Double>();
        String y1 = qmpWrxxYear.getGoal2016();
        String y2 = qmpWrxxYear.getGoal2017();
        String y3 = qmpWrxxYear.getGoal2020();

        for (int i = 0; i < dics.length; i+=2) {
            if(y1.contains(dics[i])){
                levels.add(dlevels[i]);
            }else if(y1.contains(dics[i+1])){
                levels.add(dlevels[i+1]);
            }
            if(y2.contains(dics[i])){
                levels.add(dlevels[i]);
            }else if(y2.contains(dics[i+1])){
                levels.add(dlevels[i+1]);
            }
            if (y3.contains(dics[i])){
                levels.add(dlevels[i]);
            }else if(y3.contains(dics[i+1])){
                levels.add(dlevels[i+1]);
            }
        }

//        levels.add(map.get(y1));
//        levels.add(map.get(y2));
//        levels.add(map.get(y3));
        this.setSection(qmpWrxxYear.getDmmc());

    }

    public LinkedList<Double> getLevels() {
        return levels;
    }

    public void setLevels(LinkedList<Double> levels) {
        this.levels = levels;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
