package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class QmpWrxxYearExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QmpWrxxYearExample() {
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

        public Criteria andZrsIsNull() {
            addCriterion("zrs is null");
            return (Criteria) this;
        }

        public Criteria andZrsIsNotNull() {
            addCriterion("zrs is not null");
            return (Criteria) this;
        }

        public Criteria andZrsEqualTo(String value) {
            addCriterion("zrs =", value, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsNotEqualTo(String value) {
            addCriterion("zrs <>", value, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsGreaterThan(String value) {
            addCriterion("zrs >", value, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsGreaterThanOrEqualTo(String value) {
            addCriterion("zrs >=", value, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsLessThan(String value) {
            addCriterion("zrs <", value, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsLessThanOrEqualTo(String value) {
            addCriterion("zrs <=", value, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsLike(String value) {
            addCriterion("zrs like", value, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsNotLike(String value) {
            addCriterion("zrs not like", value, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsIn(List<String> values) {
            addCriterion("zrs in", values, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsNotIn(List<String> values) {
            addCriterion("zrs not in", values, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsBetween(String value1, String value2) {
            addCriterion("zrs between", value1, value2, "zrs");
            return (Criteria) this;
        }

        public Criteria andZrsNotBetween(String value1, String value2) {
            addCriterion("zrs not between", value1, value2, "zrs");
            return (Criteria) this;
        }

        public Criteria andYkhIsNull() {
            addCriterion("ykh is null");
            return (Criteria) this;
        }

        public Criteria andYkhIsNotNull() {
            addCriterion("ykh is not null");
            return (Criteria) this;
        }

        public Criteria andYkhEqualTo(String value) {
            addCriterion("ykh =", value, "ykh");
            return (Criteria) this;
        }

        public Criteria andYkhNotEqualTo(String value) {
            addCriterion("ykh <>", value, "ykh");
            return (Criteria) this;
        }

        public Criteria andYkhGreaterThan(String value) {
            addCriterion("ykh >", value, "ykh");
            return (Criteria) this;
        }

        public Criteria andYkhGreaterThanOrEqualTo(String value) {
            addCriterion("ykh >=", value, "ykh");
            return (Criteria) this;
        }

        public Criteria andYkhLessThan(String value) {
            addCriterion("ykh <", value, "ykh");
            return (Criteria) this;
        }

        public Criteria andYkhLessThanOrEqualTo(String value) {
            addCriterion("ykh <=", value, "ykh");
            return (Criteria) this;
        }

        public Criteria andYkhLike(String value) {
            addCriterion("ykh like", value, "ykh");
            return (Criteria) this;
        }

        public Criteria andYkhNotLike(String value) {
            addCriterion("ykh not like", value, "ykh");
            return (Criteria) this;
        }

        public Criteria andYkhIn(List<String> values) {
            addCriterion("ykh in", values, "ykh");
            return (Criteria) this;
        }

        public Criteria andYkhNotIn(List<String> values) {
            addCriterion("ykh not in", values, "ykh");
            return (Criteria) this;
        }

        public Criteria andYkhBetween(String value1, String value2) {
            addCriterion("ykh between", value1, value2, "ykh");
            return (Criteria) this;
        }

        public Criteria andYkhNotBetween(String value1, String value2) {
            addCriterion("ykh not between", value1, value2, "ykh");
            return (Criteria) this;
        }

        public Criteria andHlszIsNull() {
            addCriterion("hlsz is null");
            return (Criteria) this;
        }

        public Criteria andHlszIsNotNull() {
            addCriterion("hlsz is not null");
            return (Criteria) this;
        }

        public Criteria andHlszEqualTo(String value) {
            addCriterion("hlsz =", value, "hlsz");
            return (Criteria) this;
        }

        public Criteria andHlszNotEqualTo(String value) {
            addCriterion("hlsz <>", value, "hlsz");
            return (Criteria) this;
        }

        public Criteria andHlszGreaterThan(String value) {
            addCriterion("hlsz >", value, "hlsz");
            return (Criteria) this;
        }

        public Criteria andHlszGreaterThanOrEqualTo(String value) {
            addCriterion("hlsz >=", value, "hlsz");
            return (Criteria) this;
        }

        public Criteria andHlszLessThan(String value) {
            addCriterion("hlsz <", value, "hlsz");
            return (Criteria) this;
        }

        public Criteria andHlszLessThanOrEqualTo(String value) {
            addCriterion("hlsz <=", value, "hlsz");
            return (Criteria) this;
        }

        public Criteria andHlszLike(String value) {
            addCriterion("hlsz like", value, "hlsz");
            return (Criteria) this;
        }

        public Criteria andHlszNotLike(String value) {
            addCriterion("hlsz not like", value, "hlsz");
            return (Criteria) this;
        }

        public Criteria andHlszIn(List<String> values) {
            addCriterion("hlsz in", values, "hlsz");
            return (Criteria) this;
        }

        public Criteria andHlszNotIn(List<String> values) {
            addCriterion("hlsz not in", values, "hlsz");
            return (Criteria) this;
        }

        public Criteria andHlszBetween(String value1, String value2) {
            addCriterion("hlsz between", value1, value2, "hlsz");
            return (Criteria) this;
        }

        public Criteria andHlszNotBetween(String value1, String value2) {
            addCriterion("hlsz not between", value1, value2, "hlsz");
            return (Criteria) this;
        }

        public Criteria andCsIsNull() {
            addCriterion("cs is null");
            return (Criteria) this;
        }

        public Criteria andCsIsNotNull() {
            addCriterion("cs is not null");
            return (Criteria) this;
        }

        public Criteria andCsEqualTo(String value) {
            addCriterion("cs =", value, "cs");
            return (Criteria) this;
        }

        public Criteria andCsNotEqualTo(String value) {
            addCriterion("cs <>", value, "cs");
            return (Criteria) this;
        }

        public Criteria andCsGreaterThan(String value) {
            addCriterion("cs >", value, "cs");
            return (Criteria) this;
        }

        public Criteria andCsGreaterThanOrEqualTo(String value) {
            addCriterion("cs >=", value, "cs");
            return (Criteria) this;
        }

        public Criteria andCsLessThan(String value) {
            addCriterion("cs <", value, "cs");
            return (Criteria) this;
        }

        public Criteria andCsLessThanOrEqualTo(String value) {
            addCriterion("cs <=", value, "cs");
            return (Criteria) this;
        }

        public Criteria andCsLike(String value) {
            addCriterion("cs like", value, "cs");
            return (Criteria) this;
        }

        public Criteria andCsNotLike(String value) {
            addCriterion("cs not like", value, "cs");
            return (Criteria) this;
        }

        public Criteria andCsIn(List<String> values) {
            addCriterion("cs in", values, "cs");
            return (Criteria) this;
        }

        public Criteria andCsNotIn(List<String> values) {
            addCriterion("cs not in", values, "cs");
            return (Criteria) this;
        }

        public Criteria andCsBetween(String value1, String value2) {
            addCriterion("cs between", value1, value2, "cs");
            return (Criteria) this;
        }

        public Criteria andCsNotBetween(String value1, String value2) {
            addCriterion("cs not between", value1, value2, "cs");
            return (Criteria) this;
        }

        public Criteria andDmmcIsNull() {
            addCriterion("dmmc is null");
            return (Criteria) this;
        }

        public Criteria andDmmcIsNotNull() {
            addCriterion("dmmc is not null");
            return (Criteria) this;
        }

        public Criteria andDmmcEqualTo(String value) {
            addCriterion("dmmc =", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcNotEqualTo(String value) {
            addCriterion("dmmc <>", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcGreaterThan(String value) {
            addCriterion("dmmc >", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcGreaterThanOrEqualTo(String value) {
            addCriterion("dmmc >=", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcLessThan(String value) {
            addCriterion("dmmc <", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcLessThanOrEqualTo(String value) {
            addCriterion("dmmc <=", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcLike(String value) {
            addCriterion("dmmc like", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcNotLike(String value) {
            addCriterion("dmmc not like", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcIn(List<String> values) {
            addCriterion("dmmc in", values, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcNotIn(List<String> values) {
            addCriterion("dmmc not in", values, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcBetween(String value1, String value2) {
            addCriterion("dmmc between", value1, value2, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcNotBetween(String value1, String value2) {
            addCriterion("dmmc not between", value1, value2, "dmmc");
            return (Criteria) this;
        }

        public Criteria andSshlIsNull() {
            addCriterion("sshl is null");
            return (Criteria) this;
        }

        public Criteria andSshlIsNotNull() {
            addCriterion("sshl is not null");
            return (Criteria) this;
        }

        public Criteria andSshlEqualTo(String value) {
            addCriterion("sshl =", value, "sshl");
            return (Criteria) this;
        }

        public Criteria andSshlNotEqualTo(String value) {
            addCriterion("sshl <>", value, "sshl");
            return (Criteria) this;
        }

        public Criteria andSshlGreaterThan(String value) {
            addCriterion("sshl >", value, "sshl");
            return (Criteria) this;
        }

        public Criteria andSshlGreaterThanOrEqualTo(String value) {
            addCriterion("sshl >=", value, "sshl");
            return (Criteria) this;
        }

        public Criteria andSshlLessThan(String value) {
            addCriterion("sshl <", value, "sshl");
            return (Criteria) this;
        }

        public Criteria andSshlLessThanOrEqualTo(String value) {
            addCriterion("sshl <=", value, "sshl");
            return (Criteria) this;
        }

        public Criteria andSshlLike(String value) {
            addCriterion("sshl like", value, "sshl");
            return (Criteria) this;
        }

        public Criteria andSshlNotLike(String value) {
            addCriterion("sshl not like", value, "sshl");
            return (Criteria) this;
        }

        public Criteria andSshlIn(List<String> values) {
            addCriterion("sshl in", values, "sshl");
            return (Criteria) this;
        }

        public Criteria andSshlNotIn(List<String> values) {
            addCriterion("sshl not in", values, "sshl");
            return (Criteria) this;
        }

        public Criteria andSshlBetween(String value1, String value2) {
            addCriterion("sshl between", value1, value2, "sshl");
            return (Criteria) this;
        }

        public Criteria andSshlNotBetween(String value1, String value2) {
            addCriterion("sshl not between", value1, value2, "sshl");
            return (Criteria) this;
        }

        public Criteria andDmsxIsNull() {
            addCriterion("dmsx is null");
            return (Criteria) this;
        }

        public Criteria andDmsxIsNotNull() {
            addCriterion("dmsx is not null");
            return (Criteria) this;
        }

        public Criteria andDmsxEqualTo(String value) {
            addCriterion("dmsx =", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxNotEqualTo(String value) {
            addCriterion("dmsx <>", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxGreaterThan(String value) {
            addCriterion("dmsx >", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxGreaterThanOrEqualTo(String value) {
            addCriterion("dmsx >=", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxLessThan(String value) {
            addCriterion("dmsx <", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxLessThanOrEqualTo(String value) {
            addCriterion("dmsx <=", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxLike(String value) {
            addCriterion("dmsx like", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxNotLike(String value) {
            addCriterion("dmsx not like", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxIn(List<String> values) {
            addCriterion("dmsx in", values, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxNotIn(List<String> values) {
            addCriterion("dmsx not in", values, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxBetween(String value1, String value2) {
            addCriterion("dmsx between", value1, value2, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxNotBetween(String value1, String value2) {
            addCriterion("dmsx not between", value1, value2, "dmsx");
            return (Criteria) this;
        }

        public Criteria andGoal2020IsNull() {
            addCriterion("goal2020 is null");
            return (Criteria) this;
        }

        public Criteria andGoal2020IsNotNull() {
            addCriterion("goal2020 is not null");
            return (Criteria) this;
        }

        public Criteria andGoal2020EqualTo(String value) {
            addCriterion("goal2020 =", value, "goal2020");
            return (Criteria) this;
        }

        public Criteria andGoal2020NotEqualTo(String value) {
            addCriterion("goal2020 <>", value, "goal2020");
            return (Criteria) this;
        }

        public Criteria andGoal2020GreaterThan(String value) {
            addCriterion("goal2020 >", value, "goal2020");
            return (Criteria) this;
        }

        public Criteria andGoal2020GreaterThanOrEqualTo(String value) {
            addCriterion("goal2020 >=", value, "goal2020");
            return (Criteria) this;
        }

        public Criteria andGoal2020LessThan(String value) {
            addCriterion("goal2020 <", value, "goal2020");
            return (Criteria) this;
        }

        public Criteria andGoal2020LessThanOrEqualTo(String value) {
            addCriterion("goal2020 <=", value, "goal2020");
            return (Criteria) this;
        }

        public Criteria andGoal2020Like(String value) {
            addCriterion("goal2020 like", value, "goal2020");
            return (Criteria) this;
        }

        public Criteria andGoal2020NotLike(String value) {
            addCriterion("goal2020 not like", value, "goal2020");
            return (Criteria) this;
        }

        public Criteria andGoal2020In(List<String> values) {
            addCriterion("goal2020 in", values, "goal2020");
            return (Criteria) this;
        }

        public Criteria andGoal2020NotIn(List<String> values) {
            addCriterion("goal2020 not in", values, "goal2020");
            return (Criteria) this;
        }

        public Criteria andGoal2020Between(String value1, String value2) {
            addCriterion("goal2020 between", value1, value2, "goal2020");
            return (Criteria) this;
        }

        public Criteria andGoal2020NotBetween(String value1, String value2) {
            addCriterion("goal2020 not between", value1, value2, "goal2020");
            return (Criteria) this;
        }

        public Criteria andGoal2016IsNull() {
            addCriterion("goal2016 is null");
            return (Criteria) this;
        }

        public Criteria andGoal2016IsNotNull() {
            addCriterion("goal2016 is not null");
            return (Criteria) this;
        }

        public Criteria andGoal2016EqualTo(String value) {
            addCriterion("goal2016 =", value, "goal2016");
            return (Criteria) this;
        }

        public Criteria andGoal2016NotEqualTo(String value) {
            addCriterion("goal2016 <>", value, "goal2016");
            return (Criteria) this;
        }

        public Criteria andGoal2016GreaterThan(String value) {
            addCriterion("goal2016 >", value, "goal2016");
            return (Criteria) this;
        }

        public Criteria andGoal2016GreaterThanOrEqualTo(String value) {
            addCriterion("goal2016 >=", value, "goal2016");
            return (Criteria) this;
        }

        public Criteria andGoal2016LessThan(String value) {
            addCriterion("goal2016 <", value, "goal2016");
            return (Criteria) this;
        }

        public Criteria andGoal2016LessThanOrEqualTo(String value) {
            addCriterion("goal2016 <=", value, "goal2016");
            return (Criteria) this;
        }

        public Criteria andGoal2016Like(String value) {
            addCriterion("goal2016 like", value, "goal2016");
            return (Criteria) this;
        }

        public Criteria andGoal2016NotLike(String value) {
            addCriterion("goal2016 not like", value, "goal2016");
            return (Criteria) this;
        }

        public Criteria andGoal2016In(List<String> values) {
            addCriterion("goal2016 in", values, "goal2016");
            return (Criteria) this;
        }

        public Criteria andGoal2016NotIn(List<String> values) {
            addCriterion("goal2016 not in", values, "goal2016");
            return (Criteria) this;
        }

        public Criteria andGoal2016Between(String value1, String value2) {
            addCriterion("goal2016 between", value1, value2, "goal2016");
            return (Criteria) this;
        }

        public Criteria andGoal2016NotBetween(String value1, String value2) {
            addCriterion("goal2016 not between", value1, value2, "goal2016");
            return (Criteria) this;
        }

        public Criteria andGoal2017IsNull() {
            addCriterion("goal2017 is null");
            return (Criteria) this;
        }

        public Criteria andGoal2017IsNotNull() {
            addCriterion("goal2017 is not null");
            return (Criteria) this;
        }

        public Criteria andGoal2017EqualTo(String value) {
            addCriterion("goal2017 =", value, "goal2017");
            return (Criteria) this;
        }

        public Criteria andGoal2017NotEqualTo(String value) {
            addCriterion("goal2017 <>", value, "goal2017");
            return (Criteria) this;
        }

        public Criteria andGoal2017GreaterThan(String value) {
            addCriterion("goal2017 >", value, "goal2017");
            return (Criteria) this;
        }

        public Criteria andGoal2017GreaterThanOrEqualTo(String value) {
            addCriterion("goal2017 >=", value, "goal2017");
            return (Criteria) this;
        }

        public Criteria andGoal2017LessThan(String value) {
            addCriterion("goal2017 <", value, "goal2017");
            return (Criteria) this;
        }

        public Criteria andGoal2017LessThanOrEqualTo(String value) {
            addCriterion("goal2017 <=", value, "goal2017");
            return (Criteria) this;
        }

        public Criteria andGoal2017Like(String value) {
            addCriterion("goal2017 like", value, "goal2017");
            return (Criteria) this;
        }

        public Criteria andGoal2017NotLike(String value) {
            addCriterion("goal2017 not like", value, "goal2017");
            return (Criteria) this;
        }

        public Criteria andGoal2017In(List<String> values) {
            addCriterion("goal2017 in", values, "goal2017");
            return (Criteria) this;
        }

        public Criteria andGoal2017NotIn(List<String> values) {
            addCriterion("goal2017 not in", values, "goal2017");
            return (Criteria) this;
        }

        public Criteria andGoal2017Between(String value1, String value2) {
            addCriterion("goal2017 between", value1, value2, "goal2017");
            return (Criteria) this;
        }

        public Criteria andGoal2017NotBetween(String value1, String value2) {
            addCriterion("goal2017 not between", value1, value2, "goal2017");
            return (Criteria) this;
        }

        public Criteria andM1IsNull() {
            addCriterion("m1 is null");
            return (Criteria) this;
        }

        public Criteria andM1IsNotNull() {
            addCriterion("m1 is not null");
            return (Criteria) this;
        }

        public Criteria andM1EqualTo(String value) {
            addCriterion("m1 =", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1NotEqualTo(String value) {
            addCriterion("m1 <>", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1GreaterThan(String value) {
            addCriterion("m1 >", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1GreaterThanOrEqualTo(String value) {
            addCriterion("m1 >=", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1LessThan(String value) {
            addCriterion("m1 <", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1LessThanOrEqualTo(String value) {
            addCriterion("m1 <=", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1Like(String value) {
            addCriterion("m1 like", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1NotLike(String value) {
            addCriterion("m1 not like", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1In(List<String> values) {
            addCriterion("m1 in", values, "m1");
            return (Criteria) this;
        }

        public Criteria andM1NotIn(List<String> values) {
            addCriterion("m1 not in", values, "m1");
            return (Criteria) this;
        }

        public Criteria andM1Between(String value1, String value2) {
            addCriterion("m1 between", value1, value2, "m1");
            return (Criteria) this;
        }

        public Criteria andM1NotBetween(String value1, String value2) {
            addCriterion("m1 not between", value1, value2, "m1");
            return (Criteria) this;
        }

        public Criteria andM2IsNull() {
            addCriterion("m2 is null");
            return (Criteria) this;
        }

        public Criteria andM2IsNotNull() {
            addCriterion("m2 is not null");
            return (Criteria) this;
        }

        public Criteria andM2EqualTo(String value) {
            addCriterion("m2 =", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2NotEqualTo(String value) {
            addCriterion("m2 <>", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2GreaterThan(String value) {
            addCriterion("m2 >", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2GreaterThanOrEqualTo(String value) {
            addCriterion("m2 >=", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2LessThan(String value) {
            addCriterion("m2 <", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2LessThanOrEqualTo(String value) {
            addCriterion("m2 <=", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2Like(String value) {
            addCriterion("m2 like", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2NotLike(String value) {
            addCriterion("m2 not like", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2In(List<String> values) {
            addCriterion("m2 in", values, "m2");
            return (Criteria) this;
        }

        public Criteria andM2NotIn(List<String> values) {
            addCriterion("m2 not in", values, "m2");
            return (Criteria) this;
        }

        public Criteria andM2Between(String value1, String value2) {
            addCriterion("m2 between", value1, value2, "m2");
            return (Criteria) this;
        }

        public Criteria andM2NotBetween(String value1, String value2) {
            addCriterion("m2 not between", value1, value2, "m2");
            return (Criteria) this;
        }

        public Criteria andM3IsNull() {
            addCriterion("m3 is null");
            return (Criteria) this;
        }

        public Criteria andM3IsNotNull() {
            addCriterion("m3 is not null");
            return (Criteria) this;
        }

        public Criteria andM3EqualTo(String value) {
            addCriterion("m3 =", value, "m3");
            return (Criteria) this;
        }

        public Criteria andM3NotEqualTo(String value) {
            addCriterion("m3 <>", value, "m3");
            return (Criteria) this;
        }

        public Criteria andM3GreaterThan(String value) {
            addCriterion("m3 >", value, "m3");
            return (Criteria) this;
        }

        public Criteria andM3GreaterThanOrEqualTo(String value) {
            addCriterion("m3 >=", value, "m3");
            return (Criteria) this;
        }

        public Criteria andM3LessThan(String value) {
            addCriterion("m3 <", value, "m3");
            return (Criteria) this;
        }

        public Criteria andM3LessThanOrEqualTo(String value) {
            addCriterion("m3 <=", value, "m3");
            return (Criteria) this;
        }

        public Criteria andM3Like(String value) {
            addCriterion("m3 like", value, "m3");
            return (Criteria) this;
        }

        public Criteria andM3NotLike(String value) {
            addCriterion("m3 not like", value, "m3");
            return (Criteria) this;
        }

        public Criteria andM3In(List<String> values) {
            addCriterion("m3 in", values, "m3");
            return (Criteria) this;
        }

        public Criteria andM3NotIn(List<String> values) {
            addCriterion("m3 not in", values, "m3");
            return (Criteria) this;
        }

        public Criteria andM3Between(String value1, String value2) {
            addCriterion("m3 between", value1, value2, "m3");
            return (Criteria) this;
        }

        public Criteria andM3NotBetween(String value1, String value2) {
            addCriterion("m3 not between", value1, value2, "m3");
            return (Criteria) this;
        }

        public Criteria andM4IsNull() {
            addCriterion("m4 is null");
            return (Criteria) this;
        }

        public Criteria andM4IsNotNull() {
            addCriterion("m4 is not null");
            return (Criteria) this;
        }

        public Criteria andM4EqualTo(String value) {
            addCriterion("m4 =", value, "m4");
            return (Criteria) this;
        }

        public Criteria andM4NotEqualTo(String value) {
            addCriterion("m4 <>", value, "m4");
            return (Criteria) this;
        }

        public Criteria andM4GreaterThan(String value) {
            addCriterion("m4 >", value, "m4");
            return (Criteria) this;
        }

        public Criteria andM4GreaterThanOrEqualTo(String value) {
            addCriterion("m4 >=", value, "m4");
            return (Criteria) this;
        }

        public Criteria andM4LessThan(String value) {
            addCriterion("m4 <", value, "m4");
            return (Criteria) this;
        }

        public Criteria andM4LessThanOrEqualTo(String value) {
            addCriterion("m4 <=", value, "m4");
            return (Criteria) this;
        }

        public Criteria andM4Like(String value) {
            addCriterion("m4 like", value, "m4");
            return (Criteria) this;
        }

        public Criteria andM4NotLike(String value) {
            addCriterion("m4 not like", value, "m4");
            return (Criteria) this;
        }

        public Criteria andM4In(List<String> values) {
            addCriterion("m4 in", values, "m4");
            return (Criteria) this;
        }

        public Criteria andM4NotIn(List<String> values) {
            addCriterion("m4 not in", values, "m4");
            return (Criteria) this;
        }

        public Criteria andM4Between(String value1, String value2) {
            addCriterion("m4 between", value1, value2, "m4");
            return (Criteria) this;
        }

        public Criteria andM4NotBetween(String value1, String value2) {
            addCriterion("m4 not between", value1, value2, "m4");
            return (Criteria) this;
        }

        public Criteria andM5IsNull() {
            addCriterion("m5 is null");
            return (Criteria) this;
        }

        public Criteria andM5IsNotNull() {
            addCriterion("m5 is not null");
            return (Criteria) this;
        }

        public Criteria andM5EqualTo(String value) {
            addCriterion("m5 =", value, "m5");
            return (Criteria) this;
        }

        public Criteria andM5NotEqualTo(String value) {
            addCriterion("m5 <>", value, "m5");
            return (Criteria) this;
        }

        public Criteria andM5GreaterThan(String value) {
            addCriterion("m5 >", value, "m5");
            return (Criteria) this;
        }

        public Criteria andM5GreaterThanOrEqualTo(String value) {
            addCriterion("m5 >=", value, "m5");
            return (Criteria) this;
        }

        public Criteria andM5LessThan(String value) {
            addCriterion("m5 <", value, "m5");
            return (Criteria) this;
        }

        public Criteria andM5LessThanOrEqualTo(String value) {
            addCriterion("m5 <=", value, "m5");
            return (Criteria) this;
        }

        public Criteria andM5Like(String value) {
            addCriterion("m5 like", value, "m5");
            return (Criteria) this;
        }

        public Criteria andM5NotLike(String value) {
            addCriterion("m5 not like", value, "m5");
            return (Criteria) this;
        }

        public Criteria andM5In(List<String> values) {
            addCriterion("m5 in", values, "m5");
            return (Criteria) this;
        }

        public Criteria andM5NotIn(List<String> values) {
            addCriterion("m5 not in", values, "m5");
            return (Criteria) this;
        }

        public Criteria andM5Between(String value1, String value2) {
            addCriterion("m5 between", value1, value2, "m5");
            return (Criteria) this;
        }

        public Criteria andM5NotBetween(String value1, String value2) {
            addCriterion("m5 not between", value1, value2, "m5");
            return (Criteria) this;
        }

        public Criteria andM6IsNull() {
            addCriterion("m6 is null");
            return (Criteria) this;
        }

        public Criteria andM6IsNotNull() {
            addCriterion("m6 is not null");
            return (Criteria) this;
        }

        public Criteria andM6EqualTo(String value) {
            addCriterion("m6 =", value, "m6");
            return (Criteria) this;
        }

        public Criteria andM6NotEqualTo(String value) {
            addCriterion("m6 <>", value, "m6");
            return (Criteria) this;
        }

        public Criteria andM6GreaterThan(String value) {
            addCriterion("m6 >", value, "m6");
            return (Criteria) this;
        }

        public Criteria andM6GreaterThanOrEqualTo(String value) {
            addCriterion("m6 >=", value, "m6");
            return (Criteria) this;
        }

        public Criteria andM6LessThan(String value) {
            addCriterion("m6 <", value, "m6");
            return (Criteria) this;
        }

        public Criteria andM6LessThanOrEqualTo(String value) {
            addCriterion("m6 <=", value, "m6");
            return (Criteria) this;
        }

        public Criteria andM6Like(String value) {
            addCriterion("m6 like", value, "m6");
            return (Criteria) this;
        }

        public Criteria andM6NotLike(String value) {
            addCriterion("m6 not like", value, "m6");
            return (Criteria) this;
        }

        public Criteria andM6In(List<String> values) {
            addCriterion("m6 in", values, "m6");
            return (Criteria) this;
        }

        public Criteria andM6NotIn(List<String> values) {
            addCriterion("m6 not in", values, "m6");
            return (Criteria) this;
        }

        public Criteria andM6Between(String value1, String value2) {
            addCriterion("m6 between", value1, value2, "m6");
            return (Criteria) this;
        }

        public Criteria andM6NotBetween(String value1, String value2) {
            addCriterion("m6 not between", value1, value2, "m6");
            return (Criteria) this;
        }

        public Criteria andM7IsNull() {
            addCriterion("m7 is null");
            return (Criteria) this;
        }

        public Criteria andM7IsNotNull() {
            addCriterion("m7 is not null");
            return (Criteria) this;
        }

        public Criteria andM7EqualTo(String value) {
            addCriterion("m7 =", value, "m7");
            return (Criteria) this;
        }

        public Criteria andM7NotEqualTo(String value) {
            addCriterion("m7 <>", value, "m7");
            return (Criteria) this;
        }

        public Criteria andM7GreaterThan(String value) {
            addCriterion("m7 >", value, "m7");
            return (Criteria) this;
        }

        public Criteria andM7GreaterThanOrEqualTo(String value) {
            addCriterion("m7 >=", value, "m7");
            return (Criteria) this;
        }

        public Criteria andM7LessThan(String value) {
            addCriterion("m7 <", value, "m7");
            return (Criteria) this;
        }

        public Criteria andM7LessThanOrEqualTo(String value) {
            addCriterion("m7 <=", value, "m7");
            return (Criteria) this;
        }

        public Criteria andM7Like(String value) {
            addCriterion("m7 like", value, "m7");
            return (Criteria) this;
        }

        public Criteria andM7NotLike(String value) {
            addCriterion("m7 not like", value, "m7");
            return (Criteria) this;
        }

        public Criteria andM7In(List<String> values) {
            addCriterion("m7 in", values, "m7");
            return (Criteria) this;
        }

        public Criteria andM7NotIn(List<String> values) {
            addCriterion("m7 not in", values, "m7");
            return (Criteria) this;
        }

        public Criteria andM7Between(String value1, String value2) {
            addCriterion("m7 between", value1, value2, "m7");
            return (Criteria) this;
        }

        public Criteria andM7NotBetween(String value1, String value2) {
            addCriterion("m7 not between", value1, value2, "m7");
            return (Criteria) this;
        }

        public Criteria andM8IsNull() {
            addCriterion("m8 is null");
            return (Criteria) this;
        }

        public Criteria andM8IsNotNull() {
            addCriterion("m8 is not null");
            return (Criteria) this;
        }

        public Criteria andM8EqualTo(String value) {
            addCriterion("m8 =", value, "m8");
            return (Criteria) this;
        }

        public Criteria andM8NotEqualTo(String value) {
            addCriterion("m8 <>", value, "m8");
            return (Criteria) this;
        }

        public Criteria andM8GreaterThan(String value) {
            addCriterion("m8 >", value, "m8");
            return (Criteria) this;
        }

        public Criteria andM8GreaterThanOrEqualTo(String value) {
            addCriterion("m8 >=", value, "m8");
            return (Criteria) this;
        }

        public Criteria andM8LessThan(String value) {
            addCriterion("m8 <", value, "m8");
            return (Criteria) this;
        }

        public Criteria andM8LessThanOrEqualTo(String value) {
            addCriterion("m8 <=", value, "m8");
            return (Criteria) this;
        }

        public Criteria andM8Like(String value) {
            addCriterion("m8 like", value, "m8");
            return (Criteria) this;
        }

        public Criteria andM8NotLike(String value) {
            addCriterion("m8 not like", value, "m8");
            return (Criteria) this;
        }

        public Criteria andM8In(List<String> values) {
            addCriterion("m8 in", values, "m8");
            return (Criteria) this;
        }

        public Criteria andM8NotIn(List<String> values) {
            addCriterion("m8 not in", values, "m8");
            return (Criteria) this;
        }

        public Criteria andM8Between(String value1, String value2) {
            addCriterion("m8 between", value1, value2, "m8");
            return (Criteria) this;
        }

        public Criteria andM8NotBetween(String value1, String value2) {
            addCriterion("m8 not between", value1, value2, "m8");
            return (Criteria) this;
        }

        public Criteria andM9IsNull() {
            addCriterion("m9 is null");
            return (Criteria) this;
        }

        public Criteria andM9IsNotNull() {
            addCriterion("m9 is not null");
            return (Criteria) this;
        }

        public Criteria andM9EqualTo(String value) {
            addCriterion("m9 =", value, "m9");
            return (Criteria) this;
        }

        public Criteria andM9NotEqualTo(String value) {
            addCriterion("m9 <>", value, "m9");
            return (Criteria) this;
        }

        public Criteria andM9GreaterThan(String value) {
            addCriterion("m9 >", value, "m9");
            return (Criteria) this;
        }

        public Criteria andM9GreaterThanOrEqualTo(String value) {
            addCriterion("m9 >=", value, "m9");
            return (Criteria) this;
        }

        public Criteria andM9LessThan(String value) {
            addCriterion("m9 <", value, "m9");
            return (Criteria) this;
        }

        public Criteria andM9LessThanOrEqualTo(String value) {
            addCriterion("m9 <=", value, "m9");
            return (Criteria) this;
        }

        public Criteria andM9Like(String value) {
            addCriterion("m9 like", value, "m9");
            return (Criteria) this;
        }

        public Criteria andM9NotLike(String value) {
            addCriterion("m9 not like", value, "m9");
            return (Criteria) this;
        }

        public Criteria andM9In(List<String> values) {
            addCriterion("m9 in", values, "m9");
            return (Criteria) this;
        }

        public Criteria andM9NotIn(List<String> values) {
            addCriterion("m9 not in", values, "m9");
            return (Criteria) this;
        }

        public Criteria andM9Between(String value1, String value2) {
            addCriterion("m9 between", value1, value2, "m9");
            return (Criteria) this;
        }

        public Criteria andM9NotBetween(String value1, String value2) {
            addCriterion("m9 not between", value1, value2, "m9");
            return (Criteria) this;
        }

        public Criteria andM10IsNull() {
            addCriterion("m10 is null");
            return (Criteria) this;
        }

        public Criteria andM10IsNotNull() {
            addCriterion("m10 is not null");
            return (Criteria) this;
        }

        public Criteria andM10EqualTo(String value) {
            addCriterion("m10 =", value, "m10");
            return (Criteria) this;
        }

        public Criteria andM10NotEqualTo(String value) {
            addCriterion("m10 <>", value, "m10");
            return (Criteria) this;
        }

        public Criteria andM10GreaterThan(String value) {
            addCriterion("m10 >", value, "m10");
            return (Criteria) this;
        }

        public Criteria andM10GreaterThanOrEqualTo(String value) {
            addCriterion("m10 >=", value, "m10");
            return (Criteria) this;
        }

        public Criteria andM10LessThan(String value) {
            addCriterion("m10 <", value, "m10");
            return (Criteria) this;
        }

        public Criteria andM10LessThanOrEqualTo(String value) {
            addCriterion("m10 <=", value, "m10");
            return (Criteria) this;
        }

        public Criteria andM10Like(String value) {
            addCriterion("m10 like", value, "m10");
            return (Criteria) this;
        }

        public Criteria andM10NotLike(String value) {
            addCriterion("m10 not like", value, "m10");
            return (Criteria) this;
        }

        public Criteria andM10In(List<String> values) {
            addCriterion("m10 in", values, "m10");
            return (Criteria) this;
        }

        public Criteria andM10NotIn(List<String> values) {
            addCriterion("m10 not in", values, "m10");
            return (Criteria) this;
        }

        public Criteria andM10Between(String value1, String value2) {
            addCriterion("m10 between", value1, value2, "m10");
            return (Criteria) this;
        }

        public Criteria andM10NotBetween(String value1, String value2) {
            addCriterion("m10 not between", value1, value2, "m10");
            return (Criteria) this;
        }

        public Criteria andM11IsNull() {
            addCriterion("m11 is null");
            return (Criteria) this;
        }

        public Criteria andM11IsNotNull() {
            addCriterion("m11 is not null");
            return (Criteria) this;
        }

        public Criteria andM11EqualTo(String value) {
            addCriterion("m11 =", value, "m11");
            return (Criteria) this;
        }

        public Criteria andM11NotEqualTo(String value) {
            addCriterion("m11 <>", value, "m11");
            return (Criteria) this;
        }

        public Criteria andM11GreaterThan(String value) {
            addCriterion("m11 >", value, "m11");
            return (Criteria) this;
        }

        public Criteria andM11GreaterThanOrEqualTo(String value) {
            addCriterion("m11 >=", value, "m11");
            return (Criteria) this;
        }

        public Criteria andM11LessThan(String value) {
            addCriterion("m11 <", value, "m11");
            return (Criteria) this;
        }

        public Criteria andM11LessThanOrEqualTo(String value) {
            addCriterion("m11 <=", value, "m11");
            return (Criteria) this;
        }

        public Criteria andM11Like(String value) {
            addCriterion("m11 like", value, "m11");
            return (Criteria) this;
        }

        public Criteria andM11NotLike(String value) {
            addCriterion("m11 not like", value, "m11");
            return (Criteria) this;
        }

        public Criteria andM11In(List<String> values) {
            addCriterion("m11 in", values, "m11");
            return (Criteria) this;
        }

        public Criteria andM11NotIn(List<String> values) {
            addCriterion("m11 not in", values, "m11");
            return (Criteria) this;
        }

        public Criteria andM11Between(String value1, String value2) {
            addCriterion("m11 between", value1, value2, "m11");
            return (Criteria) this;
        }

        public Criteria andM11NotBetween(String value1, String value2) {
            addCriterion("m11 not between", value1, value2, "m11");
            return (Criteria) this;
        }

        public Criteria andM12IsNull() {
            addCriterion("m12 is null");
            return (Criteria) this;
        }

        public Criteria andM12IsNotNull() {
            addCriterion("m12 is not null");
            return (Criteria) this;
        }

        public Criteria andM12EqualTo(String value) {
            addCriterion("m12 =", value, "m12");
            return (Criteria) this;
        }

        public Criteria andM12NotEqualTo(String value) {
            addCriterion("m12 <>", value, "m12");
            return (Criteria) this;
        }

        public Criteria andM12GreaterThan(String value) {
            addCriterion("m12 >", value, "m12");
            return (Criteria) this;
        }

        public Criteria andM12GreaterThanOrEqualTo(String value) {
            addCriterion("m12 >=", value, "m12");
            return (Criteria) this;
        }

        public Criteria andM12LessThan(String value) {
            addCriterion("m12 <", value, "m12");
            return (Criteria) this;
        }

        public Criteria andM12LessThanOrEqualTo(String value) {
            addCriterion("m12 <=", value, "m12");
            return (Criteria) this;
        }

        public Criteria andM12Like(String value) {
            addCriterion("m12 like", value, "m12");
            return (Criteria) this;
        }

        public Criteria andM12NotLike(String value) {
            addCriterion("m12 not like", value, "m12");
            return (Criteria) this;
        }

        public Criteria andM12In(List<String> values) {
            addCriterion("m12 in", values, "m12");
            return (Criteria) this;
        }

        public Criteria andM12NotIn(List<String> values) {
            addCriterion("m12 not in", values, "m12");
            return (Criteria) this;
        }

        public Criteria andM12Between(String value1, String value2) {
            addCriterion("m12 between", value1, value2, "m12");
            return (Criteria) this;
        }

        public Criteria andM12NotBetween(String value1, String value2) {
            addCriterion("m12 not between", value1, value2, "m12");
            return (Criteria) this;
        }

        public Criteria andNjlbIsNull() {
            addCriterion("njlb is null");
            return (Criteria) this;
        }

        public Criteria andNjlbIsNotNull() {
            addCriterion("njlb is not null");
            return (Criteria) this;
        }

        public Criteria andNjlbEqualTo(String value) {
            addCriterion("njlb =", value, "njlb");
            return (Criteria) this;
        }

        public Criteria andNjlbNotEqualTo(String value) {
            addCriterion("njlb <>", value, "njlb");
            return (Criteria) this;
        }

        public Criteria andNjlbGreaterThan(String value) {
            addCriterion("njlb >", value, "njlb");
            return (Criteria) this;
        }

        public Criteria andNjlbGreaterThanOrEqualTo(String value) {
            addCriterion("njlb >=", value, "njlb");
            return (Criteria) this;
        }

        public Criteria andNjlbLessThan(String value) {
            addCriterion("njlb <", value, "njlb");
            return (Criteria) this;
        }

        public Criteria andNjlbLessThanOrEqualTo(String value) {
            addCriterion("njlb <=", value, "njlb");
            return (Criteria) this;
        }

        public Criteria andNjlbLike(String value) {
            addCriterion("njlb like", value, "njlb");
            return (Criteria) this;
        }

        public Criteria andNjlbNotLike(String value) {
            addCriterion("njlb not like", value, "njlb");
            return (Criteria) this;
        }

        public Criteria andNjlbIn(List<String> values) {
            addCriterion("njlb in", values, "njlb");
            return (Criteria) this;
        }

        public Criteria andNjlbNotIn(List<String> values) {
            addCriterion("njlb not in", values, "njlb");
            return (Criteria) this;
        }

        public Criteria andNjlbBetween(String value1, String value2) {
            addCriterion("njlb between", value1, value2, "njlb");
            return (Criteria) this;
        }

        public Criteria andNjlbNotBetween(String value1, String value2) {
            addCriterion("njlb not between", value1, value2, "njlb");
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