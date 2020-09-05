package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class QmpTestDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QmpTestDataExample() {
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

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
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

        public Criteria andMonthEqualTo(String value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("month like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("month not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andSectionBmIsNull() {
            addCriterion("section_bm is null");
            return (Criteria) this;
        }

        public Criteria andSectionBmIsNotNull() {
            addCriterion("section_bm is not null");
            return (Criteria) this;
        }

        public Criteria andSectionBmEqualTo(String value) {
            addCriterion("section_bm =", value, "sectionBm");
            return (Criteria) this;
        }

        public Criteria andSectionBmNotEqualTo(String value) {
            addCriterion("section_bm <>", value, "sectionBm");
            return (Criteria) this;
        }

        public Criteria andSectionBmGreaterThan(String value) {
            addCriterion("section_bm >", value, "sectionBm");
            return (Criteria) this;
        }

        public Criteria andSectionBmGreaterThanOrEqualTo(String value) {
            addCriterion("section_bm >=", value, "sectionBm");
            return (Criteria) this;
        }

        public Criteria andSectionBmLessThan(String value) {
            addCriterion("section_bm <", value, "sectionBm");
            return (Criteria) this;
        }

        public Criteria andSectionBmLessThanOrEqualTo(String value) {
            addCriterion("section_bm <=", value, "sectionBm");
            return (Criteria) this;
        }

        public Criteria andSectionBmLike(String value) {
            addCriterion("section_bm like", value, "sectionBm");
            return (Criteria) this;
        }

        public Criteria andSectionBmNotLike(String value) {
            addCriterion("section_bm not like", value, "sectionBm");
            return (Criteria) this;
        }

        public Criteria andSectionBmIn(List<String> values) {
            addCriterion("section_bm in", values, "sectionBm");
            return (Criteria) this;
        }

        public Criteria andSectionBmNotIn(List<String> values) {
            addCriterion("section_bm not in", values, "sectionBm");
            return (Criteria) this;
        }

        public Criteria andSectionBmBetween(String value1, String value2) {
            addCriterion("section_bm between", value1, value2, "sectionBm");
            return (Criteria) this;
        }

        public Criteria andSectionBmNotBetween(String value1, String value2) {
            addCriterion("section_bm not between", value1, value2, "sectionBm");
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

        public Criteria andLocRiverIsNull() {
            addCriterion("loc_river is null");
            return (Criteria) this;
        }

        public Criteria andLocRiverIsNotNull() {
            addCriterion("loc_river is not null");
            return (Criteria) this;
        }

        public Criteria andLocRiverEqualTo(String value) {
            addCriterion("loc_river =", value, "locRiver");
            return (Criteria) this;
        }

        public Criteria andLocRiverNotEqualTo(String value) {
            addCriterion("loc_river <>", value, "locRiver");
            return (Criteria) this;
        }

        public Criteria andLocRiverGreaterThan(String value) {
            addCriterion("loc_river >", value, "locRiver");
            return (Criteria) this;
        }

        public Criteria andLocRiverGreaterThanOrEqualTo(String value) {
            addCriterion("loc_river >=", value, "locRiver");
            return (Criteria) this;
        }

        public Criteria andLocRiverLessThan(String value) {
            addCriterion("loc_river <", value, "locRiver");
            return (Criteria) this;
        }

        public Criteria andLocRiverLessThanOrEqualTo(String value) {
            addCriterion("loc_river <=", value, "locRiver");
            return (Criteria) this;
        }

        public Criteria andLocRiverLike(String value) {
            addCriterion("loc_river like", value, "locRiver");
            return (Criteria) this;
        }

        public Criteria andLocRiverNotLike(String value) {
            addCriterion("loc_river not like", value, "locRiver");
            return (Criteria) this;
        }

        public Criteria andLocRiverIn(List<String> values) {
            addCriterion("loc_river in", values, "locRiver");
            return (Criteria) this;
        }

        public Criteria andLocRiverNotIn(List<String> values) {
            addCriterion("loc_river not in", values, "locRiver");
            return (Criteria) this;
        }

        public Criteria andLocRiverBetween(String value1, String value2) {
            addCriterion("loc_river between", value1, value2, "locRiver");
            return (Criteria) this;
        }

        public Criteria andLocRiverNotBetween(String value1, String value2) {
            addCriterion("loc_river not between", value1, value2, "locRiver");
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

        public Criteria andDdlEqualTo(String value) {
            addCriterion("ddl =", value, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlNotEqualTo(String value) {
            addCriterion("ddl <>", value, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlGreaterThan(String value) {
            addCriterion("ddl >", value, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlGreaterThanOrEqualTo(String value) {
            addCriterion("ddl >=", value, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlLessThan(String value) {
            addCriterion("ddl <", value, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlLessThanOrEqualTo(String value) {
            addCriterion("ddl <=", value, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlLike(String value) {
            addCriterion("ddl like", value, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlNotLike(String value) {
            addCriterion("ddl not like", value, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlIn(List<String> values) {
            addCriterion("ddl in", values, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlNotIn(List<String> values) {
            addCriterion("ddl not in", values, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlBetween(String value1, String value2) {
            addCriterion("ddl between", value1, value2, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlNotBetween(String value1, String value2) {
            addCriterion("ddl not between", value1, value2, "ddl");
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

        public Criteria andWaterTemperatureEqualTo(String value) {
            addCriterion("water_temperature =", value, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureNotEqualTo(String value) {
            addCriterion("water_temperature <>", value, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureGreaterThan(String value) {
            addCriterion("water_temperature >", value, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("water_temperature >=", value, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureLessThan(String value) {
            addCriterion("water_temperature <", value, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureLessThanOrEqualTo(String value) {
            addCriterion("water_temperature <=", value, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureLike(String value) {
            addCriterion("water_temperature like", value, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureNotLike(String value) {
            addCriterion("water_temperature not like", value, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureIn(List<String> values) {
            addCriterion("water_temperature in", values, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureNotIn(List<String> values) {
            addCriterion("water_temperature not in", values, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureBetween(String value1, String value2) {
            addCriterion("water_temperature between", value1, value2, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureNotBetween(String value1, String value2) {
            addCriterion("water_temperature not between", value1, value2, "waterTemperature");
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

        public Criteria andPhEqualTo(String value) {
            addCriterion("ph =", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotEqualTo(String value) {
            addCriterion("ph <>", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThan(String value) {
            addCriterion("ph >", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThanOrEqualTo(String value) {
            addCriterion("ph >=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThan(String value) {
            addCriterion("ph <", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThanOrEqualTo(String value) {
            addCriterion("ph <=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLike(String value) {
            addCriterion("ph like", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotLike(String value) {
            addCriterion("ph not like", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhIn(List<String> values) {
            addCriterion("ph in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotIn(List<String> values) {
            addCriterion("ph not in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhBetween(String value1, String value2) {
            addCriterion("ph between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotBetween(String value1, String value2) {
            addCriterion("ph not between", value1, value2, "ph");
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

        public Criteria andRjyEqualTo(String value) {
            addCriterion("rjy =", value, "rjy");
            return (Criteria) this;
        }

        public Criteria andRjyNotEqualTo(String value) {
            addCriterion("rjy <>", value, "rjy");
            return (Criteria) this;
        }

        public Criteria andRjyGreaterThan(String value) {
            addCriterion("rjy >", value, "rjy");
            return (Criteria) this;
        }

        public Criteria andRjyGreaterThanOrEqualTo(String value) {
            addCriterion("rjy >=", value, "rjy");
            return (Criteria) this;
        }

        public Criteria andRjyLessThan(String value) {
            addCriterion("rjy <", value, "rjy");
            return (Criteria) this;
        }

        public Criteria andRjyLessThanOrEqualTo(String value) {
            addCriterion("rjy <=", value, "rjy");
            return (Criteria) this;
        }

        public Criteria andRjyLike(String value) {
            addCriterion("rjy like", value, "rjy");
            return (Criteria) this;
        }

        public Criteria andRjyNotLike(String value) {
            addCriterion("rjy not like", value, "rjy");
            return (Criteria) this;
        }

        public Criteria andRjyIn(List<String> values) {
            addCriterion("rjy in", values, "rjy");
            return (Criteria) this;
        }

        public Criteria andRjyNotIn(List<String> values) {
            addCriterion("rjy not in", values, "rjy");
            return (Criteria) this;
        }

        public Criteria andRjyBetween(String value1, String value2) {
            addCriterion("rjy between", value1, value2, "rjy");
            return (Criteria) this;
        }

        public Criteria andRjyNotBetween(String value1, String value2) {
            addCriterion("rjy not between", value1, value2, "rjy");
            return (Criteria) this;
        }

        public Criteria andTmdIsNull() {
            addCriterion("tmd is null");
            return (Criteria) this;
        }

        public Criteria andTmdIsNotNull() {
            addCriterion("tmd is not null");
            return (Criteria) this;
        }

        public Criteria andTmdEqualTo(String value) {
            addCriterion("tmd =", value, "tmd");
            return (Criteria) this;
        }

        public Criteria andTmdNotEqualTo(String value) {
            addCriterion("tmd <>", value, "tmd");
            return (Criteria) this;
        }

        public Criteria andTmdGreaterThan(String value) {
            addCriterion("tmd >", value, "tmd");
            return (Criteria) this;
        }

        public Criteria andTmdGreaterThanOrEqualTo(String value) {
            addCriterion("tmd >=", value, "tmd");
            return (Criteria) this;
        }

        public Criteria andTmdLessThan(String value) {
            addCriterion("tmd <", value, "tmd");
            return (Criteria) this;
        }

        public Criteria andTmdLessThanOrEqualTo(String value) {
            addCriterion("tmd <=", value, "tmd");
            return (Criteria) this;
        }

        public Criteria andTmdLike(String value) {
            addCriterion("tmd like", value, "tmd");
            return (Criteria) this;
        }

        public Criteria andTmdNotLike(String value) {
            addCriterion("tmd not like", value, "tmd");
            return (Criteria) this;
        }

        public Criteria andTmdIn(List<String> values) {
            addCriterion("tmd in", values, "tmd");
            return (Criteria) this;
        }

        public Criteria andTmdNotIn(List<String> values) {
            addCriterion("tmd not in", values, "tmd");
            return (Criteria) this;
        }

        public Criteria andTmdBetween(String value1, String value2) {
            addCriterion("tmd between", value1, value2, "tmd");
            return (Criteria) this;
        }

        public Criteria andTmdNotBetween(String value1, String value2) {
            addCriterion("tmd not between", value1, value2, "tmd");
            return (Criteria) this;
        }

        public Criteria andYdIsNull() {
            addCriterion("yd is null");
            return (Criteria) this;
        }

        public Criteria andYdIsNotNull() {
            addCriterion("yd is not null");
            return (Criteria) this;
        }

        public Criteria andYdEqualTo(String value) {
            addCriterion("yd =", value, "yd");
            return (Criteria) this;
        }

        public Criteria andYdNotEqualTo(String value) {
            addCriterion("yd <>", value, "yd");
            return (Criteria) this;
        }

        public Criteria andYdGreaterThan(String value) {
            addCriterion("yd >", value, "yd");
            return (Criteria) this;
        }

        public Criteria andYdGreaterThanOrEqualTo(String value) {
            addCriterion("yd >=", value, "yd");
            return (Criteria) this;
        }

        public Criteria andYdLessThan(String value) {
            addCriterion("yd <", value, "yd");
            return (Criteria) this;
        }

        public Criteria andYdLessThanOrEqualTo(String value) {
            addCriterion("yd <=", value, "yd");
            return (Criteria) this;
        }

        public Criteria andYdLike(String value) {
            addCriterion("yd like", value, "yd");
            return (Criteria) this;
        }

        public Criteria andYdNotLike(String value) {
            addCriterion("yd not like", value, "yd");
            return (Criteria) this;
        }

        public Criteria andYdIn(List<String> values) {
            addCriterion("yd in", values, "yd");
            return (Criteria) this;
        }

        public Criteria andYdNotIn(List<String> values) {
            addCriterion("yd not in", values, "yd");
            return (Criteria) this;
        }

        public Criteria andYdBetween(String value1, String value2) {
            addCriterion("yd between", value1, value2, "yd");
            return (Criteria) this;
        }

        public Criteria andYdNotBetween(String value1, String value2) {
            addCriterion("yd not between", value1, value2, "yd");
            return (Criteria) this;
        }

        public Criteria andCodMnIsNull() {
            addCriterion("cod_mn is null");
            return (Criteria) this;
        }

        public Criteria andCodMnIsNotNull() {
            addCriterion("cod_mn is not null");
            return (Criteria) this;
        }

        public Criteria andCodMnEqualTo(String value) {
            addCriterion("cod_mn =", value, "codMn");
            return (Criteria) this;
        }

        public Criteria andCodMnNotEqualTo(String value) {
            addCriterion("cod_mn <>", value, "codMn");
            return (Criteria) this;
        }

        public Criteria andCodMnGreaterThan(String value) {
            addCriterion("cod_mn >", value, "codMn");
            return (Criteria) this;
        }

        public Criteria andCodMnGreaterThanOrEqualTo(String value) {
            addCriterion("cod_mn >=", value, "codMn");
            return (Criteria) this;
        }

        public Criteria andCodMnLessThan(String value) {
            addCriterion("cod_mn <", value, "codMn");
            return (Criteria) this;
        }

        public Criteria andCodMnLessThanOrEqualTo(String value) {
            addCriterion("cod_mn <=", value, "codMn");
            return (Criteria) this;
        }

        public Criteria andCodMnLike(String value) {
            addCriterion("cod_mn like", value, "codMn");
            return (Criteria) this;
        }

        public Criteria andCodMnNotLike(String value) {
            addCriterion("cod_mn not like", value, "codMn");
            return (Criteria) this;
        }

        public Criteria andCodMnIn(List<String> values) {
            addCriterion("cod_mn in", values, "codMn");
            return (Criteria) this;
        }

        public Criteria andCodMnNotIn(List<String> values) {
            addCriterion("cod_mn not in", values, "codMn");
            return (Criteria) this;
        }

        public Criteria andCodMnBetween(String value1, String value2) {
            addCriterion("cod_mn between", value1, value2, "codMn");
            return (Criteria) this;
        }

        public Criteria andCodMnNotBetween(String value1, String value2) {
            addCriterion("cod_mn not between", value1, value2, "codMn");
            return (Criteria) this;
        }

        public Criteria andCodCrIsNull() {
            addCriterion("cod_cr is null");
            return (Criteria) this;
        }

        public Criteria andCodCrIsNotNull() {
            addCriterion("cod_cr is not null");
            return (Criteria) this;
        }

        public Criteria andCodCrEqualTo(String value) {
            addCriterion("cod_cr =", value, "codCr");
            return (Criteria) this;
        }

        public Criteria andCodCrNotEqualTo(String value) {
            addCriterion("cod_cr <>", value, "codCr");
            return (Criteria) this;
        }

        public Criteria andCodCrGreaterThan(String value) {
            addCriterion("cod_cr >", value, "codCr");
            return (Criteria) this;
        }

        public Criteria andCodCrGreaterThanOrEqualTo(String value) {
            addCriterion("cod_cr >=", value, "codCr");
            return (Criteria) this;
        }

        public Criteria andCodCrLessThan(String value) {
            addCriterion("cod_cr <", value, "codCr");
            return (Criteria) this;
        }

        public Criteria andCodCrLessThanOrEqualTo(String value) {
            addCriterion("cod_cr <=", value, "codCr");
            return (Criteria) this;
        }

        public Criteria andCodCrLike(String value) {
            addCriterion("cod_cr like", value, "codCr");
            return (Criteria) this;
        }

        public Criteria andCodCrNotLike(String value) {
            addCriterion("cod_cr not like", value, "codCr");
            return (Criteria) this;
        }

        public Criteria andCodCrIn(List<String> values) {
            addCriterion("cod_cr in", values, "codCr");
            return (Criteria) this;
        }

        public Criteria andCodCrNotIn(List<String> values) {
            addCriterion("cod_cr not in", values, "codCr");
            return (Criteria) this;
        }

        public Criteria andCodCrBetween(String value1, String value2) {
            addCriterion("cod_cr between", value1, value2, "codCr");
            return (Criteria) this;
        }

        public Criteria andCodCrNotBetween(String value1, String value2) {
            addCriterion("cod_cr not between", value1, value2, "codCr");
            return (Criteria) this;
        }

        public Criteria andNhNIsNull() {
            addCriterion("nh_n is null");
            return (Criteria) this;
        }

        public Criteria andNhNIsNotNull() {
            addCriterion("nh_n is not null");
            return (Criteria) this;
        }

        public Criteria andNhNEqualTo(String value) {
            addCriterion("nh_n =", value, "nhN");
            return (Criteria) this;
        }

        public Criteria andNhNNotEqualTo(String value) {
            addCriterion("nh_n <>", value, "nhN");
            return (Criteria) this;
        }

        public Criteria andNhNGreaterThan(String value) {
            addCriterion("nh_n >", value, "nhN");
            return (Criteria) this;
        }

        public Criteria andNhNGreaterThanOrEqualTo(String value) {
            addCriterion("nh_n >=", value, "nhN");
            return (Criteria) this;
        }

        public Criteria andNhNLessThan(String value) {
            addCriterion("nh_n <", value, "nhN");
            return (Criteria) this;
        }

        public Criteria andNhNLessThanOrEqualTo(String value) {
            addCriterion("nh_n <=", value, "nhN");
            return (Criteria) this;
        }

        public Criteria andNhNLike(String value) {
            addCriterion("nh_n like", value, "nhN");
            return (Criteria) this;
        }

        public Criteria andNhNNotLike(String value) {
            addCriterion("nh_n not like", value, "nhN");
            return (Criteria) this;
        }

        public Criteria andNhNIn(List<String> values) {
            addCriterion("nh_n in", values, "nhN");
            return (Criteria) this;
        }

        public Criteria andNhNNotIn(List<String> values) {
            addCriterion("nh_n not in", values, "nhN");
            return (Criteria) this;
        }

        public Criteria andNhNBetween(String value1, String value2) {
            addCriterion("nh_n between", value1, value2, "nhN");
            return (Criteria) this;
        }

        public Criteria andNhNNotBetween(String value1, String value2) {
            addCriterion("nh_n not between", value1, value2, "nhN");
            return (Criteria) this;
        }

        public Criteria andTPIsNull() {
            addCriterion("t_p is null");
            return (Criteria) this;
        }

        public Criteria andTPIsNotNull() {
            addCriterion("t_p is not null");
            return (Criteria) this;
        }

        public Criteria andTPEqualTo(String value) {
            addCriterion("t_p =", value, "tP");
            return (Criteria) this;
        }

        public Criteria andTPNotEqualTo(String value) {
            addCriterion("t_p <>", value, "tP");
            return (Criteria) this;
        }

        public Criteria andTPGreaterThan(String value) {
            addCriterion("t_p >", value, "tP");
            return (Criteria) this;
        }

        public Criteria andTPGreaterThanOrEqualTo(String value) {
            addCriterion("t_p >=", value, "tP");
            return (Criteria) this;
        }

        public Criteria andTPLessThan(String value) {
            addCriterion("t_p <", value, "tP");
            return (Criteria) this;
        }

        public Criteria andTPLessThanOrEqualTo(String value) {
            addCriterion("t_p <=", value, "tP");
            return (Criteria) this;
        }

        public Criteria andTPLike(String value) {
            addCriterion("t_p like", value, "tP");
            return (Criteria) this;
        }

        public Criteria andTPNotLike(String value) {
            addCriterion("t_p not like", value, "tP");
            return (Criteria) this;
        }

        public Criteria andTPIn(List<String> values) {
            addCriterion("t_p in", values, "tP");
            return (Criteria) this;
        }

        public Criteria andTPNotIn(List<String> values) {
            addCriterion("t_p not in", values, "tP");
            return (Criteria) this;
        }

        public Criteria andTPBetween(String value1, String value2) {
            addCriterion("t_p between", value1, value2, "tP");
            return (Criteria) this;
        }

        public Criteria andTPNotBetween(String value1, String value2) {
            addCriterion("t_p not between", value1, value2, "tP");
            return (Criteria) this;
        }

        public Criteria andTNIsNull() {
            addCriterion("t_n is null");
            return (Criteria) this;
        }

        public Criteria andTNIsNotNull() {
            addCriterion("t_n is not null");
            return (Criteria) this;
        }

        public Criteria andTNEqualTo(String value) {
            addCriterion("t_n =", value, "tN");
            return (Criteria) this;
        }

        public Criteria andTNNotEqualTo(String value) {
            addCriterion("t_n <>", value, "tN");
            return (Criteria) this;
        }

        public Criteria andTNGreaterThan(String value) {
            addCriterion("t_n >", value, "tN");
            return (Criteria) this;
        }

        public Criteria andTNGreaterThanOrEqualTo(String value) {
            addCriterion("t_n >=", value, "tN");
            return (Criteria) this;
        }

        public Criteria andTNLessThan(String value) {
            addCriterion("t_n <", value, "tN");
            return (Criteria) this;
        }

        public Criteria andTNLessThanOrEqualTo(String value) {
            addCriterion("t_n <=", value, "tN");
            return (Criteria) this;
        }

        public Criteria andTNLike(String value) {
            addCriterion("t_n like", value, "tN");
            return (Criteria) this;
        }

        public Criteria andTNNotLike(String value) {
            addCriterion("t_n not like", value, "tN");
            return (Criteria) this;
        }

        public Criteria andTNIn(List<String> values) {
            addCriterion("t_n in", values, "tN");
            return (Criteria) this;
        }

        public Criteria andTNNotIn(List<String> values) {
            addCriterion("t_n not in", values, "tN");
            return (Criteria) this;
        }

        public Criteria andTNBetween(String value1, String value2) {
            addCriterion("t_n between", value1, value2, "tN");
            return (Criteria) this;
        }

        public Criteria andTNNotBetween(String value1, String value2) {
            addCriterion("t_n not between", value1, value2, "tN");
            return (Criteria) this;
        }

        public Criteria andCuIsNull() {
            addCriterion("cu is null");
            return (Criteria) this;
        }

        public Criteria andCuIsNotNull() {
            addCriterion("cu is not null");
            return (Criteria) this;
        }

        public Criteria andCuEqualTo(String value) {
            addCriterion("cu =", value, "cu");
            return (Criteria) this;
        }

        public Criteria andCuNotEqualTo(String value) {
            addCriterion("cu <>", value, "cu");
            return (Criteria) this;
        }

        public Criteria andCuGreaterThan(String value) {
            addCriterion("cu >", value, "cu");
            return (Criteria) this;
        }

        public Criteria andCuGreaterThanOrEqualTo(String value) {
            addCriterion("cu >=", value, "cu");
            return (Criteria) this;
        }

        public Criteria andCuLessThan(String value) {
            addCriterion("cu <", value, "cu");
            return (Criteria) this;
        }

        public Criteria andCuLessThanOrEqualTo(String value) {
            addCriterion("cu <=", value, "cu");
            return (Criteria) this;
        }

        public Criteria andCuLike(String value) {
            addCriterion("cu like", value, "cu");
            return (Criteria) this;
        }

        public Criteria andCuNotLike(String value) {
            addCriterion("cu not like", value, "cu");
            return (Criteria) this;
        }

        public Criteria andCuIn(List<String> values) {
            addCriterion("cu in", values, "cu");
            return (Criteria) this;
        }

        public Criteria andCuNotIn(List<String> values) {
            addCriterion("cu not in", values, "cu");
            return (Criteria) this;
        }

        public Criteria andCuBetween(String value1, String value2) {
            addCriterion("cu between", value1, value2, "cu");
            return (Criteria) this;
        }

        public Criteria andCuNotBetween(String value1, String value2) {
            addCriterion("cu not between", value1, value2, "cu");
            return (Criteria) this;
        }

        public Criteria andZnIsNull() {
            addCriterion("zn is null");
            return (Criteria) this;
        }

        public Criteria andZnIsNotNull() {
            addCriterion("zn is not null");
            return (Criteria) this;
        }

        public Criteria andZnEqualTo(String value) {
            addCriterion("zn =", value, "zn");
            return (Criteria) this;
        }

        public Criteria andZnNotEqualTo(String value) {
            addCriterion("zn <>", value, "zn");
            return (Criteria) this;
        }

        public Criteria andZnGreaterThan(String value) {
            addCriterion("zn >", value, "zn");
            return (Criteria) this;
        }

        public Criteria andZnGreaterThanOrEqualTo(String value) {
            addCriterion("zn >=", value, "zn");
            return (Criteria) this;
        }

        public Criteria andZnLessThan(String value) {
            addCriterion("zn <", value, "zn");
            return (Criteria) this;
        }

        public Criteria andZnLessThanOrEqualTo(String value) {
            addCriterion("zn <=", value, "zn");
            return (Criteria) this;
        }

        public Criteria andZnLike(String value) {
            addCriterion("zn like", value, "zn");
            return (Criteria) this;
        }

        public Criteria andZnNotLike(String value) {
            addCriterion("zn not like", value, "zn");
            return (Criteria) this;
        }

        public Criteria andZnIn(List<String> values) {
            addCriterion("zn in", values, "zn");
            return (Criteria) this;
        }

        public Criteria andZnNotIn(List<String> values) {
            addCriterion("zn not in", values, "zn");
            return (Criteria) this;
        }

        public Criteria andZnBetween(String value1, String value2) {
            addCriterion("zn between", value1, value2, "zn");
            return (Criteria) this;
        }

        public Criteria andZnNotBetween(String value1, String value2) {
            addCriterion("zn not between", value1, value2, "zn");
            return (Criteria) this;
        }

        public Criteria andPbIsNull() {
            addCriterion("pb is null");
            return (Criteria) this;
        }

        public Criteria andPbIsNotNull() {
            addCriterion("pb is not null");
            return (Criteria) this;
        }

        public Criteria andPbEqualTo(String value) {
            addCriterion("pb =", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbNotEqualTo(String value) {
            addCriterion("pb <>", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbGreaterThan(String value) {
            addCriterion("pb >", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbGreaterThanOrEqualTo(String value) {
            addCriterion("pb >=", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbLessThan(String value) {
            addCriterion("pb <", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbLessThanOrEqualTo(String value) {
            addCriterion("pb <=", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbLike(String value) {
            addCriterion("pb like", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbNotLike(String value) {
            addCriterion("pb not like", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbIn(List<String> values) {
            addCriterion("pb in", values, "pb");
            return (Criteria) this;
        }

        public Criteria andPbNotIn(List<String> values) {
            addCriterion("pb not in", values, "pb");
            return (Criteria) this;
        }

        public Criteria andPbBetween(String value1, String value2) {
            addCriterion("pb between", value1, value2, "pb");
            return (Criteria) this;
        }

        public Criteria andPbNotBetween(String value1, String value2) {
            addCriterion("pb not between", value1, value2, "pb");
            return (Criteria) this;
        }

        public Criteria andCdIsNull() {
            addCriterion("cd is null");
            return (Criteria) this;
        }

        public Criteria andCdIsNotNull() {
            addCriterion("cd is not null");
            return (Criteria) this;
        }

        public Criteria andCdEqualTo(String value) {
            addCriterion("cd =", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotEqualTo(String value) {
            addCriterion("cd <>", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdGreaterThan(String value) {
            addCriterion("cd >", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdGreaterThanOrEqualTo(String value) {
            addCriterion("cd >=", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdLessThan(String value) {
            addCriterion("cd <", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdLessThanOrEqualTo(String value) {
            addCriterion("cd <=", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdLike(String value) {
            addCriterion("cd like", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotLike(String value) {
            addCriterion("cd not like", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdIn(List<String> values) {
            addCriterion("cd in", values, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotIn(List<String> values) {
            addCriterion("cd not in", values, "cd");
            return (Criteria) this;
        }

        public Criteria andCdBetween(String value1, String value2) {
            addCriterion("cd between", value1, value2, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotBetween(String value1, String value2) {
            addCriterion("cd not between", value1, value2, "cd");
            return (Criteria) this;
        }

        public Criteria andBod5IsNull() {
            addCriterion("bod5 is null");
            return (Criteria) this;
        }

        public Criteria andBod5IsNotNull() {
            addCriterion("bod5 is not null");
            return (Criteria) this;
        }

        public Criteria andBod5EqualTo(String value) {
            addCriterion("bod5 =", value, "bod5");
            return (Criteria) this;
        }

        public Criteria andBod5NotEqualTo(String value) {
            addCriterion("bod5 <>", value, "bod5");
            return (Criteria) this;
        }

        public Criteria andBod5GreaterThan(String value) {
            addCriterion("bod5 >", value, "bod5");
            return (Criteria) this;
        }

        public Criteria andBod5GreaterThanOrEqualTo(String value) {
            addCriterion("bod5 >=", value, "bod5");
            return (Criteria) this;
        }

        public Criteria andBod5LessThan(String value) {
            addCriterion("bod5 <", value, "bod5");
            return (Criteria) this;
        }

        public Criteria andBod5LessThanOrEqualTo(String value) {
            addCriterion("bod5 <=", value, "bod5");
            return (Criteria) this;
        }

        public Criteria andBod5Like(String value) {
            addCriterion("bod5 like", value, "bod5");
            return (Criteria) this;
        }

        public Criteria andBod5NotLike(String value) {
            addCriterion("bod5 not like", value, "bod5");
            return (Criteria) this;
        }

        public Criteria andBod5In(List<String> values) {
            addCriterion("bod5 in", values, "bod5");
            return (Criteria) this;
        }

        public Criteria andBod5NotIn(List<String> values) {
            addCriterion("bod5 not in", values, "bod5");
            return (Criteria) this;
        }

        public Criteria andBod5Between(String value1, String value2) {
            addCriterion("bod5 between", value1, value2, "bod5");
            return (Criteria) this;
        }

        public Criteria andBod5NotBetween(String value1, String value2) {
            addCriterion("bod5 not between", value1, value2, "bod5");
            return (Criteria) this;
        }

        public Criteria andTAsIsNull() {
            addCriterion("t_as is null");
            return (Criteria) this;
        }

        public Criteria andTAsIsNotNull() {
            addCriterion("t_as is not null");
            return (Criteria) this;
        }

        public Criteria andTAsEqualTo(String value) {
            addCriterion("t_as =", value, "tAs");
            return (Criteria) this;
        }

        public Criteria andTAsNotEqualTo(String value) {
            addCriterion("t_as <>", value, "tAs");
            return (Criteria) this;
        }

        public Criteria andTAsGreaterThan(String value) {
            addCriterion("t_as >", value, "tAs");
            return (Criteria) this;
        }

        public Criteria andTAsGreaterThanOrEqualTo(String value) {
            addCriterion("t_as >=", value, "tAs");
            return (Criteria) this;
        }

        public Criteria andTAsLessThan(String value) {
            addCriterion("t_as <", value, "tAs");
            return (Criteria) this;
        }

        public Criteria andTAsLessThanOrEqualTo(String value) {
            addCriterion("t_as <=", value, "tAs");
            return (Criteria) this;
        }

        public Criteria andTAsLike(String value) {
            addCriterion("t_as like", value, "tAs");
            return (Criteria) this;
        }

        public Criteria andTAsNotLike(String value) {
            addCriterion("t_as not like", value, "tAs");
            return (Criteria) this;
        }

        public Criteria andTAsIn(List<String> values) {
            addCriterion("t_as in", values, "tAs");
            return (Criteria) this;
        }

        public Criteria andTAsNotIn(List<String> values) {
            addCriterion("t_as not in", values, "tAs");
            return (Criteria) this;
        }

        public Criteria andTAsBetween(String value1, String value2) {
            addCriterion("t_as between", value1, value2, "tAs");
            return (Criteria) this;
        }

        public Criteria andTAsNotBetween(String value1, String value2) {
            addCriterion("t_as not between", value1, value2, "tAs");
            return (Criteria) this;
        }

        public Criteria andTSeIsNull() {
            addCriterion("t_se is null");
            return (Criteria) this;
        }

        public Criteria andTSeIsNotNull() {
            addCriterion("t_se is not null");
            return (Criteria) this;
        }

        public Criteria andTSeEqualTo(String value) {
            addCriterion("t_se =", value, "tSe");
            return (Criteria) this;
        }

        public Criteria andTSeNotEqualTo(String value) {
            addCriterion("t_se <>", value, "tSe");
            return (Criteria) this;
        }

        public Criteria andTSeGreaterThan(String value) {
            addCriterion("t_se >", value, "tSe");
            return (Criteria) this;
        }

        public Criteria andTSeGreaterThanOrEqualTo(String value) {
            addCriterion("t_se >=", value, "tSe");
            return (Criteria) this;
        }

        public Criteria andTSeLessThan(String value) {
            addCriterion("t_se <", value, "tSe");
            return (Criteria) this;
        }

        public Criteria andTSeLessThanOrEqualTo(String value) {
            addCriterion("t_se <=", value, "tSe");
            return (Criteria) this;
        }

        public Criteria andTSeLike(String value) {
            addCriterion("t_se like", value, "tSe");
            return (Criteria) this;
        }

        public Criteria andTSeNotLike(String value) {
            addCriterion("t_se not like", value, "tSe");
            return (Criteria) this;
        }

        public Criteria andTSeIn(List<String> values) {
            addCriterion("t_se in", values, "tSe");
            return (Criteria) this;
        }

        public Criteria andTSeNotIn(List<String> values) {
            addCriterion("t_se not in", values, "tSe");
            return (Criteria) this;
        }

        public Criteria andTSeBetween(String value1, String value2) {
            addCriterion("t_se between", value1, value2, "tSe");
            return (Criteria) this;
        }

        public Criteria andTSeNotBetween(String value1, String value2) {
            addCriterion("t_se not between", value1, value2, "tSe");
            return (Criteria) this;
        }

        public Criteria andTHgIsNull() {
            addCriterion("t_hg is null");
            return (Criteria) this;
        }

        public Criteria andTHgIsNotNull() {
            addCriterion("t_hg is not null");
            return (Criteria) this;
        }

        public Criteria andTHgEqualTo(String value) {
            addCriterion("t_hg =", value, "tHg");
            return (Criteria) this;
        }

        public Criteria andTHgNotEqualTo(String value) {
            addCriterion("t_hg <>", value, "tHg");
            return (Criteria) this;
        }

        public Criteria andTHgGreaterThan(String value) {
            addCriterion("t_hg >", value, "tHg");
            return (Criteria) this;
        }

        public Criteria andTHgGreaterThanOrEqualTo(String value) {
            addCriterion("t_hg >=", value, "tHg");
            return (Criteria) this;
        }

        public Criteria andTHgLessThan(String value) {
            addCriterion("t_hg <", value, "tHg");
            return (Criteria) this;
        }

        public Criteria andTHgLessThanOrEqualTo(String value) {
            addCriterion("t_hg <=", value, "tHg");
            return (Criteria) this;
        }

        public Criteria andTHgLike(String value) {
            addCriterion("t_hg like", value, "tHg");
            return (Criteria) this;
        }

        public Criteria andTHgNotLike(String value) {
            addCriterion("t_hg not like", value, "tHg");
            return (Criteria) this;
        }

        public Criteria andTHgIn(List<String> values) {
            addCriterion("t_hg in", values, "tHg");
            return (Criteria) this;
        }

        public Criteria andTHgNotIn(List<String> values) {
            addCriterion("t_hg not in", values, "tHg");
            return (Criteria) this;
        }

        public Criteria andTHgBetween(String value1, String value2) {
            addCriterion("t_hg between", value1, value2, "tHg");
            return (Criteria) this;
        }

        public Criteria andTHgNotBetween(String value1, String value2) {
            addCriterion("t_hg not between", value1, value2, "tHg");
            return (Criteria) this;
        }

        public Criteria andCr6IsNull() {
            addCriterion("cr_6 is null");
            return (Criteria) this;
        }

        public Criteria andCr6IsNotNull() {
            addCriterion("cr_6 is not null");
            return (Criteria) this;
        }

        public Criteria andCr6EqualTo(String value) {
            addCriterion("cr_6 =", value, "cr6");
            return (Criteria) this;
        }

        public Criteria andCr6NotEqualTo(String value) {
            addCriterion("cr_6 <>", value, "cr6");
            return (Criteria) this;
        }

        public Criteria andCr6GreaterThan(String value) {
            addCriterion("cr_6 >", value, "cr6");
            return (Criteria) this;
        }

        public Criteria andCr6GreaterThanOrEqualTo(String value) {
            addCriterion("cr_6 >=", value, "cr6");
            return (Criteria) this;
        }

        public Criteria andCr6LessThan(String value) {
            addCriterion("cr_6 <", value, "cr6");
            return (Criteria) this;
        }

        public Criteria andCr6LessThanOrEqualTo(String value) {
            addCriterion("cr_6 <=", value, "cr6");
            return (Criteria) this;
        }

        public Criteria andCr6Like(String value) {
            addCriterion("cr_6 like", value, "cr6");
            return (Criteria) this;
        }

        public Criteria andCr6NotLike(String value) {
            addCriterion("cr_6 not like", value, "cr6");
            return (Criteria) this;
        }

        public Criteria andCr6In(List<String> values) {
            addCriterion("cr_6 in", values, "cr6");
            return (Criteria) this;
        }

        public Criteria andCr6NotIn(List<String> values) {
            addCriterion("cr_6 not in", values, "cr6");
            return (Criteria) this;
        }

        public Criteria andCr6Between(String value1, String value2) {
            addCriterion("cr_6 between", value1, value2, "cr6");
            return (Criteria) this;
        }

        public Criteria andCr6NotBetween(String value1, String value2) {
            addCriterion("cr_6 not between", value1, value2, "cr6");
            return (Criteria) this;
        }

        public Criteria andFIsNull() {
            addCriterion("f_ is null");
            return (Criteria) this;
        }

        public Criteria andFIsNotNull() {
            addCriterion("f_ is not null");
            return (Criteria) this;
        }

        public Criteria andFEqualTo(String value) {
            addCriterion("f_ =", value, "f");
            return (Criteria) this;
        }

        public Criteria andFNotEqualTo(String value) {
            addCriterion("f_ <>", value, "f");
            return (Criteria) this;
        }

        public Criteria andFGreaterThan(String value) {
            addCriterion("f_ >", value, "f");
            return (Criteria) this;
        }

        public Criteria andFGreaterThanOrEqualTo(String value) {
            addCriterion("f_ >=", value, "f");
            return (Criteria) this;
        }

        public Criteria andFLessThan(String value) {
            addCriterion("f_ <", value, "f");
            return (Criteria) this;
        }

        public Criteria andFLessThanOrEqualTo(String value) {
            addCriterion("f_ <=", value, "f");
            return (Criteria) this;
        }

        public Criteria andFLike(String value) {
            addCriterion("f_ like", value, "f");
            return (Criteria) this;
        }

        public Criteria andFNotLike(String value) {
            addCriterion("f_ not like", value, "f");
            return (Criteria) this;
        }

        public Criteria andFIn(List<String> values) {
            addCriterion("f_ in", values, "f");
            return (Criteria) this;
        }

        public Criteria andFNotIn(List<String> values) {
            addCriterion("f_ not in", values, "f");
            return (Criteria) this;
        }

        public Criteria andFBetween(String value1, String value2) {
            addCriterion("f_ between", value1, value2, "f");
            return (Criteria) this;
        }

        public Criteria andFNotBetween(String value1, String value2) {
            addCriterion("f_ not between", value1, value2, "f");
            return (Criteria) this;
        }

        public Criteria andCnIsNull() {
            addCriterion("cn_ is null");
            return (Criteria) this;
        }

        public Criteria andCnIsNotNull() {
            addCriterion("cn_ is not null");
            return (Criteria) this;
        }

        public Criteria andCnEqualTo(String value) {
            addCriterion("cn_ =", value, "cn");
            return (Criteria) this;
        }

        public Criteria andCnNotEqualTo(String value) {
            addCriterion("cn_ <>", value, "cn");
            return (Criteria) this;
        }

        public Criteria andCnGreaterThan(String value) {
            addCriterion("cn_ >", value, "cn");
            return (Criteria) this;
        }

        public Criteria andCnGreaterThanOrEqualTo(String value) {
            addCriterion("cn_ >=", value, "cn");
            return (Criteria) this;
        }

        public Criteria andCnLessThan(String value) {
            addCriterion("cn_ <", value, "cn");
            return (Criteria) this;
        }

        public Criteria andCnLessThanOrEqualTo(String value) {
            addCriterion("cn_ <=", value, "cn");
            return (Criteria) this;
        }

        public Criteria andCnLike(String value) {
            addCriterion("cn_ like", value, "cn");
            return (Criteria) this;
        }

        public Criteria andCnNotLike(String value) {
            addCriterion("cn_ not like", value, "cn");
            return (Criteria) this;
        }

        public Criteria andCnIn(List<String> values) {
            addCriterion("cn_ in", values, "cn");
            return (Criteria) this;
        }

        public Criteria andCnNotIn(List<String> values) {
            addCriterion("cn_ not in", values, "cn");
            return (Criteria) this;
        }

        public Criteria andCnBetween(String value1, String value2) {
            addCriterion("cn_ between", value1, value2, "cn");
            return (Criteria) this;
        }

        public Criteria andCnNotBetween(String value1, String value2) {
            addCriterion("cn_ not between", value1, value2, "cn");
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

        public Criteria andHffEqualTo(String value) {
            addCriterion("hff =", value, "hff");
            return (Criteria) this;
        }

        public Criteria andHffNotEqualTo(String value) {
            addCriterion("hff <>", value, "hff");
            return (Criteria) this;
        }

        public Criteria andHffGreaterThan(String value) {
            addCriterion("hff >", value, "hff");
            return (Criteria) this;
        }

        public Criteria andHffGreaterThanOrEqualTo(String value) {
            addCriterion("hff >=", value, "hff");
            return (Criteria) this;
        }

        public Criteria andHffLessThan(String value) {
            addCriterion("hff <", value, "hff");
            return (Criteria) this;
        }

        public Criteria andHffLessThanOrEqualTo(String value) {
            addCriterion("hff <=", value, "hff");
            return (Criteria) this;
        }

        public Criteria andHffLike(String value) {
            addCriterion("hff like", value, "hff");
            return (Criteria) this;
        }

        public Criteria andHffNotLike(String value) {
            addCriterion("hff not like", value, "hff");
            return (Criteria) this;
        }

        public Criteria andHffIn(List<String> values) {
            addCriterion("hff in", values, "hff");
            return (Criteria) this;
        }

        public Criteria andHffNotIn(List<String> values) {
            addCriterion("hff not in", values, "hff");
            return (Criteria) this;
        }

        public Criteria andHffBetween(String value1, String value2) {
            addCriterion("hff between", value1, value2, "hff");
            return (Criteria) this;
        }

        public Criteria andHffNotBetween(String value1, String value2) {
            addCriterion("hff not between", value1, value2, "hff");
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

        public Criteria andSylEqualTo(String value) {
            addCriterion("syl =", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylNotEqualTo(String value) {
            addCriterion("syl <>", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylGreaterThan(String value) {
            addCriterion("syl >", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylGreaterThanOrEqualTo(String value) {
            addCriterion("syl >=", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylLessThan(String value) {
            addCriterion("syl <", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylLessThanOrEqualTo(String value) {
            addCriterion("syl <=", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylLike(String value) {
            addCriterion("syl like", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylNotLike(String value) {
            addCriterion("syl not like", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylIn(List<String> values) {
            addCriterion("syl in", values, "syl");
            return (Criteria) this;
        }

        public Criteria andSylNotIn(List<String> values) {
            addCriterion("syl not in", values, "syl");
            return (Criteria) this;
        }

        public Criteria andSylBetween(String value1, String value2) {
            addCriterion("syl between", value1, value2, "syl");
            return (Criteria) this;
        }

        public Criteria andSylNotBetween(String value1, String value2) {
            addCriterion("syl not between", value1, value2, "syl");
            return (Criteria) this;
        }

        public Criteria andLasIsNull() {
            addCriterion("las is null");
            return (Criteria) this;
        }

        public Criteria andLasIsNotNull() {
            addCriterion("las is not null");
            return (Criteria) this;
        }

        public Criteria andLasEqualTo(String value) {
            addCriterion("las =", value, "las");
            return (Criteria) this;
        }

        public Criteria andLasNotEqualTo(String value) {
            addCriterion("las <>", value, "las");
            return (Criteria) this;
        }

        public Criteria andLasGreaterThan(String value) {
            addCriterion("las >", value, "las");
            return (Criteria) this;
        }

        public Criteria andLasGreaterThanOrEqualTo(String value) {
            addCriterion("las >=", value, "las");
            return (Criteria) this;
        }

        public Criteria andLasLessThan(String value) {
            addCriterion("las <", value, "las");
            return (Criteria) this;
        }

        public Criteria andLasLessThanOrEqualTo(String value) {
            addCriterion("las <=", value, "las");
            return (Criteria) this;
        }

        public Criteria andLasLike(String value) {
            addCriterion("las like", value, "las");
            return (Criteria) this;
        }

        public Criteria andLasNotLike(String value) {
            addCriterion("las not like", value, "las");
            return (Criteria) this;
        }

        public Criteria andLasIn(List<String> values) {
            addCriterion("las in", values, "las");
            return (Criteria) this;
        }

        public Criteria andLasNotIn(List<String> values) {
            addCriterion("las not in", values, "las");
            return (Criteria) this;
        }

        public Criteria andLasBetween(String value1, String value2) {
            addCriterion("las between", value1, value2, "las");
            return (Criteria) this;
        }

        public Criteria andLasNotBetween(String value1, String value2) {
            addCriterion("las not between", value1, value2, "las");
            return (Criteria) this;
        }

        public Criteria andS2IsNull() {
            addCriterion("s2_ is null");
            return (Criteria) this;
        }

        public Criteria andS2IsNotNull() {
            addCriterion("s2_ is not null");
            return (Criteria) this;
        }

        public Criteria andS2EqualTo(String value) {
            addCriterion("s2_ =", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotEqualTo(String value) {
            addCriterion("s2_ <>", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2GreaterThan(String value) {
            addCriterion("s2_ >", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2GreaterThanOrEqualTo(String value) {
            addCriterion("s2_ >=", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2LessThan(String value) {
            addCriterion("s2_ <", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2LessThanOrEqualTo(String value) {
            addCriterion("s2_ <=", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2Like(String value) {
            addCriterion("s2_ like", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotLike(String value) {
            addCriterion("s2_ not like", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2In(List<String> values) {
            addCriterion("s2_ in", values, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotIn(List<String> values) {
            addCriterion("s2_ not in", values, "s2");
            return (Criteria) this;
        }

        public Criteria andS2Between(String value1, String value2) {
            addCriterion("s2_ between", value1, value2, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotBetween(String value1, String value2) {
            addCriterion("s2_ not between", value1, value2, "s2");
            return (Criteria) this;
        }

        public Criteria andChlaIsNull() {
            addCriterion("chla is null");
            return (Criteria) this;
        }

        public Criteria andChlaIsNotNull() {
            addCriterion("chla is not null");
            return (Criteria) this;
        }

        public Criteria andChlaEqualTo(String value) {
            addCriterion("chla =", value, "chla");
            return (Criteria) this;
        }

        public Criteria andChlaNotEqualTo(String value) {
            addCriterion("chla <>", value, "chla");
            return (Criteria) this;
        }

        public Criteria andChlaGreaterThan(String value) {
            addCriterion("chla >", value, "chla");
            return (Criteria) this;
        }

        public Criteria andChlaGreaterThanOrEqualTo(String value) {
            addCriterion("chla >=", value, "chla");
            return (Criteria) this;
        }

        public Criteria andChlaLessThan(String value) {
            addCriterion("chla <", value, "chla");
            return (Criteria) this;
        }

        public Criteria andChlaLessThanOrEqualTo(String value) {
            addCriterion("chla <=", value, "chla");
            return (Criteria) this;
        }

        public Criteria andChlaLike(String value) {
            addCriterion("chla like", value, "chla");
            return (Criteria) this;
        }

        public Criteria andChlaNotLike(String value) {
            addCriterion("chla not like", value, "chla");
            return (Criteria) this;
        }

        public Criteria andChlaIn(List<String> values) {
            addCriterion("chla in", values, "chla");
            return (Criteria) this;
        }

        public Criteria andChlaNotIn(List<String> values) {
            addCriterion("chla not in", values, "chla");
            return (Criteria) this;
        }

        public Criteria andChlaBetween(String value1, String value2) {
            addCriterion("chla between", value1, value2, "chla");
            return (Criteria) this;
        }

        public Criteria andChlaNotBetween(String value1, String value2) {
            addCriterion("chla not between", value1, value2, "chla");
            return (Criteria) this;
        }

        public Criteria andNo3IsNull() {
            addCriterion("no3 is null");
            return (Criteria) this;
        }

        public Criteria andNo3IsNotNull() {
            addCriterion("no3 is not null");
            return (Criteria) this;
        }

        public Criteria andNo3EqualTo(String value) {
            addCriterion("no3 =", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3NotEqualTo(String value) {
            addCriterion("no3 <>", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3GreaterThan(String value) {
            addCriterion("no3 >", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3GreaterThanOrEqualTo(String value) {
            addCriterion("no3 >=", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3LessThan(String value) {
            addCriterion("no3 <", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3LessThanOrEqualTo(String value) {
            addCriterion("no3 <=", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3Like(String value) {
            addCriterion("no3 like", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3NotLike(String value) {
            addCriterion("no3 not like", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3In(List<String> values) {
            addCriterion("no3 in", values, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3NotIn(List<String> values) {
            addCriterion("no3 not in", values, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3Between(String value1, String value2) {
            addCriterion("no3 between", value1, value2, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3NotBetween(String value1, String value2) {
            addCriterion("no3 not between", value1, value2, "no3");
            return (Criteria) this;
        }

        public Criteria andNo2IsNull() {
            addCriterion("no2 is null");
            return (Criteria) this;
        }

        public Criteria andNo2IsNotNull() {
            addCriterion("no2 is not null");
            return (Criteria) this;
        }

        public Criteria andNo2EqualTo(String value) {
            addCriterion("no2 =", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2NotEqualTo(String value) {
            addCriterion("no2 <>", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2GreaterThan(String value) {
            addCriterion("no2 >", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2GreaterThanOrEqualTo(String value) {
            addCriterion("no2 >=", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2LessThan(String value) {
            addCriterion("no2 <", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2LessThanOrEqualTo(String value) {
            addCriterion("no2 <=", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2Like(String value) {
            addCriterion("no2 like", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2NotLike(String value) {
            addCriterion("no2 not like", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2In(List<String> values) {
            addCriterion("no2 in", values, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2NotIn(List<String> values) {
            addCriterion("no2 not in", values, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2Between(String value1, String value2) {
            addCriterion("no2 between", value1, value2, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2NotBetween(String value1, String value2) {
            addCriterion("no2 not between", value1, value2, "no2");
            return (Criteria) this;
        }

        public Criteria andLlIsNull() {
            addCriterion("ll is null");
            return (Criteria) this;
        }

        public Criteria andLlIsNotNull() {
            addCriterion("ll is not null");
            return (Criteria) this;
        }

        public Criteria andLlEqualTo(String value) {
            addCriterion("ll =", value, "ll");
            return (Criteria) this;
        }

        public Criteria andLlNotEqualTo(String value) {
            addCriterion("ll <>", value, "ll");
            return (Criteria) this;
        }

        public Criteria andLlGreaterThan(String value) {
            addCriterion("ll >", value, "ll");
            return (Criteria) this;
        }

        public Criteria andLlGreaterThanOrEqualTo(String value) {
            addCriterion("ll >=", value, "ll");
            return (Criteria) this;
        }

        public Criteria andLlLessThan(String value) {
            addCriterion("ll <", value, "ll");
            return (Criteria) this;
        }

        public Criteria andLlLessThanOrEqualTo(String value) {
            addCriterion("ll <=", value, "ll");
            return (Criteria) this;
        }

        public Criteria andLlLike(String value) {
            addCriterion("ll like", value, "ll");
            return (Criteria) this;
        }

        public Criteria andLlNotLike(String value) {
            addCriterion("ll not like", value, "ll");
            return (Criteria) this;
        }

        public Criteria andLlIn(List<String> values) {
            addCriterion("ll in", values, "ll");
            return (Criteria) this;
        }

        public Criteria andLlNotIn(List<String> values) {
            addCriterion("ll not in", values, "ll");
            return (Criteria) this;
        }

        public Criteria andLlBetween(String value1, String value2) {
            addCriterion("ll between", value1, value2, "ll");
            return (Criteria) this;
        }

        public Criteria andLlNotBetween(String value1, String value2) {
            addCriterion("ll not between", value1, value2, "ll");
            return (Criteria) this;
        }

        public Criteria andSwIsNull() {
            addCriterion("sw is null");
            return (Criteria) this;
        }

        public Criteria andSwIsNotNull() {
            addCriterion("sw is not null");
            return (Criteria) this;
        }

        public Criteria andSwEqualTo(String value) {
            addCriterion("sw =", value, "sw");
            return (Criteria) this;
        }

        public Criteria andSwNotEqualTo(String value) {
            addCriterion("sw <>", value, "sw");
            return (Criteria) this;
        }

        public Criteria andSwGreaterThan(String value) {
            addCriterion("sw >", value, "sw");
            return (Criteria) this;
        }

        public Criteria andSwGreaterThanOrEqualTo(String value) {
            addCriterion("sw >=", value, "sw");
            return (Criteria) this;
        }

        public Criteria andSwLessThan(String value) {
            addCriterion("sw <", value, "sw");
            return (Criteria) this;
        }

        public Criteria andSwLessThanOrEqualTo(String value) {
            addCriterion("sw <=", value, "sw");
            return (Criteria) this;
        }

        public Criteria andSwLike(String value) {
            addCriterion("sw like", value, "sw");
            return (Criteria) this;
        }

        public Criteria andSwNotLike(String value) {
            addCriterion("sw not like", value, "sw");
            return (Criteria) this;
        }

        public Criteria andSwIn(List<String> values) {
            addCriterion("sw in", values, "sw");
            return (Criteria) this;
        }

        public Criteria andSwNotIn(List<String> values) {
            addCriterion("sw not in", values, "sw");
            return (Criteria) this;
        }

        public Criteria andSwBetween(String value1, String value2) {
            addCriterion("sw between", value1, value2, "sw");
            return (Criteria) this;
        }

        public Criteria andSwNotBetween(String value1, String value2) {
            addCriterion("sw not between", value1, value2, "sw");
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

        public Criteria andFdcjqbzIsNull() {
            addCriterion("fdcjqbz is null");
            return (Criteria) this;
        }

        public Criteria andFdcjqbzIsNotNull() {
            addCriterion("fdcjqbz is not null");
            return (Criteria) this;
        }

        public Criteria andFdcjqbzEqualTo(String value) {
            addCriterion("fdcjqbz =", value, "fdcjqbz");
            return (Criteria) this;
        }

        public Criteria andFdcjqbzNotEqualTo(String value) {
            addCriterion("fdcjqbz <>", value, "fdcjqbz");
            return (Criteria) this;
        }

        public Criteria andFdcjqbzGreaterThan(String value) {
            addCriterion("fdcjqbz >", value, "fdcjqbz");
            return (Criteria) this;
        }

        public Criteria andFdcjqbzGreaterThanOrEqualTo(String value) {
            addCriterion("fdcjqbz >=", value, "fdcjqbz");
            return (Criteria) this;
        }

        public Criteria andFdcjqbzLessThan(String value) {
            addCriterion("fdcjqbz <", value, "fdcjqbz");
            return (Criteria) this;
        }

        public Criteria andFdcjqbzLessThanOrEqualTo(String value) {
            addCriterion("fdcjqbz <=", value, "fdcjqbz");
            return (Criteria) this;
        }

        public Criteria andFdcjqbzLike(String value) {
            addCriterion("fdcjqbz like", value, "fdcjqbz");
            return (Criteria) this;
        }

        public Criteria andFdcjqbzNotLike(String value) {
            addCriterion("fdcjqbz not like", value, "fdcjqbz");
            return (Criteria) this;
        }

        public Criteria andFdcjqbzIn(List<String> values) {
            addCriterion("fdcjqbz in", values, "fdcjqbz");
            return (Criteria) this;
        }

        public Criteria andFdcjqbzNotIn(List<String> values) {
            addCriterion("fdcjqbz not in", values, "fdcjqbz");
            return (Criteria) this;
        }

        public Criteria andFdcjqbzBetween(String value1, String value2) {
            addCriterion("fdcjqbz between", value1, value2, "fdcjqbz");
            return (Criteria) this;
        }

        public Criteria andFdcjqbzNotBetween(String value1, String value2) {
            addCriterion("fdcjqbz not between", value1, value2, "fdcjqbz");
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