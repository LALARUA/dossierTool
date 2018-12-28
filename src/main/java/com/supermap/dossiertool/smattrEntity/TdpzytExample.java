package com.supermap.dossiertool.smattrEntity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TdpzytExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TdpzytExample() {
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

        public Criteria andZdbsmIsNull() {
            addCriterion("ZDBSM is null");
            return (Criteria) this;
        }

        public Criteria andZdbsmIsNotNull() {
            addCriterion("ZDBSM is not null");
            return (Criteria) this;
        }

        public Criteria andZdbsmEqualTo(String value) {
            addCriterion("ZDBSM =", value, "zdbsm");
            return (Criteria) this;
        }

        public Criteria andZdbsmNotEqualTo(String value) {
            addCriterion("ZDBSM <>", value, "zdbsm");
            return (Criteria) this;
        }

        public Criteria andZdbsmGreaterThan(String value) {
            addCriterion("ZDBSM >", value, "zdbsm");
            return (Criteria) this;
        }

        public Criteria andZdbsmGreaterThanOrEqualTo(String value) {
            addCriterion("ZDBSM >=", value, "zdbsm");
            return (Criteria) this;
        }

        public Criteria andZdbsmLessThan(String value) {
            addCriterion("ZDBSM <", value, "zdbsm");
            return (Criteria) this;
        }

        public Criteria andZdbsmLessThanOrEqualTo(String value) {
            addCriterion("ZDBSM <=", value, "zdbsm");
            return (Criteria) this;
        }

        public Criteria andZdbsmIn(List<String> values) {
            addCriterion("ZDBSM in", values, "zdbsm");
            return (Criteria) this;
        }

        public Criteria andZdbsmNotIn(List<String> values) {
            addCriterion("ZDBSM not in", values, "zdbsm");
            return (Criteria) this;
        }

        public Criteria andZdbsmBetween(String value1, String value2) {
            addCriterion("ZDBSM between", value1, value2, "zdbsm");
            return (Criteria) this;
        }

        public Criteria andZdbsmNotBetween(String value1, String value2) {
            addCriterion("ZDBSM not between", value1, value2, "zdbsm");
            return (Criteria) this;
        }

        public Criteria andSfzytIsNull() {
            addCriterion("SFZYT is null");
            return (Criteria) this;
        }

        public Criteria andSfzytIsNotNull() {
            addCriterion("SFZYT is not null");
            return (Criteria) this;
        }

        public Criteria andSfzytEqualTo(String value) {
            addCriterion("SFZYT =", value, "sfzyt");
            return (Criteria) this;
        }

        public Criteria andSfzytNotEqualTo(String value) {
            addCriterion("SFZYT <>", value, "sfzyt");
            return (Criteria) this;
        }

        public Criteria andSfzytGreaterThan(String value) {
            addCriterion("SFZYT >", value, "sfzyt");
            return (Criteria) this;
        }

        public Criteria andSfzytGreaterThanOrEqualTo(String value) {
            addCriterion("SFZYT >=", value, "sfzyt");
            return (Criteria) this;
        }

        public Criteria andSfzytLessThan(String value) {
            addCriterion("SFZYT <", value, "sfzyt");
            return (Criteria) this;
        }

        public Criteria andSfzytLessThanOrEqualTo(String value) {
            addCriterion("SFZYT <=", value, "sfzyt");
            return (Criteria) this;
        }

        public Criteria andSfzytIn(List<String> values) {
            addCriterion("SFZYT in", values, "sfzyt");
            return (Criteria) this;
        }

        public Criteria andSfzytNotIn(List<String> values) {
            addCriterion("SFZYT not in", values, "sfzyt");
            return (Criteria) this;
        }

        public Criteria andSfzytBetween(String value1, String value2) {
            addCriterion("SFZYT between", value1, value2, "sfzyt");
            return (Criteria) this;
        }

        public Criteria andSfzytNotBetween(String value1, String value2) {
            addCriterion("SFZYT not between", value1, value2, "sfzyt");
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

        public Criteria andTdytEqualTo(String value) {
            addCriterion("TDYT =", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytNotEqualTo(String value) {
            addCriterion("TDYT <>", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytGreaterThan(String value) {
            addCriterion("TDYT >", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytGreaterThanOrEqualTo(String value) {
            addCriterion("TDYT >=", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytLessThan(String value) {
            addCriterion("TDYT <", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytLessThanOrEqualTo(String value) {
            addCriterion("TDYT <=", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytIn(List<String> values) {
            addCriterion("TDYT in", values, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytNotIn(List<String> values) {
            addCriterion("TDYT not in", values, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytBetween(String value1, String value2) {
            addCriterion("TDYT between", value1, value2, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytNotBetween(String value1, String value2) {
            addCriterion("TDYT not between", value1, value2, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytmcIsNull() {
            addCriterion("TDYTMC is null");
            return (Criteria) this;
        }

        public Criteria andTdytmcIsNotNull() {
            addCriterion("TDYTMC is not null");
            return (Criteria) this;
        }

        public Criteria andTdytmcEqualTo(String value) {
            addCriterion("TDYTMC =", value, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andTdytmcNotEqualTo(String value) {
            addCriterion("TDYTMC <>", value, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andTdytmcGreaterThan(String value) {
            addCriterion("TDYTMC >", value, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andTdytmcGreaterThanOrEqualTo(String value) {
            addCriterion("TDYTMC >=", value, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andTdytmcLessThan(String value) {
            addCriterion("TDYTMC <", value, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andTdytmcLessThanOrEqualTo(String value) {
            addCriterion("TDYTMC <=", value, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andTdytmcIn(List<String> values) {
            addCriterion("TDYTMC in", values, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andTdytmcNotIn(List<String> values) {
            addCriterion("TDYTMC not in", values, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andTdytmcBetween(String value1, String value2) {
            addCriterion("TDYTMC between", value1, value2, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andTdytmcNotBetween(String value1, String value2) {
            addCriterion("TDYTMC not between", value1, value2, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andTdjgIsNull() {
            addCriterion("TDJG is null");
            return (Criteria) this;
        }

        public Criteria andTdjgIsNotNull() {
            addCriterion("TDJG is not null");
            return (Criteria) this;
        }

        public Criteria andTdjgEqualTo(String value) {
            addCriterion("TDJG =", value, "tdjg");
            return (Criteria) this;
        }

        public Criteria andTdjgNotEqualTo(String value) {
            addCriterion("TDJG <>", value, "tdjg");
            return (Criteria) this;
        }

        public Criteria andTdjgGreaterThan(String value) {
            addCriterion("TDJG >", value, "tdjg");
            return (Criteria) this;
        }

        public Criteria andTdjgGreaterThanOrEqualTo(String value) {
            addCriterion("TDJG >=", value, "tdjg");
            return (Criteria) this;
        }

        public Criteria andTdjgLessThan(String value) {
            addCriterion("TDJG <", value, "tdjg");
            return (Criteria) this;
        }

        public Criteria andTdjgLessThanOrEqualTo(String value) {
            addCriterion("TDJG <=", value, "tdjg");
            return (Criteria) this;
        }

        public Criteria andTdjgIn(List<String> values) {
            addCriterion("TDJG in", values, "tdjg");
            return (Criteria) this;
        }

        public Criteria andTdjgNotIn(List<String> values) {
            addCriterion("TDJG not in", values, "tdjg");
            return (Criteria) this;
        }

        public Criteria andTdjgBetween(String value1, String value2) {
            addCriterion("TDJG between", value1, value2, "tdjg");
            return (Criteria) this;
        }

        public Criteria andTdjgNotBetween(String value1, String value2) {
            addCriterion("TDJG not between", value1, value2, "tdjg");
            return (Criteria) this;
        }

        public Criteria andTddjIsNull() {
            addCriterion("TDDJ is null");
            return (Criteria) this;
        }

        public Criteria andTddjIsNotNull() {
            addCriterion("TDDJ is not null");
            return (Criteria) this;
        }

        public Criteria andTddjEqualTo(String value) {
            addCriterion("TDDJ =", value, "tddj");
            return (Criteria) this;
        }

        public Criteria andTddjNotEqualTo(String value) {
            addCriterion("TDDJ <>", value, "tddj");
            return (Criteria) this;
        }

        public Criteria andTddjGreaterThan(String value) {
            addCriterion("TDDJ >", value, "tddj");
            return (Criteria) this;
        }

        public Criteria andTddjGreaterThanOrEqualTo(String value) {
            addCriterion("TDDJ >=", value, "tddj");
            return (Criteria) this;
        }

        public Criteria andTddjLessThan(String value) {
            addCriterion("TDDJ <", value, "tddj");
            return (Criteria) this;
        }

        public Criteria andTddjLessThanOrEqualTo(String value) {
            addCriterion("TDDJ <=", value, "tddj");
            return (Criteria) this;
        }

        public Criteria andTddjIn(List<String> values) {
            addCriterion("TDDJ in", values, "tddj");
            return (Criteria) this;
        }

        public Criteria andTddjNotIn(List<String> values) {
            addCriterion("TDDJ not in", values, "tddj");
            return (Criteria) this;
        }

        public Criteria andTddjBetween(String value1, String value2) {
            addCriterion("TDDJ between", value1, value2, "tddj");
            return (Criteria) this;
        }

        public Criteria andTddjNotBetween(String value1, String value2) {
            addCriterion("TDDJ not between", value1, value2, "tddj");
            return (Criteria) this;
        }

        public Criteria andQsrqIsNull() {
            addCriterion("QSRQ is null");
            return (Criteria) this;
        }

        public Criteria andQsrqIsNotNull() {
            addCriterion("QSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andQsrqEqualTo(Date value) {
            addCriterion("QSRQ =", value, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqNotEqualTo(Date value) {
            addCriterion("QSRQ <>", value, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqGreaterThan(Date value) {
            addCriterion("QSRQ >", value, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqGreaterThanOrEqualTo(Date value) {
            addCriterion("QSRQ >=", value, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqLessThan(Date value) {
            addCriterion("QSRQ <", value, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqLessThanOrEqualTo(Date value) {
            addCriterion("QSRQ <=", value, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqIn(List<Date> values) {
            addCriterion("QSRQ in", values, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqNotIn(List<Date> values) {
            addCriterion("QSRQ not in", values, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqBetween(Date value1, Date value2) {
            addCriterion("QSRQ between", value1, value2, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqNotBetween(Date value1, Date value2) {
            addCriterion("QSRQ not between", value1, value2, "qsrq");
            return (Criteria) this;
        }

        public Criteria andZzrqIsNull() {
            addCriterion("ZZRQ is null");
            return (Criteria) this;
        }

        public Criteria andZzrqIsNotNull() {
            addCriterion("ZZRQ is not null");
            return (Criteria) this;
        }

        public Criteria andZzrqEqualTo(Date value) {
            addCriterion("ZZRQ =", value, "zzrq");
            return (Criteria) this;
        }

        public Criteria andZzrqNotEqualTo(Date value) {
            addCriterion("ZZRQ <>", value, "zzrq");
            return (Criteria) this;
        }

        public Criteria andZzrqGreaterThan(Date value) {
            addCriterion("ZZRQ >", value, "zzrq");
            return (Criteria) this;
        }

        public Criteria andZzrqGreaterThanOrEqualTo(Date value) {
            addCriterion("ZZRQ >=", value, "zzrq");
            return (Criteria) this;
        }

        public Criteria andZzrqLessThan(Date value) {
            addCriterion("ZZRQ <", value, "zzrq");
            return (Criteria) this;
        }

        public Criteria andZzrqLessThanOrEqualTo(Date value) {
            addCriterion("ZZRQ <=", value, "zzrq");
            return (Criteria) this;
        }

        public Criteria andZzrqIn(List<Date> values) {
            addCriterion("ZZRQ in", values, "zzrq");
            return (Criteria) this;
        }

        public Criteria andZzrqNotIn(List<Date> values) {
            addCriterion("ZZRQ not in", values, "zzrq");
            return (Criteria) this;
        }

        public Criteria andZzrqBetween(Date value1, Date value2) {
            addCriterion("ZZRQ between", value1, value2, "zzrq");
            return (Criteria) this;
        }

        public Criteria andZzrqNotBetween(Date value1, Date value2) {
            addCriterion("ZZRQ not between", value1, value2, "zzrq");
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

        public Criteria andSyqxEqualTo(String value) {
            addCriterion("SYQX =", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxNotEqualTo(String value) {
            addCriterion("SYQX <>", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxGreaterThan(String value) {
            addCriterion("SYQX >", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxGreaterThanOrEqualTo(String value) {
            addCriterion("SYQX >=", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxLessThan(String value) {
            addCriterion("SYQX <", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxLessThanOrEqualTo(String value) {
            addCriterion("SYQX <=", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxIn(List<String> values) {
            addCriterion("SYQX in", values, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxNotIn(List<String> values) {
            addCriterion("SYQX not in", values, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxBetween(String value1, String value2) {
            addCriterion("SYQX between", value1, value2, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxNotBetween(String value1, String value2) {
            addCriterion("SYQX not between", value1, value2, "syqx");
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

        public Criteria andQlxzIsNull() {
            addCriterion("QLXZ is null");
            return (Criteria) this;
        }

        public Criteria andQlxzIsNotNull() {
            addCriterion("QLXZ is not null");
            return (Criteria) this;
        }

        public Criteria andQlxzEqualTo(String value) {
            addCriterion("QLXZ =", value, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzNotEqualTo(String value) {
            addCriterion("QLXZ <>", value, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzGreaterThan(String value) {
            addCriterion("QLXZ >", value, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzGreaterThanOrEqualTo(String value) {
            addCriterion("QLXZ >=", value, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzLessThan(String value) {
            addCriterion("QLXZ <", value, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzLessThanOrEqualTo(String value) {
            addCriterion("QLXZ <=", value, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzIn(List<String> values) {
            addCriterion("QLXZ in", values, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzNotIn(List<String> values) {
            addCriterion("QLXZ not in", values, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzBetween(String value1, String value2) {
            addCriterion("QLXZ between", value1, value2, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzNotBetween(String value1, String value2) {
            addCriterion("QLXZ not between", value1, value2, "qlxz");
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