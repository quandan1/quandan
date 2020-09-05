package com.eliteams.quick4j.web.model;

public class JkzjData {
    private String csName;

    private Integer jbpx;

    private String hjJkzj;

    private String year;

    private Integer month;

    public String getCsName() {
        return csName;
    }

    public void setCsName(String csName) {
        this.csName = csName == null ? null : csName.trim();
    }

    public Integer getJbpx() {
        return jbpx;
    }

    public void setJbpx(Integer jbpx) {
        this.jbpx = jbpx;
    }

    public String getHjJkzj() {
        return hjJkzj;
    }

    public void setHjJkzj(String hjJkzj) {
        this.hjJkzj = hjJkzj == null ? null : hjJkzj.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }
}