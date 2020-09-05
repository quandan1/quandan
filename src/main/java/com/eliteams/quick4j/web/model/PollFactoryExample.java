package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class PollFactoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PollFactoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andXzqhdmIsNull() {
            addCriterion("XZQHDM is null");
            return (Criteria) this;
        }

        public Criteria andXzqhdmIsNotNull() {
            addCriterion("XZQHDM is not null");
            return (Criteria) this;
        }

        public Criteria andXzqhdmEqualTo(String value) {
            addCriterion("XZQHDM =", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmNotEqualTo(String value) {
            addCriterion("XZQHDM <>", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmGreaterThan(String value) {
            addCriterion("XZQHDM >", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmGreaterThanOrEqualTo(String value) {
            addCriterion("XZQHDM >=", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmLessThan(String value) {
            addCriterion("XZQHDM <", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmLessThanOrEqualTo(String value) {
            addCriterion("XZQHDM <=", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmLike(String value) {
            addCriterion("XZQHDM like", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmNotLike(String value) {
            addCriterion("XZQHDM not like", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmIn(List<String> values) {
            addCriterion("XZQHDM in", values, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmNotIn(List<String> values) {
            addCriterion("XZQHDM not in", values, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmBetween(String value1, String value2) {
            addCriterion("XZQHDM between", value1, value2, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmNotBetween(String value1, String value2) {
            addCriterion("XZQHDM not between", value1, value2, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhmcIsNull() {
            addCriterion("XZQHMC is null");
            return (Criteria) this;
        }

        public Criteria andXzqhmcIsNotNull() {
            addCriterion("XZQHMC is not null");
            return (Criteria) this;
        }

        public Criteria andXzqhmcEqualTo(String value) {
            addCriterion("XZQHMC =", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcNotEqualTo(String value) {
            addCriterion("XZQHMC <>", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcGreaterThan(String value) {
            addCriterion("XZQHMC >", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcGreaterThanOrEqualTo(String value) {
            addCriterion("XZQHMC >=", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcLessThan(String value) {
            addCriterion("XZQHMC <", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcLessThanOrEqualTo(String value) {
            addCriterion("XZQHMC <=", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcLike(String value) {
            addCriterion("XZQHMC like", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcNotLike(String value) {
            addCriterion("XZQHMC not like", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcIn(List<String> values) {
            addCriterion("XZQHMC in", values, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcNotIn(List<String> values) {
            addCriterion("XZQHMC not in", values, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcBetween(String value1, String value2) {
            addCriterion("XZQHMC between", value1, value2, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcNotBetween(String value1, String value2) {
            addCriterion("XZQHMC not between", value1, value2, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andTjnfIsNull() {
            addCriterion("TJNF is null");
            return (Criteria) this;
        }

        public Criteria andTjnfIsNotNull() {
            addCriterion("TJNF is not null");
            return (Criteria) this;
        }

        public Criteria andTjnfEqualTo(String value) {
            addCriterion("TJNF =", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfNotEqualTo(String value) {
            addCriterion("TJNF <>", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfGreaterThan(String value) {
            addCriterion("TJNF >", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfGreaterThanOrEqualTo(String value) {
            addCriterion("TJNF >=", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfLessThan(String value) {
            addCriterion("TJNF <", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfLessThanOrEqualTo(String value) {
            addCriterion("TJNF <=", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfLike(String value) {
            addCriterion("TJNF like", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfNotLike(String value) {
            addCriterion("TJNF not like", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfIn(List<String> values) {
            addCriterion("TJNF in", values, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfNotIn(List<String> values) {
            addCriterion("TJNF not in", values, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfBetween(String value1, String value2) {
            addCriterion("TJNF between", value1, value2, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfNotBetween(String value1, String value2) {
            addCriterion("TJNF not between", value1, value2, "tjnf");
            return (Criteria) this;
        }

        public Criteria andZzjgdmIsNull() {
            addCriterion("ZZJGDM is null");
            return (Criteria) this;
        }

        public Criteria andZzjgdmIsNotNull() {
            addCriterion("ZZJGDM is not null");
            return (Criteria) this;
        }

        public Criteria andZzjgdmEqualTo(String value) {
            addCriterion("ZZJGDM =", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotEqualTo(String value) {
            addCriterion("ZZJGDM <>", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmGreaterThan(String value) {
            addCriterion("ZZJGDM >", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmGreaterThanOrEqualTo(String value) {
            addCriterion("ZZJGDM >=", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmLessThan(String value) {
            addCriterion("ZZJGDM <", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmLessThanOrEqualTo(String value) {
            addCriterion("ZZJGDM <=", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmLike(String value) {
            addCriterion("ZZJGDM like", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotLike(String value) {
            addCriterion("ZZJGDM not like", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmIn(List<String> values) {
            addCriterion("ZZJGDM in", values, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotIn(List<String> values) {
            addCriterion("ZZJGDM not in", values, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmBetween(String value1, String value2) {
            addCriterion("ZZJGDM between", value1, value2, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotBetween(String value1, String value2) {
            addCriterion("ZZJGDM not between", value1, value2, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andDwmcGzIsNull() {
            addCriterion("DWMC_GZ is null");
            return (Criteria) this;
        }

        public Criteria andDwmcGzIsNotNull() {
            addCriterion("DWMC_GZ is not null");
            return (Criteria) this;
        }

        public Criteria andDwmcGzEqualTo(String value) {
            addCriterion("DWMC_GZ =", value, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzNotEqualTo(String value) {
            addCriterion("DWMC_GZ <>", value, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzGreaterThan(String value) {
            addCriterion("DWMC_GZ >", value, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzGreaterThanOrEqualTo(String value) {
            addCriterion("DWMC_GZ >=", value, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzLessThan(String value) {
            addCriterion("DWMC_GZ <", value, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzLessThanOrEqualTo(String value) {
            addCriterion("DWMC_GZ <=", value, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzLike(String value) {
            addCriterion("DWMC_GZ like", value, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzNotLike(String value) {
            addCriterion("DWMC_GZ not like", value, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzIn(List<String> values) {
            addCriterion("DWMC_GZ in", values, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzNotIn(List<String> values) {
            addCriterion("DWMC_GZ not in", values, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzBetween(String value1, String value2) {
            addCriterion("DWMC_GZ between", value1, value2, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzNotBetween(String value1, String value2) {
            addCriterion("DWMC_GZ not between", value1, value2, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andSsdmIsNull() {
            addCriterion("SSDM is null");
            return (Criteria) this;
        }

        public Criteria andSsdmIsNotNull() {
            addCriterion("SSDM is not null");
            return (Criteria) this;
        }

        public Criteria andSsdmEqualTo(String value) {
            addCriterion("SSDM =", value, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmNotEqualTo(String value) {
            addCriterion("SSDM <>", value, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmGreaterThan(String value) {
            addCriterion("SSDM >", value, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmGreaterThanOrEqualTo(String value) {
            addCriterion("SSDM >=", value, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmLessThan(String value) {
            addCriterion("SSDM <", value, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmLessThanOrEqualTo(String value) {
            addCriterion("SSDM <=", value, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmLike(String value) {
            addCriterion("SSDM like", value, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmNotLike(String value) {
            addCriterion("SSDM not like", value, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmIn(List<String> values) {
            addCriterion("SSDM in", values, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmNotIn(List<String> values) {
            addCriterion("SSDM not in", values, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmBetween(String value1, String value2) {
            addCriterion("SSDM between", value1, value2, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmNotBetween(String value1, String value2) {
            addCriterion("SSDM not between", value1, value2, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSskzdyIsNull() {
            addCriterion("SSKZDY is null");
            return (Criteria) this;
        }

        public Criteria andSskzdyIsNotNull() {
            addCriterion("SSKZDY is not null");
            return (Criteria) this;
        }

        public Criteria andSskzdyEqualTo(String value) {
            addCriterion("SSKZDY =", value, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyNotEqualTo(String value) {
            addCriterion("SSKZDY <>", value, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyGreaterThan(String value) {
            addCriterion("SSKZDY >", value, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyGreaterThanOrEqualTo(String value) {
            addCriterion("SSKZDY >=", value, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyLessThan(String value) {
            addCriterion("SSKZDY <", value, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyLessThanOrEqualTo(String value) {
            addCriterion("SSKZDY <=", value, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyLike(String value) {
            addCriterion("SSKZDY like", value, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyNotLike(String value) {
            addCriterion("SSKZDY not like", value, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyIn(List<String> values) {
            addCriterion("SSKZDY in", values, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyNotIn(List<String> values) {
            addCriterion("SSKZDY not in", values, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyBetween(String value1, String value2) {
            addCriterion("SSKZDY between", value1, value2, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyNotBetween(String value1, String value2) {
            addCriterion("SSKZDY not between", value1, value2, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andYydwmcIsNull() {
            addCriterion("YYDWMC is null");
            return (Criteria) this;
        }

        public Criteria andYydwmcIsNotNull() {
            addCriterion("YYDWMC is not null");
            return (Criteria) this;
        }

        public Criteria andYydwmcEqualTo(String value) {
            addCriterion("YYDWMC =", value, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcNotEqualTo(String value) {
            addCriterion("YYDWMC <>", value, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcGreaterThan(String value) {
            addCriterion("YYDWMC >", value, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcGreaterThanOrEqualTo(String value) {
            addCriterion("YYDWMC >=", value, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcLessThan(String value) {
            addCriterion("YYDWMC <", value, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcLessThanOrEqualTo(String value) {
            addCriterion("YYDWMC <=", value, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcLike(String value) {
            addCriterion("YYDWMC like", value, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcNotLike(String value) {
            addCriterion("YYDWMC not like", value, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcIn(List<String> values) {
            addCriterion("YYDWMC in", values, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcNotIn(List<String> values) {
            addCriterion("YYDWMC not in", values, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcBetween(String value1, String value2) {
            addCriterion("YYDWMC between", value1, value2, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcNotBetween(String value1, String value2) {
            addCriterion("YYDWMC not between", value1, value2, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andFddbrIsNull() {
            addCriterion("FDDBR is null");
            return (Criteria) this;
        }

        public Criteria andFddbrIsNotNull() {
            addCriterion("FDDBR is not null");
            return (Criteria) this;
        }

        public Criteria andFddbrEqualTo(String value) {
            addCriterion("FDDBR =", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrNotEqualTo(String value) {
            addCriterion("FDDBR <>", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrGreaterThan(String value) {
            addCriterion("FDDBR >", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrGreaterThanOrEqualTo(String value) {
            addCriterion("FDDBR >=", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrLessThan(String value) {
            addCriterion("FDDBR <", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrLessThanOrEqualTo(String value) {
            addCriterion("FDDBR <=", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrLike(String value) {
            addCriterion("FDDBR like", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrNotLike(String value) {
            addCriterion("FDDBR not like", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrIn(List<String> values) {
            addCriterion("FDDBR in", values, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrNotIn(List<String> values) {
            addCriterion("FDDBR not in", values, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrBetween(String value1, String value2) {
            addCriterion("FDDBR between", value1, value2, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrNotBetween(String value1, String value2) {
            addCriterion("FDDBR not between", value1, value2, "fddbr");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsIsNull() {
            addCriterion("QYXXDZ_S_ZZQ_ZXS is null");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsIsNotNull() {
            addCriterion("QYXXDZ_S_ZZQ_ZXS is not null");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsEqualTo(String value) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS =", value, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsNotEqualTo(String value) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS <>", value, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsGreaterThan(String value) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS >", value, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsGreaterThanOrEqualTo(String value) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS >=", value, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsLessThan(String value) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS <", value, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsLessThanOrEqualTo(String value) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS <=", value, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsLike(String value) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS like", value, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsNotLike(String value) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS not like", value, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsIn(List<String> values) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS in", values, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsNotIn(List<String> values) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS not in", values, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsBetween(String value1, String value2) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS between", value1, value2, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsNotBetween(String value1, String value2) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS not between", value1, value2, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMIsNull() {
            addCriterion("QYXXDZ_DQ_S_Z_M is null");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMIsNotNull() {
            addCriterion("QYXXDZ_DQ_S_Z_M is not null");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMEqualTo(String value) {
            addCriterion("QYXXDZ_DQ_S_Z_M =", value, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMNotEqualTo(String value) {
            addCriterion("QYXXDZ_DQ_S_Z_M <>", value, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMGreaterThan(String value) {
            addCriterion("QYXXDZ_DQ_S_Z_M >", value, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMGreaterThanOrEqualTo(String value) {
            addCriterion("QYXXDZ_DQ_S_Z_M >=", value, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMLessThan(String value) {
            addCriterion("QYXXDZ_DQ_S_Z_M <", value, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMLessThanOrEqualTo(String value) {
            addCriterion("QYXXDZ_DQ_S_Z_M <=", value, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMLike(String value) {
            addCriterion("QYXXDZ_DQ_S_Z_M like", value, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMNotLike(String value) {
            addCriterion("QYXXDZ_DQ_S_Z_M not like", value, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMIn(List<String> values) {
            addCriterion("QYXXDZ_DQ_S_Z_M in", values, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMNotIn(List<String> values) {
            addCriterion("QYXXDZ_DQ_S_Z_M not in", values, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMBetween(String value1, String value2) {
            addCriterion("QYXXDZ_DQ_S_Z_M between", value1, value2, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMNotBetween(String value1, String value2) {
            addCriterion("QYXXDZ_DQ_S_Z_M not between", value1, value2, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQIsNull() {
            addCriterion("QYXXDZ_X_Q_S_Q is null");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQIsNotNull() {
            addCriterion("QYXXDZ_X_Q_S_Q is not null");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQEqualTo(String value) {
            addCriterion("QYXXDZ_X_Q_S_Q =", value, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQNotEqualTo(String value) {
            addCriterion("QYXXDZ_X_Q_S_Q <>", value, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQGreaterThan(String value) {
            addCriterion("QYXXDZ_X_Q_S_Q >", value, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQGreaterThanOrEqualTo(String value) {
            addCriterion("QYXXDZ_X_Q_S_Q >=", value, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQLessThan(String value) {
            addCriterion("QYXXDZ_X_Q_S_Q <", value, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQLessThanOrEqualTo(String value) {
            addCriterion("QYXXDZ_X_Q_S_Q <=", value, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQLike(String value) {
            addCriterion("QYXXDZ_X_Q_S_Q like", value, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQNotLike(String value) {
            addCriterion("QYXXDZ_X_Q_S_Q not like", value, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQIn(List<String> values) {
            addCriterion("QYXXDZ_X_Q_S_Q in", values, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQNotIn(List<String> values) {
            addCriterion("QYXXDZ_X_Q_S_Q not in", values, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQBetween(String value1, String value2) {
            addCriterion("QYXXDZ_X_Q_S_Q between", value1, value2, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQNotBetween(String value1, String value2) {
            addCriterion("QYXXDZ_X_Q_S_Q not between", value1, value2, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZIsNull() {
            addCriterion("QYXXDZ_X_Z is null");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZIsNotNull() {
            addCriterion("QYXXDZ_X_Z is not null");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZEqualTo(String value) {
            addCriterion("QYXXDZ_X_Z =", value, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZNotEqualTo(String value) {
            addCriterion("QYXXDZ_X_Z <>", value, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZGreaterThan(String value) {
            addCriterion("QYXXDZ_X_Z >", value, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZGreaterThanOrEqualTo(String value) {
            addCriterion("QYXXDZ_X_Z >=", value, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZLessThan(String value) {
            addCriterion("QYXXDZ_X_Z <", value, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZLessThanOrEqualTo(String value) {
            addCriterion("QYXXDZ_X_Z <=", value, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZLike(String value) {
            addCriterion("QYXXDZ_X_Z like", value, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZNotLike(String value) {
            addCriterion("QYXXDZ_X_Z not like", value, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZIn(List<String> values) {
            addCriterion("QYXXDZ_X_Z in", values, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZNotIn(List<String> values) {
            addCriterion("QYXXDZ_X_Z not in", values, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZBetween(String value1, String value2) {
            addCriterion("QYXXDZ_X_Z between", value1, value2, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZNotBetween(String value1, String value2) {
            addCriterion("QYXXDZ_X_Z not between", value1, value2, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphIsNull() {
            addCriterion("QYXXDZ_J_C_MPH is null");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphIsNotNull() {
            addCriterion("QYXXDZ_J_C_MPH is not null");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphEqualTo(String value) {
            addCriterion("QYXXDZ_J_C_MPH =", value, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphNotEqualTo(String value) {
            addCriterion("QYXXDZ_J_C_MPH <>", value, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphGreaterThan(String value) {
            addCriterion("QYXXDZ_J_C_MPH >", value, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphGreaterThanOrEqualTo(String value) {
            addCriterion("QYXXDZ_J_C_MPH >=", value, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphLessThan(String value) {
            addCriterion("QYXXDZ_J_C_MPH <", value, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphLessThanOrEqualTo(String value) {
            addCriterion("QYXXDZ_J_C_MPH <=", value, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphLike(String value) {
            addCriterion("QYXXDZ_J_C_MPH like", value, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphNotLike(String value) {
            addCriterion("QYXXDZ_J_C_MPH not like", value, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphIn(List<String> values) {
            addCriterion("QYXXDZ_J_C_MPH in", values, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphNotIn(List<String> values) {
            addCriterion("QYXXDZ_J_C_MPH not in", values, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphBetween(String value1, String value2) {
            addCriterion("QYXXDZ_J_C_MPH between", value1, value2, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphNotBetween(String value1, String value2) {
            addCriterion("QYXXDZ_J_C_MPH not between", value1, value2, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andZxjdDIsNull() {
            addCriterion("ZXJD_D is null");
            return (Criteria) this;
        }

        public Criteria andZxjdDIsNotNull() {
            addCriterion("ZXJD_D is not null");
            return (Criteria) this;
        }

        public Criteria andZxjdDEqualTo(String value) {
            addCriterion("ZXJD_D =", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDNotEqualTo(String value) {
            addCriterion("ZXJD_D <>", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDGreaterThan(String value) {
            addCriterion("ZXJD_D >", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDGreaterThanOrEqualTo(String value) {
            addCriterion("ZXJD_D >=", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDLessThan(String value) {
            addCriterion("ZXJD_D <", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDLessThanOrEqualTo(String value) {
            addCriterion("ZXJD_D <=", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDLike(String value) {
            addCriterion("ZXJD_D like", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDNotLike(String value) {
            addCriterion("ZXJD_D not like", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDIn(List<String> values) {
            addCriterion("ZXJD_D in", values, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDNotIn(List<String> values) {
            addCriterion("ZXJD_D not in", values, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDBetween(String value1, String value2) {
            addCriterion("ZXJD_D between", value1, value2, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDNotBetween(String value1, String value2) {
            addCriterion("ZXJD_D not between", value1, value2, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdFIsNull() {
            addCriterion("ZXJD_F is null");
            return (Criteria) this;
        }

        public Criteria andZxjdFIsNotNull() {
            addCriterion("ZXJD_F is not null");
            return (Criteria) this;
        }

        public Criteria andZxjdFEqualTo(String value) {
            addCriterion("ZXJD_F =", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFNotEqualTo(String value) {
            addCriterion("ZXJD_F <>", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFGreaterThan(String value) {
            addCriterion("ZXJD_F >", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFGreaterThanOrEqualTo(String value) {
            addCriterion("ZXJD_F >=", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFLessThan(String value) {
            addCriterion("ZXJD_F <", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFLessThanOrEqualTo(String value) {
            addCriterion("ZXJD_F <=", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFLike(String value) {
            addCriterion("ZXJD_F like", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFNotLike(String value) {
            addCriterion("ZXJD_F not like", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFIn(List<String> values) {
            addCriterion("ZXJD_F in", values, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFNotIn(List<String> values) {
            addCriterion("ZXJD_F not in", values, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFBetween(String value1, String value2) {
            addCriterion("ZXJD_F between", value1, value2, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFNotBetween(String value1, String value2) {
            addCriterion("ZXJD_F not between", value1, value2, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdMIsNull() {
            addCriterion("ZXJD_M is null");
            return (Criteria) this;
        }

        public Criteria andZxjdMIsNotNull() {
            addCriterion("ZXJD_M is not null");
            return (Criteria) this;
        }

        public Criteria andZxjdMEqualTo(String value) {
            addCriterion("ZXJD_M =", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMNotEqualTo(String value) {
            addCriterion("ZXJD_M <>", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMGreaterThan(String value) {
            addCriterion("ZXJD_M >", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMGreaterThanOrEqualTo(String value) {
            addCriterion("ZXJD_M >=", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMLessThan(String value) {
            addCriterion("ZXJD_M <", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMLessThanOrEqualTo(String value) {
            addCriterion("ZXJD_M <=", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMLike(String value) {
            addCriterion("ZXJD_M like", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMNotLike(String value) {
            addCriterion("ZXJD_M not like", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMIn(List<String> values) {
            addCriterion("ZXJD_M in", values, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMNotIn(List<String> values) {
            addCriterion("ZXJD_M not in", values, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMBetween(String value1, String value2) {
            addCriterion("ZXJD_M between", value1, value2, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMNotBetween(String value1, String value2) {
            addCriterion("ZXJD_M not between", value1, value2, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andJdIsNull() {
            addCriterion("JD is null");
            return (Criteria) this;
        }

        public Criteria andJdIsNotNull() {
            addCriterion("JD is not null");
            return (Criteria) this;
        }

        public Criteria andJdEqualTo(String value) {
            addCriterion("JD =", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotEqualTo(String value) {
            addCriterion("JD <>", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdGreaterThan(String value) {
            addCriterion("JD >", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdGreaterThanOrEqualTo(String value) {
            addCriterion("JD >=", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdLessThan(String value) {
            addCriterion("JD <", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdLessThanOrEqualTo(String value) {
            addCriterion("JD <=", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdLike(String value) {
            addCriterion("JD like", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotLike(String value) {
            addCriterion("JD not like", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdIn(List<String> values) {
            addCriterion("JD in", values, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotIn(List<String> values) {
            addCriterion("JD not in", values, "jd");
            return (Criteria) this;
        }

        public Criteria andJdBetween(String value1, String value2) {
            addCriterion("JD between", value1, value2, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotBetween(String value1, String value2) {
            addCriterion("JD not between", value1, value2, "jd");
            return (Criteria) this;
        }

        public Criteria andZxwdDIsNull() {
            addCriterion("ZXWD_D is null");
            return (Criteria) this;
        }

        public Criteria andZxwdDIsNotNull() {
            addCriterion("ZXWD_D is not null");
            return (Criteria) this;
        }

        public Criteria andZxwdDEqualTo(String value) {
            addCriterion("ZXWD_D =", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDNotEqualTo(String value) {
            addCriterion("ZXWD_D <>", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDGreaterThan(String value) {
            addCriterion("ZXWD_D >", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDGreaterThanOrEqualTo(String value) {
            addCriterion("ZXWD_D >=", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDLessThan(String value) {
            addCriterion("ZXWD_D <", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDLessThanOrEqualTo(String value) {
            addCriterion("ZXWD_D <=", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDLike(String value) {
            addCriterion("ZXWD_D like", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDNotLike(String value) {
            addCriterion("ZXWD_D not like", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDIn(List<String> values) {
            addCriterion("ZXWD_D in", values, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDNotIn(List<String> values) {
            addCriterion("ZXWD_D not in", values, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDBetween(String value1, String value2) {
            addCriterion("ZXWD_D between", value1, value2, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDNotBetween(String value1, String value2) {
            addCriterion("ZXWD_D not between", value1, value2, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdFIsNull() {
            addCriterion("ZXWD_F is null");
            return (Criteria) this;
        }

        public Criteria andZxwdFIsNotNull() {
            addCriterion("ZXWD_F is not null");
            return (Criteria) this;
        }

        public Criteria andZxwdFEqualTo(String value) {
            addCriterion("ZXWD_F =", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFNotEqualTo(String value) {
            addCriterion("ZXWD_F <>", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFGreaterThan(String value) {
            addCriterion("ZXWD_F >", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFGreaterThanOrEqualTo(String value) {
            addCriterion("ZXWD_F >=", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFLessThan(String value) {
            addCriterion("ZXWD_F <", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFLessThanOrEqualTo(String value) {
            addCriterion("ZXWD_F <=", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFLike(String value) {
            addCriterion("ZXWD_F like", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFNotLike(String value) {
            addCriterion("ZXWD_F not like", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFIn(List<String> values) {
            addCriterion("ZXWD_F in", values, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFNotIn(List<String> values) {
            addCriterion("ZXWD_F not in", values, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFBetween(String value1, String value2) {
            addCriterion("ZXWD_F between", value1, value2, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFNotBetween(String value1, String value2) {
            addCriterion("ZXWD_F not between", value1, value2, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdMIsNull() {
            addCriterion("ZXWD_M is null");
            return (Criteria) this;
        }

        public Criteria andZxwdMIsNotNull() {
            addCriterion("ZXWD_M is not null");
            return (Criteria) this;
        }

        public Criteria andZxwdMEqualTo(String value) {
            addCriterion("ZXWD_M =", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMNotEqualTo(String value) {
            addCriterion("ZXWD_M <>", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMGreaterThan(String value) {
            addCriterion("ZXWD_M >", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMGreaterThanOrEqualTo(String value) {
            addCriterion("ZXWD_M >=", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMLessThan(String value) {
            addCriterion("ZXWD_M <", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMLessThanOrEqualTo(String value) {
            addCriterion("ZXWD_M <=", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMLike(String value) {
            addCriterion("ZXWD_M like", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMNotLike(String value) {
            addCriterion("ZXWD_M not like", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMIn(List<String> values) {
            addCriterion("ZXWD_M in", values, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMNotIn(List<String> values) {
            addCriterion("ZXWD_M not in", values, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMBetween(String value1, String value2) {
            addCriterion("ZXWD_M between", value1, value2, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMNotBetween(String value1, String value2) {
            addCriterion("ZXWD_M not between", value1, value2, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andWdIsNull() {
            addCriterion("WD is null");
            return (Criteria) this;
        }

        public Criteria andWdIsNotNull() {
            addCriterion("WD is not null");
            return (Criteria) this;
        }

        public Criteria andWdEqualTo(String value) {
            addCriterion("WD =", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotEqualTo(String value) {
            addCriterion("WD <>", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdGreaterThan(String value) {
            addCriterion("WD >", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdGreaterThanOrEqualTo(String value) {
            addCriterion("WD >=", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdLessThan(String value) {
            addCriterion("WD <", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdLessThanOrEqualTo(String value) {
            addCriterion("WD <=", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdLike(String value) {
            addCriterion("WD like", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotLike(String value) {
            addCriterion("WD not like", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdIn(List<String> values) {
            addCriterion("WD in", values, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotIn(List<String> values) {
            addCriterion("WD not in", values, "wd");
            return (Criteria) this;
        }

        public Criteria andWdBetween(String value1, String value2) {
            addCriterion("WD between", value1, value2, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotBetween(String value1, String value2) {
            addCriterion("WD not between", value1, value2, "wd");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmIsNull() {
            addCriterion("LXFSDHHM is null");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmIsNotNull() {
            addCriterion("LXFSDHHM is not null");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmEqualTo(String value) {
            addCriterion("LXFSDHHM =", value, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmNotEqualTo(String value) {
            addCriterion("LXFSDHHM <>", value, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmGreaterThan(String value) {
            addCriterion("LXFSDHHM >", value, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmGreaterThanOrEqualTo(String value) {
            addCriterion("LXFSDHHM >=", value, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmLessThan(String value) {
            addCriterion("LXFSDHHM <", value, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmLessThanOrEqualTo(String value) {
            addCriterion("LXFSDHHM <=", value, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmLike(String value) {
            addCriterion("LXFSDHHM like", value, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmNotLike(String value) {
            addCriterion("LXFSDHHM not like", value, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmIn(List<String> values) {
            addCriterion("LXFSDHHM in", values, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmNotIn(List<String> values) {
            addCriterion("LXFSDHHM not in", values, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmBetween(String value1, String value2) {
            addCriterion("LXFSDHHM between", value1, value2, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmNotBetween(String value1, String value2) {
            addCriterion("LXFSDHHM not between", value1, value2, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfslxrIsNull() {
            addCriterion("LXFSLXR is null");
            return (Criteria) this;
        }

        public Criteria andLxfslxrIsNotNull() {
            addCriterion("LXFSLXR is not null");
            return (Criteria) this;
        }

        public Criteria andLxfslxrEqualTo(String value) {
            addCriterion("LXFSLXR =", value, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrNotEqualTo(String value) {
            addCriterion("LXFSLXR <>", value, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrGreaterThan(String value) {
            addCriterion("LXFSLXR >", value, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrGreaterThanOrEqualTo(String value) {
            addCriterion("LXFSLXR >=", value, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrLessThan(String value) {
            addCriterion("LXFSLXR <", value, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrLessThanOrEqualTo(String value) {
            addCriterion("LXFSLXR <=", value, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrLike(String value) {
            addCriterion("LXFSLXR like", value, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrNotLike(String value) {
            addCriterion("LXFSLXR not like", value, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrIn(List<String> values) {
            addCriterion("LXFSLXR in", values, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrNotIn(List<String> values) {
            addCriterion("LXFSLXR not in", values, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrBetween(String value1, String value2) {
            addCriterion("LXFSLXR between", value1, value2, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrNotBetween(String value1, String value2) {
            addCriterion("LXFSLXR not between", value1, value2, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmIsNull() {
            addCriterion("LXFSCZHM is null");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmIsNotNull() {
            addCriterion("LXFSCZHM is not null");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmEqualTo(String value) {
            addCriterion("LXFSCZHM =", value, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmNotEqualTo(String value) {
            addCriterion("LXFSCZHM <>", value, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmGreaterThan(String value) {
            addCriterion("LXFSCZHM >", value, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmGreaterThanOrEqualTo(String value) {
            addCriterion("LXFSCZHM >=", value, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmLessThan(String value) {
            addCriterion("LXFSCZHM <", value, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmLessThanOrEqualTo(String value) {
            addCriterion("LXFSCZHM <=", value, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmLike(String value) {
            addCriterion("LXFSCZHM like", value, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmNotLike(String value) {
            addCriterion("LXFSCZHM not like", value, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmIn(List<String> values) {
            addCriterion("LXFSCZHM in", values, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmNotIn(List<String> values) {
            addCriterion("LXFSCZHM not in", values, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmBetween(String value1, String value2) {
            addCriterion("LXFSCZHM between", value1, value2, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmNotBetween(String value1, String value2) {
            addCriterion("LXFSCZHM not between", value1, value2, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmIsNull() {
            addCriterion("LXFSYZBM is null");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmIsNotNull() {
            addCriterion("LXFSYZBM is not null");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmEqualTo(String value) {
            addCriterion("LXFSYZBM =", value, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmNotEqualTo(String value) {
            addCriterion("LXFSYZBM <>", value, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmGreaterThan(String value) {
            addCriterion("LXFSYZBM >", value, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmGreaterThanOrEqualTo(String value) {
            addCriterion("LXFSYZBM >=", value, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmLessThan(String value) {
            addCriterion("LXFSYZBM <", value, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmLessThanOrEqualTo(String value) {
            addCriterion("LXFSYZBM <=", value, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmLike(String value) {
            addCriterion("LXFSYZBM like", value, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmNotLike(String value) {
            addCriterion("LXFSYZBM not like", value, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmIn(List<String> values) {
            addCriterion("LXFSYZBM in", values, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmNotIn(List<String> values) {
            addCriterion("LXFSYZBM not in", values, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmBetween(String value1, String value2) {
            addCriterion("LXFSYZBM between", value1, value2, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmNotBetween(String value1, String value2) {
            addCriterion("LXFSYZBM not between", value1, value2, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andWsclsslxIsNull() {
            addCriterion("WSCLSSLX is null");
            return (Criteria) this;
        }

        public Criteria andWsclsslxIsNotNull() {
            addCriterion("WSCLSSLX is not null");
            return (Criteria) this;
        }

        public Criteria andWsclsslxEqualTo(String value) {
            addCriterion("WSCLSSLX =", value, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxNotEqualTo(String value) {
            addCriterion("WSCLSSLX <>", value, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxGreaterThan(String value) {
            addCriterion("WSCLSSLX >", value, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxGreaterThanOrEqualTo(String value) {
            addCriterion("WSCLSSLX >=", value, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxLessThan(String value) {
            addCriterion("WSCLSSLX <", value, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxLessThanOrEqualTo(String value) {
            addCriterion("WSCLSSLX <=", value, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxLike(String value) {
            addCriterion("WSCLSSLX like", value, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxNotLike(String value) {
            addCriterion("WSCLSSLX not like", value, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxIn(List<String> values) {
            addCriterion("WSCLSSLX in", values, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxNotIn(List<String> values) {
            addCriterion("WSCLSSLX not in", values, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxBetween(String value1, String value2) {
            addCriterion("WSCLSSLX between", value1, value2, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxNotBetween(String value1, String value2) {
            addCriterion("WSCLSSLX not between", value1, value2, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andJcsjIsNull() {
            addCriterion("JCSJ is null");
            return (Criteria) this;
        }

        public Criteria andJcsjIsNotNull() {
            addCriterion("JCSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJcsjEqualTo(String value) {
            addCriterion("JCSJ =", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjNotEqualTo(String value) {
            addCriterion("JCSJ <>", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjGreaterThan(String value) {
            addCriterion("JCSJ >", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjGreaterThanOrEqualTo(String value) {
            addCriterion("JCSJ >=", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjLessThan(String value) {
            addCriterion("JCSJ <", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjLessThanOrEqualTo(String value) {
            addCriterion("JCSJ <=", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjLike(String value) {
            addCriterion("JCSJ like", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjNotLike(String value) {
            addCriterion("JCSJ not like", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjIn(List<String> values) {
            addCriterion("JCSJ in", values, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjNotIn(List<String> values) {
            addCriterion("JCSJ not in", values, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjBetween(String value1, String value2) {
            addCriterion("JCSJ between", value1, value2, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjNotBetween(String value1, String value2) {
            addCriterion("JCSJ not between", value1, value2, "jcsj");
            return (Criteria) this;
        }

        public Criteria andWscljbIsNull() {
            addCriterion("WSCLJB is null");
            return (Criteria) this;
        }

        public Criteria andWscljbIsNotNull() {
            addCriterion("WSCLJB is not null");
            return (Criteria) this;
        }

        public Criteria andWscljbEqualTo(String value) {
            addCriterion("WSCLJB =", value, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbNotEqualTo(String value) {
            addCriterion("WSCLJB <>", value, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbGreaterThan(String value) {
            addCriterion("WSCLJB >", value, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbGreaterThanOrEqualTo(String value) {
            addCriterion("WSCLJB >=", value, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbLessThan(String value) {
            addCriterion("WSCLJB <", value, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbLessThanOrEqualTo(String value) {
            addCriterion("WSCLJB <=", value, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbLike(String value) {
            addCriterion("WSCLJB like", value, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbNotLike(String value) {
            addCriterion("WSCLJB not like", value, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbIn(List<String> values) {
            addCriterion("WSCLJB in", values, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbNotIn(List<String> values) {
            addCriterion("WSCLJB not in", values, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbBetween(String value1, String value2) {
            addCriterion("WSCLJB between", value1, value2, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbNotBetween(String value1, String value2) {
            addCriterion("WSCLJB not between", value1, value2, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1IsNull() {
            addCriterion("WSCLFFMC1 is null");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1IsNotNull() {
            addCriterion("WSCLFFMC1 is not null");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1EqualTo(String value) {
            addCriterion("WSCLFFMC1 =", value, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1NotEqualTo(String value) {
            addCriterion("WSCLFFMC1 <>", value, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1GreaterThan(String value) {
            addCriterion("WSCLFFMC1 >", value, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1GreaterThanOrEqualTo(String value) {
            addCriterion("WSCLFFMC1 >=", value, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1LessThan(String value) {
            addCriterion("WSCLFFMC1 <", value, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1LessThanOrEqualTo(String value) {
            addCriterion("WSCLFFMC1 <=", value, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1Like(String value) {
            addCriterion("WSCLFFMC1 like", value, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1NotLike(String value) {
            addCriterion("WSCLFFMC1 not like", value, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1In(List<String> values) {
            addCriterion("WSCLFFMC1 in", values, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1NotIn(List<String> values) {
            addCriterion("WSCLFFMC1 not in", values, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1Between(String value1, String value2) {
            addCriterion("WSCLFFMC1 between", value1, value2, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1NotBetween(String value1, String value2) {
            addCriterion("WSCLFFMC1 not between", value1, value2, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1IsNull() {
            addCriterion("WSCLFFDM1 is null");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1IsNotNull() {
            addCriterion("WSCLFFDM1 is not null");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1EqualTo(String value) {
            addCriterion("WSCLFFDM1 =", value, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1NotEqualTo(String value) {
            addCriterion("WSCLFFDM1 <>", value, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1GreaterThan(String value) {
            addCriterion("WSCLFFDM1 >", value, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1GreaterThanOrEqualTo(String value) {
            addCriterion("WSCLFFDM1 >=", value, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1LessThan(String value) {
            addCriterion("WSCLFFDM1 <", value, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1LessThanOrEqualTo(String value) {
            addCriterion("WSCLFFDM1 <=", value, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1Like(String value) {
            addCriterion("WSCLFFDM1 like", value, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1NotLike(String value) {
            addCriterion("WSCLFFDM1 not like", value, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1In(List<String> values) {
            addCriterion("WSCLFFDM1 in", values, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1NotIn(List<String> values) {
            addCriterion("WSCLFFDM1 not in", values, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1Between(String value1, String value2) {
            addCriterion("WSCLFFDM1 between", value1, value2, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1NotBetween(String value1, String value2) {
            addCriterion("WSCLFFDM1 not between", value1, value2, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2IsNull() {
            addCriterion("WSCLFFMC2 is null");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2IsNotNull() {
            addCriterion("WSCLFFMC2 is not null");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2EqualTo(String value) {
            addCriterion("WSCLFFMC2 =", value, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2NotEqualTo(String value) {
            addCriterion("WSCLFFMC2 <>", value, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2GreaterThan(String value) {
            addCriterion("WSCLFFMC2 >", value, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2GreaterThanOrEqualTo(String value) {
            addCriterion("WSCLFFMC2 >=", value, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2LessThan(String value) {
            addCriterion("WSCLFFMC2 <", value, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2LessThanOrEqualTo(String value) {
            addCriterion("WSCLFFMC2 <=", value, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2Like(String value) {
            addCriterion("WSCLFFMC2 like", value, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2NotLike(String value) {
            addCriterion("WSCLFFMC2 not like", value, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2In(List<String> values) {
            addCriterion("WSCLFFMC2 in", values, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2NotIn(List<String> values) {
            addCriterion("WSCLFFMC2 not in", values, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2Between(String value1, String value2) {
            addCriterion("WSCLFFMC2 between", value1, value2, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2NotBetween(String value1, String value2) {
            addCriterion("WSCLFFMC2 not between", value1, value2, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2IsNull() {
            addCriterion("WSCLFFDM2 is null");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2IsNotNull() {
            addCriterion("WSCLFFDM2 is not null");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2EqualTo(String value) {
            addCriterion("WSCLFFDM2 =", value, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2NotEqualTo(String value) {
            addCriterion("WSCLFFDM2 <>", value, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2GreaterThan(String value) {
            addCriterion("WSCLFFDM2 >", value, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2GreaterThanOrEqualTo(String value) {
            addCriterion("WSCLFFDM2 >=", value, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2LessThan(String value) {
            addCriterion("WSCLFFDM2 <", value, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2LessThanOrEqualTo(String value) {
            addCriterion("WSCLFFDM2 <=", value, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2Like(String value) {
            addCriterion("WSCLFFDM2 like", value, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2NotLike(String value) {
            addCriterion("WSCLFFDM2 not like", value, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2In(List<String> values) {
            addCriterion("WSCLFFDM2 in", values, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2NotIn(List<String> values) {
            addCriterion("WSCLFFDM2 not in", values, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2Between(String value1, String value2) {
            addCriterion("WSCLFFDM2 between", value1, value2, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2NotBetween(String value1, String value2) {
            addCriterion("WSCLFFDM2 not between", value1, value2, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcIsNull() {
            addCriterion("PSQXLXMC is null");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcIsNotNull() {
            addCriterion("PSQXLXMC is not null");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcEqualTo(String value) {
            addCriterion("PSQXLXMC =", value, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcNotEqualTo(String value) {
            addCriterion("PSQXLXMC <>", value, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcGreaterThan(String value) {
            addCriterion("PSQXLXMC >", value, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcGreaterThanOrEqualTo(String value) {
            addCriterion("PSQXLXMC >=", value, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcLessThan(String value) {
            addCriterion("PSQXLXMC <", value, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcLessThanOrEqualTo(String value) {
            addCriterion("PSQXLXMC <=", value, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcLike(String value) {
            addCriterion("PSQXLXMC like", value, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcNotLike(String value) {
            addCriterion("PSQXLXMC not like", value, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcIn(List<String> values) {
            addCriterion("PSQXLXMC in", values, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcNotIn(List<String> values) {
            addCriterion("PSQXLXMC not in", values, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcBetween(String value1, String value2) {
            addCriterion("PSQXLXMC between", value1, value2, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcNotBetween(String value1, String value2) {
            addCriterion("PSQXLXMC not between", value1, value2, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmIsNull() {
            addCriterion("PSQXLXDM is null");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmIsNotNull() {
            addCriterion("PSQXLXDM is not null");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmEqualTo(String value) {
            addCriterion("PSQXLXDM =", value, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmNotEqualTo(String value) {
            addCriterion("PSQXLXDM <>", value, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmGreaterThan(String value) {
            addCriterion("PSQXLXDM >", value, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmGreaterThanOrEqualTo(String value) {
            addCriterion("PSQXLXDM >=", value, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmLessThan(String value) {
            addCriterion("PSQXLXDM <", value, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmLessThanOrEqualTo(String value) {
            addCriterion("PSQXLXDM <=", value, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmLike(String value) {
            addCriterion("PSQXLXDM like", value, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmNotLike(String value) {
            addCriterion("PSQXLXDM not like", value, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmIn(List<String> values) {
            addCriterion("PSQXLXDM in", values, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmNotIn(List<String> values) {
            addCriterion("PSQXLXDM not in", values, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmBetween(String value1, String value2) {
            addCriterion("PSQXLXDM between", value1, value2, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmNotBetween(String value1, String value2) {
            addCriterion("PSQXLXDM not between", value1, value2, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andSnstmcIsNull() {
            addCriterion("SNSTMC is null");
            return (Criteria) this;
        }

        public Criteria andSnstmcIsNotNull() {
            addCriterion("SNSTMC is not null");
            return (Criteria) this;
        }

        public Criteria andSnstmcEqualTo(String value) {
            addCriterion("SNSTMC =", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcNotEqualTo(String value) {
            addCriterion("SNSTMC <>", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcGreaterThan(String value) {
            addCriterion("SNSTMC >", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcGreaterThanOrEqualTo(String value) {
            addCriterion("SNSTMC >=", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcLessThan(String value) {
            addCriterion("SNSTMC <", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcLessThanOrEqualTo(String value) {
            addCriterion("SNSTMC <=", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcLike(String value) {
            addCriterion("SNSTMC like", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcNotLike(String value) {
            addCriterion("SNSTMC not like", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcIn(List<String> values) {
            addCriterion("SNSTMC in", values, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcNotIn(List<String> values) {
            addCriterion("SNSTMC not in", values, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcBetween(String value1, String value2) {
            addCriterion("SNSTMC between", value1, value2, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcNotBetween(String value1, String value2) {
            addCriterion("SNSTMC not between", value1, value2, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstdmIsNull() {
            addCriterion("SNSTDM is null");
            return (Criteria) this;
        }

        public Criteria andSnstdmIsNotNull() {
            addCriterion("SNSTDM is not null");
            return (Criteria) this;
        }

        public Criteria andSnstdmEqualTo(String value) {
            addCriterion("SNSTDM =", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmNotEqualTo(String value) {
            addCriterion("SNSTDM <>", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmGreaterThan(String value) {
            addCriterion("SNSTDM >", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmGreaterThanOrEqualTo(String value) {
            addCriterion("SNSTDM >=", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmLessThan(String value) {
            addCriterion("SNSTDM <", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmLessThanOrEqualTo(String value) {
            addCriterion("SNSTDM <=", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmLike(String value) {
            addCriterion("SNSTDM like", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmNotLike(String value) {
            addCriterion("SNSTDM not like", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmIn(List<String> values) {
            addCriterion("SNSTDM in", values, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmNotIn(List<String> values) {
            addCriterion("SNSTDM not in", values, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmBetween(String value1, String value2) {
            addCriterion("SNSTDM between", value1, value2, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmNotBetween(String value1, String value2) {
            addCriterion("SNSTDM not between", value1, value2, "snstdm");
            return (Criteria) this;
        }

        public Criteria andYxtsTIsNull() {
            addCriterion("YXTS_T is null");
            return (Criteria) this;
        }

        public Criteria andYxtsTIsNotNull() {
            addCriterion("YXTS_T is not null");
            return (Criteria) this;
        }

        public Criteria andYxtsTEqualTo(String value) {
            addCriterion("YXTS_T =", value, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andYxtsTNotEqualTo(String value) {
            addCriterion("YXTS_T <>", value, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andYxtsTGreaterThan(String value) {
            addCriterion("YXTS_T >", value, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andYxtsTGreaterThanOrEqualTo(String value) {
            addCriterion("YXTS_T >=", value, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andYxtsTLessThan(String value) {
            addCriterion("YXTS_T <", value, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andYxtsTLessThanOrEqualTo(String value) {
            addCriterion("YXTS_T <=", value, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andYxtsTLike(String value) {
            addCriterion("YXTS_T like", value, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andYxtsTNotLike(String value) {
            addCriterion("YXTS_T not like", value, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andYxtsTIn(List<String> values) {
            addCriterion("YXTS_T in", values, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andYxtsTNotIn(List<String> values) {
            addCriterion("YXTS_T not in", values, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andYxtsTBetween(String value1, String value2) {
            addCriterion("YXTS_T between", value1, value2, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andYxtsTNotBetween(String value1, String value2) {
            addCriterion("YXTS_T not between", value1, value2, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyIsNull() {
            addCriterion("LJWCTZ_WY is null");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyIsNotNull() {
            addCriterion("LJWCTZ_WY is not null");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyEqualTo(String value) {
            addCriterion("LJWCTZ_WY =", value, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyNotEqualTo(String value) {
            addCriterion("LJWCTZ_WY <>", value, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyGreaterThan(String value) {
            addCriterion("LJWCTZ_WY >", value, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyGreaterThanOrEqualTo(String value) {
            addCriterion("LJWCTZ_WY >=", value, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyLessThan(String value) {
            addCriterion("LJWCTZ_WY <", value, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyLessThanOrEqualTo(String value) {
            addCriterion("LJWCTZ_WY <=", value, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyLike(String value) {
            addCriterion("LJWCTZ_WY like", value, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyNotLike(String value) {
            addCriterion("LJWCTZ_WY not like", value, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyIn(List<String> values) {
            addCriterion("LJWCTZ_WY in", values, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyNotIn(List<String> values) {
            addCriterion("LJWCTZ_WY not in", values, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyBetween(String value1, String value2) {
            addCriterion("LJWCTZ_WY between", value1, value2, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyNotBetween(String value1, String value2) {
            addCriterion("LJWCTZ_WY not between", value1, value2, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyIsNull() {
            addCriterion("XZGDZCTZ_WY is null");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyIsNotNull() {
            addCriterion("XZGDZCTZ_WY is not null");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyEqualTo(String value) {
            addCriterion("XZGDZCTZ_WY =", value, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyNotEqualTo(String value) {
            addCriterion("XZGDZCTZ_WY <>", value, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyGreaterThan(String value) {
            addCriterion("XZGDZCTZ_WY >", value, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyGreaterThanOrEqualTo(String value) {
            addCriterion("XZGDZCTZ_WY >=", value, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyLessThan(String value) {
            addCriterion("XZGDZCTZ_WY <", value, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyLessThanOrEqualTo(String value) {
            addCriterion("XZGDZCTZ_WY <=", value, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyLike(String value) {
            addCriterion("XZGDZCTZ_WY like", value, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyNotLike(String value) {
            addCriterion("XZGDZCTZ_WY not like", value, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyIn(List<String> values) {
            addCriterion("XZGDZCTZ_WY in", values, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyNotIn(List<String> values) {
            addCriterion("XZGDZCTZ_WY not in", values, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyBetween(String value1, String value2) {
            addCriterion("XZGDZCTZ_WY between", value1, value2, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyNotBetween(String value1, String value2) {
            addCriterion("XZGDZCTZ_WY not between", value1, value2, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyIsNull() {
            addCriterion("YXFY_WY is null");
            return (Criteria) this;
        }

        public Criteria andYxfyWyIsNotNull() {
            addCriterion("YXFY_WY is not null");
            return (Criteria) this;
        }

        public Criteria andYxfyWyEqualTo(String value) {
            addCriterion("YXFY_WY =", value, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyNotEqualTo(String value) {
            addCriterion("YXFY_WY <>", value, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyGreaterThan(String value) {
            addCriterion("YXFY_WY >", value, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyGreaterThanOrEqualTo(String value) {
            addCriterion("YXFY_WY >=", value, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyLessThan(String value) {
            addCriterion("YXFY_WY <", value, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyLessThanOrEqualTo(String value) {
            addCriterion("YXFY_WY <=", value, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyLike(String value) {
            addCriterion("YXFY_WY like", value, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyNotLike(String value) {
            addCriterion("YXFY_WY not like", value, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyIn(List<String> values) {
            addCriterion("YXFY_WY in", values, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyNotIn(List<String> values) {
            addCriterion("YXFY_WY not in", values, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyBetween(String value1, String value2) {
            addCriterion("YXFY_WY between", value1, value2, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyNotBetween(String value1, String value2) {
            addCriterion("YXFY_WY not between", value1, value2, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsIsNull() {
            addCriterion("YDL_WQWS is null");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsIsNotNull() {
            addCriterion("YDL_WQWS is not null");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsEqualTo(String value) {
            addCriterion("YDL_WQWS =", value, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsNotEqualTo(String value) {
            addCriterion("YDL_WQWS <>", value, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsGreaterThan(String value) {
            addCriterion("YDL_WQWS >", value, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsGreaterThanOrEqualTo(String value) {
            addCriterion("YDL_WQWS >=", value, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsLessThan(String value) {
            addCriterion("YDL_WQWS <", value, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsLessThanOrEqualTo(String value) {
            addCriterion("YDL_WQWS <=", value, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsLike(String value) {
            addCriterion("YDL_WQWS like", value, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsNotLike(String value) {
            addCriterion("YDL_WQWS not like", value, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsIn(List<String> values) {
            addCriterion("YDL_WQWS in", values, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsNotIn(List<String> values) {
            addCriterion("YDL_WQWS not in", values, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsBetween(String value1, String value2) {
            addCriterion("YDL_WQWS between", value1, value2, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsNotBetween(String value1, String value2) {
            addCriterion("YDL_WQWS not between", value1, value2, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRIsNull() {
            addCriterion("WSSJCLNL_D_R is null");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRIsNotNull() {
            addCriterion("WSSJCLNL_D_R is not null");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDREqualTo(String value) {
            addCriterion("WSSJCLNL_D_R =", value, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRNotEqualTo(String value) {
            addCriterion("WSSJCLNL_D_R <>", value, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRGreaterThan(String value) {
            addCriterion("WSSJCLNL_D_R >", value, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRGreaterThanOrEqualTo(String value) {
            addCriterion("WSSJCLNL_D_R >=", value, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRLessThan(String value) {
            addCriterion("WSSJCLNL_D_R <", value, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRLessThanOrEqualTo(String value) {
            addCriterion("WSSJCLNL_D_R <=", value, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRLike(String value) {
            addCriterion("WSSJCLNL_D_R like", value, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRNotLike(String value) {
            addCriterion("WSSJCLNL_D_R not like", value, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRIn(List<String> values) {
            addCriterion("WSSJCLNL_D_R in", values, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRNotIn(List<String> values) {
            addCriterion("WSSJCLNL_D_R not in", values, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRBetween(String value1, String value2) {
            addCriterion("WSSJCLNL_D_R between", value1, value2, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRNotBetween(String value1, String value2) {
            addCriterion("WSSJCLNL_D_R not between", value1, value2, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdIsNull() {
            addCriterion("WSSJCLL_WD is null");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdIsNotNull() {
            addCriterion("WSSJCLL_WD is not null");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdEqualTo(String value) {
            addCriterion("WSSJCLL_WD =", value, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdNotEqualTo(String value) {
            addCriterion("WSSJCLL_WD <>", value, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdGreaterThan(String value) {
            addCriterion("WSSJCLL_WD >", value, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdGreaterThanOrEqualTo(String value) {
            addCriterion("WSSJCLL_WD >=", value, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdLessThan(String value) {
            addCriterion("WSSJCLL_WD <", value, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdLessThanOrEqualTo(String value) {
            addCriterion("WSSJCLL_WD <=", value, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdLike(String value) {
            addCriterion("WSSJCLL_WD like", value, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdNotLike(String value) {
            addCriterion("WSSJCLL_WD not like", value, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdIn(List<String> values) {
            addCriterion("WSSJCLL_WD in", values, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdNotIn(List<String> values) {
            addCriterion("WSSJCLL_WD not in", values, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdBetween(String value1, String value2) {
            addCriterion("WSSJCLL_WD between", value1, value2, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdNotBetween(String value1, String value2) {
            addCriterion("WSSJCLL_WD not between", value1, value2, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdIsNull() {
            addCriterion("QZ_CLSHWSL_WD is null");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdIsNotNull() {
            addCriterion("QZ_CLSHWSL_WD is not null");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdEqualTo(String value) {
            addCriterion("QZ_CLSHWSL_WD =", value, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdNotEqualTo(String value) {
            addCriterion("QZ_CLSHWSL_WD <>", value, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdGreaterThan(String value) {
            addCriterion("QZ_CLSHWSL_WD >", value, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdGreaterThanOrEqualTo(String value) {
            addCriterion("QZ_CLSHWSL_WD >=", value, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdLessThan(String value) {
            addCriterion("QZ_CLSHWSL_WD <", value, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdLessThanOrEqualTo(String value) {
            addCriterion("QZ_CLSHWSL_WD <=", value, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdLike(String value) {
            addCriterion("QZ_CLSHWSL_WD like", value, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdNotLike(String value) {
            addCriterion("QZ_CLSHWSL_WD not like", value, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdIn(List<String> values) {
            addCriterion("QZ_CLSHWSL_WD in", values, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdNotIn(List<String> values) {
            addCriterion("QZ_CLSHWSL_WD not in", values, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdBetween(String value1, String value2) {
            addCriterion("QZ_CLSHWSL_WD between", value1, value2, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdNotBetween(String value1, String value2) {
            addCriterion("QZ_CLSHWSL_WD not between", value1, value2, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdIsNull() {
            addCriterion("QZ_CLGYFSL_WD is null");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdIsNotNull() {
            addCriterion("QZ_CLGYFSL_WD is not null");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdEqualTo(String value) {
            addCriterion("QZ_CLGYFSL_WD =", value, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdNotEqualTo(String value) {
            addCriterion("QZ_CLGYFSL_WD <>", value, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdGreaterThan(String value) {
            addCriterion("QZ_CLGYFSL_WD >", value, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdGreaterThanOrEqualTo(String value) {
            addCriterion("QZ_CLGYFSL_WD >=", value, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdLessThan(String value) {
            addCriterion("QZ_CLGYFSL_WD <", value, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdLessThanOrEqualTo(String value) {
            addCriterion("QZ_CLGYFSL_WD <=", value, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdLike(String value) {
            addCriterion("QZ_CLGYFSL_WD like", value, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdNotLike(String value) {
            addCriterion("QZ_CLGYFSL_WD not like", value, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdIn(List<String> values) {
            addCriterion("QZ_CLGYFSL_WD in", values, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdNotIn(List<String> values) {
            addCriterion("QZ_CLGYFSL_WD not in", values, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdBetween(String value1, String value2) {
            addCriterion("QZ_CLGYFSL_WD between", value1, value2, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdNotBetween(String value1, String value2) {
            addCriterion("QZ_CLGYFSL_WD not between", value1, value2, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdIsNull() {
            addCriterion("QZ_CLBXQWDSL_WD is null");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdIsNotNull() {
            addCriterion("QZ_CLBXQWDSL_WD is not null");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdEqualTo(String value) {
            addCriterion("QZ_CLBXQWDSL_WD =", value, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdNotEqualTo(String value) {
            addCriterion("QZ_CLBXQWDSL_WD <>", value, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdGreaterThan(String value) {
            addCriterion("QZ_CLBXQWDSL_WD >", value, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdGreaterThanOrEqualTo(String value) {
            addCriterion("QZ_CLBXQWDSL_WD >=", value, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdLessThan(String value) {
            addCriterion("QZ_CLBXQWDSL_WD <", value, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdLessThanOrEqualTo(String value) {
            addCriterion("QZ_CLBXQWDSL_WD <=", value, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdLike(String value) {
            addCriterion("QZ_CLBXQWDSL_WD like", value, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdNotLike(String value) {
            addCriterion("QZ_CLBXQWDSL_WD not like", value, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdIn(List<String> values) {
            addCriterion("QZ_CLBXQWDSL_WD in", values, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdNotIn(List<String> values) {
            addCriterion("QZ_CLBXQWDSL_WD not in", values, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdBetween(String value1, String value2) {
            addCriterion("QZ_CLBXQWDSL_WD between", value1, value2, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdNotBetween(String value1, String value2) {
            addCriterion("QZ_CLBXQWDSL_WD not between", value1, value2, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdIsNull() {
            addCriterion("ZSSSCL_WD is null");
            return (Criteria) this;
        }

        public Criteria andZsssclWdIsNotNull() {
            addCriterion("ZSSSCL_WD is not null");
            return (Criteria) this;
        }

        public Criteria andZsssclWdEqualTo(String value) {
            addCriterion("ZSSSCL_WD =", value, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdNotEqualTo(String value) {
            addCriterion("ZSSSCL_WD <>", value, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdGreaterThan(String value) {
            addCriterion("ZSSSCL_WD >", value, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdGreaterThanOrEqualTo(String value) {
            addCriterion("ZSSSCL_WD >=", value, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdLessThan(String value) {
            addCriterion("ZSSSCL_WD <", value, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdLessThanOrEqualTo(String value) {
            addCriterion("ZSSSCL_WD <=", value, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdLike(String value) {
            addCriterion("ZSSSCL_WD like", value, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdNotLike(String value) {
            addCriterion("ZSSSCL_WD not like", value, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdIn(List<String> values) {
            addCriterion("ZSSSCL_WD in", values, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdNotIn(List<String> values) {
            addCriterion("ZSSSCL_WD not in", values, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdBetween(String value1, String value2) {
            addCriterion("ZSSSCL_WD between", value1, value2, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdNotBetween(String value1, String value2) {
            addCriterion("ZSSSCL_WD not between", value1, value2, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdIsNull() {
            addCriterion("ZSSLYL_WD is null");
            return (Criteria) this;
        }

        public Criteria andZsslylWdIsNotNull() {
            addCriterion("ZSSLYL_WD is not null");
            return (Criteria) this;
        }

        public Criteria andZsslylWdEqualTo(String value) {
            addCriterion("ZSSLYL_WD =", value, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdNotEqualTo(String value) {
            addCriterion("ZSSLYL_WD <>", value, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdGreaterThan(String value) {
            addCriterion("ZSSLYL_WD >", value, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdGreaterThanOrEqualTo(String value) {
            addCriterion("ZSSLYL_WD >=", value, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdLessThan(String value) {
            addCriterion("ZSSLYL_WD <", value, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdLessThanOrEqualTo(String value) {
            addCriterion("ZSSLYL_WD <=", value, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdLike(String value) {
            addCriterion("ZSSLYL_WD like", value, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdNotLike(String value) {
            addCriterion("ZSSLYL_WD not like", value, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdIn(List<String> values) {
            addCriterion("ZSSLYL_WD in", values, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdNotIn(List<String> values) {
            addCriterion("ZSSLYL_WD not in", values, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdBetween(String value1, String value2) {
            addCriterion("ZSSLYL_WD between", value1, value2, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdNotBetween(String value1, String value2) {
            addCriterion("ZSSLYL_WD not between", value1, value2, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdIsNull() {
            addCriterion("QZ_GYYSL_WD is null");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdIsNotNull() {
            addCriterion("QZ_GYYSL_WD is not null");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdEqualTo(String value) {
            addCriterion("QZ_GYYSL_WD =", value, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdNotEqualTo(String value) {
            addCriterion("QZ_GYYSL_WD <>", value, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdGreaterThan(String value) {
            addCriterion("QZ_GYYSL_WD >", value, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdGreaterThanOrEqualTo(String value) {
            addCriterion("QZ_GYYSL_WD >=", value, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdLessThan(String value) {
            addCriterion("QZ_GYYSL_WD <", value, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdLessThanOrEqualTo(String value) {
            addCriterion("QZ_GYYSL_WD <=", value, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdLike(String value) {
            addCriterion("QZ_GYYSL_WD like", value, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdNotLike(String value) {
            addCriterion("QZ_GYYSL_WD not like", value, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdIn(List<String> values) {
            addCriterion("QZ_GYYSL_WD in", values, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdNotIn(List<String> values) {
            addCriterion("QZ_GYYSL_WD not in", values, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdBetween(String value1, String value2) {
            addCriterion("QZ_GYYSL_WD between", value1, value2, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdNotBetween(String value1, String value2) {
            addCriterion("QZ_GYYSL_WD not between", value1, value2, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdIsNull() {
            addCriterion("QZ_SZYS_WD is null");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdIsNotNull() {
            addCriterion("QZ_SZYS_WD is not null");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdEqualTo(String value) {
            addCriterion("QZ_SZYS_WD =", value, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdNotEqualTo(String value) {
            addCriterion("QZ_SZYS_WD <>", value, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdGreaterThan(String value) {
            addCriterion("QZ_SZYS_WD >", value, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdGreaterThanOrEqualTo(String value) {
            addCriterion("QZ_SZYS_WD >=", value, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdLessThan(String value) {
            addCriterion("QZ_SZYS_WD <", value, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdLessThanOrEqualTo(String value) {
            addCriterion("QZ_SZYS_WD <=", value, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdLike(String value) {
            addCriterion("QZ_SZYS_WD like", value, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdNotLike(String value) {
            addCriterion("QZ_SZYS_WD not like", value, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdIn(List<String> values) {
            addCriterion("QZ_SZYS_WD in", values, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdNotIn(List<String> values) {
            addCriterion("QZ_SZYS_WD not in", values, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdBetween(String value1, String value2) {
            addCriterion("QZ_SZYS_WD between", value1, value2, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdNotBetween(String value1, String value2) {
            addCriterion("QZ_SZYS_WD not between", value1, value2, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdIsNull() {
            addCriterion("QZ_JGYSL_WD is null");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdIsNotNull() {
            addCriterion("QZ_JGYSL_WD is not null");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdEqualTo(String value) {
            addCriterion("QZ_JGYSL_WD =", value, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdNotEqualTo(String value) {
            addCriterion("QZ_JGYSL_WD <>", value, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdGreaterThan(String value) {
            addCriterion("QZ_JGYSL_WD >", value, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdGreaterThanOrEqualTo(String value) {
            addCriterion("QZ_JGYSL_WD >=", value, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdLessThan(String value) {
            addCriterion("QZ_JGYSL_WD <", value, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdLessThanOrEqualTo(String value) {
            addCriterion("QZ_JGYSL_WD <=", value, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdLike(String value) {
            addCriterion("QZ_JGYSL_WD like", value, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdNotLike(String value) {
            addCriterion("QZ_JGYSL_WD not like", value, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdIn(List<String> values) {
            addCriterion("QZ_JGYSL_WD in", values, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdNotIn(List<String> values) {
            addCriterion("QZ_JGYSL_WD not in", values, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdBetween(String value1, String value2) {
            addCriterion("QZ_JGYSL_WD between", value1, value2, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdNotBetween(String value1, String value2) {
            addCriterion("QZ_JGYSL_WD not between", value1, value2, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andWncslDIsNull() {
            addCriterion("WNCSL_D is null");
            return (Criteria) this;
        }

        public Criteria andWncslDIsNotNull() {
            addCriterion("WNCSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andWncslDEqualTo(String value) {
            addCriterion("WNCSL_D =", value, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWncslDNotEqualTo(String value) {
            addCriterion("WNCSL_D <>", value, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWncslDGreaterThan(String value) {
            addCriterion("WNCSL_D >", value, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWncslDGreaterThanOrEqualTo(String value) {
            addCriterion("WNCSL_D >=", value, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWncslDLessThan(String value) {
            addCriterion("WNCSL_D <", value, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWncslDLessThanOrEqualTo(String value) {
            addCriterion("WNCSL_D <=", value, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWncslDLike(String value) {
            addCriterion("WNCSL_D like", value, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWncslDNotLike(String value) {
            addCriterion("WNCSL_D not like", value, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWncslDIn(List<String> values) {
            addCriterion("WNCSL_D in", values, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWncslDNotIn(List<String> values) {
            addCriterion("WNCSL_D not in", values, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWncslDBetween(String value1, String value2) {
            addCriterion("WNCSL_D between", value1, value2, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWncslDNotBetween(String value1, String value2) {
            addCriterion("WNCSL_D not between", value1, value2, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWnczlDIsNull() {
            addCriterion("WNCZL_D is null");
            return (Criteria) this;
        }

        public Criteria andWnczlDIsNotNull() {
            addCriterion("WNCZL_D is not null");
            return (Criteria) this;
        }

        public Criteria andWnczlDEqualTo(String value) {
            addCriterion("WNCZL_D =", value, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andWnczlDNotEqualTo(String value) {
            addCriterion("WNCZL_D <>", value, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andWnczlDGreaterThan(String value) {
            addCriterion("WNCZL_D >", value, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andWnczlDGreaterThanOrEqualTo(String value) {
            addCriterion("WNCZL_D >=", value, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andWnczlDLessThan(String value) {
            addCriterion("WNCZL_D <", value, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andWnczlDLessThanOrEqualTo(String value) {
            addCriterion("WNCZL_D <=", value, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andWnczlDLike(String value) {
            addCriterion("WNCZL_D like", value, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andWnczlDNotLike(String value) {
            addCriterion("WNCZL_D not like", value, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andWnczlDIn(List<String> values) {
            addCriterion("WNCZL_D in", values, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andWnczlDNotIn(List<String> values) {
            addCriterion("WNCZL_D not in", values, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andWnczlDBetween(String value1, String value2) {
            addCriterion("WNCZL_D between", value1, value2, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andWnczlDNotBetween(String value1, String value2) {
            addCriterion("WNCZL_D not between", value1, value2, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDIsNull() {
            addCriterion("QZ_TDLYL_D is null");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDIsNotNull() {
            addCriterion("QZ_TDLYL_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDEqualTo(String value) {
            addCriterion("QZ_TDLYL_D =", value, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDNotEqualTo(String value) {
            addCriterion("QZ_TDLYL_D <>", value, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDGreaterThan(String value) {
            addCriterion("QZ_TDLYL_D >", value, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDGreaterThanOrEqualTo(String value) {
            addCriterion("QZ_TDLYL_D >=", value, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDLessThan(String value) {
            addCriterion("QZ_TDLYL_D <", value, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDLessThanOrEqualTo(String value) {
            addCriterion("QZ_TDLYL_D <=", value, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDLike(String value) {
            addCriterion("QZ_TDLYL_D like", value, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDNotLike(String value) {
            addCriterion("QZ_TDLYL_D not like", value, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDIn(List<String> values) {
            addCriterion("QZ_TDLYL_D in", values, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDNotIn(List<String> values) {
            addCriterion("QZ_TDLYL_D not in", values, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDBetween(String value1, String value2) {
            addCriterion("QZ_TDLYL_D between", value1, value2, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDNotBetween(String value1, String value2) {
            addCriterion("QZ_TDLYL_D not between", value1, value2, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDIsNull() {
            addCriterion("QZ_TMCZL_D is null");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDIsNotNull() {
            addCriterion("QZ_TMCZL_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDEqualTo(String value) {
            addCriterion("QZ_TMCZL_D =", value, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDNotEqualTo(String value) {
            addCriterion("QZ_TMCZL_D <>", value, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDGreaterThan(String value) {
            addCriterion("QZ_TMCZL_D >", value, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDGreaterThanOrEqualTo(String value) {
            addCriterion("QZ_TMCZL_D >=", value, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDLessThan(String value) {
            addCriterion("QZ_TMCZL_D <", value, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDLessThanOrEqualTo(String value) {
            addCriterion("QZ_TMCZL_D <=", value, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDLike(String value) {
            addCriterion("QZ_TMCZL_D like", value, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDNotLike(String value) {
            addCriterion("QZ_TMCZL_D not like", value, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDIn(List<String> values) {
            addCriterion("QZ_TMCZL_D in", values, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDNotIn(List<String> values) {
            addCriterion("QZ_TMCZL_D not in", values, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDBetween(String value1, String value2) {
            addCriterion("QZ_TMCZL_D between", value1, value2, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDNotBetween(String value1, String value2) {
            addCriterion("QZ_TMCZL_D not between", value1, value2, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDIsNull() {
            addCriterion("QZ_JZCLLYL_D is null");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDIsNotNull() {
            addCriterion("QZ_JZCLLYL_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDEqualTo(String value) {
            addCriterion("QZ_JZCLLYL_D =", value, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDNotEqualTo(String value) {
            addCriterion("QZ_JZCLLYL_D <>", value, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDGreaterThan(String value) {
            addCriterion("QZ_JZCLLYL_D >", value, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDGreaterThanOrEqualTo(String value) {
            addCriterion("QZ_JZCLLYL_D >=", value, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDLessThan(String value) {
            addCriterion("QZ_JZCLLYL_D <", value, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDLessThanOrEqualTo(String value) {
            addCriterion("QZ_JZCLLYL_D <=", value, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDLike(String value) {
            addCriterion("QZ_JZCLLYL_D like", value, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDNotLike(String value) {
            addCriterion("QZ_JZCLLYL_D not like", value, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDIn(List<String> values) {
            addCriterion("QZ_JZCLLYL_D in", values, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDNotIn(List<String> values) {
            addCriterion("QZ_JZCLLYL_D not in", values, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDBetween(String value1, String value2) {
            addCriterion("QZ_JZCLLYL_D between", value1, value2, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDNotBetween(String value1, String value2) {
            addCriterion("QZ_JZCLLYL_D not between", value1, value2, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDIsNull() {
            addCriterion("QZ_FSCZL_D is null");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDIsNotNull() {
            addCriterion("QZ_FSCZL_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDEqualTo(String value) {
            addCriterion("QZ_FSCZL_D =", value, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDNotEqualTo(String value) {
            addCriterion("QZ_FSCZL_D <>", value, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDGreaterThan(String value) {
            addCriterion("QZ_FSCZL_D >", value, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDGreaterThanOrEqualTo(String value) {
            addCriterion("QZ_FSCZL_D >=", value, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDLessThan(String value) {
            addCriterion("QZ_FSCZL_D <", value, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDLessThanOrEqualTo(String value) {
            addCriterion("QZ_FSCZL_D <=", value, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDLike(String value) {
            addCriterion("QZ_FSCZL_D like", value, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDNotLike(String value) {
            addCriterion("QZ_FSCZL_D not like", value, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDIn(List<String> values) {
            addCriterion("QZ_FSCZL_D in", values, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDNotIn(List<String> values) {
            addCriterion("QZ_FSCZL_D not in", values, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDBetween(String value1, String value2) {
            addCriterion("QZ_FSCZL_D between", value1, value2, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDNotBetween(String value1, String value2) {
            addCriterion("QZ_FSCZL_D not between", value1, value2, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDIsNull() {
            addCriterion("WNQDDQL_D is null");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDIsNotNull() {
            addCriterion("WNQDDQL_D is not null");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDEqualTo(String value) {
            addCriterion("WNQDDQL_D =", value, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDNotEqualTo(String value) {
            addCriterion("WNQDDQL_D <>", value, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDGreaterThan(String value) {
            addCriterion("WNQDDQL_D >", value, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDGreaterThanOrEqualTo(String value) {
            addCriterion("WNQDDQL_D >=", value, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDLessThan(String value) {
            addCriterion("WNQDDQL_D <", value, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDLessThanOrEqualTo(String value) {
            addCriterion("WNQDDQL_D <=", value, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDLike(String value) {
            addCriterion("WNQDDQL_D like", value, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDNotLike(String value) {
            addCriterion("WNQDDQL_D not like", value, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDIn(List<String> values) {
            addCriterion("WNQDDQL_D in", values, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDNotIn(List<String> values) {
            addCriterion("WNQDDQL_D not in", values, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDBetween(String value1, String value2) {
            addCriterion("WNQDDQL_D between", value1, value2, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDNotBetween(String value1, String value2) {
            addCriterion("WNQDDQL_D not between", value1, value2, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDIsNull() {
            addCriterion("HXXYLQCL_D is null");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDIsNotNull() {
            addCriterion("HXXYLQCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDEqualTo(String value) {
            addCriterion("HXXYLQCL_D =", value, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDNotEqualTo(String value) {
            addCriterion("HXXYLQCL_D <>", value, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDGreaterThan(String value) {
            addCriterion("HXXYLQCL_D >", value, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDGreaterThanOrEqualTo(String value) {
            addCriterion("HXXYLQCL_D >=", value, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDLessThan(String value) {
            addCriterion("HXXYLQCL_D <", value, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDLessThanOrEqualTo(String value) {
            addCriterion("HXXYLQCL_D <=", value, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDLike(String value) {
            addCriterion("HXXYLQCL_D like", value, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDNotLike(String value) {
            addCriterion("HXXYLQCL_D not like", value, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDIn(List<String> values) {
            addCriterion("HXXYLQCL_D in", values, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDNotIn(List<String> values) {
            addCriterion("HXXYLQCL_D not in", values, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDBetween(String value1, String value2) {
            addCriterion("HXXYLQCL_D between", value1, value2, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDNotBetween(String value1, String value2) {
            addCriterion("HXXYLQCL_D not between", value1, value2, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSIsNull() {
            addCriterion("HXXYLJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSIsNotNull() {
            addCriterion("HXXYLJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSEqualTo(String value) {
            addCriterion("HXXYLJKND_HK_S =", value, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSNotEqualTo(String value) {
            addCriterion("HXXYLJKND_HK_S <>", value, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSGreaterThan(String value) {
            addCriterion("HXXYLJKND_HK_S >", value, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("HXXYLJKND_HK_S >=", value, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSLessThan(String value) {
            addCriterion("HXXYLJKND_HK_S <", value, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSLessThanOrEqualTo(String value) {
            addCriterion("HXXYLJKND_HK_S <=", value, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSLike(String value) {
            addCriterion("HXXYLJKND_HK_S like", value, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSNotLike(String value) {
            addCriterion("HXXYLJKND_HK_S not like", value, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSIn(List<String> values) {
            addCriterion("HXXYLJKND_HK_S in", values, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSNotIn(List<String> values) {
            addCriterion("HXXYLJKND_HK_S not in", values, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSBetween(String value1, String value2) {
            addCriterion("HXXYLJKND_HK_S between", value1, value2, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSNotBetween(String value1, String value2) {
            addCriterion("HXXYLJKND_HK_S not between", value1, value2, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSIsNull() {
            addCriterion("HXXYLCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSIsNotNull() {
            addCriterion("HXXYLCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSEqualTo(String value) {
            addCriterion("HXXYLCKND_HK_S =", value, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSNotEqualTo(String value) {
            addCriterion("HXXYLCKND_HK_S <>", value, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSGreaterThan(String value) {
            addCriterion("HXXYLCKND_HK_S >", value, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("HXXYLCKND_HK_S >=", value, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSLessThan(String value) {
            addCriterion("HXXYLCKND_HK_S <", value, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSLessThanOrEqualTo(String value) {
            addCriterion("HXXYLCKND_HK_S <=", value, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSLike(String value) {
            addCriterion("HXXYLCKND_HK_S like", value, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSNotLike(String value) {
            addCriterion("HXXYLCKND_HK_S not like", value, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSIn(List<String> values) {
            addCriterion("HXXYLCKND_HK_S in", values, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSNotIn(List<String> values) {
            addCriterion("HXXYLCKND_HK_S not in", values, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSBetween(String value1, String value2) {
            addCriterion("HXXYLCKND_HK_S between", value1, value2, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSNotBetween(String value1, String value2) {
            addCriterion("HXXYLCKND_HK_S not between", value1, value2, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdqclDIsNull() {
            addCriterion("ADQCL_D is null");
            return (Criteria) this;
        }

        public Criteria andAdqclDIsNotNull() {
            addCriterion("ADQCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andAdqclDEqualTo(String value) {
            addCriterion("ADQCL_D =", value, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdqclDNotEqualTo(String value) {
            addCriterion("ADQCL_D <>", value, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdqclDGreaterThan(String value) {
            addCriterion("ADQCL_D >", value, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdqclDGreaterThanOrEqualTo(String value) {
            addCriterion("ADQCL_D >=", value, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdqclDLessThan(String value) {
            addCriterion("ADQCL_D <", value, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdqclDLessThanOrEqualTo(String value) {
            addCriterion("ADQCL_D <=", value, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdqclDLike(String value) {
            addCriterion("ADQCL_D like", value, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdqclDNotLike(String value) {
            addCriterion("ADQCL_D not like", value, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdqclDIn(List<String> values) {
            addCriterion("ADQCL_D in", values, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdqclDNotIn(List<String> values) {
            addCriterion("ADQCL_D not in", values, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdqclDBetween(String value1, String value2) {
            addCriterion("ADQCL_D between", value1, value2, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdqclDNotBetween(String value1, String value2) {
            addCriterion("ADQCL_D not between", value1, value2, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSIsNull() {
            addCriterion("ADJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSIsNotNull() {
            addCriterion("ADJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSEqualTo(String value) {
            addCriterion("ADJKND_HK_S =", value, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSNotEqualTo(String value) {
            addCriterion("ADJKND_HK_S <>", value, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSGreaterThan(String value) {
            addCriterion("ADJKND_HK_S >", value, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("ADJKND_HK_S >=", value, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSLessThan(String value) {
            addCriterion("ADJKND_HK_S <", value, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSLessThanOrEqualTo(String value) {
            addCriterion("ADJKND_HK_S <=", value, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSLike(String value) {
            addCriterion("ADJKND_HK_S like", value, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSNotLike(String value) {
            addCriterion("ADJKND_HK_S not like", value, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSIn(List<String> values) {
            addCriterion("ADJKND_HK_S in", values, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSNotIn(List<String> values) {
            addCriterion("ADJKND_HK_S not in", values, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSBetween(String value1, String value2) {
            addCriterion("ADJKND_HK_S between", value1, value2, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSNotBetween(String value1, String value2) {
            addCriterion("ADJKND_HK_S not between", value1, value2, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSIsNull() {
            addCriterion("ADCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSIsNotNull() {
            addCriterion("ADCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSEqualTo(String value) {
            addCriterion("ADCKND_HK_S =", value, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSNotEqualTo(String value) {
            addCriterion("ADCKND_HK_S <>", value, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSGreaterThan(String value) {
            addCriterion("ADCKND_HK_S >", value, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("ADCKND_HK_S >=", value, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSLessThan(String value) {
            addCriterion("ADCKND_HK_S <", value, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSLessThanOrEqualTo(String value) {
            addCriterion("ADCKND_HK_S <=", value, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSLike(String value) {
            addCriterion("ADCKND_HK_S like", value, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSNotLike(String value) {
            addCriterion("ADCKND_HK_S not like", value, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSIn(List<String> values) {
            addCriterion("ADCKND_HK_S in", values, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSNotIn(List<String> values) {
            addCriterion("ADCKND_HK_S not in", values, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSBetween(String value1, String value2) {
            addCriterion("ADCKND_HK_S between", value1, value2, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSNotBetween(String value1, String value2) {
            addCriterion("ADCKND_HK_S not between", value1, value2, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlqclDIsNull() {
            addCriterion("YLQCL_D is null");
            return (Criteria) this;
        }

        public Criteria andYlqclDIsNotNull() {
            addCriterion("YLQCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andYlqclDEqualTo(String value) {
            addCriterion("YLQCL_D =", value, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYlqclDNotEqualTo(String value) {
            addCriterion("YLQCL_D <>", value, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYlqclDGreaterThan(String value) {
            addCriterion("YLQCL_D >", value, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYlqclDGreaterThanOrEqualTo(String value) {
            addCriterion("YLQCL_D >=", value, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYlqclDLessThan(String value) {
            addCriterion("YLQCL_D <", value, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYlqclDLessThanOrEqualTo(String value) {
            addCriterion("YLQCL_D <=", value, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYlqclDLike(String value) {
            addCriterion("YLQCL_D like", value, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYlqclDNotLike(String value) {
            addCriterion("YLQCL_D not like", value, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYlqclDIn(List<String> values) {
            addCriterion("YLQCL_D in", values, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYlqclDNotIn(List<String> values) {
            addCriterion("YLQCL_D not in", values, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYlqclDBetween(String value1, String value2) {
            addCriterion("YLQCL_D between", value1, value2, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYlqclDNotBetween(String value1, String value2) {
            addCriterion("YLQCL_D not between", value1, value2, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSIsNull() {
            addCriterion("YLJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSIsNotNull() {
            addCriterion("YLJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSEqualTo(String value) {
            addCriterion("YLJKND_HK_S =", value, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSNotEqualTo(String value) {
            addCriterion("YLJKND_HK_S <>", value, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSGreaterThan(String value) {
            addCriterion("YLJKND_HK_S >", value, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("YLJKND_HK_S >=", value, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSLessThan(String value) {
            addCriterion("YLJKND_HK_S <", value, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSLessThanOrEqualTo(String value) {
            addCriterion("YLJKND_HK_S <=", value, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSLike(String value) {
            addCriterion("YLJKND_HK_S like", value, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSNotLike(String value) {
            addCriterion("YLJKND_HK_S not like", value, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSIn(List<String> values) {
            addCriterion("YLJKND_HK_S in", values, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSNotIn(List<String> values) {
            addCriterion("YLJKND_HK_S not in", values, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSBetween(String value1, String value2) {
            addCriterion("YLJKND_HK_S between", value1, value2, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSNotBetween(String value1, String value2) {
            addCriterion("YLJKND_HK_S not between", value1, value2, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSIsNull() {
            addCriterion("YLCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSIsNotNull() {
            addCriterion("YLCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSEqualTo(String value) {
            addCriterion("YLCKND_HK_S =", value, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSNotEqualTo(String value) {
            addCriterion("YLCKND_HK_S <>", value, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSGreaterThan(String value) {
            addCriterion("YLCKND_HK_S >", value, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("YLCKND_HK_S >=", value, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSLessThan(String value) {
            addCriterion("YLCKND_HK_S <", value, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSLessThanOrEqualTo(String value) {
            addCriterion("YLCKND_HK_S <=", value, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSLike(String value) {
            addCriterion("YLCKND_HK_S like", value, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSNotLike(String value) {
            addCriterion("YLCKND_HK_S not like", value, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSIn(List<String> values) {
            addCriterion("YLCKND_HK_S in", values, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSNotIn(List<String> values) {
            addCriterion("YLCKND_HK_S not in", values, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSBetween(String value1, String value2) {
            addCriterion("YLCKND_HK_S between", value1, value2, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSNotBetween(String value1, String value2) {
            addCriterion("YLCKND_HK_S not between", value1, value2, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdqclDIsNull() {
            addCriterion("ZDQCL_D is null");
            return (Criteria) this;
        }

        public Criteria andZdqclDIsNotNull() {
            addCriterion("ZDQCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andZdqclDEqualTo(String value) {
            addCriterion("ZDQCL_D =", value, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdqclDNotEqualTo(String value) {
            addCriterion("ZDQCL_D <>", value, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdqclDGreaterThan(String value) {
            addCriterion("ZDQCL_D >", value, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdqclDGreaterThanOrEqualTo(String value) {
            addCriterion("ZDQCL_D >=", value, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdqclDLessThan(String value) {
            addCriterion("ZDQCL_D <", value, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdqclDLessThanOrEqualTo(String value) {
            addCriterion("ZDQCL_D <=", value, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdqclDLike(String value) {
            addCriterion("ZDQCL_D like", value, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdqclDNotLike(String value) {
            addCriterion("ZDQCL_D not like", value, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdqclDIn(List<String> values) {
            addCriterion("ZDQCL_D in", values, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdqclDNotIn(List<String> values) {
            addCriterion("ZDQCL_D not in", values, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdqclDBetween(String value1, String value2) {
            addCriterion("ZDQCL_D between", value1, value2, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdqclDNotBetween(String value1, String value2) {
            addCriterion("ZDQCL_D not between", value1, value2, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSIsNull() {
            addCriterion("ZDJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSIsNotNull() {
            addCriterion("ZDJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSEqualTo(String value) {
            addCriterion("ZDJKND_HK_S =", value, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSNotEqualTo(String value) {
            addCriterion("ZDJKND_HK_S <>", value, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSGreaterThan(String value) {
            addCriterion("ZDJKND_HK_S >", value, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("ZDJKND_HK_S >=", value, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSLessThan(String value) {
            addCriterion("ZDJKND_HK_S <", value, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSLessThanOrEqualTo(String value) {
            addCriterion("ZDJKND_HK_S <=", value, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSLike(String value) {
            addCriterion("ZDJKND_HK_S like", value, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSNotLike(String value) {
            addCriterion("ZDJKND_HK_S not like", value, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSIn(List<String> values) {
            addCriterion("ZDJKND_HK_S in", values, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSNotIn(List<String> values) {
            addCriterion("ZDJKND_HK_S not in", values, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSBetween(String value1, String value2) {
            addCriterion("ZDJKND_HK_S between", value1, value2, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSNotBetween(String value1, String value2) {
            addCriterion("ZDJKND_HK_S not between", value1, value2, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSIsNull() {
            addCriterion("ZDCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSIsNotNull() {
            addCriterion("ZDCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSEqualTo(String value) {
            addCriterion("ZDCKND_HK_S =", value, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSNotEqualTo(String value) {
            addCriterion("ZDCKND_HK_S <>", value, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSGreaterThan(String value) {
            addCriterion("ZDCKND_HK_S >", value, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("ZDCKND_HK_S >=", value, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSLessThan(String value) {
            addCriterion("ZDCKND_HK_S <", value, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSLessThanOrEqualTo(String value) {
            addCriterion("ZDCKND_HK_S <=", value, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSLike(String value) {
            addCriterion("ZDCKND_HK_S like", value, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSNotLike(String value) {
            addCriterion("ZDCKND_HK_S not like", value, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSIn(List<String> values) {
            addCriterion("ZDCKND_HK_S in", values, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSNotIn(List<String> values) {
            addCriterion("ZDCKND_HK_S not in", values, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSBetween(String value1, String value2) {
            addCriterion("ZDCKND_HK_S between", value1, value2, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSNotBetween(String value1, String value2) {
            addCriterion("ZDCKND_HK_S not between", value1, value2, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlqclQkIsNull() {
            addCriterion("ZLQCL_QK is null");
            return (Criteria) this;
        }

        public Criteria andZlqclQkIsNotNull() {
            addCriterion("ZLQCL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andZlqclQkEqualTo(String value) {
            addCriterion("ZLQCL_QK =", value, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZlqclQkNotEqualTo(String value) {
            addCriterion("ZLQCL_QK <>", value, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZlqclQkGreaterThan(String value) {
            addCriterion("ZLQCL_QK >", value, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZlqclQkGreaterThanOrEqualTo(String value) {
            addCriterion("ZLQCL_QK >=", value, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZlqclQkLessThan(String value) {
            addCriterion("ZLQCL_QK <", value, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZlqclQkLessThanOrEqualTo(String value) {
            addCriterion("ZLQCL_QK <=", value, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZlqclQkLike(String value) {
            addCriterion("ZLQCL_QK like", value, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZlqclQkNotLike(String value) {
            addCriterion("ZLQCL_QK not like", value, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZlqclQkIn(List<String> values) {
            addCriterion("ZLQCL_QK in", values, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZlqclQkNotIn(List<String> values) {
            addCriterion("ZLQCL_QK not in", values, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZlqclQkBetween(String value1, String value2) {
            addCriterion("ZLQCL_QK between", value1, value2, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZlqclQkNotBetween(String value1, String value2) {
            addCriterion("ZLQCL_QK not between", value1, value2, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSIsNull() {
            addCriterion("ZLJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSIsNotNull() {
            addCriterion("ZLJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSEqualTo(String value) {
            addCriterion("ZLJKND_HK_S =", value, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSNotEqualTo(String value) {
            addCriterion("ZLJKND_HK_S <>", value, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSGreaterThan(String value) {
            addCriterion("ZLJKND_HK_S >", value, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("ZLJKND_HK_S >=", value, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSLessThan(String value) {
            addCriterion("ZLJKND_HK_S <", value, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSLessThanOrEqualTo(String value) {
            addCriterion("ZLJKND_HK_S <=", value, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSLike(String value) {
            addCriterion("ZLJKND_HK_S like", value, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSNotLike(String value) {
            addCriterion("ZLJKND_HK_S not like", value, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSIn(List<String> values) {
            addCriterion("ZLJKND_HK_S in", values, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSNotIn(List<String> values) {
            addCriterion("ZLJKND_HK_S not in", values, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSBetween(String value1, String value2) {
            addCriterion("ZLJKND_HK_S between", value1, value2, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSNotBetween(String value1, String value2) {
            addCriterion("ZLJKND_HK_S not between", value1, value2, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSIsNull() {
            addCriterion("ZLCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSIsNotNull() {
            addCriterion("ZLCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSEqualTo(String value) {
            addCriterion("ZLCKND_HK_S =", value, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSNotEqualTo(String value) {
            addCriterion("ZLCKND_HK_S <>", value, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSGreaterThan(String value) {
            addCriterion("ZLCKND_HK_S >", value, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("ZLCKND_HK_S >=", value, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSLessThan(String value) {
            addCriterion("ZLCKND_HK_S <", value, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSLessThanOrEqualTo(String value) {
            addCriterion("ZLCKND_HK_S <=", value, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSLike(String value) {
            addCriterion("ZLCKND_HK_S like", value, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSNotLike(String value) {
            addCriterion("ZLCKND_HK_S not like", value, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSIn(List<String> values) {
            addCriterion("ZLCKND_HK_S in", values, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSNotIn(List<String> values) {
            addCriterion("ZLCKND_HK_S not in", values, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSBetween(String value1, String value2) {
            addCriterion("ZLCKND_HK_S between", value1, value2, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSNotBetween(String value1, String value2) {
            addCriterion("ZLCKND_HK_S not between", value1, value2, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffqclQkIsNull() {
            addCriterion("HFFQCL_QK is null");
            return (Criteria) this;
        }

        public Criteria andHffqclQkIsNotNull() {
            addCriterion("HFFQCL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andHffqclQkEqualTo(String value) {
            addCriterion("HFFQCL_QK =", value, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffqclQkNotEqualTo(String value) {
            addCriterion("HFFQCL_QK <>", value, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffqclQkGreaterThan(String value) {
            addCriterion("HFFQCL_QK >", value, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffqclQkGreaterThanOrEqualTo(String value) {
            addCriterion("HFFQCL_QK >=", value, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffqclQkLessThan(String value) {
            addCriterion("HFFQCL_QK <", value, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffqclQkLessThanOrEqualTo(String value) {
            addCriterion("HFFQCL_QK <=", value, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffqclQkLike(String value) {
            addCriterion("HFFQCL_QK like", value, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffqclQkNotLike(String value) {
            addCriterion("HFFQCL_QK not like", value, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffqclQkIn(List<String> values) {
            addCriterion("HFFQCL_QK in", values, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffqclQkNotIn(List<String> values) {
            addCriterion("HFFQCL_QK not in", values, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffqclQkBetween(String value1, String value2) {
            addCriterion("HFFQCL_QK between", value1, value2, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffqclQkNotBetween(String value1, String value2) {
            addCriterion("HFFQCL_QK not between", value1, value2, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSIsNull() {
            addCriterion("HFFJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSIsNotNull() {
            addCriterion("HFFJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSEqualTo(String value) {
            addCriterion("HFFJKND_HK_S =", value, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSNotEqualTo(String value) {
            addCriterion("HFFJKND_HK_S <>", value, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSGreaterThan(String value) {
            addCriterion("HFFJKND_HK_S >", value, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("HFFJKND_HK_S >=", value, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSLessThan(String value) {
            addCriterion("HFFJKND_HK_S <", value, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSLessThanOrEqualTo(String value) {
            addCriterion("HFFJKND_HK_S <=", value, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSLike(String value) {
            addCriterion("HFFJKND_HK_S like", value, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSNotLike(String value) {
            addCriterion("HFFJKND_HK_S not like", value, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSIn(List<String> values) {
            addCriterion("HFFJKND_HK_S in", values, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSNotIn(List<String> values) {
            addCriterion("HFFJKND_HK_S not in", values, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSBetween(String value1, String value2) {
            addCriterion("HFFJKND_HK_S between", value1, value2, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSNotBetween(String value1, String value2) {
            addCriterion("HFFJKND_HK_S not between", value1, value2, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSIsNull() {
            addCriterion("HFFCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSIsNotNull() {
            addCriterion("HFFCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSEqualTo(String value) {
            addCriterion("HFFCKND_HK_S =", value, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSNotEqualTo(String value) {
            addCriterion("HFFCKND_HK_S <>", value, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSGreaterThan(String value) {
            addCriterion("HFFCKND_HK_S >", value, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("HFFCKND_HK_S >=", value, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSLessThan(String value) {
            addCriterion("HFFCKND_HK_S <", value, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSLessThanOrEqualTo(String value) {
            addCriterion("HFFCKND_HK_S <=", value, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSLike(String value) {
            addCriterion("HFFCKND_HK_S like", value, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSNotLike(String value) {
            addCriterion("HFFCKND_HK_S not like", value, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSIn(List<String> values) {
            addCriterion("HFFCKND_HK_S in", values, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSNotIn(List<String> values) {
            addCriterion("HFFCKND_HK_S not in", values, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSBetween(String value1, String value2) {
            addCriterion("HFFCKND_HK_S between", value1, value2, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSNotBetween(String value1, String value2) {
            addCriterion("HFFCKND_HK_S not between", value1, value2, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkIsNull() {
            addCriterion("QHWQCL_QK is null");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkIsNotNull() {
            addCriterion("QHWQCL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkEqualTo(String value) {
            addCriterion("QHWQCL_QK =", value, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkNotEqualTo(String value) {
            addCriterion("QHWQCL_QK <>", value, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkGreaterThan(String value) {
            addCriterion("QHWQCL_QK >", value, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkGreaterThanOrEqualTo(String value) {
            addCriterion("QHWQCL_QK >=", value, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkLessThan(String value) {
            addCriterion("QHWQCL_QK <", value, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkLessThanOrEqualTo(String value) {
            addCriterion("QHWQCL_QK <=", value, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkLike(String value) {
            addCriterion("QHWQCL_QK like", value, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkNotLike(String value) {
            addCriterion("QHWQCL_QK not like", value, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkIn(List<String> values) {
            addCriterion("QHWQCL_QK in", values, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkNotIn(List<String> values) {
            addCriterion("QHWQCL_QK not in", values, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkBetween(String value1, String value2) {
            addCriterion("QHWQCL_QK between", value1, value2, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkNotBetween(String value1, String value2) {
            addCriterion("QHWQCL_QK not between", value1, value2, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSIsNull() {
            addCriterion("QHWJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSIsNotNull() {
            addCriterion("QHWJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSEqualTo(String value) {
            addCriterion("QHWJKND_HK_S =", value, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSNotEqualTo(String value) {
            addCriterion("QHWJKND_HK_S <>", value, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSGreaterThan(String value) {
            addCriterion("QHWJKND_HK_S >", value, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("QHWJKND_HK_S >=", value, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSLessThan(String value) {
            addCriterion("QHWJKND_HK_S <", value, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSLessThanOrEqualTo(String value) {
            addCriterion("QHWJKND_HK_S <=", value, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSLike(String value) {
            addCriterion("QHWJKND_HK_S like", value, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSNotLike(String value) {
            addCriterion("QHWJKND_HK_S not like", value, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSIn(List<String> values) {
            addCriterion("QHWJKND_HK_S in", values, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSNotIn(List<String> values) {
            addCriterion("QHWJKND_HK_S not in", values, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSBetween(String value1, String value2) {
            addCriterion("QHWJKND_HK_S between", value1, value2, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSNotBetween(String value1, String value2) {
            addCriterion("QHWJKND_HK_S not between", value1, value2, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSIsNull() {
            addCriterion("QHWCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSIsNotNull() {
            addCriterion("QHWCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSEqualTo(String value) {
            addCriterion("QHWCKND_HK_S =", value, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSNotEqualTo(String value) {
            addCriterion("QHWCKND_HK_S <>", value, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSGreaterThan(String value) {
            addCriterion("QHWCKND_HK_S >", value, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("QHWCKND_HK_S >=", value, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSLessThan(String value) {
            addCriterion("QHWCKND_HK_S <", value, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSLessThanOrEqualTo(String value) {
            addCriterion("QHWCKND_HK_S <=", value, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSLike(String value) {
            addCriterion("QHWCKND_HK_S like", value, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSNotLike(String value) {
            addCriterion("QHWCKND_HK_S not like", value, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSIn(List<String> values) {
            addCriterion("QHWCKND_HK_S in", values, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSNotIn(List<String> values) {
            addCriterion("QHWCKND_HK_S not in", values, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSBetween(String value1, String value2) {
            addCriterion("QHWCKND_HK_S between", value1, value2, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSNotBetween(String value1, String value2) {
            addCriterion("QHWCKND_HK_S not between", value1, value2, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andSqclQkIsNull() {
            addCriterion("SQCL_QK is null");
            return (Criteria) this;
        }

        public Criteria andSqclQkIsNotNull() {
            addCriterion("SQCL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andSqclQkEqualTo(String value) {
            addCriterion("SQCL_QK =", value, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSqclQkNotEqualTo(String value) {
            addCriterion("SQCL_QK <>", value, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSqclQkGreaterThan(String value) {
            addCriterion("SQCL_QK >", value, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSqclQkGreaterThanOrEqualTo(String value) {
            addCriterion("SQCL_QK >=", value, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSqclQkLessThan(String value) {
            addCriterion("SQCL_QK <", value, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSqclQkLessThanOrEqualTo(String value) {
            addCriterion("SQCL_QK <=", value, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSqclQkLike(String value) {
            addCriterion("SQCL_QK like", value, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSqclQkNotLike(String value) {
            addCriterion("SQCL_QK not like", value, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSqclQkIn(List<String> values) {
            addCriterion("SQCL_QK in", values, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSqclQkNotIn(List<String> values) {
            addCriterion("SQCL_QK not in", values, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSqclQkBetween(String value1, String value2) {
            addCriterion("SQCL_QK between", value1, value2, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSqclQkNotBetween(String value1, String value2) {
            addCriterion("SQCL_QK not between", value1, value2, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSIsNull() {
            addCriterion("SJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSIsNotNull() {
            addCriterion("SJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSEqualTo(String value) {
            addCriterion("SJKND_HK_S =", value, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSNotEqualTo(String value) {
            addCriterion("SJKND_HK_S <>", value, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSGreaterThan(String value) {
            addCriterion("SJKND_HK_S >", value, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("SJKND_HK_S >=", value, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSLessThan(String value) {
            addCriterion("SJKND_HK_S <", value, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSLessThanOrEqualTo(String value) {
            addCriterion("SJKND_HK_S <=", value, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSLike(String value) {
            addCriterion("SJKND_HK_S like", value, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSNotLike(String value) {
            addCriterion("SJKND_HK_S not like", value, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSIn(List<String> values) {
            addCriterion("SJKND_HK_S in", values, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSNotIn(List<String> values) {
            addCriterion("SJKND_HK_S not in", values, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSBetween(String value1, String value2) {
            addCriterion("SJKND_HK_S between", value1, value2, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSNotBetween(String value1, String value2) {
            addCriterion("SJKND_HK_S not between", value1, value2, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSIsNull() {
            addCriterion("SCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andSckndHkSIsNotNull() {
            addCriterion("SCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andSckndHkSEqualTo(String value) {
            addCriterion("SCKND_HK_S =", value, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSNotEqualTo(String value) {
            addCriterion("SCKND_HK_S <>", value, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSGreaterThan(String value) {
            addCriterion("SCKND_HK_S >", value, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("SCKND_HK_S >=", value, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSLessThan(String value) {
            addCriterion("SCKND_HK_S <", value, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSLessThanOrEqualTo(String value) {
            addCriterion("SCKND_HK_S <=", value, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSLike(String value) {
            addCriterion("SCKND_HK_S like", value, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSNotLike(String value) {
            addCriterion("SCKND_HK_S not like", value, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSIn(List<String> values) {
            addCriterion("SCKND_HK_S in", values, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSNotIn(List<String> values) {
            addCriterion("SCKND_HK_S not in", values, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSBetween(String value1, String value2) {
            addCriterion("SCKND_HK_S between", value1, value2, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSNotBetween(String value1, String value2) {
            addCriterion("SCKND_HK_S not between", value1, value2, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andQqclQkIsNull() {
            addCriterion("QQCL_QK is null");
            return (Criteria) this;
        }

        public Criteria andQqclQkIsNotNull() {
            addCriterion("QQCL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andQqclQkEqualTo(String value) {
            addCriterion("QQCL_QK =", value, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQqclQkNotEqualTo(String value) {
            addCriterion("QQCL_QK <>", value, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQqclQkGreaterThan(String value) {
            addCriterion("QQCL_QK >", value, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQqclQkGreaterThanOrEqualTo(String value) {
            addCriterion("QQCL_QK >=", value, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQqclQkLessThan(String value) {
            addCriterion("QQCL_QK <", value, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQqclQkLessThanOrEqualTo(String value) {
            addCriterion("QQCL_QK <=", value, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQqclQkLike(String value) {
            addCriterion("QQCL_QK like", value, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQqclQkNotLike(String value) {
            addCriterion("QQCL_QK not like", value, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQqclQkIn(List<String> values) {
            addCriterion("QQCL_QK in", values, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQqclQkNotIn(List<String> values) {
            addCriterion("QQCL_QK not in", values, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQqclQkBetween(String value1, String value2) {
            addCriterion("QQCL_QK between", value1, value2, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQqclQkNotBetween(String value1, String value2) {
            addCriterion("QQCL_QK not between", value1, value2, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSIsNull() {
            addCriterion("QJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSIsNotNull() {
            addCriterion("QJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSEqualTo(String value) {
            addCriterion("QJKND_HK_S =", value, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSNotEqualTo(String value) {
            addCriterion("QJKND_HK_S <>", value, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSGreaterThan(String value) {
            addCriterion("QJKND_HK_S >", value, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("QJKND_HK_S >=", value, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSLessThan(String value) {
            addCriterion("QJKND_HK_S <", value, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSLessThanOrEqualTo(String value) {
            addCriterion("QJKND_HK_S <=", value, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSLike(String value) {
            addCriterion("QJKND_HK_S like", value, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSNotLike(String value) {
            addCriterion("QJKND_HK_S not like", value, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSIn(List<String> values) {
            addCriterion("QJKND_HK_S in", values, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSNotIn(List<String> values) {
            addCriterion("QJKND_HK_S not in", values, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSBetween(String value1, String value2) {
            addCriterion("QJKND_HK_S between", value1, value2, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSNotBetween(String value1, String value2) {
            addCriterion("QJKND_HK_S not between", value1, value2, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSIsNull() {
            addCriterion("QCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andQckndHkSIsNotNull() {
            addCriterion("QCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andQckndHkSEqualTo(String value) {
            addCriterion("QCKND_HK_S =", value, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSNotEqualTo(String value) {
            addCriterion("QCKND_HK_S <>", value, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSGreaterThan(String value) {
            addCriterion("QCKND_HK_S >", value, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("QCKND_HK_S >=", value, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSLessThan(String value) {
            addCriterion("QCKND_HK_S <", value, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSLessThanOrEqualTo(String value) {
            addCriterion("QCKND_HK_S <=", value, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSLike(String value) {
            addCriterion("QCKND_HK_S like", value, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSNotLike(String value) {
            addCriterion("QCKND_HK_S not like", value, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSIn(List<String> values) {
            addCriterion("QCKND_HK_S in", values, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSNotIn(List<String> values) {
            addCriterion("QCKND_HK_S not in", values, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSBetween(String value1, String value2) {
            addCriterion("QCKND_HK_S between", value1, value2, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSNotBetween(String value1, String value2) {
            addCriterion("QCKND_HK_S not between", value1, value2, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andGqclQkIsNull() {
            addCriterion("GQCL_QK is null");
            return (Criteria) this;
        }

        public Criteria andGqclQkIsNotNull() {
            addCriterion("GQCL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andGqclQkEqualTo(String value) {
            addCriterion("GQCL_QK =", value, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGqclQkNotEqualTo(String value) {
            addCriterion("GQCL_QK <>", value, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGqclQkGreaterThan(String value) {
            addCriterion("GQCL_QK >", value, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGqclQkGreaterThanOrEqualTo(String value) {
            addCriterion("GQCL_QK >=", value, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGqclQkLessThan(String value) {
            addCriterion("GQCL_QK <", value, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGqclQkLessThanOrEqualTo(String value) {
            addCriterion("GQCL_QK <=", value, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGqclQkLike(String value) {
            addCriterion("GQCL_QK like", value, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGqclQkNotLike(String value) {
            addCriterion("GQCL_QK not like", value, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGqclQkIn(List<String> values) {
            addCriterion("GQCL_QK in", values, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGqclQkNotIn(List<String> values) {
            addCriterion("GQCL_QK not in", values, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGqclQkBetween(String value1, String value2) {
            addCriterion("GQCL_QK between", value1, value2, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGqclQkNotBetween(String value1, String value2) {
            addCriterion("GQCL_QK not between", value1, value2, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSIsNull() {
            addCriterion("GJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSIsNotNull() {
            addCriterion("GJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSEqualTo(String value) {
            addCriterion("GJKND_HK_S =", value, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSNotEqualTo(String value) {
            addCriterion("GJKND_HK_S <>", value, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSGreaterThan(String value) {
            addCriterion("GJKND_HK_S >", value, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("GJKND_HK_S >=", value, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSLessThan(String value) {
            addCriterion("GJKND_HK_S <", value, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSLessThanOrEqualTo(String value) {
            addCriterion("GJKND_HK_S <=", value, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSLike(String value) {
            addCriterion("GJKND_HK_S like", value, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSNotLike(String value) {
            addCriterion("GJKND_HK_S not like", value, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSIn(List<String> values) {
            addCriterion("GJKND_HK_S in", values, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSNotIn(List<String> values) {
            addCriterion("GJKND_HK_S not in", values, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSBetween(String value1, String value2) {
            addCriterion("GJKND_HK_S between", value1, value2, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSNotBetween(String value1, String value2) {
            addCriterion("GJKND_HK_S not between", value1, value2, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSIsNull() {
            addCriterion("GCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andGckndHkSIsNotNull() {
            addCriterion("GCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andGckndHkSEqualTo(String value) {
            addCriterion("GCKND_HK_S =", value, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSNotEqualTo(String value) {
            addCriterion("GCKND_HK_S <>", value, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSGreaterThan(String value) {
            addCriterion("GCKND_HK_S >", value, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("GCKND_HK_S >=", value, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSLessThan(String value) {
            addCriterion("GCKND_HK_S <", value, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSLessThanOrEqualTo(String value) {
            addCriterion("GCKND_HK_S <=", value, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSLike(String value) {
            addCriterion("GCKND_HK_S like", value, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSNotLike(String value) {
            addCriterion("GCKND_HK_S not like", value, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSIn(List<String> values) {
            addCriterion("GCKND_HK_S in", values, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSNotIn(List<String> values) {
            addCriterion("GCKND_HK_S not in", values, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSBetween(String value1, String value2) {
            addCriterion("GCKND_HK_S between", value1, value2, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSNotBetween(String value1, String value2) {
            addCriterion("GCKND_HK_S not between", value1, value2, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1IsNull() {
            addCriterion("GQCL_QK_dup1 is null");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1IsNotNull() {
            addCriterion("GQCL_QK_dup1 is not null");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1EqualTo(String value) {
            addCriterion("GQCL_QK_dup1 =", value, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1NotEqualTo(String value) {
            addCriterion("GQCL_QK_dup1 <>", value, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1GreaterThan(String value) {
            addCriterion("GQCL_QK_dup1 >", value, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1GreaterThanOrEqualTo(String value) {
            addCriterion("GQCL_QK_dup1 >=", value, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1LessThan(String value) {
            addCriterion("GQCL_QK_dup1 <", value, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1LessThanOrEqualTo(String value) {
            addCriterion("GQCL_QK_dup1 <=", value, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1Like(String value) {
            addCriterion("GQCL_QK_dup1 like", value, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1NotLike(String value) {
            addCriterion("GQCL_QK_dup1 not like", value, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1In(List<String> values) {
            addCriterion("GQCL_QK_dup1 in", values, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1NotIn(List<String> values) {
            addCriterion("GQCL_QK_dup1 not in", values, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1Between(String value1, String value2) {
            addCriterion("GQCL_QK_dup1 between", value1, value2, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1NotBetween(String value1, String value2) {
            addCriterion("GQCL_QK_dup1 not between", value1, value2, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSIsNull() {
            addCriterion("GJKND_WK_S is null");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSIsNotNull() {
            addCriterion("GJKND_WK_S is not null");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSEqualTo(String value) {
            addCriterion("GJKND_WK_S =", value, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSNotEqualTo(String value) {
            addCriterion("GJKND_WK_S <>", value, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSGreaterThan(String value) {
            addCriterion("GJKND_WK_S >", value, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSGreaterThanOrEqualTo(String value) {
            addCriterion("GJKND_WK_S >=", value, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSLessThan(String value) {
            addCriterion("GJKND_WK_S <", value, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSLessThanOrEqualTo(String value) {
            addCriterion("GJKND_WK_S <=", value, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSLike(String value) {
            addCriterion("GJKND_WK_S like", value, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSNotLike(String value) {
            addCriterion("GJKND_WK_S not like", value, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSIn(List<String> values) {
            addCriterion("GJKND_WK_S in", values, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSNotIn(List<String> values) {
            addCriterion("GJKND_WK_S not in", values, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSBetween(String value1, String value2) {
            addCriterion("GJKND_WK_S between", value1, value2, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSNotBetween(String value1, String value2) {
            addCriterion("GJKND_WK_S not between", value1, value2, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSIsNull() {
            addCriterion("GCKND_WK_S is null");
            return (Criteria) this;
        }

        public Criteria andGckndWkSIsNotNull() {
            addCriterion("GCKND_WK_S is not null");
            return (Criteria) this;
        }

        public Criteria andGckndWkSEqualTo(String value) {
            addCriterion("GCKND_WK_S =", value, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSNotEqualTo(String value) {
            addCriterion("GCKND_WK_S <>", value, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSGreaterThan(String value) {
            addCriterion("GCKND_WK_S >", value, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSGreaterThanOrEqualTo(String value) {
            addCriterion("GCKND_WK_S >=", value, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSLessThan(String value) {
            addCriterion("GCKND_WK_S <", value, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSLessThanOrEqualTo(String value) {
            addCriterion("GCKND_WK_S <=", value, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSLike(String value) {
            addCriterion("GCKND_WK_S like", value, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSNotLike(String value) {
            addCriterion("GCKND_WK_S not like", value, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSIn(List<String> values) {
            addCriterion("GCKND_WK_S in", values, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSNotIn(List<String> values) {
            addCriterion("GCKND_WK_S not in", values, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSBetween(String value1, String value2) {
            addCriterion("GCKND_WK_S between", value1, value2, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSNotBetween(String value1, String value2) {
            addCriterion("GCKND_WK_S not between", value1, value2, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andZgqclQkIsNull() {
            addCriterion("ZGQCL_QK is null");
            return (Criteria) this;
        }

        public Criteria andZgqclQkIsNotNull() {
            addCriterion("ZGQCL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andZgqclQkEqualTo(String value) {
            addCriterion("ZGQCL_QK =", value, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgqclQkNotEqualTo(String value) {
            addCriterion("ZGQCL_QK <>", value, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgqclQkGreaterThan(String value) {
            addCriterion("ZGQCL_QK >", value, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgqclQkGreaterThanOrEqualTo(String value) {
            addCriterion("ZGQCL_QK >=", value, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgqclQkLessThan(String value) {
            addCriterion("ZGQCL_QK <", value, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgqclQkLessThanOrEqualTo(String value) {
            addCriterion("ZGQCL_QK <=", value, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgqclQkLike(String value) {
            addCriterion("ZGQCL_QK like", value, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgqclQkNotLike(String value) {
            addCriterion("ZGQCL_QK not like", value, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgqclQkIn(List<String> values) {
            addCriterion("ZGQCL_QK in", values, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgqclQkNotIn(List<String> values) {
            addCriterion("ZGQCL_QK not in", values, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgqclQkBetween(String value1, String value2) {
            addCriterion("ZGQCL_QK between", value1, value2, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgqclQkNotBetween(String value1, String value2) {
            addCriterion("ZGQCL_QK not between", value1, value2, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSIsNull() {
            addCriterion("ZGJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSIsNotNull() {
            addCriterion("ZGJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSEqualTo(String value) {
            addCriterion("ZGJKND_HK_S =", value, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSNotEqualTo(String value) {
            addCriterion("ZGJKND_HK_S <>", value, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSGreaterThan(String value) {
            addCriterion("ZGJKND_HK_S >", value, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("ZGJKND_HK_S >=", value, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSLessThan(String value) {
            addCriterion("ZGJKND_HK_S <", value, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSLessThanOrEqualTo(String value) {
            addCriterion("ZGJKND_HK_S <=", value, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSLike(String value) {
            addCriterion("ZGJKND_HK_S like", value, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSNotLike(String value) {
            addCriterion("ZGJKND_HK_S not like", value, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSIn(List<String> values) {
            addCriterion("ZGJKND_HK_S in", values, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSNotIn(List<String> values) {
            addCriterion("ZGJKND_HK_S not in", values, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSBetween(String value1, String value2) {
            addCriterion("ZGJKND_HK_S between", value1, value2, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSNotBetween(String value1, String value2) {
            addCriterion("ZGJKND_HK_S not between", value1, value2, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSIsNull() {
            addCriterion("ZGCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSIsNotNull() {
            addCriterion("ZGCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSEqualTo(String value) {
            addCriterion("ZGCKND_HK_S =", value, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSNotEqualTo(String value) {
            addCriterion("ZGCKND_HK_S <>", value, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSGreaterThan(String value) {
            addCriterion("ZGCKND_HK_S >", value, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("ZGCKND_HK_S >=", value, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSLessThan(String value) {
            addCriterion("ZGCKND_HK_S <", value, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSLessThanOrEqualTo(String value) {
            addCriterion("ZGCKND_HK_S <=", value, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSLike(String value) {
            addCriterion("ZGCKND_HK_S like", value, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSNotLike(String value) {
            addCriterion("ZGCKND_HK_S not like", value, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSIn(List<String> values) {
            addCriterion("ZGCKND_HK_S in", values, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSNotIn(List<String> values) {
            addCriterion("ZGCKND_HK_S not in", values, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSBetween(String value1, String value2) {
            addCriterion("ZGCKND_HK_S between", value1, value2, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSNotBetween(String value1, String value2) {
            addCriterion("ZGCKND_HK_S not between", value1, value2, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkIsNull() {
            addCriterion("LJGQCL_QK is null");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkIsNotNull() {
            addCriterion("LJGQCL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkEqualTo(String value) {
            addCriterion("LJGQCL_QK =", value, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkNotEqualTo(String value) {
            addCriterion("LJGQCL_QK <>", value, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkGreaterThan(String value) {
            addCriterion("LJGQCL_QK >", value, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkGreaterThanOrEqualTo(String value) {
            addCriterion("LJGQCL_QK >=", value, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkLessThan(String value) {
            addCriterion("LJGQCL_QK <", value, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkLessThanOrEqualTo(String value) {
            addCriterion("LJGQCL_QK <=", value, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkLike(String value) {
            addCriterion("LJGQCL_QK like", value, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkNotLike(String value) {
            addCriterion("LJGQCL_QK not like", value, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkIn(List<String> values) {
            addCriterion("LJGQCL_QK in", values, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkNotIn(List<String> values) {
            addCriterion("LJGQCL_QK not in", values, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkBetween(String value1, String value2) {
            addCriterion("LJGQCL_QK between", value1, value2, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkNotBetween(String value1, String value2) {
            addCriterion("LJGQCL_QK not between", value1, value2, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSIsNull() {
            addCriterion("LJGJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSIsNotNull() {
            addCriterion("LJGJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSEqualTo(String value) {
            addCriterion("LJGJKND_HK_S =", value, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSNotEqualTo(String value) {
            addCriterion("LJGJKND_HK_S <>", value, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSGreaterThan(String value) {
            addCriterion("LJGJKND_HK_S >", value, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("LJGJKND_HK_S >=", value, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSLessThan(String value) {
            addCriterion("LJGJKND_HK_S <", value, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSLessThanOrEqualTo(String value) {
            addCriterion("LJGJKND_HK_S <=", value, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSLike(String value) {
            addCriterion("LJGJKND_HK_S like", value, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSNotLike(String value) {
            addCriterion("LJGJKND_HK_S not like", value, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSIn(List<String> values) {
            addCriterion("LJGJKND_HK_S in", values, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSNotIn(List<String> values) {
            addCriterion("LJGJKND_HK_S not in", values, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSBetween(String value1, String value2) {
            addCriterion("LJGJKND_HK_S between", value1, value2, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSNotBetween(String value1, String value2) {
            addCriterion("LJGJKND_HK_S not between", value1, value2, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSIsNull() {
            addCriterion("LJGCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSIsNotNull() {
            addCriterion("LJGCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSEqualTo(String value) {
            addCriterion("LJGCKND_HK_S =", value, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSNotEqualTo(String value) {
            addCriterion("LJGCKND_HK_S <>", value, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSGreaterThan(String value) {
            addCriterion("LJGCKND_HK_S >", value, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("LJGCKND_HK_S >=", value, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSLessThan(String value) {
            addCriterion("LJGCKND_HK_S <", value, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSLessThanOrEqualTo(String value) {
            addCriterion("LJGCKND_HK_S <=", value, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSLike(String value) {
            addCriterion("LJGCKND_HK_S like", value, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSNotLike(String value) {
            addCriterion("LJGCKND_HK_S not like", value, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSIn(List<String> values) {
            addCriterion("LJGCKND_HK_S in", values, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSNotIn(List<String> values) {
            addCriterion("LJGCKND_HK_S not in", values, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSBetween(String value1, String value2) {
            addCriterion("LJGCKND_HK_S between", value1, value2, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSNotBetween(String value1, String value2) {
            addCriterion("LJGCKND_HK_S not between", value1, value2, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRIsNull() {
            addCriterion("GY_CLSL_WD_R is null");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRIsNotNull() {
            addCriterion("GY_CLSL_WD_R is not null");
            return (Criteria) this;
        }

        public Criteria andGyClslWdREqualTo(String value) {
            addCriterion("GY_CLSL_WD_R =", value, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRNotEqualTo(String value) {
            addCriterion("GY_CLSL_WD_R <>", value, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRGreaterThan(String value) {
            addCriterion("GY_CLSL_WD_R >", value, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRGreaterThanOrEqualTo(String value) {
            addCriterion("GY_CLSL_WD_R >=", value, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRLessThan(String value) {
            addCriterion("GY_CLSL_WD_R <", value, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRLessThanOrEqualTo(String value) {
            addCriterion("GY_CLSL_WD_R <=", value, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRLike(String value) {
            addCriterion("GY_CLSL_WD_R like", value, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRNotLike(String value) {
            addCriterion("GY_CLSL_WD_R not like", value, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRIn(List<String> values) {
            addCriterion("GY_CLSL_WD_R in", values, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRNotIn(List<String> values) {
            addCriterion("GY_CLSL_WD_R not in", values, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRBetween(String value1, String value2) {
            addCriterion("GY_CLSL_WD_R between", value1, value2, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRNotBetween(String value1, String value2) {
            addCriterion("GY_CLSL_WD_R not between", value1, value2, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRIsNull() {
            addCriterion("GY_XZCLSL_WD_R is null");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRIsNotNull() {
            addCriterion("GY_XZCLSL_WD_R is not null");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdREqualTo(String value) {
            addCriterion("GY_XZCLSL_WD_R =", value, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRNotEqualTo(String value) {
            addCriterion("GY_XZCLSL_WD_R <>", value, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRGreaterThan(String value) {
            addCriterion("GY_XZCLSL_WD_R >", value, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRGreaterThanOrEqualTo(String value) {
            addCriterion("GY_XZCLSL_WD_R >=", value, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRLessThan(String value) {
            addCriterion("GY_XZCLSL_WD_R <", value, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRLessThanOrEqualTo(String value) {
            addCriterion("GY_XZCLSL_WD_R <=", value, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRLike(String value) {
            addCriterion("GY_XZCLSL_WD_R like", value, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRNotLike(String value) {
            addCriterion("GY_XZCLSL_WD_R not like", value, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRIn(List<String> values) {
            addCriterion("GY_XZCLSL_WD_R in", values, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRNotIn(List<String> values) {
            addCriterion("GY_XZCLSL_WD_R not in", values, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRBetween(String value1, String value2) {
            addCriterion("GY_XZCLSL_WD_R between", value1, value2, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRNotBetween(String value1, String value2) {
            addCriterion("GY_XZCLSL_WD_R not between", value1, value2, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTIsNull() {
            addCriterion("GY_YXTS_T is null");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTIsNotNull() {
            addCriterion("GY_YXTS_T is not null");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTEqualTo(String value) {
            addCriterion("GY_YXTS_T =", value, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTNotEqualTo(String value) {
            addCriterion("GY_YXTS_T <>", value, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTGreaterThan(String value) {
            addCriterion("GY_YXTS_T >", value, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTGreaterThanOrEqualTo(String value) {
            addCriterion("GY_YXTS_T >=", value, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTLessThan(String value) {
            addCriterion("GY_YXTS_T <", value, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTLessThanOrEqualTo(String value) {
            addCriterion("GY_YXTS_T <=", value, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTLike(String value) {
            addCriterion("GY_YXTS_T like", value, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTNotLike(String value) {
            addCriterion("GY_YXTS_T not like", value, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTIn(List<String> values) {
            addCriterion("GY_YXTS_T in", values, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTNotIn(List<String> values) {
            addCriterion("GY_YXTS_T not in", values, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTBetween(String value1, String value2) {
            addCriterion("GY_YXTS_T between", value1, value2, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTNotBetween(String value1, String value2) {
            addCriterion("GY_YXTS_T not between", value1, value2, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSIsNull() {
            addCriterion("GY_CODJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSIsNotNull() {
            addCriterion("GY_CODJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSEqualTo(String value) {
            addCriterion("GY_CODJKND_HK_S =", value, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSNotEqualTo(String value) {
            addCriterion("GY_CODJKND_HK_S <>", value, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSGreaterThan(String value) {
            addCriterion("GY_CODJKND_HK_S >", value, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("GY_CODJKND_HK_S >=", value, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSLessThan(String value) {
            addCriterion("GY_CODJKND_HK_S <", value, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSLessThanOrEqualTo(String value) {
            addCriterion("GY_CODJKND_HK_S <=", value, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSLike(String value) {
            addCriterion("GY_CODJKND_HK_S like", value, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSNotLike(String value) {
            addCriterion("GY_CODJKND_HK_S not like", value, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSIn(List<String> values) {
            addCriterion("GY_CODJKND_HK_S in", values, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSNotIn(List<String> values) {
            addCriterion("GY_CODJKND_HK_S not in", values, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSBetween(String value1, String value2) {
            addCriterion("GY_CODJKND_HK_S between", value1, value2, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSNotBetween(String value1, String value2) {
            addCriterion("GY_CODJKND_HK_S not between", value1, value2, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSIsNull() {
            addCriterion("GY_CODCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSIsNotNull() {
            addCriterion("GY_CODCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSEqualTo(String value) {
            addCriterion("GY_CODCKND_HK_S =", value, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSNotEqualTo(String value) {
            addCriterion("GY_CODCKND_HK_S <>", value, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSGreaterThan(String value) {
            addCriterion("GY_CODCKND_HK_S >", value, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("GY_CODCKND_HK_S >=", value, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSLessThan(String value) {
            addCriterion("GY_CODCKND_HK_S <", value, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSLessThanOrEqualTo(String value) {
            addCriterion("GY_CODCKND_HK_S <=", value, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSLike(String value) {
            addCriterion("GY_CODCKND_HK_S like", value, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSNotLike(String value) {
            addCriterion("GY_CODCKND_HK_S not like", value, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSIn(List<String> values) {
            addCriterion("GY_CODCKND_HK_S in", values, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSNotIn(List<String> values) {
            addCriterion("GY_CODCKND_HK_S not in", values, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSBetween(String value1, String value2) {
            addCriterion("GY_CODCKND_HK_S between", value1, value2, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSNotBetween(String value1, String value2) {
            addCriterion("GY_CODCKND_HK_S not between", value1, value2, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSIsNull() {
            addCriterion("GY_ADJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSIsNotNull() {
            addCriterion("GY_ADJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSEqualTo(String value) {
            addCriterion("GY_ADJKND_HK_S =", value, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSNotEqualTo(String value) {
            addCriterion("GY_ADJKND_HK_S <>", value, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSGreaterThan(String value) {
            addCriterion("GY_ADJKND_HK_S >", value, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("GY_ADJKND_HK_S >=", value, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSLessThan(String value) {
            addCriterion("GY_ADJKND_HK_S <", value, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSLessThanOrEqualTo(String value) {
            addCriterion("GY_ADJKND_HK_S <=", value, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSLike(String value) {
            addCriterion("GY_ADJKND_HK_S like", value, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSNotLike(String value) {
            addCriterion("GY_ADJKND_HK_S not like", value, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSIn(List<String> values) {
            addCriterion("GY_ADJKND_HK_S in", values, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSNotIn(List<String> values) {
            addCriterion("GY_ADJKND_HK_S not in", values, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSBetween(String value1, String value2) {
            addCriterion("GY_ADJKND_HK_S between", value1, value2, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSNotBetween(String value1, String value2) {
            addCriterion("GY_ADJKND_HK_S not between", value1, value2, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSIsNull() {
            addCriterion("GY_ADCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSIsNotNull() {
            addCriterion("GY_ADCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSEqualTo(String value) {
            addCriterion("GY_ADCKND_HK_S =", value, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSNotEqualTo(String value) {
            addCriterion("GY_ADCKND_HK_S <>", value, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSGreaterThan(String value) {
            addCriterion("GY_ADCKND_HK_S >", value, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("GY_ADCKND_HK_S >=", value, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSLessThan(String value) {
            addCriterion("GY_ADCKND_HK_S <", value, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSLessThanOrEqualTo(String value) {
            addCriterion("GY_ADCKND_HK_S <=", value, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSLike(String value) {
            addCriterion("GY_ADCKND_HK_S like", value, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSNotLike(String value) {
            addCriterion("GY_ADCKND_HK_S not like", value, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSIn(List<String> values) {
            addCriterion("GY_ADCKND_HK_S in", values, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSNotIn(List<String> values) {
            addCriterion("GY_ADCKND_HK_S not in", values, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSBetween(String value1, String value2) {
            addCriterion("GY_ADCKND_HK_S between", value1, value2, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSNotBetween(String value1, String value2) {
            addCriterion("GY_ADCKND_HK_S not between", value1, value2, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShClslWdRIsNull() {
            addCriterion("SH_CLSL_WD_R is null");
            return (Criteria) this;
        }

        public Criteria andShClslWdRIsNotNull() {
            addCriterion("SH_CLSL_WD_R is not null");
            return (Criteria) this;
        }

        public Criteria andShClslWdREqualTo(String value) {
            addCriterion("SH_CLSL_WD_R =", value, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShClslWdRNotEqualTo(String value) {
            addCriterion("SH_CLSL_WD_R <>", value, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShClslWdRGreaterThan(String value) {
            addCriterion("SH_CLSL_WD_R >", value, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShClslWdRGreaterThanOrEqualTo(String value) {
            addCriterion("SH_CLSL_WD_R >=", value, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShClslWdRLessThan(String value) {
            addCriterion("SH_CLSL_WD_R <", value, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShClslWdRLessThanOrEqualTo(String value) {
            addCriterion("SH_CLSL_WD_R <=", value, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShClslWdRLike(String value) {
            addCriterion("SH_CLSL_WD_R like", value, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShClslWdRNotLike(String value) {
            addCriterion("SH_CLSL_WD_R not like", value, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShClslWdRIn(List<String> values) {
            addCriterion("SH_CLSL_WD_R in", values, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShClslWdRNotIn(List<String> values) {
            addCriterion("SH_CLSL_WD_R not in", values, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShClslWdRBetween(String value1, String value2) {
            addCriterion("SH_CLSL_WD_R between", value1, value2, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShClslWdRNotBetween(String value1, String value2) {
            addCriterion("SH_CLSL_WD_R not between", value1, value2, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRIsNull() {
            addCriterion("SH_XZCLSL_WD_R is null");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRIsNotNull() {
            addCriterion("SH_XZCLSL_WD_R is not null");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdREqualTo(String value) {
            addCriterion("SH_XZCLSL_WD_R =", value, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRNotEqualTo(String value) {
            addCriterion("SH_XZCLSL_WD_R <>", value, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRGreaterThan(String value) {
            addCriterion("SH_XZCLSL_WD_R >", value, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRGreaterThanOrEqualTo(String value) {
            addCriterion("SH_XZCLSL_WD_R >=", value, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRLessThan(String value) {
            addCriterion("SH_XZCLSL_WD_R <", value, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRLessThanOrEqualTo(String value) {
            addCriterion("SH_XZCLSL_WD_R <=", value, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRLike(String value) {
            addCriterion("SH_XZCLSL_WD_R like", value, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRNotLike(String value) {
            addCriterion("SH_XZCLSL_WD_R not like", value, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRIn(List<String> values) {
            addCriterion("SH_XZCLSL_WD_R in", values, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRNotIn(List<String> values) {
            addCriterion("SH_XZCLSL_WD_R not in", values, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRBetween(String value1, String value2) {
            addCriterion("SH_XZCLSL_WD_R between", value1, value2, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRNotBetween(String value1, String value2) {
            addCriterion("SH_XZCLSL_WD_R not between", value1, value2, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSIsNull() {
            addCriterion("SH_CODJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSIsNotNull() {
            addCriterion("SH_CODJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSEqualTo(String value) {
            addCriterion("SH_CODJKND_HK_S =", value, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSNotEqualTo(String value) {
            addCriterion("SH_CODJKND_HK_S <>", value, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSGreaterThan(String value) {
            addCriterion("SH_CODJKND_HK_S >", value, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("SH_CODJKND_HK_S >=", value, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSLessThan(String value) {
            addCriterion("SH_CODJKND_HK_S <", value, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSLessThanOrEqualTo(String value) {
            addCriterion("SH_CODJKND_HK_S <=", value, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSLike(String value) {
            addCriterion("SH_CODJKND_HK_S like", value, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSNotLike(String value) {
            addCriterion("SH_CODJKND_HK_S not like", value, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSIn(List<String> values) {
            addCriterion("SH_CODJKND_HK_S in", values, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSNotIn(List<String> values) {
            addCriterion("SH_CODJKND_HK_S not in", values, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSBetween(String value1, String value2) {
            addCriterion("SH_CODJKND_HK_S between", value1, value2, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSNotBetween(String value1, String value2) {
            addCriterion("SH_CODJKND_HK_S not between", value1, value2, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSIsNull() {
            addCriterion("SH_CODCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSIsNotNull() {
            addCriterion("SH_CODCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSEqualTo(String value) {
            addCriterion("SH_CODCKND_HK_S =", value, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSNotEqualTo(String value) {
            addCriterion("SH_CODCKND_HK_S <>", value, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSGreaterThan(String value) {
            addCriterion("SH_CODCKND_HK_S >", value, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("SH_CODCKND_HK_S >=", value, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSLessThan(String value) {
            addCriterion("SH_CODCKND_HK_S <", value, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSLessThanOrEqualTo(String value) {
            addCriterion("SH_CODCKND_HK_S <=", value, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSLike(String value) {
            addCriterion("SH_CODCKND_HK_S like", value, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSNotLike(String value) {
            addCriterion("SH_CODCKND_HK_S not like", value, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSIn(List<String> values) {
            addCriterion("SH_CODCKND_HK_S in", values, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSNotIn(List<String> values) {
            addCriterion("SH_CODCKND_HK_S not in", values, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSBetween(String value1, String value2) {
            addCriterion("SH_CODCKND_HK_S between", value1, value2, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSNotBetween(String value1, String value2) {
            addCriterion("SH_CODCKND_HK_S not between", value1, value2, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSIsNull() {
            addCriterion("SH_ADJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSIsNotNull() {
            addCriterion("SH_ADJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSEqualTo(String value) {
            addCriterion("SH_ADJKND_HK_S =", value, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSNotEqualTo(String value) {
            addCriterion("SH_ADJKND_HK_S <>", value, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSGreaterThan(String value) {
            addCriterion("SH_ADJKND_HK_S >", value, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("SH_ADJKND_HK_S >=", value, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSLessThan(String value) {
            addCriterion("SH_ADJKND_HK_S <", value, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSLessThanOrEqualTo(String value) {
            addCriterion("SH_ADJKND_HK_S <=", value, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSLike(String value) {
            addCriterion("SH_ADJKND_HK_S like", value, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSNotLike(String value) {
            addCriterion("SH_ADJKND_HK_S not like", value, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSIn(List<String> values) {
            addCriterion("SH_ADJKND_HK_S in", values, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSNotIn(List<String> values) {
            addCriterion("SH_ADJKND_HK_S not in", values, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSBetween(String value1, String value2) {
            addCriterion("SH_ADJKND_HK_S between", value1, value2, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSNotBetween(String value1, String value2) {
            addCriterion("SH_ADJKND_HK_S not between", value1, value2, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSIsNull() {
            addCriterion("SH_ADCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSIsNotNull() {
            addCriterion("SH_ADCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSEqualTo(String value) {
            addCriterion("SH_ADCKND_HK_S =", value, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSNotEqualTo(String value) {
            addCriterion("SH_ADCKND_HK_S <>", value, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSGreaterThan(String value) {
            addCriterion("SH_ADCKND_HK_S >", value, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("SH_ADCKND_HK_S >=", value, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSLessThan(String value) {
            addCriterion("SH_ADCKND_HK_S <", value, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSLessThanOrEqualTo(String value) {
            addCriterion("SH_ADCKND_HK_S <=", value, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSLike(String value) {
            addCriterion("SH_ADCKND_HK_S like", value, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSNotLike(String value) {
            addCriterion("SH_ADCKND_HK_S not like", value, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSIn(List<String> values) {
            addCriterion("SH_ADCKND_HK_S in", values, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSNotIn(List<String> values) {
            addCriterion("SH_ADCKND_HK_S not in", values, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSBetween(String value1, String value2) {
            addCriterion("SH_ADCKND_HK_S between", value1, value2, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSNotBetween(String value1, String value2) {
            addCriterion("SH_ADCKND_HK_S not between", value1, value2, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDIsNull() {
            addCriterion("HDXZSHCODQCL_D is null");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDIsNotNull() {
            addCriterion("HDXZSHCODQCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDEqualTo(String value) {
            addCriterion("HDXZSHCODQCL_D =", value, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDNotEqualTo(String value) {
            addCriterion("HDXZSHCODQCL_D <>", value, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDGreaterThan(String value) {
            addCriterion("HDXZSHCODQCL_D >", value, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDGreaterThanOrEqualTo(String value) {
            addCriterion("HDXZSHCODQCL_D >=", value, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDLessThan(String value) {
            addCriterion("HDXZSHCODQCL_D <", value, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDLessThanOrEqualTo(String value) {
            addCriterion("HDXZSHCODQCL_D <=", value, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDLike(String value) {
            addCriterion("HDXZSHCODQCL_D like", value, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDNotLike(String value) {
            addCriterion("HDXZSHCODQCL_D not like", value, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDIn(List<String> values) {
            addCriterion("HDXZSHCODQCL_D in", values, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDNotIn(List<String> values) {
            addCriterion("HDXZSHCODQCL_D not in", values, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDBetween(String value1, String value2) {
            addCriterion("HDXZSHCODQCL_D between", value1, value2, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDNotBetween(String value1, String value2) {
            addCriterion("HDXZSHCODQCL_D not between", value1, value2, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDIsNull() {
            addCriterion("HDXZSHADQCL_D is null");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDIsNotNull() {
            addCriterion("HDXZSHADQCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDEqualTo(String value) {
            addCriterion("HDXZSHADQCL_D =", value, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDNotEqualTo(String value) {
            addCriterion("HDXZSHADQCL_D <>", value, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDGreaterThan(String value) {
            addCriterion("HDXZSHADQCL_D >", value, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDGreaterThanOrEqualTo(String value) {
            addCriterion("HDXZSHADQCL_D >=", value, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDLessThan(String value) {
            addCriterion("HDXZSHADQCL_D <", value, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDLessThanOrEqualTo(String value) {
            addCriterion("HDXZSHADQCL_D <=", value, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDLike(String value) {
            addCriterion("HDXZSHADQCL_D like", value, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDNotLike(String value) {
            addCriterion("HDXZSHADQCL_D not like", value, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDIn(List<String> values) {
            addCriterion("HDXZSHADQCL_D in", values, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDNotIn(List<String> values) {
            addCriterion("HDXZSHADQCL_D not in", values, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDBetween(String value1, String value2) {
            addCriterion("HDXZSHADQCL_D between", value1, value2, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDNotBetween(String value1, String value2) {
            addCriterion("HDXZSHADQCL_D not between", value1, value2, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Integer value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Integer value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Integer value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Integer value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Integer> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Integer> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Integer value1, Integer value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}