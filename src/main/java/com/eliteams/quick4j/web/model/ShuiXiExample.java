package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class ShuiXiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShuiXiExample() {
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

        public Criteria andSxHlmcIsNull() {
            addCriterion("sx_hlmc is null");
            return (Criteria) this;
        }

        public Criteria andSxHlmcIsNotNull() {
            addCriterion("sx_hlmc is not null");
            return (Criteria) this;
        }

        public Criteria andSxHlmcEqualTo(String value) {
            addCriterion("sx_hlmc =", value, "sxHlmc");
            return (Criteria) this;
        }

        public Criteria andSxHlmcNotEqualTo(String value) {
            addCriterion("sx_hlmc <>", value, "sxHlmc");
            return (Criteria) this;
        }

        public Criteria andSxHlmcGreaterThan(String value) {
            addCriterion("sx_hlmc >", value, "sxHlmc");
            return (Criteria) this;
        }

        public Criteria andSxHlmcGreaterThanOrEqualTo(String value) {
            addCriterion("sx_hlmc >=", value, "sxHlmc");
            return (Criteria) this;
        }

        public Criteria andSxHlmcLessThan(String value) {
            addCriterion("sx_hlmc <", value, "sxHlmc");
            return (Criteria) this;
        }

        public Criteria andSxHlmcLessThanOrEqualTo(String value) {
            addCriterion("sx_hlmc <=", value, "sxHlmc");
            return (Criteria) this;
        }

        public Criteria andSxHlmcLike(String value) {
            addCriterion("sx_hlmc like", value, "sxHlmc");
            return (Criteria) this;
        }

        public Criteria andSxHlmcNotLike(String value) {
            addCriterion("sx_hlmc not like", value, "sxHlmc");
            return (Criteria) this;
        }

        public Criteria andSxHlmcIn(List<String> values) {
            addCriterion("sx_hlmc in", values, "sxHlmc");
            return (Criteria) this;
        }

        public Criteria andSxHlmcNotIn(List<String> values) {
            addCriterion("sx_hlmc not in", values, "sxHlmc");
            return (Criteria) this;
        }

        public Criteria andSxHlmcBetween(String value1, String value2) {
            addCriterion("sx_hlmc between", value1, value2, "sxHlmc");
            return (Criteria) this;
        }

        public Criteria andSxHlmcNotBetween(String value1, String value2) {
            addCriterion("sx_hlmc not between", value1, value2, "sxHlmc");
            return (Criteria) this;
        }

        public Criteria andSxHlbhIsNull() {
            addCriterion("sx_hlbh is null");
            return (Criteria) this;
        }

        public Criteria andSxHlbhIsNotNull() {
            addCriterion("sx_hlbh is not null");
            return (Criteria) this;
        }

        public Criteria andSxHlbhEqualTo(String value) {
            addCriterion("sx_hlbh =", value, "sxHlbh");
            return (Criteria) this;
        }

        public Criteria andSxHlbhNotEqualTo(String value) {
            addCriterion("sx_hlbh <>", value, "sxHlbh");
            return (Criteria) this;
        }

        public Criteria andSxHlbhGreaterThan(String value) {
            addCriterion("sx_hlbh >", value, "sxHlbh");
            return (Criteria) this;
        }

        public Criteria andSxHlbhGreaterThanOrEqualTo(String value) {
            addCriterion("sx_hlbh >=", value, "sxHlbh");
            return (Criteria) this;
        }

        public Criteria andSxHlbhLessThan(String value) {
            addCriterion("sx_hlbh <", value, "sxHlbh");
            return (Criteria) this;
        }

        public Criteria andSxHlbhLessThanOrEqualTo(String value) {
            addCriterion("sx_hlbh <=", value, "sxHlbh");
            return (Criteria) this;
        }

        public Criteria andSxHlbhLike(String value) {
            addCriterion("sx_hlbh like", value, "sxHlbh");
            return (Criteria) this;
        }

        public Criteria andSxHlbhNotLike(String value) {
            addCriterion("sx_hlbh not like", value, "sxHlbh");
            return (Criteria) this;
        }

        public Criteria andSxHlbhIn(List<String> values) {
            addCriterion("sx_hlbh in", values, "sxHlbh");
            return (Criteria) this;
        }

        public Criteria andSxHlbhNotIn(List<String> values) {
            addCriterion("sx_hlbh not in", values, "sxHlbh");
            return (Criteria) this;
        }

        public Criteria andSxHlbhBetween(String value1, String value2) {
            addCriterion("sx_hlbh between", value1, value2, "sxHlbh");
            return (Criteria) this;
        }

        public Criteria andSxHlbhNotBetween(String value1, String value2) {
            addCriterion("sx_hlbh not between", value1, value2, "sxHlbh");
            return (Criteria) this;
        }

        public Criteria andSxHljbIsNull() {
            addCriterion("sx_hljb is null");
            return (Criteria) this;
        }

        public Criteria andSxHljbIsNotNull() {
            addCriterion("sx_hljb is not null");
            return (Criteria) this;
        }

        public Criteria andSxHljbEqualTo(Integer value) {
            addCriterion("sx_hljb =", value, "sxHljb");
            return (Criteria) this;
        }

        public Criteria andSxHljbNotEqualTo(Integer value) {
            addCriterion("sx_hljb <>", value, "sxHljb");
            return (Criteria) this;
        }

        public Criteria andSxHljbGreaterThan(Integer value) {
            addCriterion("sx_hljb >", value, "sxHljb");
            return (Criteria) this;
        }

        public Criteria andSxHljbGreaterThanOrEqualTo(Integer value) {
            addCriterion("sx_hljb >=", value, "sxHljb");
            return (Criteria) this;
        }

        public Criteria andSxHljbLessThan(Integer value) {
            addCriterion("sx_hljb <", value, "sxHljb");
            return (Criteria) this;
        }

        public Criteria andSxHljbLessThanOrEqualTo(Integer value) {
            addCriterion("sx_hljb <=", value, "sxHljb");
            return (Criteria) this;
        }

        public Criteria andSxHljbIn(List<Integer> values) {
            addCriterion("sx_hljb in", values, "sxHljb");
            return (Criteria) this;
        }

        public Criteria andSxHljbNotIn(List<Integer> values) {
            addCriterion("sx_hljb not in", values, "sxHljb");
            return (Criteria) this;
        }

        public Criteria andSxHljbBetween(Integer value1, Integer value2) {
            addCriterion("sx_hljb between", value1, value2, "sxHljb");
            return (Criteria) this;
        }

        public Criteria andSxHljbNotBetween(Integer value1, Integer value2) {
            addCriterion("sx_hljb not between", value1, value2, "sxHljb");
            return (Criteria) this;
        }

        public Criteria andSxSzlyIsNull() {
            addCriterion("sx_szly is null");
            return (Criteria) this;
        }

        public Criteria andSxSzlyIsNotNull() {
            addCriterion("sx_szly is not null");
            return (Criteria) this;
        }

        public Criteria andSxSzlyEqualTo(String value) {
            addCriterion("sx_szly =", value, "sxSzly");
            return (Criteria) this;
        }

        public Criteria andSxSzlyNotEqualTo(String value) {
            addCriterion("sx_szly <>", value, "sxSzly");
            return (Criteria) this;
        }

        public Criteria andSxSzlyGreaterThan(String value) {
            addCriterion("sx_szly >", value, "sxSzly");
            return (Criteria) this;
        }

        public Criteria andSxSzlyGreaterThanOrEqualTo(String value) {
            addCriterion("sx_szly >=", value, "sxSzly");
            return (Criteria) this;
        }

        public Criteria andSxSzlyLessThan(String value) {
            addCriterion("sx_szly <", value, "sxSzly");
            return (Criteria) this;
        }

        public Criteria andSxSzlyLessThanOrEqualTo(String value) {
            addCriterion("sx_szly <=", value, "sxSzly");
            return (Criteria) this;
        }

        public Criteria andSxSzlyLike(String value) {
            addCriterion("sx_szly like", value, "sxSzly");
            return (Criteria) this;
        }

        public Criteria andSxSzlyNotLike(String value) {
            addCriterion("sx_szly not like", value, "sxSzly");
            return (Criteria) this;
        }

        public Criteria andSxSzlyIn(List<String> values) {
            addCriterion("sx_szly in", values, "sxSzly");
            return (Criteria) this;
        }

        public Criteria andSxSzlyNotIn(List<String> values) {
            addCriterion("sx_szly not in", values, "sxSzly");
            return (Criteria) this;
        }

        public Criteria andSxSzlyBetween(String value1, String value2) {
            addCriterion("sx_szly between", value1, value2, "sxSzly");
            return (Criteria) this;
        }

        public Criteria andSxSzlyNotBetween(String value1, String value2) {
            addCriterion("sx_szly not between", value1, value2, "sxSzly");
            return (Criteria) this;
        }

        public Criteria andSxSjhlIsNull() {
            addCriterion("sx_sjhl is null");
            return (Criteria) this;
        }

        public Criteria andSxSjhlIsNotNull() {
            addCriterion("sx_sjhl is not null");
            return (Criteria) this;
        }

        public Criteria andSxSjhlEqualTo(String value) {
            addCriterion("sx_sjhl =", value, "sxSjhl");
            return (Criteria) this;
        }

        public Criteria andSxSjhlNotEqualTo(String value) {
            addCriterion("sx_sjhl <>", value, "sxSjhl");
            return (Criteria) this;
        }

        public Criteria andSxSjhlGreaterThan(String value) {
            addCriterion("sx_sjhl >", value, "sxSjhl");
            return (Criteria) this;
        }

        public Criteria andSxSjhlGreaterThanOrEqualTo(String value) {
            addCriterion("sx_sjhl >=", value, "sxSjhl");
            return (Criteria) this;
        }

        public Criteria andSxSjhlLessThan(String value) {
            addCriterion("sx_sjhl <", value, "sxSjhl");
            return (Criteria) this;
        }

        public Criteria andSxSjhlLessThanOrEqualTo(String value) {
            addCriterion("sx_sjhl <=", value, "sxSjhl");
            return (Criteria) this;
        }

        public Criteria andSxSjhlLike(String value) {
            addCriterion("sx_sjhl like", value, "sxSjhl");
            return (Criteria) this;
        }

        public Criteria andSxSjhlNotLike(String value) {
            addCriterion("sx_sjhl not like", value, "sxSjhl");
            return (Criteria) this;
        }

        public Criteria andSxSjhlIn(List<String> values) {
            addCriterion("sx_sjhl in", values, "sxSjhl");
            return (Criteria) this;
        }

        public Criteria andSxSjhlNotIn(List<String> values) {
            addCriterion("sx_sjhl not in", values, "sxSjhl");
            return (Criteria) this;
        }

        public Criteria andSxSjhlBetween(String value1, String value2) {
            addCriterion("sx_sjhl between", value1, value2, "sxSjhl");
            return (Criteria) this;
        }

        public Criteria andSxSjhlNotBetween(String value1, String value2) {
            addCriterion("sx_sjhl not between", value1, value2, "sxSjhl");
            return (Criteria) this;
        }

        public Criteria andSxXjhlxlIsNull() {
            addCriterion("sx_xjhlxl is null");
            return (Criteria) this;
        }

        public Criteria andSxXjhlxlIsNotNull() {
            addCriterion("sx_xjhlxl is not null");
            return (Criteria) this;
        }

        public Criteria andSxXjhlxlEqualTo(String value) {
            addCriterion("sx_xjhlxl =", value, "sxXjhlxl");
            return (Criteria) this;
        }

        public Criteria andSxXjhlxlNotEqualTo(String value) {
            addCriterion("sx_xjhlxl <>", value, "sxXjhlxl");
            return (Criteria) this;
        }

        public Criteria andSxXjhlxlGreaterThan(String value) {
            addCriterion("sx_xjhlxl >", value, "sxXjhlxl");
            return (Criteria) this;
        }

        public Criteria andSxXjhlxlGreaterThanOrEqualTo(String value) {
            addCriterion("sx_xjhlxl >=", value, "sxXjhlxl");
            return (Criteria) this;
        }

        public Criteria andSxXjhlxlLessThan(String value) {
            addCriterion("sx_xjhlxl <", value, "sxXjhlxl");
            return (Criteria) this;
        }

        public Criteria andSxXjhlxlLessThanOrEqualTo(String value) {
            addCriterion("sx_xjhlxl <=", value, "sxXjhlxl");
            return (Criteria) this;
        }

        public Criteria andSxXjhlxlLike(String value) {
            addCriterion("sx_xjhlxl like", value, "sxXjhlxl");
            return (Criteria) this;
        }

        public Criteria andSxXjhlxlNotLike(String value) {
            addCriterion("sx_xjhlxl not like", value, "sxXjhlxl");
            return (Criteria) this;
        }

        public Criteria andSxXjhlxlIn(List<String> values) {
            addCriterion("sx_xjhlxl in", values, "sxXjhlxl");
            return (Criteria) this;
        }

        public Criteria andSxXjhlxlNotIn(List<String> values) {
            addCriterion("sx_xjhlxl not in", values, "sxXjhlxl");
            return (Criteria) this;
        }

        public Criteria andSxXjhlxlBetween(String value1, String value2) {
            addCriterion("sx_xjhlxl between", value1, value2, "sxXjhlxl");
            return (Criteria) this;
        }

        public Criteria andSxXjhlxlNotBetween(String value1, String value2) {
            addCriterion("sx_xjhlxl not between", value1, value2, "sxXjhlxl");
            return (Criteria) this;
        }

        public Criteria andSxHsqmjIsNull() {
            addCriterion("sx_hsqmj is null");
            return (Criteria) this;
        }

        public Criteria andSxHsqmjIsNotNull() {
            addCriterion("sx_hsqmj is not null");
            return (Criteria) this;
        }

        public Criteria andSxHsqmjEqualTo(Double value) {
            addCriterion("sx_hsqmj =", value, "sxHsqmj");
            return (Criteria) this;
        }

        public Criteria andSxHsqmjNotEqualTo(Double value) {
            addCriterion("sx_hsqmj <>", value, "sxHsqmj");
            return (Criteria) this;
        }

        public Criteria andSxHsqmjGreaterThan(Double value) {
            addCriterion("sx_hsqmj >", value, "sxHsqmj");
            return (Criteria) this;
        }

        public Criteria andSxHsqmjGreaterThanOrEqualTo(Double value) {
            addCriterion("sx_hsqmj >=", value, "sxHsqmj");
            return (Criteria) this;
        }

        public Criteria andSxHsqmjLessThan(Double value) {
            addCriterion("sx_hsqmj <", value, "sxHsqmj");
            return (Criteria) this;
        }

        public Criteria andSxHsqmjLessThanOrEqualTo(Double value) {
            addCriterion("sx_hsqmj <=", value, "sxHsqmj");
            return (Criteria) this;
        }

        public Criteria andSxHsqmjIn(List<Double> values) {
            addCriterion("sx_hsqmj in", values, "sxHsqmj");
            return (Criteria) this;
        }

        public Criteria andSxHsqmjNotIn(List<Double> values) {
            addCriterion("sx_hsqmj not in", values, "sxHsqmj");
            return (Criteria) this;
        }

        public Criteria andSxHsqmjBetween(Double value1, Double value2) {
            addCriterion("sx_hsqmj between", value1, value2, "sxHsqmj");
            return (Criteria) this;
        }

        public Criteria andSxHsqmjNotBetween(Double value1, Double value2) {
            addCriterion("sx_hsqmj not between", value1, value2, "sxHsqmj");
            return (Criteria) this;
        }

        public Criteria andSxLdmjIsNull() {
            addCriterion("sx_ldmj is null");
            return (Criteria) this;
        }

        public Criteria andSxLdmjIsNotNull() {
            addCriterion("sx_ldmj is not null");
            return (Criteria) this;
        }

        public Criteria andSxLdmjEqualTo(Double value) {
            addCriterion("sx_ldmj =", value, "sxLdmj");
            return (Criteria) this;
        }

        public Criteria andSxLdmjNotEqualTo(Double value) {
            addCriterion("sx_ldmj <>", value, "sxLdmj");
            return (Criteria) this;
        }

        public Criteria andSxLdmjGreaterThan(Double value) {
            addCriterion("sx_ldmj >", value, "sxLdmj");
            return (Criteria) this;
        }

        public Criteria andSxLdmjGreaterThanOrEqualTo(Double value) {
            addCriterion("sx_ldmj >=", value, "sxLdmj");
            return (Criteria) this;
        }

        public Criteria andSxLdmjLessThan(Double value) {
            addCriterion("sx_ldmj <", value, "sxLdmj");
            return (Criteria) this;
        }

        public Criteria andSxLdmjLessThanOrEqualTo(Double value) {
            addCriterion("sx_ldmj <=", value, "sxLdmj");
            return (Criteria) this;
        }

        public Criteria andSxLdmjIn(List<Double> values) {
            addCriterion("sx_ldmj in", values, "sxLdmj");
            return (Criteria) this;
        }

        public Criteria andSxLdmjNotIn(List<Double> values) {
            addCriterion("sx_ldmj not in", values, "sxLdmj");
            return (Criteria) this;
        }

        public Criteria andSxLdmjBetween(Double value1, Double value2) {
            addCriterion("sx_ldmj between", value1, value2, "sxLdmj");
            return (Criteria) this;
        }

        public Criteria andSxLdmjNotBetween(Double value1, Double value2) {
            addCriterion("sx_ldmj not between", value1, value2, "sxLdmj");
            return (Criteria) this;
        }

        public Criteria andSxCdmjIsNull() {
            addCriterion("sx_cdmj is null");
            return (Criteria) this;
        }

        public Criteria andSxCdmjIsNotNull() {
            addCriterion("sx_cdmj is not null");
            return (Criteria) this;
        }

        public Criteria andSxCdmjEqualTo(Double value) {
            addCriterion("sx_cdmj =", value, "sxCdmj");
            return (Criteria) this;
        }

        public Criteria andSxCdmjNotEqualTo(Double value) {
            addCriterion("sx_cdmj <>", value, "sxCdmj");
            return (Criteria) this;
        }

        public Criteria andSxCdmjGreaterThan(Double value) {
            addCriterion("sx_cdmj >", value, "sxCdmj");
            return (Criteria) this;
        }

        public Criteria andSxCdmjGreaterThanOrEqualTo(Double value) {
            addCriterion("sx_cdmj >=", value, "sxCdmj");
            return (Criteria) this;
        }

        public Criteria andSxCdmjLessThan(Double value) {
            addCriterion("sx_cdmj <", value, "sxCdmj");
            return (Criteria) this;
        }

        public Criteria andSxCdmjLessThanOrEqualTo(Double value) {
            addCriterion("sx_cdmj <=", value, "sxCdmj");
            return (Criteria) this;
        }

        public Criteria andSxCdmjIn(List<Double> values) {
            addCriterion("sx_cdmj in", values, "sxCdmj");
            return (Criteria) this;
        }

        public Criteria andSxCdmjNotIn(List<Double> values) {
            addCriterion("sx_cdmj not in", values, "sxCdmj");
            return (Criteria) this;
        }

        public Criteria andSxCdmjBetween(Double value1, Double value2) {
            addCriterion("sx_cdmj between", value1, value2, "sxCdmj");
            return (Criteria) this;
        }

        public Criteria andSxCdmjNotBetween(Double value1, Double value2) {
            addCriterion("sx_cdmj not between", value1, value2, "sxCdmj");
            return (Criteria) this;
        }

        public Criteria andSxStmjIsNull() {
            addCriterion("sx_stmj is null");
            return (Criteria) this;
        }

        public Criteria andSxStmjIsNotNull() {
            addCriterion("sx_stmj is not null");
            return (Criteria) this;
        }

        public Criteria andSxStmjEqualTo(Double value) {
            addCriterion("sx_stmj =", value, "sxStmj");
            return (Criteria) this;
        }

        public Criteria andSxStmjNotEqualTo(Double value) {
            addCriterion("sx_stmj <>", value, "sxStmj");
            return (Criteria) this;
        }

        public Criteria andSxStmjGreaterThan(Double value) {
            addCriterion("sx_stmj >", value, "sxStmj");
            return (Criteria) this;
        }

        public Criteria andSxStmjGreaterThanOrEqualTo(Double value) {
            addCriterion("sx_stmj >=", value, "sxStmj");
            return (Criteria) this;
        }

        public Criteria andSxStmjLessThan(Double value) {
            addCriterion("sx_stmj <", value, "sxStmj");
            return (Criteria) this;
        }

        public Criteria andSxStmjLessThanOrEqualTo(Double value) {
            addCriterion("sx_stmj <=", value, "sxStmj");
            return (Criteria) this;
        }

        public Criteria andSxStmjIn(List<Double> values) {
            addCriterion("sx_stmj in", values, "sxStmj");
            return (Criteria) this;
        }

        public Criteria andSxStmjNotIn(List<Double> values) {
            addCriterion("sx_stmj not in", values, "sxStmj");
            return (Criteria) this;
        }

        public Criteria andSxStmjBetween(Double value1, Double value2) {
            addCriterion("sx_stmj between", value1, value2, "sxStmj");
            return (Criteria) this;
        }

        public Criteria andSxStmjNotBetween(Double value1, Double value2) {
            addCriterion("sx_stmj not between", value1, value2, "sxStmj");
            return (Criteria) this;
        }

        public Criteria andSxHdmjIsNull() {
            addCriterion("sx_hdmj is null");
            return (Criteria) this;
        }

        public Criteria andSxHdmjIsNotNull() {
            addCriterion("sx_hdmj is not null");
            return (Criteria) this;
        }

        public Criteria andSxHdmjEqualTo(Double value) {
            addCriterion("sx_hdmj =", value, "sxHdmj");
            return (Criteria) this;
        }

        public Criteria andSxHdmjNotEqualTo(Double value) {
            addCriterion("sx_hdmj <>", value, "sxHdmj");
            return (Criteria) this;
        }

        public Criteria andSxHdmjGreaterThan(Double value) {
            addCriterion("sx_hdmj >", value, "sxHdmj");
            return (Criteria) this;
        }

        public Criteria andSxHdmjGreaterThanOrEqualTo(Double value) {
            addCriterion("sx_hdmj >=", value, "sxHdmj");
            return (Criteria) this;
        }

        public Criteria andSxHdmjLessThan(Double value) {
            addCriterion("sx_hdmj <", value, "sxHdmj");
            return (Criteria) this;
        }

        public Criteria andSxHdmjLessThanOrEqualTo(Double value) {
            addCriterion("sx_hdmj <=", value, "sxHdmj");
            return (Criteria) this;
        }

        public Criteria andSxHdmjIn(List<Double> values) {
            addCriterion("sx_hdmj in", values, "sxHdmj");
            return (Criteria) this;
        }

        public Criteria andSxHdmjNotIn(List<Double> values) {
            addCriterion("sx_hdmj not in", values, "sxHdmj");
            return (Criteria) this;
        }

        public Criteria andSxHdmjBetween(Double value1, Double value2) {
            addCriterion("sx_hdmj between", value1, value2, "sxHdmj");
            return (Criteria) this;
        }

        public Criteria andSxHdmjNotBetween(Double value1, Double value2) {
            addCriterion("sx_hdmj not between", value1, value2, "sxHdmj");
            return (Criteria) this;
        }

        public Criteria andSxCzmjIsNull() {
            addCriterion("sx_czmj is null");
            return (Criteria) this;
        }

        public Criteria andSxCzmjIsNotNull() {
            addCriterion("sx_czmj is not null");
            return (Criteria) this;
        }

        public Criteria andSxCzmjEqualTo(Double value) {
            addCriterion("sx_czmj =", value, "sxCzmj");
            return (Criteria) this;
        }

        public Criteria andSxCzmjNotEqualTo(Double value) {
            addCriterion("sx_czmj <>", value, "sxCzmj");
            return (Criteria) this;
        }

        public Criteria andSxCzmjGreaterThan(Double value) {
            addCriterion("sx_czmj >", value, "sxCzmj");
            return (Criteria) this;
        }

        public Criteria andSxCzmjGreaterThanOrEqualTo(Double value) {
            addCriterion("sx_czmj >=", value, "sxCzmj");
            return (Criteria) this;
        }

        public Criteria andSxCzmjLessThan(Double value) {
            addCriterion("sx_czmj <", value, "sxCzmj");
            return (Criteria) this;
        }

        public Criteria andSxCzmjLessThanOrEqualTo(Double value) {
            addCriterion("sx_czmj <=", value, "sxCzmj");
            return (Criteria) this;
        }

        public Criteria andSxCzmjIn(List<Double> values) {
            addCriterion("sx_czmj in", values, "sxCzmj");
            return (Criteria) this;
        }

        public Criteria andSxCzmjNotIn(List<Double> values) {
            addCriterion("sx_czmj not in", values, "sxCzmj");
            return (Criteria) this;
        }

        public Criteria andSxCzmjBetween(Double value1, Double value2) {
            addCriterion("sx_czmj between", value1, value2, "sxCzmj");
            return (Criteria) this;
        }

        public Criteria andSxCzmjNotBetween(Double value1, Double value2) {
            addCriterion("sx_czmj not between", value1, value2, "sxCzmj");
            return (Criteria) this;
        }

        public Criteria andSxNcmjIsNull() {
            addCriterion("sx_ncmj is null");
            return (Criteria) this;
        }

        public Criteria andSxNcmjIsNotNull() {
            addCriterion("sx_ncmj is not null");
            return (Criteria) this;
        }

        public Criteria andSxNcmjEqualTo(Double value) {
            addCriterion("sx_ncmj =", value, "sxNcmj");
            return (Criteria) this;
        }

        public Criteria andSxNcmjNotEqualTo(Double value) {
            addCriterion("sx_ncmj <>", value, "sxNcmj");
            return (Criteria) this;
        }

        public Criteria andSxNcmjGreaterThan(Double value) {
            addCriterion("sx_ncmj >", value, "sxNcmj");
            return (Criteria) this;
        }

        public Criteria andSxNcmjGreaterThanOrEqualTo(Double value) {
            addCriterion("sx_ncmj >=", value, "sxNcmj");
            return (Criteria) this;
        }

        public Criteria andSxNcmjLessThan(Double value) {
            addCriterion("sx_ncmj <", value, "sxNcmj");
            return (Criteria) this;
        }

        public Criteria andSxNcmjLessThanOrEqualTo(Double value) {
            addCriterion("sx_ncmj <=", value, "sxNcmj");
            return (Criteria) this;
        }

        public Criteria andSxNcmjIn(List<Double> values) {
            addCriterion("sx_ncmj in", values, "sxNcmj");
            return (Criteria) this;
        }

        public Criteria andSxNcmjNotIn(List<Double> values) {
            addCriterion("sx_ncmj not in", values, "sxNcmj");
            return (Criteria) this;
        }

        public Criteria andSxNcmjBetween(Double value1, Double value2) {
            addCriterion("sx_ncmj between", value1, value2, "sxNcmj");
            return (Criteria) this;
        }

        public Criteria andSxNcmjNotBetween(Double value1, Double value2) {
            addCriterion("sx_ncmj not between", value1, value2, "sxNcmj");
            return (Criteria) this;
        }

        public Criteria andSxGjmjIsNull() {
            addCriterion("sx_gjmj is null");
            return (Criteria) this;
        }

        public Criteria andSxGjmjIsNotNull() {
            addCriterion("sx_gjmj is not null");
            return (Criteria) this;
        }

        public Criteria andSxGjmjEqualTo(Double value) {
            addCriterion("sx_gjmj =", value, "sxGjmj");
            return (Criteria) this;
        }

        public Criteria andSxGjmjNotEqualTo(Double value) {
            addCriterion("sx_gjmj <>", value, "sxGjmj");
            return (Criteria) this;
        }

        public Criteria andSxGjmjGreaterThan(Double value) {
            addCriterion("sx_gjmj >", value, "sxGjmj");
            return (Criteria) this;
        }

        public Criteria andSxGjmjGreaterThanOrEqualTo(Double value) {
            addCriterion("sx_gjmj >=", value, "sxGjmj");
            return (Criteria) this;
        }

        public Criteria andSxGjmjLessThan(Double value) {
            addCriterion("sx_gjmj <", value, "sxGjmj");
            return (Criteria) this;
        }

        public Criteria andSxGjmjLessThanOrEqualTo(Double value) {
            addCriterion("sx_gjmj <=", value, "sxGjmj");
            return (Criteria) this;
        }

        public Criteria andSxGjmjIn(List<Double> values) {
            addCriterion("sx_gjmj in", values, "sxGjmj");
            return (Criteria) this;
        }

        public Criteria andSxGjmjNotIn(List<Double> values) {
            addCriterion("sx_gjmj not in", values, "sxGjmj");
            return (Criteria) this;
        }

        public Criteria andSxGjmjBetween(Double value1, Double value2) {
            addCriterion("sx_gjmj between", value1, value2, "sxGjmj");
            return (Criteria) this;
        }

        public Criteria andSxGjmjNotBetween(Double value1, Double value2) {
            addCriterion("sx_gjmj not between", value1, value2, "sxGjmj");
            return (Criteria) this;
        }

        public Criteria andSxWlymjIsNull() {
            addCriterion("sx_wlymj is null");
            return (Criteria) this;
        }

        public Criteria andSxWlymjIsNotNull() {
            addCriterion("sx_wlymj is not null");
            return (Criteria) this;
        }

        public Criteria andSxWlymjEqualTo(Double value) {
            addCriterion("sx_wlymj =", value, "sxWlymj");
            return (Criteria) this;
        }

        public Criteria andSxWlymjNotEqualTo(Double value) {
            addCriterion("sx_wlymj <>", value, "sxWlymj");
            return (Criteria) this;
        }

        public Criteria andSxWlymjGreaterThan(Double value) {
            addCriterion("sx_wlymj >", value, "sxWlymj");
            return (Criteria) this;
        }

        public Criteria andSxWlymjGreaterThanOrEqualTo(Double value) {
            addCriterion("sx_wlymj >=", value, "sxWlymj");
            return (Criteria) this;
        }

        public Criteria andSxWlymjLessThan(Double value) {
            addCriterion("sx_wlymj <", value, "sxWlymj");
            return (Criteria) this;
        }

        public Criteria andSxWlymjLessThanOrEqualTo(Double value) {
            addCriterion("sx_wlymj <=", value, "sxWlymj");
            return (Criteria) this;
        }

        public Criteria andSxWlymjIn(List<Double> values) {
            addCriterion("sx_wlymj in", values, "sxWlymj");
            return (Criteria) this;
        }

        public Criteria andSxWlymjNotIn(List<Double> values) {
            addCriterion("sx_wlymj not in", values, "sxWlymj");
            return (Criteria) this;
        }

        public Criteria andSxWlymjBetween(Double value1, Double value2) {
            addCriterion("sx_wlymj between", value1, value2, "sxWlymj");
            return (Criteria) this;
        }

        public Criteria andSxWlymjNotBetween(Double value1, Double value2) {
            addCriterion("sx_wlymj not between", value1, value2, "sxWlymj");
            return (Criteria) this;
        }

        public Criteria andSxDateIsNull() {
            addCriterion("sx_date is null");
            return (Criteria) this;
        }

        public Criteria andSxDateIsNotNull() {
            addCriterion("sx_date is not null");
            return (Criteria) this;
        }

        public Criteria andSxDateEqualTo(Integer value) {
            addCriterion("sx_date =", value, "sxDate");
            return (Criteria) this;
        }

        public Criteria andSxDateNotEqualTo(Integer value) {
            addCriterion("sx_date <>", value, "sxDate");
            return (Criteria) this;
        }

        public Criteria andSxDateGreaterThan(Integer value) {
            addCriterion("sx_date >", value, "sxDate");
            return (Criteria) this;
        }

        public Criteria andSxDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("sx_date >=", value, "sxDate");
            return (Criteria) this;
        }

        public Criteria andSxDateLessThan(Integer value) {
            addCriterion("sx_date <", value, "sxDate");
            return (Criteria) this;
        }

        public Criteria andSxDateLessThanOrEqualTo(Integer value) {
            addCriterion("sx_date <=", value, "sxDate");
            return (Criteria) this;
        }

        public Criteria andSxDateIn(List<Integer> values) {
            addCriterion("sx_date in", values, "sxDate");
            return (Criteria) this;
        }

        public Criteria andSxDateNotIn(List<Integer> values) {
            addCriterion("sx_date not in", values, "sxDate");
            return (Criteria) this;
        }

        public Criteria andSxDateBetween(Integer value1, Integer value2) {
            addCriterion("sx_date between", value1, value2, "sxDate");
            return (Criteria) this;
        }

        public Criteria andSxDateNotBetween(Integer value1, Integer value2) {
            addCriterion("sx_date not between", value1, value2, "sxDate");
            return (Criteria) this;
        }

        public Criteria andSxBl1IsNull() {
            addCriterion("sx_bl1 is null");
            return (Criteria) this;
        }

        public Criteria andSxBl1IsNotNull() {
            addCriterion("sx_bl1 is not null");
            return (Criteria) this;
        }

        public Criteria andSxBl1EqualTo(String value) {
            addCriterion("sx_bl1 =", value, "sxBl1");
            return (Criteria) this;
        }

        public Criteria andSxBl1NotEqualTo(String value) {
            addCriterion("sx_bl1 <>", value, "sxBl1");
            return (Criteria) this;
        }

        public Criteria andSxBl1GreaterThan(String value) {
            addCriterion("sx_bl1 >", value, "sxBl1");
            return (Criteria) this;
        }

        public Criteria andSxBl1GreaterThanOrEqualTo(String value) {
            addCriterion("sx_bl1 >=", value, "sxBl1");
            return (Criteria) this;
        }

        public Criteria andSxBl1LessThan(String value) {
            addCriterion("sx_bl1 <", value, "sxBl1");
            return (Criteria) this;
        }

        public Criteria andSxBl1LessThanOrEqualTo(String value) {
            addCriterion("sx_bl1 <=", value, "sxBl1");
            return (Criteria) this;
        }

        public Criteria andSxBl1Like(String value) {
            addCriterion("sx_bl1 like", value, "sxBl1");
            return (Criteria) this;
        }

        public Criteria andSxBl1NotLike(String value) {
            addCriterion("sx_bl1 not like", value, "sxBl1");
            return (Criteria) this;
        }

        public Criteria andSxBl1In(List<String> values) {
            addCriterion("sx_bl1 in", values, "sxBl1");
            return (Criteria) this;
        }

        public Criteria andSxBl1NotIn(List<String> values) {
            addCriterion("sx_bl1 not in", values, "sxBl1");
            return (Criteria) this;
        }

        public Criteria andSxBl1Between(String value1, String value2) {
            addCriterion("sx_bl1 between", value1, value2, "sxBl1");
            return (Criteria) this;
        }

        public Criteria andSxBl1NotBetween(String value1, String value2) {
            addCriterion("sx_bl1 not between", value1, value2, "sxBl1");
            return (Criteria) this;
        }

        public Criteria andSxBl2IsNull() {
            addCriterion("sx_bl2 is null");
            return (Criteria) this;
        }

        public Criteria andSxBl2IsNotNull() {
            addCriterion("sx_bl2 is not null");
            return (Criteria) this;
        }

        public Criteria andSxBl2EqualTo(String value) {
            addCriterion("sx_bl2 =", value, "sxBl2");
            return (Criteria) this;
        }

        public Criteria andSxBl2NotEqualTo(String value) {
            addCriterion("sx_bl2 <>", value, "sxBl2");
            return (Criteria) this;
        }

        public Criteria andSxBl2GreaterThan(String value) {
            addCriterion("sx_bl2 >", value, "sxBl2");
            return (Criteria) this;
        }

        public Criteria andSxBl2GreaterThanOrEqualTo(String value) {
            addCriterion("sx_bl2 >=", value, "sxBl2");
            return (Criteria) this;
        }

        public Criteria andSxBl2LessThan(String value) {
            addCriterion("sx_bl2 <", value, "sxBl2");
            return (Criteria) this;
        }

        public Criteria andSxBl2LessThanOrEqualTo(String value) {
            addCriterion("sx_bl2 <=", value, "sxBl2");
            return (Criteria) this;
        }

        public Criteria andSxBl2Like(String value) {
            addCriterion("sx_bl2 like", value, "sxBl2");
            return (Criteria) this;
        }

        public Criteria andSxBl2NotLike(String value) {
            addCriterion("sx_bl2 not like", value, "sxBl2");
            return (Criteria) this;
        }

        public Criteria andSxBl2In(List<String> values) {
            addCriterion("sx_bl2 in", values, "sxBl2");
            return (Criteria) this;
        }

        public Criteria andSxBl2NotIn(List<String> values) {
            addCriterion("sx_bl2 not in", values, "sxBl2");
            return (Criteria) this;
        }

        public Criteria andSxBl2Between(String value1, String value2) {
            addCriterion("sx_bl2 between", value1, value2, "sxBl2");
            return (Criteria) this;
        }

        public Criteria andSxBl2NotBetween(String value1, String value2) {
            addCriterion("sx_bl2 not between", value1, value2, "sxBl2");
            return (Criteria) this;
        }

        public Criteria andSxBl3IsNull() {
            addCriterion("sx_bl3 is null");
            return (Criteria) this;
        }

        public Criteria andSxBl3IsNotNull() {
            addCriterion("sx_bl3 is not null");
            return (Criteria) this;
        }

        public Criteria andSxBl3EqualTo(String value) {
            addCriterion("sx_bl3 =", value, "sxBl3");
            return (Criteria) this;
        }

        public Criteria andSxBl3NotEqualTo(String value) {
            addCriterion("sx_bl3 <>", value, "sxBl3");
            return (Criteria) this;
        }

        public Criteria andSxBl3GreaterThan(String value) {
            addCriterion("sx_bl3 >", value, "sxBl3");
            return (Criteria) this;
        }

        public Criteria andSxBl3GreaterThanOrEqualTo(String value) {
            addCriterion("sx_bl3 >=", value, "sxBl3");
            return (Criteria) this;
        }

        public Criteria andSxBl3LessThan(String value) {
            addCriterion("sx_bl3 <", value, "sxBl3");
            return (Criteria) this;
        }

        public Criteria andSxBl3LessThanOrEqualTo(String value) {
            addCriterion("sx_bl3 <=", value, "sxBl3");
            return (Criteria) this;
        }

        public Criteria andSxBl3Like(String value) {
            addCriterion("sx_bl3 like", value, "sxBl3");
            return (Criteria) this;
        }

        public Criteria andSxBl3NotLike(String value) {
            addCriterion("sx_bl3 not like", value, "sxBl3");
            return (Criteria) this;
        }

        public Criteria andSxBl3In(List<String> values) {
            addCriterion("sx_bl3 in", values, "sxBl3");
            return (Criteria) this;
        }

        public Criteria andSxBl3NotIn(List<String> values) {
            addCriterion("sx_bl3 not in", values, "sxBl3");
            return (Criteria) this;
        }

        public Criteria andSxBl3Between(String value1, String value2) {
            addCriterion("sx_bl3 between", value1, value2, "sxBl3");
            return (Criteria) this;
        }

        public Criteria andSxBl3NotBetween(String value1, String value2) {
            addCriterion("sx_bl3 not between", value1, value2, "sxBl3");
            return (Criteria) this;
        }

        public Criteria andSxBl4IsNull() {
            addCriterion("sx_bl4 is null");
            return (Criteria) this;
        }

        public Criteria andSxBl4IsNotNull() {
            addCriterion("sx_bl4 is not null");
            return (Criteria) this;
        }

        public Criteria andSxBl4EqualTo(String value) {
            addCriterion("sx_bl4 =", value, "sxBl4");
            return (Criteria) this;
        }

        public Criteria andSxBl4NotEqualTo(String value) {
            addCriterion("sx_bl4 <>", value, "sxBl4");
            return (Criteria) this;
        }

        public Criteria andSxBl4GreaterThan(String value) {
            addCriterion("sx_bl4 >", value, "sxBl4");
            return (Criteria) this;
        }

        public Criteria andSxBl4GreaterThanOrEqualTo(String value) {
            addCriterion("sx_bl4 >=", value, "sxBl4");
            return (Criteria) this;
        }

        public Criteria andSxBl4LessThan(String value) {
            addCriterion("sx_bl4 <", value, "sxBl4");
            return (Criteria) this;
        }

        public Criteria andSxBl4LessThanOrEqualTo(String value) {
            addCriterion("sx_bl4 <=", value, "sxBl4");
            return (Criteria) this;
        }

        public Criteria andSxBl4Like(String value) {
            addCriterion("sx_bl4 like", value, "sxBl4");
            return (Criteria) this;
        }

        public Criteria andSxBl4NotLike(String value) {
            addCriterion("sx_bl4 not like", value, "sxBl4");
            return (Criteria) this;
        }

        public Criteria andSxBl4In(List<String> values) {
            addCriterion("sx_bl4 in", values, "sxBl4");
            return (Criteria) this;
        }

        public Criteria andSxBl4NotIn(List<String> values) {
            addCriterion("sx_bl4 not in", values, "sxBl4");
            return (Criteria) this;
        }

        public Criteria andSxBl4Between(String value1, String value2) {
            addCriterion("sx_bl4 between", value1, value2, "sxBl4");
            return (Criteria) this;
        }

        public Criteria andSxBl4NotBetween(String value1, String value2) {
            addCriterion("sx_bl4 not between", value1, value2, "sxBl4");
            return (Criteria) this;
        }

        public Criteria andSxBl5IsNull() {
            addCriterion("sx_bl5 is null");
            return (Criteria) this;
        }

        public Criteria andSxBl5IsNotNull() {
            addCriterion("sx_bl5 is not null");
            return (Criteria) this;
        }

        public Criteria andSxBl5EqualTo(String value) {
            addCriterion("sx_bl5 =", value, "sxBl5");
            return (Criteria) this;
        }

        public Criteria andSxBl5NotEqualTo(String value) {
            addCriterion("sx_bl5 <>", value, "sxBl5");
            return (Criteria) this;
        }

        public Criteria andSxBl5GreaterThan(String value) {
            addCriterion("sx_bl5 >", value, "sxBl5");
            return (Criteria) this;
        }

        public Criteria andSxBl5GreaterThanOrEqualTo(String value) {
            addCriterion("sx_bl5 >=", value, "sxBl5");
            return (Criteria) this;
        }

        public Criteria andSxBl5LessThan(String value) {
            addCriterion("sx_bl5 <", value, "sxBl5");
            return (Criteria) this;
        }

        public Criteria andSxBl5LessThanOrEqualTo(String value) {
            addCriterion("sx_bl5 <=", value, "sxBl5");
            return (Criteria) this;
        }

        public Criteria andSxBl5Like(String value) {
            addCriterion("sx_bl5 like", value, "sxBl5");
            return (Criteria) this;
        }

        public Criteria andSxBl5NotLike(String value) {
            addCriterion("sx_bl5 not like", value, "sxBl5");
            return (Criteria) this;
        }

        public Criteria andSxBl5In(List<String> values) {
            addCriterion("sx_bl5 in", values, "sxBl5");
            return (Criteria) this;
        }

        public Criteria andSxBl5NotIn(List<String> values) {
            addCriterion("sx_bl5 not in", values, "sxBl5");
            return (Criteria) this;
        }

        public Criteria andSxBl5Between(String value1, String value2) {
            addCriterion("sx_bl5 between", value1, value2, "sxBl5");
            return (Criteria) this;
        }

        public Criteria andSxBl5NotBetween(String value1, String value2) {
            addCriterion("sx_bl5 not between", value1, value2, "sxBl5");
            return (Criteria) this;
        }

        public Criteria andSxBl6IsNull() {
            addCriterion("sx_bl6 is null");
            return (Criteria) this;
        }

        public Criteria andSxBl6IsNotNull() {
            addCriterion("sx_bl6 is not null");
            return (Criteria) this;
        }

        public Criteria andSxBl6EqualTo(String value) {
            addCriterion("sx_bl6 =", value, "sxBl6");
            return (Criteria) this;
        }

        public Criteria andSxBl6NotEqualTo(String value) {
            addCriterion("sx_bl6 <>", value, "sxBl6");
            return (Criteria) this;
        }

        public Criteria andSxBl6GreaterThan(String value) {
            addCriterion("sx_bl6 >", value, "sxBl6");
            return (Criteria) this;
        }

        public Criteria andSxBl6GreaterThanOrEqualTo(String value) {
            addCriterion("sx_bl6 >=", value, "sxBl6");
            return (Criteria) this;
        }

        public Criteria andSxBl6LessThan(String value) {
            addCriterion("sx_bl6 <", value, "sxBl6");
            return (Criteria) this;
        }

        public Criteria andSxBl6LessThanOrEqualTo(String value) {
            addCriterion("sx_bl6 <=", value, "sxBl6");
            return (Criteria) this;
        }

        public Criteria andSxBl6Like(String value) {
            addCriterion("sx_bl6 like", value, "sxBl6");
            return (Criteria) this;
        }

        public Criteria andSxBl6NotLike(String value) {
            addCriterion("sx_bl6 not like", value, "sxBl6");
            return (Criteria) this;
        }

        public Criteria andSxBl6In(List<String> values) {
            addCriterion("sx_bl6 in", values, "sxBl6");
            return (Criteria) this;
        }

        public Criteria andSxBl6NotIn(List<String> values) {
            addCriterion("sx_bl6 not in", values, "sxBl6");
            return (Criteria) this;
        }

        public Criteria andSxBl6Between(String value1, String value2) {
            addCriterion("sx_bl6 between", value1, value2, "sxBl6");
            return (Criteria) this;
        }

        public Criteria andSxBl6NotBetween(String value1, String value2) {
            addCriterion("sx_bl6 not between", value1, value2, "sxBl6");
            return (Criteria) this;
        }

        public Criteria andSxBl7IsNull() {
            addCriterion("sx_bl7 is null");
            return (Criteria) this;
        }

        public Criteria andSxBl7IsNotNull() {
            addCriterion("sx_bl7 is not null");
            return (Criteria) this;
        }

        public Criteria andSxBl7EqualTo(String value) {
            addCriterion("sx_bl7 =", value, "sxBl7");
            return (Criteria) this;
        }

        public Criteria andSxBl7NotEqualTo(String value) {
            addCriterion("sx_bl7 <>", value, "sxBl7");
            return (Criteria) this;
        }

        public Criteria andSxBl7GreaterThan(String value) {
            addCriterion("sx_bl7 >", value, "sxBl7");
            return (Criteria) this;
        }

        public Criteria andSxBl7GreaterThanOrEqualTo(String value) {
            addCriterion("sx_bl7 >=", value, "sxBl7");
            return (Criteria) this;
        }

        public Criteria andSxBl7LessThan(String value) {
            addCriterion("sx_bl7 <", value, "sxBl7");
            return (Criteria) this;
        }

        public Criteria andSxBl7LessThanOrEqualTo(String value) {
            addCriterion("sx_bl7 <=", value, "sxBl7");
            return (Criteria) this;
        }

        public Criteria andSxBl7Like(String value) {
            addCriterion("sx_bl7 like", value, "sxBl7");
            return (Criteria) this;
        }

        public Criteria andSxBl7NotLike(String value) {
            addCriterion("sx_bl7 not like", value, "sxBl7");
            return (Criteria) this;
        }

        public Criteria andSxBl7In(List<String> values) {
            addCriterion("sx_bl7 in", values, "sxBl7");
            return (Criteria) this;
        }

        public Criteria andSxBl7NotIn(List<String> values) {
            addCriterion("sx_bl7 not in", values, "sxBl7");
            return (Criteria) this;
        }

        public Criteria andSxBl7Between(String value1, String value2) {
            addCriterion("sx_bl7 between", value1, value2, "sxBl7");
            return (Criteria) this;
        }

        public Criteria andSxBl7NotBetween(String value1, String value2) {
            addCriterion("sx_bl7 not between", value1, value2, "sxBl7");
            return (Criteria) this;
        }

        public Criteria andSxBl8IsNull() {
            addCriterion("sx_bl8 is null");
            return (Criteria) this;
        }

        public Criteria andSxBl8IsNotNull() {
            addCriterion("sx_bl8 is not null");
            return (Criteria) this;
        }

        public Criteria andSxBl8EqualTo(String value) {
            addCriterion("sx_bl8 =", value, "sxBl8");
            return (Criteria) this;
        }

        public Criteria andSxBl8NotEqualTo(String value) {
            addCriterion("sx_bl8 <>", value, "sxBl8");
            return (Criteria) this;
        }

        public Criteria andSxBl8GreaterThan(String value) {
            addCriterion("sx_bl8 >", value, "sxBl8");
            return (Criteria) this;
        }

        public Criteria andSxBl8GreaterThanOrEqualTo(String value) {
            addCriterion("sx_bl8 >=", value, "sxBl8");
            return (Criteria) this;
        }

        public Criteria andSxBl8LessThan(String value) {
            addCriterion("sx_bl8 <", value, "sxBl8");
            return (Criteria) this;
        }

        public Criteria andSxBl8LessThanOrEqualTo(String value) {
            addCriterion("sx_bl8 <=", value, "sxBl8");
            return (Criteria) this;
        }

        public Criteria andSxBl8Like(String value) {
            addCriterion("sx_bl8 like", value, "sxBl8");
            return (Criteria) this;
        }

        public Criteria andSxBl8NotLike(String value) {
            addCriterion("sx_bl8 not like", value, "sxBl8");
            return (Criteria) this;
        }

        public Criteria andSxBl8In(List<String> values) {
            addCriterion("sx_bl8 in", values, "sxBl8");
            return (Criteria) this;
        }

        public Criteria andSxBl8NotIn(List<String> values) {
            addCriterion("sx_bl8 not in", values, "sxBl8");
            return (Criteria) this;
        }

        public Criteria andSxBl8Between(String value1, String value2) {
            addCriterion("sx_bl8 between", value1, value2, "sxBl8");
            return (Criteria) this;
        }

        public Criteria andSxBl8NotBetween(String value1, String value2) {
            addCriterion("sx_bl8 not between", value1, value2, "sxBl8");
            return (Criteria) this;
        }

        public Criteria andSxBl9IsNull() {
            addCriterion("sx_bl9 is null");
            return (Criteria) this;
        }

        public Criteria andSxBl9IsNotNull() {
            addCriterion("sx_bl9 is not null");
            return (Criteria) this;
        }

        public Criteria andSxBl9EqualTo(String value) {
            addCriterion("sx_bl9 =", value, "sxBl9");
            return (Criteria) this;
        }

        public Criteria andSxBl9NotEqualTo(String value) {
            addCriterion("sx_bl9 <>", value, "sxBl9");
            return (Criteria) this;
        }

        public Criteria andSxBl9GreaterThan(String value) {
            addCriterion("sx_bl9 >", value, "sxBl9");
            return (Criteria) this;
        }

        public Criteria andSxBl9GreaterThanOrEqualTo(String value) {
            addCriterion("sx_bl9 >=", value, "sxBl9");
            return (Criteria) this;
        }

        public Criteria andSxBl9LessThan(String value) {
            addCriterion("sx_bl9 <", value, "sxBl9");
            return (Criteria) this;
        }

        public Criteria andSxBl9LessThanOrEqualTo(String value) {
            addCriterion("sx_bl9 <=", value, "sxBl9");
            return (Criteria) this;
        }

        public Criteria andSxBl9Like(String value) {
            addCriterion("sx_bl9 like", value, "sxBl9");
            return (Criteria) this;
        }

        public Criteria andSxBl9NotLike(String value) {
            addCriterion("sx_bl9 not like", value, "sxBl9");
            return (Criteria) this;
        }

        public Criteria andSxBl9In(List<String> values) {
            addCriterion("sx_bl9 in", values, "sxBl9");
            return (Criteria) this;
        }

        public Criteria andSxBl9NotIn(List<String> values) {
            addCriterion("sx_bl9 not in", values, "sxBl9");
            return (Criteria) this;
        }

        public Criteria andSxBl9Between(String value1, String value2) {
            addCriterion("sx_bl9 between", value1, value2, "sxBl9");
            return (Criteria) this;
        }

        public Criteria andSxBl9NotBetween(String value1, String value2) {
            addCriterion("sx_bl9 not between", value1, value2, "sxBl9");
            return (Criteria) this;
        }

        public Criteria andSxBl10IsNull() {
            addCriterion("sx_bl10 is null");
            return (Criteria) this;
        }

        public Criteria andSxBl10IsNotNull() {
            addCriterion("sx_bl10 is not null");
            return (Criteria) this;
        }

        public Criteria andSxBl10EqualTo(String value) {
            addCriterion("sx_bl10 =", value, "sxBl10");
            return (Criteria) this;
        }

        public Criteria andSxBl10NotEqualTo(String value) {
            addCriterion("sx_bl10 <>", value, "sxBl10");
            return (Criteria) this;
        }

        public Criteria andSxBl10GreaterThan(String value) {
            addCriterion("sx_bl10 >", value, "sxBl10");
            return (Criteria) this;
        }

        public Criteria andSxBl10GreaterThanOrEqualTo(String value) {
            addCriterion("sx_bl10 >=", value, "sxBl10");
            return (Criteria) this;
        }

        public Criteria andSxBl10LessThan(String value) {
            addCriterion("sx_bl10 <", value, "sxBl10");
            return (Criteria) this;
        }

        public Criteria andSxBl10LessThanOrEqualTo(String value) {
            addCriterion("sx_bl10 <=", value, "sxBl10");
            return (Criteria) this;
        }

        public Criteria andSxBl10Like(String value) {
            addCriterion("sx_bl10 like", value, "sxBl10");
            return (Criteria) this;
        }

        public Criteria andSxBl10NotLike(String value) {
            addCriterion("sx_bl10 not like", value, "sxBl10");
            return (Criteria) this;
        }

        public Criteria andSxBl10In(List<String> values) {
            addCriterion("sx_bl10 in", values, "sxBl10");
            return (Criteria) this;
        }

        public Criteria andSxBl10NotIn(List<String> values) {
            addCriterion("sx_bl10 not in", values, "sxBl10");
            return (Criteria) this;
        }

        public Criteria andSxBl10Between(String value1, String value2) {
            addCriterion("sx_bl10 between", value1, value2, "sxBl10");
            return (Criteria) this;
        }

        public Criteria andSxBl10NotBetween(String value1, String value2) {
            addCriterion("sx_bl10 not between", value1, value2, "sxBl10");
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