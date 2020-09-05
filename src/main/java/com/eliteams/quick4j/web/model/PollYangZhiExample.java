package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class PollYangZhiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PollYangZhiExample() {
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

        public Criteria andYzcbmIsNull() {
            addCriterion("YZCBM is null");
            return (Criteria) this;
        }

        public Criteria andYzcbmIsNotNull() {
            addCriterion("YZCBM is not null");
            return (Criteria) this;
        }

        public Criteria andYzcbmEqualTo(String value) {
            addCriterion("YZCBM =", value, "yzcbm");
            return (Criteria) this;
        }

        public Criteria andYzcbmNotEqualTo(String value) {
            addCriterion("YZCBM <>", value, "yzcbm");
            return (Criteria) this;
        }

        public Criteria andYzcbmGreaterThan(String value) {
            addCriterion("YZCBM >", value, "yzcbm");
            return (Criteria) this;
        }

        public Criteria andYzcbmGreaterThanOrEqualTo(String value) {
            addCriterion("YZCBM >=", value, "yzcbm");
            return (Criteria) this;
        }

        public Criteria andYzcbmLessThan(String value) {
            addCriterion("YZCBM <", value, "yzcbm");
            return (Criteria) this;
        }

        public Criteria andYzcbmLessThanOrEqualTo(String value) {
            addCriterion("YZCBM <=", value, "yzcbm");
            return (Criteria) this;
        }

        public Criteria andYzcbmLike(String value) {
            addCriterion("YZCBM like", value, "yzcbm");
            return (Criteria) this;
        }

        public Criteria andYzcbmNotLike(String value) {
            addCriterion("YZCBM not like", value, "yzcbm");
            return (Criteria) this;
        }

        public Criteria andYzcbmIn(List<String> values) {
            addCriterion("YZCBM in", values, "yzcbm");
            return (Criteria) this;
        }

        public Criteria andYzcbmNotIn(List<String> values) {
            addCriterion("YZCBM not in", values, "yzcbm");
            return (Criteria) this;
        }

        public Criteria andYzcbmBetween(String value1, String value2) {
            addCriterion("YZCBM between", value1, value2, "yzcbm");
            return (Criteria) this;
        }

        public Criteria andYzcbmNotBetween(String value1, String value2) {
            addCriterion("YZCBM not between", value1, value2, "yzcbm");
            return (Criteria) this;
        }

        public Criteria andYzcmcIsNull() {
            addCriterion("YZCMC is null");
            return (Criteria) this;
        }

        public Criteria andYzcmcIsNotNull() {
            addCriterion("YZCMC is not null");
            return (Criteria) this;
        }

        public Criteria andYzcmcEqualTo(String value) {
            addCriterion("YZCMC =", value, "yzcmc");
            return (Criteria) this;
        }

        public Criteria andYzcmcNotEqualTo(String value) {
            addCriterion("YZCMC <>", value, "yzcmc");
            return (Criteria) this;
        }

        public Criteria andYzcmcGreaterThan(String value) {
            addCriterion("YZCMC >", value, "yzcmc");
            return (Criteria) this;
        }

        public Criteria andYzcmcGreaterThanOrEqualTo(String value) {
            addCriterion("YZCMC >=", value, "yzcmc");
            return (Criteria) this;
        }

        public Criteria andYzcmcLessThan(String value) {
            addCriterion("YZCMC <", value, "yzcmc");
            return (Criteria) this;
        }

        public Criteria andYzcmcLessThanOrEqualTo(String value) {
            addCriterion("YZCMC <=", value, "yzcmc");
            return (Criteria) this;
        }

        public Criteria andYzcmcLike(String value) {
            addCriterion("YZCMC like", value, "yzcmc");
            return (Criteria) this;
        }

        public Criteria andYzcmcNotLike(String value) {
            addCriterion("YZCMC not like", value, "yzcmc");
            return (Criteria) this;
        }

        public Criteria andYzcmcIn(List<String> values) {
            addCriterion("YZCMC in", values, "yzcmc");
            return (Criteria) this;
        }

        public Criteria andYzcmcNotIn(List<String> values) {
            addCriterion("YZCMC not in", values, "yzcmc");
            return (Criteria) this;
        }

        public Criteria andYzcmcBetween(String value1, String value2) {
            addCriterion("YZCMC between", value1, value2, "yzcmc");
            return (Criteria) this;
        }

        public Criteria andYzcmcNotBetween(String value1, String value2) {
            addCriterion("YZCMC not between", value1, value2, "yzcmc");
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

        public Criteria andKzdmIsNull() {
            addCriterion("KZDM is null");
            return (Criteria) this;
        }

        public Criteria andKzdmIsNotNull() {
            addCriterion("KZDM is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmEqualTo(String value) {
            addCriterion("KZDM =", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmNotEqualTo(String value) {
            addCriterion("KZDM <>", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmGreaterThan(String value) {
            addCriterion("KZDM >", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmGreaterThanOrEqualTo(String value) {
            addCriterion("KZDM >=", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmLessThan(String value) {
            addCriterion("KZDM <", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmLessThanOrEqualTo(String value) {
            addCriterion("KZDM <=", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmLike(String value) {
            addCriterion("KZDM like", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmNotLike(String value) {
            addCriterion("KZDM not like", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmIn(List<String> values) {
            addCriterion("KZDM in", values, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmNotIn(List<String> values) {
            addCriterion("KZDM not in", values, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmBetween(String value1, String value2) {
            addCriterion("KZDM between", value1, value2, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmNotBetween(String value1, String value2) {
            addCriterion("KZDM not between", value1, value2, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdyIsNull() {
            addCriterion("KZDY is null");
            return (Criteria) this;
        }

        public Criteria andKzdyIsNotNull() {
            addCriterion("KZDY is not null");
            return (Criteria) this;
        }

        public Criteria andKzdyEqualTo(String value) {
            addCriterion("KZDY =", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyNotEqualTo(String value) {
            addCriterion("KZDY <>", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyGreaterThan(String value) {
            addCriterion("KZDY >", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyGreaterThanOrEqualTo(String value) {
            addCriterion("KZDY >=", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyLessThan(String value) {
            addCriterion("KZDY <", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyLessThanOrEqualTo(String value) {
            addCriterion("KZDY <=", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyLike(String value) {
            addCriterion("KZDY like", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyNotLike(String value) {
            addCriterion("KZDY not like", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyIn(List<String> values) {
            addCriterion("KZDY in", values, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyNotIn(List<String> values) {
            addCriterion("KZDY not in", values, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyBetween(String value1, String value2) {
            addCriterion("KZDY between", value1, value2, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyNotBetween(String value1, String value2) {
            addCriterion("KZDY not between", value1, value2, "kzdy");
            return (Criteria) this;
        }

        public Criteria andYzlxIsNull() {
            addCriterion("YZLX is null");
            return (Criteria) this;
        }

        public Criteria andYzlxIsNotNull() {
            addCriterion("YZLX is not null");
            return (Criteria) this;
        }

        public Criteria andYzlxEqualTo(String value) {
            addCriterion("YZLX =", value, "yzlx");
            return (Criteria) this;
        }

        public Criteria andYzlxNotEqualTo(String value) {
            addCriterion("YZLX <>", value, "yzlx");
            return (Criteria) this;
        }

        public Criteria andYzlxGreaterThan(String value) {
            addCriterion("YZLX >", value, "yzlx");
            return (Criteria) this;
        }

        public Criteria andYzlxGreaterThanOrEqualTo(String value) {
            addCriterion("YZLX >=", value, "yzlx");
            return (Criteria) this;
        }

        public Criteria andYzlxLessThan(String value) {
            addCriterion("YZLX <", value, "yzlx");
            return (Criteria) this;
        }

        public Criteria andYzlxLessThanOrEqualTo(String value) {
            addCriterion("YZLX <=", value, "yzlx");
            return (Criteria) this;
        }

        public Criteria andYzlxLike(String value) {
            addCriterion("YZLX like", value, "yzlx");
            return (Criteria) this;
        }

        public Criteria andYzlxNotLike(String value) {
            addCriterion("YZLX not like", value, "yzlx");
            return (Criteria) this;
        }

        public Criteria andYzlxIn(List<String> values) {
            addCriterion("YZLX in", values, "yzlx");
            return (Criteria) this;
        }

        public Criteria andYzlxNotIn(List<String> values) {
            addCriterion("YZLX not in", values, "yzlx");
            return (Criteria) this;
        }

        public Criteria andYzlxBetween(String value1, String value2) {
            addCriterion("YZLX between", value1, value2, "yzlx");
            return (Criteria) this;
        }

        public Criteria andYzlxNotBetween(String value1, String value2) {
            addCriterion("YZLX not between", value1, value2, "yzlx");
            return (Criteria) this;
        }

        public Criteria andBhhsIsNull() {
            addCriterion("BHHS is null");
            return (Criteria) this;
        }

        public Criteria andBhhsIsNotNull() {
            addCriterion("BHHS is not null");
            return (Criteria) this;
        }

        public Criteria andBhhsEqualTo(String value) {
            addCriterion("BHHS =", value, "bhhs");
            return (Criteria) this;
        }

        public Criteria andBhhsNotEqualTo(String value) {
            addCriterion("BHHS <>", value, "bhhs");
            return (Criteria) this;
        }

        public Criteria andBhhsGreaterThan(String value) {
            addCriterion("BHHS >", value, "bhhs");
            return (Criteria) this;
        }

        public Criteria andBhhsGreaterThanOrEqualTo(String value) {
            addCriterion("BHHS >=", value, "bhhs");
            return (Criteria) this;
        }

        public Criteria andBhhsLessThan(String value) {
            addCriterion("BHHS <", value, "bhhs");
            return (Criteria) this;
        }

        public Criteria andBhhsLessThanOrEqualTo(String value) {
            addCriterion("BHHS <=", value, "bhhs");
            return (Criteria) this;
        }

        public Criteria andBhhsLike(String value) {
            addCriterion("BHHS like", value, "bhhs");
            return (Criteria) this;
        }

        public Criteria andBhhsNotLike(String value) {
            addCriterion("BHHS not like", value, "bhhs");
            return (Criteria) this;
        }

        public Criteria andBhhsIn(List<String> values) {
            addCriterion("BHHS in", values, "bhhs");
            return (Criteria) this;
        }

        public Criteria andBhhsNotIn(List<String> values) {
            addCriterion("BHHS not in", values, "bhhs");
            return (Criteria) this;
        }

        public Criteria andBhhsBetween(String value1, String value2) {
            addCriterion("BHHS between", value1, value2, "bhhs");
            return (Criteria) this;
        }

        public Criteria andBhhsNotBetween(String value1, String value2) {
            addCriterion("BHHS not between", value1, value2, "bhhs");
            return (Criteria) this;
        }

        public Criteria andFzrIsNull() {
            addCriterion("FZR is null");
            return (Criteria) this;
        }

        public Criteria andFzrIsNotNull() {
            addCriterion("FZR is not null");
            return (Criteria) this;
        }

        public Criteria andFzrEqualTo(String value) {
            addCriterion("FZR =", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotEqualTo(String value) {
            addCriterion("FZR <>", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrGreaterThan(String value) {
            addCriterion("FZR >", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrGreaterThanOrEqualTo(String value) {
            addCriterion("FZR >=", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrLessThan(String value) {
            addCriterion("FZR <", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrLessThanOrEqualTo(String value) {
            addCriterion("FZR <=", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrLike(String value) {
            addCriterion("FZR like", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotLike(String value) {
            addCriterion("FZR not like", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrIn(List<String> values) {
            addCriterion("FZR in", values, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotIn(List<String> values) {
            addCriterion("FZR not in", values, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrBetween(String value1, String value2) {
            addCriterion("FZR between", value1, value2, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotBetween(String value1, String value2) {
            addCriterion("FZR not between", value1, value2, "fzr");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNull() {
            addCriterion("LXDH is null");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNotNull() {
            addCriterion("LXDH is not null");
            return (Criteria) this;
        }

        public Criteria andLxdhEqualTo(String value) {
            addCriterion("LXDH =", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotEqualTo(String value) {
            addCriterion("LXDH <>", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThan(String value) {
            addCriterion("LXDH >", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThanOrEqualTo(String value) {
            addCriterion("LXDH >=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThan(String value) {
            addCriterion("LXDH <", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThanOrEqualTo(String value) {
            addCriterion("LXDH <=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLike(String value) {
            addCriterion("LXDH like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotLike(String value) {
            addCriterion("LXDH not like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhIn(List<String> values) {
            addCriterion("LXDH in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotIn(List<String> values) {
            addCriterion("LXDH not in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhBetween(String value1, String value2) {
            addCriterion("LXDH between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotBetween(String value1, String value2) {
            addCriterion("LXDH not between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andDzPIsNull() {
            addCriterion("DZ_P is null");
            return (Criteria) this;
        }

        public Criteria andDzPIsNotNull() {
            addCriterion("DZ_P is not null");
            return (Criteria) this;
        }

        public Criteria andDzPEqualTo(String value) {
            addCriterion("DZ_P =", value, "dzP");
            return (Criteria) this;
        }

        public Criteria andDzPNotEqualTo(String value) {
            addCriterion("DZ_P <>", value, "dzP");
            return (Criteria) this;
        }

        public Criteria andDzPGreaterThan(String value) {
            addCriterion("DZ_P >", value, "dzP");
            return (Criteria) this;
        }

        public Criteria andDzPGreaterThanOrEqualTo(String value) {
            addCriterion("DZ_P >=", value, "dzP");
            return (Criteria) this;
        }

        public Criteria andDzPLessThan(String value) {
            addCriterion("DZ_P <", value, "dzP");
            return (Criteria) this;
        }

        public Criteria andDzPLessThanOrEqualTo(String value) {
            addCriterion("DZ_P <=", value, "dzP");
            return (Criteria) this;
        }

        public Criteria andDzPLike(String value) {
            addCriterion("DZ_P like", value, "dzP");
            return (Criteria) this;
        }

        public Criteria andDzPNotLike(String value) {
            addCriterion("DZ_P not like", value, "dzP");
            return (Criteria) this;
        }

        public Criteria andDzPIn(List<String> values) {
            addCriterion("DZ_P in", values, "dzP");
            return (Criteria) this;
        }

        public Criteria andDzPNotIn(List<String> values) {
            addCriterion("DZ_P not in", values, "dzP");
            return (Criteria) this;
        }

        public Criteria andDzPBetween(String value1, String value2) {
            addCriterion("DZ_P between", value1, value2, "dzP");
            return (Criteria) this;
        }

        public Criteria andDzPNotBetween(String value1, String value2) {
            addCriterion("DZ_P not between", value1, value2, "dzP");
            return (Criteria) this;
        }

        public Criteria andDzSIsNull() {
            addCriterion("DZ_S is null");
            return (Criteria) this;
        }

        public Criteria andDzSIsNotNull() {
            addCriterion("DZ_S is not null");
            return (Criteria) this;
        }

        public Criteria andDzSEqualTo(String value) {
            addCriterion("DZ_S =", value, "dzS");
            return (Criteria) this;
        }

        public Criteria andDzSNotEqualTo(String value) {
            addCriterion("DZ_S <>", value, "dzS");
            return (Criteria) this;
        }

        public Criteria andDzSGreaterThan(String value) {
            addCriterion("DZ_S >", value, "dzS");
            return (Criteria) this;
        }

        public Criteria andDzSGreaterThanOrEqualTo(String value) {
            addCriterion("DZ_S >=", value, "dzS");
            return (Criteria) this;
        }

        public Criteria andDzSLessThan(String value) {
            addCriterion("DZ_S <", value, "dzS");
            return (Criteria) this;
        }

        public Criteria andDzSLessThanOrEqualTo(String value) {
            addCriterion("DZ_S <=", value, "dzS");
            return (Criteria) this;
        }

        public Criteria andDzSLike(String value) {
            addCriterion("DZ_S like", value, "dzS");
            return (Criteria) this;
        }

        public Criteria andDzSNotLike(String value) {
            addCriterion("DZ_S not like", value, "dzS");
            return (Criteria) this;
        }

        public Criteria andDzSIn(List<String> values) {
            addCriterion("DZ_S in", values, "dzS");
            return (Criteria) this;
        }

        public Criteria andDzSNotIn(List<String> values) {
            addCriterion("DZ_S not in", values, "dzS");
            return (Criteria) this;
        }

        public Criteria andDzSBetween(String value1, String value2) {
            addCriterion("DZ_S between", value1, value2, "dzS");
            return (Criteria) this;
        }

        public Criteria andDzSNotBetween(String value1, String value2) {
            addCriterion("DZ_S not between", value1, value2, "dzS");
            return (Criteria) this;
        }

        public Criteria andDzXIsNull() {
            addCriterion("DZ_X is null");
            return (Criteria) this;
        }

        public Criteria andDzXIsNotNull() {
            addCriterion("DZ_X is not null");
            return (Criteria) this;
        }

        public Criteria andDzXEqualTo(String value) {
            addCriterion("DZ_X =", value, "dzX");
            return (Criteria) this;
        }

        public Criteria andDzXNotEqualTo(String value) {
            addCriterion("DZ_X <>", value, "dzX");
            return (Criteria) this;
        }

        public Criteria andDzXGreaterThan(String value) {
            addCriterion("DZ_X >", value, "dzX");
            return (Criteria) this;
        }

        public Criteria andDzXGreaterThanOrEqualTo(String value) {
            addCriterion("DZ_X >=", value, "dzX");
            return (Criteria) this;
        }

        public Criteria andDzXLessThan(String value) {
            addCriterion("DZ_X <", value, "dzX");
            return (Criteria) this;
        }

        public Criteria andDzXLessThanOrEqualTo(String value) {
            addCriterion("DZ_X <=", value, "dzX");
            return (Criteria) this;
        }

        public Criteria andDzXLike(String value) {
            addCriterion("DZ_X like", value, "dzX");
            return (Criteria) this;
        }

        public Criteria andDzXNotLike(String value) {
            addCriterion("DZ_X not like", value, "dzX");
            return (Criteria) this;
        }

        public Criteria andDzXIn(List<String> values) {
            addCriterion("DZ_X in", values, "dzX");
            return (Criteria) this;
        }

        public Criteria andDzXNotIn(List<String> values) {
            addCriterion("DZ_X not in", values, "dzX");
            return (Criteria) this;
        }

        public Criteria andDzXBetween(String value1, String value2) {
            addCriterion("DZ_X between", value1, value2, "dzX");
            return (Criteria) this;
        }

        public Criteria andDzXNotBetween(String value1, String value2) {
            addCriterion("DZ_X not between", value1, value2, "dzX");
            return (Criteria) this;
        }

        public Criteria andXzIsNull() {
            addCriterion("XZ is null");
            return (Criteria) this;
        }

        public Criteria andXzIsNotNull() {
            addCriterion("XZ is not null");
            return (Criteria) this;
        }

        public Criteria andXzEqualTo(String value) {
            addCriterion("XZ =", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotEqualTo(String value) {
            addCriterion("XZ <>", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzGreaterThan(String value) {
            addCriterion("XZ >", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzGreaterThanOrEqualTo(String value) {
            addCriterion("XZ >=", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzLessThan(String value) {
            addCriterion("XZ <", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzLessThanOrEqualTo(String value) {
            addCriterion("XZ <=", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzLike(String value) {
            addCriterion("XZ like", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotLike(String value) {
            addCriterion("XZ not like", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzIn(List<String> values) {
            addCriterion("XZ in", values, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotIn(List<String> values) {
            addCriterion("XZ not in", values, "xz");
            return (Criteria) this;
        }

        public Criteria andXzBetween(String value1, String value2) {
            addCriterion("XZ between", value1, value2, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotBetween(String value1, String value2) {
            addCriterion("XZ not between", value1, value2, "xz");
            return (Criteria) this;
        }

        public Criteria andJcIsNull() {
            addCriterion("JC is null");
            return (Criteria) this;
        }

        public Criteria andJcIsNotNull() {
            addCriterion("JC is not null");
            return (Criteria) this;
        }

        public Criteria andJcEqualTo(String value) {
            addCriterion("JC =", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcNotEqualTo(String value) {
            addCriterion("JC <>", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcGreaterThan(String value) {
            addCriterion("JC >", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcGreaterThanOrEqualTo(String value) {
            addCriterion("JC >=", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcLessThan(String value) {
            addCriterion("JC <", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcLessThanOrEqualTo(String value) {
            addCriterion("JC <=", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcLike(String value) {
            addCriterion("JC like", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcNotLike(String value) {
            addCriterion("JC not like", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcIn(List<String> values) {
            addCriterion("JC in", values, "jc");
            return (Criteria) this;
        }

        public Criteria andJcNotIn(List<String> values) {
            addCriterion("JC not in", values, "jc");
            return (Criteria) this;
        }

        public Criteria andJcBetween(String value1, String value2) {
            addCriterion("JC between", value1, value2, "jc");
            return (Criteria) this;
        }

        public Criteria andJcNotBetween(String value1, String value2) {
            addCriterion("JC not between", value1, value2, "jc");
            return (Criteria) this;
        }

        public Criteria andSzlymcIsNull() {
            addCriterion("SZLYMC is null");
            return (Criteria) this;
        }

        public Criteria andSzlymcIsNotNull() {
            addCriterion("SZLYMC is not null");
            return (Criteria) this;
        }

        public Criteria andSzlymcEqualTo(String value) {
            addCriterion("SZLYMC =", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcNotEqualTo(String value) {
            addCriterion("SZLYMC <>", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcGreaterThan(String value) {
            addCriterion("SZLYMC >", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcGreaterThanOrEqualTo(String value) {
            addCriterion("SZLYMC >=", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcLessThan(String value) {
            addCriterion("SZLYMC <", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcLessThanOrEqualTo(String value) {
            addCriterion("SZLYMC <=", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcLike(String value) {
            addCriterion("SZLYMC like", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcNotLike(String value) {
            addCriterion("SZLYMC not like", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcIn(List<String> values) {
            addCriterion("SZLYMC in", values, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcNotIn(List<String> values) {
            addCriterion("SZLYMC not in", values, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcBetween(String value1, String value2) {
            addCriterion("SZLYMC between", value1, value2, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcNotBetween(String value1, String value2) {
            addCriterion("SZLYMC not between", value1, value2, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlydmIsNull() {
            addCriterion("SZLYDM is null");
            return (Criteria) this;
        }

        public Criteria andSzlydmIsNotNull() {
            addCriterion("SZLYDM is not null");
            return (Criteria) this;
        }

        public Criteria andSzlydmEqualTo(String value) {
            addCriterion("SZLYDM =", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmNotEqualTo(String value) {
            addCriterion("SZLYDM <>", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmGreaterThan(String value) {
            addCriterion("SZLYDM >", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmGreaterThanOrEqualTo(String value) {
            addCriterion("SZLYDM >=", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmLessThan(String value) {
            addCriterion("SZLYDM <", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmLessThanOrEqualTo(String value) {
            addCriterion("SZLYDM <=", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmLike(String value) {
            addCriterion("SZLYDM like", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmNotLike(String value) {
            addCriterion("SZLYDM not like", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmIn(List<String> values) {
            addCriterion("SZLYDM in", values, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmNotIn(List<String> values) {
            addCriterion("SZLYDM not in", values, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmBetween(String value1, String value2) {
            addCriterion("SZLYDM between", value1, value2, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmNotBetween(String value1, String value2) {
            addCriterion("SZLYDM not between", value1, value2, "szlydm");
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

        public Criteria andXqzlIsNull() {
            addCriterion("XQZL is null");
            return (Criteria) this;
        }

        public Criteria andXqzlIsNotNull() {
            addCriterion("XQZL is not null");
            return (Criteria) this;
        }

        public Criteria andXqzlEqualTo(String value) {
            addCriterion("XQZL =", value, "xqzl");
            return (Criteria) this;
        }

        public Criteria andXqzlNotEqualTo(String value) {
            addCriterion("XQZL <>", value, "xqzl");
            return (Criteria) this;
        }

        public Criteria andXqzlGreaterThan(String value) {
            addCriterion("XQZL >", value, "xqzl");
            return (Criteria) this;
        }

        public Criteria andXqzlGreaterThanOrEqualTo(String value) {
            addCriterion("XQZL >=", value, "xqzl");
            return (Criteria) this;
        }

        public Criteria andXqzlLessThan(String value) {
            addCriterion("XQZL <", value, "xqzl");
            return (Criteria) this;
        }

        public Criteria andXqzlLessThanOrEqualTo(String value) {
            addCriterion("XQZL <=", value, "xqzl");
            return (Criteria) this;
        }

        public Criteria andXqzlLike(String value) {
            addCriterion("XQZL like", value, "xqzl");
            return (Criteria) this;
        }

        public Criteria andXqzlNotLike(String value) {
            addCriterion("XQZL not like", value, "xqzl");
            return (Criteria) this;
        }

        public Criteria andXqzlIn(List<String> values) {
            addCriterion("XQZL in", values, "xqzl");
            return (Criteria) this;
        }

        public Criteria andXqzlNotIn(List<String> values) {
            addCriterion("XQZL not in", values, "xqzl");
            return (Criteria) this;
        }

        public Criteria andXqzlBetween(String value1, String value2) {
            addCriterion("XQZL between", value1, value2, "xqzl");
            return (Criteria) this;
        }

        public Criteria andXqzlNotBetween(String value1, String value2) {
            addCriterion("XQZL not between", value1, value2, "xqzl");
            return (Criteria) this;
        }

        public Criteria andYzclszmjIsNull() {
            addCriterion("YZCLSZMJ is null");
            return (Criteria) this;
        }

        public Criteria andYzclszmjIsNotNull() {
            addCriterion("YZCLSZMJ is not null");
            return (Criteria) this;
        }

        public Criteria andYzclszmjEqualTo(String value) {
            addCriterion("YZCLSZMJ =", value, "yzclszmj");
            return (Criteria) this;
        }

        public Criteria andYzclszmjNotEqualTo(String value) {
            addCriterion("YZCLSZMJ <>", value, "yzclszmj");
            return (Criteria) this;
        }

        public Criteria andYzclszmjGreaterThan(String value) {
            addCriterion("YZCLSZMJ >", value, "yzclszmj");
            return (Criteria) this;
        }

        public Criteria andYzclszmjGreaterThanOrEqualTo(String value) {
            addCriterion("YZCLSZMJ >=", value, "yzclszmj");
            return (Criteria) this;
        }

        public Criteria andYzclszmjLessThan(String value) {
            addCriterion("YZCLSZMJ <", value, "yzclszmj");
            return (Criteria) this;
        }

        public Criteria andYzclszmjLessThanOrEqualTo(String value) {
            addCriterion("YZCLSZMJ <=", value, "yzclszmj");
            return (Criteria) this;
        }

        public Criteria andYzclszmjLike(String value) {
            addCriterion("YZCLSZMJ like", value, "yzclszmj");
            return (Criteria) this;
        }

        public Criteria andYzclszmjNotLike(String value) {
            addCriterion("YZCLSZMJ not like", value, "yzclszmj");
            return (Criteria) this;
        }

        public Criteria andYzclszmjIn(List<String> values) {
            addCriterion("YZCLSZMJ in", values, "yzclszmj");
            return (Criteria) this;
        }

        public Criteria andYzclszmjNotIn(List<String> values) {
            addCriterion("YZCLSZMJ not in", values, "yzclszmj");
            return (Criteria) this;
        }

        public Criteria andYzclszmjBetween(String value1, String value2) {
            addCriterion("YZCLSZMJ between", value1, value2, "yzclszmj");
            return (Criteria) this;
        }

        public Criteria andYzclszmjNotBetween(String value1, String value2) {
            addCriterion("YZCLSZMJ not between", value1, value2, "yzclszmj");
            return (Criteria) this;
        }

        public Criteria andZwssljtzIsNull() {
            addCriterion("ZWSSLJTZ is null");
            return (Criteria) this;
        }

        public Criteria andZwssljtzIsNotNull() {
            addCriterion("ZWSSLJTZ is not null");
            return (Criteria) this;
        }

        public Criteria andZwssljtzEqualTo(String value) {
            addCriterion("ZWSSLJTZ =", value, "zwssljtz");
            return (Criteria) this;
        }

        public Criteria andZwssljtzNotEqualTo(String value) {
            addCriterion("ZWSSLJTZ <>", value, "zwssljtz");
            return (Criteria) this;
        }

        public Criteria andZwssljtzGreaterThan(String value) {
            addCriterion("ZWSSLJTZ >", value, "zwssljtz");
            return (Criteria) this;
        }

        public Criteria andZwssljtzGreaterThanOrEqualTo(String value) {
            addCriterion("ZWSSLJTZ >=", value, "zwssljtz");
            return (Criteria) this;
        }

        public Criteria andZwssljtzLessThan(String value) {
            addCriterion("ZWSSLJTZ <", value, "zwssljtz");
            return (Criteria) this;
        }

        public Criteria andZwssljtzLessThanOrEqualTo(String value) {
            addCriterion("ZWSSLJTZ <=", value, "zwssljtz");
            return (Criteria) this;
        }

        public Criteria andZwssljtzLike(String value) {
            addCriterion("ZWSSLJTZ like", value, "zwssljtz");
            return (Criteria) this;
        }

        public Criteria andZwssljtzNotLike(String value) {
            addCriterion("ZWSSLJTZ not like", value, "zwssljtz");
            return (Criteria) this;
        }

        public Criteria andZwssljtzIn(List<String> values) {
            addCriterion("ZWSSLJTZ in", values, "zwssljtz");
            return (Criteria) this;
        }

        public Criteria andZwssljtzNotIn(List<String> values) {
            addCriterion("ZWSSLJTZ not in", values, "zwssljtz");
            return (Criteria) this;
        }

        public Criteria andZwssljtzBetween(String value1, String value2) {
            addCriterion("ZWSSLJTZ between", value1, value2, "zwssljtz");
            return (Criteria) this;
        }

        public Criteria andZwssljtzNotBetween(String value1, String value2) {
            addCriterion("ZWSSLJTZ not between", value1, value2, "zwssljtz");
            return (Criteria) this;
        }

        public Criteria andXzgdzcIsNull() {
            addCriterion("XZGDZC is null");
            return (Criteria) this;
        }

        public Criteria andXzgdzcIsNotNull() {
            addCriterion("XZGDZC is not null");
            return (Criteria) this;
        }

        public Criteria andXzgdzcEqualTo(String value) {
            addCriterion("XZGDZC =", value, "xzgdzc");
            return (Criteria) this;
        }

        public Criteria andXzgdzcNotEqualTo(String value) {
            addCriterion("XZGDZC <>", value, "xzgdzc");
            return (Criteria) this;
        }

        public Criteria andXzgdzcGreaterThan(String value) {
            addCriterion("XZGDZC >", value, "xzgdzc");
            return (Criteria) this;
        }

        public Criteria andXzgdzcGreaterThanOrEqualTo(String value) {
            addCriterion("XZGDZC >=", value, "xzgdzc");
            return (Criteria) this;
        }

        public Criteria andXzgdzcLessThan(String value) {
            addCriterion("XZGDZC <", value, "xzgdzc");
            return (Criteria) this;
        }

        public Criteria andXzgdzcLessThanOrEqualTo(String value) {
            addCriterion("XZGDZC <=", value, "xzgdzc");
            return (Criteria) this;
        }

        public Criteria andXzgdzcLike(String value) {
            addCriterion("XZGDZC like", value, "xzgdzc");
            return (Criteria) this;
        }

        public Criteria andXzgdzcNotLike(String value) {
            addCriterion("XZGDZC not like", value, "xzgdzc");
            return (Criteria) this;
        }

        public Criteria andXzgdzcIn(List<String> values) {
            addCriterion("XZGDZC in", values, "xzgdzc");
            return (Criteria) this;
        }

        public Criteria andXzgdzcNotIn(List<String> values) {
            addCriterion("XZGDZC not in", values, "xzgdzc");
            return (Criteria) this;
        }

        public Criteria andXzgdzcBetween(String value1, String value2) {
            addCriterion("XZGDZC between", value1, value2, "xzgdzc");
            return (Criteria) this;
        }

        public Criteria andXzgdzcNotBetween(String value1, String value2) {
            addCriterion("XZGDZC not between", value1, value2, "xzgdzc");
            return (Criteria) this;
        }

        public Criteria andPtnytdlymjIsNull() {
            addCriterion("PTNYTDLYMJ is null");
            return (Criteria) this;
        }

        public Criteria andPtnytdlymjIsNotNull() {
            addCriterion("PTNYTDLYMJ is not null");
            return (Criteria) this;
        }

        public Criteria andPtnytdlymjEqualTo(String value) {
            addCriterion("PTNYTDLYMJ =", value, "ptnytdlymj");
            return (Criteria) this;
        }

        public Criteria andPtnytdlymjNotEqualTo(String value) {
            addCriterion("PTNYTDLYMJ <>", value, "ptnytdlymj");
            return (Criteria) this;
        }

        public Criteria andPtnytdlymjGreaterThan(String value) {
            addCriterion("PTNYTDLYMJ >", value, "ptnytdlymj");
            return (Criteria) this;
        }

        public Criteria andPtnytdlymjGreaterThanOrEqualTo(String value) {
            addCriterion("PTNYTDLYMJ >=", value, "ptnytdlymj");
            return (Criteria) this;
        }

        public Criteria andPtnytdlymjLessThan(String value) {
            addCriterion("PTNYTDLYMJ <", value, "ptnytdlymj");
            return (Criteria) this;
        }

        public Criteria andPtnytdlymjLessThanOrEqualTo(String value) {
            addCriterion("PTNYTDLYMJ <=", value, "ptnytdlymj");
            return (Criteria) this;
        }

        public Criteria andPtnytdlymjLike(String value) {
            addCriterion("PTNYTDLYMJ like", value, "ptnytdlymj");
            return (Criteria) this;
        }

        public Criteria andPtnytdlymjNotLike(String value) {
            addCriterion("PTNYTDLYMJ not like", value, "ptnytdlymj");
            return (Criteria) this;
        }

        public Criteria andPtnytdlymjIn(List<String> values) {
            addCriterion("PTNYTDLYMJ in", values, "ptnytdlymj");
            return (Criteria) this;
        }

        public Criteria andPtnytdlymjNotIn(List<String> values) {
            addCriterion("PTNYTDLYMJ not in", values, "ptnytdlymj");
            return (Criteria) this;
        }

        public Criteria andPtnytdlymjBetween(String value1, String value2) {
            addCriterion("PTNYTDLYMJ between", value1, value2, "ptnytdlymj");
            return (Criteria) this;
        }

        public Criteria andPtnytdlymjNotBetween(String value1, String value2) {
            addCriterion("PTNYTDLYMJ not between", value1, value2, "ptnytdlymj");
            return (Criteria) this;
        }

        public Criteria andPtnytdlyfsIsNull() {
            addCriterion("PTNYTDLYFS is null");
            return (Criteria) this;
        }

        public Criteria andPtnytdlyfsIsNotNull() {
            addCriterion("PTNYTDLYFS is not null");
            return (Criteria) this;
        }

        public Criteria andPtnytdlyfsEqualTo(String value) {
            addCriterion("PTNYTDLYFS =", value, "ptnytdlyfs");
            return (Criteria) this;
        }

        public Criteria andPtnytdlyfsNotEqualTo(String value) {
            addCriterion("PTNYTDLYFS <>", value, "ptnytdlyfs");
            return (Criteria) this;
        }

        public Criteria andPtnytdlyfsGreaterThan(String value) {
            addCriterion("PTNYTDLYFS >", value, "ptnytdlyfs");
            return (Criteria) this;
        }

        public Criteria andPtnytdlyfsGreaterThanOrEqualTo(String value) {
            addCriterion("PTNYTDLYFS >=", value, "ptnytdlyfs");
            return (Criteria) this;
        }

        public Criteria andPtnytdlyfsLessThan(String value) {
            addCriterion("PTNYTDLYFS <", value, "ptnytdlyfs");
            return (Criteria) this;
        }

        public Criteria andPtnytdlyfsLessThanOrEqualTo(String value) {
            addCriterion("PTNYTDLYFS <=", value, "ptnytdlyfs");
            return (Criteria) this;
        }

        public Criteria andPtnytdlyfsLike(String value) {
            addCriterion("PTNYTDLYFS like", value, "ptnytdlyfs");
            return (Criteria) this;
        }

        public Criteria andPtnytdlyfsNotLike(String value) {
            addCriterion("PTNYTDLYFS not like", value, "ptnytdlyfs");
            return (Criteria) this;
        }

        public Criteria andPtnytdlyfsIn(List<String> values) {
            addCriterion("PTNYTDLYFS in", values, "ptnytdlyfs");
            return (Criteria) this;
        }

        public Criteria andPtnytdlyfsNotIn(List<String> values) {
            addCriterion("PTNYTDLYFS not in", values, "ptnytdlyfs");
            return (Criteria) this;
        }

        public Criteria andPtnytdlyfsBetween(String value1, String value2) {
            addCriterion("PTNYTDLYFS between", value1, value2, "ptnytdlyfs");
            return (Criteria) this;
        }

        public Criteria andPtnytdlyfsNotBetween(String value1, String value2) {
            addCriterion("PTNYTDLYFS not between", value1, value2, "ptnytdlyfs");
            return (Criteria) this;
        }

        public Criteria andPtscyzsmmjIsNull() {
            addCriterion("PTSCYZSMMJ is null");
            return (Criteria) this;
        }

        public Criteria andPtscyzsmmjIsNotNull() {
            addCriterion("PTSCYZSMMJ is not null");
            return (Criteria) this;
        }

        public Criteria andPtscyzsmmjEqualTo(String value) {
            addCriterion("PTSCYZSMMJ =", value, "ptscyzsmmj");
            return (Criteria) this;
        }

        public Criteria andPtscyzsmmjNotEqualTo(String value) {
            addCriterion("PTSCYZSMMJ <>", value, "ptscyzsmmj");
            return (Criteria) this;
        }

        public Criteria andPtscyzsmmjGreaterThan(String value) {
            addCriterion("PTSCYZSMMJ >", value, "ptscyzsmmj");
            return (Criteria) this;
        }

        public Criteria andPtscyzsmmjGreaterThanOrEqualTo(String value) {
            addCriterion("PTSCYZSMMJ >=", value, "ptscyzsmmj");
            return (Criteria) this;
        }

        public Criteria andPtscyzsmmjLessThan(String value) {
            addCriterion("PTSCYZSMMJ <", value, "ptscyzsmmj");
            return (Criteria) this;
        }

        public Criteria andPtscyzsmmjLessThanOrEqualTo(String value) {
            addCriterion("PTSCYZSMMJ <=", value, "ptscyzsmmj");
            return (Criteria) this;
        }

        public Criteria andPtscyzsmmjLike(String value) {
            addCriterion("PTSCYZSMMJ like", value, "ptscyzsmmj");
            return (Criteria) this;
        }

        public Criteria andPtscyzsmmjNotLike(String value) {
            addCriterion("PTSCYZSMMJ not like", value, "ptscyzsmmj");
            return (Criteria) this;
        }

        public Criteria andPtscyzsmmjIn(List<String> values) {
            addCriterion("PTSCYZSMMJ in", values, "ptscyzsmmj");
            return (Criteria) this;
        }

        public Criteria andPtscyzsmmjNotIn(List<String> values) {
            addCriterion("PTSCYZSMMJ not in", values, "ptscyzsmmj");
            return (Criteria) this;
        }

        public Criteria andPtscyzsmmjBetween(String value1, String value2) {
            addCriterion("PTSCYZSMMJ between", value1, value2, "ptscyzsmmj");
            return (Criteria) this;
        }

        public Criteria andPtscyzsmmjNotBetween(String value1, String value2) {
            addCriterion("PTSCYZSMMJ not between", value1, value2, "ptscyzsmmj");
            return (Criteria) this;
        }

        public Criteria andSylIsNull() {
            addCriterion("SYL is null");
            return (Criteria) this;
        }

        public Criteria andSylIsNotNull() {
            addCriterion("SYL is not null");
            return (Criteria) this;
        }

        public Criteria andSylEqualTo(String value) {
            addCriterion("SYL =", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylNotEqualTo(String value) {
            addCriterion("SYL <>", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylGreaterThan(String value) {
            addCriterion("SYL >", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylGreaterThanOrEqualTo(String value) {
            addCriterion("SYL >=", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylLessThan(String value) {
            addCriterion("SYL <", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylLessThanOrEqualTo(String value) {
            addCriterion("SYL <=", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylLike(String value) {
            addCriterion("SYL like", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylNotLike(String value) {
            addCriterion("SYL not like", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylIn(List<String> values) {
            addCriterion("SYL in", values, "syl");
            return (Criteria) this;
        }

        public Criteria andSylNotIn(List<String> values) {
            addCriterion("SYL not in", values, "syl");
            return (Criteria) this;
        }

        public Criteria andSylBetween(String value1, String value2) {
            addCriterion("SYL between", value1, value2, "syl");
            return (Criteria) this;
        }

        public Criteria andSylNotBetween(String value1, String value2) {
            addCriterion("SYL not between", value1, value2, "syl");
            return (Criteria) this;
        }

        public Criteria andSyzqIsNull() {
            addCriterion("SYZQ is null");
            return (Criteria) this;
        }

        public Criteria andSyzqIsNotNull() {
            addCriterion("SYZQ is not null");
            return (Criteria) this;
        }

        public Criteria andSyzqEqualTo(String value) {
            addCriterion("SYZQ =", value, "syzq");
            return (Criteria) this;
        }

        public Criteria andSyzqNotEqualTo(String value) {
            addCriterion("SYZQ <>", value, "syzq");
            return (Criteria) this;
        }

        public Criteria andSyzqGreaterThan(String value) {
            addCriterion("SYZQ >", value, "syzq");
            return (Criteria) this;
        }

        public Criteria andSyzqGreaterThanOrEqualTo(String value) {
            addCriterion("SYZQ >=", value, "syzq");
            return (Criteria) this;
        }

        public Criteria andSyzqLessThan(String value) {
            addCriterion("SYZQ <", value, "syzq");
            return (Criteria) this;
        }

        public Criteria andSyzqLessThanOrEqualTo(String value) {
            addCriterion("SYZQ <=", value, "syzq");
            return (Criteria) this;
        }

        public Criteria andSyzqLike(String value) {
            addCriterion("SYZQ like", value, "syzq");
            return (Criteria) this;
        }

        public Criteria andSyzqNotLike(String value) {
            addCriterion("SYZQ not like", value, "syzq");
            return (Criteria) this;
        }

        public Criteria andSyzqIn(List<String> values) {
            addCriterion("SYZQ in", values, "syzq");
            return (Criteria) this;
        }

        public Criteria andSyzqNotIn(List<String> values) {
            addCriterion("SYZQ not in", values, "syzq");
            return (Criteria) this;
        }

        public Criteria andSyzqBetween(String value1, String value2) {
            addCriterion("SYZQ between", value1, value2, "syzq");
            return (Criteria) this;
        }

        public Criteria andSyzqNotBetween(String value1, String value2) {
            addCriterion("SYZQ not between", value1, value2, "syzq");
            return (Criteria) this;
        }

        public Criteria andDcyzfsszblIsNull() {
            addCriterion("DCYZFSSZBL is null");
            return (Criteria) this;
        }

        public Criteria andDcyzfsszblIsNotNull() {
            addCriterion("DCYZFSSZBL is not null");
            return (Criteria) this;
        }

        public Criteria andDcyzfsszblEqualTo(String value) {
            addCriterion("DCYZFSSZBL =", value, "dcyzfsszbl");
            return (Criteria) this;
        }

        public Criteria andDcyzfsszblNotEqualTo(String value) {
            addCriterion("DCYZFSSZBL <>", value, "dcyzfsszbl");
            return (Criteria) this;
        }

        public Criteria andDcyzfsszblGreaterThan(String value) {
            addCriterion("DCYZFSSZBL >", value, "dcyzfsszbl");
            return (Criteria) this;
        }

        public Criteria andDcyzfsszblGreaterThanOrEqualTo(String value) {
            addCriterion("DCYZFSSZBL >=", value, "dcyzfsszbl");
            return (Criteria) this;
        }

        public Criteria andDcyzfsszblLessThan(String value) {
            addCriterion("DCYZFSSZBL <", value, "dcyzfsszbl");
            return (Criteria) this;
        }

        public Criteria andDcyzfsszblLessThanOrEqualTo(String value) {
            addCriterion("DCYZFSSZBL <=", value, "dcyzfsszbl");
            return (Criteria) this;
        }

        public Criteria andDcyzfsszblLike(String value) {
            addCriterion("DCYZFSSZBL like", value, "dcyzfsszbl");
            return (Criteria) this;
        }

        public Criteria andDcyzfsszblNotLike(String value) {
            addCriterion("DCYZFSSZBL not like", value, "dcyzfsszbl");
            return (Criteria) this;
        }

        public Criteria andDcyzfsszblIn(List<String> values) {
            addCriterion("DCYZFSSZBL in", values, "dcyzfsszbl");
            return (Criteria) this;
        }

        public Criteria andDcyzfsszblNotIn(List<String> values) {
            addCriterion("DCYZFSSZBL not in", values, "dcyzfsszbl");
            return (Criteria) this;
        }

        public Criteria andDcyzfsszblBetween(String value1, String value2) {
            addCriterion("DCYZFSSZBL between", value1, value2, "dcyzfsszbl");
            return (Criteria) this;
        }

        public Criteria andDcyzfsszblNotBetween(String value1, String value2) {
            addCriterion("DCYZFSSZBL not between", value1, value2, "dcyzfsszbl");
            return (Criteria) this;
        }

        public Criteria andDlnylyIsNull() {
            addCriterion("DLNYLY is null");
            return (Criteria) this;
        }

        public Criteria andDlnylyIsNotNull() {
            addCriterion("DLNYLY is not null");
            return (Criteria) this;
        }

        public Criteria andDlnylyEqualTo(String value) {
            addCriterion("DLNYLY =", value, "dlnyly");
            return (Criteria) this;
        }

        public Criteria andDlnylyNotEqualTo(String value) {
            addCriterion("DLNYLY <>", value, "dlnyly");
            return (Criteria) this;
        }

        public Criteria andDlnylyGreaterThan(String value) {
            addCriterion("DLNYLY >", value, "dlnyly");
            return (Criteria) this;
        }

        public Criteria andDlnylyGreaterThanOrEqualTo(String value) {
            addCriterion("DLNYLY >=", value, "dlnyly");
            return (Criteria) this;
        }

        public Criteria andDlnylyLessThan(String value) {
            addCriterion("DLNYLY <", value, "dlnyly");
            return (Criteria) this;
        }

        public Criteria andDlnylyLessThanOrEqualTo(String value) {
            addCriterion("DLNYLY <=", value, "dlnyly");
            return (Criteria) this;
        }

        public Criteria andDlnylyLike(String value) {
            addCriterion("DLNYLY like", value, "dlnyly");
            return (Criteria) this;
        }

        public Criteria andDlnylyNotLike(String value) {
            addCriterion("DLNYLY not like", value, "dlnyly");
            return (Criteria) this;
        }

        public Criteria andDlnylyIn(List<String> values) {
            addCriterion("DLNYLY in", values, "dlnyly");
            return (Criteria) this;
        }

        public Criteria andDlnylyNotIn(List<String> values) {
            addCriterion("DLNYLY not in", values, "dlnyly");
            return (Criteria) this;
        }

        public Criteria andDlnylyBetween(String value1, String value2) {
            addCriterion("DLNYLY between", value1, value2, "dlnyly");
            return (Criteria) this;
        }

        public Criteria andDlnylyNotBetween(String value1, String value2) {
            addCriterion("DLNYLY not between", value1, value2, "dlnyly");
            return (Criteria) this;
        }

        public Criteria andDlscyjfIsNull() {
            addCriterion("DLSCYJF is null");
            return (Criteria) this;
        }

        public Criteria andDlscyjfIsNotNull() {
            addCriterion("DLSCYJF is not null");
            return (Criteria) this;
        }

        public Criteria andDlscyjfEqualTo(String value) {
            addCriterion("DLSCYJF =", value, "dlscyjf");
            return (Criteria) this;
        }

        public Criteria andDlscyjfNotEqualTo(String value) {
            addCriterion("DLSCYJF <>", value, "dlscyjf");
            return (Criteria) this;
        }

        public Criteria andDlscyjfGreaterThan(String value) {
            addCriterion("DLSCYJF >", value, "dlscyjf");
            return (Criteria) this;
        }

        public Criteria andDlscyjfGreaterThanOrEqualTo(String value) {
            addCriterion("DLSCYJF >=", value, "dlscyjf");
            return (Criteria) this;
        }

        public Criteria andDlscyjfLessThan(String value) {
            addCriterion("DLSCYJF <", value, "dlscyjf");
            return (Criteria) this;
        }

        public Criteria andDlscyjfLessThanOrEqualTo(String value) {
            addCriterion("DLSCYJF <=", value, "dlscyjf");
            return (Criteria) this;
        }

        public Criteria andDlscyjfLike(String value) {
            addCriterion("DLSCYJF like", value, "dlscyjf");
            return (Criteria) this;
        }

        public Criteria andDlscyjfNotLike(String value) {
            addCriterion("DLSCYJF not like", value, "dlscyjf");
            return (Criteria) this;
        }

        public Criteria andDlscyjfIn(List<String> values) {
            addCriterion("DLSCYJF in", values, "dlscyjf");
            return (Criteria) this;
        }

        public Criteria andDlscyjfNotIn(List<String> values) {
            addCriterion("DLSCYJF not in", values, "dlscyjf");
            return (Criteria) this;
        }

        public Criteria andDlscyjfBetween(String value1, String value2) {
            addCriterion("DLSCYJF between", value1, value2, "dlscyjf");
            return (Criteria) this;
        }

        public Criteria andDlscyjfNotBetween(String value1, String value2) {
            addCriterion("DLSCYJF not between", value1, value2, "dlscyjf");
            return (Criteria) this;
        }

        public Criteria andDlwclIsNull() {
            addCriterion("DLWCL is null");
            return (Criteria) this;
        }

        public Criteria andDlwclIsNotNull() {
            addCriterion("DLWCL is not null");
            return (Criteria) this;
        }

        public Criteria andDlwclEqualTo(String value) {
            addCriterion("DLWCL =", value, "dlwcl");
            return (Criteria) this;
        }

        public Criteria andDlwclNotEqualTo(String value) {
            addCriterion("DLWCL <>", value, "dlwcl");
            return (Criteria) this;
        }

        public Criteria andDlwclGreaterThan(String value) {
            addCriterion("DLWCL >", value, "dlwcl");
            return (Criteria) this;
        }

        public Criteria andDlwclGreaterThanOrEqualTo(String value) {
            addCriterion("DLWCL >=", value, "dlwcl");
            return (Criteria) this;
        }

        public Criteria andDlwclLessThan(String value) {
            addCriterion("DLWCL <", value, "dlwcl");
            return (Criteria) this;
        }

        public Criteria andDlwclLessThanOrEqualTo(String value) {
            addCriterion("DLWCL <=", value, "dlwcl");
            return (Criteria) this;
        }

        public Criteria andDlwclLike(String value) {
            addCriterion("DLWCL like", value, "dlwcl");
            return (Criteria) this;
        }

        public Criteria andDlwclNotLike(String value) {
            addCriterion("DLWCL not like", value, "dlwcl");
            return (Criteria) this;
        }

        public Criteria andDlwclIn(List<String> values) {
            addCriterion("DLWCL in", values, "dlwcl");
            return (Criteria) this;
        }

        public Criteria andDlwclNotIn(List<String> values) {
            addCriterion("DLWCL not in", values, "dlwcl");
            return (Criteria) this;
        }

        public Criteria andDlwclBetween(String value1, String value2) {
            addCriterion("DLWCL between", value1, value2, "dlwcl");
            return (Criteria) this;
        }

        public Criteria andDlwclNotBetween(String value1, String value2) {
            addCriterion("DLWCL not between", value1, value2, "dlwcl");
            return (Criteria) this;
        }

        public Criteria andGqfYzfsszblIsNull() {
            addCriterion("GQF_YZFSSZBL is null");
            return (Criteria) this;
        }

        public Criteria andGqfYzfsszblIsNotNull() {
            addCriterion("GQF_YZFSSZBL is not null");
            return (Criteria) this;
        }

        public Criteria andGqfYzfsszblEqualTo(String value) {
            addCriterion("GQF_YZFSSZBL =", value, "gqfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andGqfYzfsszblNotEqualTo(String value) {
            addCriterion("GQF_YZFSSZBL <>", value, "gqfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andGqfYzfsszblGreaterThan(String value) {
            addCriterion("GQF_YZFSSZBL >", value, "gqfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andGqfYzfsszblGreaterThanOrEqualTo(String value) {
            addCriterion("GQF_YZFSSZBL >=", value, "gqfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andGqfYzfsszblLessThan(String value) {
            addCriterion("GQF_YZFSSZBL <", value, "gqfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andGqfYzfsszblLessThanOrEqualTo(String value) {
            addCriterion("GQF_YZFSSZBL <=", value, "gqfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andGqfYzfsszblLike(String value) {
            addCriterion("GQF_YZFSSZBL like", value, "gqfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andGqfYzfsszblNotLike(String value) {
            addCriterion("GQF_YZFSSZBL not like", value, "gqfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andGqfYzfsszblIn(List<String> values) {
            addCriterion("GQF_YZFSSZBL in", values, "gqfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andGqfYzfsszblNotIn(List<String> values) {
            addCriterion("GQF_YZFSSZBL not in", values, "gqfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andGqfYzfsszblBetween(String value1, String value2) {
            addCriterion("GQF_YZFSSZBL between", value1, value2, "gqfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andGqfYzfsszblNotBetween(String value1, String value2) {
            addCriterion("GQF_YZFSSZBL not between", value1, value2, "gqfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andGqfZjlylIsNull() {
            addCriterion("GQF_ZJLYL is null");
            return (Criteria) this;
        }

        public Criteria andGqfZjlylIsNotNull() {
            addCriterion("GQF_ZJLYL is not null");
            return (Criteria) this;
        }

        public Criteria andGqfZjlylEqualTo(String value) {
            addCriterion("GQF_ZJLYL =", value, "gqfZjlyl");
            return (Criteria) this;
        }

        public Criteria andGqfZjlylNotEqualTo(String value) {
            addCriterion("GQF_ZJLYL <>", value, "gqfZjlyl");
            return (Criteria) this;
        }

        public Criteria andGqfZjlylGreaterThan(String value) {
            addCriterion("GQF_ZJLYL >", value, "gqfZjlyl");
            return (Criteria) this;
        }

        public Criteria andGqfZjlylGreaterThanOrEqualTo(String value) {
            addCriterion("GQF_ZJLYL >=", value, "gqfZjlyl");
            return (Criteria) this;
        }

        public Criteria andGqfZjlylLessThan(String value) {
            addCriterion("GQF_ZJLYL <", value, "gqfZjlyl");
            return (Criteria) this;
        }

        public Criteria andGqfZjlylLessThanOrEqualTo(String value) {
            addCriterion("GQF_ZJLYL <=", value, "gqfZjlyl");
            return (Criteria) this;
        }

        public Criteria andGqfZjlylLike(String value) {
            addCriterion("GQF_ZJLYL like", value, "gqfZjlyl");
            return (Criteria) this;
        }

        public Criteria andGqfZjlylNotLike(String value) {
            addCriterion("GQF_ZJLYL not like", value, "gqfZjlyl");
            return (Criteria) this;
        }

        public Criteria andGqfZjlylIn(List<String> values) {
            addCriterion("GQF_ZJLYL in", values, "gqfZjlyl");
            return (Criteria) this;
        }

        public Criteria andGqfZjlylNotIn(List<String> values) {
            addCriterion("GQF_ZJLYL not in", values, "gqfZjlyl");
            return (Criteria) this;
        }

        public Criteria andGqfZjlylBetween(String value1, String value2) {
            addCriterion("GQF_ZJLYL between", value1, value2, "gqfZjlyl");
            return (Criteria) this;
        }

        public Criteria andGqfZjlylNotBetween(String value1, String value2) {
            addCriterion("GQF_ZJLYL not between", value1, value2, "gqfZjlyl");
            return (Criteria) this;
        }

        public Criteria andGqfScyjflIsNull() {
            addCriterion("GQF_SCYJFL is null");
            return (Criteria) this;
        }

        public Criteria andGqfScyjflIsNotNull() {
            addCriterion("GQF_SCYJFL is not null");
            return (Criteria) this;
        }

        public Criteria andGqfScyjflEqualTo(String value) {
            addCriterion("GQF_SCYJFL =", value, "gqfScyjfl");
            return (Criteria) this;
        }

        public Criteria andGqfScyjflNotEqualTo(String value) {
            addCriterion("GQF_SCYJFL <>", value, "gqfScyjfl");
            return (Criteria) this;
        }

        public Criteria andGqfScyjflGreaterThan(String value) {
            addCriterion("GQF_SCYJFL >", value, "gqfScyjfl");
            return (Criteria) this;
        }

        public Criteria andGqfScyjflGreaterThanOrEqualTo(String value) {
            addCriterion("GQF_SCYJFL >=", value, "gqfScyjfl");
            return (Criteria) this;
        }

        public Criteria andGqfScyjflLessThan(String value) {
            addCriterion("GQF_SCYJFL <", value, "gqfScyjfl");
            return (Criteria) this;
        }

        public Criteria andGqfScyjflLessThanOrEqualTo(String value) {
            addCriterion("GQF_SCYJFL <=", value, "gqfScyjfl");
            return (Criteria) this;
        }

        public Criteria andGqfScyjflLike(String value) {
            addCriterion("GQF_SCYJFL like", value, "gqfScyjfl");
            return (Criteria) this;
        }

        public Criteria andGqfScyjflNotLike(String value) {
            addCriterion("GQF_SCYJFL not like", value, "gqfScyjfl");
            return (Criteria) this;
        }

        public Criteria andGqfScyjflIn(List<String> values) {
            addCriterion("GQF_SCYJFL in", values, "gqfScyjfl");
            return (Criteria) this;
        }

        public Criteria andGqfScyjflNotIn(List<String> values) {
            addCriterion("GQF_SCYJFL not in", values, "gqfScyjfl");
            return (Criteria) this;
        }

        public Criteria andGqfScyjflBetween(String value1, String value2) {
            addCriterion("GQF_SCYJFL between", value1, value2, "gqfScyjfl");
            return (Criteria) this;
        }

        public Criteria andGqfScyjflNotBetween(String value1, String value2) {
            addCriterion("GQF_SCYJFL not between", value1, value2, "gqfScyjfl");
            return (Criteria) this;
        }

        public Criteria andGqfSczqlIsNull() {
            addCriterion("GQF_SCZQL is null");
            return (Criteria) this;
        }

        public Criteria andGqfSczqlIsNotNull() {
            addCriterion("GQF_SCZQL is not null");
            return (Criteria) this;
        }

        public Criteria andGqfSczqlEqualTo(String value) {
            addCriterion("GQF_SCZQL =", value, "gqfSczql");
            return (Criteria) this;
        }

        public Criteria andGqfSczqlNotEqualTo(String value) {
            addCriterion("GQF_SCZQL <>", value, "gqfSczql");
            return (Criteria) this;
        }

        public Criteria andGqfSczqlGreaterThan(String value) {
            addCriterion("GQF_SCZQL >", value, "gqfSczql");
            return (Criteria) this;
        }

        public Criteria andGqfSczqlGreaterThanOrEqualTo(String value) {
            addCriterion("GQF_SCZQL >=", value, "gqfSczql");
            return (Criteria) this;
        }

        public Criteria andGqfSczqlLessThan(String value) {
            addCriterion("GQF_SCZQL <", value, "gqfSczql");
            return (Criteria) this;
        }

        public Criteria andGqfSczqlLessThanOrEqualTo(String value) {
            addCriterion("GQF_SCZQL <=", value, "gqfSczql");
            return (Criteria) this;
        }

        public Criteria andGqfSczqlLike(String value) {
            addCriterion("GQF_SCZQL like", value, "gqfSczql");
            return (Criteria) this;
        }

        public Criteria andGqfSczqlNotLike(String value) {
            addCriterion("GQF_SCZQL not like", value, "gqfSczql");
            return (Criteria) this;
        }

        public Criteria andGqfSczqlIn(List<String> values) {
            addCriterion("GQF_SCZQL in", values, "gqfSczql");
            return (Criteria) this;
        }

        public Criteria andGqfSczqlNotIn(List<String> values) {
            addCriterion("GQF_SCZQL not in", values, "gqfSczql");
            return (Criteria) this;
        }

        public Criteria andGqfSczqlBetween(String value1, String value2) {
            addCriterion("GQF_SCZQL between", value1, value2, "gqfSczql");
            return (Criteria) this;
        }

        public Criteria andGqfSczqlNotBetween(String value1, String value2) {
            addCriterion("GQF_SCZQL not between", value1, value2, "gqfSczql");
            return (Criteria) this;
        }

        public Criteria andGqfWcllIsNull() {
            addCriterion("GQF_WCLL is null");
            return (Criteria) this;
        }

        public Criteria andGqfWcllIsNotNull() {
            addCriterion("GQF_WCLL is not null");
            return (Criteria) this;
        }

        public Criteria andGqfWcllEqualTo(String value) {
            addCriterion("GQF_WCLL =", value, "gqfWcll");
            return (Criteria) this;
        }

        public Criteria andGqfWcllNotEqualTo(String value) {
            addCriterion("GQF_WCLL <>", value, "gqfWcll");
            return (Criteria) this;
        }

        public Criteria andGqfWcllGreaterThan(String value) {
            addCriterion("GQF_WCLL >", value, "gqfWcll");
            return (Criteria) this;
        }

        public Criteria andGqfWcllGreaterThanOrEqualTo(String value) {
            addCriterion("GQF_WCLL >=", value, "gqfWcll");
            return (Criteria) this;
        }

        public Criteria andGqfWcllLessThan(String value) {
            addCriterion("GQF_WCLL <", value, "gqfWcll");
            return (Criteria) this;
        }

        public Criteria andGqfWcllLessThanOrEqualTo(String value) {
            addCriterion("GQF_WCLL <=", value, "gqfWcll");
            return (Criteria) this;
        }

        public Criteria andGqfWcllLike(String value) {
            addCriterion("GQF_WCLL like", value, "gqfWcll");
            return (Criteria) this;
        }

        public Criteria andGqfWcllNotLike(String value) {
            addCriterion("GQF_WCLL not like", value, "gqfWcll");
            return (Criteria) this;
        }

        public Criteria andGqfWcllIn(List<String> values) {
            addCriterion("GQF_WCLL in", values, "gqfWcll");
            return (Criteria) this;
        }

        public Criteria andGqfWcllNotIn(List<String> values) {
            addCriterion("GQF_WCLL not in", values, "gqfWcll");
            return (Criteria) this;
        }

        public Criteria andGqfWcllBetween(String value1, String value2) {
            addCriterion("GQF_WCLL between", value1, value2, "gqfWcll");
            return (Criteria) this;
        }

        public Criteria andGqfWcllNotBetween(String value1, String value2) {
            addCriterion("GQF_WCLL not between", value1, value2, "gqfWcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsZjnylylIsNull() {
            addCriterion("GQFWS_ZJNYLYL is null");
            return (Criteria) this;
        }

        public Criteria andGqfwsZjnylylIsNotNull() {
            addCriterion("GQFWS_ZJNYLYL is not null");
            return (Criteria) this;
        }

        public Criteria andGqfwsZjnylylEqualTo(String value) {
            addCriterion("GQFWS_ZJNYLYL =", value, "gqfwsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsZjnylylNotEqualTo(String value) {
            addCriterion("GQFWS_ZJNYLYL <>", value, "gqfwsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsZjnylylGreaterThan(String value) {
            addCriterion("GQFWS_ZJNYLYL >", value, "gqfwsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsZjnylylGreaterThanOrEqualTo(String value) {
            addCriterion("GQFWS_ZJNYLYL >=", value, "gqfwsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsZjnylylLessThan(String value) {
            addCriterion("GQFWS_ZJNYLYL <", value, "gqfwsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsZjnylylLessThanOrEqualTo(String value) {
            addCriterion("GQFWS_ZJNYLYL <=", value, "gqfwsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsZjnylylLike(String value) {
            addCriterion("GQFWS_ZJNYLYL like", value, "gqfwsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsZjnylylNotLike(String value) {
            addCriterion("GQFWS_ZJNYLYL not like", value, "gqfwsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsZjnylylIn(List<String> values) {
            addCriterion("GQFWS_ZJNYLYL in", values, "gqfwsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsZjnylylNotIn(List<String> values) {
            addCriterion("GQFWS_ZJNYLYL not in", values, "gqfwsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsZjnylylBetween(String value1, String value2) {
            addCriterion("GQFWS_ZJNYLYL between", value1, value2, "gqfwsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsZjnylylNotBetween(String value1, String value2) {
            addCriterion("GQFWS_ZJNYLYL not between", value1, value2, "gqfwsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYycllIsNull() {
            addCriterion("GQFWS_YYCLL is null");
            return (Criteria) this;
        }

        public Criteria andGqfwsYycllIsNotNull() {
            addCriterion("GQFWS_YYCLL is not null");
            return (Criteria) this;
        }

        public Criteria andGqfwsYycllEqualTo(String value) {
            addCriterion("GQFWS_YYCLL =", value, "gqfwsYycll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYycllNotEqualTo(String value) {
            addCriterion("GQFWS_YYCLL <>", value, "gqfwsYycll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYycllGreaterThan(String value) {
            addCriterion("GQFWS_YYCLL >", value, "gqfwsYycll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYycllGreaterThanOrEqualTo(String value) {
            addCriterion("GQFWS_YYCLL >=", value, "gqfwsYycll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYycllLessThan(String value) {
            addCriterion("GQFWS_YYCLL <", value, "gqfwsYycll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYycllLessThanOrEqualTo(String value) {
            addCriterion("GQFWS_YYCLL <=", value, "gqfwsYycll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYycllLike(String value) {
            addCriterion("GQFWS_YYCLL like", value, "gqfwsYycll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYycllNotLike(String value) {
            addCriterion("GQFWS_YYCLL not like", value, "gqfwsYycll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYycllIn(List<String> values) {
            addCriterion("GQFWS_YYCLL in", values, "gqfwsYycll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYycllNotIn(List<String> values) {
            addCriterion("GQFWS_YYCLL not in", values, "gqfwsYycll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYycllBetween(String value1, String value2) {
            addCriterion("GQFWS_YYCLL between", value1, value2, "gqfwsYycll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYycllNotBetween(String value1, String value2) {
            addCriterion("GQFWS_YYCLL not between", value1, value2, "gqfwsYycll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyNylylIsNull() {
            addCriterion("GQFWS_YY_NYLYL is null");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyNylylIsNotNull() {
            addCriterion("GQFWS_YY_NYLYL is not null");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyNylylEqualTo(String value) {
            addCriterion("GQFWS_YY_NYLYL =", value, "gqfwsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyNylylNotEqualTo(String value) {
            addCriterion("GQFWS_YY_NYLYL <>", value, "gqfwsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyNylylGreaterThan(String value) {
            addCriterion("GQFWS_YY_NYLYL >", value, "gqfwsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyNylylGreaterThanOrEqualTo(String value) {
            addCriterion("GQFWS_YY_NYLYL >=", value, "gqfwsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyNylylLessThan(String value) {
            addCriterion("GQFWS_YY_NYLYL <", value, "gqfwsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyNylylLessThanOrEqualTo(String value) {
            addCriterion("GQFWS_YY_NYLYL <=", value, "gqfwsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyNylylLike(String value) {
            addCriterion("GQFWS_YY_NYLYL like", value, "gqfwsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyNylylNotLike(String value) {
            addCriterion("GQFWS_YY_NYLYL not like", value, "gqfwsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyNylylIn(List<String> values) {
            addCriterion("GQFWS_YY_NYLYL in", values, "gqfwsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyNylylNotIn(List<String> values) {
            addCriterion("GQFWS_YY_NYLYL not in", values, "gqfwsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyNylylBetween(String value1, String value2) {
            addCriterion("GQFWS_YY_NYLYL between", value1, value2, "gqfwsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyNylylNotBetween(String value1, String value2) {
            addCriterion("GQFWS_YY_NYLYL not between", value1, value2, "gqfwsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHylylIsNull() {
            addCriterion("GQFWS_YY_HYLYL is null");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHylylIsNotNull() {
            addCriterion("GQFWS_YY_HYLYL is not null");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHylylEqualTo(String value) {
            addCriterion("GQFWS_YY_HYLYL =", value, "gqfwsYyHylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHylylNotEqualTo(String value) {
            addCriterion("GQFWS_YY_HYLYL <>", value, "gqfwsYyHylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHylylGreaterThan(String value) {
            addCriterion("GQFWS_YY_HYLYL >", value, "gqfwsYyHylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHylylGreaterThanOrEqualTo(String value) {
            addCriterion("GQFWS_YY_HYLYL >=", value, "gqfwsYyHylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHylylLessThan(String value) {
            addCriterion("GQFWS_YY_HYLYL <", value, "gqfwsYyHylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHylylLessThanOrEqualTo(String value) {
            addCriterion("GQFWS_YY_HYLYL <=", value, "gqfwsYyHylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHylylLike(String value) {
            addCriterion("GQFWS_YY_HYLYL like", value, "gqfwsYyHylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHylylNotLike(String value) {
            addCriterion("GQFWS_YY_HYLYL not like", value, "gqfwsYyHylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHylylIn(List<String> values) {
            addCriterion("GQFWS_YY_HYLYL in", values, "gqfwsYyHylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHylylNotIn(List<String> values) {
            addCriterion("GQFWS_YY_HYLYL not in", values, "gqfwsYyHylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHylylBetween(String value1, String value2) {
            addCriterion("GQFWS_YY_HYLYL between", value1, value2, "gqfwsYyHylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHylylNotBetween(String value1, String value2) {
            addCriterion("GQFWS_YY_HYLYL not between", value1, value2, "gqfwsYyHylyl");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHySdcllIsNull() {
            addCriterion("GQFWS_YY_HY_SDCLL is null");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHySdcllIsNotNull() {
            addCriterion("GQFWS_YY_HY_SDCLL is not null");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHySdcllEqualTo(String value) {
            addCriterion("GQFWS_YY_HY_SDCLL =", value, "gqfwsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHySdcllNotEqualTo(String value) {
            addCriterion("GQFWS_YY_HY_SDCLL <>", value, "gqfwsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHySdcllGreaterThan(String value) {
            addCriterion("GQFWS_YY_HY_SDCLL >", value, "gqfwsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHySdcllGreaterThanOrEqualTo(String value) {
            addCriterion("GQFWS_YY_HY_SDCLL >=", value, "gqfwsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHySdcllLessThan(String value) {
            addCriterion("GQFWS_YY_HY_SDCLL <", value, "gqfwsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHySdcllLessThanOrEqualTo(String value) {
            addCriterion("GQFWS_YY_HY_SDCLL <=", value, "gqfwsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHySdcllLike(String value) {
            addCriterion("GQFWS_YY_HY_SDCLL like", value, "gqfwsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHySdcllNotLike(String value) {
            addCriterion("GQFWS_YY_HY_SDCLL not like", value, "gqfwsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHySdcllIn(List<String> values) {
            addCriterion("GQFWS_YY_HY_SDCLL in", values, "gqfwsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHySdcllNotIn(List<String> values) {
            addCriterion("GQFWS_YY_HY_SDCLL not in", values, "gqfwsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHySdcllBetween(String value1, String value2) {
            addCriterion("GQFWS_YY_HY_SDCLL between", value1, value2, "gqfwsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsYyHySdcllNotBetween(String value1, String value2) {
            addCriterion("GQFWS_YY_HY_SDCLL not between", value1, value2, "gqfwsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsWcllIsNull() {
            addCriterion("GQFWS_WCLL is null");
            return (Criteria) this;
        }

        public Criteria andGqfwsWcllIsNotNull() {
            addCriterion("GQFWS_WCLL is not null");
            return (Criteria) this;
        }

        public Criteria andGqfwsWcllEqualTo(String value) {
            addCriterion("GQFWS_WCLL =", value, "gqfwsWcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsWcllNotEqualTo(String value) {
            addCriterion("GQFWS_WCLL <>", value, "gqfwsWcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsWcllGreaterThan(String value) {
            addCriterion("GQFWS_WCLL >", value, "gqfwsWcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsWcllGreaterThanOrEqualTo(String value) {
            addCriterion("GQFWS_WCLL >=", value, "gqfwsWcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsWcllLessThan(String value) {
            addCriterion("GQFWS_WCLL <", value, "gqfwsWcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsWcllLessThanOrEqualTo(String value) {
            addCriterion("GQFWS_WCLL <=", value, "gqfwsWcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsWcllLike(String value) {
            addCriterion("GQFWS_WCLL like", value, "gqfwsWcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsWcllNotLike(String value) {
            addCriterion("GQFWS_WCLL not like", value, "gqfwsWcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsWcllIn(List<String> values) {
            addCriterion("GQFWS_WCLL in", values, "gqfwsWcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsWcllNotIn(List<String> values) {
            addCriterion("GQFWS_WCLL not in", values, "gqfwsWcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsWcllBetween(String value1, String value2) {
            addCriterion("GQFWS_WCLL between", value1, value2, "gqfwsWcll");
            return (Criteria) this;
        }

        public Criteria andGqfwsWcllNotBetween(String value1, String value2) {
            addCriterion("GQFWS_WCLL not between", value1, value2, "gqfwsWcll");
            return (Criteria) this;
        }

        public Criteria andScfYzfsszblIsNull() {
            addCriterion("SCF_YZFSSZBL is null");
            return (Criteria) this;
        }

        public Criteria andScfYzfsszblIsNotNull() {
            addCriterion("SCF_YZFSSZBL is not null");
            return (Criteria) this;
        }

        public Criteria andScfYzfsszblEqualTo(String value) {
            addCriterion("SCF_YZFSSZBL =", value, "scfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andScfYzfsszblNotEqualTo(String value) {
            addCriterion("SCF_YZFSSZBL <>", value, "scfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andScfYzfsszblGreaterThan(String value) {
            addCriterion("SCF_YZFSSZBL >", value, "scfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andScfYzfsszblGreaterThanOrEqualTo(String value) {
            addCriterion("SCF_YZFSSZBL >=", value, "scfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andScfYzfsszblLessThan(String value) {
            addCriterion("SCF_YZFSSZBL <", value, "scfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andScfYzfsszblLessThanOrEqualTo(String value) {
            addCriterion("SCF_YZFSSZBL <=", value, "scfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andScfYzfsszblLike(String value) {
            addCriterion("SCF_YZFSSZBL like", value, "scfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andScfYzfsszblNotLike(String value) {
            addCriterion("SCF_YZFSSZBL not like", value, "scfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andScfYzfsszblIn(List<String> values) {
            addCriterion("SCF_YZFSSZBL in", values, "scfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andScfYzfsszblNotIn(List<String> values) {
            addCriterion("SCF_YZFSSZBL not in", values, "scfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andScfYzfsszblBetween(String value1, String value2) {
            addCriterion("SCF_YZFSSZBL between", value1, value2, "scfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andScfYzfsszblNotBetween(String value1, String value2) {
            addCriterion("SCF_YZFSSZBL not between", value1, value2, "scfYzfsszbl");
            return (Criteria) this;
        }

        public Criteria andScfZjnylylIsNull() {
            addCriterion("SCF_ZJNYLYL is null");
            return (Criteria) this;
        }

        public Criteria andScfZjnylylIsNotNull() {
            addCriterion("SCF_ZJNYLYL is not null");
            return (Criteria) this;
        }

        public Criteria andScfZjnylylEqualTo(String value) {
            addCriterion("SCF_ZJNYLYL =", value, "scfZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfZjnylylNotEqualTo(String value) {
            addCriterion("SCF_ZJNYLYL <>", value, "scfZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfZjnylylGreaterThan(String value) {
            addCriterion("SCF_ZJNYLYL >", value, "scfZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfZjnylylGreaterThanOrEqualTo(String value) {
            addCriterion("SCF_ZJNYLYL >=", value, "scfZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfZjnylylLessThan(String value) {
            addCriterion("SCF_ZJNYLYL <", value, "scfZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfZjnylylLessThanOrEqualTo(String value) {
            addCriterion("SCF_ZJNYLYL <=", value, "scfZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfZjnylylLike(String value) {
            addCriterion("SCF_ZJNYLYL like", value, "scfZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfZjnylylNotLike(String value) {
            addCriterion("SCF_ZJNYLYL not like", value, "scfZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfZjnylylIn(List<String> values) {
            addCriterion("SCF_ZJNYLYL in", values, "scfZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfZjnylylNotIn(List<String> values) {
            addCriterion("SCF_ZJNYLYL not in", values, "scfZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfZjnylylBetween(String value1, String value2) {
            addCriterion("SCF_ZJNYLYL between", value1, value2, "scfZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfZjnylylNotBetween(String value1, String value2) {
            addCriterion("SCF_ZJNYLYL not between", value1, value2, "scfZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfScyjflIsNull() {
            addCriterion("SCF_SCYJFL is null");
            return (Criteria) this;
        }

        public Criteria andScfScyjflIsNotNull() {
            addCriterion("SCF_SCYJFL is not null");
            return (Criteria) this;
        }

        public Criteria andScfScyjflEqualTo(String value) {
            addCriterion("SCF_SCYJFL =", value, "scfScyjfl");
            return (Criteria) this;
        }

        public Criteria andScfScyjflNotEqualTo(String value) {
            addCriterion("SCF_SCYJFL <>", value, "scfScyjfl");
            return (Criteria) this;
        }

        public Criteria andScfScyjflGreaterThan(String value) {
            addCriterion("SCF_SCYJFL >", value, "scfScyjfl");
            return (Criteria) this;
        }

        public Criteria andScfScyjflGreaterThanOrEqualTo(String value) {
            addCriterion("SCF_SCYJFL >=", value, "scfScyjfl");
            return (Criteria) this;
        }

        public Criteria andScfScyjflLessThan(String value) {
            addCriterion("SCF_SCYJFL <", value, "scfScyjfl");
            return (Criteria) this;
        }

        public Criteria andScfScyjflLessThanOrEqualTo(String value) {
            addCriterion("SCF_SCYJFL <=", value, "scfScyjfl");
            return (Criteria) this;
        }

        public Criteria andScfScyjflLike(String value) {
            addCriterion("SCF_SCYJFL like", value, "scfScyjfl");
            return (Criteria) this;
        }

        public Criteria andScfScyjflNotLike(String value) {
            addCriterion("SCF_SCYJFL not like", value, "scfScyjfl");
            return (Criteria) this;
        }

        public Criteria andScfScyjflIn(List<String> values) {
            addCriterion("SCF_SCYJFL in", values, "scfScyjfl");
            return (Criteria) this;
        }

        public Criteria andScfScyjflNotIn(List<String> values) {
            addCriterion("SCF_SCYJFL not in", values, "scfScyjfl");
            return (Criteria) this;
        }

        public Criteria andScfScyjflBetween(String value1, String value2) {
            addCriterion("SCF_SCYJFL between", value1, value2, "scfScyjfl");
            return (Criteria) this;
        }

        public Criteria andScfScyjflNotBetween(String value1, String value2) {
            addCriterion("SCF_SCYJFL not between", value1, value2, "scfScyjfl");
            return (Criteria) this;
        }

        public Criteria andScfSczqlIsNull() {
            addCriterion("SCF_SCZQL is null");
            return (Criteria) this;
        }

        public Criteria andScfSczqlIsNotNull() {
            addCriterion("SCF_SCZQL is not null");
            return (Criteria) this;
        }

        public Criteria andScfSczqlEqualTo(String value) {
            addCriterion("SCF_SCZQL =", value, "scfSczql");
            return (Criteria) this;
        }

        public Criteria andScfSczqlNotEqualTo(String value) {
            addCriterion("SCF_SCZQL <>", value, "scfSczql");
            return (Criteria) this;
        }

        public Criteria andScfSczqlGreaterThan(String value) {
            addCriterion("SCF_SCZQL >", value, "scfSczql");
            return (Criteria) this;
        }

        public Criteria andScfSczqlGreaterThanOrEqualTo(String value) {
            addCriterion("SCF_SCZQL >=", value, "scfSczql");
            return (Criteria) this;
        }

        public Criteria andScfSczqlLessThan(String value) {
            addCriterion("SCF_SCZQL <", value, "scfSczql");
            return (Criteria) this;
        }

        public Criteria andScfSczqlLessThanOrEqualTo(String value) {
            addCriterion("SCF_SCZQL <=", value, "scfSczql");
            return (Criteria) this;
        }

        public Criteria andScfSczqlLike(String value) {
            addCriterion("SCF_SCZQL like", value, "scfSczql");
            return (Criteria) this;
        }

        public Criteria andScfSczqlNotLike(String value) {
            addCriterion("SCF_SCZQL not like", value, "scfSczql");
            return (Criteria) this;
        }

        public Criteria andScfSczqlIn(List<String> values) {
            addCriterion("SCF_SCZQL in", values, "scfSczql");
            return (Criteria) this;
        }

        public Criteria andScfSczqlNotIn(List<String> values) {
            addCriterion("SCF_SCZQL not in", values, "scfSczql");
            return (Criteria) this;
        }

        public Criteria andScfSczqlBetween(String value1, String value2) {
            addCriterion("SCF_SCZQL between", value1, value2, "scfSczql");
            return (Criteria) this;
        }

        public Criteria andScfSczqlNotBetween(String value1, String value2) {
            addCriterion("SCF_SCZQL not between", value1, value2, "scfSczql");
            return (Criteria) this;
        }

        public Criteria andScfWcllIsNull() {
            addCriterion("SCF_WCLL is null");
            return (Criteria) this;
        }

        public Criteria andScfWcllIsNotNull() {
            addCriterion("SCF_WCLL is not null");
            return (Criteria) this;
        }

        public Criteria andScfWcllEqualTo(String value) {
            addCriterion("SCF_WCLL =", value, "scfWcll");
            return (Criteria) this;
        }

        public Criteria andScfWcllNotEqualTo(String value) {
            addCriterion("SCF_WCLL <>", value, "scfWcll");
            return (Criteria) this;
        }

        public Criteria andScfWcllGreaterThan(String value) {
            addCriterion("SCF_WCLL >", value, "scfWcll");
            return (Criteria) this;
        }

        public Criteria andScfWcllGreaterThanOrEqualTo(String value) {
            addCriterion("SCF_WCLL >=", value, "scfWcll");
            return (Criteria) this;
        }

        public Criteria andScfWcllLessThan(String value) {
            addCriterion("SCF_WCLL <", value, "scfWcll");
            return (Criteria) this;
        }

        public Criteria andScfWcllLessThanOrEqualTo(String value) {
            addCriterion("SCF_WCLL <=", value, "scfWcll");
            return (Criteria) this;
        }

        public Criteria andScfWcllLike(String value) {
            addCriterion("SCF_WCLL like", value, "scfWcll");
            return (Criteria) this;
        }

        public Criteria andScfWcllNotLike(String value) {
            addCriterion("SCF_WCLL not like", value, "scfWcll");
            return (Criteria) this;
        }

        public Criteria andScfWcllIn(List<String> values) {
            addCriterion("SCF_WCLL in", values, "scfWcll");
            return (Criteria) this;
        }

        public Criteria andScfWcllNotIn(List<String> values) {
            addCriterion("SCF_WCLL not in", values, "scfWcll");
            return (Criteria) this;
        }

        public Criteria andScfWcllBetween(String value1, String value2) {
            addCriterion("SCF_WCLL between", value1, value2, "scfWcll");
            return (Criteria) this;
        }

        public Criteria andScfWcllNotBetween(String value1, String value2) {
            addCriterion("SCF_WCLL not between", value1, value2, "scfWcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsZjnylylIsNull() {
            addCriterion("SCFNYWS_ZJNYLYL is null");
            return (Criteria) this;
        }

        public Criteria andScfnywsZjnylylIsNotNull() {
            addCriterion("SCFNYWS_ZJNYLYL is not null");
            return (Criteria) this;
        }

        public Criteria andScfnywsZjnylylEqualTo(String value) {
            addCriterion("SCFNYWS_ZJNYLYL =", value, "scfnywsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsZjnylylNotEqualTo(String value) {
            addCriterion("SCFNYWS_ZJNYLYL <>", value, "scfnywsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsZjnylylGreaterThan(String value) {
            addCriterion("SCFNYWS_ZJNYLYL >", value, "scfnywsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsZjnylylGreaterThanOrEqualTo(String value) {
            addCriterion("SCFNYWS_ZJNYLYL >=", value, "scfnywsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsZjnylylLessThan(String value) {
            addCriterion("SCFNYWS_ZJNYLYL <", value, "scfnywsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsZjnylylLessThanOrEqualTo(String value) {
            addCriterion("SCFNYWS_ZJNYLYL <=", value, "scfnywsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsZjnylylLike(String value) {
            addCriterion("SCFNYWS_ZJNYLYL like", value, "scfnywsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsZjnylylNotLike(String value) {
            addCriterion("SCFNYWS_ZJNYLYL not like", value, "scfnywsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsZjnylylIn(List<String> values) {
            addCriterion("SCFNYWS_ZJNYLYL in", values, "scfnywsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsZjnylylNotIn(List<String> values) {
            addCriterion("SCFNYWS_ZJNYLYL not in", values, "scfnywsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsZjnylylBetween(String value1, String value2) {
            addCriterion("SCFNYWS_ZJNYLYL between", value1, value2, "scfnywsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsZjnylylNotBetween(String value1, String value2) {
            addCriterion("SCFNYWS_ZJNYLYL not between", value1, value2, "scfnywsZjnylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsYycllIsNull() {
            addCriterion("SCFNYWS_YYCLL is null");
            return (Criteria) this;
        }

        public Criteria andScfnywsYycllIsNotNull() {
            addCriterion("SCFNYWS_YYCLL is not null");
            return (Criteria) this;
        }

        public Criteria andScfnywsYycllEqualTo(String value) {
            addCriterion("SCFNYWS_YYCLL =", value, "scfnywsYycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYycllNotEqualTo(String value) {
            addCriterion("SCFNYWS_YYCLL <>", value, "scfnywsYycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYycllGreaterThan(String value) {
            addCriterion("SCFNYWS_YYCLL >", value, "scfnywsYycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYycllGreaterThanOrEqualTo(String value) {
            addCriterion("SCFNYWS_YYCLL >=", value, "scfnywsYycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYycllLessThan(String value) {
            addCriterion("SCFNYWS_YYCLL <", value, "scfnywsYycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYycllLessThanOrEqualTo(String value) {
            addCriterion("SCFNYWS_YYCLL <=", value, "scfnywsYycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYycllLike(String value) {
            addCriterion("SCFNYWS_YYCLL like", value, "scfnywsYycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYycllNotLike(String value) {
            addCriterion("SCFNYWS_YYCLL not like", value, "scfnywsYycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYycllIn(List<String> values) {
            addCriterion("SCFNYWS_YYCLL in", values, "scfnywsYycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYycllNotIn(List<String> values) {
            addCriterion("SCFNYWS_YYCLL not in", values, "scfnywsYycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYycllBetween(String value1, String value2) {
            addCriterion("SCFNYWS_YYCLL between", value1, value2, "scfnywsYycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYycllNotBetween(String value1, String value2) {
            addCriterion("SCFNYWS_YYCLL not between", value1, value2, "scfnywsYycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyNylylIsNull() {
            addCriterion("SCFNYWS_YY_NYLYL is null");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyNylylIsNotNull() {
            addCriterion("SCFNYWS_YY_NYLYL is not null");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyNylylEqualTo(String value) {
            addCriterion("SCFNYWS_YY_NYLYL =", value, "scfnywsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyNylylNotEqualTo(String value) {
            addCriterion("SCFNYWS_YY_NYLYL <>", value, "scfnywsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyNylylGreaterThan(String value) {
            addCriterion("SCFNYWS_YY_NYLYL >", value, "scfnywsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyNylylGreaterThanOrEqualTo(String value) {
            addCriterion("SCFNYWS_YY_NYLYL >=", value, "scfnywsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyNylylLessThan(String value) {
            addCriterion("SCFNYWS_YY_NYLYL <", value, "scfnywsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyNylylLessThanOrEqualTo(String value) {
            addCriterion("SCFNYWS_YY_NYLYL <=", value, "scfnywsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyNylylLike(String value) {
            addCriterion("SCFNYWS_YY_NYLYL like", value, "scfnywsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyNylylNotLike(String value) {
            addCriterion("SCFNYWS_YY_NYLYL not like", value, "scfnywsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyNylylIn(List<String> values) {
            addCriterion("SCFNYWS_YY_NYLYL in", values, "scfnywsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyNylylNotIn(List<String> values) {
            addCriterion("SCFNYWS_YY_NYLYL not in", values, "scfnywsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyNylylBetween(String value1, String value2) {
            addCriterion("SCFNYWS_YY_NYLYL between", value1, value2, "scfnywsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyNylylNotBetween(String value1, String value2) {
            addCriterion("SCFNYWS_YY_NYLYL not between", value1, value2, "scfnywsYyNylyl");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHycllIsNull() {
            addCriterion("SCFNYWS_YY_HYCLL is null");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHycllIsNotNull() {
            addCriterion("SCFNYWS_YY_HYCLL is not null");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHycllEqualTo(String value) {
            addCriterion("SCFNYWS_YY_HYCLL =", value, "scfnywsYyHycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHycllNotEqualTo(String value) {
            addCriterion("SCFNYWS_YY_HYCLL <>", value, "scfnywsYyHycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHycllGreaterThan(String value) {
            addCriterion("SCFNYWS_YY_HYCLL >", value, "scfnywsYyHycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHycllGreaterThanOrEqualTo(String value) {
            addCriterion("SCFNYWS_YY_HYCLL >=", value, "scfnywsYyHycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHycllLessThan(String value) {
            addCriterion("SCFNYWS_YY_HYCLL <", value, "scfnywsYyHycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHycllLessThanOrEqualTo(String value) {
            addCriterion("SCFNYWS_YY_HYCLL <=", value, "scfnywsYyHycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHycllLike(String value) {
            addCriterion("SCFNYWS_YY_HYCLL like", value, "scfnywsYyHycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHycllNotLike(String value) {
            addCriterion("SCFNYWS_YY_HYCLL not like", value, "scfnywsYyHycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHycllIn(List<String> values) {
            addCriterion("SCFNYWS_YY_HYCLL in", values, "scfnywsYyHycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHycllNotIn(List<String> values) {
            addCriterion("SCFNYWS_YY_HYCLL not in", values, "scfnywsYyHycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHycllBetween(String value1, String value2) {
            addCriterion("SCFNYWS_YY_HYCLL between", value1, value2, "scfnywsYyHycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHycllNotBetween(String value1, String value2) {
            addCriterion("SCFNYWS_YY_HYCLL not between", value1, value2, "scfnywsYyHycll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHySdcllIsNull() {
            addCriterion("SCFNYWS_YY_HY_SDCLL is null");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHySdcllIsNotNull() {
            addCriterion("SCFNYWS_YY_HY_SDCLL is not null");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHySdcllEqualTo(String value) {
            addCriterion("SCFNYWS_YY_HY_SDCLL =", value, "scfnywsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHySdcllNotEqualTo(String value) {
            addCriterion("SCFNYWS_YY_HY_SDCLL <>", value, "scfnywsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHySdcllGreaterThan(String value) {
            addCriterion("SCFNYWS_YY_HY_SDCLL >", value, "scfnywsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHySdcllGreaterThanOrEqualTo(String value) {
            addCriterion("SCFNYWS_YY_HY_SDCLL >=", value, "scfnywsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHySdcllLessThan(String value) {
            addCriterion("SCFNYWS_YY_HY_SDCLL <", value, "scfnywsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHySdcllLessThanOrEqualTo(String value) {
            addCriterion("SCFNYWS_YY_HY_SDCLL <=", value, "scfnywsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHySdcllLike(String value) {
            addCriterion("SCFNYWS_YY_HY_SDCLL like", value, "scfnywsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHySdcllNotLike(String value) {
            addCriterion("SCFNYWS_YY_HY_SDCLL not like", value, "scfnywsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHySdcllIn(List<String> values) {
            addCriterion("SCFNYWS_YY_HY_SDCLL in", values, "scfnywsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHySdcllNotIn(List<String> values) {
            addCriterion("SCFNYWS_YY_HY_SDCLL not in", values, "scfnywsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHySdcllBetween(String value1, String value2) {
            addCriterion("SCFNYWS_YY_HY_SDCLL between", value1, value2, "scfnywsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsYyHySdcllNotBetween(String value1, String value2) {
            addCriterion("SCFNYWS_YY_HY_SDCLL not between", value1, value2, "scfnywsYyHySdcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsWcllIsNull() {
            addCriterion("SCFNYWS_WCLL is null");
            return (Criteria) this;
        }

        public Criteria andScfnywsWcllIsNotNull() {
            addCriterion("SCFNYWS_WCLL is not null");
            return (Criteria) this;
        }

        public Criteria andScfnywsWcllEqualTo(String value) {
            addCriterion("SCFNYWS_WCLL =", value, "scfnywsWcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsWcllNotEqualTo(String value) {
            addCriterion("SCFNYWS_WCLL <>", value, "scfnywsWcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsWcllGreaterThan(String value) {
            addCriterion("SCFNYWS_WCLL >", value, "scfnywsWcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsWcllGreaterThanOrEqualTo(String value) {
            addCriterion("SCFNYWS_WCLL >=", value, "scfnywsWcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsWcllLessThan(String value) {
            addCriterion("SCFNYWS_WCLL <", value, "scfnywsWcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsWcllLessThanOrEqualTo(String value) {
            addCriterion("SCFNYWS_WCLL <=", value, "scfnywsWcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsWcllLike(String value) {
            addCriterion("SCFNYWS_WCLL like", value, "scfnywsWcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsWcllNotLike(String value) {
            addCriterion("SCFNYWS_WCLL not like", value, "scfnywsWcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsWcllIn(List<String> values) {
            addCriterion("SCFNYWS_WCLL in", values, "scfnywsWcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsWcllNotIn(List<String> values) {
            addCriterion("SCFNYWS_WCLL not in", values, "scfnywsWcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsWcllBetween(String value1, String value2) {
            addCriterion("SCFNYWS_WCLL between", value1, value2, "scfnywsWcll");
            return (Criteria) this;
        }

        public Criteria andScfnywsWcllNotBetween(String value1, String value2) {
            addCriterion("SCFNYWS_WCLL not between", value1, value2, "scfnywsWcll");
            return (Criteria) this;
        }

        public Criteria andJphdhxxylqclIsNull() {
            addCriterion("JPHDHXXYLQCL is null");
            return (Criteria) this;
        }

        public Criteria andJphdhxxylqclIsNotNull() {
            addCriterion("JPHDHXXYLQCL is not null");
            return (Criteria) this;
        }

        public Criteria andJphdhxxylqclEqualTo(String value) {
            addCriterion("JPHDHXXYLQCL =", value, "jphdhxxylqcl");
            return (Criteria) this;
        }

        public Criteria andJphdhxxylqclNotEqualTo(String value) {
            addCriterion("JPHDHXXYLQCL <>", value, "jphdhxxylqcl");
            return (Criteria) this;
        }

        public Criteria andJphdhxxylqclGreaterThan(String value) {
            addCriterion("JPHDHXXYLQCL >", value, "jphdhxxylqcl");
            return (Criteria) this;
        }

        public Criteria andJphdhxxylqclGreaterThanOrEqualTo(String value) {
            addCriterion("JPHDHXXYLQCL >=", value, "jphdhxxylqcl");
            return (Criteria) this;
        }

        public Criteria andJphdhxxylqclLessThan(String value) {
            addCriterion("JPHDHXXYLQCL <", value, "jphdhxxylqcl");
            return (Criteria) this;
        }

        public Criteria andJphdhxxylqclLessThanOrEqualTo(String value) {
            addCriterion("JPHDHXXYLQCL <=", value, "jphdhxxylqcl");
            return (Criteria) this;
        }

        public Criteria andJphdhxxylqclLike(String value) {
            addCriterion("JPHDHXXYLQCL like", value, "jphdhxxylqcl");
            return (Criteria) this;
        }

        public Criteria andJphdhxxylqclNotLike(String value) {
            addCriterion("JPHDHXXYLQCL not like", value, "jphdhxxylqcl");
            return (Criteria) this;
        }

        public Criteria andJphdhxxylqclIn(List<String> values) {
            addCriterion("JPHDHXXYLQCL in", values, "jphdhxxylqcl");
            return (Criteria) this;
        }

        public Criteria andJphdhxxylqclNotIn(List<String> values) {
            addCriterion("JPHDHXXYLQCL not in", values, "jphdhxxylqcl");
            return (Criteria) this;
        }

        public Criteria andJphdhxxylqclBetween(String value1, String value2) {
            addCriterion("JPHDHXXYLQCL between", value1, value2, "jphdhxxylqcl");
            return (Criteria) this;
        }

        public Criteria andJphdhxxylqclNotBetween(String value1, String value2) {
            addCriterion("JPHDHXXYLQCL not between", value1, value2, "jphdhxxylqcl");
            return (Criteria) this;
        }

        public Criteria andJphdadqclIsNull() {
            addCriterion("JPHDADQCL is null");
            return (Criteria) this;
        }

        public Criteria andJphdadqclIsNotNull() {
            addCriterion("JPHDADQCL is not null");
            return (Criteria) this;
        }

        public Criteria andJphdadqclEqualTo(String value) {
            addCriterion("JPHDADQCL =", value, "jphdadqcl");
            return (Criteria) this;
        }

        public Criteria andJphdadqclNotEqualTo(String value) {
            addCriterion("JPHDADQCL <>", value, "jphdadqcl");
            return (Criteria) this;
        }

        public Criteria andJphdadqclGreaterThan(String value) {
            addCriterion("JPHDADQCL >", value, "jphdadqcl");
            return (Criteria) this;
        }

        public Criteria andJphdadqclGreaterThanOrEqualTo(String value) {
            addCriterion("JPHDADQCL >=", value, "jphdadqcl");
            return (Criteria) this;
        }

        public Criteria andJphdadqclLessThan(String value) {
            addCriterion("JPHDADQCL <", value, "jphdadqcl");
            return (Criteria) this;
        }

        public Criteria andJphdadqclLessThanOrEqualTo(String value) {
            addCriterion("JPHDADQCL <=", value, "jphdadqcl");
            return (Criteria) this;
        }

        public Criteria andJphdadqclLike(String value) {
            addCriterion("JPHDADQCL like", value, "jphdadqcl");
            return (Criteria) this;
        }

        public Criteria andJphdadqclNotLike(String value) {
            addCriterion("JPHDADQCL not like", value, "jphdadqcl");
            return (Criteria) this;
        }

        public Criteria andJphdadqclIn(List<String> values) {
            addCriterion("JPHDADQCL in", values, "jphdadqcl");
            return (Criteria) this;
        }

        public Criteria andJphdadqclNotIn(List<String> values) {
            addCriterion("JPHDADQCL not in", values, "jphdadqcl");
            return (Criteria) this;
        }

        public Criteria andJphdadqclBetween(String value1, String value2) {
            addCriterion("JPHDADQCL between", value1, value2, "jphdadqcl");
            return (Criteria) this;
        }

        public Criteria andJphdadqclNotBetween(String value1, String value2) {
            addCriterion("JPHDADQCL not between", value1, value2, "jphdadqcl");
            return (Criteria) this;
        }

        public Criteria andCslHxxylIsNull() {
            addCriterion("CSL_HXXYL is null");
            return (Criteria) this;
        }

        public Criteria andCslHxxylIsNotNull() {
            addCriterion("CSL_HXXYL is not null");
            return (Criteria) this;
        }

        public Criteria andCslHxxylEqualTo(String value) {
            addCriterion("CSL_HXXYL =", value, "cslHxxyl");
            return (Criteria) this;
        }

        public Criteria andCslHxxylNotEqualTo(String value) {
            addCriterion("CSL_HXXYL <>", value, "cslHxxyl");
            return (Criteria) this;
        }

        public Criteria andCslHxxylGreaterThan(String value) {
            addCriterion("CSL_HXXYL >", value, "cslHxxyl");
            return (Criteria) this;
        }

        public Criteria andCslHxxylGreaterThanOrEqualTo(String value) {
            addCriterion("CSL_HXXYL >=", value, "cslHxxyl");
            return (Criteria) this;
        }

        public Criteria andCslHxxylLessThan(String value) {
            addCriterion("CSL_HXXYL <", value, "cslHxxyl");
            return (Criteria) this;
        }

        public Criteria andCslHxxylLessThanOrEqualTo(String value) {
            addCriterion("CSL_HXXYL <=", value, "cslHxxyl");
            return (Criteria) this;
        }

        public Criteria andCslHxxylLike(String value) {
            addCriterion("CSL_HXXYL like", value, "cslHxxyl");
            return (Criteria) this;
        }

        public Criteria andCslHxxylNotLike(String value) {
            addCriterion("CSL_HXXYL not like", value, "cslHxxyl");
            return (Criteria) this;
        }

        public Criteria andCslHxxylIn(List<String> values) {
            addCriterion("CSL_HXXYL in", values, "cslHxxyl");
            return (Criteria) this;
        }

        public Criteria andCslHxxylNotIn(List<String> values) {
            addCriterion("CSL_HXXYL not in", values, "cslHxxyl");
            return (Criteria) this;
        }

        public Criteria andCslHxxylBetween(String value1, String value2) {
            addCriterion("CSL_HXXYL between", value1, value2, "cslHxxyl");
            return (Criteria) this;
        }

        public Criteria andCslHxxylNotBetween(String value1, String value2) {
            addCriterion("CSL_HXXYL not between", value1, value2, "cslHxxyl");
            return (Criteria) this;
        }

        public Criteria andCslZdIsNull() {
            addCriterion("CSL_ZD is null");
            return (Criteria) this;
        }

        public Criteria andCslZdIsNotNull() {
            addCriterion("CSL_ZD is not null");
            return (Criteria) this;
        }

        public Criteria andCslZdEqualTo(String value) {
            addCriterion("CSL_ZD =", value, "cslZd");
            return (Criteria) this;
        }

        public Criteria andCslZdNotEqualTo(String value) {
            addCriterion("CSL_ZD <>", value, "cslZd");
            return (Criteria) this;
        }

        public Criteria andCslZdGreaterThan(String value) {
            addCriterion("CSL_ZD >", value, "cslZd");
            return (Criteria) this;
        }

        public Criteria andCslZdGreaterThanOrEqualTo(String value) {
            addCriterion("CSL_ZD >=", value, "cslZd");
            return (Criteria) this;
        }

        public Criteria andCslZdLessThan(String value) {
            addCriterion("CSL_ZD <", value, "cslZd");
            return (Criteria) this;
        }

        public Criteria andCslZdLessThanOrEqualTo(String value) {
            addCriterion("CSL_ZD <=", value, "cslZd");
            return (Criteria) this;
        }

        public Criteria andCslZdLike(String value) {
            addCriterion("CSL_ZD like", value, "cslZd");
            return (Criteria) this;
        }

        public Criteria andCslZdNotLike(String value) {
            addCriterion("CSL_ZD not like", value, "cslZd");
            return (Criteria) this;
        }

        public Criteria andCslZdIn(List<String> values) {
            addCriterion("CSL_ZD in", values, "cslZd");
            return (Criteria) this;
        }

        public Criteria andCslZdNotIn(List<String> values) {
            addCriterion("CSL_ZD not in", values, "cslZd");
            return (Criteria) this;
        }

        public Criteria andCslZdBetween(String value1, String value2) {
            addCriterion("CSL_ZD between", value1, value2, "cslZd");
            return (Criteria) this;
        }

        public Criteria andCslZdNotBetween(String value1, String value2) {
            addCriterion("CSL_ZD not between", value1, value2, "cslZd");
            return (Criteria) this;
        }

        public Criteria andCslZlIsNull() {
            addCriterion("CSL_ZL is null");
            return (Criteria) this;
        }

        public Criteria andCslZlIsNotNull() {
            addCriterion("CSL_ZL is not null");
            return (Criteria) this;
        }

        public Criteria andCslZlEqualTo(String value) {
            addCriterion("CSL_ZL =", value, "cslZl");
            return (Criteria) this;
        }

        public Criteria andCslZlNotEqualTo(String value) {
            addCriterion("CSL_ZL <>", value, "cslZl");
            return (Criteria) this;
        }

        public Criteria andCslZlGreaterThan(String value) {
            addCriterion("CSL_ZL >", value, "cslZl");
            return (Criteria) this;
        }

        public Criteria andCslZlGreaterThanOrEqualTo(String value) {
            addCriterion("CSL_ZL >=", value, "cslZl");
            return (Criteria) this;
        }

        public Criteria andCslZlLessThan(String value) {
            addCriterion("CSL_ZL <", value, "cslZl");
            return (Criteria) this;
        }

        public Criteria andCslZlLessThanOrEqualTo(String value) {
            addCriterion("CSL_ZL <=", value, "cslZl");
            return (Criteria) this;
        }

        public Criteria andCslZlLike(String value) {
            addCriterion("CSL_ZL like", value, "cslZl");
            return (Criteria) this;
        }

        public Criteria andCslZlNotLike(String value) {
            addCriterion("CSL_ZL not like", value, "cslZl");
            return (Criteria) this;
        }

        public Criteria andCslZlIn(List<String> values) {
            addCriterion("CSL_ZL in", values, "cslZl");
            return (Criteria) this;
        }

        public Criteria andCslZlNotIn(List<String> values) {
            addCriterion("CSL_ZL not in", values, "cslZl");
            return (Criteria) this;
        }

        public Criteria andCslZlBetween(String value1, String value2) {
            addCriterion("CSL_ZL between", value1, value2, "cslZl");
            return (Criteria) this;
        }

        public Criteria andCslZlNotBetween(String value1, String value2) {
            addCriterion("CSL_ZL not between", value1, value2, "cslZl");
            return (Criteria) this;
        }

        public Criteria andCslAdIsNull() {
            addCriterion("CSL_AD is null");
            return (Criteria) this;
        }

        public Criteria andCslAdIsNotNull() {
            addCriterion("CSL_AD is not null");
            return (Criteria) this;
        }

        public Criteria andCslAdEqualTo(String value) {
            addCriterion("CSL_AD =", value, "cslAd");
            return (Criteria) this;
        }

        public Criteria andCslAdNotEqualTo(String value) {
            addCriterion("CSL_AD <>", value, "cslAd");
            return (Criteria) this;
        }

        public Criteria andCslAdGreaterThan(String value) {
            addCriterion("CSL_AD >", value, "cslAd");
            return (Criteria) this;
        }

        public Criteria andCslAdGreaterThanOrEqualTo(String value) {
            addCriterion("CSL_AD >=", value, "cslAd");
            return (Criteria) this;
        }

        public Criteria andCslAdLessThan(String value) {
            addCriterion("CSL_AD <", value, "cslAd");
            return (Criteria) this;
        }

        public Criteria andCslAdLessThanOrEqualTo(String value) {
            addCriterion("CSL_AD <=", value, "cslAd");
            return (Criteria) this;
        }

        public Criteria andCslAdLike(String value) {
            addCriterion("CSL_AD like", value, "cslAd");
            return (Criteria) this;
        }

        public Criteria andCslAdNotLike(String value) {
            addCriterion("CSL_AD not like", value, "cslAd");
            return (Criteria) this;
        }

        public Criteria andCslAdIn(List<String> values) {
            addCriterion("CSL_AD in", values, "cslAd");
            return (Criteria) this;
        }

        public Criteria andCslAdNotIn(List<String> values) {
            addCriterion("CSL_AD not in", values, "cslAd");
            return (Criteria) this;
        }

        public Criteria andCslAdBetween(String value1, String value2) {
            addCriterion("CSL_AD between", value1, value2, "cslAd");
            return (Criteria) this;
        }

        public Criteria andCslAdNotBetween(String value1, String value2) {
            addCriterion("CSL_AD not between", value1, value2, "cslAd");
            return (Criteria) this;
        }

        public Criteria andPflHxxylIsNull() {
            addCriterion("PFL_HXXYL is null");
            return (Criteria) this;
        }

        public Criteria andPflHxxylIsNotNull() {
            addCriterion("PFL_HXXYL is not null");
            return (Criteria) this;
        }

        public Criteria andPflHxxylEqualTo(String value) {
            addCriterion("PFL_HXXYL =", value, "pflHxxyl");
            return (Criteria) this;
        }

        public Criteria andPflHxxylNotEqualTo(String value) {
            addCriterion("PFL_HXXYL <>", value, "pflHxxyl");
            return (Criteria) this;
        }

        public Criteria andPflHxxylGreaterThan(String value) {
            addCriterion("PFL_HXXYL >", value, "pflHxxyl");
            return (Criteria) this;
        }

        public Criteria andPflHxxylGreaterThanOrEqualTo(String value) {
            addCriterion("PFL_HXXYL >=", value, "pflHxxyl");
            return (Criteria) this;
        }

        public Criteria andPflHxxylLessThan(String value) {
            addCriterion("PFL_HXXYL <", value, "pflHxxyl");
            return (Criteria) this;
        }

        public Criteria andPflHxxylLessThanOrEqualTo(String value) {
            addCriterion("PFL_HXXYL <=", value, "pflHxxyl");
            return (Criteria) this;
        }

        public Criteria andPflHxxylLike(String value) {
            addCriterion("PFL_HXXYL like", value, "pflHxxyl");
            return (Criteria) this;
        }

        public Criteria andPflHxxylNotLike(String value) {
            addCriterion("PFL_HXXYL not like", value, "pflHxxyl");
            return (Criteria) this;
        }

        public Criteria andPflHxxylIn(List<String> values) {
            addCriterion("PFL_HXXYL in", values, "pflHxxyl");
            return (Criteria) this;
        }

        public Criteria andPflHxxylNotIn(List<String> values) {
            addCriterion("PFL_HXXYL not in", values, "pflHxxyl");
            return (Criteria) this;
        }

        public Criteria andPflHxxylBetween(String value1, String value2) {
            addCriterion("PFL_HXXYL between", value1, value2, "pflHxxyl");
            return (Criteria) this;
        }

        public Criteria andPflHxxylNotBetween(String value1, String value2) {
            addCriterion("PFL_HXXYL not between", value1, value2, "pflHxxyl");
            return (Criteria) this;
        }

        public Criteria andPflZdIsNull() {
            addCriterion("PFL_ZD is null");
            return (Criteria) this;
        }

        public Criteria andPflZdIsNotNull() {
            addCriterion("PFL_ZD is not null");
            return (Criteria) this;
        }

        public Criteria andPflZdEqualTo(String value) {
            addCriterion("PFL_ZD =", value, "pflZd");
            return (Criteria) this;
        }

        public Criteria andPflZdNotEqualTo(String value) {
            addCriterion("PFL_ZD <>", value, "pflZd");
            return (Criteria) this;
        }

        public Criteria andPflZdGreaterThan(String value) {
            addCriterion("PFL_ZD >", value, "pflZd");
            return (Criteria) this;
        }

        public Criteria andPflZdGreaterThanOrEqualTo(String value) {
            addCriterion("PFL_ZD >=", value, "pflZd");
            return (Criteria) this;
        }

        public Criteria andPflZdLessThan(String value) {
            addCriterion("PFL_ZD <", value, "pflZd");
            return (Criteria) this;
        }

        public Criteria andPflZdLessThanOrEqualTo(String value) {
            addCriterion("PFL_ZD <=", value, "pflZd");
            return (Criteria) this;
        }

        public Criteria andPflZdLike(String value) {
            addCriterion("PFL_ZD like", value, "pflZd");
            return (Criteria) this;
        }

        public Criteria andPflZdNotLike(String value) {
            addCriterion("PFL_ZD not like", value, "pflZd");
            return (Criteria) this;
        }

        public Criteria andPflZdIn(List<String> values) {
            addCriterion("PFL_ZD in", values, "pflZd");
            return (Criteria) this;
        }

        public Criteria andPflZdNotIn(List<String> values) {
            addCriterion("PFL_ZD not in", values, "pflZd");
            return (Criteria) this;
        }

        public Criteria andPflZdBetween(String value1, String value2) {
            addCriterion("PFL_ZD between", value1, value2, "pflZd");
            return (Criteria) this;
        }

        public Criteria andPflZdNotBetween(String value1, String value2) {
            addCriterion("PFL_ZD not between", value1, value2, "pflZd");
            return (Criteria) this;
        }

        public Criteria andPflZlIsNull() {
            addCriterion("PFL_ZL is null");
            return (Criteria) this;
        }

        public Criteria andPflZlIsNotNull() {
            addCriterion("PFL_ZL is not null");
            return (Criteria) this;
        }

        public Criteria andPflZlEqualTo(String value) {
            addCriterion("PFL_ZL =", value, "pflZl");
            return (Criteria) this;
        }

        public Criteria andPflZlNotEqualTo(String value) {
            addCriterion("PFL_ZL <>", value, "pflZl");
            return (Criteria) this;
        }

        public Criteria andPflZlGreaterThan(String value) {
            addCriterion("PFL_ZL >", value, "pflZl");
            return (Criteria) this;
        }

        public Criteria andPflZlGreaterThanOrEqualTo(String value) {
            addCriterion("PFL_ZL >=", value, "pflZl");
            return (Criteria) this;
        }

        public Criteria andPflZlLessThan(String value) {
            addCriterion("PFL_ZL <", value, "pflZl");
            return (Criteria) this;
        }

        public Criteria andPflZlLessThanOrEqualTo(String value) {
            addCriterion("PFL_ZL <=", value, "pflZl");
            return (Criteria) this;
        }

        public Criteria andPflZlLike(String value) {
            addCriterion("PFL_ZL like", value, "pflZl");
            return (Criteria) this;
        }

        public Criteria andPflZlNotLike(String value) {
            addCriterion("PFL_ZL not like", value, "pflZl");
            return (Criteria) this;
        }

        public Criteria andPflZlIn(List<String> values) {
            addCriterion("PFL_ZL in", values, "pflZl");
            return (Criteria) this;
        }

        public Criteria andPflZlNotIn(List<String> values) {
            addCriterion("PFL_ZL not in", values, "pflZl");
            return (Criteria) this;
        }

        public Criteria andPflZlBetween(String value1, String value2) {
            addCriterion("PFL_ZL between", value1, value2, "pflZl");
            return (Criteria) this;
        }

        public Criteria andPflZlNotBetween(String value1, String value2) {
            addCriterion("PFL_ZL not between", value1, value2, "pflZl");
            return (Criteria) this;
        }

        public Criteria andPflAdIsNull() {
            addCriterion("PFL_AD is null");
            return (Criteria) this;
        }

        public Criteria andPflAdIsNotNull() {
            addCriterion("PFL_AD is not null");
            return (Criteria) this;
        }

        public Criteria andPflAdEqualTo(String value) {
            addCriterion("PFL_AD =", value, "pflAd");
            return (Criteria) this;
        }

        public Criteria andPflAdNotEqualTo(String value) {
            addCriterion("PFL_AD <>", value, "pflAd");
            return (Criteria) this;
        }

        public Criteria andPflAdGreaterThan(String value) {
            addCriterion("PFL_AD >", value, "pflAd");
            return (Criteria) this;
        }

        public Criteria andPflAdGreaterThanOrEqualTo(String value) {
            addCriterion("PFL_AD >=", value, "pflAd");
            return (Criteria) this;
        }

        public Criteria andPflAdLessThan(String value) {
            addCriterion("PFL_AD <", value, "pflAd");
            return (Criteria) this;
        }

        public Criteria andPflAdLessThanOrEqualTo(String value) {
            addCriterion("PFL_AD <=", value, "pflAd");
            return (Criteria) this;
        }

        public Criteria andPflAdLike(String value) {
            addCriterion("PFL_AD like", value, "pflAd");
            return (Criteria) this;
        }

        public Criteria andPflAdNotLike(String value) {
            addCriterion("PFL_AD not like", value, "pflAd");
            return (Criteria) this;
        }

        public Criteria andPflAdIn(List<String> values) {
            addCriterion("PFL_AD in", values, "pflAd");
            return (Criteria) this;
        }

        public Criteria andPflAdNotIn(List<String> values) {
            addCriterion("PFL_AD not in", values, "pflAd");
            return (Criteria) this;
        }

        public Criteria andPflAdBetween(String value1, String value2) {
            addCriterion("PFL_AD between", value1, value2, "pflAd");
            return (Criteria) this;
        }

        public Criteria andPflAdNotBetween(String value1, String value2) {
            addCriterion("PFL_AD not between", value1, value2, "pflAd");
            return (Criteria) this;
        }

        public Criteria andQclHxxylIsNull() {
            addCriterion("QCL_HXXYL is null");
            return (Criteria) this;
        }

        public Criteria andQclHxxylIsNotNull() {
            addCriterion("QCL_HXXYL is not null");
            return (Criteria) this;
        }

        public Criteria andQclHxxylEqualTo(String value) {
            addCriterion("QCL_HXXYL =", value, "qclHxxyl");
            return (Criteria) this;
        }

        public Criteria andQclHxxylNotEqualTo(String value) {
            addCriterion("QCL_HXXYL <>", value, "qclHxxyl");
            return (Criteria) this;
        }

        public Criteria andQclHxxylGreaterThan(String value) {
            addCriterion("QCL_HXXYL >", value, "qclHxxyl");
            return (Criteria) this;
        }

        public Criteria andQclHxxylGreaterThanOrEqualTo(String value) {
            addCriterion("QCL_HXXYL >=", value, "qclHxxyl");
            return (Criteria) this;
        }

        public Criteria andQclHxxylLessThan(String value) {
            addCriterion("QCL_HXXYL <", value, "qclHxxyl");
            return (Criteria) this;
        }

        public Criteria andQclHxxylLessThanOrEqualTo(String value) {
            addCriterion("QCL_HXXYL <=", value, "qclHxxyl");
            return (Criteria) this;
        }

        public Criteria andQclHxxylLike(String value) {
            addCriterion("QCL_HXXYL like", value, "qclHxxyl");
            return (Criteria) this;
        }

        public Criteria andQclHxxylNotLike(String value) {
            addCriterion("QCL_HXXYL not like", value, "qclHxxyl");
            return (Criteria) this;
        }

        public Criteria andQclHxxylIn(List<String> values) {
            addCriterion("QCL_HXXYL in", values, "qclHxxyl");
            return (Criteria) this;
        }

        public Criteria andQclHxxylNotIn(List<String> values) {
            addCriterion("QCL_HXXYL not in", values, "qclHxxyl");
            return (Criteria) this;
        }

        public Criteria andQclHxxylBetween(String value1, String value2) {
            addCriterion("QCL_HXXYL between", value1, value2, "qclHxxyl");
            return (Criteria) this;
        }

        public Criteria andQclHxxylNotBetween(String value1, String value2) {
            addCriterion("QCL_HXXYL not between", value1, value2, "qclHxxyl");
            return (Criteria) this;
        }

        public Criteria andQclZdIsNull() {
            addCriterion("QCL_ZD is null");
            return (Criteria) this;
        }

        public Criteria andQclZdIsNotNull() {
            addCriterion("QCL_ZD is not null");
            return (Criteria) this;
        }

        public Criteria andQclZdEqualTo(String value) {
            addCriterion("QCL_ZD =", value, "qclZd");
            return (Criteria) this;
        }

        public Criteria andQclZdNotEqualTo(String value) {
            addCriterion("QCL_ZD <>", value, "qclZd");
            return (Criteria) this;
        }

        public Criteria andQclZdGreaterThan(String value) {
            addCriterion("QCL_ZD >", value, "qclZd");
            return (Criteria) this;
        }

        public Criteria andQclZdGreaterThanOrEqualTo(String value) {
            addCriterion("QCL_ZD >=", value, "qclZd");
            return (Criteria) this;
        }

        public Criteria andQclZdLessThan(String value) {
            addCriterion("QCL_ZD <", value, "qclZd");
            return (Criteria) this;
        }

        public Criteria andQclZdLessThanOrEqualTo(String value) {
            addCriterion("QCL_ZD <=", value, "qclZd");
            return (Criteria) this;
        }

        public Criteria andQclZdLike(String value) {
            addCriterion("QCL_ZD like", value, "qclZd");
            return (Criteria) this;
        }

        public Criteria andQclZdNotLike(String value) {
            addCriterion("QCL_ZD not like", value, "qclZd");
            return (Criteria) this;
        }

        public Criteria andQclZdIn(List<String> values) {
            addCriterion("QCL_ZD in", values, "qclZd");
            return (Criteria) this;
        }

        public Criteria andQclZdNotIn(List<String> values) {
            addCriterion("QCL_ZD not in", values, "qclZd");
            return (Criteria) this;
        }

        public Criteria andQclZdBetween(String value1, String value2) {
            addCriterion("QCL_ZD between", value1, value2, "qclZd");
            return (Criteria) this;
        }

        public Criteria andQclZdNotBetween(String value1, String value2) {
            addCriterion("QCL_ZD not between", value1, value2, "qclZd");
            return (Criteria) this;
        }

        public Criteria andQclZlIsNull() {
            addCriterion("QCL_ZL is null");
            return (Criteria) this;
        }

        public Criteria andQclZlIsNotNull() {
            addCriterion("QCL_ZL is not null");
            return (Criteria) this;
        }

        public Criteria andQclZlEqualTo(String value) {
            addCriterion("QCL_ZL =", value, "qclZl");
            return (Criteria) this;
        }

        public Criteria andQclZlNotEqualTo(String value) {
            addCriterion("QCL_ZL <>", value, "qclZl");
            return (Criteria) this;
        }

        public Criteria andQclZlGreaterThan(String value) {
            addCriterion("QCL_ZL >", value, "qclZl");
            return (Criteria) this;
        }

        public Criteria andQclZlGreaterThanOrEqualTo(String value) {
            addCriterion("QCL_ZL >=", value, "qclZl");
            return (Criteria) this;
        }

        public Criteria andQclZlLessThan(String value) {
            addCriterion("QCL_ZL <", value, "qclZl");
            return (Criteria) this;
        }

        public Criteria andQclZlLessThanOrEqualTo(String value) {
            addCriterion("QCL_ZL <=", value, "qclZl");
            return (Criteria) this;
        }

        public Criteria andQclZlLike(String value) {
            addCriterion("QCL_ZL like", value, "qclZl");
            return (Criteria) this;
        }

        public Criteria andQclZlNotLike(String value) {
            addCriterion("QCL_ZL not like", value, "qclZl");
            return (Criteria) this;
        }

        public Criteria andQclZlIn(List<String> values) {
            addCriterion("QCL_ZL in", values, "qclZl");
            return (Criteria) this;
        }

        public Criteria andQclZlNotIn(List<String> values) {
            addCriterion("QCL_ZL not in", values, "qclZl");
            return (Criteria) this;
        }

        public Criteria andQclZlBetween(String value1, String value2) {
            addCriterion("QCL_ZL between", value1, value2, "qclZl");
            return (Criteria) this;
        }

        public Criteria andQclZlNotBetween(String value1, String value2) {
            addCriterion("QCL_ZL not between", value1, value2, "qclZl");
            return (Criteria) this;
        }

        public Criteria andQclAdIsNull() {
            addCriterion("QCL_AD is null");
            return (Criteria) this;
        }

        public Criteria andQclAdIsNotNull() {
            addCriterion("QCL_AD is not null");
            return (Criteria) this;
        }

        public Criteria andQclAdEqualTo(String value) {
            addCriterion("QCL_AD =", value, "qclAd");
            return (Criteria) this;
        }

        public Criteria andQclAdNotEqualTo(String value) {
            addCriterion("QCL_AD <>", value, "qclAd");
            return (Criteria) this;
        }

        public Criteria andQclAdGreaterThan(String value) {
            addCriterion("QCL_AD >", value, "qclAd");
            return (Criteria) this;
        }

        public Criteria andQclAdGreaterThanOrEqualTo(String value) {
            addCriterion("QCL_AD >=", value, "qclAd");
            return (Criteria) this;
        }

        public Criteria andQclAdLessThan(String value) {
            addCriterion("QCL_AD <", value, "qclAd");
            return (Criteria) this;
        }

        public Criteria andQclAdLessThanOrEqualTo(String value) {
            addCriterion("QCL_AD <=", value, "qclAd");
            return (Criteria) this;
        }

        public Criteria andQclAdLike(String value) {
            addCriterion("QCL_AD like", value, "qclAd");
            return (Criteria) this;
        }

        public Criteria andQclAdNotLike(String value) {
            addCriterion("QCL_AD not like", value, "qclAd");
            return (Criteria) this;
        }

        public Criteria andQclAdIn(List<String> values) {
            addCriterion("QCL_AD in", values, "qclAd");
            return (Criteria) this;
        }

        public Criteria andQclAdNotIn(List<String> values) {
            addCriterion("QCL_AD not in", values, "qclAd");
            return (Criteria) this;
        }

        public Criteria andQclAdBetween(String value1, String value2) {
            addCriterion("QCL_AD between", value1, value2, "qclAd");
            return (Criteria) this;
        }

        public Criteria andQclAdNotBetween(String value1, String value2) {
            addCriterion("QCL_AD not between", value1, value2, "qclAd");
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