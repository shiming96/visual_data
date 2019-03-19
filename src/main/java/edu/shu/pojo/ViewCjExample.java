package edu.shu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ViewCjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewCjExample() {
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

        public Criteria andTermcodeIsNull() {
            addCriterion("termcode is null");
            return (Criteria) this;
        }

        public Criteria andTermcodeIsNotNull() {
            addCriterion("termcode is not null");
            return (Criteria) this;
        }

        public Criteria andTermcodeEqualTo(Integer value) {
            addCriterion("termcode =", value, "termcode");
            return (Criteria) this;
        }

        public Criteria andTermcodeNotEqualTo(Integer value) {
            addCriterion("termcode <>", value, "termcode");
            return (Criteria) this;
        }

        public Criteria andTermcodeGreaterThan(Integer value) {
            addCriterion("termcode >", value, "termcode");
            return (Criteria) this;
        }

        public Criteria andTermcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("termcode >=", value, "termcode");
            return (Criteria) this;
        }

        public Criteria andTermcodeLessThan(Integer value) {
            addCriterion("termcode <", value, "termcode");
            return (Criteria) this;
        }

        public Criteria andTermcodeLessThanOrEqualTo(Integer value) {
            addCriterion("termcode <=", value, "termcode");
            return (Criteria) this;
        }

        public Criteria andTermcodeIn(List<Integer> values) {
            addCriterion("termcode in", values, "termcode");
            return (Criteria) this;
        }

        public Criteria andTermcodeNotIn(List<Integer> values) {
            addCriterion("termcode not in", values, "termcode");
            return (Criteria) this;
        }

        public Criteria andTermcodeBetween(Integer value1, Integer value2) {
            addCriterion("termcode between", value1, value2, "termcode");
            return (Criteria) this;
        }

        public Criteria andTermcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("termcode not between", value1, value2, "termcode");
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

        public Criteria andCjIsNull() {
            addCriterion("cj is null");
            return (Criteria) this;
        }

        public Criteria andCjIsNotNull() {
            addCriterion("cj is not null");
            return (Criteria) this;
        }

        public Criteria andCjEqualTo(BigDecimal value) {
            addCriterion("cj =", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjNotEqualTo(BigDecimal value) {
            addCriterion("cj <>", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjGreaterThan(BigDecimal value) {
            addCriterion("cj >", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cj >=", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjLessThan(BigDecimal value) {
            addCriterion("cj <", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cj <=", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjIn(List<BigDecimal> values) {
            addCriterion("cj in", values, "cj");
            return (Criteria) this;
        }

        public Criteria andCjNotIn(List<BigDecimal> values) {
            addCriterion("cj not in", values, "cj");
            return (Criteria) this;
        }

        public Criteria andCjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cj between", value1, value2, "cj");
            return (Criteria) this;
        }

        public Criteria andCjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cj not between", value1, value2, "cj");
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

        public Criteria andCjsxmIsNull() {
            addCriterion("cjsxm is null");
            return (Criteria) this;
        }

        public Criteria andCjsxmIsNotNull() {
            addCriterion("cjsxm is not null");
            return (Criteria) this;
        }

        public Criteria andCjsxmEqualTo(String value) {
            addCriterion("cjsxm =", value, "cjsxm");
            return (Criteria) this;
        }

        public Criteria andCjsxmNotEqualTo(String value) {
            addCriterion("cjsxm <>", value, "cjsxm");
            return (Criteria) this;
        }

        public Criteria andCjsxmGreaterThan(String value) {
            addCriterion("cjsxm >", value, "cjsxm");
            return (Criteria) this;
        }

        public Criteria andCjsxmGreaterThanOrEqualTo(String value) {
            addCriterion("cjsxm >=", value, "cjsxm");
            return (Criteria) this;
        }

        public Criteria andCjsxmLessThan(String value) {
            addCriterion("cjsxm <", value, "cjsxm");
            return (Criteria) this;
        }

        public Criteria andCjsxmLessThanOrEqualTo(String value) {
            addCriterion("cjsxm <=", value, "cjsxm");
            return (Criteria) this;
        }

        public Criteria andCjsxmLike(String value) {
            addCriterion("cjsxm like", value, "cjsxm");
            return (Criteria) this;
        }

        public Criteria andCjsxmNotLike(String value) {
            addCriterion("cjsxm not like", value, "cjsxm");
            return (Criteria) this;
        }

        public Criteria andCjsxmIn(List<String> values) {
            addCriterion("cjsxm in", values, "cjsxm");
            return (Criteria) this;
        }

        public Criteria andCjsxmNotIn(List<String> values) {
            addCriterion("cjsxm not in", values, "cjsxm");
            return (Criteria) this;
        }

        public Criteria andCjsxmBetween(String value1, String value2) {
            addCriterion("cjsxm between", value1, value2, "cjsxm");
            return (Criteria) this;
        }

        public Criteria andCjsxmNotBetween(String value1, String value2) {
            addCriterion("cjsxm not between", value1, value2, "cjsxm");
            return (Criteria) this;
        }

        public Criteria andCjsxIsNull() {
            addCriterion("cjsx is null");
            return (Criteria) this;
        }

        public Criteria andCjsxIsNotNull() {
            addCriterion("cjsx is not null");
            return (Criteria) this;
        }

        public Criteria andCjsxEqualTo(String value) {
            addCriterion("cjsx =", value, "cjsx");
            return (Criteria) this;
        }

        public Criteria andCjsxNotEqualTo(String value) {
            addCriterion("cjsx <>", value, "cjsx");
            return (Criteria) this;
        }

        public Criteria andCjsxGreaterThan(String value) {
            addCriterion("cjsx >", value, "cjsx");
            return (Criteria) this;
        }

        public Criteria andCjsxGreaterThanOrEqualTo(String value) {
            addCriterion("cjsx >=", value, "cjsx");
            return (Criteria) this;
        }

        public Criteria andCjsxLessThan(String value) {
            addCriterion("cjsx <", value, "cjsx");
            return (Criteria) this;
        }

        public Criteria andCjsxLessThanOrEqualTo(String value) {
            addCriterion("cjsx <=", value, "cjsx");
            return (Criteria) this;
        }

        public Criteria andCjsxLike(String value) {
            addCriterion("cjsx like", value, "cjsx");
            return (Criteria) this;
        }

        public Criteria andCjsxNotLike(String value) {
            addCriterion("cjsx not like", value, "cjsx");
            return (Criteria) this;
        }

        public Criteria andCjsxIn(List<String> values) {
            addCriterion("cjsx in", values, "cjsx");
            return (Criteria) this;
        }

        public Criteria andCjsxNotIn(List<String> values) {
            addCriterion("cjsx not in", values, "cjsx");
            return (Criteria) this;
        }

        public Criteria andCjsxBetween(String value1, String value2) {
            addCriterion("cjsx between", value1, value2, "cjsx");
            return (Criteria) this;
        }

        public Criteria andCjsxNotBetween(String value1, String value2) {
            addCriterion("cjsx not between", value1, value2, "cjsx");
            return (Criteria) this;
        }

        public Criteria andKclbmIsNull() {
            addCriterion("kclbm is null");
            return (Criteria) this;
        }

        public Criteria andKclbmIsNotNull() {
            addCriterion("kclbm is not null");
            return (Criteria) this;
        }

        public Criteria andKclbmEqualTo(String value) {
            addCriterion("kclbm =", value, "kclbm");
            return (Criteria) this;
        }

        public Criteria andKclbmNotEqualTo(String value) {
            addCriterion("kclbm <>", value, "kclbm");
            return (Criteria) this;
        }

        public Criteria andKclbmGreaterThan(String value) {
            addCriterion("kclbm >", value, "kclbm");
            return (Criteria) this;
        }

        public Criteria andKclbmGreaterThanOrEqualTo(String value) {
            addCriterion("kclbm >=", value, "kclbm");
            return (Criteria) this;
        }

        public Criteria andKclbmLessThan(String value) {
            addCriterion("kclbm <", value, "kclbm");
            return (Criteria) this;
        }

        public Criteria andKclbmLessThanOrEqualTo(String value) {
            addCriterion("kclbm <=", value, "kclbm");
            return (Criteria) this;
        }

        public Criteria andKclbmLike(String value) {
            addCriterion("kclbm like", value, "kclbm");
            return (Criteria) this;
        }

        public Criteria andKclbmNotLike(String value) {
            addCriterion("kclbm not like", value, "kclbm");
            return (Criteria) this;
        }

        public Criteria andKclbmIn(List<String> values) {
            addCriterion("kclbm in", values, "kclbm");
            return (Criteria) this;
        }

        public Criteria andKclbmNotIn(List<String> values) {
            addCriterion("kclbm not in", values, "kclbm");
            return (Criteria) this;
        }

        public Criteria andKclbmBetween(String value1, String value2) {
            addCriterion("kclbm between", value1, value2, "kclbm");
            return (Criteria) this;
        }

        public Criteria andKclbmNotBetween(String value1, String value2) {
            addCriterion("kclbm not between", value1, value2, "kclbm");
            return (Criteria) this;
        }

        public Criteria andKclbIsNull() {
            addCriterion("kclb is null");
            return (Criteria) this;
        }

        public Criteria andKclbIsNotNull() {
            addCriterion("kclb is not null");
            return (Criteria) this;
        }

        public Criteria andKclbEqualTo(String value) {
            addCriterion("kclb =", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbNotEqualTo(String value) {
            addCriterion("kclb <>", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbGreaterThan(String value) {
            addCriterion("kclb >", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbGreaterThanOrEqualTo(String value) {
            addCriterion("kclb >=", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbLessThan(String value) {
            addCriterion("kclb <", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbLessThanOrEqualTo(String value) {
            addCriterion("kclb <=", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbLike(String value) {
            addCriterion("kclb like", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbNotLike(String value) {
            addCriterion("kclb not like", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbIn(List<String> values) {
            addCriterion("kclb in", values, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbNotIn(List<String> values) {
            addCriterion("kclb not in", values, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbBetween(String value1, String value2) {
            addCriterion("kclb between", value1, value2, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbNotBetween(String value1, String value2) {
            addCriterion("kclb not between", value1, value2, "kclb");
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

        public Criteria andBfzIsNull() {
            addCriterion("bfz is null");
            return (Criteria) this;
        }

        public Criteria andBfzIsNotNull() {
            addCriterion("bfz is not null");
            return (Criteria) this;
        }

        public Criteria andBfzEqualTo(Integer value) {
            addCriterion("bfz =", value, "bfz");
            return (Criteria) this;
        }

        public Criteria andBfzNotEqualTo(Integer value) {
            addCriterion("bfz <>", value, "bfz");
            return (Criteria) this;
        }

        public Criteria andBfzGreaterThan(Integer value) {
            addCriterion("bfz >", value, "bfz");
            return (Criteria) this;
        }

        public Criteria andBfzGreaterThanOrEqualTo(Integer value) {
            addCriterion("bfz >=", value, "bfz");
            return (Criteria) this;
        }

        public Criteria andBfzLessThan(Integer value) {
            addCriterion("bfz <", value, "bfz");
            return (Criteria) this;
        }

        public Criteria andBfzLessThanOrEqualTo(Integer value) {
            addCriterion("bfz <=", value, "bfz");
            return (Criteria) this;
        }

        public Criteria andBfzIn(List<Integer> values) {
            addCriterion("bfz in", values, "bfz");
            return (Criteria) this;
        }

        public Criteria andBfzNotIn(List<Integer> values) {
            addCriterion("bfz not in", values, "bfz");
            return (Criteria) this;
        }

        public Criteria andBfzBetween(Integer value1, Integer value2) {
            addCriterion("bfz between", value1, value2, "bfz");
            return (Criteria) this;
        }

        public Criteria andBfzNotBetween(Integer value1, Integer value2) {
            addCriterion("bfz not between", value1, value2, "bfz");
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