package edu.shu.pojo;

import java.util.ArrayList;
import java.util.List;

public class ViewZsSslqkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewZsSslqkExample() {
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

        public Criteria and准考证号IsNull() {
            addCriterion("准考证号 is null");
            return (Criteria) this;
        }

        public Criteria and准考证号IsNotNull() {
            addCriterion("准考证号 is not null");
            return (Criteria) this;
        }

        public Criteria and准考证号EqualTo(String value) {
            addCriterion("准考证号 =", value, "准考证号");
            return (Criteria) this;
        }

        public Criteria and准考证号NotEqualTo(String value) {
            addCriterion("准考证号 <>", value, "准考证号");
            return (Criteria) this;
        }

        public Criteria and准考证号GreaterThan(String value) {
            addCriterion("准考证号 >", value, "准考证号");
            return (Criteria) this;
        }

        public Criteria and准考证号GreaterThanOrEqualTo(String value) {
            addCriterion("准考证号 >=", value, "准考证号");
            return (Criteria) this;
        }

        public Criteria and准考证号LessThan(String value) {
            addCriterion("准考证号 <", value, "准考证号");
            return (Criteria) this;
        }

        public Criteria and准考证号LessThanOrEqualTo(String value) {
            addCriterion("准考证号 <=", value, "准考证号");
            return (Criteria) this;
        }

        public Criteria and准考证号Like(String value) {
            addCriterion("准考证号 like", value, "准考证号");
            return (Criteria) this;
        }

        public Criteria and准考证号NotLike(String value) {
            addCriterion("准考证号 not like", value, "准考证号");
            return (Criteria) this;
        }

        public Criteria and准考证号In(List<String> values) {
            addCriterion("准考证号 in", values, "准考证号");
            return (Criteria) this;
        }

        public Criteria and准考证号NotIn(List<String> values) {
            addCriterion("准考证号 not in", values, "准考证号");
            return (Criteria) this;
        }

        public Criteria and准考证号Between(String value1, String value2) {
            addCriterion("准考证号 between", value1, value2, "准考证号");
            return (Criteria) this;
        }

        public Criteria and准考证号NotBetween(String value1, String value2) {
            addCriterion("准考证号 not between", value1, value2, "准考证号");
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

        public Criteria and姓名IsNull() {
            addCriterion("姓名 is null");
            return (Criteria) this;
        }

        public Criteria and姓名IsNotNull() {
            addCriterion("姓名 is not null");
            return (Criteria) this;
        }

        public Criteria and姓名EqualTo(String value) {
            addCriterion("姓名 =", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名NotEqualTo(String value) {
            addCriterion("姓名 <>", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名GreaterThan(String value) {
            addCriterion("姓名 >", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名GreaterThanOrEqualTo(String value) {
            addCriterion("姓名 >=", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名LessThan(String value) {
            addCriterion("姓名 <", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名LessThanOrEqualTo(String value) {
            addCriterion("姓名 <=", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名Like(String value) {
            addCriterion("姓名 like", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名NotLike(String value) {
            addCriterion("姓名 not like", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名In(List<String> values) {
            addCriterion("姓名 in", values, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名NotIn(List<String> values) {
            addCriterion("姓名 not in", values, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名Between(String value1, String value2) {
            addCriterion("姓名 between", value1, value2, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名NotBetween(String value1, String value2) {
            addCriterion("姓名 not between", value1, value2, "姓名");
            return (Criteria) this;
        }

        public Criteria and性别IsNull() {
            addCriterion("性别 is null");
            return (Criteria) this;
        }

        public Criteria and性别IsNotNull() {
            addCriterion("性别 is not null");
            return (Criteria) this;
        }

        public Criteria and性别EqualTo(String value) {
            addCriterion("性别 =", value, "性别");
            return (Criteria) this;
        }

        public Criteria and性别NotEqualTo(String value) {
            addCriterion("性别 <>", value, "性别");
            return (Criteria) this;
        }

        public Criteria and性别GreaterThan(String value) {
            addCriterion("性别 >", value, "性别");
            return (Criteria) this;
        }

        public Criteria and性别GreaterThanOrEqualTo(String value) {
            addCriterion("性别 >=", value, "性别");
            return (Criteria) this;
        }

        public Criteria and性别LessThan(String value) {
            addCriterion("性别 <", value, "性别");
            return (Criteria) this;
        }

        public Criteria and性别LessThanOrEqualTo(String value) {
            addCriterion("性别 <=", value, "性别");
            return (Criteria) this;
        }

        public Criteria and性别Like(String value) {
            addCriterion("性别 like", value, "性别");
            return (Criteria) this;
        }

        public Criteria and性别NotLike(String value) {
            addCriterion("性别 not like", value, "性别");
            return (Criteria) this;
        }

        public Criteria and性别In(List<String> values) {
            addCriterion("性别 in", values, "性别");
            return (Criteria) this;
        }

        public Criteria and性别NotIn(List<String> values) {
            addCriterion("性别 not in", values, "性别");
            return (Criteria) this;
        }

        public Criteria and性别Between(String value1, String value2) {
            addCriterion("性别 between", value1, value2, "性别");
            return (Criteria) this;
        }

        public Criteria and性别NotBetween(String value1, String value2) {
            addCriterion("性别 not between", value1, value2, "性别");
            return (Criteria) this;
        }

        public Criteria andIs211IsNull() {
            addCriterion("Is211 is null");
            return (Criteria) this;
        }

        public Criteria andIs211IsNotNull() {
            addCriterion("Is211 is not null");
            return (Criteria) this;
        }

        public Criteria andIs211EqualTo(String value) {
            addCriterion("Is211 =", value, "is211");
            return (Criteria) this;
        }

        public Criteria andIs211NotEqualTo(String value) {
            addCriterion("Is211 <>", value, "is211");
            return (Criteria) this;
        }

        public Criteria andIs211GreaterThan(String value) {
            addCriterion("Is211 >", value, "is211");
            return (Criteria) this;
        }

        public Criteria andIs211GreaterThanOrEqualTo(String value) {
            addCriterion("Is211 >=", value, "is211");
            return (Criteria) this;
        }

        public Criteria andIs211LessThan(String value) {
            addCriterion("Is211 <", value, "is211");
            return (Criteria) this;
        }

        public Criteria andIs211LessThanOrEqualTo(String value) {
            addCriterion("Is211 <=", value, "is211");
            return (Criteria) this;
        }

        public Criteria andIs211Like(String value) {
            addCriterion("Is211 like", value, "is211");
            return (Criteria) this;
        }

        public Criteria andIs211NotLike(String value) {
            addCriterion("Is211 not like", value, "is211");
            return (Criteria) this;
        }

        public Criteria andIs211In(List<String> values) {
            addCriterion("Is211 in", values, "is211");
            return (Criteria) this;
        }

        public Criteria andIs211NotIn(List<String> values) {
            addCriterion("Is211 not in", values, "is211");
            return (Criteria) this;
        }

        public Criteria andIs211Between(String value1, String value2) {
            addCriterion("Is211 between", value1, value2, "is211");
            return (Criteria) this;
        }

        public Criteria andIs211NotBetween(String value1, String value2) {
            addCriterion("Is211 not between", value1, value2, "is211");
            return (Criteria) this;
        }

        public Criteria andIs985IsNull() {
            addCriterion("Is985 is null");
            return (Criteria) this;
        }

        public Criteria andIs985IsNotNull() {
            addCriterion("Is985 is not null");
            return (Criteria) this;
        }

        public Criteria andIs985EqualTo(String value) {
            addCriterion("Is985 =", value, "is985");
            return (Criteria) this;
        }

        public Criteria andIs985NotEqualTo(String value) {
            addCriterion("Is985 <>", value, "is985");
            return (Criteria) this;
        }

        public Criteria andIs985GreaterThan(String value) {
            addCriterion("Is985 >", value, "is985");
            return (Criteria) this;
        }

        public Criteria andIs985GreaterThanOrEqualTo(String value) {
            addCriterion("Is985 >=", value, "is985");
            return (Criteria) this;
        }

        public Criteria andIs985LessThan(String value) {
            addCriterion("Is985 <", value, "is985");
            return (Criteria) this;
        }

        public Criteria andIs985LessThanOrEqualTo(String value) {
            addCriterion("Is985 <=", value, "is985");
            return (Criteria) this;
        }

        public Criteria andIs985Like(String value) {
            addCriterion("Is985 like", value, "is985");
            return (Criteria) this;
        }

        public Criteria andIs985NotLike(String value) {
            addCriterion("Is985 not like", value, "is985");
            return (Criteria) this;
        }

        public Criteria andIs985In(List<String> values) {
            addCriterion("Is985 in", values, "is985");
            return (Criteria) this;
        }

        public Criteria andIs985NotIn(List<String> values) {
            addCriterion("Is985 not in", values, "is985");
            return (Criteria) this;
        }

        public Criteria andIs985Between(String value1, String value2) {
            addCriterion("Is985 between", value1, value2, "is985");
            return (Criteria) this;
        }

        public Criteria andIs985NotBetween(String value1, String value2) {
            addCriterion("Is985 not between", value1, value2, "is985");
            return (Criteria) this;
        }

        public Criteria andIsjybIsNull() {
            addCriterion("IsJYB is null");
            return (Criteria) this;
        }

        public Criteria andIsjybIsNotNull() {
            addCriterion("IsJYB is not null");
            return (Criteria) this;
        }

        public Criteria andIsjybEqualTo(String value) {
            addCriterion("IsJYB =", value, "isjyb");
            return (Criteria) this;
        }

        public Criteria andIsjybNotEqualTo(String value) {
            addCriterion("IsJYB <>", value, "isjyb");
            return (Criteria) this;
        }

        public Criteria andIsjybGreaterThan(String value) {
            addCriterion("IsJYB >", value, "isjyb");
            return (Criteria) this;
        }

        public Criteria andIsjybGreaterThanOrEqualTo(String value) {
            addCriterion("IsJYB >=", value, "isjyb");
            return (Criteria) this;
        }

        public Criteria andIsjybLessThan(String value) {
            addCriterion("IsJYB <", value, "isjyb");
            return (Criteria) this;
        }

        public Criteria andIsjybLessThanOrEqualTo(String value) {
            addCriterion("IsJYB <=", value, "isjyb");
            return (Criteria) this;
        }

        public Criteria andIsjybLike(String value) {
            addCriterion("IsJYB like", value, "isjyb");
            return (Criteria) this;
        }

        public Criteria andIsjybNotLike(String value) {
            addCriterion("IsJYB not like", value, "isjyb");
            return (Criteria) this;
        }

        public Criteria andIsjybIn(List<String> values) {
            addCriterion("IsJYB in", values, "isjyb");
            return (Criteria) this;
        }

        public Criteria andIsjybNotIn(List<String> values) {
            addCriterion("IsJYB not in", values, "isjyb");
            return (Criteria) this;
        }

        public Criteria andIsjybBetween(String value1, String value2) {
            addCriterion("IsJYB between", value1, value2, "isjyb");
            return (Criteria) this;
        }

        public Criteria andIsjybNotBetween(String value1, String value2) {
            addCriterion("IsJYB not between", value1, value2, "isjyb");
            return (Criteria) this;
        }

        public Criteria and本科批次IsNull() {
            addCriterion("本科批次 is null");
            return (Criteria) this;
        }

        public Criteria and本科批次IsNotNull() {
            addCriterion("本科批次 is not null");
            return (Criteria) this;
        }

        public Criteria and本科批次EqualTo(String value) {
            addCriterion("本科批次 =", value, "本科批次");
            return (Criteria) this;
        }

        public Criteria and本科批次NotEqualTo(String value) {
            addCriterion("本科批次 <>", value, "本科批次");
            return (Criteria) this;
        }

        public Criteria and本科批次GreaterThan(String value) {
            addCriterion("本科批次 >", value, "本科批次");
            return (Criteria) this;
        }

        public Criteria and本科批次GreaterThanOrEqualTo(String value) {
            addCriterion("本科批次 >=", value, "本科批次");
            return (Criteria) this;
        }

        public Criteria and本科批次LessThan(String value) {
            addCriterion("本科批次 <", value, "本科批次");
            return (Criteria) this;
        }

        public Criteria and本科批次LessThanOrEqualTo(String value) {
            addCriterion("本科批次 <=", value, "本科批次");
            return (Criteria) this;
        }

        public Criteria and本科批次Like(String value) {
            addCriterion("本科批次 like", value, "本科批次");
            return (Criteria) this;
        }

        public Criteria and本科批次NotLike(String value) {
            addCriterion("本科批次 not like", value, "本科批次");
            return (Criteria) this;
        }

        public Criteria and本科批次In(List<String> values) {
            addCriterion("本科批次 in", values, "本科批次");
            return (Criteria) this;
        }

        public Criteria and本科批次NotIn(List<String> values) {
            addCriterion("本科批次 not in", values, "本科批次");
            return (Criteria) this;
        }

        public Criteria and本科批次Between(String value1, String value2) {
            addCriterion("本科批次 between", value1, value2, "本科批次");
            return (Criteria) this;
        }

        public Criteria and本科批次NotBetween(String value1, String value2) {
            addCriterion("本科批次 not between", value1, value2, "本科批次");
            return (Criteria) this;
        }

        public Criteria and考生来源IsNull() {
            addCriterion("考生来源 is null");
            return (Criteria) this;
        }

        public Criteria and考生来源IsNotNull() {
            addCriterion("考生来源 is not null");
            return (Criteria) this;
        }

        public Criteria and考生来源EqualTo(String value) {
            addCriterion("考生来源 =", value, "考生来源");
            return (Criteria) this;
        }

        public Criteria and考生来源NotEqualTo(String value) {
            addCriterion("考生来源 <>", value, "考生来源");
            return (Criteria) this;
        }

        public Criteria and考生来源GreaterThan(String value) {
            addCriterion("考生来源 >", value, "考生来源");
            return (Criteria) this;
        }

        public Criteria and考生来源GreaterThanOrEqualTo(String value) {
            addCriterion("考生来源 >=", value, "考生来源");
            return (Criteria) this;
        }

        public Criteria and考生来源LessThan(String value) {
            addCriterion("考生来源 <", value, "考生来源");
            return (Criteria) this;
        }

        public Criteria and考生来源LessThanOrEqualTo(String value) {
            addCriterion("考生来源 <=", value, "考生来源");
            return (Criteria) this;
        }

        public Criteria and考生来源Like(String value) {
            addCriterion("考生来源 like", value, "考生来源");
            return (Criteria) this;
        }

        public Criteria and考生来源NotLike(String value) {
            addCriterion("考生来源 not like", value, "考生来源");
            return (Criteria) this;
        }

        public Criteria and考生来源In(List<String> values) {
            addCriterion("考生来源 in", values, "考生来源");
            return (Criteria) this;
        }

        public Criteria and考生来源NotIn(List<String> values) {
            addCriterion("考生来源 not in", values, "考生来源");
            return (Criteria) this;
        }

        public Criteria and考生来源Between(String value1, String value2) {
            addCriterion("考生来源 between", value1, value2, "考生来源");
            return (Criteria) this;
        }

        public Criteria and考生来源NotBetween(String value1, String value2) {
            addCriterion("考生来源 not between", value1, value2, "考生来源");
            return (Criteria) this;
        }

        public Criteria and大毕院校码IsNull() {
            addCriterion("大毕院校码 is null");
            return (Criteria) this;
        }

        public Criteria and大毕院校码IsNotNull() {
            addCriterion("大毕院校码 is not null");
            return (Criteria) this;
        }

        public Criteria and大毕院校码EqualTo(String value) {
            addCriterion("大毕院校码 =", value, "大毕院校码");
            return (Criteria) this;
        }

        public Criteria and大毕院校码NotEqualTo(String value) {
            addCriterion("大毕院校码 <>", value, "大毕院校码");
            return (Criteria) this;
        }

        public Criteria and大毕院校码GreaterThan(String value) {
            addCriterion("大毕院校码 >", value, "大毕院校码");
            return (Criteria) this;
        }

        public Criteria and大毕院校码GreaterThanOrEqualTo(String value) {
            addCriterion("大毕院校码 >=", value, "大毕院校码");
            return (Criteria) this;
        }

        public Criteria and大毕院校码LessThan(String value) {
            addCriterion("大毕院校码 <", value, "大毕院校码");
            return (Criteria) this;
        }

        public Criteria and大毕院校码LessThanOrEqualTo(String value) {
            addCriterion("大毕院校码 <=", value, "大毕院校码");
            return (Criteria) this;
        }

        public Criteria and大毕院校码Like(String value) {
            addCriterion("大毕院校码 like", value, "大毕院校码");
            return (Criteria) this;
        }

        public Criteria and大毕院校码NotLike(String value) {
            addCriterion("大毕院校码 not like", value, "大毕院校码");
            return (Criteria) this;
        }

        public Criteria and大毕院校码In(List<String> values) {
            addCriterion("大毕院校码 in", values, "大毕院校码");
            return (Criteria) this;
        }

        public Criteria and大毕院校码NotIn(List<String> values) {
            addCriterion("大毕院校码 not in", values, "大毕院校码");
            return (Criteria) this;
        }

        public Criteria and大毕院校码Between(String value1, String value2) {
            addCriterion("大毕院校码 between", value1, value2, "大毕院校码");
            return (Criteria) this;
        }

        public Criteria and大毕院校码NotBetween(String value1, String value2) {
            addCriterion("大毕院校码 not between", value1, value2, "大毕院校码");
            return (Criteria) this;
        }

        public Criteria and大毕院校IsNull() {
            addCriterion("大毕院校 is null");
            return (Criteria) this;
        }

        public Criteria and大毕院校IsNotNull() {
            addCriterion("大毕院校 is not null");
            return (Criteria) this;
        }

        public Criteria and大毕院校EqualTo(String value) {
            addCriterion("大毕院校 =", value, "大毕院校");
            return (Criteria) this;
        }

        public Criteria and大毕院校NotEqualTo(String value) {
            addCriterion("大毕院校 <>", value, "大毕院校");
            return (Criteria) this;
        }

        public Criteria and大毕院校GreaterThan(String value) {
            addCriterion("大毕院校 >", value, "大毕院校");
            return (Criteria) this;
        }

        public Criteria and大毕院校GreaterThanOrEqualTo(String value) {
            addCriterion("大毕院校 >=", value, "大毕院校");
            return (Criteria) this;
        }

        public Criteria and大毕院校LessThan(String value) {
            addCriterion("大毕院校 <", value, "大毕院校");
            return (Criteria) this;
        }

        public Criteria and大毕院校LessThanOrEqualTo(String value) {
            addCriterion("大毕院校 <=", value, "大毕院校");
            return (Criteria) this;
        }

        public Criteria and大毕院校Like(String value) {
            addCriterion("大毕院校 like", value, "大毕院校");
            return (Criteria) this;
        }

        public Criteria and大毕院校NotLike(String value) {
            addCriterion("大毕院校 not like", value, "大毕院校");
            return (Criteria) this;
        }

        public Criteria and大毕院校In(List<String> values) {
            addCriterion("大毕院校 in", values, "大毕院校");
            return (Criteria) this;
        }

        public Criteria and大毕院校NotIn(List<String> values) {
            addCriterion("大毕院校 not in", values, "大毕院校");
            return (Criteria) this;
        }

        public Criteria and大毕院校Between(String value1, String value2) {
            addCriterion("大毕院校 between", value1, value2, "大毕院校");
            return (Criteria) this;
        }

        public Criteria and大毕院校NotBetween(String value1, String value2) {
            addCriterion("大毕院校 not between", value1, value2, "大毕院校");
            return (Criteria) this;
        }

        public Criteria and民族IsNull() {
            addCriterion("民族 is null");
            return (Criteria) this;
        }

        public Criteria and民族IsNotNull() {
            addCriterion("民族 is not null");
            return (Criteria) this;
        }

        public Criteria and民族EqualTo(String value) {
            addCriterion("民族 =", value, "民族");
            return (Criteria) this;
        }

        public Criteria and民族NotEqualTo(String value) {
            addCriterion("民族 <>", value, "民族");
            return (Criteria) this;
        }

        public Criteria and民族GreaterThan(String value) {
            addCriterion("民族 >", value, "民族");
            return (Criteria) this;
        }

        public Criteria and民族GreaterThanOrEqualTo(String value) {
            addCriterion("民族 >=", value, "民族");
            return (Criteria) this;
        }

        public Criteria and民族LessThan(String value) {
            addCriterion("民族 <", value, "民族");
            return (Criteria) this;
        }

        public Criteria and民族LessThanOrEqualTo(String value) {
            addCriterion("民族 <=", value, "民族");
            return (Criteria) this;
        }

        public Criteria and民族Like(String value) {
            addCriterion("民族 like", value, "民族");
            return (Criteria) this;
        }

        public Criteria and民族NotLike(String value) {
            addCriterion("民族 not like", value, "民族");
            return (Criteria) this;
        }

        public Criteria and民族In(List<String> values) {
            addCriterion("民族 in", values, "民族");
            return (Criteria) this;
        }

        public Criteria and民族NotIn(List<String> values) {
            addCriterion("民族 not in", values, "民族");
            return (Criteria) this;
        }

        public Criteria and民族Between(String value1, String value2) {
            addCriterion("民族 between", value1, value2, "民族");
            return (Criteria) this;
        }

        public Criteria and民族NotBetween(String value1, String value2) {
            addCriterion("民族 not between", value1, value2, "民族");
            return (Criteria) this;
        }

        public Criteria and政治面貌IsNull() {
            addCriterion("政治面貌 is null");
            return (Criteria) this;
        }

        public Criteria and政治面貌IsNotNull() {
            addCriterion("政治面貌 is not null");
            return (Criteria) this;
        }

        public Criteria and政治面貌EqualTo(String value) {
            addCriterion("政治面貌 =", value, "政治面貌");
            return (Criteria) this;
        }

        public Criteria and政治面貌NotEqualTo(String value) {
            addCriterion("政治面貌 <>", value, "政治面貌");
            return (Criteria) this;
        }

        public Criteria and政治面貌GreaterThan(String value) {
            addCriterion("政治面貌 >", value, "政治面貌");
            return (Criteria) this;
        }

        public Criteria and政治面貌GreaterThanOrEqualTo(String value) {
            addCriterion("政治面貌 >=", value, "政治面貌");
            return (Criteria) this;
        }

        public Criteria and政治面貌LessThan(String value) {
            addCriterion("政治面貌 <", value, "政治面貌");
            return (Criteria) this;
        }

        public Criteria and政治面貌LessThanOrEqualTo(String value) {
            addCriterion("政治面貌 <=", value, "政治面貌");
            return (Criteria) this;
        }

        public Criteria and政治面貌Like(String value) {
            addCriterion("政治面貌 like", value, "政治面貌");
            return (Criteria) this;
        }

        public Criteria and政治面貌NotLike(String value) {
            addCriterion("政治面貌 not like", value, "政治面貌");
            return (Criteria) this;
        }

        public Criteria and政治面貌In(List<String> values) {
            addCriterion("政治面貌 in", values, "政治面貌");
            return (Criteria) this;
        }

        public Criteria and政治面貌NotIn(List<String> values) {
            addCriterion("政治面貌 not in", values, "政治面貌");
            return (Criteria) this;
        }

        public Criteria and政治面貌Between(String value1, String value2) {
            addCriterion("政治面貌 between", value1, value2, "政治面貌");
            return (Criteria) this;
        }

        public Criteria and政治面貌NotBetween(String value1, String value2) {
            addCriterion("政治面貌 not between", value1, value2, "政治面貌");
            return (Criteria) this;
        }

        public Criteria and录取类别IsNull() {
            addCriterion("录取类别 is null");
            return (Criteria) this;
        }

        public Criteria and录取类别IsNotNull() {
            addCriterion("录取类别 is not null");
            return (Criteria) this;
        }

        public Criteria and录取类别EqualTo(String value) {
            addCriterion("录取类别 =", value, "录取类别");
            return (Criteria) this;
        }

        public Criteria and录取类别NotEqualTo(String value) {
            addCriterion("录取类别 <>", value, "录取类别");
            return (Criteria) this;
        }

        public Criteria and录取类别GreaterThan(String value) {
            addCriterion("录取类别 >", value, "录取类别");
            return (Criteria) this;
        }

        public Criteria and录取类别GreaterThanOrEqualTo(String value) {
            addCriterion("录取类别 >=", value, "录取类别");
            return (Criteria) this;
        }

        public Criteria and录取类别LessThan(String value) {
            addCriterion("录取类别 <", value, "录取类别");
            return (Criteria) this;
        }

        public Criteria and录取类别LessThanOrEqualTo(String value) {
            addCriterion("录取类别 <=", value, "录取类别");
            return (Criteria) this;
        }

        public Criteria and录取类别Like(String value) {
            addCriterion("录取类别 like", value, "录取类别");
            return (Criteria) this;
        }

        public Criteria and录取类别NotLike(String value) {
            addCriterion("录取类别 not like", value, "录取类别");
            return (Criteria) this;
        }

        public Criteria and录取类别In(List<String> values) {
            addCriterion("录取类别 in", values, "录取类别");
            return (Criteria) this;
        }

        public Criteria and录取类别NotIn(List<String> values) {
            addCriterion("录取类别 not in", values, "录取类别");
            return (Criteria) this;
        }

        public Criteria and录取类别Between(String value1, String value2) {
            addCriterion("录取类别 between", value1, value2, "录取类别");
            return (Criteria) this;
        }

        public Criteria and录取类别NotBetween(String value1, String value2) {
            addCriterion("录取类别 not between", value1, value2, "录取类别");
            return (Criteria) this;
        }

        public Criteria and学院名称IsNull() {
            addCriterion("学院名称 is null");
            return (Criteria) this;
        }

        public Criteria and学院名称IsNotNull() {
            addCriterion("学院名称 is not null");
            return (Criteria) this;
        }

        public Criteria and学院名称EqualTo(String value) {
            addCriterion("学院名称 =", value, "学院名称");
            return (Criteria) this;
        }

        public Criteria and学院名称NotEqualTo(String value) {
            addCriterion("学院名称 <>", value, "学院名称");
            return (Criteria) this;
        }

        public Criteria and学院名称GreaterThan(String value) {
            addCriterion("学院名称 >", value, "学院名称");
            return (Criteria) this;
        }

        public Criteria and学院名称GreaterThanOrEqualTo(String value) {
            addCriterion("学院名称 >=", value, "学院名称");
            return (Criteria) this;
        }

        public Criteria and学院名称LessThan(String value) {
            addCriterion("学院名称 <", value, "学院名称");
            return (Criteria) this;
        }

        public Criteria and学院名称LessThanOrEqualTo(String value) {
            addCriterion("学院名称 <=", value, "学院名称");
            return (Criteria) this;
        }

        public Criteria and学院名称Like(String value) {
            addCriterion("学院名称 like", value, "学院名称");
            return (Criteria) this;
        }

        public Criteria and学院名称NotLike(String value) {
            addCriterion("学院名称 not like", value, "学院名称");
            return (Criteria) this;
        }

        public Criteria and学院名称In(List<String> values) {
            addCriterion("学院名称 in", values, "学院名称");
            return (Criteria) this;
        }

        public Criteria and学院名称NotIn(List<String> values) {
            addCriterion("学院名称 not in", values, "学院名称");
            return (Criteria) this;
        }

        public Criteria and学院名称Between(String value1, String value2) {
            addCriterion("学院名称 between", value1, value2, "学院名称");
            return (Criteria) this;
        }

        public Criteria and学院名称NotBetween(String value1, String value2) {
            addCriterion("学院名称 not between", value1, value2, "学院名称");
            return (Criteria) this;
        }

        public Criteria and专业代码IsNull() {
            addCriterion("专业代码 is null");
            return (Criteria) this;
        }

        public Criteria and专业代码IsNotNull() {
            addCriterion("专业代码 is not null");
            return (Criteria) this;
        }

        public Criteria and专业代码EqualTo(String value) {
            addCriterion("专业代码 =", value, "专业代码");
            return (Criteria) this;
        }

        public Criteria and专业代码NotEqualTo(String value) {
            addCriterion("专业代码 <>", value, "专业代码");
            return (Criteria) this;
        }

        public Criteria and专业代码GreaterThan(String value) {
            addCriterion("专业代码 >", value, "专业代码");
            return (Criteria) this;
        }

        public Criteria and专业代码GreaterThanOrEqualTo(String value) {
            addCriterion("专业代码 >=", value, "专业代码");
            return (Criteria) this;
        }

        public Criteria and专业代码LessThan(String value) {
            addCriterion("专业代码 <", value, "专业代码");
            return (Criteria) this;
        }

        public Criteria and专业代码LessThanOrEqualTo(String value) {
            addCriterion("专业代码 <=", value, "专业代码");
            return (Criteria) this;
        }

        public Criteria and专业代码Like(String value) {
            addCriterion("专业代码 like", value, "专业代码");
            return (Criteria) this;
        }

        public Criteria and专业代码NotLike(String value) {
            addCriterion("专业代码 not like", value, "专业代码");
            return (Criteria) this;
        }

        public Criteria and专业代码In(List<String> values) {
            addCriterion("专业代码 in", values, "专业代码");
            return (Criteria) this;
        }

        public Criteria and专业代码NotIn(List<String> values) {
            addCriterion("专业代码 not in", values, "专业代码");
            return (Criteria) this;
        }

        public Criteria and专业代码Between(String value1, String value2) {
            addCriterion("专业代码 between", value1, value2, "专业代码");
            return (Criteria) this;
        }

        public Criteria and专业代码NotBetween(String value1, String value2) {
            addCriterion("专业代码 not between", value1, value2, "专业代码");
            return (Criteria) this;
        }

        public Criteria and专业名称IsNull() {
            addCriterion("专业名称 is null");
            return (Criteria) this;
        }

        public Criteria and专业名称IsNotNull() {
            addCriterion("专业名称 is not null");
            return (Criteria) this;
        }

        public Criteria and专业名称EqualTo(String value) {
            addCriterion("专业名称 =", value, "专业名称");
            return (Criteria) this;
        }

        public Criteria and专业名称NotEqualTo(String value) {
            addCriterion("专业名称 <>", value, "专业名称");
            return (Criteria) this;
        }

        public Criteria and专业名称GreaterThan(String value) {
            addCriterion("专业名称 >", value, "专业名称");
            return (Criteria) this;
        }

        public Criteria and专业名称GreaterThanOrEqualTo(String value) {
            addCriterion("专业名称 >=", value, "专业名称");
            return (Criteria) this;
        }

        public Criteria and专业名称LessThan(String value) {
            addCriterion("专业名称 <", value, "专业名称");
            return (Criteria) this;
        }

        public Criteria and专业名称LessThanOrEqualTo(String value) {
            addCriterion("专业名称 <=", value, "专业名称");
            return (Criteria) this;
        }

        public Criteria and专业名称Like(String value) {
            addCriterion("专业名称 like", value, "专业名称");
            return (Criteria) this;
        }

        public Criteria and专业名称NotLike(String value) {
            addCriterion("专业名称 not like", value, "专业名称");
            return (Criteria) this;
        }

        public Criteria and专业名称In(List<String> values) {
            addCriterion("专业名称 in", values, "专业名称");
            return (Criteria) this;
        }

        public Criteria and专业名称NotIn(List<String> values) {
            addCriterion("专业名称 not in", values, "专业名称");
            return (Criteria) this;
        }

        public Criteria and专业名称Between(String value1, String value2) {
            addCriterion("专业名称 between", value1, value2, "专业名称");
            return (Criteria) this;
        }

        public Criteria and专业名称NotBetween(String value1, String value2) {
            addCriterion("专业名称 not between", value1, value2, "专业名称");
            return (Criteria) this;
        }

        public Criteria and入学方式IsNull() {
            addCriterion("入学方式 is null");
            return (Criteria) this;
        }

        public Criteria and入学方式IsNotNull() {
            addCriterion("入学方式 is not null");
            return (Criteria) this;
        }

        public Criteria and入学方式EqualTo(String value) {
            addCriterion("入学方式 =", value, "入学方式");
            return (Criteria) this;
        }

        public Criteria and入学方式NotEqualTo(String value) {
            addCriterion("入学方式 <>", value, "入学方式");
            return (Criteria) this;
        }

        public Criteria and入学方式GreaterThan(String value) {
            addCriterion("入学方式 >", value, "入学方式");
            return (Criteria) this;
        }

        public Criteria and入学方式GreaterThanOrEqualTo(String value) {
            addCriterion("入学方式 >=", value, "入学方式");
            return (Criteria) this;
        }

        public Criteria and入学方式LessThan(String value) {
            addCriterion("入学方式 <", value, "入学方式");
            return (Criteria) this;
        }

        public Criteria and入学方式LessThanOrEqualTo(String value) {
            addCriterion("入学方式 <=", value, "入学方式");
            return (Criteria) this;
        }

        public Criteria and入学方式Like(String value) {
            addCriterion("入学方式 like", value, "入学方式");
            return (Criteria) this;
        }

        public Criteria and入学方式NotLike(String value) {
            addCriterion("入学方式 not like", value, "入学方式");
            return (Criteria) this;
        }

        public Criteria and入学方式In(List<String> values) {
            addCriterion("入学方式 in", values, "入学方式");
            return (Criteria) this;
        }

        public Criteria and入学方式NotIn(List<String> values) {
            addCriterion("入学方式 not in", values, "入学方式");
            return (Criteria) this;
        }

        public Criteria and入学方式Between(String value1, String value2) {
            addCriterion("入学方式 between", value1, value2, "入学方式");
            return (Criteria) this;
        }

        public Criteria and入学方式NotBetween(String value1, String value2) {
            addCriterion("入学方式 not between", value1, value2, "入学方式");
            return (Criteria) this;
        }

        public Criteria and毕业省市IsNull() {
            addCriterion("毕业省市 is null");
            return (Criteria) this;
        }

        public Criteria and毕业省市IsNotNull() {
            addCriterion("毕业省市 is not null");
            return (Criteria) this;
        }

        public Criteria and毕业省市EqualTo(String value) {
            addCriterion("毕业省市 =", value, "毕业省市");
            return (Criteria) this;
        }

        public Criteria and毕业省市NotEqualTo(String value) {
            addCriterion("毕业省市 <>", value, "毕业省市");
            return (Criteria) this;
        }

        public Criteria and毕业省市GreaterThan(String value) {
            addCriterion("毕业省市 >", value, "毕业省市");
            return (Criteria) this;
        }

        public Criteria and毕业省市GreaterThanOrEqualTo(String value) {
            addCriterion("毕业省市 >=", value, "毕业省市");
            return (Criteria) this;
        }

        public Criteria and毕业省市LessThan(String value) {
            addCriterion("毕业省市 <", value, "毕业省市");
            return (Criteria) this;
        }

        public Criteria and毕业省市LessThanOrEqualTo(String value) {
            addCriterion("毕业省市 <=", value, "毕业省市");
            return (Criteria) this;
        }

        public Criteria and毕业省市Like(String value) {
            addCriterion("毕业省市 like", value, "毕业省市");
            return (Criteria) this;
        }

        public Criteria and毕业省市NotLike(String value) {
            addCriterion("毕业省市 not like", value, "毕业省市");
            return (Criteria) this;
        }

        public Criteria and毕业省市In(List<String> values) {
            addCriterion("毕业省市 in", values, "毕业省市");
            return (Criteria) this;
        }

        public Criteria and毕业省市NotIn(List<String> values) {
            addCriterion("毕业省市 not in", values, "毕业省市");
            return (Criteria) this;
        }

        public Criteria and毕业省市Between(String value1, String value2) {
            addCriterion("毕业省市 between", value1, value2, "毕业省市");
            return (Criteria) this;
        }

        public Criteria and毕业省市NotBetween(String value1, String value2) {
            addCriterion("毕业省市 not between", value1, value2, "毕业省市");
            return (Criteria) this;
        }

        public Criteria and联培单位IsNull() {
            addCriterion("联培单位 is null");
            return (Criteria) this;
        }

        public Criteria and联培单位IsNotNull() {
            addCriterion("联培单位 is not null");
            return (Criteria) this;
        }

        public Criteria and联培单位EqualTo(String value) {
            addCriterion("联培单位 =", value, "联培单位");
            return (Criteria) this;
        }

        public Criteria and联培单位NotEqualTo(String value) {
            addCriterion("联培单位 <>", value, "联培单位");
            return (Criteria) this;
        }

        public Criteria and联培单位GreaterThan(String value) {
            addCriterion("联培单位 >", value, "联培单位");
            return (Criteria) this;
        }

        public Criteria and联培单位GreaterThanOrEqualTo(String value) {
            addCriterion("联培单位 >=", value, "联培单位");
            return (Criteria) this;
        }

        public Criteria and联培单位LessThan(String value) {
            addCriterion("联培单位 <", value, "联培单位");
            return (Criteria) this;
        }

        public Criteria and联培单位LessThanOrEqualTo(String value) {
            addCriterion("联培单位 <=", value, "联培单位");
            return (Criteria) this;
        }

        public Criteria and联培单位Like(String value) {
            addCriterion("联培单位 like", value, "联培单位");
            return (Criteria) this;
        }

        public Criteria and联培单位NotLike(String value) {
            addCriterion("联培单位 not like", value, "联培单位");
            return (Criteria) this;
        }

        public Criteria and联培单位In(List<String> values) {
            addCriterion("联培单位 in", values, "联培单位");
            return (Criteria) this;
        }

        public Criteria and联培单位NotIn(List<String> values) {
            addCriterion("联培单位 not in", values, "联培单位");
            return (Criteria) this;
        }

        public Criteria and联培单位Between(String value1, String value2) {
            addCriterion("联培单位 between", value1, value2, "联培单位");
            return (Criteria) this;
        }

        public Criteria and联培单位NotBetween(String value1, String value2) {
            addCriterion("联培单位 not between", value1, value2, "联培单位");
            return (Criteria) this;
        }

        public Criteria and年度IsNull() {
            addCriterion("年度 is null");
            return (Criteria) this;
        }

        public Criteria and年度IsNotNull() {
            addCriterion("年度 is not null");
            return (Criteria) this;
        }

        public Criteria and年度EqualTo(String value) {
            addCriterion("年度 =", value, "年度");
            return (Criteria) this;
        }

        public Criteria and年度NotEqualTo(String value) {
            addCriterion("年度 <>", value, "年度");
            return (Criteria) this;
        }

        public Criteria and年度GreaterThan(String value) {
            addCriterion("年度 >", value, "年度");
            return (Criteria) this;
        }

        public Criteria and年度GreaterThanOrEqualTo(String value) {
            addCriterion("年度 >=", value, "年度");
            return (Criteria) this;
        }

        public Criteria and年度LessThan(String value) {
            addCriterion("年度 <", value, "年度");
            return (Criteria) this;
        }

        public Criteria and年度LessThanOrEqualTo(String value) {
            addCriterion("年度 <=", value, "年度");
            return (Criteria) this;
        }

        public Criteria and年度Like(String value) {
            addCriterion("年度 like", value, "年度");
            return (Criteria) this;
        }

        public Criteria and年度NotLike(String value) {
            addCriterion("年度 not like", value, "年度");
            return (Criteria) this;
        }

        public Criteria and年度In(List<String> values) {
            addCriterion("年度 in", values, "年度");
            return (Criteria) this;
        }

        public Criteria and年度NotIn(List<String> values) {
            addCriterion("年度 not in", values, "年度");
            return (Criteria) this;
        }

        public Criteria and年度Between(String value1, String value2) {
            addCriterion("年度 between", value1, value2, "年度");
            return (Criteria) this;
        }

        public Criteria and年度NotBetween(String value1, String value2) {
            addCriterion("年度 not between", value1, value2, "年度");
            return (Criteria) this;
        }

        public Criteria and一志愿IsNull() {
            addCriterion("一志愿 is null");
            return (Criteria) this;
        }

        public Criteria and一志愿IsNotNull() {
            addCriterion("一志愿 is not null");
            return (Criteria) this;
        }

        public Criteria and一志愿EqualTo(String value) {
            addCriterion("一志愿 =", value, "一志愿");
            return (Criteria) this;
        }

        public Criteria and一志愿NotEqualTo(String value) {
            addCriterion("一志愿 <>", value, "一志愿");
            return (Criteria) this;
        }

        public Criteria and一志愿GreaterThan(String value) {
            addCriterion("一志愿 >", value, "一志愿");
            return (Criteria) this;
        }

        public Criteria and一志愿GreaterThanOrEqualTo(String value) {
            addCriterion("一志愿 >=", value, "一志愿");
            return (Criteria) this;
        }

        public Criteria and一志愿LessThan(String value) {
            addCriterion("一志愿 <", value, "一志愿");
            return (Criteria) this;
        }

        public Criteria and一志愿LessThanOrEqualTo(String value) {
            addCriterion("一志愿 <=", value, "一志愿");
            return (Criteria) this;
        }

        public Criteria and一志愿Like(String value) {
            addCriterion("一志愿 like", value, "一志愿");
            return (Criteria) this;
        }

        public Criteria and一志愿NotLike(String value) {
            addCriterion("一志愿 not like", value, "一志愿");
            return (Criteria) this;
        }

        public Criteria and一志愿In(List<String> values) {
            addCriterion("一志愿 in", values, "一志愿");
            return (Criteria) this;
        }

        public Criteria and一志愿NotIn(List<String> values) {
            addCriterion("一志愿 not in", values, "一志愿");
            return (Criteria) this;
        }

        public Criteria and一志愿Between(String value1, String value2) {
            addCriterion("一志愿 between", value1, value2, "一志愿");
            return (Criteria) this;
        }

        public Criteria and一志愿NotBetween(String value1, String value2) {
            addCriterion("一志愿 not between", value1, value2, "一志愿");
            return (Criteria) this;
        }

        public Criteria and生源地IsNull() {
            addCriterion("生源地 is null");
            return (Criteria) this;
        }

        public Criteria and生源地IsNotNull() {
            addCriterion("生源地 is not null");
            return (Criteria) this;
        }

        public Criteria and生源地EqualTo(String value) {
            addCriterion("生源地 =", value, "生源地");
            return (Criteria) this;
        }

        public Criteria and生源地NotEqualTo(String value) {
            addCriterion("生源地 <>", value, "生源地");
            return (Criteria) this;
        }

        public Criteria and生源地GreaterThan(String value) {
            addCriterion("生源地 >", value, "生源地");
            return (Criteria) this;
        }

        public Criteria and生源地GreaterThanOrEqualTo(String value) {
            addCriterion("生源地 >=", value, "生源地");
            return (Criteria) this;
        }

        public Criteria and生源地LessThan(String value) {
            addCriterion("生源地 <", value, "生源地");
            return (Criteria) this;
        }

        public Criteria and生源地LessThanOrEqualTo(String value) {
            addCriterion("生源地 <=", value, "生源地");
            return (Criteria) this;
        }

        public Criteria and生源地Like(String value) {
            addCriterion("生源地 like", value, "生源地");
            return (Criteria) this;
        }

        public Criteria and生源地NotLike(String value) {
            addCriterion("生源地 not like", value, "生源地");
            return (Criteria) this;
        }

        public Criteria and生源地In(List<String> values) {
            addCriterion("生源地 in", values, "生源地");
            return (Criteria) this;
        }

        public Criteria and生源地NotIn(List<String> values) {
            addCriterion("生源地 not in", values, "生源地");
            return (Criteria) this;
        }

        public Criteria and生源地Between(String value1, String value2) {
            addCriterion("生源地 between", value1, value2, "生源地");
            return (Criteria) this;
        }

        public Criteria and生源地NotBetween(String value1, String value2) {
            addCriterion("生源地 not between", value1, value2, "生源地");
            return (Criteria) this;
        }

        public Criteria and学位类别IsNull() {
            addCriterion("学位类别 is null");
            return (Criteria) this;
        }

        public Criteria and学位类别IsNotNull() {
            addCriterion("学位类别 is not null");
            return (Criteria) this;
        }

        public Criteria and学位类别EqualTo(String value) {
            addCriterion("学位类别 =", value, "学位类别");
            return (Criteria) this;
        }

        public Criteria and学位类别NotEqualTo(String value) {
            addCriterion("学位类别 <>", value, "学位类别");
            return (Criteria) this;
        }

        public Criteria and学位类别GreaterThan(String value) {
            addCriterion("学位类别 >", value, "学位类别");
            return (Criteria) this;
        }

        public Criteria and学位类别GreaterThanOrEqualTo(String value) {
            addCriterion("学位类别 >=", value, "学位类别");
            return (Criteria) this;
        }

        public Criteria and学位类别LessThan(String value) {
            addCriterion("学位类别 <", value, "学位类别");
            return (Criteria) this;
        }

        public Criteria and学位类别LessThanOrEqualTo(String value) {
            addCriterion("学位类别 <=", value, "学位类别");
            return (Criteria) this;
        }

        public Criteria and学位类别Like(String value) {
            addCriterion("学位类别 like", value, "学位类别");
            return (Criteria) this;
        }

        public Criteria and学位类别NotLike(String value) {
            addCriterion("学位类别 not like", value, "学位类别");
            return (Criteria) this;
        }

        public Criteria and学位类别In(List<String> values) {
            addCriterion("学位类别 in", values, "学位类别");
            return (Criteria) this;
        }

        public Criteria and学位类别NotIn(List<String> values) {
            addCriterion("学位类别 not in", values, "学位类别");
            return (Criteria) this;
        }

        public Criteria and学位类别Between(String value1, String value2) {
            addCriterion("学位类别 between", value1, value2, "学位类别");
            return (Criteria) this;
        }

        public Criteria and学位类别NotBetween(String value1, String value2) {
            addCriterion("学位类别 not between", value1, value2, "学位类别");
            return (Criteria) this;
        }

        public Criteria and学科门类IsNull() {
            addCriterion("学科门类 is null");
            return (Criteria) this;
        }

        public Criteria and学科门类IsNotNull() {
            addCriterion("学科门类 is not null");
            return (Criteria) this;
        }

        public Criteria and学科门类EqualTo(String value) {
            addCriterion("学科门类 =", value, "学科门类");
            return (Criteria) this;
        }

        public Criteria and学科门类NotEqualTo(String value) {
            addCriterion("学科门类 <>", value, "学科门类");
            return (Criteria) this;
        }

        public Criteria and学科门类GreaterThan(String value) {
            addCriterion("学科门类 >", value, "学科门类");
            return (Criteria) this;
        }

        public Criteria and学科门类GreaterThanOrEqualTo(String value) {
            addCriterion("学科门类 >=", value, "学科门类");
            return (Criteria) this;
        }

        public Criteria and学科门类LessThan(String value) {
            addCriterion("学科门类 <", value, "学科门类");
            return (Criteria) this;
        }

        public Criteria and学科门类LessThanOrEqualTo(String value) {
            addCriterion("学科门类 <=", value, "学科门类");
            return (Criteria) this;
        }

        public Criteria and学科门类Like(String value) {
            addCriterion("学科门类 like", value, "学科门类");
            return (Criteria) this;
        }

        public Criteria and学科门类NotLike(String value) {
            addCriterion("学科门类 not like", value, "学科门类");
            return (Criteria) this;
        }

        public Criteria and学科门类In(List<String> values) {
            addCriterion("学科门类 in", values, "学科门类");
            return (Criteria) this;
        }

        public Criteria and学科门类NotIn(List<String> values) {
            addCriterion("学科门类 not in", values, "学科门类");
            return (Criteria) this;
        }

        public Criteria and学科门类Between(String value1, String value2) {
            addCriterion("学科门类 between", value1, value2, "学科门类");
            return (Criteria) this;
        }

        public Criteria and学科门类NotBetween(String value1, String value2) {
            addCriterion("学科门类 not between", value1, value2, "学科门类");
            return (Criteria) this;
        }

        public Criteria and一级学科码IsNull() {
            addCriterion("一级学科码 is null");
            return (Criteria) this;
        }

        public Criteria and一级学科码IsNotNull() {
            addCriterion("一级学科码 is not null");
            return (Criteria) this;
        }

        public Criteria and一级学科码EqualTo(String value) {
            addCriterion("一级学科码 =", value, "一级学科码");
            return (Criteria) this;
        }

        public Criteria and一级学科码NotEqualTo(String value) {
            addCriterion("一级学科码 <>", value, "一级学科码");
            return (Criteria) this;
        }

        public Criteria and一级学科码GreaterThan(String value) {
            addCriterion("一级学科码 >", value, "一级学科码");
            return (Criteria) this;
        }

        public Criteria and一级学科码GreaterThanOrEqualTo(String value) {
            addCriterion("一级学科码 >=", value, "一级学科码");
            return (Criteria) this;
        }

        public Criteria and一级学科码LessThan(String value) {
            addCriterion("一级学科码 <", value, "一级学科码");
            return (Criteria) this;
        }

        public Criteria and一级学科码LessThanOrEqualTo(String value) {
            addCriterion("一级学科码 <=", value, "一级学科码");
            return (Criteria) this;
        }

        public Criteria and一级学科码Like(String value) {
            addCriterion("一级学科码 like", value, "一级学科码");
            return (Criteria) this;
        }

        public Criteria and一级学科码NotLike(String value) {
            addCriterion("一级学科码 not like", value, "一级学科码");
            return (Criteria) this;
        }

        public Criteria and一级学科码In(List<String> values) {
            addCriterion("一级学科码 in", values, "一级学科码");
            return (Criteria) this;
        }

        public Criteria and一级学科码NotIn(List<String> values) {
            addCriterion("一级学科码 not in", values, "一级学科码");
            return (Criteria) this;
        }

        public Criteria and一级学科码Between(String value1, String value2) {
            addCriterion("一级学科码 between", value1, value2, "一级学科码");
            return (Criteria) this;
        }

        public Criteria and一级学科码NotBetween(String value1, String value2) {
            addCriterion("一级学科码 not between", value1, value2, "一级学科码");
            return (Criteria) this;
        }

        public Criteria and一级学科IsNull() {
            addCriterion("一级学科 is null");
            return (Criteria) this;
        }

        public Criteria and一级学科IsNotNull() {
            addCriterion("一级学科 is not null");
            return (Criteria) this;
        }

        public Criteria and一级学科EqualTo(String value) {
            addCriterion("一级学科 =", value, "一级学科");
            return (Criteria) this;
        }

        public Criteria and一级学科NotEqualTo(String value) {
            addCriterion("一级学科 <>", value, "一级学科");
            return (Criteria) this;
        }

        public Criteria and一级学科GreaterThan(String value) {
            addCriterion("一级学科 >", value, "一级学科");
            return (Criteria) this;
        }

        public Criteria and一级学科GreaterThanOrEqualTo(String value) {
            addCriterion("一级学科 >=", value, "一级学科");
            return (Criteria) this;
        }

        public Criteria and一级学科LessThan(String value) {
            addCriterion("一级学科 <", value, "一级学科");
            return (Criteria) this;
        }

        public Criteria and一级学科LessThanOrEqualTo(String value) {
            addCriterion("一级学科 <=", value, "一级学科");
            return (Criteria) this;
        }

        public Criteria and一级学科Like(String value) {
            addCriterion("一级学科 like", value, "一级学科");
            return (Criteria) this;
        }

        public Criteria and一级学科NotLike(String value) {
            addCriterion("一级学科 not like", value, "一级学科");
            return (Criteria) this;
        }

        public Criteria and一级学科In(List<String> values) {
            addCriterion("一级学科 in", values, "一级学科");
            return (Criteria) this;
        }

        public Criteria and一级学科NotIn(List<String> values) {
            addCriterion("一级学科 not in", values, "一级学科");
            return (Criteria) this;
        }

        public Criteria and一级学科Between(String value1, String value2) {
            addCriterion("一级学科 between", value1, value2, "一级学科");
            return (Criteria) this;
        }

        public Criteria and一级学科NotBetween(String value1, String value2) {
            addCriterion("一级学科 not between", value1, value2, "一级学科");
            return (Criteria) this;
        }

        public Criteria and学习形式IsNull() {
            addCriterion("学习形式 is null");
            return (Criteria) this;
        }

        public Criteria and学习形式IsNotNull() {
            addCriterion("学习形式 is not null");
            return (Criteria) this;
        }

        public Criteria and学习形式EqualTo(String value) {
            addCriterion("学习形式 =", value, "学习形式");
            return (Criteria) this;
        }

        public Criteria and学习形式NotEqualTo(String value) {
            addCriterion("学习形式 <>", value, "学习形式");
            return (Criteria) this;
        }

        public Criteria and学习形式GreaterThan(String value) {
            addCriterion("学习形式 >", value, "学习形式");
            return (Criteria) this;
        }

        public Criteria and学习形式GreaterThanOrEqualTo(String value) {
            addCriterion("学习形式 >=", value, "学习形式");
            return (Criteria) this;
        }

        public Criteria and学习形式LessThan(String value) {
            addCriterion("学习形式 <", value, "学习形式");
            return (Criteria) this;
        }

        public Criteria and学习形式LessThanOrEqualTo(String value) {
            addCriterion("学习形式 <=", value, "学习形式");
            return (Criteria) this;
        }

        public Criteria and学习形式Like(String value) {
            addCriterion("学习形式 like", value, "学习形式");
            return (Criteria) this;
        }

        public Criteria and学习形式NotLike(String value) {
            addCriterion("学习形式 not like", value, "学习形式");
            return (Criteria) this;
        }

        public Criteria and学习形式In(List<String> values) {
            addCriterion("学习形式 in", values, "学习形式");
            return (Criteria) this;
        }

        public Criteria and学习形式NotIn(List<String> values) {
            addCriterion("学习形式 not in", values, "学习形式");
            return (Criteria) this;
        }

        public Criteria and学习形式Between(String value1, String value2) {
            addCriterion("学习形式 between", value1, value2, "学习形式");
            return (Criteria) this;
        }

        public Criteria and学习形式NotBetween(String value1, String value2) {
            addCriterion("学习形式 not between", value1, value2, "学习形式");
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