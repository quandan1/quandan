package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class PollSourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PollSourceExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andXzqhdmIsNull() {
            addCriterion("XZQHDM is null");
            return (Criteria) this;
        }

        public Criteria andXzqhdmIsNotNull() {
            addCriterion("XZQHDM is not null");
            return (Criteria) this;
        }

        public Criteria andXzqhdmEqualTo(String value) {
            addCriterion("XZQHDM =", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmNotEqualTo(String value) {
            addCriterion("XZQHDM <>", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmGreaterThan(String value) {
            addCriterion("XZQHDM >", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmGreaterThanOrEqualTo(String value) {
            addCriterion("XZQHDM >=", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmLessThan(String value) {
            addCriterion("XZQHDM <", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmLessThanOrEqualTo(String value) {
            addCriterion("XZQHDM <=", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmLike(String value) {
            addCriterion("XZQHDM like", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmNotLike(String value) {
            addCriterion("XZQHDM not like", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmIn(List<String> values) {
            addCriterion("XZQHDM in", values, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmNotIn(List<String> values) {
            addCriterion("XZQHDM not in", values, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmBetween(String value1, String value2) {
            addCriterion("XZQHDM between", value1, value2, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmNotBetween(String value1, String value2) {
            addCriterion("XZQHDM not between", value1, value2, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhmcIsNull() {
            addCriterion("XZQHMC is null");
            return (Criteria) this;
        }

        public Criteria andXzqhmcIsNotNull() {
            addCriterion("XZQHMC is not null");
            return (Criteria) this;
        }

        public Criteria andXzqhmcEqualTo(String value) {
            addCriterion("XZQHMC =", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcNotEqualTo(String value) {
            addCriterion("XZQHMC <>", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcGreaterThan(String value) {
            addCriterion("XZQHMC >", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcGreaterThanOrEqualTo(String value) {
            addCriterion("XZQHMC >=", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcLessThan(String value) {
            addCriterion("XZQHMC <", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcLessThanOrEqualTo(String value) {
            addCriterion("XZQHMC <=", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcLike(String value) {
            addCriterion("XZQHMC like", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcNotLike(String value) {
            addCriterion("XZQHMC not like", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcIn(List<String> values) {
            addCriterion("XZQHMC in", values, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcNotIn(List<String> values) {
            addCriterion("XZQHMC not in", values, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcBetween(String value1, String value2) {
            addCriterion("XZQHMC between", value1, value2, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcNotBetween(String value1, String value2) {
            addCriterion("XZQHMC not between", value1, value2, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andTjnfIsNull() {
            addCriterion("TJNF is null");
            return (Criteria) this;
        }

        public Criteria andTjnfIsNotNull() {
            addCriterion("TJNF is not null");
            return (Criteria) this;
        }

        public Criteria andTjnfEqualTo(String value) {
            addCriterion("TJNF =", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfNotEqualTo(String value) {
            addCriterion("TJNF <>", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfGreaterThan(String value) {
            addCriterion("TJNF >", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfGreaterThanOrEqualTo(String value) {
            addCriterion("TJNF >=", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfLessThan(String value) {
            addCriterion("TJNF <", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfLessThanOrEqualTo(String value) {
            addCriterion("TJNF <=", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfLike(String value) {
            addCriterion("TJNF like", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfNotLike(String value) {
            addCriterion("TJNF not like", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfIn(List<String> values) {
            addCriterion("TJNF in", values, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfNotIn(List<String> values) {
            addCriterion("TJNF not in", values, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfBetween(String value1, String value2) {
            addCriterion("TJNF between", value1, value2, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfNotBetween(String value1, String value2) {
            addCriterion("TJNF not between", value1, value2, "tjnf");
            return (Criteria) this;
        }

        public Criteria andZzjgdmIsNull() {
            addCriterion("ZZJGDM is null");
            return (Criteria) this;
        }

        public Criteria andZzjgdmIsNotNull() {
            addCriterion("ZZJGDM is not null");
            return (Criteria) this;
        }

        public Criteria andZzjgdmEqualTo(String value) {
            addCriterion("ZZJGDM =", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotEqualTo(String value) {
            addCriterion("ZZJGDM <>", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmGreaterThan(String value) {
            addCriterion("ZZJGDM >", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmGreaterThanOrEqualTo(String value) {
            addCriterion("ZZJGDM >=", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmLessThan(String value) {
            addCriterion("ZZJGDM <", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmLessThanOrEqualTo(String value) {
            addCriterion("ZZJGDM <=", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmLike(String value) {
            addCriterion("ZZJGDM like", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotLike(String value) {
            addCriterion("ZZJGDM not like", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmIn(List<String> values) {
            addCriterion("ZZJGDM in", values, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotIn(List<String> values) {
            addCriterion("ZZJGDM not in", values, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmBetween(String value1, String value2) {
            addCriterion("ZZJGDM between", value1, value2, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotBetween(String value1, String value2) {
            addCriterion("ZZJGDM not between", value1, value2, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcIsNull() {
            addCriterion("TBDWXXMC is null");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcIsNotNull() {
            addCriterion("TBDWXXMC is not null");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcEqualTo(String value) {
            addCriterion("TBDWXXMC =", value, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcNotEqualTo(String value) {
            addCriterion("TBDWXXMC <>", value, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcGreaterThan(String value) {
            addCriterion("TBDWXXMC >", value, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcGreaterThanOrEqualTo(String value) {
            addCriterion("TBDWXXMC >=", value, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcLessThan(String value) {
            addCriterion("TBDWXXMC <", value, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcLessThanOrEqualTo(String value) {
            addCriterion("TBDWXXMC <=", value, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcLike(String value) {
            addCriterion("TBDWXXMC like", value, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcNotLike(String value) {
            addCriterion("TBDWXXMC not like", value, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcIn(List<String> values) {
            addCriterion("TBDWXXMC in", values, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcNotIn(List<String> values) {
            addCriterion("TBDWXXMC not in", values, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcBetween(String value1, String value2) {
            addCriterion("TBDWXXMC between", value1, value2, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcNotBetween(String value1, String value2) {
            addCriterion("TBDWXXMC not between", value1, value2, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andKzdyIsNull() {
            addCriterion("KZDY is null");
            return (Criteria) this;
        }

        public Criteria andKzdyIsNotNull() {
            addCriterion("KZDY is not null");
            return (Criteria) this;
        }

        public Criteria andKzdyEqualTo(String value) {
            addCriterion("KZDY =", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyNotEqualTo(String value) {
            addCriterion("KZDY <>", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyGreaterThan(String value) {
            addCriterion("KZDY >", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyGreaterThanOrEqualTo(String value) {
            addCriterion("KZDY >=", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyLessThan(String value) {
            addCriterion("KZDY <", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyLessThanOrEqualTo(String value) {
            addCriterion("KZDY <=", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyLike(String value) {
            addCriterion("KZDY like", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyNotLike(String value) {
            addCriterion("KZDY not like", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyIn(List<String> values) {
            addCriterion("KZDY in", values, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyNotIn(List<String> values) {
            addCriterion("KZDY not in", values, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyBetween(String value1, String value2) {
            addCriterion("KZDY between", value1, value2, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyNotBetween(String value1, String value2) {
            addCriterion("KZDY not between", value1, value2, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdmIsNull() {
            addCriterion("KZDM is null");
            return (Criteria) this;
        }

        public Criteria andKzdmIsNotNull() {
            addCriterion("KZDM is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmEqualTo(String value) {
            addCriterion("KZDM =", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmNotEqualTo(String value) {
            addCriterion("KZDM <>", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmGreaterThan(String value) {
            addCriterion("KZDM >", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmGreaterThanOrEqualTo(String value) {
            addCriterion("KZDM >=", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmLessThan(String value) {
            addCriterion("KZDM <", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmLessThanOrEqualTo(String value) {
            addCriterion("KZDM <=", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmLike(String value) {
            addCriterion("KZDM like", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmNotLike(String value) {
            addCriterion("KZDM not like", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmIn(List<String> values) {
            addCriterion("KZDM in", values, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmNotIn(List<String> values) {
            addCriterion("KZDM not in", values, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmBetween(String value1, String value2) {
            addCriterion("KZDM between", value1, value2, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmNotBetween(String value1, String value2) {
            addCriterion("KZDM not between", value1, value2, "kzdm");
            return (Criteria) this;
        }

        public Criteria andQyztIsNull() {
            addCriterion("QYZT is null");
            return (Criteria) this;
        }

        public Criteria andQyztIsNotNull() {
            addCriterion("QYZT is not null");
            return (Criteria) this;
        }

        public Criteria andQyztEqualTo(String value) {
            addCriterion("QYZT =", value, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztNotEqualTo(String value) {
            addCriterion("QYZT <>", value, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztGreaterThan(String value) {
            addCriterion("QYZT >", value, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztGreaterThanOrEqualTo(String value) {
            addCriterion("QYZT >=", value, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztLessThan(String value) {
            addCriterion("QYZT <", value, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztLessThanOrEqualTo(String value) {
            addCriterion("QYZT <=", value, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztLike(String value) {
            addCriterion("QYZT like", value, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztNotLike(String value) {
            addCriterion("QYZT not like", value, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztIn(List<String> values) {
            addCriterion("QYZT in", values, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztNotIn(List<String> values) {
            addCriterion("QYZT not in", values, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztBetween(String value1, String value2) {
            addCriterion("QYZT between", value1, value2, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztNotBetween(String value1, String value2) {
            addCriterion("QYZT not between", value1, value2, "qyzt");
            return (Criteria) this;
        }

        public Criteria andCymIsNull() {
            addCriterion("CYM is null");
            return (Criteria) this;
        }

        public Criteria andCymIsNotNull() {
            addCriterion("CYM is not null");
            return (Criteria) this;
        }

        public Criteria andCymEqualTo(String value) {
            addCriterion("CYM =", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymNotEqualTo(String value) {
            addCriterion("CYM <>", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymGreaterThan(String value) {
            addCriterion("CYM >", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymGreaterThanOrEqualTo(String value) {
            addCriterion("CYM >=", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymLessThan(String value) {
            addCriterion("CYM <", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymLessThanOrEqualTo(String value) {
            addCriterion("CYM <=", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymLike(String value) {
            addCriterion("CYM like", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymNotLike(String value) {
            addCriterion("CYM not like", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymIn(List<String> values) {
            addCriterion("CYM in", values, "cym");
            return (Criteria) this;
        }

        public Criteria andCymNotIn(List<String> values) {
            addCriterion("CYM not in", values, "cym");
            return (Criteria) this;
        }

        public Criteria andCymBetween(String value1, String value2) {
            addCriterion("CYM between", value1, value2, "cym");
            return (Criteria) this;
        }

        public Criteria andCymNotBetween(String value1, String value2) {
            addCriterion("CYM not between", value1, value2, "cym");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMIsNull() {
            addCriterion("XXDZDQ_S_Z_M is null");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMIsNotNull() {
            addCriterion("XXDZDQ_S_Z_M is not null");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMEqualTo(String value) {
            addCriterion("XXDZDQ_S_Z_M =", value, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMNotEqualTo(String value) {
            addCriterion("XXDZDQ_S_Z_M <>", value, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMGreaterThan(String value) {
            addCriterion("XXDZDQ_S_Z_M >", value, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMGreaterThanOrEqualTo(String value) {
            addCriterion("XXDZDQ_S_Z_M >=", value, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMLessThan(String value) {
            addCriterion("XXDZDQ_S_Z_M <", value, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMLessThanOrEqualTo(String value) {
            addCriterion("XXDZDQ_S_Z_M <=", value, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMLike(String value) {
            addCriterion("XXDZDQ_S_Z_M like", value, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMNotLike(String value) {
            addCriterion("XXDZDQ_S_Z_M not like", value, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMIn(List<String> values) {
            addCriterion("XXDZDQ_S_Z_M in", values, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMNotIn(List<String> values) {
            addCriterion("XXDZDQ_S_Z_M not in", values, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMBetween(String value1, String value2) {
            addCriterion("XXDZDQ_S_Z_M between", value1, value2, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMNotBetween(String value1, String value2) {
            addCriterion("XXDZDQ_S_Z_M not between", value1, value2, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQIsNull() {
            addCriterion("XXDZX_Q_S_Q is null");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQIsNotNull() {
            addCriterion("XXDZX_Q_S_Q is not null");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQEqualTo(String value) {
            addCriterion("XXDZX_Q_S_Q =", value, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQNotEqualTo(String value) {
            addCriterion("XXDZX_Q_S_Q <>", value, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQGreaterThan(String value) {
            addCriterion("XXDZX_Q_S_Q >", value, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQGreaterThanOrEqualTo(String value) {
            addCriterion("XXDZX_Q_S_Q >=", value, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQLessThan(String value) {
            addCriterion("XXDZX_Q_S_Q <", value, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQLessThanOrEqualTo(String value) {
            addCriterion("XXDZX_Q_S_Q <=", value, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQLike(String value) {
            addCriterion("XXDZX_Q_S_Q like", value, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQNotLike(String value) {
            addCriterion("XXDZX_Q_S_Q not like", value, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQIn(List<String> values) {
            addCriterion("XXDZX_Q_S_Q in", values, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQNotIn(List<String> values) {
            addCriterion("XXDZX_Q_S_Q not in", values, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQBetween(String value1, String value2) {
            addCriterion("XXDZX_Q_S_Q between", value1, value2, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQNotBetween(String value1, String value2) {
            addCriterion("XXDZX_Q_S_Q not between", value1, value2, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZIsNull() {
            addCriterion("XXDZX_Z is null");
            return (Criteria) this;
        }

        public Criteria andXxdzxZIsNotNull() {
            addCriterion("XXDZX_Z is not null");
            return (Criteria) this;
        }

        public Criteria andXxdzxZEqualTo(String value) {
            addCriterion("XXDZX_Z =", value, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZNotEqualTo(String value) {
            addCriterion("XXDZX_Z <>", value, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZGreaterThan(String value) {
            addCriterion("XXDZX_Z >", value, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZGreaterThanOrEqualTo(String value) {
            addCriterion("XXDZX_Z >=", value, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZLessThan(String value) {
            addCriterion("XXDZX_Z <", value, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZLessThanOrEqualTo(String value) {
            addCriterion("XXDZX_Z <=", value, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZLike(String value) {
            addCriterion("XXDZX_Z like", value, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZNotLike(String value) {
            addCriterion("XXDZX_Z not like", value, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZIn(List<String> values) {
            addCriterion("XXDZX_Z in", values, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZNotIn(List<String> values) {
            addCriterion("XXDZX_Z not in", values, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZBetween(String value1, String value2) {
            addCriterion("XXDZX_Z between", value1, value2, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZNotBetween(String value1, String value2) {
            addCriterion("XXDZX_Z not between", value1, value2, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphIsNull() {
            addCriterion("XXDZJ_C_MPH is null");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphIsNotNull() {
            addCriterion("XXDZJ_C_MPH is not null");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphEqualTo(String value) {
            addCriterion("XXDZJ_C_MPH =", value, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphNotEqualTo(String value) {
            addCriterion("XXDZJ_C_MPH <>", value, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphGreaterThan(String value) {
            addCriterion("XXDZJ_C_MPH >", value, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphGreaterThanOrEqualTo(String value) {
            addCriterion("XXDZJ_C_MPH >=", value, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphLessThan(String value) {
            addCriterion("XXDZJ_C_MPH <", value, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphLessThanOrEqualTo(String value) {
            addCriterion("XXDZJ_C_MPH <=", value, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphLike(String value) {
            addCriterion("XXDZJ_C_MPH like", value, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphNotLike(String value) {
            addCriterion("XXDZJ_C_MPH not like", value, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphIn(List<String> values) {
            addCriterion("XXDZJ_C_MPH in", values, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphNotIn(List<String> values) {
            addCriterion("XXDZJ_C_MPH not in", values, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphBetween(String value1, String value2) {
            addCriterion("XXDZJ_C_MPH between", value1, value2, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphNotBetween(String value1, String value2) {
            addCriterion("XXDZJ_C_MPH not between", value1, value2, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andZxjdDIsNull() {
            addCriterion("ZXJD_D is null");
            return (Criteria) this;
        }

        public Criteria andZxjdDIsNotNull() {
            addCriterion("ZXJD_D is not null");
            return (Criteria) this;
        }

        public Criteria andZxjdDEqualTo(String value) {
            addCriterion("ZXJD_D =", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDNotEqualTo(String value) {
            addCriterion("ZXJD_D <>", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDGreaterThan(String value) {
            addCriterion("ZXJD_D >", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDGreaterThanOrEqualTo(String value) {
            addCriterion("ZXJD_D >=", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDLessThan(String value) {
            addCriterion("ZXJD_D <", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDLessThanOrEqualTo(String value) {
            addCriterion("ZXJD_D <=", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDLike(String value) {
            addCriterion("ZXJD_D like", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDNotLike(String value) {
            addCriterion("ZXJD_D not like", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDIn(List<String> values) {
            addCriterion("ZXJD_D in", values, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDNotIn(List<String> values) {
            addCriterion("ZXJD_D not in", values, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDBetween(String value1, String value2) {
            addCriterion("ZXJD_D between", value1, value2, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDNotBetween(String value1, String value2) {
            addCriterion("ZXJD_D not between", value1, value2, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdFIsNull() {
            addCriterion("ZXJD_F is null");
            return (Criteria) this;
        }

        public Criteria andZxjdFIsNotNull() {
            addCriterion("ZXJD_F is not null");
            return (Criteria) this;
        }

        public Criteria andZxjdFEqualTo(String value) {
            addCriterion("ZXJD_F =", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFNotEqualTo(String value) {
            addCriterion("ZXJD_F <>", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFGreaterThan(String value) {
            addCriterion("ZXJD_F >", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFGreaterThanOrEqualTo(String value) {
            addCriterion("ZXJD_F >=", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFLessThan(String value) {
            addCriterion("ZXJD_F <", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFLessThanOrEqualTo(String value) {
            addCriterion("ZXJD_F <=", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFLike(String value) {
            addCriterion("ZXJD_F like", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFNotLike(String value) {
            addCriterion("ZXJD_F not like", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFIn(List<String> values) {
            addCriterion("ZXJD_F in", values, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFNotIn(List<String> values) {
            addCriterion("ZXJD_F not in", values, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFBetween(String value1, String value2) {
            addCriterion("ZXJD_F between", value1, value2, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFNotBetween(String value1, String value2) {
            addCriterion("ZXJD_F not between", value1, value2, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdMIsNull() {
            addCriterion("ZXJD_M is null");
            return (Criteria) this;
        }

        public Criteria andZxjdMIsNotNull() {
            addCriterion("ZXJD_M is not null");
            return (Criteria) this;
        }

        public Criteria andZxjdMEqualTo(String value) {
            addCriterion("ZXJD_M =", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMNotEqualTo(String value) {
            addCriterion("ZXJD_M <>", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMGreaterThan(String value) {
            addCriterion("ZXJD_M >", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMGreaterThanOrEqualTo(String value) {
            addCriterion("ZXJD_M >=", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMLessThan(String value) {
            addCriterion("ZXJD_M <", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMLessThanOrEqualTo(String value) {
            addCriterion("ZXJD_M <=", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMLike(String value) {
            addCriterion("ZXJD_M like", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMNotLike(String value) {
            addCriterion("ZXJD_M not like", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMIn(List<String> values) {
            addCriterion("ZXJD_M in", values, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMNotIn(List<String> values) {
            addCriterion("ZXJD_M not in", values, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMBetween(String value1, String value2) {
            addCriterion("ZXJD_M between", value1, value2, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMNotBetween(String value1, String value2) {
            addCriterion("ZXJD_M not between", value1, value2, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andJdGIsNull() {
            addCriterion("JD_G is null");
            return (Criteria) this;
        }

        public Criteria andJdGIsNotNull() {
            addCriterion("JD_G is not null");
            return (Criteria) this;
        }

        public Criteria andJdGEqualTo(String value) {
            addCriterion("JD_G =", value, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdGNotEqualTo(String value) {
            addCriterion("JD_G <>", value, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdGGreaterThan(String value) {
            addCriterion("JD_G >", value, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdGGreaterThanOrEqualTo(String value) {
            addCriterion("JD_G >=", value, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdGLessThan(String value) {
            addCriterion("JD_G <", value, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdGLessThanOrEqualTo(String value) {
            addCriterion("JD_G <=", value, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdGLike(String value) {
            addCriterion("JD_G like", value, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdGNotLike(String value) {
            addCriterion("JD_G not like", value, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdGIn(List<String> values) {
            addCriterion("JD_G in", values, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdGNotIn(List<String> values) {
            addCriterion("JD_G not in", values, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdGBetween(String value1, String value2) {
            addCriterion("JD_G between", value1, value2, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdGNotBetween(String value1, String value2) {
            addCriterion("JD_G not between", value1, value2, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdZcxdIsNull() {
            addCriterion("JD_ZCXD is null");
            return (Criteria) this;
        }

        public Criteria andJdZcxdIsNotNull() {
            addCriterion("JD_ZCXD is not null");
            return (Criteria) this;
        }

        public Criteria andJdZcxdEqualTo(String value) {
            addCriterion("JD_ZCXD =", value, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andJdZcxdNotEqualTo(String value) {
            addCriterion("JD_ZCXD <>", value, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andJdZcxdGreaterThan(String value) {
            addCriterion("JD_ZCXD >", value, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andJdZcxdGreaterThanOrEqualTo(String value) {
            addCriterion("JD_ZCXD >=", value, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andJdZcxdLessThan(String value) {
            addCriterion("JD_ZCXD <", value, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andJdZcxdLessThanOrEqualTo(String value) {
            addCriterion("JD_ZCXD <=", value, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andJdZcxdLike(String value) {
            addCriterion("JD_ZCXD like", value, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andJdZcxdNotLike(String value) {
            addCriterion("JD_ZCXD not like", value, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andJdZcxdIn(List<String> values) {
            addCriterion("JD_ZCXD in", values, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andJdZcxdNotIn(List<String> values) {
            addCriterion("JD_ZCXD not in", values, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andJdZcxdBetween(String value1, String value2) {
            addCriterion("JD_ZCXD between", value1, value2, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andJdZcxdNotBetween(String value1, String value2) {
            addCriterion("JD_ZCXD not between", value1, value2, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andZxwdDIsNull() {
            addCriterion("ZXWD_D is null");
            return (Criteria) this;
        }

        public Criteria andZxwdDIsNotNull() {
            addCriterion("ZXWD_D is not null");
            return (Criteria) this;
        }

        public Criteria andZxwdDEqualTo(String value) {
            addCriterion("ZXWD_D =", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDNotEqualTo(String value) {
            addCriterion("ZXWD_D <>", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDGreaterThan(String value) {
            addCriterion("ZXWD_D >", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDGreaterThanOrEqualTo(String value) {
            addCriterion("ZXWD_D >=", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDLessThan(String value) {
            addCriterion("ZXWD_D <", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDLessThanOrEqualTo(String value) {
            addCriterion("ZXWD_D <=", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDLike(String value) {
            addCriterion("ZXWD_D like", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDNotLike(String value) {
            addCriterion("ZXWD_D not like", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDIn(List<String> values) {
            addCriterion("ZXWD_D in", values, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDNotIn(List<String> values) {
            addCriterion("ZXWD_D not in", values, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDBetween(String value1, String value2) {
            addCriterion("ZXWD_D between", value1, value2, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDNotBetween(String value1, String value2) {
            addCriterion("ZXWD_D not between", value1, value2, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdFIsNull() {
            addCriterion("ZXWD_F is null");
            return (Criteria) this;
        }

        public Criteria andZxwdFIsNotNull() {
            addCriterion("ZXWD_F is not null");
            return (Criteria) this;
        }

        public Criteria andZxwdFEqualTo(String value) {
            addCriterion("ZXWD_F =", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFNotEqualTo(String value) {
            addCriterion("ZXWD_F <>", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFGreaterThan(String value) {
            addCriterion("ZXWD_F >", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFGreaterThanOrEqualTo(String value) {
            addCriterion("ZXWD_F >=", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFLessThan(String value) {
            addCriterion("ZXWD_F <", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFLessThanOrEqualTo(String value) {
            addCriterion("ZXWD_F <=", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFLike(String value) {
            addCriterion("ZXWD_F like", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFNotLike(String value) {
            addCriterion("ZXWD_F not like", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFIn(List<String> values) {
            addCriterion("ZXWD_F in", values, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFNotIn(List<String> values) {
            addCriterion("ZXWD_F not in", values, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFBetween(String value1, String value2) {
            addCriterion("ZXWD_F between", value1, value2, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFNotBetween(String value1, String value2) {
            addCriterion("ZXWD_F not between", value1, value2, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdMIsNull() {
            addCriterion("ZXWD_M is null");
            return (Criteria) this;
        }

        public Criteria andZxwdMIsNotNull() {
            addCriterion("ZXWD_M is not null");
            return (Criteria) this;
        }

        public Criteria andZxwdMEqualTo(String value) {
            addCriterion("ZXWD_M =", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMNotEqualTo(String value) {
            addCriterion("ZXWD_M <>", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMGreaterThan(String value) {
            addCriterion("ZXWD_M >", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMGreaterThanOrEqualTo(String value) {
            addCriterion("ZXWD_M >=", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMLessThan(String value) {
            addCriterion("ZXWD_M <", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMLessThanOrEqualTo(String value) {
            addCriterion("ZXWD_M <=", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMLike(String value) {
            addCriterion("ZXWD_M like", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMNotLike(String value) {
            addCriterion("ZXWD_M not like", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMIn(List<String> values) {
            addCriterion("ZXWD_M in", values, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMNotIn(List<String> values) {
            addCriterion("ZXWD_M not in", values, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMBetween(String value1, String value2) {
            addCriterion("ZXWD_M between", value1, value2, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMNotBetween(String value1, String value2) {
            addCriterion("ZXWD_M not between", value1, value2, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andWdGIsNull() {
            addCriterion("WD_G is null");
            return (Criteria) this;
        }

        public Criteria andWdGIsNotNull() {
            addCriterion("WD_G is not null");
            return (Criteria) this;
        }

        public Criteria andWdGEqualTo(String value) {
            addCriterion("WD_G =", value, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdGNotEqualTo(String value) {
            addCriterion("WD_G <>", value, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdGGreaterThan(String value) {
            addCriterion("WD_G >", value, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdGGreaterThanOrEqualTo(String value) {
            addCriterion("WD_G >=", value, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdGLessThan(String value) {
            addCriterion("WD_G <", value, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdGLessThanOrEqualTo(String value) {
            addCriterion("WD_G <=", value, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdGLike(String value) {
            addCriterion("WD_G like", value, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdGNotLike(String value) {
            addCriterion("WD_G not like", value, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdGIn(List<String> values) {
            addCriterion("WD_G in", values, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdGNotIn(List<String> values) {
            addCriterion("WD_G not in", values, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdGBetween(String value1, String value2) {
            addCriterion("WD_G between", value1, value2, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdGNotBetween(String value1, String value2) {
            addCriterion("WD_G not between", value1, value2, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdZcxdIsNull() {
            addCriterion("WD_ZCXD is null");
            return (Criteria) this;
        }

        public Criteria andWdZcxdIsNotNull() {
            addCriterion("WD_ZCXD is not null");
            return (Criteria) this;
        }

        public Criteria andWdZcxdEqualTo(String value) {
            addCriterion("WD_ZCXD =", value, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andWdZcxdNotEqualTo(String value) {
            addCriterion("WD_ZCXD <>", value, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andWdZcxdGreaterThan(String value) {
            addCriterion("WD_ZCXD >", value, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andWdZcxdGreaterThanOrEqualTo(String value) {
            addCriterion("WD_ZCXD >=", value, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andWdZcxdLessThan(String value) {
            addCriterion("WD_ZCXD <", value, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andWdZcxdLessThanOrEqualTo(String value) {
            addCriterion("WD_ZCXD <=", value, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andWdZcxdLike(String value) {
            addCriterion("WD_ZCXD like", value, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andWdZcxdNotLike(String value) {
            addCriterion("WD_ZCXD not like", value, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andWdZcxdIn(List<String> values) {
            addCriterion("WD_ZCXD in", values, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andWdZcxdNotIn(List<String> values) {
            addCriterion("WD_ZCXD not in", values, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andWdZcxdBetween(String value1, String value2) {
            addCriterion("WD_ZCXD between", value1, value2, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andWdZcxdNotBetween(String value1, String value2) {
            addCriterion("WD_ZCXD not between", value1, value2, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andDjzclxIsNull() {
            addCriterion("DJZCLX is null");
            return (Criteria) this;
        }

        public Criteria andDjzclxIsNotNull() {
            addCriterion("DJZCLX is not null");
            return (Criteria) this;
        }

        public Criteria andDjzclxEqualTo(String value) {
            addCriterion("DJZCLX =", value, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxNotEqualTo(String value) {
            addCriterion("DJZCLX <>", value, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxGreaterThan(String value) {
            addCriterion("DJZCLX >", value, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxGreaterThanOrEqualTo(String value) {
            addCriterion("DJZCLX >=", value, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxLessThan(String value) {
            addCriterion("DJZCLX <", value, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxLessThanOrEqualTo(String value) {
            addCriterion("DJZCLX <=", value, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxLike(String value) {
            addCriterion("DJZCLX like", value, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxNotLike(String value) {
            addCriterion("DJZCLX not like", value, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxIn(List<String> values) {
            addCriterion("DJZCLX in", values, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxNotIn(List<String> values) {
            addCriterion("DJZCLX not in", values, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxBetween(String value1, String value2) {
            addCriterion("DJZCLX between", value1, value2, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxNotBetween(String value1, String value2) {
            addCriterion("DJZCLX not between", value1, value2, "djzclx");
            return (Criteria) this;
        }

        public Criteria andQygmIsNull() {
            addCriterion("QYGM is null");
            return (Criteria) this;
        }

        public Criteria andQygmIsNotNull() {
            addCriterion("QYGM is not null");
            return (Criteria) this;
        }

        public Criteria andQygmEqualTo(String value) {
            addCriterion("QYGM =", value, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmNotEqualTo(String value) {
            addCriterion("QYGM <>", value, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmGreaterThan(String value) {
            addCriterion("QYGM >", value, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmGreaterThanOrEqualTo(String value) {
            addCriterion("QYGM >=", value, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmLessThan(String value) {
            addCriterion("QYGM <", value, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmLessThanOrEqualTo(String value) {
            addCriterion("QYGM <=", value, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmLike(String value) {
            addCriterion("QYGM like", value, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmNotLike(String value) {
            addCriterion("QYGM not like", value, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmIn(List<String> values) {
            addCriterion("QYGM in", values, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmNotIn(List<String> values) {
            addCriterion("QYGM not in", values, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmBetween(String value1, String value2) {
            addCriterion("QYGM between", value1, value2, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmNotBetween(String value1, String value2) {
            addCriterion("QYGM not between", value1, value2, "qygm");
            return (Criteria) this;
        }

        public Criteria andSsjtgsIsNull() {
            addCriterion("SSJTGS is null");
            return (Criteria) this;
        }

        public Criteria andSsjtgsIsNotNull() {
            addCriterion("SSJTGS is not null");
            return (Criteria) this;
        }

        public Criteria andSsjtgsEqualTo(String value) {
            addCriterion("SSJTGS =", value, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsNotEqualTo(String value) {
            addCriterion("SSJTGS <>", value, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsGreaterThan(String value) {
            addCriterion("SSJTGS >", value, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsGreaterThanOrEqualTo(String value) {
            addCriterion("SSJTGS >=", value, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsLessThan(String value) {
            addCriterion("SSJTGS <", value, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsLessThanOrEqualTo(String value) {
            addCriterion("SSJTGS <=", value, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsLike(String value) {
            addCriterion("SSJTGS like", value, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsNotLike(String value) {
            addCriterion("SSJTGS not like", value, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsIn(List<String> values) {
            addCriterion("SSJTGS in", values, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsNotIn(List<String> values) {
            addCriterion("SSJTGS not in", values, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsBetween(String value1, String value2) {
            addCriterion("SSJTGS between", value1, value2, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsNotBetween(String value1, String value2) {
            addCriterion("SSJTGS not between", value1, value2, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andXylbdmIsNull() {
            addCriterion("XYLBDM is null");
            return (Criteria) this;
        }

        public Criteria andXylbdmIsNotNull() {
            addCriterion("XYLBDM is not null");
            return (Criteria) this;
        }

        public Criteria andXylbdmEqualTo(String value) {
            addCriterion("XYLBDM =", value, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmNotEqualTo(String value) {
            addCriterion("XYLBDM <>", value, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmGreaterThan(String value) {
            addCriterion("XYLBDM >", value, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmGreaterThanOrEqualTo(String value) {
            addCriterion("XYLBDM >=", value, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmLessThan(String value) {
            addCriterion("XYLBDM <", value, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmLessThanOrEqualTo(String value) {
            addCriterion("XYLBDM <=", value, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmLike(String value) {
            addCriterion("XYLBDM like", value, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmNotLike(String value) {
            addCriterion("XYLBDM not like", value, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmIn(List<String> values) {
            addCriterion("XYLBDM in", values, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmNotIn(List<String> values) {
            addCriterion("XYLBDM not in", values, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmBetween(String value1, String value2) {
            addCriterion("XYLBDM between", value1, value2, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmNotBetween(String value1, String value2) {
            addCriterion("XYLBDM not between", value1, value2, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbmcIsNull() {
            addCriterion("XYLBMC is null");
            return (Criteria) this;
        }

        public Criteria andXylbmcIsNotNull() {
            addCriterion("XYLBMC is not null");
            return (Criteria) this;
        }

        public Criteria andXylbmcEqualTo(String value) {
            addCriterion("XYLBMC =", value, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcNotEqualTo(String value) {
            addCriterion("XYLBMC <>", value, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcGreaterThan(String value) {
            addCriterion("XYLBMC >", value, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcGreaterThanOrEqualTo(String value) {
            addCriterion("XYLBMC >=", value, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcLessThan(String value) {
            addCriterion("XYLBMC <", value, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcLessThanOrEqualTo(String value) {
            addCriterion("XYLBMC <=", value, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcLike(String value) {
            addCriterion("XYLBMC like", value, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcNotLike(String value) {
            addCriterion("XYLBMC not like", value, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcIn(List<String> values) {
            addCriterion("XYLBMC in", values, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcNotIn(List<String> values) {
            addCriterion("XYLBMC not in", values, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcBetween(String value1, String value2) {
            addCriterion("XYLBMC between", value1, value2, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcNotBetween(String value1, String value2) {
            addCriterion("XYLBMC not between", value1, value2, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andKysjYIsNull() {
            addCriterion("KYSJ_Y is null");
            return (Criteria) this;
        }

        public Criteria andKysjYIsNotNull() {
            addCriterion("KYSJ_Y is not null");
            return (Criteria) this;
        }

        public Criteria andKysjYEqualTo(String value) {
            addCriterion("KYSJ_Y =", value, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjYNotEqualTo(String value) {
            addCriterion("KYSJ_Y <>", value, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjYGreaterThan(String value) {
            addCriterion("KYSJ_Y >", value, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjYGreaterThanOrEqualTo(String value) {
            addCriterion("KYSJ_Y >=", value, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjYLessThan(String value) {
            addCriterion("KYSJ_Y <", value, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjYLessThanOrEqualTo(String value) {
            addCriterion("KYSJ_Y <=", value, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjYLike(String value) {
            addCriterion("KYSJ_Y like", value, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjYNotLike(String value) {
            addCriterion("KYSJ_Y not like", value, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjYIn(List<String> values) {
            addCriterion("KYSJ_Y in", values, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjYNotIn(List<String> values) {
            addCriterion("KYSJ_Y not in", values, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjYBetween(String value1, String value2) {
            addCriterion("KYSJ_Y between", value1, value2, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjYNotBetween(String value1, String value2) {
            addCriterion("KYSJ_Y not between", value1, value2, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjNIsNull() {
            addCriterion("KYSJ_N is null");
            return (Criteria) this;
        }

        public Criteria andKysjNIsNotNull() {
            addCriterion("KYSJ_N is not null");
            return (Criteria) this;
        }

        public Criteria andKysjNEqualTo(String value) {
            addCriterion("KYSJ_N =", value, "kysjN");
            return (Criteria) this;
        }

        public Criteria andKysjNNotEqualTo(String value) {
            addCriterion("KYSJ_N <>", value, "kysjN");
            return (Criteria) this;
        }

        public Criteria andKysjNGreaterThan(String value) {
            addCriterion("KYSJ_N >", value, "kysjN");
            return (Criteria) this;
        }

        public Criteria andKysjNGreaterThanOrEqualTo(String value) {
            addCriterion("KYSJ_N >=", value, "kysjN");
            return (Criteria) this;
        }

        public Criteria andKysjNLessThan(String value) {
            addCriterion("KYSJ_N <", value, "kysjN");
            return (Criteria) this;
        }

        public Criteria andKysjNLessThanOrEqualTo(String value) {
            addCriterion("KYSJ_N <=", value, "kysjN");
            return (Criteria) this;
        }

        public Criteria andKysjNLike(String value) {
            addCriterion("KYSJ_N like", value, "kysjN");
            return (Criteria) this;
        }

        public Criteria andKysjNNotLike(String value) {
            addCriterion("KYSJ_N not like", value, "kysjN");
            return (Criteria) this;
        }

        public Criteria andKysjNIn(List<String> values) {
            addCriterion("KYSJ_N in", values, "kysjN");
            return (Criteria) this;
        }

        public Criteria andKysjNNotIn(List<String> values) {
            addCriterion("KYSJ_N not in", values, "kysjN");
            return (Criteria) this;
        }

        public Criteria andKysjNBetween(String value1, String value2) {
            addCriterion("KYSJ_N between", value1, value2, "kysjN");
            return (Criteria) this;
        }

        public Criteria andKysjNNotBetween(String value1, String value2) {
            addCriterion("KYSJ_N not between", value1, value2, "kysjN");
            return (Criteria) this;
        }

        public Criteria andSzlydmIsNull() {
            addCriterion("SZLYDM is null");
            return (Criteria) this;
        }

        public Criteria andSzlydmIsNotNull() {
            addCriterion("SZLYDM is not null");
            return (Criteria) this;
        }

        public Criteria andSzlydmEqualTo(String value) {
            addCriterion("SZLYDM =", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmNotEqualTo(String value) {
            addCriterion("SZLYDM <>", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmGreaterThan(String value) {
            addCriterion("SZLYDM >", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmGreaterThanOrEqualTo(String value) {
            addCriterion("SZLYDM >=", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmLessThan(String value) {
            addCriterion("SZLYDM <", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmLessThanOrEqualTo(String value) {
            addCriterion("SZLYDM <=", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmLike(String value) {
            addCriterion("SZLYDM like", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmNotLike(String value) {
            addCriterion("SZLYDM not like", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmIn(List<String> values) {
            addCriterion("SZLYDM in", values, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmNotIn(List<String> values) {
            addCriterion("SZLYDM not in", values, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmBetween(String value1, String value2) {
            addCriterion("SZLYDM between", value1, value2, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmNotBetween(String value1, String value2) {
            addCriterion("SZLYDM not between", value1, value2, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlymcIsNull() {
            addCriterion("SZLYMC is null");
            return (Criteria) this;
        }

        public Criteria andSzlymcIsNotNull() {
            addCriterion("SZLYMC is not null");
            return (Criteria) this;
        }

        public Criteria andSzlymcEqualTo(String value) {
            addCriterion("SZLYMC =", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcNotEqualTo(String value) {
            addCriterion("SZLYMC <>", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcGreaterThan(String value) {
            addCriterion("SZLYMC >", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcGreaterThanOrEqualTo(String value) {
            addCriterion("SZLYMC >=", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcLessThan(String value) {
            addCriterion("SZLYMC <", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcLessThanOrEqualTo(String value) {
            addCriterion("SZLYMC <=", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcLike(String value) {
            addCriterion("SZLYMC like", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcNotLike(String value) {
            addCriterion("SZLYMC not like", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcIn(List<String> values) {
            addCriterion("SZLYMC in", values, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcNotIn(List<String> values) {
            addCriterion("SZLYMC not in", values, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcBetween(String value1, String value2) {
            addCriterion("SZLYMC between", value1, value2, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcNotBetween(String value1, String value2) {
            addCriterion("SZLYMC not between", value1, value2, "szlymc");
            return (Criteria) this;
        }

        public Criteria andPsqxdmIsNull() {
            addCriterion("PSQXDM is null");
            return (Criteria) this;
        }

        public Criteria andPsqxdmIsNotNull() {
            addCriterion("PSQXDM is not null");
            return (Criteria) this;
        }

        public Criteria andPsqxdmEqualTo(String value) {
            addCriterion("PSQXDM =", value, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmNotEqualTo(String value) {
            addCriterion("PSQXDM <>", value, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmGreaterThan(String value) {
            addCriterion("PSQXDM >", value, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmGreaterThanOrEqualTo(String value) {
            addCriterion("PSQXDM >=", value, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmLessThan(String value) {
            addCriterion("PSQXDM <", value, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmLessThanOrEqualTo(String value) {
            addCriterion("PSQXDM <=", value, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmLike(String value) {
            addCriterion("PSQXDM like", value, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmNotLike(String value) {
            addCriterion("PSQXDM not like", value, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmIn(List<String> values) {
            addCriterion("PSQXDM in", values, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmNotIn(List<String> values) {
            addCriterion("PSQXDM not in", values, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmBetween(String value1, String value2) {
            addCriterion("PSQXDM between", value1, value2, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmNotBetween(String value1, String value2) {
            addCriterion("PSQXDM not between", value1, value2, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxIsNull() {
            addCriterion("PSQXLX is null");
            return (Criteria) this;
        }

        public Criteria andPsqxlxIsNotNull() {
            addCriterion("PSQXLX is not null");
            return (Criteria) this;
        }

        public Criteria andPsqxlxEqualTo(String value) {
            addCriterion("PSQXLX =", value, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxNotEqualTo(String value) {
            addCriterion("PSQXLX <>", value, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxGreaterThan(String value) {
            addCriterion("PSQXLX >", value, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxGreaterThanOrEqualTo(String value) {
            addCriterion("PSQXLX >=", value, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxLessThan(String value) {
            addCriterion("PSQXLX <", value, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxLessThanOrEqualTo(String value) {
            addCriterion("PSQXLX <=", value, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxLike(String value) {
            addCriterion("PSQXLX like", value, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxNotLike(String value) {
            addCriterion("PSQXLX not like", value, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxIn(List<String> values) {
            addCriterion("PSQXLX in", values, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxNotIn(List<String> values) {
            addCriterion("PSQXLX not in", values, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxBetween(String value1, String value2) {
            addCriterion("PSQXLX between", value1, value2, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxNotBetween(String value1, String value2) {
            addCriterion("PSQXLX not between", value1, value2, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmIsNull() {
            addCriterion("PRDWSCLCDM is null");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmIsNotNull() {
            addCriterion("PRDWSCLCDM is not null");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmEqualTo(String value) {
            addCriterion("PRDWSCLCDM =", value, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmNotEqualTo(String value) {
            addCriterion("PRDWSCLCDM <>", value, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmGreaterThan(String value) {
            addCriterion("PRDWSCLCDM >", value, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmGreaterThanOrEqualTo(String value) {
            addCriterion("PRDWSCLCDM >=", value, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmLessThan(String value) {
            addCriterion("PRDWSCLCDM <", value, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmLessThanOrEqualTo(String value) {
            addCriterion("PRDWSCLCDM <=", value, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmLike(String value) {
            addCriterion("PRDWSCLCDM like", value, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmNotLike(String value) {
            addCriterion("PRDWSCLCDM not like", value, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmIn(List<String> values) {
            addCriterion("PRDWSCLCDM in", values, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmNotIn(List<String> values) {
            addCriterion("PRDWSCLCDM not in", values, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmBetween(String value1, String value2) {
            addCriterion("PRDWSCLCDM between", value1, value2, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmNotBetween(String value1, String value2) {
            addCriterion("PRDWSCLCDM not between", value1, value2, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcIsNull() {
            addCriterion("PRDWSCLCMC is null");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcIsNotNull() {
            addCriterion("PRDWSCLCMC is not null");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcEqualTo(String value) {
            addCriterion("PRDWSCLCMC =", value, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcNotEqualTo(String value) {
            addCriterion("PRDWSCLCMC <>", value, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcGreaterThan(String value) {
            addCriterion("PRDWSCLCMC >", value, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcGreaterThanOrEqualTo(String value) {
            addCriterion("PRDWSCLCMC >=", value, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcLessThan(String value) {
            addCriterion("PRDWSCLCMC <", value, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcLessThanOrEqualTo(String value) {
            addCriterion("PRDWSCLCMC <=", value, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcLike(String value) {
            addCriterion("PRDWSCLCMC like", value, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcNotLike(String value) {
            addCriterion("PRDWSCLCMC not like", value, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcIn(List<String> values) {
            addCriterion("PRDWSCLCMC in", values, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcNotIn(List<String> values) {
            addCriterion("PRDWSCLCMC not in", values, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcBetween(String value1, String value2) {
            addCriterion("PRDWSCLCMC between", value1, value2, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcNotBetween(String value1, String value2) {
            addCriterion("PRDWSCLCMC not between", value1, value2, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andSnstdmIsNull() {
            addCriterion("SNSTDM is null");
            return (Criteria) this;
        }

        public Criteria andSnstdmIsNotNull() {
            addCriterion("SNSTDM is not null");
            return (Criteria) this;
        }

        public Criteria andSnstdmEqualTo(String value) {
            addCriterion("SNSTDM =", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmNotEqualTo(String value) {
            addCriterion("SNSTDM <>", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmGreaterThan(String value) {
            addCriterion("SNSTDM >", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmGreaterThanOrEqualTo(String value) {
            addCriterion("SNSTDM >=", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmLessThan(String value) {
            addCriterion("SNSTDM <", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmLessThanOrEqualTo(String value) {
            addCriterion("SNSTDM <=", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmLike(String value) {
            addCriterion("SNSTDM like", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmNotLike(String value) {
            addCriterion("SNSTDM not like", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmIn(List<String> values) {
            addCriterion("SNSTDM in", values, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmNotIn(List<String> values) {
            addCriterion("SNSTDM not in", values, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmBetween(String value1, String value2) {
            addCriterion("SNSTDM between", value1, value2, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmNotBetween(String value1, String value2) {
            addCriterion("SNSTDM not between", value1, value2, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstmcIsNull() {
            addCriterion("SNSTMC is null");
            return (Criteria) this;
        }

        public Criteria andSnstmcIsNotNull() {
            addCriterion("SNSTMC is not null");
            return (Criteria) this;
        }

        public Criteria andSnstmcEqualTo(String value) {
            addCriterion("SNSTMC =", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcNotEqualTo(String value) {
            addCriterion("SNSTMC <>", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcGreaterThan(String value) {
            addCriterion("SNSTMC >", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcGreaterThanOrEqualTo(String value) {
            addCriterion("SNSTMC >=", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcLessThan(String value) {
            addCriterion("SNSTMC <", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcLessThanOrEqualTo(String value) {
            addCriterion("SNSTMC <=", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcLike(String value) {
            addCriterion("SNSTMC like", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcNotLike(String value) {
            addCriterion("SNSTMC not like", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcIn(List<String> values) {
            addCriterion("SNSTMC in", values, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcNotIn(List<String> values) {
            addCriterion("SNSTMC not in", values, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcBetween(String value1, String value2) {
            addCriterion("SNSTMC between", value1, value2, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcNotBetween(String value1, String value2) {
            addCriterion("SNSTMC not between", value1, value2, "snstmc");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyIsNull() {
            addCriterion("GYZCZ_DNJG_WY is null");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyIsNotNull() {
            addCriterion("GYZCZ_DNJG_WY is not null");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyEqualTo(String value) {
            addCriterion("GYZCZ_DNJG_WY =", value, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyNotEqualTo(String value) {
            addCriterion("GYZCZ_DNJG_WY <>", value, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyGreaterThan(String value) {
            addCriterion("GYZCZ_DNJG_WY >", value, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyGreaterThanOrEqualTo(String value) {
            addCriterion("GYZCZ_DNJG_WY >=", value, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyLessThan(String value) {
            addCriterion("GYZCZ_DNJG_WY <", value, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyLessThanOrEqualTo(String value) {
            addCriterion("GYZCZ_DNJG_WY <=", value, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyLike(String value) {
            addCriterion("GYZCZ_DNJG_WY like", value, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyNotLike(String value) {
            addCriterion("GYZCZ_DNJG_WY not like", value, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyIn(List<String> values) {
            addCriterion("GYZCZ_DNJG_WY in", values, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyNotIn(List<String> values) {
            addCriterion("GYZCZ_DNJG_WY not in", values, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyBetween(String value1, String value2) {
            addCriterion("GYZCZ_DNJG_WY between", value1, value2, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyNotBetween(String value1, String value2) {
            addCriterion("GYZCZ_DNJG_WY not between", value1, value2, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsIsNull() {
            addCriterion("NZCSCSJ_XS is null");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsIsNotNull() {
            addCriterion("NZCSCSJ_XS is not null");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsEqualTo(String value) {
            addCriterion("NZCSCSJ_XS =", value, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsNotEqualTo(String value) {
            addCriterion("NZCSCSJ_XS <>", value, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsGreaterThan(String value) {
            addCriterion("NZCSCSJ_XS >", value, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsGreaterThanOrEqualTo(String value) {
            addCriterion("NZCSCSJ_XS >=", value, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsLessThan(String value) {
            addCriterion("NZCSCSJ_XS <", value, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsLessThanOrEqualTo(String value) {
            addCriterion("NZCSCSJ_XS <=", value, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsLike(String value) {
            addCriterion("NZCSCSJ_XS like", value, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsNotLike(String value) {
            addCriterion("NZCSCSJ_XS not like", value, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsIn(List<String> values) {
            addCriterion("NZCSCSJ_XS in", values, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsNotIn(List<String> values) {
            addCriterion("NZCSCSJ_XS not in", values, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsBetween(String value1, String value2) {
            addCriterion("NZCSCSJ_XS between", value1, value2, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsNotBetween(String value1, String value2) {
            addCriterion("NZCSCSJ_XS not between", value1, value2, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andGyyslDIsNull() {
            addCriterion("GYYSL_D is null");
            return (Criteria) this;
        }

        public Criteria andGyyslDIsNotNull() {
            addCriterion("GYYSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andGyyslDEqualTo(String value) {
            addCriterion("GYYSL_D =", value, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andGyyslDNotEqualTo(String value) {
            addCriterion("GYYSL_D <>", value, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andGyyslDGreaterThan(String value) {
            addCriterion("GYYSL_D >", value, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andGyyslDGreaterThanOrEqualTo(String value) {
            addCriterion("GYYSL_D >=", value, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andGyyslDLessThan(String value) {
            addCriterion("GYYSL_D <", value, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andGyyslDLessThanOrEqualTo(String value) {
            addCriterion("GYYSL_D <=", value, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andGyyslDLike(String value) {
            addCriterion("GYYSL_D like", value, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andGyyslDNotLike(String value) {
            addCriterion("GYYSL_D not like", value, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andGyyslDIn(List<String> values) {
            addCriterion("GYYSL_D in", values, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andGyyslDNotIn(List<String> values) {
            addCriterion("GYYSL_D not in", values, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andGyyslDBetween(String value1, String value2) {
            addCriterion("GYYSL_D between", value1, value2, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andGyyslDNotBetween(String value1, String value2) {
            addCriterion("GYYSL_D not between", value1, value2, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDIsNull() {
            addCriterion("QZ_QSL_D is null");
            return (Criteria) this;
        }

        public Criteria andQzQslDIsNotNull() {
            addCriterion("QZ_QSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzQslDEqualTo(String value) {
            addCriterion("QZ_QSL_D =", value, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDNotEqualTo(String value) {
            addCriterion("QZ_QSL_D <>", value, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDGreaterThan(String value) {
            addCriterion("QZ_QSL_D >", value, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDGreaterThanOrEqualTo(String value) {
            addCriterion("QZ_QSL_D >=", value, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDLessThan(String value) {
            addCriterion("QZ_QSL_D <", value, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDLessThanOrEqualTo(String value) {
            addCriterion("QZ_QSL_D <=", value, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDLike(String value) {
            addCriterion("QZ_QSL_D like", value, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDNotLike(String value) {
            addCriterion("QZ_QSL_D not like", value, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDIn(List<String> values) {
            addCriterion("QZ_QSL_D in", values, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDNotIn(List<String> values) {
            addCriterion("QZ_QSL_D not in", values, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDBetween(String value1, String value2) {
            addCriterion("QZ_QSL_D between", value1, value2, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDNotBetween(String value1, String value2) {
            addCriterion("QZ_QSL_D not between", value1, value2, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDIsNull() {
            addCriterion("QZ_ZFYSL_D is null");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDIsNotNull() {
            addCriterion("QZ_ZFYSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDEqualTo(String value) {
            addCriterion("QZ_ZFYSL_D =", value, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDNotEqualTo(String value) {
            addCriterion("QZ_ZFYSL_D <>", value, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDGreaterThan(String value) {
            addCriterion("QZ_ZFYSL_D >", value, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDGreaterThanOrEqualTo(String value) {
            addCriterion("QZ_ZFYSL_D >=", value, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDLessThan(String value) {
            addCriterion("QZ_ZFYSL_D <", value, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDLessThanOrEqualTo(String value) {
            addCriterion("QZ_ZFYSL_D <=", value, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDLike(String value) {
            addCriterion("QZ_ZFYSL_D like", value, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDNotLike(String value) {
            addCriterion("QZ_ZFYSL_D not like", value, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDIn(List<String> values) {
            addCriterion("QZ_ZFYSL_D in", values, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDNotIn(List<String> values) {
            addCriterion("QZ_ZFYSL_D not in", values, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDBetween(String value1, String value2) {
            addCriterion("QZ_ZFYSL_D between", value1, value2, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDNotBetween(String value1, String value2) {
            addCriterion("QZ_ZFYSL_D not between", value1, value2, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1IsNull() {
            addCriterion("ZYYFCLYL1 is null");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1IsNotNull() {
            addCriterion("ZYYFCLYL1 is not null");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1EqualTo(String value) {
            addCriterion("ZYYFCLYL1 =", value, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1NotEqualTo(String value) {
            addCriterion("ZYYFCLYL1 <>", value, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1GreaterThan(String value) {
            addCriterion("ZYYFCLYL1 >", value, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1GreaterThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL1 >=", value, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1LessThan(String value) {
            addCriterion("ZYYFCLYL1 <", value, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1LessThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL1 <=", value, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1Like(String value) {
            addCriterion("ZYYFCLYL1 like", value, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1NotLike(String value) {
            addCriterion("ZYYFCLYL1 not like", value, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1In(List<String> values) {
            addCriterion("ZYYFCLYL1 in", values, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1NotIn(List<String> values) {
            addCriterion("ZYYFCLYL1 not in", values, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1Between(String value1, String value2) {
            addCriterion("ZYYFCLYL1 between", value1, value2, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1NotBetween(String value1, String value2) {
            addCriterion("ZYYFCLYL1 not between", value1, value2, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1IsNull() {
            addCriterion("ZYYFCLYL_JLDW1 is null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1IsNotNull() {
            addCriterion("ZYYFCLYL_JLDW1 is not null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1EqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW1 =", value, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1NotEqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW1 <>", value, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1GreaterThan(String value) {
            addCriterion("ZYYFCLYL_JLDW1 >", value, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1GreaterThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW1 >=", value, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1LessThan(String value) {
            addCriterion("ZYYFCLYL_JLDW1 <", value, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1LessThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW1 <=", value, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1Like(String value) {
            addCriterion("ZYYFCLYL_JLDW1 like", value, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1NotLike(String value) {
            addCriterion("ZYYFCLYL_JLDW1 not like", value, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1In(List<String> values) {
            addCriterion("ZYYFCLYL_JLDW1 in", values, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1NotIn(List<String> values) {
            addCriterion("ZYYFCLYL_JLDW1 not in", values, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1Between(String value1, String value2) {
            addCriterion("ZYYFCLYL_JLDW1 between", value1, value2, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1NotBetween(String value1, String value2) {
            addCriterion("ZYYFCLYL_JLDW1 not between", value1, value2, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1IsNull() {
            addCriterion("ZYYFCLYL_BNSJ1 is null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1IsNotNull() {
            addCriterion("ZYYFCLYL_BNSJ1 is not null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1EqualTo(String value) {
            addCriterion("ZYYFCLYL_BNSJ1 =", value, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1NotEqualTo(String value) {
            addCriterion("ZYYFCLYL_BNSJ1 <>", value, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1GreaterThan(String value) {
            addCriterion("ZYYFCLYL_BNSJ1 >", value, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1GreaterThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL_BNSJ1 >=", value, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1LessThan(String value) {
            addCriterion("ZYYFCLYL_BNSJ1 <", value, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1LessThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL_BNSJ1 <=", value, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1Like(String value) {
            addCriterion("ZYYFCLYL_BNSJ1 like", value, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1NotLike(String value) {
            addCriterion("ZYYFCLYL_BNSJ1 not like", value, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1In(List<String> values) {
            addCriterion("ZYYFCLYL_BNSJ1 in", values, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1NotIn(List<String> values) {
            addCriterion("ZYYFCLYL_BNSJ1 not in", values, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1Between(String value1, String value2) {
            addCriterion("ZYYFCLYL_BNSJ1 between", value1, value2, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1NotBetween(String value1, String value2) {
            addCriterion("ZYYFCLYL_BNSJ1 not between", value1, value2, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2IsNull() {
            addCriterion("ZYYFCLYL2 is null");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2IsNotNull() {
            addCriterion("ZYYFCLYL2 is not null");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2EqualTo(String value) {
            addCriterion("ZYYFCLYL2 =", value, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2NotEqualTo(String value) {
            addCriterion("ZYYFCLYL2 <>", value, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2GreaterThan(String value) {
            addCriterion("ZYYFCLYL2 >", value, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2GreaterThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL2 >=", value, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2LessThan(String value) {
            addCriterion("ZYYFCLYL2 <", value, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2LessThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL2 <=", value, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2Like(String value) {
            addCriterion("ZYYFCLYL2 like", value, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2NotLike(String value) {
            addCriterion("ZYYFCLYL2 not like", value, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2In(List<String> values) {
            addCriterion("ZYYFCLYL2 in", values, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2NotIn(List<String> values) {
            addCriterion("ZYYFCLYL2 not in", values, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2Between(String value1, String value2) {
            addCriterion("ZYYFCLYL2 between", value1, value2, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2NotBetween(String value1, String value2) {
            addCriterion("ZYYFCLYL2 not between", value1, value2, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2IsNull() {
            addCriterion("ZYYFCLYL_JLDW2 is null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2IsNotNull() {
            addCriterion("ZYYFCLYL_JLDW2 is not null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2EqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW2 =", value, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2NotEqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW2 <>", value, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2GreaterThan(String value) {
            addCriterion("ZYYFCLYL_JLDW2 >", value, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2GreaterThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW2 >=", value, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2LessThan(String value) {
            addCriterion("ZYYFCLYL_JLDW2 <", value, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2LessThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW2 <=", value, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2Like(String value) {
            addCriterion("ZYYFCLYL_JLDW2 like", value, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2NotLike(String value) {
            addCriterion("ZYYFCLYL_JLDW2 not like", value, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2In(List<String> values) {
            addCriterion("ZYYFCLYL_JLDW2 in", values, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2NotIn(List<String> values) {
            addCriterion("ZYYFCLYL_JLDW2 not in", values, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2Between(String value1, String value2) {
            addCriterion("ZYYFCLYL_JLDW2 between", value1, value2, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2NotBetween(String value1, String value2) {
            addCriterion("ZYYFCLYL_JLDW2 not between", value1, value2, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2IsNull() {
            addCriterion("ZYYFCLYL_BNSJ2 is null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2IsNotNull() {
            addCriterion("ZYYFCLYL_BNSJ2 is not null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2EqualTo(String value) {
            addCriterion("ZYYFCLYL_BNSJ2 =", value, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2NotEqualTo(String value) {
            addCriterion("ZYYFCLYL_BNSJ2 <>", value, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2GreaterThan(String value) {
            addCriterion("ZYYFCLYL_BNSJ2 >", value, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2GreaterThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL_BNSJ2 >=", value, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2LessThan(String value) {
            addCriterion("ZYYFCLYL_BNSJ2 <", value, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2LessThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL_BNSJ2 <=", value, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2Like(String value) {
            addCriterion("ZYYFCLYL_BNSJ2 like", value, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2NotLike(String value) {
            addCriterion("ZYYFCLYL_BNSJ2 not like", value, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2In(List<String> values) {
            addCriterion("ZYYFCLYL_BNSJ2 in", values, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2NotIn(List<String> values) {
            addCriterion("ZYYFCLYL_BNSJ2 not in", values, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2Between(String value1, String value2) {
            addCriterion("ZYYFCLYL_BNSJ2 between", value1, value2, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2NotBetween(String value1, String value2) {
            addCriterion("ZYYFCLYL_BNSJ2 not between", value1, value2, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3IsNull() {
            addCriterion("ZYYFCLYL3 is null");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3IsNotNull() {
            addCriterion("ZYYFCLYL3 is not null");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3EqualTo(String value) {
            addCriterion("ZYYFCLYL3 =", value, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3NotEqualTo(String value) {
            addCriterion("ZYYFCLYL3 <>", value, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3GreaterThan(String value) {
            addCriterion("ZYYFCLYL3 >", value, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3GreaterThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL3 >=", value, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3LessThan(String value) {
            addCriterion("ZYYFCLYL3 <", value, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3LessThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL3 <=", value, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3Like(String value) {
            addCriterion("ZYYFCLYL3 like", value, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3NotLike(String value) {
            addCriterion("ZYYFCLYL3 not like", value, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3In(List<String> values) {
            addCriterion("ZYYFCLYL3 in", values, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3NotIn(List<String> values) {
            addCriterion("ZYYFCLYL3 not in", values, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3Between(String value1, String value2) {
            addCriterion("ZYYFCLYL3 between", value1, value2, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3NotBetween(String value1, String value2) {
            addCriterion("ZYYFCLYL3 not between", value1, value2, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3IsNull() {
            addCriterion("ZYYFCLYL_JLDW3 is null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3IsNotNull() {
            addCriterion("ZYYFCLYL_JLDW3 is not null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3EqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW3 =", value, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3NotEqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW3 <>", value, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3GreaterThan(String value) {
            addCriterion("ZYYFCLYL_JLDW3 >", value, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3GreaterThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW3 >=", value, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3LessThan(String value) {
            addCriterion("ZYYFCLYL_JLDW3 <", value, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3LessThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW3 <=", value, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3Like(String value) {
            addCriterion("ZYYFCLYL_JLDW3 like", value, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3NotLike(String value) {
            addCriterion("ZYYFCLYL_JLDW3 not like", value, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3In(List<String> values) {
            addCriterion("ZYYFCLYL_JLDW3 in", values, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3NotIn(List<String> values) {
            addCriterion("ZYYFCLYL_JLDW3 not in", values, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3Between(String value1, String value2) {
            addCriterion("ZYYFCLYL_JLDW3 between", value1, value2, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3NotBetween(String value1, String value2) {
            addCriterion("ZYYFCLYL_JLDW3 not between", value1, value2, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3IsNull() {
            addCriterion("ZYYFCLYL_BNSJ3 is null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3IsNotNull() {
            addCriterion("ZYYFCLYL_BNSJ3 is not null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3EqualTo(String value) {
            addCriterion("ZYYFCLYL_BNSJ3 =", value, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3NotEqualTo(String value) {
            addCriterion("ZYYFCLYL_BNSJ3 <>", value, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3GreaterThan(String value) {
            addCriterion("ZYYFCLYL_BNSJ3 >", value, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3GreaterThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL_BNSJ3 >=", value, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3LessThan(String value) {
            addCriterion("ZYYFCLYL_BNSJ3 <", value, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3LessThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL_BNSJ3 <=", value, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3Like(String value) {
            addCriterion("ZYYFCLYL_BNSJ3 like", value, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3NotLike(String value) {
            addCriterion("ZYYFCLYL_BNSJ3 not like", value, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3In(List<String> values) {
            addCriterion("ZYYFCLYL_BNSJ3 in", values, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3NotIn(List<String> values) {
            addCriterion("ZYYFCLYL_BNSJ3 not in", values, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3Between(String value1, String value2) {
            addCriterion("ZYYFCLYL_BNSJ3 between", value1, value2, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3NotBetween(String value1, String value2) {
            addCriterion("ZYYFCLYL_BNSJ3 not between", value1, value2, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1IsNull() {
            addCriterion("ZYCPSCQK1 is null");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1IsNotNull() {
            addCriterion("ZYCPSCQK1 is not null");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1EqualTo(String value) {
            addCriterion("ZYCPSCQK1 =", value, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1NotEqualTo(String value) {
            addCriterion("ZYCPSCQK1 <>", value, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1GreaterThan(String value) {
            addCriterion("ZYCPSCQK1 >", value, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1GreaterThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK1 >=", value, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1LessThan(String value) {
            addCriterion("ZYCPSCQK1 <", value, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1LessThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK1 <=", value, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1Like(String value) {
            addCriterion("ZYCPSCQK1 like", value, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1NotLike(String value) {
            addCriterion("ZYCPSCQK1 not like", value, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1In(List<String> values) {
            addCriterion("ZYCPSCQK1 in", values, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1NotIn(List<String> values) {
            addCriterion("ZYCPSCQK1 not in", values, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1Between(String value1, String value2) {
            addCriterion("ZYCPSCQK1 between", value1, value2, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1NotBetween(String value1, String value2) {
            addCriterion("ZYCPSCQK1 not between", value1, value2, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1IsNull() {
            addCriterion("ZYCPSCQK_JLDW1 is null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1IsNotNull() {
            addCriterion("ZYCPSCQK_JLDW1 is not null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1EqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW1 =", value, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1NotEqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW1 <>", value, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1GreaterThan(String value) {
            addCriterion("ZYCPSCQK_JLDW1 >", value, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1GreaterThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW1 >=", value, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1LessThan(String value) {
            addCriterion("ZYCPSCQK_JLDW1 <", value, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1LessThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW1 <=", value, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1Like(String value) {
            addCriterion("ZYCPSCQK_JLDW1 like", value, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1NotLike(String value) {
            addCriterion("ZYCPSCQK_JLDW1 not like", value, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1In(List<String> values) {
            addCriterion("ZYCPSCQK_JLDW1 in", values, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1NotIn(List<String> values) {
            addCriterion("ZYCPSCQK_JLDW1 not in", values, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1Between(String value1, String value2) {
            addCriterion("ZYCPSCQK_JLDW1 between", value1, value2, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1NotBetween(String value1, String value2) {
            addCriterion("ZYCPSCQK_JLDW1 not between", value1, value2, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1IsNull() {
            addCriterion("ZYCPSCQK_BNSJ1 is null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1IsNotNull() {
            addCriterion("ZYCPSCQK_BNSJ1 is not null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1EqualTo(String value) {
            addCriterion("ZYCPSCQK_BNSJ1 =", value, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1NotEqualTo(String value) {
            addCriterion("ZYCPSCQK_BNSJ1 <>", value, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1GreaterThan(String value) {
            addCriterion("ZYCPSCQK_BNSJ1 >", value, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1GreaterThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK_BNSJ1 >=", value, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1LessThan(String value) {
            addCriterion("ZYCPSCQK_BNSJ1 <", value, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1LessThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK_BNSJ1 <=", value, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1Like(String value) {
            addCriterion("ZYCPSCQK_BNSJ1 like", value, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1NotLike(String value) {
            addCriterion("ZYCPSCQK_BNSJ1 not like", value, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1In(List<String> values) {
            addCriterion("ZYCPSCQK_BNSJ1 in", values, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1NotIn(List<String> values) {
            addCriterion("ZYCPSCQK_BNSJ1 not in", values, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1Between(String value1, String value2) {
            addCriterion("ZYCPSCQK_BNSJ1 between", value1, value2, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1NotBetween(String value1, String value2) {
            addCriterion("ZYCPSCQK_BNSJ1 not between", value1, value2, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2IsNull() {
            addCriterion("ZYCPSCQK2 is null");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2IsNotNull() {
            addCriterion("ZYCPSCQK2 is not null");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2EqualTo(String value) {
            addCriterion("ZYCPSCQK2 =", value, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2NotEqualTo(String value) {
            addCriterion("ZYCPSCQK2 <>", value, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2GreaterThan(String value) {
            addCriterion("ZYCPSCQK2 >", value, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2GreaterThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK2 >=", value, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2LessThan(String value) {
            addCriterion("ZYCPSCQK2 <", value, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2LessThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK2 <=", value, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2Like(String value) {
            addCriterion("ZYCPSCQK2 like", value, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2NotLike(String value) {
            addCriterion("ZYCPSCQK2 not like", value, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2In(List<String> values) {
            addCriterion("ZYCPSCQK2 in", values, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2NotIn(List<String> values) {
            addCriterion("ZYCPSCQK2 not in", values, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2Between(String value1, String value2) {
            addCriterion("ZYCPSCQK2 between", value1, value2, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2NotBetween(String value1, String value2) {
            addCriterion("ZYCPSCQK2 not between", value1, value2, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2IsNull() {
            addCriterion("ZYCPSCQK_JLDW2 is null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2IsNotNull() {
            addCriterion("ZYCPSCQK_JLDW2 is not null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2EqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW2 =", value, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2NotEqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW2 <>", value, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2GreaterThan(String value) {
            addCriterion("ZYCPSCQK_JLDW2 >", value, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2GreaterThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW2 >=", value, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2LessThan(String value) {
            addCriterion("ZYCPSCQK_JLDW2 <", value, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2LessThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW2 <=", value, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2Like(String value) {
            addCriterion("ZYCPSCQK_JLDW2 like", value, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2NotLike(String value) {
            addCriterion("ZYCPSCQK_JLDW2 not like", value, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2In(List<String> values) {
            addCriterion("ZYCPSCQK_JLDW2 in", values, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2NotIn(List<String> values) {
            addCriterion("ZYCPSCQK_JLDW2 not in", values, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2Between(String value1, String value2) {
            addCriterion("ZYCPSCQK_JLDW2 between", value1, value2, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2NotBetween(String value1, String value2) {
            addCriterion("ZYCPSCQK_JLDW2 not between", value1, value2, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2IsNull() {
            addCriterion("ZYCPSCQK_BNSJ2 is null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2IsNotNull() {
            addCriterion("ZYCPSCQK_BNSJ2 is not null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2EqualTo(String value) {
            addCriterion("ZYCPSCQK_BNSJ2 =", value, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2NotEqualTo(String value) {
            addCriterion("ZYCPSCQK_BNSJ2 <>", value, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2GreaterThan(String value) {
            addCriterion("ZYCPSCQK_BNSJ2 >", value, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2GreaterThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK_BNSJ2 >=", value, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2LessThan(String value) {
            addCriterion("ZYCPSCQK_BNSJ2 <", value, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2LessThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK_BNSJ2 <=", value, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2Like(String value) {
            addCriterion("ZYCPSCQK_BNSJ2 like", value, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2NotLike(String value) {
            addCriterion("ZYCPSCQK_BNSJ2 not like", value, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2In(List<String> values) {
            addCriterion("ZYCPSCQK_BNSJ2 in", values, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2NotIn(List<String> values) {
            addCriterion("ZYCPSCQK_BNSJ2 not in", values, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2Between(String value1, String value2) {
            addCriterion("ZYCPSCQK_BNSJ2 between", value1, value2, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2NotBetween(String value1, String value2) {
            addCriterion("ZYCPSCQK_BNSJ2 not between", value1, value2, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3IsNull() {
            addCriterion("ZYCPSCQK3 is null");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3IsNotNull() {
            addCriterion("ZYCPSCQK3 is not null");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3EqualTo(String value) {
            addCriterion("ZYCPSCQK3 =", value, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3NotEqualTo(String value) {
            addCriterion("ZYCPSCQK3 <>", value, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3GreaterThan(String value) {
            addCriterion("ZYCPSCQK3 >", value, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3GreaterThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK3 >=", value, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3LessThan(String value) {
            addCriterion("ZYCPSCQK3 <", value, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3LessThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK3 <=", value, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3Like(String value) {
            addCriterion("ZYCPSCQK3 like", value, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3NotLike(String value) {
            addCriterion("ZYCPSCQK3 not like", value, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3In(List<String> values) {
            addCriterion("ZYCPSCQK3 in", values, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3NotIn(List<String> values) {
            addCriterion("ZYCPSCQK3 not in", values, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3Between(String value1, String value2) {
            addCriterion("ZYCPSCQK3 between", value1, value2, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3NotBetween(String value1, String value2) {
            addCriterion("ZYCPSCQK3 not between", value1, value2, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3IsNull() {
            addCriterion("ZYCPSCQK_JLDW3 is null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3IsNotNull() {
            addCriterion("ZYCPSCQK_JLDW3 is not null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3EqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW3 =", value, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3NotEqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW3 <>", value, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3GreaterThan(String value) {
            addCriterion("ZYCPSCQK_JLDW3 >", value, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3GreaterThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW3 >=", value, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3LessThan(String value) {
            addCriterion("ZYCPSCQK_JLDW3 <", value, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3LessThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW3 <=", value, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3Like(String value) {
            addCriterion("ZYCPSCQK_JLDW3 like", value, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3NotLike(String value) {
            addCriterion("ZYCPSCQK_JLDW3 not like", value, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3In(List<String> values) {
            addCriterion("ZYCPSCQK_JLDW3 in", values, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3NotIn(List<String> values) {
            addCriterion("ZYCPSCQK_JLDW3 not in", values, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3Between(String value1, String value2) {
            addCriterion("ZYCPSCQK_JLDW3 between", value1, value2, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3NotBetween(String value1, String value2) {
            addCriterion("ZYCPSCQK_JLDW3 not between", value1, value2, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3IsNull() {
            addCriterion("ZYCPSCQK_BNSJ3 is null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3IsNotNull() {
            addCriterion("ZYCPSCQK_BNSJ3 is not null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3EqualTo(String value) {
            addCriterion("ZYCPSCQK_BNSJ3 =", value, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3NotEqualTo(String value) {
            addCriterion("ZYCPSCQK_BNSJ3 <>", value, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3GreaterThan(String value) {
            addCriterion("ZYCPSCQK_BNSJ3 >", value, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3GreaterThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK_BNSJ3 >=", value, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3LessThan(String value) {
            addCriterion("ZYCPSCQK_BNSJ3 <", value, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3LessThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK_BNSJ3 <=", value, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3Like(String value) {
            addCriterion("ZYCPSCQK_BNSJ3 like", value, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3NotLike(String value) {
            addCriterion("ZYCPSCQK_BNSJ3 not like", value, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3In(List<String> values) {
            addCriterion("ZYCPSCQK_BNSJ3 in", values, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3NotIn(List<String> values) {
            addCriterion("ZYCPSCQK_BNSJ3 not in", values, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3Between(String value1, String value2) {
            addCriterion("ZYCPSCQK_BNSJ3 between", value1, value2, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3NotBetween(String value1, String value2) {
            addCriterion("ZYCPSCQK_BNSJ3 not between", value1, value2, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andFszlsssTIsNull() {
            addCriterion("FSZLSSS_T is null");
            return (Criteria) this;
        }

        public Criteria andFszlsssTIsNotNull() {
            addCriterion("FSZLSSS_T is not null");
            return (Criteria) this;
        }

        public Criteria andFszlsssTEqualTo(String value) {
            addCriterion("FSZLSSS_T =", value, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlsssTNotEqualTo(String value) {
            addCriterion("FSZLSSS_T <>", value, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlsssTGreaterThan(String value) {
            addCriterion("FSZLSSS_T >", value, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlsssTGreaterThanOrEqualTo(String value) {
            addCriterion("FSZLSSS_T >=", value, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlsssTLessThan(String value) {
            addCriterion("FSZLSSS_T <", value, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlsssTLessThanOrEqualTo(String value) {
            addCriterion("FSZLSSS_T <=", value, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlsssTLike(String value) {
            addCriterion("FSZLSSS_T like", value, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlsssTNotLike(String value) {
            addCriterion("FSZLSSS_T not like", value, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlsssTIn(List<String> values) {
            addCriterion("FSZLSSS_T in", values, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlsssTNotIn(List<String> values) {
            addCriterion("FSZLSSS_T not in", values, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlsssTBetween(String value1, String value2) {
            addCriterion("FSZLSSS_T between", value1, value2, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlsssTNotBetween(String value1, String value2) {
            addCriterion("FSZLSSS_T not between", value1, value2, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRIsNull() {
            addCriterion("FSZLSSCLNL_D_R is null");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRIsNotNull() {
            addCriterion("FSZLSSCLNL_D_R is not null");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDREqualTo(String value) {
            addCriterion("FSZLSSCLNL_D_R =", value, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRNotEqualTo(String value) {
            addCriterion("FSZLSSCLNL_D_R <>", value, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRGreaterThan(String value) {
            addCriterion("FSZLSSCLNL_D_R >", value, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRGreaterThanOrEqualTo(String value) {
            addCriterion("FSZLSSCLNL_D_R >=", value, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRLessThan(String value) {
            addCriterion("FSZLSSCLNL_D_R <", value, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRLessThanOrEqualTo(String value) {
            addCriterion("FSZLSSCLNL_D_R <=", value, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRLike(String value) {
            addCriterion("FSZLSSCLNL_D_R like", value, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRNotLike(String value) {
            addCriterion("FSZLSSCLNL_D_R not like", value, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRIn(List<String> values) {
            addCriterion("FSZLSSCLNL_D_R in", values, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRNotIn(List<String> values) {
            addCriterion("FSZLSSCLNL_D_R not in", values, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRBetween(String value1, String value2) {
            addCriterion("FSZLSSCLNL_D_R between", value1, value2, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRNotBetween(String value1, String value2) {
            addCriterion("FSZLSSCLNL_D_R not between", value1, value2, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyIsNull() {
            addCriterion("FSZLSSYXFY_WY is null");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyIsNotNull() {
            addCriterion("FSZLSSYXFY_WY is not null");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyEqualTo(String value) {
            addCriterion("FSZLSSYXFY_WY =", value, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyNotEqualTo(String value) {
            addCriterion("FSZLSSYXFY_WY <>", value, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyGreaterThan(String value) {
            addCriterion("FSZLSSYXFY_WY >", value, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyGreaterThanOrEqualTo(String value) {
            addCriterion("FSZLSSYXFY_WY >=", value, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyLessThan(String value) {
            addCriterion("FSZLSSYXFY_WY <", value, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyLessThanOrEqualTo(String value) {
            addCriterion("FSZLSSYXFY_WY <=", value, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyLike(String value) {
            addCriterion("FSZLSSYXFY_WY like", value, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyNotLike(String value) {
            addCriterion("FSZLSSYXFY_WY not like", value, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyIn(List<String> values) {
            addCriterion("FSZLSSYXFY_WY in", values, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyNotIn(List<String> values) {
            addCriterion("FSZLSSYXFY_WY not in", values, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyBetween(String value1, String value2) {
            addCriterion("FSZLSSYXFY_WY between", value1, value2, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyNotBetween(String value1, String value2) {
            addCriterion("FSZLSSYXFY_WY not between", value1, value2, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andGyfscllDIsNull() {
            addCriterion("GYFSCLL_D is null");
            return (Criteria) this;
        }

        public Criteria andGyfscllDIsNotNull() {
            addCriterion("GYFSCLL_D is not null");
            return (Criteria) this;
        }

        public Criteria andGyfscllDEqualTo(String value) {
            addCriterion("GYFSCLL_D =", value, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfscllDNotEqualTo(String value) {
            addCriterion("GYFSCLL_D <>", value, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfscllDGreaterThan(String value) {
            addCriterion("GYFSCLL_D >", value, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfscllDGreaterThanOrEqualTo(String value) {
            addCriterion("GYFSCLL_D >=", value, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfscllDLessThan(String value) {
            addCriterion("GYFSCLL_D <", value, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfscllDLessThanOrEqualTo(String value) {
            addCriterion("GYFSCLL_D <=", value, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfscllDLike(String value) {
            addCriterion("GYFSCLL_D like", value, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfscllDNotLike(String value) {
            addCriterion("GYFSCLL_D not like", value, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfscllDIn(List<String> values) {
            addCriterion("GYFSCLL_D in", values, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfscllDNotIn(List<String> values) {
            addCriterion("GYFSCLL_D not in", values, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfscllDBetween(String value1, String value2) {
            addCriterion("GYFSCLL_D between", value1, value2, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfscllDNotBetween(String value1, String value2) {
            addCriterion("GYFSCLL_D not between", value1, value2, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDIsNull() {
            addCriterion("GYFSPFL_D is null");
            return (Criteria) this;
        }

        public Criteria andGyfspflDIsNotNull() {
            addCriterion("GYFSPFL_D is not null");
            return (Criteria) this;
        }

        public Criteria andGyfspflDEqualTo(String value) {
            addCriterion("GYFSPFL_D =", value, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDNotEqualTo(String value) {
            addCriterion("GYFSPFL_D <>", value, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDGreaterThan(String value) {
            addCriterion("GYFSPFL_D >", value, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDGreaterThanOrEqualTo(String value) {
            addCriterion("GYFSPFL_D >=", value, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDLessThan(String value) {
            addCriterion("GYFSPFL_D <", value, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDLessThanOrEqualTo(String value) {
            addCriterion("GYFSPFL_D <=", value, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDLike(String value) {
            addCriterion("GYFSPFL_D like", value, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDNotLike(String value) {
            addCriterion("GYFSPFL_D not like", value, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDIn(List<String> values) {
            addCriterion("GYFSPFL_D in", values, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDNotIn(List<String> values) {
            addCriterion("GYFSPFL_D not in", values, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDBetween(String value1, String value2) {
            addCriterion("GYFSPFL_D between", value1, value2, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDNotBetween(String value1, String value2) {
            addCriterion("GYFSPFL_D not between", value1, value2, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDIsNull() {
            addCriterion("QZ_ZJPRHJD_D is null");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDIsNotNull() {
            addCriterion("QZ_ZJPRHJD_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDEqualTo(String value) {
            addCriterion("QZ_ZJPRHJD_D =", value, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDNotEqualTo(String value) {
            addCriterion("QZ_ZJPRHJD_D <>", value, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDGreaterThan(String value) {
            addCriterion("QZ_ZJPRHJD_D >", value, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDGreaterThanOrEqualTo(String value) {
            addCriterion("QZ_ZJPRHJD_D >=", value, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDLessThan(String value) {
            addCriterion("QZ_ZJPRHJD_D <", value, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDLessThanOrEqualTo(String value) {
            addCriterion("QZ_ZJPRHJD_D <=", value, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDLike(String value) {
            addCriterion("QZ_ZJPRHJD_D like", value, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDNotLike(String value) {
            addCriterion("QZ_ZJPRHJD_D not like", value, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDIn(List<String> values) {
            addCriterion("QZ_ZJPRHJD_D in", values, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDNotIn(List<String> values) {
            addCriterion("QZ_ZJPRHJD_D not in", values, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDBetween(String value1, String value2) {
            addCriterion("QZ_ZJPRHJD_D between", value1, value2, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDNotBetween(String value1, String value2) {
            addCriterion("QZ_ZJPRHJD_D not between", value1, value2, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDIsNull() {
            addCriterion("QZ_PRWSCLCD_D is null");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDIsNotNull() {
            addCriterion("QZ_PRWSCLCD_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDEqualTo(String value) {
            addCriterion("QZ_PRWSCLCD_D =", value, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDNotEqualTo(String value) {
            addCriterion("QZ_PRWSCLCD_D <>", value, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDGreaterThan(String value) {
            addCriterion("QZ_PRWSCLCD_D >", value, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDGreaterThanOrEqualTo(String value) {
            addCriterion("QZ_PRWSCLCD_D >=", value, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDLessThan(String value) {
            addCriterion("QZ_PRWSCLCD_D <", value, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDLessThanOrEqualTo(String value) {
            addCriterion("QZ_PRWSCLCD_D <=", value, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDLike(String value) {
            addCriterion("QZ_PRWSCLCD_D like", value, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDNotLike(String value) {
            addCriterion("QZ_PRWSCLCD_D not like", value, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDIn(List<String> values) {
            addCriterion("QZ_PRWSCLCD_D in", values, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDNotIn(List<String> values) {
            addCriterion("QZ_PRWSCLCD_D not in", values, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDBetween(String value1, String value2) {
            addCriterion("QZ_PRWSCLCD_D between", value1, value2, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDNotBetween(String value1, String value2) {
            addCriterion("QZ_PRWSCLCD_D not between", value1, value2, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSIsNull() {
            addCriterion("PRWSCLCDHXXYLND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSIsNotNull() {
            addCriterion("PRWSCLCDHXXYLND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSEqualTo(String value) {
            addCriterion("PRWSCLCDHXXYLND_HK_S =", value, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSNotEqualTo(String value) {
            addCriterion("PRWSCLCDHXXYLND_HK_S <>", value, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSGreaterThan(String value) {
            addCriterion("PRWSCLCDHXXYLND_HK_S >", value, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("PRWSCLCDHXXYLND_HK_S >=", value, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSLessThan(String value) {
            addCriterion("PRWSCLCDHXXYLND_HK_S <", value, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSLessThanOrEqualTo(String value) {
            addCriterion("PRWSCLCDHXXYLND_HK_S <=", value, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSLike(String value) {
            addCriterion("PRWSCLCDHXXYLND_HK_S like", value, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSNotLike(String value) {
            addCriterion("PRWSCLCDHXXYLND_HK_S not like", value, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSIn(List<String> values) {
            addCriterion("PRWSCLCDHXXYLND_HK_S in", values, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSNotIn(List<String> values) {
            addCriterion("PRWSCLCDHXXYLND_HK_S not in", values, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSBetween(String value1, String value2) {
            addCriterion("PRWSCLCDHXXYLND_HK_S between", value1, value2, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSNotBetween(String value1, String value2) {
            addCriterion("PRWSCLCDHXXYLND_HK_S not between", value1, value2, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSIsNull() {
            addCriterion("PRWSCLCDADND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSIsNotNull() {
            addCriterion("PRWSCLCDADND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSEqualTo(String value) {
            addCriterion("PRWSCLCDADND_HK_S =", value, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSNotEqualTo(String value) {
            addCriterion("PRWSCLCDADND_HK_S <>", value, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSGreaterThan(String value) {
            addCriterion("PRWSCLCDADND_HK_S >", value, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("PRWSCLCDADND_HK_S >=", value, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSLessThan(String value) {
            addCriterion("PRWSCLCDADND_HK_S <", value, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSLessThanOrEqualTo(String value) {
            addCriterion("PRWSCLCDADND_HK_S <=", value, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSLike(String value) {
            addCriterion("PRWSCLCDADND_HK_S like", value, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSNotLike(String value) {
            addCriterion("PRWSCLCDADND_HK_S not like", value, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSIn(List<String> values) {
            addCriterion("PRWSCLCDADND_HK_S in", values, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSNotIn(List<String> values) {
            addCriterion("PRWSCLCDADND_HK_S not in", values, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSBetween(String value1, String value2) {
            addCriterion("PRWSCLCDADND_HK_S between", value1, value2, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSNotBetween(String value1, String value2) {
            addCriterion("PRWSCLCDADND_HK_S not between", value1, value2, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSIsNull() {
            addCriterion("PRWSCLCDSYLND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSIsNotNull() {
            addCriterion("PRWSCLCDSYLND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSEqualTo(String value) {
            addCriterion("PRWSCLCDSYLND_HK_S =", value, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSNotEqualTo(String value) {
            addCriterion("PRWSCLCDSYLND_HK_S <>", value, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSGreaterThan(String value) {
            addCriterion("PRWSCLCDSYLND_HK_S >", value, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSGreaterThanOrEqualTo(String value) {
            addCriterion("PRWSCLCDSYLND_HK_S >=", value, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSLessThan(String value) {
            addCriterion("PRWSCLCDSYLND_HK_S <", value, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSLessThanOrEqualTo(String value) {
            addCriterion("PRWSCLCDSYLND_HK_S <=", value, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSLike(String value) {
            addCriterion("PRWSCLCDSYLND_HK_S like", value, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSNotLike(String value) {
            addCriterion("PRWSCLCDSYLND_HK_S not like", value, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSIn(List<String> values) {
            addCriterion("PRWSCLCDSYLND_HK_S in", values, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSNotIn(List<String> values) {
            addCriterion("PRWSCLCDSYLND_HK_S not in", values, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSBetween(String value1, String value2) {
            addCriterion("PRWSCLCDSYLND_HK_S between", value1, value2, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSNotBetween(String value1, String value2) {
            addCriterion("PRWSCLCDSYLND_HK_S not between", value1, value2, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDIsNull() {
            addCriterion("HXXYLCSL_D is null");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDIsNotNull() {
            addCriterion("HXXYLCSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDEqualTo(String value) {
            addCriterion("HXXYLCSL_D =", value, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDNotEqualTo(String value) {
            addCriterion("HXXYLCSL_D <>", value, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDGreaterThan(String value) {
            addCriterion("HXXYLCSL_D >", value, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDGreaterThanOrEqualTo(String value) {
            addCriterion("HXXYLCSL_D >=", value, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDLessThan(String value) {
            addCriterion("HXXYLCSL_D <", value, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDLessThanOrEqualTo(String value) {
            addCriterion("HXXYLCSL_D <=", value, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDLike(String value) {
            addCriterion("HXXYLCSL_D like", value, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDNotLike(String value) {
            addCriterion("HXXYLCSL_D not like", value, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDIn(List<String> values) {
            addCriterion("HXXYLCSL_D in", values, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDNotIn(List<String> values) {
            addCriterion("HXXYLCSL_D not in", values, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDBetween(String value1, String value2) {
            addCriterion("HXXYLCSL_D between", value1, value2, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDNotBetween(String value1, String value2) {
            addCriterion("HXXYLCSL_D not between", value1, value2, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDIsNull() {
            addCriterion("HXXYLPFL_D is null");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDIsNotNull() {
            addCriterion("HXXYLPFL_D is not null");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDEqualTo(String value) {
            addCriterion("HXXYLPFL_D =", value, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDNotEqualTo(String value) {
            addCriterion("HXXYLPFL_D <>", value, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDGreaterThan(String value) {
            addCriterion("HXXYLPFL_D >", value, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDGreaterThanOrEqualTo(String value) {
            addCriterion("HXXYLPFL_D >=", value, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDLessThan(String value) {
            addCriterion("HXXYLPFL_D <", value, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDLessThanOrEqualTo(String value) {
            addCriterion("HXXYLPFL_D <=", value, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDLike(String value) {
            addCriterion("HXXYLPFL_D like", value, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDNotLike(String value) {
            addCriterion("HXXYLPFL_D not like", value, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDIn(List<String> values) {
            addCriterion("HXXYLPFL_D in", values, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDNotIn(List<String> values) {
            addCriterion("HXXYLPFL_D not in", values, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDBetween(String value1, String value2) {
            addCriterion("HXXYLPFL_D between", value1, value2, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDNotBetween(String value1, String value2) {
            addCriterion("HXXYLPFL_D not between", value1, value2, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andAdcslDIsNull() {
            addCriterion("ADCSL_D is null");
            return (Criteria) this;
        }

        public Criteria andAdcslDIsNotNull() {
            addCriterion("ADCSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andAdcslDEqualTo(String value) {
            addCriterion("ADCSL_D =", value, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdcslDNotEqualTo(String value) {
            addCriterion("ADCSL_D <>", value, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdcslDGreaterThan(String value) {
            addCriterion("ADCSL_D >", value, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdcslDGreaterThanOrEqualTo(String value) {
            addCriterion("ADCSL_D >=", value, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdcslDLessThan(String value) {
            addCriterion("ADCSL_D <", value, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdcslDLessThanOrEqualTo(String value) {
            addCriterion("ADCSL_D <=", value, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdcslDLike(String value) {
            addCriterion("ADCSL_D like", value, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdcslDNotLike(String value) {
            addCriterion("ADCSL_D not like", value, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdcslDIn(List<String> values) {
            addCriterion("ADCSL_D in", values, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdcslDNotIn(List<String> values) {
            addCriterion("ADCSL_D not in", values, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdcslDBetween(String value1, String value2) {
            addCriterion("ADCSL_D between", value1, value2, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdcslDNotBetween(String value1, String value2) {
            addCriterion("ADCSL_D not between", value1, value2, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdpflDIsNull() {
            addCriterion("ADPFL_D is null");
            return (Criteria) this;
        }

        public Criteria andAdpflDIsNotNull() {
            addCriterion("ADPFL_D is not null");
            return (Criteria) this;
        }

        public Criteria andAdpflDEqualTo(String value) {
            addCriterion("ADPFL_D =", value, "adpflD");
            return (Criteria) this;
        }

        public Criteria andAdpflDNotEqualTo(String value) {
            addCriterion("ADPFL_D <>", value, "adpflD");
            return (Criteria) this;
        }

        public Criteria andAdpflDGreaterThan(String value) {
            addCriterion("ADPFL_D >", value, "adpflD");
            return (Criteria) this;
        }

        public Criteria andAdpflDGreaterThanOrEqualTo(String value) {
            addCriterion("ADPFL_D >=", value, "adpflD");
            return (Criteria) this;
        }

        public Criteria andAdpflDLessThan(String value) {
            addCriterion("ADPFL_D <", value, "adpflD");
            return (Criteria) this;
        }

        public Criteria andAdpflDLessThanOrEqualTo(String value) {
            addCriterion("ADPFL_D <=", value, "adpflD");
            return (Criteria) this;
        }

        public Criteria andAdpflDLike(String value) {
            addCriterion("ADPFL_D like", value, "adpflD");
            return (Criteria) this;
        }

        public Criteria andAdpflDNotLike(String value) {
            addCriterion("ADPFL_D not like", value, "adpflD");
            return (Criteria) this;
        }

        public Criteria andAdpflDIn(List<String> values) {
            addCriterion("ADPFL_D in", values, "adpflD");
            return (Criteria) this;
        }

        public Criteria andAdpflDNotIn(List<String> values) {
            addCriterion("ADPFL_D not in", values, "adpflD");
            return (Criteria) this;
        }

        public Criteria andAdpflDBetween(String value1, String value2) {
            addCriterion("ADPFL_D between", value1, value2, "adpflD");
            return (Criteria) this;
        }

        public Criteria andAdpflDNotBetween(String value1, String value2) {
            addCriterion("ADPFL_D not between", value1, value2, "adpflD");
            return (Criteria) this;
        }

        public Criteria andSylcslDIsNull() {
            addCriterion("SYLCSL_D is null");
            return (Criteria) this;
        }

        public Criteria andSylcslDIsNotNull() {
            addCriterion("SYLCSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andSylcslDEqualTo(String value) {
            addCriterion("SYLCSL_D =", value, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylcslDNotEqualTo(String value) {
            addCriterion("SYLCSL_D <>", value, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylcslDGreaterThan(String value) {
            addCriterion("SYLCSL_D >", value, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylcslDGreaterThanOrEqualTo(String value) {
            addCriterion("SYLCSL_D >=", value, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylcslDLessThan(String value) {
            addCriterion("SYLCSL_D <", value, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylcslDLessThanOrEqualTo(String value) {
            addCriterion("SYLCSL_D <=", value, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylcslDLike(String value) {
            addCriterion("SYLCSL_D like", value, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylcslDNotLike(String value) {
            addCriterion("SYLCSL_D not like", value, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylcslDIn(List<String> values) {
            addCriterion("SYLCSL_D in", values, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylcslDNotIn(List<String> values) {
            addCriterion("SYLCSL_D not in", values, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylcslDBetween(String value1, String value2) {
            addCriterion("SYLCSL_D between", value1, value2, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylcslDNotBetween(String value1, String value2) {
            addCriterion("SYLCSL_D not between", value1, value2, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylpflDIsNull() {
            addCriterion("SYLPFL_D is null");
            return (Criteria) this;
        }

        public Criteria andSylpflDIsNotNull() {
            addCriterion("SYLPFL_D is not null");
            return (Criteria) this;
        }

        public Criteria andSylpflDEqualTo(String value) {
            addCriterion("SYLPFL_D =", value, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andSylpflDNotEqualTo(String value) {
            addCriterion("SYLPFL_D <>", value, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andSylpflDGreaterThan(String value) {
            addCriterion("SYLPFL_D >", value, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andSylpflDGreaterThanOrEqualTo(String value) {
            addCriterion("SYLPFL_D >=", value, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andSylpflDLessThan(String value) {
            addCriterion("SYLPFL_D <", value, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andSylpflDLessThanOrEqualTo(String value) {
            addCriterion("SYLPFL_D <=", value, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andSylpflDLike(String value) {
            addCriterion("SYLPFL_D like", value, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andSylpflDNotLike(String value) {
            addCriterion("SYLPFL_D not like", value, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andSylpflDIn(List<String> values) {
            addCriterion("SYLPFL_D in", values, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andSylpflDNotIn(List<String> values) {
            addCriterion("SYLPFL_D not in", values, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andSylpflDBetween(String value1, String value2) {
            addCriterion("SYLPFL_D between", value1, value2, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andSylpflDNotBetween(String value1, String value2) {
            addCriterion("SYLPFL_D not between", value1, value2, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andHffcslQkIsNull() {
            addCriterion("HFFCSL_QK is null");
            return (Criteria) this;
        }

        public Criteria andHffcslQkIsNotNull() {
            addCriterion("HFFCSL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andHffcslQkEqualTo(String value) {
            addCriterion("HFFCSL_QK =", value, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffcslQkNotEqualTo(String value) {
            addCriterion("HFFCSL_QK <>", value, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffcslQkGreaterThan(String value) {
            addCriterion("HFFCSL_QK >", value, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffcslQkGreaterThanOrEqualTo(String value) {
            addCriterion("HFFCSL_QK >=", value, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffcslQkLessThan(String value) {
            addCriterion("HFFCSL_QK <", value, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffcslQkLessThanOrEqualTo(String value) {
            addCriterion("HFFCSL_QK <=", value, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffcslQkLike(String value) {
            addCriterion("HFFCSL_QK like", value, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffcslQkNotLike(String value) {
            addCriterion("HFFCSL_QK not like", value, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffcslQkIn(List<String> values) {
            addCriterion("HFFCSL_QK in", values, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffcslQkNotIn(List<String> values) {
            addCriterion("HFFCSL_QK not in", values, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffcslQkBetween(String value1, String value2) {
            addCriterion("HFFCSL_QK between", value1, value2, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffcslQkNotBetween(String value1, String value2) {
            addCriterion("HFFCSL_QK not between", value1, value2, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkIsNull() {
            addCriterion("HFFPFL_QK is null");
            return (Criteria) this;
        }

        public Criteria andHffpflQkIsNotNull() {
            addCriterion("HFFPFL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andHffpflQkEqualTo(String value) {
            addCriterion("HFFPFL_QK =", value, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkNotEqualTo(String value) {
            addCriterion("HFFPFL_QK <>", value, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkGreaterThan(String value) {
            addCriterion("HFFPFL_QK >", value, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkGreaterThanOrEqualTo(String value) {
            addCriterion("HFFPFL_QK >=", value, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkLessThan(String value) {
            addCriterion("HFFPFL_QK <", value, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkLessThanOrEqualTo(String value) {
            addCriterion("HFFPFL_QK <=", value, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkLike(String value) {
            addCriterion("HFFPFL_QK like", value, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkNotLike(String value) {
            addCriterion("HFFPFL_QK not like", value, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkIn(List<String> values) {
            addCriterion("HFFPFL_QK in", values, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkNotIn(List<String> values) {
            addCriterion("HFFPFL_QK not in", values, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkBetween(String value1, String value2) {
            addCriterion("HFFPFL_QK between", value1, value2, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkNotBetween(String value1, String value2) {
            addCriterion("HFFPFL_QK not between", value1, value2, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkIsNull() {
            addCriterion("QHWCSL_QK is null");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkIsNotNull() {
            addCriterion("QHWCSL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkEqualTo(String value) {
            addCriterion("QHWCSL_QK =", value, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkNotEqualTo(String value) {
            addCriterion("QHWCSL_QK <>", value, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkGreaterThan(String value) {
            addCriterion("QHWCSL_QK >", value, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkGreaterThanOrEqualTo(String value) {
            addCriterion("QHWCSL_QK >=", value, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkLessThan(String value) {
            addCriterion("QHWCSL_QK <", value, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkLessThanOrEqualTo(String value) {
            addCriterion("QHWCSL_QK <=", value, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkLike(String value) {
            addCriterion("QHWCSL_QK like", value, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkNotLike(String value) {
            addCriterion("QHWCSL_QK not like", value, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkIn(List<String> values) {
            addCriterion("QHWCSL_QK in", values, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkNotIn(List<String> values) {
            addCriterion("QHWCSL_QK not in", values, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkBetween(String value1, String value2) {
            addCriterion("QHWCSL_QK between", value1, value2, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkNotBetween(String value1, String value2) {
            addCriterion("QHWCSL_QK not between", value1, value2, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkIsNull() {
            addCriterion("QHWPFL_QK is null");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkIsNotNull() {
            addCriterion("QHWPFL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkEqualTo(String value) {
            addCriterion("QHWPFL_QK =", value, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkNotEqualTo(String value) {
            addCriterion("QHWPFL_QK <>", value, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkGreaterThan(String value) {
            addCriterion("QHWPFL_QK >", value, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkGreaterThanOrEqualTo(String value) {
            addCriterion("QHWPFL_QK >=", value, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkLessThan(String value) {
            addCriterion("QHWPFL_QK <", value, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkLessThanOrEqualTo(String value) {
            addCriterion("QHWPFL_QK <=", value, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkLike(String value) {
            addCriterion("QHWPFL_QK like", value, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkNotLike(String value) {
            addCriterion("QHWPFL_QK not like", value, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkIn(List<String> values) {
            addCriterion("QHWPFL_QK in", values, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkNotIn(List<String> values) {
            addCriterion("QHWPFL_QK not in", values, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkBetween(String value1, String value2) {
            addCriterion("QHWPFL_QK between", value1, value2, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkNotBetween(String value1, String value2) {
            addCriterion("QHWPFL_QK not between", value1, value2, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkIsNull() {
            addCriterion("FSSCSL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFsscslQkIsNotNull() {
            addCriterion("FSSCSL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFsscslQkEqualTo(String value) {
            addCriterion("FSSCSL_QK =", value, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkNotEqualTo(String value) {
            addCriterion("FSSCSL_QK <>", value, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkGreaterThan(String value) {
            addCriterion("FSSCSL_QK >", value, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkGreaterThanOrEqualTo(String value) {
            addCriterion("FSSCSL_QK >=", value, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkLessThan(String value) {
            addCriterion("FSSCSL_QK <", value, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkLessThanOrEqualTo(String value) {
            addCriterion("FSSCSL_QK <=", value, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkLike(String value) {
            addCriterion("FSSCSL_QK like", value, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkNotLike(String value) {
            addCriterion("FSSCSL_QK not like", value, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkIn(List<String> values) {
            addCriterion("FSSCSL_QK in", values, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkNotIn(List<String> values) {
            addCriterion("FSSCSL_QK not in", values, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkBetween(String value1, String value2) {
            addCriterion("FSSCSL_QK between", value1, value2, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkNotBetween(String value1, String value2) {
            addCriterion("FSSCSL_QK not between", value1, value2, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkIsNull() {
            addCriterion("FSSPFL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFsspflQkIsNotNull() {
            addCriterion("FSSPFL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFsspflQkEqualTo(String value) {
            addCriterion("FSSPFL_QK =", value, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkNotEqualTo(String value) {
            addCriterion("FSSPFL_QK <>", value, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkGreaterThan(String value) {
            addCriterion("FSSPFL_QK >", value, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkGreaterThanOrEqualTo(String value) {
            addCriterion("FSSPFL_QK >=", value, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkLessThan(String value) {
            addCriterion("FSSPFL_QK <", value, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkLessThanOrEqualTo(String value) {
            addCriterion("FSSPFL_QK <=", value, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkLike(String value) {
            addCriterion("FSSPFL_QK like", value, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkNotLike(String value) {
            addCriterion("FSSPFL_QK not like", value, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkIn(List<String> values) {
            addCriterion("FSSPFL_QK in", values, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkNotIn(List<String> values) {
            addCriterion("FSSPFL_QK not in", values, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkBetween(String value1, String value2) {
            addCriterion("FSSPFL_QK between", value1, value2, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkNotBetween(String value1, String value2) {
            addCriterion("FSSPFL_QK not between", value1, value2, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkIsNull() {
            addCriterion("FSQCSL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkIsNotNull() {
            addCriterion("FSQCSL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkEqualTo(String value) {
            addCriterion("FSQCSL_QK =", value, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkNotEqualTo(String value) {
            addCriterion("FSQCSL_QK <>", value, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkGreaterThan(String value) {
            addCriterion("FSQCSL_QK >", value, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkGreaterThanOrEqualTo(String value) {
            addCriterion("FSQCSL_QK >=", value, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkLessThan(String value) {
            addCriterion("FSQCSL_QK <", value, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkLessThanOrEqualTo(String value) {
            addCriterion("FSQCSL_QK <=", value, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkLike(String value) {
            addCriterion("FSQCSL_QK like", value, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkNotLike(String value) {
            addCriterion("FSQCSL_QK not like", value, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkIn(List<String> values) {
            addCriterion("FSQCSL_QK in", values, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkNotIn(List<String> values) {
            addCriterion("FSQCSL_QK not in", values, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkBetween(String value1, String value2) {
            addCriterion("FSQCSL_QK between", value1, value2, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkNotBetween(String value1, String value2) {
            addCriterion("FSQCSL_QK not between", value1, value2, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkIsNull() {
            addCriterion("FSQPFL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkIsNotNull() {
            addCriterion("FSQPFL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkEqualTo(String value) {
            addCriterion("FSQPFL_QK =", value, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkNotEqualTo(String value) {
            addCriterion("FSQPFL_QK <>", value, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkGreaterThan(String value) {
            addCriterion("FSQPFL_QK >", value, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkGreaterThanOrEqualTo(String value) {
            addCriterion("FSQPFL_QK >=", value, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkLessThan(String value) {
            addCriterion("FSQPFL_QK <", value, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkLessThanOrEqualTo(String value) {
            addCriterion("FSQPFL_QK <=", value, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkLike(String value) {
            addCriterion("FSQPFL_QK like", value, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkNotLike(String value) {
            addCriterion("FSQPFL_QK not like", value, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkIn(List<String> values) {
            addCriterion("FSQPFL_QK in", values, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkNotIn(List<String> values) {
            addCriterion("FSQPFL_QK not in", values, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkBetween(String value1, String value2) {
            addCriterion("FSQPFL_QK between", value1, value2, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkNotBetween(String value1, String value2) {
            addCriterion("FSQPFL_QK not between", value1, value2, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkIsNull() {
            addCriterion("FSGCSL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkIsNotNull() {
            addCriterion("FSGCSL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkEqualTo(String value) {
            addCriterion("FSGCSL_QK =", value, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkNotEqualTo(String value) {
            addCriterion("FSGCSL_QK <>", value, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkGreaterThan(String value) {
            addCriterion("FSGCSL_QK >", value, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkGreaterThanOrEqualTo(String value) {
            addCriterion("FSGCSL_QK >=", value, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkLessThan(String value) {
            addCriterion("FSGCSL_QK <", value, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkLessThanOrEqualTo(String value) {
            addCriterion("FSGCSL_QK <=", value, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkLike(String value) {
            addCriterion("FSGCSL_QK like", value, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkNotLike(String value) {
            addCriterion("FSGCSL_QK not like", value, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkIn(List<String> values) {
            addCriterion("FSGCSL_QK in", values, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkNotIn(List<String> values) {
            addCriterion("FSGCSL_QK not in", values, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkBetween(String value1, String value2) {
            addCriterion("FSGCSL_QK between", value1, value2, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkNotBetween(String value1, String value2) {
            addCriterion("FSGCSL_QK not between", value1, value2, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkIsNull() {
            addCriterion("FSGPFL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkIsNotNull() {
            addCriterion("FSGPFL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkEqualTo(String value) {
            addCriterion("FSGPFL_QK =", value, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkNotEqualTo(String value) {
            addCriterion("FSGPFL_QK <>", value, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkGreaterThan(String value) {
            addCriterion("FSGPFL_QK >", value, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkGreaterThanOrEqualTo(String value) {
            addCriterion("FSGPFL_QK >=", value, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkLessThan(String value) {
            addCriterion("FSGPFL_QK <", value, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkLessThanOrEqualTo(String value) {
            addCriterion("FSGPFL_QK <=", value, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkLike(String value) {
            addCriterion("FSGPFL_QK like", value, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkNotLike(String value) {
            addCriterion("FSGPFL_QK not like", value, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkIn(List<String> values) {
            addCriterion("FSGPFL_QK in", values, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkNotIn(List<String> values) {
            addCriterion("FSGPFL_QK not in", values, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkBetween(String value1, String value2) {
            addCriterion("FSGPFL_QK between", value1, value2, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkNotBetween(String value1, String value2) {
            addCriterion("FSGPFL_QK not between", value1, value2, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1IsNull() {
            addCriterion("FSGCSL_QK_DUP1 is null");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1IsNotNull() {
            addCriterion("FSGCSL_QK_DUP1 is not null");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1EqualTo(String value) {
            addCriterion("FSGCSL_QK_DUP1 =", value, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1NotEqualTo(String value) {
            addCriterion("FSGCSL_QK_DUP1 <>", value, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1GreaterThan(String value) {
            addCriterion("FSGCSL_QK_DUP1 >", value, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1GreaterThanOrEqualTo(String value) {
            addCriterion("FSGCSL_QK_DUP1 >=", value, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1LessThan(String value) {
            addCriterion("FSGCSL_QK_DUP1 <", value, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1LessThanOrEqualTo(String value) {
            addCriterion("FSGCSL_QK_DUP1 <=", value, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1Like(String value) {
            addCriterion("FSGCSL_QK_DUP1 like", value, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1NotLike(String value) {
            addCriterion("FSGCSL_QK_DUP1 not like", value, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1In(List<String> values) {
            addCriterion("FSGCSL_QK_DUP1 in", values, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1NotIn(List<String> values) {
            addCriterion("FSGCSL_QK_DUP1 not in", values, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1Between(String value1, String value2) {
            addCriterion("FSGCSL_QK_DUP1 between", value1, value2, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1NotBetween(String value1, String value2) {
            addCriterion("FSGCSL_QK_DUP1 not between", value1, value2, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1IsNull() {
            addCriterion("FSGPFL_QK_DUP1 is null");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1IsNotNull() {
            addCriterion("FSGPFL_QK_DUP1 is not null");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1EqualTo(String value) {
            addCriterion("FSGPFL_QK_DUP1 =", value, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1NotEqualTo(String value) {
            addCriterion("FSGPFL_QK_DUP1 <>", value, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1GreaterThan(String value) {
            addCriterion("FSGPFL_QK_DUP1 >", value, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1GreaterThanOrEqualTo(String value) {
            addCriterion("FSGPFL_QK_DUP1 >=", value, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1LessThan(String value) {
            addCriterion("FSGPFL_QK_DUP1 <", value, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1LessThanOrEqualTo(String value) {
            addCriterion("FSGPFL_QK_DUP1 <=", value, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1Like(String value) {
            addCriterion("FSGPFL_QK_DUP1 like", value, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1NotLike(String value) {
            addCriterion("FSGPFL_QK_DUP1 not like", value, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1In(List<String> values) {
            addCriterion("FSGPFL_QK_DUP1 in", values, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1NotIn(List<String> values) {
            addCriterion("FSGPFL_QK_DUP1 not in", values, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1Between(String value1, String value2) {
            addCriterion("FSGPFL_QK_DUP1 between", value1, value2, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1NotBetween(String value1, String value2) {
            addCriterion("FSGPFL_QK_DUP1 not between", value1, value2, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkIsNull() {
            addCriterion("FSZGCSL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkIsNotNull() {
            addCriterion("FSZGCSL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkEqualTo(String value) {
            addCriterion("FSZGCSL_QK =", value, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkNotEqualTo(String value) {
            addCriterion("FSZGCSL_QK <>", value, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkGreaterThan(String value) {
            addCriterion("FSZGCSL_QK >", value, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkGreaterThanOrEqualTo(String value) {
            addCriterion("FSZGCSL_QK >=", value, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkLessThan(String value) {
            addCriterion("FSZGCSL_QK <", value, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkLessThanOrEqualTo(String value) {
            addCriterion("FSZGCSL_QK <=", value, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkLike(String value) {
            addCriterion("FSZGCSL_QK like", value, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkNotLike(String value) {
            addCriterion("FSZGCSL_QK not like", value, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkIn(List<String> values) {
            addCriterion("FSZGCSL_QK in", values, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkNotIn(List<String> values) {
            addCriterion("FSZGCSL_QK not in", values, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkBetween(String value1, String value2) {
            addCriterion("FSZGCSL_QK between", value1, value2, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkNotBetween(String value1, String value2) {
            addCriterion("FSZGCSL_QK not between", value1, value2, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkIsNull() {
            addCriterion("FSZGPFL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkIsNotNull() {
            addCriterion("FSZGPFL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkEqualTo(String value) {
            addCriterion("FSZGPFL_QK =", value, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkNotEqualTo(String value) {
            addCriterion("FSZGPFL_QK <>", value, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkGreaterThan(String value) {
            addCriterion("FSZGPFL_QK >", value, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkGreaterThanOrEqualTo(String value) {
            addCriterion("FSZGPFL_QK >=", value, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkLessThan(String value) {
            addCriterion("FSZGPFL_QK <", value, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkLessThanOrEqualTo(String value) {
            addCriterion("FSZGPFL_QK <=", value, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkLike(String value) {
            addCriterion("FSZGPFL_QK like", value, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkNotLike(String value) {
            addCriterion("FSZGPFL_QK not like", value, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkIn(List<String> values) {
            addCriterion("FSZGPFL_QK in", values, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkNotIn(List<String> values) {
            addCriterion("FSZGPFL_QK not in", values, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkBetween(String value1, String value2) {
            addCriterion("FSZGPFL_QK between", value1, value2, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkNotBetween(String value1, String value2) {
            addCriterion("FSZGPFL_QK not between", value1, value2, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkIsNull() {
            addCriterion("FSLJGCSL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkIsNotNull() {
            addCriterion("FSLJGCSL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkEqualTo(String value) {
            addCriterion("FSLJGCSL_QK =", value, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkNotEqualTo(String value) {
            addCriterion("FSLJGCSL_QK <>", value, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkGreaterThan(String value) {
            addCriterion("FSLJGCSL_QK >", value, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkGreaterThanOrEqualTo(String value) {
            addCriterion("FSLJGCSL_QK >=", value, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkLessThan(String value) {
            addCriterion("FSLJGCSL_QK <", value, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkLessThanOrEqualTo(String value) {
            addCriterion("FSLJGCSL_QK <=", value, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkLike(String value) {
            addCriterion("FSLJGCSL_QK like", value, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkNotLike(String value) {
            addCriterion("FSLJGCSL_QK not like", value, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkIn(List<String> values) {
            addCriterion("FSLJGCSL_QK in", values, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkNotIn(List<String> values) {
            addCriterion("FSLJGCSL_QK not in", values, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkBetween(String value1, String value2) {
            addCriterion("FSLJGCSL_QK between", value1, value2, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkNotBetween(String value1, String value2) {
            addCriterion("FSLJGCSL_QK not between", value1, value2, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkIsNull() {
            addCriterion("FSLJGPFL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkIsNotNull() {
            addCriterion("FSLJGPFL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkEqualTo(String value) {
            addCriterion("FSLJGPFL_QK =", value, "fsljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkNotEqualTo(String value) {
            addCriterion("FSLJGPFL_QK <>", value, "fsljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkGreaterThan(String value) {
            addCriterion("FSLJGPFL_QK >", value, "fsljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkGreaterThanOrEqualTo(String value) {
            addCriterion("FSLJGPFL_QK >=", value, "fsljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkLessThan(String value) {
            addCriterion("FSLJGPFL_QK <", value, "fsljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkLessThanOrEqualTo(String value) {
            addCriterion("FSLJGPFL_QK <=", value, "fsljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkLike(String value) {
            addCriterion("FSLJGPFL_QK like", value, "fsljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkNotLike(String value) {
            addCriterion("FSLJGPFL_QK not like", value, "fsljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkIn(List<String> values) {
            addCriterion("FSLJGPFL_QK in", values, "fsljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkNotIn(List<String> values) {
            addCriterion("FSLJGPFL_QK not in", values, "fsljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkBetween(String value1, String value2) {
            addCriterion("FSLJGPFL_QK between", value1, value2, "fsljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkNotBetween(String value1, String value2) {
            addCriterion("FSLJGPFL_QK not between", value1, value2, "fsljgpflQk");
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