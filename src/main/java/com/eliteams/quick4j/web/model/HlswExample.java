package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HlswExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HlswExample() {
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

        public Criteria andHlswSwzmcIsNull() {
            addCriterion("hlsw_swzmc is null");
            return (Criteria) this;
        }

        public Criteria andHlswSwzmcIsNotNull() {
            addCriterion("hlsw_swzmc is not null");
            return (Criteria) this;
        }

        public Criteria andHlswSwzmcEqualTo(String value) {
            addCriterion("hlsw_swzmc =", value, "hlswSwzmc");
            return (Criteria) this;
        }

        public Criteria andHlswSwzmcNotEqualTo(String value) {
            addCriterion("hlsw_swzmc <>", value, "hlswSwzmc");
            return (Criteria) this;
        }

        public Criteria andHlswSwzmcGreaterThan(String value) {
            addCriterion("hlsw_swzmc >", value, "hlswSwzmc");
            return (Criteria) this;
        }

        public Criteria andHlswSwzmcGreaterThanOrEqualTo(String value) {
            addCriterion("hlsw_swzmc >=", value, "hlswSwzmc");
            return (Criteria) this;
        }

        public Criteria andHlswSwzmcLessThan(String value) {
            addCriterion("hlsw_swzmc <", value, "hlswSwzmc");
            return (Criteria) this;
        }

        public Criteria andHlswSwzmcLessThanOrEqualTo(String value) {
            addCriterion("hlsw_swzmc <=", value, "hlswSwzmc");
            return (Criteria) this;
        }

        public Criteria andHlswSwzmcLike(String value) {
            addCriterion("hlsw_swzmc like", value, "hlswSwzmc");
            return (Criteria) this;
        }

        public Criteria andHlswSwzmcNotLike(String value) {
            addCriterion("hlsw_swzmc not like", value, "hlswSwzmc");
            return (Criteria) this;
        }

        public Criteria andHlswSwzmcIn(List<String> values) {
            addCriterion("hlsw_swzmc in", values, "hlswSwzmc");
            return (Criteria) this;
        }

        public Criteria andHlswSwzmcNotIn(List<String> values) {
            addCriterion("hlsw_swzmc not in", values, "hlswSwzmc");
            return (Criteria) this;
        }

        public Criteria andHlswSwzmcBetween(String value1, String value2) {
            addCriterion("hlsw_swzmc between", value1, value2, "hlswSwzmc");
            return (Criteria) this;
        }

        public Criteria andHlswSwzmcNotBetween(String value1, String value2) {
            addCriterion("hlsw_swzmc not between", value1, value2, "hlswSwzmc");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjddIsNull() {
            addCriterion("hlsw_swzjdd is null");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjddIsNotNull() {
            addCriterion("hlsw_swzjdd is not null");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjddEqualTo(Integer value) {
            addCriterion("hlsw_swzjdd =", value, "hlswSwzjdd");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjddNotEqualTo(Integer value) {
            addCriterion("hlsw_swzjdd <>", value, "hlswSwzjdd");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjddGreaterThan(Integer value) {
            addCriterion("hlsw_swzjdd >", value, "hlswSwzjdd");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjddGreaterThanOrEqualTo(Integer value) {
            addCriterion("hlsw_swzjdd >=", value, "hlswSwzjdd");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjddLessThan(Integer value) {
            addCriterion("hlsw_swzjdd <", value, "hlswSwzjdd");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjddLessThanOrEqualTo(Integer value) {
            addCriterion("hlsw_swzjdd <=", value, "hlswSwzjdd");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjddIn(List<Integer> values) {
            addCriterion("hlsw_swzjdd in", values, "hlswSwzjdd");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjddNotIn(List<Integer> values) {
            addCriterion("hlsw_swzjdd not in", values, "hlswSwzjdd");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjddBetween(Integer value1, Integer value2) {
            addCriterion("hlsw_swzjdd between", value1, value2, "hlswSwzjdd");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjddNotBetween(Integer value1, Integer value2) {
            addCriterion("hlsw_swzjdd not between", value1, value2, "hlswSwzjdd");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdfIsNull() {
            addCriterion("hlsw_swzjdf is null");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdfIsNotNull() {
            addCriterion("hlsw_swzjdf is not null");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdfEqualTo(Integer value) {
            addCriterion("hlsw_swzjdf =", value, "hlswSwzjdf");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdfNotEqualTo(Integer value) {
            addCriterion("hlsw_swzjdf <>", value, "hlswSwzjdf");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdfGreaterThan(Integer value) {
            addCriterion("hlsw_swzjdf >", value, "hlswSwzjdf");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdfGreaterThanOrEqualTo(Integer value) {
            addCriterion("hlsw_swzjdf >=", value, "hlswSwzjdf");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdfLessThan(Integer value) {
            addCriterion("hlsw_swzjdf <", value, "hlswSwzjdf");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdfLessThanOrEqualTo(Integer value) {
            addCriterion("hlsw_swzjdf <=", value, "hlswSwzjdf");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdfIn(List<Integer> values) {
            addCriterion("hlsw_swzjdf in", values, "hlswSwzjdf");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdfNotIn(List<Integer> values) {
            addCriterion("hlsw_swzjdf not in", values, "hlswSwzjdf");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdfBetween(Integer value1, Integer value2) {
            addCriterion("hlsw_swzjdf between", value1, value2, "hlswSwzjdf");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdfNotBetween(Integer value1, Integer value2) {
            addCriterion("hlsw_swzjdf not between", value1, value2, "hlswSwzjdf");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdsIsNull() {
            addCriterion("hlsw_swzjds is null");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdsIsNotNull() {
            addCriterion("hlsw_swzjds is not null");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdsEqualTo(Integer value) {
            addCriterion("hlsw_swzjds =", value, "hlswSwzjds");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdsNotEqualTo(Integer value) {
            addCriterion("hlsw_swzjds <>", value, "hlswSwzjds");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdsGreaterThan(Integer value) {
            addCriterion("hlsw_swzjds >", value, "hlswSwzjds");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdsGreaterThanOrEqualTo(Integer value) {
            addCriterion("hlsw_swzjds >=", value, "hlswSwzjds");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdsLessThan(Integer value) {
            addCriterion("hlsw_swzjds <", value, "hlswSwzjds");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdsLessThanOrEqualTo(Integer value) {
            addCriterion("hlsw_swzjds <=", value, "hlswSwzjds");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdsIn(List<Integer> values) {
            addCriterion("hlsw_swzjds in", values, "hlswSwzjds");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdsNotIn(List<Integer> values) {
            addCriterion("hlsw_swzjds not in", values, "hlswSwzjds");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdsBetween(Integer value1, Integer value2) {
            addCriterion("hlsw_swzjds between", value1, value2, "hlswSwzjds");
            return (Criteria) this;
        }

        public Criteria andHlswSwzjdsNotBetween(Integer value1, Integer value2) {
            addCriterion("hlsw_swzjds not between", value1, value2, "hlswSwzjds");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwddIsNull() {
            addCriterion("hlsw_swzwdd is null");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwddIsNotNull() {
            addCriterion("hlsw_swzwdd is not null");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwddEqualTo(Integer value) {
            addCriterion("hlsw_swzwdd =", value, "hlswSwzwdd");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwddNotEqualTo(Integer value) {
            addCriterion("hlsw_swzwdd <>", value, "hlswSwzwdd");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwddGreaterThan(Integer value) {
            addCriterion("hlsw_swzwdd >", value, "hlswSwzwdd");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwddGreaterThanOrEqualTo(Integer value) {
            addCriterion("hlsw_swzwdd >=", value, "hlswSwzwdd");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwddLessThan(Integer value) {
            addCriterion("hlsw_swzwdd <", value, "hlswSwzwdd");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwddLessThanOrEqualTo(Integer value) {
            addCriterion("hlsw_swzwdd <=", value, "hlswSwzwdd");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwddIn(List<Integer> values) {
            addCriterion("hlsw_swzwdd in", values, "hlswSwzwdd");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwddNotIn(List<Integer> values) {
            addCriterion("hlsw_swzwdd not in", values, "hlswSwzwdd");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwddBetween(Integer value1, Integer value2) {
            addCriterion("hlsw_swzwdd between", value1, value2, "hlswSwzwdd");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwddNotBetween(Integer value1, Integer value2) {
            addCriterion("hlsw_swzwdd not between", value1, value2, "hlswSwzwdd");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdfIsNull() {
            addCriterion("hlsw_swzwdf is null");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdfIsNotNull() {
            addCriterion("hlsw_swzwdf is not null");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdfEqualTo(Integer value) {
            addCriterion("hlsw_swzwdf =", value, "hlswSwzwdf");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdfNotEqualTo(Integer value) {
            addCriterion("hlsw_swzwdf <>", value, "hlswSwzwdf");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdfGreaterThan(Integer value) {
            addCriterion("hlsw_swzwdf >", value, "hlswSwzwdf");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdfGreaterThanOrEqualTo(Integer value) {
            addCriterion("hlsw_swzwdf >=", value, "hlswSwzwdf");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdfLessThan(Integer value) {
            addCriterion("hlsw_swzwdf <", value, "hlswSwzwdf");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdfLessThanOrEqualTo(Integer value) {
            addCriterion("hlsw_swzwdf <=", value, "hlswSwzwdf");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdfIn(List<Integer> values) {
            addCriterion("hlsw_swzwdf in", values, "hlswSwzwdf");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdfNotIn(List<Integer> values) {
            addCriterion("hlsw_swzwdf not in", values, "hlswSwzwdf");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdfBetween(Integer value1, Integer value2) {
            addCriterion("hlsw_swzwdf between", value1, value2, "hlswSwzwdf");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdfNotBetween(Integer value1, Integer value2) {
            addCriterion("hlsw_swzwdf not between", value1, value2, "hlswSwzwdf");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdsIsNull() {
            addCriterion("hlsw_swzwds is null");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdsIsNotNull() {
            addCriterion("hlsw_swzwds is not null");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdsEqualTo(Double value) {
            addCriterion("hlsw_swzwds =", value, "hlswSwzwds");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdsNotEqualTo(Double value) {
            addCriterion("hlsw_swzwds <>", value, "hlswSwzwds");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdsGreaterThan(Double value) {
            addCriterion("hlsw_swzwds >", value, "hlswSwzwds");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdsGreaterThanOrEqualTo(Double value) {
            addCriterion("hlsw_swzwds >=", value, "hlswSwzwds");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdsLessThan(Double value) {
            addCriterion("hlsw_swzwds <", value, "hlswSwzwds");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdsLessThanOrEqualTo(Double value) {
            addCriterion("hlsw_swzwds <=", value, "hlswSwzwds");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdsIn(List<Double> values) {
            addCriterion("hlsw_swzwds in", values, "hlswSwzwds");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdsNotIn(List<Double> values) {
            addCriterion("hlsw_swzwds not in", values, "hlswSwzwds");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdsBetween(Double value1, Double value2) {
            addCriterion("hlsw_swzwds between", value1, value2, "hlswSwzwds");
            return (Criteria) this;
        }

        public Criteria andHlswSwzwdsNotBetween(Double value1, Double value2) {
            addCriterion("hlsw_swzwds not between", value1, value2, "hlswSwzwds");
            return (Criteria) this;
        }

        public Criteria andHlswDmmcIsNull() {
            addCriterion("hlsw_dmmc is null");
            return (Criteria) this;
        }

        public Criteria andHlswDmmcIsNotNull() {
            addCriterion("hlsw_dmmc is not null");
            return (Criteria) this;
        }

        public Criteria andHlswDmmcEqualTo(String value) {
            addCriterion("hlsw_dmmc =", value, "hlswDmmc");
            return (Criteria) this;
        }

        public Criteria andHlswDmmcNotEqualTo(String value) {
            addCriterion("hlsw_dmmc <>", value, "hlswDmmc");
            return (Criteria) this;
        }

        public Criteria andHlswDmmcGreaterThan(String value) {
            addCriterion("hlsw_dmmc >", value, "hlswDmmc");
            return (Criteria) this;
        }

        public Criteria andHlswDmmcGreaterThanOrEqualTo(String value) {
            addCriterion("hlsw_dmmc >=", value, "hlswDmmc");
            return (Criteria) this;
        }

        public Criteria andHlswDmmcLessThan(String value) {
            addCriterion("hlsw_dmmc <", value, "hlswDmmc");
            return (Criteria) this;
        }

        public Criteria andHlswDmmcLessThanOrEqualTo(String value) {
            addCriterion("hlsw_dmmc <=", value, "hlswDmmc");
            return (Criteria) this;
        }

        public Criteria andHlswDmmcLike(String value) {
            addCriterion("hlsw_dmmc like", value, "hlswDmmc");
            return (Criteria) this;
        }

        public Criteria andHlswDmmcNotLike(String value) {
            addCriterion("hlsw_dmmc not like", value, "hlswDmmc");
            return (Criteria) this;
        }

        public Criteria andHlswDmmcIn(List<String> values) {
            addCriterion("hlsw_dmmc in", values, "hlswDmmc");
            return (Criteria) this;
        }

        public Criteria andHlswDmmcNotIn(List<String> values) {
            addCriterion("hlsw_dmmc not in", values, "hlswDmmc");
            return (Criteria) this;
        }

        public Criteria andHlswDmmcBetween(String value1, String value2) {
            addCriterion("hlsw_dmmc between", value1, value2, "hlswDmmc");
            return (Criteria) this;
        }

        public Criteria andHlswDmmcNotBetween(String value1, String value2) {
            addCriterion("hlsw_dmmc not between", value1, value2, "hlswDmmc");
            return (Criteria) this;
        }

        public Criteria andHlswDmbhIsNull() {
            addCriterion("hlsw_dmbh is null");
            return (Criteria) this;
        }

        public Criteria andHlswDmbhIsNotNull() {
            addCriterion("hlsw_dmbh is not null");
            return (Criteria) this;
        }

        public Criteria andHlswDmbhEqualTo(String value) {
            addCriterion("hlsw_dmbh =", value, "hlswDmbh");
            return (Criteria) this;
        }

        public Criteria andHlswDmbhNotEqualTo(String value) {
            addCriterion("hlsw_dmbh <>", value, "hlswDmbh");
            return (Criteria) this;
        }

        public Criteria andHlswDmbhGreaterThan(String value) {
            addCriterion("hlsw_dmbh >", value, "hlswDmbh");
            return (Criteria) this;
        }

        public Criteria andHlswDmbhGreaterThanOrEqualTo(String value) {
            addCriterion("hlsw_dmbh >=", value, "hlswDmbh");
            return (Criteria) this;
        }

        public Criteria andHlswDmbhLessThan(String value) {
            addCriterion("hlsw_dmbh <", value, "hlswDmbh");
            return (Criteria) this;
        }

        public Criteria andHlswDmbhLessThanOrEqualTo(String value) {
            addCriterion("hlsw_dmbh <=", value, "hlswDmbh");
            return (Criteria) this;
        }

        public Criteria andHlswDmbhLike(String value) {
            addCriterion("hlsw_dmbh like", value, "hlswDmbh");
            return (Criteria) this;
        }

        public Criteria andHlswDmbhNotLike(String value) {
            addCriterion("hlsw_dmbh not like", value, "hlswDmbh");
            return (Criteria) this;
        }

        public Criteria andHlswDmbhIn(List<String> values) {
            addCriterion("hlsw_dmbh in", values, "hlswDmbh");
            return (Criteria) this;
        }

        public Criteria andHlswDmbhNotIn(List<String> values) {
            addCriterion("hlsw_dmbh not in", values, "hlswDmbh");
            return (Criteria) this;
        }

        public Criteria andHlswDmbhBetween(String value1, String value2) {
            addCriterion("hlsw_dmbh between", value1, value2, "hlswDmbh");
            return (Criteria) this;
        }

        public Criteria andHlswDmbhNotBetween(String value1, String value2) {
            addCriterion("hlsw_dmbh not between", value1, value2, "hlswDmbh");
            return (Criteria) this;
        }

        public Criteria andHlswHlmcIsNull() {
            addCriterion("hlsw_hlmc is null");
            return (Criteria) this;
        }

        public Criteria andHlswHlmcIsNotNull() {
            addCriterion("hlsw_hlmc is not null");
            return (Criteria) this;
        }

        public Criteria andHlswHlmcEqualTo(String value) {
            addCriterion("hlsw_hlmc =", value, "hlswHlmc");
            return (Criteria) this;
        }

        public Criteria andHlswHlmcNotEqualTo(String value) {
            addCriterion("hlsw_hlmc <>", value, "hlswHlmc");
            return (Criteria) this;
        }

        public Criteria andHlswHlmcGreaterThan(String value) {
            addCriterion("hlsw_hlmc >", value, "hlswHlmc");
            return (Criteria) this;
        }

        public Criteria andHlswHlmcGreaterThanOrEqualTo(String value) {
            addCriterion("hlsw_hlmc >=", value, "hlswHlmc");
            return (Criteria) this;
        }

        public Criteria andHlswHlmcLessThan(String value) {
            addCriterion("hlsw_hlmc <", value, "hlswHlmc");
            return (Criteria) this;
        }

        public Criteria andHlswHlmcLessThanOrEqualTo(String value) {
            addCriterion("hlsw_hlmc <=", value, "hlswHlmc");
            return (Criteria) this;
        }

        public Criteria andHlswHlmcLike(String value) {
            addCriterion("hlsw_hlmc like", value, "hlswHlmc");
            return (Criteria) this;
        }

        public Criteria andHlswHlmcNotLike(String value) {
            addCriterion("hlsw_hlmc not like", value, "hlswHlmc");
            return (Criteria) this;
        }

        public Criteria andHlswHlmcIn(List<String> values) {
            addCriterion("hlsw_hlmc in", values, "hlswHlmc");
            return (Criteria) this;
        }

        public Criteria andHlswHlmcNotIn(List<String> values) {
            addCriterion("hlsw_hlmc not in", values, "hlswHlmc");
            return (Criteria) this;
        }

        public Criteria andHlswHlmcBetween(String value1, String value2) {
            addCriterion("hlsw_hlmc between", value1, value2, "hlswHlmc");
            return (Criteria) this;
        }

        public Criteria andHlswHlmcNotBetween(String value1, String value2) {
            addCriterion("hlsw_hlmc not between", value1, value2, "hlswHlmc");
            return (Criteria) this;
        }

        public Criteria andHlswHlbhIsNull() {
            addCriterion("hlsw_hlbh is null");
            return (Criteria) this;
        }

        public Criteria andHlswHlbhIsNotNull() {
            addCriterion("hlsw_hlbh is not null");
            return (Criteria) this;
        }

        public Criteria andHlswHlbhEqualTo(String value) {
            addCriterion("hlsw_hlbh =", value, "hlswHlbh");
            return (Criteria) this;
        }

        public Criteria andHlswHlbhNotEqualTo(String value) {
            addCriterion("hlsw_hlbh <>", value, "hlswHlbh");
            return (Criteria) this;
        }

        public Criteria andHlswHlbhGreaterThan(String value) {
            addCriterion("hlsw_hlbh >", value, "hlswHlbh");
            return (Criteria) this;
        }

        public Criteria andHlswHlbhGreaterThanOrEqualTo(String value) {
            addCriterion("hlsw_hlbh >=", value, "hlswHlbh");
            return (Criteria) this;
        }

        public Criteria andHlswHlbhLessThan(String value) {
            addCriterion("hlsw_hlbh <", value, "hlswHlbh");
            return (Criteria) this;
        }

        public Criteria andHlswHlbhLessThanOrEqualTo(String value) {
            addCriterion("hlsw_hlbh <=", value, "hlswHlbh");
            return (Criteria) this;
        }

        public Criteria andHlswHlbhLike(String value) {
            addCriterion("hlsw_hlbh like", value, "hlswHlbh");
            return (Criteria) this;
        }

        public Criteria andHlswHlbhNotLike(String value) {
            addCriterion("hlsw_hlbh not like", value, "hlswHlbh");
            return (Criteria) this;
        }

        public Criteria andHlswHlbhIn(List<String> values) {
            addCriterion("hlsw_hlbh in", values, "hlswHlbh");
            return (Criteria) this;
        }

        public Criteria andHlswHlbhNotIn(List<String> values) {
            addCriterion("hlsw_hlbh not in", values, "hlswHlbh");
            return (Criteria) this;
        }

        public Criteria andHlswHlbhBetween(String value1, String value2) {
            addCriterion("hlsw_hlbh between", value1, value2, "hlswHlbh");
            return (Criteria) this;
        }

        public Criteria andHlswHlbhNotBetween(String value1, String value2) {
            addCriterion("hlsw_hlbh not between", value1, value2, "hlswHlbh");
            return (Criteria) this;
        }

        public Criteria andHlswSjIsNull() {
            addCriterion("hlsw_sj is null");
            return (Criteria) this;
        }

        public Criteria andHlswSjIsNotNull() {
            addCriterion("hlsw_sj is not null");
            return (Criteria) this;
        }

        public Criteria andHlswSjEqualTo(Date value) {
            addCriterion("hlsw_sj =", value, "hlswSj");
            return (Criteria) this;
        }

        public Criteria andHlswSjNotEqualTo(Date value) {
            addCriterion("hlsw_sj <>", value, "hlswSj");
            return (Criteria) this;
        }

        public Criteria andHlswSjGreaterThan(Date value) {
            addCriterion("hlsw_sj >", value, "hlswSj");
            return (Criteria) this;
        }

        public Criteria andHlswSjGreaterThanOrEqualTo(Date value) {
            addCriterion("hlsw_sj >=", value, "hlswSj");
            return (Criteria) this;
        }

        public Criteria andHlswSjLessThan(Date value) {
            addCriterion("hlsw_sj <", value, "hlswSj");
            return (Criteria) this;
        }

        public Criteria andHlswSjLessThanOrEqualTo(Date value) {
            addCriterion("hlsw_sj <=", value, "hlswSj");
            return (Criteria) this;
        }

        public Criteria andHlswSjIn(List<Date> values) {
            addCriterion("hlsw_sj in", values, "hlswSj");
            return (Criteria) this;
        }

        public Criteria andHlswSjNotIn(List<Date> values) {
            addCriterion("hlsw_sj not in", values, "hlswSj");
            return (Criteria) this;
        }

        public Criteria andHlswSjBetween(Date value1, Date value2) {
            addCriterion("hlsw_sj between", value1, value2, "hlswSj");
            return (Criteria) this;
        }

        public Criteria andHlswSjNotBetween(Date value1, Date value2) {
            addCriterion("hlsw_sj not between", value1, value2, "hlswSj");
            return (Criteria) this;
        }

        public Criteria andHlswJylIsNull() {
            addCriterion("hlsw_jyl is null");
            return (Criteria) this;
        }

        public Criteria andHlswJylIsNotNull() {
            addCriterion("hlsw_jyl is not null");
            return (Criteria) this;
        }

        public Criteria andHlswJylEqualTo(Double value) {
            addCriterion("hlsw_jyl =", value, "hlswJyl");
            return (Criteria) this;
        }

        public Criteria andHlswJylNotEqualTo(Double value) {
            addCriterion("hlsw_jyl <>", value, "hlswJyl");
            return (Criteria) this;
        }

        public Criteria andHlswJylGreaterThan(Double value) {
            addCriterion("hlsw_jyl >", value, "hlswJyl");
            return (Criteria) this;
        }

        public Criteria andHlswJylGreaterThanOrEqualTo(Double value) {
            addCriterion("hlsw_jyl >=", value, "hlswJyl");
            return (Criteria) this;
        }

        public Criteria andHlswJylLessThan(Double value) {
            addCriterion("hlsw_jyl <", value, "hlswJyl");
            return (Criteria) this;
        }

        public Criteria andHlswJylLessThanOrEqualTo(Double value) {
            addCriterion("hlsw_jyl <=", value, "hlswJyl");
            return (Criteria) this;
        }

        public Criteria andHlswJylIn(List<Double> values) {
            addCriterion("hlsw_jyl in", values, "hlswJyl");
            return (Criteria) this;
        }

        public Criteria andHlswJylNotIn(List<Double> values) {
            addCriterion("hlsw_jyl not in", values, "hlswJyl");
            return (Criteria) this;
        }

        public Criteria andHlswJylBetween(Double value1, Double value2) {
            addCriterion("hlsw_jyl between", value1, value2, "hlswJyl");
            return (Criteria) this;
        }

        public Criteria andHlswJylNotBetween(Double value1, Double value2) {
            addCriterion("hlsw_jyl not between", value1, value2, "hlswJyl");
            return (Criteria) this;
        }

        public Criteria andHlswZflIsNull() {
            addCriterion("hlsw_zfl is null");
            return (Criteria) this;
        }

        public Criteria andHlswZflIsNotNull() {
            addCriterion("hlsw_zfl is not null");
            return (Criteria) this;
        }

        public Criteria andHlswZflEqualTo(Double value) {
            addCriterion("hlsw_zfl =", value, "hlswZfl");
            return (Criteria) this;
        }

        public Criteria andHlswZflNotEqualTo(Double value) {
            addCriterion("hlsw_zfl <>", value, "hlswZfl");
            return (Criteria) this;
        }

        public Criteria andHlswZflGreaterThan(Double value) {
            addCriterion("hlsw_zfl >", value, "hlswZfl");
            return (Criteria) this;
        }

        public Criteria andHlswZflGreaterThanOrEqualTo(Double value) {
            addCriterion("hlsw_zfl >=", value, "hlswZfl");
            return (Criteria) this;
        }

        public Criteria andHlswZflLessThan(Double value) {
            addCriterion("hlsw_zfl <", value, "hlswZfl");
            return (Criteria) this;
        }

        public Criteria andHlswZflLessThanOrEqualTo(Double value) {
            addCriterion("hlsw_zfl <=", value, "hlswZfl");
            return (Criteria) this;
        }

        public Criteria andHlswZflIn(List<Double> values) {
            addCriterion("hlsw_zfl in", values, "hlswZfl");
            return (Criteria) this;
        }

        public Criteria andHlswZflNotIn(List<Double> values) {
            addCriterion("hlsw_zfl not in", values, "hlswZfl");
            return (Criteria) this;
        }

        public Criteria andHlswZflBetween(Double value1, Double value2) {
            addCriterion("hlsw_zfl between", value1, value2, "hlswZfl");
            return (Criteria) this;
        }

        public Criteria andHlswZflNotBetween(Double value1, Double value2) {
            addCriterion("hlsw_zfl not between", value1, value2, "hlswZfl");
            return (Criteria) this;
        }

        public Criteria andHlswLlIsNull() {
            addCriterion("hlsw_ll is null");
            return (Criteria) this;
        }

        public Criteria andHlswLlIsNotNull() {
            addCriterion("hlsw_ll is not null");
            return (Criteria) this;
        }

        public Criteria andHlswLlEqualTo(Double value) {
            addCriterion("hlsw_ll =", value, "hlswLl");
            return (Criteria) this;
        }

        public Criteria andHlswLlNotEqualTo(Double value) {
            addCriterion("hlsw_ll <>", value, "hlswLl");
            return (Criteria) this;
        }

        public Criteria andHlswLlGreaterThan(Double value) {
            addCriterion("hlsw_ll >", value, "hlswLl");
            return (Criteria) this;
        }

        public Criteria andHlswLlGreaterThanOrEqualTo(Double value) {
            addCriterion("hlsw_ll >=", value, "hlswLl");
            return (Criteria) this;
        }

        public Criteria andHlswLlLessThan(Double value) {
            addCriterion("hlsw_ll <", value, "hlswLl");
            return (Criteria) this;
        }

        public Criteria andHlswLlLessThanOrEqualTo(Double value) {
            addCriterion("hlsw_ll <=", value, "hlswLl");
            return (Criteria) this;
        }

        public Criteria andHlswLlIn(List<Double> values) {
            addCriterion("hlsw_ll in", values, "hlswLl");
            return (Criteria) this;
        }

        public Criteria andHlswLlNotIn(List<Double> values) {
            addCriterion("hlsw_ll not in", values, "hlswLl");
            return (Criteria) this;
        }

        public Criteria andHlswLlBetween(Double value1, Double value2) {
            addCriterion("hlsw_ll between", value1, value2, "hlswLl");
            return (Criteria) this;
        }

        public Criteria andHlswLlNotBetween(Double value1, Double value2) {
            addCriterion("hlsw_ll not between", value1, value2, "hlswLl");
            return (Criteria) this;
        }

        public Criteria andHlswSwIsNull() {
            addCriterion("hlsw_sw is null");
            return (Criteria) this;
        }

        public Criteria andHlswSwIsNotNull() {
            addCriterion("hlsw_sw is not null");
            return (Criteria) this;
        }

        public Criteria andHlswSwEqualTo(Double value) {
            addCriterion("hlsw_sw =", value, "hlswSw");
            return (Criteria) this;
        }

        public Criteria andHlswSwNotEqualTo(Double value) {
            addCriterion("hlsw_sw <>", value, "hlswSw");
            return (Criteria) this;
        }

        public Criteria andHlswSwGreaterThan(Double value) {
            addCriterion("hlsw_sw >", value, "hlswSw");
            return (Criteria) this;
        }

        public Criteria andHlswSwGreaterThanOrEqualTo(Double value) {
            addCriterion("hlsw_sw >=", value, "hlswSw");
            return (Criteria) this;
        }

        public Criteria andHlswSwLessThan(Double value) {
            addCriterion("hlsw_sw <", value, "hlswSw");
            return (Criteria) this;
        }

        public Criteria andHlswSwLessThanOrEqualTo(Double value) {
            addCriterion("hlsw_sw <=", value, "hlswSw");
            return (Criteria) this;
        }

        public Criteria andHlswSwIn(List<Double> values) {
            addCriterion("hlsw_sw in", values, "hlswSw");
            return (Criteria) this;
        }

        public Criteria andHlswSwNotIn(List<Double> values) {
            addCriterion("hlsw_sw not in", values, "hlswSw");
            return (Criteria) this;
        }

        public Criteria andHlswSwBetween(Double value1, Double value2) {
            addCriterion("hlsw_sw between", value1, value2, "hlswSw");
            return (Criteria) this;
        }

        public Criteria andHlswSwNotBetween(Double value1, Double value2) {
            addCriterion("hlsw_sw not between", value1, value2, "hlswSw");
            return (Criteria) this;
        }

        public Criteria andHlswLsIsNull() {
            addCriterion("hlsw_ls is null");
            return (Criteria) this;
        }

        public Criteria andHlswLsIsNotNull() {
            addCriterion("hlsw_ls is not null");
            return (Criteria) this;
        }

        public Criteria andHlswLsEqualTo(Double value) {
            addCriterion("hlsw_ls =", value, "hlswLs");
            return (Criteria) this;
        }

        public Criteria andHlswLsNotEqualTo(Double value) {
            addCriterion("hlsw_ls <>", value, "hlswLs");
            return (Criteria) this;
        }

        public Criteria andHlswLsGreaterThan(Double value) {
            addCriterion("hlsw_ls >", value, "hlswLs");
            return (Criteria) this;
        }

        public Criteria andHlswLsGreaterThanOrEqualTo(Double value) {
            addCriterion("hlsw_ls >=", value, "hlswLs");
            return (Criteria) this;
        }

        public Criteria andHlswLsLessThan(Double value) {
            addCriterion("hlsw_ls <", value, "hlswLs");
            return (Criteria) this;
        }

        public Criteria andHlswLsLessThanOrEqualTo(Double value) {
            addCriterion("hlsw_ls <=", value, "hlswLs");
            return (Criteria) this;
        }

        public Criteria andHlswLsIn(List<Double> values) {
            addCriterion("hlsw_ls in", values, "hlswLs");
            return (Criteria) this;
        }

        public Criteria andHlswLsNotIn(List<Double> values) {
            addCriterion("hlsw_ls not in", values, "hlswLs");
            return (Criteria) this;
        }

        public Criteria andHlswLsBetween(Double value1, Double value2) {
            addCriterion("hlsw_ls between", value1, value2, "hlswLs");
            return (Criteria) this;
        }

        public Criteria andHlswLsNotBetween(Double value1, Double value2) {
            addCriterion("hlsw_ls not between", value1, value2, "hlswLs");
            return (Criteria) this;
        }

        public Criteria andHlswBl1IsNull() {
            addCriterion("hlsw_bl1 is null");
            return (Criteria) this;
        }

        public Criteria andHlswBl1IsNotNull() {
            addCriterion("hlsw_bl1 is not null");
            return (Criteria) this;
        }

        public Criteria andHlswBl1EqualTo(String value) {
            addCriterion("hlsw_bl1 =", value, "hlswBl1");
            return (Criteria) this;
        }

        public Criteria andHlswBl1NotEqualTo(String value) {
            addCriterion("hlsw_bl1 <>", value, "hlswBl1");
            return (Criteria) this;
        }

        public Criteria andHlswBl1GreaterThan(String value) {
            addCriterion("hlsw_bl1 >", value, "hlswBl1");
            return (Criteria) this;
        }

        public Criteria andHlswBl1GreaterThanOrEqualTo(String value) {
            addCriterion("hlsw_bl1 >=", value, "hlswBl1");
            return (Criteria) this;
        }

        public Criteria andHlswBl1LessThan(String value) {
            addCriterion("hlsw_bl1 <", value, "hlswBl1");
            return (Criteria) this;
        }

        public Criteria andHlswBl1LessThanOrEqualTo(String value) {
            addCriterion("hlsw_bl1 <=", value, "hlswBl1");
            return (Criteria) this;
        }

        public Criteria andHlswBl1Like(String value) {
            addCriterion("hlsw_bl1 like", value, "hlswBl1");
            return (Criteria) this;
        }

        public Criteria andHlswBl1NotLike(String value) {
            addCriterion("hlsw_bl1 not like", value, "hlswBl1");
            return (Criteria) this;
        }

        public Criteria andHlswBl1In(List<String> values) {
            addCriterion("hlsw_bl1 in", values, "hlswBl1");
            return (Criteria) this;
        }

        public Criteria andHlswBl1NotIn(List<String> values) {
            addCriterion("hlsw_bl1 not in", values, "hlswBl1");
            return (Criteria) this;
        }

        public Criteria andHlswBl1Between(String value1, String value2) {
            addCriterion("hlsw_bl1 between", value1, value2, "hlswBl1");
            return (Criteria) this;
        }

        public Criteria andHlswBl1NotBetween(String value1, String value2) {
            addCriterion("hlsw_bl1 not between", value1, value2, "hlswBl1");
            return (Criteria) this;
        }

        public Criteria andHlswBl2IsNull() {
            addCriterion("hlsw_bl2 is null");
            return (Criteria) this;
        }

        public Criteria andHlswBl2IsNotNull() {
            addCriterion("hlsw_bl2 is not null");
            return (Criteria) this;
        }

        public Criteria andHlswBl2EqualTo(String value) {
            addCriterion("hlsw_bl2 =", value, "hlswBl2");
            return (Criteria) this;
        }

        public Criteria andHlswBl2NotEqualTo(String value) {
            addCriterion("hlsw_bl2 <>", value, "hlswBl2");
            return (Criteria) this;
        }

        public Criteria andHlswBl2GreaterThan(String value) {
            addCriterion("hlsw_bl2 >", value, "hlswBl2");
            return (Criteria) this;
        }

        public Criteria andHlswBl2GreaterThanOrEqualTo(String value) {
            addCriterion("hlsw_bl2 >=", value, "hlswBl2");
            return (Criteria) this;
        }

        public Criteria andHlswBl2LessThan(String value) {
            addCriterion("hlsw_bl2 <", value, "hlswBl2");
            return (Criteria) this;
        }

        public Criteria andHlswBl2LessThanOrEqualTo(String value) {
            addCriterion("hlsw_bl2 <=", value, "hlswBl2");
            return (Criteria) this;
        }

        public Criteria andHlswBl2Like(String value) {
            addCriterion("hlsw_bl2 like", value, "hlswBl2");
            return (Criteria) this;
        }

        public Criteria andHlswBl2NotLike(String value) {
            addCriterion("hlsw_bl2 not like", value, "hlswBl2");
            return (Criteria) this;
        }

        public Criteria andHlswBl2In(List<String> values) {
            addCriterion("hlsw_bl2 in", values, "hlswBl2");
            return (Criteria) this;
        }

        public Criteria andHlswBl2NotIn(List<String> values) {
            addCriterion("hlsw_bl2 not in", values, "hlswBl2");
            return (Criteria) this;
        }

        public Criteria andHlswBl2Between(String value1, String value2) {
            addCriterion("hlsw_bl2 between", value1, value2, "hlswBl2");
            return (Criteria) this;
        }

        public Criteria andHlswBl2NotBetween(String value1, String value2) {
            addCriterion("hlsw_bl2 not between", value1, value2, "hlswBl2");
            return (Criteria) this;
        }

        public Criteria andHlswBl3IsNull() {
            addCriterion("hlsw_bl3 is null");
            return (Criteria) this;
        }

        public Criteria andHlswBl3IsNotNull() {
            addCriterion("hlsw_bl3 is not null");
            return (Criteria) this;
        }

        public Criteria andHlswBl3EqualTo(String value) {
            addCriterion("hlsw_bl3 =", value, "hlswBl3");
            return (Criteria) this;
        }

        public Criteria andHlswBl3NotEqualTo(String value) {
            addCriterion("hlsw_bl3 <>", value, "hlswBl3");
            return (Criteria) this;
        }

        public Criteria andHlswBl3GreaterThan(String value) {
            addCriterion("hlsw_bl3 >", value, "hlswBl3");
            return (Criteria) this;
        }

        public Criteria andHlswBl3GreaterThanOrEqualTo(String value) {
            addCriterion("hlsw_bl3 >=", value, "hlswBl3");
            return (Criteria) this;
        }

        public Criteria andHlswBl3LessThan(String value) {
            addCriterion("hlsw_bl3 <", value, "hlswBl3");
            return (Criteria) this;
        }

        public Criteria andHlswBl3LessThanOrEqualTo(String value) {
            addCriterion("hlsw_bl3 <=", value, "hlswBl3");
            return (Criteria) this;
        }

        public Criteria andHlswBl3Like(String value) {
            addCriterion("hlsw_bl3 like", value, "hlswBl3");
            return (Criteria) this;
        }

        public Criteria andHlswBl3NotLike(String value) {
            addCriterion("hlsw_bl3 not like", value, "hlswBl3");
            return (Criteria) this;
        }

        public Criteria andHlswBl3In(List<String> values) {
            addCriterion("hlsw_bl3 in", values, "hlswBl3");
            return (Criteria) this;
        }

        public Criteria andHlswBl3NotIn(List<String> values) {
            addCriterion("hlsw_bl3 not in", values, "hlswBl3");
            return (Criteria) this;
        }

        public Criteria andHlswBl3Between(String value1, String value2) {
            addCriterion("hlsw_bl3 between", value1, value2, "hlswBl3");
            return (Criteria) this;
        }

        public Criteria andHlswBl3NotBetween(String value1, String value2) {
            addCriterion("hlsw_bl3 not between", value1, value2, "hlswBl3");
            return (Criteria) this;
        }

        public Criteria andHlswBl4IsNull() {
            addCriterion("hlsw_bl4 is null");
            return (Criteria) this;
        }

        public Criteria andHlswBl4IsNotNull() {
            addCriterion("hlsw_bl4 is not null");
            return (Criteria) this;
        }

        public Criteria andHlswBl4EqualTo(String value) {
            addCriterion("hlsw_bl4 =", value, "hlswBl4");
            return (Criteria) this;
        }

        public Criteria andHlswBl4NotEqualTo(String value) {
            addCriterion("hlsw_bl4 <>", value, "hlswBl4");
            return (Criteria) this;
        }

        public Criteria andHlswBl4GreaterThan(String value) {
            addCriterion("hlsw_bl4 >", value, "hlswBl4");
            return (Criteria) this;
        }

        public Criteria andHlswBl4GreaterThanOrEqualTo(String value) {
            addCriterion("hlsw_bl4 >=", value, "hlswBl4");
            return (Criteria) this;
        }

        public Criteria andHlswBl4LessThan(String value) {
            addCriterion("hlsw_bl4 <", value, "hlswBl4");
            return (Criteria) this;
        }

        public Criteria andHlswBl4LessThanOrEqualTo(String value) {
            addCriterion("hlsw_bl4 <=", value, "hlswBl4");
            return (Criteria) this;
        }

        public Criteria andHlswBl4Like(String value) {
            addCriterion("hlsw_bl4 like", value, "hlswBl4");
            return (Criteria) this;
        }

        public Criteria andHlswBl4NotLike(String value) {
            addCriterion("hlsw_bl4 not like", value, "hlswBl4");
            return (Criteria) this;
        }

        public Criteria andHlswBl4In(List<String> values) {
            addCriterion("hlsw_bl4 in", values, "hlswBl4");
            return (Criteria) this;
        }

        public Criteria andHlswBl4NotIn(List<String> values) {
            addCriterion("hlsw_bl4 not in", values, "hlswBl4");
            return (Criteria) this;
        }

        public Criteria andHlswBl4Between(String value1, String value2) {
            addCriterion("hlsw_bl4 between", value1, value2, "hlswBl4");
            return (Criteria) this;
        }

        public Criteria andHlswBl4NotBetween(String value1, String value2) {
            addCriterion("hlsw_bl4 not between", value1, value2, "hlswBl4");
            return (Criteria) this;
        }

        public Criteria andHlswBl5IsNull() {
            addCriterion("hlsw_bl5 is null");
            return (Criteria) this;
        }

        public Criteria andHlswBl5IsNotNull() {
            addCriterion("hlsw_bl5 is not null");
            return (Criteria) this;
        }

        public Criteria andHlswBl5EqualTo(String value) {
            addCriterion("hlsw_bl5 =", value, "hlswBl5");
            return (Criteria) this;
        }

        public Criteria andHlswBl5NotEqualTo(String value) {
            addCriterion("hlsw_bl5 <>", value, "hlswBl5");
            return (Criteria) this;
        }

        public Criteria andHlswBl5GreaterThan(String value) {
            addCriterion("hlsw_bl5 >", value, "hlswBl5");
            return (Criteria) this;
        }

        public Criteria andHlswBl5GreaterThanOrEqualTo(String value) {
            addCriterion("hlsw_bl5 >=", value, "hlswBl5");
            return (Criteria) this;
        }

        public Criteria andHlswBl5LessThan(String value) {
            addCriterion("hlsw_bl5 <", value, "hlswBl5");
            return (Criteria) this;
        }

        public Criteria andHlswBl5LessThanOrEqualTo(String value) {
            addCriterion("hlsw_bl5 <=", value, "hlswBl5");
            return (Criteria) this;
        }

        public Criteria andHlswBl5Like(String value) {
            addCriterion("hlsw_bl5 like", value, "hlswBl5");
            return (Criteria) this;
        }

        public Criteria andHlswBl5NotLike(String value) {
            addCriterion("hlsw_bl5 not like", value, "hlswBl5");
            return (Criteria) this;
        }

        public Criteria andHlswBl5In(List<String> values) {
            addCriterion("hlsw_bl5 in", values, "hlswBl5");
            return (Criteria) this;
        }

        public Criteria andHlswBl5NotIn(List<String> values) {
            addCriterion("hlsw_bl5 not in", values, "hlswBl5");
            return (Criteria) this;
        }

        public Criteria andHlswBl5Between(String value1, String value2) {
            addCriterion("hlsw_bl5 between", value1, value2, "hlswBl5");
            return (Criteria) this;
        }

        public Criteria andHlswBl5NotBetween(String value1, String value2) {
            addCriterion("hlsw_bl5 not between", value1, value2, "hlswBl5");
            return (Criteria) this;
        }

        public Criteria andHlswBl6IsNull() {
            addCriterion("hlsw_bl6 is null");
            return (Criteria) this;
        }

        public Criteria andHlswBl6IsNotNull() {
            addCriterion("hlsw_bl6 is not null");
            return (Criteria) this;
        }

        public Criteria andHlswBl6EqualTo(String value) {
            addCriterion("hlsw_bl6 =", value, "hlswBl6");
            return (Criteria) this;
        }

        public Criteria andHlswBl6NotEqualTo(String value) {
            addCriterion("hlsw_bl6 <>", value, "hlswBl6");
            return (Criteria) this;
        }

        public Criteria andHlswBl6GreaterThan(String value) {
            addCriterion("hlsw_bl6 >", value, "hlswBl6");
            return (Criteria) this;
        }

        public Criteria andHlswBl6GreaterThanOrEqualTo(String value) {
            addCriterion("hlsw_bl6 >=", value, "hlswBl6");
            return (Criteria) this;
        }

        public Criteria andHlswBl6LessThan(String value) {
            addCriterion("hlsw_bl6 <", value, "hlswBl6");
            return (Criteria) this;
        }

        public Criteria andHlswBl6LessThanOrEqualTo(String value) {
            addCriterion("hlsw_bl6 <=", value, "hlswBl6");
            return (Criteria) this;
        }

        public Criteria andHlswBl6Like(String value) {
            addCriterion("hlsw_bl6 like", value, "hlswBl6");
            return (Criteria) this;
        }

        public Criteria andHlswBl6NotLike(String value) {
            addCriterion("hlsw_bl6 not like", value, "hlswBl6");
            return (Criteria) this;
        }

        public Criteria andHlswBl6In(List<String> values) {
            addCriterion("hlsw_bl6 in", values, "hlswBl6");
            return (Criteria) this;
        }

        public Criteria andHlswBl6NotIn(List<String> values) {
            addCriterion("hlsw_bl6 not in", values, "hlswBl6");
            return (Criteria) this;
        }

        public Criteria andHlswBl6Between(String value1, String value2) {
            addCriterion("hlsw_bl6 between", value1, value2, "hlswBl6");
            return (Criteria) this;
        }

        public Criteria andHlswBl6NotBetween(String value1, String value2) {
            addCriterion("hlsw_bl6 not between", value1, value2, "hlswBl6");
            return (Criteria) this;
        }

        public Criteria andHlswBl7IsNull() {
            addCriterion("hlsw_bl7 is null");
            return (Criteria) this;
        }

        public Criteria andHlswBl7IsNotNull() {
            addCriterion("hlsw_bl7 is not null");
            return (Criteria) this;
        }

        public Criteria andHlswBl7EqualTo(String value) {
            addCriterion("hlsw_bl7 =", value, "hlswBl7");
            return (Criteria) this;
        }

        public Criteria andHlswBl7NotEqualTo(String value) {
            addCriterion("hlsw_bl7 <>", value, "hlswBl7");
            return (Criteria) this;
        }

        public Criteria andHlswBl7GreaterThan(String value) {
            addCriterion("hlsw_bl7 >", value, "hlswBl7");
            return (Criteria) this;
        }

        public Criteria andHlswBl7GreaterThanOrEqualTo(String value) {
            addCriterion("hlsw_bl7 >=", value, "hlswBl7");
            return (Criteria) this;
        }

        public Criteria andHlswBl7LessThan(String value) {
            addCriterion("hlsw_bl7 <", value, "hlswBl7");
            return (Criteria) this;
        }

        public Criteria andHlswBl7LessThanOrEqualTo(String value) {
            addCriterion("hlsw_bl7 <=", value, "hlswBl7");
            return (Criteria) this;
        }

        public Criteria andHlswBl7Like(String value) {
            addCriterion("hlsw_bl7 like", value, "hlswBl7");
            return (Criteria) this;
        }

        public Criteria andHlswBl7NotLike(String value) {
            addCriterion("hlsw_bl7 not like", value, "hlswBl7");
            return (Criteria) this;
        }

        public Criteria andHlswBl7In(List<String> values) {
            addCriterion("hlsw_bl7 in", values, "hlswBl7");
            return (Criteria) this;
        }

        public Criteria andHlswBl7NotIn(List<String> values) {
            addCriterion("hlsw_bl7 not in", values, "hlswBl7");
            return (Criteria) this;
        }

        public Criteria andHlswBl7Between(String value1, String value2) {
            addCriterion("hlsw_bl7 between", value1, value2, "hlswBl7");
            return (Criteria) this;
        }

        public Criteria andHlswBl7NotBetween(String value1, String value2) {
            addCriterion("hlsw_bl7 not between", value1, value2, "hlswBl7");
            return (Criteria) this;
        }

        public Criteria andHlswBl8IsNull() {
            addCriterion("hlsw_bl8 is null");
            return (Criteria) this;
        }

        public Criteria andHlswBl8IsNotNull() {
            addCriterion("hlsw_bl8 is not null");
            return (Criteria) this;
        }

        public Criteria andHlswBl8EqualTo(String value) {
            addCriterion("hlsw_bl8 =", value, "hlswBl8");
            return (Criteria) this;
        }

        public Criteria andHlswBl8NotEqualTo(String value) {
            addCriterion("hlsw_bl8 <>", value, "hlswBl8");
            return (Criteria) this;
        }

        public Criteria andHlswBl8GreaterThan(String value) {
            addCriterion("hlsw_bl8 >", value, "hlswBl8");
            return (Criteria) this;
        }

        public Criteria andHlswBl8GreaterThanOrEqualTo(String value) {
            addCriterion("hlsw_bl8 >=", value, "hlswBl8");
            return (Criteria) this;
        }

        public Criteria andHlswBl8LessThan(String value) {
            addCriterion("hlsw_bl8 <", value, "hlswBl8");
            return (Criteria) this;
        }

        public Criteria andHlswBl8LessThanOrEqualTo(String value) {
            addCriterion("hlsw_bl8 <=", value, "hlswBl8");
            return (Criteria) this;
        }

        public Criteria andHlswBl8Like(String value) {
            addCriterion("hlsw_bl8 like", value, "hlswBl8");
            return (Criteria) this;
        }

        public Criteria andHlswBl8NotLike(String value) {
            addCriterion("hlsw_bl8 not like", value, "hlswBl8");
            return (Criteria) this;
        }

        public Criteria andHlswBl8In(List<String> values) {
            addCriterion("hlsw_bl8 in", values, "hlswBl8");
            return (Criteria) this;
        }

        public Criteria andHlswBl8NotIn(List<String> values) {
            addCriterion("hlsw_bl8 not in", values, "hlswBl8");
            return (Criteria) this;
        }

        public Criteria andHlswBl8Between(String value1, String value2) {
            addCriterion("hlsw_bl8 between", value1, value2, "hlswBl8");
            return (Criteria) this;
        }

        public Criteria andHlswBl8NotBetween(String value1, String value2) {
            addCriterion("hlsw_bl8 not between", value1, value2, "hlswBl8");
            return (Criteria) this;
        }

        public Criteria andHlswBl9IsNull() {
            addCriterion("hlsw_bl9 is null");
            return (Criteria) this;
        }

        public Criteria andHlswBl9IsNotNull() {
            addCriterion("hlsw_bl9 is not null");
            return (Criteria) this;
        }

        public Criteria andHlswBl9EqualTo(String value) {
            addCriterion("hlsw_bl9 =", value, "hlswBl9");
            return (Criteria) this;
        }

        public Criteria andHlswBl9NotEqualTo(String value) {
            addCriterion("hlsw_bl9 <>", value, "hlswBl9");
            return (Criteria) this;
        }

        public Criteria andHlswBl9GreaterThan(String value) {
            addCriterion("hlsw_bl9 >", value, "hlswBl9");
            return (Criteria) this;
        }

        public Criteria andHlswBl9GreaterThanOrEqualTo(String value) {
            addCriterion("hlsw_bl9 >=", value, "hlswBl9");
            return (Criteria) this;
        }

        public Criteria andHlswBl9LessThan(String value) {
            addCriterion("hlsw_bl9 <", value, "hlswBl9");
            return (Criteria) this;
        }

        public Criteria andHlswBl9LessThanOrEqualTo(String value) {
            addCriterion("hlsw_bl9 <=", value, "hlswBl9");
            return (Criteria) this;
        }

        public Criteria andHlswBl9Like(String value) {
            addCriterion("hlsw_bl9 like", value, "hlswBl9");
            return (Criteria) this;
        }

        public Criteria andHlswBl9NotLike(String value) {
            addCriterion("hlsw_bl9 not like", value, "hlswBl9");
            return (Criteria) this;
        }

        public Criteria andHlswBl9In(List<String> values) {
            addCriterion("hlsw_bl9 in", values, "hlswBl9");
            return (Criteria) this;
        }

        public Criteria andHlswBl9NotIn(List<String> values) {
            addCriterion("hlsw_bl9 not in", values, "hlswBl9");
            return (Criteria) this;
        }

        public Criteria andHlswBl9Between(String value1, String value2) {
            addCriterion("hlsw_bl9 between", value1, value2, "hlswBl9");
            return (Criteria) this;
        }

        public Criteria andHlswBl9NotBetween(String value1, String value2) {
            addCriterion("hlsw_bl9 not between", value1, value2, "hlswBl9");
            return (Criteria) this;
        }

        public Criteria andHlswBl10IsNull() {
            addCriterion("hlsw_bl10 is null");
            return (Criteria) this;
        }

        public Criteria andHlswBl10IsNotNull() {
            addCriterion("hlsw_bl10 is not null");
            return (Criteria) this;
        }

        public Criteria andHlswBl10EqualTo(String value) {
            addCriterion("hlsw_bl10 =", value, "hlswBl10");
            return (Criteria) this;
        }

        public Criteria andHlswBl10NotEqualTo(String value) {
            addCriterion("hlsw_bl10 <>", value, "hlswBl10");
            return (Criteria) this;
        }

        public Criteria andHlswBl10GreaterThan(String value) {
            addCriterion("hlsw_bl10 >", value, "hlswBl10");
            return (Criteria) this;
        }

        public Criteria andHlswBl10GreaterThanOrEqualTo(String value) {
            addCriterion("hlsw_bl10 >=", value, "hlswBl10");
            return (Criteria) this;
        }

        public Criteria andHlswBl10LessThan(String value) {
            addCriterion("hlsw_bl10 <", value, "hlswBl10");
            return (Criteria) this;
        }

        public Criteria andHlswBl10LessThanOrEqualTo(String value) {
            addCriterion("hlsw_bl10 <=", value, "hlswBl10");
            return (Criteria) this;
        }

        public Criteria andHlswBl10Like(String value) {
            addCriterion("hlsw_bl10 like", value, "hlswBl10");
            return (Criteria) this;
        }

        public Criteria andHlswBl10NotLike(String value) {
            addCriterion("hlsw_bl10 not like", value, "hlswBl10");
            return (Criteria) this;
        }

        public Criteria andHlswBl10In(List<String> values) {
            addCriterion("hlsw_bl10 in", values, "hlswBl10");
            return (Criteria) this;
        }

        public Criteria andHlswBl10NotIn(List<String> values) {
            addCriterion("hlsw_bl10 not in", values, "hlswBl10");
            return (Criteria) this;
        }

        public Criteria andHlswBl10Between(String value1, String value2) {
            addCriterion("hlsw_bl10 between", value1, value2, "hlswBl10");
            return (Criteria) this;
        }

        public Criteria andHlswBl10NotBetween(String value1, String value2) {
            addCriterion("hlsw_bl10 not between", value1, value2, "hlswBl10");
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