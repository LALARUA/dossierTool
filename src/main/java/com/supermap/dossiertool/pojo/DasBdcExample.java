package com.supermap.dossiertool.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DasBdcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DasBdcExample() {
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

        public Criteria andBdcidIsNull() {
            addCriterion("BDCID is null");
            return (Criteria) this;
        }

        public Criteria andBdcidIsNotNull() {
            addCriterion("BDCID is not null");
            return (Criteria) this;
        }

        public Criteria andBdcidEqualTo(Object value) {
            addCriterion("BDCID =", value, "bdcid");
            return (Criteria) this;
        }

        public Criteria andBdcidNotEqualTo(Object value) {
            addCriterion("BDCID <>", value, "bdcid");
            return (Criteria) this;
        }

        public Criteria andBdcidGreaterThan(Object value) {
            addCriterion("BDCID >", value, "bdcid");
            return (Criteria) this;
        }

        public Criteria andBdcidGreaterThanOrEqualTo(Object value) {
            addCriterion("BDCID >=", value, "bdcid");
            return (Criteria) this;
        }

        public Criteria andBdcidLessThan(Object value) {
            addCriterion("BDCID <", value, "bdcid");
            return (Criteria) this;
        }

        public Criteria andBdcidLessThanOrEqualTo(Object value) {
            addCriterion("BDCID <=", value, "bdcid");
            return (Criteria) this;
        }

        public Criteria andBdcidIn(List<Object> values) {
            addCriterion("BDCID in", values, "bdcid");
            return (Criteria) this;
        }

        public Criteria andBdcidNotIn(List<Object> values) {
            addCriterion("BDCID not in", values, "bdcid");
            return (Criteria) this;
        }

        public Criteria andBdcidBetween(Object value1, Object value2) {
            addCriterion("BDCID between", value1, value2, "bdcid");
            return (Criteria) this;
        }

        public Criteria andBdcidNotBetween(Object value1, Object value2) {
            addCriterion("BDCID not between", value1, value2, "bdcid");
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

        public Criteria andXmbhIsNull() {
            addCriterion("XMBH is null");
            return (Criteria) this;
        }

        public Criteria andXmbhIsNotNull() {
            addCriterion("XMBH is not null");
            return (Criteria) this;
        }

        public Criteria andXmbhEqualTo(Object value) {
            addCriterion("XMBH =", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhNotEqualTo(Object value) {
            addCriterion("XMBH <>", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhGreaterThan(Object value) {
            addCriterion("XMBH >", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhGreaterThanOrEqualTo(Object value) {
            addCriterion("XMBH >=", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhLessThan(Object value) {
            addCriterion("XMBH <", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhLessThanOrEqualTo(Object value) {
            addCriterion("XMBH <=", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhIn(List<Object> values) {
            addCriterion("XMBH in", values, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhNotIn(List<Object> values) {
            addCriterion("XMBH not in", values, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhBetween(Object value1, Object value2) {
            addCriterion("XMBH between", value1, value2, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhNotBetween(Object value1, Object value2) {
            addCriterion("XMBH not between", value1, value2, "xmbh");
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

        public Criteria andYwhEqualTo(Object value) {
            addCriterion("YWH =", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhNotEqualTo(Object value) {
            addCriterion("YWH <>", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhGreaterThan(Object value) {
            addCriterion("YWH >", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhGreaterThanOrEqualTo(Object value) {
            addCriterion("YWH >=", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhLessThan(Object value) {
            addCriterion("YWH <", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhLessThanOrEqualTo(Object value) {
            addCriterion("YWH <=", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhIn(List<Object> values) {
            addCriterion("YWH in", values, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhNotIn(List<Object> values) {
            addCriterion("YWH not in", values, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhBetween(Object value1, Object value2) {
            addCriterion("YWH between", value1, value2, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhNotBetween(Object value1, Object value2) {
            addCriterion("YWH not between", value1, value2, "ywh");
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

        public Criteria andBdcdyhEqualTo(Object value) {
            addCriterion("BDCDYH =", value, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhNotEqualTo(Object value) {
            addCriterion("BDCDYH <>", value, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhGreaterThan(Object value) {
            addCriterion("BDCDYH >", value, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhGreaterThanOrEqualTo(Object value) {
            addCriterion("BDCDYH >=", value, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhLessThan(Object value) {
            addCriterion("BDCDYH <", value, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhLessThanOrEqualTo(Object value) {
            addCriterion("BDCDYH <=", value, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhIn(List<Object> values) {
            addCriterion("BDCDYH in", values, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhNotIn(List<Object> values) {
            addCriterion("BDCDYH not in", values, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhBetween(Object value1, Object value2) {
            addCriterion("BDCDYH between", value1, value2, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhNotBetween(Object value1, Object value2) {
            addCriterion("BDCDYH not between", value1, value2, "bdcdyh");
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

        public Criteria andBdcqzhEqualTo(Object value) {
            addCriterion("BDCQZH =", value, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhNotEqualTo(Object value) {
            addCriterion("BDCQZH <>", value, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhGreaterThan(Object value) {
            addCriterion("BDCQZH >", value, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhGreaterThanOrEqualTo(Object value) {
            addCriterion("BDCQZH >=", value, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhLessThan(Object value) {
            addCriterion("BDCQZH <", value, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhLessThanOrEqualTo(Object value) {
            addCriterion("BDCQZH <=", value, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhIn(List<Object> values) {
            addCriterion("BDCQZH in", values, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhNotIn(List<Object> values) {
            addCriterion("BDCQZH not in", values, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhBetween(Object value1, Object value2) {
            addCriterion("BDCQZH between", value1, value2, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhNotBetween(Object value1, Object value2) {
            addCriterion("BDCQZH not between", value1, value2, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andZlIsNull() {
            addCriterion("ZL is null");
            return (Criteria) this;
        }

        public Criteria andZlIsNotNull() {
            addCriterion("ZL is not null");
            return (Criteria) this;
        }

        public Criteria andZlEqualTo(Object value) {
            addCriterion("ZL =", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlNotEqualTo(Object value) {
            addCriterion("ZL <>", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlGreaterThan(Object value) {
            addCriterion("ZL >", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlGreaterThanOrEqualTo(Object value) {
            addCriterion("ZL >=", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlLessThan(Object value) {
            addCriterion("ZL <", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlLessThanOrEqualTo(Object value) {
            addCriterion("ZL <=", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlIn(List<Object> values) {
            addCriterion("ZL in", values, "zl");
            return (Criteria) this;
        }

        public Criteria andZlNotIn(List<Object> values) {
            addCriterion("ZL not in", values, "zl");
            return (Criteria) this;
        }

        public Criteria andZlBetween(Object value1, Object value2) {
            addCriterion("ZL between", value1, value2, "zl");
            return (Criteria) this;
        }

        public Criteria andZlNotBetween(Object value1, Object value2) {
            addCriterion("ZL not between", value1, value2, "zl");
            return (Criteria) this;
        }

        public Criteria andZjzlIsNull() {
            addCriterion("ZJZL is null");
            return (Criteria) this;
        }

        public Criteria andZjzlIsNotNull() {
            addCriterion("ZJZL is not null");
            return (Criteria) this;
        }

        public Criteria andZjzlEqualTo(Object value) {
            addCriterion("ZJZL =", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlNotEqualTo(Object value) {
            addCriterion("ZJZL <>", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlGreaterThan(Object value) {
            addCriterion("ZJZL >", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlGreaterThanOrEqualTo(Object value) {
            addCriterion("ZJZL >=", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlLessThan(Object value) {
            addCriterion("ZJZL <", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlLessThanOrEqualTo(Object value) {
            addCriterion("ZJZL <=", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlIn(List<Object> values) {
            addCriterion("ZJZL in", values, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlNotIn(List<Object> values) {
            addCriterion("ZJZL not in", values, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlBetween(Object value1, Object value2) {
            addCriterion("ZJZL between", value1, value2, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlNotBetween(Object value1, Object value2) {
            addCriterion("ZJZL not between", value1, value2, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjhIsNull() {
            addCriterion("ZJH is null");
            return (Criteria) this;
        }

        public Criteria andZjhIsNotNull() {
            addCriterion("ZJH is not null");
            return (Criteria) this;
        }

        public Criteria andZjhEqualTo(Object value) {
            addCriterion("ZJH =", value, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhNotEqualTo(Object value) {
            addCriterion("ZJH <>", value, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhGreaterThan(Object value) {
            addCriterion("ZJH >", value, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhGreaterThanOrEqualTo(Object value) {
            addCriterion("ZJH >=", value, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhLessThan(Object value) {
            addCriterion("ZJH <", value, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhLessThanOrEqualTo(Object value) {
            addCriterion("ZJH <=", value, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhIn(List<Object> values) {
            addCriterion("ZJH in", values, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhNotIn(List<Object> values) {
            addCriterion("ZJH not in", values, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhBetween(Object value1, Object value2) {
            addCriterion("ZJH between", value1, value2, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhNotBetween(Object value1, Object value2) {
            addCriterion("ZJH not between", value1, value2, "zjh");
            return (Criteria) this;
        }

        public Criteria andSyqrIsNull() {
            addCriterion("SYQR is null");
            return (Criteria) this;
        }

        public Criteria andSyqrIsNotNull() {
            addCriterion("SYQR is not null");
            return (Criteria) this;
        }

        public Criteria andSyqrEqualTo(Object value) {
            addCriterion("SYQR =", value, "syqr");
            return (Criteria) this;
        }

        public Criteria andSyqrNotEqualTo(Object value) {
            addCriterion("SYQR <>", value, "syqr");
            return (Criteria) this;
        }

        public Criteria andSyqrGreaterThan(Object value) {
            addCriterion("SYQR >", value, "syqr");
            return (Criteria) this;
        }

        public Criteria andSyqrGreaterThanOrEqualTo(Object value) {
            addCriterion("SYQR >=", value, "syqr");
            return (Criteria) this;
        }

        public Criteria andSyqrLessThan(Object value) {
            addCriterion("SYQR <", value, "syqr");
            return (Criteria) this;
        }

        public Criteria andSyqrLessThanOrEqualTo(Object value) {
            addCriterion("SYQR <=", value, "syqr");
            return (Criteria) this;
        }

        public Criteria andSyqrIn(List<Object> values) {
            addCriterion("SYQR in", values, "syqr");
            return (Criteria) this;
        }

        public Criteria andSyqrNotIn(List<Object> values) {
            addCriterion("SYQR not in", values, "syqr");
            return (Criteria) this;
        }

        public Criteria andSyqrBetween(Object value1, Object value2) {
            addCriterion("SYQR between", value1, value2, "syqr");
            return (Criteria) this;
        }

        public Criteria andSyqrNotBetween(Object value1, Object value2) {
            addCriterion("SYQR not between", value1, value2, "syqr");
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

        public Criteria andDjlxEqualTo(Object value) {
            addCriterion("DJLX =", value, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxNotEqualTo(Object value) {
            addCriterion("DJLX <>", value, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxGreaterThan(Object value) {
            addCriterion("DJLX >", value, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxGreaterThanOrEqualTo(Object value) {
            addCriterion("DJLX >=", value, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxLessThan(Object value) {
            addCriterion("DJLX <", value, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxLessThanOrEqualTo(Object value) {
            addCriterion("DJLX <=", value, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxIn(List<Object> values) {
            addCriterion("DJLX in", values, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxNotIn(List<Object> values) {
            addCriterion("DJLX not in", values, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxBetween(Object value1, Object value2) {
            addCriterion("DJLX between", value1, value2, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxNotBetween(Object value1, Object value2) {
            addCriterion("DJLX not between", value1, value2, "djlx");
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

        public Criteria andQllxEqualTo(Object value) {
            addCriterion("QLLX =", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxNotEqualTo(Object value) {
            addCriterion("QLLX <>", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxGreaterThan(Object value) {
            addCriterion("QLLX >", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxGreaterThanOrEqualTo(Object value) {
            addCriterion("QLLX >=", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxLessThan(Object value) {
            addCriterion("QLLX <", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxLessThanOrEqualTo(Object value) {
            addCriterion("QLLX <=", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxIn(List<Object> values) {
            addCriterion("QLLX in", values, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxNotIn(List<Object> values) {
            addCriterion("QLLX not in", values, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxBetween(Object value1, Object value2) {
            addCriterion("QLLX between", value1, value2, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxNotBetween(Object value1, Object value2) {
            addCriterion("QLLX not between", value1, value2, "qllx");
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

        public Criteria andDjyyEqualTo(Object value) {
            addCriterion("DJYY =", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyNotEqualTo(Object value) {
            addCriterion("DJYY <>", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyGreaterThan(Object value) {
            addCriterion("DJYY >", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyGreaterThanOrEqualTo(Object value) {
            addCriterion("DJYY >=", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyLessThan(Object value) {
            addCriterion("DJYY <", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyLessThanOrEqualTo(Object value) {
            addCriterion("DJYY <=", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyIn(List<Object> values) {
            addCriterion("DJYY in", values, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyNotIn(List<Object> values) {
            addCriterion("DJYY not in", values, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyBetween(Object value1, Object value2) {
            addCriterion("DJYY between", value1, value2, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyNotBetween(Object value1, Object value2) {
            addCriterion("DJYY not between", value1, value2, "djyy");
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

        public Criteria andDbrIsNull() {
            addCriterion("DBR is null");
            return (Criteria) this;
        }

        public Criteria andDbrIsNotNull() {
            addCriterion("DBR is not null");
            return (Criteria) this;
        }

        public Criteria andDbrEqualTo(Object value) {
            addCriterion("DBR =", value, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrNotEqualTo(Object value) {
            addCriterion("DBR <>", value, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrGreaterThan(Object value) {
            addCriterion("DBR >", value, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrGreaterThanOrEqualTo(Object value) {
            addCriterion("DBR >=", value, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrLessThan(Object value) {
            addCriterion("DBR <", value, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrLessThanOrEqualTo(Object value) {
            addCriterion("DBR <=", value, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrIn(List<Object> values) {
            addCriterion("DBR in", values, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrNotIn(List<Object> values) {
            addCriterion("DBR not in", values, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrBetween(Object value1, Object value2) {
            addCriterion("DBR between", value1, value2, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrNotBetween(Object value1, Object value2) {
            addCriterion("DBR not between", value1, value2, "dbr");
            return (Criteria) this;
        }

        public Criteria andYwlxIsNull() {
            addCriterion("YWLX is null");
            return (Criteria) this;
        }

        public Criteria andYwlxIsNotNull() {
            addCriterion("YWLX is not null");
            return (Criteria) this;
        }

        public Criteria andYwlxEqualTo(Object value) {
            addCriterion("YWLX =", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxNotEqualTo(Object value) {
            addCriterion("YWLX <>", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxGreaterThan(Object value) {
            addCriterion("YWLX >", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxGreaterThanOrEqualTo(Object value) {
            addCriterion("YWLX >=", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxLessThan(Object value) {
            addCriterion("YWLX <", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxLessThanOrEqualTo(Object value) {
            addCriterion("YWLX <=", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxIn(List<Object> values) {
            addCriterion("YWLX in", values, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxNotIn(List<Object> values) {
            addCriterion("YWLX not in", values, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxBetween(Object value1, Object value2) {
            addCriterion("YWLX between", value1, value2, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxNotBetween(Object value1, Object value2) {
            addCriterion("YWLX not between", value1, value2, "ywlx");
            return (Criteria) this;
        }

        public Criteria andBdcdylxIsNull() {
            addCriterion("BDCDYLX is null");
            return (Criteria) this;
        }

        public Criteria andBdcdylxIsNotNull() {
            addCriterion("BDCDYLX is not null");
            return (Criteria) this;
        }

        public Criteria andBdcdylxEqualTo(Object value) {
            addCriterion("BDCDYLX =", value, "bdcdylx");
            return (Criteria) this;
        }

        public Criteria andBdcdylxNotEqualTo(Object value) {
            addCriterion("BDCDYLX <>", value, "bdcdylx");
            return (Criteria) this;
        }

        public Criteria andBdcdylxGreaterThan(Object value) {
            addCriterion("BDCDYLX >", value, "bdcdylx");
            return (Criteria) this;
        }

        public Criteria andBdcdylxGreaterThanOrEqualTo(Object value) {
            addCriterion("BDCDYLX >=", value, "bdcdylx");
            return (Criteria) this;
        }

        public Criteria andBdcdylxLessThan(Object value) {
            addCriterion("BDCDYLX <", value, "bdcdylx");
            return (Criteria) this;
        }

        public Criteria andBdcdylxLessThanOrEqualTo(Object value) {
            addCriterion("BDCDYLX <=", value, "bdcdylx");
            return (Criteria) this;
        }

        public Criteria andBdcdylxIn(List<Object> values) {
            addCriterion("BDCDYLX in", values, "bdcdylx");
            return (Criteria) this;
        }

        public Criteria andBdcdylxNotIn(List<Object> values) {
            addCriterion("BDCDYLX not in", values, "bdcdylx");
            return (Criteria) this;
        }

        public Criteria andBdcdylxBetween(Object value1, Object value2) {
            addCriterion("BDCDYLX between", value1, value2, "bdcdylx");
            return (Criteria) this;
        }

        public Criteria andBdcdylxNotBetween(Object value1, Object value2) {
            addCriterion("BDCDYLX not between", value1, value2, "bdcdylx");
            return (Criteria) this;
        }

        public Criteria andDjlxmcIsNull() {
            addCriterion("DJLXMC is null");
            return (Criteria) this;
        }

        public Criteria andDjlxmcIsNotNull() {
            addCriterion("DJLXMC is not null");
            return (Criteria) this;
        }

        public Criteria andDjlxmcEqualTo(Object value) {
            addCriterion("DJLXMC =", value, "djlxmc");
            return (Criteria) this;
        }

        public Criteria andDjlxmcNotEqualTo(Object value) {
            addCriterion("DJLXMC <>", value, "djlxmc");
            return (Criteria) this;
        }

        public Criteria andDjlxmcGreaterThan(Object value) {
            addCriterion("DJLXMC >", value, "djlxmc");
            return (Criteria) this;
        }

        public Criteria andDjlxmcGreaterThanOrEqualTo(Object value) {
            addCriterion("DJLXMC >=", value, "djlxmc");
            return (Criteria) this;
        }

        public Criteria andDjlxmcLessThan(Object value) {
            addCriterion("DJLXMC <", value, "djlxmc");
            return (Criteria) this;
        }

        public Criteria andDjlxmcLessThanOrEqualTo(Object value) {
            addCriterion("DJLXMC <=", value, "djlxmc");
            return (Criteria) this;
        }

        public Criteria andDjlxmcIn(List<Object> values) {
            addCriterion("DJLXMC in", values, "djlxmc");
            return (Criteria) this;
        }

        public Criteria andDjlxmcNotIn(List<Object> values) {
            addCriterion("DJLXMC not in", values, "djlxmc");
            return (Criteria) this;
        }

        public Criteria andDjlxmcBetween(Object value1, Object value2) {
            addCriterion("DJLXMC between", value1, value2, "djlxmc");
            return (Criteria) this;
        }

        public Criteria andDjlxmcNotBetween(Object value1, Object value2) {
            addCriterion("DJLXMC not between", value1, value2, "djlxmc");
            return (Criteria) this;
        }

        public Criteria andQllxmcIsNull() {
            addCriterion("QLLXMC is null");
            return (Criteria) this;
        }

        public Criteria andQllxmcIsNotNull() {
            addCriterion("QLLXMC is not null");
            return (Criteria) this;
        }

        public Criteria andQllxmcEqualTo(Object value) {
            addCriterion("QLLXMC =", value, "qllxmc");
            return (Criteria) this;
        }

        public Criteria andQllxmcNotEqualTo(Object value) {
            addCriterion("QLLXMC <>", value, "qllxmc");
            return (Criteria) this;
        }

        public Criteria andQllxmcGreaterThan(Object value) {
            addCriterion("QLLXMC >", value, "qllxmc");
            return (Criteria) this;
        }

        public Criteria andQllxmcGreaterThanOrEqualTo(Object value) {
            addCriterion("QLLXMC >=", value, "qllxmc");
            return (Criteria) this;
        }

        public Criteria andQllxmcLessThan(Object value) {
            addCriterion("QLLXMC <", value, "qllxmc");
            return (Criteria) this;
        }

        public Criteria andQllxmcLessThanOrEqualTo(Object value) {
            addCriterion("QLLXMC <=", value, "qllxmc");
            return (Criteria) this;
        }

        public Criteria andQllxmcIn(List<Object> values) {
            addCriterion("QLLXMC in", values, "qllxmc");
            return (Criteria) this;
        }

        public Criteria andQllxmcNotIn(List<Object> values) {
            addCriterion("QLLXMC not in", values, "qllxmc");
            return (Criteria) this;
        }

        public Criteria andQllxmcBetween(Object value1, Object value2) {
            addCriterion("QLLXMC between", value1, value2, "qllxmc");
            return (Criteria) this;
        }

        public Criteria andQllxmcNotBetween(Object value1, Object value2) {
            addCriterion("QLLXMC not between", value1, value2, "qllxmc");
            return (Criteria) this;
        }

        public Criteria andBdcdylxmcIsNull() {
            addCriterion("BDCDYLXMC is null");
            return (Criteria) this;
        }

        public Criteria andBdcdylxmcIsNotNull() {
            addCriterion("BDCDYLXMC is not null");
            return (Criteria) this;
        }

        public Criteria andBdcdylxmcEqualTo(Object value) {
            addCriterion("BDCDYLXMC =", value, "bdcdylxmc");
            return (Criteria) this;
        }

        public Criteria andBdcdylxmcNotEqualTo(Object value) {
            addCriterion("BDCDYLXMC <>", value, "bdcdylxmc");
            return (Criteria) this;
        }

        public Criteria andBdcdylxmcGreaterThan(Object value) {
            addCriterion("BDCDYLXMC >", value, "bdcdylxmc");
            return (Criteria) this;
        }

        public Criteria andBdcdylxmcGreaterThanOrEqualTo(Object value) {
            addCriterion("BDCDYLXMC >=", value, "bdcdylxmc");
            return (Criteria) this;
        }

        public Criteria andBdcdylxmcLessThan(Object value) {
            addCriterion("BDCDYLXMC <", value, "bdcdylxmc");
            return (Criteria) this;
        }

        public Criteria andBdcdylxmcLessThanOrEqualTo(Object value) {
            addCriterion("BDCDYLXMC <=", value, "bdcdylxmc");
            return (Criteria) this;
        }

        public Criteria andBdcdylxmcIn(List<Object> values) {
            addCriterion("BDCDYLXMC in", values, "bdcdylxmc");
            return (Criteria) this;
        }

        public Criteria andBdcdylxmcNotIn(List<Object> values) {
            addCriterion("BDCDYLXMC not in", values, "bdcdylxmc");
            return (Criteria) this;
        }

        public Criteria andBdcdylxmcBetween(Object value1, Object value2) {
            addCriterion("BDCDYLXMC between", value1, value2, "bdcdylxmc");
            return (Criteria) this;
        }

        public Criteria andBdcdylxmcNotBetween(Object value1, Object value2) {
            addCriterion("BDCDYLXMC not between", value1, value2, "bdcdylxmc");
            return (Criteria) this;
        }

        public Criteria andYwlxmcIsNull() {
            addCriterion("YWLXMC is null");
            return (Criteria) this;
        }

        public Criteria andYwlxmcIsNotNull() {
            addCriterion("YWLXMC is not null");
            return (Criteria) this;
        }

        public Criteria andYwlxmcEqualTo(Object value) {
            addCriterion("YWLXMC =", value, "ywlxmc");
            return (Criteria) this;
        }

        public Criteria andYwlxmcNotEqualTo(Object value) {
            addCriterion("YWLXMC <>", value, "ywlxmc");
            return (Criteria) this;
        }

        public Criteria andYwlxmcGreaterThan(Object value) {
            addCriterion("YWLXMC >", value, "ywlxmc");
            return (Criteria) this;
        }

        public Criteria andYwlxmcGreaterThanOrEqualTo(Object value) {
            addCriterion("YWLXMC >=", value, "ywlxmc");
            return (Criteria) this;
        }

        public Criteria andYwlxmcLessThan(Object value) {
            addCriterion("YWLXMC <", value, "ywlxmc");
            return (Criteria) this;
        }

        public Criteria andYwlxmcLessThanOrEqualTo(Object value) {
            addCriterion("YWLXMC <=", value, "ywlxmc");
            return (Criteria) this;
        }

        public Criteria andYwlxmcIn(List<Object> values) {
            addCriterion("YWLXMC in", values, "ywlxmc");
            return (Criteria) this;
        }

        public Criteria andYwlxmcNotIn(List<Object> values) {
            addCriterion("YWLXMC not in", values, "ywlxmc");
            return (Criteria) this;
        }

        public Criteria andYwlxmcBetween(Object value1, Object value2) {
            addCriterion("YWLXMC between", value1, value2, "ywlxmc");
            return (Criteria) this;
        }

        public Criteria andYwlxmcNotBetween(Object value1, Object value2) {
            addCriterion("YWLXMC not between", value1, value2, "ywlxmc");
            return (Criteria) this;
        }

        public Criteria andBdcdyidIsNull() {
            addCriterion("BDCDYID is null");
            return (Criteria) this;
        }

        public Criteria andBdcdyidIsNotNull() {
            addCriterion("BDCDYID is not null");
            return (Criteria) this;
        }

        public Criteria andBdcdyidEqualTo(Object value) {
            addCriterion("BDCDYID =", value, "bdcdyid");
            return (Criteria) this;
        }

        public Criteria andBdcdyidNotEqualTo(Object value) {
            addCriterion("BDCDYID <>", value, "bdcdyid");
            return (Criteria) this;
        }

        public Criteria andBdcdyidGreaterThan(Object value) {
            addCriterion("BDCDYID >", value, "bdcdyid");
            return (Criteria) this;
        }

        public Criteria andBdcdyidGreaterThanOrEqualTo(Object value) {
            addCriterion("BDCDYID >=", value, "bdcdyid");
            return (Criteria) this;
        }

        public Criteria andBdcdyidLessThan(Object value) {
            addCriterion("BDCDYID <", value, "bdcdyid");
            return (Criteria) this;
        }

        public Criteria andBdcdyidLessThanOrEqualTo(Object value) {
            addCriterion("BDCDYID <=", value, "bdcdyid");
            return (Criteria) this;
        }

        public Criteria andBdcdyidIn(List<Object> values) {
            addCriterion("BDCDYID in", values, "bdcdyid");
            return (Criteria) this;
        }

        public Criteria andBdcdyidNotIn(List<Object> values) {
            addCriterion("BDCDYID not in", values, "bdcdyid");
            return (Criteria) this;
        }

        public Criteria andBdcdyidBetween(Object value1, Object value2) {
            addCriterion("BDCDYID between", value1, value2, "bdcdyid");
            return (Criteria) this;
        }

        public Criteria andBdcdyidNotBetween(Object value1, Object value2) {
            addCriterion("BDCDYID not between", value1, value2, "bdcdyid");
            return (Criteria) this;
        }

        public Criteria andOldxmbhIsNull() {
            addCriterion("OLDXMBH is null");
            return (Criteria) this;
        }

        public Criteria andOldxmbhIsNotNull() {
            addCriterion("OLDXMBH is not null");
            return (Criteria) this;
        }

        public Criteria andOldxmbhEqualTo(Object value) {
            addCriterion("OLDXMBH =", value, "oldxmbh");
            return (Criteria) this;
        }

        public Criteria andOldxmbhNotEqualTo(Object value) {
            addCriterion("OLDXMBH <>", value, "oldxmbh");
            return (Criteria) this;
        }

        public Criteria andOldxmbhGreaterThan(Object value) {
            addCriterion("OLDXMBH >", value, "oldxmbh");
            return (Criteria) this;
        }

        public Criteria andOldxmbhGreaterThanOrEqualTo(Object value) {
            addCriterion("OLDXMBH >=", value, "oldxmbh");
            return (Criteria) this;
        }

        public Criteria andOldxmbhLessThan(Object value) {
            addCriterion("OLDXMBH <", value, "oldxmbh");
            return (Criteria) this;
        }

        public Criteria andOldxmbhLessThanOrEqualTo(Object value) {
            addCriterion("OLDXMBH <=", value, "oldxmbh");
            return (Criteria) this;
        }

        public Criteria andOldxmbhIn(List<Object> values) {
            addCriterion("OLDXMBH in", values, "oldxmbh");
            return (Criteria) this;
        }

        public Criteria andOldxmbhNotIn(List<Object> values) {
            addCriterion("OLDXMBH not in", values, "oldxmbh");
            return (Criteria) this;
        }

        public Criteria andOldxmbhBetween(Object value1, Object value2) {
            addCriterion("OLDXMBH between", value1, value2, "oldxmbh");
            return (Criteria) this;
        }

        public Criteria andOldxmbhNotBetween(Object value1, Object value2) {
            addCriterion("OLDXMBH not between", value1, value2, "oldxmbh");
            return (Criteria) this;
        }

        public Criteria andZdmjIsNull() {
            addCriterion("ZDMJ is null");
            return (Criteria) this;
        }

        public Criteria andZdmjIsNotNull() {
            addCriterion("ZDMJ is not null");
            return (Criteria) this;
        }

        public Criteria andZdmjEqualTo(BigDecimal value) {
            addCriterion("ZDMJ =", value, "zdmj");
            return (Criteria) this;
        }

        public Criteria andZdmjNotEqualTo(BigDecimal value) {
            addCriterion("ZDMJ <>", value, "zdmj");
            return (Criteria) this;
        }

        public Criteria andZdmjGreaterThan(BigDecimal value) {
            addCriterion("ZDMJ >", value, "zdmj");
            return (Criteria) this;
        }

        public Criteria andZdmjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZDMJ >=", value, "zdmj");
            return (Criteria) this;
        }

        public Criteria andZdmjLessThan(BigDecimal value) {
            addCriterion("ZDMJ <", value, "zdmj");
            return (Criteria) this;
        }

        public Criteria andZdmjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZDMJ <=", value, "zdmj");
            return (Criteria) this;
        }

        public Criteria andZdmjIn(List<BigDecimal> values) {
            addCriterion("ZDMJ in", values, "zdmj");
            return (Criteria) this;
        }

        public Criteria andZdmjNotIn(List<BigDecimal> values) {
            addCriterion("ZDMJ not in", values, "zdmj");
            return (Criteria) this;
        }

        public Criteria andZdmjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZDMJ between", value1, value2, "zdmj");
            return (Criteria) this;
        }

        public Criteria andZdmjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZDMJ not between", value1, value2, "zdmj");
            return (Criteria) this;
        }

        public Criteria andTdytIsNull() {
            addCriterion("TDYT is null");
            return (Criteria) this;
        }

        public Criteria andTdytIsNotNull() {
            addCriterion("TDYT is not null");
            return (Criteria) this;
        }

        public Criteria andTdytEqualTo(Object value) {
            addCriterion("TDYT =", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytNotEqualTo(Object value) {
            addCriterion("TDYT <>", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytGreaterThan(Object value) {
            addCriterion("TDYT >", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytGreaterThanOrEqualTo(Object value) {
            addCriterion("TDYT >=", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytLessThan(Object value) {
            addCriterion("TDYT <", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytLessThanOrEqualTo(Object value) {
            addCriterion("TDYT <=", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytIn(List<Object> values) {
            addCriterion("TDYT in", values, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytNotIn(List<Object> values) {
            addCriterion("TDYT not in", values, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytBetween(Object value1, Object value2) {
            addCriterion("TDYT between", value1, value2, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytNotBetween(Object value1, Object value2) {
            addCriterion("TDYT not between", value1, value2, "tdyt");
            return (Criteria) this;
        }

        public Criteria andJzmjIsNull() {
            addCriterion("JZMJ is null");
            return (Criteria) this;
        }

        public Criteria andJzmjIsNotNull() {
            addCriterion("JZMJ is not null");
            return (Criteria) this;
        }

        public Criteria andJzmjEqualTo(BigDecimal value) {
            addCriterion("JZMJ =", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjNotEqualTo(BigDecimal value) {
            addCriterion("JZMJ <>", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjGreaterThan(BigDecimal value) {
            addCriterion("JZMJ >", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JZMJ >=", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjLessThan(BigDecimal value) {
            addCriterion("JZMJ <", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JZMJ <=", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjIn(List<BigDecimal> values) {
            addCriterion("JZMJ in", values, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjNotIn(List<BigDecimal> values) {
            addCriterion("JZMJ not in", values, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JZMJ between", value1, value2, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JZMJ not between", value1, value2, "jzmj");
            return (Criteria) this;
        }

        public Criteria andGhytIsNull() {
            addCriterion("GHYT is null");
            return (Criteria) this;
        }

        public Criteria andGhytIsNotNull() {
            addCriterion("GHYT is not null");
            return (Criteria) this;
        }

        public Criteria andGhytEqualTo(Object value) {
            addCriterion("GHYT =", value, "ghyt");
            return (Criteria) this;
        }

        public Criteria andGhytNotEqualTo(Object value) {
            addCriterion("GHYT <>", value, "ghyt");
            return (Criteria) this;
        }

        public Criteria andGhytGreaterThan(Object value) {
            addCriterion("GHYT >", value, "ghyt");
            return (Criteria) this;
        }

        public Criteria andGhytGreaterThanOrEqualTo(Object value) {
            addCriterion("GHYT >=", value, "ghyt");
            return (Criteria) this;
        }

        public Criteria andGhytLessThan(Object value) {
            addCriterion("GHYT <", value, "ghyt");
            return (Criteria) this;
        }

        public Criteria andGhytLessThanOrEqualTo(Object value) {
            addCriterion("GHYT <=", value, "ghyt");
            return (Criteria) this;
        }

        public Criteria andGhytIn(List<Object> values) {
            addCriterion("GHYT in", values, "ghyt");
            return (Criteria) this;
        }

        public Criteria andGhytNotIn(List<Object> values) {
            addCriterion("GHYT not in", values, "ghyt");
            return (Criteria) this;
        }

        public Criteria andGhytBetween(Object value1, Object value2) {
            addCriterion("GHYT between", value1, value2, "ghyt");
            return (Criteria) this;
        }

        public Criteria andGhytNotBetween(Object value1, Object value2) {
            addCriterion("GHYT not between", value1, value2, "ghyt");
            return (Criteria) this;
        }

        public Criteria andFwjgIsNull() {
            addCriterion("FWJG is null");
            return (Criteria) this;
        }

        public Criteria andFwjgIsNotNull() {
            addCriterion("FWJG is not null");
            return (Criteria) this;
        }

        public Criteria andFwjgEqualTo(Object value) {
            addCriterion("FWJG =", value, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgNotEqualTo(Object value) {
            addCriterion("FWJG <>", value, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgGreaterThan(Object value) {
            addCriterion("FWJG >", value, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgGreaterThanOrEqualTo(Object value) {
            addCriterion("FWJG >=", value, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgLessThan(Object value) {
            addCriterion("FWJG <", value, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgLessThanOrEqualTo(Object value) {
            addCriterion("FWJG <=", value, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgIn(List<Object> values) {
            addCriterion("FWJG in", values, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgNotIn(List<Object> values) {
            addCriterion("FWJG not in", values, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgBetween(Object value1, Object value2) {
            addCriterion("FWJG between", value1, value2, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgNotBetween(Object value1, Object value2) {
            addCriterion("FWJG not between", value1, value2, "fwjg");
            return (Criteria) this;
        }

        public Criteria andJgsjIsNull() {
            addCriterion("JGSJ is null");
            return (Criteria) this;
        }

        public Criteria andJgsjIsNotNull() {
            addCriterion("JGSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJgsjEqualTo(Date value) {
            addCriterion("JGSJ =", value, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjNotEqualTo(Date value) {
            addCriterion("JGSJ <>", value, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjGreaterThan(Date value) {
            addCriterion("JGSJ >", value, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjGreaterThanOrEqualTo(Date value) {
            addCriterion("JGSJ >=", value, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjLessThan(Date value) {
            addCriterion("JGSJ <", value, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjLessThanOrEqualTo(Date value) {
            addCriterion("JGSJ <=", value, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjIn(List<Date> values) {
            addCriterion("JGSJ in", values, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjNotIn(List<Date> values) {
            addCriterion("JGSJ not in", values, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjBetween(Date value1, Date value2) {
            addCriterion("JGSJ between", value1, value2, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjNotBetween(Date value1, Date value2) {
            addCriterion("JGSJ not between", value1, value2, "jgsj");
            return (Criteria) this;
        }

        public Criteria andFwxzIsNull() {
            addCriterion("FWXZ is null");
            return (Criteria) this;
        }

        public Criteria andFwxzIsNotNull() {
            addCriterion("FWXZ is not null");
            return (Criteria) this;
        }

        public Criteria andFwxzEqualTo(Object value) {
            addCriterion("FWXZ =", value, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzNotEqualTo(Object value) {
            addCriterion("FWXZ <>", value, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzGreaterThan(Object value) {
            addCriterion("FWXZ >", value, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzGreaterThanOrEqualTo(Object value) {
            addCriterion("FWXZ >=", value, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzLessThan(Object value) {
            addCriterion("FWXZ <", value, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzLessThanOrEqualTo(Object value) {
            addCriterion("FWXZ <=", value, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzIn(List<Object> values) {
            addCriterion("FWXZ in", values, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzNotIn(List<Object> values) {
            addCriterion("FWXZ not in", values, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzBetween(Object value1, Object value2) {
            addCriterion("FWXZ between", value1, value2, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzNotBetween(Object value1, Object value2) {
            addCriterion("FWXZ not between", value1, value2, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFhIsNull() {
            addCriterion("FH is null");
            return (Criteria) this;
        }

        public Criteria andFhIsNotNull() {
            addCriterion("FH is not null");
            return (Criteria) this;
        }

        public Criteria andFhEqualTo(Object value) {
            addCriterion("FH =", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotEqualTo(Object value) {
            addCriterion("FH <>", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhGreaterThan(Object value) {
            addCriterion("FH >", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhGreaterThanOrEqualTo(Object value) {
            addCriterion("FH >=", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhLessThan(Object value) {
            addCriterion("FH <", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhLessThanOrEqualTo(Object value) {
            addCriterion("FH <=", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhIn(List<Object> values) {
            addCriterion("FH in", values, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotIn(List<Object> values) {
            addCriterion("FH not in", values, "fh");
            return (Criteria) this;
        }

        public Criteria andFhBetween(Object value1, Object value2) {
            addCriterion("FH between", value1, value2, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotBetween(Object value1, Object value2) {
            addCriterion("FH not between", value1, value2, "fh");
            return (Criteria) this;
        }

        public Criteria andSzcIsNull() {
            addCriterion("SZC is null");
            return (Criteria) this;
        }

        public Criteria andSzcIsNotNull() {
            addCriterion("SZC is not null");
            return (Criteria) this;
        }

        public Criteria andSzcEqualTo(Object value) {
            addCriterion("SZC =", value, "szc");
            return (Criteria) this;
        }

        public Criteria andSzcNotEqualTo(Object value) {
            addCriterion("SZC <>", value, "szc");
            return (Criteria) this;
        }

        public Criteria andSzcGreaterThan(Object value) {
            addCriterion("SZC >", value, "szc");
            return (Criteria) this;
        }

        public Criteria andSzcGreaterThanOrEqualTo(Object value) {
            addCriterion("SZC >=", value, "szc");
            return (Criteria) this;
        }

        public Criteria andSzcLessThan(Object value) {
            addCriterion("SZC <", value, "szc");
            return (Criteria) this;
        }

        public Criteria andSzcLessThanOrEqualTo(Object value) {
            addCriterion("SZC <=", value, "szc");
            return (Criteria) this;
        }

        public Criteria andSzcIn(List<Object> values) {
            addCriterion("SZC in", values, "szc");
            return (Criteria) this;
        }

        public Criteria andSzcNotIn(List<Object> values) {
            addCriterion("SZC not in", values, "szc");
            return (Criteria) this;
        }

        public Criteria andSzcBetween(Object value1, Object value2) {
            addCriterion("SZC between", value1, value2, "szc");
            return (Criteria) this;
        }

        public Criteria andSzcNotBetween(Object value1, Object value2) {
            addCriterion("SZC not between", value1, value2, "szc");
            return (Criteria) this;
        }

        public Criteria andQzhIsNull() {
            addCriterion("QZH is null");
            return (Criteria) this;
        }

        public Criteria andQzhIsNotNull() {
            addCriterion("QZH is not null");
            return (Criteria) this;
        }

        public Criteria andQzhEqualTo(Object value) {
            addCriterion("QZH =", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhNotEqualTo(Object value) {
            addCriterion("QZH <>", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhGreaterThan(Object value) {
            addCriterion("QZH >", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhGreaterThanOrEqualTo(Object value) {
            addCriterion("QZH >=", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhLessThan(Object value) {
            addCriterion("QZH <", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhLessThanOrEqualTo(Object value) {
            addCriterion("QZH <=", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhIn(List<Object> values) {
            addCriterion("QZH in", values, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhNotIn(List<Object> values) {
            addCriterion("QZH not in", values, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhBetween(Object value1, Object value2) {
            addCriterion("QZH between", value1, value2, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhNotBetween(Object value1, Object value2) {
            addCriterion("QZH not between", value1, value2, "qzh");
            return (Criteria) this;
        }

        public Criteria andZmhIsNull() {
            addCriterion("ZMH is null");
            return (Criteria) this;
        }

        public Criteria andZmhIsNotNull() {
            addCriterion("ZMH is not null");
            return (Criteria) this;
        }

        public Criteria andZmhEqualTo(Object value) {
            addCriterion("ZMH =", value, "zmh");
            return (Criteria) this;
        }

        public Criteria andZmhNotEqualTo(Object value) {
            addCriterion("ZMH <>", value, "zmh");
            return (Criteria) this;
        }

        public Criteria andZmhGreaterThan(Object value) {
            addCriterion("ZMH >", value, "zmh");
            return (Criteria) this;
        }

        public Criteria andZmhGreaterThanOrEqualTo(Object value) {
            addCriterion("ZMH >=", value, "zmh");
            return (Criteria) this;
        }

        public Criteria andZmhLessThan(Object value) {
            addCriterion("ZMH <", value, "zmh");
            return (Criteria) this;
        }

        public Criteria andZmhLessThanOrEqualTo(Object value) {
            addCriterion("ZMH <=", value, "zmh");
            return (Criteria) this;
        }

        public Criteria andZmhIn(List<Object> values) {
            addCriterion("ZMH in", values, "zmh");
            return (Criteria) this;
        }

        public Criteria andZmhNotIn(List<Object> values) {
            addCriterion("ZMH not in", values, "zmh");
            return (Criteria) this;
        }

        public Criteria andZmhBetween(Object value1, Object value2) {
            addCriterion("ZMH between", value1, value2, "zmh");
            return (Criteria) this;
        }

        public Criteria andZmhNotBetween(Object value1, Object value2) {
            addCriterion("ZMH not between", value1, value2, "zmh");
            return (Criteria) this;
        }

        public Criteria andQzhzsbhIsNull() {
            addCriterion("QZHZSBH is null");
            return (Criteria) this;
        }

        public Criteria andQzhzsbhIsNotNull() {
            addCriterion("QZHZSBH is not null");
            return (Criteria) this;
        }

        public Criteria andQzhzsbhEqualTo(Object value) {
            addCriterion("QZHZSBH =", value, "qzhzsbh");
            return (Criteria) this;
        }

        public Criteria andQzhzsbhNotEqualTo(Object value) {
            addCriterion("QZHZSBH <>", value, "qzhzsbh");
            return (Criteria) this;
        }

        public Criteria andQzhzsbhGreaterThan(Object value) {
            addCriterion("QZHZSBH >", value, "qzhzsbh");
            return (Criteria) this;
        }

        public Criteria andQzhzsbhGreaterThanOrEqualTo(Object value) {
            addCriterion("QZHZSBH >=", value, "qzhzsbh");
            return (Criteria) this;
        }

        public Criteria andQzhzsbhLessThan(Object value) {
            addCriterion("QZHZSBH <", value, "qzhzsbh");
            return (Criteria) this;
        }

        public Criteria andQzhzsbhLessThanOrEqualTo(Object value) {
            addCriterion("QZHZSBH <=", value, "qzhzsbh");
            return (Criteria) this;
        }

        public Criteria andQzhzsbhIn(List<Object> values) {
            addCriterion("QZHZSBH in", values, "qzhzsbh");
            return (Criteria) this;
        }

        public Criteria andQzhzsbhNotIn(List<Object> values) {
            addCriterion("QZHZSBH not in", values, "qzhzsbh");
            return (Criteria) this;
        }

        public Criteria andQzhzsbhBetween(Object value1, Object value2) {
            addCriterion("QZHZSBH between", value1, value2, "qzhzsbh");
            return (Criteria) this;
        }

        public Criteria andQzhzsbhNotBetween(Object value1, Object value2) {
            addCriterion("QZHZSBH not between", value1, value2, "qzhzsbh");
            return (Criteria) this;
        }

        public Criteria andZmhzsbhIsNull() {
            addCriterion("ZMHZSBH is null");
            return (Criteria) this;
        }

        public Criteria andZmhzsbhIsNotNull() {
            addCriterion("ZMHZSBH is not null");
            return (Criteria) this;
        }

        public Criteria andZmhzsbhEqualTo(Object value) {
            addCriterion("ZMHZSBH =", value, "zmhzsbh");
            return (Criteria) this;
        }

        public Criteria andZmhzsbhNotEqualTo(Object value) {
            addCriterion("ZMHZSBH <>", value, "zmhzsbh");
            return (Criteria) this;
        }

        public Criteria andZmhzsbhGreaterThan(Object value) {
            addCriterion("ZMHZSBH >", value, "zmhzsbh");
            return (Criteria) this;
        }

        public Criteria andZmhzsbhGreaterThanOrEqualTo(Object value) {
            addCriterion("ZMHZSBH >=", value, "zmhzsbh");
            return (Criteria) this;
        }

        public Criteria andZmhzsbhLessThan(Object value) {
            addCriterion("ZMHZSBH <", value, "zmhzsbh");
            return (Criteria) this;
        }

        public Criteria andZmhzsbhLessThanOrEqualTo(Object value) {
            addCriterion("ZMHZSBH <=", value, "zmhzsbh");
            return (Criteria) this;
        }

        public Criteria andZmhzsbhIn(List<Object> values) {
            addCriterion("ZMHZSBH in", values, "zmhzsbh");
            return (Criteria) this;
        }

        public Criteria andZmhzsbhNotIn(List<Object> values) {
            addCriterion("ZMHZSBH not in", values, "zmhzsbh");
            return (Criteria) this;
        }

        public Criteria andZmhzsbhBetween(Object value1, Object value2) {
            addCriterion("ZMHZSBH between", value1, value2, "zmhzsbh");
            return (Criteria) this;
        }

        public Criteria andZmhzsbhNotBetween(Object value1, Object value2) {
            addCriterion("ZMHZSBH not between", value1, value2, "zmhzsbh");
            return (Criteria) this;
        }

        public Criteria andFajidIsNull() {
            addCriterion("FAJID is null");
            return (Criteria) this;
        }

        public Criteria andFajidIsNotNull() {
            addCriterion("FAJID is not null");
            return (Criteria) this;
        }

        public Criteria andFajidEqualTo(Object value) {
            addCriterion("FAJID =", value, "fajid");
            return (Criteria) this;
        }

        public Criteria andFajidNotEqualTo(Object value) {
            addCriterion("FAJID <>", value, "fajid");
            return (Criteria) this;
        }

        public Criteria andFajidGreaterThan(Object value) {
            addCriterion("FAJID >", value, "fajid");
            return (Criteria) this;
        }

        public Criteria andFajidGreaterThanOrEqualTo(Object value) {
            addCriterion("FAJID >=", value, "fajid");
            return (Criteria) this;
        }

        public Criteria andFajidLessThan(Object value) {
            addCriterion("FAJID <", value, "fajid");
            return (Criteria) this;
        }

        public Criteria andFajidLessThanOrEqualTo(Object value) {
            addCriterion("FAJID <=", value, "fajid");
            return (Criteria) this;
        }

        public Criteria andFajidIn(List<Object> values) {
            addCriterion("FAJID in", values, "fajid");
            return (Criteria) this;
        }

        public Criteria andFajidNotIn(List<Object> values) {
            addCriterion("FAJID not in", values, "fajid");
            return (Criteria) this;
        }

        public Criteria andFajidBetween(Object value1, Object value2) {
            addCriterion("FAJID between", value1, value2, "fajid");
            return (Criteria) this;
        }

        public Criteria andFajidNotBetween(Object value1, Object value2) {
            addCriterion("FAJID not between", value1, value2, "fajid");
            return (Criteria) this;
        }

        public Criteria andAjhbdcIsNull() {
            addCriterion("AJHBDC is null");
            return (Criteria) this;
        }

        public Criteria andAjhbdcIsNotNull() {
            addCriterion("AJHBDC is not null");
            return (Criteria) this;
        }

        public Criteria andAjhbdcEqualTo(Object value) {
            addCriterion("AJHBDC =", value, "ajhbdc");
            return (Criteria) this;
        }

        public Criteria andAjhbdcNotEqualTo(Object value) {
            addCriterion("AJHBDC <>", value, "ajhbdc");
            return (Criteria) this;
        }

        public Criteria andAjhbdcGreaterThan(Object value) {
            addCriterion("AJHBDC >", value, "ajhbdc");
            return (Criteria) this;
        }

        public Criteria andAjhbdcGreaterThanOrEqualTo(Object value) {
            addCriterion("AJHBDC >=", value, "ajhbdc");
            return (Criteria) this;
        }

        public Criteria andAjhbdcLessThan(Object value) {
            addCriterion("AJHBDC <", value, "ajhbdc");
            return (Criteria) this;
        }

        public Criteria andAjhbdcLessThanOrEqualTo(Object value) {
            addCriterion("AJHBDC <=", value, "ajhbdc");
            return (Criteria) this;
        }

        public Criteria andAjhbdcIn(List<Object> values) {
            addCriterion("AJHBDC in", values, "ajhbdc");
            return (Criteria) this;
        }

        public Criteria andAjhbdcNotIn(List<Object> values) {
            addCriterion("AJHBDC not in", values, "ajhbdc");
            return (Criteria) this;
        }

        public Criteria andAjhbdcBetween(Object value1, Object value2) {
            addCriterion("AJHBDC between", value1, value2, "ajhbdc");
            return (Criteria) this;
        }

        public Criteria andAjhbdcNotBetween(Object value1, Object value2) {
            addCriterion("AJHBDC not between", value1, value2, "ajhbdc");
            return (Criteria) this;
        }

        public Criteria andDagbhIsNull() {
            addCriterion("DAGBH is null");
            return (Criteria) this;
        }

        public Criteria andDagbhIsNotNull() {
            addCriterion("DAGBH is not null");
            return (Criteria) this;
        }

        public Criteria andDagbhEqualTo(Object value) {
            addCriterion("DAGBH =", value, "dagbh");
            return (Criteria) this;
        }

        public Criteria andDagbhNotEqualTo(Object value) {
            addCriterion("DAGBH <>", value, "dagbh");
            return (Criteria) this;
        }

        public Criteria andDagbhGreaterThan(Object value) {
            addCriterion("DAGBH >", value, "dagbh");
            return (Criteria) this;
        }

        public Criteria andDagbhGreaterThanOrEqualTo(Object value) {
            addCriterion("DAGBH >=", value, "dagbh");
            return (Criteria) this;
        }

        public Criteria andDagbhLessThan(Object value) {
            addCriterion("DAGBH <", value, "dagbh");
            return (Criteria) this;
        }

        public Criteria andDagbhLessThanOrEqualTo(Object value) {
            addCriterion("DAGBH <=", value, "dagbh");
            return (Criteria) this;
        }

        public Criteria andDagbhIn(List<Object> values) {
            addCriterion("DAGBH in", values, "dagbh");
            return (Criteria) this;
        }

        public Criteria andDagbhNotIn(List<Object> values) {
            addCriterion("DAGBH not in", values, "dagbh");
            return (Criteria) this;
        }

        public Criteria andDagbhBetween(Object value1, Object value2) {
            addCriterion("DAGBH between", value1, value2, "dagbh");
            return (Criteria) this;
        }

        public Criteria andDagbhNotBetween(Object value1, Object value2) {
            addCriterion("DAGBH not between", value1, value2, "dagbh");
            return (Criteria) this;
        }

        public Criteria andDahbhIsNull() {
            addCriterion("DAHBH is null");
            return (Criteria) this;
        }

        public Criteria andDahbhIsNotNull() {
            addCriterion("DAHBH is not null");
            return (Criteria) this;
        }

        public Criteria andDahbhEqualTo(Object value) {
            addCriterion("DAHBH =", value, "dahbh");
            return (Criteria) this;
        }

        public Criteria andDahbhNotEqualTo(Object value) {
            addCriterion("DAHBH <>", value, "dahbh");
            return (Criteria) this;
        }

        public Criteria andDahbhGreaterThan(Object value) {
            addCriterion("DAHBH >", value, "dahbh");
            return (Criteria) this;
        }

        public Criteria andDahbhGreaterThanOrEqualTo(Object value) {
            addCriterion("DAHBH >=", value, "dahbh");
            return (Criteria) this;
        }

        public Criteria andDahbhLessThan(Object value) {
            addCriterion("DAHBH <", value, "dahbh");
            return (Criteria) this;
        }

        public Criteria andDahbhLessThanOrEqualTo(Object value) {
            addCriterion("DAHBH <=", value, "dahbh");
            return (Criteria) this;
        }

        public Criteria andDahbhIn(List<Object> values) {
            addCriterion("DAHBH in", values, "dahbh");
            return (Criteria) this;
        }

        public Criteria andDahbhNotIn(List<Object> values) {
            addCriterion("DAHBH not in", values, "dahbh");
            return (Criteria) this;
        }

        public Criteria andDahbhBetween(Object value1, Object value2) {
            addCriterion("DAHBH between", value1, value2, "dahbh");
            return (Criteria) this;
        }

        public Criteria andDahbhNotBetween(Object value1, Object value2) {
            addCriterion("DAHBH not between", value1, value2, "dahbh");
            return (Criteria) this;
        }

        public Criteria andGyqkIsNull() {
            addCriterion("GYQK is null");
            return (Criteria) this;
        }

        public Criteria andGyqkIsNotNull() {
            addCriterion("GYQK is not null");
            return (Criteria) this;
        }

        public Criteria andGyqkEqualTo(Object value) {
            addCriterion("GYQK =", value, "gyqk");
            return (Criteria) this;
        }

        public Criteria andGyqkNotEqualTo(Object value) {
            addCriterion("GYQK <>", value, "gyqk");
            return (Criteria) this;
        }

        public Criteria andGyqkGreaterThan(Object value) {
            addCriterion("GYQK >", value, "gyqk");
            return (Criteria) this;
        }

        public Criteria andGyqkGreaterThanOrEqualTo(Object value) {
            addCriterion("GYQK >=", value, "gyqk");
            return (Criteria) this;
        }

        public Criteria andGyqkLessThan(Object value) {
            addCriterion("GYQK <", value, "gyqk");
            return (Criteria) this;
        }

        public Criteria andGyqkLessThanOrEqualTo(Object value) {
            addCriterion("GYQK <=", value, "gyqk");
            return (Criteria) this;
        }

        public Criteria andGyqkIn(List<Object> values) {
            addCriterion("GYQK in", values, "gyqk");
            return (Criteria) this;
        }

        public Criteria andGyqkNotIn(List<Object> values) {
            addCriterion("GYQK not in", values, "gyqk");
            return (Criteria) this;
        }

        public Criteria andGyqkBetween(Object value1, Object value2) {
            addCriterion("GYQK between", value1, value2, "gyqk");
            return (Criteria) this;
        }

        public Criteria andGyqkNotBetween(Object value1, Object value2) {
            addCriterion("GYQK not between", value1, value2, "gyqk");
            return (Criteria) this;
        }

        public Criteria andQlxzIsNull() {
            addCriterion("QLXZ is null");
            return (Criteria) this;
        }

        public Criteria andQlxzIsNotNull() {
            addCriterion("QLXZ is not null");
            return (Criteria) this;
        }

        public Criteria andQlxzEqualTo(Object value) {
            addCriterion("QLXZ =", value, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzNotEqualTo(Object value) {
            addCriterion("QLXZ <>", value, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzGreaterThan(Object value) {
            addCriterion("QLXZ >", value, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzGreaterThanOrEqualTo(Object value) {
            addCriterion("QLXZ >=", value, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzLessThan(Object value) {
            addCriterion("QLXZ <", value, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzLessThanOrEqualTo(Object value) {
            addCriterion("QLXZ <=", value, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzIn(List<Object> values) {
            addCriterion("QLXZ in", values, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzNotIn(List<Object> values) {
            addCriterion("QLXZ not in", values, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzBetween(Object value1, Object value2) {
            addCriterion("QLXZ between", value1, value2, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzNotBetween(Object value1, Object value2) {
            addCriterion("QLXZ not between", value1, value2, "qlxz");
            return (Criteria) this;
        }

        public Criteria andSyqxIsNull() {
            addCriterion("SYQX is null");
            return (Criteria) this;
        }

        public Criteria andSyqxIsNotNull() {
            addCriterion("SYQX is not null");
            return (Criteria) this;
        }

        public Criteria andSyqxEqualTo(Object value) {
            addCriterion("SYQX =", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxNotEqualTo(Object value) {
            addCriterion("SYQX <>", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxGreaterThan(Object value) {
            addCriterion("SYQX >", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxGreaterThanOrEqualTo(Object value) {
            addCriterion("SYQX >=", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxLessThan(Object value) {
            addCriterion("SYQX <", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxLessThanOrEqualTo(Object value) {
            addCriterion("SYQX <=", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxIn(List<Object> values) {
            addCriterion("SYQX in", values, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxNotIn(List<Object> values) {
            addCriterion("SYQX not in", values, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxBetween(Object value1, Object value2) {
            addCriterion("SYQX between", value1, value2, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxNotBetween(Object value1, Object value2) {
            addCriterion("SYQX not between", value1, value2, "syqx");
            return (Criteria) this;
        }

        public Criteria andMjIsNull() {
            addCriterion("MJ is null");
            return (Criteria) this;
        }

        public Criteria andMjIsNotNull() {
            addCriterion("MJ is not null");
            return (Criteria) this;
        }

        public Criteria andMjEqualTo(Object value) {
            addCriterion("MJ =", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjNotEqualTo(Object value) {
            addCriterion("MJ <>", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjGreaterThan(Object value) {
            addCriterion("MJ >", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjGreaterThanOrEqualTo(Object value) {
            addCriterion("MJ >=", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjLessThan(Object value) {
            addCriterion("MJ <", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjLessThanOrEqualTo(Object value) {
            addCriterion("MJ <=", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjIn(List<Object> values) {
            addCriterion("MJ in", values, "mj");
            return (Criteria) this;
        }

        public Criteria andMjNotIn(List<Object> values) {
            addCriterion("MJ not in", values, "mj");
            return (Criteria) this;
        }

        public Criteria andMjBetween(Object value1, Object value2) {
            addCriterion("MJ between", value1, value2, "mj");
            return (Criteria) this;
        }

        public Criteria andMjNotBetween(Object value1, Object value2) {
            addCriterion("MJ not between", value1, value2, "mj");
            return (Criteria) this;
        }

        public Criteria andQlqtzkIsNull() {
            addCriterion("QLQTZK is null");
            return (Criteria) this;
        }

        public Criteria andQlqtzkIsNotNull() {
            addCriterion("QLQTZK is not null");
            return (Criteria) this;
        }

        public Criteria andQlqtzkEqualTo(Object value) {
            addCriterion("QLQTZK =", value, "qlqtzk");
            return (Criteria) this;
        }

        public Criteria andQlqtzkNotEqualTo(Object value) {
            addCriterion("QLQTZK <>", value, "qlqtzk");
            return (Criteria) this;
        }

        public Criteria andQlqtzkGreaterThan(Object value) {
            addCriterion("QLQTZK >", value, "qlqtzk");
            return (Criteria) this;
        }

        public Criteria andQlqtzkGreaterThanOrEqualTo(Object value) {
            addCriterion("QLQTZK >=", value, "qlqtzk");
            return (Criteria) this;
        }

        public Criteria andQlqtzkLessThan(Object value) {
            addCriterion("QLQTZK <", value, "qlqtzk");
            return (Criteria) this;
        }

        public Criteria andQlqtzkLessThanOrEqualTo(Object value) {
            addCriterion("QLQTZK <=", value, "qlqtzk");
            return (Criteria) this;
        }

        public Criteria andQlqtzkIn(List<Object> values) {
            addCriterion("QLQTZK in", values, "qlqtzk");
            return (Criteria) this;
        }

        public Criteria andQlqtzkNotIn(List<Object> values) {
            addCriterion("QLQTZK not in", values, "qlqtzk");
            return (Criteria) this;
        }

        public Criteria andQlqtzkBetween(Object value1, Object value2) {
            addCriterion("QLQTZK between", value1, value2, "qlqtzk");
            return (Criteria) this;
        }

        public Criteria andQlqtzkNotBetween(Object value1, Object value2) {
            addCriterion("QLQTZK not between", value1, value2, "qlqtzk");
            return (Criteria) this;
        }

        public Criteria andYtIsNull() {
            addCriterion("YT is null");
            return (Criteria) this;
        }

        public Criteria andYtIsNotNull() {
            addCriterion("YT is not null");
            return (Criteria) this;
        }

        public Criteria andYtEqualTo(Object value) {
            addCriterion("YT =", value, "yt");
            return (Criteria) this;
        }

        public Criteria andYtNotEqualTo(Object value) {
            addCriterion("YT <>", value, "yt");
            return (Criteria) this;
        }

        public Criteria andYtGreaterThan(Object value) {
            addCriterion("YT >", value, "yt");
            return (Criteria) this;
        }

        public Criteria andYtGreaterThanOrEqualTo(Object value) {
            addCriterion("YT >=", value, "yt");
            return (Criteria) this;
        }

        public Criteria andYtLessThan(Object value) {
            addCriterion("YT <", value, "yt");
            return (Criteria) this;
        }

        public Criteria andYtLessThanOrEqualTo(Object value) {
            addCriterion("YT <=", value, "yt");
            return (Criteria) this;
        }

        public Criteria andYtIn(List<Object> values) {
            addCriterion("YT in", values, "yt");
            return (Criteria) this;
        }

        public Criteria andYtNotIn(List<Object> values) {
            addCriterion("YT not in", values, "yt");
            return (Criteria) this;
        }

        public Criteria andYtBetween(Object value1, Object value2) {
            addCriterion("YT between", value1, value2, "yt");
            return (Criteria) this;
        }

        public Criteria andYtNotBetween(Object value1, Object value2) {
            addCriterion("YT not between", value1, value2, "yt");
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