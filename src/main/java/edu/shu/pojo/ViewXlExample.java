package edu.shu.pojo;

import java.util.ArrayList;
import java.util.List;

public class ViewXlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewXlExample() {
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

        public Criteria andXhIsNull() {
            addCriterion("xh is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("xh is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(String value) {
            addCriterion("xh =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(String value) {
            addCriterion("xh <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(String value) {
            addCriterion("xh >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(String value) {
            addCriterion("xh >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(String value) {
            addCriterion("xh <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(String value) {
            addCriterion("xh <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLike(String value) {
            addCriterion("xh like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotLike(String value) {
            addCriterion("xh not like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<String> values) {
            addCriterion("xh in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<String> values) {
            addCriterion("xh not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(String value1, String value2) {
            addCriterion("xh between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(String value1, String value2) {
            addCriterion("xh not between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXmIsNull() {
            addCriterion("xm is null");
            return (Criteria) this;
        }

        public Criteria andXmIsNotNull() {
            addCriterion("xm is not null");
            return (Criteria) this;
        }

        public Criteria andXmEqualTo(String value) {
            addCriterion("xm =", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotEqualTo(String value) {
            addCriterion("xm <>", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThan(String value) {
            addCriterion("xm >", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThanOrEqualTo(String value) {
            addCriterion("xm >=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThan(String value) {
            addCriterion("xm <", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThanOrEqualTo(String value) {
            addCriterion("xm <=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLike(String value) {
            addCriterion("xm like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotLike(String value) {
            addCriterion("xm not like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmIn(List<String> values) {
            addCriterion("xm in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotIn(List<String> values) {
            addCriterion("xm not in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmBetween(String value1, String value2) {
            addCriterion("xm between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotBetween(String value1, String value2) {
            addCriterion("xm not between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXyIsNull() {
            addCriterion("xy is null");
            return (Criteria) this;
        }

        public Criteria andXyIsNotNull() {
            addCriterion("xy is not null");
            return (Criteria) this;
        }

        public Criteria andXyEqualTo(String value) {
            addCriterion("xy =", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyNotEqualTo(String value) {
            addCriterion("xy <>", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyGreaterThan(String value) {
            addCriterion("xy >", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyGreaterThanOrEqualTo(String value) {
            addCriterion("xy >=", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyLessThan(String value) {
            addCriterion("xy <", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyLessThanOrEqualTo(String value) {
            addCriterion("xy <=", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyLike(String value) {
            addCriterion("xy like", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyNotLike(String value) {
            addCriterion("xy not like", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyIn(List<String> values) {
            addCriterion("xy in", values, "xy");
            return (Criteria) this;
        }

        public Criteria andXyNotIn(List<String> values) {
            addCriterion("xy not in", values, "xy");
            return (Criteria) this;
        }

        public Criteria andXyBetween(String value1, String value2) {
            addCriterion("xy between", value1, value2, "xy");
            return (Criteria) this;
        }

        public Criteria andXyNotBetween(String value1, String value2) {
            addCriterion("xy not between", value1, value2, "xy");
            return (Criteria) this;
        }

        public Criteria andZyIsNull() {
            addCriterion("zy is null");
            return (Criteria) this;
        }

        public Criteria andZyIsNotNull() {
            addCriterion("zy is not null");
            return (Criteria) this;
        }

        public Criteria andZyEqualTo(String value) {
            addCriterion("zy =", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotEqualTo(String value) {
            addCriterion("zy <>", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyGreaterThan(String value) {
            addCriterion("zy >", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyGreaterThanOrEqualTo(String value) {
            addCriterion("zy >=", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLessThan(String value) {
            addCriterion("zy <", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLessThanOrEqualTo(String value) {
            addCriterion("zy <=", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLike(String value) {
            addCriterion("zy like", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotLike(String value) {
            addCriterion("zy not like", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyIn(List<String> values) {
            addCriterion("zy in", values, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotIn(List<String> values) {
            addCriterion("zy not in", values, "zy");
            return (Criteria) this;
        }

        public Criteria andZyBetween(String value1, String value2) {
            addCriterion("zy between", value1, value2, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotBetween(String value1, String value2) {
            addCriterion("zy not between", value1, value2, "zy");
            return (Criteria) this;
        }

        public Criteria andNjIsNull() {
            addCriterion("nj is null");
            return (Criteria) this;
        }

        public Criteria andNjIsNotNull() {
            addCriterion("nj is not null");
            return (Criteria) this;
        }

        public Criteria andNjEqualTo(String value) {
            addCriterion("nj =", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotEqualTo(String value) {
            addCriterion("nj <>", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjGreaterThan(String value) {
            addCriterion("nj >", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjGreaterThanOrEqualTo(String value) {
            addCriterion("nj >=", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjLessThan(String value) {
            addCriterion("nj <", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjLessThanOrEqualTo(String value) {
            addCriterion("nj <=", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjLike(String value) {
            addCriterion("nj like", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotLike(String value) {
            addCriterion("nj not like", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjIn(List<String> values) {
            addCriterion("nj in", values, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotIn(List<String> values) {
            addCriterion("nj not in", values, "nj");
            return (Criteria) this;
        }

        public Criteria andNjBetween(String value1, String value2) {
            addCriterion("nj between", value1, value2, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotBetween(String value1, String value2) {
            addCriterion("nj not between", value1, value2, "nj");
            return (Criteria) this;
        }

        public Criteria andXxxsIsNull() {
            addCriterion("xxxs is null");
            return (Criteria) this;
        }

        public Criteria andXxxsIsNotNull() {
            addCriterion("xxxs is not null");
            return (Criteria) this;
        }

        public Criteria andXxxsEqualTo(String value) {
            addCriterion("xxxs =", value, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsNotEqualTo(String value) {
            addCriterion("xxxs <>", value, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsGreaterThan(String value) {
            addCriterion("xxxs >", value, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsGreaterThanOrEqualTo(String value) {
            addCriterion("xxxs >=", value, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsLessThan(String value) {
            addCriterion("xxxs <", value, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsLessThanOrEqualTo(String value) {
            addCriterion("xxxs <=", value, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsLike(String value) {
            addCriterion("xxxs like", value, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsNotLike(String value) {
            addCriterion("xxxs not like", value, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsIn(List<String> values) {
            addCriterion("xxxs in", values, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsNotIn(List<String> values) {
            addCriterion("xxxs not in", values, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsBetween(String value1, String value2) {
            addCriterion("xxxs between", value1, value2, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsNotBetween(String value1, String value2) {
            addCriterion("xxxs not between", value1, value2, "xxxs");
            return (Criteria) this;
        }

        public Criteria andZydmIsNull() {
            addCriterion("zydm is null");
            return (Criteria) this;
        }

        public Criteria andZydmIsNotNull() {
            addCriterion("zydm is not null");
            return (Criteria) this;
        }

        public Criteria andZydmEqualTo(String value) {
            addCriterion("zydm =", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmNotEqualTo(String value) {
            addCriterion("zydm <>", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmGreaterThan(String value) {
            addCriterion("zydm >", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmGreaterThanOrEqualTo(String value) {
            addCriterion("zydm >=", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmLessThan(String value) {
            addCriterion("zydm <", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmLessThanOrEqualTo(String value) {
            addCriterion("zydm <=", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmLike(String value) {
            addCriterion("zydm like", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmNotLike(String value) {
            addCriterion("zydm not like", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmIn(List<String> values) {
            addCriterion("zydm in", values, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmNotIn(List<String> values) {
            addCriterion("zydm not in", values, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmBetween(String value1, String value2) {
            addCriterion("zydm between", value1, value2, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmNotBetween(String value1, String value2) {
            addCriterion("zydm not between", value1, value2, "zydm");
            return (Criteria) this;
        }

        public Criteria andXwlbIsNull() {
            addCriterion("xwlb is null");
            return (Criteria) this;
        }

        public Criteria andXwlbIsNotNull() {
            addCriterion("xwlb is not null");
            return (Criteria) this;
        }

        public Criteria andXwlbEqualTo(String value) {
            addCriterion("xwlb =", value, "xwlb");
            return (Criteria) this;
        }

        public Criteria andXwlbNotEqualTo(String value) {
            addCriterion("xwlb <>", value, "xwlb");
            return (Criteria) this;
        }

        public Criteria andXwlbGreaterThan(String value) {
            addCriterion("xwlb >", value, "xwlb");
            return (Criteria) this;
        }

        public Criteria andXwlbGreaterThanOrEqualTo(String value) {
            addCriterion("xwlb >=", value, "xwlb");
            return (Criteria) this;
        }

        public Criteria andXwlbLessThan(String value) {
            addCriterion("xwlb <", value, "xwlb");
            return (Criteria) this;
        }

        public Criteria andXwlbLessThanOrEqualTo(String value) {
            addCriterion("xwlb <=", value, "xwlb");
            return (Criteria) this;
        }

        public Criteria andXwlbLike(String value) {
            addCriterion("xwlb like", value, "xwlb");
            return (Criteria) this;
        }

        public Criteria andXwlbNotLike(String value) {
            addCriterion("xwlb not like", value, "xwlb");
            return (Criteria) this;
        }

        public Criteria andXwlbIn(List<String> values) {
            addCriterion("xwlb in", values, "xwlb");
            return (Criteria) this;
        }

        public Criteria andXwlbNotIn(List<String> values) {
            addCriterion("xwlb not in", values, "xwlb");
            return (Criteria) this;
        }

        public Criteria andXwlbBetween(String value1, String value2) {
            addCriterion("xwlb between", value1, value2, "xwlb");
            return (Criteria) this;
        }

        public Criteria andXwlbNotBetween(String value1, String value2) {
            addCriterion("xwlb not between", value1, value2, "xwlb");
            return (Criteria) this;
        }

        public Criteria andBjyjlIsNull() {
            addCriterion("bjyjl is null");
            return (Criteria) this;
        }

        public Criteria andBjyjlIsNotNull() {
            addCriterion("bjyjl is not null");
            return (Criteria) this;
        }

        public Criteria andBjyjlEqualTo(String value) {
            addCriterion("bjyjl =", value, "bjyjl");
            return (Criteria) this;
        }

        public Criteria andBjyjlNotEqualTo(String value) {
            addCriterion("bjyjl <>", value, "bjyjl");
            return (Criteria) this;
        }

        public Criteria andBjyjlGreaterThan(String value) {
            addCriterion("bjyjl >", value, "bjyjl");
            return (Criteria) this;
        }

        public Criteria andBjyjlGreaterThanOrEqualTo(String value) {
            addCriterion("bjyjl >=", value, "bjyjl");
            return (Criteria) this;
        }

        public Criteria andBjyjlLessThan(String value) {
            addCriterion("bjyjl <", value, "bjyjl");
            return (Criteria) this;
        }

        public Criteria andBjyjlLessThanOrEqualTo(String value) {
            addCriterion("bjyjl <=", value, "bjyjl");
            return (Criteria) this;
        }

        public Criteria andBjyjlLike(String value) {
            addCriterion("bjyjl like", value, "bjyjl");
            return (Criteria) this;
        }

        public Criteria andBjyjlNotLike(String value) {
            addCriterion("bjyjl not like", value, "bjyjl");
            return (Criteria) this;
        }

        public Criteria andBjyjlIn(List<String> values) {
            addCriterion("bjyjl in", values, "bjyjl");
            return (Criteria) this;
        }

        public Criteria andBjyjlNotIn(List<String> values) {
            addCriterion("bjyjl not in", values, "bjyjl");
            return (Criteria) this;
        }

        public Criteria andBjyjlBetween(String value1, String value2) {
            addCriterion("bjyjl between", value1, value2, "bjyjl");
            return (Criteria) this;
        }

        public Criteria andBjyjlNotBetween(String value1, String value2) {
            addCriterion("bjyjl not between", value1, value2, "bjyjl");
            return (Criteria) this;
        }

        public Criteria andByrqIsNull() {
            addCriterion("byrq is null");
            return (Criteria) this;
        }

        public Criteria andByrqIsNotNull() {
            addCriterion("byrq is not null");
            return (Criteria) this;
        }

        public Criteria andByrqEqualTo(String value) {
            addCriterion("byrq =", value, "byrq");
            return (Criteria) this;
        }

        public Criteria andByrqNotEqualTo(String value) {
            addCriterion("byrq <>", value, "byrq");
            return (Criteria) this;
        }

        public Criteria andByrqGreaterThan(String value) {
            addCriterion("byrq >", value, "byrq");
            return (Criteria) this;
        }

        public Criteria andByrqGreaterThanOrEqualTo(String value) {
            addCriterion("byrq >=", value, "byrq");
            return (Criteria) this;
        }

        public Criteria andByrqLessThan(String value) {
            addCriterion("byrq <", value, "byrq");
            return (Criteria) this;
        }

        public Criteria andByrqLessThanOrEqualTo(String value) {
            addCriterion("byrq <=", value, "byrq");
            return (Criteria) this;
        }

        public Criteria andByrqLike(String value) {
            addCriterion("byrq like", value, "byrq");
            return (Criteria) this;
        }

        public Criteria andByrqNotLike(String value) {
            addCriterion("byrq not like", value, "byrq");
            return (Criteria) this;
        }

        public Criteria andByrqIn(List<String> values) {
            addCriterion("byrq in", values, "byrq");
            return (Criteria) this;
        }

        public Criteria andByrqNotIn(List<String> values) {
            addCriterion("byrq not in", values, "byrq");
            return (Criteria) this;
        }

        public Criteria andByrqBetween(String value1, String value2) {
            addCriterion("byrq between", value1, value2, "byrq");
            return (Criteria) this;
        }

        public Criteria andByrqNotBetween(String value1, String value2) {
            addCriterion("byrq not between", value1, value2, "byrq");
            return (Criteria) this;
        }

        public Criteria andDsghIsNull() {
            addCriterion("dsgh is null");
            return (Criteria) this;
        }

        public Criteria andDsghIsNotNull() {
            addCriterion("dsgh is not null");
            return (Criteria) this;
        }

        public Criteria andDsghEqualTo(String value) {
            addCriterion("dsgh =", value, "dsgh");
            return (Criteria) this;
        }

        public Criteria andDsghNotEqualTo(String value) {
            addCriterion("dsgh <>", value, "dsgh");
            return (Criteria) this;
        }

        public Criteria andDsghGreaterThan(String value) {
            addCriterion("dsgh >", value, "dsgh");
            return (Criteria) this;
        }

        public Criteria andDsghGreaterThanOrEqualTo(String value) {
            addCriterion("dsgh >=", value, "dsgh");
            return (Criteria) this;
        }

        public Criteria andDsghLessThan(String value) {
            addCriterion("dsgh <", value, "dsgh");
            return (Criteria) this;
        }

        public Criteria andDsghLessThanOrEqualTo(String value) {
            addCriterion("dsgh <=", value, "dsgh");
            return (Criteria) this;
        }

        public Criteria andDsghLike(String value) {
            addCriterion("dsgh like", value, "dsgh");
            return (Criteria) this;
        }

        public Criteria andDsghNotLike(String value) {
            addCriterion("dsgh not like", value, "dsgh");
            return (Criteria) this;
        }

        public Criteria andDsghIn(List<String> values) {
            addCriterion("dsgh in", values, "dsgh");
            return (Criteria) this;
        }

        public Criteria andDsghNotIn(List<String> values) {
            addCriterion("dsgh not in", values, "dsgh");
            return (Criteria) this;
        }

        public Criteria andDsghBetween(String value1, String value2) {
            addCriterion("dsgh between", value1, value2, "dsgh");
            return (Criteria) this;
        }

        public Criteria andDsghNotBetween(String value1, String value2) {
            addCriterion("dsgh not between", value1, value2, "dsgh");
            return (Criteria) this;
        }

        public Criteria andDsIsNull() {
            addCriterion("ds is null");
            return (Criteria) this;
        }

        public Criteria andDsIsNotNull() {
            addCriterion("ds is not null");
            return (Criteria) this;
        }

        public Criteria andDsEqualTo(String value) {
            addCriterion("ds =", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsNotEqualTo(String value) {
            addCriterion("ds <>", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsGreaterThan(String value) {
            addCriterion("ds >", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsGreaterThanOrEqualTo(String value) {
            addCriterion("ds >=", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsLessThan(String value) {
            addCriterion("ds <", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsLessThanOrEqualTo(String value) {
            addCriterion("ds <=", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsLike(String value) {
            addCriterion("ds like", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsNotLike(String value) {
            addCriterion("ds not like", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsIn(List<String> values) {
            addCriterion("ds in", values, "ds");
            return (Criteria) this;
        }

        public Criteria andDsNotIn(List<String> values) {
            addCriterion("ds not in", values, "ds");
            return (Criteria) this;
        }

        public Criteria andDsBetween(String value1, String value2) {
            addCriterion("ds between", value1, value2, "ds");
            return (Criteria) this;
        }

        public Criteria andDsNotBetween(String value1, String value2) {
            addCriterion("ds not between", value1, value2, "ds");
            return (Criteria) this;
        }

        public Criteria andCcIsNull() {
            addCriterion("CC is null");
            return (Criteria) this;
        }

        public Criteria andCcIsNotNull() {
            addCriterion("CC is not null");
            return (Criteria) this;
        }

        public Criteria andCcEqualTo(String value) {
            addCriterion("CC =", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotEqualTo(String value) {
            addCriterion("CC <>", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcGreaterThan(String value) {
            addCriterion("CC >", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcGreaterThanOrEqualTo(String value) {
            addCriterion("CC >=", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcLessThan(String value) {
            addCriterion("CC <", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcLessThanOrEqualTo(String value) {
            addCriterion("CC <=", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcLike(String value) {
            addCriterion("CC like", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotLike(String value) {
            addCriterion("CC not like", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcIn(List<String> values) {
            addCriterion("CC in", values, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotIn(List<String> values) {
            addCriterion("CC not in", values, "cc");
            return (Criteria) this;
        }

        public Criteria andCcBetween(String value1, String value2) {
            addCriterion("CC between", value1, value2, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotBetween(String value1, String value2) {
            addCriterion("CC not between", value1, value2, "cc");
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