package edu.shu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ViewPyfaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewPyfaExample() {
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

        public Criteria andXsflIsNull() {
            addCriterion("xsfl is null");
            return (Criteria) this;
        }

        public Criteria andXsflIsNotNull() {
            addCriterion("xsfl is not null");
            return (Criteria) this;
        }

        public Criteria andXsflEqualTo(String value) {
            addCriterion("xsfl =", value, "xsfl");
            return (Criteria) this;
        }

        public Criteria andXsflNotEqualTo(String value) {
            addCriterion("xsfl <>", value, "xsfl");
            return (Criteria) this;
        }

        public Criteria andXsflGreaterThan(String value) {
            addCriterion("xsfl >", value, "xsfl");
            return (Criteria) this;
        }

        public Criteria andXsflGreaterThanOrEqualTo(String value) {
            addCriterion("xsfl >=", value, "xsfl");
            return (Criteria) this;
        }

        public Criteria andXsflLessThan(String value) {
            addCriterion("xsfl <", value, "xsfl");
            return (Criteria) this;
        }

        public Criteria andXsflLessThanOrEqualTo(String value) {
            addCriterion("xsfl <=", value, "xsfl");
            return (Criteria) this;
        }

        public Criteria andXsflLike(String value) {
            addCriterion("xsfl like", value, "xsfl");
            return (Criteria) this;
        }

        public Criteria andXsflNotLike(String value) {
            addCriterion("xsfl not like", value, "xsfl");
            return (Criteria) this;
        }

        public Criteria andXsflIn(List<String> values) {
            addCriterion("xsfl in", values, "xsfl");
            return (Criteria) this;
        }

        public Criteria andXsflNotIn(List<String> values) {
            addCriterion("xsfl not in", values, "xsfl");
            return (Criteria) this;
        }

        public Criteria andXsflBetween(String value1, String value2) {
            addCriterion("xsfl between", value1, value2, "xsfl");
            return (Criteria) this;
        }

        public Criteria andXsflNotBetween(String value1, String value2) {
            addCriterion("xsfl not between", value1, value2, "xsfl");
            return (Criteria) this;
        }

        public Criteria andZydmIsNull() {
            addCriterion("ZYDM is null");
            return (Criteria) this;
        }

        public Criteria andZydmIsNotNull() {
            addCriterion("ZYDM is not null");
            return (Criteria) this;
        }

        public Criteria andZydmEqualTo(String value) {
            addCriterion("ZYDM =", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmNotEqualTo(String value) {
            addCriterion("ZYDM <>", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmGreaterThan(String value) {
            addCriterion("ZYDM >", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmGreaterThanOrEqualTo(String value) {
            addCriterion("ZYDM >=", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmLessThan(String value) {
            addCriterion("ZYDM <", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmLessThanOrEqualTo(String value) {
            addCriterion("ZYDM <=", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmLike(String value) {
            addCriterion("ZYDM like", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmNotLike(String value) {
            addCriterion("ZYDM not like", value, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmIn(List<String> values) {
            addCriterion("ZYDM in", values, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmNotIn(List<String> values) {
            addCriterion("ZYDM not in", values, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmBetween(String value1, String value2) {
            addCriterion("ZYDM between", value1, value2, "zydm");
            return (Criteria) this;
        }

        public Criteria andZydmNotBetween(String value1, String value2) {
            addCriterion("ZYDM not between", value1, value2, "zydm");
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

        public Criteria andKclxIsNull() {
            addCriterion("kclx is null");
            return (Criteria) this;
        }

        public Criteria andKclxIsNotNull() {
            addCriterion("kclx is not null");
            return (Criteria) this;
        }

        public Criteria andKclxEqualTo(String value) {
            addCriterion("kclx =", value, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxNotEqualTo(String value) {
            addCriterion("kclx <>", value, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxGreaterThan(String value) {
            addCriterion("kclx >", value, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxGreaterThanOrEqualTo(String value) {
            addCriterion("kclx >=", value, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxLessThan(String value) {
            addCriterion("kclx <", value, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxLessThanOrEqualTo(String value) {
            addCriterion("kclx <=", value, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxLike(String value) {
            addCriterion("kclx like", value, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxNotLike(String value) {
            addCriterion("kclx not like", value, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxIn(List<String> values) {
            addCriterion("kclx in", values, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxNotIn(List<String> values) {
            addCriterion("kclx not in", values, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxBetween(String value1, String value2) {
            addCriterion("kclx between", value1, value2, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxNotBetween(String value1, String value2) {
            addCriterion("kclx not between", value1, value2, "kclx");
            return (Criteria) this;
        }

        public Criteria andKcxsIsNull() {
            addCriterion("KCXS is null");
            return (Criteria) this;
        }

        public Criteria andKcxsIsNotNull() {
            addCriterion("KCXS is not null");
            return (Criteria) this;
        }

        public Criteria andKcxsEqualTo(Integer value) {
            addCriterion("KCXS =", value, "kcxs");
            return (Criteria) this;
        }

        public Criteria andKcxsNotEqualTo(Integer value) {
            addCriterion("KCXS <>", value, "kcxs");
            return (Criteria) this;
        }

        public Criteria andKcxsGreaterThan(Integer value) {
            addCriterion("KCXS >", value, "kcxs");
            return (Criteria) this;
        }

        public Criteria andKcxsGreaterThanOrEqualTo(Integer value) {
            addCriterion("KCXS >=", value, "kcxs");
            return (Criteria) this;
        }

        public Criteria andKcxsLessThan(Integer value) {
            addCriterion("KCXS <", value, "kcxs");
            return (Criteria) this;
        }

        public Criteria andKcxsLessThanOrEqualTo(Integer value) {
            addCriterion("KCXS <=", value, "kcxs");
            return (Criteria) this;
        }

        public Criteria andKcxsIn(List<Integer> values) {
            addCriterion("KCXS in", values, "kcxs");
            return (Criteria) this;
        }

        public Criteria andKcxsNotIn(List<Integer> values) {
            addCriterion("KCXS not in", values, "kcxs");
            return (Criteria) this;
        }

        public Criteria andKcxsBetween(Integer value1, Integer value2) {
            addCriterion("KCXS between", value1, value2, "kcxs");
            return (Criteria) this;
        }

        public Criteria andKcxsNotBetween(Integer value1, Integer value2) {
            addCriterion("KCXS not between", value1, value2, "kcxs");
            return (Criteria) this;
        }

        public Criteria andKcxfIsNull() {
            addCriterion("KCXF is null");
            return (Criteria) this;
        }

        public Criteria andKcxfIsNotNull() {
            addCriterion("KCXF is not null");
            return (Criteria) this;
        }

        public Criteria andKcxfEqualTo(BigDecimal value) {
            addCriterion("KCXF =", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfNotEqualTo(BigDecimal value) {
            addCriterion("KCXF <>", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfGreaterThan(BigDecimal value) {
            addCriterion("KCXF >", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KCXF >=", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfLessThan(BigDecimal value) {
            addCriterion("KCXF <", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KCXF <=", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfIn(List<BigDecimal> values) {
            addCriterion("KCXF in", values, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfNotIn(List<BigDecimal> values) {
            addCriterion("KCXF not in", values, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KCXF between", value1, value2, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KCXF not between", value1, value2, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKksjIsNull() {
            addCriterion("KKSJ is null");
            return (Criteria) this;
        }

        public Criteria andKksjIsNotNull() {
            addCriterion("KKSJ is not null");
            return (Criteria) this;
        }

        public Criteria andKksjEqualTo(String value) {
            addCriterion("KKSJ =", value, "kksj");
            return (Criteria) this;
        }

        public Criteria andKksjNotEqualTo(String value) {
            addCriterion("KKSJ <>", value, "kksj");
            return (Criteria) this;
        }

        public Criteria andKksjGreaterThan(String value) {
            addCriterion("KKSJ >", value, "kksj");
            return (Criteria) this;
        }

        public Criteria andKksjGreaterThanOrEqualTo(String value) {
            addCriterion("KKSJ >=", value, "kksj");
            return (Criteria) this;
        }

        public Criteria andKksjLessThan(String value) {
            addCriterion("KKSJ <", value, "kksj");
            return (Criteria) this;
        }

        public Criteria andKksjLessThanOrEqualTo(String value) {
            addCriterion("KKSJ <=", value, "kksj");
            return (Criteria) this;
        }

        public Criteria andKksjLike(String value) {
            addCriterion("KKSJ like", value, "kksj");
            return (Criteria) this;
        }

        public Criteria andKksjNotLike(String value) {
            addCriterion("KKSJ not like", value, "kksj");
            return (Criteria) this;
        }

        public Criteria andKksjIn(List<String> values) {
            addCriterion("KKSJ in", values, "kksj");
            return (Criteria) this;
        }

        public Criteria andKksjNotIn(List<String> values) {
            addCriterion("KKSJ not in", values, "kksj");
            return (Criteria) this;
        }

        public Criteria andKksjBetween(String value1, String value2) {
            addCriterion("KKSJ between", value1, value2, "kksj");
            return (Criteria) this;
        }

        public Criteria andKksjNotBetween(String value1, String value2) {
            addCriterion("KKSJ not between", value1, value2, "kksj");
            return (Criteria) this;
        }

        public Criteria andKkfsIsNull() {
            addCriterion("KKFS is null");
            return (Criteria) this;
        }

        public Criteria andKkfsIsNotNull() {
            addCriterion("KKFS is not null");
            return (Criteria) this;
        }

        public Criteria andKkfsEqualTo(String value) {
            addCriterion("KKFS =", value, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsNotEqualTo(String value) {
            addCriterion("KKFS <>", value, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsGreaterThan(String value) {
            addCriterion("KKFS >", value, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsGreaterThanOrEqualTo(String value) {
            addCriterion("KKFS >=", value, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsLessThan(String value) {
            addCriterion("KKFS <", value, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsLessThanOrEqualTo(String value) {
            addCriterion("KKFS <=", value, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsLike(String value) {
            addCriterion("KKFS like", value, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsNotLike(String value) {
            addCriterion("KKFS not like", value, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsIn(List<String> values) {
            addCriterion("KKFS in", values, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsNotIn(List<String> values) {
            addCriterion("KKFS not in", values, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsBetween(String value1, String value2) {
            addCriterion("KKFS between", value1, value2, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKkfsNotBetween(String value1, String value2) {
            addCriterion("KKFS not between", value1, value2, "kkfs");
            return (Criteria) this;
        }

        public Criteria andKsfsIsNull() {
            addCriterion("KSFS is null");
            return (Criteria) this;
        }

        public Criteria andKsfsIsNotNull() {
            addCriterion("KSFS is not null");
            return (Criteria) this;
        }

        public Criteria andKsfsEqualTo(String value) {
            addCriterion("KSFS =", value, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsNotEqualTo(String value) {
            addCriterion("KSFS <>", value, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsGreaterThan(String value) {
            addCriterion("KSFS >", value, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsGreaterThanOrEqualTo(String value) {
            addCriterion("KSFS >=", value, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsLessThan(String value) {
            addCriterion("KSFS <", value, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsLessThanOrEqualTo(String value) {
            addCriterion("KSFS <=", value, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsLike(String value) {
            addCriterion("KSFS like", value, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsNotLike(String value) {
            addCriterion("KSFS not like", value, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsIn(List<String> values) {
            addCriterion("KSFS in", values, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsNotIn(List<String> values) {
            addCriterion("KSFS not in", values, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsBetween(String value1, String value2) {
            addCriterion("KSFS between", value1, value2, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsNotBetween(String value1, String value2) {
            addCriterion("KSFS not between", value1, value2, "ksfs");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andNdIsNull() {
            addCriterion("nd is null");
            return (Criteria) this;
        }

        public Criteria andNdIsNotNull() {
            addCriterion("nd is not null");
            return (Criteria) this;
        }

        public Criteria andNdEqualTo(String value) {
            addCriterion("nd =", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdNotEqualTo(String value) {
            addCriterion("nd <>", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdGreaterThan(String value) {
            addCriterion("nd >", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdGreaterThanOrEqualTo(String value) {
            addCriterion("nd >=", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdLessThan(String value) {
            addCriterion("nd <", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdLessThanOrEqualTo(String value) {
            addCriterion("nd <=", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdLike(String value) {
            addCriterion("nd like", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdNotLike(String value) {
            addCriterion("nd not like", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdIn(List<String> values) {
            addCriterion("nd in", values, "nd");
            return (Criteria) this;
        }

        public Criteria andNdNotIn(List<String> values) {
            addCriterion("nd not in", values, "nd");
            return (Criteria) this;
        }

        public Criteria andNdBetween(String value1, String value2) {
            addCriterion("nd between", value1, value2, "nd");
            return (Criteria) this;
        }

        public Criteria andNdNotBetween(String value1, String value2) {
            addCriterion("nd not between", value1, value2, "nd");
            return (Criteria) this;
        }

        public Criteria andXwkIsNull() {
            addCriterion("xwk is null");
            return (Criteria) this;
        }

        public Criteria andXwkIsNotNull() {
            addCriterion("xwk is not null");
            return (Criteria) this;
        }

        public Criteria andXwkEqualTo(String value) {
            addCriterion("xwk =", value, "xwk");
            return (Criteria) this;
        }

        public Criteria andXwkNotEqualTo(String value) {
            addCriterion("xwk <>", value, "xwk");
            return (Criteria) this;
        }

        public Criteria andXwkGreaterThan(String value) {
            addCriterion("xwk >", value, "xwk");
            return (Criteria) this;
        }

        public Criteria andXwkGreaterThanOrEqualTo(String value) {
            addCriterion("xwk >=", value, "xwk");
            return (Criteria) this;
        }

        public Criteria andXwkLessThan(String value) {
            addCriterion("xwk <", value, "xwk");
            return (Criteria) this;
        }

        public Criteria andXwkLessThanOrEqualTo(String value) {
            addCriterion("xwk <=", value, "xwk");
            return (Criteria) this;
        }

        public Criteria andXwkLike(String value) {
            addCriterion("xwk like", value, "xwk");
            return (Criteria) this;
        }

        public Criteria andXwkNotLike(String value) {
            addCriterion("xwk not like", value, "xwk");
            return (Criteria) this;
        }

        public Criteria andXwkIn(List<String> values) {
            addCriterion("xwk in", values, "xwk");
            return (Criteria) this;
        }

        public Criteria andXwkNotIn(List<String> values) {
            addCriterion("xwk not in", values, "xwk");
            return (Criteria) this;
        }

        public Criteria andXwkBetween(String value1, String value2) {
            addCriterion("xwk between", value1, value2, "xwk");
            return (Criteria) this;
        }

        public Criteria andXwkNotBetween(String value1, String value2) {
            addCriterion("xwk not between", value1, value2, "xwk");
            return (Criteria) this;
        }

        public Criteria andYxshIsNull() {
            addCriterion("yxsh is null");
            return (Criteria) this;
        }

        public Criteria andYxshIsNotNull() {
            addCriterion("yxsh is not null");
            return (Criteria) this;
        }

        public Criteria andYxshEqualTo(String value) {
            addCriterion("yxsh =", value, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshNotEqualTo(String value) {
            addCriterion("yxsh <>", value, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshGreaterThan(String value) {
            addCriterion("yxsh >", value, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshGreaterThanOrEqualTo(String value) {
            addCriterion("yxsh >=", value, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshLessThan(String value) {
            addCriterion("yxsh <", value, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshLessThanOrEqualTo(String value) {
            addCriterion("yxsh <=", value, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshLike(String value) {
            addCriterion("yxsh like", value, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshNotLike(String value) {
            addCriterion("yxsh not like", value, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshIn(List<String> values) {
            addCriterion("yxsh in", values, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshNotIn(List<String> values) {
            addCriterion("yxsh not in", values, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshBetween(String value1, String value2) {
            addCriterion("yxsh between", value1, value2, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshNotBetween(String value1, String value2) {
            addCriterion("yxsh not between", value1, value2, "yxsh");
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