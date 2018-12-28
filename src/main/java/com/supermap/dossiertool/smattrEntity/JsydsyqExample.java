package com.supermap.dossiertool.smattrEntity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JsydsyqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JsydsyqExample() {
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

        public Criteria andBsmIsNull() {
            addCriterion("BSM is null");
            return (Criteria) this;
        }

        public Criteria andBsmIsNotNull() {
            addCriterion("BSM is not null");
            return (Criteria) this;
        }

        public Criteria andBsmEqualTo(String value) {
            addCriterion("BSM =", value, "bsm");
            return (Criteria) this;
        }

        public Criteria andBsmNotEqualTo(String value) {
            addCriterion("BSM <>", value, "bsm");
            return (Criteria) this;
        }

        public Criteria andBsmGreaterThan(String value) {
            addCriterion("BSM >", value, "bsm");
            return (Criteria) this;
        }

        public Criteria andBsmGreaterThanOrEqualTo(String value) {
            addCriterion("BSM >=", value, "bsm");
            return (Criteria) this;
        }

        public Criteria andBsmLessThan(String value) {
            addCriterion("BSM <", value, "bsm");
            return (Criteria) this;
        }

        public Criteria andBsmLessThanOrEqualTo(String value) {
            addCriterion("BSM <=", value, "bsm");
            return (Criteria) this;
        }

        public Criteria andBsmIn(List<String> values) {
            addCriterion("BSM in", values, "bsm");
            return (Criteria) this;
        }

        public Criteria andBsmNotIn(List<String> values) {
            addCriterion("BSM not in", values, "bsm");
            return (Criteria) this;
        }

        public Criteria andBsmBetween(String value1, String value2) {
            addCriterion("BSM between", value1, value2, "bsm");
            return (Criteria) this;
        }

        public Criteria andBsmNotBetween(String value1, String value2) {
            addCriterion("BSM not between", value1, value2, "bsm");
            return (Criteria) this;
        }

        public Criteria andObjectidIsNull() {
            addCriterion("OBJECTID is null");
            return (Criteria) this;
        }

        public Criteria andObjectidIsNotNull() {
            addCriterion("OBJECTID is not null");
            return (Criteria) this;
        }

        public Criteria andObjectidEqualTo(BigDecimal value) {
            addCriterion("OBJECTID =", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidNotEqualTo(BigDecimal value) {
            addCriterion("OBJECTID <>", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidGreaterThan(BigDecimal value) {
            addCriterion("OBJECTID >", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OBJECTID >=", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidLessThan(BigDecimal value) {
            addCriterion("OBJECTID <", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OBJECTID <=", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidIn(List<BigDecimal> values) {
            addCriterion("OBJECTID in", values, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidNotIn(List<BigDecimal> values) {
            addCriterion("OBJECTID not in", values, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OBJECTID between", value1, value2, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OBJECTID not between", value1, value2, "objectid");
            return (Criteria) this;
        }

        public Criteria andYsdmIsNull() {
            addCriterion("YSDM is null");
            return (Criteria) this;
        }

        public Criteria andYsdmIsNotNull() {
            addCriterion("YSDM is not null");
            return (Criteria) this;
        }

        public Criteria andYsdmEqualTo(String value) {
            addCriterion("YSDM =", value, "ysdm");
            return (Criteria) this;
        }

        public Criteria andYsdmNotEqualTo(String value) {
            addCriterion("YSDM <>", value, "ysdm");
            return (Criteria) this;
        }

        public Criteria andYsdmGreaterThan(String value) {
            addCriterion("YSDM >", value, "ysdm");
            return (Criteria) this;
        }

        public Criteria andYsdmGreaterThanOrEqualTo(String value) {
            addCriterion("YSDM >=", value, "ysdm");
            return (Criteria) this;
        }

        public Criteria andYsdmLessThan(String value) {
            addCriterion("YSDM <", value, "ysdm");
            return (Criteria) this;
        }

        public Criteria andYsdmLessThanOrEqualTo(String value) {
            addCriterion("YSDM <=", value, "ysdm");
            return (Criteria) this;
        }

        public Criteria andYsdmIn(List<String> values) {
            addCriterion("YSDM in", values, "ysdm");
            return (Criteria) this;
        }

        public Criteria andYsdmNotIn(List<String> values) {
            addCriterion("YSDM not in", values, "ysdm");
            return (Criteria) this;
        }

        public Criteria andYsdmBetween(String value1, String value2) {
            addCriterion("YSDM between", value1, value2, "ysdm");
            return (Criteria) this;
        }

        public Criteria andYsdmNotBetween(String value1, String value2) {
            addCriterion("YSDM not between", value1, value2, "ysdm");
            return (Criteria) this;
        }

        public Criteria andZddmIsNull() {
            addCriterion("ZDDM is null");
            return (Criteria) this;
        }

        public Criteria andZddmIsNotNull() {
            addCriterion("ZDDM is not null");
            return (Criteria) this;
        }

        public Criteria andZddmEqualTo(String value) {
            addCriterion("ZDDM =", value, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmNotEqualTo(String value) {
            addCriterion("ZDDM <>", value, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmGreaterThan(String value) {
            addCriterion("ZDDM >", value, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmGreaterThanOrEqualTo(String value) {
            addCriterion("ZDDM >=", value, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmLessThan(String value) {
            addCriterion("ZDDM <", value, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmLessThanOrEqualTo(String value) {
            addCriterion("ZDDM <=", value, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmIn(List<String> values) {
            addCriterion("ZDDM in", values, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmNotIn(List<String> values) {
            addCriterion("ZDDM not in", values, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmBetween(String value1, String value2) {
            addCriterion("ZDDM between", value1, value2, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmNotBetween(String value1, String value2) {
            addCriterion("ZDDM not between", value1, value2, "zddm");
            return (Criteria) this;
        }

        public Criteria andBdcdybsmIsNull() {
            addCriterion("BDCDYBSM is null");
            return (Criteria) this;
        }

        public Criteria andBdcdybsmIsNotNull() {
            addCriterion("BDCDYBSM is not null");
            return (Criteria) this;
        }

        public Criteria andBdcdybsmEqualTo(String value) {
            addCriterion("BDCDYBSM =", value, "bdcdybsm");
            return (Criteria) this;
        }

        public Criteria andBdcdybsmNotEqualTo(String value) {
            addCriterion("BDCDYBSM <>", value, "bdcdybsm");
            return (Criteria) this;
        }

        public Criteria andBdcdybsmGreaterThan(String value) {
            addCriterion("BDCDYBSM >", value, "bdcdybsm");
            return (Criteria) this;
        }

        public Criteria andBdcdybsmGreaterThanOrEqualTo(String value) {
            addCriterion("BDCDYBSM >=", value, "bdcdybsm");
            return (Criteria) this;
        }

        public Criteria andBdcdybsmLessThan(String value) {
            addCriterion("BDCDYBSM <", value, "bdcdybsm");
            return (Criteria) this;
        }

        public Criteria andBdcdybsmLessThanOrEqualTo(String value) {
            addCriterion("BDCDYBSM <=", value, "bdcdybsm");
            return (Criteria) this;
        }

        public Criteria andBdcdybsmIn(List<String> values) {
            addCriterion("BDCDYBSM in", values, "bdcdybsm");
            return (Criteria) this;
        }

        public Criteria andBdcdybsmNotIn(List<String> values) {
            addCriterion("BDCDYBSM not in", values, "bdcdybsm");
            return (Criteria) this;
        }

        public Criteria andBdcdybsmBetween(String value1, String value2) {
            addCriterion("BDCDYBSM between", value1, value2, "bdcdybsm");
            return (Criteria) this;
        }

        public Criteria andBdcdybsmNotBetween(String value1, String value2) {
            addCriterion("BDCDYBSM not between", value1, value2, "bdcdybsm");
            return (Criteria) this;
        }

        public Criteria andBdcdyhIsNull() {
            addCriterion("BDCDYH is null");
            return (Criteria) this;
        }

        public Criteria andBdcdyhIsNotNull() {
            addCriterion("BDCDYH is not null");
            return (Criteria) this;
        }

        public Criteria andBdcdyhEqualTo(String value) {
            addCriterion("BDCDYH =", value, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhNotEqualTo(String value) {
            addCriterion("BDCDYH <>", value, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhGreaterThan(String value) {
            addCriterion("BDCDYH >", value, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhGreaterThanOrEqualTo(String value) {
            addCriterion("BDCDYH >=", value, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhLessThan(String value) {
            addCriterion("BDCDYH <", value, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhLessThanOrEqualTo(String value) {
            addCriterion("BDCDYH <=", value, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhIn(List<String> values) {
            addCriterion("BDCDYH in", values, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhNotIn(List<String> values) {
            addCriterion("BDCDYH not in", values, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhBetween(String value1, String value2) {
            addCriterion("BDCDYH between", value1, value2, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhNotBetween(String value1, String value2) {
            addCriterion("BDCDYH not between", value1, value2, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andYwhIsNull() {
            addCriterion("YWH is null");
            return (Criteria) this;
        }

        public Criteria andYwhIsNotNull() {
            addCriterion("YWH is not null");
            return (Criteria) this;
        }

        public Criteria andYwhEqualTo(String value) {
            addCriterion("YWH =", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhNotEqualTo(String value) {
            addCriterion("YWH <>", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhGreaterThan(String value) {
            addCriterion("YWH >", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhGreaterThanOrEqualTo(String value) {
            addCriterion("YWH >=", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhLessThan(String value) {
            addCriterion("YWH <", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhLessThanOrEqualTo(String value) {
            addCriterion("YWH <=", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhIn(List<String> values) {
            addCriterion("YWH in", values, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhNotIn(List<String> values) {
            addCriterion("YWH not in", values, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhBetween(String value1, String value2) {
            addCriterion("YWH between", value1, value2, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhNotBetween(String value1, String value2) {
            addCriterion("YWH not between", value1, value2, "ywh");
            return (Criteria) this;
        }

        public Criteria andQllxIsNull() {
            addCriterion("QLLX is null");
            return (Criteria) this;
        }

        public Criteria andQllxIsNotNull() {
            addCriterion("QLLX is not null");
            return (Criteria) this;
        }

        public Criteria andQllxEqualTo(String value) {
            addCriterion("QLLX =", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxNotEqualTo(String value) {
            addCriterion("QLLX <>", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxGreaterThan(String value) {
            addCriterion("QLLX >", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxGreaterThanOrEqualTo(String value) {
            addCriterion("QLLX >=", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxLessThan(String value) {
            addCriterion("QLLX <", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxLessThanOrEqualTo(String value) {
            addCriterion("QLLX <=", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxIn(List<String> values) {
            addCriterion("QLLX in", values, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxNotIn(List<String> values) {
            addCriterion("QLLX not in", values, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxBetween(String value1, String value2) {
            addCriterion("QLLX between", value1, value2, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxNotBetween(String value1, String value2) {
            addCriterion("QLLX not between", value1, value2, "qllx");
            return (Criteria) this;
        }

        public Criteria andDjlxIsNull() {
            addCriterion("DJLX is null");
            return (Criteria) this;
        }

        public Criteria andDjlxIsNotNull() {
            addCriterion("DJLX is not null");
            return (Criteria) this;
        }

        public Criteria andDjlxEqualTo(String value) {
            addCriterion("DJLX =", value, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxNotEqualTo(String value) {
            addCriterion("DJLX <>", value, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxGreaterThan(String value) {
            addCriterion("DJLX >", value, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxGreaterThanOrEqualTo(String value) {
            addCriterion("DJLX >=", value, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxLessThan(String value) {
            addCriterion("DJLX <", value, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxLessThanOrEqualTo(String value) {
            addCriterion("DJLX <=", value, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxIn(List<String> values) {
            addCriterion("DJLX in", values, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxNotIn(List<String> values) {
            addCriterion("DJLX not in", values, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxBetween(String value1, String value2) {
            addCriterion("DJLX between", value1, value2, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxNotBetween(String value1, String value2) {
            addCriterion("DJLX not between", value1, value2, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjyyIsNull() {
            addCriterion("DJYY is null");
            return (Criteria) this;
        }

        public Criteria andDjyyIsNotNull() {
            addCriterion("DJYY is not null");
            return (Criteria) this;
        }

        public Criteria andDjyyEqualTo(String value) {
            addCriterion("DJYY =", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyNotEqualTo(String value) {
            addCriterion("DJYY <>", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyGreaterThan(String value) {
            addCriterion("DJYY >", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyGreaterThanOrEqualTo(String value) {
            addCriterion("DJYY >=", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyLessThan(String value) {
            addCriterion("DJYY <", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyLessThanOrEqualTo(String value) {
            addCriterion("DJYY <=", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyIn(List<String> values) {
            addCriterion("DJYY in", values, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyNotIn(List<String> values) {
            addCriterion("DJYY not in", values, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyBetween(String value1, String value2) {
            addCriterion("DJYY between", value1, value2, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyNotBetween(String value1, String value2) {
            addCriterion("DJYY not between", value1, value2, "djyy");
            return (Criteria) this;
        }

        public Criteria andSyqmjIsNull() {
            addCriterion("SYQMJ is null");
            return (Criteria) this;
        }

        public Criteria andSyqmjIsNotNull() {
            addCriterion("SYQMJ is not null");
            return (Criteria) this;
        }

        public Criteria andSyqmjEqualTo(BigDecimal value) {
            addCriterion("SYQMJ =", value, "syqmj");
            return (Criteria) this;
        }

        public Criteria andSyqmjNotEqualTo(BigDecimal value) {
            addCriterion("SYQMJ <>", value, "syqmj");
            return (Criteria) this;
        }

        public Criteria andSyqmjGreaterThan(BigDecimal value) {
            addCriterion("SYQMJ >", value, "syqmj");
            return (Criteria) this;
        }

        public Criteria andSyqmjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SYQMJ >=", value, "syqmj");
            return (Criteria) this;
        }

        public Criteria andSyqmjLessThan(BigDecimal value) {
            addCriterion("SYQMJ <", value, "syqmj");
            return (Criteria) this;
        }

        public Criteria andSyqmjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SYQMJ <=", value, "syqmj");
            return (Criteria) this;
        }

        public Criteria andSyqmjIn(List<BigDecimal> values) {
            addCriterion("SYQMJ in", values, "syqmj");
            return (Criteria) this;
        }

        public Criteria andSyqmjNotIn(List<BigDecimal> values) {
            addCriterion("SYQMJ not in", values, "syqmj");
            return (Criteria) this;
        }

        public Criteria andSyqmjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYQMJ between", value1, value2, "syqmj");
            return (Criteria) this;
        }

        public Criteria andSyqmjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYQMJ not between", value1, value2, "syqmj");
            return (Criteria) this;
        }

        public Criteria andSyqqssjIsNull() {
            addCriterion("SYQQSSJ is null");
            return (Criteria) this;
        }

        public Criteria andSyqqssjIsNotNull() {
            addCriterion("SYQQSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSyqqssjEqualTo(Date value) {
            addCriterion("SYQQSSJ =", value, "syqqssj");
            return (Criteria) this;
        }

        public Criteria andSyqqssjNotEqualTo(Date value) {
            addCriterion("SYQQSSJ <>", value, "syqqssj");
            return (Criteria) this;
        }

        public Criteria andSyqqssjGreaterThan(Date value) {
            addCriterion("SYQQSSJ >", value, "syqqssj");
            return (Criteria) this;
        }

        public Criteria andSyqqssjGreaterThanOrEqualTo(Date value) {
            addCriterion("SYQQSSJ >=", value, "syqqssj");
            return (Criteria) this;
        }

        public Criteria andSyqqssjLessThan(Date value) {
            addCriterion("SYQQSSJ <", value, "syqqssj");
            return (Criteria) this;
        }

        public Criteria andSyqqssjLessThanOrEqualTo(Date value) {
            addCriterion("SYQQSSJ <=", value, "syqqssj");
            return (Criteria) this;
        }

        public Criteria andSyqqssjIn(List<Date> values) {
            addCriterion("SYQQSSJ in", values, "syqqssj");
            return (Criteria) this;
        }

        public Criteria andSyqqssjNotIn(List<Date> values) {
            addCriterion("SYQQSSJ not in", values, "syqqssj");
            return (Criteria) this;
        }

        public Criteria andSyqqssjBetween(Date value1, Date value2) {
            addCriterion("SYQQSSJ between", value1, value2, "syqqssj");
            return (Criteria) this;
        }

        public Criteria andSyqqssjNotBetween(Date value1, Date value2) {
            addCriterion("SYQQSSJ not between", value1, value2, "syqqssj");
            return (Criteria) this;
        }

        public Criteria andSyqjssjIsNull() {
            addCriterion("SYQJSSJ is null");
            return (Criteria) this;
        }

        public Criteria andSyqjssjIsNotNull() {
            addCriterion("SYQJSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSyqjssjEqualTo(Date value) {
            addCriterion("SYQJSSJ =", value, "syqjssj");
            return (Criteria) this;
        }

        public Criteria andSyqjssjNotEqualTo(Date value) {
            addCriterion("SYQJSSJ <>", value, "syqjssj");
            return (Criteria) this;
        }

        public Criteria andSyqjssjGreaterThan(Date value) {
            addCriterion("SYQJSSJ >", value, "syqjssj");
            return (Criteria) this;
        }

        public Criteria andSyqjssjGreaterThanOrEqualTo(Date value) {
            addCriterion("SYQJSSJ >=", value, "syqjssj");
            return (Criteria) this;
        }

        public Criteria andSyqjssjLessThan(Date value) {
            addCriterion("SYQJSSJ <", value, "syqjssj");
            return (Criteria) this;
        }

        public Criteria andSyqjssjLessThanOrEqualTo(Date value) {
            addCriterion("SYQJSSJ <=", value, "syqjssj");
            return (Criteria) this;
        }

        public Criteria andSyqjssjIn(List<Date> values) {
            addCriterion("SYQJSSJ in", values, "syqjssj");
            return (Criteria) this;
        }

        public Criteria andSyqjssjNotIn(List<Date> values) {
            addCriterion("SYQJSSJ not in", values, "syqjssj");
            return (Criteria) this;
        }

        public Criteria andSyqjssjBetween(Date value1, Date value2) {
            addCriterion("SYQJSSJ between", value1, value2, "syqjssj");
            return (Criteria) this;
        }

        public Criteria andSyqjssjNotBetween(Date value1, Date value2) {
            addCriterion("SYQJSSJ not between", value1, value2, "syqjssj");
            return (Criteria) this;
        }

        public Criteria andQdjgIsNull() {
            addCriterion("QDJG is null");
            return (Criteria) this;
        }

        public Criteria andQdjgIsNotNull() {
            addCriterion("QDJG is not null");
            return (Criteria) this;
        }

        public Criteria andQdjgEqualTo(BigDecimal value) {
            addCriterion("QDJG =", value, "qdjg");
            return (Criteria) this;
        }

        public Criteria andQdjgNotEqualTo(BigDecimal value) {
            addCriterion("QDJG <>", value, "qdjg");
            return (Criteria) this;
        }

        public Criteria andQdjgGreaterThan(BigDecimal value) {
            addCriterion("QDJG >", value, "qdjg");
            return (Criteria) this;
        }

        public Criteria andQdjgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QDJG >=", value, "qdjg");
            return (Criteria) this;
        }

        public Criteria andQdjgLessThan(BigDecimal value) {
            addCriterion("QDJG <", value, "qdjg");
            return (Criteria) this;
        }

        public Criteria andQdjgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QDJG <=", value, "qdjg");
            return (Criteria) this;
        }

        public Criteria andQdjgIn(List<BigDecimal> values) {
            addCriterion("QDJG in", values, "qdjg");
            return (Criteria) this;
        }

        public Criteria andQdjgNotIn(List<BigDecimal> values) {
            addCriterion("QDJG not in", values, "qdjg");
            return (Criteria) this;
        }

        public Criteria andQdjgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QDJG between", value1, value2, "qdjg");
            return (Criteria) this;
        }

        public Criteria andQdjgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QDJG not between", value1, value2, "qdjg");
            return (Criteria) this;
        }

        public Criteria andBdcqzhIsNull() {
            addCriterion("BDCQZH is null");
            return (Criteria) this;
        }

        public Criteria andBdcqzhIsNotNull() {
            addCriterion("BDCQZH is not null");
            return (Criteria) this;
        }

        public Criteria andBdcqzhEqualTo(String value) {
            addCriterion("BDCQZH =", value, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhNotEqualTo(String value) {
            addCriterion("BDCQZH <>", value, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhGreaterThan(String value) {
            addCriterion("BDCQZH >", value, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhGreaterThanOrEqualTo(String value) {
            addCriterion("BDCQZH >=", value, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhLessThan(String value) {
            addCriterion("BDCQZH <", value, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhLessThanOrEqualTo(String value) {
            addCriterion("BDCQZH <=", value, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhIn(List<String> values) {
            addCriterion("BDCQZH in", values, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhNotIn(List<String> values) {
            addCriterion("BDCQZH not in", values, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhBetween(String value1, String value2) {
            addCriterion("BDCQZH between", value1, value2, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhNotBetween(String value1, String value2) {
            addCriterion("BDCQZH not between", value1, value2, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andQxdmIsNull() {
            addCriterion("QXDM is null");
            return (Criteria) this;
        }

        public Criteria andQxdmIsNotNull() {
            addCriterion("QXDM is not null");
            return (Criteria) this;
        }

        public Criteria andQxdmEqualTo(String value) {
            addCriterion("QXDM =", value, "qxdm");
            return (Criteria) this;
        }

        public Criteria andQxdmNotEqualTo(String value) {
            addCriterion("QXDM <>", value, "qxdm");
            return (Criteria) this;
        }

        public Criteria andQxdmGreaterThan(String value) {
            addCriterion("QXDM >", value, "qxdm");
            return (Criteria) this;
        }

        public Criteria andQxdmGreaterThanOrEqualTo(String value) {
            addCriterion("QXDM >=", value, "qxdm");
            return (Criteria) this;
        }

        public Criteria andQxdmLessThan(String value) {
            addCriterion("QXDM <", value, "qxdm");
            return (Criteria) this;
        }

        public Criteria andQxdmLessThanOrEqualTo(String value) {
            addCriterion("QXDM <=", value, "qxdm");
            return (Criteria) this;
        }

        public Criteria andQxdmIn(List<String> values) {
            addCriterion("QXDM in", values, "qxdm");
            return (Criteria) this;
        }

        public Criteria andQxdmNotIn(List<String> values) {
            addCriterion("QXDM not in", values, "qxdm");
            return (Criteria) this;
        }

        public Criteria andQxdmBetween(String value1, String value2) {
            addCriterion("QXDM between", value1, value2, "qxdm");
            return (Criteria) this;
        }

        public Criteria andQxdmNotBetween(String value1, String value2) {
            addCriterion("QXDM not between", value1, value2, "qxdm");
            return (Criteria) this;
        }

        public Criteria andDjjgIsNull() {
            addCriterion("DJJG is null");
            return (Criteria) this;
        }

        public Criteria andDjjgIsNotNull() {
            addCriterion("DJJG is not null");
            return (Criteria) this;
        }

        public Criteria andDjjgEqualTo(String value) {
            addCriterion("DJJG =", value, "djjg");
            return (Criteria) this;
        }

        public Criteria andDjjgNotEqualTo(String value) {
            addCriterion("DJJG <>", value, "djjg");
            return (Criteria) this;
        }

        public Criteria andDjjgGreaterThan(String value) {
            addCriterion("DJJG >", value, "djjg");
            return (Criteria) this;
        }

        public Criteria andDjjgGreaterThanOrEqualTo(String value) {
            addCriterion("DJJG >=", value, "djjg");
            return (Criteria) this;
        }

        public Criteria andDjjgLessThan(String value) {
            addCriterion("DJJG <", value, "djjg");
            return (Criteria) this;
        }

        public Criteria andDjjgLessThanOrEqualTo(String value) {
            addCriterion("DJJG <=", value, "djjg");
            return (Criteria) this;
        }

        public Criteria andDjjgIn(List<String> values) {
            addCriterion("DJJG in", values, "djjg");
            return (Criteria) this;
        }

        public Criteria andDjjgNotIn(List<String> values) {
            addCriterion("DJJG not in", values, "djjg");
            return (Criteria) this;
        }

        public Criteria andDjjgBetween(String value1, String value2) {
            addCriterion("DJJG between", value1, value2, "djjg");
            return (Criteria) this;
        }

        public Criteria andDjjgNotBetween(String value1, String value2) {
            addCriterion("DJJG not between", value1, value2, "djjg");
            return (Criteria) this;
        }

        public Criteria andDbrIsNull() {
            addCriterion("DBR is null");
            return (Criteria) this;
        }

        public Criteria andDbrIsNotNull() {
            addCriterion("DBR is not null");
            return (Criteria) this;
        }

        public Criteria andDbrEqualTo(String value) {
            addCriterion("DBR =", value, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrNotEqualTo(String value) {
            addCriterion("DBR <>", value, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrGreaterThan(String value) {
            addCriterion("DBR >", value, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrGreaterThanOrEqualTo(String value) {
            addCriterion("DBR >=", value, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrLessThan(String value) {
            addCriterion("DBR <", value, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrLessThanOrEqualTo(String value) {
            addCriterion("DBR <=", value, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrIn(List<String> values) {
            addCriterion("DBR in", values, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrNotIn(List<String> values) {
            addCriterion("DBR not in", values, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrBetween(String value1, String value2) {
            addCriterion("DBR between", value1, value2, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrNotBetween(String value1, String value2) {
            addCriterion("DBR not between", value1, value2, "dbr");
            return (Criteria) this;
        }

        public Criteria andDjsjIsNull() {
            addCriterion("DJSJ is null");
            return (Criteria) this;
        }

        public Criteria andDjsjIsNotNull() {
            addCriterion("DJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andDjsjEqualTo(Date value) {
            addCriterion("DJSJ =", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotEqualTo(Date value) {
            addCriterion("DJSJ <>", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjGreaterThan(Date value) {
            addCriterion("DJSJ >", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("DJSJ >=", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjLessThan(Date value) {
            addCriterion("DJSJ <", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjLessThanOrEqualTo(Date value) {
            addCriterion("DJSJ <=", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjIn(List<Date> values) {
            addCriterion("DJSJ in", values, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotIn(List<Date> values) {
            addCriterion("DJSJ not in", values, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjBetween(Date value1, Date value2) {
            addCriterion("DJSJ between", value1, value2, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotBetween(Date value1, Date value2) {
            addCriterion("DJSJ not between", value1, value2, "djsj");
            return (Criteria) this;
        }

        public Criteria andFjIsNull() {
            addCriterion("FJ is null");
            return (Criteria) this;
        }

        public Criteria andFjIsNotNull() {
            addCriterion("FJ is not null");
            return (Criteria) this;
        }

        public Criteria andFjEqualTo(String value) {
            addCriterion("FJ =", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjNotEqualTo(String value) {
            addCriterion("FJ <>", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjGreaterThan(String value) {
            addCriterion("FJ >", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjGreaterThanOrEqualTo(String value) {
            addCriterion("FJ >=", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjLessThan(String value) {
            addCriterion("FJ <", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjLessThanOrEqualTo(String value) {
            addCriterion("FJ <=", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjIn(List<String> values) {
            addCriterion("FJ in", values, "fj");
            return (Criteria) this;
        }

        public Criteria andFjNotIn(List<String> values) {
            addCriterion("FJ not in", values, "fj");
            return (Criteria) this;
        }

        public Criteria andFjBetween(String value1, String value2) {
            addCriterion("FJ between", value1, value2, "fj");
            return (Criteria) this;
        }

        public Criteria andFjNotBetween(String value1, String value2) {
            addCriterion("FJ not between", value1, value2, "fj");
            return (Criteria) this;
        }

        public Criteria andQsztIsNull() {
            addCriterion("QSZT is null");
            return (Criteria) this;
        }

        public Criteria andQsztIsNotNull() {
            addCriterion("QSZT is not null");
            return (Criteria) this;
        }

        public Criteria andQsztEqualTo(String value) {
            addCriterion("QSZT =", value, "qszt");
            return (Criteria) this;
        }

        public Criteria andQsztNotEqualTo(String value) {
            addCriterion("QSZT <>", value, "qszt");
            return (Criteria) this;
        }

        public Criteria andQsztGreaterThan(String value) {
            addCriterion("QSZT >", value, "qszt");
            return (Criteria) this;
        }

        public Criteria andQsztGreaterThanOrEqualTo(String value) {
            addCriterion("QSZT >=", value, "qszt");
            return (Criteria) this;
        }

        public Criteria andQsztLessThan(String value) {
            addCriterion("QSZT <", value, "qszt");
            return (Criteria) this;
        }

        public Criteria andQsztLessThanOrEqualTo(String value) {
            addCriterion("QSZT <=", value, "qszt");
            return (Criteria) this;
        }

        public Criteria andQsztIn(List<String> values) {
            addCriterion("QSZT in", values, "qszt");
            return (Criteria) this;
        }

        public Criteria andQsztNotIn(List<String> values) {
            addCriterion("QSZT not in", values, "qszt");
            return (Criteria) this;
        }

        public Criteria andQsztBetween(String value1, String value2) {
            addCriterion("QSZT between", value1, value2, "qszt");
            return (Criteria) this;
        }

        public Criteria andQsztNotBetween(String value1, String value2) {
            addCriterion("QSZT not between", value1, value2, "qszt");
            return (Criteria) this;
        }

        public Criteria andZxywhIsNull() {
            addCriterion("ZXYWH is null");
            return (Criteria) this;
        }

        public Criteria andZxywhIsNotNull() {
            addCriterion("ZXYWH is not null");
            return (Criteria) this;
        }

        public Criteria andZxywhEqualTo(String value) {
            addCriterion("ZXYWH =", value, "zxywh");
            return (Criteria) this;
        }

        public Criteria andZxywhNotEqualTo(String value) {
            addCriterion("ZXYWH <>", value, "zxywh");
            return (Criteria) this;
        }

        public Criteria andZxywhGreaterThan(String value) {
            addCriterion("ZXYWH >", value, "zxywh");
            return (Criteria) this;
        }

        public Criteria andZxywhGreaterThanOrEqualTo(String value) {
            addCriterion("ZXYWH >=", value, "zxywh");
            return (Criteria) this;
        }

        public Criteria andZxywhLessThan(String value) {
            addCriterion("ZXYWH <", value, "zxywh");
            return (Criteria) this;
        }

        public Criteria andZxywhLessThanOrEqualTo(String value) {
            addCriterion("ZXYWH <=", value, "zxywh");
            return (Criteria) this;
        }

        public Criteria andZxywhIn(List<String> values) {
            addCriterion("ZXYWH in", values, "zxywh");
            return (Criteria) this;
        }

        public Criteria andZxywhNotIn(List<String> values) {
            addCriterion("ZXYWH not in", values, "zxywh");
            return (Criteria) this;
        }

        public Criteria andZxywhBetween(String value1, String value2) {
            addCriterion("ZXYWH between", value1, value2, "zxywh");
            return (Criteria) this;
        }

        public Criteria andZxywhNotBetween(String value1, String value2) {
            addCriterion("ZXYWH not between", value1, value2, "zxywh");
            return (Criteria) this;
        }

        public Criteria andZxsjIsNull() {
            addCriterion("ZXSJ is null");
            return (Criteria) this;
        }

        public Criteria andZxsjIsNotNull() {
            addCriterion("ZXSJ is not null");
            return (Criteria) this;
        }

        public Criteria andZxsjEqualTo(Date value) {
            addCriterion("ZXSJ =", value, "zxsj");
            return (Criteria) this;
        }

        public Criteria andZxsjNotEqualTo(Date value) {
            addCriterion("ZXSJ <>", value, "zxsj");
            return (Criteria) this;
        }

        public Criteria andZxsjGreaterThan(Date value) {
            addCriterion("ZXSJ >", value, "zxsj");
            return (Criteria) this;
        }

        public Criteria andZxsjGreaterThanOrEqualTo(Date value) {
            addCriterion("ZXSJ >=", value, "zxsj");
            return (Criteria) this;
        }

        public Criteria andZxsjLessThan(Date value) {
            addCriterion("ZXSJ <", value, "zxsj");
            return (Criteria) this;
        }

        public Criteria andZxsjLessThanOrEqualTo(Date value) {
            addCriterion("ZXSJ <=", value, "zxsj");
            return (Criteria) this;
        }

        public Criteria andZxsjIn(List<Date> values) {
            addCriterion("ZXSJ in", values, "zxsj");
            return (Criteria) this;
        }

        public Criteria andZxsjNotIn(List<Date> values) {
            addCriterion("ZXSJ not in", values, "zxsj");
            return (Criteria) this;
        }

        public Criteria andZxsjBetween(Date value1, Date value2) {
            addCriterion("ZXSJ between", value1, value2, "zxsj");
            return (Criteria) this;
        }

        public Criteria andZxsjNotBetween(Date value1, Date value2) {
            addCriterion("ZXSJ not between", value1, value2, "zxsj");
            return (Criteria) this;
        }

        public Criteria andZxyyIsNull() {
            addCriterion("ZXYY is null");
            return (Criteria) this;
        }

        public Criteria andZxyyIsNotNull() {
            addCriterion("ZXYY is not null");
            return (Criteria) this;
        }

        public Criteria andZxyyEqualTo(String value) {
            addCriterion("ZXYY =", value, "zxyy");
            return (Criteria) this;
        }

        public Criteria andZxyyNotEqualTo(String value) {
            addCriterion("ZXYY <>", value, "zxyy");
            return (Criteria) this;
        }

        public Criteria andZxyyGreaterThan(String value) {
            addCriterion("ZXYY >", value, "zxyy");
            return (Criteria) this;
        }

        public Criteria andZxyyGreaterThanOrEqualTo(String value) {
            addCriterion("ZXYY >=", value, "zxyy");
            return (Criteria) this;
        }

        public Criteria andZxyyLessThan(String value) {
            addCriterion("ZXYY <", value, "zxyy");
            return (Criteria) this;
        }

        public Criteria andZxyyLessThanOrEqualTo(String value) {
            addCriterion("ZXYY <=", value, "zxyy");
            return (Criteria) this;
        }

        public Criteria andZxyyIn(List<String> values) {
            addCriterion("ZXYY in", values, "zxyy");
            return (Criteria) this;
        }

        public Criteria andZxyyNotIn(List<String> values) {
            addCriterion("ZXYY not in", values, "zxyy");
            return (Criteria) this;
        }

        public Criteria andZxyyBetween(String value1, String value2) {
            addCriterion("ZXYY between", value1, value2, "zxyy");
            return (Criteria) this;
        }

        public Criteria andZxyyNotBetween(String value1, String value2) {
            addCriterion("ZXYY not between", value1, value2, "zxyy");
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

        public Criteria andBlztEqualTo(String value) {
            addCriterion("BLZT =", value, "blzt");
            return (Criteria) this;
        }

        public Criteria andBlztNotEqualTo(String value) {
            addCriterion("BLZT <>", value, "blzt");
            return (Criteria) this;
        }

        public Criteria andBlztGreaterThan(String value) {
            addCriterion("BLZT >", value, "blzt");
            return (Criteria) this;
        }

        public Criteria andBlztGreaterThanOrEqualTo(String value) {
            addCriterion("BLZT >=", value, "blzt");
            return (Criteria) this;
        }

        public Criteria andBlztLessThan(String value) {
            addCriterion("BLZT <", value, "blzt");
            return (Criteria) this;
        }

        public Criteria andBlztLessThanOrEqualTo(String value) {
            addCriterion("BLZT <=", value, "blzt");
            return (Criteria) this;
        }

        public Criteria andBlztIn(List<String> values) {
            addCriterion("BLZT in", values, "blzt");
            return (Criteria) this;
        }

        public Criteria andBlztNotIn(List<String> values) {
            addCriterion("BLZT not in", values, "blzt");
            return (Criteria) this;
        }

        public Criteria andBlztBetween(String value1, String value2) {
            addCriterion("BLZT between", value1, value2, "blzt");
            return (Criteria) this;
        }

        public Criteria andBlztNotBetween(String value1, String value2) {
            addCriterion("BLZT not between", value1, value2, "blzt");
            return (Criteria) this;
        }

        public Criteria andDaqzhIsNull() {
            addCriterion("DAQZH is null");
            return (Criteria) this;
        }

        public Criteria andDaqzhIsNotNull() {
            addCriterion("DAQZH is not null");
            return (Criteria) this;
        }

        public Criteria andDaqzhEqualTo(String value) {
            addCriterion("DAQZH =", value, "daqzh");
            return (Criteria) this;
        }

        public Criteria andDaqzhNotEqualTo(String value) {
            addCriterion("DAQZH <>", value, "daqzh");
            return (Criteria) this;
        }

        public Criteria andDaqzhGreaterThan(String value) {
            addCriterion("DAQZH >", value, "daqzh");
            return (Criteria) this;
        }

        public Criteria andDaqzhGreaterThanOrEqualTo(String value) {
            addCriterion("DAQZH >=", value, "daqzh");
            return (Criteria) this;
        }

        public Criteria andDaqzhLessThan(String value) {
            addCriterion("DAQZH <", value, "daqzh");
            return (Criteria) this;
        }

        public Criteria andDaqzhLessThanOrEqualTo(String value) {
            addCriterion("DAQZH <=", value, "daqzh");
            return (Criteria) this;
        }

        public Criteria andDaqzhIn(List<String> values) {
            addCriterion("DAQZH in", values, "daqzh");
            return (Criteria) this;
        }

        public Criteria andDaqzhNotIn(List<String> values) {
            addCriterion("DAQZH not in", values, "daqzh");
            return (Criteria) this;
        }

        public Criteria andDaqzhBetween(String value1, String value2) {
            addCriterion("DAQZH between", value1, value2, "daqzh");
            return (Criteria) this;
        }

        public Criteria andDaqzhNotBetween(String value1, String value2) {
            addCriterion("DAQZH not between", value1, value2, "daqzh");
            return (Criteria) this;
        }

        public Criteria andDandIsNull() {
            addCriterion("DAND is null");
            return (Criteria) this;
        }

        public Criteria andDandIsNotNull() {
            addCriterion("DAND is not null");
            return (Criteria) this;
        }

        public Criteria andDandEqualTo(String value) {
            addCriterion("DAND =", value, "dand");
            return (Criteria) this;
        }

        public Criteria andDandNotEqualTo(String value) {
            addCriterion("DAND <>", value, "dand");
            return (Criteria) this;
        }

        public Criteria andDandGreaterThan(String value) {
            addCriterion("DAND >", value, "dand");
            return (Criteria) this;
        }

        public Criteria andDandGreaterThanOrEqualTo(String value) {
            addCriterion("DAND >=", value, "dand");
            return (Criteria) this;
        }

        public Criteria andDandLessThan(String value) {
            addCriterion("DAND <", value, "dand");
            return (Criteria) this;
        }

        public Criteria andDandLessThanOrEqualTo(String value) {
            addCriterion("DAND <=", value, "dand");
            return (Criteria) this;
        }

        public Criteria andDandIn(List<String> values) {
            addCriterion("DAND in", values, "dand");
            return (Criteria) this;
        }

        public Criteria andDandNotIn(List<String> values) {
            addCriterion("DAND not in", values, "dand");
            return (Criteria) this;
        }

        public Criteria andDandBetween(String value1, String value2) {
            addCriterion("DAND between", value1, value2, "dand");
            return (Criteria) this;
        }

        public Criteria andDandNotBetween(String value1, String value2) {
            addCriterion("DAND not between", value1, value2, "dand");
            return (Criteria) this;
        }

        public Criteria andDaghIsNull() {
            addCriterion("DAGH is null");
            return (Criteria) this;
        }

        public Criteria andDaghIsNotNull() {
            addCriterion("DAGH is not null");
            return (Criteria) this;
        }

        public Criteria andDaghEqualTo(String value) {
            addCriterion("DAGH =", value, "dagh");
            return (Criteria) this;
        }

        public Criteria andDaghNotEqualTo(String value) {
            addCriterion("DAGH <>", value, "dagh");
            return (Criteria) this;
        }

        public Criteria andDaghGreaterThan(String value) {
            addCriterion("DAGH >", value, "dagh");
            return (Criteria) this;
        }

        public Criteria andDaghGreaterThanOrEqualTo(String value) {
            addCriterion("DAGH >=", value, "dagh");
            return (Criteria) this;
        }

        public Criteria andDaghLessThan(String value) {
            addCriterion("DAGH <", value, "dagh");
            return (Criteria) this;
        }

        public Criteria andDaghLessThanOrEqualTo(String value) {
            addCriterion("DAGH <=", value, "dagh");
            return (Criteria) this;
        }

        public Criteria andDaghIn(List<String> values) {
            addCriterion("DAGH in", values, "dagh");
            return (Criteria) this;
        }

        public Criteria andDaghNotIn(List<String> values) {
            addCriterion("DAGH not in", values, "dagh");
            return (Criteria) this;
        }

        public Criteria andDaghBetween(String value1, String value2) {
            addCriterion("DAGH between", value1, value2, "dagh");
            return (Criteria) this;
        }

        public Criteria andDaghNotBetween(String value1, String value2) {
            addCriterion("DAGH not between", value1, value2, "dagh");
            return (Criteria) this;
        }

        public Criteria andDahhIsNull() {
            addCriterion("DAHH is null");
            return (Criteria) this;
        }

        public Criteria andDahhIsNotNull() {
            addCriterion("DAHH is not null");
            return (Criteria) this;
        }

        public Criteria andDahhEqualTo(String value) {
            addCriterion("DAHH =", value, "dahh");
            return (Criteria) this;
        }

        public Criteria andDahhNotEqualTo(String value) {
            addCriterion("DAHH <>", value, "dahh");
            return (Criteria) this;
        }

        public Criteria andDahhGreaterThan(String value) {
            addCriterion("DAHH >", value, "dahh");
            return (Criteria) this;
        }

        public Criteria andDahhGreaterThanOrEqualTo(String value) {
            addCriterion("DAHH >=", value, "dahh");
            return (Criteria) this;
        }

        public Criteria andDahhLessThan(String value) {
            addCriterion("DAHH <", value, "dahh");
            return (Criteria) this;
        }

        public Criteria andDahhLessThanOrEqualTo(String value) {
            addCriterion("DAHH <=", value, "dahh");
            return (Criteria) this;
        }

        public Criteria andDahhIn(List<String> values) {
            addCriterion("DAHH in", values, "dahh");
            return (Criteria) this;
        }

        public Criteria andDahhNotIn(List<String> values) {
            addCriterion("DAHH not in", values, "dahh");
            return (Criteria) this;
        }

        public Criteria andDahhBetween(String value1, String value2) {
            addCriterion("DAHH between", value1, value2, "dahh");
            return (Criteria) this;
        }

        public Criteria andDahhNotBetween(String value1, String value2) {
            addCriterion("DAHH not between", value1, value2, "dahh");
            return (Criteria) this;
        }

        public Criteria andDaajhIsNull() {
            addCriterion("DAAJH is null");
            return (Criteria) this;
        }

        public Criteria andDaajhIsNotNull() {
            addCriterion("DAAJH is not null");
            return (Criteria) this;
        }

        public Criteria andDaajhEqualTo(String value) {
            addCriterion("DAAJH =", value, "daajh");
            return (Criteria) this;
        }

        public Criteria andDaajhNotEqualTo(String value) {
            addCriterion("DAAJH <>", value, "daajh");
            return (Criteria) this;
        }

        public Criteria andDaajhGreaterThan(String value) {
            addCriterion("DAAJH >", value, "daajh");
            return (Criteria) this;
        }

        public Criteria andDaajhGreaterThanOrEqualTo(String value) {
            addCriterion("DAAJH >=", value, "daajh");
            return (Criteria) this;
        }

        public Criteria andDaajhLessThan(String value) {
            addCriterion("DAAJH <", value, "daajh");
            return (Criteria) this;
        }

        public Criteria andDaajhLessThanOrEqualTo(String value) {
            addCriterion("DAAJH <=", value, "daajh");
            return (Criteria) this;
        }

        public Criteria andDaajhIn(List<String> values) {
            addCriterion("DAAJH in", values, "daajh");
            return (Criteria) this;
        }

        public Criteria andDaajhNotIn(List<String> values) {
            addCriterion("DAAJH not in", values, "daajh");
            return (Criteria) this;
        }

        public Criteria andDaajhBetween(String value1, String value2) {
            addCriterion("DAAJH between", value1, value2, "daajh");
            return (Criteria) this;
        }

        public Criteria andDaajhNotBetween(String value1, String value2) {
            addCriterion("DAAJH not between", value1, value2, "daajh");
            return (Criteria) this;
        }

        public Criteria andDaajbtIsNull() {
            addCriterion("DAAJBT is null");
            return (Criteria) this;
        }

        public Criteria andDaajbtIsNotNull() {
            addCriterion("DAAJBT is not null");
            return (Criteria) this;
        }

        public Criteria andDaajbtEqualTo(String value) {
            addCriterion("DAAJBT =", value, "daajbt");
            return (Criteria) this;
        }

        public Criteria andDaajbtNotEqualTo(String value) {
            addCriterion("DAAJBT <>", value, "daajbt");
            return (Criteria) this;
        }

        public Criteria andDaajbtGreaterThan(String value) {
            addCriterion("DAAJBT >", value, "daajbt");
            return (Criteria) this;
        }

        public Criteria andDaajbtGreaterThanOrEqualTo(String value) {
            addCriterion("DAAJBT >=", value, "daajbt");
            return (Criteria) this;
        }

        public Criteria andDaajbtLessThan(String value) {
            addCriterion("DAAJBT <", value, "daajbt");
            return (Criteria) this;
        }

        public Criteria andDaajbtLessThanOrEqualTo(String value) {
            addCriterion("DAAJBT <=", value, "daajbt");
            return (Criteria) this;
        }

        public Criteria andDaajbtIn(List<String> values) {
            addCriterion("DAAJBT in", values, "daajbt");
            return (Criteria) this;
        }

        public Criteria andDaajbtNotIn(List<String> values) {
            addCriterion("DAAJBT not in", values, "daajbt");
            return (Criteria) this;
        }

        public Criteria andDaajbtBetween(String value1, String value2) {
            addCriterion("DAAJBT between", value1, value2, "daajbt");
            return (Criteria) this;
        }

        public Criteria andDaajbtNotBetween(String value1, String value2) {
            addCriterion("DAAJBT not between", value1, value2, "daajbt");
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