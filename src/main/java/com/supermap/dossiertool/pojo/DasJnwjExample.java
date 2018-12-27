package com.supermap.dossiertool.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DasJnwjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DasJnwjExample() {
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

        public Criteria andWjidIsNull() {
            addCriterion("WJID is null");
            return (Criteria) this;
        }

        public Criteria andWjidIsNotNull() {
            addCriterion("WJID is not null");
            return (Criteria) this;
        }

        public Criteria andWjidEqualTo(Object value) {
            addCriterion("WJID =", value, "wjid");
            return (Criteria) this;
        }

        public Criteria andWjidNotEqualTo(Object value) {
            addCriterion("WJID <>", value, "wjid");
            return (Criteria) this;
        }

        public Criteria andWjidGreaterThan(Object value) {
            addCriterion("WJID >", value, "wjid");
            return (Criteria) this;
        }

        public Criteria andWjidGreaterThanOrEqualTo(Object value) {
            addCriterion("WJID >=", value, "wjid");
            return (Criteria) this;
        }

        public Criteria andWjidLessThan(Object value) {
            addCriterion("WJID <", value, "wjid");
            return (Criteria) this;
        }

        public Criteria andWjidLessThanOrEqualTo(Object value) {
            addCriterion("WJID <=", value, "wjid");
            return (Criteria) this;
        }

        public Criteria andWjidIn(List<Object> values) {
            addCriterion("WJID in", values, "wjid");
            return (Criteria) this;
        }

        public Criteria andWjidNotIn(List<Object> values) {
            addCriterion("WJID not in", values, "wjid");
            return (Criteria) this;
        }

        public Criteria andWjidBetween(Object value1, Object value2) {
            addCriterion("WJID between", value1, value2, "wjid");
            return (Criteria) this;
        }

        public Criteria andWjidNotBetween(Object value1, Object value2) {
            addCriterion("WJID not between", value1, value2, "wjid");
            return (Criteria) this;
        }

        public Criteria andAjidIsNull() {
            addCriterion("AJID is null");
            return (Criteria) this;
        }

        public Criteria andAjidIsNotNull() {
            addCriterion("AJID is not null");
            return (Criteria) this;
        }

        public Criteria andAjidEqualTo(Object value) {
            addCriterion("AJID =", value, "ajid");
            return (Criteria) this;
        }

        public Criteria andAjidNotEqualTo(Object value) {
            addCriterion("AJID <>", value, "ajid");
            return (Criteria) this;
        }

        public Criteria andAjidGreaterThan(Object value) {
            addCriterion("AJID >", value, "ajid");
            return (Criteria) this;
        }

        public Criteria andAjidGreaterThanOrEqualTo(Object value) {
            addCriterion("AJID >=", value, "ajid");
            return (Criteria) this;
        }

        public Criteria andAjidLessThan(Object value) {
            addCriterion("AJID <", value, "ajid");
            return (Criteria) this;
        }

        public Criteria andAjidLessThanOrEqualTo(Object value) {
            addCriterion("AJID <=", value, "ajid");
            return (Criteria) this;
        }

        public Criteria andAjidIn(List<Object> values) {
            addCriterion("AJID in", values, "ajid");
            return (Criteria) this;
        }

        public Criteria andAjidNotIn(List<Object> values) {
            addCriterion("AJID not in", values, "ajid");
            return (Criteria) this;
        }

        public Criteria andAjidBetween(Object value1, Object value2) {
            addCriterion("AJID between", value1, value2, "ajid");
            return (Criteria) this;
        }

        public Criteria andAjidNotBetween(Object value1, Object value2) {
            addCriterion("AJID not between", value1, value2, "ajid");
            return (Criteria) this;
        }

        public Criteria andFwjidIsNull() {
            addCriterion("FWJID is null");
            return (Criteria) this;
        }

        public Criteria andFwjidIsNotNull() {
            addCriterion("FWJID is not null");
            return (Criteria) this;
        }

        public Criteria andFwjidEqualTo(Object value) {
            addCriterion("FWJID =", value, "fwjid");
            return (Criteria) this;
        }

        public Criteria andFwjidNotEqualTo(Object value) {
            addCriterion("FWJID <>", value, "fwjid");
            return (Criteria) this;
        }

        public Criteria andFwjidGreaterThan(Object value) {
            addCriterion("FWJID >", value, "fwjid");
            return (Criteria) this;
        }

        public Criteria andFwjidGreaterThanOrEqualTo(Object value) {
            addCriterion("FWJID >=", value, "fwjid");
            return (Criteria) this;
        }

        public Criteria andFwjidLessThan(Object value) {
            addCriterion("FWJID <", value, "fwjid");
            return (Criteria) this;
        }

        public Criteria andFwjidLessThanOrEqualTo(Object value) {
            addCriterion("FWJID <=", value, "fwjid");
            return (Criteria) this;
        }

        public Criteria andFwjidIn(List<Object> values) {
            addCriterion("FWJID in", values, "fwjid");
            return (Criteria) this;
        }

        public Criteria andFwjidNotIn(List<Object> values) {
            addCriterion("FWJID not in", values, "fwjid");
            return (Criteria) this;
        }

        public Criteria andFwjidBetween(Object value1, Object value2) {
            addCriterion("FWJID between", value1, value2, "fwjid");
            return (Criteria) this;
        }

        public Criteria andFwjidNotBetween(Object value1, Object value2) {
            addCriterion("FWJID not between", value1, value2, "fwjid");
            return (Criteria) this;
        }

        public Criteria andSxhIsNull() {
            addCriterion("SXH is null");
            return (Criteria) this;
        }

        public Criteria andSxhIsNotNull() {
            addCriterion("SXH is not null");
            return (Criteria) this;
        }

        public Criteria andSxhEqualTo(Long value) {
            addCriterion("SXH =", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhNotEqualTo(Long value) {
            addCriterion("SXH <>", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhGreaterThan(Long value) {
            addCriterion("SXH >", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhGreaterThanOrEqualTo(Long value) {
            addCriterion("SXH >=", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhLessThan(Long value) {
            addCriterion("SXH <", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhLessThanOrEqualTo(Long value) {
            addCriterion("SXH <=", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhIn(List<Long> values) {
            addCriterion("SXH in", values, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhNotIn(List<Long> values) {
            addCriterion("SXH not in", values, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhBetween(Long value1, Long value2) {
            addCriterion("SXH between", value1, value2, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhNotBetween(Long value1, Long value2) {
            addCriterion("SXH not between", value1, value2, "sxh");
            return (Criteria) this;
        }

        public Criteria andWhIsNull() {
            addCriterion("WH is null");
            return (Criteria) this;
        }

        public Criteria andWhIsNotNull() {
            addCriterion("WH is not null");
            return (Criteria) this;
        }

        public Criteria andWhEqualTo(String value) {
            addCriterion("WH =", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotEqualTo(String value) {
            addCriterion("WH <>", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhGreaterThan(String value) {
            addCriterion("WH >", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhGreaterThanOrEqualTo(String value) {
            addCriterion("WH >=", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhLessThan(String value) {
            addCriterion("WH <", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhLessThanOrEqualTo(String value) {
            addCriterion("WH <=", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhLike(String value) {
            addCriterion("WH like", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotLike(String value) {
            addCriterion("WH not like", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhIn(List<String> values) {
            addCriterion("WH in", values, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotIn(List<String> values) {
            addCriterion("WH not in", values, "wh");
            return (Criteria) this;
        }

        public Criteria andWhBetween(String value1, String value2) {
            addCriterion("WH between", value1, value2, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotBetween(String value1, String value2) {
            addCriterion("WH not between", value1, value2, "wh");
            return (Criteria) this;
        }

        public Criteria andZrzIsNull() {
            addCriterion("ZRZ is null");
            return (Criteria) this;
        }

        public Criteria andZrzIsNotNull() {
            addCriterion("ZRZ is not null");
            return (Criteria) this;
        }

        public Criteria andZrzEqualTo(String value) {
            addCriterion("ZRZ =", value, "zrz");
            return (Criteria) this;
        }

        public Criteria andZrzNotEqualTo(String value) {
            addCriterion("ZRZ <>", value, "zrz");
            return (Criteria) this;
        }

        public Criteria andZrzGreaterThan(String value) {
            addCriterion("ZRZ >", value, "zrz");
            return (Criteria) this;
        }

        public Criteria andZrzGreaterThanOrEqualTo(String value) {
            addCriterion("ZRZ >=", value, "zrz");
            return (Criteria) this;
        }

        public Criteria andZrzLessThan(String value) {
            addCriterion("ZRZ <", value, "zrz");
            return (Criteria) this;
        }

        public Criteria andZrzLessThanOrEqualTo(String value) {
            addCriterion("ZRZ <=", value, "zrz");
            return (Criteria) this;
        }

        public Criteria andZrzLike(String value) {
            addCriterion("ZRZ like", value, "zrz");
            return (Criteria) this;
        }

        public Criteria andZrzNotLike(String value) {
            addCriterion("ZRZ not like", value, "zrz");
            return (Criteria) this;
        }

        public Criteria andZrzIn(List<String> values) {
            addCriterion("ZRZ in", values, "zrz");
            return (Criteria) this;
        }

        public Criteria andZrzNotIn(List<String> values) {
            addCriterion("ZRZ not in", values, "zrz");
            return (Criteria) this;
        }

        public Criteria andZrzBetween(String value1, String value2) {
            addCriterion("ZRZ between", value1, value2, "zrz");
            return (Criteria) this;
        }

        public Criteria andZrzNotBetween(String value1, String value2) {
            addCriterion("ZRZ not between", value1, value2, "zrz");
            return (Criteria) this;
        }

        public Criteria andTmIsNull() {
            addCriterion("TM is null");
            return (Criteria) this;
        }

        public Criteria andTmIsNotNull() {
            addCriterion("TM is not null");
            return (Criteria) this;
        }

        public Criteria andTmEqualTo(String value) {
            addCriterion("TM =", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmNotEqualTo(String value) {
            addCriterion("TM <>", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmGreaterThan(String value) {
            addCriterion("TM >", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmGreaterThanOrEqualTo(String value) {
            addCriterion("TM >=", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmLessThan(String value) {
            addCriterion("TM <", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmLessThanOrEqualTo(String value) {
            addCriterion("TM <=", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmLike(String value) {
            addCriterion("TM like", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmNotLike(String value) {
            addCriterion("TM not like", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmIn(List<String> values) {
            addCriterion("TM in", values, "tm");
            return (Criteria) this;
        }

        public Criteria andTmNotIn(List<String> values) {
            addCriterion("TM not in", values, "tm");
            return (Criteria) this;
        }

        public Criteria andTmBetween(String value1, String value2) {
            addCriterion("TM between", value1, value2, "tm");
            return (Criteria) this;
        }

        public Criteria andTmNotBetween(String value1, String value2) {
            addCriterion("TM not between", value1, value2, "tm");
            return (Criteria) this;
        }

        public Criteria andRqIsNull() {
            addCriterion("RQ is null");
            return (Criteria) this;
        }

        public Criteria andRqIsNotNull() {
            addCriterion("RQ is not null");
            return (Criteria) this;
        }

        public Criteria andRqEqualTo(Date value) {
            addCriterion("RQ =", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqNotEqualTo(Date value) {
            addCriterion("RQ <>", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqGreaterThan(Date value) {
            addCriterion("RQ >", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqGreaterThanOrEqualTo(Date value) {
            addCriterion("RQ >=", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqLessThan(Date value) {
            addCriterion("RQ <", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqLessThanOrEqualTo(Date value) {
            addCriterion("RQ <=", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqIn(List<Date> values) {
            addCriterion("RQ in", values, "rq");
            return (Criteria) this;
        }

        public Criteria andRqNotIn(List<Date> values) {
            addCriterion("RQ not in", values, "rq");
            return (Criteria) this;
        }

        public Criteria andRqBetween(Date value1, Date value2) {
            addCriterion("RQ between", value1, value2, "rq");
            return (Criteria) this;
        }

        public Criteria andRqNotBetween(Date value1, Date value2) {
            addCriterion("RQ not between", value1, value2, "rq");
            return (Criteria) this;
        }

        public Criteria andYhIsNull() {
            addCriterion("YH is null");
            return (Criteria) this;
        }

        public Criteria andYhIsNotNull() {
            addCriterion("YH is not null");
            return (Criteria) this;
        }

        public Criteria andYhEqualTo(Long value) {
            addCriterion("YH =", value, "yh");
            return (Criteria) this;
        }

        public Criteria andYhNotEqualTo(Long value) {
            addCriterion("YH <>", value, "yh");
            return (Criteria) this;
        }

        public Criteria andYhGreaterThan(Long value) {
            addCriterion("YH >", value, "yh");
            return (Criteria) this;
        }

        public Criteria andYhGreaterThanOrEqualTo(Long value) {
            addCriterion("YH >=", value, "yh");
            return (Criteria) this;
        }

        public Criteria andYhLessThan(Long value) {
            addCriterion("YH <", value, "yh");
            return (Criteria) this;
        }

        public Criteria andYhLessThanOrEqualTo(Long value) {
            addCriterion("YH <=", value, "yh");
            return (Criteria) this;
        }

        public Criteria andYhIn(List<Long> values) {
            addCriterion("YH in", values, "yh");
            return (Criteria) this;
        }

        public Criteria andYhNotIn(List<Long> values) {
            addCriterion("YH not in", values, "yh");
            return (Criteria) this;
        }

        public Criteria andYhBetween(Long value1, Long value2) {
            addCriterion("YH between", value1, value2, "yh");
            return (Criteria) this;
        }

        public Criteria andYhNotBetween(Long value1, Long value2) {
            addCriterion("YH not between", value1, value2, "yh");
            return (Criteria) this;
        }

        public Criteria andJnqsyIsNull() {
            addCriterion("JNQSY is null");
            return (Criteria) this;
        }

        public Criteria andJnqsyIsNotNull() {
            addCriterion("JNQSY is not null");
            return (Criteria) this;
        }

        public Criteria andJnqsyEqualTo(Long value) {
            addCriterion("JNQSY =", value, "jnqsy");
            return (Criteria) this;
        }

        public Criteria andJnqsyNotEqualTo(Long value) {
            addCriterion("JNQSY <>", value, "jnqsy");
            return (Criteria) this;
        }

        public Criteria andJnqsyGreaterThan(Long value) {
            addCriterion("JNQSY >", value, "jnqsy");
            return (Criteria) this;
        }

        public Criteria andJnqsyGreaterThanOrEqualTo(Long value) {
            addCriterion("JNQSY >=", value, "jnqsy");
            return (Criteria) this;
        }

        public Criteria andJnqsyLessThan(Long value) {
            addCriterion("JNQSY <", value, "jnqsy");
            return (Criteria) this;
        }

        public Criteria andJnqsyLessThanOrEqualTo(Long value) {
            addCriterion("JNQSY <=", value, "jnqsy");
            return (Criteria) this;
        }

        public Criteria andJnqsyIn(List<Long> values) {
            addCriterion("JNQSY in", values, "jnqsy");
            return (Criteria) this;
        }

        public Criteria andJnqsyNotIn(List<Long> values) {
            addCriterion("JNQSY not in", values, "jnqsy");
            return (Criteria) this;
        }

        public Criteria andJnqsyBetween(Long value1, Long value2) {
            addCriterion("JNQSY between", value1, value2, "jnqsy");
            return (Criteria) this;
        }

        public Criteria andJnqsyNotBetween(Long value1, Long value2) {
            addCriterion("JNQSY not between", value1, value2, "jnqsy");
            return (Criteria) this;
        }

        public Criteria andWjztIsNull() {
            addCriterion("WJZT is null");
            return (Criteria) this;
        }

        public Criteria andWjztIsNotNull() {
            addCriterion("WJZT is not null");
            return (Criteria) this;
        }

        public Criteria andWjztEqualTo(Long value) {
            addCriterion("WJZT =", value, "wjzt");
            return (Criteria) this;
        }

        public Criteria andWjztNotEqualTo(Long value) {
            addCriterion("WJZT <>", value, "wjzt");
            return (Criteria) this;
        }

        public Criteria andWjztGreaterThan(Long value) {
            addCriterion("WJZT >", value, "wjzt");
            return (Criteria) this;
        }

        public Criteria andWjztGreaterThanOrEqualTo(Long value) {
            addCriterion("WJZT >=", value, "wjzt");
            return (Criteria) this;
        }

        public Criteria andWjztLessThan(Long value) {
            addCriterion("WJZT <", value, "wjzt");
            return (Criteria) this;
        }

        public Criteria andWjztLessThanOrEqualTo(Long value) {
            addCriterion("WJZT <=", value, "wjzt");
            return (Criteria) this;
        }

        public Criteria andWjztIn(List<Long> values) {
            addCriterion("WJZT in", values, "wjzt");
            return (Criteria) this;
        }

        public Criteria andWjztNotIn(List<Long> values) {
            addCriterion("WJZT not in", values, "wjzt");
            return (Criteria) this;
        }

        public Criteria andWjztBetween(Long value1, Long value2) {
            addCriterion("WJZT between", value1, value2, "wjzt");
            return (Criteria) this;
        }

        public Criteria andWjztNotBetween(Long value1, Long value2) {
            addCriterion("WJZT not between", value1, value2, "wjzt");
            return (Criteria) this;
        }

        public Criteria andYjfsIsNull() {
            addCriterion("YJFS is null");
            return (Criteria) this;
        }

        public Criteria andYjfsIsNotNull() {
            addCriterion("YJFS is not null");
            return (Criteria) this;
        }

        public Criteria andYjfsEqualTo(Long value) {
            addCriterion("YJFS =", value, "yjfs");
            return (Criteria) this;
        }

        public Criteria andYjfsNotEqualTo(Long value) {
            addCriterion("YJFS <>", value, "yjfs");
            return (Criteria) this;
        }

        public Criteria andYjfsGreaterThan(Long value) {
            addCriterion("YJFS >", value, "yjfs");
            return (Criteria) this;
        }

        public Criteria andYjfsGreaterThanOrEqualTo(Long value) {
            addCriterion("YJFS >=", value, "yjfs");
            return (Criteria) this;
        }

        public Criteria andYjfsLessThan(Long value) {
            addCriterion("YJFS <", value, "yjfs");
            return (Criteria) this;
        }

        public Criteria andYjfsLessThanOrEqualTo(Long value) {
            addCriterion("YJFS <=", value, "yjfs");
            return (Criteria) this;
        }

        public Criteria andYjfsIn(List<Long> values) {
            addCriterion("YJFS in", values, "yjfs");
            return (Criteria) this;
        }

        public Criteria andYjfsNotIn(List<Long> values) {
            addCriterion("YJFS not in", values, "yjfs");
            return (Criteria) this;
        }

        public Criteria andYjfsBetween(Long value1, Long value2) {
            addCriterion("YJFS between", value1, value2, "yjfs");
            return (Criteria) this;
        }

        public Criteria andYjfsNotBetween(Long value1, Long value2) {
            addCriterion("YJFS not between", value1, value2, "yjfs");
            return (Criteria) this;
        }

        public Criteria andFyjfsIsNull() {
            addCriterion("FYJFS is null");
            return (Criteria) this;
        }

        public Criteria andFyjfsIsNotNull() {
            addCriterion("FYJFS is not null");
            return (Criteria) this;
        }

        public Criteria andFyjfsEqualTo(Long value) {
            addCriterion("FYJFS =", value, "fyjfs");
            return (Criteria) this;
        }

        public Criteria andFyjfsNotEqualTo(Long value) {
            addCriterion("FYJFS <>", value, "fyjfs");
            return (Criteria) this;
        }

        public Criteria andFyjfsGreaterThan(Long value) {
            addCriterion("FYJFS >", value, "fyjfs");
            return (Criteria) this;
        }

        public Criteria andFyjfsGreaterThanOrEqualTo(Long value) {
            addCriterion("FYJFS >=", value, "fyjfs");
            return (Criteria) this;
        }

        public Criteria andFyjfsLessThan(Long value) {
            addCriterion("FYJFS <", value, "fyjfs");
            return (Criteria) this;
        }

        public Criteria andFyjfsLessThanOrEqualTo(Long value) {
            addCriterion("FYJFS <=", value, "fyjfs");
            return (Criteria) this;
        }

        public Criteria andFyjfsIn(List<Long> values) {
            addCriterion("FYJFS in", values, "fyjfs");
            return (Criteria) this;
        }

        public Criteria andFyjfsNotIn(List<Long> values) {
            addCriterion("FYJFS not in", values, "fyjfs");
            return (Criteria) this;
        }

        public Criteria andFyjfsBetween(Long value1, Long value2) {
            addCriterion("FYJFS between", value1, value2, "fyjfs");
            return (Criteria) this;
        }

        public Criteria andFyjfsNotBetween(Long value1, Long value2) {
            addCriterion("FYJFS not between", value1, value2, "fyjfs");
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

        public Criteria andWjlxIsNull() {
            addCriterion("WJLX is null");
            return (Criteria) this;
        }

        public Criteria andWjlxIsNotNull() {
            addCriterion("WJLX is not null");
            return (Criteria) this;
        }

        public Criteria andWjlxEqualTo(Long value) {
            addCriterion("WJLX =", value, "wjlx");
            return (Criteria) this;
        }

        public Criteria andWjlxNotEqualTo(Long value) {
            addCriterion("WJLX <>", value, "wjlx");
            return (Criteria) this;
        }

        public Criteria andWjlxGreaterThan(Long value) {
            addCriterion("WJLX >", value, "wjlx");
            return (Criteria) this;
        }

        public Criteria andWjlxGreaterThanOrEqualTo(Long value) {
            addCriterion("WJLX >=", value, "wjlx");
            return (Criteria) this;
        }

        public Criteria andWjlxLessThan(Long value) {
            addCriterion("WJLX <", value, "wjlx");
            return (Criteria) this;
        }

        public Criteria andWjlxLessThanOrEqualTo(Long value) {
            addCriterion("WJLX <=", value, "wjlx");
            return (Criteria) this;
        }

        public Criteria andWjlxIn(List<Long> values) {
            addCriterion("WJLX in", values, "wjlx");
            return (Criteria) this;
        }

        public Criteria andWjlxNotIn(List<Long> values) {
            addCriterion("WJLX not in", values, "wjlx");
            return (Criteria) this;
        }

        public Criteria andWjlxBetween(Long value1, Long value2) {
            addCriterion("WJLX between", value1, value2, "wjlx");
            return (Criteria) this;
        }

        public Criteria andWjlxNotBetween(Long value1, Long value2) {
            addCriterion("WJLX not between", value1, value2, "wjlx");
            return (Criteria) this;
        }

        public Criteria andFjxzmmIsNull() {
            addCriterion("FJXZMM is null");
            return (Criteria) this;
        }

        public Criteria andFjxzmmIsNotNull() {
            addCriterion("FJXZMM is not null");
            return (Criteria) this;
        }

        public Criteria andFjxzmmEqualTo(String value) {
            addCriterion("FJXZMM =", value, "fjxzmm");
            return (Criteria) this;
        }

        public Criteria andFjxzmmNotEqualTo(String value) {
            addCriterion("FJXZMM <>", value, "fjxzmm");
            return (Criteria) this;
        }

        public Criteria andFjxzmmGreaterThan(String value) {
            addCriterion("FJXZMM >", value, "fjxzmm");
            return (Criteria) this;
        }

        public Criteria andFjxzmmGreaterThanOrEqualTo(String value) {
            addCriterion("FJXZMM >=", value, "fjxzmm");
            return (Criteria) this;
        }

        public Criteria andFjxzmmLessThan(String value) {
            addCriterion("FJXZMM <", value, "fjxzmm");
            return (Criteria) this;
        }

        public Criteria andFjxzmmLessThanOrEqualTo(String value) {
            addCriterion("FJXZMM <=", value, "fjxzmm");
            return (Criteria) this;
        }

        public Criteria andFjxzmmLike(String value) {
            addCriterion("FJXZMM like", value, "fjxzmm");
            return (Criteria) this;
        }

        public Criteria andFjxzmmNotLike(String value) {
            addCriterion("FJXZMM not like", value, "fjxzmm");
            return (Criteria) this;
        }

        public Criteria andFjxzmmIn(List<String> values) {
            addCriterion("FJXZMM in", values, "fjxzmm");
            return (Criteria) this;
        }

        public Criteria andFjxzmmNotIn(List<String> values) {
            addCriterion("FJXZMM not in", values, "fjxzmm");
            return (Criteria) this;
        }

        public Criteria andFjxzmmBetween(String value1, String value2) {
            addCriterion("FJXZMM between", value1, value2, "fjxzmm");
            return (Criteria) this;
        }

        public Criteria andFjxzmmNotBetween(String value1, String value2) {
            addCriterion("FJXZMM not between", value1, value2, "fjxzmm");
            return (Criteria) this;
        }

        public Criteria andBlztIsNull() {
            addCriterion("BLZT is null");
            return (Criteria) this;
        }

        public Criteria andBlztIsNotNull() {
            addCriterion("BLZT is not null");
            return (Criteria) this;
        }

        public Criteria andBlztEqualTo(Long value) {
            addCriterion("BLZT =", value, "blzt");
            return (Criteria) this;
        }

        public Criteria andBlztNotEqualTo(Long value) {
            addCriterion("BLZT <>", value, "blzt");
            return (Criteria) this;
        }

        public Criteria andBlztGreaterThan(Long value) {
            addCriterion("BLZT >", value, "blzt");
            return (Criteria) this;
        }

        public Criteria andBlztGreaterThanOrEqualTo(Long value) {
            addCriterion("BLZT >=", value, "blzt");
            return (Criteria) this;
        }

        public Criteria andBlztLessThan(Long value) {
            addCriterion("BLZT <", value, "blzt");
            return (Criteria) this;
        }

        public Criteria andBlztLessThanOrEqualTo(Long value) {
            addCriterion("BLZT <=", value, "blzt");
            return (Criteria) this;
        }

        public Criteria andBlztIn(List<Long> values) {
            addCriterion("BLZT in", values, "blzt");
            return (Criteria) this;
        }

        public Criteria andBlztNotIn(List<Long> values) {
            addCriterion("BLZT not in", values, "blzt");
            return (Criteria) this;
        }

        public Criteria andBlztBetween(Long value1, Long value2) {
            addCriterion("BLZT between", value1, value2, "blzt");
            return (Criteria) this;
        }

        public Criteria andBlztNotBetween(Long value1, Long value2) {
            addCriterion("BLZT not between", value1, value2, "blzt");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("PROJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("PROJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("PROJECT_ID =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("PROJECT_ID <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("PROJECT_ID >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_ID >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("PROJECT_ID <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_ID <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("PROJECT_ID like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("PROJECT_ID not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("PROJECT_ID in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("PROJECT_ID not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("PROJECT_ID between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("PROJECT_ID not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andYsIsNull() {
            addCriterion("YS is null");
            return (Criteria) this;
        }

        public Criteria andYsIsNotNull() {
            addCriterion("YS is not null");
            return (Criteria) this;
        }

        public Criteria andYsEqualTo(Long value) {
            addCriterion("YS =", value, "ys");
            return (Criteria) this;
        }

        public Criteria andYsNotEqualTo(Long value) {
            addCriterion("YS <>", value, "ys");
            return (Criteria) this;
        }

        public Criteria andYsGreaterThan(Long value) {
            addCriterion("YS >", value, "ys");
            return (Criteria) this;
        }

        public Criteria andYsGreaterThanOrEqualTo(Long value) {
            addCriterion("YS >=", value, "ys");
            return (Criteria) this;
        }

        public Criteria andYsLessThan(Long value) {
            addCriterion("YS <", value, "ys");
            return (Criteria) this;
        }

        public Criteria andYsLessThanOrEqualTo(Long value) {
            addCriterion("YS <=", value, "ys");
            return (Criteria) this;
        }

        public Criteria andYsIn(List<Long> values) {
            addCriterion("YS in", values, "ys");
            return (Criteria) this;
        }

        public Criteria andYsNotIn(List<Long> values) {
            addCriterion("YS not in", values, "ys");
            return (Criteria) this;
        }

        public Criteria andYsBetween(Long value1, Long value2) {
            addCriterion("YS between", value1, value2, "ys");
            return (Criteria) this;
        }

        public Criteria andYsNotBetween(Long value1, Long value2) {
            addCriterion("YS not between", value1, value2, "ys");
            return (Criteria) this;
        }

        public Criteria andScrqIsNull() {
            addCriterion("SCRQ is null");
            return (Criteria) this;
        }

        public Criteria andScrqIsNotNull() {
            addCriterion("SCRQ is not null");
            return (Criteria) this;
        }

        public Criteria andScrqEqualTo(Date value) {
            addCriterion("SCRQ =", value, "scrq");
            return (Criteria) this;
        }

        public Criteria andScrqNotEqualTo(Date value) {
            addCriterion("SCRQ <>", value, "scrq");
            return (Criteria) this;
        }

        public Criteria andScrqGreaterThan(Date value) {
            addCriterion("SCRQ >", value, "scrq");
            return (Criteria) this;
        }

        public Criteria andScrqGreaterThanOrEqualTo(Date value) {
            addCriterion("SCRQ >=", value, "scrq");
            return (Criteria) this;
        }

        public Criteria andScrqLessThan(Date value) {
            addCriterion("SCRQ <", value, "scrq");
            return (Criteria) this;
        }

        public Criteria andScrqLessThanOrEqualTo(Date value) {
            addCriterion("SCRQ <=", value, "scrq");
            return (Criteria) this;
        }

        public Criteria andScrqIn(List<Date> values) {
            addCriterion("SCRQ in", values, "scrq");
            return (Criteria) this;
        }

        public Criteria andScrqNotIn(List<Date> values) {
            addCriterion("SCRQ not in", values, "scrq");
            return (Criteria) this;
        }

        public Criteria andScrqBetween(Date value1, Date value2) {
            addCriterion("SCRQ between", value1, value2, "scrq");
            return (Criteria) this;
        }

        public Criteria andScrqNotBetween(Date value1, Date value2) {
            addCriterion("SCRQ not between", value1, value2, "scrq");
            return (Criteria) this;
        }

        public Criteria andNodeidIsNull() {
            addCriterion("NODEID is null");
            return (Criteria) this;
        }

        public Criteria andNodeidIsNotNull() {
            addCriterion("NODEID is not null");
            return (Criteria) this;
        }

        public Criteria andNodeidEqualTo(Object value) {
            addCriterion("NODEID =", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotEqualTo(Object value) {
            addCriterion("NODEID <>", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThan(Object value) {
            addCriterion("NODEID >", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThanOrEqualTo(Object value) {
            addCriterion("NODEID >=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThan(Object value) {
            addCriterion("NODEID <", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThanOrEqualTo(Object value) {
            addCriterion("NODEID <=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidIn(List<Object> values) {
            addCriterion("NODEID in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotIn(List<Object> values) {
            addCriterion("NODEID not in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidBetween(Object value1, Object value2) {
            addCriterion("NODEID between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotBetween(Object value1, Object value2) {
            addCriterion("NODEID not between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andSxIsNull() {
            addCriterion("SX is null");
            return (Criteria) this;
        }

        public Criteria andSxIsNotNull() {
            addCriterion("SX is not null");
            return (Criteria) this;
        }

        public Criteria andSxEqualTo(Object value) {
            addCriterion("SX =", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxNotEqualTo(Object value) {
            addCriterion("SX <>", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxGreaterThan(Object value) {
            addCriterion("SX >", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxGreaterThanOrEqualTo(Object value) {
            addCriterion("SX >=", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxLessThan(Object value) {
            addCriterion("SX <", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxLessThanOrEqualTo(Object value) {
            addCriterion("SX <=", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxIn(List<Object> values) {
            addCriterion("SX in", values, "sx");
            return (Criteria) this;
        }

        public Criteria andSxNotIn(List<Object> values) {
            addCriterion("SX not in", values, "sx");
            return (Criteria) this;
        }

        public Criteria andSxBetween(Object value1, Object value2) {
            addCriterion("SX between", value1, value2, "sx");
            return (Criteria) this;
        }

        public Criteria andSxNotBetween(Object value1, Object value2) {
            addCriterion("SX not between", value1, value2, "sx");
            return (Criteria) this;
        }

        public Criteria andYwdhIsNull() {
            addCriterion("YWDH is null");
            return (Criteria) this;
        }

        public Criteria andYwdhIsNotNull() {
            addCriterion("YWDH is not null");
            return (Criteria) this;
        }

        public Criteria andYwdhEqualTo(Object value) {
            addCriterion("YWDH =", value, "ywdh");
            return (Criteria) this;
        }

        public Criteria andYwdhNotEqualTo(Object value) {
            addCriterion("YWDH <>", value, "ywdh");
            return (Criteria) this;
        }

        public Criteria andYwdhGreaterThan(Object value) {
            addCriterion("YWDH >", value, "ywdh");
            return (Criteria) this;
        }

        public Criteria andYwdhGreaterThanOrEqualTo(Object value) {
            addCriterion("YWDH >=", value, "ywdh");
            return (Criteria) this;
        }

        public Criteria andYwdhLessThan(Object value) {
            addCriterion("YWDH <", value, "ywdh");
            return (Criteria) this;
        }

        public Criteria andYwdhLessThanOrEqualTo(Object value) {
            addCriterion("YWDH <=", value, "ywdh");
            return (Criteria) this;
        }

        public Criteria andYwdhIn(List<Object> values) {
            addCriterion("YWDH in", values, "ywdh");
            return (Criteria) this;
        }

        public Criteria andYwdhNotIn(List<Object> values) {
            addCriterion("YWDH not in", values, "ywdh");
            return (Criteria) this;
        }

        public Criteria andYwdhBetween(Object value1, Object value2) {
            addCriterion("YWDH between", value1, value2, "ywdh");
            return (Criteria) this;
        }

        public Criteria andYwdhNotBetween(Object value1, Object value2) {
            addCriterion("YWDH not between", value1, value2, "ywdh");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("TENANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("TENANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(Object value) {
            addCriterion("TENANT_ID =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(Object value) {
            addCriterion("TENANT_ID <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(Object value) {
            addCriterion("TENANT_ID >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(Object value) {
            addCriterion("TENANT_ID >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(Object value) {
            addCriterion("TENANT_ID <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(Object value) {
            addCriterion("TENANT_ID <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<Object> values) {
            addCriterion("TENANT_ID in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<Object> values) {
            addCriterion("TENANT_ID not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(Object value1, Object value2) {
            addCriterion("TENANT_ID between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(Object value1, Object value2) {
            addCriterion("TENANT_ID not between", value1, value2, "tenantId");
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