package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class MikeJbxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MikeJbxxExample() {
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

        public Criteria andMikeHlmcIsNull() {
            addCriterion("mike_hlmc is null");
            return (Criteria) this;
        }

        public Criteria andMikeHlmcIsNotNull() {
            addCriterion("mike_hlmc is not null");
            return (Criteria) this;
        }

        public Criteria andMikeHlmcEqualTo(String value) {
            addCriterion("mike_hlmc =", value, "mikeHlmc");
            return (Criteria) this;
        }

        public Criteria andMikeHlmcNotEqualTo(String value) {
            addCriterion("mike_hlmc <>", value, "mikeHlmc");
            return (Criteria) this;
        }

        public Criteria andMikeHlmcGreaterThan(String value) {
            addCriterion("mike_hlmc >", value, "mikeHlmc");
            return (Criteria) this;
        }

        public Criteria andMikeHlmcGreaterThanOrEqualTo(String value) {
            addCriterion("mike_hlmc >=", value, "mikeHlmc");
            return (Criteria) this;
        }

        public Criteria andMikeHlmcLessThan(String value) {
            addCriterion("mike_hlmc <", value, "mikeHlmc");
            return (Criteria) this;
        }

        public Criteria andMikeHlmcLessThanOrEqualTo(String value) {
            addCriterion("mike_hlmc <=", value, "mikeHlmc");
            return (Criteria) this;
        }

        public Criteria andMikeHlmcLike(String value) {
            addCriterion("mike_hlmc like", value, "mikeHlmc");
            return (Criteria) this;
        }

        public Criteria andMikeHlmcNotLike(String value) {
            addCriterion("mike_hlmc not like", value, "mikeHlmc");
            return (Criteria) this;
        }

        public Criteria andMikeHlmcIn(List<String> values) {
            addCriterion("mike_hlmc in", values, "mikeHlmc");
            return (Criteria) this;
        }

        public Criteria andMikeHlmcNotIn(List<String> values) {
            addCriterion("mike_hlmc not in", values, "mikeHlmc");
            return (Criteria) this;
        }

        public Criteria andMikeHlmcBetween(String value1, String value2) {
            addCriterion("mike_hlmc between", value1, value2, "mikeHlmc");
            return (Criteria) this;
        }

        public Criteria andMikeHlmcNotBetween(String value1, String value2) {
            addCriterion("mike_hlmc not between", value1, value2, "mikeHlmc");
            return (Criteria) this;
        }

        public Criteria andMikeHlbhIsNull() {
            addCriterion("mike_hlbh is null");
            return (Criteria) this;
        }

        public Criteria andMikeHlbhIsNotNull() {
            addCriterion("mike_hlbh is not null");
            return (Criteria) this;
        }

        public Criteria andMikeHlbhEqualTo(String value) {
            addCriterion("mike_hlbh =", value, "mikeHlbh");
            return (Criteria) this;
        }

        public Criteria andMikeHlbhNotEqualTo(String value) {
            addCriterion("mike_hlbh <>", value, "mikeHlbh");
            return (Criteria) this;
        }

        public Criteria andMikeHlbhGreaterThan(String value) {
            addCriterion("mike_hlbh >", value, "mikeHlbh");
            return (Criteria) this;
        }

        public Criteria andMikeHlbhGreaterThanOrEqualTo(String value) {
            addCriterion("mike_hlbh >=", value, "mikeHlbh");
            return (Criteria) this;
        }

        public Criteria andMikeHlbhLessThan(String value) {
            addCriterion("mike_hlbh <", value, "mikeHlbh");
            return (Criteria) this;
        }

        public Criteria andMikeHlbhLessThanOrEqualTo(String value) {
            addCriterion("mike_hlbh <=", value, "mikeHlbh");
            return (Criteria) this;
        }

        public Criteria andMikeHlbhLike(String value) {
            addCriterion("mike_hlbh like", value, "mikeHlbh");
            return (Criteria) this;
        }

        public Criteria andMikeHlbhNotLike(String value) {
            addCriterion("mike_hlbh not like", value, "mikeHlbh");
            return (Criteria) this;
        }

        public Criteria andMikeHlbhIn(List<String> values) {
            addCriterion("mike_hlbh in", values, "mikeHlbh");
            return (Criteria) this;
        }

        public Criteria andMikeHlbhNotIn(List<String> values) {
            addCriterion("mike_hlbh not in", values, "mikeHlbh");
            return (Criteria) this;
        }

        public Criteria andMikeHlbhBetween(String value1, String value2) {
            addCriterion("mike_hlbh between", value1, value2, "mikeHlbh");
            return (Criteria) this;
        }

        public Criteria andMikeHlbhNotBetween(String value1, String value2) {
            addCriterion("mike_hlbh not between", value1, value2, "mikeHlbh");
            return (Criteria) this;
        }

        public Criteria andMikeHldjIsNull() {
            addCriterion("mike_hldj is null");
            return (Criteria) this;
        }

        public Criteria andMikeHldjIsNotNull() {
            addCriterion("mike_hldj is not null");
            return (Criteria) this;
        }

        public Criteria andMikeHldjEqualTo(String value) {
            addCriterion("mike_hldj =", value, "mikeHldj");
            return (Criteria) this;
        }

        public Criteria andMikeHldjNotEqualTo(String value) {
            addCriterion("mike_hldj <>", value, "mikeHldj");
            return (Criteria) this;
        }

        public Criteria andMikeHldjGreaterThan(String value) {
            addCriterion("mike_hldj >", value, "mikeHldj");
            return (Criteria) this;
        }

        public Criteria andMikeHldjGreaterThanOrEqualTo(String value) {
            addCriterion("mike_hldj >=", value, "mikeHldj");
            return (Criteria) this;
        }

        public Criteria andMikeHldjLessThan(String value) {
            addCriterion("mike_hldj <", value, "mikeHldj");
            return (Criteria) this;
        }

        public Criteria andMikeHldjLessThanOrEqualTo(String value) {
            addCriterion("mike_hldj <=", value, "mikeHldj");
            return (Criteria) this;
        }

        public Criteria andMikeHldjLike(String value) {
            addCriterion("mike_hldj like", value, "mikeHldj");
            return (Criteria) this;
        }

        public Criteria andMikeHldjNotLike(String value) {
            addCriterion("mike_hldj not like", value, "mikeHldj");
            return (Criteria) this;
        }

        public Criteria andMikeHldjIn(List<String> values) {
            addCriterion("mike_hldj in", values, "mikeHldj");
            return (Criteria) this;
        }

        public Criteria andMikeHldjNotIn(List<String> values) {
            addCriterion("mike_hldj not in", values, "mikeHldj");
            return (Criteria) this;
        }

        public Criteria andMikeHldjBetween(String value1, String value2) {
            addCriterion("mike_hldj between", value1, value2, "mikeHldj");
            return (Criteria) this;
        }

        public Criteria andMikeHldjNotBetween(String value1, String value2) {
            addCriterion("mike_hldj not between", value1, value2, "mikeHldj");
            return (Criteria) this;
        }

        public Criteria andMikeLymcIsNull() {
            addCriterion("mike_lymc is null");
            return (Criteria) this;
        }

        public Criteria andMikeLymcIsNotNull() {
            addCriterion("mike_lymc is not null");
            return (Criteria) this;
        }

        public Criteria andMikeLymcEqualTo(String value) {
            addCriterion("mike_lymc =", value, "mikeLymc");
            return (Criteria) this;
        }

        public Criteria andMikeLymcNotEqualTo(String value) {
            addCriterion("mike_lymc <>", value, "mikeLymc");
            return (Criteria) this;
        }

        public Criteria andMikeLymcGreaterThan(String value) {
            addCriterion("mike_lymc >", value, "mikeLymc");
            return (Criteria) this;
        }

        public Criteria andMikeLymcGreaterThanOrEqualTo(String value) {
            addCriterion("mike_lymc >=", value, "mikeLymc");
            return (Criteria) this;
        }

        public Criteria andMikeLymcLessThan(String value) {
            addCriterion("mike_lymc <", value, "mikeLymc");
            return (Criteria) this;
        }

        public Criteria andMikeLymcLessThanOrEqualTo(String value) {
            addCriterion("mike_lymc <=", value, "mikeLymc");
            return (Criteria) this;
        }

        public Criteria andMikeLymcLike(String value) {
            addCriterion("mike_lymc like", value, "mikeLymc");
            return (Criteria) this;
        }

        public Criteria andMikeLymcNotLike(String value) {
            addCriterion("mike_lymc not like", value, "mikeLymc");
            return (Criteria) this;
        }

        public Criteria andMikeLymcIn(List<String> values) {
            addCriterion("mike_lymc in", values, "mikeLymc");
            return (Criteria) this;
        }

        public Criteria andMikeLymcNotIn(List<String> values) {
            addCriterion("mike_lymc not in", values, "mikeLymc");
            return (Criteria) this;
        }

        public Criteria andMikeLymcBetween(String value1, String value2) {
            addCriterion("mike_lymc between", value1, value2, "mikeLymc");
            return (Criteria) this;
        }

        public Criteria andMikeLymcNotBetween(String value1, String value2) {
            addCriterion("mike_lymc not between", value1, value2, "mikeLymc");
            return (Criteria) this;
        }

        public Criteria andMikeSxmcIsNull() {
            addCriterion("mike_sxmc is null");
            return (Criteria) this;
        }

        public Criteria andMikeSxmcIsNotNull() {
            addCriterion("mike_sxmc is not null");
            return (Criteria) this;
        }

        public Criteria andMikeSxmcEqualTo(String value) {
            addCriterion("mike_sxmc =", value, "mikeSxmc");
            return (Criteria) this;
        }

        public Criteria andMikeSxmcNotEqualTo(String value) {
            addCriterion("mike_sxmc <>", value, "mikeSxmc");
            return (Criteria) this;
        }

        public Criteria andMikeSxmcGreaterThan(String value) {
            addCriterion("mike_sxmc >", value, "mikeSxmc");
            return (Criteria) this;
        }

        public Criteria andMikeSxmcGreaterThanOrEqualTo(String value) {
            addCriterion("mike_sxmc >=", value, "mikeSxmc");
            return (Criteria) this;
        }

        public Criteria andMikeSxmcLessThan(String value) {
            addCriterion("mike_sxmc <", value, "mikeSxmc");
            return (Criteria) this;
        }

        public Criteria andMikeSxmcLessThanOrEqualTo(String value) {
            addCriterion("mike_sxmc <=", value, "mikeSxmc");
            return (Criteria) this;
        }

        public Criteria andMikeSxmcLike(String value) {
            addCriterion("mike_sxmc like", value, "mikeSxmc");
            return (Criteria) this;
        }

        public Criteria andMikeSxmcNotLike(String value) {
            addCriterion("mike_sxmc not like", value, "mikeSxmc");
            return (Criteria) this;
        }

        public Criteria andMikeSxmcIn(List<String> values) {
            addCriterion("mike_sxmc in", values, "mikeSxmc");
            return (Criteria) this;
        }

        public Criteria andMikeSxmcNotIn(List<String> values) {
            addCriterion("mike_sxmc not in", values, "mikeSxmc");
            return (Criteria) this;
        }

        public Criteria andMikeSxmcBetween(String value1, String value2) {
            addCriterion("mike_sxmc between", value1, value2, "mikeSxmc");
            return (Criteria) this;
        }

        public Criteria andMikeSxmcNotBetween(String value1, String value2) {
            addCriterion("mike_sxmc not between", value1, value2, "mikeSxmc");
            return (Criteria) this;
        }

        public Criteria andMikeGlIsNull() {
            addCriterion("mike_gl is null");
            return (Criteria) this;
        }

        public Criteria andMikeGlIsNotNull() {
            addCriterion("mike_gl is not null");
            return (Criteria) this;
        }

        public Criteria andMikeGlEqualTo(String value) {
            addCriterion("mike_gl =", value, "mikeGl");
            return (Criteria) this;
        }

        public Criteria andMikeGlNotEqualTo(String value) {
            addCriterion("mike_gl <>", value, "mikeGl");
            return (Criteria) this;
        }

        public Criteria andMikeGlGreaterThan(String value) {
            addCriterion("mike_gl >", value, "mikeGl");
            return (Criteria) this;
        }

        public Criteria andMikeGlGreaterThanOrEqualTo(String value) {
            addCriterion("mike_gl >=", value, "mikeGl");
            return (Criteria) this;
        }

        public Criteria andMikeGlLessThan(String value) {
            addCriterion("mike_gl <", value, "mikeGl");
            return (Criteria) this;
        }

        public Criteria andMikeGlLessThanOrEqualTo(String value) {
            addCriterion("mike_gl <=", value, "mikeGl");
            return (Criteria) this;
        }

        public Criteria andMikeGlLike(String value) {
            addCriterion("mike_gl like", value, "mikeGl");
            return (Criteria) this;
        }

        public Criteria andMikeGlNotLike(String value) {
            addCriterion("mike_gl not like", value, "mikeGl");
            return (Criteria) this;
        }

        public Criteria andMikeGlIn(List<String> values) {
            addCriterion("mike_gl in", values, "mikeGl");
            return (Criteria) this;
        }

        public Criteria andMikeGlNotIn(List<String> values) {
            addCriterion("mike_gl not in", values, "mikeGl");
            return (Criteria) this;
        }

        public Criteria andMikeGlBetween(String value1, String value2) {
            addCriterion("mike_gl between", value1, value2, "mikeGl");
            return (Criteria) this;
        }

        public Criteria andMikeGlNotBetween(String value1, String value2) {
            addCriterion("mike_gl not between", value1, value2, "mikeGl");
            return (Criteria) this;
        }

        public Criteria andMike1jhlIsNull() {
            addCriterion("mike_1jhl is null");
            return (Criteria) this;
        }

        public Criteria andMike1jhlIsNotNull() {
            addCriterion("mike_1jhl is not null");
            return (Criteria) this;
        }

        public Criteria andMike1jhlEqualTo(String value) {
            addCriterion("mike_1jhl =", value, "mike1jhl");
            return (Criteria) this;
        }

        public Criteria andMike1jhlNotEqualTo(String value) {
            addCriterion("mike_1jhl <>", value, "mike1jhl");
            return (Criteria) this;
        }

        public Criteria andMike1jhlGreaterThan(String value) {
            addCriterion("mike_1jhl >", value, "mike1jhl");
            return (Criteria) this;
        }

        public Criteria andMike1jhlGreaterThanOrEqualTo(String value) {
            addCriterion("mike_1jhl >=", value, "mike1jhl");
            return (Criteria) this;
        }

        public Criteria andMike1jhlLessThan(String value) {
            addCriterion("mike_1jhl <", value, "mike1jhl");
            return (Criteria) this;
        }

        public Criteria andMike1jhlLessThanOrEqualTo(String value) {
            addCriterion("mike_1jhl <=", value, "mike1jhl");
            return (Criteria) this;
        }

        public Criteria andMike1jhlLike(String value) {
            addCriterion("mike_1jhl like", value, "mike1jhl");
            return (Criteria) this;
        }

        public Criteria andMike1jhlNotLike(String value) {
            addCriterion("mike_1jhl not like", value, "mike1jhl");
            return (Criteria) this;
        }

        public Criteria andMike1jhlIn(List<String> values) {
            addCriterion("mike_1jhl in", values, "mike1jhl");
            return (Criteria) this;
        }

        public Criteria andMike1jhlNotIn(List<String> values) {
            addCriterion("mike_1jhl not in", values, "mike1jhl");
            return (Criteria) this;
        }

        public Criteria andMike1jhlBetween(String value1, String value2) {
            addCriterion("mike_1jhl between", value1, value2, "mike1jhl");
            return (Criteria) this;
        }

        public Criteria andMike1jhlNotBetween(String value1, String value2) {
            addCriterion("mike_1jhl not between", value1, value2, "mike1jhl");
            return (Criteria) this;
        }

        public Criteria andMike2jhlIsNull() {
            addCriterion("mike_2jhl is null");
            return (Criteria) this;
        }

        public Criteria andMike2jhlIsNotNull() {
            addCriterion("mike_2jhl is not null");
            return (Criteria) this;
        }

        public Criteria andMike2jhlEqualTo(String value) {
            addCriterion("mike_2jhl =", value, "mike2jhl");
            return (Criteria) this;
        }

        public Criteria andMike2jhlNotEqualTo(String value) {
            addCriterion("mike_2jhl <>", value, "mike2jhl");
            return (Criteria) this;
        }

        public Criteria andMike2jhlGreaterThan(String value) {
            addCriterion("mike_2jhl >", value, "mike2jhl");
            return (Criteria) this;
        }

        public Criteria andMike2jhlGreaterThanOrEqualTo(String value) {
            addCriterion("mike_2jhl >=", value, "mike2jhl");
            return (Criteria) this;
        }

        public Criteria andMike2jhlLessThan(String value) {
            addCriterion("mike_2jhl <", value, "mike2jhl");
            return (Criteria) this;
        }

        public Criteria andMike2jhlLessThanOrEqualTo(String value) {
            addCriterion("mike_2jhl <=", value, "mike2jhl");
            return (Criteria) this;
        }

        public Criteria andMike2jhlLike(String value) {
            addCriterion("mike_2jhl like", value, "mike2jhl");
            return (Criteria) this;
        }

        public Criteria andMike2jhlNotLike(String value) {
            addCriterion("mike_2jhl not like", value, "mike2jhl");
            return (Criteria) this;
        }

        public Criteria andMike2jhlIn(List<String> values) {
            addCriterion("mike_2jhl in", values, "mike2jhl");
            return (Criteria) this;
        }

        public Criteria andMike2jhlNotIn(List<String> values) {
            addCriterion("mike_2jhl not in", values, "mike2jhl");
            return (Criteria) this;
        }

        public Criteria andMike2jhlBetween(String value1, String value2) {
            addCriterion("mike_2jhl between", value1, value2, "mike2jhl");
            return (Criteria) this;
        }

        public Criteria andMike2jhlNotBetween(String value1, String value2) {
            addCriterion("mike_2jhl not between", value1, value2, "mike2jhl");
            return (Criteria) this;
        }

        public Criteria andMike3jhlIsNull() {
            addCriterion("mike_3jhl is null");
            return (Criteria) this;
        }

        public Criteria andMike3jhlIsNotNull() {
            addCriterion("mike_3jhl is not null");
            return (Criteria) this;
        }

        public Criteria andMike3jhlEqualTo(String value) {
            addCriterion("mike_3jhl =", value, "mike3jhl");
            return (Criteria) this;
        }

        public Criteria andMike3jhlNotEqualTo(String value) {
            addCriterion("mike_3jhl <>", value, "mike3jhl");
            return (Criteria) this;
        }

        public Criteria andMike3jhlGreaterThan(String value) {
            addCriterion("mike_3jhl >", value, "mike3jhl");
            return (Criteria) this;
        }

        public Criteria andMike3jhlGreaterThanOrEqualTo(String value) {
            addCriterion("mike_3jhl >=", value, "mike3jhl");
            return (Criteria) this;
        }

        public Criteria andMike3jhlLessThan(String value) {
            addCriterion("mike_3jhl <", value, "mike3jhl");
            return (Criteria) this;
        }

        public Criteria andMike3jhlLessThanOrEqualTo(String value) {
            addCriterion("mike_3jhl <=", value, "mike3jhl");
            return (Criteria) this;
        }

        public Criteria andMike3jhlLike(String value) {
            addCriterion("mike_3jhl like", value, "mike3jhl");
            return (Criteria) this;
        }

        public Criteria andMike3jhlNotLike(String value) {
            addCriterion("mike_3jhl not like", value, "mike3jhl");
            return (Criteria) this;
        }

        public Criteria andMike3jhlIn(List<String> values) {
            addCriterion("mike_3jhl in", values, "mike3jhl");
            return (Criteria) this;
        }

        public Criteria andMike3jhlNotIn(List<String> values) {
            addCriterion("mike_3jhl not in", values, "mike3jhl");
            return (Criteria) this;
        }

        public Criteria andMike3jhlBetween(String value1, String value2) {
            addCriterion("mike_3jhl between", value1, value2, "mike3jhl");
            return (Criteria) this;
        }

        public Criteria andMike3jhlNotBetween(String value1, String value2) {
            addCriterion("mike_3jhl not between", value1, value2, "mike3jhl");
            return (Criteria) this;
        }

        public Criteria andMike4jhlIsNull() {
            addCriterion("mike_4jhl is null");
            return (Criteria) this;
        }

        public Criteria andMike4jhlIsNotNull() {
            addCriterion("mike_4jhl is not null");
            return (Criteria) this;
        }

        public Criteria andMike4jhlEqualTo(String value) {
            addCriterion("mike_4jhl =", value, "mike4jhl");
            return (Criteria) this;
        }

        public Criteria andMike4jhlNotEqualTo(String value) {
            addCriterion("mike_4jhl <>", value, "mike4jhl");
            return (Criteria) this;
        }

        public Criteria andMike4jhlGreaterThan(String value) {
            addCriterion("mike_4jhl >", value, "mike4jhl");
            return (Criteria) this;
        }

        public Criteria andMike4jhlGreaterThanOrEqualTo(String value) {
            addCriterion("mike_4jhl >=", value, "mike4jhl");
            return (Criteria) this;
        }

        public Criteria andMike4jhlLessThan(String value) {
            addCriterion("mike_4jhl <", value, "mike4jhl");
            return (Criteria) this;
        }

        public Criteria andMike4jhlLessThanOrEqualTo(String value) {
            addCriterion("mike_4jhl <=", value, "mike4jhl");
            return (Criteria) this;
        }

        public Criteria andMike4jhlLike(String value) {
            addCriterion("mike_4jhl like", value, "mike4jhl");
            return (Criteria) this;
        }

        public Criteria andMike4jhlNotLike(String value) {
            addCriterion("mike_4jhl not like", value, "mike4jhl");
            return (Criteria) this;
        }

        public Criteria andMike4jhlIn(List<String> values) {
            addCriterion("mike_4jhl in", values, "mike4jhl");
            return (Criteria) this;
        }

        public Criteria andMike4jhlNotIn(List<String> values) {
            addCriterion("mike_4jhl not in", values, "mike4jhl");
            return (Criteria) this;
        }

        public Criteria andMike4jhlBetween(String value1, String value2) {
            addCriterion("mike_4jhl between", value1, value2, "mike4jhl");
            return (Criteria) this;
        }

        public Criteria andMike4jhlNotBetween(String value1, String value2) {
            addCriterion("mike_4jhl not between", value1, value2, "mike4jhl");
            return (Criteria) this;
        }

        public Criteria andMike5jhlIsNull() {
            addCriterion("mike_5jhl is null");
            return (Criteria) this;
        }

        public Criteria andMike5jhlIsNotNull() {
            addCriterion("mike_5jhl is not null");
            return (Criteria) this;
        }

        public Criteria andMike5jhlEqualTo(String value) {
            addCriterion("mike_5jhl =", value, "mike5jhl");
            return (Criteria) this;
        }

        public Criteria andMike5jhlNotEqualTo(String value) {
            addCriterion("mike_5jhl <>", value, "mike5jhl");
            return (Criteria) this;
        }

        public Criteria andMike5jhlGreaterThan(String value) {
            addCriterion("mike_5jhl >", value, "mike5jhl");
            return (Criteria) this;
        }

        public Criteria andMike5jhlGreaterThanOrEqualTo(String value) {
            addCriterion("mike_5jhl >=", value, "mike5jhl");
            return (Criteria) this;
        }

        public Criteria andMike5jhlLessThan(String value) {
            addCriterion("mike_5jhl <", value, "mike5jhl");
            return (Criteria) this;
        }

        public Criteria andMike5jhlLessThanOrEqualTo(String value) {
            addCriterion("mike_5jhl <=", value, "mike5jhl");
            return (Criteria) this;
        }

        public Criteria andMike5jhlLike(String value) {
            addCriterion("mike_5jhl like", value, "mike5jhl");
            return (Criteria) this;
        }

        public Criteria andMike5jhlNotLike(String value) {
            addCriterion("mike_5jhl not like", value, "mike5jhl");
            return (Criteria) this;
        }

        public Criteria andMike5jhlIn(List<String> values) {
            addCriterion("mike_5jhl in", values, "mike5jhl");
            return (Criteria) this;
        }

        public Criteria andMike5jhlNotIn(List<String> values) {
            addCriterion("mike_5jhl not in", values, "mike5jhl");
            return (Criteria) this;
        }

        public Criteria andMike5jhlBetween(String value1, String value2) {
            addCriterion("mike_5jhl between", value1, value2, "mike5jhl");
            return (Criteria) this;
        }

        public Criteria andMike5jhlNotBetween(String value1, String value2) {
            addCriterion("mike_5jhl not between", value1, value2, "mike5jhl");
            return (Criteria) this;
        }

        public Criteria andMikeSwnfIsNull() {
            addCriterion("mike_swnf is null");
            return (Criteria) this;
        }

        public Criteria andMikeSwnfIsNotNull() {
            addCriterion("mike_swnf is not null");
            return (Criteria) this;
        }

        public Criteria andMikeSwnfEqualTo(Integer value) {
            addCriterion("mike_swnf =", value, "mikeSwnf");
            return (Criteria) this;
        }

        public Criteria andMikeSwnfNotEqualTo(Integer value) {
            addCriterion("mike_swnf <>", value, "mikeSwnf");
            return (Criteria) this;
        }

        public Criteria andMikeSwnfGreaterThan(Integer value) {
            addCriterion("mike_swnf >", value, "mikeSwnf");
            return (Criteria) this;
        }

        public Criteria andMikeSwnfGreaterThanOrEqualTo(Integer value) {
            addCriterion("mike_swnf >=", value, "mikeSwnf");
            return (Criteria) this;
        }

        public Criteria andMikeSwnfLessThan(Integer value) {
            addCriterion("mike_swnf <", value, "mikeSwnf");
            return (Criteria) this;
        }

        public Criteria andMikeSwnfLessThanOrEqualTo(Integer value) {
            addCriterion("mike_swnf <=", value, "mikeSwnf");
            return (Criteria) this;
        }

        public Criteria andMikeSwnfIn(List<Integer> values) {
            addCriterion("mike_swnf in", values, "mikeSwnf");
            return (Criteria) this;
        }

        public Criteria andMikeSwnfNotIn(List<Integer> values) {
            addCriterion("mike_swnf not in", values, "mikeSwnf");
            return (Criteria) this;
        }

        public Criteria andMikeSwnfBetween(Integer value1, Integer value2) {
            addCriterion("mike_swnf between", value1, value2, "mikeSwnf");
            return (Criteria) this;
        }

        public Criteria andMikeSwnfNotBetween(Integer value1, Integer value2) {
            addCriterion("mike_swnf not between", value1, value2, "mikeSwnf");
            return (Criteria) this;
        }

        public Criteria andMikeMnnfIsNull() {
            addCriterion("mike_mnnf is null");
            return (Criteria) this;
        }

        public Criteria andMikeMnnfIsNotNull() {
            addCriterion("mike_mnnf is not null");
            return (Criteria) this;
        }

        public Criteria andMikeMnnfEqualTo(Integer value) {
            addCriterion("mike_mnnf =", value, "mikeMnnf");
            return (Criteria) this;
        }

        public Criteria andMikeMnnfNotEqualTo(Integer value) {
            addCriterion("mike_mnnf <>", value, "mikeMnnf");
            return (Criteria) this;
        }

        public Criteria andMikeMnnfGreaterThan(Integer value) {
            addCriterion("mike_mnnf >", value, "mikeMnnf");
            return (Criteria) this;
        }

        public Criteria andMikeMnnfGreaterThanOrEqualTo(Integer value) {
            addCriterion("mike_mnnf >=", value, "mikeMnnf");
            return (Criteria) this;
        }

        public Criteria andMikeMnnfLessThan(Integer value) {
            addCriterion("mike_mnnf <", value, "mikeMnnf");
            return (Criteria) this;
        }

        public Criteria andMikeMnnfLessThanOrEqualTo(Integer value) {
            addCriterion("mike_mnnf <=", value, "mikeMnnf");
            return (Criteria) this;
        }

        public Criteria andMikeMnnfIn(List<Integer> values) {
            addCriterion("mike_mnnf in", values, "mikeMnnf");
            return (Criteria) this;
        }

        public Criteria andMikeMnnfNotIn(List<Integer> values) {
            addCriterion("mike_mnnf not in", values, "mikeMnnf");
            return (Criteria) this;
        }

        public Criteria andMikeMnnfBetween(Integer value1, Integer value2) {
            addCriterion("mike_mnnf between", value1, value2, "mikeMnnf");
            return (Criteria) this;
        }

        public Criteria andMikeMnnfNotBetween(Integer value1, Integer value2) {
            addCriterion("mike_mnnf not between", value1, value2, "mikeMnnf");
            return (Criteria) this;
        }

        public Criteria andMikeSjlyIsNull() {
            addCriterion("mike_sjly is null");
            return (Criteria) this;
        }

        public Criteria andMikeSjlyIsNotNull() {
            addCriterion("mike_sjly is not null");
            return (Criteria) this;
        }

        public Criteria andMikeSjlyEqualTo(String value) {
            addCriterion("mike_sjly =", value, "mikeSjly");
            return (Criteria) this;
        }

        public Criteria andMikeSjlyNotEqualTo(String value) {
            addCriterion("mike_sjly <>", value, "mikeSjly");
            return (Criteria) this;
        }

        public Criteria andMikeSjlyGreaterThan(String value) {
            addCriterion("mike_sjly >", value, "mikeSjly");
            return (Criteria) this;
        }

        public Criteria andMikeSjlyGreaterThanOrEqualTo(String value) {
            addCriterion("mike_sjly >=", value, "mikeSjly");
            return (Criteria) this;
        }

        public Criteria andMikeSjlyLessThan(String value) {
            addCriterion("mike_sjly <", value, "mikeSjly");
            return (Criteria) this;
        }

        public Criteria andMikeSjlyLessThanOrEqualTo(String value) {
            addCriterion("mike_sjly <=", value, "mikeSjly");
            return (Criteria) this;
        }

        public Criteria andMikeSjlyLike(String value) {
            addCriterion("mike_sjly like", value, "mikeSjly");
            return (Criteria) this;
        }

        public Criteria andMikeSjlyNotLike(String value) {
            addCriterion("mike_sjly not like", value, "mikeSjly");
            return (Criteria) this;
        }

        public Criteria andMikeSjlyIn(List<String> values) {
            addCriterion("mike_sjly in", values, "mikeSjly");
            return (Criteria) this;
        }

        public Criteria andMikeSjlyNotIn(List<String> values) {
            addCriterion("mike_sjly not in", values, "mikeSjly");
            return (Criteria) this;
        }

        public Criteria andMikeSjlyBetween(String value1, String value2) {
            addCriterion("mike_sjly between", value1, value2, "mikeSjly");
            return (Criteria) this;
        }

        public Criteria andMikeSjlyNotBetween(String value1, String value2) {
            addCriterion("mike_sjly not between", value1, value2, "mikeSjly");
            return (Criteria) this;
        }

        public Criteria andMikeMnzbIsNull() {
            addCriterion("mike_mnzb is null");
            return (Criteria) this;
        }

        public Criteria andMikeMnzbIsNotNull() {
            addCriterion("mike_mnzb is not null");
            return (Criteria) this;
        }

        public Criteria andMikeMnzbEqualTo(String value) {
            addCriterion("mike_mnzb =", value, "mikeMnzb");
            return (Criteria) this;
        }

        public Criteria andMikeMnzbNotEqualTo(String value) {
            addCriterion("mike_mnzb <>", value, "mikeMnzb");
            return (Criteria) this;
        }

        public Criteria andMikeMnzbGreaterThan(String value) {
            addCriterion("mike_mnzb >", value, "mikeMnzb");
            return (Criteria) this;
        }

        public Criteria andMikeMnzbGreaterThanOrEqualTo(String value) {
            addCriterion("mike_mnzb >=", value, "mikeMnzb");
            return (Criteria) this;
        }

        public Criteria andMikeMnzbLessThan(String value) {
            addCriterion("mike_mnzb <", value, "mikeMnzb");
            return (Criteria) this;
        }

        public Criteria andMikeMnzbLessThanOrEqualTo(String value) {
            addCriterion("mike_mnzb <=", value, "mikeMnzb");
            return (Criteria) this;
        }

        public Criteria andMikeMnzbLike(String value) {
            addCriterion("mike_mnzb like", value, "mikeMnzb");
            return (Criteria) this;
        }

        public Criteria andMikeMnzbNotLike(String value) {
            addCriterion("mike_mnzb not like", value, "mikeMnzb");
            return (Criteria) this;
        }

        public Criteria andMikeMnzbIn(List<String> values) {
            addCriterion("mike_mnzb in", values, "mikeMnzb");
            return (Criteria) this;
        }

        public Criteria andMikeMnzbNotIn(List<String> values) {
            addCriterion("mike_mnzb not in", values, "mikeMnzb");
            return (Criteria) this;
        }

        public Criteria andMikeMnzbBetween(String value1, String value2) {
            addCriterion("mike_mnzb between", value1, value2, "mikeMnzb");
            return (Criteria) this;
        }

        public Criteria andMikeMnzbNotBetween(String value1, String value2) {
            addCriterion("mike_mnzb not between", value1, value2, "mikeMnzb");
            return (Criteria) this;
        }

        public Criteria andMikeFamcIsNull() {
            addCriterion("mike_famc is null");
            return (Criteria) this;
        }

        public Criteria andMikeFamcIsNotNull() {
            addCriterion("mike_famc is not null");
            return (Criteria) this;
        }

        public Criteria andMikeFamcEqualTo(String value) {
            addCriterion("mike_famc =", value, "mikeFamc");
            return (Criteria) this;
        }

        public Criteria andMikeFamcNotEqualTo(String value) {
            addCriterion("mike_famc <>", value, "mikeFamc");
            return (Criteria) this;
        }

        public Criteria andMikeFamcGreaterThan(String value) {
            addCriterion("mike_famc >", value, "mikeFamc");
            return (Criteria) this;
        }

        public Criteria andMikeFamcGreaterThanOrEqualTo(String value) {
            addCriterion("mike_famc >=", value, "mikeFamc");
            return (Criteria) this;
        }

        public Criteria andMikeFamcLessThan(String value) {
            addCriterion("mike_famc <", value, "mikeFamc");
            return (Criteria) this;
        }

        public Criteria andMikeFamcLessThanOrEqualTo(String value) {
            addCriterion("mike_famc <=", value, "mikeFamc");
            return (Criteria) this;
        }

        public Criteria andMikeFamcLike(String value) {
            addCriterion("mike_famc like", value, "mikeFamc");
            return (Criteria) this;
        }

        public Criteria andMikeFamcNotLike(String value) {
            addCriterion("mike_famc not like", value, "mikeFamc");
            return (Criteria) this;
        }

        public Criteria andMikeFamcIn(List<String> values) {
            addCriterion("mike_famc in", values, "mikeFamc");
            return (Criteria) this;
        }

        public Criteria andMikeFamcNotIn(List<String> values) {
            addCriterion("mike_famc not in", values, "mikeFamc");
            return (Criteria) this;
        }

        public Criteria andMikeFamcBetween(String value1, String value2) {
            addCriterion("mike_famc between", value1, value2, "mikeFamc");
            return (Criteria) this;
        }

        public Criteria andMikeFamcNotBetween(String value1, String value2) {
            addCriterion("mike_famc not between", value1, value2, "mikeFamc");
            return (Criteria) this;
        }

        public Criteria andMikeCcljIsNull() {
            addCriterion("mike_cclj is null");
            return (Criteria) this;
        }

        public Criteria andMikeCcljIsNotNull() {
            addCriterion("mike_cclj is not null");
            return (Criteria) this;
        }

        public Criteria andMikeCcljEqualTo(String value) {
            addCriterion("mike_cclj =", value, "mikeCclj");
            return (Criteria) this;
        }

        public Criteria andMikeCcljNotEqualTo(String value) {
            addCriterion("mike_cclj <>", value, "mikeCclj");
            return (Criteria) this;
        }

        public Criteria andMikeCcljGreaterThan(String value) {
            addCriterion("mike_cclj >", value, "mikeCclj");
            return (Criteria) this;
        }

        public Criteria andMikeCcljGreaterThanOrEqualTo(String value) {
            addCriterion("mike_cclj >=", value, "mikeCclj");
            return (Criteria) this;
        }

        public Criteria andMikeCcljLessThan(String value) {
            addCriterion("mike_cclj <", value, "mikeCclj");
            return (Criteria) this;
        }

        public Criteria andMikeCcljLessThanOrEqualTo(String value) {
            addCriterion("mike_cclj <=", value, "mikeCclj");
            return (Criteria) this;
        }

        public Criteria andMikeCcljLike(String value) {
            addCriterion("mike_cclj like", value, "mikeCclj");
            return (Criteria) this;
        }

        public Criteria andMikeCcljNotLike(String value) {
            addCriterion("mike_cclj not like", value, "mikeCclj");
            return (Criteria) this;
        }

        public Criteria andMikeCcljIn(List<String> values) {
            addCriterion("mike_cclj in", values, "mikeCclj");
            return (Criteria) this;
        }

        public Criteria andMikeCcljNotIn(List<String> values) {
            addCriterion("mike_cclj not in", values, "mikeCclj");
            return (Criteria) this;
        }

        public Criteria andMikeCcljBetween(String value1, String value2) {
            addCriterion("mike_cclj between", value1, value2, "mikeCclj");
            return (Criteria) this;
        }

        public Criteria andMikeCcljNotBetween(String value1, String value2) {
            addCriterion("mike_cclj not between", value1, value2, "mikeCclj");
            return (Criteria) this;
        }

        public Criteria andMikeFxsjIsNull() {
            addCriterion("mike_fxsj is null");
            return (Criteria) this;
        }

        public Criteria andMikeFxsjIsNotNull() {
            addCriterion("mike_fxsj is not null");
            return (Criteria) this;
        }

        public Criteria andMikeFxsjEqualTo(Integer value) {
            addCriterion("mike_fxsj =", value, "mikeFxsj");
            return (Criteria) this;
        }

        public Criteria andMikeFxsjNotEqualTo(Integer value) {
            addCriterion("mike_fxsj <>", value, "mikeFxsj");
            return (Criteria) this;
        }

        public Criteria andMikeFxsjGreaterThan(Integer value) {
            addCriterion("mike_fxsj >", value, "mikeFxsj");
            return (Criteria) this;
        }

        public Criteria andMikeFxsjGreaterThanOrEqualTo(Integer value) {
            addCriterion("mike_fxsj >=", value, "mikeFxsj");
            return (Criteria) this;
        }

        public Criteria andMikeFxsjLessThan(Integer value) {
            addCriterion("mike_fxsj <", value, "mikeFxsj");
            return (Criteria) this;
        }

        public Criteria andMikeFxsjLessThanOrEqualTo(Integer value) {
            addCriterion("mike_fxsj <=", value, "mikeFxsj");
            return (Criteria) this;
        }

        public Criteria andMikeFxsjIn(List<Integer> values) {
            addCriterion("mike_fxsj in", values, "mikeFxsj");
            return (Criteria) this;
        }

        public Criteria andMikeFxsjNotIn(List<Integer> values) {
            addCriterion("mike_fxsj not in", values, "mikeFxsj");
            return (Criteria) this;
        }

        public Criteria andMikeFxsjBetween(Integer value1, Integer value2) {
            addCriterion("mike_fxsj between", value1, value2, "mikeFxsj");
            return (Criteria) this;
        }

        public Criteria andMikeFxsjNotBetween(Integer value1, Integer value2) {
            addCriterion("mike_fxsj not between", value1, value2, "mikeFxsj");
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