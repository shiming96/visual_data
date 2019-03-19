package edu.shu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ViewPyjhExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewPyjhExample() {
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

        public Criteria andXhIsNull() {
            addCriterion("XH is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("XH is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(String value) {
            addCriterion("XH =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(String value) {
            addCriterion("XH <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(String value) {
            addCriterion("XH >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(String value) {
            addCriterion("XH >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(String value) {
            addCriterion("XH <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(String value) {
            addCriterion("XH <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLike(String value) {
            addCriterion("XH like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotLike(String value) {
            addCriterion("XH not like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<String> values) {
            addCriterion("XH in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<String> values) {
            addCriterion("XH not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(String value1, String value2) {
            addCriterion("XH between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(String value1, String value2) {
            addCriterion("XH not between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andKcbhIsNull() {
            addCriterion("KCBH is null");
            return (Criteria) this;
        }

        public Criteria andKcbhIsNotNull() {
            addCriterion("KCBH is not null");
            return (Criteria) this;
        }

        public Criteria andKcbhEqualTo(String value) {
            addCriterion("KCBH =", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhNotEqualTo(String value) {
            addCriterion("KCBH <>", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhGreaterThan(String value) {
            addCriterion("KCBH >", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhGreaterThanOrEqualTo(String value) {
            addCriterion("KCBH >=", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhLessThan(String value) {
            addCriterion("KCBH <", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhLessThanOrEqualTo(String value) {
            addCriterion("KCBH <=", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhLike(String value) {
            addCriterion("KCBH like", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhNotLike(String value) {
            addCriterion("KCBH not like", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhIn(List<String> values) {
            addCriterion("KCBH in", values, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhNotIn(List<String> values) {
            addCriterion("KCBH not in", values, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhBetween(String value1, String value2) {
            addCriterion("KCBH between", value1, value2, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhNotBetween(String value1, String value2) {
            addCriterion("KCBH not between", value1, value2, "kcbh");
            return (Criteria) this;
        }

        public Criteria andXklxIsNull() {
            addCriterion("XKLX is null");
            return (Criteria) this;
        }

        public Criteria andXklxIsNotNull() {
            addCriterion("XKLX is not null");
            return (Criteria) this;
        }

        public Criteria andXklxEqualTo(String value) {
            addCriterion("XKLX =", value, "xklx");
            return (Criteria) this;
        }

        public Criteria andXklxNotEqualTo(String value) {
            addCriterion("XKLX <>", value, "xklx");
            return (Criteria) this;
        }

        public Criteria andXklxGreaterThan(String value) {
            addCriterion("XKLX >", value, "xklx");
            return (Criteria) this;
        }

        public Criteria andXklxGreaterThanOrEqualTo(String value) {
            addCriterion("XKLX >=", value, "xklx");
            return (Criteria) this;
        }

        public Criteria andXklxLessThan(String value) {
            addCriterion("XKLX <", value, "xklx");
            return (Criteria) this;
        }

        public Criteria andXklxLessThanOrEqualTo(String value) {
            addCriterion("XKLX <=", value, "xklx");
            return (Criteria) this;
        }

        public Criteria andXklxLike(String value) {
            addCriterion("XKLX like", value, "xklx");
            return (Criteria) this;
        }

        public Criteria andXklxNotLike(String value) {
            addCriterion("XKLX not like", value, "xklx");
            return (Criteria) this;
        }

        public Criteria andXklxIn(List<String> values) {
            addCriterion("XKLX in", values, "xklx");
            return (Criteria) this;
        }

        public Criteria andXklxNotIn(List<String> values) {
            addCriterion("XKLX not in", values, "xklx");
            return (Criteria) this;
        }

        public Criteria andXklxBetween(String value1, String value2) {
            addCriterion("XKLX between", value1, value2, "xklx");
            return (Criteria) this;
        }

        public Criteria andXklxNotBetween(String value1, String value2) {
            addCriterion("XKLX not between", value1, value2, "xklx");
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

        public Criteria andXxxqIsNull() {
            addCriterion("XXXQ is null");
            return (Criteria) this;
        }

        public Criteria andXxxqIsNotNull() {
            addCriterion("XXXQ is not null");
            return (Criteria) this;
        }

        public Criteria andXxxqEqualTo(Integer value) {
            addCriterion("XXXQ =", value, "xxxq");
            return (Criteria) this;
        }

        public Criteria andXxxqNotEqualTo(Integer value) {
            addCriterion("XXXQ <>", value, "xxxq");
            return (Criteria) this;
        }

        public Criteria andXxxqGreaterThan(Integer value) {
            addCriterion("XXXQ >", value, "xxxq");
            return (Criteria) this;
        }

        public Criteria andXxxqGreaterThanOrEqualTo(Integer value) {
            addCriterion("XXXQ >=", value, "xxxq");
            return (Criteria) this;
        }

        public Criteria andXxxqLessThan(Integer value) {
            addCriterion("XXXQ <", value, "xxxq");
            return (Criteria) this;
        }

        public Criteria andXxxqLessThanOrEqualTo(Integer value) {
            addCriterion("XXXQ <=", value, "xxxq");
            return (Criteria) this;
        }

        public Criteria andXxxqIn(List<Integer> values) {
            addCriterion("XXXQ in", values, "xxxq");
            return (Criteria) this;
        }

        public Criteria andXxxqNotIn(List<Integer> values) {
            addCriterion("XXXQ not in", values, "xxxq");
            return (Criteria) this;
        }

        public Criteria andXxxqBetween(Integer value1, Integer value2) {
            addCriterion("XXXQ between", value1, value2, "xxxq");
            return (Criteria) this;
        }

        public Criteria andXxxqNotBetween(Integer value1, Integer value2) {
            addCriterion("XXXQ not between", value1, value2, "xxxq");
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