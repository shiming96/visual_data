package edu.shu.pojo;

import java.util.ArrayList;
import java.util.List;

public class ViewLxsjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewLxsjExample() {
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

        public Criteria and学院IsNull() {
            addCriterion("学院 is null");
            return (Criteria) this;
        }

        public Criteria and学院IsNotNull() {
            addCriterion("学院 is not null");
            return (Criteria) this;
        }

        public Criteria and学院EqualTo(String value) {
            addCriterion("学院 =", value, "学院");
            return (Criteria) this;
        }

        public Criteria and学院NotEqualTo(String value) {
            addCriterion("学院 <>", value, "学院");
            return (Criteria) this;
        }

        public Criteria and学院GreaterThan(String value) {
            addCriterion("学院 >", value, "学院");
            return (Criteria) this;
        }

        public Criteria and学院GreaterThanOrEqualTo(String value) {
            addCriterion("学院 >=", value, "学院");
            return (Criteria) this;
        }

        public Criteria and学院LessThan(String value) {
            addCriterion("学院 <", value, "学院");
            return (Criteria) this;
        }

        public Criteria and学院LessThanOrEqualTo(String value) {
            addCriterion("学院 <=", value, "学院");
            return (Criteria) this;
        }

        public Criteria and学院Like(String value) {
            addCriterion("学院 like", value, "学院");
            return (Criteria) this;
        }

        public Criteria and学院NotLike(String value) {
            addCriterion("学院 not like", value, "学院");
            return (Criteria) this;
        }

        public Criteria and学院In(List<String> values) {
            addCriterion("学院 in", values, "学院");
            return (Criteria) this;
        }

        public Criteria and学院NotIn(List<String> values) {
            addCriterion("学院 not in", values, "学院");
            return (Criteria) this;
        }

        public Criteria and学院Between(String value1, String value2) {
            addCriterion("学院 between", value1, value2, "学院");
            return (Criteria) this;
        }

        public Criteria and学院NotBetween(String value1, String value2) {
            addCriterion("学院 not between", value1, value2, "学院");
            return (Criteria) this;
        }

        public Criteria and留学类别IsNull() {
            addCriterion("留学类别 is null");
            return (Criteria) this;
        }

        public Criteria and留学类别IsNotNull() {
            addCriterion("留学类别 is not null");
            return (Criteria) this;
        }

        public Criteria and留学类别EqualTo(String value) {
            addCriterion("留学类别 =", value, "留学类别");
            return (Criteria) this;
        }

        public Criteria and留学类别NotEqualTo(String value) {
            addCriterion("留学类别 <>", value, "留学类别");
            return (Criteria) this;
        }

        public Criteria and留学类别GreaterThan(String value) {
            addCriterion("留学类别 >", value, "留学类别");
            return (Criteria) this;
        }

        public Criteria and留学类别GreaterThanOrEqualTo(String value) {
            addCriterion("留学类别 >=", value, "留学类别");
            return (Criteria) this;
        }

        public Criteria and留学类别LessThan(String value) {
            addCriterion("留学类别 <", value, "留学类别");
            return (Criteria) this;
        }

        public Criteria and留学类别LessThanOrEqualTo(String value) {
            addCriterion("留学类别 <=", value, "留学类别");
            return (Criteria) this;
        }

        public Criteria and留学类别Like(String value) {
            addCriterion("留学类别 like", value, "留学类别");
            return (Criteria) this;
        }

        public Criteria and留学类别NotLike(String value) {
            addCriterion("留学类别 not like", value, "留学类别");
            return (Criteria) this;
        }

        public Criteria and留学类别In(List<String> values) {
            addCriterion("留学类别 in", values, "留学类别");
            return (Criteria) this;
        }

        public Criteria and留学类别NotIn(List<String> values) {
            addCriterion("留学类别 not in", values, "留学类别");
            return (Criteria) this;
        }

        public Criteria and留学类别Between(String value1, String value2) {
            addCriterion("留学类别 between", value1, value2, "留学类别");
            return (Criteria) this;
        }

        public Criteria and留学类别NotBetween(String value1, String value2) {
            addCriterion("留学类别 not between", value1, value2, "留学类别");
            return (Criteria) this;
        }

        public Criteria and项目类别IsNull() {
            addCriterion("项目类别 is null");
            return (Criteria) this;
        }

        public Criteria and项目类别IsNotNull() {
            addCriterion("项目类别 is not null");
            return (Criteria) this;
        }

        public Criteria and项目类别EqualTo(String value) {
            addCriterion("项目类别 =", value, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别NotEqualTo(String value) {
            addCriterion("项目类别 <>", value, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别GreaterThan(String value) {
            addCriterion("项目类别 >", value, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别GreaterThanOrEqualTo(String value) {
            addCriterion("项目类别 >=", value, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别LessThan(String value) {
            addCriterion("项目类别 <", value, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别LessThanOrEqualTo(String value) {
            addCriterion("项目类别 <=", value, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别Like(String value) {
            addCriterion("项目类别 like", value, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别NotLike(String value) {
            addCriterion("项目类别 not like", value, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别In(List<String> values) {
            addCriterion("项目类别 in", values, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别NotIn(List<String> values) {
            addCriterion("项目类别 not in", values, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别Between(String value1, String value2) {
            addCriterion("项目类别 between", value1, value2, "项目类别");
            return (Criteria) this;
        }

        public Criteria and项目类别NotBetween(String value1, String value2) {
            addCriterion("项目类别 not between", value1, value2, "项目类别");
            return (Criteria) this;
        }

        public Criteria and派出时间IsNull() {
            addCriterion("派出时间 is null");
            return (Criteria) this;
        }

        public Criteria and派出时间IsNotNull() {
            addCriterion("派出时间 is not null");
            return (Criteria) this;
        }

        public Criteria and派出时间EqualTo(String value) {
            addCriterion("派出时间 =", value, "派出时间");
            return (Criteria) this;
        }

        public Criteria and派出时间NotEqualTo(String value) {
            addCriterion("派出时间 <>", value, "派出时间");
            return (Criteria) this;
        }

        public Criteria and派出时间GreaterThan(String value) {
            addCriterion("派出时间 >", value, "派出时间");
            return (Criteria) this;
        }

        public Criteria and派出时间GreaterThanOrEqualTo(String value) {
            addCriterion("派出时间 >=", value, "派出时间");
            return (Criteria) this;
        }

        public Criteria and派出时间LessThan(String value) {
            addCriterion("派出时间 <", value, "派出时间");
            return (Criteria) this;
        }

        public Criteria and派出时间LessThanOrEqualTo(String value) {
            addCriterion("派出时间 <=", value, "派出时间");
            return (Criteria) this;
        }

        public Criteria and派出时间Like(String value) {
            addCriterion("派出时间 like", value, "派出时间");
            return (Criteria) this;
        }

        public Criteria and派出时间NotLike(String value) {
            addCriterion("派出时间 not like", value, "派出时间");
            return (Criteria) this;
        }

        public Criteria and派出时间In(List<String> values) {
            addCriterion("派出时间 in", values, "派出时间");
            return (Criteria) this;
        }

        public Criteria and派出时间NotIn(List<String> values) {
            addCriterion("派出时间 not in", values, "派出时间");
            return (Criteria) this;
        }

        public Criteria and派出时间Between(String value1, String value2) {
            addCriterion("派出时间 between", value1, value2, "派出时间");
            return (Criteria) this;
        }

        public Criteria and派出时间NotBetween(String value1, String value2) {
            addCriterion("派出时间 not between", value1, value2, "派出时间");
            return (Criteria) this;
        }

        public Criteria and出访国家IsNull() {
            addCriterion("出访国家 is null");
            return (Criteria) this;
        }

        public Criteria and出访国家IsNotNull() {
            addCriterion("出访国家 is not null");
            return (Criteria) this;
        }

        public Criteria and出访国家EqualTo(String value) {
            addCriterion("出访国家 =", value, "出访国家");
            return (Criteria) this;
        }

        public Criteria and出访国家NotEqualTo(String value) {
            addCriterion("出访国家 <>", value, "出访国家");
            return (Criteria) this;
        }

        public Criteria and出访国家GreaterThan(String value) {
            addCriterion("出访国家 >", value, "出访国家");
            return (Criteria) this;
        }

        public Criteria and出访国家GreaterThanOrEqualTo(String value) {
            addCriterion("出访国家 >=", value, "出访国家");
            return (Criteria) this;
        }

        public Criteria and出访国家LessThan(String value) {
            addCriterion("出访国家 <", value, "出访国家");
            return (Criteria) this;
        }

        public Criteria and出访国家LessThanOrEqualTo(String value) {
            addCriterion("出访国家 <=", value, "出访国家");
            return (Criteria) this;
        }

        public Criteria and出访国家Like(String value) {
            addCriterion("出访国家 like", value, "出访国家");
            return (Criteria) this;
        }

        public Criteria and出访国家NotLike(String value) {
            addCriterion("出访国家 not like", value, "出访国家");
            return (Criteria) this;
        }

        public Criteria and出访国家In(List<String> values) {
            addCriterion("出访国家 in", values, "出访国家");
            return (Criteria) this;
        }

        public Criteria and出访国家NotIn(List<String> values) {
            addCriterion("出访国家 not in", values, "出访国家");
            return (Criteria) this;
        }

        public Criteria and出访国家Between(String value1, String value2) {
            addCriterion("出访国家 between", value1, value2, "出访国家");
            return (Criteria) this;
        }

        public Criteria and出访国家NotBetween(String value1, String value2) {
            addCriterion("出访国家 not between", value1, value2, "出访国家");
            return (Criteria) this;
        }

        public Criteria and出访学校IsNull() {
            addCriterion("出访学校 is null");
            return (Criteria) this;
        }

        public Criteria and出访学校IsNotNull() {
            addCriterion("出访学校 is not null");
            return (Criteria) this;
        }

        public Criteria and出访学校EqualTo(String value) {
            addCriterion("出访学校 =", value, "出访学校");
            return (Criteria) this;
        }

        public Criteria and出访学校NotEqualTo(String value) {
            addCriterion("出访学校 <>", value, "出访学校");
            return (Criteria) this;
        }

        public Criteria and出访学校GreaterThan(String value) {
            addCriterion("出访学校 >", value, "出访学校");
            return (Criteria) this;
        }

        public Criteria and出访学校GreaterThanOrEqualTo(String value) {
            addCriterion("出访学校 >=", value, "出访学校");
            return (Criteria) this;
        }

        public Criteria and出访学校LessThan(String value) {
            addCriterion("出访学校 <", value, "出访学校");
            return (Criteria) this;
        }

        public Criteria and出访学校LessThanOrEqualTo(String value) {
            addCriterion("出访学校 <=", value, "出访学校");
            return (Criteria) this;
        }

        public Criteria and出访学校Like(String value) {
            addCriterion("出访学校 like", value, "出访学校");
            return (Criteria) this;
        }

        public Criteria and出访学校NotLike(String value) {
            addCriterion("出访学校 not like", value, "出访学校");
            return (Criteria) this;
        }

        public Criteria and出访学校In(List<String> values) {
            addCriterion("出访学校 in", values, "出访学校");
            return (Criteria) this;
        }

        public Criteria and出访学校NotIn(List<String> values) {
            addCriterion("出访学校 not in", values, "出访学校");
            return (Criteria) this;
        }

        public Criteria and出访学校Between(String value1, String value2) {
            addCriterion("出访学校 between", value1, value2, "出访学校");
            return (Criteria) this;
        }

        public Criteria and出访学校NotBetween(String value1, String value2) {
            addCriterion("出访学校 not between", value1, value2, "出访学校");
            return (Criteria) this;
        }

        public Criteria and出访学校中文名称IsNull() {
            addCriterion("出访学校中文名称 is null");
            return (Criteria) this;
        }

        public Criteria and出访学校中文名称IsNotNull() {
            addCriterion("出访学校中文名称 is not null");
            return (Criteria) this;
        }

        public Criteria and出访学校中文名称EqualTo(String value) {
            addCriterion("出访学校中文名称 =", value, "出访学校中文名称");
            return (Criteria) this;
        }

        public Criteria and出访学校中文名称NotEqualTo(String value) {
            addCriterion("出访学校中文名称 <>", value, "出访学校中文名称");
            return (Criteria) this;
        }

        public Criteria and出访学校中文名称GreaterThan(String value) {
            addCriterion("出访学校中文名称 >", value, "出访学校中文名称");
            return (Criteria) this;
        }

        public Criteria and出访学校中文名称GreaterThanOrEqualTo(String value) {
            addCriterion("出访学校中文名称 >=", value, "出访学校中文名称");
            return (Criteria) this;
        }

        public Criteria and出访学校中文名称LessThan(String value) {
            addCriterion("出访学校中文名称 <", value, "出访学校中文名称");
            return (Criteria) this;
        }

        public Criteria and出访学校中文名称LessThanOrEqualTo(String value) {
            addCriterion("出访学校中文名称 <=", value, "出访学校中文名称");
            return (Criteria) this;
        }

        public Criteria and出访学校中文名称Like(String value) {
            addCriterion("出访学校中文名称 like", value, "出访学校中文名称");
            return (Criteria) this;
        }

        public Criteria and出访学校中文名称NotLike(String value) {
            addCriterion("出访学校中文名称 not like", value, "出访学校中文名称");
            return (Criteria) this;
        }

        public Criteria and出访学校中文名称In(List<String> values) {
            addCriterion("出访学校中文名称 in", values, "出访学校中文名称");
            return (Criteria) this;
        }

        public Criteria and出访学校中文名称NotIn(List<String> values) {
            addCriterion("出访学校中文名称 not in", values, "出访学校中文名称");
            return (Criteria) this;
        }

        public Criteria and出访学校中文名称Between(String value1, String value2) {
            addCriterion("出访学校中文名称 between", value1, value2, "出访学校中文名称");
            return (Criteria) this;
        }

        public Criteria and出访学校中文名称NotBetween(String value1, String value2) {
            addCriterion("出访学校中文名称 not between", value1, value2, "出访学校中文名称");
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