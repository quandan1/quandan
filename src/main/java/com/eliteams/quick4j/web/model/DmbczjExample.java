package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class DmbczjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmbczjExample() {
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

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
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

        public Criteria andObjective2018IsNull() {
            addCriterion("objective_2018 is null");
            return (Criteria) this;
        }

        public Criteria andObjective2018IsNotNull() {
            addCriterion("objective_2018 is not null");
            return (Criteria) this;
        }

        public Criteria andObjective2018EqualTo(String value) {
            addCriterion("objective_2018 =", value, "objective2018");
            return (Criteria) this;
        }

        public Criteria andObjective2018NotEqualTo(String value) {
            addCriterion("objective_2018 <>", value, "objective2018");
            return (Criteria) this;
        }

        public Criteria andObjective2018GreaterThan(String value) {
            addCriterion("objective_2018 >", value, "objective2018");
            return (Criteria) this;
        }

        public Criteria andObjective2018GreaterThanOrEqualTo(String value) {
            addCriterion("objective_2018 >=", value, "objective2018");
            return (Criteria) this;
        }

        public Criteria andObjective2018LessThan(String value) {
            addCriterion("objective_2018 <", value, "objective2018");
            return (Criteria) this;
        }

        public Criteria andObjective2018LessThanOrEqualTo(String value) {
            addCriterion("objective_2018 <=", value, "objective2018");
            return (Criteria) this;
        }

        public Criteria andObjective2018Like(String value) {
            addCriterion("objective_2018 like", value, "objective2018");
            return (Criteria) this;
        }

        public Criteria andObjective2018NotLike(String value) {
            addCriterion("objective_2018 not like", value, "objective2018");
            return (Criteria) this;
        }

        public Criteria andObjective2018In(List<String> values) {
            addCriterion("objective_2018 in", values, "objective2018");
            return (Criteria) this;
        }

        public Criteria andObjective2018NotIn(List<String> values) {
            addCriterion("objective_2018 not in", values, "objective2018");
            return (Criteria) this;
        }

        public Criteria andObjective2018Between(String value1, String value2) {
            addCriterion("objective_2018 between", value1, value2, "objective2018");
            return (Criteria) this;
        }

        public Criteria andObjective2018NotBetween(String value1, String value2) {
            addCriterion("objective_2018 not between", value1, value2, "objective2018");
            return (Criteria) this;
        }

        public Criteria andSzlbIsNull() {
            addCriterion("szlb is null");
            return (Criteria) this;
        }

        public Criteria andSzlbIsNotNull() {
            addCriterion("szlb is not null");
            return (Criteria) this;
        }

        public Criteria andSzlbEqualTo(String value) {
            addCriterion("szlb =", value, "szlb");
            return (Criteria) this;
        }

        public Criteria andSzlbNotEqualTo(String value) {
            addCriterion("szlb <>", value, "szlb");
            return (Criteria) this;
        }

        public Criteria andSzlbGreaterThan(String value) {
            addCriterion("szlb >", value, "szlb");
            return (Criteria) this;
        }

        public Criteria andSzlbGreaterThanOrEqualTo(String value) {
            addCriterion("szlb >=", value, "szlb");
            return (Criteria) this;
        }

        public Criteria andSzlbLessThan(String value) {
            addCriterion("szlb <", value, "szlb");
            return (Criteria) this;
        }

        public Criteria andSzlbLessThanOrEqualTo(String value) {
            addCriterion("szlb <=", value, "szlb");
            return (Criteria) this;
        }

        public Criteria andSzlbLike(String value) {
            addCriterion("szlb like", value, "szlb");
            return (Criteria) this;
        }

        public Criteria andSzlbNotLike(String value) {
            addCriterion("szlb not like", value, "szlb");
            return (Criteria) this;
        }

        public Criteria andSzlbIn(List<String> values) {
            addCriterion("szlb in", values, "szlb");
            return (Criteria) this;
        }

        public Criteria andSzlbNotIn(List<String> values) {
            addCriterion("szlb not in", values, "szlb");
            return (Criteria) this;
        }

        public Criteria andSzlbBetween(String value1, String value2) {
            addCriterion("szlb between", value1, value2, "szlb");
            return (Criteria) this;
        }

        public Criteria andSzlbNotBetween(String value1, String value2) {
            addCriterion("szlb not between", value1, value2, "szlb");
            return (Criteria) this;
        }

        public Criteria andCbxmIsNull() {
            addCriterion("cbxm is null");
            return (Criteria) this;
        }

        public Criteria andCbxmIsNotNull() {
            addCriterion("cbxm is not null");
            return (Criteria) this;
        }

        public Criteria andCbxmEqualTo(String value) {
            addCriterion("cbxm =", value, "cbxm");
            return (Criteria) this;
        }

        public Criteria andCbxmNotEqualTo(String value) {
            addCriterion("cbxm <>", value, "cbxm");
            return (Criteria) this;
        }

        public Criteria andCbxmGreaterThan(String value) {
            addCriterion("cbxm >", value, "cbxm");
            return (Criteria) this;
        }

        public Criteria andCbxmGreaterThanOrEqualTo(String value) {
            addCriterion("cbxm >=", value, "cbxm");
            return (Criteria) this;
        }

        public Criteria andCbxmLessThan(String value) {
            addCriterion("cbxm <", value, "cbxm");
            return (Criteria) this;
        }

        public Criteria andCbxmLessThanOrEqualTo(String value) {
            addCriterion("cbxm <=", value, "cbxm");
            return (Criteria) this;
        }

        public Criteria andCbxmLike(String value) {
            addCriterion("cbxm like", value, "cbxm");
            return (Criteria) this;
        }

        public Criteria andCbxmNotLike(String value) {
            addCriterion("cbxm not like", value, "cbxm");
            return (Criteria) this;
        }

        public Criteria andCbxmIn(List<String> values) {
            addCriterion("cbxm in", values, "cbxm");
            return (Criteria) this;
        }

        public Criteria andCbxmNotIn(List<String> values) {
            addCriterion("cbxm not in", values, "cbxm");
            return (Criteria) this;
        }

        public Criteria andCbxmBetween(String value1, String value2) {
            addCriterion("cbxm between", value1, value2, "cbxm");
            return (Criteria) this;
        }

        public Criteria andCbxmNotBetween(String value1, String value2) {
            addCriterion("cbxm not between", value1, value2, "cbxm");
            return (Criteria) this;
        }

        public Criteria andJlJnzjIsNull() {
            addCriterion("jl_jnzj is null");
            return (Criteria) this;
        }

        public Criteria andJlJnzjIsNotNull() {
            addCriterion("jl_jnzj is not null");
            return (Criteria) this;
        }

        public Criteria andJlJnzjEqualTo(String value) {
            addCriterion("jl_jnzj =", value, "jlJnzj");
            return (Criteria) this;
        }

        public Criteria andJlJnzjNotEqualTo(String value) {
            addCriterion("jl_jnzj <>", value, "jlJnzj");
            return (Criteria) this;
        }

        public Criteria andJlJnzjGreaterThan(String value) {
            addCriterion("jl_jnzj >", value, "jlJnzj");
            return (Criteria) this;
        }

        public Criteria andJlJnzjGreaterThanOrEqualTo(String value) {
            addCriterion("jl_jnzj >=", value, "jlJnzj");
            return (Criteria) this;
        }

        public Criteria andJlJnzjLessThan(String value) {
            addCriterion("jl_jnzj <", value, "jlJnzj");
            return (Criteria) this;
        }

        public Criteria andJlJnzjLessThanOrEqualTo(String value) {
            addCriterion("jl_jnzj <=", value, "jlJnzj");
            return (Criteria) this;
        }

        public Criteria andJlJnzjLike(String value) {
            addCriterion("jl_jnzj like", value, "jlJnzj");
            return (Criteria) this;
        }

        public Criteria andJlJnzjNotLike(String value) {
            addCriterion("jl_jnzj not like", value, "jlJnzj");
            return (Criteria) this;
        }

        public Criteria andJlJnzjIn(List<String> values) {
            addCriterion("jl_jnzj in", values, "jlJnzj");
            return (Criteria) this;
        }

        public Criteria andJlJnzjNotIn(List<String> values) {
            addCriterion("jl_jnzj not in", values, "jlJnzj");
            return (Criteria) this;
        }

        public Criteria andJlJnzjBetween(String value1, String value2) {
            addCriterion("jl_jnzj between", value1, value2, "jlJnzj");
            return (Criteria) this;
        }

        public Criteria andJlJnzjNotBetween(String value1, String value2) {
            addCriterion("jl_jnzj not between", value1, value2, "jlJnzj");
            return (Criteria) this;
        }

        public Criteria andLwjfJnzjIsNull() {
            addCriterion("lwjf_jnzj is null");
            return (Criteria) this;
        }

        public Criteria andLwjfJnzjIsNotNull() {
            addCriterion("lwjf_jnzj is not null");
            return (Criteria) this;
        }

        public Criteria andLwjfJnzjEqualTo(String value) {
            addCriterion("lwjf_jnzj =", value, "lwjfJnzj");
            return (Criteria) this;
        }

        public Criteria andLwjfJnzjNotEqualTo(String value) {
            addCriterion("lwjf_jnzj <>", value, "lwjfJnzj");
            return (Criteria) this;
        }

        public Criteria andLwjfJnzjGreaterThan(String value) {
            addCriterion("lwjf_jnzj >", value, "lwjfJnzj");
            return (Criteria) this;
        }

        public Criteria andLwjfJnzjGreaterThanOrEqualTo(String value) {
            addCriterion("lwjf_jnzj >=", value, "lwjfJnzj");
            return (Criteria) this;
        }

        public Criteria andLwjfJnzjLessThan(String value) {
            addCriterion("lwjf_jnzj <", value, "lwjfJnzj");
            return (Criteria) this;
        }

        public Criteria andLwjfJnzjLessThanOrEqualTo(String value) {
            addCriterion("lwjf_jnzj <=", value, "lwjfJnzj");
            return (Criteria) this;
        }

        public Criteria andLwjfJnzjLike(String value) {
            addCriterion("lwjf_jnzj like", value, "lwjfJnzj");
            return (Criteria) this;
        }

        public Criteria andLwjfJnzjNotLike(String value) {
            addCriterion("lwjf_jnzj not like", value, "lwjfJnzj");
            return (Criteria) this;
        }

        public Criteria andLwjfJnzjIn(List<String> values) {
            addCriterion("lwjf_jnzj in", values, "lwjfJnzj");
            return (Criteria) this;
        }

        public Criteria andLwjfJnzjNotIn(List<String> values) {
            addCriterion("lwjf_jnzj not in", values, "lwjfJnzj");
            return (Criteria) this;
        }

        public Criteria andLwjfJnzjBetween(String value1, String value2) {
            addCriterion("lwjf_jnzj between", value1, value2, "lwjfJnzj");
            return (Criteria) this;
        }

        public Criteria andLwjfJnzjNotBetween(String value1, String value2) {
            addCriterion("lwjf_jnzj not between", value1, value2, "lwjfJnzj");
            return (Criteria) this;
        }

        public Criteria andHjJnzjIsNull() {
            addCriterion("hj_jnzj is null");
            return (Criteria) this;
        }

        public Criteria andHjJnzjIsNotNull() {
            addCriterion("hj_jnzj is not null");
            return (Criteria) this;
        }

        public Criteria andHjJnzjEqualTo(String value) {
            addCriterion("hj_jnzj =", value, "hjJnzj");
            return (Criteria) this;
        }

        public Criteria andHjJnzjNotEqualTo(String value) {
            addCriterion("hj_jnzj <>", value, "hjJnzj");
            return (Criteria) this;
        }

        public Criteria andHjJnzjGreaterThan(String value) {
            addCriterion("hj_jnzj >", value, "hjJnzj");
            return (Criteria) this;
        }

        public Criteria andHjJnzjGreaterThanOrEqualTo(String value) {
            addCriterion("hj_jnzj >=", value, "hjJnzj");
            return (Criteria) this;
        }

        public Criteria andHjJnzjLessThan(String value) {
            addCriterion("hj_jnzj <", value, "hjJnzj");
            return (Criteria) this;
        }

        public Criteria andHjJnzjLessThanOrEqualTo(String value) {
            addCriterion("hj_jnzj <=", value, "hjJnzj");
            return (Criteria) this;
        }

        public Criteria andHjJnzjLike(String value) {
            addCriterion("hj_jnzj like", value, "hjJnzj");
            return (Criteria) this;
        }

        public Criteria andHjJnzjNotLike(String value) {
            addCriterion("hj_jnzj not like", value, "hjJnzj");
            return (Criteria) this;
        }

        public Criteria andHjJnzjIn(List<String> values) {
            addCriterion("hj_jnzj in", values, "hjJnzj");
            return (Criteria) this;
        }

        public Criteria andHjJnzjNotIn(List<String> values) {
            addCriterion("hj_jnzj not in", values, "hjJnzj");
            return (Criteria) this;
        }

        public Criteria andHjJnzjBetween(String value1, String value2) {
            addCriterion("hj_jnzj between", value1, value2, "hjJnzj");
            return (Criteria) this;
        }

        public Criteria andHjJnzjNotBetween(String value1, String value2) {
            addCriterion("hj_jnzj not between", value1, value2, "hjJnzj");
            return (Criteria) this;
        }

        public Criteria andBcxyJnzjIsNull() {
            addCriterion("bcxy_jnzj is null");
            return (Criteria) this;
        }

        public Criteria andBcxyJnzjIsNotNull() {
            addCriterion("bcxy_jnzj is not null");
            return (Criteria) this;
        }

        public Criteria andBcxyJnzjEqualTo(String value) {
            addCriterion("bcxy_jnzj =", value, "bcxyJnzj");
            return (Criteria) this;
        }

        public Criteria andBcxyJnzjNotEqualTo(String value) {
            addCriterion("bcxy_jnzj <>", value, "bcxyJnzj");
            return (Criteria) this;
        }

        public Criteria andBcxyJnzjGreaterThan(String value) {
            addCriterion("bcxy_jnzj >", value, "bcxyJnzj");
            return (Criteria) this;
        }

        public Criteria andBcxyJnzjGreaterThanOrEqualTo(String value) {
            addCriterion("bcxy_jnzj >=", value, "bcxyJnzj");
            return (Criteria) this;
        }

        public Criteria andBcxyJnzjLessThan(String value) {
            addCriterion("bcxy_jnzj <", value, "bcxyJnzj");
            return (Criteria) this;
        }

        public Criteria andBcxyJnzjLessThanOrEqualTo(String value) {
            addCriterion("bcxy_jnzj <=", value, "bcxyJnzj");
            return (Criteria) this;
        }

        public Criteria andBcxyJnzjLike(String value) {
            addCriterion("bcxy_jnzj like", value, "bcxyJnzj");
            return (Criteria) this;
        }

        public Criteria andBcxyJnzjNotLike(String value) {
            addCriterion("bcxy_jnzj not like", value, "bcxyJnzj");
            return (Criteria) this;
        }

        public Criteria andBcxyJnzjIn(List<String> values) {
            addCriterion("bcxy_jnzj in", values, "bcxyJnzj");
            return (Criteria) this;
        }

        public Criteria andBcxyJnzjNotIn(List<String> values) {
            addCriterion("bcxy_jnzj not in", values, "bcxyJnzj");
            return (Criteria) this;
        }

        public Criteria andBcxyJnzjBetween(String value1, String value2) {
            addCriterion("bcxy_jnzj between", value1, value2, "bcxyJnzj");
            return (Criteria) this;
        }

        public Criteria andBcxyJnzjNotBetween(String value1, String value2) {
            addCriterion("bcxy_jnzj not between", value1, value2, "bcxyJnzj");
            return (Criteria) this;
        }

        public Criteria andBccsJnzjIsNull() {
            addCriterion("bccs_jnzj is null");
            return (Criteria) this;
        }

        public Criteria andBccsJnzjIsNotNull() {
            addCriterion("bccs_jnzj is not null");
            return (Criteria) this;
        }

        public Criteria andBccsJnzjEqualTo(String value) {
            addCriterion("bccs_jnzj =", value, "bccsJnzj");
            return (Criteria) this;
        }

        public Criteria andBccsJnzjNotEqualTo(String value) {
            addCriterion("bccs_jnzj <>", value, "bccsJnzj");
            return (Criteria) this;
        }

        public Criteria andBccsJnzjGreaterThan(String value) {
            addCriterion("bccs_jnzj >", value, "bccsJnzj");
            return (Criteria) this;
        }

        public Criteria andBccsJnzjGreaterThanOrEqualTo(String value) {
            addCriterion("bccs_jnzj >=", value, "bccsJnzj");
            return (Criteria) this;
        }

        public Criteria andBccsJnzjLessThan(String value) {
            addCriterion("bccs_jnzj <", value, "bccsJnzj");
            return (Criteria) this;
        }

        public Criteria andBccsJnzjLessThanOrEqualTo(String value) {
            addCriterion("bccs_jnzj <=", value, "bccsJnzj");
            return (Criteria) this;
        }

        public Criteria andBccsJnzjLike(String value) {
            addCriterion("bccs_jnzj like", value, "bccsJnzj");
            return (Criteria) this;
        }

        public Criteria andBccsJnzjNotLike(String value) {
            addCriterion("bccs_jnzj not like", value, "bccsJnzj");
            return (Criteria) this;
        }

        public Criteria andBccsJnzjIn(List<String> values) {
            addCriterion("bccs_jnzj in", values, "bccsJnzj");
            return (Criteria) this;
        }

        public Criteria andBccsJnzjNotIn(List<String> values) {
            addCriterion("bccs_jnzj not in", values, "bccsJnzj");
            return (Criteria) this;
        }

        public Criteria andBccsJnzjBetween(String value1, String value2) {
            addCriterion("bccs_jnzj between", value1, value2, "bccsJnzj");
            return (Criteria) this;
        }

        public Criteria andBccsJnzjNotBetween(String value1, String value2) {
            addCriterion("bccs_jnzj not between", value1, value2, "bccsJnzj");
            return (Criteria) this;
        }

        public Criteria andBcslJnzjIsNull() {
            addCriterion("bcsl_jnzj is null");
            return (Criteria) this;
        }

        public Criteria andBcslJnzjIsNotNull() {
            addCriterion("bcsl_jnzj is not null");
            return (Criteria) this;
        }

        public Criteria andBcslJnzjEqualTo(String value) {
            addCriterion("bcsl_jnzj =", value, "bcslJnzj");
            return (Criteria) this;
        }

        public Criteria andBcslJnzjNotEqualTo(String value) {
            addCriterion("bcsl_jnzj <>", value, "bcslJnzj");
            return (Criteria) this;
        }

        public Criteria andBcslJnzjGreaterThan(String value) {
            addCriterion("bcsl_jnzj >", value, "bcslJnzj");
            return (Criteria) this;
        }

        public Criteria andBcslJnzjGreaterThanOrEqualTo(String value) {
            addCriterion("bcsl_jnzj >=", value, "bcslJnzj");
            return (Criteria) this;
        }

        public Criteria andBcslJnzjLessThan(String value) {
            addCriterion("bcsl_jnzj <", value, "bcslJnzj");
            return (Criteria) this;
        }

        public Criteria andBcslJnzjLessThanOrEqualTo(String value) {
            addCriterion("bcsl_jnzj <=", value, "bcslJnzj");
            return (Criteria) this;
        }

        public Criteria andBcslJnzjLike(String value) {
            addCriterion("bcsl_jnzj like", value, "bcslJnzj");
            return (Criteria) this;
        }

        public Criteria andBcslJnzjNotLike(String value) {
            addCriterion("bcsl_jnzj not like", value, "bcslJnzj");
            return (Criteria) this;
        }

        public Criteria andBcslJnzjIn(List<String> values) {
            addCriterion("bcsl_jnzj in", values, "bcslJnzj");
            return (Criteria) this;
        }

        public Criteria andBcslJnzjNotIn(List<String> values) {
            addCriterion("bcsl_jnzj not in", values, "bcslJnzj");
            return (Criteria) this;
        }

        public Criteria andBcslJnzjBetween(String value1, String value2) {
            addCriterion("bcsl_jnzj between", value1, value2, "bcslJnzj");
            return (Criteria) this;
        }

        public Criteria andBcslJnzjNotBetween(String value1, String value2) {
            addCriterion("bcsl_jnzj not between", value1, value2, "bcslJnzj");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("bz is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("bz is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("bz =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("bz <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("bz >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("bz >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("bz <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("bz <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("bz like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("bz not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("bz in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("bz not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("bz between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("bz not between", value1, value2, "bz");
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