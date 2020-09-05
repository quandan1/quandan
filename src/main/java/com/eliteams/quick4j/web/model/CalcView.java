package com.eliteams.quick4j.web.model;

public class CalcView {
    private String sectionName;

    private String riverLevel;

    private String sectionSx;

    private String riverName;

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName == null ? null : sectionName.trim();
    }

    public String getRiverLevel() {
        return riverLevel;
    }

    public void setRiverLevel(String riverLevel) {
        this.riverLevel = riverLevel == null ? null : riverLevel.trim();
    }

    public String getSectionSx() {
        return sectionSx;
    }

    public void setSectionSx(String sectionSx) {
        this.sectionSx = sectionSx == null ? null : sectionSx.trim();
    }

    public String getRiverName() {
        return riverName;
    }

    public void setRiverName(String riverName) {
        this.riverName = riverName == null ? null : riverName.trim();
    }
}