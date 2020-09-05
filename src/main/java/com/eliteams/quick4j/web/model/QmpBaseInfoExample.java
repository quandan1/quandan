package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class QmpBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QmpBaseInfoExample() {
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

        public Criteria andYkh108IsNull() {
            addCriterion("ykh_108 is null");
            return (Criteria) this;
        }

        public Criteria andYkh108IsNotNull() {
            addCriterion("ykh_108 is not null");
            return (Criteria) this;
        }

        public Criteria andYkh108EqualTo(String value) {
            addCriterion("ykh_108 =", value, "ykh108");
            return (Criteria) this;
        }

        public Criteria andYkh108NotEqualTo(String value) {
            addCriterion("ykh_108 <>", value, "ykh108");
            return (Criteria) this;
        }

        public Criteria andYkh108GreaterThan(String value) {
            addCriterion("ykh_108 >", value, "ykh108");
            return (Criteria) this;
        }

        public Criteria andYkh108GreaterThanOrEqualTo(String value) {
            addCriterion("ykh_108 >=", value, "ykh108");
            return (Criteria) this;
        }

        public Criteria andYkh108LessThan(String value) {
            addCriterion("ykh_108 <", value, "ykh108");
            return (Criteria) this;
        }

        public Criteria andYkh108LessThanOrEqualTo(String value) {
            addCriterion("ykh_108 <=", value, "ykh108");
            return (Criteria) this;
        }

        public Criteria andYkh108Like(String value) {
            addCriterion("ykh_108 like", value, "ykh108");
            return (Criteria) this;
        }

        public Criteria andYkh108NotLike(String value) {
            addCriterion("ykh_108 not like", value, "ykh108");
            return (Criteria) this;
        }

        public Criteria andYkh108In(List<String> values) {
            addCriterion("ykh_108 in", values, "ykh108");
            return (Criteria) this;
        }

        public Criteria andYkh108NotIn(List<String> values) {
            addCriterion("ykh_108 not in", values, "ykh108");
            return (Criteria) this;
        }

        public Criteria andYkh108Between(String value1, String value2) {
            addCriterion("ykh_108 between", value1, value2, "ykh108");
            return (Criteria) this;
        }

        public Criteria andYkh108NotBetween(String value1, String value2) {
            addCriterion("ykh_108 not between", value1, value2, "ykh108");
            return (Criteria) this;
        }

        public Criteria andHlsz90IsNull() {
            addCriterion("hlsz_90 is null");
            return (Criteria) this;
        }

        public Criteria andHlsz90IsNotNull() {
            addCriterion("hlsz_90 is not null");
            return (Criteria) this;
        }

        public Criteria andHlsz90EqualTo(String value) {
            addCriterion("hlsz_90 =", value, "hlsz90");
            return (Criteria) this;
        }

        public Criteria andHlsz90NotEqualTo(String value) {
            addCriterion("hlsz_90 <>", value, "hlsz90");
            return (Criteria) this;
        }

        public Criteria andHlsz90GreaterThan(String value) {
            addCriterion("hlsz_90 >", value, "hlsz90");
            return (Criteria) this;
        }

        public Criteria andHlsz90GreaterThanOrEqualTo(String value) {
            addCriterion("hlsz_90 >=", value, "hlsz90");
            return (Criteria) this;
        }

        public Criteria andHlsz90LessThan(String value) {
            addCriterion("hlsz_90 <", value, "hlsz90");
            return (Criteria) this;
        }

        public Criteria andHlsz90LessThanOrEqualTo(String value) {
            addCriterion("hlsz_90 <=", value, "hlsz90");
            return (Criteria) this;
        }

        public Criteria andHlsz90Like(String value) {
            addCriterion("hlsz_90 like", value, "hlsz90");
            return (Criteria) this;
        }

        public Criteria andHlsz90NotLike(String value) {
            addCriterion("hlsz_90 not like", value, "hlsz90");
            return (Criteria) this;
        }

        public Criteria andHlsz90In(List<String> values) {
            addCriterion("hlsz_90 in", values, "hlsz90");
            return (Criteria) this;
        }

        public Criteria andHlsz90NotIn(List<String> values) {
            addCriterion("hlsz_90 not in", values, "hlsz90");
            return (Criteria) this;
        }

        public Criteria andHlsz90Between(String value1, String value2) {
            addCriterion("hlsz_90 between", value1, value2, "hlsz90");
            return (Criteria) this;
        }

        public Criteria andHlsz90NotBetween(String value1, String value2) {
            addCriterion("hlsz_90 not between", value1, value2, "hlsz90");
            return (Criteria) this;
        }

        public Criteria andOriginalIdIsNull() {
            addCriterion("original_id is null");
            return (Criteria) this;
        }

        public Criteria andOriginalIdIsNotNull() {
            addCriterion("original_id is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalIdEqualTo(String value) {
            addCriterion("original_id =", value, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdNotEqualTo(String value) {
            addCriterion("original_id <>", value, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdGreaterThan(String value) {
            addCriterion("original_id >", value, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdGreaterThanOrEqualTo(String value) {
            addCriterion("original_id >=", value, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdLessThan(String value) {
            addCriterion("original_id <", value, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdLessThanOrEqualTo(String value) {
            addCriterion("original_id <=", value, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdLike(String value) {
            addCriterion("original_id like", value, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdNotLike(String value) {
            addCriterion("original_id not like", value, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdIn(List<String> values) {
            addCriterion("original_id in", values, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdNotIn(List<String> values) {
            addCriterion("original_id not in", values, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdBetween(String value1, String value2) {
            addCriterion("original_id between", value1, value2, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdNotBetween(String value1, String value2) {
            addCriterion("original_id not between", value1, value2, "originalId");
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

        public Criteria andLocDistrictIsNull() {
            addCriterion("loc_district is null");
            return (Criteria) this;
        }

        public Criteria andLocDistrictIsNotNull() {
            addCriterion("loc_district is not null");
            return (Criteria) this;
        }

        public Criteria andLocDistrictEqualTo(String value) {
            addCriterion("loc_district =", value, "locDistrict");
            return (Criteria) this;
        }

        public Criteria andLocDistrictNotEqualTo(String value) {
            addCriterion("loc_district <>", value, "locDistrict");
            return (Criteria) this;
        }

        public Criteria andLocDistrictGreaterThan(String value) {
            addCriterion("loc_district >", value, "locDistrict");
            return (Criteria) this;
        }

        public Criteria andLocDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("loc_district >=", value, "locDistrict");
            return (Criteria) this;
        }

        public Criteria andLocDistrictLessThan(String value) {
            addCriterion("loc_district <", value, "locDistrict");
            return (Criteria) this;
        }

        public Criteria andLocDistrictLessThanOrEqualTo(String value) {
            addCriterion("loc_district <=", value, "locDistrict");
            return (Criteria) this;
        }

        public Criteria andLocDistrictLike(String value) {
            addCriterion("loc_district like", value, "locDistrict");
            return (Criteria) this;
        }

        public Criteria andLocDistrictNotLike(String value) {
            addCriterion("loc_district not like", value, "locDistrict");
            return (Criteria) this;
        }

        public Criteria andLocDistrictIn(List<String> values) {
            addCriterion("loc_district in", values, "locDistrict");
            return (Criteria) this;
        }

        public Criteria andLocDistrictNotIn(List<String> values) {
            addCriterion("loc_district not in", values, "locDistrict");
            return (Criteria) this;
        }

        public Criteria andLocDistrictBetween(String value1, String value2) {
            addCriterion("loc_district between", value1, value2, "locDistrict");
            return (Criteria) this;
        }

        public Criteria andLocDistrictNotBetween(String value1, String value2) {
            addCriterion("loc_district not between", value1, value2, "locDistrict");
            return (Criteria) this;
        }

        public Criteria andCzNameIsNull() {
            addCriterion("cz_name is null");
            return (Criteria) this;
        }

        public Criteria andCzNameIsNotNull() {
            addCriterion("cz_name is not null");
            return (Criteria) this;
        }

        public Criteria andCzNameEqualTo(String value) {
            addCriterion("cz_name =", value, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameNotEqualTo(String value) {
            addCriterion("cz_name <>", value, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameGreaterThan(String value) {
            addCriterion("cz_name >", value, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameGreaterThanOrEqualTo(String value) {
            addCriterion("cz_name >=", value, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameLessThan(String value) {
            addCriterion("cz_name <", value, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameLessThanOrEqualTo(String value) {
            addCriterion("cz_name <=", value, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameLike(String value) {
            addCriterion("cz_name like", value, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameNotLike(String value) {
            addCriterion("cz_name not like", value, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameIn(List<String> values) {
            addCriterion("cz_name in", values, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameNotIn(List<String> values) {
            addCriterion("cz_name not in", values, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameBetween(String value1, String value2) {
            addCriterion("cz_name between", value1, value2, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameNotBetween(String value1, String value2) {
            addCriterion("cz_name not between", value1, value2, "czName");
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

        public Criteria andBasinIsNull() {
            addCriterion("basin is null");
            return (Criteria) this;
        }

        public Criteria andBasinIsNotNull() {
            addCriterion("basin is not null");
            return (Criteria) this;
        }

        public Criteria andBasinEqualTo(String value) {
            addCriterion("basin =", value, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinNotEqualTo(String value) {
            addCriterion("basin <>", value, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinGreaterThan(String value) {
            addCriterion("basin >", value, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinGreaterThanOrEqualTo(String value) {
            addCriterion("basin >=", value, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinLessThan(String value) {
            addCriterion("basin <", value, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinLessThanOrEqualTo(String value) {
            addCriterion("basin <=", value, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinLike(String value) {
            addCriterion("basin like", value, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinNotLike(String value) {
            addCriterion("basin not like", value, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinIn(List<String> values) {
            addCriterion("basin in", values, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinNotIn(List<String> values) {
            addCriterion("basin not in", values, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinBetween(String value1, String value2) {
            addCriterion("basin between", value1, value2, "basin");
            return (Criteria) this;
        }

        public Criteria andBasinNotBetween(String value1, String value2) {
            addCriterion("basin not between", value1, value2, "basin");
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

        public Criteria andSectionSxIsNull() {
            addCriterion("section_sx is null");
            return (Criteria) this;
        }

        public Criteria andSectionSxIsNotNull() {
            addCriterion("section_sx is not null");
            return (Criteria) this;
        }

        public Criteria andSectionSxEqualTo(String value) {
            addCriterion("section_sx =", value, "sectionSx");
            return (Criteria) this;
        }

        public Criteria andSectionSxNotEqualTo(String value) {
            addCriterion("section_sx <>", value, "sectionSx");
            return (Criteria) this;
        }

        public Criteria andSectionSxGreaterThan(String value) {
            addCriterion("section_sx >", value, "sectionSx");
            return (Criteria) this;
        }

        public Criteria andSectionSxGreaterThanOrEqualTo(String value) {
            addCriterion("section_sx >=", value, "sectionSx");
            return (Criteria) this;
        }

        public Criteria andSectionSxLessThan(String value) {
            addCriterion("section_sx <", value, "sectionSx");
            return (Criteria) this;
        }

        public Criteria andSectionSxLessThanOrEqualTo(String value) {
            addCriterion("section_sx <=", value, "sectionSx");
            return (Criteria) this;
        }

        public Criteria andSectionSxLike(String value) {
            addCriterion("section_sx like", value, "sectionSx");
            return (Criteria) this;
        }

        public Criteria andSectionSxNotLike(String value) {
            addCriterion("section_sx not like", value, "sectionSx");
            return (Criteria) this;
        }

        public Criteria andSectionSxIn(List<String> values) {
            addCriterion("section_sx in", values, "sectionSx");
            return (Criteria) this;
        }

        public Criteria andSectionSxNotIn(List<String> values) {
            addCriterion("section_sx not in", values, "sectionSx");
            return (Criteria) this;
        }

        public Criteria andSectionSxBetween(String value1, String value2) {
            addCriterion("section_sx between", value1, value2, "sectionSx");
            return (Criteria) this;
        }

        public Criteria andSectionSxNotBetween(String value1, String value2) {
            addCriterion("section_sx not between", value1, value2, "sectionSx");
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

        public Criteria andSkskIsNull() {
            addCriterion("sksk is null");
            return (Criteria) this;
        }

        public Criteria andSkskIsNotNull() {
            addCriterion("sksk is not null");
            return (Criteria) this;
        }

        public Criteria andSkskEqualTo(String value) {
            addCriterion("sksk =", value, "sksk");
            return (Criteria) this;
        }

        public Criteria andSkskNotEqualTo(String value) {
            addCriterion("sksk <>", value, "sksk");
            return (Criteria) this;
        }

        public Criteria andSkskGreaterThan(String value) {
            addCriterion("sksk >", value, "sksk");
            return (Criteria) this;
        }

        public Criteria andSkskGreaterThanOrEqualTo(String value) {
            addCriterion("sksk >=", value, "sksk");
            return (Criteria) this;
        }

        public Criteria andSkskLessThan(String value) {
            addCriterion("sksk <", value, "sksk");
            return (Criteria) this;
        }

        public Criteria andSkskLessThanOrEqualTo(String value) {
            addCriterion("sksk <=", value, "sksk");
            return (Criteria) this;
        }

        public Criteria andSkskLike(String value) {
            addCriterion("sksk like", value, "sksk");
            return (Criteria) this;
        }

        public Criteria andSkskNotLike(String value) {
            addCriterion("sksk not like", value, "sksk");
            return (Criteria) this;
        }

        public Criteria andSkskIn(List<String> values) {
            addCriterion("sksk in", values, "sksk");
            return (Criteria) this;
        }

        public Criteria andSkskNotIn(List<String> values) {
            addCriterion("sksk not in", values, "sksk");
            return (Criteria) this;
        }

        public Criteria andSkskBetween(String value1, String value2) {
            addCriterion("sksk between", value1, value2, "sksk");
            return (Criteria) this;
        }

        public Criteria andSkskNotBetween(String value1, String value2) {
            addCriterion("sksk not between", value1, value2, "sksk");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
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