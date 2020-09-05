package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class SzzbbzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SzzbbzExample() {
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

        public Criteria andWaterTypeIsNull() {
            addCriterion("water_type is null");
            return (Criteria) this;
        }

        public Criteria andWaterTypeIsNotNull() {
            addCriterion("water_type is not null");
            return (Criteria) this;
        }

        public Criteria andWaterTypeEqualTo(String value) {
            addCriterion("water_type =", value, "waterType");
            return (Criteria) this;
        }

        public Criteria andWaterTypeNotEqualTo(String value) {
            addCriterion("water_type <>", value, "waterType");
            return (Criteria) this;
        }

        public Criteria andWaterTypeGreaterThan(String value) {
            addCriterion("water_type >", value, "waterType");
            return (Criteria) this;
        }

        public Criteria andWaterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("water_type >=", value, "waterType");
            return (Criteria) this;
        }

        public Criteria andWaterTypeLessThan(String value) {
            addCriterion("water_type <", value, "waterType");
            return (Criteria) this;
        }

        public Criteria andWaterTypeLessThanOrEqualTo(String value) {
            addCriterion("water_type <=", value, "waterType");
            return (Criteria) this;
        }

        public Criteria andWaterTypeLike(String value) {
            addCriterion("water_type like", value, "waterType");
            return (Criteria) this;
        }

        public Criteria andWaterTypeNotLike(String value) {
            addCriterion("water_type not like", value, "waterType");
            return (Criteria) this;
        }

        public Criteria andWaterTypeIn(List<String> values) {
            addCriterion("water_type in", values, "waterType");
            return (Criteria) this;
        }

        public Criteria andWaterTypeNotIn(List<String> values) {
            addCriterion("water_type not in", values, "waterType");
            return (Criteria) this;
        }

        public Criteria andWaterTypeBetween(String value1, String value2) {
            addCriterion("water_type between", value1, value2, "waterType");
            return (Criteria) this;
        }

        public Criteria andWaterTypeNotBetween(String value1, String value2) {
            addCriterion("water_type not between", value1, value2, "waterType");
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

        public Criteria andCodMnStdIsNull() {
            addCriterion("cod_mn_std is null");
            return (Criteria) this;
        }

        public Criteria andCodMnStdIsNotNull() {
            addCriterion("cod_mn_std is not null");
            return (Criteria) this;
        }

        public Criteria andCodMnStdEqualTo(String value) {
            addCriterion("cod_mn_std =", value, "codMnStd");
            return (Criteria) this;
        }

        public Criteria andCodMnStdNotEqualTo(String value) {
            addCriterion("cod_mn_std <>", value, "codMnStd");
            return (Criteria) this;
        }

        public Criteria andCodMnStdGreaterThan(String value) {
            addCriterion("cod_mn_std >", value, "codMnStd");
            return (Criteria) this;
        }

        public Criteria andCodMnStdGreaterThanOrEqualTo(String value) {
            addCriterion("cod_mn_std >=", value, "codMnStd");
            return (Criteria) this;
        }

        public Criteria andCodMnStdLessThan(String value) {
            addCriterion("cod_mn_std <", value, "codMnStd");
            return (Criteria) this;
        }

        public Criteria andCodMnStdLessThanOrEqualTo(String value) {
            addCriterion("cod_mn_std <=", value, "codMnStd");
            return (Criteria) this;
        }

        public Criteria andCodMnStdLike(String value) {
            addCriterion("cod_mn_std like", value, "codMnStd");
            return (Criteria) this;
        }

        public Criteria andCodMnStdNotLike(String value) {
            addCriterion("cod_mn_std not like", value, "codMnStd");
            return (Criteria) this;
        }

        public Criteria andCodMnStdIn(List<String> values) {
            addCriterion("cod_mn_std in", values, "codMnStd");
            return (Criteria) this;
        }

        public Criteria andCodMnStdNotIn(List<String> values) {
            addCriterion("cod_mn_std not in", values, "codMnStd");
            return (Criteria) this;
        }

        public Criteria andCodMnStdBetween(String value1, String value2) {
            addCriterion("cod_mn_std between", value1, value2, "codMnStd");
            return (Criteria) this;
        }

        public Criteria andCodMnStdNotBetween(String value1, String value2) {
            addCriterion("cod_mn_std not between", value1, value2, "codMnStd");
            return (Criteria) this;
        }

        public Criteria andCodCrStdIsNull() {
            addCriterion("cod_cr_std is null");
            return (Criteria) this;
        }

        public Criteria andCodCrStdIsNotNull() {
            addCriterion("cod_cr_std is not null");
            return (Criteria) this;
        }

        public Criteria andCodCrStdEqualTo(String value) {
            addCriterion("cod_cr_std =", value, "codCrStd");
            return (Criteria) this;
        }

        public Criteria andCodCrStdNotEqualTo(String value) {
            addCriterion("cod_cr_std <>", value, "codCrStd");
            return (Criteria) this;
        }

        public Criteria andCodCrStdGreaterThan(String value) {
            addCriterion("cod_cr_std >", value, "codCrStd");
            return (Criteria) this;
        }

        public Criteria andCodCrStdGreaterThanOrEqualTo(String value) {
            addCriterion("cod_cr_std >=", value, "codCrStd");
            return (Criteria) this;
        }

        public Criteria andCodCrStdLessThan(String value) {
            addCriterion("cod_cr_std <", value, "codCrStd");
            return (Criteria) this;
        }

        public Criteria andCodCrStdLessThanOrEqualTo(String value) {
            addCriterion("cod_cr_std <=", value, "codCrStd");
            return (Criteria) this;
        }

        public Criteria andCodCrStdLike(String value) {
            addCriterion("cod_cr_std like", value, "codCrStd");
            return (Criteria) this;
        }

        public Criteria andCodCrStdNotLike(String value) {
            addCriterion("cod_cr_std not like", value, "codCrStd");
            return (Criteria) this;
        }

        public Criteria andCodCrStdIn(List<String> values) {
            addCriterion("cod_cr_std in", values, "codCrStd");
            return (Criteria) this;
        }

        public Criteria andCodCrStdNotIn(List<String> values) {
            addCriterion("cod_cr_std not in", values, "codCrStd");
            return (Criteria) this;
        }

        public Criteria andCodCrStdBetween(String value1, String value2) {
            addCriterion("cod_cr_std between", value1, value2, "codCrStd");
            return (Criteria) this;
        }

        public Criteria andCodCrStdNotBetween(String value1, String value2) {
            addCriterion("cod_cr_std not between", value1, value2, "codCrStd");
            return (Criteria) this;
        }

        public Criteria andNhNStdIsNull() {
            addCriterion("nh_n_std is null");
            return (Criteria) this;
        }

        public Criteria andNhNStdIsNotNull() {
            addCriterion("nh_n_std is not null");
            return (Criteria) this;
        }

        public Criteria andNhNStdEqualTo(String value) {
            addCriterion("nh_n_std =", value, "nhNStd");
            return (Criteria) this;
        }

        public Criteria andNhNStdNotEqualTo(String value) {
            addCriterion("nh_n_std <>", value, "nhNStd");
            return (Criteria) this;
        }

        public Criteria andNhNStdGreaterThan(String value) {
            addCriterion("nh_n_std >", value, "nhNStd");
            return (Criteria) this;
        }

        public Criteria andNhNStdGreaterThanOrEqualTo(String value) {
            addCriterion("nh_n_std >=", value, "nhNStd");
            return (Criteria) this;
        }

        public Criteria andNhNStdLessThan(String value) {
            addCriterion("nh_n_std <", value, "nhNStd");
            return (Criteria) this;
        }

        public Criteria andNhNStdLessThanOrEqualTo(String value) {
            addCriterion("nh_n_std <=", value, "nhNStd");
            return (Criteria) this;
        }

        public Criteria andNhNStdLike(String value) {
            addCriterion("nh_n_std like", value, "nhNStd");
            return (Criteria) this;
        }

        public Criteria andNhNStdNotLike(String value) {
            addCriterion("nh_n_std not like", value, "nhNStd");
            return (Criteria) this;
        }

        public Criteria andNhNStdIn(List<String> values) {
            addCriterion("nh_n_std in", values, "nhNStd");
            return (Criteria) this;
        }

        public Criteria andNhNStdNotIn(List<String> values) {
            addCriterion("nh_n_std not in", values, "nhNStd");
            return (Criteria) this;
        }

        public Criteria andNhNStdBetween(String value1, String value2) {
            addCriterion("nh_n_std between", value1, value2, "nhNStd");
            return (Criteria) this;
        }

        public Criteria andNhNStdNotBetween(String value1, String value2) {
            addCriterion("nh_n_std not between", value1, value2, "nhNStd");
            return (Criteria) this;
        }

        public Criteria andTPStdIsNull() {
            addCriterion("t_p_std is null");
            return (Criteria) this;
        }

        public Criteria andTPStdIsNotNull() {
            addCriterion("t_p_std is not null");
            return (Criteria) this;
        }

        public Criteria andTPStdEqualTo(String value) {
            addCriterion("t_p_std =", value, "tPStd");
            return (Criteria) this;
        }

        public Criteria andTPStdNotEqualTo(String value) {
            addCriterion("t_p_std <>", value, "tPStd");
            return (Criteria) this;
        }

        public Criteria andTPStdGreaterThan(String value) {
            addCriterion("t_p_std >", value, "tPStd");
            return (Criteria) this;
        }

        public Criteria andTPStdGreaterThanOrEqualTo(String value) {
            addCriterion("t_p_std >=", value, "tPStd");
            return (Criteria) this;
        }

        public Criteria andTPStdLessThan(String value) {
            addCriterion("t_p_std <", value, "tPStd");
            return (Criteria) this;
        }

        public Criteria andTPStdLessThanOrEqualTo(String value) {
            addCriterion("t_p_std <=", value, "tPStd");
            return (Criteria) this;
        }

        public Criteria andTPStdLike(String value) {
            addCriterion("t_p_std like", value, "tPStd");
            return (Criteria) this;
        }

        public Criteria andTPStdNotLike(String value) {
            addCriterion("t_p_std not like", value, "tPStd");
            return (Criteria) this;
        }

        public Criteria andTPStdIn(List<String> values) {
            addCriterion("t_p_std in", values, "tPStd");
            return (Criteria) this;
        }

        public Criteria andTPStdNotIn(List<String> values) {
            addCriterion("t_p_std not in", values, "tPStd");
            return (Criteria) this;
        }

        public Criteria andTPStdBetween(String value1, String value2) {
            addCriterion("t_p_std between", value1, value2, "tPStd");
            return (Criteria) this;
        }

        public Criteria andTPStdNotBetween(String value1, String value2) {
            addCriterion("t_p_std not between", value1, value2, "tPStd");
            return (Criteria) this;
        }

        public Criteria andTNStdIsNull() {
            addCriterion("t_n_std is null");
            return (Criteria) this;
        }

        public Criteria andTNStdIsNotNull() {
            addCriterion("t_n_std is not null");
            return (Criteria) this;
        }

        public Criteria andTNStdEqualTo(String value) {
            addCriterion("t_n_std =", value, "tNStd");
            return (Criteria) this;
        }

        public Criteria andTNStdNotEqualTo(String value) {
            addCriterion("t_n_std <>", value, "tNStd");
            return (Criteria) this;
        }

        public Criteria andTNStdGreaterThan(String value) {
            addCriterion("t_n_std >", value, "tNStd");
            return (Criteria) this;
        }

        public Criteria andTNStdGreaterThanOrEqualTo(String value) {
            addCriterion("t_n_std >=", value, "tNStd");
            return (Criteria) this;
        }

        public Criteria andTNStdLessThan(String value) {
            addCriterion("t_n_std <", value, "tNStd");
            return (Criteria) this;
        }

        public Criteria andTNStdLessThanOrEqualTo(String value) {
            addCriterion("t_n_std <=", value, "tNStd");
            return (Criteria) this;
        }

        public Criteria andTNStdLike(String value) {
            addCriterion("t_n_std like", value, "tNStd");
            return (Criteria) this;
        }

        public Criteria andTNStdNotLike(String value) {
            addCriterion("t_n_std not like", value, "tNStd");
            return (Criteria) this;
        }

        public Criteria andTNStdIn(List<String> values) {
            addCriterion("t_n_std in", values, "tNStd");
            return (Criteria) this;
        }

        public Criteria andTNStdNotIn(List<String> values) {
            addCriterion("t_n_std not in", values, "tNStd");
            return (Criteria) this;
        }

        public Criteria andTNStdBetween(String value1, String value2) {
            addCriterion("t_n_std between", value1, value2, "tNStd");
            return (Criteria) this;
        }

        public Criteria andTNStdNotBetween(String value1, String value2) {
            addCriterion("t_n_std not between", value1, value2, "tNStd");
            return (Criteria) this;
        }

        public Criteria andCuStdIsNull() {
            addCriterion("cu_std is null");
            return (Criteria) this;
        }

        public Criteria andCuStdIsNotNull() {
            addCriterion("cu_std is not null");
            return (Criteria) this;
        }

        public Criteria andCuStdEqualTo(String value) {
            addCriterion("cu_std =", value, "cuStd");
            return (Criteria) this;
        }

        public Criteria andCuStdNotEqualTo(String value) {
            addCriterion("cu_std <>", value, "cuStd");
            return (Criteria) this;
        }

        public Criteria andCuStdGreaterThan(String value) {
            addCriterion("cu_std >", value, "cuStd");
            return (Criteria) this;
        }

        public Criteria andCuStdGreaterThanOrEqualTo(String value) {
            addCriterion("cu_std >=", value, "cuStd");
            return (Criteria) this;
        }

        public Criteria andCuStdLessThan(String value) {
            addCriterion("cu_std <", value, "cuStd");
            return (Criteria) this;
        }

        public Criteria andCuStdLessThanOrEqualTo(String value) {
            addCriterion("cu_std <=", value, "cuStd");
            return (Criteria) this;
        }

        public Criteria andCuStdLike(String value) {
            addCriterion("cu_std like", value, "cuStd");
            return (Criteria) this;
        }

        public Criteria andCuStdNotLike(String value) {
            addCriterion("cu_std not like", value, "cuStd");
            return (Criteria) this;
        }

        public Criteria andCuStdIn(List<String> values) {
            addCriterion("cu_std in", values, "cuStd");
            return (Criteria) this;
        }

        public Criteria andCuStdNotIn(List<String> values) {
            addCriterion("cu_std not in", values, "cuStd");
            return (Criteria) this;
        }

        public Criteria andCuStdBetween(String value1, String value2) {
            addCriterion("cu_std between", value1, value2, "cuStd");
            return (Criteria) this;
        }

        public Criteria andCuStdNotBetween(String value1, String value2) {
            addCriterion("cu_std not between", value1, value2, "cuStd");
            return (Criteria) this;
        }

        public Criteria andZnStdIsNull() {
            addCriterion("zn_std is null");
            return (Criteria) this;
        }

        public Criteria andZnStdIsNotNull() {
            addCriterion("zn_std is not null");
            return (Criteria) this;
        }

        public Criteria andZnStdEqualTo(String value) {
            addCriterion("zn_std =", value, "znStd");
            return (Criteria) this;
        }

        public Criteria andZnStdNotEqualTo(String value) {
            addCriterion("zn_std <>", value, "znStd");
            return (Criteria) this;
        }

        public Criteria andZnStdGreaterThan(String value) {
            addCriterion("zn_std >", value, "znStd");
            return (Criteria) this;
        }

        public Criteria andZnStdGreaterThanOrEqualTo(String value) {
            addCriterion("zn_std >=", value, "znStd");
            return (Criteria) this;
        }

        public Criteria andZnStdLessThan(String value) {
            addCriterion("zn_std <", value, "znStd");
            return (Criteria) this;
        }

        public Criteria andZnStdLessThanOrEqualTo(String value) {
            addCriterion("zn_std <=", value, "znStd");
            return (Criteria) this;
        }

        public Criteria andZnStdLike(String value) {
            addCriterion("zn_std like", value, "znStd");
            return (Criteria) this;
        }

        public Criteria andZnStdNotLike(String value) {
            addCriterion("zn_std not like", value, "znStd");
            return (Criteria) this;
        }

        public Criteria andZnStdIn(List<String> values) {
            addCriterion("zn_std in", values, "znStd");
            return (Criteria) this;
        }

        public Criteria andZnStdNotIn(List<String> values) {
            addCriterion("zn_std not in", values, "znStd");
            return (Criteria) this;
        }

        public Criteria andZnStdBetween(String value1, String value2) {
            addCriterion("zn_std between", value1, value2, "znStd");
            return (Criteria) this;
        }

        public Criteria andZnStdNotBetween(String value1, String value2) {
            addCriterion("zn_std not between", value1, value2, "znStd");
            return (Criteria) this;
        }

        public Criteria andPbStdIsNull() {
            addCriterion("pb_std is null");
            return (Criteria) this;
        }

        public Criteria andPbStdIsNotNull() {
            addCriterion("pb_std is not null");
            return (Criteria) this;
        }

        public Criteria andPbStdEqualTo(String value) {
            addCriterion("pb_std =", value, "pbStd");
            return (Criteria) this;
        }

        public Criteria andPbStdNotEqualTo(String value) {
            addCriterion("pb_std <>", value, "pbStd");
            return (Criteria) this;
        }

        public Criteria andPbStdGreaterThan(String value) {
            addCriterion("pb_std >", value, "pbStd");
            return (Criteria) this;
        }

        public Criteria andPbStdGreaterThanOrEqualTo(String value) {
            addCriterion("pb_std >=", value, "pbStd");
            return (Criteria) this;
        }

        public Criteria andPbStdLessThan(String value) {
            addCriterion("pb_std <", value, "pbStd");
            return (Criteria) this;
        }

        public Criteria andPbStdLessThanOrEqualTo(String value) {
            addCriterion("pb_std <=", value, "pbStd");
            return (Criteria) this;
        }

        public Criteria andPbStdLike(String value) {
            addCriterion("pb_std like", value, "pbStd");
            return (Criteria) this;
        }

        public Criteria andPbStdNotLike(String value) {
            addCriterion("pb_std not like", value, "pbStd");
            return (Criteria) this;
        }

        public Criteria andPbStdIn(List<String> values) {
            addCriterion("pb_std in", values, "pbStd");
            return (Criteria) this;
        }

        public Criteria andPbStdNotIn(List<String> values) {
            addCriterion("pb_std not in", values, "pbStd");
            return (Criteria) this;
        }

        public Criteria andPbStdBetween(String value1, String value2) {
            addCriterion("pb_std between", value1, value2, "pbStd");
            return (Criteria) this;
        }

        public Criteria andPbStdNotBetween(String value1, String value2) {
            addCriterion("pb_std not between", value1, value2, "pbStd");
            return (Criteria) this;
        }

        public Criteria andCdStdIsNull() {
            addCriterion("cd_std is null");
            return (Criteria) this;
        }

        public Criteria andCdStdIsNotNull() {
            addCriterion("cd_std is not null");
            return (Criteria) this;
        }

        public Criteria andCdStdEqualTo(String value) {
            addCriterion("cd_std =", value, "cdStd");
            return (Criteria) this;
        }

        public Criteria andCdStdNotEqualTo(String value) {
            addCriterion("cd_std <>", value, "cdStd");
            return (Criteria) this;
        }

        public Criteria andCdStdGreaterThan(String value) {
            addCriterion("cd_std >", value, "cdStd");
            return (Criteria) this;
        }

        public Criteria andCdStdGreaterThanOrEqualTo(String value) {
            addCriterion("cd_std >=", value, "cdStd");
            return (Criteria) this;
        }

        public Criteria andCdStdLessThan(String value) {
            addCriterion("cd_std <", value, "cdStd");
            return (Criteria) this;
        }

        public Criteria andCdStdLessThanOrEqualTo(String value) {
            addCriterion("cd_std <=", value, "cdStd");
            return (Criteria) this;
        }

        public Criteria andCdStdLike(String value) {
            addCriterion("cd_std like", value, "cdStd");
            return (Criteria) this;
        }

        public Criteria andCdStdNotLike(String value) {
            addCriterion("cd_std not like", value, "cdStd");
            return (Criteria) this;
        }

        public Criteria andCdStdIn(List<String> values) {
            addCriterion("cd_std in", values, "cdStd");
            return (Criteria) this;
        }

        public Criteria andCdStdNotIn(List<String> values) {
            addCriterion("cd_std not in", values, "cdStd");
            return (Criteria) this;
        }

        public Criteria andCdStdBetween(String value1, String value2) {
            addCriterion("cd_std between", value1, value2, "cdStd");
            return (Criteria) this;
        }

        public Criteria andCdStdNotBetween(String value1, String value2) {
            addCriterion("cd_std not between", value1, value2, "cdStd");
            return (Criteria) this;
        }

        public Criteria andBod5StdIsNull() {
            addCriterion("bod5_std is null");
            return (Criteria) this;
        }

        public Criteria andBod5StdIsNotNull() {
            addCriterion("bod5_std is not null");
            return (Criteria) this;
        }

        public Criteria andBod5StdEqualTo(String value) {
            addCriterion("bod5_std =", value, "bod5Std");
            return (Criteria) this;
        }

        public Criteria andBod5StdNotEqualTo(String value) {
            addCriterion("bod5_std <>", value, "bod5Std");
            return (Criteria) this;
        }

        public Criteria andBod5StdGreaterThan(String value) {
            addCriterion("bod5_std >", value, "bod5Std");
            return (Criteria) this;
        }

        public Criteria andBod5StdGreaterThanOrEqualTo(String value) {
            addCriterion("bod5_std >=", value, "bod5Std");
            return (Criteria) this;
        }

        public Criteria andBod5StdLessThan(String value) {
            addCriterion("bod5_std <", value, "bod5Std");
            return (Criteria) this;
        }

        public Criteria andBod5StdLessThanOrEqualTo(String value) {
            addCriterion("bod5_std <=", value, "bod5Std");
            return (Criteria) this;
        }

        public Criteria andBod5StdLike(String value) {
            addCriterion("bod5_std like", value, "bod5Std");
            return (Criteria) this;
        }

        public Criteria andBod5StdNotLike(String value) {
            addCriterion("bod5_std not like", value, "bod5Std");
            return (Criteria) this;
        }

        public Criteria andBod5StdIn(List<String> values) {
            addCriterion("bod5_std in", values, "bod5Std");
            return (Criteria) this;
        }

        public Criteria andBod5StdNotIn(List<String> values) {
            addCriterion("bod5_std not in", values, "bod5Std");
            return (Criteria) this;
        }

        public Criteria andBod5StdBetween(String value1, String value2) {
            addCriterion("bod5_std between", value1, value2, "bod5Std");
            return (Criteria) this;
        }

        public Criteria andBod5StdNotBetween(String value1, String value2) {
            addCriterion("bod5_std not between", value1, value2, "bod5Std");
            return (Criteria) this;
        }

        public Criteria andTAsStdIsNull() {
            addCriterion("t_as_std is null");
            return (Criteria) this;
        }

        public Criteria andTAsStdIsNotNull() {
            addCriterion("t_as_std is not null");
            return (Criteria) this;
        }

        public Criteria andTAsStdEqualTo(String value) {
            addCriterion("t_as_std =", value, "tAsStd");
            return (Criteria) this;
        }

        public Criteria andTAsStdNotEqualTo(String value) {
            addCriterion("t_as_std <>", value, "tAsStd");
            return (Criteria) this;
        }

        public Criteria andTAsStdGreaterThan(String value) {
            addCriterion("t_as_std >", value, "tAsStd");
            return (Criteria) this;
        }

        public Criteria andTAsStdGreaterThanOrEqualTo(String value) {
            addCriterion("t_as_std >=", value, "tAsStd");
            return (Criteria) this;
        }

        public Criteria andTAsStdLessThan(String value) {
            addCriterion("t_as_std <", value, "tAsStd");
            return (Criteria) this;
        }

        public Criteria andTAsStdLessThanOrEqualTo(String value) {
            addCriterion("t_as_std <=", value, "tAsStd");
            return (Criteria) this;
        }

        public Criteria andTAsStdLike(String value) {
            addCriterion("t_as_std like", value, "tAsStd");
            return (Criteria) this;
        }

        public Criteria andTAsStdNotLike(String value) {
            addCriterion("t_as_std not like", value, "tAsStd");
            return (Criteria) this;
        }

        public Criteria andTAsStdIn(List<String> values) {
            addCriterion("t_as_std in", values, "tAsStd");
            return (Criteria) this;
        }

        public Criteria andTAsStdNotIn(List<String> values) {
            addCriterion("t_as_std not in", values, "tAsStd");
            return (Criteria) this;
        }

        public Criteria andTAsStdBetween(String value1, String value2) {
            addCriterion("t_as_std between", value1, value2, "tAsStd");
            return (Criteria) this;
        }

        public Criteria andTAsStdNotBetween(String value1, String value2) {
            addCriterion("t_as_std not between", value1, value2, "tAsStd");
            return (Criteria) this;
        }

        public Criteria andTSeStdIsNull() {
            addCriterion("t_se_std is null");
            return (Criteria) this;
        }

        public Criteria andTSeStdIsNotNull() {
            addCriterion("t_se_std is not null");
            return (Criteria) this;
        }

        public Criteria andTSeStdEqualTo(String value) {
            addCriterion("t_se_std =", value, "tSeStd");
            return (Criteria) this;
        }

        public Criteria andTSeStdNotEqualTo(String value) {
            addCriterion("t_se_std <>", value, "tSeStd");
            return (Criteria) this;
        }

        public Criteria andTSeStdGreaterThan(String value) {
            addCriterion("t_se_std >", value, "tSeStd");
            return (Criteria) this;
        }

        public Criteria andTSeStdGreaterThanOrEqualTo(String value) {
            addCriterion("t_se_std >=", value, "tSeStd");
            return (Criteria) this;
        }

        public Criteria andTSeStdLessThan(String value) {
            addCriterion("t_se_std <", value, "tSeStd");
            return (Criteria) this;
        }

        public Criteria andTSeStdLessThanOrEqualTo(String value) {
            addCriterion("t_se_std <=", value, "tSeStd");
            return (Criteria) this;
        }

        public Criteria andTSeStdLike(String value) {
            addCriterion("t_se_std like", value, "tSeStd");
            return (Criteria) this;
        }

        public Criteria andTSeStdNotLike(String value) {
            addCriterion("t_se_std not like", value, "tSeStd");
            return (Criteria) this;
        }

        public Criteria andTSeStdIn(List<String> values) {
            addCriterion("t_se_std in", values, "tSeStd");
            return (Criteria) this;
        }

        public Criteria andTSeStdNotIn(List<String> values) {
            addCriterion("t_se_std not in", values, "tSeStd");
            return (Criteria) this;
        }

        public Criteria andTSeStdBetween(String value1, String value2) {
            addCriterion("t_se_std between", value1, value2, "tSeStd");
            return (Criteria) this;
        }

        public Criteria andTSeStdNotBetween(String value1, String value2) {
            addCriterion("t_se_std not between", value1, value2, "tSeStd");
            return (Criteria) this;
        }

        public Criteria andTHgStdIsNull() {
            addCriterion("t_hg_std is null");
            return (Criteria) this;
        }

        public Criteria andTHgStdIsNotNull() {
            addCriterion("t_hg_std is not null");
            return (Criteria) this;
        }

        public Criteria andTHgStdEqualTo(String value) {
            addCriterion("t_hg_std =", value, "tHgStd");
            return (Criteria) this;
        }

        public Criteria andTHgStdNotEqualTo(String value) {
            addCriterion("t_hg_std <>", value, "tHgStd");
            return (Criteria) this;
        }

        public Criteria andTHgStdGreaterThan(String value) {
            addCriterion("t_hg_std >", value, "tHgStd");
            return (Criteria) this;
        }

        public Criteria andTHgStdGreaterThanOrEqualTo(String value) {
            addCriterion("t_hg_std >=", value, "tHgStd");
            return (Criteria) this;
        }

        public Criteria andTHgStdLessThan(String value) {
            addCriterion("t_hg_std <", value, "tHgStd");
            return (Criteria) this;
        }

        public Criteria andTHgStdLessThanOrEqualTo(String value) {
            addCriterion("t_hg_std <=", value, "tHgStd");
            return (Criteria) this;
        }

        public Criteria andTHgStdLike(String value) {
            addCriterion("t_hg_std like", value, "tHgStd");
            return (Criteria) this;
        }

        public Criteria andTHgStdNotLike(String value) {
            addCriterion("t_hg_std not like", value, "tHgStd");
            return (Criteria) this;
        }

        public Criteria andTHgStdIn(List<String> values) {
            addCriterion("t_hg_std in", values, "tHgStd");
            return (Criteria) this;
        }

        public Criteria andTHgStdNotIn(List<String> values) {
            addCriterion("t_hg_std not in", values, "tHgStd");
            return (Criteria) this;
        }

        public Criteria andTHgStdBetween(String value1, String value2) {
            addCriterion("t_hg_std between", value1, value2, "tHgStd");
            return (Criteria) this;
        }

        public Criteria andTHgStdNotBetween(String value1, String value2) {
            addCriterion("t_hg_std not between", value1, value2, "tHgStd");
            return (Criteria) this;
        }

        public Criteria andCr6StdIsNull() {
            addCriterion("cr_6_std is null");
            return (Criteria) this;
        }

        public Criteria andCr6StdIsNotNull() {
            addCriterion("cr_6_std is not null");
            return (Criteria) this;
        }

        public Criteria andCr6StdEqualTo(String value) {
            addCriterion("cr_6_std =", value, "cr6Std");
            return (Criteria) this;
        }

        public Criteria andCr6StdNotEqualTo(String value) {
            addCriterion("cr_6_std <>", value, "cr6Std");
            return (Criteria) this;
        }

        public Criteria andCr6StdGreaterThan(String value) {
            addCriterion("cr_6_std >", value, "cr6Std");
            return (Criteria) this;
        }

        public Criteria andCr6StdGreaterThanOrEqualTo(String value) {
            addCriterion("cr_6_std >=", value, "cr6Std");
            return (Criteria) this;
        }

        public Criteria andCr6StdLessThan(String value) {
            addCriterion("cr_6_std <", value, "cr6Std");
            return (Criteria) this;
        }

        public Criteria andCr6StdLessThanOrEqualTo(String value) {
            addCriterion("cr_6_std <=", value, "cr6Std");
            return (Criteria) this;
        }

        public Criteria andCr6StdLike(String value) {
            addCriterion("cr_6_std like", value, "cr6Std");
            return (Criteria) this;
        }

        public Criteria andCr6StdNotLike(String value) {
            addCriterion("cr_6_std not like", value, "cr6Std");
            return (Criteria) this;
        }

        public Criteria andCr6StdIn(List<String> values) {
            addCriterion("cr_6_std in", values, "cr6Std");
            return (Criteria) this;
        }

        public Criteria andCr6StdNotIn(List<String> values) {
            addCriterion("cr_6_std not in", values, "cr6Std");
            return (Criteria) this;
        }

        public Criteria andCr6StdBetween(String value1, String value2) {
            addCriterion("cr_6_std between", value1, value2, "cr6Std");
            return (Criteria) this;
        }

        public Criteria andCr6StdNotBetween(String value1, String value2) {
            addCriterion("cr_6_std not between", value1, value2, "cr6Std");
            return (Criteria) this;
        }

        public Criteria andFStdIsNull() {
            addCriterion("f_std is null");
            return (Criteria) this;
        }

        public Criteria andFStdIsNotNull() {
            addCriterion("f_std is not null");
            return (Criteria) this;
        }

        public Criteria andFStdEqualTo(String value) {
            addCriterion("f_std =", value, "fStd");
            return (Criteria) this;
        }

        public Criteria andFStdNotEqualTo(String value) {
            addCriterion("f_std <>", value, "fStd");
            return (Criteria) this;
        }

        public Criteria andFStdGreaterThan(String value) {
            addCriterion("f_std >", value, "fStd");
            return (Criteria) this;
        }

        public Criteria andFStdGreaterThanOrEqualTo(String value) {
            addCriterion("f_std >=", value, "fStd");
            return (Criteria) this;
        }

        public Criteria andFStdLessThan(String value) {
            addCriterion("f_std <", value, "fStd");
            return (Criteria) this;
        }

        public Criteria andFStdLessThanOrEqualTo(String value) {
            addCriterion("f_std <=", value, "fStd");
            return (Criteria) this;
        }

        public Criteria andFStdLike(String value) {
            addCriterion("f_std like", value, "fStd");
            return (Criteria) this;
        }

        public Criteria andFStdNotLike(String value) {
            addCriterion("f_std not like", value, "fStd");
            return (Criteria) this;
        }

        public Criteria andFStdIn(List<String> values) {
            addCriterion("f_std in", values, "fStd");
            return (Criteria) this;
        }

        public Criteria andFStdNotIn(List<String> values) {
            addCriterion("f_std not in", values, "fStd");
            return (Criteria) this;
        }

        public Criteria andFStdBetween(String value1, String value2) {
            addCriterion("f_std between", value1, value2, "fStd");
            return (Criteria) this;
        }

        public Criteria andFStdNotBetween(String value1, String value2) {
            addCriterion("f_std not between", value1, value2, "fStd");
            return (Criteria) this;
        }

        public Criteria andCnStdIsNull() {
            addCriterion("cn_std is null");
            return (Criteria) this;
        }

        public Criteria andCnStdIsNotNull() {
            addCriterion("cn_std is not null");
            return (Criteria) this;
        }

        public Criteria andCnStdEqualTo(String value) {
            addCriterion("cn_std =", value, "cnStd");
            return (Criteria) this;
        }

        public Criteria andCnStdNotEqualTo(String value) {
            addCriterion("cn_std <>", value, "cnStd");
            return (Criteria) this;
        }

        public Criteria andCnStdGreaterThan(String value) {
            addCriterion("cn_std >", value, "cnStd");
            return (Criteria) this;
        }

        public Criteria andCnStdGreaterThanOrEqualTo(String value) {
            addCriterion("cn_std >=", value, "cnStd");
            return (Criteria) this;
        }

        public Criteria andCnStdLessThan(String value) {
            addCriterion("cn_std <", value, "cnStd");
            return (Criteria) this;
        }

        public Criteria andCnStdLessThanOrEqualTo(String value) {
            addCriterion("cn_std <=", value, "cnStd");
            return (Criteria) this;
        }

        public Criteria andCnStdLike(String value) {
            addCriterion("cn_std like", value, "cnStd");
            return (Criteria) this;
        }

        public Criteria andCnStdNotLike(String value) {
            addCriterion("cn_std not like", value, "cnStd");
            return (Criteria) this;
        }

        public Criteria andCnStdIn(List<String> values) {
            addCriterion("cn_std in", values, "cnStd");
            return (Criteria) this;
        }

        public Criteria andCnStdNotIn(List<String> values) {
            addCriterion("cn_std not in", values, "cnStd");
            return (Criteria) this;
        }

        public Criteria andCnStdBetween(String value1, String value2) {
            addCriterion("cn_std between", value1, value2, "cnStd");
            return (Criteria) this;
        }

        public Criteria andCnStdNotBetween(String value1, String value2) {
            addCriterion("cn_std not between", value1, value2, "cnStd");
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

        public Criteria andLasStdIsNull() {
            addCriterion("las_std is null");
            return (Criteria) this;
        }

        public Criteria andLasStdIsNotNull() {
            addCriterion("las_std is not null");
            return (Criteria) this;
        }

        public Criteria andLasStdEqualTo(String value) {
            addCriterion("las_std =", value, "lasStd");
            return (Criteria) this;
        }

        public Criteria andLasStdNotEqualTo(String value) {
            addCriterion("las_std <>", value, "lasStd");
            return (Criteria) this;
        }

        public Criteria andLasStdGreaterThan(String value) {
            addCriterion("las_std >", value, "lasStd");
            return (Criteria) this;
        }

        public Criteria andLasStdGreaterThanOrEqualTo(String value) {
            addCriterion("las_std >=", value, "lasStd");
            return (Criteria) this;
        }

        public Criteria andLasStdLessThan(String value) {
            addCriterion("las_std <", value, "lasStd");
            return (Criteria) this;
        }

        public Criteria andLasStdLessThanOrEqualTo(String value) {
            addCriterion("las_std <=", value, "lasStd");
            return (Criteria) this;
        }

        public Criteria andLasStdLike(String value) {
            addCriterion("las_std like", value, "lasStd");
            return (Criteria) this;
        }

        public Criteria andLasStdNotLike(String value) {
            addCriterion("las_std not like", value, "lasStd");
            return (Criteria) this;
        }

        public Criteria andLasStdIn(List<String> values) {
            addCriterion("las_std in", values, "lasStd");
            return (Criteria) this;
        }

        public Criteria andLasStdNotIn(List<String> values) {
            addCriterion("las_std not in", values, "lasStd");
            return (Criteria) this;
        }

        public Criteria andLasStdBetween(String value1, String value2) {
            addCriterion("las_std between", value1, value2, "lasStd");
            return (Criteria) this;
        }

        public Criteria andLasStdNotBetween(String value1, String value2) {
            addCriterion("las_std not between", value1, value2, "lasStd");
            return (Criteria) this;
        }

        public Criteria andS2StdIsNull() {
            addCriterion("s2_std is null");
            return (Criteria) this;
        }

        public Criteria andS2StdIsNotNull() {
            addCriterion("s2_std is not null");
            return (Criteria) this;
        }

        public Criteria andS2StdEqualTo(String value) {
            addCriterion("s2_std =", value, "s2Std");
            return (Criteria) this;
        }

        public Criteria andS2StdNotEqualTo(String value) {
            addCriterion("s2_std <>", value, "s2Std");
            return (Criteria) this;
        }

        public Criteria andS2StdGreaterThan(String value) {
            addCriterion("s2_std >", value, "s2Std");
            return (Criteria) this;
        }

        public Criteria andS2StdGreaterThanOrEqualTo(String value) {
            addCriterion("s2_std >=", value, "s2Std");
            return (Criteria) this;
        }

        public Criteria andS2StdLessThan(String value) {
            addCriterion("s2_std <", value, "s2Std");
            return (Criteria) this;
        }

        public Criteria andS2StdLessThanOrEqualTo(String value) {
            addCriterion("s2_std <=", value, "s2Std");
            return (Criteria) this;
        }

        public Criteria andS2StdLike(String value) {
            addCriterion("s2_std like", value, "s2Std");
            return (Criteria) this;
        }

        public Criteria andS2StdNotLike(String value) {
            addCriterion("s2_std not like", value, "s2Std");
            return (Criteria) this;
        }

        public Criteria andS2StdIn(List<String> values) {
            addCriterion("s2_std in", values, "s2Std");
            return (Criteria) this;
        }

        public Criteria andS2StdNotIn(List<String> values) {
            addCriterion("s2_std not in", values, "s2Std");
            return (Criteria) this;
        }

        public Criteria andS2StdBetween(String value1, String value2) {
            addCriterion("s2_std between", value1, value2, "s2Std");
            return (Criteria) this;
        }

        public Criteria andS2StdNotBetween(String value1, String value2) {
            addCriterion("s2_std not between", value1, value2, "s2Std");
            return (Criteria) this;
        }

        public Criteria andChlaStdIsNull() {
            addCriterion("chla_std is null");
            return (Criteria) this;
        }

        public Criteria andChlaStdIsNotNull() {
            addCriterion("chla_std is not null");
            return (Criteria) this;
        }

        public Criteria andChlaStdEqualTo(String value) {
            addCriterion("chla_std =", value, "chlaStd");
            return (Criteria) this;
        }

        public Criteria andChlaStdNotEqualTo(String value) {
            addCriterion("chla_std <>", value, "chlaStd");
            return (Criteria) this;
        }

        public Criteria andChlaStdGreaterThan(String value) {
            addCriterion("chla_std >", value, "chlaStd");
            return (Criteria) this;
        }

        public Criteria andChlaStdGreaterThanOrEqualTo(String value) {
            addCriterion("chla_std >=", value, "chlaStd");
            return (Criteria) this;
        }

        public Criteria andChlaStdLessThan(String value) {
            addCriterion("chla_std <", value, "chlaStd");
            return (Criteria) this;
        }

        public Criteria andChlaStdLessThanOrEqualTo(String value) {
            addCriterion("chla_std <=", value, "chlaStd");
            return (Criteria) this;
        }

        public Criteria andChlaStdLike(String value) {
            addCriterion("chla_std like", value, "chlaStd");
            return (Criteria) this;
        }

        public Criteria andChlaStdNotLike(String value) {
            addCriterion("chla_std not like", value, "chlaStd");
            return (Criteria) this;
        }

        public Criteria andChlaStdIn(List<String> values) {
            addCriterion("chla_std in", values, "chlaStd");
            return (Criteria) this;
        }

        public Criteria andChlaStdNotIn(List<String> values) {
            addCriterion("chla_std not in", values, "chlaStd");
            return (Criteria) this;
        }

        public Criteria andChlaStdBetween(String value1, String value2) {
            addCriterion("chla_std between", value1, value2, "chlaStd");
            return (Criteria) this;
        }

        public Criteria andChlaStdNotBetween(String value1, String value2) {
            addCriterion("chla_std not between", value1, value2, "chlaStd");
            return (Criteria) this;
        }

        public Criteria andNo3StdIsNull() {
            addCriterion("no3_std is null");
            return (Criteria) this;
        }

        public Criteria andNo3StdIsNotNull() {
            addCriterion("no3_std is not null");
            return (Criteria) this;
        }

        public Criteria andNo3StdEqualTo(String value) {
            addCriterion("no3_std =", value, "no3Std");
            return (Criteria) this;
        }

        public Criteria andNo3StdNotEqualTo(String value) {
            addCriterion("no3_std <>", value, "no3Std");
            return (Criteria) this;
        }

        public Criteria andNo3StdGreaterThan(String value) {
            addCriterion("no3_std >", value, "no3Std");
            return (Criteria) this;
        }

        public Criteria andNo3StdGreaterThanOrEqualTo(String value) {
            addCriterion("no3_std >=", value, "no3Std");
            return (Criteria) this;
        }

        public Criteria andNo3StdLessThan(String value) {
            addCriterion("no3_std <", value, "no3Std");
            return (Criteria) this;
        }

        public Criteria andNo3StdLessThanOrEqualTo(String value) {
            addCriterion("no3_std <=", value, "no3Std");
            return (Criteria) this;
        }

        public Criteria andNo3StdLike(String value) {
            addCriterion("no3_std like", value, "no3Std");
            return (Criteria) this;
        }

        public Criteria andNo3StdNotLike(String value) {
            addCriterion("no3_std not like", value, "no3Std");
            return (Criteria) this;
        }

        public Criteria andNo3StdIn(List<String> values) {
            addCriterion("no3_std in", values, "no3Std");
            return (Criteria) this;
        }

        public Criteria andNo3StdNotIn(List<String> values) {
            addCriterion("no3_std not in", values, "no3Std");
            return (Criteria) this;
        }

        public Criteria andNo3StdBetween(String value1, String value2) {
            addCriterion("no3_std between", value1, value2, "no3Std");
            return (Criteria) this;
        }

        public Criteria andNo3StdNotBetween(String value1, String value2) {
            addCriterion("no3_std not between", value1, value2, "no3Std");
            return (Criteria) this;
        }

        public Criteria andNo2StdIsNull() {
            addCriterion("no2_std is null");
            return (Criteria) this;
        }

        public Criteria andNo2StdIsNotNull() {
            addCriterion("no2_std is not null");
            return (Criteria) this;
        }

        public Criteria andNo2StdEqualTo(String value) {
            addCriterion("no2_std =", value, "no2Std");
            return (Criteria) this;
        }

        public Criteria andNo2StdNotEqualTo(String value) {
            addCriterion("no2_std <>", value, "no2Std");
            return (Criteria) this;
        }

        public Criteria andNo2StdGreaterThan(String value) {
            addCriterion("no2_std >", value, "no2Std");
            return (Criteria) this;
        }

        public Criteria andNo2StdGreaterThanOrEqualTo(String value) {
            addCriterion("no2_std >=", value, "no2Std");
            return (Criteria) this;
        }

        public Criteria andNo2StdLessThan(String value) {
            addCriterion("no2_std <", value, "no2Std");
            return (Criteria) this;
        }

        public Criteria andNo2StdLessThanOrEqualTo(String value) {
            addCriterion("no2_std <=", value, "no2Std");
            return (Criteria) this;
        }

        public Criteria andNo2StdLike(String value) {
            addCriterion("no2_std like", value, "no2Std");
            return (Criteria) this;
        }

        public Criteria andNo2StdNotLike(String value) {
            addCriterion("no2_std not like", value, "no2Std");
            return (Criteria) this;
        }

        public Criteria andNo2StdIn(List<String> values) {
            addCriterion("no2_std in", values, "no2Std");
            return (Criteria) this;
        }

        public Criteria andNo2StdNotIn(List<String> values) {
            addCriterion("no2_std not in", values, "no2Std");
            return (Criteria) this;
        }

        public Criteria andNo2StdBetween(String value1, String value2) {
            addCriterion("no2_std between", value1, value2, "no2Std");
            return (Criteria) this;
        }

        public Criteria andNo2StdNotBetween(String value1, String value2) {
            addCriterion("no2_std not between", value1, value2, "no2Std");
            return (Criteria) this;
        }

        public Criteria andLlStdIsNull() {
            addCriterion("ll_std is null");
            return (Criteria) this;
        }

        public Criteria andLlStdIsNotNull() {
            addCriterion("ll_std is not null");
            return (Criteria) this;
        }

        public Criteria andLlStdEqualTo(String value) {
            addCriterion("ll_std =", value, "llStd");
            return (Criteria) this;
        }

        public Criteria andLlStdNotEqualTo(String value) {
            addCriterion("ll_std <>", value, "llStd");
            return (Criteria) this;
        }

        public Criteria andLlStdGreaterThan(String value) {
            addCriterion("ll_std >", value, "llStd");
            return (Criteria) this;
        }

        public Criteria andLlStdGreaterThanOrEqualTo(String value) {
            addCriterion("ll_std >=", value, "llStd");
            return (Criteria) this;
        }

        public Criteria andLlStdLessThan(String value) {
            addCriterion("ll_std <", value, "llStd");
            return (Criteria) this;
        }

        public Criteria andLlStdLessThanOrEqualTo(String value) {
            addCriterion("ll_std <=", value, "llStd");
            return (Criteria) this;
        }

        public Criteria andLlStdLike(String value) {
            addCriterion("ll_std like", value, "llStd");
            return (Criteria) this;
        }

        public Criteria andLlStdNotLike(String value) {
            addCriterion("ll_std not like", value, "llStd");
            return (Criteria) this;
        }

        public Criteria andLlStdIn(List<String> values) {
            addCriterion("ll_std in", values, "llStd");
            return (Criteria) this;
        }

        public Criteria andLlStdNotIn(List<String> values) {
            addCriterion("ll_std not in", values, "llStd");
            return (Criteria) this;
        }

        public Criteria andLlStdBetween(String value1, String value2) {
            addCriterion("ll_std between", value1, value2, "llStd");
            return (Criteria) this;
        }

        public Criteria andLlStdNotBetween(String value1, String value2) {
            addCriterion("ll_std not between", value1, value2, "llStd");
            return (Criteria) this;
        }

        public Criteria andSwStdIsNull() {
            addCriterion("sw_std is null");
            return (Criteria) this;
        }

        public Criteria andSwStdIsNotNull() {
            addCriterion("sw_std is not null");
            return (Criteria) this;
        }

        public Criteria andSwStdEqualTo(String value) {
            addCriterion("sw_std =", value, "swStd");
            return (Criteria) this;
        }

        public Criteria andSwStdNotEqualTo(String value) {
            addCriterion("sw_std <>", value, "swStd");
            return (Criteria) this;
        }

        public Criteria andSwStdGreaterThan(String value) {
            addCriterion("sw_std >", value, "swStd");
            return (Criteria) this;
        }

        public Criteria andSwStdGreaterThanOrEqualTo(String value) {
            addCriterion("sw_std >=", value, "swStd");
            return (Criteria) this;
        }

        public Criteria andSwStdLessThan(String value) {
            addCriterion("sw_std <", value, "swStd");
            return (Criteria) this;
        }

        public Criteria andSwStdLessThanOrEqualTo(String value) {
            addCriterion("sw_std <=", value, "swStd");
            return (Criteria) this;
        }

        public Criteria andSwStdLike(String value) {
            addCriterion("sw_std like", value, "swStd");
            return (Criteria) this;
        }

        public Criteria andSwStdNotLike(String value) {
            addCriterion("sw_std not like", value, "swStd");
            return (Criteria) this;
        }

        public Criteria andSwStdIn(List<String> values) {
            addCriterion("sw_std in", values, "swStd");
            return (Criteria) this;
        }

        public Criteria andSwStdNotIn(List<String> values) {
            addCriterion("sw_std not in", values, "swStd");
            return (Criteria) this;
        }

        public Criteria andSwStdBetween(String value1, String value2) {
            addCriterion("sw_std between", value1, value2, "swStd");
            return (Criteria) this;
        }

        public Criteria andSwStdNotBetween(String value1, String value2) {
            addCriterion("sw_std not between", value1, value2, "swStd");
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