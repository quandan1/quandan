package com.eliteams.quick4j.web.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class QmpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QmpExample() {
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

        public Criteria andSectionDybhIsNull() {
            addCriterion("section_dybh is null");
            return (Criteria) this;
        }

        public Criteria andSectionDybhIsNotNull() {
            addCriterion("section_dybh is not null");
            return (Criteria) this;
        }

        public Criteria andSectionDybhEqualTo(String value) {
            addCriterion("section_dybh =", value, "sectionDybh");
            return (Criteria) this;
        }

        public Criteria andSectionDybhNotEqualTo(String value) {
            addCriterion("section_dybh <>", value, "sectionDybh");
            return (Criteria) this;
        }

        public Criteria andSectionDybhGreaterThan(String value) {
            addCriterion("section_dybh >", value, "sectionDybh");
            return (Criteria) this;
        }

        public Criteria andSectionDybhGreaterThanOrEqualTo(String value) {
            addCriterion("section_dybh >=", value, "sectionDybh");
            return (Criteria) this;
        }

        public Criteria andSectionDybhLessThan(String value) {
            addCriterion("section_dybh <", value, "sectionDybh");
            return (Criteria) this;
        }

        public Criteria andSectionDybhLessThanOrEqualTo(String value) {
            addCriterion("section_dybh <=", value, "sectionDybh");
            return (Criteria) this;
        }

        public Criteria andSectionDybhLike(String value) {
            addCriterion("section_dybh like", value, "sectionDybh");
            return (Criteria) this;
        }

        public Criteria andSectionDybhNotLike(String value) {
            addCriterion("section_dybh not like", value, "sectionDybh");
            return (Criteria) this;
        }

        public Criteria andSectionDybhIn(List<String> values) {
            addCriterion("section_dybh in", values, "sectionDybh");
            return (Criteria) this;
        }

        public Criteria andSectionDybhNotIn(List<String> values) {
            addCriterion("section_dybh not in", values, "sectionDybh");
            return (Criteria) this;
        }

        public Criteria andSectionDybhBetween(String value1, String value2) {
            addCriterion("section_dybh between", value1, value2, "sectionDybh");
            return (Criteria) this;
        }

        public Criteria andSectionDybhNotBetween(String value1, String value2) {
            addCriterion("section_dybh not between", value1, value2, "sectionDybh");
            return (Criteria) this;
        }

        public Criteria andSectionDymcIsNull() {
            addCriterion("section_dymc is null");
            return (Criteria) this;
        }

        public Criteria andSectionDymcIsNotNull() {
            addCriterion("section_dymc is not null");
            return (Criteria) this;
        }

        public Criteria andSectionDymcEqualTo(String value) {
            addCriterion("section_dymc =", value, "sectionDymc");
            return (Criteria) this;
        }

        public Criteria andSectionDymcNotEqualTo(String value) {
            addCriterion("section_dymc <>", value, "sectionDymc");
            return (Criteria) this;
        }

        public Criteria andSectionDymcGreaterThan(String value) {
            addCriterion("section_dymc >", value, "sectionDymc");
            return (Criteria) this;
        }

        public Criteria andSectionDymcGreaterThanOrEqualTo(String value) {
            addCriterion("section_dymc >=", value, "sectionDymc");
            return (Criteria) this;
        }

        public Criteria andSectionDymcLessThan(String value) {
            addCriterion("section_dymc <", value, "sectionDymc");
            return (Criteria) this;
        }

        public Criteria andSectionDymcLessThanOrEqualTo(String value) {
            addCriterion("section_dymc <=", value, "sectionDymc");
            return (Criteria) this;
        }

        public Criteria andSectionDymcLike(String value) {
            addCriterion("section_dymc like", value, "sectionDymc");
            return (Criteria) this;
        }

        public Criteria andSectionDymcNotLike(String value) {
            addCriterion("section_dymc not like", value, "sectionDymc");
            return (Criteria) this;
        }

        public Criteria andSectionDymcIn(List<String> values) {
            addCriterion("section_dymc in", values, "sectionDymc");
            return (Criteria) this;
        }

        public Criteria andSectionDymcNotIn(List<String> values) {
            addCriterion("section_dymc not in", values, "sectionDymc");
            return (Criteria) this;
        }

        public Criteria andSectionDymcBetween(String value1, String value2) {
            addCriterion("section_dymc between", value1, value2, "sectionDymc");
            return (Criteria) this;
        }

        public Criteria andSectionDymcNotBetween(String value1, String value2) {
            addCriterion("section_dymc not between", value1, value2, "sectionDymc");
            return (Criteria) this;
        }

        public Criteria andWatershedIsNull() {
            addCriterion("watershed is null");
            return (Criteria) this;
        }

        public Criteria andWatershedIsNotNull() {
            addCriterion("watershed is not null");
            return (Criteria) this;
        }

        public Criteria andWatershedEqualTo(String value) {
            addCriterion("watershed =", value, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedNotEqualTo(String value) {
            addCriterion("watershed <>", value, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedGreaterThan(String value) {
            addCriterion("watershed >", value, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedGreaterThanOrEqualTo(String value) {
            addCriterion("watershed >=", value, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedLessThan(String value) {
            addCriterion("watershed <", value, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedLessThanOrEqualTo(String value) {
            addCriterion("watershed <=", value, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedLike(String value) {
            addCriterion("watershed like", value, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedNotLike(String value) {
            addCriterion("watershed not like", value, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedIn(List<String> values) {
            addCriterion("watershed in", values, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedNotIn(List<String> values) {
            addCriterion("watershed not in", values, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedBetween(String value1, String value2) {
            addCriterion("watershed between", value1, value2, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedNotBetween(String value1, String value2) {
            addCriterion("watershed not between", value1, value2, "watershed");
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

        public Criteria andRiverLevelIsNull() {
            addCriterion("river_level is null");
            return (Criteria) this;
        }

        public Criteria andRiverLevelIsNotNull() {
            addCriterion("river_level is not null");
            return (Criteria) this;
        }

        public Criteria andRiverLevelEqualTo(String value) {
            addCriterion("river_level =", value, "riverLevel");
            return (Criteria) this;
        }

        public Criteria andRiverLevelNotEqualTo(String value) {
            addCriterion("river_level <>", value, "riverLevel");
            return (Criteria) this;
        }

        public Criteria andRiverLevelGreaterThan(String value) {
            addCriterion("river_level >", value, "riverLevel");
            return (Criteria) this;
        }

        public Criteria andRiverLevelGreaterThanOrEqualTo(String value) {
            addCriterion("river_level >=", value, "riverLevel");
            return (Criteria) this;
        }

        public Criteria andRiverLevelLessThan(String value) {
            addCriterion("river_level <", value, "riverLevel");
            return (Criteria) this;
        }

        public Criteria andRiverLevelLessThanOrEqualTo(String value) {
            addCriterion("river_level <=", value, "riverLevel");
            return (Criteria) this;
        }

        public Criteria andRiverLevelLike(String value) {
            addCriterion("river_level like", value, "riverLevel");
            return (Criteria) this;
        }

        public Criteria andRiverLevelNotLike(String value) {
            addCriterion("river_level not like", value, "riverLevel");
            return (Criteria) this;
        }

        public Criteria andRiverLevelIn(List<String> values) {
            addCriterion("river_level in", values, "riverLevel");
            return (Criteria) this;
        }

        public Criteria andRiverLevelNotIn(List<String> values) {
            addCriterion("river_level not in", values, "riverLevel");
            return (Criteria) this;
        }

        public Criteria andRiverLevelBetween(String value1, String value2) {
            addCriterion("river_level between", value1, value2, "riverLevel");
            return (Criteria) this;
        }

        public Criteria andRiverLevelNotBetween(String value1, String value2) {
            addCriterion("river_level not between", value1, value2, "riverLevel");
            return (Criteria) this;
        }

        public Criteria andRiverToIsNull() {
            addCriterion("river_to is null");
            return (Criteria) this;
        }

        public Criteria andRiverToIsNotNull() {
            addCriterion("river_to is not null");
            return (Criteria) this;
        }

        public Criteria andRiverToEqualTo(String value) {
            addCriterion("river_to =", value, "riverTo");
            return (Criteria) this;
        }

        public Criteria andRiverToNotEqualTo(String value) {
            addCriterion("river_to <>", value, "riverTo");
            return (Criteria) this;
        }

        public Criteria andRiverToGreaterThan(String value) {
            addCriterion("river_to >", value, "riverTo");
            return (Criteria) this;
        }

        public Criteria andRiverToGreaterThanOrEqualTo(String value) {
            addCriterion("river_to >=", value, "riverTo");
            return (Criteria) this;
        }

        public Criteria andRiverToLessThan(String value) {
            addCriterion("river_to <", value, "riverTo");
            return (Criteria) this;
        }

        public Criteria andRiverToLessThanOrEqualTo(String value) {
            addCriterion("river_to <=", value, "riverTo");
            return (Criteria) this;
        }

        public Criteria andRiverToLike(String value) {
            addCriterion("river_to like", value, "riverTo");
            return (Criteria) this;
        }

        public Criteria andRiverToNotLike(String value) {
            addCriterion("river_to not like", value, "riverTo");
            return (Criteria) this;
        }

        public Criteria andRiverToIn(List<String> values) {
            addCriterion("river_to in", values, "riverTo");
            return (Criteria) this;
        }

        public Criteria andRiverToNotIn(List<String> values) {
            addCriterion("river_to not in", values, "riverTo");
            return (Criteria) this;
        }

        public Criteria andRiverToBetween(String value1, String value2) {
            addCriterion("river_to between", value1, value2, "riverTo");
            return (Criteria) this;
        }

        public Criteria andRiverToNotBetween(String value1, String value2) {
            addCriterion("river_to not between", value1, value2, "riverTo");
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

        public Criteria andSectionPropertyIsNull() {
            addCriterion("section_property is null");
            return (Criteria) this;
        }

        public Criteria andSectionPropertyIsNotNull() {
            addCriterion("section_property is not null");
            return (Criteria) this;
        }

        public Criteria andSectionPropertyEqualTo(String value) {
            addCriterion("section_property =", value, "sectionProperty");
            return (Criteria) this;
        }

        public Criteria andSectionPropertyNotEqualTo(String value) {
            addCriterion("section_property <>", value, "sectionProperty");
            return (Criteria) this;
        }

        public Criteria andSectionPropertyGreaterThan(String value) {
            addCriterion("section_property >", value, "sectionProperty");
            return (Criteria) this;
        }

        public Criteria andSectionPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("section_property >=", value, "sectionProperty");
            return (Criteria) this;
        }

        public Criteria andSectionPropertyLessThan(String value) {
            addCriterion("section_property <", value, "sectionProperty");
            return (Criteria) this;
        }

        public Criteria andSectionPropertyLessThanOrEqualTo(String value) {
            addCriterion("section_property <=", value, "sectionProperty");
            return (Criteria) this;
        }

        public Criteria andSectionPropertyLike(String value) {
            addCriterion("section_property like", value, "sectionProperty");
            return (Criteria) this;
        }

        public Criteria andSectionPropertyNotLike(String value) {
            addCriterion("section_property not like", value, "sectionProperty");
            return (Criteria) this;
        }

        public Criteria andSectionPropertyIn(List<String> values) {
            addCriterion("section_property in", values, "sectionProperty");
            return (Criteria) this;
        }

        public Criteria andSectionPropertyNotIn(List<String> values) {
            addCriterion("section_property not in", values, "sectionProperty");
            return (Criteria) this;
        }

        public Criteria andSectionPropertyBetween(String value1, String value2) {
            addCriterion("section_property between", value1, value2, "sectionProperty");
            return (Criteria) this;
        }

        public Criteria andSectionPropertyNotBetween(String value1, String value2) {
            addCriterion("section_property not between", value1, value2, "sectionProperty");
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

        public Criteria andLocCityIsNull() {
            addCriterion("loc_city is null");
            return (Criteria) this;
        }

        public Criteria andLocCityIsNotNull() {
            addCriterion("loc_city is not null");
            return (Criteria) this;
        }

        public Criteria andLocCityEqualTo(String value) {
            addCriterion("loc_city =", value, "locCity");
            return (Criteria) this;
        }

        public Criteria andLocCityNotEqualTo(String value) {
            addCriterion("loc_city <>", value, "locCity");
            return (Criteria) this;
        }

        public Criteria andLocCityGreaterThan(String value) {
            addCriterion("loc_city >", value, "locCity");
            return (Criteria) this;
        }

        public Criteria andLocCityGreaterThanOrEqualTo(String value) {
            addCriterion("loc_city >=", value, "locCity");
            return (Criteria) this;
        }

        public Criteria andLocCityLessThan(String value) {
            addCriterion("loc_city <", value, "locCity");
            return (Criteria) this;
        }

        public Criteria andLocCityLessThanOrEqualTo(String value) {
            addCriterion("loc_city <=", value, "locCity");
            return (Criteria) this;
        }

        public Criteria andLocCityLike(String value) {
            addCriterion("loc_city like", value, "locCity");
            return (Criteria) this;
        }

        public Criteria andLocCityNotLike(String value) {
            addCriterion("loc_city not like", value, "locCity");
            return (Criteria) this;
        }

        public Criteria andLocCityIn(List<String> values) {
            addCriterion("loc_city in", values, "locCity");
            return (Criteria) this;
        }

        public Criteria andLocCityNotIn(List<String> values) {
            addCriterion("loc_city not in", values, "locCity");
            return (Criteria) this;
        }

        public Criteria andLocCityBetween(String value1, String value2) {
            addCriterion("loc_city between", value1, value2, "locCity");
            return (Criteria) this;
        }

        public Criteria andLocCityNotBetween(String value1, String value2) {
            addCriterion("loc_city not between", value1, value2, "locCity");
            return (Criteria) this;
        }

        public Criteria andLocCountyIsNull() {
            addCriterion("loc_county is null");
            return (Criteria) this;
        }

        public Criteria andLocCountyIsNotNull() {
            addCriterion("loc_county is not null");
            return (Criteria) this;
        }

        public Criteria andLocCountyEqualTo(String value) {
            addCriterion("loc_county =", value, "locCounty");
            return (Criteria) this;
        }

        public Criteria andLocCountyNotEqualTo(String value) {
            addCriterion("loc_county <>", value, "locCounty");
            return (Criteria) this;
        }

        public Criteria andLocCountyGreaterThan(String value) {
            addCriterion("loc_county >", value, "locCounty");
            return (Criteria) this;
        }

        public Criteria andLocCountyGreaterThanOrEqualTo(String value) {
            addCriterion("loc_county >=", value, "locCounty");
            return (Criteria) this;
        }

        public Criteria andLocCountyLessThan(String value) {
            addCriterion("loc_county <", value, "locCounty");
            return (Criteria) this;
        }

        public Criteria andLocCountyLessThanOrEqualTo(String value) {
            addCriterion("loc_county <=", value, "locCounty");
            return (Criteria) this;
        }

        public Criteria andLocCountyLike(String value) {
            addCriterion("loc_county like", value, "locCounty");
            return (Criteria) this;
        }

        public Criteria andLocCountyNotLike(String value) {
            addCriterion("loc_county not like", value, "locCounty");
            return (Criteria) this;
        }

        public Criteria andLocCountyIn(List<String> values) {
            addCriterion("loc_county in", values, "locCounty");
            return (Criteria) this;
        }

        public Criteria andLocCountyNotIn(List<String> values) {
            addCriterion("loc_county not in", values, "locCounty");
            return (Criteria) this;
        }

        public Criteria andLocCountyBetween(String value1, String value2) {
            addCriterion("loc_county between", value1, value2, "locCounty");
            return (Criteria) this;
        }

        public Criteria andLocCountyNotBetween(String value1, String value2) {
            addCriterion("loc_county not between", value1, value2, "locCounty");
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

        public Criteria andSectionTypeIsNull() {
            addCriterion("section_type is null");
            return (Criteria) this;
        }

        public Criteria andSectionTypeIsNotNull() {
            addCriterion("section_type is not null");
            return (Criteria) this;
        }

        public Criteria andSectionTypeEqualTo(String value) {
            addCriterion("section_type =", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeNotEqualTo(String value) {
            addCriterion("section_type <>", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeGreaterThan(String value) {
            addCriterion("section_type >", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("section_type >=", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeLessThan(String value) {
            addCriterion("section_type <", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeLessThanOrEqualTo(String value) {
            addCriterion("section_type <=", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeLike(String value) {
            addCriterion("section_type like", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeNotLike(String value) {
            addCriterion("section_type not like", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeIn(List<String> values) {
            addCriterion("section_type in", values, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeNotIn(List<String> values) {
            addCriterion("section_type not in", values, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeBetween(String value1, String value2) {
            addCriterion("section_type between", value1, value2, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeNotBetween(String value1, String value2) {
            addCriterion("section_type not between", value1, value2, "sectionType");
            return (Criteria) this;
        }

        public Criteria andIsUrbanIsNull() {
            addCriterion("is_urban is null");
            return (Criteria) this;
        }

        public Criteria andIsUrbanIsNotNull() {
            addCriterion("is_urban is not null");
            return (Criteria) this;
        }

        public Criteria andIsUrbanEqualTo(String value) {
            addCriterion("is_urban =", value, "isUrban");
            return (Criteria) this;
        }

        public Criteria andIsUrbanNotEqualTo(String value) {
            addCriterion("is_urban <>", value, "isUrban");
            return (Criteria) this;
        }

        public Criteria andIsUrbanGreaterThan(String value) {
            addCriterion("is_urban >", value, "isUrban");
            return (Criteria) this;
        }

        public Criteria andIsUrbanGreaterThanOrEqualTo(String value) {
            addCriterion("is_urban >=", value, "isUrban");
            return (Criteria) this;
        }

        public Criteria andIsUrbanLessThan(String value) {
            addCriterion("is_urban <", value, "isUrban");
            return (Criteria) this;
        }

        public Criteria andIsUrbanLessThanOrEqualTo(String value) {
            addCriterion("is_urban <=", value, "isUrban");
            return (Criteria) this;
        }

        public Criteria andIsUrbanLike(String value) {
            addCriterion("is_urban like", value, "isUrban");
            return (Criteria) this;
        }

        public Criteria andIsUrbanNotLike(String value) {
            addCriterion("is_urban not like", value, "isUrban");
            return (Criteria) this;
        }

        public Criteria andIsUrbanIn(List<String> values) {
            addCriterion("is_urban in", values, "isUrban");
            return (Criteria) this;
        }

        public Criteria andIsUrbanNotIn(List<String> values) {
            addCriterion("is_urban not in", values, "isUrban");
            return (Criteria) this;
        }

        public Criteria andIsUrbanBetween(String value1, String value2) {
            addCriterion("is_urban between", value1, value2, "isUrban");
            return (Criteria) this;
        }

        public Criteria andIsUrbanNotBetween(String value1, String value2) {
            addCriterion("is_urban not between", value1, value2, "isUrban");
            return (Criteria) this;
        }

        public Criteria andIsAdditionIsNull() {
            addCriterion("is_addition is null");
            return (Criteria) this;
        }

        public Criteria andIsAdditionIsNotNull() {
            addCriterion("is_addition is not null");
            return (Criteria) this;
        }

        public Criteria andIsAdditionEqualTo(String value) {
            addCriterion("is_addition =", value, "isAddition");
            return (Criteria) this;
        }

        public Criteria andIsAdditionNotEqualTo(String value) {
            addCriterion("is_addition <>", value, "isAddition");
            return (Criteria) this;
        }

        public Criteria andIsAdditionGreaterThan(String value) {
            addCriterion("is_addition >", value, "isAddition");
            return (Criteria) this;
        }

        public Criteria andIsAdditionGreaterThanOrEqualTo(String value) {
            addCriterion("is_addition >=", value, "isAddition");
            return (Criteria) this;
        }

        public Criteria andIsAdditionLessThan(String value) {
            addCriterion("is_addition <", value, "isAddition");
            return (Criteria) this;
        }

        public Criteria andIsAdditionLessThanOrEqualTo(String value) {
            addCriterion("is_addition <=", value, "isAddition");
            return (Criteria) this;
        }

        public Criteria andIsAdditionLike(String value) {
            addCriterion("is_addition like", value, "isAddition");
            return (Criteria) this;
        }

        public Criteria andIsAdditionNotLike(String value) {
            addCriterion("is_addition not like", value, "isAddition");
            return (Criteria) this;
        }

        public Criteria andIsAdditionIn(List<String> values) {
            addCriterion("is_addition in", values, "isAddition");
            return (Criteria) this;
        }

        public Criteria andIsAdditionNotIn(List<String> values) {
            addCriterion("is_addition not in", values, "isAddition");
            return (Criteria) this;
        }

        public Criteria andIsAdditionBetween(String value1, String value2) {
            addCriterion("is_addition between", value1, value2, "isAddition");
            return (Criteria) this;
        }

        public Criteria andIsAdditionNotBetween(String value1, String value2) {
            addCriterion("is_addition not between", value1, value2, "isAddition");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyIsNull() {
            addCriterion("test_frequency is null");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyIsNotNull() {
            addCriterion("test_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyEqualTo(String value) {
            addCriterion("test_frequency =", value, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyNotEqualTo(String value) {
            addCriterion("test_frequency <>", value, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyGreaterThan(String value) {
            addCriterion("test_frequency >", value, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("test_frequency >=", value, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyLessThan(String value) {
            addCriterion("test_frequency <", value, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyLessThanOrEqualTo(String value) {
            addCriterion("test_frequency <=", value, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyLike(String value) {
            addCriterion("test_frequency like", value, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyNotLike(String value) {
            addCriterion("test_frequency not like", value, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyIn(List<String> values) {
            addCriterion("test_frequency in", values, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyNotIn(List<String> values) {
            addCriterion("test_frequency not in", values, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyBetween(String value1, String value2) {
            addCriterion("test_frequency between", value1, value2, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyNotBetween(String value1, String value2) {
            addCriterion("test_frequency not between", value1, value2, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestItemsIsNull() {
            addCriterion("test_items is null");
            return (Criteria) this;
        }

        public Criteria andTestItemsIsNotNull() {
            addCriterion("test_items is not null");
            return (Criteria) this;
        }

        public Criteria andTestItemsEqualTo(String value) {
            addCriterion("test_items =", value, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsNotEqualTo(String value) {
            addCriterion("test_items <>", value, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsGreaterThan(String value) {
            addCriterion("test_items >", value, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsGreaterThanOrEqualTo(String value) {
            addCriterion("test_items >=", value, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsLessThan(String value) {
            addCriterion("test_items <", value, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsLessThanOrEqualTo(String value) {
            addCriterion("test_items <=", value, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsLike(String value) {
            addCriterion("test_items like", value, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsNotLike(String value) {
            addCriterion("test_items not like", value, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsIn(List<String> values) {
            addCriterion("test_items in", values, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsNotIn(List<String> values) {
            addCriterion("test_items not in", values, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsBetween(String value1, String value2) {
            addCriterion("test_items between", value1, value2, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsNotBetween(String value1, String value2) {
            addCriterion("test_items not between", value1, value2, "testItems");
            return (Criteria) this;
        }

        public Criteria andLocLonDIsNull() {
            addCriterion("loc_lon_d is null");
            return (Criteria) this;
        }

        public Criteria andLocLonDIsNotNull() {
            addCriterion("loc_lon_d is not null");
            return (Criteria) this;
        }

        public Criteria andLocLonDEqualTo(Integer value) {
            addCriterion("loc_lon_d =", value, "locLonD");
            return (Criteria) this;
        }

        public Criteria andLocLonDNotEqualTo(Integer value) {
            addCriterion("loc_lon_d <>", value, "locLonD");
            return (Criteria) this;
        }

        public Criteria andLocLonDGreaterThan(Integer value) {
            addCriterion("loc_lon_d >", value, "locLonD");
            return (Criteria) this;
        }

        public Criteria andLocLonDGreaterThanOrEqualTo(Integer value) {
            addCriterion("loc_lon_d >=", value, "locLonD");
            return (Criteria) this;
        }

        public Criteria andLocLonDLessThan(Integer value) {
            addCriterion("loc_lon_d <", value, "locLonD");
            return (Criteria) this;
        }

        public Criteria andLocLonDLessThanOrEqualTo(Integer value) {
            addCriterion("loc_lon_d <=", value, "locLonD");
            return (Criteria) this;
        }

        public Criteria andLocLonDIn(List<Integer> values) {
            addCriterion("loc_lon_d in", values, "locLonD");
            return (Criteria) this;
        }

        public Criteria andLocLonDNotIn(List<Integer> values) {
            addCriterion("loc_lon_d not in", values, "locLonD");
            return (Criteria) this;
        }

        public Criteria andLocLonDBetween(Integer value1, Integer value2) {
            addCriterion("loc_lon_d between", value1, value2, "locLonD");
            return (Criteria) this;
        }

        public Criteria andLocLonDNotBetween(Integer value1, Integer value2) {
            addCriterion("loc_lon_d not between", value1, value2, "locLonD");
            return (Criteria) this;
        }

        public Criteria andLocLonMIsNull() {
            addCriterion("loc_lon_m is null");
            return (Criteria) this;
        }

        public Criteria andLocLonMIsNotNull() {
            addCriterion("loc_lon_m is not null");
            return (Criteria) this;
        }

        public Criteria andLocLonMEqualTo(Integer value) {
            addCriterion("loc_lon_m =", value, "locLonM");
            return (Criteria) this;
        }

        public Criteria andLocLonMNotEqualTo(Integer value) {
            addCriterion("loc_lon_m <>", value, "locLonM");
            return (Criteria) this;
        }

        public Criteria andLocLonMGreaterThan(Integer value) {
            addCriterion("loc_lon_m >", value, "locLonM");
            return (Criteria) this;
        }

        public Criteria andLocLonMGreaterThanOrEqualTo(Integer value) {
            addCriterion("loc_lon_m >=", value, "locLonM");
            return (Criteria) this;
        }

        public Criteria andLocLonMLessThan(Integer value) {
            addCriterion("loc_lon_m <", value, "locLonM");
            return (Criteria) this;
        }

        public Criteria andLocLonMLessThanOrEqualTo(Integer value) {
            addCriterion("loc_lon_m <=", value, "locLonM");
            return (Criteria) this;
        }

        public Criteria andLocLonMIn(List<Integer> values) {
            addCriterion("loc_lon_m in", values, "locLonM");
            return (Criteria) this;
        }

        public Criteria andLocLonMNotIn(List<Integer> values) {
            addCriterion("loc_lon_m not in", values, "locLonM");
            return (Criteria) this;
        }

        public Criteria andLocLonMBetween(Integer value1, Integer value2) {
            addCriterion("loc_lon_m between", value1, value2, "locLonM");
            return (Criteria) this;
        }

        public Criteria andLocLonMNotBetween(Integer value1, Integer value2) {
            addCriterion("loc_lon_m not between", value1, value2, "locLonM");
            return (Criteria) this;
        }

        public Criteria andLocLonSIsNull() {
            addCriterion("loc_lon_s is null");
            return (Criteria) this;
        }

        public Criteria andLocLonSIsNotNull() {
            addCriterion("loc_lon_s is not null");
            return (Criteria) this;
        }

        public Criteria andLocLonSEqualTo(Integer value) {
            addCriterion("loc_lon_s =", value, "locLonS");
            return (Criteria) this;
        }

        public Criteria andLocLonSNotEqualTo(Integer value) {
            addCriterion("loc_lon_s <>", value, "locLonS");
            return (Criteria) this;
        }

        public Criteria andLocLonSGreaterThan(Integer value) {
            addCriterion("loc_lon_s >", value, "locLonS");
            return (Criteria) this;
        }

        public Criteria andLocLonSGreaterThanOrEqualTo(Integer value) {
            addCriterion("loc_lon_s >=", value, "locLonS");
            return (Criteria) this;
        }

        public Criteria andLocLonSLessThan(Integer value) {
            addCriterion("loc_lon_s <", value, "locLonS");
            return (Criteria) this;
        }

        public Criteria andLocLonSLessThanOrEqualTo(Integer value) {
            addCriterion("loc_lon_s <=", value, "locLonS");
            return (Criteria) this;
        }

        public Criteria andLocLonSIn(List<Integer> values) {
            addCriterion("loc_lon_s in", values, "locLonS");
            return (Criteria) this;
        }

        public Criteria andLocLonSNotIn(List<Integer> values) {
            addCriterion("loc_lon_s not in", values, "locLonS");
            return (Criteria) this;
        }

        public Criteria andLocLonSBetween(Integer value1, Integer value2) {
            addCriterion("loc_lon_s between", value1, value2, "locLonS");
            return (Criteria) this;
        }

        public Criteria andLocLonSNotBetween(Integer value1, Integer value2) {
            addCriterion("loc_lon_s not between", value1, value2, "locLonS");
            return (Criteria) this;
        }

        public Criteria andLocLatDIsNull() {
            addCriterion("loc_lat_d is null");
            return (Criteria) this;
        }

        public Criteria andLocLatDIsNotNull() {
            addCriterion("loc_lat_d is not null");
            return (Criteria) this;
        }

        public Criteria andLocLatDEqualTo(Integer value) {
            addCriterion("loc_lat_d =", value, "locLatD");
            return (Criteria) this;
        }

        public Criteria andLocLatDNotEqualTo(Integer value) {
            addCriterion("loc_lat_d <>", value, "locLatD");
            return (Criteria) this;
        }

        public Criteria andLocLatDGreaterThan(Integer value) {
            addCriterion("loc_lat_d >", value, "locLatD");
            return (Criteria) this;
        }

        public Criteria andLocLatDGreaterThanOrEqualTo(Integer value) {
            addCriterion("loc_lat_d >=", value, "locLatD");
            return (Criteria) this;
        }

        public Criteria andLocLatDLessThan(Integer value) {
            addCriterion("loc_lat_d <", value, "locLatD");
            return (Criteria) this;
        }

        public Criteria andLocLatDLessThanOrEqualTo(Integer value) {
            addCriterion("loc_lat_d <=", value, "locLatD");
            return (Criteria) this;
        }

        public Criteria andLocLatDIn(List<Integer> values) {
            addCriterion("loc_lat_d in", values, "locLatD");
            return (Criteria) this;
        }

        public Criteria andLocLatDNotIn(List<Integer> values) {
            addCriterion("loc_lat_d not in", values, "locLatD");
            return (Criteria) this;
        }

        public Criteria andLocLatDBetween(Integer value1, Integer value2) {
            addCriterion("loc_lat_d between", value1, value2, "locLatD");
            return (Criteria) this;
        }

        public Criteria andLocLatDNotBetween(Integer value1, Integer value2) {
            addCriterion("loc_lat_d not between", value1, value2, "locLatD");
            return (Criteria) this;
        }

        public Criteria andLocLatMIsNull() {
            addCriterion("loc_lat_m is null");
            return (Criteria) this;
        }

        public Criteria andLocLatMIsNotNull() {
            addCriterion("loc_lat_m is not null");
            return (Criteria) this;
        }

        public Criteria andLocLatMEqualTo(Integer value) {
            addCriterion("loc_lat_m =", value, "locLatM");
            return (Criteria) this;
        }

        public Criteria andLocLatMNotEqualTo(Integer value) {
            addCriterion("loc_lat_m <>", value, "locLatM");
            return (Criteria) this;
        }

        public Criteria andLocLatMGreaterThan(Integer value) {
            addCriterion("loc_lat_m >", value, "locLatM");
            return (Criteria) this;
        }

        public Criteria andLocLatMGreaterThanOrEqualTo(Integer value) {
            addCriterion("loc_lat_m >=", value, "locLatM");
            return (Criteria) this;
        }

        public Criteria andLocLatMLessThan(Integer value) {
            addCriterion("loc_lat_m <", value, "locLatM");
            return (Criteria) this;
        }

        public Criteria andLocLatMLessThanOrEqualTo(Integer value) {
            addCriterion("loc_lat_m <=", value, "locLatM");
            return (Criteria) this;
        }

        public Criteria andLocLatMIn(List<Integer> values) {
            addCriterion("loc_lat_m in", values, "locLatM");
            return (Criteria) this;
        }

        public Criteria andLocLatMNotIn(List<Integer> values) {
            addCriterion("loc_lat_m not in", values, "locLatM");
            return (Criteria) this;
        }

        public Criteria andLocLatMBetween(Integer value1, Integer value2) {
            addCriterion("loc_lat_m between", value1, value2, "locLatM");
            return (Criteria) this;
        }

        public Criteria andLocLatMNotBetween(Integer value1, Integer value2) {
            addCriterion("loc_lat_m not between", value1, value2, "locLatM");
            return (Criteria) this;
        }

        public Criteria andLocLatSIsNull() {
            addCriterion("loc_lat_s is null");
            return (Criteria) this;
        }

        public Criteria andLocLatSIsNotNull() {
            addCriterion("loc_lat_s is not null");
            return (Criteria) this;
        }

        public Criteria andLocLatSEqualTo(Integer value) {
            addCriterion("loc_lat_s =", value, "locLatS");
            return (Criteria) this;
        }

        public Criteria andLocLatSNotEqualTo(Integer value) {
            addCriterion("loc_lat_s <>", value, "locLatS");
            return (Criteria) this;
        }

        public Criteria andLocLatSGreaterThan(Integer value) {
            addCriterion("loc_lat_s >", value, "locLatS");
            return (Criteria) this;
        }

        public Criteria andLocLatSGreaterThanOrEqualTo(Integer value) {
            addCriterion("loc_lat_s >=", value, "locLatS");
            return (Criteria) this;
        }

        public Criteria andLocLatSLessThan(Integer value) {
            addCriterion("loc_lat_s <", value, "locLatS");
            return (Criteria) this;
        }

        public Criteria andLocLatSLessThanOrEqualTo(Integer value) {
            addCriterion("loc_lat_s <=", value, "locLatS");
            return (Criteria) this;
        }

        public Criteria andLocLatSIn(List<Integer> values) {
            addCriterion("loc_lat_s in", values, "locLatS");
            return (Criteria) this;
        }

        public Criteria andLocLatSNotIn(List<Integer> values) {
            addCriterion("loc_lat_s not in", values, "locLatS");
            return (Criteria) this;
        }

        public Criteria andLocLatSBetween(Integer value1, Integer value2) {
            addCriterion("loc_lat_s between", value1, value2, "locLatS");
            return (Criteria) this;
        }

        public Criteria andLocLatSNotBetween(Integer value1, Integer value2) {
            addCriterion("loc_lat_s not between", value1, value2, "locLatS");
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

        public Criteria andLocLonIsNull() {
            addCriterion("loc_lon is null");
            return (Criteria) this;
        }

        public Criteria andLocLonIsNotNull() {
            addCriterion("loc_lon is not null");
            return (Criteria) this;
        }

        public Criteria andLocLonEqualTo(BigDecimal value) {
            addCriterion("loc_lon =", value, "locLon");
            return (Criteria) this;
        }

        public Criteria andLocLonNotEqualTo(BigDecimal value) {
            addCriterion("loc_lon <>", value, "locLon");
            return (Criteria) this;
        }

        public Criteria andLocLonGreaterThan(BigDecimal value) {
            addCriterion("loc_lon >", value, "locLon");
            return (Criteria) this;
        }

        public Criteria andLocLonGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loc_lon >=", value, "locLon");
            return (Criteria) this;
        }

        public Criteria andLocLonLessThan(BigDecimal value) {
            addCriterion("loc_lon <", value, "locLon");
            return (Criteria) this;
        }

        public Criteria andLocLonLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loc_lon <=", value, "locLon");
            return (Criteria) this;
        }

        public Criteria andLocLonIn(List<BigDecimal> values) {
            addCriterion("loc_lon in", values, "locLon");
            return (Criteria) this;
        }

        public Criteria andLocLonNotIn(List<BigDecimal> values) {
            addCriterion("loc_lon not in", values, "locLon");
            return (Criteria) this;
        }

        public Criteria andLocLonBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loc_lon between", value1, value2, "locLon");
            return (Criteria) this;
        }

        public Criteria andLocLonNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loc_lon not between", value1, value2, "locLon");
            return (Criteria) this;
        }

        public Criteria andLocLatIsNull() {
            addCriterion("loc_lat is null");
            return (Criteria) this;
        }

        public Criteria andLocLatIsNotNull() {
            addCriterion("loc_lat is not null");
            return (Criteria) this;
        }

        public Criteria andLocLatEqualTo(BigDecimal value) {
            addCriterion("loc_lat =", value, "locLat");
            return (Criteria) this;
        }

        public Criteria andLocLatNotEqualTo(BigDecimal value) {
            addCriterion("loc_lat <>", value, "locLat");
            return (Criteria) this;
        }

        public Criteria andLocLatGreaterThan(BigDecimal value) {
            addCriterion("loc_lat >", value, "locLat");
            return (Criteria) this;
        }

        public Criteria andLocLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loc_lat >=", value, "locLat");
            return (Criteria) this;
        }

        public Criteria andLocLatLessThan(BigDecimal value) {
            addCriterion("loc_lat <", value, "locLat");
            return (Criteria) this;
        }

        public Criteria andLocLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loc_lat <=", value, "locLat");
            return (Criteria) this;
        }

        public Criteria andLocLatIn(List<BigDecimal> values) {
            addCriterion("loc_lat in", values, "locLat");
            return (Criteria) this;
        }

        public Criteria andLocLatNotIn(List<BigDecimal> values) {
            addCriterion("loc_lat not in", values, "locLat");
            return (Criteria) this;
        }

        public Criteria andLocLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loc_lat between", value1, value2, "locLat");
            return (Criteria) this;
        }

        public Criteria andLocLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loc_lat not between", value1, value2, "locLat");
            return (Criteria) this;
        }

        public Criteria andSectionShhlIsNull() {
            addCriterion("section_shhl is null");
            return (Criteria) this;
        }

        public Criteria andSectionShhlIsNotNull() {
            addCriterion("section_shhl is not null");
            return (Criteria) this;
        }

        public Criteria andSectionShhlEqualTo(String value) {
            addCriterion("section_shhl =", value, "sectionShhl");
            return (Criteria) this;
        }

        public Criteria andSectionShhlNotEqualTo(String value) {
            addCriterion("section_shhl <>", value, "sectionShhl");
            return (Criteria) this;
        }

        public Criteria andSectionShhlGreaterThan(String value) {
            addCriterion("section_shhl >", value, "sectionShhl");
            return (Criteria) this;
        }

        public Criteria andSectionShhlGreaterThanOrEqualTo(String value) {
            addCriterion("section_shhl >=", value, "sectionShhl");
            return (Criteria) this;
        }

        public Criteria andSectionShhlLessThan(String value) {
            addCriterion("section_shhl <", value, "sectionShhl");
            return (Criteria) this;
        }

        public Criteria andSectionShhlLessThanOrEqualTo(String value) {
            addCriterion("section_shhl <=", value, "sectionShhl");
            return (Criteria) this;
        }

        public Criteria andSectionShhlLike(String value) {
            addCriterion("section_shhl like", value, "sectionShhl");
            return (Criteria) this;
        }

        public Criteria andSectionShhlNotLike(String value) {
            addCriterion("section_shhl not like", value, "sectionShhl");
            return (Criteria) this;
        }

        public Criteria andSectionShhlIn(List<String> values) {
            addCriterion("section_shhl in", values, "sectionShhl");
            return (Criteria) this;
        }

        public Criteria andSectionShhlNotIn(List<String> values) {
            addCriterion("section_shhl not in", values, "sectionShhl");
            return (Criteria) this;
        }

        public Criteria andSectionShhlBetween(String value1, String value2) {
            addCriterion("section_shhl between", value1, value2, "sectionShhl");
            return (Criteria) this;
        }

        public Criteria andSectionShhlNotBetween(String value1, String value2) {
            addCriterion("section_shhl not between", value1, value2, "sectionShhl");
            return (Criteria) this;
        }

        public Criteria andTjnfIsNull() {
            addCriterion("tjnf is null");
            return (Criteria) this;
        }

        public Criteria andTjnfIsNotNull() {
            addCriterion("tjnf is not null");
            return (Criteria) this;
        }

        public Criteria andTjnfEqualTo(Integer value) {
            addCriterion("tjnf =", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfNotEqualTo(Integer value) {
            addCriterion("tjnf <>", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfGreaterThan(Integer value) {
            addCriterion("tjnf >", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfGreaterThanOrEqualTo(Integer value) {
            addCriterion("tjnf >=", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfLessThan(Integer value) {
            addCriterion("tjnf <", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfLessThanOrEqualTo(Integer value) {
            addCriterion("tjnf <=", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfIn(List<Integer> values) {
            addCriterion("tjnf in", values, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfNotIn(List<Integer> values) {
            addCriterion("tjnf not in", values, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfBetween(Integer value1, Integer value2) {
            addCriterion("tjnf between", value1, value2, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfNotBetween(Integer value1, Integer value2) {
            addCriterion("tjnf not between", value1, value2, "tjnf");
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

        public Criteria andIsDelEqualTo(String value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(String value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(String value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(String value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(String value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(String value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLike(String value) {
            addCriterion("is_del like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotLike(String value) {
            addCriterion("is_del not like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<String> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<String> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(String value1, String value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(String value1, String value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andSectionBl1IsNull() {
            addCriterion("section_bl1 is null");
            return (Criteria) this;
        }

        public Criteria andSectionBl1IsNotNull() {
            addCriterion("section_bl1 is not null");
            return (Criteria) this;
        }

        public Criteria andSectionBl1EqualTo(String value) {
            addCriterion("section_bl1 =", value, "sectionBl1");
            return (Criteria) this;
        }

        public Criteria andSectionBl1NotEqualTo(String value) {
            addCriterion("section_bl1 <>", value, "sectionBl1");
            return (Criteria) this;
        }

        public Criteria andSectionBl1GreaterThan(String value) {
            addCriterion("section_bl1 >", value, "sectionBl1");
            return (Criteria) this;
        }

        public Criteria andSectionBl1GreaterThanOrEqualTo(String value) {
            addCriterion("section_bl1 >=", value, "sectionBl1");
            return (Criteria) this;
        }

        public Criteria andSectionBl1LessThan(String value) {
            addCriterion("section_bl1 <", value, "sectionBl1");
            return (Criteria) this;
        }

        public Criteria andSectionBl1LessThanOrEqualTo(String value) {
            addCriterion("section_bl1 <=", value, "sectionBl1");
            return (Criteria) this;
        }

        public Criteria andSectionBl1Like(String value) {
            addCriterion("section_bl1 like", value, "sectionBl1");
            return (Criteria) this;
        }

        public Criteria andSectionBl1NotLike(String value) {
            addCriterion("section_bl1 not like", value, "sectionBl1");
            return (Criteria) this;
        }

        public Criteria andSectionBl1In(List<String> values) {
            addCriterion("section_bl1 in", values, "sectionBl1");
            return (Criteria) this;
        }

        public Criteria andSectionBl1NotIn(List<String> values) {
            addCriterion("section_bl1 not in", values, "sectionBl1");
            return (Criteria) this;
        }

        public Criteria andSectionBl1Between(String value1, String value2) {
            addCriterion("section_bl1 between", value1, value2, "sectionBl1");
            return (Criteria) this;
        }

        public Criteria andSectionBl1NotBetween(String value1, String value2) {
            addCriterion("section_bl1 not between", value1, value2, "sectionBl1");
            return (Criteria) this;
        }

        public Criteria andSectionBl2IsNull() {
            addCriterion("section_bl2 is null");
            return (Criteria) this;
        }

        public Criteria andSectionBl2IsNotNull() {
            addCriterion("section_bl2 is not null");
            return (Criteria) this;
        }

        public Criteria andSectionBl2EqualTo(String value) {
            addCriterion("section_bl2 =", value, "sectionBl2");
            return (Criteria) this;
        }

        public Criteria andSectionBl2NotEqualTo(String value) {
            addCriterion("section_bl2 <>", value, "sectionBl2");
            return (Criteria) this;
        }

        public Criteria andSectionBl2GreaterThan(String value) {
            addCriterion("section_bl2 >", value, "sectionBl2");
            return (Criteria) this;
        }

        public Criteria andSectionBl2GreaterThanOrEqualTo(String value) {
            addCriterion("section_bl2 >=", value, "sectionBl2");
            return (Criteria) this;
        }

        public Criteria andSectionBl2LessThan(String value) {
            addCriterion("section_bl2 <", value, "sectionBl2");
            return (Criteria) this;
        }

        public Criteria andSectionBl2LessThanOrEqualTo(String value) {
            addCriterion("section_bl2 <=", value, "sectionBl2");
            return (Criteria) this;
        }

        public Criteria andSectionBl2Like(String value) {
            addCriterion("section_bl2 like", value, "sectionBl2");
            return (Criteria) this;
        }

        public Criteria andSectionBl2NotLike(String value) {
            addCriterion("section_bl2 not like", value, "sectionBl2");
            return (Criteria) this;
        }

        public Criteria andSectionBl2In(List<String> values) {
            addCriterion("section_bl2 in", values, "sectionBl2");
            return (Criteria) this;
        }

        public Criteria andSectionBl2NotIn(List<String> values) {
            addCriterion("section_bl2 not in", values, "sectionBl2");
            return (Criteria) this;
        }

        public Criteria andSectionBl2Between(String value1, String value2) {
            addCriterion("section_bl2 between", value1, value2, "sectionBl2");
            return (Criteria) this;
        }

        public Criteria andSectionBl2NotBetween(String value1, String value2) {
            addCriterion("section_bl2 not between", value1, value2, "sectionBl2");
            return (Criteria) this;
        }

        public Criteria andSectionBl3IsNull() {
            addCriterion("section_bl3 is null");
            return (Criteria) this;
        }

        public Criteria andSectionBl3IsNotNull() {
            addCriterion("section_bl3 is not null");
            return (Criteria) this;
        }

        public Criteria andSectionBl3EqualTo(String value) {
            addCriterion("section_bl3 =", value, "sectionBl3");
            return (Criteria) this;
        }

        public Criteria andSectionBl3NotEqualTo(String value) {
            addCriterion("section_bl3 <>", value, "sectionBl3");
            return (Criteria) this;
        }

        public Criteria andSectionBl3GreaterThan(String value) {
            addCriterion("section_bl3 >", value, "sectionBl3");
            return (Criteria) this;
        }

        public Criteria andSectionBl3GreaterThanOrEqualTo(String value) {
            addCriterion("section_bl3 >=", value, "sectionBl3");
            return (Criteria) this;
        }

        public Criteria andSectionBl3LessThan(String value) {
            addCriterion("section_bl3 <", value, "sectionBl3");
            return (Criteria) this;
        }

        public Criteria andSectionBl3LessThanOrEqualTo(String value) {
            addCriterion("section_bl3 <=", value, "sectionBl3");
            return (Criteria) this;
        }

        public Criteria andSectionBl3Like(String value) {
            addCriterion("section_bl3 like", value, "sectionBl3");
            return (Criteria) this;
        }

        public Criteria andSectionBl3NotLike(String value) {
            addCriterion("section_bl3 not like", value, "sectionBl3");
            return (Criteria) this;
        }

        public Criteria andSectionBl3In(List<String> values) {
            addCriterion("section_bl3 in", values, "sectionBl3");
            return (Criteria) this;
        }

        public Criteria andSectionBl3NotIn(List<String> values) {
            addCriterion("section_bl3 not in", values, "sectionBl3");
            return (Criteria) this;
        }

        public Criteria andSectionBl3Between(String value1, String value2) {
            addCriterion("section_bl3 between", value1, value2, "sectionBl3");
            return (Criteria) this;
        }

        public Criteria andSectionBl3NotBetween(String value1, String value2) {
            addCriterion("section_bl3 not between", value1, value2, "sectionBl3");
            return (Criteria) this;
        }

        public Criteria andSectionBl4IsNull() {
            addCriterion("section_bl4 is null");
            return (Criteria) this;
        }

        public Criteria andSectionBl4IsNotNull() {
            addCriterion("section_bl4 is not null");
            return (Criteria) this;
        }

        public Criteria andSectionBl4EqualTo(String value) {
            addCriterion("section_bl4 =", value, "sectionBl4");
            return (Criteria) this;
        }

        public Criteria andSectionBl4NotEqualTo(String value) {
            addCriterion("section_bl4 <>", value, "sectionBl4");
            return (Criteria) this;
        }

        public Criteria andSectionBl4GreaterThan(String value) {
            addCriterion("section_bl4 >", value, "sectionBl4");
            return (Criteria) this;
        }

        public Criteria andSectionBl4GreaterThanOrEqualTo(String value) {
            addCriterion("section_bl4 >=", value, "sectionBl4");
            return (Criteria) this;
        }

        public Criteria andSectionBl4LessThan(String value) {
            addCriterion("section_bl4 <", value, "sectionBl4");
            return (Criteria) this;
        }

        public Criteria andSectionBl4LessThanOrEqualTo(String value) {
            addCriterion("section_bl4 <=", value, "sectionBl4");
            return (Criteria) this;
        }

        public Criteria andSectionBl4Like(String value) {
            addCriterion("section_bl4 like", value, "sectionBl4");
            return (Criteria) this;
        }

        public Criteria andSectionBl4NotLike(String value) {
            addCriterion("section_bl4 not like", value, "sectionBl4");
            return (Criteria) this;
        }

        public Criteria andSectionBl4In(List<String> values) {
            addCriterion("section_bl4 in", values, "sectionBl4");
            return (Criteria) this;
        }

        public Criteria andSectionBl4NotIn(List<String> values) {
            addCriterion("section_bl4 not in", values, "sectionBl4");
            return (Criteria) this;
        }

        public Criteria andSectionBl4Between(String value1, String value2) {
            addCriterion("section_bl4 between", value1, value2, "sectionBl4");
            return (Criteria) this;
        }

        public Criteria andSectionBl4NotBetween(String value1, String value2) {
            addCriterion("section_bl4 not between", value1, value2, "sectionBl4");
            return (Criteria) this;
        }

        public Criteria andSectionBl5IsNull() {
            addCriterion("section_bl5 is null");
            return (Criteria) this;
        }

        public Criteria andSectionBl5IsNotNull() {
            addCriterion("section_bl5 is not null");
            return (Criteria) this;
        }

        public Criteria andSectionBl5EqualTo(String value) {
            addCriterion("section_bl5 =", value, "sectionBl5");
            return (Criteria) this;
        }

        public Criteria andSectionBl5NotEqualTo(String value) {
            addCriterion("section_bl5 <>", value, "sectionBl5");
            return (Criteria) this;
        }

        public Criteria andSectionBl5GreaterThan(String value) {
            addCriterion("section_bl5 >", value, "sectionBl5");
            return (Criteria) this;
        }

        public Criteria andSectionBl5GreaterThanOrEqualTo(String value) {
            addCriterion("section_bl5 >=", value, "sectionBl5");
            return (Criteria) this;
        }

        public Criteria andSectionBl5LessThan(String value) {
            addCriterion("section_bl5 <", value, "sectionBl5");
            return (Criteria) this;
        }

        public Criteria andSectionBl5LessThanOrEqualTo(String value) {
            addCriterion("section_bl5 <=", value, "sectionBl5");
            return (Criteria) this;
        }

        public Criteria andSectionBl5Like(String value) {
            addCriterion("section_bl5 like", value, "sectionBl5");
            return (Criteria) this;
        }

        public Criteria andSectionBl5NotLike(String value) {
            addCriterion("section_bl5 not like", value, "sectionBl5");
            return (Criteria) this;
        }

        public Criteria andSectionBl5In(List<String> values) {
            addCriterion("section_bl5 in", values, "sectionBl5");
            return (Criteria) this;
        }

        public Criteria andSectionBl5NotIn(List<String> values) {
            addCriterion("section_bl5 not in", values, "sectionBl5");
            return (Criteria) this;
        }

        public Criteria andSectionBl5Between(String value1, String value2) {
            addCriterion("section_bl5 between", value1, value2, "sectionBl5");
            return (Criteria) this;
        }

        public Criteria andSectionBl5NotBetween(String value1, String value2) {
            addCriterion("section_bl5 not between", value1, value2, "sectionBl5");
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