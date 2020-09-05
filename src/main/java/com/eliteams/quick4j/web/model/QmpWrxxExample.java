package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class QmpWrxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QmpWrxxExample() {
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

        public Criteria andSectionNameIsNull() {
            addCriterion("section_name is null");
            return (Criteria) this;
        }

        public Criteria andSectionNameIsNotNull() {
            addCriterion("section_name is not null");
            return (Criteria) this;
        }

        public Criteria andSectionNameEqualTo(String value) {
            addCriterion("section_name =", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameNotEqualTo(String value) {
            addCriterion("section_name <>", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameGreaterThan(String value) {
            addCriterion("section_name >", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameGreaterThanOrEqualTo(String value) {
            addCriterion("section_name >=", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameLessThan(String value) {
            addCriterion("section_name <", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameLessThanOrEqualTo(String value) {
            addCriterion("section_name <=", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameLike(String value) {
            addCriterion("section_name like", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameNotLike(String value) {
            addCriterion("section_name not like", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameIn(List<String> values) {
            addCriterion("section_name in", values, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameNotIn(List<String> values) {
            addCriterion("section_name not in", values, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameBetween(String value1, String value2) {
            addCriterion("section_name between", value1, value2, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameNotBetween(String value1, String value2) {
            addCriterion("section_name not between", value1, value2, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionBhIsNull() {
            addCriterion("section_bh is null");
            return (Criteria) this;
        }

        public Criteria andSectionBhIsNotNull() {
            addCriterion("section_bh is not null");
            return (Criteria) this;
        }

        public Criteria andSectionBhEqualTo(String value) {
            addCriterion("section_bh =", value, "sectionBh");
            return (Criteria) this;
        }

        public Criteria andSectionBhNotEqualTo(String value) {
            addCriterion("section_bh <>", value, "sectionBh");
            return (Criteria) this;
        }

        public Criteria andSectionBhGreaterThan(String value) {
            addCriterion("section_bh >", value, "sectionBh");
            return (Criteria) this;
        }

        public Criteria andSectionBhGreaterThanOrEqualTo(String value) {
            addCriterion("section_bh >=", value, "sectionBh");
            return (Criteria) this;
        }

        public Criteria andSectionBhLessThan(String value) {
            addCriterion("section_bh <", value, "sectionBh");
            return (Criteria) this;
        }

        public Criteria andSectionBhLessThanOrEqualTo(String value) {
            addCriterion("section_bh <=", value, "sectionBh");
            return (Criteria) this;
        }

        public Criteria andSectionBhLike(String value) {
            addCriterion("section_bh like", value, "sectionBh");
            return (Criteria) this;
        }

        public Criteria andSectionBhNotLike(String value) {
            addCriterion("section_bh not like", value, "sectionBh");
            return (Criteria) this;
        }

        public Criteria andSectionBhIn(List<String> values) {
            addCriterion("section_bh in", values, "sectionBh");
            return (Criteria) this;
        }

        public Criteria andSectionBhNotIn(List<String> values) {
            addCriterion("section_bh not in", values, "sectionBh");
            return (Criteria) this;
        }

        public Criteria andSectionBhBetween(String value1, String value2) {
            addCriterion("section_bh between", value1, value2, "sectionBh");
            return (Criteria) this;
        }

        public Criteria andSectionBhNotBetween(String value1, String value2) {
            addCriterion("section_bh not between", value1, value2, "sectionBh");
            return (Criteria) this;
        }

        public Criteria andSectionLevelIsNull() {
            addCriterion("section_level is null");
            return (Criteria) this;
        }

        public Criteria andSectionLevelIsNotNull() {
            addCriterion("section_level is not null");
            return (Criteria) this;
        }

        public Criteria andSectionLevelEqualTo(String value) {
            addCriterion("section_level =", value, "sectionLevel");
            return (Criteria) this;
        }

        public Criteria andSectionLevelNotEqualTo(String value) {
            addCriterion("section_level <>", value, "sectionLevel");
            return (Criteria) this;
        }

        public Criteria andSectionLevelGreaterThan(String value) {
            addCriterion("section_level >", value, "sectionLevel");
            return (Criteria) this;
        }

        public Criteria andSectionLevelGreaterThanOrEqualTo(String value) {
            addCriterion("section_level >=", value, "sectionLevel");
            return (Criteria) this;
        }

        public Criteria andSectionLevelLessThan(String value) {
            addCriterion("section_level <", value, "sectionLevel");
            return (Criteria) this;
        }

        public Criteria andSectionLevelLessThanOrEqualTo(String value) {
            addCriterion("section_level <=", value, "sectionLevel");
            return (Criteria) this;
        }

        public Criteria andSectionLevelLike(String value) {
            addCriterion("section_level like", value, "sectionLevel");
            return (Criteria) this;
        }

        public Criteria andSectionLevelNotLike(String value) {
            addCriterion("section_level not like", value, "sectionLevel");
            return (Criteria) this;
        }

        public Criteria andSectionLevelIn(List<String> values) {
            addCriterion("section_level in", values, "sectionLevel");
            return (Criteria) this;
        }

        public Criteria andSectionLevelNotIn(List<String> values) {
            addCriterion("section_level not in", values, "sectionLevel");
            return (Criteria) this;
        }

        public Criteria andSectionLevelBetween(String value1, String value2) {
            addCriterion("section_level between", value1, value2, "sectionLevel");
            return (Criteria) this;
        }

        public Criteria andSectionLevelNotBetween(String value1, String value2) {
            addCriterion("section_level not between", value1, value2, "sectionLevel");
            return (Criteria) this;
        }

        public Criteria andTestByIsNull() {
            addCriterion("test_by is null");
            return (Criteria) this;
        }

        public Criteria andTestByIsNotNull() {
            addCriterion("test_by is not null");
            return (Criteria) this;
        }

        public Criteria andTestByEqualTo(String value) {
            addCriterion("test_by =", value, "testBy");
            return (Criteria) this;
        }

        public Criteria andTestByNotEqualTo(String value) {
            addCriterion("test_by <>", value, "testBy");
            return (Criteria) this;
        }

        public Criteria andTestByGreaterThan(String value) {
            addCriterion("test_by >", value, "testBy");
            return (Criteria) this;
        }

        public Criteria andTestByGreaterThanOrEqualTo(String value) {
            addCriterion("test_by >=", value, "testBy");
            return (Criteria) this;
        }

        public Criteria andTestByLessThan(String value) {
            addCriterion("test_by <", value, "testBy");
            return (Criteria) this;
        }

        public Criteria andTestByLessThanOrEqualTo(String value) {
            addCriterion("test_by <=", value, "testBy");
            return (Criteria) this;
        }

        public Criteria andTestByLike(String value) {
            addCriterion("test_by like", value, "testBy");
            return (Criteria) this;
        }

        public Criteria andTestByNotLike(String value) {
            addCriterion("test_by not like", value, "testBy");
            return (Criteria) this;
        }

        public Criteria andTestByIn(List<String> values) {
            addCriterion("test_by in", values, "testBy");
            return (Criteria) this;
        }

        public Criteria andTestByNotIn(List<String> values) {
            addCriterion("test_by not in", values, "testBy");
            return (Criteria) this;
        }

        public Criteria andTestByBetween(String value1, String value2) {
            addCriterion("test_by between", value1, value2, "testBy");
            return (Criteria) this;
        }

        public Criteria andTestByNotBetween(String value1, String value2) {
            addCriterion("test_by not between", value1, value2, "testBy");
            return (Criteria) this;
        }

        public Criteria andRiverNameIsNull() {
            addCriterion("river_name is null");
            return (Criteria) this;
        }

        public Criteria andRiverNameIsNotNull() {
            addCriterion("river_name is not null");
            return (Criteria) this;
        }

        public Criteria andRiverNameEqualTo(String value) {
            addCriterion("river_name =", value, "riverName");
            return (Criteria) this;
        }

        public Criteria andRiverNameNotEqualTo(String value) {
            addCriterion("river_name <>", value, "riverName");
            return (Criteria) this;
        }

        public Criteria andRiverNameGreaterThan(String value) {
            addCriterion("river_name >", value, "riverName");
            return (Criteria) this;
        }

        public Criteria andRiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("river_name >=", value, "riverName");
            return (Criteria) this;
        }

        public Criteria andRiverNameLessThan(String value) {
            addCriterion("river_name <", value, "riverName");
            return (Criteria) this;
        }

        public Criteria andRiverNameLessThanOrEqualTo(String value) {
            addCriterion("river_name <=", value, "riverName");
            return (Criteria) this;
        }

        public Criteria andRiverNameLike(String value) {
            addCriterion("river_name like", value, "riverName");
            return (Criteria) this;
        }

        public Criteria andRiverNameNotLike(String value) {
            addCriterion("river_name not like", value, "riverName");
            return (Criteria) this;
        }

        public Criteria andRiverNameIn(List<String> values) {
            addCriterion("river_name in", values, "riverName");
            return (Criteria) this;
        }

        public Criteria andRiverNameNotIn(List<String> values) {
            addCriterion("river_name not in", values, "riverName");
            return (Criteria) this;
        }

        public Criteria andRiverNameBetween(String value1, String value2) {
            addCriterion("river_name between", value1, value2, "riverName");
            return (Criteria) this;
        }

        public Criteria andRiverNameNotBetween(String value1, String value2) {
            addCriterion("river_name not between", value1, value2, "riverName");
            return (Criteria) this;
        }

        public Criteria andRiverBhIsNull() {
            addCriterion("river_bh is null");
            return (Criteria) this;
        }

        public Criteria andRiverBhIsNotNull() {
            addCriterion("river_bh is not null");
            return (Criteria) this;
        }

        public Criteria andRiverBhEqualTo(String value) {
            addCriterion("river_bh =", value, "riverBh");
            return (Criteria) this;
        }

        public Criteria andRiverBhNotEqualTo(String value) {
            addCriterion("river_bh <>", value, "riverBh");
            return (Criteria) this;
        }

        public Criteria andRiverBhGreaterThan(String value) {
            addCriterion("river_bh >", value, "riverBh");
            return (Criteria) this;
        }

        public Criteria andRiverBhGreaterThanOrEqualTo(String value) {
            addCriterion("river_bh >=", value, "riverBh");
            return (Criteria) this;
        }

        public Criteria andRiverBhLessThan(String value) {
            addCriterion("river_bh <", value, "riverBh");
            return (Criteria) this;
        }

        public Criteria andRiverBhLessThanOrEqualTo(String value) {
            addCriterion("river_bh <=", value, "riverBh");
            return (Criteria) this;
        }

        public Criteria andRiverBhLike(String value) {
            addCriterion("river_bh like", value, "riverBh");
            return (Criteria) this;
        }

        public Criteria andRiverBhNotLike(String value) {
            addCriterion("river_bh not like", value, "riverBh");
            return (Criteria) this;
        }

        public Criteria andRiverBhIn(List<String> values) {
            addCriterion("river_bh in", values, "riverBh");
            return (Criteria) this;
        }

        public Criteria andRiverBhNotIn(List<String> values) {
            addCriterion("river_bh not in", values, "riverBh");
            return (Criteria) this;
        }

        public Criteria andRiverBhBetween(String value1, String value2) {
            addCriterion("river_bh between", value1, value2, "riverBh");
            return (Criteria) this;
        }

        public Criteria andRiverBhNotBetween(String value1, String value2) {
            addCriterion("river_bh not between", value1, value2, "riverBh");
            return (Criteria) this;
        }

        public Criteria andDmszDmjdIsNull() {
            addCriterion("dmsz_dmjd is null");
            return (Criteria) this;
        }

        public Criteria andDmszDmjdIsNotNull() {
            addCriterion("dmsz_dmjd is not null");
            return (Criteria) this;
        }

        public Criteria andDmszDmjdEqualTo(Double value) {
            addCriterion("dmsz_dmjd =", value, "dmszDmjd");
            return (Criteria) this;
        }

        public Criteria andDmszDmjdNotEqualTo(Double value) {
            addCriterion("dmsz_dmjd <>", value, "dmszDmjd");
            return (Criteria) this;
        }

        public Criteria andDmszDmjdGreaterThan(Double value) {
            addCriterion("dmsz_dmjd >", value, "dmszDmjd");
            return (Criteria) this;
        }

        public Criteria andDmszDmjdGreaterThanOrEqualTo(Double value) {
            addCriterion("dmsz_dmjd >=", value, "dmszDmjd");
            return (Criteria) this;
        }

        public Criteria andDmszDmjdLessThan(Double value) {
            addCriterion("dmsz_dmjd <", value, "dmszDmjd");
            return (Criteria) this;
        }

        public Criteria andDmszDmjdLessThanOrEqualTo(Double value) {
            addCriterion("dmsz_dmjd <=", value, "dmszDmjd");
            return (Criteria) this;
        }

        public Criteria andDmszDmjdIn(List<Double> values) {
            addCriterion("dmsz_dmjd in", values, "dmszDmjd");
            return (Criteria) this;
        }

        public Criteria andDmszDmjdNotIn(List<Double> values) {
            addCriterion("dmsz_dmjd not in", values, "dmszDmjd");
            return (Criteria) this;
        }

        public Criteria andDmszDmjdBetween(Double value1, Double value2) {
            addCriterion("dmsz_dmjd between", value1, value2, "dmszDmjd");
            return (Criteria) this;
        }

        public Criteria andDmszDmjdNotBetween(Double value1, Double value2) {
            addCriterion("dmsz_dmjd not between", value1, value2, "dmszDmjd");
            return (Criteria) this;
        }

        public Criteria andDmszDmwdIsNull() {
            addCriterion("dmsz_dmwd is null");
            return (Criteria) this;
        }

        public Criteria andDmszDmwdIsNotNull() {
            addCriterion("dmsz_dmwd is not null");
            return (Criteria) this;
        }

        public Criteria andDmszDmwdEqualTo(Double value) {
            addCriterion("dmsz_dmwd =", value, "dmszDmwd");
            return (Criteria) this;
        }

        public Criteria andDmszDmwdNotEqualTo(Double value) {
            addCriterion("dmsz_dmwd <>", value, "dmszDmwd");
            return (Criteria) this;
        }

        public Criteria andDmszDmwdGreaterThan(Double value) {
            addCriterion("dmsz_dmwd >", value, "dmszDmwd");
            return (Criteria) this;
        }

        public Criteria andDmszDmwdGreaterThanOrEqualTo(Double value) {
            addCriterion("dmsz_dmwd >=", value, "dmszDmwd");
            return (Criteria) this;
        }

        public Criteria andDmszDmwdLessThan(Double value) {
            addCriterion("dmsz_dmwd <", value, "dmszDmwd");
            return (Criteria) this;
        }

        public Criteria andDmszDmwdLessThanOrEqualTo(Double value) {
            addCriterion("dmsz_dmwd <=", value, "dmszDmwd");
            return (Criteria) this;
        }

        public Criteria andDmszDmwdIn(List<Double> values) {
            addCriterion("dmsz_dmwd in", values, "dmszDmwd");
            return (Criteria) this;
        }

        public Criteria andDmszDmwdNotIn(List<Double> values) {
            addCriterion("dmsz_dmwd not in", values, "dmszDmwd");
            return (Criteria) this;
        }

        public Criteria andDmszDmwdBetween(Double value1, Double value2) {
            addCriterion("dmsz_dmwd between", value1, value2, "dmszDmwd");
            return (Criteria) this;
        }

        public Criteria andDmszDmwdNotBetween(Double value1, Double value2) {
            addCriterion("dmsz_dmwd not between", value1, value2, "dmszDmwd");
            return (Criteria) this;
        }

        public Criteria andJcpcIsNull() {
            addCriterion("jcpc is null");
            return (Criteria) this;
        }

        public Criteria andJcpcIsNotNull() {
            addCriterion("jcpc is not null");
            return (Criteria) this;
        }

        public Criteria andJcpcEqualTo(String value) {
            addCriterion("jcpc =", value, "jcpc");
            return (Criteria) this;
        }

        public Criteria andJcpcNotEqualTo(String value) {
            addCriterion("jcpc <>", value, "jcpc");
            return (Criteria) this;
        }

        public Criteria andJcpcGreaterThan(String value) {
            addCriterion("jcpc >", value, "jcpc");
            return (Criteria) this;
        }

        public Criteria andJcpcGreaterThanOrEqualTo(String value) {
            addCriterion("jcpc >=", value, "jcpc");
            return (Criteria) this;
        }

        public Criteria andJcpcLessThan(String value) {
            addCriterion("jcpc <", value, "jcpc");
            return (Criteria) this;
        }

        public Criteria andJcpcLessThanOrEqualTo(String value) {
            addCriterion("jcpc <=", value, "jcpc");
            return (Criteria) this;
        }

        public Criteria andJcpcLike(String value) {
            addCriterion("jcpc like", value, "jcpc");
            return (Criteria) this;
        }

        public Criteria andJcpcNotLike(String value) {
            addCriterion("jcpc not like", value, "jcpc");
            return (Criteria) this;
        }

        public Criteria andJcpcIn(List<String> values) {
            addCriterion("jcpc in", values, "jcpc");
            return (Criteria) this;
        }

        public Criteria andJcpcNotIn(List<String> values) {
            addCriterion("jcpc not in", values, "jcpc");
            return (Criteria) this;
        }

        public Criteria andJcpcBetween(String value1, String value2) {
            addCriterion("jcpc between", value1, value2, "jcpc");
            return (Criteria) this;
        }

        public Criteria andJcpcNotBetween(String value1, String value2) {
            addCriterion("jcpc not between", value1, value2, "jcpc");
            return (Criteria) this;
        }

        public Criteria andLocProvinceIsNull() {
            addCriterion("loc_province is null");
            return (Criteria) this;
        }

        public Criteria andLocProvinceIsNotNull() {
            addCriterion("loc_province is not null");
            return (Criteria) this;
        }

        public Criteria andLocProvinceEqualTo(String value) {
            addCriterion("loc_province =", value, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceNotEqualTo(String value) {
            addCriterion("loc_province <>", value, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceGreaterThan(String value) {
            addCriterion("loc_province >", value, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("loc_province >=", value, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceLessThan(String value) {
            addCriterion("loc_province <", value, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceLessThanOrEqualTo(String value) {
            addCriterion("loc_province <=", value, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceLike(String value) {
            addCriterion("loc_province like", value, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceNotLike(String value) {
            addCriterion("loc_province not like", value, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceIn(List<String> values) {
            addCriterion("loc_province in", values, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceNotIn(List<String> values) {
            addCriterion("loc_province not in", values, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceBetween(String value1, String value2) {
            addCriterion("loc_province between", value1, value2, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceNotBetween(String value1, String value2) {
            addCriterion("loc_province not between", value1, value2, "locProvince");
            return (Criteria) this;
        }

        public Criteria andBasinIsNull() {
            addCriterion("\" basin\" is null");
            return (Criteria) this;
        }

        public Criteria andBasinIsNotNull() {
            addCriterion("\" basin\" is not null");
            return (Criteria) this;
        }

        public Criteria andBasinEqualTo(String value) {
            addCriterion("\" basin\" =", value, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinNotEqualTo(String value) {
            addCriterion("\" basin\" <>", value, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinGreaterThan(String value) {
            addCriterion("\" basin\" >", value, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinGreaterThanOrEqualTo(String value) {
            addCriterion("\" basin\" >=", value, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinLessThan(String value) {
            addCriterion("\" basin\" <", value, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinLessThanOrEqualTo(String value) {
            addCriterion("\" basin\" <=", value, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinLike(String value) {
            addCriterion("\" basin\" like", value, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinNotLike(String value) {
            addCriterion("\" basin\" not like", value, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinIn(List<String> values) {
            addCriterion("\" basin\" in", values, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinNotIn(List<String> values) {
            addCriterion("\" basin\" not in", values, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinBetween(String value1, String value2) {
            addCriterion("\" basin\" between", value1, value2, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinNotBetween(String value1, String value2) {
            addCriterion("\" basin\" not between", value1, value2, "basin");
            return (Criteria) this;
        }

        public Criteria andQualityTypeIsNull() {
            addCriterion("quality_type is null");
            return (Criteria) this;
        }

        public Criteria andQualityTypeIsNotNull() {
            addCriterion("quality_type is not null");
            return (Criteria) this;
        }

        public Criteria andQualityTypeEqualTo(String value) {
            addCriterion("quality_type =", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeNotEqualTo(String value) {
            addCriterion("quality_type <>", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeGreaterThan(String value) {
            addCriterion("quality_type >", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("quality_type >=", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeLessThan(String value) {
            addCriterion("quality_type <", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeLessThanOrEqualTo(String value) {
            addCriterion("quality_type <=", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeLike(String value) {
            addCriterion("quality_type like", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeNotLike(String value) {
            addCriterion("quality_type not like", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeIn(List<String> values) {
            addCriterion("quality_type in", values, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeNotIn(List<String> values) {
            addCriterion("quality_type not in", values, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeBetween(String value1, String value2) {
            addCriterion("quality_type between", value1, value2, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeNotBetween(String value1, String value2) {
            addCriterion("quality_type not between", value1, value2, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTargetIsNull() {
            addCriterion("quality_target is null");
            return (Criteria) this;
        }

        public Criteria andQualityTargetIsNotNull() {
            addCriterion("quality_target is not null");
            return (Criteria) this;
        }

        public Criteria andQualityTargetEqualTo(String value) {
            addCriterion("quality_target =", value, "qualityTarget");
            return (Criteria) this;
        }

        public Criteria andQualityTargetNotEqualTo(String value) {
            addCriterion("quality_target <>", value, "qualityTarget");
            return (Criteria) this;
        }

        public Criteria andQualityTargetGreaterThan(String value) {
            addCriterion("quality_target >", value, "qualityTarget");
            return (Criteria) this;
        }

        public Criteria andQualityTargetGreaterThanOrEqualTo(String value) {
            addCriterion("quality_target >=", value, "qualityTarget");
            return (Criteria) this;
        }

        public Criteria andQualityTargetLessThan(String value) {
            addCriterion("quality_target <", value, "qualityTarget");
            return (Criteria) this;
        }

        public Criteria andQualityTargetLessThanOrEqualTo(String value) {
            addCriterion("quality_target <=", value, "qualityTarget");
            return (Criteria) this;
        }

        public Criteria andQualityTargetLike(String value) {
            addCriterion("quality_target like", value, "qualityTarget");
            return (Criteria) this;
        }

        public Criteria andQualityTargetNotLike(String value) {
            addCriterion("quality_target not like", value, "qualityTarget");
            return (Criteria) this;
        }

        public Criteria andQualityTargetIn(List<String> values) {
            addCriterion("quality_target in", values, "qualityTarget");
            return (Criteria) this;
        }

        public Criteria andQualityTargetNotIn(List<String> values) {
            addCriterion("quality_target not in", values, "qualityTarget");
            return (Criteria) this;
        }

        public Criteria andQualityTargetBetween(String value1, String value2) {
            addCriterion("quality_target between", value1, value2, "qualityTarget");
            return (Criteria) this;
        }

        public Criteria andQualityTargetNotBetween(String value1, String value2) {
            addCriterion("quality_target not between", value1, value2, "qualityTarget");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(Integer value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(Integer value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(Integer value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(Integer value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(Integer value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<Integer> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<Integer> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(Integer value1, Integer value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureIsNull() {
            addCriterion("water_temperature is null");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureIsNotNull() {
            addCriterion("water_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureEqualTo(Double value) {
            addCriterion("water_temperature =", value, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureNotEqualTo(Double value) {
            addCriterion("water_temperature <>", value, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureGreaterThan(Double value) {
            addCriterion("water_temperature >", value, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureGreaterThanOrEqualTo(Double value) {
            addCriterion("water_temperature >=", value, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureLessThan(Double value) {
            addCriterion("water_temperature <", value, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureLessThanOrEqualTo(Double value) {
            addCriterion("water_temperature <=", value, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureIn(List<Double> values) {
            addCriterion("water_temperature in", values, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureNotIn(List<Double> values) {
            addCriterion("water_temperature not in", values, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureBetween(Double value1, Double value2) {
            addCriterion("water_temperature between", value1, value2, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureNotBetween(Double value1, Double value2) {
            addCriterion("water_temperature not between", value1, value2, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andFlowRateIsNull() {
            addCriterion("flow_rate is null");
            return (Criteria) this;
        }

        public Criteria andFlowRateIsNotNull() {
            addCriterion("flow_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFlowRateEqualTo(Double value) {
            addCriterion("flow_rate =", value, "flowRate");
            return (Criteria) this;
        }

        public Criteria andFlowRateNotEqualTo(Double value) {
            addCriterion("flow_rate <>", value, "flowRate");
            return (Criteria) this;
        }

        public Criteria andFlowRateGreaterThan(Double value) {
            addCriterion("flow_rate >", value, "flowRate");
            return (Criteria) this;
        }

        public Criteria andFlowRateGreaterThanOrEqualTo(Double value) {
            addCriterion("flow_rate >=", value, "flowRate");
            return (Criteria) this;
        }

        public Criteria andFlowRateLessThan(Double value) {
            addCriterion("flow_rate <", value, "flowRate");
            return (Criteria) this;
        }

        public Criteria andFlowRateLessThanOrEqualTo(Double value) {
            addCriterion("flow_rate <=", value, "flowRate");
            return (Criteria) this;
        }

        public Criteria andFlowRateIn(List<Double> values) {
            addCriterion("flow_rate in", values, "flowRate");
            return (Criteria) this;
        }

        public Criteria andFlowRateNotIn(List<Double> values) {
            addCriterion("flow_rate not in", values, "flowRate");
            return (Criteria) this;
        }

        public Criteria andFlowRateBetween(Double value1, Double value2) {
            addCriterion("flow_rate between", value1, value2, "flowRate");
            return (Criteria) this;
        }

        public Criteria andFlowRateNotBetween(Double value1, Double value2) {
            addCriterion("flow_rate not between", value1, value2, "flowRate");
            return (Criteria) this;
        }

        public Criteria andPhIsNull() {
            addCriterion("ph is null");
            return (Criteria) this;
        }

        public Criteria andPhIsNotNull() {
            addCriterion("ph is not null");
            return (Criteria) this;
        }

        public Criteria andPhEqualTo(Double value) {
            addCriterion("ph =", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotEqualTo(Double value) {
            addCriterion("ph <>", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThan(Double value) {
            addCriterion("ph >", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThanOrEqualTo(Double value) {
            addCriterion("ph >=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThan(Double value) {
            addCriterion("ph <", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThanOrEqualTo(Double value) {
            addCriterion("ph <=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhIn(List<Double> values) {
            addCriterion("ph in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotIn(List<Double> values) {
            addCriterion("ph not in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhBetween(Double value1, Double value2) {
            addCriterion("ph between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotBetween(Double value1, Double value2) {
            addCriterion("ph not between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andDdlIsNull() {
            addCriterion("ddl is null");
            return (Criteria) this;
        }

        public Criteria andDdlIsNotNull() {
            addCriterion("ddl is not null");
            return (Criteria) this;
        }

        public Criteria andDdlEqualTo(Double value) {
            addCriterion("ddl =", value, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlNotEqualTo(Double value) {
            addCriterion("ddl <>", value, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlGreaterThan(Double value) {
            addCriterion("ddl >", value, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlGreaterThanOrEqualTo(Double value) {
            addCriterion("ddl >=", value, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlLessThan(Double value) {
            addCriterion("ddl <", value, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlLessThanOrEqualTo(Double value) {
            addCriterion("ddl <=", value, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlIn(List<Double> values) {
            addCriterion("ddl in", values, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlNotIn(List<Double> values) {
            addCriterion("ddl not in", values, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlBetween(Double value1, Double value2) {
            addCriterion("ddl between", value1, value2, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlNotBetween(Double value1, Double value2) {
            addCriterion("ddl not between", value1, value2, "ddl");
            return (Criteria) this;
        }

        public Criteria andRjyIsNull() {
            addCriterion("rjy is null");
            return (Criteria) this;
        }

        public Criteria andRjyIsNotNull() {
            addCriterion("rjy is not null");
            return (Criteria) this;
        }

        public Criteria andRjyEqualTo(Double value) {
            addCriterion("rjy =", value, "rjy");
            return (Criteria) this;
        }

        public Criteria andRjyNotEqualTo(Double value) {
            addCriterion("rjy <>", value, "rjy");
            return (Criteria) this;
        }

        public Criteria andRjyGreaterThan(Double value) {
            addCriterion("rjy >", value, "rjy");
            return (Criteria) this;
        }

        public Criteria andRjyGreaterThanOrEqualTo(Double value) {
            addCriterion("rjy >=", value, "rjy");
            return (Criteria) this;
        }

        public Criteria andRjyLessThan(Double value) {
            addCriterion("rjy <", value, "rjy");
            return (Criteria) this;
        }

        public Criteria andRjyLessThanOrEqualTo(Double value) {
            addCriterion("rjy <=", value, "rjy");
            return (Criteria) this;
        }

        public Criteria andRjyIn(List<Double> values) {
            addCriterion("rjy in", values, "rjy");
            return (Criteria) this;
        }

        public Criteria andRjyNotIn(List<Double> values) {
            addCriterion("rjy not in", values, "rjy");
            return (Criteria) this;
        }

        public Criteria andRjyBetween(Double value1, Double value2) {
            addCriterion("rjy between", value1, value2, "rjy");
            return (Criteria) this;
        }

        public Criteria andRjyNotBetween(Double value1, Double value2) {
            addCriterion("rjy not between", value1, value2, "rjy");
            return (Criteria) this;
        }

        public Criteria andGmsyzsIsNull() {
            addCriterion("gmsyzs is null");
            return (Criteria) this;
        }

        public Criteria andGmsyzsIsNotNull() {
            addCriterion("gmsyzs is not null");
            return (Criteria) this;
        }

        public Criteria andGmsyzsEqualTo(Double value) {
            addCriterion("gmsyzs =", value, "gmsyzs");
            return (Criteria) this;
        }

        public Criteria andGmsyzsNotEqualTo(Double value) {
            addCriterion("gmsyzs <>", value, "gmsyzs");
            return (Criteria) this;
        }

        public Criteria andGmsyzsGreaterThan(Double value) {
            addCriterion("gmsyzs >", value, "gmsyzs");
            return (Criteria) this;
        }

        public Criteria andGmsyzsGreaterThanOrEqualTo(Double value) {
            addCriterion("gmsyzs >=", value, "gmsyzs");
            return (Criteria) this;
        }

        public Criteria andGmsyzsLessThan(Double value) {
            addCriterion("gmsyzs <", value, "gmsyzs");
            return (Criteria) this;
        }

        public Criteria andGmsyzsLessThanOrEqualTo(Double value) {
            addCriterion("gmsyzs <=", value, "gmsyzs");
            return (Criteria) this;
        }

        public Criteria andGmsyzsIn(List<Double> values) {
            addCriterion("gmsyzs in", values, "gmsyzs");
            return (Criteria) this;
        }

        public Criteria andGmsyzsNotIn(List<Double> values) {
            addCriterion("gmsyzs not in", values, "gmsyzs");
            return (Criteria) this;
        }

        public Criteria andGmsyzsBetween(Double value1, Double value2) {
            addCriterion("gmsyzs between", value1, value2, "gmsyzs");
            return (Criteria) this;
        }

        public Criteria andGmsyzsNotBetween(Double value1, Double value2) {
            addCriterion("gmsyzs not between", value1, value2, "gmsyzs");
            return (Criteria) this;
        }

        public Criteria andShxylIsNull() {
            addCriterion("shxyl is null");
            return (Criteria) this;
        }

        public Criteria andShxylIsNotNull() {
            addCriterion("shxyl is not null");
            return (Criteria) this;
        }

        public Criteria andShxylEqualTo(Double value) {
            addCriterion("shxyl =", value, "shxyl");
            return (Criteria) this;
        }

        public Criteria andShxylNotEqualTo(Double value) {
            addCriterion("shxyl <>", value, "shxyl");
            return (Criteria) this;
        }

        public Criteria andShxylGreaterThan(Double value) {
            addCriterion("shxyl >", value, "shxyl");
            return (Criteria) this;
        }

        public Criteria andShxylGreaterThanOrEqualTo(Double value) {
            addCriterion("shxyl >=", value, "shxyl");
            return (Criteria) this;
        }

        public Criteria andShxylLessThan(Double value) {
            addCriterion("shxyl <", value, "shxyl");
            return (Criteria) this;
        }

        public Criteria andShxylLessThanOrEqualTo(Double value) {
            addCriterion("shxyl <=", value, "shxyl");
            return (Criteria) this;
        }

        public Criteria andShxylIn(List<Double> values) {
            addCriterion("shxyl in", values, "shxyl");
            return (Criteria) this;
        }

        public Criteria andShxylNotIn(List<Double> values) {
            addCriterion("shxyl not in", values, "shxyl");
            return (Criteria) this;
        }

        public Criteria andShxylBetween(Double value1, Double value2) {
            addCriterion("shxyl between", value1, value2, "shxyl");
            return (Criteria) this;
        }

        public Criteria andShxylNotBetween(Double value1, Double value2) {
            addCriterion("shxyl not between", value1, value2, "shxyl");
            return (Criteria) this;
        }

        public Criteria andAdIsNull() {
            addCriterion("ad is null");
            return (Criteria) this;
        }

        public Criteria andAdIsNotNull() {
            addCriterion("ad is not null");
            return (Criteria) this;
        }

        public Criteria andAdEqualTo(Double value) {
            addCriterion("ad =", value, "ad");
            return (Criteria) this;
        }

        public Criteria andAdNotEqualTo(Double value) {
            addCriterion("ad <>", value, "ad");
            return (Criteria) this;
        }

        public Criteria andAdGreaterThan(Double value) {
            addCriterion("ad >", value, "ad");
            return (Criteria) this;
        }

        public Criteria andAdGreaterThanOrEqualTo(Double value) {
            addCriterion("ad >=", value, "ad");
            return (Criteria) this;
        }

        public Criteria andAdLessThan(Double value) {
            addCriterion("ad <", value, "ad");
            return (Criteria) this;
        }

        public Criteria andAdLessThanOrEqualTo(Double value) {
            addCriterion("ad <=", value, "ad");
            return (Criteria) this;
        }

        public Criteria andAdIn(List<Double> values) {
            addCriterion("ad in", values, "ad");
            return (Criteria) this;
        }

        public Criteria andAdNotIn(List<Double> values) {
            addCriterion("ad not in", values, "ad");
            return (Criteria) this;
        }

        public Criteria andAdBetween(Double value1, Double value2) {
            addCriterion("ad between", value1, value2, "ad");
            return (Criteria) this;
        }

        public Criteria andAdNotBetween(Double value1, Double value2) {
            addCriterion("ad not between", value1, value2, "ad");
            return (Criteria) this;
        }

        public Criteria andSylIsNull() {
            addCriterion("syl is null");
            return (Criteria) this;
        }

        public Criteria andSylIsNotNull() {
            addCriterion("syl is not null");
            return (Criteria) this;
        }

        public Criteria andSylEqualTo(Double value) {
            addCriterion("syl =", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylNotEqualTo(Double value) {
            addCriterion("syl <>", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylGreaterThan(Double value) {
            addCriterion("syl >", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylGreaterThanOrEqualTo(Double value) {
            addCriterion("syl >=", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylLessThan(Double value) {
            addCriterion("syl <", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylLessThanOrEqualTo(Double value) {
            addCriterion("syl <=", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylIn(List<Double> values) {
            addCriterion("syl in", values, "syl");
            return (Criteria) this;
        }

        public Criteria andSylNotIn(List<Double> values) {
            addCriterion("syl not in", values, "syl");
            return (Criteria) this;
        }

        public Criteria andSylBetween(Double value1, Double value2) {
            addCriterion("syl between", value1, value2, "syl");
            return (Criteria) this;
        }

        public Criteria andSylNotBetween(Double value1, Double value2) {
            addCriterion("syl not between", value1, value2, "syl");
            return (Criteria) this;
        }

        public Criteria andHffIsNull() {
            addCriterion("hff is null");
            return (Criteria) this;
        }

        public Criteria andHffIsNotNull() {
            addCriterion("hff is not null");
            return (Criteria) this;
        }

        public Criteria andHffEqualTo(Double value) {
            addCriterion("hff =", value, "hff");
            return (Criteria) this;
        }

        public Criteria andHffNotEqualTo(Double value) {
            addCriterion("hff <>", value, "hff");
            return (Criteria) this;
        }

        public Criteria andHffGreaterThan(Double value) {
            addCriterion("hff >", value, "hff");
            return (Criteria) this;
        }

        public Criteria andHffGreaterThanOrEqualTo(Double value) {
            addCriterion("hff >=", value, "hff");
            return (Criteria) this;
        }

        public Criteria andHffLessThan(Double value) {
            addCriterion("hff <", value, "hff");
            return (Criteria) this;
        }

        public Criteria andHffLessThanOrEqualTo(Double value) {
            addCriterion("hff <=", value, "hff");
            return (Criteria) this;
        }

        public Criteria andHffIn(List<Double> values) {
            addCriterion("hff in", values, "hff");
            return (Criteria) this;
        }

        public Criteria andHffNotIn(List<Double> values) {
            addCriterion("hff not in", values, "hff");
            return (Criteria) this;
        }

        public Criteria andHffBetween(Double value1, Double value2) {
            addCriterion("hff between", value1, value2, "hff");
            return (Criteria) this;
        }

        public Criteria andHffNotBetween(Double value1, Double value2) {
            addCriterion("hff not between", value1, value2, "hff");
            return (Criteria) this;
        }

        public Criteria andGongIsNull() {
            addCriterion("gong is null");
            return (Criteria) this;
        }

        public Criteria andGongIsNotNull() {
            addCriterion("gong is not null");
            return (Criteria) this;
        }

        public Criteria andGongEqualTo(Double value) {
            addCriterion("gong =", value, "gong");
            return (Criteria) this;
        }

        public Criteria andGongNotEqualTo(Double value) {
            addCriterion("gong <>", value, "gong");
            return (Criteria) this;
        }

        public Criteria andGongGreaterThan(Double value) {
            addCriterion("gong >", value, "gong");
            return (Criteria) this;
        }

        public Criteria andGongGreaterThanOrEqualTo(Double value) {
            addCriterion("gong >=", value, "gong");
            return (Criteria) this;
        }

        public Criteria andGongLessThan(Double value) {
            addCriterion("gong <", value, "gong");
            return (Criteria) this;
        }

        public Criteria andGongLessThanOrEqualTo(Double value) {
            addCriterion("gong <=", value, "gong");
            return (Criteria) this;
        }

        public Criteria andGongIn(List<Double> values) {
            addCriterion("gong in", values, "gong");
            return (Criteria) this;
        }

        public Criteria andGongNotIn(List<Double> values) {
            addCriterion("gong not in", values, "gong");
            return (Criteria) this;
        }

        public Criteria andGongBetween(Double value1, Double value2) {
            addCriterion("gong between", value1, value2, "gong");
            return (Criteria) this;
        }

        public Criteria andGongNotBetween(Double value1, Double value2) {
            addCriterion("gong not between", value1, value2, "gong");
            return (Criteria) this;
        }

        public Criteria andQianIsNull() {
            addCriterion("qian is null");
            return (Criteria) this;
        }

        public Criteria andQianIsNotNull() {
            addCriterion("qian is not null");
            return (Criteria) this;
        }

        public Criteria andQianEqualTo(Double value) {
            addCriterion("qian =", value, "qian");
            return (Criteria) this;
        }

        public Criteria andQianNotEqualTo(Double value) {
            addCriterion("qian <>", value, "qian");
            return (Criteria) this;
        }

        public Criteria andQianGreaterThan(Double value) {
            addCriterion("qian >", value, "qian");
            return (Criteria) this;
        }

        public Criteria andQianGreaterThanOrEqualTo(Double value) {
            addCriterion("qian >=", value, "qian");
            return (Criteria) this;
        }

        public Criteria andQianLessThan(Double value) {
            addCriterion("qian <", value, "qian");
            return (Criteria) this;
        }

        public Criteria andQianLessThanOrEqualTo(Double value) {
            addCriterion("qian <=", value, "qian");
            return (Criteria) this;
        }

        public Criteria andQianIn(List<Double> values) {
            addCriterion("qian in", values, "qian");
            return (Criteria) this;
        }

        public Criteria andQianNotIn(List<Double> values) {
            addCriterion("qian not in", values, "qian");
            return (Criteria) this;
        }

        public Criteria andQianBetween(Double value1, Double value2) {
            addCriterion("qian between", value1, value2, "qian");
            return (Criteria) this;
        }

        public Criteria andQianNotBetween(Double value1, Double value2) {
            addCriterion("qian not between", value1, value2, "qian");
            return (Criteria) this;
        }

        public Criteria andHxxylIsNull() {
            addCriterion("hxxyl is null");
            return (Criteria) this;
        }

        public Criteria andHxxylIsNotNull() {
            addCriterion("hxxyl is not null");
            return (Criteria) this;
        }

        public Criteria andHxxylEqualTo(Double value) {
            addCriterion("hxxyl =", value, "hxxyl");
            return (Criteria) this;
        }

        public Criteria andHxxylNotEqualTo(Double value) {
            addCriterion("hxxyl <>", value, "hxxyl");
            return (Criteria) this;
        }

        public Criteria andHxxylGreaterThan(Double value) {
            addCriterion("hxxyl >", value, "hxxyl");
            return (Criteria) this;
        }

        public Criteria andHxxylGreaterThanOrEqualTo(Double value) {
            addCriterion("hxxyl >=", value, "hxxyl");
            return (Criteria) this;
        }

        public Criteria andHxxylLessThan(Double value) {
            addCriterion("hxxyl <", value, "hxxyl");
            return (Criteria) this;
        }

        public Criteria andHxxylLessThanOrEqualTo(Double value) {
            addCriterion("hxxyl <=", value, "hxxyl");
            return (Criteria) this;
        }

        public Criteria andHxxylIn(List<Double> values) {
            addCriterion("hxxyl in", values, "hxxyl");
            return (Criteria) this;
        }

        public Criteria andHxxylNotIn(List<Double> values) {
            addCriterion("hxxyl not in", values, "hxxyl");
            return (Criteria) this;
        }

        public Criteria andHxxylBetween(Double value1, Double value2) {
            addCriterion("hxxyl between", value1, value2, "hxxyl");
            return (Criteria) this;
        }

        public Criteria andHxxylNotBetween(Double value1, Double value2) {
            addCriterion("hxxyl not between", value1, value2, "hxxyl");
            return (Criteria) this;
        }

        public Criteria andZdIsNull() {
            addCriterion("zd is null");
            return (Criteria) this;
        }

        public Criteria andZdIsNotNull() {
            addCriterion("zd is not null");
            return (Criteria) this;
        }

        public Criteria andZdEqualTo(Double value) {
            addCriterion("zd =", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdNotEqualTo(Double value) {
            addCriterion("zd <>", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdGreaterThan(Double value) {
            addCriterion("zd >", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdGreaterThanOrEqualTo(Double value) {
            addCriterion("zd >=", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdLessThan(Double value) {
            addCriterion("zd <", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdLessThanOrEqualTo(Double value) {
            addCriterion("zd <=", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdIn(List<Double> values) {
            addCriterion("zd in", values, "zd");
            return (Criteria) this;
        }

        public Criteria andZdNotIn(List<Double> values) {
            addCriterion("zd not in", values, "zd");
            return (Criteria) this;
        }

        public Criteria andZdBetween(Double value1, Double value2) {
            addCriterion("zd between", value1, value2, "zd");
            return (Criteria) this;
        }

        public Criteria andZdNotBetween(Double value1, Double value2) {
            addCriterion("zd not between", value1, value2, "zd");
            return (Criteria) this;
        }

        public Criteria andZlIsNull() {
            addCriterion("zl is null");
            return (Criteria) this;
        }

        public Criteria andZlIsNotNull() {
            addCriterion("zl is not null");
            return (Criteria) this;
        }

        public Criteria andZlEqualTo(Double value) {
            addCriterion("zl =", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlNotEqualTo(Double value) {
            addCriterion("zl <>", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlGreaterThan(Double value) {
            addCriterion("zl >", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlGreaterThanOrEqualTo(Double value) {
            addCriterion("zl >=", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlLessThan(Double value) {
            addCriterion("zl <", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlLessThanOrEqualTo(Double value) {
            addCriterion("zl <=", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlIn(List<Double> values) {
            addCriterion("zl in", values, "zl");
            return (Criteria) this;
        }

        public Criteria andZlNotIn(List<Double> values) {
            addCriterion("zl not in", values, "zl");
            return (Criteria) this;
        }

        public Criteria andZlBetween(Double value1, Double value2) {
            addCriterion("zl between", value1, value2, "zl");
            return (Criteria) this;
        }

        public Criteria andZlNotBetween(Double value1, Double value2) {
            addCriterion("zl not between", value1, value2, "zl");
            return (Criteria) this;
        }

        public Criteria andTongIsNull() {
            addCriterion("tong is null");
            return (Criteria) this;
        }

        public Criteria andTongIsNotNull() {
            addCriterion("tong is not null");
            return (Criteria) this;
        }

        public Criteria andTongEqualTo(Double value) {
            addCriterion("tong =", value, "tong");
            return (Criteria) this;
        }

        public Criteria andTongNotEqualTo(Double value) {
            addCriterion("tong <>", value, "tong");
            return (Criteria) this;
        }

        public Criteria andTongGreaterThan(Double value) {
            addCriterion("tong >", value, "tong");
            return (Criteria) this;
        }

        public Criteria andTongGreaterThanOrEqualTo(Double value) {
            addCriterion("tong >=", value, "tong");
            return (Criteria) this;
        }

        public Criteria andTongLessThan(Double value) {
            addCriterion("tong <", value, "tong");
            return (Criteria) this;
        }

        public Criteria andTongLessThanOrEqualTo(Double value) {
            addCriterion("tong <=", value, "tong");
            return (Criteria) this;
        }

        public Criteria andTongIn(List<Double> values) {
            addCriterion("tong in", values, "tong");
            return (Criteria) this;
        }

        public Criteria andTongNotIn(List<Double> values) {
            addCriterion("tong not in", values, "tong");
            return (Criteria) this;
        }

        public Criteria andTongBetween(Double value1, Double value2) {
            addCriterion("tong between", value1, value2, "tong");
            return (Criteria) this;
        }

        public Criteria andTongNotBetween(Double value1, Double value2) {
            addCriterion("tong not between", value1, value2, "tong");
            return (Criteria) this;
        }

        public Criteria andXinIsNull() {
            addCriterion("xin is null");
            return (Criteria) this;
        }

        public Criteria andXinIsNotNull() {
            addCriterion("xin is not null");
            return (Criteria) this;
        }

        public Criteria andXinEqualTo(Double value) {
            addCriterion("xin =", value, "xin");
            return (Criteria) this;
        }

        public Criteria andXinNotEqualTo(Double value) {
            addCriterion("xin <>", value, "xin");
            return (Criteria) this;
        }

        public Criteria andXinGreaterThan(Double value) {
            addCriterion("xin >", value, "xin");
            return (Criteria) this;
        }

        public Criteria andXinGreaterThanOrEqualTo(Double value) {
            addCriterion("xin >=", value, "xin");
            return (Criteria) this;
        }

        public Criteria andXinLessThan(Double value) {
            addCriterion("xin <", value, "xin");
            return (Criteria) this;
        }

        public Criteria andXinLessThanOrEqualTo(Double value) {
            addCriterion("xin <=", value, "xin");
            return (Criteria) this;
        }

        public Criteria andXinIn(List<Double> values) {
            addCriterion("xin in", values, "xin");
            return (Criteria) this;
        }

        public Criteria andXinNotIn(List<Double> values) {
            addCriterion("xin not in", values, "xin");
            return (Criteria) this;
        }

        public Criteria andXinBetween(Double value1, Double value2) {
            addCriterion("xin between", value1, value2, "xin");
            return (Criteria) this;
        }

        public Criteria andXinNotBetween(Double value1, Double value2) {
            addCriterion("xin not between", value1, value2, "xin");
            return (Criteria) this;
        }

        public Criteria andQingIsNull() {
            addCriterion("qing is null");
            return (Criteria) this;
        }

        public Criteria andQingIsNotNull() {
            addCriterion("qing is not null");
            return (Criteria) this;
        }

        public Criteria andQingEqualTo(Double value) {
            addCriterion("qing =", value, "qing");
            return (Criteria) this;
        }

        public Criteria andQingNotEqualTo(Double value) {
            addCriterion("qing <>", value, "qing");
            return (Criteria) this;
        }

        public Criteria andQingGreaterThan(Double value) {
            addCriterion("qing >", value, "qing");
            return (Criteria) this;
        }

        public Criteria andQingGreaterThanOrEqualTo(Double value) {
            addCriterion("qing >=", value, "qing");
            return (Criteria) this;
        }

        public Criteria andQingLessThan(Double value) {
            addCriterion("qing <", value, "qing");
            return (Criteria) this;
        }

        public Criteria andQingLessThanOrEqualTo(Double value) {
            addCriterion("qing <=", value, "qing");
            return (Criteria) this;
        }

        public Criteria andQingIn(List<Double> values) {
            addCriterion("qing in", values, "qing");
            return (Criteria) this;
        }

        public Criteria andQingNotIn(List<Double> values) {
            addCriterion("qing not in", values, "qing");
            return (Criteria) this;
        }

        public Criteria andQingBetween(Double value1, Double value2) {
            addCriterion("qing between", value1, value2, "qing");
            return (Criteria) this;
        }

        public Criteria andQingNotBetween(Double value1, Double value2) {
            addCriterion("qing not between", value1, value2, "qing");
            return (Criteria) this;
        }

        public Criteria andXiIsNull() {
            addCriterion("xi is null");
            return (Criteria) this;
        }

        public Criteria andXiIsNotNull() {
            addCriterion("xi is not null");
            return (Criteria) this;
        }

        public Criteria andXiEqualTo(Double value) {
            addCriterion("xi =", value, "xi");
            return (Criteria) this;
        }

        public Criteria andXiNotEqualTo(Double value) {
            addCriterion("xi <>", value, "xi");
            return (Criteria) this;
        }

        public Criteria andXiGreaterThan(Double value) {
            addCriterion("xi >", value, "xi");
            return (Criteria) this;
        }

        public Criteria andXiGreaterThanOrEqualTo(Double value) {
            addCriterion("xi >=", value, "xi");
            return (Criteria) this;
        }

        public Criteria andXiLessThan(Double value) {
            addCriterion("xi <", value, "xi");
            return (Criteria) this;
        }

        public Criteria andXiLessThanOrEqualTo(Double value) {
            addCriterion("xi <=", value, "xi");
            return (Criteria) this;
        }

        public Criteria andXiIn(List<Double> values) {
            addCriterion("xi in", values, "xi");
            return (Criteria) this;
        }

        public Criteria andXiNotIn(List<Double> values) {
            addCriterion("xi not in", values, "xi");
            return (Criteria) this;
        }

        public Criteria andXiBetween(Double value1, Double value2) {
            addCriterion("xi between", value1, value2, "xi");
            return (Criteria) this;
        }

        public Criteria andXiNotBetween(Double value1, Double value2) {
            addCriterion("xi not between", value1, value2, "xi");
            return (Criteria) this;
        }

        public Criteria andShenIsNull() {
            addCriterion("shen is null");
            return (Criteria) this;
        }

        public Criteria andShenIsNotNull() {
            addCriterion("shen is not null");
            return (Criteria) this;
        }

        public Criteria andShenEqualTo(Double value) {
            addCriterion("shen =", value, "shen");
            return (Criteria) this;
        }

        public Criteria andShenNotEqualTo(Double value) {
            addCriterion("shen <>", value, "shen");
            return (Criteria) this;
        }

        public Criteria andShenGreaterThan(Double value) {
            addCriterion("shen >", value, "shen");
            return (Criteria) this;
        }

        public Criteria andShenGreaterThanOrEqualTo(Double value) {
            addCriterion("shen >=", value, "shen");
            return (Criteria) this;
        }

        public Criteria andShenLessThan(Double value) {
            addCriterion("shen <", value, "shen");
            return (Criteria) this;
        }

        public Criteria andShenLessThanOrEqualTo(Double value) {
            addCriterion("shen <=", value, "shen");
            return (Criteria) this;
        }

        public Criteria andShenIn(List<Double> values) {
            addCriterion("shen in", values, "shen");
            return (Criteria) this;
        }

        public Criteria andShenNotIn(List<Double> values) {
            addCriterion("shen not in", values, "shen");
            return (Criteria) this;
        }

        public Criteria andShenBetween(Double value1, Double value2) {
            addCriterion("shen between", value1, value2, "shen");
            return (Criteria) this;
        }

        public Criteria andShenNotBetween(Double value1, Double value2) {
            addCriterion("shen not between", value1, value2, "shen");
            return (Criteria) this;
        }

        public Criteria andGeIsNull() {
            addCriterion("ge is null");
            return (Criteria) this;
        }

        public Criteria andGeIsNotNull() {
            addCriterion("ge is not null");
            return (Criteria) this;
        }

        public Criteria andGeEqualTo(Double value) {
            addCriterion("ge =", value, "ge");
            return (Criteria) this;
        }

        public Criteria andGeNotEqualTo(Double value) {
            addCriterion("ge <>", value, "ge");
            return (Criteria) this;
        }

        public Criteria andGeGreaterThan(Double value) {
            addCriterion("ge >", value, "ge");
            return (Criteria) this;
        }

        public Criteria andGeGreaterThanOrEqualTo(Double value) {
            addCriterion("ge >=", value, "ge");
            return (Criteria) this;
        }

        public Criteria andGeLessThan(Double value) {
            addCriterion("ge <", value, "ge");
            return (Criteria) this;
        }

        public Criteria andGeLessThanOrEqualTo(Double value) {
            addCriterion("ge <=", value, "ge");
            return (Criteria) this;
        }

        public Criteria andGeIn(List<Double> values) {
            addCriterion("ge in", values, "ge");
            return (Criteria) this;
        }

        public Criteria andGeNotIn(List<Double> values) {
            addCriterion("ge not in", values, "ge");
            return (Criteria) this;
        }

        public Criteria andGeBetween(Double value1, Double value2) {
            addCriterion("ge between", value1, value2, "ge");
            return (Criteria) this;
        }

        public Criteria andGeNotBetween(Double value1, Double value2) {
            addCriterion("ge not between", value1, value2, "ge");
            return (Criteria) this;
        }

        public Criteria andLjgIsNull() {
            addCriterion("ljg is null");
            return (Criteria) this;
        }

        public Criteria andLjgIsNotNull() {
            addCriterion("ljg is not null");
            return (Criteria) this;
        }

        public Criteria andLjgEqualTo(Double value) {
            addCriterion("ljg =", value, "ljg");
            return (Criteria) this;
        }

        public Criteria andLjgNotEqualTo(Double value) {
            addCriterion("ljg <>", value, "ljg");
            return (Criteria) this;
        }

        public Criteria andLjgGreaterThan(Double value) {
            addCriterion("ljg >", value, "ljg");
            return (Criteria) this;
        }

        public Criteria andLjgGreaterThanOrEqualTo(Double value) {
            addCriterion("ljg >=", value, "ljg");
            return (Criteria) this;
        }

        public Criteria andLjgLessThan(Double value) {
            addCriterion("ljg <", value, "ljg");
            return (Criteria) this;
        }

        public Criteria andLjgLessThanOrEqualTo(Double value) {
            addCriterion("ljg <=", value, "ljg");
            return (Criteria) this;
        }

        public Criteria andLjgIn(List<Double> values) {
            addCriterion("ljg in", values, "ljg");
            return (Criteria) this;
        }

        public Criteria andLjgNotIn(List<Double> values) {
            addCriterion("ljg not in", values, "ljg");
            return (Criteria) this;
        }

        public Criteria andLjgBetween(Double value1, Double value2) {
            addCriterion("ljg between", value1, value2, "ljg");
            return (Criteria) this;
        }

        public Criteria andLjgNotBetween(Double value1, Double value2) {
            addCriterion("ljg not between", value1, value2, "ljg");
            return (Criteria) this;
        }

        public Criteria andQhwIsNull() {
            addCriterion("qhw is null");
            return (Criteria) this;
        }

        public Criteria andQhwIsNotNull() {
            addCriterion("qhw is not null");
            return (Criteria) this;
        }

        public Criteria andQhwEqualTo(Double value) {
            addCriterion("qhw =", value, "qhw");
            return (Criteria) this;
        }

        public Criteria andQhwNotEqualTo(Double value) {
            addCriterion("qhw <>", value, "qhw");
            return (Criteria) this;
        }

        public Criteria andQhwGreaterThan(Double value) {
            addCriterion("qhw >", value, "qhw");
            return (Criteria) this;
        }

        public Criteria andQhwGreaterThanOrEqualTo(Double value) {
            addCriterion("qhw >=", value, "qhw");
            return (Criteria) this;
        }

        public Criteria andQhwLessThan(Double value) {
            addCriterion("qhw <", value, "qhw");
            return (Criteria) this;
        }

        public Criteria andQhwLessThanOrEqualTo(Double value) {
            addCriterion("qhw <=", value, "qhw");
            return (Criteria) this;
        }

        public Criteria andQhwIn(List<Double> values) {
            addCriterion("qhw in", values, "qhw");
            return (Criteria) this;
        }

        public Criteria andQhwNotIn(List<Double> values) {
            addCriterion("qhw not in", values, "qhw");
            return (Criteria) this;
        }

        public Criteria andQhwBetween(Double value1, Double value2) {
            addCriterion("qhw between", value1, value2, "qhw");
            return (Criteria) this;
        }

        public Criteria andQhwNotBetween(Double value1, Double value2) {
            addCriterion("qhw not between", value1, value2, "qhw");
            return (Criteria) this;
        }

        public Criteria andYlzxdjIsNull() {
            addCriterion("ylzxdj is null");
            return (Criteria) this;
        }

        public Criteria andYlzxdjIsNotNull() {
            addCriterion("ylzxdj is not null");
            return (Criteria) this;
        }

        public Criteria andYlzxdjEqualTo(Double value) {
            addCriterion("ylzxdj =", value, "ylzxdj");
            return (Criteria) this;
        }

        public Criteria andYlzxdjNotEqualTo(Double value) {
            addCriterion("ylzxdj <>", value, "ylzxdj");
            return (Criteria) this;
        }

        public Criteria andYlzxdjGreaterThan(Double value) {
            addCriterion("ylzxdj >", value, "ylzxdj");
            return (Criteria) this;
        }

        public Criteria andYlzxdjGreaterThanOrEqualTo(Double value) {
            addCriterion("ylzxdj >=", value, "ylzxdj");
            return (Criteria) this;
        }

        public Criteria andYlzxdjLessThan(Double value) {
            addCriterion("ylzxdj <", value, "ylzxdj");
            return (Criteria) this;
        }

        public Criteria andYlzxdjLessThanOrEqualTo(Double value) {
            addCriterion("ylzxdj <=", value, "ylzxdj");
            return (Criteria) this;
        }

        public Criteria andYlzxdjIn(List<Double> values) {
            addCriterion("ylzxdj in", values, "ylzxdj");
            return (Criteria) this;
        }

        public Criteria andYlzxdjNotIn(List<Double> values) {
            addCriterion("ylzxdj not in", values, "ylzxdj");
            return (Criteria) this;
        }

        public Criteria andYlzxdjBetween(Double value1, Double value2) {
            addCriterion("ylzxdj between", value1, value2, "ylzxdj");
            return (Criteria) this;
        }

        public Criteria andYlzxdjNotBetween(Double value1, Double value2) {
            addCriterion("ylzxdj not between", value1, value2, "ylzxdj");
            return (Criteria) this;
        }

        public Criteria andLhwIsNull() {
            addCriterion("lhw is null");
            return (Criteria) this;
        }

        public Criteria andLhwIsNotNull() {
            addCriterion("lhw is not null");
            return (Criteria) this;
        }

        public Criteria andLhwEqualTo(Double value) {
            addCriterion("lhw =", value, "lhw");
            return (Criteria) this;
        }

        public Criteria andLhwNotEqualTo(Double value) {
            addCriterion("lhw <>", value, "lhw");
            return (Criteria) this;
        }

        public Criteria andLhwGreaterThan(Double value) {
            addCriterion("lhw >", value, "lhw");
            return (Criteria) this;
        }

        public Criteria andLhwGreaterThanOrEqualTo(Double value) {
            addCriterion("lhw >=", value, "lhw");
            return (Criteria) this;
        }

        public Criteria andLhwLessThan(Double value) {
            addCriterion("lhw <", value, "lhw");
            return (Criteria) this;
        }

        public Criteria andLhwLessThanOrEqualTo(Double value) {
            addCriterion("lhw <=", value, "lhw");
            return (Criteria) this;
        }

        public Criteria andLhwIn(List<Double> values) {
            addCriterion("lhw in", values, "lhw");
            return (Criteria) this;
        }

        public Criteria andLhwNotIn(List<Double> values) {
            addCriterion("lhw not in", values, "lhw");
            return (Criteria) this;
        }

        public Criteria andLhwBetween(Double value1, Double value2) {
            addCriterion("lhw between", value1, value2, "lhw");
            return (Criteria) this;
        }

        public Criteria andLhwNotBetween(Double value1, Double value2) {
            addCriterion("lhw not between", value1, value2, "lhw");
            return (Criteria) this;
        }

        public Criteria andFdcjqIsNull() {
            addCriterion("fdcjq is null");
            return (Criteria) this;
        }

        public Criteria andFdcjqIsNotNull() {
            addCriterion("fdcjq is not null");
            return (Criteria) this;
        }

        public Criteria andFdcjqEqualTo(Integer value) {
            addCriterion("fdcjq =", value, "fdcjq");
            return (Criteria) this;
        }

        public Criteria andFdcjqNotEqualTo(Integer value) {
            addCriterion("fdcjq <>", value, "fdcjq");
            return (Criteria) this;
        }

        public Criteria andFdcjqGreaterThan(Integer value) {
            addCriterion("fdcjq >", value, "fdcjq");
            return (Criteria) this;
        }

        public Criteria andFdcjqGreaterThanOrEqualTo(Integer value) {
            addCriterion("fdcjq >=", value, "fdcjq");
            return (Criteria) this;
        }

        public Criteria andFdcjqLessThan(Integer value) {
            addCriterion("fdcjq <", value, "fdcjq");
            return (Criteria) this;
        }

        public Criteria andFdcjqLessThanOrEqualTo(Integer value) {
            addCriterion("fdcjq <=", value, "fdcjq");
            return (Criteria) this;
        }

        public Criteria andFdcjqIn(List<Integer> values) {
            addCriterion("fdcjq in", values, "fdcjq");
            return (Criteria) this;
        }

        public Criteria andFdcjqNotIn(List<Integer> values) {
            addCriterion("fdcjq not in", values, "fdcjq");
            return (Criteria) this;
        }

        public Criteria andFdcjqBetween(Integer value1, Integer value2) {
            addCriterion("fdcjq between", value1, value2, "fdcjq");
            return (Criteria) this;
        }

        public Criteria andFdcjqNotBetween(Integer value1, Integer value2) {
            addCriterion("fdcjq not between", value1, value2, "fdcjq");
            return (Criteria) this;
        }

        public Criteria andRjyStdIsNull() {
            addCriterion("rjy_std is null");
            return (Criteria) this;
        }

        public Criteria andRjyStdIsNotNull() {
            addCriterion("rjy_std is not null");
            return (Criteria) this;
        }

        public Criteria andRjyStdEqualTo(String value) {
            addCriterion("rjy_std =", value, "rjyStd");
            return (Criteria) this;
        }

        public Criteria andRjyStdNotEqualTo(String value) {
            addCriterion("rjy_std <>", value, "rjyStd");
            return (Criteria) this;
        }

        public Criteria andRjyStdGreaterThan(String value) {
            addCriterion("rjy_std >", value, "rjyStd");
            return (Criteria) this;
        }

        public Criteria andRjyStdGreaterThanOrEqualTo(String value) {
            addCriterion("rjy_std >=", value, "rjyStd");
            return (Criteria) this;
        }

        public Criteria andRjyStdLessThan(String value) {
            addCriterion("rjy_std <", value, "rjyStd");
            return (Criteria) this;
        }

        public Criteria andRjyStdLessThanOrEqualTo(String value) {
            addCriterion("rjy_std <=", value, "rjyStd");
            return (Criteria) this;
        }

        public Criteria andRjyStdLike(String value) {
            addCriterion("rjy_std like", value, "rjyStd");
            return (Criteria) this;
        }

        public Criteria andRjyStdNotLike(String value) {
            addCriterion("rjy_std not like", value, "rjyStd");
            return (Criteria) this;
        }

        public Criteria andRjyStdIn(List<String> values) {
            addCriterion("rjy_std in", values, "rjyStd");
            return (Criteria) this;
        }

        public Criteria andRjyStdNotIn(List<String> values) {
            addCriterion("rjy_std not in", values, "rjyStd");
            return (Criteria) this;
        }

        public Criteria andRjyStdBetween(String value1, String value2) {
            addCriterion("rjy_std between", value1, value2, "rjyStd");
            return (Criteria) this;
        }

        public Criteria andRjyStdNotBetween(String value1, String value2) {
            addCriterion("rjy_std not between", value1, value2, "rjyStd");
            return (Criteria) this;
        }

        public Criteria andGmsyzsStdIsNull() {
            addCriterion("gmsyzs_std is null");
            return (Criteria) this;
        }

        public Criteria andGmsyzsStdIsNotNull() {
            addCriterion("gmsyzs_std is not null");
            return (Criteria) this;
        }

        public Criteria andGmsyzsStdEqualTo(String value) {
            addCriterion("gmsyzs_std =", value, "gmsyzsStd");
            return (Criteria) this;
        }

        public Criteria andGmsyzsStdNotEqualTo(String value) {
            addCriterion("gmsyzs_std <>", value, "gmsyzsStd");
            return (Criteria) this;
        }

        public Criteria andGmsyzsStdGreaterThan(String value) {
            addCriterion("gmsyzs_std >", value, "gmsyzsStd");
            return (Criteria) this;
        }

        public Criteria andGmsyzsStdGreaterThanOrEqualTo(String value) {
            addCriterion("gmsyzs_std >=", value, "gmsyzsStd");
            return (Criteria) this;
        }

        public Criteria andGmsyzsStdLessThan(String value) {
            addCriterion("gmsyzs_std <", value, "gmsyzsStd");
            return (Criteria) this;
        }

        public Criteria andGmsyzsStdLessThanOrEqualTo(String value) {
            addCriterion("gmsyzs_std <=", value, "gmsyzsStd");
            return (Criteria) this;
        }

        public Criteria andGmsyzsStdLike(String value) {
            addCriterion("gmsyzs_std like", value, "gmsyzsStd");
            return (Criteria) this;
        }

        public Criteria andGmsyzsStdNotLike(String value) {
            addCriterion("gmsyzs_std not like", value, "gmsyzsStd");
            return (Criteria) this;
        }

        public Criteria andGmsyzsStdIn(List<String> values) {
            addCriterion("gmsyzs_std in", values, "gmsyzsStd");
            return (Criteria) this;
        }

        public Criteria andGmsyzsStdNotIn(List<String> values) {
            addCriterion("gmsyzs_std not in", values, "gmsyzsStd");
            return (Criteria) this;
        }

        public Criteria andGmsyzsStdBetween(String value1, String value2) {
            addCriterion("gmsyzs_std between", value1, value2, "gmsyzsStd");
            return (Criteria) this;
        }

        public Criteria andGmsyzsStdNotBetween(String value1, String value2) {
            addCriterion("gmsyzs_std not between", value1, value2, "gmsyzsStd");
            return (Criteria) this;
        }

        public Criteria andShxylStdIsNull() {
            addCriterion("shxyl_std is null");
            return (Criteria) this;
        }

        public Criteria andShxylStdIsNotNull() {
            addCriterion("shxyl_std is not null");
            return (Criteria) this;
        }

        public Criteria andShxylStdEqualTo(String value) {
            addCriterion("shxyl_std =", value, "shxylStd");
            return (Criteria) this;
        }

        public Criteria andShxylStdNotEqualTo(String value) {
            addCriterion("shxyl_std <>", value, "shxylStd");
            return (Criteria) this;
        }

        public Criteria andShxylStdGreaterThan(String value) {
            addCriterion("shxyl_std >", value, "shxylStd");
            return (Criteria) this;
        }

        public Criteria andShxylStdGreaterThanOrEqualTo(String value) {
            addCriterion("shxyl_std >=", value, "shxylStd");
            return (Criteria) this;
        }

        public Criteria andShxylStdLessThan(String value) {
            addCriterion("shxyl_std <", value, "shxylStd");
            return (Criteria) this;
        }

        public Criteria andShxylStdLessThanOrEqualTo(String value) {
            addCriterion("shxyl_std <=", value, "shxylStd");
            return (Criteria) this;
        }

        public Criteria andShxylStdLike(String value) {
            addCriterion("shxyl_std like", value, "shxylStd");
            return (Criteria) this;
        }

        public Criteria andShxylStdNotLike(String value) {
            addCriterion("shxyl_std not like", value, "shxylStd");
            return (Criteria) this;
        }

        public Criteria andShxylStdIn(List<String> values) {
            addCriterion("shxyl_std in", values, "shxylStd");
            return (Criteria) this;
        }

        public Criteria andShxylStdNotIn(List<String> values) {
            addCriterion("shxyl_std not in", values, "shxylStd");
            return (Criteria) this;
        }

        public Criteria andShxylStdBetween(String value1, String value2) {
            addCriterion("shxyl_std between", value1, value2, "shxylStd");
            return (Criteria) this;
        }

        public Criteria andShxylStdNotBetween(String value1, String value2) {
            addCriterion("shxyl_std not between", value1, value2, "shxylStd");
            return (Criteria) this;
        }

        public Criteria andAdStdIsNull() {
            addCriterion("ad_std is null");
            return (Criteria) this;
        }

        public Criteria andAdStdIsNotNull() {
            addCriterion("ad_std is not null");
            return (Criteria) this;
        }

        public Criteria andAdStdEqualTo(String value) {
            addCriterion("ad_std =", value, "adStd");
            return (Criteria) this;
        }

        public Criteria andAdStdNotEqualTo(String value) {
            addCriterion("ad_std <>", value, "adStd");
            return (Criteria) this;
        }

        public Criteria andAdStdGreaterThan(String value) {
            addCriterion("ad_std >", value, "adStd");
            return (Criteria) this;
        }

        public Criteria andAdStdGreaterThanOrEqualTo(String value) {
            addCriterion("ad_std >=", value, "adStd");
            return (Criteria) this;
        }

        public Criteria andAdStdLessThan(String value) {
            addCriterion("ad_std <", value, "adStd");
            return (Criteria) this;
        }

        public Criteria andAdStdLessThanOrEqualTo(String value) {
            addCriterion("ad_std <=", value, "adStd");
            return (Criteria) this;
        }

        public Criteria andAdStdLike(String value) {
            addCriterion("ad_std like", value, "adStd");
            return (Criteria) this;
        }

        public Criteria andAdStdNotLike(String value) {
            addCriterion("ad_std not like", value, "adStd");
            return (Criteria) this;
        }

        public Criteria andAdStdIn(List<String> values) {
            addCriterion("ad_std in", values, "adStd");
            return (Criteria) this;
        }

        public Criteria andAdStdNotIn(List<String> values) {
            addCriterion("ad_std not in", values, "adStd");
            return (Criteria) this;
        }

        public Criteria andAdStdBetween(String value1, String value2) {
            addCriterion("ad_std between", value1, value2, "adStd");
            return (Criteria) this;
        }

        public Criteria andAdStdNotBetween(String value1, String value2) {
            addCriterion("ad_std not between", value1, value2, "adStd");
            return (Criteria) this;
        }

        public Criteria andSylStdIsNull() {
            addCriterion("syl_std is null");
            return (Criteria) this;
        }

        public Criteria andSylStdIsNotNull() {
            addCriterion("syl_std is not null");
            return (Criteria) this;
        }

        public Criteria andSylStdEqualTo(String value) {
            addCriterion("syl_std =", value, "sylStd");
            return (Criteria) this;
        }

        public Criteria andSylStdNotEqualTo(String value) {
            addCriterion("syl_std <>", value, "sylStd");
            return (Criteria) this;
        }

        public Criteria andSylStdGreaterThan(String value) {
            addCriterion("syl_std >", value, "sylStd");
            return (Criteria) this;
        }

        public Criteria andSylStdGreaterThanOrEqualTo(String value) {
            addCriterion("syl_std >=", value, "sylStd");
            return (Criteria) this;
        }

        public Criteria andSylStdLessThan(String value) {
            addCriterion("syl_std <", value, "sylStd");
            return (Criteria) this;
        }

        public Criteria andSylStdLessThanOrEqualTo(String value) {
            addCriterion("syl_std <=", value, "sylStd");
            return (Criteria) this;
        }

        public Criteria andSylStdLike(String value) {
            addCriterion("syl_std like", value, "sylStd");
            return (Criteria) this;
        }

        public Criteria andSylStdNotLike(String value) {
            addCriterion("syl_std not like", value, "sylStd");
            return (Criteria) this;
        }

        public Criteria andSylStdIn(List<String> values) {
            addCriterion("syl_std in", values, "sylStd");
            return (Criteria) this;
        }

        public Criteria andSylStdNotIn(List<String> values) {
            addCriterion("syl_std not in", values, "sylStd");
            return (Criteria) this;
        }

        public Criteria andSylStdBetween(String value1, String value2) {
            addCriterion("syl_std between", value1, value2, "sylStd");
            return (Criteria) this;
        }

        public Criteria andSylStdNotBetween(String value1, String value2) {
            addCriterion("syl_std not between", value1, value2, "sylStd");
            return (Criteria) this;
        }

        public Criteria andHffStdIsNull() {
            addCriterion("hff_std is null");
            return (Criteria) this;
        }

        public Criteria andHffStdIsNotNull() {
            addCriterion("hff_std is not null");
            return (Criteria) this;
        }

        public Criteria andHffStdEqualTo(String value) {
            addCriterion("hff_std =", value, "hffStd");
            return (Criteria) this;
        }

        public Criteria andHffStdNotEqualTo(String value) {
            addCriterion("hff_std <>", value, "hffStd");
            return (Criteria) this;
        }

        public Criteria andHffStdGreaterThan(String value) {
            addCriterion("hff_std >", value, "hffStd");
            return (Criteria) this;
        }

        public Criteria andHffStdGreaterThanOrEqualTo(String value) {
            addCriterion("hff_std >=", value, "hffStd");
            return (Criteria) this;
        }

        public Criteria andHffStdLessThan(String value) {
            addCriterion("hff_std <", value, "hffStd");
            return (Criteria) this;
        }

        public Criteria andHffStdLessThanOrEqualTo(String value) {
            addCriterion("hff_std <=", value, "hffStd");
            return (Criteria) this;
        }

        public Criteria andHffStdLike(String value) {
            addCriterion("hff_std like", value, "hffStd");
            return (Criteria) this;
        }

        public Criteria andHffStdNotLike(String value) {
            addCriterion("hff_std not like", value, "hffStd");
            return (Criteria) this;
        }

        public Criteria andHffStdIn(List<String> values) {
            addCriterion("hff_std in", values, "hffStd");
            return (Criteria) this;
        }

        public Criteria andHffStdNotIn(List<String> values) {
            addCriterion("hff_std not in", values, "hffStd");
            return (Criteria) this;
        }

        public Criteria andHffStdBetween(String value1, String value2) {
            addCriterion("hff_std between", value1, value2, "hffStd");
            return (Criteria) this;
        }

        public Criteria andHffStdNotBetween(String value1, String value2) {
            addCriterion("hff_std not between", value1, value2, "hffStd");
            return (Criteria) this;
        }

        public Criteria andGongStdIsNull() {
            addCriterion("gong_std is null");
            return (Criteria) this;
        }

        public Criteria andGongStdIsNotNull() {
            addCriterion("gong_std is not null");
            return (Criteria) this;
        }

        public Criteria andGongStdEqualTo(String value) {
            addCriterion("gong_std =", value, "gongStd");
            return (Criteria) this;
        }

        public Criteria andGongStdNotEqualTo(String value) {
            addCriterion("gong_std <>", value, "gongStd");
            return (Criteria) this;
        }

        public Criteria andGongStdGreaterThan(String value) {
            addCriterion("gong_std >", value, "gongStd");
            return (Criteria) this;
        }

        public Criteria andGongStdGreaterThanOrEqualTo(String value) {
            addCriterion("gong_std >=", value, "gongStd");
            return (Criteria) this;
        }

        public Criteria andGongStdLessThan(String value) {
            addCriterion("gong_std <", value, "gongStd");
            return (Criteria) this;
        }

        public Criteria andGongStdLessThanOrEqualTo(String value) {
            addCriterion("gong_std <=", value, "gongStd");
            return (Criteria) this;
        }

        public Criteria andGongStdLike(String value) {
            addCriterion("gong_std like", value, "gongStd");
            return (Criteria) this;
        }

        public Criteria andGongStdNotLike(String value) {
            addCriterion("gong_std not like", value, "gongStd");
            return (Criteria) this;
        }

        public Criteria andGongStdIn(List<String> values) {
            addCriterion("gong_std in", values, "gongStd");
            return (Criteria) this;
        }

        public Criteria andGongStdNotIn(List<String> values) {
            addCriterion("gong_std not in", values, "gongStd");
            return (Criteria) this;
        }

        public Criteria andGongStdBetween(String value1, String value2) {
            addCriterion("gong_std between", value1, value2, "gongStd");
            return (Criteria) this;
        }

        public Criteria andGongStdNotBetween(String value1, String value2) {
            addCriterion("gong_std not between", value1, value2, "gongStd");
            return (Criteria) this;
        }

        public Criteria andQianStdIsNull() {
            addCriterion("qian_std is null");
            return (Criteria) this;
        }

        public Criteria andQianStdIsNotNull() {
            addCriterion("qian_std is not null");
            return (Criteria) this;
        }

        public Criteria andQianStdEqualTo(String value) {
            addCriterion("qian_std =", value, "qianStd");
            return (Criteria) this;
        }

        public Criteria andQianStdNotEqualTo(String value) {
            addCriterion("qian_std <>", value, "qianStd");
            return (Criteria) this;
        }

        public Criteria andQianStdGreaterThan(String value) {
            addCriterion("qian_std >", value, "qianStd");
            return (Criteria) this;
        }

        public Criteria andQianStdGreaterThanOrEqualTo(String value) {
            addCriterion("qian_std >=", value, "qianStd");
            return (Criteria) this;
        }

        public Criteria andQianStdLessThan(String value) {
            addCriterion("qian_std <", value, "qianStd");
            return (Criteria) this;
        }

        public Criteria andQianStdLessThanOrEqualTo(String value) {
            addCriterion("qian_std <=", value, "qianStd");
            return (Criteria) this;
        }

        public Criteria andQianStdLike(String value) {
            addCriterion("qian_std like", value, "qianStd");
            return (Criteria) this;
        }

        public Criteria andQianStdNotLike(String value) {
            addCriterion("qian_std not like", value, "qianStd");
            return (Criteria) this;
        }

        public Criteria andQianStdIn(List<String> values) {
            addCriterion("qian_std in", values, "qianStd");
            return (Criteria) this;
        }

        public Criteria andQianStdNotIn(List<String> values) {
            addCriterion("qian_std not in", values, "qianStd");
            return (Criteria) this;
        }

        public Criteria andQianStdBetween(String value1, String value2) {
            addCriterion("qian_std between", value1, value2, "qianStd");
            return (Criteria) this;
        }

        public Criteria andQianStdNotBetween(String value1, String value2) {
            addCriterion("qian_std not between", value1, value2, "qianStd");
            return (Criteria) this;
        }

        public Criteria andHxxylStdIsNull() {
            addCriterion("hxxyl_std is null");
            return (Criteria) this;
        }

        public Criteria andHxxylStdIsNotNull() {
            addCriterion("hxxyl_std is not null");
            return (Criteria) this;
        }

        public Criteria andHxxylStdEqualTo(String value) {
            addCriterion("hxxyl_std =", value, "hxxylStd");
            return (Criteria) this;
        }

        public Criteria andHxxylStdNotEqualTo(String value) {
            addCriterion("hxxyl_std <>", value, "hxxylStd");
            return (Criteria) this;
        }

        public Criteria andHxxylStdGreaterThan(String value) {
            addCriterion("hxxyl_std >", value, "hxxylStd");
            return (Criteria) this;
        }

        public Criteria andHxxylStdGreaterThanOrEqualTo(String value) {
            addCriterion("hxxyl_std >=", value, "hxxylStd");
            return (Criteria) this;
        }

        public Criteria andHxxylStdLessThan(String value) {
            addCriterion("hxxyl_std <", value, "hxxylStd");
            return (Criteria) this;
        }

        public Criteria andHxxylStdLessThanOrEqualTo(String value) {
            addCriterion("hxxyl_std <=", value, "hxxylStd");
            return (Criteria) this;
        }

        public Criteria andHxxylStdLike(String value) {
            addCriterion("hxxyl_std like", value, "hxxylStd");
            return (Criteria) this;
        }

        public Criteria andHxxylStdNotLike(String value) {
            addCriterion("hxxyl_std not like", value, "hxxylStd");
            return (Criteria) this;
        }

        public Criteria andHxxylStdIn(List<String> values) {
            addCriterion("hxxyl_std in", values, "hxxylStd");
            return (Criteria) this;
        }

        public Criteria andHxxylStdNotIn(List<String> values) {
            addCriterion("hxxyl_std not in", values, "hxxylStd");
            return (Criteria) this;
        }

        public Criteria andHxxylStdBetween(String value1, String value2) {
            addCriterion("hxxyl_std between", value1, value2, "hxxylStd");
            return (Criteria) this;
        }

        public Criteria andHxxylStdNotBetween(String value1, String value2) {
            addCriterion("hxxyl_std not between", value1, value2, "hxxylStd");
            return (Criteria) this;
        }

        public Criteria andZdStdIsNull() {
            addCriterion("zd_std is null");
            return (Criteria) this;
        }

        public Criteria andZdStdIsNotNull() {
            addCriterion("zd_std is not null");
            return (Criteria) this;
        }

        public Criteria andZdStdEqualTo(String value) {
            addCriterion("zd_std =", value, "zdStd");
            return (Criteria) this;
        }

        public Criteria andZdStdNotEqualTo(String value) {
            addCriterion("zd_std <>", value, "zdStd");
            return (Criteria) this;
        }

        public Criteria andZdStdGreaterThan(String value) {
            addCriterion("zd_std >", value, "zdStd");
            return (Criteria) this;
        }

        public Criteria andZdStdGreaterThanOrEqualTo(String value) {
            addCriterion("zd_std >=", value, "zdStd");
            return (Criteria) this;
        }

        public Criteria andZdStdLessThan(String value) {
            addCriterion("zd_std <", value, "zdStd");
            return (Criteria) this;
        }

        public Criteria andZdStdLessThanOrEqualTo(String value) {
            addCriterion("zd_std <=", value, "zdStd");
            return (Criteria) this;
        }

        public Criteria andZdStdLike(String value) {
            addCriterion("zd_std like", value, "zdStd");
            return (Criteria) this;
        }

        public Criteria andZdStdNotLike(String value) {
            addCriterion("zd_std not like", value, "zdStd");
            return (Criteria) this;
        }

        public Criteria andZdStdIn(List<String> values) {
            addCriterion("zd_std in", values, "zdStd");
            return (Criteria) this;
        }

        public Criteria andZdStdNotIn(List<String> values) {
            addCriterion("zd_std not in", values, "zdStd");
            return (Criteria) this;
        }

        public Criteria andZdStdBetween(String value1, String value2) {
            addCriterion("zd_std between", value1, value2, "zdStd");
            return (Criteria) this;
        }

        public Criteria andZdStdNotBetween(String value1, String value2) {
            addCriterion("zd_std not between", value1, value2, "zdStd");
            return (Criteria) this;
        }

        public Criteria andZlStdIsNull() {
            addCriterion("zl_std is null");
            return (Criteria) this;
        }

        public Criteria andZlStdIsNotNull() {
            addCriterion("zl_std is not null");
            return (Criteria) this;
        }

        public Criteria andZlStdEqualTo(String value) {
            addCriterion("zl_std =", value, "zlStd");
            return (Criteria) this;
        }

        public Criteria andZlStdNotEqualTo(String value) {
            addCriterion("zl_std <>", value, "zlStd");
            return (Criteria) this;
        }

        public Criteria andZlStdGreaterThan(String value) {
            addCriterion("zl_std >", value, "zlStd");
            return (Criteria) this;
        }

        public Criteria andZlStdGreaterThanOrEqualTo(String value) {
            addCriterion("zl_std >=", value, "zlStd");
            return (Criteria) this;
        }

        public Criteria andZlStdLessThan(String value) {
            addCriterion("zl_std <", value, "zlStd");
            return (Criteria) this;
        }

        public Criteria andZlStdLessThanOrEqualTo(String value) {
            addCriterion("zl_std <=", value, "zlStd");
            return (Criteria) this;
        }

        public Criteria andZlStdLike(String value) {
            addCriterion("zl_std like", value, "zlStd");
            return (Criteria) this;
        }

        public Criteria andZlStdNotLike(String value) {
            addCriterion("zl_std not like", value, "zlStd");
            return (Criteria) this;
        }

        public Criteria andZlStdIn(List<String> values) {
            addCriterion("zl_std in", values, "zlStd");
            return (Criteria) this;
        }

        public Criteria andZlStdNotIn(List<String> values) {
            addCriterion("zl_std not in", values, "zlStd");
            return (Criteria) this;
        }

        public Criteria andZlStdBetween(String value1, String value2) {
            addCriterion("zl_std between", value1, value2, "zlStd");
            return (Criteria) this;
        }

        public Criteria andZlStdNotBetween(String value1, String value2) {
            addCriterion("zl_std not between", value1, value2, "zlStd");
            return (Criteria) this;
        }

        public Criteria andTongStdIsNull() {
            addCriterion("tong_std is null");
            return (Criteria) this;
        }

        public Criteria andTongStdIsNotNull() {
            addCriterion("tong_std is not null");
            return (Criteria) this;
        }

        public Criteria andTongStdEqualTo(String value) {
            addCriterion("tong_std =", value, "tongStd");
            return (Criteria) this;
        }

        public Criteria andTongStdNotEqualTo(String value) {
            addCriterion("tong_std <>", value, "tongStd");
            return (Criteria) this;
        }

        public Criteria andTongStdGreaterThan(String value) {
            addCriterion("tong_std >", value, "tongStd");
            return (Criteria) this;
        }

        public Criteria andTongStdGreaterThanOrEqualTo(String value) {
            addCriterion("tong_std >=", value, "tongStd");
            return (Criteria) this;
        }

        public Criteria andTongStdLessThan(String value) {
            addCriterion("tong_std <", value, "tongStd");
            return (Criteria) this;
        }

        public Criteria andTongStdLessThanOrEqualTo(String value) {
            addCriterion("tong_std <=", value, "tongStd");
            return (Criteria) this;
        }

        public Criteria andTongStdLike(String value) {
            addCriterion("tong_std like", value, "tongStd");
            return (Criteria) this;
        }

        public Criteria andTongStdNotLike(String value) {
            addCriterion("tong_std not like", value, "tongStd");
            return (Criteria) this;
        }

        public Criteria andTongStdIn(List<String> values) {
            addCriterion("tong_std in", values, "tongStd");
            return (Criteria) this;
        }

        public Criteria andTongStdNotIn(List<String> values) {
            addCriterion("tong_std not in", values, "tongStd");
            return (Criteria) this;
        }

        public Criteria andTongStdBetween(String value1, String value2) {
            addCriterion("tong_std between", value1, value2, "tongStd");
            return (Criteria) this;
        }

        public Criteria andTongStdNotBetween(String value1, String value2) {
            addCriterion("tong_std not between", value1, value2, "tongStd");
            return (Criteria) this;
        }

        public Criteria andXinStdIsNull() {
            addCriterion("xin_std is null");
            return (Criteria) this;
        }

        public Criteria andXinStdIsNotNull() {
            addCriterion("xin_std is not null");
            return (Criteria) this;
        }

        public Criteria andXinStdEqualTo(String value) {
            addCriterion("xin_std =", value, "xinStd");
            return (Criteria) this;
        }

        public Criteria andXinStdNotEqualTo(String value) {
            addCriterion("xin_std <>", value, "xinStd");
            return (Criteria) this;
        }

        public Criteria andXinStdGreaterThan(String value) {
            addCriterion("xin_std >", value, "xinStd");
            return (Criteria) this;
        }

        public Criteria andXinStdGreaterThanOrEqualTo(String value) {
            addCriterion("xin_std >=", value, "xinStd");
            return (Criteria) this;
        }

        public Criteria andXinStdLessThan(String value) {
            addCriterion("xin_std <", value, "xinStd");
            return (Criteria) this;
        }

        public Criteria andXinStdLessThanOrEqualTo(String value) {
            addCriterion("xin_std <=", value, "xinStd");
            return (Criteria) this;
        }

        public Criteria andXinStdLike(String value) {
            addCriterion("xin_std like", value, "xinStd");
            return (Criteria) this;
        }

        public Criteria andXinStdNotLike(String value) {
            addCriterion("xin_std not like", value, "xinStd");
            return (Criteria) this;
        }

        public Criteria andXinStdIn(List<String> values) {
            addCriterion("xin_std in", values, "xinStd");
            return (Criteria) this;
        }

        public Criteria andXinStdNotIn(List<String> values) {
            addCriterion("xin_std not in", values, "xinStd");
            return (Criteria) this;
        }

        public Criteria andXinStdBetween(String value1, String value2) {
            addCriterion("xin_std between", value1, value2, "xinStd");
            return (Criteria) this;
        }

        public Criteria andXinStdNotBetween(String value1, String value2) {
            addCriterion("xin_std not between", value1, value2, "xinStd");
            return (Criteria) this;
        }

        public Criteria andQingStdIsNull() {
            addCriterion("qing_std is null");
            return (Criteria) this;
        }

        public Criteria andQingStdIsNotNull() {
            addCriterion("qing_std is not null");
            return (Criteria) this;
        }

        public Criteria andQingStdEqualTo(String value) {
            addCriterion("qing_std =", value, "qingStd");
            return (Criteria) this;
        }

        public Criteria andQingStdNotEqualTo(String value) {
            addCriterion("qing_std <>", value, "qingStd");
            return (Criteria) this;
        }

        public Criteria andQingStdGreaterThan(String value) {
            addCriterion("qing_std >", value, "qingStd");
            return (Criteria) this;
        }

        public Criteria andQingStdGreaterThanOrEqualTo(String value) {
            addCriterion("qing_std >=", value, "qingStd");
            return (Criteria) this;
        }

        public Criteria andQingStdLessThan(String value) {
            addCriterion("qing_std <", value, "qingStd");
            return (Criteria) this;
        }

        public Criteria andQingStdLessThanOrEqualTo(String value) {
            addCriterion("qing_std <=", value, "qingStd");
            return (Criteria) this;
        }

        public Criteria andQingStdLike(String value) {
            addCriterion("qing_std like", value, "qingStd");
            return (Criteria) this;
        }

        public Criteria andQingStdNotLike(String value) {
            addCriterion("qing_std not like", value, "qingStd");
            return (Criteria) this;
        }

        public Criteria andQingStdIn(List<String> values) {
            addCriterion("qing_std in", values, "qingStd");
            return (Criteria) this;
        }

        public Criteria andQingStdNotIn(List<String> values) {
            addCriterion("qing_std not in", values, "qingStd");
            return (Criteria) this;
        }

        public Criteria andQingStdBetween(String value1, String value2) {
            addCriterion("qing_std between", value1, value2, "qingStd");
            return (Criteria) this;
        }

        public Criteria andQingStdNotBetween(String value1, String value2) {
            addCriterion("qing_std not between", value1, value2, "qingStd");
            return (Criteria) this;
        }

        public Criteria andXiStdIsNull() {
            addCriterion("xi_std is null");
            return (Criteria) this;
        }

        public Criteria andXiStdIsNotNull() {
            addCriterion("xi_std is not null");
            return (Criteria) this;
        }

        public Criteria andXiStdEqualTo(String value) {
            addCriterion("xi_std =", value, "xiStd");
            return (Criteria) this;
        }

        public Criteria andXiStdNotEqualTo(String value) {
            addCriterion("xi_std <>", value, "xiStd");
            return (Criteria) this;
        }

        public Criteria andXiStdGreaterThan(String value) {
            addCriterion("xi_std >", value, "xiStd");
            return (Criteria) this;
        }

        public Criteria andXiStdGreaterThanOrEqualTo(String value) {
            addCriterion("xi_std >=", value, "xiStd");
            return (Criteria) this;
        }

        public Criteria andXiStdLessThan(String value) {
            addCriterion("xi_std <", value, "xiStd");
            return (Criteria) this;
        }

        public Criteria andXiStdLessThanOrEqualTo(String value) {
            addCriterion("xi_std <=", value, "xiStd");
            return (Criteria) this;
        }

        public Criteria andXiStdLike(String value) {
            addCriterion("xi_std like", value, "xiStd");
            return (Criteria) this;
        }

        public Criteria andXiStdNotLike(String value) {
            addCriterion("xi_std not like", value, "xiStd");
            return (Criteria) this;
        }

        public Criteria andXiStdIn(List<String> values) {
            addCriterion("xi_std in", values, "xiStd");
            return (Criteria) this;
        }

        public Criteria andXiStdNotIn(List<String> values) {
            addCriterion("xi_std not in", values, "xiStd");
            return (Criteria) this;
        }

        public Criteria andXiStdBetween(String value1, String value2) {
            addCriterion("xi_std between", value1, value2, "xiStd");
            return (Criteria) this;
        }

        public Criteria andXiStdNotBetween(String value1, String value2) {
            addCriterion("xi_std not between", value1, value2, "xiStd");
            return (Criteria) this;
        }

        public Criteria andShenStdIsNull() {
            addCriterion("shen_std is null");
            return (Criteria) this;
        }

        public Criteria andShenStdIsNotNull() {
            addCriterion("shen_std is not null");
            return (Criteria) this;
        }

        public Criteria andShenStdEqualTo(String value) {
            addCriterion("shen_std =", value, "shenStd");
            return (Criteria) this;
        }

        public Criteria andShenStdNotEqualTo(String value) {
            addCriterion("shen_std <>", value, "shenStd");
            return (Criteria) this;
        }

        public Criteria andShenStdGreaterThan(String value) {
            addCriterion("shen_std >", value, "shenStd");
            return (Criteria) this;
        }

        public Criteria andShenStdGreaterThanOrEqualTo(String value) {
            addCriterion("shen_std >=", value, "shenStd");
            return (Criteria) this;
        }

        public Criteria andShenStdLessThan(String value) {
            addCriterion("shen_std <", value, "shenStd");
            return (Criteria) this;
        }

        public Criteria andShenStdLessThanOrEqualTo(String value) {
            addCriterion("shen_std <=", value, "shenStd");
            return (Criteria) this;
        }

        public Criteria andShenStdLike(String value) {
            addCriterion("shen_std like", value, "shenStd");
            return (Criteria) this;
        }

        public Criteria andShenStdNotLike(String value) {
            addCriterion("shen_std not like", value, "shenStd");
            return (Criteria) this;
        }

        public Criteria andShenStdIn(List<String> values) {
            addCriterion("shen_std in", values, "shenStd");
            return (Criteria) this;
        }

        public Criteria andShenStdNotIn(List<String> values) {
            addCriterion("shen_std not in", values, "shenStd");
            return (Criteria) this;
        }

        public Criteria andShenStdBetween(String value1, String value2) {
            addCriterion("shen_std between", value1, value2, "shenStd");
            return (Criteria) this;
        }

        public Criteria andShenStdNotBetween(String value1, String value2) {
            addCriterion("shen_std not between", value1, value2, "shenStd");
            return (Criteria) this;
        }

        public Criteria andGeStdIsNull() {
            addCriterion("ge_std is null");
            return (Criteria) this;
        }

        public Criteria andGeStdIsNotNull() {
            addCriterion("ge_std is not null");
            return (Criteria) this;
        }

        public Criteria andGeStdEqualTo(String value) {
            addCriterion("ge_std =", value, "geStd");
            return (Criteria) this;
        }

        public Criteria andGeStdNotEqualTo(String value) {
            addCriterion("ge_std <>", value, "geStd");
            return (Criteria) this;
        }

        public Criteria andGeStdGreaterThan(String value) {
            addCriterion("ge_std >", value, "geStd");
            return (Criteria) this;
        }

        public Criteria andGeStdGreaterThanOrEqualTo(String value) {
            addCriterion("ge_std >=", value, "geStd");
            return (Criteria) this;
        }

        public Criteria andGeStdLessThan(String value) {
            addCriterion("ge_std <", value, "geStd");
            return (Criteria) this;
        }

        public Criteria andGeStdLessThanOrEqualTo(String value) {
            addCriterion("ge_std <=", value, "geStd");
            return (Criteria) this;
        }

        public Criteria andGeStdLike(String value) {
            addCriterion("ge_std like", value, "geStd");
            return (Criteria) this;
        }

        public Criteria andGeStdNotLike(String value) {
            addCriterion("ge_std not like", value, "geStd");
            return (Criteria) this;
        }

        public Criteria andGeStdIn(List<String> values) {
            addCriterion("ge_std in", values, "geStd");
            return (Criteria) this;
        }

        public Criteria andGeStdNotIn(List<String> values) {
            addCriterion("ge_std not in", values, "geStd");
            return (Criteria) this;
        }

        public Criteria andGeStdBetween(String value1, String value2) {
            addCriterion("ge_std between", value1, value2, "geStd");
            return (Criteria) this;
        }

        public Criteria andGeStdNotBetween(String value1, String value2) {
            addCriterion("ge_std not between", value1, value2, "geStd");
            return (Criteria) this;
        }

        public Criteria andLjgStdIsNull() {
            addCriterion("ljg_std is null");
            return (Criteria) this;
        }

        public Criteria andLjgStdIsNotNull() {
            addCriterion("ljg_std is not null");
            return (Criteria) this;
        }

        public Criteria andLjgStdEqualTo(String value) {
            addCriterion("ljg_std =", value, "ljgStd");
            return (Criteria) this;
        }

        public Criteria andLjgStdNotEqualTo(String value) {
            addCriterion("ljg_std <>", value, "ljgStd");
            return (Criteria) this;
        }

        public Criteria andLjgStdGreaterThan(String value) {
            addCriterion("ljg_std >", value, "ljgStd");
            return (Criteria) this;
        }

        public Criteria andLjgStdGreaterThanOrEqualTo(String value) {
            addCriterion("ljg_std >=", value, "ljgStd");
            return (Criteria) this;
        }

        public Criteria andLjgStdLessThan(String value) {
            addCriterion("ljg_std <", value, "ljgStd");
            return (Criteria) this;
        }

        public Criteria andLjgStdLessThanOrEqualTo(String value) {
            addCriterion("ljg_std <=", value, "ljgStd");
            return (Criteria) this;
        }

        public Criteria andLjgStdLike(String value) {
            addCriterion("ljg_std like", value, "ljgStd");
            return (Criteria) this;
        }

        public Criteria andLjgStdNotLike(String value) {
            addCriterion("ljg_std not like", value, "ljgStd");
            return (Criteria) this;
        }

        public Criteria andLjgStdIn(List<String> values) {
            addCriterion("ljg_std in", values, "ljgStd");
            return (Criteria) this;
        }

        public Criteria andLjgStdNotIn(List<String> values) {
            addCriterion("ljg_std not in", values, "ljgStd");
            return (Criteria) this;
        }

        public Criteria andLjgStdBetween(String value1, String value2) {
            addCriterion("ljg_std between", value1, value2, "ljgStd");
            return (Criteria) this;
        }

        public Criteria andLjgStdNotBetween(String value1, String value2) {
            addCriterion("ljg_std not between", value1, value2, "ljgStd");
            return (Criteria) this;
        }

        public Criteria andQhwStdIsNull() {
            addCriterion("qhw_std is null");
            return (Criteria) this;
        }

        public Criteria andQhwStdIsNotNull() {
            addCriterion("qhw_std is not null");
            return (Criteria) this;
        }

        public Criteria andQhwStdEqualTo(String value) {
            addCriterion("qhw_std =", value, "qhwStd");
            return (Criteria) this;
        }

        public Criteria andQhwStdNotEqualTo(String value) {
            addCriterion("qhw_std <>", value, "qhwStd");
            return (Criteria) this;
        }

        public Criteria andQhwStdGreaterThan(String value) {
            addCriterion("qhw_std >", value, "qhwStd");
            return (Criteria) this;
        }

        public Criteria andQhwStdGreaterThanOrEqualTo(String value) {
            addCriterion("qhw_std >=", value, "qhwStd");
            return (Criteria) this;
        }

        public Criteria andQhwStdLessThan(String value) {
            addCriterion("qhw_std <", value, "qhwStd");
            return (Criteria) this;
        }

        public Criteria andQhwStdLessThanOrEqualTo(String value) {
            addCriterion("qhw_std <=", value, "qhwStd");
            return (Criteria) this;
        }

        public Criteria andQhwStdLike(String value) {
            addCriterion("qhw_std like", value, "qhwStd");
            return (Criteria) this;
        }

        public Criteria andQhwStdNotLike(String value) {
            addCriterion("qhw_std not like", value, "qhwStd");
            return (Criteria) this;
        }

        public Criteria andQhwStdIn(List<String> values) {
            addCriterion("qhw_std in", values, "qhwStd");
            return (Criteria) this;
        }

        public Criteria andQhwStdNotIn(List<String> values) {
            addCriterion("qhw_std not in", values, "qhwStd");
            return (Criteria) this;
        }

        public Criteria andQhwStdBetween(String value1, String value2) {
            addCriterion("qhw_std between", value1, value2, "qhwStd");
            return (Criteria) this;
        }

        public Criteria andQhwStdNotBetween(String value1, String value2) {
            addCriterion("qhw_std not between", value1, value2, "qhwStd");
            return (Criteria) this;
        }

        public Criteria andYlzxdjStdIsNull() {
            addCriterion("ylzxdj_std is null");
            return (Criteria) this;
        }

        public Criteria andYlzxdjStdIsNotNull() {
            addCriterion("ylzxdj_std is not null");
            return (Criteria) this;
        }

        public Criteria andYlzxdjStdEqualTo(String value) {
            addCriterion("ylzxdj_std =", value, "ylzxdjStd");
            return (Criteria) this;
        }

        public Criteria andYlzxdjStdNotEqualTo(String value) {
            addCriterion("ylzxdj_std <>", value, "ylzxdjStd");
            return (Criteria) this;
        }

        public Criteria andYlzxdjStdGreaterThan(String value) {
            addCriterion("ylzxdj_std >", value, "ylzxdjStd");
            return (Criteria) this;
        }

        public Criteria andYlzxdjStdGreaterThanOrEqualTo(String value) {
            addCriterion("ylzxdj_std >=", value, "ylzxdjStd");
            return (Criteria) this;
        }

        public Criteria andYlzxdjStdLessThan(String value) {
            addCriterion("ylzxdj_std <", value, "ylzxdjStd");
            return (Criteria) this;
        }

        public Criteria andYlzxdjStdLessThanOrEqualTo(String value) {
            addCriterion("ylzxdj_std <=", value, "ylzxdjStd");
            return (Criteria) this;
        }

        public Criteria andYlzxdjStdLike(String value) {
            addCriterion("ylzxdj_std like", value, "ylzxdjStd");
            return (Criteria) this;
        }

        public Criteria andYlzxdjStdNotLike(String value) {
            addCriterion("ylzxdj_std not like", value, "ylzxdjStd");
            return (Criteria) this;
        }

        public Criteria andYlzxdjStdIn(List<String> values) {
            addCriterion("ylzxdj_std in", values, "ylzxdjStd");
            return (Criteria) this;
        }

        public Criteria andYlzxdjStdNotIn(List<String> values) {
            addCriterion("ylzxdj_std not in", values, "ylzxdjStd");
            return (Criteria) this;
        }

        public Criteria andYlzxdjStdBetween(String value1, String value2) {
            addCriterion("ylzxdj_std between", value1, value2, "ylzxdjStd");
            return (Criteria) this;
        }

        public Criteria andYlzxdjStdNotBetween(String value1, String value2) {
            addCriterion("ylzxdj_std not between", value1, value2, "ylzxdjStd");
            return (Criteria) this;
        }

        public Criteria andLhwStdIsNull() {
            addCriterion("lhw_std is null");
            return (Criteria) this;
        }

        public Criteria andLhwStdIsNotNull() {
            addCriterion("lhw_std is not null");
            return (Criteria) this;
        }

        public Criteria andLhwStdEqualTo(String value) {
            addCriterion("lhw_std =", value, "lhwStd");
            return (Criteria) this;
        }

        public Criteria andLhwStdNotEqualTo(String value) {
            addCriterion("lhw_std <>", value, "lhwStd");
            return (Criteria) this;
        }

        public Criteria andLhwStdGreaterThan(String value) {
            addCriterion("lhw_std >", value, "lhwStd");
            return (Criteria) this;
        }

        public Criteria andLhwStdGreaterThanOrEqualTo(String value) {
            addCriterion("lhw_std >=", value, "lhwStd");
            return (Criteria) this;
        }

        public Criteria andLhwStdLessThan(String value) {
            addCriterion("lhw_std <", value, "lhwStd");
            return (Criteria) this;
        }

        public Criteria andLhwStdLessThanOrEqualTo(String value) {
            addCriterion("lhw_std <=", value, "lhwStd");
            return (Criteria) this;
        }

        public Criteria andLhwStdLike(String value) {
            addCriterion("lhw_std like", value, "lhwStd");
            return (Criteria) this;
        }

        public Criteria andLhwStdNotLike(String value) {
            addCriterion("lhw_std not like", value, "lhwStd");
            return (Criteria) this;
        }

        public Criteria andLhwStdIn(List<String> values) {
            addCriterion("lhw_std in", values, "lhwStd");
            return (Criteria) this;
        }

        public Criteria andLhwStdNotIn(List<String> values) {
            addCriterion("lhw_std not in", values, "lhwStd");
            return (Criteria) this;
        }

        public Criteria andLhwStdBetween(String value1, String value2) {
            addCriterion("lhw_std between", value1, value2, "lhwStd");
            return (Criteria) this;
        }

        public Criteria andLhwStdNotBetween(String value1, String value2) {
            addCriterion("lhw_std not between", value1, value2, "lhwStd");
            return (Criteria) this;
        }

        public Criteria andFdcjqStdIsNull() {
            addCriterion("fdcjq_std is null");
            return (Criteria) this;
        }

        public Criteria andFdcjqStdIsNotNull() {
            addCriterion("fdcjq_std is not null");
            return (Criteria) this;
        }

        public Criteria andFdcjqStdEqualTo(String value) {
            addCriterion("fdcjq_std =", value, "fdcjqStd");
            return (Criteria) this;
        }

        public Criteria andFdcjqStdNotEqualTo(String value) {
            addCriterion("fdcjq_std <>", value, "fdcjqStd");
            return (Criteria) this;
        }

        public Criteria andFdcjqStdGreaterThan(String value) {
            addCriterion("fdcjq_std >", value, "fdcjqStd");
            return (Criteria) this;
        }

        public Criteria andFdcjqStdGreaterThanOrEqualTo(String value) {
            addCriterion("fdcjq_std >=", value, "fdcjqStd");
            return (Criteria) this;
        }

        public Criteria andFdcjqStdLessThan(String value) {
            addCriterion("fdcjq_std <", value, "fdcjqStd");
            return (Criteria) this;
        }

        public Criteria andFdcjqStdLessThanOrEqualTo(String value) {
            addCriterion("fdcjq_std <=", value, "fdcjqStd");
            return (Criteria) this;
        }

        public Criteria andFdcjqStdLike(String value) {
            addCriterion("fdcjq_std like", value, "fdcjqStd");
            return (Criteria) this;
        }

        public Criteria andFdcjqStdNotLike(String value) {
            addCriterion("fdcjq_std not like", value, "fdcjqStd");
            return (Criteria) this;
        }

        public Criteria andFdcjqStdIn(List<String> values) {
            addCriterion("fdcjq_std in", values, "fdcjqStd");
            return (Criteria) this;
        }

        public Criteria andFdcjqStdNotIn(List<String> values) {
            addCriterion("fdcjq_std not in", values, "fdcjqStd");
            return (Criteria) this;
        }

        public Criteria andFdcjqStdBetween(String value1, String value2) {
            addCriterion("fdcjq_std between", value1, value2, "fdcjqStd");
            return (Criteria) this;
        }

        public Criteria andFdcjqStdNotBetween(String value1, String value2) {
            addCriterion("fdcjq_std not between", value1, value2, "fdcjqStd");
            return (Criteria) this;
        }

        public Criteria andCbyzjbsIsNull() {
            addCriterion("cbyzjbs is null");
            return (Criteria) this;
        }

        public Criteria andCbyzjbsIsNotNull() {
            addCriterion("cbyzjbs is not null");
            return (Criteria) this;
        }

        public Criteria andCbyzjbsEqualTo(Double value) {
            addCriterion("cbyzjbs =", value, "cbyzjbs");
            return (Criteria) this;
        }

        public Criteria andCbyzjbsNotEqualTo(Double value) {
            addCriterion("cbyzjbs <>", value, "cbyzjbs");
            return (Criteria) this;
        }

        public Criteria andCbyzjbsGreaterThan(Double value) {
            addCriterion("cbyzjbs >", value, "cbyzjbs");
            return (Criteria) this;
        }

        public Criteria andCbyzjbsGreaterThanOrEqualTo(Double value) {
            addCriterion("cbyzjbs >=", value, "cbyzjbs");
            return (Criteria) this;
        }

        public Criteria andCbyzjbsLessThan(Double value) {
            addCriterion("cbyzjbs <", value, "cbyzjbs");
            return (Criteria) this;
        }

        public Criteria andCbyzjbsLessThanOrEqualTo(Double value) {
            addCriterion("cbyzjbs <=", value, "cbyzjbs");
            return (Criteria) this;
        }

        public Criteria andCbyzjbsIn(List<Double> values) {
            addCriterion("cbyzjbs in", values, "cbyzjbs");
            return (Criteria) this;
        }

        public Criteria andCbyzjbsNotIn(List<Double> values) {
            addCriterion("cbyzjbs not in", values, "cbyzjbs");
            return (Criteria) this;
        }

        public Criteria andCbyzjbsBetween(Double value1, Double value2) {
            addCriterion("cbyzjbs between", value1, value2, "cbyzjbs");
            return (Criteria) this;
        }

        public Criteria andCbyzjbsNotBetween(Double value1, Double value2) {
            addCriterion("cbyzjbs not between", value1, value2, "cbyzjbs");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andDmszBl1IsNull() {
            addCriterion("dmsz_bl1 is null");
            return (Criteria) this;
        }

        public Criteria andDmszBl1IsNotNull() {
            addCriterion("dmsz_bl1 is not null");
            return (Criteria) this;
        }

        public Criteria andDmszBl1EqualTo(String value) {
            addCriterion("dmsz_bl1 =", value, "dmszBl1");
            return (Criteria) this;
        }

        public Criteria andDmszBl1NotEqualTo(String value) {
            addCriterion("dmsz_bl1 <>", value, "dmszBl1");
            return (Criteria) this;
        }

        public Criteria andDmszBl1GreaterThan(String value) {
            addCriterion("dmsz_bl1 >", value, "dmszBl1");
            return (Criteria) this;
        }

        public Criteria andDmszBl1GreaterThanOrEqualTo(String value) {
            addCriterion("dmsz_bl1 >=", value, "dmszBl1");
            return (Criteria) this;
        }

        public Criteria andDmszBl1LessThan(String value) {
            addCriterion("dmsz_bl1 <", value, "dmszBl1");
            return (Criteria) this;
        }

        public Criteria andDmszBl1LessThanOrEqualTo(String value) {
            addCriterion("dmsz_bl1 <=", value, "dmszBl1");
            return (Criteria) this;
        }

        public Criteria andDmszBl1Like(String value) {
            addCriterion("dmsz_bl1 like", value, "dmszBl1");
            return (Criteria) this;
        }

        public Criteria andDmszBl1NotLike(String value) {
            addCriterion("dmsz_bl1 not like", value, "dmszBl1");
            return (Criteria) this;
        }

        public Criteria andDmszBl1In(List<String> values) {
            addCriterion("dmsz_bl1 in", values, "dmszBl1");
            return (Criteria) this;
        }

        public Criteria andDmszBl1NotIn(List<String> values) {
            addCriterion("dmsz_bl1 not in", values, "dmszBl1");
            return (Criteria) this;
        }

        public Criteria andDmszBl1Between(String value1, String value2) {
            addCriterion("dmsz_bl1 between", value1, value2, "dmszBl1");
            return (Criteria) this;
        }

        public Criteria andDmszBl1NotBetween(String value1, String value2) {
            addCriterion("dmsz_bl1 not between", value1, value2, "dmszBl1");
            return (Criteria) this;
        }

        public Criteria andDmszBl2IsNull() {
            addCriterion("dmsz_bl2 is null");
            return (Criteria) this;
        }

        public Criteria andDmszBl2IsNotNull() {
            addCriterion("dmsz_bl2 is not null");
            return (Criteria) this;
        }

        public Criteria andDmszBl2EqualTo(String value) {
            addCriterion("dmsz_bl2 =", value, "dmszBl2");
            return (Criteria) this;
        }

        public Criteria andDmszBl2NotEqualTo(String value) {
            addCriterion("dmsz_bl2 <>", value, "dmszBl2");
            return (Criteria) this;
        }

        public Criteria andDmszBl2GreaterThan(String value) {
            addCriterion("dmsz_bl2 >", value, "dmszBl2");
            return (Criteria) this;
        }

        public Criteria andDmszBl2GreaterThanOrEqualTo(String value) {
            addCriterion("dmsz_bl2 >=", value, "dmszBl2");
            return (Criteria) this;
        }

        public Criteria andDmszBl2LessThan(String value) {
            addCriterion("dmsz_bl2 <", value, "dmszBl2");
            return (Criteria) this;
        }

        public Criteria andDmszBl2LessThanOrEqualTo(String value) {
            addCriterion("dmsz_bl2 <=", value, "dmszBl2");
            return (Criteria) this;
        }

        public Criteria andDmszBl2Like(String value) {
            addCriterion("dmsz_bl2 like", value, "dmszBl2");
            return (Criteria) this;
        }

        public Criteria andDmszBl2NotLike(String value) {
            addCriterion("dmsz_bl2 not like", value, "dmszBl2");
            return (Criteria) this;
        }

        public Criteria andDmszBl2In(List<String> values) {
            addCriterion("dmsz_bl2 in", values, "dmszBl2");
            return (Criteria) this;
        }

        public Criteria andDmszBl2NotIn(List<String> values) {
            addCriterion("dmsz_bl2 not in", values, "dmszBl2");
            return (Criteria) this;
        }

        public Criteria andDmszBl2Between(String value1, String value2) {
            addCriterion("dmsz_bl2 between", value1, value2, "dmszBl2");
            return (Criteria) this;
        }

        public Criteria andDmszBl2NotBetween(String value1, String value2) {
            addCriterion("dmsz_bl2 not between", value1, value2, "dmszBl2");
            return (Criteria) this;
        }

        public Criteria andDmszBl3IsNull() {
            addCriterion("dmsz_bl3 is null");
            return (Criteria) this;
        }

        public Criteria andDmszBl3IsNotNull() {
            addCriterion("dmsz_bl3 is not null");
            return (Criteria) this;
        }

        public Criteria andDmszBl3EqualTo(String value) {
            addCriterion("dmsz_bl3 =", value, "dmszBl3");
            return (Criteria) this;
        }

        public Criteria andDmszBl3NotEqualTo(String value) {
            addCriterion("dmsz_bl3 <>", value, "dmszBl3");
            return (Criteria) this;
        }

        public Criteria andDmszBl3GreaterThan(String value) {
            addCriterion("dmsz_bl3 >", value, "dmszBl3");
            return (Criteria) this;
        }

        public Criteria andDmszBl3GreaterThanOrEqualTo(String value) {
            addCriterion("dmsz_bl3 >=", value, "dmszBl3");
            return (Criteria) this;
        }

        public Criteria andDmszBl3LessThan(String value) {
            addCriterion("dmsz_bl3 <", value, "dmszBl3");
            return (Criteria) this;
        }

        public Criteria andDmszBl3LessThanOrEqualTo(String value) {
            addCriterion("dmsz_bl3 <=", value, "dmszBl3");
            return (Criteria) this;
        }

        public Criteria andDmszBl3Like(String value) {
            addCriterion("dmsz_bl3 like", value, "dmszBl3");
            return (Criteria) this;
        }

        public Criteria andDmszBl3NotLike(String value) {
            addCriterion("dmsz_bl3 not like", value, "dmszBl3");
            return (Criteria) this;
        }

        public Criteria andDmszBl3In(List<String> values) {
            addCriterion("dmsz_bl3 in", values, "dmszBl3");
            return (Criteria) this;
        }

        public Criteria andDmszBl3NotIn(List<String> values) {
            addCriterion("dmsz_bl3 not in", values, "dmszBl3");
            return (Criteria) this;
        }

        public Criteria andDmszBl3Between(String value1, String value2) {
            addCriterion("dmsz_bl3 between", value1, value2, "dmszBl3");
            return (Criteria) this;
        }

        public Criteria andDmszBl3NotBetween(String value1, String value2) {
            addCriterion("dmsz_bl3 not between", value1, value2, "dmszBl3");
            return (Criteria) this;
        }

        public Criteria andDmszBl4IsNull() {
            addCriterion("dmsz_bl4 is null");
            return (Criteria) this;
        }

        public Criteria andDmszBl4IsNotNull() {
            addCriterion("dmsz_bl4 is not null");
            return (Criteria) this;
        }

        public Criteria andDmszBl4EqualTo(String value) {
            addCriterion("dmsz_bl4 =", value, "dmszBl4");
            return (Criteria) this;
        }

        public Criteria andDmszBl4NotEqualTo(String value) {
            addCriterion("dmsz_bl4 <>", value, "dmszBl4");
            return (Criteria) this;
        }

        public Criteria andDmszBl4GreaterThan(String value) {
            addCriterion("dmsz_bl4 >", value, "dmszBl4");
            return (Criteria) this;
        }

        public Criteria andDmszBl4GreaterThanOrEqualTo(String value) {
            addCriterion("dmsz_bl4 >=", value, "dmszBl4");
            return (Criteria) this;
        }

        public Criteria andDmszBl4LessThan(String value) {
            addCriterion("dmsz_bl4 <", value, "dmszBl4");
            return (Criteria) this;
        }

        public Criteria andDmszBl4LessThanOrEqualTo(String value) {
            addCriterion("dmsz_bl4 <=", value, "dmszBl4");
            return (Criteria) this;
        }

        public Criteria andDmszBl4Like(String value) {
            addCriterion("dmsz_bl4 like", value, "dmszBl4");
            return (Criteria) this;
        }

        public Criteria andDmszBl4NotLike(String value) {
            addCriterion("dmsz_bl4 not like", value, "dmszBl4");
            return (Criteria) this;
        }

        public Criteria andDmszBl4In(List<String> values) {
            addCriterion("dmsz_bl4 in", values, "dmszBl4");
            return (Criteria) this;
        }

        public Criteria andDmszBl4NotIn(List<String> values) {
            addCriterion("dmsz_bl4 not in", values, "dmszBl4");
            return (Criteria) this;
        }

        public Criteria andDmszBl4Between(String value1, String value2) {
            addCriterion("dmsz_bl4 between", value1, value2, "dmszBl4");
            return (Criteria) this;
        }

        public Criteria andDmszBl4NotBetween(String value1, String value2) {
            addCriterion("dmsz_bl4 not between", value1, value2, "dmszBl4");
            return (Criteria) this;
        }

        public Criteria andDmszBl5IsNull() {
            addCriterion("dmsz_bl5 is null");
            return (Criteria) this;
        }

        public Criteria andDmszBl5IsNotNull() {
            addCriterion("dmsz_bl5 is not null");
            return (Criteria) this;
        }

        public Criteria andDmszBl5EqualTo(String value) {
            addCriterion("dmsz_bl5 =", value, "dmszBl5");
            return (Criteria) this;
        }

        public Criteria andDmszBl5NotEqualTo(String value) {
            addCriterion("dmsz_bl5 <>", value, "dmszBl5");
            return (Criteria) this;
        }

        public Criteria andDmszBl5GreaterThan(String value) {
            addCriterion("dmsz_bl5 >", value, "dmszBl5");
            return (Criteria) this;
        }

        public Criteria andDmszBl5GreaterThanOrEqualTo(String value) {
            addCriterion("dmsz_bl5 >=", value, "dmszBl5");
            return (Criteria) this;
        }

        public Criteria andDmszBl5LessThan(String value) {
            addCriterion("dmsz_bl5 <", value, "dmszBl5");
            return (Criteria) this;
        }

        public Criteria andDmszBl5LessThanOrEqualTo(String value) {
            addCriterion("dmsz_bl5 <=", value, "dmszBl5");
            return (Criteria) this;
        }

        public Criteria andDmszBl5Like(String value) {
            addCriterion("dmsz_bl5 like", value, "dmszBl5");
            return (Criteria) this;
        }

        public Criteria andDmszBl5NotLike(String value) {
            addCriterion("dmsz_bl5 not like", value, "dmszBl5");
            return (Criteria) this;
        }

        public Criteria andDmszBl5In(List<String> values) {
            addCriterion("dmsz_bl5 in", values, "dmszBl5");
            return (Criteria) this;
        }

        public Criteria andDmszBl5NotIn(List<String> values) {
            addCriterion("dmsz_bl5 not in", values, "dmszBl5");
            return (Criteria) this;
        }

        public Criteria andDmszBl5Between(String value1, String value2) {
            addCriterion("dmsz_bl5 between", value1, value2, "dmszBl5");
            return (Criteria) this;
        }

        public Criteria andDmszBl5NotBetween(String value1, String value2) {
            addCriterion("dmsz_bl5 not between", value1, value2, "dmszBl5");
            return (Criteria) this;
        }

        public Criteria andDmszBl6IsNull() {
            addCriterion("dmsz_bl6 is null");
            return (Criteria) this;
        }

        public Criteria andDmszBl6IsNotNull() {
            addCriterion("dmsz_bl6 is not null");
            return (Criteria) this;
        }

        public Criteria andDmszBl6EqualTo(String value) {
            addCriterion("dmsz_bl6 =", value, "dmszBl6");
            return (Criteria) this;
        }

        public Criteria andDmszBl6NotEqualTo(String value) {
            addCriterion("dmsz_bl6 <>", value, "dmszBl6");
            return (Criteria) this;
        }

        public Criteria andDmszBl6GreaterThan(String value) {
            addCriterion("dmsz_bl6 >", value, "dmszBl6");
            return (Criteria) this;
        }

        public Criteria andDmszBl6GreaterThanOrEqualTo(String value) {
            addCriterion("dmsz_bl6 >=", value, "dmszBl6");
            return (Criteria) this;
        }

        public Criteria andDmszBl6LessThan(String value) {
            addCriterion("dmsz_bl6 <", value, "dmszBl6");
            return (Criteria) this;
        }

        public Criteria andDmszBl6LessThanOrEqualTo(String value) {
            addCriterion("dmsz_bl6 <=", value, "dmszBl6");
            return (Criteria) this;
        }

        public Criteria andDmszBl6Like(String value) {
            addCriterion("dmsz_bl6 like", value, "dmszBl6");
            return (Criteria) this;
        }

        public Criteria andDmszBl6NotLike(String value) {
            addCriterion("dmsz_bl6 not like", value, "dmszBl6");
            return (Criteria) this;
        }

        public Criteria andDmszBl6In(List<String> values) {
            addCriterion("dmsz_bl6 in", values, "dmszBl6");
            return (Criteria) this;
        }

        public Criteria andDmszBl6NotIn(List<String> values) {
            addCriterion("dmsz_bl6 not in", values, "dmszBl6");
            return (Criteria) this;
        }

        public Criteria andDmszBl6Between(String value1, String value2) {
            addCriterion("dmsz_bl6 between", value1, value2, "dmszBl6");
            return (Criteria) this;
        }

        public Criteria andDmszBl6NotBetween(String value1, String value2) {
            addCriterion("dmsz_bl6 not between", value1, value2, "dmszBl6");
            return (Criteria) this;
        }

        public Criteria andDmszBl7IsNull() {
            addCriterion("dmsz_bl7 is null");
            return (Criteria) this;
        }

        public Criteria andDmszBl7IsNotNull() {
            addCriterion("dmsz_bl7 is not null");
            return (Criteria) this;
        }

        public Criteria andDmszBl7EqualTo(String value) {
            addCriterion("dmsz_bl7 =", value, "dmszBl7");
            return (Criteria) this;
        }

        public Criteria andDmszBl7NotEqualTo(String value) {
            addCriterion("dmsz_bl7 <>", value, "dmszBl7");
            return (Criteria) this;
        }

        public Criteria andDmszBl7GreaterThan(String value) {
            addCriterion("dmsz_bl7 >", value, "dmszBl7");
            return (Criteria) this;
        }

        public Criteria andDmszBl7GreaterThanOrEqualTo(String value) {
            addCriterion("dmsz_bl7 >=", value, "dmszBl7");
            return (Criteria) this;
        }

        public Criteria andDmszBl7LessThan(String value) {
            addCriterion("dmsz_bl7 <", value, "dmszBl7");
            return (Criteria) this;
        }

        public Criteria andDmszBl7LessThanOrEqualTo(String value) {
            addCriterion("dmsz_bl7 <=", value, "dmszBl7");
            return (Criteria) this;
        }

        public Criteria andDmszBl7Like(String value) {
            addCriterion("dmsz_bl7 like", value, "dmszBl7");
            return (Criteria) this;
        }

        public Criteria andDmszBl7NotLike(String value) {
            addCriterion("dmsz_bl7 not like", value, "dmszBl7");
            return (Criteria) this;
        }

        public Criteria andDmszBl7In(List<String> values) {
            addCriterion("dmsz_bl7 in", values, "dmszBl7");
            return (Criteria) this;
        }

        public Criteria andDmszBl7NotIn(List<String> values) {
            addCriterion("dmsz_bl7 not in", values, "dmszBl7");
            return (Criteria) this;
        }

        public Criteria andDmszBl7Between(String value1, String value2) {
            addCriterion("dmsz_bl7 between", value1, value2, "dmszBl7");
            return (Criteria) this;
        }

        public Criteria andDmszBl7NotBetween(String value1, String value2) {
            addCriterion("dmsz_bl7 not between", value1, value2, "dmszBl7");
            return (Criteria) this;
        }

        public Criteria andDmszBl8IsNull() {
            addCriterion("dmsz_bl8 is null");
            return (Criteria) this;
        }

        public Criteria andDmszBl8IsNotNull() {
            addCriterion("dmsz_bl8 is not null");
            return (Criteria) this;
        }

        public Criteria andDmszBl8EqualTo(String value) {
            addCriterion("dmsz_bl8 =", value, "dmszBl8");
            return (Criteria) this;
        }

        public Criteria andDmszBl8NotEqualTo(String value) {
            addCriterion("dmsz_bl8 <>", value, "dmszBl8");
            return (Criteria) this;
        }

        public Criteria andDmszBl8GreaterThan(String value) {
            addCriterion("dmsz_bl8 >", value, "dmszBl8");
            return (Criteria) this;
        }

        public Criteria andDmszBl8GreaterThanOrEqualTo(String value) {
            addCriterion("dmsz_bl8 >=", value, "dmszBl8");
            return (Criteria) this;
        }

        public Criteria andDmszBl8LessThan(String value) {
            addCriterion("dmsz_bl8 <", value, "dmszBl8");
            return (Criteria) this;
        }

        public Criteria andDmszBl8LessThanOrEqualTo(String value) {
            addCriterion("dmsz_bl8 <=", value, "dmszBl8");
            return (Criteria) this;
        }

        public Criteria andDmszBl8Like(String value) {
            addCriterion("dmsz_bl8 like", value, "dmszBl8");
            return (Criteria) this;
        }

        public Criteria andDmszBl8NotLike(String value) {
            addCriterion("dmsz_bl8 not like", value, "dmszBl8");
            return (Criteria) this;
        }

        public Criteria andDmszBl8In(List<String> values) {
            addCriterion("dmsz_bl8 in", values, "dmszBl8");
            return (Criteria) this;
        }

        public Criteria andDmszBl8NotIn(List<String> values) {
            addCriterion("dmsz_bl8 not in", values, "dmszBl8");
            return (Criteria) this;
        }

        public Criteria andDmszBl8Between(String value1, String value2) {
            addCriterion("dmsz_bl8 between", value1, value2, "dmszBl8");
            return (Criteria) this;
        }

        public Criteria andDmszBl8NotBetween(String value1, String value2) {
            addCriterion("dmsz_bl8 not between", value1, value2, "dmszBl8");
            return (Criteria) this;
        }

        public Criteria andDmszBl9IsNull() {
            addCriterion("dmsz_bl9 is null");
            return (Criteria) this;
        }

        public Criteria andDmszBl9IsNotNull() {
            addCriterion("dmsz_bl9 is not null");
            return (Criteria) this;
        }

        public Criteria andDmszBl9EqualTo(String value) {
            addCriterion("dmsz_bl9 =", value, "dmszBl9");
            return (Criteria) this;
        }

        public Criteria andDmszBl9NotEqualTo(String value) {
            addCriterion("dmsz_bl9 <>", value, "dmszBl9");
            return (Criteria) this;
        }

        public Criteria andDmszBl9GreaterThan(String value) {
            addCriterion("dmsz_bl9 >", value, "dmszBl9");
            return (Criteria) this;
        }

        public Criteria andDmszBl9GreaterThanOrEqualTo(String value) {
            addCriterion("dmsz_bl9 >=", value, "dmszBl9");
            return (Criteria) this;
        }

        public Criteria andDmszBl9LessThan(String value) {
            addCriterion("dmsz_bl9 <", value, "dmszBl9");
            return (Criteria) this;
        }

        public Criteria andDmszBl9LessThanOrEqualTo(String value) {
            addCriterion("dmsz_bl9 <=", value, "dmszBl9");
            return (Criteria) this;
        }

        public Criteria andDmszBl9Like(String value) {
            addCriterion("dmsz_bl9 like", value, "dmszBl9");
            return (Criteria) this;
        }

        public Criteria andDmszBl9NotLike(String value) {
            addCriterion("dmsz_bl9 not like", value, "dmszBl9");
            return (Criteria) this;
        }

        public Criteria andDmszBl9In(List<String> values) {
            addCriterion("dmsz_bl9 in", values, "dmszBl9");
            return (Criteria) this;
        }

        public Criteria andDmszBl9NotIn(List<String> values) {
            addCriterion("dmsz_bl9 not in", values, "dmszBl9");
            return (Criteria) this;
        }

        public Criteria andDmszBl9Between(String value1, String value2) {
            addCriterion("dmsz_bl9 between", value1, value2, "dmszBl9");
            return (Criteria) this;
        }

        public Criteria andDmszBl9NotBetween(String value1, String value2) {
            addCriterion("dmsz_bl9 not between", value1, value2, "dmszBl9");
            return (Criteria) this;
        }

        public Criteria andDmszBl10IsNull() {
            addCriterion("dmsz_bl10 is null");
            return (Criteria) this;
        }

        public Criteria andDmszBl10IsNotNull() {
            addCriterion("dmsz_bl10 is not null");
            return (Criteria) this;
        }

        public Criteria andDmszBl10EqualTo(String value) {
            addCriterion("dmsz_bl10 =", value, "dmszBl10");
            return (Criteria) this;
        }

        public Criteria andDmszBl10NotEqualTo(String value) {
            addCriterion("dmsz_bl10 <>", value, "dmszBl10");
            return (Criteria) this;
        }

        public Criteria andDmszBl10GreaterThan(String value) {
            addCriterion("dmsz_bl10 >", value, "dmszBl10");
            return (Criteria) this;
        }

        public Criteria andDmszBl10GreaterThanOrEqualTo(String value) {
            addCriterion("dmsz_bl10 >=", value, "dmszBl10");
            return (Criteria) this;
        }

        public Criteria andDmszBl10LessThan(String value) {
            addCriterion("dmsz_bl10 <", value, "dmszBl10");
            return (Criteria) this;
        }

        public Criteria andDmszBl10LessThanOrEqualTo(String value) {
            addCriterion("dmsz_bl10 <=", value, "dmszBl10");
            return (Criteria) this;
        }

        public Criteria andDmszBl10Like(String value) {
            addCriterion("dmsz_bl10 like", value, "dmszBl10");
            return (Criteria) this;
        }

        public Criteria andDmszBl10NotLike(String value) {
            addCriterion("dmsz_bl10 not like", value, "dmszBl10");
            return (Criteria) this;
        }

        public Criteria andDmszBl10In(List<String> values) {
            addCriterion("dmsz_bl10 in", values, "dmszBl10");
            return (Criteria) this;
        }

        public Criteria andDmszBl10NotIn(List<String> values) {
            addCriterion("dmsz_bl10 not in", values, "dmszBl10");
            return (Criteria) this;
        }

        public Criteria andDmszBl10Between(String value1, String value2) {
            addCriterion("dmsz_bl10 between", value1, value2, "dmszBl10");
            return (Criteria) this;
        }

        public Criteria andDmszBl10NotBetween(String value1, String value2) {
            addCriterion("dmsz_bl10 not between", value1, value2, "dmszBl10");
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