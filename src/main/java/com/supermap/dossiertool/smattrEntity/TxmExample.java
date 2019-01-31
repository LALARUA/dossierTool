package com.supermap.dossiertool.smattrEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TxmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TxmExample() {
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

        public Criteria andTxmidIsNull() {
            addCriterion("TXMID is null");
            return (Criteria) this;
        }

        public Criteria andTxmidIsNotNull() {
            addCriterion("TXMID is not null");
            return (Criteria) this;
        }

        public Criteria andTxmidEqualTo(Integer value) {
            addCriterion("TXMID =", value, "txmid");
            return (Criteria) this;
        }

        public Criteria andTxmidNotEqualTo(Short value) {
            addCriterion("TXMID <>", value, "txmid");
            return (Criteria) this;
        }

        public Criteria andTxmidGreaterThan(Short value) {
            addCriterion("TXMID >", value, "txmid");
            return (Criteria) this;
        }

        public Criteria andTxmidGreaterThanOrEqualTo(Short value) {
            addCriterion("TXMID >=", value, "txmid");
            return (Criteria) this;
        }

        public Criteria andTxmidLessThan(Short value) {
            addCriterion("TXMID <", value, "txmid");
            return (Criteria) this;
        }

        public Criteria andTxmidLessThanOrEqualTo(Short value) {
            addCriterion("TXMID <=", value, "txmid");
            return (Criteria) this;
        }

        public Criteria andTxmidIn(List<Short> values) {
            addCriterion("TXMID in", values, "txmid");
            return (Criteria) this;
        }

        public Criteria andTxmidNotIn(List<Short> values) {
            addCriterion("TXMID not in", values, "txmid");
            return (Criteria) this;
        }

        public Criteria andTxmidBetween(Short value1, Short value2) {
            addCriterion("TXMID between", value1, value2, "txmid");
            return (Criteria) this;
        }

        public Criteria andTxmidNotBetween(Short value1, Short value2) {
            addCriterion("TXMID not between", value1, value2, "txmid");
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

        public Criteria andDabhIsNull() {
            addCriterion("DABH is null");
            return (Criteria) this;
        }

        public Criteria andDabhIsNotNull() {
            addCriterion("DABH is not null");
            return (Criteria) this;
        }

        public Criteria andDabhEqualTo(Integer value) {
            addCriterion("DABH =", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhNotEqualTo(Short value) {
            addCriterion("DABH <>", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhGreaterThan(Short value) {
            addCriterion("DABH >", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhGreaterThanOrEqualTo(Short value) {
            addCriterion("DABH >=", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhLessThan(Short value) {
            addCriterion("DABH <", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhLessThanOrEqualTo(Short value) {
            addCriterion("DABH <=", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhIn(List<Short> values) {
            addCriterion("DABH in", values, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhNotIn(List<Short> values) {
            addCriterion("DABH not in", values, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhBetween(Short value1, Short value2) {
            addCriterion("DABH between", value1, value2, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhNotBetween(Short value1, Short value2) {
            addCriterion("DABH not between", value1, value2, "dabh");
            return (Criteria) this;
        }

        public Criteria andDalxbhIsNull() {
            addCriterion("DALXBH is null");
            return (Criteria) this;
        }

        public Criteria andDalxbhIsNotNull() {
            addCriterion("DALXBH is not null");
            return (Criteria) this;
        }

        public Criteria andDalxbhEqualTo(String value) {
            addCriterion("DALXBH =", value, "dalxbh");
            return (Criteria) this;
        }

        public Criteria andDalxbhNotEqualTo(String value) {
            addCriterion("DALXBH <>", value, "dalxbh");
            return (Criteria) this;
        }

        public Criteria andDalxbhGreaterThan(String value) {
            addCriterion("DALXBH >", value, "dalxbh");
            return (Criteria) this;
        }

        public Criteria andDalxbhGreaterThanOrEqualTo(String value) {
            addCriterion("DALXBH >=", value, "dalxbh");
            return (Criteria) this;
        }

        public Criteria andDalxbhLessThan(String value) {
            addCriterion("DALXBH <", value, "dalxbh");
            return (Criteria) this;
        }

        public Criteria andDalxbhLessThanOrEqualTo(String value) {
            addCriterion("DALXBH <=", value, "dalxbh");
            return (Criteria) this;
        }

        public Criteria andDalxbhIn(List<String> values) {
            addCriterion("DALXBH in", values, "dalxbh");
            return (Criteria) this;
        }

        public Criteria andDalxbhNotIn(List<String> values) {
            addCriterion("DALXBH not in", values, "dalxbh");
            return (Criteria) this;
        }

        public Criteria andDalxbhBetween(String value1, String value2) {
            addCriterion("DALXBH between", value1, value2, "dalxbh");
            return (Criteria) this;
        }

        public Criteria andDalxbhNotBetween(String value1, String value2) {
            addCriterion("DALXBH not between", value1, value2, "dalxbh");
            return (Criteria) this;
        }

        public Criteria andDalxIsNull() {
            addCriterion("DALX is null");
            return (Criteria) this;
        }

        public Criteria andDalxIsNotNull() {
            addCriterion("DALX is not null");
            return (Criteria) this;
        }

        public Criteria andDalxEqualTo(String value) {
            addCriterion("DALX =", value, "dalx");
            return (Criteria) this;
        }

        public Criteria andDalxNotEqualTo(String value) {
            addCriterion("DALX <>", value, "dalx");
            return (Criteria) this;
        }

        public Criteria andDalxGreaterThan(String value) {
            addCriterion("DALX >", value, "dalx");
            return (Criteria) this;
        }

        public Criteria andDalxGreaterThanOrEqualTo(String value) {
            addCriterion("DALX >=", value, "dalx");
            return (Criteria) this;
        }

        public Criteria andDalxLessThan(String value) {
            addCriterion("DALX <", value, "dalx");
            return (Criteria) this;
        }

        public Criteria andDalxLessThanOrEqualTo(String value) {
            addCriterion("DALX <=", value, "dalx");
            return (Criteria) this;
        }

        public Criteria andDalxIn(List<String> values) {
            addCriterion("DALX in", values, "dalx");
            return (Criteria) this;
        }

        public Criteria andDalxNotIn(List<String> values) {
            addCriterion("DALX not in", values, "dalx");
            return (Criteria) this;
        }

        public Criteria andDalxBetween(String value1, String value2) {
            addCriterion("DALX between", value1, value2, "dalx");
            return (Criteria) this;
        }

        public Criteria andDalxNotBetween(String value1, String value2) {
            addCriterion("DALX not between", value1, value2, "dalx");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andMacIsNull() {
            addCriterion("MAC is null");
            return (Criteria) this;
        }

        public Criteria andMacIsNotNull() {
            addCriterion("MAC is not null");
            return (Criteria) this;
        }

        public Criteria andMacEqualTo(String value) {
            addCriterion("MAC =", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotEqualTo(String value) {
            addCriterion("MAC <>", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThan(String value) {
            addCriterion("MAC >", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThanOrEqualTo(String value) {
            addCriterion("MAC >=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThan(String value) {
            addCriterion("MAC <", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThanOrEqualTo(String value) {
            addCriterion("MAC <=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacIn(List<String> values) {
            addCriterion("MAC in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotIn(List<String> values) {
            addCriterion("MAC not in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacBetween(String value1, String value2) {
            addCriterion("MAC between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotBetween(String value1, String value2) {
            addCriterion("MAC not between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andJsjmIsNull() {
            addCriterion("JSJM is null");
            return (Criteria) this;
        }

        public Criteria andJsjmIsNotNull() {
            addCriterion("JSJM is not null");
            return (Criteria) this;
        }

        public Criteria andJsjmEqualTo(String value) {
            addCriterion("JSJM =", value, "jsjm");
            return (Criteria) this;
        }

        public Criteria andJsjmNotEqualTo(String value) {
            addCriterion("JSJM <>", value, "jsjm");
            return (Criteria) this;
        }

        public Criteria andJsjmGreaterThan(String value) {
            addCriterion("JSJM >", value, "jsjm");
            return (Criteria) this;
        }

        public Criteria andJsjmGreaterThanOrEqualTo(String value) {
            addCriterion("JSJM >=", value, "jsjm");
            return (Criteria) this;
        }

        public Criteria andJsjmLessThan(String value) {
            addCriterion("JSJM <", value, "jsjm");
            return (Criteria) this;
        }

        public Criteria andJsjmLessThanOrEqualTo(String value) {
            addCriterion("JSJM <=", value, "jsjm");
            return (Criteria) this;
        }

        public Criteria andJsjmIn(List<String> values) {
            addCriterion("JSJM in", values, "jsjm");
            return (Criteria) this;
        }

        public Criteria andJsjmNotIn(List<String> values) {
            addCriterion("JSJM not in", values, "jsjm");
            return (Criteria) this;
        }

        public Criteria andJsjmBetween(String value1, String value2) {
            addCriterion("JSJM between", value1, value2, "jsjm");
            return (Criteria) this;
        }

        public Criteria andJsjmNotBetween(String value1, String value2) {
            addCriterion("JSJM not between", value1, value2, "jsjm");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andBgqxIsNull() {
            addCriterion("BGQX is null");
            return (Criteria) this;
        }

        public Criteria andBgqxIsNotNull() {
            addCriterion("BGQX is not null");
            return (Criteria) this;
        }

        public Criteria andBgqxEqualTo(String value) {
            addCriterion("BGQX =", value, "bgqx");
            return (Criteria) this;
        }

        public Criteria andBgqxNotEqualTo(String value) {
            addCriterion("BGQX <>", value, "bgqx");
            return (Criteria) this;
        }

        public Criteria andBgqxGreaterThan(String value) {
            addCriterion("BGQX >", value, "bgqx");
            return (Criteria) this;
        }

        public Criteria andBgqxGreaterThanOrEqualTo(String value) {
            addCriterion("BGQX >=", value, "bgqx");
            return (Criteria) this;
        }

        public Criteria andBgqxLessThan(String value) {
            addCriterion("BGQX <", value, "bgqx");
            return (Criteria) this;
        }

        public Criteria andBgqxLessThanOrEqualTo(String value) {
            addCriterion("BGQX <=", value, "bgqx");
            return (Criteria) this;
        }

        public Criteria andBgqxIn(List<String> values) {
            addCriterion("BGQX in", values, "bgqx");
            return (Criteria) this;
        }

        public Criteria andBgqxNotIn(List<String> values) {
            addCriterion("BGQX not in", values, "bgqx");
            return (Criteria) this;
        }

        public Criteria andBgqxBetween(String value1, String value2) {
            addCriterion("BGQX between", value1, value2, "bgqx");
            return (Criteria) this;
        }

        public Criteria andBgqxNotBetween(String value1, String value2) {
            addCriterion("BGQX not between", value1, value2, "bgqx");
            return (Criteria) this;
        }

        public Criteria andFpysIsNull() {
            addCriterion("FPYS is null");
            return (Criteria) this;
        }

        public Criteria andFpysIsNotNull() {
            addCriterion("FPYS is not null");
            return (Criteria) this;
        }

        public Criteria andFpysEqualTo(String value) {
            addCriterion("FPYS =", value, "fpys");
            return (Criteria) this;
        }

        public Criteria andFpysNotEqualTo(String value) {
            addCriterion("FPYS <>", value, "fpys");
            return (Criteria) this;
        }

        public Criteria andFpysGreaterThan(String value) {
            addCriterion("FPYS >", value, "fpys");
            return (Criteria) this;
        }

        public Criteria andFpysGreaterThanOrEqualTo(String value) {
            addCriterion("FPYS >=", value, "fpys");
            return (Criteria) this;
        }

        public Criteria andFpysLessThan(String value) {
            addCriterion("FPYS <", value, "fpys");
            return (Criteria) this;
        }

        public Criteria andFpysLessThanOrEqualTo(String value) {
            addCriterion("FPYS <=", value, "fpys");
            return (Criteria) this;
        }

        public Criteria andFpysIn(List<String> values) {
            addCriterion("FPYS in", values, "fpys");
            return (Criteria) this;
        }

        public Criteria andFpysNotIn(List<String> values) {
            addCriterion("FPYS not in", values, "fpys");
            return (Criteria) this;
        }

        public Criteria andFpysBetween(String value1, String value2) {
            addCriterion("FPYS between", value1, value2, "fpys");
            return (Criteria) this;
        }

        public Criteria andFpysNotBetween(String value1, String value2) {
            addCriterion("FPYS not between", value1, value2, "fpys");
            return (Criteria) this;
        }

        public Criteria andJnmlczbzIsNull() {
            addCriterion("JNMLCZBZ is null");
            return (Criteria) this;
        }

        public Criteria andJnmlczbzIsNotNull() {
            addCriterion("JNMLCZBZ is not null");
            return (Criteria) this;
        }

        public Criteria andJnmlczbzEqualTo(String value) {
            addCriterion("JNMLCZBZ =", value, "jnmlczbz");
            return (Criteria) this;
        }

        public Criteria andJnmlczbzNotEqualTo(String value) {
            addCriterion("JNMLCZBZ <>", value, "jnmlczbz");
            return (Criteria) this;
        }

        public Criteria andJnmlczbzGreaterThan(String value) {
            addCriterion("JNMLCZBZ >", value, "jnmlczbz");
            return (Criteria) this;
        }

        public Criteria andJnmlczbzGreaterThanOrEqualTo(String value) {
            addCriterion("JNMLCZBZ >=", value, "jnmlczbz");
            return (Criteria) this;
        }

        public Criteria andJnmlczbzLessThan(String value) {
            addCriterion("JNMLCZBZ <", value, "jnmlczbz");
            return (Criteria) this;
        }

        public Criteria andJnmlczbzLessThanOrEqualTo(String value) {
            addCriterion("JNMLCZBZ <=", value, "jnmlczbz");
            return (Criteria) this;
        }

        public Criteria andJnmlczbzIn(List<String> values) {
            addCriterion("JNMLCZBZ in", values, "jnmlczbz");
            return (Criteria) this;
        }

        public Criteria andJnmlczbzNotIn(List<String> values) {
            addCriterion("JNMLCZBZ not in", values, "jnmlczbz");
            return (Criteria) this;
        }

        public Criteria andJnmlczbzBetween(String value1, String value2) {
            addCriterion("JNMLCZBZ between", value1, value2, "jnmlczbz");
            return (Criteria) this;
        }

        public Criteria andJnmlczbzNotBetween(String value1, String value2) {
            addCriterion("JNMLCZBZ not between", value1, value2, "jnmlczbz");
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

        public Criteria andZlEqualTo(String value) {
            addCriterion("ZL =", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlNotEqualTo(String value) {
            addCriterion("ZL <>", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlGreaterThan(String value) {
            addCriterion("ZL >", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlGreaterThanOrEqualTo(String value) {
            addCriterion("ZL >=", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlLessThan(String value) {
            addCriterion("ZL <", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlLessThanOrEqualTo(String value) {
            addCriterion("ZL <=", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlIn(List<String> values) {
            addCriterion("ZL in", values, "zl");
            return (Criteria) this;
        }

        public Criteria andZlNotIn(List<String> values) {
            addCriterion("ZL not in", values, "zl");
            return (Criteria) this;
        }

        public Criteria andZlBetween(String value1, String value2) {
            addCriterion("ZL between", value1, value2, "zl");
            return (Criteria) this;
        }

        public Criteria andZlNotBetween(String value1, String value2) {
            addCriterion("ZL not between", value1, value2, "zl");
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

        public Criteria andZxsjEqualTo(String value) {
            addCriterion("ZXSJ =", value, "zxsj");
            return (Criteria) this;
        }

        public Criteria andZxsjNotEqualTo(String value) {
            addCriterion("ZXSJ <>", value, "zxsj");
            return (Criteria) this;
        }

        public Criteria andZxsjGreaterThan(String value) {
            addCriterion("ZXSJ >", value, "zxsj");
            return (Criteria) this;
        }

        public Criteria andZxsjGreaterThanOrEqualTo(String value) {
            addCriterion("ZXSJ >=", value, "zxsj");
            return (Criteria) this;
        }

        public Criteria andZxsjLessThan(String value) {
            addCriterion("ZXSJ <", value, "zxsj");
            return (Criteria) this;
        }

        public Criteria andZxsjLessThanOrEqualTo(String value) {
            addCriterion("ZXSJ <=", value, "zxsj");
            return (Criteria) this;
        }

        public Criteria andZxsjIn(List<String> values) {
            addCriterion("ZXSJ in", values, "zxsj");
            return (Criteria) this;
        }

        public Criteria andZxsjNotIn(List<String> values) {
            addCriterion("ZXSJ not in", values, "zxsj");
            return (Criteria) this;
        }

        public Criteria andZxsjBetween(String value1, String value2) {
            addCriterion("ZXSJ between", value1, value2, "zxsj");
            return (Criteria) this;
        }

        public Criteria andZxsjNotBetween(String value1, String value2) {
            addCriterion("ZXSJ not between", value1, value2, "zxsj");
            return (Criteria) this;
        }

        public Criteria andZnIsNull() {
            addCriterion("ZN is null");
            return (Criteria) this;
        }

        public Criteria andZnIsNotNull() {
            addCriterion("ZN is not null");
            return (Criteria) this;
        }

        public Criteria andZnEqualTo(String value) {
            addCriterion("ZN =", value, "zn");
            return (Criteria) this;
        }

        public Criteria andZnNotEqualTo(String value) {
            addCriterion("ZN <>", value, "zn");
            return (Criteria) this;
        }

        public Criteria andZnGreaterThan(String value) {
            addCriterion("ZN >", value, "zn");
            return (Criteria) this;
        }

        public Criteria andZnGreaterThanOrEqualTo(String value) {
            addCriterion("ZN >=", value, "zn");
            return (Criteria) this;
        }

        public Criteria andZnLessThan(String value) {
            addCriterion("ZN <", value, "zn");
            return (Criteria) this;
        }

        public Criteria andZnLessThanOrEqualTo(String value) {
            addCriterion("ZN <=", value, "zn");
            return (Criteria) this;
        }

        public Criteria andZnIn(List<String> values) {
            addCriterion("ZN in", values, "zn");
            return (Criteria) this;
        }

        public Criteria andZnNotIn(List<String> values) {
            addCriterion("ZN not in", values, "zn");
            return (Criteria) this;
        }

        public Criteria andZnBetween(String value1, String value2) {
            addCriterion("ZN between", value1, value2, "zn");
            return (Criteria) this;
        }

        public Criteria andZnNotBetween(String value1, String value2) {
            addCriterion("ZN not between", value1, value2, "zn");
            return (Criteria) this;
        }

        public Criteria andZyIsNull() {
            addCriterion("ZY is null");
            return (Criteria) this;
        }

        public Criteria andZyIsNotNull() {
            addCriterion("ZY is not null");
            return (Criteria) this;
        }

        public Criteria andZyEqualTo(String value) {
            addCriterion("ZY =", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotEqualTo(String value) {
            addCriterion("ZY <>", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyGreaterThan(String value) {
            addCriterion("ZY >", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyGreaterThanOrEqualTo(String value) {
            addCriterion("ZY >=", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLessThan(String value) {
            addCriterion("ZY <", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLessThanOrEqualTo(String value) {
            addCriterion("ZY <=", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyIn(List<String> values) {
            addCriterion("ZY in", values, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotIn(List<String> values) {
            addCriterion("ZY not in", values, "zy");
            return (Criteria) this;
        }

        public Criteria andZyBetween(String value1, String value2) {
            addCriterion("ZY between", value1, value2, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotBetween(String value1, String value2) {
            addCriterion("ZY not between", value1, value2, "zy");
            return (Criteria) this;
        }

        public Criteria andDnIsNull() {
            addCriterion("DN is null");
            return (Criteria) this;
        }

        public Criteria andDnIsNotNull() {
            addCriterion("DN is not null");
            return (Criteria) this;
        }

        public Criteria andDnEqualTo(String value) {
            addCriterion("DN =", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnNotEqualTo(String value) {
            addCriterion("DN <>", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnGreaterThan(String value) {
            addCriterion("DN >", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnGreaterThanOrEqualTo(String value) {
            addCriterion("DN >=", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnLessThan(String value) {
            addCriterion("DN <", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnLessThanOrEqualTo(String value) {
            addCriterion("DN <=", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnIn(List<String> values) {
            addCriterion("DN in", values, "dn");
            return (Criteria) this;
        }

        public Criteria andDnNotIn(List<String> values) {
            addCriterion("DN not in", values, "dn");
            return (Criteria) this;
        }

        public Criteria andDnBetween(String value1, String value2) {
            addCriterion("DN between", value1, value2, "dn");
            return (Criteria) this;
        }

        public Criteria andDnNotBetween(String value1, String value2) {
            addCriterion("DN not between", value1, value2, "dn");
            return (Criteria) this;
        }

        public Criteria andDyIsNull() {
            addCriterion("DY is null");
            return (Criteria) this;
        }

        public Criteria andDyIsNotNull() {
            addCriterion("DY is not null");
            return (Criteria) this;
        }

        public Criteria andDyEqualTo(String value) {
            addCriterion("DY =", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyNotEqualTo(String value) {
            addCriterion("DY <>", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyGreaterThan(String value) {
            addCriterion("DY >", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyGreaterThanOrEqualTo(String value) {
            addCriterion("DY >=", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyLessThan(String value) {
            addCriterion("DY <", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyLessThanOrEqualTo(String value) {
            addCriterion("DY <=", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyIn(List<String> values) {
            addCriterion("DY in", values, "dy");
            return (Criteria) this;
        }

        public Criteria andDyNotIn(List<String> values) {
            addCriterion("DY not in", values, "dy");
            return (Criteria) this;
        }

        public Criteria andDyBetween(String value1, String value2) {
            addCriterion("DY between", value1, value2, "dy");
            return (Criteria) this;
        }

        public Criteria andDyNotBetween(String value1, String value2) {
            addCriterion("DY not between", value1, value2, "dy");
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