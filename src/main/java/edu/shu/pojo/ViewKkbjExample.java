package edu.shu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ViewKkbjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewKkbjExample() {
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

        public Criteria andBjmcIsNull() {
            addCriterion("bjmc is null");
            return (Criteria) this;
        }

        public Criteria andBjmcIsNotNull() {
            addCriterion("bjmc is not null");
            return (Criteria) this;
        }

        public Criteria andBjmcEqualTo(String value) {
            addCriterion("bjmc =", value, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcNotEqualTo(String value) {
            addCriterion("bjmc <>", value, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcGreaterThan(String value) {
            addCriterion("bjmc >", value, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcGreaterThanOrEqualTo(String value) {
            addCriterion("bjmc >=", value, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcLessThan(String value) {
            addCriterion("bjmc <", value, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcLessThanOrEqualTo(String value) {
            addCriterion("bjmc <=", value, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcLike(String value) {
            addCriterion("bjmc like", value, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcNotLike(String value) {
            addCriterion("bjmc not like", value, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcIn(List<String> values) {
            addCriterion("bjmc in", values, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcNotIn(List<String> values) {
            addCriterion("bjmc not in", values, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcBetween(String value1, String value2) {
            addCriterion("bjmc between", value1, value2, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcNotBetween(String value1, String value2) {
            addCriterion("bjmc not between", value1, value2, "bjmc");
            return (Criteria) this;
        }

        public Criteria andKcbhIsNull() {
            addCriterion("kcbh is null");
            return (Criteria) this;
        }

        public Criteria andKcbhIsNotNull() {
            addCriterion("kcbh is not null");
            return (Criteria) this;
        }

        public Criteria andKcbhEqualTo(String value) {
            addCriterion("kcbh =", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhNotEqualTo(String value) {
            addCriterion("kcbh <>", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhGreaterThan(String value) {
            addCriterion("kcbh >", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhGreaterThanOrEqualTo(String value) {
            addCriterion("kcbh >=", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhLessThan(String value) {
            addCriterion("kcbh <", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhLessThanOrEqualTo(String value) {
            addCriterion("kcbh <=", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhLike(String value) {
            addCriterion("kcbh like", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhNotLike(String value) {
            addCriterion("kcbh not like", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhIn(List<String> values) {
            addCriterion("kcbh in", values, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhNotIn(List<String> values) {
            addCriterion("kcbh not in", values, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhBetween(String value1, String value2) {
            addCriterion("kcbh between", value1, value2, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhNotBetween(String value1, String value2) {
            addCriterion("kcbh not between", value1, value2, "kcbh");
            return (Criteria) this;
        }

        public Criteria andYxIsNull() {
            addCriterion("yx is null");
            return (Criteria) this;
        }

        public Criteria andYxIsNotNull() {
            addCriterion("yx is not null");
            return (Criteria) this;
        }

        public Criteria andYxEqualTo(String value) {
            addCriterion("yx =", value, "yx");
            return (Criteria) this;
        }

        public Criteria andYxNotEqualTo(String value) {
            addCriterion("yx <>", value, "yx");
            return (Criteria) this;
        }

        public Criteria andYxGreaterThan(String value) {
            addCriterion("yx >", value, "yx");
            return (Criteria) this;
        }

        public Criteria andYxGreaterThanOrEqualTo(String value) {
            addCriterion("yx >=", value, "yx");
            return (Criteria) this;
        }

        public Criteria andYxLessThan(String value) {
            addCriterion("yx <", value, "yx");
            return (Criteria) this;
        }

        public Criteria andYxLessThanOrEqualTo(String value) {
            addCriterion("yx <=", value, "yx");
            return (Criteria) this;
        }

        public Criteria andYxLike(String value) {
            addCriterion("yx like", value, "yx");
            return (Criteria) this;
        }

        public Criteria andYxNotLike(String value) {
            addCriterion("yx not like", value, "yx");
            return (Criteria) this;
        }

        public Criteria andYxIn(List<String> values) {
            addCriterion("yx in", values, "yx");
            return (Criteria) this;
        }

        public Criteria andYxNotIn(List<String> values) {
            addCriterion("yx not in", values, "yx");
            return (Criteria) this;
        }

        public Criteria andYxBetween(String value1, String value2) {
            addCriterion("yx between", value1, value2, "yx");
            return (Criteria) this;
        }

        public Criteria andYxNotBetween(String value1, String value2) {
            addCriterion("yx not between", value1, value2, "yx");
            return (Criteria) this;
        }

        public Criteria andKcmcIsNull() {
            addCriterion("kcmc is null");
            return (Criteria) this;
        }

        public Criteria andKcmcIsNotNull() {
            addCriterion("kcmc is not null");
            return (Criteria) this;
        }

        public Criteria andKcmcEqualTo(String value) {
            addCriterion("kcmc =", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcNotEqualTo(String value) {
            addCriterion("kcmc <>", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcGreaterThan(String value) {
            addCriterion("kcmc >", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcGreaterThanOrEqualTo(String value) {
            addCriterion("kcmc >=", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcLessThan(String value) {
            addCriterion("kcmc <", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcLessThanOrEqualTo(String value) {
            addCriterion("kcmc <=", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcLike(String value) {
            addCriterion("kcmc like", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcNotLike(String value) {
            addCriterion("kcmc not like", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcIn(List<String> values) {
            addCriterion("kcmc in", values, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcNotIn(List<String> values) {
            addCriterion("kcmc not in", values, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcBetween(String value1, String value2) {
            addCriterion("kcmc between", value1, value2, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcNotBetween(String value1, String value2) {
            addCriterion("kcmc not between", value1, value2, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKccsIsNull() {
            addCriterion("kccs is null");
            return (Criteria) this;
        }

        public Criteria andKccsIsNotNull() {
            addCriterion("kccs is not null");
            return (Criteria) this;
        }

        public Criteria andKccsEqualTo(Integer value) {
            addCriterion("kccs =", value, "kccs");
            return (Criteria) this;
        }

        public Criteria andKccsNotEqualTo(Integer value) {
            addCriterion("kccs <>", value, "kccs");
            return (Criteria) this;
        }

        public Criteria andKccsGreaterThan(Integer value) {
            addCriterion("kccs >", value, "kccs");
            return (Criteria) this;
        }

        public Criteria andKccsGreaterThanOrEqualTo(Integer value) {
            addCriterion("kccs >=", value, "kccs");
            return (Criteria) this;
        }

        public Criteria andKccsLessThan(Integer value) {
            addCriterion("kccs <", value, "kccs");
            return (Criteria) this;
        }

        public Criteria andKccsLessThanOrEqualTo(Integer value) {
            addCriterion("kccs <=", value, "kccs");
            return (Criteria) this;
        }

        public Criteria andKccsIn(List<Integer> values) {
            addCriterion("kccs in", values, "kccs");
            return (Criteria) this;
        }

        public Criteria andKccsNotIn(List<Integer> values) {
            addCriterion("kccs not in", values, "kccs");
            return (Criteria) this;
        }

        public Criteria andKccsBetween(Integer value1, Integer value2) {
            addCriterion("kccs between", value1, value2, "kccs");
            return (Criteria) this;
        }

        public Criteria andKccsNotBetween(Integer value1, Integer value2) {
            addCriterion("kccs not between", value1, value2, "kccs");
            return (Criteria) this;
        }

        public Criteria andKcxfIsNull() {
            addCriterion("kcxf is null");
            return (Criteria) this;
        }

        public Criteria andKcxfIsNotNull() {
            addCriterion("kcxf is not null");
            return (Criteria) this;
        }

        public Criteria andKcxfEqualTo(BigDecimal value) {
            addCriterion("kcxf =", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfNotEqualTo(BigDecimal value) {
            addCriterion("kcxf <>", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfGreaterThan(BigDecimal value) {
            addCriterion("kcxf >", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("kcxf >=", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfLessThan(BigDecimal value) {
            addCriterion("kcxf <", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("kcxf <=", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfIn(List<BigDecimal> values) {
            addCriterion("kcxf in", values, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfNotIn(List<BigDecimal> values) {
            addCriterion("kcxf not in", values, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kcxf between", value1, value2, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kcxf not between", value1, value2, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKczxsIsNull() {
            addCriterion("kczxs is null");
            return (Criteria) this;
        }

        public Criteria andKczxsIsNotNull() {
            addCriterion("kczxs is not null");
            return (Criteria) this;
        }

        public Criteria andKczxsEqualTo(Integer value) {
            addCriterion("kczxs =", value, "kczxs");
            return (Criteria) this;
        }

        public Criteria andKczxsNotEqualTo(Integer value) {
            addCriterion("kczxs <>", value, "kczxs");
            return (Criteria) this;
        }

        public Criteria andKczxsGreaterThan(Integer value) {
            addCriterion("kczxs >", value, "kczxs");
            return (Criteria) this;
        }

        public Criteria andKczxsGreaterThanOrEqualTo(Integer value) {
            addCriterion("kczxs >=", value, "kczxs");
            return (Criteria) this;
        }

        public Criteria andKczxsLessThan(Integer value) {
            addCriterion("kczxs <", value, "kczxs");
            return (Criteria) this;
        }

        public Criteria andKczxsLessThanOrEqualTo(Integer value) {
            addCriterion("kczxs <=", value, "kczxs");
            return (Criteria) this;
        }

        public Criteria andKczxsIn(List<Integer> values) {
            addCriterion("kczxs in", values, "kczxs");
            return (Criteria) this;
        }

        public Criteria andKczxsNotIn(List<Integer> values) {
            addCriterion("kczxs not in", values, "kczxs");
            return (Criteria) this;
        }

        public Criteria andKczxsBetween(Integer value1, Integer value2) {
            addCriterion("kczxs between", value1, value2, "kczxs");
            return (Criteria) this;
        }

        public Criteria andKczxsNotBetween(Integer value1, Integer value2) {
            addCriterion("kczxs not between", value1, value2, "kczxs");
            return (Criteria) this;
        }

        public Criteria andZjjsbhIsNull() {
            addCriterion("zjjsbh is null");
            return (Criteria) this;
        }

        public Criteria andZjjsbhIsNotNull() {
            addCriterion("zjjsbh is not null");
            return (Criteria) this;
        }

        public Criteria andZjjsbhEqualTo(String value) {
            addCriterion("zjjsbh =", value, "zjjsbh");
            return (Criteria) this;
        }

        public Criteria andZjjsbhNotEqualTo(String value) {
            addCriterion("zjjsbh <>", value, "zjjsbh");
            return (Criteria) this;
        }

        public Criteria andZjjsbhGreaterThan(String value) {
            addCriterion("zjjsbh >", value, "zjjsbh");
            return (Criteria) this;
        }

        public Criteria andZjjsbhGreaterThanOrEqualTo(String value) {
            addCriterion("zjjsbh >=", value, "zjjsbh");
            return (Criteria) this;
        }

        public Criteria andZjjsbhLessThan(String value) {
            addCriterion("zjjsbh <", value, "zjjsbh");
            return (Criteria) this;
        }

        public Criteria andZjjsbhLessThanOrEqualTo(String value) {
            addCriterion("zjjsbh <=", value, "zjjsbh");
            return (Criteria) this;
        }

        public Criteria andZjjsbhLike(String value) {
            addCriterion("zjjsbh like", value, "zjjsbh");
            return (Criteria) this;
        }

        public Criteria andZjjsbhNotLike(String value) {
            addCriterion("zjjsbh not like", value, "zjjsbh");
            return (Criteria) this;
        }

        public Criteria andZjjsbhIn(List<String> values) {
            addCriterion("zjjsbh in", values, "zjjsbh");
            return (Criteria) this;
        }

        public Criteria andZjjsbhNotIn(List<String> values) {
            addCriterion("zjjsbh not in", values, "zjjsbh");
            return (Criteria) this;
        }

        public Criteria andZjjsbhBetween(String value1, String value2) {
            addCriterion("zjjsbh between", value1, value2, "zjjsbh");
            return (Criteria) this;
        }

        public Criteria andZjjsbhNotBetween(String value1, String value2) {
            addCriterion("zjjsbh not between", value1, value2, "zjjsbh");
            return (Criteria) this;
        }

        public Criteria andFjjsIsNull() {
            addCriterion("fjjs is null");
            return (Criteria) this;
        }

        public Criteria andFjjsIsNotNull() {
            addCriterion("fjjs is not null");
            return (Criteria) this;
        }

        public Criteria andFjjsEqualTo(String value) {
            addCriterion("fjjs =", value, "fjjs");
            return (Criteria) this;
        }

        public Criteria andFjjsNotEqualTo(String value) {
            addCriterion("fjjs <>", value, "fjjs");
            return (Criteria) this;
        }

        public Criteria andFjjsGreaterThan(String value) {
            addCriterion("fjjs >", value, "fjjs");
            return (Criteria) this;
        }

        public Criteria andFjjsGreaterThanOrEqualTo(String value) {
            addCriterion("fjjs >=", value, "fjjs");
            return (Criteria) this;
        }

        public Criteria andFjjsLessThan(String value) {
            addCriterion("fjjs <", value, "fjjs");
            return (Criteria) this;
        }

        public Criteria andFjjsLessThanOrEqualTo(String value) {
            addCriterion("fjjs <=", value, "fjjs");
            return (Criteria) this;
        }

        public Criteria andFjjsLike(String value) {
            addCriterion("fjjs like", value, "fjjs");
            return (Criteria) this;
        }

        public Criteria andFjjsNotLike(String value) {
            addCriterion("fjjs not like", value, "fjjs");
            return (Criteria) this;
        }

        public Criteria andFjjsIn(List<String> values) {
            addCriterion("fjjs in", values, "fjjs");
            return (Criteria) this;
        }

        public Criteria andFjjsNotIn(List<String> values) {
            addCriterion("fjjs not in", values, "fjjs");
            return (Criteria) this;
        }

        public Criteria andFjjsBetween(String value1, String value2) {
            addCriterion("fjjs between", value1, value2, "fjjs");
            return (Criteria) this;
        }

        public Criteria andFjjsNotBetween(String value1, String value2) {
            addCriterion("fjjs not between", value1, value2, "fjjs");
            return (Criteria) this;
        }

        public Criteria andJsbhIsNull() {
            addCriterion("jsbh is null");
            return (Criteria) this;
        }

        public Criteria andJsbhIsNotNull() {
            addCriterion("jsbh is not null");
            return (Criteria) this;
        }

        public Criteria andJsbhEqualTo(String value) {
            addCriterion("jsbh =", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhNotEqualTo(String value) {
            addCriterion("jsbh <>", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhGreaterThan(String value) {
            addCriterion("jsbh >", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhGreaterThanOrEqualTo(String value) {
            addCriterion("jsbh >=", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhLessThan(String value) {
            addCriterion("jsbh <", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhLessThanOrEqualTo(String value) {
            addCriterion("jsbh <=", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhLike(String value) {
            addCriterion("jsbh like", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhNotLike(String value) {
            addCriterion("jsbh not like", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhIn(List<String> values) {
            addCriterion("jsbh in", values, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhNotIn(List<String> values) {
            addCriterion("jsbh not in", values, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhBetween(String value1, String value2) {
            addCriterion("jsbh between", value1, value2, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhNotBetween(String value1, String value2) {
            addCriterion("jsbh not between", value1, value2, "jsbh");
            return (Criteria) this;
        }

        public Criteria andKkfsIsNull() {
            addCriterion("kkfs is null");
            return (Criteria) this;
        }

        public Criteria andKkfsIsNotNull() {
            addCriterion("kkfs is not null");
            return (Criteria) this;
        }

        public Criteria andKkfsEqualTo(String value) {
            addCriterion("kkfs =", value, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsNotEqualTo(String value) {
            addCriterion("kkfs <>", value, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsGreaterThan(String value) {
            addCriterion("kkfs >", value, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsGreaterThanOrEqualTo(String value) {
            addCriterion("kkfs >=", value, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsLessThan(String value) {
            addCriterion("kkfs <", value, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsLessThanOrEqualTo(String value) {
            addCriterion("kkfs <=", value, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsLike(String value) {
            addCriterion("kkfs like", value, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsNotLike(String value) {
            addCriterion("kkfs not like", value, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsIn(List<String> values) {
            addCriterion("kkfs in", values, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsNotIn(List<String> values) {
            addCriterion("kkfs not in", values, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsBetween(String value1, String value2) {
            addCriterion("kkfs between", value1, value2, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsNotBetween(String value1, String value2) {
            addCriterion("kkfs not between", value1, value2, "kkfs");
            return (Criteria) this;
        }

        public Criteria andRnrsIsNull() {
            addCriterion("rnrs is null");
            return (Criteria) this;
        }

        public Criteria andRnrsIsNotNull() {
            addCriterion("rnrs is not null");
            return (Criteria) this;
        }

        public Criteria andRnrsEqualTo(Integer value) {
            addCriterion("rnrs =", value, "rnrs");
            return (Criteria) this;
        }

        public Criteria andRnrsNotEqualTo(Integer value) {
            addCriterion("rnrs <>", value, "rnrs");
            return (Criteria) this;
        }

        public Criteria andRnrsGreaterThan(Integer value) {
            addCriterion("rnrs >", value, "rnrs");
            return (Criteria) this;
        }

        public Criteria andRnrsGreaterThanOrEqualTo(Integer value) {
            addCriterion("rnrs >=", value, "rnrs");
            return (Criteria) this;
        }

        public Criteria andRnrsLessThan(Integer value) {
            addCriterion("rnrs <", value, "rnrs");
            return (Criteria) this;
        }

        public Criteria andRnrsLessThanOrEqualTo(Integer value) {
            addCriterion("rnrs <=", value, "rnrs");
            return (Criteria) this;
        }

        public Criteria andRnrsIn(List<Integer> values) {
            addCriterion("rnrs in", values, "rnrs");
            return (Criteria) this;
        }

        public Criteria andRnrsNotIn(List<Integer> values) {
            addCriterion("rnrs not in", values, "rnrs");
            return (Criteria) this;
        }

        public Criteria andRnrsBetween(Integer value1, Integer value2) {
            addCriterion("rnrs between", value1, value2, "rnrs");
            return (Criteria) this;
        }

        public Criteria andRnrsNotBetween(Integer value1, Integer value2) {
            addCriterion("rnrs not between", value1, value2, "rnrs");
            return (Criteria) this;
        }

        public Criteria andRnbxrsIsNull() {
            addCriterion("rnbxrs is null");
            return (Criteria) this;
        }

        public Criteria andRnbxrsIsNotNull() {
            addCriterion("rnbxrs is not null");
            return (Criteria) this;
        }

        public Criteria andRnbxrsEqualTo(Integer value) {
            addCriterion("rnbxrs =", value, "rnbxrs");
            return (Criteria) this;
        }

        public Criteria andRnbxrsNotEqualTo(Integer value) {
            addCriterion("rnbxrs <>", value, "rnbxrs");
            return (Criteria) this;
        }

        public Criteria andRnbxrsGreaterThan(Integer value) {
            addCriterion("rnbxrs >", value, "rnbxrs");
            return (Criteria) this;
        }

        public Criteria andRnbxrsGreaterThanOrEqualTo(Integer value) {
            addCriterion("rnbxrs >=", value, "rnbxrs");
            return (Criteria) this;
        }

        public Criteria andRnbxrsLessThan(Integer value) {
            addCriterion("rnbxrs <", value, "rnbxrs");
            return (Criteria) this;
        }

        public Criteria andRnbxrsLessThanOrEqualTo(Integer value) {
            addCriterion("rnbxrs <=", value, "rnbxrs");
            return (Criteria) this;
        }

        public Criteria andRnbxrsIn(List<Integer> values) {
            addCriterion("rnbxrs in", values, "rnbxrs");
            return (Criteria) this;
        }

        public Criteria andRnbxrsNotIn(List<Integer> values) {
            addCriterion("rnbxrs not in", values, "rnbxrs");
            return (Criteria) this;
        }

        public Criteria andRnbxrsBetween(Integer value1, Integer value2) {
            addCriterion("rnbxrs between", value1, value2, "rnbxrs");
            return (Criteria) this;
        }

        public Criteria andRnbxrsNotBetween(Integer value1, Integer value2) {
            addCriterion("rnbxrs not between", value1, value2, "rnbxrs");
            return (Criteria) this;
        }

        public Criteria andRnxxrsIsNull() {
            addCriterion("rnxxrs is null");
            return (Criteria) this;
        }

        public Criteria andRnxxrsIsNotNull() {
            addCriterion("rnxxrs is not null");
            return (Criteria) this;
        }

        public Criteria andRnxxrsEqualTo(Integer value) {
            addCriterion("rnxxrs =", value, "rnxxrs");
            return (Criteria) this;
        }

        public Criteria andRnxxrsNotEqualTo(Integer value) {
            addCriterion("rnxxrs <>", value, "rnxxrs");
            return (Criteria) this;
        }

        public Criteria andRnxxrsGreaterThan(Integer value) {
            addCriterion("rnxxrs >", value, "rnxxrs");
            return (Criteria) this;
        }

        public Criteria andRnxxrsGreaterThanOrEqualTo(Integer value) {
            addCriterion("rnxxrs >=", value, "rnxxrs");
            return (Criteria) this;
        }

        public Criteria andRnxxrsLessThan(Integer value) {
            addCriterion("rnxxrs <", value, "rnxxrs");
            return (Criteria) this;
        }

        public Criteria andRnxxrsLessThanOrEqualTo(Integer value) {
            addCriterion("rnxxrs <=", value, "rnxxrs");
            return (Criteria) this;
        }

        public Criteria andRnxxrsIn(List<Integer> values) {
            addCriterion("rnxxrs in", values, "rnxxrs");
            return (Criteria) this;
        }

        public Criteria andRnxxrsNotIn(List<Integer> values) {
            addCriterion("rnxxrs not in", values, "rnxxrs");
            return (Criteria) this;
        }

        public Criteria andRnxxrsBetween(Integer value1, Integer value2) {
            addCriterion("rnxxrs between", value1, value2, "rnxxrs");
            return (Criteria) this;
        }

        public Criteria andRnxxrsNotBetween(Integer value1, Integer value2) {
            addCriterion("rnxxrs not between", value1, value2, "rnxxrs");
            return (Criteria) this;
        }

        public Criteria andXkrsIsNull() {
            addCriterion("xkrs is null");
            return (Criteria) this;
        }

        public Criteria andXkrsIsNotNull() {
            addCriterion("xkrs is not null");
            return (Criteria) this;
        }

        public Criteria andXkrsEqualTo(Integer value) {
            addCriterion("xkrs =", value, "xkrs");
            return (Criteria) this;
        }

        public Criteria andXkrsNotEqualTo(Integer value) {
            addCriterion("xkrs <>", value, "xkrs");
            return (Criteria) this;
        }

        public Criteria andXkrsGreaterThan(Integer value) {
            addCriterion("xkrs >", value, "xkrs");
            return (Criteria) this;
        }

        public Criteria andXkrsGreaterThanOrEqualTo(Integer value) {
            addCriterion("xkrs >=", value, "xkrs");
            return (Criteria) this;
        }

        public Criteria andXkrsLessThan(Integer value) {
            addCriterion("xkrs <", value, "xkrs");
            return (Criteria) this;
        }

        public Criteria andXkrsLessThanOrEqualTo(Integer value) {
            addCriterion("xkrs <=", value, "xkrs");
            return (Criteria) this;
        }

        public Criteria andXkrsIn(List<Integer> values) {
            addCriterion("xkrs in", values, "xkrs");
            return (Criteria) this;
        }

        public Criteria andXkrsNotIn(List<Integer> values) {
            addCriterion("xkrs not in", values, "xkrs");
            return (Criteria) this;
        }

        public Criteria andXkrsBetween(Integer value1, Integer value2) {
            addCriterion("xkrs between", value1, value2, "xkrs");
            return (Criteria) this;
        }

        public Criteria andXkrsNotBetween(Integer value1, Integer value2) {
            addCriterion("xkrs not between", value1, value2, "xkrs");
            return (Criteria) this;
        }

        public Criteria andSksjIsNull() {
            addCriterion("sksj is null");
            return (Criteria) this;
        }

        public Criteria andSksjIsNotNull() {
            addCriterion("sksj is not null");
            return (Criteria) this;
        }

        public Criteria andSksjEqualTo(String value) {
            addCriterion("sksj =", value, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjNotEqualTo(String value) {
            addCriterion("sksj <>", value, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjGreaterThan(String value) {
            addCriterion("sksj >", value, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjGreaterThanOrEqualTo(String value) {
            addCriterion("sksj >=", value, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjLessThan(String value) {
            addCriterion("sksj <", value, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjLessThanOrEqualTo(String value) {
            addCriterion("sksj <=", value, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjLike(String value) {
            addCriterion("sksj like", value, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjNotLike(String value) {
            addCriterion("sksj not like", value, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjIn(List<String> values) {
            addCriterion("sksj in", values, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjNotIn(List<String> values) {
            addCriterion("sksj not in", values, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjBetween(String value1, String value2) {
            addCriterion("sksj between", value1, value2, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjNotBetween(String value1, String value2) {
            addCriterion("sksj not between", value1, value2, "sksj");
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

        public Criteria andSfjzpkIsNull() {
            addCriterion("sfjzpk is null");
            return (Criteria) this;
        }

        public Criteria andSfjzpkIsNotNull() {
            addCriterion("sfjzpk is not null");
            return (Criteria) this;
        }

        public Criteria andSfjzpkEqualTo(String value) {
            addCriterion("sfjzpk =", value, "sfjzpk");
            return (Criteria) this;
        }

        public Criteria andSfjzpkNotEqualTo(String value) {
            addCriterion("sfjzpk <>", value, "sfjzpk");
            return (Criteria) this;
        }

        public Criteria andSfjzpkGreaterThan(String value) {
            addCriterion("sfjzpk >", value, "sfjzpk");
            return (Criteria) this;
        }

        public Criteria andSfjzpkGreaterThanOrEqualTo(String value) {
            addCriterion("sfjzpk >=", value, "sfjzpk");
            return (Criteria) this;
        }

        public Criteria andSfjzpkLessThan(String value) {
            addCriterion("sfjzpk <", value, "sfjzpk");
            return (Criteria) this;
        }

        public Criteria andSfjzpkLessThanOrEqualTo(String value) {
            addCriterion("sfjzpk <=", value, "sfjzpk");
            return (Criteria) this;
        }

        public Criteria andSfjzpkLike(String value) {
            addCriterion("sfjzpk like", value, "sfjzpk");
            return (Criteria) this;
        }

        public Criteria andSfjzpkNotLike(String value) {
            addCriterion("sfjzpk not like", value, "sfjzpk");
            return (Criteria) this;
        }

        public Criteria andSfjzpkIn(List<String> values) {
            addCriterion("sfjzpk in", values, "sfjzpk");
            return (Criteria) this;
        }

        public Criteria andSfjzpkNotIn(List<String> values) {
            addCriterion("sfjzpk not in", values, "sfjzpk");
            return (Criteria) this;
        }

        public Criteria andSfjzpkBetween(String value1, String value2) {
            addCriterion("sfjzpk between", value1, value2, "sfjzpk");
            return (Criteria) this;
        }

        public Criteria andSfjzpkNotBetween(String value1, String value2) {
            addCriterion("sfjzpk not between", value1, value2, "sfjzpk");
            return (Criteria) this;
        }

        public Criteria andSyxsIsNull() {
            addCriterion("syxs is null");
            return (Criteria) this;
        }

        public Criteria andSyxsIsNotNull() {
            addCriterion("syxs is not null");
            return (Criteria) this;
        }

        public Criteria andSyxsEqualTo(String value) {
            addCriterion("syxs =", value, "syxs");
            return (Criteria) this;
        }

        public Criteria andSyxsNotEqualTo(String value) {
            addCriterion("syxs <>", value, "syxs");
            return (Criteria) this;
        }

        public Criteria andSyxsGreaterThan(String value) {
            addCriterion("syxs >", value, "syxs");
            return (Criteria) this;
        }

        public Criteria andSyxsGreaterThanOrEqualTo(String value) {
            addCriterion("syxs >=", value, "syxs");
            return (Criteria) this;
        }

        public Criteria andSyxsLessThan(String value) {
            addCriterion("syxs <", value, "syxs");
            return (Criteria) this;
        }

        public Criteria andSyxsLessThanOrEqualTo(String value) {
            addCriterion("syxs <=", value, "syxs");
            return (Criteria) this;
        }

        public Criteria andSyxsLike(String value) {
            addCriterion("syxs like", value, "syxs");
            return (Criteria) this;
        }

        public Criteria andSyxsNotLike(String value) {
            addCriterion("syxs not like", value, "syxs");
            return (Criteria) this;
        }

        public Criteria andSyxsIn(List<String> values) {
            addCriterion("syxs in", values, "syxs");
            return (Criteria) this;
        }

        public Criteria andSyxsNotIn(List<String> values) {
            addCriterion("syxs not in", values, "syxs");
            return (Criteria) this;
        }

        public Criteria andSyxsBetween(String value1, String value2) {
            addCriterion("syxs between", value1, value2, "syxs");
            return (Criteria) this;
        }

        public Criteria andSyxsNotBetween(String value1, String value2) {
            addCriterion("syxs not between", value1, value2, "syxs");
            return (Criteria) this;
        }

        public Criteria andJzjsIsNull() {
            addCriterion("jzjs is null");
            return (Criteria) this;
        }

        public Criteria andJzjsIsNotNull() {
            addCriterion("jzjs is not null");
            return (Criteria) this;
        }

        public Criteria andJzjsEqualTo(String value) {
            addCriterion("jzjs =", value, "jzjs");
            return (Criteria) this;
        }

        public Criteria andJzjsNotEqualTo(String value) {
            addCriterion("jzjs <>", value, "jzjs");
            return (Criteria) this;
        }

        public Criteria andJzjsGreaterThan(String value) {
            addCriterion("jzjs >", value, "jzjs");
            return (Criteria) this;
        }

        public Criteria andJzjsGreaterThanOrEqualTo(String value) {
            addCriterion("jzjs >=", value, "jzjs");
            return (Criteria) this;
        }

        public Criteria andJzjsLessThan(String value) {
            addCriterion("jzjs <", value, "jzjs");
            return (Criteria) this;
        }

        public Criteria andJzjsLessThanOrEqualTo(String value) {
            addCriterion("jzjs <=", value, "jzjs");
            return (Criteria) this;
        }

        public Criteria andJzjsLike(String value) {
            addCriterion("jzjs like", value, "jzjs");
            return (Criteria) this;
        }

        public Criteria andJzjsNotLike(String value) {
            addCriterion("jzjs not like", value, "jzjs");
            return (Criteria) this;
        }

        public Criteria andJzjsIn(List<String> values) {
            addCriterion("jzjs in", values, "jzjs");
            return (Criteria) this;
        }

        public Criteria andJzjsNotIn(List<String> values) {
            addCriterion("jzjs not in", values, "jzjs");
            return (Criteria) this;
        }

        public Criteria andJzjsBetween(String value1, String value2) {
            addCriterion("jzjs between", value1, value2, "jzjs");
            return (Criteria) this;
        }

        public Criteria andJzjsNotBetween(String value1, String value2) {
            addCriterion("jzjs not between", value1, value2, "jzjs");
            return (Criteria) this;
        }

        public Criteria andLcjIsNull() {
            addCriterion("lcj is null");
            return (Criteria) this;
        }

        public Criteria andLcjIsNotNull() {
            addCriterion("lcj is not null");
            return (Criteria) this;
        }

        public Criteria andLcjEqualTo(String value) {
            addCriterion("lcj =", value, "lcj");
            return (Criteria) this;
        }

        public Criteria andLcjNotEqualTo(String value) {
            addCriterion("lcj <>", value, "lcj");
            return (Criteria) this;
        }

        public Criteria andLcjGreaterThan(String value) {
            addCriterion("lcj >", value, "lcj");
            return (Criteria) this;
        }

        public Criteria andLcjGreaterThanOrEqualTo(String value) {
            addCriterion("lcj >=", value, "lcj");
            return (Criteria) this;
        }

        public Criteria andLcjLessThan(String value) {
            addCriterion("lcj <", value, "lcj");
            return (Criteria) this;
        }

        public Criteria andLcjLessThanOrEqualTo(String value) {
            addCriterion("lcj <=", value, "lcj");
            return (Criteria) this;
        }

        public Criteria andLcjLike(String value) {
            addCriterion("lcj like", value, "lcj");
            return (Criteria) this;
        }

        public Criteria andLcjNotLike(String value) {
            addCriterion("lcj not like", value, "lcj");
            return (Criteria) this;
        }

        public Criteria andLcjIn(List<String> values) {
            addCriterion("lcj in", values, "lcj");
            return (Criteria) this;
        }

        public Criteria andLcjNotIn(List<String> values) {
            addCriterion("lcj not in", values, "lcj");
            return (Criteria) this;
        }

        public Criteria andLcjBetween(String value1, String value2) {
            addCriterion("lcj between", value1, value2, "lcj");
            return (Criteria) this;
        }

        public Criteria andLcjNotBetween(String value1, String value2) {
            addCriterion("lcj not between", value1, value2, "lcj");
            return (Criteria) this;
        }

        public Criteria andBhIsNull() {
            addCriterion("bh is null");
            return (Criteria) this;
        }

        public Criteria andBhIsNotNull() {
            addCriterion("bh is not null");
            return (Criteria) this;
        }

        public Criteria andBhEqualTo(String value) {
            addCriterion("bh =", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotEqualTo(String value) {
            addCriterion("bh <>", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhGreaterThan(String value) {
            addCriterion("bh >", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhGreaterThanOrEqualTo(String value) {
            addCriterion("bh >=", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLessThan(String value) {
            addCriterion("bh <", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLessThanOrEqualTo(String value) {
            addCriterion("bh <=", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLike(String value) {
            addCriterion("bh like", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotLike(String value) {
            addCriterion("bh not like", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhIn(List<String> values) {
            addCriterion("bh in", values, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotIn(List<String> values) {
            addCriterion("bh not in", values, "bh");
            return (Criteria) this;
        }

        public Criteria andBhBetween(String value1, String value2) {
            addCriterion("bh between", value1, value2, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotBetween(String value1, String value2) {
            addCriterion("bh not between", value1, value2, "bh");
            return (Criteria) this;
        }

        public Criteria andSflcjIsNull() {
            addCriterion("sflcj is null");
            return (Criteria) this;
        }

        public Criteria andSflcjIsNotNull() {
            addCriterion("sflcj is not null");
            return (Criteria) this;
        }

        public Criteria andSflcjEqualTo(String value) {
            addCriterion("sflcj =", value, "sflcj");
            return (Criteria) this;
        }

        public Criteria andSflcjNotEqualTo(String value) {
            addCriterion("sflcj <>", value, "sflcj");
            return (Criteria) this;
        }

        public Criteria andSflcjGreaterThan(String value) {
            addCriterion("sflcj >", value, "sflcj");
            return (Criteria) this;
        }

        public Criteria andSflcjGreaterThanOrEqualTo(String value) {
            addCriterion("sflcj >=", value, "sflcj");
            return (Criteria) this;
        }

        public Criteria andSflcjLessThan(String value) {
            addCriterion("sflcj <", value, "sflcj");
            return (Criteria) this;
        }

        public Criteria andSflcjLessThanOrEqualTo(String value) {
            addCriterion("sflcj <=", value, "sflcj");
            return (Criteria) this;
        }

        public Criteria andSflcjLike(String value) {
            addCriterion("sflcj like", value, "sflcj");
            return (Criteria) this;
        }

        public Criteria andSflcjNotLike(String value) {
            addCriterion("sflcj not like", value, "sflcj");
            return (Criteria) this;
        }

        public Criteria andSflcjIn(List<String> values) {
            addCriterion("sflcj in", values, "sflcj");
            return (Criteria) this;
        }

        public Criteria andSflcjNotIn(List<String> values) {
            addCriterion("sflcj not in", values, "sflcj");
            return (Criteria) this;
        }

        public Criteria andSflcjBetween(String value1, String value2) {
            addCriterion("sflcj between", value1, value2, "sflcj");
            return (Criteria) this;
        }

        public Criteria andSflcjNotBetween(String value1, String value2) {
            addCriterion("sflcj not between", value1, value2, "sflcj");
            return (Criteria) this;
        }

        public Criteria andZdyjsIsNull() {
            addCriterion("zdyjs is null");
            return (Criteria) this;
        }

        public Criteria andZdyjsIsNotNull() {
            addCriterion("zdyjs is not null");
            return (Criteria) this;
        }

        public Criteria andZdyjsEqualTo(String value) {
            addCriterion("zdyjs =", value, "zdyjs");
            return (Criteria) this;
        }

        public Criteria andZdyjsNotEqualTo(String value) {
            addCriterion("zdyjs <>", value, "zdyjs");
            return (Criteria) this;
        }

        public Criteria andZdyjsGreaterThan(String value) {
            addCriterion("zdyjs >", value, "zdyjs");
            return (Criteria) this;
        }

        public Criteria andZdyjsGreaterThanOrEqualTo(String value) {
            addCriterion("zdyjs >=", value, "zdyjs");
            return (Criteria) this;
        }

        public Criteria andZdyjsLessThan(String value) {
            addCriterion("zdyjs <", value, "zdyjs");
            return (Criteria) this;
        }

        public Criteria andZdyjsLessThanOrEqualTo(String value) {
            addCriterion("zdyjs <=", value, "zdyjs");
            return (Criteria) this;
        }

        public Criteria andZdyjsLike(String value) {
            addCriterion("zdyjs like", value, "zdyjs");
            return (Criteria) this;
        }

        public Criteria andZdyjsNotLike(String value) {
            addCriterion("zdyjs not like", value, "zdyjs");
            return (Criteria) this;
        }

        public Criteria andZdyjsIn(List<String> values) {
            addCriterion("zdyjs in", values, "zdyjs");
            return (Criteria) this;
        }

        public Criteria andZdyjsNotIn(List<String> values) {
            addCriterion("zdyjs not in", values, "zdyjs");
            return (Criteria) this;
        }

        public Criteria andZdyjsBetween(String value1, String value2) {
            addCriterion("zdyjs between", value1, value2, "zdyjs");
            return (Criteria) this;
        }

        public Criteria andZdyjsNotBetween(String value1, String value2) {
            addCriterion("zdyjs not between", value1, value2, "zdyjs");
            return (Criteria) this;
        }

        public Criteria andDmtjsIsNull() {
            addCriterion("dmtjs is null");
            return (Criteria) this;
        }

        public Criteria andDmtjsIsNotNull() {
            addCriterion("dmtjs is not null");
            return (Criteria) this;
        }

        public Criteria andDmtjsEqualTo(String value) {
            addCriterion("dmtjs =", value, "dmtjs");
            return (Criteria) this;
        }

        public Criteria andDmtjsNotEqualTo(String value) {
            addCriterion("dmtjs <>", value, "dmtjs");
            return (Criteria) this;
        }

        public Criteria andDmtjsGreaterThan(String value) {
            addCriterion("dmtjs >", value, "dmtjs");
            return (Criteria) this;
        }

        public Criteria andDmtjsGreaterThanOrEqualTo(String value) {
            addCriterion("dmtjs >=", value, "dmtjs");
            return (Criteria) this;
        }

        public Criteria andDmtjsLessThan(String value) {
            addCriterion("dmtjs <", value, "dmtjs");
            return (Criteria) this;
        }

        public Criteria andDmtjsLessThanOrEqualTo(String value) {
            addCriterion("dmtjs <=", value, "dmtjs");
            return (Criteria) this;
        }

        public Criteria andDmtjsLike(String value) {
            addCriterion("dmtjs like", value, "dmtjs");
            return (Criteria) this;
        }

        public Criteria andDmtjsNotLike(String value) {
            addCriterion("dmtjs not like", value, "dmtjs");
            return (Criteria) this;
        }

        public Criteria andDmtjsIn(List<String> values) {
            addCriterion("dmtjs in", values, "dmtjs");
            return (Criteria) this;
        }

        public Criteria andDmtjsNotIn(List<String> values) {
            addCriterion("dmtjs not in", values, "dmtjs");
            return (Criteria) this;
        }

        public Criteria andDmtjsBetween(String value1, String value2) {
            addCriterion("dmtjs between", value1, value2, "dmtjs");
            return (Criteria) this;
        }

        public Criteria andDmtjsNotBetween(String value1, String value2) {
            addCriterion("dmtjs not between", value1, value2, "dmtjs");
            return (Criteria) this;
        }

        public Criteria andTermIsNull() {
            addCriterion("Term is null");
            return (Criteria) this;
        }

        public Criteria andTermIsNotNull() {
            addCriterion("Term is not null");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(String value) {
            addCriterion("Term =", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotEqualTo(String value) {
            addCriterion("Term <>", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThan(String value) {
            addCriterion("Term >", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThanOrEqualTo(String value) {
            addCriterion("Term >=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThan(String value) {
            addCriterion("Term <", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThanOrEqualTo(String value) {
            addCriterion("Term <=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLike(String value) {
            addCriterion("Term like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotLike(String value) {
            addCriterion("Term not like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermIn(List<String> values) {
            addCriterion("Term in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotIn(List<String> values) {
            addCriterion("Term not in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermBetween(String value1, String value2) {
            addCriterion("Term between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotBetween(String value1, String value2) {
            addCriterion("Term not between", value1, value2, "term");
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