package edu.shu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViewXjydExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewXjydExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria and学号IsNull() {
            addCriterion("学号 is null");
            return (Criteria) this;
        }

        public Criteria and学号IsNotNull() {
            addCriterion("学号 is not null");
            return (Criteria) this;
        }

        public Criteria and学号EqualTo(String value) {
            addCriterion("学号 =", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号NotEqualTo(String value) {
            addCriterion("学号 <>", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号GreaterThan(String value) {
            addCriterion("学号 >", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号GreaterThanOrEqualTo(String value) {
            addCriterion("学号 >=", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号LessThan(String value) {
            addCriterion("学号 <", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号LessThanOrEqualTo(String value) {
            addCriterion("学号 <=", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号Like(String value) {
            addCriterion("学号 like", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号NotLike(String value) {
            addCriterion("学号 not like", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号In(List<String> values) {
            addCriterion("学号 in", values, "学号");
            return (Criteria) this;
        }

        public Criteria and学号NotIn(List<String> values) {
            addCriterion("学号 not in", values, "学号");
            return (Criteria) this;
        }

        public Criteria and学号Between(String value1, String value2) {
            addCriterion("学号 between", value1, value2, "学号");
            return (Criteria) this;
        }

        public Criteria and学号NotBetween(String value1, String value2) {
            addCriterion("学号 not between", value1, value2, "学号");
            return (Criteria) this;
        }

        public Criteria and学籍异动码IsNull() {
            addCriterion("学籍异动码 is null");
            return (Criteria) this;
        }

        public Criteria and学籍异动码IsNotNull() {
            addCriterion("学籍异动码 is not null");
            return (Criteria) this;
        }

        public Criteria and学籍异动码EqualTo(String value) {
            addCriterion("学籍异动码 =", value, "学籍异动码");
            return (Criteria) this;
        }

        public Criteria and学籍异动码NotEqualTo(String value) {
            addCriterion("学籍异动码 <>", value, "学籍异动码");
            return (Criteria) this;
        }

        public Criteria and学籍异动码GreaterThan(String value) {
            addCriterion("学籍异动码 >", value, "学籍异动码");
            return (Criteria) this;
        }

        public Criteria and学籍异动码GreaterThanOrEqualTo(String value) {
            addCriterion("学籍异动码 >=", value, "学籍异动码");
            return (Criteria) this;
        }

        public Criteria and学籍异动码LessThan(String value) {
            addCriterion("学籍异动码 <", value, "学籍异动码");
            return (Criteria) this;
        }

        public Criteria and学籍异动码LessThanOrEqualTo(String value) {
            addCriterion("学籍异动码 <=", value, "学籍异动码");
            return (Criteria) this;
        }

        public Criteria and学籍异动码Like(String value) {
            addCriterion("学籍异动码 like", value, "学籍异动码");
            return (Criteria) this;
        }

        public Criteria and学籍异动码NotLike(String value) {
            addCriterion("学籍异动码 not like", value, "学籍异动码");
            return (Criteria) this;
        }

        public Criteria and学籍异动码In(List<String> values) {
            addCriterion("学籍异动码 in", values, "学籍异动码");
            return (Criteria) this;
        }

        public Criteria and学籍异动码NotIn(List<String> values) {
            addCriterion("学籍异动码 not in", values, "学籍异动码");
            return (Criteria) this;
        }

        public Criteria and学籍异动码Between(String value1, String value2) {
            addCriterion("学籍异动码 between", value1, value2, "学籍异动码");
            return (Criteria) this;
        }

        public Criteria and学籍异动码NotBetween(String value1, String value2) {
            addCriterion("学籍异动码 not between", value1, value2, "学籍异动码");
            return (Criteria) this;
        }

        public Criteria and学籍异动日IsNull() {
            addCriterion("学籍异动日 is null");
            return (Criteria) this;
        }

        public Criteria and学籍异动日IsNotNull() {
            addCriterion("学籍异动日 is not null");
            return (Criteria) this;
        }

        public Criteria and学籍异动日EqualTo(String value) {
            addCriterion("学籍异动日 =", value, "学籍异动日");
            return (Criteria) this;
        }

        public Criteria and学籍异动日NotEqualTo(String value) {
            addCriterion("学籍异动日 <>", value, "学籍异动日");
            return (Criteria) this;
        }

        public Criteria and学籍异动日GreaterThan(String value) {
            addCriterion("学籍异动日 >", value, "学籍异动日");
            return (Criteria) this;
        }

        public Criteria and学籍异动日GreaterThanOrEqualTo(String value) {
            addCriterion("学籍异动日 >=", value, "学籍异动日");
            return (Criteria) this;
        }

        public Criteria and学籍异动日LessThan(String value) {
            addCriterion("学籍异动日 <", value, "学籍异动日");
            return (Criteria) this;
        }

        public Criteria and学籍异动日LessThanOrEqualTo(String value) {
            addCriterion("学籍异动日 <=", value, "学籍异动日");
            return (Criteria) this;
        }

        public Criteria and学籍异动日Like(String value) {
            addCriterion("学籍异动日 like", value, "学籍异动日");
            return (Criteria) this;
        }

        public Criteria and学籍异动日NotLike(String value) {
            addCriterion("学籍异动日 not like", value, "学籍异动日");
            return (Criteria) this;
        }

        public Criteria and学籍异动日In(List<String> values) {
            addCriterion("学籍异动日 in", values, "学籍异动日");
            return (Criteria) this;
        }

        public Criteria and学籍异动日NotIn(List<String> values) {
            addCriterion("学籍异动日 not in", values, "学籍异动日");
            return (Criteria) this;
        }

        public Criteria and学籍异动日Between(String value1, String value2) {
            addCriterion("学籍异动日 between", value1, value2, "学籍异动日");
            return (Criteria) this;
        }

        public Criteria and学籍异动日NotBetween(String value1, String value2) {
            addCriterion("学籍异动日 not between", value1, value2, "学籍异动日");
            return (Criteria) this;
        }

        public Criteria and备注IsNull() {
            addCriterion("备注 is null");
            return (Criteria) this;
        }

        public Criteria and备注IsNotNull() {
            addCriterion("备注 is not null");
            return (Criteria) this;
        }

        public Criteria and备注EqualTo(String value) {
            addCriterion("备注 =", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注NotEqualTo(String value) {
            addCriterion("备注 <>", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注GreaterThan(String value) {
            addCriterion("备注 >", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注GreaterThanOrEqualTo(String value) {
            addCriterion("备注 >=", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注LessThan(String value) {
            addCriterion("备注 <", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注LessThanOrEqualTo(String value) {
            addCriterion("备注 <=", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注Like(String value) {
            addCriterion("备注 like", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注NotLike(String value) {
            addCriterion("备注 not like", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注In(List<String> values) {
            addCriterion("备注 in", values, "备注");
            return (Criteria) this;
        }

        public Criteria and备注NotIn(List<String> values) {
            addCriterion("备注 not in", values, "备注");
            return (Criteria) this;
        }

        public Criteria and备注Between(String value1, String value2) {
            addCriterion("备注 between", value1, value2, "备注");
            return (Criteria) this;
        }

        public Criteria and备注NotBetween(String value1, String value2) {
            addCriterion("备注 not between", value1, value2, "备注");
            return (Criteria) this;
        }

        public Criteria and操作人IsNull() {
            addCriterion("操作人 is null");
            return (Criteria) this;
        }

        public Criteria and操作人IsNotNull() {
            addCriterion("操作人 is not null");
            return (Criteria) this;
        }

        public Criteria and操作人EqualTo(String value) {
            addCriterion("操作人 =", value, "操作人");
            return (Criteria) this;
        }

        public Criteria and操作人NotEqualTo(String value) {
            addCriterion("操作人 <>", value, "操作人");
            return (Criteria) this;
        }

        public Criteria and操作人GreaterThan(String value) {
            addCriterion("操作人 >", value, "操作人");
            return (Criteria) this;
        }

        public Criteria and操作人GreaterThanOrEqualTo(String value) {
            addCriterion("操作人 >=", value, "操作人");
            return (Criteria) this;
        }

        public Criteria and操作人LessThan(String value) {
            addCriterion("操作人 <", value, "操作人");
            return (Criteria) this;
        }

        public Criteria and操作人LessThanOrEqualTo(String value) {
            addCriterion("操作人 <=", value, "操作人");
            return (Criteria) this;
        }

        public Criteria and操作人Like(String value) {
            addCriterion("操作人 like", value, "操作人");
            return (Criteria) this;
        }

        public Criteria and操作人NotLike(String value) {
            addCriterion("操作人 not like", value, "操作人");
            return (Criteria) this;
        }

        public Criteria and操作人In(List<String> values) {
            addCriterion("操作人 in", values, "操作人");
            return (Criteria) this;
        }

        public Criteria and操作人NotIn(List<String> values) {
            addCriterion("操作人 not in", values, "操作人");
            return (Criteria) this;
        }

        public Criteria and操作人Between(String value1, String value2) {
            addCriterion("操作人 between", value1, value2, "操作人");
            return (Criteria) this;
        }

        public Criteria and操作人NotBetween(String value1, String value2) {
            addCriterion("操作人 not between", value1, value2, "操作人");
            return (Criteria) this;
        }

        public Criteria and操作时间IsNull() {
            addCriterion("操作时间 is null");
            return (Criteria) this;
        }

        public Criteria and操作时间IsNotNull() {
            addCriterion("操作时间 is not null");
            return (Criteria) this;
        }

        public Criteria and操作时间EqualTo(Date value) {
            addCriterion("操作时间 =", value, "操作时间");
            return (Criteria) this;
        }

        public Criteria and操作时间NotEqualTo(Date value) {
            addCriterion("操作时间 <>", value, "操作时间");
            return (Criteria) this;
        }

        public Criteria and操作时间GreaterThan(Date value) {
            addCriterion("操作时间 >", value, "操作时间");
            return (Criteria) this;
        }

        public Criteria and操作时间GreaterThanOrEqualTo(Date value) {
            addCriterion("操作时间 >=", value, "操作时间");
            return (Criteria) this;
        }

        public Criteria and操作时间LessThan(Date value) {
            addCriterion("操作时间 <", value, "操作时间");
            return (Criteria) this;
        }

        public Criteria and操作时间LessThanOrEqualTo(Date value) {
            addCriterion("操作时间 <=", value, "操作时间");
            return (Criteria) this;
        }

        public Criteria and操作时间In(List<Date> values) {
            addCriterion("操作时间 in", values, "操作时间");
            return (Criteria) this;
        }

        public Criteria and操作时间NotIn(List<Date> values) {
            addCriterion("操作时间 not in", values, "操作时间");
            return (Criteria) this;
        }

        public Criteria and操作时间Between(Date value1, Date value2) {
            addCriterion("操作时间 between", value1, value2, "操作时间");
            return (Criteria) this;
        }

        public Criteria and操作时间NotBetween(Date value1, Date value2) {
            addCriterion("操作时间 not between", value1, value2, "操作时间");
            return (Criteria) this;
        }

        public Criteria and休学终止日IsNull() {
            addCriterion("休学终止日 is null");
            return (Criteria) this;
        }

        public Criteria and休学终止日IsNotNull() {
            addCriterion("休学终止日 is not null");
            return (Criteria) this;
        }

        public Criteria and休学终止日EqualTo(String value) {
            addCriterion("休学终止日 =", value, "休学终止日");
            return (Criteria) this;
        }

        public Criteria and休学终止日NotEqualTo(String value) {
            addCriterion("休学终止日 <>", value, "休学终止日");
            return (Criteria) this;
        }

        public Criteria and休学终止日GreaterThan(String value) {
            addCriterion("休学终止日 >", value, "休学终止日");
            return (Criteria) this;
        }

        public Criteria and休学终止日GreaterThanOrEqualTo(String value) {
            addCriterion("休学终止日 >=", value, "休学终止日");
            return (Criteria) this;
        }

        public Criteria and休学终止日LessThan(String value) {
            addCriterion("休学终止日 <", value, "休学终止日");
            return (Criteria) this;
        }

        public Criteria and休学终止日LessThanOrEqualTo(String value) {
            addCriterion("休学终止日 <=", value, "休学终止日");
            return (Criteria) this;
        }

        public Criteria and休学终止日Like(String value) {
            addCriterion("休学终止日 like", value, "休学终止日");
            return (Criteria) this;
        }

        public Criteria and休学终止日NotLike(String value) {
            addCriterion("休学终止日 not like", value, "休学终止日");
            return (Criteria) this;
        }

        public Criteria and休学终止日In(List<String> values) {
            addCriterion("休学终止日 in", values, "休学终止日");
            return (Criteria) this;
        }

        public Criteria and休学终止日NotIn(List<String> values) {
            addCriterion("休学终止日 not in", values, "休学终止日");
            return (Criteria) this;
        }

        public Criteria and休学终止日Between(String value1, String value2) {
            addCriterion("休学终止日 between", value1, value2, "休学终止日");
            return (Criteria) this;
        }

        public Criteria and休学终止日NotBetween(String value1, String value2) {
            addCriterion("休学终止日 not between", value1, value2, "休学终止日");
            return (Criteria) this;
        }

        public Criteria and休学起始日IsNull() {
            addCriterion("休学起始日 is null");
            return (Criteria) this;
        }

        public Criteria and休学起始日IsNotNull() {
            addCriterion("休学起始日 is not null");
            return (Criteria) this;
        }

        public Criteria and休学起始日EqualTo(String value) {
            addCriterion("休学起始日 =", value, "休学起始日");
            return (Criteria) this;
        }

        public Criteria and休学起始日NotEqualTo(String value) {
            addCriterion("休学起始日 <>", value, "休学起始日");
            return (Criteria) this;
        }

        public Criteria and休学起始日GreaterThan(String value) {
            addCriterion("休学起始日 >", value, "休学起始日");
            return (Criteria) this;
        }

        public Criteria and休学起始日GreaterThanOrEqualTo(String value) {
            addCriterion("休学起始日 >=", value, "休学起始日");
            return (Criteria) this;
        }

        public Criteria and休学起始日LessThan(String value) {
            addCriterion("休学起始日 <", value, "休学起始日");
            return (Criteria) this;
        }

        public Criteria and休学起始日LessThanOrEqualTo(String value) {
            addCriterion("休学起始日 <=", value, "休学起始日");
            return (Criteria) this;
        }

        public Criteria and休学起始日Like(String value) {
            addCriterion("休学起始日 like", value, "休学起始日");
            return (Criteria) this;
        }

        public Criteria and休学起始日NotLike(String value) {
            addCriterion("休学起始日 not like", value, "休学起始日");
            return (Criteria) this;
        }

        public Criteria and休学起始日In(List<String> values) {
            addCriterion("休学起始日 in", values, "休学起始日");
            return (Criteria) this;
        }

        public Criteria and休学起始日NotIn(List<String> values) {
            addCriterion("休学起始日 not in", values, "休学起始日");
            return (Criteria) this;
        }

        public Criteria and休学起始日Between(String value1, String value2) {
            addCriterion("休学起始日 between", value1, value2, "休学起始日");
            return (Criteria) this;
        }

        public Criteria and休学起始日NotBetween(String value1, String value2) {
            addCriterion("休学起始日 not between", value1, value2, "休学起始日");
            return (Criteria) this;
        }

        public Criteria and已复学IsNull() {
            addCriterion("已复学 is null");
            return (Criteria) this;
        }

        public Criteria and已复学IsNotNull() {
            addCriterion("已复学 is not null");
            return (Criteria) this;
        }

        public Criteria and已复学EqualTo(String value) {
            addCriterion("已复学 =", value, "已复学");
            return (Criteria) this;
        }

        public Criteria and已复学NotEqualTo(String value) {
            addCriterion("已复学 <>", value, "已复学");
            return (Criteria) this;
        }

        public Criteria and已复学GreaterThan(String value) {
            addCriterion("已复学 >", value, "已复学");
            return (Criteria) this;
        }

        public Criteria and已复学GreaterThanOrEqualTo(String value) {
            addCriterion("已复学 >=", value, "已复学");
            return (Criteria) this;
        }

        public Criteria and已复学LessThan(String value) {
            addCriterion("已复学 <", value, "已复学");
            return (Criteria) this;
        }

        public Criteria and已复学LessThanOrEqualTo(String value) {
            addCriterion("已复学 <=", value, "已复学");
            return (Criteria) this;
        }

        public Criteria and已复学Like(String value) {
            addCriterion("已复学 like", value, "已复学");
            return (Criteria) this;
        }

        public Criteria and已复学NotLike(String value) {
            addCriterion("已复学 not like", value, "已复学");
            return (Criteria) this;
        }

        public Criteria and已复学In(List<String> values) {
            addCriterion("已复学 in", values, "已复学");
            return (Criteria) this;
        }

        public Criteria and已复学NotIn(List<String> values) {
            addCriterion("已复学 not in", values, "已复学");
            return (Criteria) this;
        }

        public Criteria and已复学Between(String value1, String value2) {
            addCriterion("已复学 between", value1, value2, "已复学");
            return (Criteria) this;
        }

        public Criteria and已复学NotBetween(String value1, String value2) {
            addCriterion("已复学 not between", value1, value2, "已复学");
            return (Criteria) this;
        }

        public Criteria and学籍异动IsNull() {
            addCriterion("学籍异动 is null");
            return (Criteria) this;
        }

        public Criteria and学籍异动IsNotNull() {
            addCriterion("学籍异动 is not null");
            return (Criteria) this;
        }

        public Criteria and学籍异动EqualTo(String value) {
            addCriterion("学籍异动 =", value, "学籍异动");
            return (Criteria) this;
        }

        public Criteria and学籍异动NotEqualTo(String value) {
            addCriterion("学籍异动 <>", value, "学籍异动");
            return (Criteria) this;
        }

        public Criteria and学籍异动GreaterThan(String value) {
            addCriterion("学籍异动 >", value, "学籍异动");
            return (Criteria) this;
        }

        public Criteria and学籍异动GreaterThanOrEqualTo(String value) {
            addCriterion("学籍异动 >=", value, "学籍异动");
            return (Criteria) this;
        }

        public Criteria and学籍异动LessThan(String value) {
            addCriterion("学籍异动 <", value, "学籍异动");
            return (Criteria) this;
        }

        public Criteria and学籍异动LessThanOrEqualTo(String value) {
            addCriterion("学籍异动 <=", value, "学籍异动");
            return (Criteria) this;
        }

        public Criteria and学籍异动Like(String value) {
            addCriterion("学籍异动 like", value, "学籍异动");
            return (Criteria) this;
        }

        public Criteria and学籍异动NotLike(String value) {
            addCriterion("学籍异动 not like", value, "学籍异动");
            return (Criteria) this;
        }

        public Criteria and学籍异动In(List<String> values) {
            addCriterion("学籍异动 in", values, "学籍异动");
            return (Criteria) this;
        }

        public Criteria and学籍异动NotIn(List<String> values) {
            addCriterion("学籍异动 not in", values, "学籍异动");
            return (Criteria) this;
        }

        public Criteria and学籍异动Between(String value1, String value2) {
            addCriterion("学籍异动 between", value1, value2, "学籍异动");
            return (Criteria) this;
        }

        public Criteria and学籍异动NotBetween(String value1, String value2) {
            addCriterion("学籍异动 not between", value1, value2, "学籍异动");
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