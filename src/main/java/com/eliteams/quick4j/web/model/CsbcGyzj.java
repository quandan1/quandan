package com.eliteams.quick4j.web.model;

public class CsbcGyzj {
    private String csName;

    private Integer jbpx;

    private Double zjzj;

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

    public Double getZjzj() {
        return zjzj;
    }

    public void setZjzj(Double zjzj) {
        this.zjzj = zjzj;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }
}