package edu.shu.pojo;

import java.util.ArrayList;
import java.util.List;

public class ViewTkxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewTkxxExample() {
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

        public Criteria andBjidIsNull() {
            addCriterion("bjid is null");
            return (Criteria) this;
        }

        public Criteria andBjidIsNotNull() {
            addCriterion("bjid is not null");
            return (Criteria) this;
        }

        public Criteria andBjidEqualTo(Integer value) {
            addCriterion("bjid =", value, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidNotEqualTo(Integer value) {
            addCriterion("bjid <>", value, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidGreaterThan(Integer value) {
            addCriterion("bjid >", value, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bjid >=", value, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidLessThan(Integer value) {
            addCriterion("bjid <", value, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidLessThanOrEqualTo(Integer value) {
            addCriterion("bjid <=", value, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidIn(List<Integer> values) {
            addCriterion("bjid in", values, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidNotIn(List<Integer> values) {
            addCriterion("bjid not in", values, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidBetween(Integer value1, Integer value2) {
            addCriterion("bjid between", value1, value2, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidNotBetween(Integer value1, Integer value2) {
            addCriterion("bjid not between", value1, value2, "bjid");
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

        public Criteria andTkyyIsNull() {
            addCriterion("tkyy is null");
            return (Criteria) this;
        }

        public Criteria andTkyyIsNotNull() {
            addCriterion("tkyy is not null");
            return (Criteria) this;
        }

        public Criteria andTkyyEqualTo(String value) {
            addCriterion("tkyy =", value, "tkyy");
            return (Criteria) this;
        }

        public Criteria andTkyyNotEqualTo(String value) {
            addCriterion("tkyy <>", value, "tkyy");
            return (Criteria) this;
        }

        public Criteria andTkyyGreaterThan(String value) {
            addCriterion("tkyy >", value, "tkyy");
            return (Criteria) this;
        }

        public Criteria andTkyyGreaterThanOrEqualTo(String value) {
            addCriterion("tkyy >=", value, "tkyy");
            return (Criteria) this;
        }

        public Criteria andTkyyLessThan(String value) {
            addCriterion("tkyy <", value, "tkyy");
            return (Criteria) this;
        }

        public Criteria andTkyyLessThanOrEqualTo(String value) {
            addCriterion("tkyy <=", value, "tkyy");
            return (Criteria) this;
        }

        public Criteria andTkyyLike(String value) {
            addCriterion("tkyy like", value, "tkyy");
            return (Criteria) this;
        }

        public Criteria andTkyyNotLike(String value) {
            addCriterion("tkyy not like", value, "tkyy");
            return (Criteria) this;
        }

        public Criteria andTkyyIn(List<String> values) {
            addCriterion("tkyy in", values, "tkyy");
            return (Criteria) this;
        }

        public Criteria andTkyyNotIn(List<String> values) {
            addCriterion("tkyy not in", values, "tkyy");
            return (Criteria) this;
        }

        public Criteria andTkyyBetween(String value1, String value2) {
            addCriterion("tkyy between", value1, value2, "tkyy");
            return (Criteria) this;
        }

        public Criteria andTkyyNotBetween(String value1, String value2) {
            addCriterion("tkyy not between", value1, value2, "tkyy");
            return (Criteria) this;
        }

        public Criteria andYsksjIsNull() {
            addCriterion("ysksj is null");
            return (Criteria) this;
        }

        public Criteria andYsksjIsNotNull() {
            addCriterion("ysksj is not null");
            return (Criteria) this;
        }

        public Criteria andYsksjEqualTo(String value) {
            addCriterion("ysksj =", value, "ysksj");
            return (Criteria) this;
        }

        public Criteria andYsksjNotEqualTo(String value) {
            addCriterion("ysksj <>", value, "ysksj");
            return (Criteria) this;
        }

        public Criteria andYsksjGreaterThan(String value) {
            addCriterion("ysksj >", value, "ysksj");
            return (Criteria) this;
        }

        public Criteria andYsksjGreaterThanOrEqualTo(String value) {
            addCriterion("ysksj >=", value, "ysksj");
            return (Criteria) this;
        }

        public Criteria andYsksjLessThan(String value) {
            addCriterion("ysksj <", value, "ysksj");
            return (Criteria) this;
        }

        public Criteria andYsksjLessThanOrEqualTo(String value) {
            addCriterion("ysksj <=", value, "ysksj");
            return (Criteria) this;
        }

        public Criteria andYsksjLike(String value) {
            addCriterion("ysksj like", value, "ysksj");
            return (Criteria) this;
        }

        public Criteria andYsksjNotLike(String value) {
            addCriterion("ysksj not like", value, "ysksj");
            return (Criteria) this;
        }

        public Criteria andYsksjIn(List<String> values) {
            addCriterion("ysksj in", values, "ysksj");
            return (Criteria) this;
        }

        public Criteria andYsksjNotIn(List<String> values) {
            addCriterion("ysksj not in", values, "ysksj");
            return (Criteria) this;
        }

        public Criteria andYsksjBetween(String value1, String value2) {
            addCriterion("ysksj between", value1, value2, "ysksj");
            return (Criteria) this;
        }

        public Criteria andYsksjNotBetween(String value1, String value2) {
            addCriterion("ysksj not between", value1, value2, "ysksj");
            return (Criteria) this;
        }

        public Criteria andYskddIsNull() {
            addCriterion("yskdd is null");
            return (Criteria) this;
        }

        public Criteria andYskddIsNotNull() {
            addCriterion("yskdd is not null");
            return (Criteria) this;
        }

        public Criteria andYskddEqualTo(String value) {
            addCriterion("yskdd =", value, "yskdd");
            return (Criteria) this;
        }

        public Criteria andYskddNotEqualTo(String value) {
            addCriterion("yskdd <>", value, "yskdd");
            return (Criteria) this;
        }

        public Criteria andYskddGreaterThan(String value) {
            addCriterion("yskdd >", value, "yskdd");
            return (Criteria) this;
        }

        public Criteria andYskddGreaterThanOrEqualTo(String value) {
            addCriterion("yskdd >=", value, "yskdd");
            return (Criteria) this;
        }

        public Criteria andYskddLessThan(String value) {
            addCriterion("yskdd <", value, "yskdd");
            return (Criteria) this;
        }

        public Criteria andYskddLessThanOrEqualTo(String value) {
            addCriterion("yskdd <=", value, "yskdd");
            return (Criteria) this;
        }

        public Criteria andYskddLike(String value) {
            addCriterion("yskdd like", value, "yskdd");
            return (Criteria) this;
        }

        public Criteria andYskddNotLike(String value) {
            addCriterion("yskdd not like", value, "yskdd");
            return (Criteria) this;
        }

        public Criteria andYskddIn(List<String> values) {
            addCriterion("yskdd in", values, "yskdd");
            return (Criteria) this;
        }

        public Criteria andYskddNotIn(List<String> values) {
            addCriterion("yskdd not in", values, "yskdd");
            return (Criteria) this;
        }

        public Criteria andYskddBetween(String value1, String value2) {
            addCriterion("yskdd between", value1, value2, "yskdd");
            return (Criteria) this;
        }

        public Criteria andYskddNotBetween(String value1, String value2) {
            addCriterion("yskdd not between", value1, value2, "yskdd");
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

        public Criteria andSkddIsNull() {
            addCriterion("skdd is null");
            return (Criteria) this;
        }

        public Criteria andSkddIsNotNull() {
            addCriterion("skdd is not null");
            return (Criteria) this;
        }

        public Criteria andSkddEqualTo(String value) {
            addCriterion("skdd =", value, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddNotEqualTo(String value) {
            addCriterion("skdd <>", value, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddGreaterThan(String value) {
            addCriterion("skdd >", value, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddGreaterThanOrEqualTo(String value) {
            addCriterion("skdd >=", value, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddLessThan(String value) {
            addCriterion("skdd <", value, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddLessThanOrEqualTo(String value) {
            addCriterion("skdd <=", value, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddLike(String value) {
            addCriterion("skdd like", value, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddNotLike(String value) {
            addCriterion("skdd not like", value, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddIn(List<String> values) {
            addCriterion("skdd in", values, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddNotIn(List<String> values) {
            addCriterion("skdd not in", values, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddBetween(String value1, String value2) {
            addCriterion("skdd between", value1, value2, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddNotBetween(String value1, String value2) {
            addCriterion("skdd not between", value1, value2, "skdd");
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

        public Criteria andLxIsNull() {
            addCriterion("lx is null");
            return (Criteria) this;
        }

        public Criteria andLxIsNotNull() {
            addCriterion("lx is not null");
            return (Criteria) this;
        }

        public Criteria andLxEqualTo(String value) {
            addCriterion("lx =", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotEqualTo(String value) {
            addCriterion("lx <>", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxGreaterThan(String value) {
            addCriterion("lx >", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxGreaterThanOrEqualTo(String value) {
            addCriterion("lx >=", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxLessThan(String value) {
            addCriterion("lx <", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxLessThanOrEqualTo(String value) {
            addCriterion("lx <=", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxLike(String value) {
            addCriterion("lx like", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotLike(String value) {
            addCriterion("lx not like", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxIn(List<String> values) {
            addCriterion("lx in", values, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotIn(List<String> values) {
            addCriterion("lx not in", values, "lx");
            return (Criteria) this;
        }

        public Criteria andLxBetween(String value1, String value2) {
            addCriterion("lx between", value1, value2, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotBetween(String value1, String value2) {
            addCriterion("lx not between", value1, value2, "lx");
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