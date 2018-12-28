package com.supermap.dossiertool.smattrEntity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class QlrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QlrExample() {
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

        public Criteria andQlbsmIsNull() {
            addCriterion("QLBSM is null");
            return (Criteria) this;
        }

        public Criteria andQlbsmIsNotNull() {
            addCriterion("QLBSM is not null");
            return (Criteria) this;
        }

        public Criteria andQlbsmEqualTo(String value) {
            addCriterion("QLBSM =", value, "qlbsm");
            return (Criteria) this;
        }

        public Criteria andQlbsmNotEqualTo(String value) {
            addCriterion("QLBSM <>", value, "qlbsm");
            return (Criteria) this;
        }

        public Criteria andQlbsmGreaterThan(String value) {
            addCriterion("QLBSM >", value, "qlbsm");
            return (Criteria) this;
        }

        public Criteria andQlbsmGreaterThanOrEqualTo(String value) {
            addCriterion("QLBSM >=", value, "qlbsm");
            return (Criteria) this;
        }

        public Criteria andQlbsmLessThan(String value) {
            addCriterion("QLBSM <", value, "qlbsm");
            return (Criteria) this;
        }

        public Criteria andQlbsmLessThanOrEqualTo(String value) {
            addCriterion("QLBSM <=", value, "qlbsm");
            return (Criteria) this;
        }

        public Criteria andQlbsmIn(List<String> values) {
            addCriterion("QLBSM in", values, "qlbsm");
            return (Criteria) this;
        }

        public Criteria andQlbsmNotIn(List<String> values) {
            addCriterion("QLBSM not in", values, "qlbsm");
            return (Criteria) this;
        }

        public Criteria andQlbsmBetween(String value1, String value2) {
            addCriterion("QLBSM between", value1, value2, "qlbsm");
            return (Criteria) this;
        }

        public Criteria andQlbsmNotBetween(String value1, String value2) {
            addCriterion("QLBSM not between", value1, value2, "qlbsm");
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

        public Criteria andSxhIsNull() {
            addCriterion("SXH is null");
            return (Criteria) this;
        }

        public Criteria andSxhIsNotNull() {
            addCriterion("SXH is not null");
            return (Criteria) this;
        }

        public Criteria andSxhEqualTo(BigDecimal value) {
            addCriterion("SXH =", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhNotEqualTo(BigDecimal value) {
            addCriterion("SXH <>", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhGreaterThan(BigDecimal value) {
            addCriterion("SXH >", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SXH >=", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhLessThan(BigDecimal value) {
            addCriterion("SXH <", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SXH <=", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhIn(List<BigDecimal> values) {
            addCriterion("SXH in", values, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhNotIn(List<BigDecimal> values) {
            addCriterion("SXH not in", values, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SXH between", value1, value2, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SXH not between", value1, value2, "sxh");
            return (Criteria) this;
        }

        public Criteria andQlrmcIsNull() {
            addCriterion("QLRMC is null");
            return (Criteria) this;
        }

        public Criteria andQlrmcIsNotNull() {
            addCriterion("QLRMC is not null");
            return (Criteria) this;
        }

        public Criteria andQlrmcEqualTo(String value) {
            addCriterion("QLRMC =", value, "qlrmc");
            return (Criteria) this;
        }

        public Criteria andQlrmcNotEqualTo(String value) {
            addCriterion("QLRMC <>", value, "qlrmc");
            return (Criteria) this;
        }

        public Criteria andQlrmcGreaterThan(String value) {
            addCriterion("QLRMC >", value, "qlrmc");
            return (Criteria) this;
        }

        public Criteria andQlrmcGreaterThanOrEqualTo(String value) {
            addCriterion("QLRMC >=", value, "qlrmc");
            return (Criteria) this;
        }

        public Criteria andQlrmcLessThan(String value) {
            addCriterion("QLRMC <", value, "qlrmc");
            return (Criteria) this;
        }

        public Criteria andQlrmcLessThanOrEqualTo(String value) {
            addCriterion("QLRMC <=", value, "qlrmc");
            return (Criteria) this;
        }

        public Criteria andQlrmcIn(List<String> values) {
            addCriterion("QLRMC in", values, "qlrmc");
            return (Criteria) this;
        }

        public Criteria andQlrmcNotIn(List<String> values) {
            addCriterion("QLRMC not in", values, "qlrmc");
            return (Criteria) this;
        }

        public Criteria andQlrmcBetween(String value1, String value2) {
            addCriterion("QLRMC between", value1, value2, "qlrmc");
            return (Criteria) this;
        }

        public Criteria andQlrmcNotBetween(String value1, String value2) {
            addCriterion("QLRMC not between", value1, value2, "qlrmc");
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

        public Criteria andQzysxlhIsNull() {
            addCriterion("QZYSXLH is null");
            return (Criteria) this;
        }

        public Criteria andQzysxlhIsNotNull() {
            addCriterion("QZYSXLH is not null");
            return (Criteria) this;
        }

        public Criteria andQzysxlhEqualTo(String value) {
            addCriterion("QZYSXLH =", value, "qzysxlh");
            return (Criteria) this;
        }

        public Criteria andQzysxlhNotEqualTo(String value) {
            addCriterion("QZYSXLH <>", value, "qzysxlh");
            return (Criteria) this;
        }

        public Criteria andQzysxlhGreaterThan(String value) {
            addCriterion("QZYSXLH >", value, "qzysxlh");
            return (Criteria) this;
        }

        public Criteria andQzysxlhGreaterThanOrEqualTo(String value) {
            addCriterion("QZYSXLH >=", value, "qzysxlh");
            return (Criteria) this;
        }

        public Criteria andQzysxlhLessThan(String value) {
            addCriterion("QZYSXLH <", value, "qzysxlh");
            return (Criteria) this;
        }

        public Criteria andQzysxlhLessThanOrEqualTo(String value) {
            addCriterion("QZYSXLH <=", value, "qzysxlh");
            return (Criteria) this;
        }

        public Criteria andQzysxlhIn(List<String> values) {
            addCriterion("QZYSXLH in", values, "qzysxlh");
            return (Criteria) this;
        }

        public Criteria andQzysxlhNotIn(List<String> values) {
            addCriterion("QZYSXLH not in", values, "qzysxlh");
            return (Criteria) this;
        }

        public Criteria andQzysxlhBetween(String value1, String value2) {
            addCriterion("QZYSXLH between", value1, value2, "qzysxlh");
            return (Criteria) this;
        }

        public Criteria andQzysxlhNotBetween(String value1, String value2) {
            addCriterion("QZYSXLH not between", value1, value2, "qzysxlh");
            return (Criteria) this;
        }

        public Criteria andSfczrIsNull() {
            addCriterion("SFCZR is null");
            return (Criteria) this;
        }

        public Criteria andSfczrIsNotNull() {
            addCriterion("SFCZR is not null");
            return (Criteria) this;
        }

        public Criteria andSfczrEqualTo(String value) {
            addCriterion("SFCZR =", value, "sfczr");
            return (Criteria) this;
        }

        public Criteria andSfczrNotEqualTo(String value) {
            addCriterion("SFCZR <>", value, "sfczr");
            return (Criteria) this;
        }

        public Criteria andSfczrGreaterThan(String value) {
            addCriterion("SFCZR >", value, "sfczr");
            return (Criteria) this;
        }

        public Criteria andSfczrGreaterThanOrEqualTo(String value) {
            addCriterion("SFCZR >=", value, "sfczr");
            return (Criteria) this;
        }

        public Criteria andSfczrLessThan(String value) {
            addCriterion("SFCZR <", value, "sfczr");
            return (Criteria) this;
        }

        public Criteria andSfczrLessThanOrEqualTo(String value) {
            addCriterion("SFCZR <=", value, "sfczr");
            return (Criteria) this;
        }

        public Criteria andSfczrIn(List<String> values) {
            addCriterion("SFCZR in", values, "sfczr");
            return (Criteria) this;
        }

        public Criteria andSfczrNotIn(List<String> values) {
            addCriterion("SFCZR not in", values, "sfczr");
            return (Criteria) this;
        }

        public Criteria andSfczrBetween(String value1, String value2) {
            addCriterion("SFCZR between", value1, value2, "sfczr");
            return (Criteria) this;
        }

        public Criteria andSfczrNotBetween(String value1, String value2) {
            addCriterion("SFCZR not between", value1, value2, "sfczr");
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

        public Criteria andZjzlEqualTo(String value) {
            addCriterion("ZJZL =", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlNotEqualTo(String value) {
            addCriterion("ZJZL <>", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlGreaterThan(String value) {
            addCriterion("ZJZL >", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlGreaterThanOrEqualTo(String value) {
            addCriterion("ZJZL >=", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlLessThan(String value) {
            addCriterion("ZJZL <", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlLessThanOrEqualTo(String value) {
            addCriterion("ZJZL <=", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlIn(List<String> values) {
            addCriterion("ZJZL in", values, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlNotIn(List<String> values) {
            addCriterion("ZJZL not in", values, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlBetween(String value1, String value2) {
            addCriterion("ZJZL between", value1, value2, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlNotBetween(String value1, String value2) {
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

        public Criteria andZjhEqualTo(String value) {
            addCriterion("ZJH =", value, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhNotEqualTo(String value) {
            addCriterion("ZJH <>", value, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhGreaterThan(String value) {
            addCriterion("ZJH >", value, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhGreaterThanOrEqualTo(String value) {
            addCriterion("ZJH >=", value, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhLessThan(String value) {
            addCriterion("ZJH <", value, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhLessThanOrEqualTo(String value) {
            addCriterion("ZJH <=", value, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhIn(List<String> values) {
            addCriterion("ZJH in", values, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhNotIn(List<String> values) {
            addCriterion("ZJH not in", values, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhBetween(String value1, String value2) {
            addCriterion("ZJH between", value1, value2, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhNotBetween(String value1, String value2) {
            addCriterion("ZJH not between", value1, value2, "zjh");
            return (Criteria) this;
        }

        public Criteria andFzjgIsNull() {
            addCriterion("FZJG is null");
            return (Criteria) this;
        }

        public Criteria andFzjgIsNotNull() {
            addCriterion("FZJG is not null");
            return (Criteria) this;
        }

        public Criteria andFzjgEqualTo(String value) {
            addCriterion("FZJG =", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgNotEqualTo(String value) {
            addCriterion("FZJG <>", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgGreaterThan(String value) {
            addCriterion("FZJG >", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgGreaterThanOrEqualTo(String value) {
            addCriterion("FZJG >=", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgLessThan(String value) {
            addCriterion("FZJG <", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgLessThanOrEqualTo(String value) {
            addCriterion("FZJG <=", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgIn(List<String> values) {
            addCriterion("FZJG in", values, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgNotIn(List<String> values) {
            addCriterion("FZJG not in", values, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgBetween(String value1, String value2) {
            addCriterion("FZJG between", value1, value2, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgNotBetween(String value1, String value2) {
            addCriterion("FZJG not between", value1, value2, "fzjg");
            return (Criteria) this;
        }

        public Criteria andSshyIsNull() {
            addCriterion("SSHY is null");
            return (Criteria) this;
        }

        public Criteria andSshyIsNotNull() {
            addCriterion("SSHY is not null");
            return (Criteria) this;
        }

        public Criteria andSshyEqualTo(String value) {
            addCriterion("SSHY =", value, "sshy");
            return (Criteria) this;
        }

        public Criteria andSshyNotEqualTo(String value) {
            addCriterion("SSHY <>", value, "sshy");
            return (Criteria) this;
        }

        public Criteria andSshyGreaterThan(String value) {
            addCriterion("SSHY >", value, "sshy");
            return (Criteria) this;
        }

        public Criteria andSshyGreaterThanOrEqualTo(String value) {
            addCriterion("SSHY >=", value, "sshy");
            return (Criteria) this;
        }

        public Criteria andSshyLessThan(String value) {
            addCriterion("SSHY <", value, "sshy");
            return (Criteria) this;
        }

        public Criteria andSshyLessThanOrEqualTo(String value) {
            addCriterion("SSHY <=", value, "sshy");
            return (Criteria) this;
        }

        public Criteria andSshyIn(List<String> values) {
            addCriterion("SSHY in", values, "sshy");
            return (Criteria) this;
        }

        public Criteria andSshyNotIn(List<String> values) {
            addCriterion("SSHY not in", values, "sshy");
            return (Criteria) this;
        }

        public Criteria andSshyBetween(String value1, String value2) {
            addCriterion("SSHY between", value1, value2, "sshy");
            return (Criteria) this;
        }

        public Criteria andSshyNotBetween(String value1, String value2) {
            addCriterion("SSHY not between", value1, value2, "sshy");
            return (Criteria) this;
        }

        public Criteria andGjIsNull() {
            addCriterion("GJ is null");
            return (Criteria) this;
        }

        public Criteria andGjIsNotNull() {
            addCriterion("GJ is not null");
            return (Criteria) this;
        }

        public Criteria andGjEqualTo(String value) {
            addCriterion("GJ =", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotEqualTo(String value) {
            addCriterion("GJ <>", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjGreaterThan(String value) {
            addCriterion("GJ >", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjGreaterThanOrEqualTo(String value) {
            addCriterion("GJ >=", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjLessThan(String value) {
            addCriterion("GJ <", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjLessThanOrEqualTo(String value) {
            addCriterion("GJ <=", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjIn(List<String> values) {
            addCriterion("GJ in", values, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotIn(List<String> values) {
            addCriterion("GJ not in", values, "gj");
            return (Criteria) this;
        }

        public Criteria andGjBetween(String value1, String value2) {
            addCriterion("GJ between", value1, value2, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotBetween(String value1, String value2) {
            addCriterion("GJ not between", value1, value2, "gj");
            return (Criteria) this;
        }

        public Criteria andHjszssIsNull() {
            addCriterion("HJSZSS is null");
            return (Criteria) this;
        }

        public Criteria andHjszssIsNotNull() {
            addCriterion("HJSZSS is not null");
            return (Criteria) this;
        }

        public Criteria andHjszssEqualTo(String value) {
            addCriterion("HJSZSS =", value, "hjszss");
            return (Criteria) this;
        }

        public Criteria andHjszssNotEqualTo(String value) {
            addCriterion("HJSZSS <>", value, "hjszss");
            return (Criteria) this;
        }

        public Criteria andHjszssGreaterThan(String value) {
            addCriterion("HJSZSS >", value, "hjszss");
            return (Criteria) this;
        }

        public Criteria andHjszssGreaterThanOrEqualTo(String value) {
            addCriterion("HJSZSS >=", value, "hjszss");
            return (Criteria) this;
        }

        public Criteria andHjszssLessThan(String value) {
            addCriterion("HJSZSS <", value, "hjszss");
            return (Criteria) this;
        }

        public Criteria andHjszssLessThanOrEqualTo(String value) {
            addCriterion("HJSZSS <=", value, "hjszss");
            return (Criteria) this;
        }

        public Criteria andHjszssIn(List<String> values) {
            addCriterion("HJSZSS in", values, "hjszss");
            return (Criteria) this;
        }

        public Criteria andHjszssNotIn(List<String> values) {
            addCriterion("HJSZSS not in", values, "hjszss");
            return (Criteria) this;
        }

        public Criteria andHjszssBetween(String value1, String value2) {
            addCriterion("HJSZSS between", value1, value2, "hjszss");
            return (Criteria) this;
        }

        public Criteria andHjszssNotBetween(String value1, String value2) {
            addCriterion("HJSZSS not between", value1, value2, "hjszss");
            return (Criteria) this;
        }

        public Criteria andXbIsNull() {
            addCriterion("XB is null");
            return (Criteria) this;
        }

        public Criteria andXbIsNotNull() {
            addCriterion("XB is not null");
            return (Criteria) this;
        }

        public Criteria andXbEqualTo(String value) {
            addCriterion("XB =", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotEqualTo(String value) {
            addCriterion("XB <>", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThan(String value) {
            addCriterion("XB >", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThanOrEqualTo(String value) {
            addCriterion("XB >=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThan(String value) {
            addCriterion("XB <", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThanOrEqualTo(String value) {
            addCriterion("XB <=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbIn(List<String> values) {
            addCriterion("XB in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotIn(List<String> values) {
            addCriterion("XB not in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbBetween(String value1, String value2) {
            addCriterion("XB between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotBetween(String value1, String value2) {
            addCriterion("XB not between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andDhIsNull() {
            addCriterion("DH is null");
            return (Criteria) this;
        }

        public Criteria andDhIsNotNull() {
            addCriterion("DH is not null");
            return (Criteria) this;
        }

        public Criteria andDhEqualTo(String value) {
            addCriterion("DH =", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotEqualTo(String value) {
            addCriterion("DH <>", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThan(String value) {
            addCriterion("DH >", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThanOrEqualTo(String value) {
            addCriterion("DH >=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThan(String value) {
            addCriterion("DH <", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThanOrEqualTo(String value) {
            addCriterion("DH <=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhIn(List<String> values) {
            addCriterion("DH in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotIn(List<String> values) {
            addCriterion("DH not in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhBetween(String value1, String value2) {
            addCriterion("DH between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotBetween(String value1, String value2) {
            addCriterion("DH not between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andDzIsNull() {
            addCriterion("DZ is null");
            return (Criteria) this;
        }

        public Criteria andDzIsNotNull() {
            addCriterion("DZ is not null");
            return (Criteria) this;
        }

        public Criteria andDzEqualTo(String value) {
            addCriterion("DZ =", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotEqualTo(String value) {
            addCriterion("DZ <>", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzGreaterThan(String value) {
            addCriterion("DZ >", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzGreaterThanOrEqualTo(String value) {
            addCriterion("DZ >=", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLessThan(String value) {
            addCriterion("DZ <", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLessThanOrEqualTo(String value) {
            addCriterion("DZ <=", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzIn(List<String> values) {
            addCriterion("DZ in", values, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotIn(List<String> values) {
            addCriterion("DZ not in", values, "dz");
            return (Criteria) this;
        }

        public Criteria andDzBetween(String value1, String value2) {
            addCriterion("DZ between", value1, value2, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotBetween(String value1, String value2) {
            addCriterion("DZ not between", value1, value2, "dz");
            return (Criteria) this;
        }

        public Criteria andYbIsNull() {
            addCriterion("YB is null");
            return (Criteria) this;
        }

        public Criteria andYbIsNotNull() {
            addCriterion("YB is not null");
            return (Criteria) this;
        }

        public Criteria andYbEqualTo(String value) {
            addCriterion("YB =", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotEqualTo(String value) {
            addCriterion("YB <>", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbGreaterThan(String value) {
            addCriterion("YB >", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbGreaterThanOrEqualTo(String value) {
            addCriterion("YB >=", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbLessThan(String value) {
            addCriterion("YB <", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbLessThanOrEqualTo(String value) {
            addCriterion("YB <=", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbIn(List<String> values) {
            addCriterion("YB in", values, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotIn(List<String> values) {
            addCriterion("YB not in", values, "yb");
            return (Criteria) this;
        }

        public Criteria andYbBetween(String value1, String value2) {
            addCriterion("YB between", value1, value2, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotBetween(String value1, String value2) {
            addCriterion("YB not between", value1, value2, "yb");
            return (Criteria) this;
        }

        public Criteria andGzdwIsNull() {
            addCriterion("GZDW is null");
            return (Criteria) this;
        }

        public Criteria andGzdwIsNotNull() {
            addCriterion("GZDW is not null");
            return (Criteria) this;
        }

        public Criteria andGzdwEqualTo(String value) {
            addCriterion("GZDW =", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwNotEqualTo(String value) {
            addCriterion("GZDW <>", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwGreaterThan(String value) {
            addCriterion("GZDW >", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwGreaterThanOrEqualTo(String value) {
            addCriterion("GZDW >=", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwLessThan(String value) {
            addCriterion("GZDW <", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwLessThanOrEqualTo(String value) {
            addCriterion("GZDW <=", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwIn(List<String> values) {
            addCriterion("GZDW in", values, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwNotIn(List<String> values) {
            addCriterion("GZDW not in", values, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwBetween(String value1, String value2) {
            addCriterion("GZDW between", value1, value2, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwNotBetween(String value1, String value2) {
            addCriterion("GZDW not between", value1, value2, "gzdw");
            return (Criteria) this;
        }

        public Criteria andDzyjIsNull() {
            addCriterion("DZYJ is null");
            return (Criteria) this;
        }

        public Criteria andDzyjIsNotNull() {
            addCriterion("DZYJ is not null");
            return (Criteria) this;
        }

        public Criteria andDzyjEqualTo(String value) {
            addCriterion("DZYJ =", value, "dzyj");
            return (Criteria) this;
        }

        public Criteria andDzyjNotEqualTo(String value) {
            addCriterion("DZYJ <>", value, "dzyj");
            return (Criteria) this;
        }

        public Criteria andDzyjGreaterThan(String value) {
            addCriterion("DZYJ >", value, "dzyj");
            return (Criteria) this;
        }

        public Criteria andDzyjGreaterThanOrEqualTo(String value) {
            addCriterion("DZYJ >=", value, "dzyj");
            return (Criteria) this;
        }

        public Criteria andDzyjLessThan(String value) {
            addCriterion("DZYJ <", value, "dzyj");
            return (Criteria) this;
        }

        public Criteria andDzyjLessThanOrEqualTo(String value) {
            addCriterion("DZYJ <=", value, "dzyj");
            return (Criteria) this;
        }

        public Criteria andDzyjIn(List<String> values) {
            addCriterion("DZYJ in", values, "dzyj");
            return (Criteria) this;
        }

        public Criteria andDzyjNotIn(List<String> values) {
            addCriterion("DZYJ not in", values, "dzyj");
            return (Criteria) this;
        }

        public Criteria andDzyjBetween(String value1, String value2) {
            addCriterion("DZYJ between", value1, value2, "dzyj");
            return (Criteria) this;
        }

        public Criteria andDzyjNotBetween(String value1, String value2) {
            addCriterion("DZYJ not between", value1, value2, "dzyj");
            return (Criteria) this;
        }

        public Criteria andQlrlxIsNull() {
            addCriterion("QLRLX is null");
            return (Criteria) this;
        }

        public Criteria andQlrlxIsNotNull() {
            addCriterion("QLRLX is not null");
            return (Criteria) this;
        }

        public Criteria andQlrlxEqualTo(String value) {
            addCriterion("QLRLX =", value, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxNotEqualTo(String value) {
            addCriterion("QLRLX <>", value, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxGreaterThan(String value) {
            addCriterion("QLRLX >", value, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxGreaterThanOrEqualTo(String value) {
            addCriterion("QLRLX >=", value, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxLessThan(String value) {
            addCriterion("QLRLX <", value, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxLessThanOrEqualTo(String value) {
            addCriterion("QLRLX <=", value, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxIn(List<String> values) {
            addCriterion("QLRLX in", values, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxNotIn(List<String> values) {
            addCriterion("QLRLX not in", values, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxBetween(String value1, String value2) {
            addCriterion("QLRLX between", value1, value2, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxNotBetween(String value1, String value2) {
            addCriterion("QLRLX not between", value1, value2, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlblIsNull() {
            addCriterion("QLBL is null");
            return (Criteria) this;
        }

        public Criteria andQlblIsNotNull() {
            addCriterion("QLBL is not null");
            return (Criteria) this;
        }

        public Criteria andQlblEqualTo(String value) {
            addCriterion("QLBL =", value, "qlbl");
            return (Criteria) this;
        }

        public Criteria andQlblNotEqualTo(String value) {
            addCriterion("QLBL <>", value, "qlbl");
            return (Criteria) this;
        }

        public Criteria andQlblGreaterThan(String value) {
            addCriterion("QLBL >", value, "qlbl");
            return (Criteria) this;
        }

        public Criteria andQlblGreaterThanOrEqualTo(String value) {
            addCriterion("QLBL >=", value, "qlbl");
            return (Criteria) this;
        }

        public Criteria andQlblLessThan(String value) {
            addCriterion("QLBL <", value, "qlbl");
            return (Criteria) this;
        }

        public Criteria andQlblLessThanOrEqualTo(String value) {
            addCriterion("QLBL <=", value, "qlbl");
            return (Criteria) this;
        }

        public Criteria andQlblIn(List<String> values) {
            addCriterion("QLBL in", values, "qlbl");
            return (Criteria) this;
        }

        public Criteria andQlblNotIn(List<String> values) {
            addCriterion("QLBL not in", values, "qlbl");
            return (Criteria) this;
        }

        public Criteria andQlblBetween(String value1, String value2) {
            addCriterion("QLBL between", value1, value2, "qlbl");
            return (Criteria) this;
        }

        public Criteria andQlblNotBetween(String value1, String value2) {
            addCriterion("QLBL not between", value1, value2, "qlbl");
            return (Criteria) this;
        }

        public Criteria andGyfsIsNull() {
            addCriterion("GYFS is null");
            return (Criteria) this;
        }

        public Criteria andGyfsIsNotNull() {
            addCriterion("GYFS is not null");
            return (Criteria) this;
        }

        public Criteria andGyfsEqualTo(String value) {
            addCriterion("GYFS =", value, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsNotEqualTo(String value) {
            addCriterion("GYFS <>", value, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsGreaterThan(String value) {
            addCriterion("GYFS >", value, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsGreaterThanOrEqualTo(String value) {
            addCriterion("GYFS >=", value, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsLessThan(String value) {
            addCriterion("GYFS <", value, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsLessThanOrEqualTo(String value) {
            addCriterion("GYFS <=", value, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsIn(List<String> values) {
            addCriterion("GYFS in", values, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsNotIn(List<String> values) {
            addCriterion("GYFS not in", values, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsBetween(String value1, String value2) {
            addCriterion("GYFS between", value1, value2, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsNotBetween(String value1, String value2) {
            addCriterion("GYFS not between", value1, value2, "gyfs");
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

        public Criteria andDlrxmIsNull() {
            addCriterion("DLRXM is null");
            return (Criteria) this;
        }

        public Criteria andDlrxmIsNotNull() {
            addCriterion("DLRXM is not null");
            return (Criteria) this;
        }

        public Criteria andDlrxmEqualTo(String value) {
            addCriterion("DLRXM =", value, "dlrxm");
            return (Criteria) this;
        }

        public Criteria andDlrxmNotEqualTo(String value) {
            addCriterion("DLRXM <>", value, "dlrxm");
            return (Criteria) this;
        }

        public Criteria andDlrxmGreaterThan(String value) {
            addCriterion("DLRXM >", value, "dlrxm");
            return (Criteria) this;
        }

        public Criteria andDlrxmGreaterThanOrEqualTo(String value) {
            addCriterion("DLRXM >=", value, "dlrxm");
            return (Criteria) this;
        }

        public Criteria andDlrxmLessThan(String value) {
            addCriterion("DLRXM <", value, "dlrxm");
            return (Criteria) this;
        }

        public Criteria andDlrxmLessThanOrEqualTo(String value) {
            addCriterion("DLRXM <=", value, "dlrxm");
            return (Criteria) this;
        }

        public Criteria andDlrxmIn(List<String> values) {
            addCriterion("DLRXM in", values, "dlrxm");
            return (Criteria) this;
        }

        public Criteria andDlrxmNotIn(List<String> values) {
            addCriterion("DLRXM not in", values, "dlrxm");
            return (Criteria) this;
        }

        public Criteria andDlrxmBetween(String value1, String value2) {
            addCriterion("DLRXM between", value1, value2, "dlrxm");
            return (Criteria) this;
        }

        public Criteria andDlrxmNotBetween(String value1, String value2) {
            addCriterion("DLRXM not between", value1, value2, "dlrxm");
            return (Criteria) this;
        }

        public Criteria andDlrlxdhIsNull() {
            addCriterion("DLRLXDH is null");
            return (Criteria) this;
        }

        public Criteria andDlrlxdhIsNotNull() {
            addCriterion("DLRLXDH is not null");
            return (Criteria) this;
        }

        public Criteria andDlrlxdhEqualTo(String value) {
            addCriterion("DLRLXDH =", value, "dlrlxdh");
            return (Criteria) this;
        }

        public Criteria andDlrlxdhNotEqualTo(String value) {
            addCriterion("DLRLXDH <>", value, "dlrlxdh");
            return (Criteria) this;
        }

        public Criteria andDlrlxdhGreaterThan(String value) {
            addCriterion("DLRLXDH >", value, "dlrlxdh");
            return (Criteria) this;
        }

        public Criteria andDlrlxdhGreaterThanOrEqualTo(String value) {
            addCriterion("DLRLXDH >=", value, "dlrlxdh");
            return (Criteria) this;
        }

        public Criteria andDlrlxdhLessThan(String value) {
            addCriterion("DLRLXDH <", value, "dlrlxdh");
            return (Criteria) this;
        }

        public Criteria andDlrlxdhLessThanOrEqualTo(String value) {
            addCriterion("DLRLXDH <=", value, "dlrlxdh");
            return (Criteria) this;
        }

        public Criteria andDlrlxdhIn(List<String> values) {
            addCriterion("DLRLXDH in", values, "dlrlxdh");
            return (Criteria) this;
        }

        public Criteria andDlrlxdhNotIn(List<String> values) {
            addCriterion("DLRLXDH not in", values, "dlrlxdh");
            return (Criteria) this;
        }

        public Criteria andDlrlxdhBetween(String value1, String value2) {
            addCriterion("DLRLXDH between", value1, value2, "dlrlxdh");
            return (Criteria) this;
        }

        public Criteria andDlrlxdhNotBetween(String value1, String value2) {
            addCriterion("DLRLXDH not between", value1, value2, "dlrlxdh");
            return (Criteria) this;
        }

        public Criteria andDlrzjhmIsNull() {
            addCriterion("DLRZJHM is null");
            return (Criteria) this;
        }

        public Criteria andDlrzjhmIsNotNull() {
            addCriterion("DLRZJHM is not null");
            return (Criteria) this;
        }

        public Criteria andDlrzjhmEqualTo(String value) {
            addCriterion("DLRZJHM =", value, "dlrzjhm");
            return (Criteria) this;
        }

        public Criteria andDlrzjhmNotEqualTo(String value) {
            addCriterion("DLRZJHM <>", value, "dlrzjhm");
            return (Criteria) this;
        }

        public Criteria andDlrzjhmGreaterThan(String value) {
            addCriterion("DLRZJHM >", value, "dlrzjhm");
            return (Criteria) this;
        }

        public Criteria andDlrzjhmGreaterThanOrEqualTo(String value) {
            addCriterion("DLRZJHM >=", value, "dlrzjhm");
            return (Criteria) this;
        }

        public Criteria andDlrzjhmLessThan(String value) {
            addCriterion("DLRZJHM <", value, "dlrzjhm");
            return (Criteria) this;
        }

        public Criteria andDlrzjhmLessThanOrEqualTo(String value) {
            addCriterion("DLRZJHM <=", value, "dlrzjhm");
            return (Criteria) this;
        }

        public Criteria andDlrzjhmIn(List<String> values) {
            addCriterion("DLRZJHM in", values, "dlrzjhm");
            return (Criteria) this;
        }

        public Criteria andDlrzjhmNotIn(List<String> values) {
            addCriterion("DLRZJHM not in", values, "dlrzjhm");
            return (Criteria) this;
        }

        public Criteria andDlrzjhmBetween(String value1, String value2) {
            addCriterion("DLRZJHM between", value1, value2, "dlrzjhm");
            return (Criteria) this;
        }

        public Criteria andDlrzjhmNotBetween(String value1, String value2) {
            addCriterion("DLRZJHM not between", value1, value2, "dlrzjhm");
            return (Criteria) this;
        }

        public Criteria andDlrzjlxIsNull() {
            addCriterion("DLRZJLX is null");
            return (Criteria) this;
        }

        public Criteria andDlrzjlxIsNotNull() {
            addCriterion("DLRZJLX is not null");
            return (Criteria) this;
        }

        public Criteria andDlrzjlxEqualTo(String value) {
            addCriterion("DLRZJLX =", value, "dlrzjlx");
            return (Criteria) this;
        }

        public Criteria andDlrzjlxNotEqualTo(String value) {
            addCriterion("DLRZJLX <>", value, "dlrzjlx");
            return (Criteria) this;
        }

        public Criteria andDlrzjlxGreaterThan(String value) {
            addCriterion("DLRZJLX >", value, "dlrzjlx");
            return (Criteria) this;
        }

        public Criteria andDlrzjlxGreaterThanOrEqualTo(String value) {
            addCriterion("DLRZJLX >=", value, "dlrzjlx");
            return (Criteria) this;
        }

        public Criteria andDlrzjlxLessThan(String value) {
            addCriterion("DLRZJLX <", value, "dlrzjlx");
            return (Criteria) this;
        }

        public Criteria andDlrzjlxLessThanOrEqualTo(String value) {
            addCriterion("DLRZJLX <=", value, "dlrzjlx");
            return (Criteria) this;
        }

        public Criteria andDlrzjlxIn(List<String> values) {
            addCriterion("DLRZJLX in", values, "dlrzjlx");
            return (Criteria) this;
        }

        public Criteria andDlrzjlxNotIn(List<String> values) {
            addCriterion("DLRZJLX not in", values, "dlrzjlx");
            return (Criteria) this;
        }

        public Criteria andDlrzjlxBetween(String value1, String value2) {
            addCriterion("DLRZJLX between", value1, value2, "dlrzjlx");
            return (Criteria) this;
        }

        public Criteria andDlrzjlxNotBetween(String value1, String value2) {
            addCriterion("DLRZJLX not between", value1, value2, "dlrzjlx");
            return (Criteria) this;
        }

        public Criteria andDljgmcIsNull() {
            addCriterion("DLJGMC is null");
            return (Criteria) this;
        }

        public Criteria andDljgmcIsNotNull() {
            addCriterion("DLJGMC is not null");
            return (Criteria) this;
        }

        public Criteria andDljgmcEqualTo(String value) {
            addCriterion("DLJGMC =", value, "dljgmc");
            return (Criteria) this;
        }

        public Criteria andDljgmcNotEqualTo(String value) {
            addCriterion("DLJGMC <>", value, "dljgmc");
            return (Criteria) this;
        }

        public Criteria andDljgmcGreaterThan(String value) {
            addCriterion("DLJGMC >", value, "dljgmc");
            return (Criteria) this;
        }

        public Criteria andDljgmcGreaterThanOrEqualTo(String value) {
            addCriterion("DLJGMC >=", value, "dljgmc");
            return (Criteria) this;
        }

        public Criteria andDljgmcLessThan(String value) {
            addCriterion("DLJGMC <", value, "dljgmc");
            return (Criteria) this;
        }

        public Criteria andDljgmcLessThanOrEqualTo(String value) {
            addCriterion("DLJGMC <=", value, "dljgmc");
            return (Criteria) this;
        }

        public Criteria andDljgmcIn(List<String> values) {
            addCriterion("DLJGMC in", values, "dljgmc");
            return (Criteria) this;
        }

        public Criteria andDljgmcNotIn(List<String> values) {
            addCriterion("DLJGMC not in", values, "dljgmc");
            return (Criteria) this;
        }

        public Criteria andDljgmcBetween(String value1, String value2) {
            addCriterion("DLJGMC between", value1, value2, "dljgmc");
            return (Criteria) this;
        }

        public Criteria andDljgmcNotBetween(String value1, String value2) {
            addCriterion("DLJGMC not between", value1, value2, "dljgmc");
            return (Criteria) this;
        }

        public Criteria andQlmjIsNull() {
            addCriterion("QLMJ is null");
            return (Criteria) this;
        }

        public Criteria andQlmjIsNotNull() {
            addCriterion("QLMJ is not null");
            return (Criteria) this;
        }

        public Criteria andQlmjEqualTo(BigDecimal value) {
            addCriterion("QLMJ =", value, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjNotEqualTo(BigDecimal value) {
            addCriterion("QLMJ <>", value, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjGreaterThan(BigDecimal value) {
            addCriterion("QLMJ >", value, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QLMJ >=", value, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjLessThan(BigDecimal value) {
            addCriterion("QLMJ <", value, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QLMJ <=", value, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjIn(List<BigDecimal> values) {
            addCriterion("QLMJ in", values, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjNotIn(List<BigDecimal> values) {
            addCriterion("QLMJ not in", values, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QLMJ between", value1, value2, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QLMJ not between", value1, value2, "qlmj");
            return (Criteria) this;
        }

        public Criteria andFddbrIsNull() {
            addCriterion("FDDBR is null");
            return (Criteria) this;
        }

        public Criteria andFddbrIsNotNull() {
            addCriterion("FDDBR is not null");
            return (Criteria) this;
        }

        public Criteria andFddbrEqualTo(String value) {
            addCriterion("FDDBR =", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrNotEqualTo(String value) {
            addCriterion("FDDBR <>", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrGreaterThan(String value) {
            addCriterion("FDDBR >", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrGreaterThanOrEqualTo(String value) {
            addCriterion("FDDBR >=", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrLessThan(String value) {
            addCriterion("FDDBR <", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrLessThanOrEqualTo(String value) {
            addCriterion("FDDBR <=", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrIn(List<String> values) {
            addCriterion("FDDBR in", values, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrNotIn(List<String> values) {
            addCriterion("FDDBR not in", values, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrBetween(String value1, String value2) {
            addCriterion("FDDBR between", value1, value2, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrNotBetween(String value1, String value2) {
            addCriterion("FDDBR not between", value1, value2, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrdhIsNull() {
            addCriterion("FDDBRDH is null");
            return (Criteria) this;
        }

        public Criteria andFddbrdhIsNotNull() {
            addCriterion("FDDBRDH is not null");
            return (Criteria) this;
        }

        public Criteria andFddbrdhEqualTo(String value) {
            addCriterion("FDDBRDH =", value, "fddbrdh");
            return (Criteria) this;
        }

        public Criteria andFddbrdhNotEqualTo(String value) {
            addCriterion("FDDBRDH <>", value, "fddbrdh");
            return (Criteria) this;
        }

        public Criteria andFddbrdhGreaterThan(String value) {
            addCriterion("FDDBRDH >", value, "fddbrdh");
            return (Criteria) this;
        }

        public Criteria andFddbrdhGreaterThanOrEqualTo(String value) {
            addCriterion("FDDBRDH >=", value, "fddbrdh");
            return (Criteria) this;
        }

        public Criteria andFddbrdhLessThan(String value) {
            addCriterion("FDDBRDH <", value, "fddbrdh");
            return (Criteria) this;
        }

        public Criteria andFddbrdhLessThanOrEqualTo(String value) {
            addCriterion("FDDBRDH <=", value, "fddbrdh");
            return (Criteria) this;
        }

        public Criteria andFddbrdhIn(List<String> values) {
            addCriterion("FDDBRDH in", values, "fddbrdh");
            return (Criteria) this;
        }

        public Criteria andFddbrdhNotIn(List<String> values) {
            addCriterion("FDDBRDH not in", values, "fddbrdh");
            return (Criteria) this;
        }

        public Criteria andFddbrdhBetween(String value1, String value2) {
            addCriterion("FDDBRDH between", value1, value2, "fddbrdh");
            return (Criteria) this;
        }

        public Criteria andFddbrdhNotBetween(String value1, String value2) {
            addCriterion("FDDBRDH not between", value1, value2, "fddbrdh");
            return (Criteria) this;
        }

        public Criteria andFddbrzjhmIsNull() {
            addCriterion("FDDBRZJHM is null");
            return (Criteria) this;
        }

        public Criteria andFddbrzjhmIsNotNull() {
            addCriterion("FDDBRZJHM is not null");
            return (Criteria) this;
        }

        public Criteria andFddbrzjhmEqualTo(String value) {
            addCriterion("FDDBRZJHM =", value, "fddbrzjhm");
            return (Criteria) this;
        }

        public Criteria andFddbrzjhmNotEqualTo(String value) {
            addCriterion("FDDBRZJHM <>", value, "fddbrzjhm");
            return (Criteria) this;
        }

        public Criteria andFddbrzjhmGreaterThan(String value) {
            addCriterion("FDDBRZJHM >", value, "fddbrzjhm");
            return (Criteria) this;
        }

        public Criteria andFddbrzjhmGreaterThanOrEqualTo(String value) {
            addCriterion("FDDBRZJHM >=", value, "fddbrzjhm");
            return (Criteria) this;
        }

        public Criteria andFddbrzjhmLessThan(String value) {
            addCriterion("FDDBRZJHM <", value, "fddbrzjhm");
            return (Criteria) this;
        }

        public Criteria andFddbrzjhmLessThanOrEqualTo(String value) {
            addCriterion("FDDBRZJHM <=", value, "fddbrzjhm");
            return (Criteria) this;
        }

        public Criteria andFddbrzjhmIn(List<String> values) {
            addCriterion("FDDBRZJHM in", values, "fddbrzjhm");
            return (Criteria) this;
        }

        public Criteria andFddbrzjhmNotIn(List<String> values) {
            addCriterion("FDDBRZJHM not in", values, "fddbrzjhm");
            return (Criteria) this;
        }

        public Criteria andFddbrzjhmBetween(String value1, String value2) {
            addCriterion("FDDBRZJHM between", value1, value2, "fddbrzjhm");
            return (Criteria) this;
        }

        public Criteria andFddbrzjhmNotBetween(String value1, String value2) {
            addCriterion("FDDBRZJHM not between", value1, value2, "fddbrzjhm");
            return (Criteria) this;
        }

        public Criteria andFddbrzjlxIsNull() {
            addCriterion("FDDBRZJLX is null");
            return (Criteria) this;
        }

        public Criteria andFddbrzjlxIsNotNull() {
            addCriterion("FDDBRZJLX is not null");
            return (Criteria) this;
        }

        public Criteria andFddbrzjlxEqualTo(String value) {
            addCriterion("FDDBRZJLX =", value, "fddbrzjlx");
            return (Criteria) this;
        }

        public Criteria andFddbrzjlxNotEqualTo(String value) {
            addCriterion("FDDBRZJLX <>", value, "fddbrzjlx");
            return (Criteria) this;
        }

        public Criteria andFddbrzjlxGreaterThan(String value) {
            addCriterion("FDDBRZJLX >", value, "fddbrzjlx");
            return (Criteria) this;
        }

        public Criteria andFddbrzjlxGreaterThanOrEqualTo(String value) {
            addCriterion("FDDBRZJLX >=", value, "fddbrzjlx");
            return (Criteria) this;
        }

        public Criteria andFddbrzjlxLessThan(String value) {
            addCriterion("FDDBRZJLX <", value, "fddbrzjlx");
            return (Criteria) this;
        }

        public Criteria andFddbrzjlxLessThanOrEqualTo(String value) {
            addCriterion("FDDBRZJLX <=", value, "fddbrzjlx");
            return (Criteria) this;
        }

        public Criteria andFddbrzjlxIn(List<String> values) {
            addCriterion("FDDBRZJLX in", values, "fddbrzjlx");
            return (Criteria) this;
        }

        public Criteria andFddbrzjlxNotIn(List<String> values) {
            addCriterion("FDDBRZJLX not in", values, "fddbrzjlx");
            return (Criteria) this;
        }

        public Criteria andFddbrzjlxBetween(String value1, String value2) {
            addCriterion("FDDBRZJLX between", value1, value2, "fddbrzjlx");
            return (Criteria) this;
        }

        public Criteria andFddbrzjlxNotBetween(String value1, String value2) {
            addCriterion("FDDBRZJLX not between", value1, value2, "fddbrzjlx");
            return (Criteria) this;
        }

        public Criteria andSqridIsNull() {
            addCriterion("SQRID is null");
            return (Criteria) this;
        }

        public Criteria andSqridIsNotNull() {
            addCriterion("SQRID is not null");
            return (Criteria) this;
        }

        public Criteria andSqridEqualTo(String value) {
            addCriterion("SQRID =", value, "sqrid");
            return (Criteria) this;
        }

        public Criteria andSqridNotEqualTo(String value) {
            addCriterion("SQRID <>", value, "sqrid");
            return (Criteria) this;
        }

        public Criteria andSqridGreaterThan(String value) {
            addCriterion("SQRID >", value, "sqrid");
            return (Criteria) this;
        }

        public Criteria andSqridGreaterThanOrEqualTo(String value) {
            addCriterion("SQRID >=", value, "sqrid");
            return (Criteria) this;
        }

        public Criteria andSqridLessThan(String value) {
            addCriterion("SQRID <", value, "sqrid");
            return (Criteria) this;
        }

        public Criteria andSqridLessThanOrEqualTo(String value) {
            addCriterion("SQRID <=", value, "sqrid");
            return (Criteria) this;
        }

        public Criteria andSqridIn(List<String> values) {
            addCriterion("SQRID in", values, "sqrid");
            return (Criteria) this;
        }

        public Criteria andSqridNotIn(List<String> values) {
            addCriterion("SQRID not in", values, "sqrid");
            return (Criteria) this;
        }

        public Criteria andSqridBetween(String value1, String value2) {
            addCriterion("SQRID between", value1, value2, "sqrid");
            return (Criteria) this;
        }

        public Criteria andSqridNotBetween(String value1, String value2) {
            addCriterion("SQRID not between", value1, value2, "sqrid");
            return (Criteria) this;
        }

        public Criteria andFczhIsNull() {
            addCriterion("FCZH is null");
            return (Criteria) this;
        }

        public Criteria andFczhIsNotNull() {
            addCriterion("FCZH is not null");
            return (Criteria) this;
        }

        public Criteria andFczhEqualTo(String value) {
            addCriterion("FCZH =", value, "fczh");
            return (Criteria) this;
        }

        public Criteria andFczhNotEqualTo(String value) {
            addCriterion("FCZH <>", value, "fczh");
            return (Criteria) this;
        }

        public Criteria andFczhGreaterThan(String value) {
            addCriterion("FCZH >", value, "fczh");
            return (Criteria) this;
        }

        public Criteria andFczhGreaterThanOrEqualTo(String value) {
            addCriterion("FCZH >=", value, "fczh");
            return (Criteria) this;
        }

        public Criteria andFczhLessThan(String value) {
            addCriterion("FCZH <", value, "fczh");
            return (Criteria) this;
        }

        public Criteria andFczhLessThanOrEqualTo(String value) {
            addCriterion("FCZH <=", value, "fczh");
            return (Criteria) this;
        }

        public Criteria andFczhIn(List<String> values) {
            addCriterion("FCZH in", values, "fczh");
            return (Criteria) this;
        }

        public Criteria andFczhNotIn(List<String> values) {
            addCriterion("FCZH not in", values, "fczh");
            return (Criteria) this;
        }

        public Criteria andFczhBetween(String value1, String value2) {
            addCriterion("FCZH between", value1, value2, "fczh");
            return (Criteria) this;
        }

        public Criteria andFczhNotBetween(String value1, String value2) {
            addCriterion("FCZH not between", value1, value2, "fczh");
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

        public Criteria andYtdsyqrIsNull() {
            addCriterion("YTDSYQR is null");
            return (Criteria) this;
        }

        public Criteria andYtdsyqrIsNotNull() {
            addCriterion("YTDSYQR is not null");
            return (Criteria) this;
        }

        public Criteria andYtdsyqrEqualTo(String value) {
            addCriterion("YTDSYQR =", value, "ytdsyqr");
            return (Criteria) this;
        }

        public Criteria andYtdsyqrNotEqualTo(String value) {
            addCriterion("YTDSYQR <>", value, "ytdsyqr");
            return (Criteria) this;
        }

        public Criteria andYtdsyqrGreaterThan(String value) {
            addCriterion("YTDSYQR >", value, "ytdsyqr");
            return (Criteria) this;
        }

        public Criteria andYtdsyqrGreaterThanOrEqualTo(String value) {
            addCriterion("YTDSYQR >=", value, "ytdsyqr");
            return (Criteria) this;
        }

        public Criteria andYtdsyqrLessThan(String value) {
            addCriterion("YTDSYQR <", value, "ytdsyqr");
            return (Criteria) this;
        }

        public Criteria andYtdsyqrLessThanOrEqualTo(String value) {
            addCriterion("YTDSYQR <=", value, "ytdsyqr");
            return (Criteria) this;
        }

        public Criteria andYtdsyqrIn(List<String> values) {
            addCriterion("YTDSYQR in", values, "ytdsyqr");
            return (Criteria) this;
        }

        public Criteria andYtdsyqrNotIn(List<String> values) {
            addCriterion("YTDSYQR not in", values, "ytdsyqr");
            return (Criteria) this;
        }

        public Criteria andYtdsyqrBetween(String value1, String value2) {
            addCriterion("YTDSYQR between", value1, value2, "ytdsyqr");
            return (Criteria) this;
        }

        public Criteria andYtdsyqrNotBetween(String value1, String value2) {
            addCriterion("YTDSYQR not between", value1, value2, "ytdsyqr");
            return (Criteria) this;
        }

        public Criteria andYbdcqzhIsNull() {
            addCriterion("YBDCQZH is null");
            return (Criteria) this;
        }

        public Criteria andYbdcqzhIsNotNull() {
            addCriterion("YBDCQZH is not null");
            return (Criteria) this;
        }

        public Criteria andYbdcqzhEqualTo(String value) {
            addCriterion("YBDCQZH =", value, "ybdcqzh");
            return (Criteria) this;
        }

        public Criteria andYbdcqzhNotEqualTo(String value) {
            addCriterion("YBDCQZH <>", value, "ybdcqzh");
            return (Criteria) this;
        }

        public Criteria andYbdcqzhGreaterThan(String value) {
            addCriterion("YBDCQZH >", value, "ybdcqzh");
            return (Criteria) this;
        }

        public Criteria andYbdcqzhGreaterThanOrEqualTo(String value) {
            addCriterion("YBDCQZH >=", value, "ybdcqzh");
            return (Criteria) this;
        }

        public Criteria andYbdcqzhLessThan(String value) {
            addCriterion("YBDCQZH <", value, "ybdcqzh");
            return (Criteria) this;
        }

        public Criteria andYbdcqzhLessThanOrEqualTo(String value) {
            addCriterion("YBDCQZH <=", value, "ybdcqzh");
            return (Criteria) this;
        }

        public Criteria andYbdcqzhIn(List<String> values) {
            addCriterion("YBDCQZH in", values, "ybdcqzh");
            return (Criteria) this;
        }

        public Criteria andYbdcqzhNotIn(List<String> values) {
            addCriterion("YBDCQZH not in", values, "ybdcqzh");
            return (Criteria) this;
        }

        public Criteria andYbdcqzhBetween(String value1, String value2) {
            addCriterion("YBDCQZH between", value1, value2, "ybdcqzh");
            return (Criteria) this;
        }

        public Criteria andYbdcqzhNotBetween(String value1, String value2) {
            addCriterion("YBDCQZH not between", value1, value2, "ybdcqzh");
            return (Criteria) this;
        }

        public Criteria andFtxzIsNull() {
            addCriterion("FTXZ is null");
            return (Criteria) this;
        }

        public Criteria andFtxzIsNotNull() {
            addCriterion("FTXZ is not null");
            return (Criteria) this;
        }

        public Criteria andFtxzEqualTo(String value) {
            addCriterion("FTXZ =", value, "ftxz");
            return (Criteria) this;
        }

        public Criteria andFtxzNotEqualTo(String value) {
            addCriterion("FTXZ <>", value, "ftxz");
            return (Criteria) this;
        }

        public Criteria andFtxzGreaterThan(String value) {
            addCriterion("FTXZ >", value, "ftxz");
            return (Criteria) this;
        }

        public Criteria andFtxzGreaterThanOrEqualTo(String value) {
            addCriterion("FTXZ >=", value, "ftxz");
            return (Criteria) this;
        }

        public Criteria andFtxzLessThan(String value) {
            addCriterion("FTXZ <", value, "ftxz");
            return (Criteria) this;
        }

        public Criteria andFtxzLessThanOrEqualTo(String value) {
            addCriterion("FTXZ <=", value, "ftxz");
            return (Criteria) this;
        }

        public Criteria andFtxzIn(List<String> values) {
            addCriterion("FTXZ in", values, "ftxz");
            return (Criteria) this;
        }

        public Criteria andFtxzNotIn(List<String> values) {
            addCriterion("FTXZ not in", values, "ftxz");
            return (Criteria) this;
        }

        public Criteria andFtxzBetween(String value1, String value2) {
            addCriterion("FTXZ between", value1, value2, "ftxz");
            return (Criteria) this;
        }

        public Criteria andFtxzNotBetween(String value1, String value2) {
            addCriterion("FTXZ not between", value1, value2, "ftxz");
            return (Criteria) this;
        }

        public Criteria andFczzlIsNull() {
            addCriterion("FCZZL is null");
            return (Criteria) this;
        }

        public Criteria andFczzlIsNotNull() {
            addCriterion("FCZZL is not null");
            return (Criteria) this;
        }

        public Criteria andFczzlEqualTo(String value) {
            addCriterion("FCZZL =", value, "fczzl");
            return (Criteria) this;
        }

        public Criteria andFczzlNotEqualTo(String value) {
            addCriterion("FCZZL <>", value, "fczzl");
            return (Criteria) this;
        }

        public Criteria andFczzlGreaterThan(String value) {
            addCriterion("FCZZL >", value, "fczzl");
            return (Criteria) this;
        }

        public Criteria andFczzlGreaterThanOrEqualTo(String value) {
            addCriterion("FCZZL >=", value, "fczzl");
            return (Criteria) this;
        }

        public Criteria andFczzlLessThan(String value) {
            addCriterion("FCZZL <", value, "fczzl");
            return (Criteria) this;
        }

        public Criteria andFczzlLessThanOrEqualTo(String value) {
            addCriterion("FCZZL <=", value, "fczzl");
            return (Criteria) this;
        }

        public Criteria andFczzlIn(List<String> values) {
            addCriterion("FCZZL in", values, "fczzl");
            return (Criteria) this;
        }

        public Criteria andFczzlNotIn(List<String> values) {
            addCriterion("FCZZL not in", values, "fczzl");
            return (Criteria) this;
        }

        public Criteria andFczzlBetween(String value1, String value2) {
            addCriterion("FCZZL between", value1, value2, "fczzl");
            return (Criteria) this;
        }

        public Criteria andFczzlNotBetween(String value1, String value2) {
            addCriterion("FCZZL not between", value1, value2, "fczzl");
            return (Criteria) this;
        }

        public Criteria andXtdzzlIsNull() {
            addCriterion("XTDZZL is null");
            return (Criteria) this;
        }

        public Criteria andXtdzzlIsNotNull() {
            addCriterion("XTDZZL is not null");
            return (Criteria) this;
        }

        public Criteria andXtdzzlEqualTo(String value) {
            addCriterion("XTDZZL =", value, "xtdzzl");
            return (Criteria) this;
        }

        public Criteria andXtdzzlNotEqualTo(String value) {
            addCriterion("XTDZZL <>", value, "xtdzzl");
            return (Criteria) this;
        }

        public Criteria andXtdzzlGreaterThan(String value) {
            addCriterion("XTDZZL >", value, "xtdzzl");
            return (Criteria) this;
        }

        public Criteria andXtdzzlGreaterThanOrEqualTo(String value) {
            addCriterion("XTDZZL >=", value, "xtdzzl");
            return (Criteria) this;
        }

        public Criteria andXtdzzlLessThan(String value) {
            addCriterion("XTDZZL <", value, "xtdzzl");
            return (Criteria) this;
        }

        public Criteria andXtdzzlLessThanOrEqualTo(String value) {
            addCriterion("XTDZZL <=", value, "xtdzzl");
            return (Criteria) this;
        }

        public Criteria andXtdzzlIn(List<String> values) {
            addCriterion("XTDZZL in", values, "xtdzzl");
            return (Criteria) this;
        }

        public Criteria andXtdzzlNotIn(List<String> values) {
            addCriterion("XTDZZL not in", values, "xtdzzl");
            return (Criteria) this;
        }

        public Criteria andXtdzzlBetween(String value1, String value2) {
            addCriterion("XTDZZL between", value1, value2, "xtdzzl");
            return (Criteria) this;
        }

        public Criteria andXtdzzlNotBetween(String value1, String value2) {
            addCriterion("XTDZZL not between", value1, value2, "xtdzzl");
            return (Criteria) this;
        }

        public Criteria andXtdczfsIsNull() {
            addCriterion("XTDCZFS is null");
            return (Criteria) this;
        }

        public Criteria andXtdczfsIsNotNull() {
            addCriterion("XTDCZFS is not null");
            return (Criteria) this;
        }

        public Criteria andXtdczfsEqualTo(String value) {
            addCriterion("XTDCZFS =", value, "xtdczfs");
            return (Criteria) this;
        }

        public Criteria andXtdczfsNotEqualTo(String value) {
            addCriterion("XTDCZFS <>", value, "xtdczfs");
            return (Criteria) this;
        }

        public Criteria andXtdczfsGreaterThan(String value) {
            addCriterion("XTDCZFS >", value, "xtdczfs");
            return (Criteria) this;
        }

        public Criteria andXtdczfsGreaterThanOrEqualTo(String value) {
            addCriterion("XTDCZFS >=", value, "xtdczfs");
            return (Criteria) this;
        }

        public Criteria andXtdczfsLessThan(String value) {
            addCriterion("XTDCZFS <", value, "xtdczfs");
            return (Criteria) this;
        }

        public Criteria andXtdczfsLessThanOrEqualTo(String value) {
            addCriterion("XTDCZFS <=", value, "xtdczfs");
            return (Criteria) this;
        }

        public Criteria andXtdczfsIn(List<String> values) {
            addCriterion("XTDCZFS in", values, "xtdczfs");
            return (Criteria) this;
        }

        public Criteria andXtdczfsNotIn(List<String> values) {
            addCriterion("XTDCZFS not in", values, "xtdczfs");
            return (Criteria) this;
        }

        public Criteria andXtdczfsBetween(String value1, String value2) {
            addCriterion("XTDCZFS between", value1, value2, "xtdczfs");
            return (Criteria) this;
        }

        public Criteria andXtdczfsNotBetween(String value1, String value2) {
            addCriterion("XTDCZFS not between", value1, value2, "xtdczfs");
            return (Criteria) this;
        }

        public Criteria andXtdqlxzIsNull() {
            addCriterion("XTDQLXZ is null");
            return (Criteria) this;
        }

        public Criteria andXtdqlxzIsNotNull() {
            addCriterion("XTDQLXZ is not null");
            return (Criteria) this;
        }

        public Criteria andXtdqlxzEqualTo(String value) {
            addCriterion("XTDQLXZ =", value, "xtdqlxz");
            return (Criteria) this;
        }

        public Criteria andXtdqlxzNotEqualTo(String value) {
            addCriterion("XTDQLXZ <>", value, "xtdqlxz");
            return (Criteria) this;
        }

        public Criteria andXtdqlxzGreaterThan(String value) {
            addCriterion("XTDQLXZ >", value, "xtdqlxz");
            return (Criteria) this;
        }

        public Criteria andXtdqlxzGreaterThanOrEqualTo(String value) {
            addCriterion("XTDQLXZ >=", value, "xtdqlxz");
            return (Criteria) this;
        }

        public Criteria andXtdqlxzLessThan(String value) {
            addCriterion("XTDQLXZ <", value, "xtdqlxz");
            return (Criteria) this;
        }

        public Criteria andXtdqlxzLessThanOrEqualTo(String value) {
            addCriterion("XTDQLXZ <=", value, "xtdqlxz");
            return (Criteria) this;
        }

        public Criteria andXtdqlxzIn(List<String> values) {
            addCriterion("XTDQLXZ in", values, "xtdqlxz");
            return (Criteria) this;
        }

        public Criteria andXtdqlxzNotIn(List<String> values) {
            addCriterion("XTDQLXZ not in", values, "xtdqlxz");
            return (Criteria) this;
        }

        public Criteria andXtdqlxzBetween(String value1, String value2) {
            addCriterion("XTDQLXZ between", value1, value2, "xtdqlxz");
            return (Criteria) this;
        }

        public Criteria andXtdqlxzNotBetween(String value1, String value2) {
            addCriterion("XTDQLXZ not between", value1, value2, "xtdqlxz");
            return (Criteria) this;
        }

        public Criteria andXtdtdytIsNull() {
            addCriterion("XTDTDYT is null");
            return (Criteria) this;
        }

        public Criteria andXtdtdytIsNotNull() {
            addCriterion("XTDTDYT is not null");
            return (Criteria) this;
        }

        public Criteria andXtdtdytEqualTo(String value) {
            addCriterion("XTDTDYT =", value, "xtdtdyt");
            return (Criteria) this;
        }

        public Criteria andXtdtdytNotEqualTo(String value) {
            addCriterion("XTDTDYT <>", value, "xtdtdyt");
            return (Criteria) this;
        }

        public Criteria andXtdtdytGreaterThan(String value) {
            addCriterion("XTDTDYT >", value, "xtdtdyt");
            return (Criteria) this;
        }

        public Criteria andXtdtdytGreaterThanOrEqualTo(String value) {
            addCriterion("XTDTDYT >=", value, "xtdtdyt");
            return (Criteria) this;
        }

        public Criteria andXtdtdytLessThan(String value) {
            addCriterion("XTDTDYT <", value, "xtdtdyt");
            return (Criteria) this;
        }

        public Criteria andXtdtdytLessThanOrEqualTo(String value) {
            addCriterion("XTDTDYT <=", value, "xtdtdyt");
            return (Criteria) this;
        }

        public Criteria andXtdtdytIn(List<String> values) {
            addCriterion("XTDTDYT in", values, "xtdtdyt");
            return (Criteria) this;
        }

        public Criteria andXtdtdytNotIn(List<String> values) {
            addCriterion("XTDTDYT not in", values, "xtdtdyt");
            return (Criteria) this;
        }

        public Criteria andXtdtdytBetween(String value1, String value2) {
            addCriterion("XTDTDYT between", value1, value2, "xtdtdyt");
            return (Criteria) this;
        }

        public Criteria andXtdtdytNotBetween(String value1, String value2) {
            addCriterion("XTDTDYT not between", value1, value2, "xtdtdyt");
            return (Criteria) this;
        }

        public Criteria andXtdsyqxIsNull() {
            addCriterion("XTDSYQX is null");
            return (Criteria) this;
        }

        public Criteria andXtdsyqxIsNotNull() {
            addCriterion("XTDSYQX is not null");
            return (Criteria) this;
        }

        public Criteria andXtdsyqxEqualTo(String value) {
            addCriterion("XTDSYQX =", value, "xtdsyqx");
            return (Criteria) this;
        }

        public Criteria andXtdsyqxNotEqualTo(String value) {
            addCriterion("XTDSYQX <>", value, "xtdsyqx");
            return (Criteria) this;
        }

        public Criteria andXtdsyqxGreaterThan(String value) {
            addCriterion("XTDSYQX >", value, "xtdsyqx");
            return (Criteria) this;
        }

        public Criteria andXtdsyqxGreaterThanOrEqualTo(String value) {
            addCriterion("XTDSYQX >=", value, "xtdsyqx");
            return (Criteria) this;
        }

        public Criteria andXtdsyqxLessThan(String value) {
            addCriterion("XTDSYQX <", value, "xtdsyqx");
            return (Criteria) this;
        }

        public Criteria andXtdsyqxLessThanOrEqualTo(String value) {
            addCriterion("XTDSYQX <=", value, "xtdsyqx");
            return (Criteria) this;
        }

        public Criteria andXtdsyqxIn(List<String> values) {
            addCriterion("XTDSYQX in", values, "xtdsyqx");
            return (Criteria) this;
        }

        public Criteria andXtdsyqxNotIn(List<String> values) {
            addCriterion("XTDSYQX not in", values, "xtdsyqx");
            return (Criteria) this;
        }

        public Criteria andXtdsyqxBetween(String value1, String value2) {
            addCriterion("XTDSYQX between", value1, value2, "xtdsyqx");
            return (Criteria) this;
        }

        public Criteria andXtdsyqxNotBetween(String value1, String value2) {
            addCriterion("XTDSYQX not between", value1, value2, "xtdsyqx");
            return (Criteria) this;
        }

        public Criteria andXtdqlqssjIsNull() {
            addCriterion("XTDQLQSSJ is null");
            return (Criteria) this;
        }

        public Criteria andXtdqlqssjIsNotNull() {
            addCriterion("XTDQLQSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andXtdqlqssjEqualTo(String value) {
            addCriterion("XTDQLQSSJ =", value, "xtdqlqssj");
            return (Criteria) this;
        }

        public Criteria andXtdqlqssjNotEqualTo(String value) {
            addCriterion("XTDQLQSSJ <>", value, "xtdqlqssj");
            return (Criteria) this;
        }

        public Criteria andXtdqlqssjGreaterThan(String value) {
            addCriterion("XTDQLQSSJ >", value, "xtdqlqssj");
            return (Criteria) this;
        }

        public Criteria andXtdqlqssjGreaterThanOrEqualTo(String value) {
            addCriterion("XTDQLQSSJ >=", value, "xtdqlqssj");
            return (Criteria) this;
        }

        public Criteria andXtdqlqssjLessThan(String value) {
            addCriterion("XTDQLQSSJ <", value, "xtdqlqssj");
            return (Criteria) this;
        }

        public Criteria andXtdqlqssjLessThanOrEqualTo(String value) {
            addCriterion("XTDQLQSSJ <=", value, "xtdqlqssj");
            return (Criteria) this;
        }

        public Criteria andXtdqlqssjIn(List<String> values) {
            addCriterion("XTDQLQSSJ in", values, "xtdqlqssj");
            return (Criteria) this;
        }

        public Criteria andXtdqlqssjNotIn(List<String> values) {
            addCriterion("XTDQLQSSJ not in", values, "xtdqlqssj");
            return (Criteria) this;
        }

        public Criteria andXtdqlqssjBetween(String value1, String value2) {
            addCriterion("XTDQLQSSJ between", value1, value2, "xtdqlqssj");
            return (Criteria) this;
        }

        public Criteria andXtdqlqssjNotBetween(String value1, String value2) {
            addCriterion("XTDQLQSSJ not between", value1, value2, "xtdqlqssj");
            return (Criteria) this;
        }

        public Criteria andXtdqljssjIsNull() {
            addCriterion("XTDQLJSSJ is null");
            return (Criteria) this;
        }

        public Criteria andXtdqljssjIsNotNull() {
            addCriterion("XTDQLJSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andXtdqljssjEqualTo(String value) {
            addCriterion("XTDQLJSSJ =", value, "xtdqljssj");
            return (Criteria) this;
        }

        public Criteria andXtdqljssjNotEqualTo(String value) {
            addCriterion("XTDQLJSSJ <>", value, "xtdqljssj");
            return (Criteria) this;
        }

        public Criteria andXtdqljssjGreaterThan(String value) {
            addCriterion("XTDQLJSSJ >", value, "xtdqljssj");
            return (Criteria) this;
        }

        public Criteria andXtdqljssjGreaterThanOrEqualTo(String value) {
            addCriterion("XTDQLJSSJ >=", value, "xtdqljssj");
            return (Criteria) this;
        }

        public Criteria andXtdqljssjLessThan(String value) {
            addCriterion("XTDQLJSSJ <", value, "xtdqljssj");
            return (Criteria) this;
        }

        public Criteria andXtdqljssjLessThanOrEqualTo(String value) {
            addCriterion("XTDQLJSSJ <=", value, "xtdqljssj");
            return (Criteria) this;
        }

        public Criteria andXtdqljssjIn(List<String> values) {
            addCriterion("XTDQLJSSJ in", values, "xtdqljssj");
            return (Criteria) this;
        }

        public Criteria andXtdqljssjNotIn(List<String> values) {
            addCriterion("XTDQLJSSJ not in", values, "xtdqljssj");
            return (Criteria) this;
        }

        public Criteria andXtdqljssjBetween(String value1, String value2) {
            addCriterion("XTDQLJSSJ between", value1, value2, "xtdqljssj");
            return (Criteria) this;
        }

        public Criteria andXtdqljssjNotBetween(String value1, String value2) {
            addCriterion("XTDQLJSSJ not between", value1, value2, "xtdqljssj");
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