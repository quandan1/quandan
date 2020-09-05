package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class ControlUnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ControlUnitExample() {
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

        public Criteria andUnitNameIsNull() {
            addCriterion("unit_name is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("unit_name =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("unit_name <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("unit_name >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("unit_name >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("unit_name <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("unit_name <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("unit_name like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("unit_name not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("unit_name in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("unit_name not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("unit_name between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("unit_name not between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionIsNull() {
            addCriterion("include_section is null");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionIsNotNull() {
            addCriterion("include_section is not null");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionEqualTo(String value) {
            addCriterion("include_section =", value, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionNotEqualTo(String value) {
            addCriterion("include_section <>", value, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionGreaterThan(String value) {
            addCriterion("include_section >", value, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionGreaterThanOrEqualTo(String value) {
            addCriterion("include_section >=", value, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionLessThan(String value) {
            addCriterion("include_section <", value, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionLessThanOrEqualTo(String value) {
            addCriterion("include_section <=", value, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionLike(String value) {
            addCriterion("include_section like", value, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionNotLike(String value) {
            addCriterion("include_section not like", value, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionIn(List<String> values) {
            addCriterion("include_section in", values, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionNotIn(List<String> values) {
            addCriterion("include_section not in", values, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionBetween(String value1, String value2) {
            addCriterion("include_section between", value1, value2, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionNotBetween(String value1, String value2) {
            addCriterion("include_section not between", value1, value2, "includeSection");
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

        public Criteria andInvolveCityIsNull() {
            addCriterion("involve_city is null");
            return (Criteria) this;
        }

        public Criteria andInvolveCityIsNotNull() {
            addCriterion("involve_city is not null");
            return (Criteria) this;
        }

        public Criteria andInvolveCityEqualTo(String value) {
            addCriterion("involve_city =", value, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityNotEqualTo(String value) {
            addCriterion("involve_city <>", value, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityGreaterThan(String value) {
            addCriterion("involve_city >", value, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityGreaterThanOrEqualTo(String value) {
            addCriterion("involve_city >=", value, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityLessThan(String value) {
            addCriterion("involve_city <", value, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityLessThanOrEqualTo(String value) {
            addCriterion("involve_city <=", value, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityLike(String value) {
            addCriterion("involve_city like", value, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityNotLike(String value) {
            addCriterion("involve_city not like", value, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityIn(List<String> values) {
            addCriterion("involve_city in", values, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityNotIn(List<String> values) {
            addCriterion("involve_city not in", values, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityBetween(String value1, String value2) {
            addCriterion("involve_city between", value1, value2, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityNotBetween(String value1, String value2) {
            addCriterion("involve_city not between", value1, value2, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyIsNull() {
            addCriterion("involve_county is null");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyIsNotNull() {
            addCriterion("involve_county is not null");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyEqualTo(String value) {
            addCriterion("involve_county =", value, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyNotEqualTo(String value) {
            addCriterion("involve_county <>", value, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyGreaterThan(String value) {
            addCriterion("involve_county >", value, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyGreaterThanOrEqualTo(String value) {
            addCriterion("involve_county >=", value, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyLessThan(String value) {
            addCriterion("involve_county <", value, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyLessThanOrEqualTo(String value) {
            addCriterion("involve_county <=", value, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyLike(String value) {
            addCriterion("involve_county like", value, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyNotLike(String value) {
            addCriterion("involve_county not like", value, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyIn(List<String> values) {
            addCriterion("involve_county in", values, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyNotIn(List<String> values) {
            addCriterion("involve_county not in", values, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyBetween(String value1, String value2) {
            addCriterion("involve_county between", value1, value2, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyNotBetween(String value1, String value2) {
            addCriterion("involve_county not between", value1, value2, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageIsNull() {
            addCriterion("involve_village is null");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageIsNotNull() {
            addCriterion("involve_village is not null");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageEqualTo(String value) {
            addCriterion("involve_village =", value, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageNotEqualTo(String value) {
            addCriterion("involve_village <>", value, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageGreaterThan(String value) {
            addCriterion("involve_village >", value, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageGreaterThanOrEqualTo(String value) {
            addCriterion("involve_village >=", value, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageLessThan(String value) {
            addCriterion("involve_village <", value, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageLessThanOrEqualTo(String value) {
            addCriterion("involve_village <=", value, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageLike(String value) {
            addCriterion("involve_village like", value, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageNotLike(String value) {
            addCriterion("involve_village not like", value, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageIn(List<String> values) {
            addCriterion("involve_village in", values, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageNotIn(List<String> values) {
            addCriterion("involve_village not in", values, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageBetween(String value1, String value2) {
            addCriterion("involve_village between", value1, value2, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageNotBetween(String value1, String value2) {
            addCriterion("involve_village not between", value1, value2, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andVillageAmountIsNull() {
            addCriterion("village_amount is null");
            return (Criteria) this;
        }

        public Criteria andVillageAmountIsNotNull() {
            addCriterion("village_amount is not null");
            return (Criteria) this;
        }

        public Criteria andVillageAmountEqualTo(Integer value) {
            addCriterion("village_amount =", value, "villageAmount");
            return (Criteria) this;
        }

        public Criteria andVillageAmountNotEqualTo(Integer value) {
            addCriterion("village_amount <>", value, "villageAmount");
            return (Criteria) this;
        }

        public Criteria andVillageAmountGreaterThan(Integer value) {
            addCriterion("village_amount >", value, "villageAmount");
            return (Criteria) this;
        }

        public Criteria andVillageAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("village_amount >=", value, "villageAmount");
            return (Criteria) this;
        }

        public Criteria andVillageAmountLessThan(Integer value) {
            addCriterion("village_amount <", value, "villageAmount");
            return (Criteria) this;
        }

        public Criteria andVillageAmountLessThanOrEqualTo(Integer value) {
            addCriterion("village_amount <=", value, "villageAmount");
            return (Criteria) this;
        }

        public Criteria andVillageAmountIn(List<Integer> values) {
            addCriterion("village_amount in", values, "villageAmount");
            return (Criteria) this;
        }

        public Criteria andVillageAmountNotIn(List<Integer> values) {
            addCriterion("village_amount not in", values, "villageAmount");
            return (Criteria) this;
        }

        public Criteria andVillageAmountBetween(Integer value1, Integer value2) {
            addCriterion("village_amount between", value1, value2, "villageAmount");
            return (Criteria) this;
        }

        public Criteria andVillageAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("village_amount not between", value1, value2, "villageAmount");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverIsNull() {
            addCriterion("involve_river is null");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverIsNotNull() {
            addCriterion("involve_river is not null");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverEqualTo(String value) {
            addCriterion("involve_river =", value, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverNotEqualTo(String value) {
            addCriterion("involve_river <>", value, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverGreaterThan(String value) {
            addCriterion("involve_river >", value, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverGreaterThanOrEqualTo(String value) {
            addCriterion("involve_river >=", value, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverLessThan(String value) {
            addCriterion("involve_river <", value, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverLessThanOrEqualTo(String value) {
            addCriterion("involve_river <=", value, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverLike(String value) {
            addCriterion("involve_river like", value, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverNotLike(String value) {
            addCriterion("involve_river not like", value, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverIn(List<String> values) {
            addCriterion("involve_river in", values, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverNotIn(List<String> values) {
            addCriterion("involve_river not in", values, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverBetween(String value1, String value2) {
            addCriterion("involve_river between", value1, value2, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverNotBetween(String value1, String value2) {
            addCriterion("involve_river not between", value1, value2, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIsNull() {
            addCriterion("unit_type is null");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIsNotNull() {
            addCriterion("unit_type is not null");
            return (Criteria) this;
        }

        public Criteria andUnitTypeEqualTo(String value) {
            addCriterion("unit_type =", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotEqualTo(String value) {
            addCriterion("unit_type <>", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeGreaterThan(String value) {
            addCriterion("unit_type >", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("unit_type >=", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLessThan(String value) {
            addCriterion("unit_type <", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLessThanOrEqualTo(String value) {
            addCriterion("unit_type <=", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLike(String value) {
            addCriterion("unit_type like", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotLike(String value) {
            addCriterion("unit_type not like", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIn(List<String> values) {
            addCriterion("unit_type in", values, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotIn(List<String> values) {
            addCriterion("unit_type not in", values, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeBetween(String value1, String value2) {
            addCriterion("unit_type between", value1, value2, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotBetween(String value1, String value2) {
            addCriterion("unit_type not between", value1, value2, "unitType");
            return (Criteria) this;
        }

        public Criteria andWaterResourceIsNull() {
            addCriterion("water_resource is null");
            return (Criteria) this;
        }

        public Criteria andWaterResourceIsNotNull() {
            addCriterion("water_resource is not null");
            return (Criteria) this;
        }

        public Criteria andWaterResourceEqualTo(String value) {
            addCriterion("water_resource =", value, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceNotEqualTo(String value) {
            addCriterion("water_resource <>", value, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceGreaterThan(String value) {
            addCriterion("water_resource >", value, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceGreaterThanOrEqualTo(String value) {
            addCriterion("water_resource >=", value, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceLessThan(String value) {
            addCriterion("water_resource <", value, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceLessThanOrEqualTo(String value) {
            addCriterion("water_resource <=", value, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceLike(String value) {
            addCriterion("water_resource like", value, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceNotLike(String value) {
            addCriterion("water_resource not like", value, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceIn(List<String> values) {
            addCriterion("water_resource in", values, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceNotIn(List<String> values) {
            addCriterion("water_resource not in", values, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceBetween(String value1, String value2) {
            addCriterion("water_resource between", value1, value2, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceNotBetween(String value1, String value2) {
            addCriterion("water_resource not between", value1, value2, "waterResource");
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

        public Criteria andHrRiverIsNull() {
            addCriterion("hr_river is null");
            return (Criteria) this;
        }

        public Criteria andHrRiverIsNotNull() {
            addCriterion("hr_river is not null");
            return (Criteria) this;
        }

        public Criteria andHrRiverEqualTo(String value) {
            addCriterion("hr_river =", value, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverNotEqualTo(String value) {
            addCriterion("hr_river <>", value, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverGreaterThan(String value) {
            addCriterion("hr_river >", value, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverGreaterThanOrEqualTo(String value) {
            addCriterion("hr_river >=", value, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverLessThan(String value) {
            addCriterion("hr_river <", value, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverLessThanOrEqualTo(String value) {
            addCriterion("hr_river <=", value, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverLike(String value) {
            addCriterion("hr_river like", value, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverNotLike(String value) {
            addCriterion("hr_river not like", value, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverIn(List<String> values) {
            addCriterion("hr_river in", values, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverNotIn(List<String> values) {
            addCriterion("hr_river not in", values, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverBetween(String value1, String value2) {
            addCriterion("hr_river between", value1, value2, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverNotBetween(String value1, String value2) {
            addCriterion("hr_river not between", value1, value2, "hrRiver");
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