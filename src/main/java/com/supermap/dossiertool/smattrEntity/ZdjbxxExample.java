package com.supermap.dossiertool.smattrEntity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZdjbxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZdjbxxExample() {
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

        public Criteria andZdtzmIsNull() {
            addCriterion("ZDTZM is null");
            return (Criteria) this;
        }

        public Criteria andZdtzmIsNotNull() {
            addCriterion("ZDTZM is not null");
            return (Criteria) this;
        }

        public Criteria andZdtzmEqualTo(String value) {
            addCriterion("ZDTZM =", value, "zdtzm");
            return (Criteria) this;
        }

        public Criteria andZdtzmNotEqualTo(String value) {
            addCriterion("ZDTZM <>", value, "zdtzm");
            return (Criteria) this;
        }

        public Criteria andZdtzmGreaterThan(String value) {
            addCriterion("ZDTZM >", value, "zdtzm");
            return (Criteria) this;
        }

        public Criteria andZdtzmGreaterThanOrEqualTo(String value) {
            addCriterion("ZDTZM >=", value, "zdtzm");
            return (Criteria) this;
        }

        public Criteria andZdtzmLessThan(String value) {
            addCriterion("ZDTZM <", value, "zdtzm");
            return (Criteria) this;
        }

        public Criteria andZdtzmLessThanOrEqualTo(String value) {
            addCriterion("ZDTZM <=", value, "zdtzm");
            return (Criteria) this;
        }

        public Criteria andZdtzmIn(List<String> values) {
            addCriterion("ZDTZM in", values, "zdtzm");
            return (Criteria) this;
        }

        public Criteria andZdtzmNotIn(List<String> values) {
            addCriterion("ZDTZM not in", values, "zdtzm");
            return (Criteria) this;
        }

        public Criteria andZdtzmBetween(String value1, String value2) {
            addCriterion("ZDTZM between", value1, value2, "zdtzm");
            return (Criteria) this;
        }

        public Criteria andZdtzmNotBetween(String value1, String value2) {
            addCriterion("ZDTZM not between", value1, value2, "zdtzm");
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

        public Criteria andMjdwIsNull() {
            addCriterion("MJDW is null");
            return (Criteria) this;
        }

        public Criteria andMjdwIsNotNull() {
            addCriterion("MJDW is not null");
            return (Criteria) this;
        }

        public Criteria andMjdwEqualTo(String value) {
            addCriterion("MJDW =", value, "mjdw");
            return (Criteria) this;
        }

        public Criteria andMjdwNotEqualTo(String value) {
            addCriterion("MJDW <>", value, "mjdw");
            return (Criteria) this;
        }

        public Criteria andMjdwGreaterThan(String value) {
            addCriterion("MJDW >", value, "mjdw");
            return (Criteria) this;
        }

        public Criteria andMjdwGreaterThanOrEqualTo(String value) {
            addCriterion("MJDW >=", value, "mjdw");
            return (Criteria) this;
        }

        public Criteria andMjdwLessThan(String value) {
            addCriterion("MJDW <", value, "mjdw");
            return (Criteria) this;
        }

        public Criteria andMjdwLessThanOrEqualTo(String value) {
            addCriterion("MJDW <=", value, "mjdw");
            return (Criteria) this;
        }

        public Criteria andMjdwIn(List<String> values) {
            addCriterion("MJDW in", values, "mjdw");
            return (Criteria) this;
        }

        public Criteria andMjdwNotIn(List<String> values) {
            addCriterion("MJDW not in", values, "mjdw");
            return (Criteria) this;
        }

        public Criteria andMjdwBetween(String value1, String value2) {
            addCriterion("MJDW between", value1, value2, "mjdw");
            return (Criteria) this;
        }

        public Criteria andMjdwNotBetween(String value1, String value2) {
            addCriterion("MJDW not between", value1, value2, "mjdw");
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

        public Criteria andYtEqualTo(String value) {
            addCriterion("YT =", value, "yt");
            return (Criteria) this;
        }

        public Criteria andYtNotEqualTo(String value) {
            addCriterion("YT <>", value, "yt");
            return (Criteria) this;
        }

        public Criteria andYtGreaterThan(String value) {
            addCriterion("YT >", value, "yt");
            return (Criteria) this;
        }

        public Criteria andYtGreaterThanOrEqualTo(String value) {
            addCriterion("YT >=", value, "yt");
            return (Criteria) this;
        }

        public Criteria andYtLessThan(String value) {
            addCriterion("YT <", value, "yt");
            return (Criteria) this;
        }

        public Criteria andYtLessThanOrEqualTo(String value) {
            addCriterion("YT <=", value, "yt");
            return (Criteria) this;
        }

        public Criteria andYtIn(List<String> values) {
            addCriterion("YT in", values, "yt");
            return (Criteria) this;
        }

        public Criteria andYtNotIn(List<String> values) {
            addCriterion("YT not in", values, "yt");
            return (Criteria) this;
        }

        public Criteria andYtBetween(String value1, String value2) {
            addCriterion("YT between", value1, value2, "yt");
            return (Criteria) this;
        }

        public Criteria andYtNotBetween(String value1, String value2) {
            addCriterion("YT not between", value1, value2, "yt");
            return (Criteria) this;
        }

        public Criteria andDjIsNull() {
            addCriterion("DJ is null");
            return (Criteria) this;
        }

        public Criteria andDjIsNotNull() {
            addCriterion("DJ is not null");
            return (Criteria) this;
        }

        public Criteria andDjEqualTo(String value) {
            addCriterion("DJ =", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjNotEqualTo(String value) {
            addCriterion("DJ <>", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjGreaterThan(String value) {
            addCriterion("DJ >", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjGreaterThanOrEqualTo(String value) {
            addCriterion("DJ >=", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjLessThan(String value) {
            addCriterion("DJ <", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjLessThanOrEqualTo(String value) {
            addCriterion("DJ <=", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjIn(List<String> values) {
            addCriterion("DJ in", values, "dj");
            return (Criteria) this;
        }

        public Criteria andDjNotIn(List<String> values) {
            addCriterion("DJ not in", values, "dj");
            return (Criteria) this;
        }

        public Criteria andDjBetween(String value1, String value2) {
            addCriterion("DJ between", value1, value2, "dj");
            return (Criteria) this;
        }

        public Criteria andDjNotBetween(String value1, String value2) {
            addCriterion("DJ not between", value1, value2, "dj");
            return (Criteria) this;
        }

        public Criteria andJgIsNull() {
            addCriterion("JG is null");
            return (Criteria) this;
        }

        public Criteria andJgIsNotNull() {
            addCriterion("JG is not null");
            return (Criteria) this;
        }

        public Criteria andJgEqualTo(BigDecimal value) {
            addCriterion("JG =", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotEqualTo(BigDecimal value) {
            addCriterion("JG <>", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThan(BigDecimal value) {
            addCriterion("JG >", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JG >=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThan(BigDecimal value) {
            addCriterion("JG <", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JG <=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgIn(List<BigDecimal> values) {
            addCriterion("JG in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotIn(List<BigDecimal> values) {
            addCriterion("JG not in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JG between", value1, value2, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JG not between", value1, value2, "jg");
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

        public Criteria andQlsdfsIsNull() {
            addCriterion("QLSDFS is null");
            return (Criteria) this;
        }

        public Criteria andQlsdfsIsNotNull() {
            addCriterion("QLSDFS is not null");
            return (Criteria) this;
        }

        public Criteria andQlsdfsEqualTo(String value) {
            addCriterion("QLSDFS =", value, "qlsdfs");
            return (Criteria) this;
        }

        public Criteria andQlsdfsNotEqualTo(String value) {
            addCriterion("QLSDFS <>", value, "qlsdfs");
            return (Criteria) this;
        }

        public Criteria andQlsdfsGreaterThan(String value) {
            addCriterion("QLSDFS >", value, "qlsdfs");
            return (Criteria) this;
        }

        public Criteria andQlsdfsGreaterThanOrEqualTo(String value) {
            addCriterion("QLSDFS >=", value, "qlsdfs");
            return (Criteria) this;
        }

        public Criteria andQlsdfsLessThan(String value) {
            addCriterion("QLSDFS <", value, "qlsdfs");
            return (Criteria) this;
        }

        public Criteria andQlsdfsLessThanOrEqualTo(String value) {
            addCriterion("QLSDFS <=", value, "qlsdfs");
            return (Criteria) this;
        }

        public Criteria andQlsdfsIn(List<String> values) {
            addCriterion("QLSDFS in", values, "qlsdfs");
            return (Criteria) this;
        }

        public Criteria andQlsdfsNotIn(List<String> values) {
            addCriterion("QLSDFS not in", values, "qlsdfs");
            return (Criteria) this;
        }

        public Criteria andQlsdfsBetween(String value1, String value2) {
            addCriterion("QLSDFS between", value1, value2, "qlsdfs");
            return (Criteria) this;
        }

        public Criteria andQlsdfsNotBetween(String value1, String value2) {
            addCriterion("QLSDFS not between", value1, value2, "qlsdfs");
            return (Criteria) this;
        }

        public Criteria andRjlIsNull() {
            addCriterion("RJL is null");
            return (Criteria) this;
        }

        public Criteria andRjlIsNotNull() {
            addCriterion("RJL is not null");
            return (Criteria) this;
        }

        public Criteria andRjlEqualTo(String value) {
            addCriterion("RJL =", value, "rjl");
            return (Criteria) this;
        }

        public Criteria andRjlNotEqualTo(String value) {
            addCriterion("RJL <>", value, "rjl");
            return (Criteria) this;
        }

        public Criteria andRjlGreaterThan(String value) {
            addCriterion("RJL >", value, "rjl");
            return (Criteria) this;
        }

        public Criteria andRjlGreaterThanOrEqualTo(String value) {
            addCriterion("RJL >=", value, "rjl");
            return (Criteria) this;
        }

        public Criteria andRjlLessThan(String value) {
            addCriterion("RJL <", value, "rjl");
            return (Criteria) this;
        }

        public Criteria andRjlLessThanOrEqualTo(String value) {
            addCriterion("RJL <=", value, "rjl");
            return (Criteria) this;
        }

        public Criteria andRjlIn(List<String> values) {
            addCriterion("RJL in", values, "rjl");
            return (Criteria) this;
        }

        public Criteria andRjlNotIn(List<String> values) {
            addCriterion("RJL not in", values, "rjl");
            return (Criteria) this;
        }

        public Criteria andRjlBetween(String value1, String value2) {
            addCriterion("RJL between", value1, value2, "rjl");
            return (Criteria) this;
        }

        public Criteria andRjlNotBetween(String value1, String value2) {
            addCriterion("RJL not between", value1, value2, "rjl");
            return (Criteria) this;
        }

        public Criteria andJzmdIsNull() {
            addCriterion("JZMD is null");
            return (Criteria) this;
        }

        public Criteria andJzmdIsNotNull() {
            addCriterion("JZMD is not null");
            return (Criteria) this;
        }

        public Criteria andJzmdEqualTo(String value) {
            addCriterion("JZMD =", value, "jzmd");
            return (Criteria) this;
        }

        public Criteria andJzmdNotEqualTo(String value) {
            addCriterion("JZMD <>", value, "jzmd");
            return (Criteria) this;
        }

        public Criteria andJzmdGreaterThan(String value) {
            addCriterion("JZMD >", value, "jzmd");
            return (Criteria) this;
        }

        public Criteria andJzmdGreaterThanOrEqualTo(String value) {
            addCriterion("JZMD >=", value, "jzmd");
            return (Criteria) this;
        }

        public Criteria andJzmdLessThan(String value) {
            addCriterion("JZMD <", value, "jzmd");
            return (Criteria) this;
        }

        public Criteria andJzmdLessThanOrEqualTo(String value) {
            addCriterion("JZMD <=", value, "jzmd");
            return (Criteria) this;
        }

        public Criteria andJzmdIn(List<String> values) {
            addCriterion("JZMD in", values, "jzmd");
            return (Criteria) this;
        }

        public Criteria andJzmdNotIn(List<String> values) {
            addCriterion("JZMD not in", values, "jzmd");
            return (Criteria) this;
        }

        public Criteria andJzmdBetween(String value1, String value2) {
            addCriterion("JZMD between", value1, value2, "jzmd");
            return (Criteria) this;
        }

        public Criteria andJzmdNotBetween(String value1, String value2) {
            addCriterion("JZMD not between", value1, value2, "jzmd");
            return (Criteria) this;
        }

        public Criteria andJzxgIsNull() {
            addCriterion("JZXG is null");
            return (Criteria) this;
        }

        public Criteria andJzxgIsNotNull() {
            addCriterion("JZXG is not null");
            return (Criteria) this;
        }

        public Criteria andJzxgEqualTo(BigDecimal value) {
            addCriterion("JZXG =", value, "jzxg");
            return (Criteria) this;
        }

        public Criteria andJzxgNotEqualTo(BigDecimal value) {
            addCriterion("JZXG <>", value, "jzxg");
            return (Criteria) this;
        }

        public Criteria andJzxgGreaterThan(BigDecimal value) {
            addCriterion("JZXG >", value, "jzxg");
            return (Criteria) this;
        }

        public Criteria andJzxgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JZXG >=", value, "jzxg");
            return (Criteria) this;
        }

        public Criteria andJzxgLessThan(BigDecimal value) {
            addCriterion("JZXG <", value, "jzxg");
            return (Criteria) this;
        }

        public Criteria andJzxgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JZXG <=", value, "jzxg");
            return (Criteria) this;
        }

        public Criteria andJzxgIn(List<BigDecimal> values) {
            addCriterion("JZXG in", values, "jzxg");
            return (Criteria) this;
        }

        public Criteria andJzxgNotIn(List<BigDecimal> values) {
            addCriterion("JZXG not in", values, "jzxg");
            return (Criteria) this;
        }

        public Criteria andJzxgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JZXG between", value1, value2, "jzxg");
            return (Criteria) this;
        }

        public Criteria andJzxgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JZXG not between", value1, value2, "jzxg");
            return (Criteria) this;
        }

        public Criteria andZdszdIsNull() {
            addCriterion("ZDSZD is null");
            return (Criteria) this;
        }

        public Criteria andZdszdIsNotNull() {
            addCriterion("ZDSZD is not null");
            return (Criteria) this;
        }

        public Criteria andZdszdEqualTo(String value) {
            addCriterion("ZDSZD =", value, "zdszd");
            return (Criteria) this;
        }

        public Criteria andZdszdNotEqualTo(String value) {
            addCriterion("ZDSZD <>", value, "zdszd");
            return (Criteria) this;
        }

        public Criteria andZdszdGreaterThan(String value) {
            addCriterion("ZDSZD >", value, "zdszd");
            return (Criteria) this;
        }

        public Criteria andZdszdGreaterThanOrEqualTo(String value) {
            addCriterion("ZDSZD >=", value, "zdszd");
            return (Criteria) this;
        }

        public Criteria andZdszdLessThan(String value) {
            addCriterion("ZDSZD <", value, "zdszd");
            return (Criteria) this;
        }

        public Criteria andZdszdLessThanOrEqualTo(String value) {
            addCriterion("ZDSZD <=", value, "zdszd");
            return (Criteria) this;
        }

        public Criteria andZdszdIn(List<String> values) {
            addCriterion("ZDSZD in", values, "zdszd");
            return (Criteria) this;
        }

        public Criteria andZdszdNotIn(List<String> values) {
            addCriterion("ZDSZD not in", values, "zdszd");
            return (Criteria) this;
        }

        public Criteria andZdszdBetween(String value1, String value2) {
            addCriterion("ZDSZD between", value1, value2, "zdszd");
            return (Criteria) this;
        }

        public Criteria andZdszdNotBetween(String value1, String value2) {
            addCriterion("ZDSZD not between", value1, value2, "zdszd");
            return (Criteria) this;
        }

        public Criteria andZdsznIsNull() {
            addCriterion("ZDSZN is null");
            return (Criteria) this;
        }

        public Criteria andZdsznIsNotNull() {
            addCriterion("ZDSZN is not null");
            return (Criteria) this;
        }

        public Criteria andZdsznEqualTo(String value) {
            addCriterion("ZDSZN =", value, "zdszn");
            return (Criteria) this;
        }

        public Criteria andZdsznNotEqualTo(String value) {
            addCriterion("ZDSZN <>", value, "zdszn");
            return (Criteria) this;
        }

        public Criteria andZdsznGreaterThan(String value) {
            addCriterion("ZDSZN >", value, "zdszn");
            return (Criteria) this;
        }

        public Criteria andZdsznGreaterThanOrEqualTo(String value) {
            addCriterion("ZDSZN >=", value, "zdszn");
            return (Criteria) this;
        }

        public Criteria andZdsznLessThan(String value) {
            addCriterion("ZDSZN <", value, "zdszn");
            return (Criteria) this;
        }

        public Criteria andZdsznLessThanOrEqualTo(String value) {
            addCriterion("ZDSZN <=", value, "zdszn");
            return (Criteria) this;
        }

        public Criteria andZdsznIn(List<String> values) {
            addCriterion("ZDSZN in", values, "zdszn");
            return (Criteria) this;
        }

        public Criteria andZdsznNotIn(List<String> values) {
            addCriterion("ZDSZN not in", values, "zdszn");
            return (Criteria) this;
        }

        public Criteria andZdsznBetween(String value1, String value2) {
            addCriterion("ZDSZN between", value1, value2, "zdszn");
            return (Criteria) this;
        }

        public Criteria andZdsznNotBetween(String value1, String value2) {
            addCriterion("ZDSZN not between", value1, value2, "zdszn");
            return (Criteria) this;
        }

        public Criteria andZdszxIsNull() {
            addCriterion("ZDSZX is null");
            return (Criteria) this;
        }

        public Criteria andZdszxIsNotNull() {
            addCriterion("ZDSZX is not null");
            return (Criteria) this;
        }

        public Criteria andZdszxEqualTo(String value) {
            addCriterion("ZDSZX =", value, "zdszx");
            return (Criteria) this;
        }

        public Criteria andZdszxNotEqualTo(String value) {
            addCriterion("ZDSZX <>", value, "zdszx");
            return (Criteria) this;
        }

        public Criteria andZdszxGreaterThan(String value) {
            addCriterion("ZDSZX >", value, "zdszx");
            return (Criteria) this;
        }

        public Criteria andZdszxGreaterThanOrEqualTo(String value) {
            addCriterion("ZDSZX >=", value, "zdszx");
            return (Criteria) this;
        }

        public Criteria andZdszxLessThan(String value) {
            addCriterion("ZDSZX <", value, "zdszx");
            return (Criteria) this;
        }

        public Criteria andZdszxLessThanOrEqualTo(String value) {
            addCriterion("ZDSZX <=", value, "zdszx");
            return (Criteria) this;
        }

        public Criteria andZdszxIn(List<String> values) {
            addCriterion("ZDSZX in", values, "zdszx");
            return (Criteria) this;
        }

        public Criteria andZdszxNotIn(List<String> values) {
            addCriterion("ZDSZX not in", values, "zdszx");
            return (Criteria) this;
        }

        public Criteria andZdszxBetween(String value1, String value2) {
            addCriterion("ZDSZX between", value1, value2, "zdszx");
            return (Criteria) this;
        }

        public Criteria andZdszxNotBetween(String value1, String value2) {
            addCriterion("ZDSZX not between", value1, value2, "zdszx");
            return (Criteria) this;
        }

        public Criteria andZdszbIsNull() {
            addCriterion("ZDSZB is null");
            return (Criteria) this;
        }

        public Criteria andZdszbIsNotNull() {
            addCriterion("ZDSZB is not null");
            return (Criteria) this;
        }

        public Criteria andZdszbEqualTo(String value) {
            addCriterion("ZDSZB =", value, "zdszb");
            return (Criteria) this;
        }

        public Criteria andZdszbNotEqualTo(String value) {
            addCriterion("ZDSZB <>", value, "zdszb");
            return (Criteria) this;
        }

        public Criteria andZdszbGreaterThan(String value) {
            addCriterion("ZDSZB >", value, "zdszb");
            return (Criteria) this;
        }

        public Criteria andZdszbGreaterThanOrEqualTo(String value) {
            addCriterion("ZDSZB >=", value, "zdszb");
            return (Criteria) this;
        }

        public Criteria andZdszbLessThan(String value) {
            addCriterion("ZDSZB <", value, "zdszb");
            return (Criteria) this;
        }

        public Criteria andZdszbLessThanOrEqualTo(String value) {
            addCriterion("ZDSZB <=", value, "zdszb");
            return (Criteria) this;
        }

        public Criteria andZdszbIn(List<String> values) {
            addCriterion("ZDSZB in", values, "zdszb");
            return (Criteria) this;
        }

        public Criteria andZdszbNotIn(List<String> values) {
            addCriterion("ZDSZB not in", values, "zdszb");
            return (Criteria) this;
        }

        public Criteria andZdszbBetween(String value1, String value2) {
            addCriterion("ZDSZB between", value1, value2, "zdszb");
            return (Criteria) this;
        }

        public Criteria andZdszbNotBetween(String value1, String value2) {
            addCriterion("ZDSZB not between", value1, value2, "zdszb");
            return (Criteria) this;
        }

        public Criteria andZdtIsNull() {
            addCriterion("ZDT is null");
            return (Criteria) this;
        }

        public Criteria andZdtIsNotNull() {
            addCriterion("ZDT is not null");
            return (Criteria) this;
        }

        public Criteria andZdtEqualTo(String value) {
            addCriterion("ZDT =", value, "zdt");
            return (Criteria) this;
        }

        public Criteria andZdtNotEqualTo(String value) {
            addCriterion("ZDT <>", value, "zdt");
            return (Criteria) this;
        }

        public Criteria andZdtGreaterThan(String value) {
            addCriterion("ZDT >", value, "zdt");
            return (Criteria) this;
        }

        public Criteria andZdtGreaterThanOrEqualTo(String value) {
            addCriterion("ZDT >=", value, "zdt");
            return (Criteria) this;
        }

        public Criteria andZdtLessThan(String value) {
            addCriterion("ZDT <", value, "zdt");
            return (Criteria) this;
        }

        public Criteria andZdtLessThanOrEqualTo(String value) {
            addCriterion("ZDT <=", value, "zdt");
            return (Criteria) this;
        }

        public Criteria andZdtIn(List<String> values) {
            addCriterion("ZDT in", values, "zdt");
            return (Criteria) this;
        }

        public Criteria andZdtNotIn(List<String> values) {
            addCriterion("ZDT not in", values, "zdt");
            return (Criteria) this;
        }

        public Criteria andZdtBetween(String value1, String value2) {
            addCriterion("ZDT between", value1, value2, "zdt");
            return (Criteria) this;
        }

        public Criteria andZdtNotBetween(String value1, String value2) {
            addCriterion("ZDT not between", value1, value2, "zdt");
            return (Criteria) this;
        }

        public Criteria andTfhIsNull() {
            addCriterion("TFH is null");
            return (Criteria) this;
        }

        public Criteria andTfhIsNotNull() {
            addCriterion("TFH is not null");
            return (Criteria) this;
        }

        public Criteria andTfhEqualTo(String value) {
            addCriterion("TFH =", value, "tfh");
            return (Criteria) this;
        }

        public Criteria andTfhNotEqualTo(String value) {
            addCriterion("TFH <>", value, "tfh");
            return (Criteria) this;
        }

        public Criteria andTfhGreaterThan(String value) {
            addCriterion("TFH >", value, "tfh");
            return (Criteria) this;
        }

        public Criteria andTfhGreaterThanOrEqualTo(String value) {
            addCriterion("TFH >=", value, "tfh");
            return (Criteria) this;
        }

        public Criteria andTfhLessThan(String value) {
            addCriterion("TFH <", value, "tfh");
            return (Criteria) this;
        }

        public Criteria andTfhLessThanOrEqualTo(String value) {
            addCriterion("TFH <=", value, "tfh");
            return (Criteria) this;
        }

        public Criteria andTfhIn(List<String> values) {
            addCriterion("TFH in", values, "tfh");
            return (Criteria) this;
        }

        public Criteria andTfhNotIn(List<String> values) {
            addCriterion("TFH not in", values, "tfh");
            return (Criteria) this;
        }

        public Criteria andTfhBetween(String value1, String value2) {
            addCriterion("TFH between", value1, value2, "tfh");
            return (Criteria) this;
        }

        public Criteria andTfhNotBetween(String value1, String value2) {
            addCriterion("TFH not between", value1, value2, "tfh");
            return (Criteria) this;
        }

        public Criteria andDjhIsNull() {
            addCriterion("DJH is null");
            return (Criteria) this;
        }

        public Criteria andDjhIsNotNull() {
            addCriterion("DJH is not null");
            return (Criteria) this;
        }

        public Criteria andDjhEqualTo(String value) {
            addCriterion("DJH =", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhNotEqualTo(String value) {
            addCriterion("DJH <>", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhGreaterThan(String value) {
            addCriterion("DJH >", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhGreaterThanOrEqualTo(String value) {
            addCriterion("DJH >=", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhLessThan(String value) {
            addCriterion("DJH <", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhLessThanOrEqualTo(String value) {
            addCriterion("DJH <=", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhIn(List<String> values) {
            addCriterion("DJH in", values, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhNotIn(List<String> values) {
            addCriterion("DJH not in", values, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhBetween(String value1, String value2) {
            addCriterion("DJH between", value1, value2, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhNotBetween(String value1, String value2) {
            addCriterion("DJH not between", value1, value2, "djh");
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

        public Criteria andZtIsNull() {
            addCriterion("ZT is null");
            return (Criteria) this;
        }

        public Criteria andZtIsNotNull() {
            addCriterion("ZT is not null");
            return (Criteria) this;
        }

        public Criteria andZtEqualTo(String value) {
            addCriterion("ZT =", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotEqualTo(String value) {
            addCriterion("ZT <>", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThan(String value) {
            addCriterion("ZT >", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThanOrEqualTo(String value) {
            addCriterion("ZT >=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThan(String value) {
            addCriterion("ZT <", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThanOrEqualTo(String value) {
            addCriterion("ZT <=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtIn(List<String> values) {
            addCriterion("ZT in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotIn(List<String> values) {
            addCriterion("ZT not in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtBetween(String value1, String value2) {
            addCriterion("ZT between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotBetween(String value1, String value2) {
            addCriterion("ZT not between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andCqztIsNull() {
            addCriterion("CQZT is null");
            return (Criteria) this;
        }

        public Criteria andCqztIsNotNull() {
            addCriterion("CQZT is not null");
            return (Criteria) this;
        }

        public Criteria andCqztEqualTo(String value) {
            addCriterion("CQZT =", value, "cqzt");
            return (Criteria) this;
        }

        public Criteria andCqztNotEqualTo(String value) {
            addCriterion("CQZT <>", value, "cqzt");
            return (Criteria) this;
        }

        public Criteria andCqztGreaterThan(String value) {
            addCriterion("CQZT >", value, "cqzt");
            return (Criteria) this;
        }

        public Criteria andCqztGreaterThanOrEqualTo(String value) {
            addCriterion("CQZT >=", value, "cqzt");
            return (Criteria) this;
        }

        public Criteria andCqztLessThan(String value) {
            addCriterion("CQZT <", value, "cqzt");
            return (Criteria) this;
        }

        public Criteria andCqztLessThanOrEqualTo(String value) {
            addCriterion("CQZT <=", value, "cqzt");
            return (Criteria) this;
        }

        public Criteria andCqztIn(List<String> values) {
            addCriterion("CQZT in", values, "cqzt");
            return (Criteria) this;
        }

        public Criteria andCqztNotIn(List<String> values) {
            addCriterion("CQZT not in", values, "cqzt");
            return (Criteria) this;
        }

        public Criteria andCqztBetween(String value1, String value2) {
            addCriterion("CQZT between", value1, value2, "cqzt");
            return (Criteria) this;
        }

        public Criteria andCqztNotBetween(String value1, String value2) {
            addCriterion("CQZT not between", value1, value2, "cqzt");
            return (Criteria) this;
        }

        public Criteria andGmjjhyfldmIsNull() {
            addCriterion("GMJJHYFLDM is null");
            return (Criteria) this;
        }

        public Criteria andGmjjhyfldmIsNotNull() {
            addCriterion("GMJJHYFLDM is not null");
            return (Criteria) this;
        }

        public Criteria andGmjjhyfldmEqualTo(String value) {
            addCriterion("GMJJHYFLDM =", value, "gmjjhyfldm");
            return (Criteria) this;
        }

        public Criteria andGmjjhyfldmNotEqualTo(String value) {
            addCriterion("GMJJHYFLDM <>", value, "gmjjhyfldm");
            return (Criteria) this;
        }

        public Criteria andGmjjhyfldmGreaterThan(String value) {
            addCriterion("GMJJHYFLDM >", value, "gmjjhyfldm");
            return (Criteria) this;
        }

        public Criteria andGmjjhyfldmGreaterThanOrEqualTo(String value) {
            addCriterion("GMJJHYFLDM >=", value, "gmjjhyfldm");
            return (Criteria) this;
        }

        public Criteria andGmjjhyfldmLessThan(String value) {
            addCriterion("GMJJHYFLDM <", value, "gmjjhyfldm");
            return (Criteria) this;
        }

        public Criteria andGmjjhyfldmLessThanOrEqualTo(String value) {
            addCriterion("GMJJHYFLDM <=", value, "gmjjhyfldm");
            return (Criteria) this;
        }

        public Criteria andGmjjhyfldmIn(List<String> values) {
            addCriterion("GMJJHYFLDM in", values, "gmjjhyfldm");
            return (Criteria) this;
        }

        public Criteria andGmjjhyfldmNotIn(List<String> values) {
            addCriterion("GMJJHYFLDM not in", values, "gmjjhyfldm");
            return (Criteria) this;
        }

        public Criteria andGmjjhyfldmBetween(String value1, String value2) {
            addCriterion("GMJJHYFLDM between", value1, value2, "gmjjhyfldm");
            return (Criteria) this;
        }

        public Criteria andGmjjhyfldmNotBetween(String value1, String value2) {
            addCriterion("GMJJHYFLDM not between", value1, value2, "gmjjhyfldm");
            return (Criteria) this;
        }

        public Criteria andTdqslyzmclIsNull() {
            addCriterion("TDQSLYZMCL is null");
            return (Criteria) this;
        }

        public Criteria andTdqslyzmclIsNotNull() {
            addCriterion("TDQSLYZMCL is not null");
            return (Criteria) this;
        }

        public Criteria andTdqslyzmclEqualTo(String value) {
            addCriterion("TDQSLYZMCL =", value, "tdqslyzmcl");
            return (Criteria) this;
        }

        public Criteria andTdqslyzmclNotEqualTo(String value) {
            addCriterion("TDQSLYZMCL <>", value, "tdqslyzmcl");
            return (Criteria) this;
        }

        public Criteria andTdqslyzmclGreaterThan(String value) {
            addCriterion("TDQSLYZMCL >", value, "tdqslyzmcl");
            return (Criteria) this;
        }

        public Criteria andTdqslyzmclGreaterThanOrEqualTo(String value) {
            addCriterion("TDQSLYZMCL >=", value, "tdqslyzmcl");
            return (Criteria) this;
        }

        public Criteria andTdqslyzmclLessThan(String value) {
            addCriterion("TDQSLYZMCL <", value, "tdqslyzmcl");
            return (Criteria) this;
        }

        public Criteria andTdqslyzmclLessThanOrEqualTo(String value) {
            addCriterion("TDQSLYZMCL <=", value, "tdqslyzmcl");
            return (Criteria) this;
        }

        public Criteria andTdqslyzmclIn(List<String> values) {
            addCriterion("TDQSLYZMCL in", values, "tdqslyzmcl");
            return (Criteria) this;
        }

        public Criteria andTdqslyzmclNotIn(List<String> values) {
            addCriterion("TDQSLYZMCL not in", values, "tdqslyzmcl");
            return (Criteria) this;
        }

        public Criteria andTdqslyzmclBetween(String value1, String value2) {
            addCriterion("TDQSLYZMCL between", value1, value2, "tdqslyzmcl");
            return (Criteria) this;
        }

        public Criteria andTdqslyzmclNotBetween(String value1, String value2) {
            addCriterion("TDQSLYZMCL not between", value1, value2, "tdqslyzmcl");
            return (Criteria) this;
        }

        public Criteria andZhIsNull() {
            addCriterion("ZH is null");
            return (Criteria) this;
        }

        public Criteria andZhIsNotNull() {
            addCriterion("ZH is not null");
            return (Criteria) this;
        }

        public Criteria andZhEqualTo(String value) {
            addCriterion("ZH =", value, "zh");
            return (Criteria) this;
        }

        public Criteria andZhNotEqualTo(String value) {
            addCriterion("ZH <>", value, "zh");
            return (Criteria) this;
        }

        public Criteria andZhGreaterThan(String value) {
            addCriterion("ZH >", value, "zh");
            return (Criteria) this;
        }

        public Criteria andZhGreaterThanOrEqualTo(String value) {
            addCriterion("ZH >=", value, "zh");
            return (Criteria) this;
        }

        public Criteria andZhLessThan(String value) {
            addCriterion("ZH <", value, "zh");
            return (Criteria) this;
        }

        public Criteria andZhLessThanOrEqualTo(String value) {
            addCriterion("ZH <=", value, "zh");
            return (Criteria) this;
        }

        public Criteria andZhIn(List<String> values) {
            addCriterion("ZH in", values, "zh");
            return (Criteria) this;
        }

        public Criteria andZhNotIn(List<String> values) {
            addCriterion("ZH not in", values, "zh");
            return (Criteria) this;
        }

        public Criteria andZhBetween(String value1, String value2) {
            addCriterion("ZH between", value1, value2, "zh");
            return (Criteria) this;
        }

        public Criteria andZhNotBetween(String value1, String value2) {
            addCriterion("ZH not between", value1, value2, "zh");
            return (Criteria) this;
        }

        public Criteria andZmIsNull() {
            addCriterion("ZM is null");
            return (Criteria) this;
        }

        public Criteria andZmIsNotNull() {
            addCriterion("ZM is not null");
            return (Criteria) this;
        }

        public Criteria andZmEqualTo(String value) {
            addCriterion("ZM =", value, "zm");
            return (Criteria) this;
        }

        public Criteria andZmNotEqualTo(String value) {
            addCriterion("ZM <>", value, "zm");
            return (Criteria) this;
        }

        public Criteria andZmGreaterThan(String value) {
            addCriterion("ZM >", value, "zm");
            return (Criteria) this;
        }

        public Criteria andZmGreaterThanOrEqualTo(String value) {
            addCriterion("ZM >=", value, "zm");
            return (Criteria) this;
        }

        public Criteria andZmLessThan(String value) {
            addCriterion("ZM <", value, "zm");
            return (Criteria) this;
        }

        public Criteria andZmLessThanOrEqualTo(String value) {
            addCriterion("ZM <=", value, "zm");
            return (Criteria) this;
        }

        public Criteria andZmIn(List<String> values) {
            addCriterion("ZM in", values, "zm");
            return (Criteria) this;
        }

        public Criteria andZmNotIn(List<String> values) {
            addCriterion("ZM not in", values, "zm");
            return (Criteria) this;
        }

        public Criteria andZmBetween(String value1, String value2) {
            addCriterion("ZM between", value1, value2, "zm");
            return (Criteria) this;
        }

        public Criteria andZmNotBetween(String value1, String value2) {
            addCriterion("ZM not between", value1, value2, "zm");
            return (Criteria) this;
        }

        public Criteria andCljsIsNull() {
            addCriterion("CLJS is null");
            return (Criteria) this;
        }

        public Criteria andCljsIsNotNull() {
            addCriterion("CLJS is not null");
            return (Criteria) this;
        }

        public Criteria andCljsEqualTo(String value) {
            addCriterion("CLJS =", value, "cljs");
            return (Criteria) this;
        }

        public Criteria andCljsNotEqualTo(String value) {
            addCriterion("CLJS <>", value, "cljs");
            return (Criteria) this;
        }

        public Criteria andCljsGreaterThan(String value) {
            addCriterion("CLJS >", value, "cljs");
            return (Criteria) this;
        }

        public Criteria andCljsGreaterThanOrEqualTo(String value) {
            addCriterion("CLJS >=", value, "cljs");
            return (Criteria) this;
        }

        public Criteria andCljsLessThan(String value) {
            addCriterion("CLJS <", value, "cljs");
            return (Criteria) this;
        }

        public Criteria andCljsLessThanOrEqualTo(String value) {
            addCriterion("CLJS <=", value, "cljs");
            return (Criteria) this;
        }

        public Criteria andCljsIn(List<String> values) {
            addCriterion("CLJS in", values, "cljs");
            return (Criteria) this;
        }

        public Criteria andCljsNotIn(List<String> values) {
            addCriterion("CLJS not in", values, "cljs");
            return (Criteria) this;
        }

        public Criteria andCljsBetween(String value1, String value2) {
            addCriterion("CLJS between", value1, value2, "cljs");
            return (Criteria) this;
        }

        public Criteria andCljsNotBetween(String value1, String value2) {
            addCriterion("CLJS not between", value1, value2, "cljs");
            return (Criteria) this;
        }

        public Criteria andShyjIsNull() {
            addCriterion("SHYJ is null");
            return (Criteria) this;
        }

        public Criteria andShyjIsNotNull() {
            addCriterion("SHYJ is not null");
            return (Criteria) this;
        }

        public Criteria andShyjEqualTo(String value) {
            addCriterion("SHYJ =", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjNotEqualTo(String value) {
            addCriterion("SHYJ <>", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjGreaterThan(String value) {
            addCriterion("SHYJ >", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjGreaterThanOrEqualTo(String value) {
            addCriterion("SHYJ >=", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjLessThan(String value) {
            addCriterion("SHYJ <", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjLessThanOrEqualTo(String value) {
            addCriterion("SHYJ <=", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjIn(List<String> values) {
            addCriterion("SHYJ in", values, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjNotIn(List<String> values) {
            addCriterion("SHYJ not in", values, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjBetween(String value1, String value2) {
            addCriterion("SHYJ between", value1, value2, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjNotBetween(String value1, String value2) {
            addCriterion("SHYJ not between", value1, value2, "shyj");
            return (Criteria) this;
        }

        public Criteria andShrIsNull() {
            addCriterion("SHR is null");
            return (Criteria) this;
        }

        public Criteria andShrIsNotNull() {
            addCriterion("SHR is not null");
            return (Criteria) this;
        }

        public Criteria andShrEqualTo(String value) {
            addCriterion("SHR =", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrNotEqualTo(String value) {
            addCriterion("SHR <>", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrGreaterThan(String value) {
            addCriterion("SHR >", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrGreaterThanOrEqualTo(String value) {
            addCriterion("SHR >=", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrLessThan(String value) {
            addCriterion("SHR <", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrLessThanOrEqualTo(String value) {
            addCriterion("SHR <=", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrIn(List<String> values) {
            addCriterion("SHR in", values, "shr");
            return (Criteria) this;
        }

        public Criteria andShrNotIn(List<String> values) {
            addCriterion("SHR not in", values, "shr");
            return (Criteria) this;
        }

        public Criteria andShrBetween(String value1, String value2) {
            addCriterion("SHR between", value1, value2, "shr");
            return (Criteria) this;
        }

        public Criteria andShrNotBetween(String value1, String value2) {
            addCriterion("SHR not between", value1, value2, "shr");
            return (Criteria) this;
        }

        public Criteria andShrqIsNull() {
            addCriterion("SHRQ is null");
            return (Criteria) this;
        }

        public Criteria andShrqIsNotNull() {
            addCriterion("SHRQ is not null");
            return (Criteria) this;
        }

        public Criteria andShrqEqualTo(Date value) {
            addCriterion("SHRQ =", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqNotEqualTo(Date value) {
            addCriterion("SHRQ <>", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqGreaterThan(Date value) {
            addCriterion("SHRQ >", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqGreaterThanOrEqualTo(Date value) {
            addCriterion("SHRQ >=", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqLessThan(Date value) {
            addCriterion("SHRQ <", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqLessThanOrEqualTo(Date value) {
            addCriterion("SHRQ <=", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqIn(List<Date> values) {
            addCriterion("SHRQ in", values, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqNotIn(List<Date> values) {
            addCriterion("SHRQ not in", values, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqBetween(Date value1, Date value2) {
            addCriterion("SHRQ between", value1, value2, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqNotBetween(Date value1, Date value2) {
            addCriterion("SHRQ not between", value1, value2, "shrq");
            return (Criteria) this;
        }

        public Criteria andJzzdmjIsNull() {
            addCriterion("JZZDMJ is null");
            return (Criteria) this;
        }

        public Criteria andJzzdmjIsNotNull() {
            addCriterion("JZZDMJ is not null");
            return (Criteria) this;
        }

        public Criteria andJzzdmjEqualTo(BigDecimal value) {
            addCriterion("JZZDMJ =", value, "jzzdmj");
            return (Criteria) this;
        }

        public Criteria andJzzdmjNotEqualTo(BigDecimal value) {
            addCriterion("JZZDMJ <>", value, "jzzdmj");
            return (Criteria) this;
        }

        public Criteria andJzzdmjGreaterThan(BigDecimal value) {
            addCriterion("JZZDMJ >", value, "jzzdmj");
            return (Criteria) this;
        }

        public Criteria andJzzdmjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JZZDMJ >=", value, "jzzdmj");
            return (Criteria) this;
        }

        public Criteria andJzzdmjLessThan(BigDecimal value) {
            addCriterion("JZZDMJ <", value, "jzzdmj");
            return (Criteria) this;
        }

        public Criteria andJzzdmjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JZZDMJ <=", value, "jzzdmj");
            return (Criteria) this;
        }

        public Criteria andJzzdmjIn(List<BigDecimal> values) {
            addCriterion("JZZDMJ in", values, "jzzdmj");
            return (Criteria) this;
        }

        public Criteria andJzzdmjNotIn(List<BigDecimal> values) {
            addCriterion("JZZDMJ not in", values, "jzzdmj");
            return (Criteria) this;
        }

        public Criteria andJzzdmjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JZZDMJ between", value1, value2, "jzzdmj");
            return (Criteria) this;
        }

        public Criteria andJzzdmjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JZZDMJ not between", value1, value2, "jzzdmj");
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

        public Criteria andSyqlxIsNull() {
            addCriterion("SYQLX is null");
            return (Criteria) this;
        }

        public Criteria andSyqlxIsNotNull() {
            addCriterion("SYQLX is not null");
            return (Criteria) this;
        }

        public Criteria andSyqlxEqualTo(String value) {
            addCriterion("SYQLX =", value, "syqlx");
            return (Criteria) this;
        }

        public Criteria andSyqlxNotEqualTo(String value) {
            addCriterion("SYQLX <>", value, "syqlx");
            return (Criteria) this;
        }

        public Criteria andSyqlxGreaterThan(String value) {
            addCriterion("SYQLX >", value, "syqlx");
            return (Criteria) this;
        }

        public Criteria andSyqlxGreaterThanOrEqualTo(String value) {
            addCriterion("SYQLX >=", value, "syqlx");
            return (Criteria) this;
        }

        public Criteria andSyqlxLessThan(String value) {
            addCriterion("SYQLX <", value, "syqlx");
            return (Criteria) this;
        }

        public Criteria andSyqlxLessThanOrEqualTo(String value) {
            addCriterion("SYQLX <=", value, "syqlx");
            return (Criteria) this;
        }

        public Criteria andSyqlxIn(List<String> values) {
            addCriterion("SYQLX in", values, "syqlx");
            return (Criteria) this;
        }

        public Criteria andSyqlxNotIn(List<String> values) {
            addCriterion("SYQLX not in", values, "syqlx");
            return (Criteria) this;
        }

        public Criteria andSyqlxBetween(String value1, String value2) {
            addCriterion("SYQLX between", value1, value2, "syqlx");
            return (Criteria) this;
        }

        public Criteria andSyqlxNotBetween(String value1, String value2) {
            addCriterion("SYQLX not between", value1, value2, "syqlx");
            return (Criteria) this;
        }

        public Criteria andPzytIsNull() {
            addCriterion("PZYT is null");
            return (Criteria) this;
        }

        public Criteria andPzytIsNotNull() {
            addCriterion("PZYT is not null");
            return (Criteria) this;
        }

        public Criteria andPzytEqualTo(String value) {
            addCriterion("PZYT =", value, "pzyt");
            return (Criteria) this;
        }

        public Criteria andPzytNotEqualTo(String value) {
            addCriterion("PZYT <>", value, "pzyt");
            return (Criteria) this;
        }

        public Criteria andPzytGreaterThan(String value) {
            addCriterion("PZYT >", value, "pzyt");
            return (Criteria) this;
        }

        public Criteria andPzytGreaterThanOrEqualTo(String value) {
            addCriterion("PZYT >=", value, "pzyt");
            return (Criteria) this;
        }

        public Criteria andPzytLessThan(String value) {
            addCriterion("PZYT <", value, "pzyt");
            return (Criteria) this;
        }

        public Criteria andPzytLessThanOrEqualTo(String value) {
            addCriterion("PZYT <=", value, "pzyt");
            return (Criteria) this;
        }

        public Criteria andPzytIn(List<String> values) {
            addCriterion("PZYT in", values, "pzyt");
            return (Criteria) this;
        }

        public Criteria andPzytNotIn(List<String> values) {
            addCriterion("PZYT not in", values, "pzyt");
            return (Criteria) this;
        }

        public Criteria andPzytBetween(String value1, String value2) {
            addCriterion("PZYT between", value1, value2, "pzyt");
            return (Criteria) this;
        }

        public Criteria andPzytNotBetween(String value1, String value2) {
            addCriterion("PZYT not between", value1, value2, "pzyt");
            return (Criteria) this;
        }

        public Criteria andPzmjIsNull() {
            addCriterion("PZMJ is null");
            return (Criteria) this;
        }

        public Criteria andPzmjIsNotNull() {
            addCriterion("PZMJ is not null");
            return (Criteria) this;
        }

        public Criteria andPzmjEqualTo(BigDecimal value) {
            addCriterion("PZMJ =", value, "pzmj");
            return (Criteria) this;
        }

        public Criteria andPzmjNotEqualTo(BigDecimal value) {
            addCriterion("PZMJ <>", value, "pzmj");
            return (Criteria) this;
        }

        public Criteria andPzmjGreaterThan(BigDecimal value) {
            addCriterion("PZMJ >", value, "pzmj");
            return (Criteria) this;
        }

        public Criteria andPzmjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PZMJ >=", value, "pzmj");
            return (Criteria) this;
        }

        public Criteria andPzmjLessThan(BigDecimal value) {
            addCriterion("PZMJ <", value, "pzmj");
            return (Criteria) this;
        }

        public Criteria andPzmjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PZMJ <=", value, "pzmj");
            return (Criteria) this;
        }

        public Criteria andPzmjIn(List<BigDecimal> values) {
            addCriterion("PZMJ in", values, "pzmj");
            return (Criteria) this;
        }

        public Criteria andPzmjNotIn(List<BigDecimal> values) {
            addCriterion("PZMJ not in", values, "pzmj");
            return (Criteria) this;
        }

        public Criteria andPzmjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PZMJ between", value1, value2, "pzmj");
            return (Criteria) this;
        }

        public Criteria andPzmjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PZMJ not between", value1, value2, "pzmj");
            return (Criteria) this;
        }

        public Criteria andJzxzxsmIsNull() {
            addCriterion("JZXZXSM is null");
            return (Criteria) this;
        }

        public Criteria andJzxzxsmIsNotNull() {
            addCriterion("JZXZXSM is not null");
            return (Criteria) this;
        }

        public Criteria andJzxzxsmEqualTo(String value) {
            addCriterion("JZXZXSM =", value, "jzxzxsm");
            return (Criteria) this;
        }

        public Criteria andJzxzxsmNotEqualTo(String value) {
            addCriterion("JZXZXSM <>", value, "jzxzxsm");
            return (Criteria) this;
        }

        public Criteria andJzxzxsmGreaterThan(String value) {
            addCriterion("JZXZXSM >", value, "jzxzxsm");
            return (Criteria) this;
        }

        public Criteria andJzxzxsmGreaterThanOrEqualTo(String value) {
            addCriterion("JZXZXSM >=", value, "jzxzxsm");
            return (Criteria) this;
        }

        public Criteria andJzxzxsmLessThan(String value) {
            addCriterion("JZXZXSM <", value, "jzxzxsm");
            return (Criteria) this;
        }

        public Criteria andJzxzxsmLessThanOrEqualTo(String value) {
            addCriterion("JZXZXSM <=", value, "jzxzxsm");
            return (Criteria) this;
        }

        public Criteria andJzxzxsmIn(List<String> values) {
            addCriterion("JZXZXSM in", values, "jzxzxsm");
            return (Criteria) this;
        }

        public Criteria andJzxzxsmNotIn(List<String> values) {
            addCriterion("JZXZXSM not in", values, "jzxzxsm");
            return (Criteria) this;
        }

        public Criteria andJzxzxsmBetween(String value1, String value2) {
            addCriterion("JZXZXSM between", value1, value2, "jzxzxsm");
            return (Criteria) this;
        }

        public Criteria andJzxzxsmNotBetween(String value1, String value2) {
            addCriterion("JZXZXSM not between", value1, value2, "jzxzxsm");
            return (Criteria) this;
        }

        public Criteria andDcjsIsNull() {
            addCriterion("DCJS is null");
            return (Criteria) this;
        }

        public Criteria andDcjsIsNotNull() {
            addCriterion("DCJS is not null");
            return (Criteria) this;
        }

        public Criteria andDcjsEqualTo(String value) {
            addCriterion("DCJS =", value, "dcjs");
            return (Criteria) this;
        }

        public Criteria andDcjsNotEqualTo(String value) {
            addCriterion("DCJS <>", value, "dcjs");
            return (Criteria) this;
        }

        public Criteria andDcjsGreaterThan(String value) {
            addCriterion("DCJS >", value, "dcjs");
            return (Criteria) this;
        }

        public Criteria andDcjsGreaterThanOrEqualTo(String value) {
            addCriterion("DCJS >=", value, "dcjs");
            return (Criteria) this;
        }

        public Criteria andDcjsLessThan(String value) {
            addCriterion("DCJS <", value, "dcjs");
            return (Criteria) this;
        }

        public Criteria andDcjsLessThanOrEqualTo(String value) {
            addCriterion("DCJS <=", value, "dcjs");
            return (Criteria) this;
        }

        public Criteria andDcjsIn(List<String> values) {
            addCriterion("DCJS in", values, "dcjs");
            return (Criteria) this;
        }

        public Criteria andDcjsNotIn(List<String> values) {
            addCriterion("DCJS not in", values, "dcjs");
            return (Criteria) this;
        }

        public Criteria andDcjsBetween(String value1, String value2) {
            addCriterion("DCJS between", value1, value2, "dcjs");
            return (Criteria) this;
        }

        public Criteria andDcjsNotBetween(String value1, String value2) {
            addCriterion("DCJS not between", value1, value2, "dcjs");
            return (Criteria) this;
        }

        public Criteria andDcrIsNull() {
            addCriterion("DCR is null");
            return (Criteria) this;
        }

        public Criteria andDcrIsNotNull() {
            addCriterion("DCR is not null");
            return (Criteria) this;
        }

        public Criteria andDcrEqualTo(String value) {
            addCriterion("DCR =", value, "dcr");
            return (Criteria) this;
        }

        public Criteria andDcrNotEqualTo(String value) {
            addCriterion("DCR <>", value, "dcr");
            return (Criteria) this;
        }

        public Criteria andDcrGreaterThan(String value) {
            addCriterion("DCR >", value, "dcr");
            return (Criteria) this;
        }

        public Criteria andDcrGreaterThanOrEqualTo(String value) {
            addCriterion("DCR >=", value, "dcr");
            return (Criteria) this;
        }

        public Criteria andDcrLessThan(String value) {
            addCriterion("DCR <", value, "dcr");
            return (Criteria) this;
        }

        public Criteria andDcrLessThanOrEqualTo(String value) {
            addCriterion("DCR <=", value, "dcr");
            return (Criteria) this;
        }

        public Criteria andDcrIn(List<String> values) {
            addCriterion("DCR in", values, "dcr");
            return (Criteria) this;
        }

        public Criteria andDcrNotIn(List<String> values) {
            addCriterion("DCR not in", values, "dcr");
            return (Criteria) this;
        }

        public Criteria andDcrBetween(String value1, String value2) {
            addCriterion("DCR between", value1, value2, "dcr");
            return (Criteria) this;
        }

        public Criteria andDcrNotBetween(String value1, String value2) {
            addCriterion("DCR not between", value1, value2, "dcr");
            return (Criteria) this;
        }

        public Criteria andDcrqIsNull() {
            addCriterion("DCRQ is null");
            return (Criteria) this;
        }

        public Criteria andDcrqIsNotNull() {
            addCriterion("DCRQ is not null");
            return (Criteria) this;
        }

        public Criteria andDcrqEqualTo(Date value) {
            addCriterion("DCRQ =", value, "dcrq");
            return (Criteria) this;
        }

        public Criteria andDcrqNotEqualTo(Date value) {
            addCriterion("DCRQ <>", value, "dcrq");
            return (Criteria) this;
        }

        public Criteria andDcrqGreaterThan(Date value) {
            addCriterion("DCRQ >", value, "dcrq");
            return (Criteria) this;
        }

        public Criteria andDcrqGreaterThanOrEqualTo(Date value) {
            addCriterion("DCRQ >=", value, "dcrq");
            return (Criteria) this;
        }

        public Criteria andDcrqLessThan(Date value) {
            addCriterion("DCRQ <", value, "dcrq");
            return (Criteria) this;
        }

        public Criteria andDcrqLessThanOrEqualTo(Date value) {
            addCriterion("DCRQ <=", value, "dcrq");
            return (Criteria) this;
        }

        public Criteria andDcrqIn(List<Date> values) {
            addCriterion("DCRQ in", values, "dcrq");
            return (Criteria) this;
        }

        public Criteria andDcrqNotIn(List<Date> values) {
            addCriterion("DCRQ not in", values, "dcrq");
            return (Criteria) this;
        }

        public Criteria andDcrqBetween(Date value1, Date value2) {
            addCriterion("DCRQ between", value1, value2, "dcrq");
            return (Criteria) this;
        }

        public Criteria andDcrqNotBetween(Date value1, Date value2) {
            addCriterion("DCRQ not between", value1, value2, "dcrq");
            return (Criteria) this;
        }

        public Criteria andBlcIsNull() {
            addCriterion("BLC is null");
            return (Criteria) this;
        }

        public Criteria andBlcIsNotNull() {
            addCriterion("BLC is not null");
            return (Criteria) this;
        }

        public Criteria andBlcEqualTo(String value) {
            addCriterion("BLC =", value, "blc");
            return (Criteria) this;
        }

        public Criteria andBlcNotEqualTo(String value) {
            addCriterion("BLC <>", value, "blc");
            return (Criteria) this;
        }

        public Criteria andBlcGreaterThan(String value) {
            addCriterion("BLC >", value, "blc");
            return (Criteria) this;
        }

        public Criteria andBlcGreaterThanOrEqualTo(String value) {
            addCriterion("BLC >=", value, "blc");
            return (Criteria) this;
        }

        public Criteria andBlcLessThan(String value) {
            addCriterion("BLC <", value, "blc");
            return (Criteria) this;
        }

        public Criteria andBlcLessThanOrEqualTo(String value) {
            addCriterion("BLC <=", value, "blc");
            return (Criteria) this;
        }

        public Criteria andBlcIn(List<String> values) {
            addCriterion("BLC in", values, "blc");
            return (Criteria) this;
        }

        public Criteria andBlcNotIn(List<String> values) {
            addCriterion("BLC not in", values, "blc");
            return (Criteria) this;
        }

        public Criteria andBlcBetween(String value1, String value2) {
            addCriterion("BLC between", value1, value2, "blc");
            return (Criteria) this;
        }

        public Criteria andBlcNotBetween(String value1, String value2) {
            addCriterion("BLC not between", value1, value2, "blc");
            return (Criteria) this;
        }

        public Criteria andClrIsNull() {
            addCriterion("CLR is null");
            return (Criteria) this;
        }

        public Criteria andClrIsNotNull() {
            addCriterion("CLR is not null");
            return (Criteria) this;
        }

        public Criteria andClrEqualTo(String value) {
            addCriterion("CLR =", value, "clr");
            return (Criteria) this;
        }

        public Criteria andClrNotEqualTo(String value) {
            addCriterion("CLR <>", value, "clr");
            return (Criteria) this;
        }

        public Criteria andClrGreaterThan(String value) {
            addCriterion("CLR >", value, "clr");
            return (Criteria) this;
        }

        public Criteria andClrGreaterThanOrEqualTo(String value) {
            addCriterion("CLR >=", value, "clr");
            return (Criteria) this;
        }

        public Criteria andClrLessThan(String value) {
            addCriterion("CLR <", value, "clr");
            return (Criteria) this;
        }

        public Criteria andClrLessThanOrEqualTo(String value) {
            addCriterion("CLR <=", value, "clr");
            return (Criteria) this;
        }

        public Criteria andClrIn(List<String> values) {
            addCriterion("CLR in", values, "clr");
            return (Criteria) this;
        }

        public Criteria andClrNotIn(List<String> values) {
            addCriterion("CLR not in", values, "clr");
            return (Criteria) this;
        }

        public Criteria andClrBetween(String value1, String value2) {
            addCriterion("CLR between", value1, value2, "clr");
            return (Criteria) this;
        }

        public Criteria andClrNotBetween(String value1, String value2) {
            addCriterion("CLR not between", value1, value2, "clr");
            return (Criteria) this;
        }

        public Criteria andClrqIsNull() {
            addCriterion("CLRQ is null");
            return (Criteria) this;
        }

        public Criteria andClrqIsNotNull() {
            addCriterion("CLRQ is not null");
            return (Criteria) this;
        }

        public Criteria andClrqEqualTo(Date value) {
            addCriterion("CLRQ =", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqNotEqualTo(Date value) {
            addCriterion("CLRQ <>", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqGreaterThan(Date value) {
            addCriterion("CLRQ >", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqGreaterThanOrEqualTo(Date value) {
            addCriterion("CLRQ >=", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqLessThan(Date value) {
            addCriterion("CLRQ <", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqLessThanOrEqualTo(Date value) {
            addCriterion("CLRQ <=", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqIn(List<Date> values) {
            addCriterion("CLRQ in", values, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqNotIn(List<Date> values) {
            addCriterion("CLRQ not in", values, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqBetween(Date value1, Date value2) {
            addCriterion("CLRQ between", value1, value2, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqNotBetween(Date value1, Date value2) {
            addCriterion("CLRQ not between", value1, value2, "clrq");
            return (Criteria) this;
        }

        public Criteria andJzdwsmIsNull() {
            addCriterion("JZDWSM is null");
            return (Criteria) this;
        }

        public Criteria andJzdwsmIsNotNull() {
            addCriterion("JZDWSM is not null");
            return (Criteria) this;
        }

        public Criteria andJzdwsmEqualTo(String value) {
            addCriterion("JZDWSM =", value, "jzdwsm");
            return (Criteria) this;
        }

        public Criteria andJzdwsmNotEqualTo(String value) {
            addCriterion("JZDWSM <>", value, "jzdwsm");
            return (Criteria) this;
        }

        public Criteria andJzdwsmGreaterThan(String value) {
            addCriterion("JZDWSM >", value, "jzdwsm");
            return (Criteria) this;
        }

        public Criteria andJzdwsmGreaterThanOrEqualTo(String value) {
            addCriterion("JZDWSM >=", value, "jzdwsm");
            return (Criteria) this;
        }

        public Criteria andJzdwsmLessThan(String value) {
            addCriterion("JZDWSM <", value, "jzdwsm");
            return (Criteria) this;
        }

        public Criteria andJzdwsmLessThanOrEqualTo(String value) {
            addCriterion("JZDWSM <=", value, "jzdwsm");
            return (Criteria) this;
        }

        public Criteria andJzdwsmIn(List<String> values) {
            addCriterion("JZDWSM in", values, "jzdwsm");
            return (Criteria) this;
        }

        public Criteria andJzdwsmNotIn(List<String> values) {
            addCriterion("JZDWSM not in", values, "jzdwsm");
            return (Criteria) this;
        }

        public Criteria andJzdwsmBetween(String value1, String value2) {
            addCriterion("JZDWSM between", value1, value2, "jzdwsm");
            return (Criteria) this;
        }

        public Criteria andJzdwsmNotBetween(String value1, String value2) {
            addCriterion("JZDWSM not between", value1, value2, "jzdwsm");
            return (Criteria) this;
        }

        public Criteria andYbzddmIsNull() {
            addCriterion("YBZDDM is null");
            return (Criteria) this;
        }

        public Criteria andYbzddmIsNotNull() {
            addCriterion("YBZDDM is not null");
            return (Criteria) this;
        }

        public Criteria andYbzddmEqualTo(String value) {
            addCriterion("YBZDDM =", value, "ybzddm");
            return (Criteria) this;
        }

        public Criteria andYbzddmNotEqualTo(String value) {
            addCriterion("YBZDDM <>", value, "ybzddm");
            return (Criteria) this;
        }

        public Criteria andYbzddmGreaterThan(String value) {
            addCriterion("YBZDDM >", value, "ybzddm");
            return (Criteria) this;
        }

        public Criteria andYbzddmGreaterThanOrEqualTo(String value) {
            addCriterion("YBZDDM >=", value, "ybzddm");
            return (Criteria) this;
        }

        public Criteria andYbzddmLessThan(String value) {
            addCriterion("YBZDDM <", value, "ybzddm");
            return (Criteria) this;
        }

        public Criteria andYbzddmLessThanOrEqualTo(String value) {
            addCriterion("YBZDDM <=", value, "ybzddm");
            return (Criteria) this;
        }

        public Criteria andYbzddmIn(List<String> values) {
            addCriterion("YBZDDM in", values, "ybzddm");
            return (Criteria) this;
        }

        public Criteria andYbzddmNotIn(List<String> values) {
            addCriterion("YBZDDM not in", values, "ybzddm");
            return (Criteria) this;
        }

        public Criteria andYbzddmBetween(String value1, String value2) {
            addCriterion("YBZDDM between", value1, value2, "ybzddm");
            return (Criteria) this;
        }

        public Criteria andYbzddmNotBetween(String value1, String value2) {
            addCriterion("YBZDDM not between", value1, value2, "ybzddm");
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

        public Criteria andDjqdmIsNull() {
            addCriterion("DJQDM is null");
            return (Criteria) this;
        }

        public Criteria andDjqdmIsNotNull() {
            addCriterion("DJQDM is not null");
            return (Criteria) this;
        }

        public Criteria andDjqdmEqualTo(String value) {
            addCriterion("DJQDM =", value, "djqdm");
            return (Criteria) this;
        }

        public Criteria andDjqdmNotEqualTo(String value) {
            addCriterion("DJQDM <>", value, "djqdm");
            return (Criteria) this;
        }

        public Criteria andDjqdmGreaterThan(String value) {
            addCriterion("DJQDM >", value, "djqdm");
            return (Criteria) this;
        }

        public Criteria andDjqdmGreaterThanOrEqualTo(String value) {
            addCriterion("DJQDM >=", value, "djqdm");
            return (Criteria) this;
        }

        public Criteria andDjqdmLessThan(String value) {
            addCriterion("DJQDM <", value, "djqdm");
            return (Criteria) this;
        }

        public Criteria andDjqdmLessThanOrEqualTo(String value) {
            addCriterion("DJQDM <=", value, "djqdm");
            return (Criteria) this;
        }

        public Criteria andDjqdmIn(List<String> values) {
            addCriterion("DJQDM in", values, "djqdm");
            return (Criteria) this;
        }

        public Criteria andDjqdmNotIn(List<String> values) {
            addCriterion("DJQDM not in", values, "djqdm");
            return (Criteria) this;
        }

        public Criteria andDjqdmBetween(String value1, String value2) {
            addCriterion("DJQDM between", value1, value2, "djqdm");
            return (Criteria) this;
        }

        public Criteria andDjqdmNotBetween(String value1, String value2) {
            addCriterion("DJQDM not between", value1, value2, "djqdm");
            return (Criteria) this;
        }

        public Criteria andDjzqdmIsNull() {
            addCriterion("DJZQDM is null");
            return (Criteria) this;
        }

        public Criteria andDjzqdmIsNotNull() {
            addCriterion("DJZQDM is not null");
            return (Criteria) this;
        }

        public Criteria andDjzqdmEqualTo(String value) {
            addCriterion("DJZQDM =", value, "djzqdm");
            return (Criteria) this;
        }

        public Criteria andDjzqdmNotEqualTo(String value) {
            addCriterion("DJZQDM <>", value, "djzqdm");
            return (Criteria) this;
        }

        public Criteria andDjzqdmGreaterThan(String value) {
            addCriterion("DJZQDM >", value, "djzqdm");
            return (Criteria) this;
        }

        public Criteria andDjzqdmGreaterThanOrEqualTo(String value) {
            addCriterion("DJZQDM >=", value, "djzqdm");
            return (Criteria) this;
        }

        public Criteria andDjzqdmLessThan(String value) {
            addCriterion("DJZQDM <", value, "djzqdm");
            return (Criteria) this;
        }

        public Criteria andDjzqdmLessThanOrEqualTo(String value) {
            addCriterion("DJZQDM <=", value, "djzqdm");
            return (Criteria) this;
        }

        public Criteria andDjzqdmIn(List<String> values) {
            addCriterion("DJZQDM in", values, "djzqdm");
            return (Criteria) this;
        }

        public Criteria andDjzqdmNotIn(List<String> values) {
            addCriterion("DJZQDM not in", values, "djzqdm");
            return (Criteria) this;
        }

        public Criteria andDjzqdmBetween(String value1, String value2) {
            addCriterion("DJZQDM between", value1, value2, "djzqdm");
            return (Criteria) this;
        }

        public Criteria andDjzqdmNotBetween(String value1, String value2) {
            addCriterion("DJZQDM not between", value1, value2, "djzqdm");
            return (Criteria) this;
        }

        public Criteria andQxmcIsNull() {
            addCriterion("QXMC is null");
            return (Criteria) this;
        }

        public Criteria andQxmcIsNotNull() {
            addCriterion("QXMC is not null");
            return (Criteria) this;
        }

        public Criteria andQxmcEqualTo(String value) {
            addCriterion("QXMC =", value, "qxmc");
            return (Criteria) this;
        }

        public Criteria andQxmcNotEqualTo(String value) {
            addCriterion("QXMC <>", value, "qxmc");
            return (Criteria) this;
        }

        public Criteria andQxmcGreaterThan(String value) {
            addCriterion("QXMC >", value, "qxmc");
            return (Criteria) this;
        }

        public Criteria andQxmcGreaterThanOrEqualTo(String value) {
            addCriterion("QXMC >=", value, "qxmc");
            return (Criteria) this;
        }

        public Criteria andQxmcLessThan(String value) {
            addCriterion("QXMC <", value, "qxmc");
            return (Criteria) this;
        }

        public Criteria andQxmcLessThanOrEqualTo(String value) {
            addCriterion("QXMC <=", value, "qxmc");
            return (Criteria) this;
        }

        public Criteria andQxmcIn(List<String> values) {
            addCriterion("QXMC in", values, "qxmc");
            return (Criteria) this;
        }

        public Criteria andQxmcNotIn(List<String> values) {
            addCriterion("QXMC not in", values, "qxmc");
            return (Criteria) this;
        }

        public Criteria andQxmcBetween(String value1, String value2) {
            addCriterion("QXMC between", value1, value2, "qxmc");
            return (Criteria) this;
        }

        public Criteria andQxmcNotBetween(String value1, String value2) {
            addCriterion("QXMC not between", value1, value2, "qxmc");
            return (Criteria) this;
        }

        public Criteria andDjqmcIsNull() {
            addCriterion("DJQMC is null");
            return (Criteria) this;
        }

        public Criteria andDjqmcIsNotNull() {
            addCriterion("DJQMC is not null");
            return (Criteria) this;
        }

        public Criteria andDjqmcEqualTo(String value) {
            addCriterion("DJQMC =", value, "djqmc");
            return (Criteria) this;
        }

        public Criteria andDjqmcNotEqualTo(String value) {
            addCriterion("DJQMC <>", value, "djqmc");
            return (Criteria) this;
        }

        public Criteria andDjqmcGreaterThan(String value) {
            addCriterion("DJQMC >", value, "djqmc");
            return (Criteria) this;
        }

        public Criteria andDjqmcGreaterThanOrEqualTo(String value) {
            addCriterion("DJQMC >=", value, "djqmc");
            return (Criteria) this;
        }

        public Criteria andDjqmcLessThan(String value) {
            addCriterion("DJQMC <", value, "djqmc");
            return (Criteria) this;
        }

        public Criteria andDjqmcLessThanOrEqualTo(String value) {
            addCriterion("DJQMC <=", value, "djqmc");
            return (Criteria) this;
        }

        public Criteria andDjqmcIn(List<String> values) {
            addCriterion("DJQMC in", values, "djqmc");
            return (Criteria) this;
        }

        public Criteria andDjqmcNotIn(List<String> values) {
            addCriterion("DJQMC not in", values, "djqmc");
            return (Criteria) this;
        }

        public Criteria andDjqmcBetween(String value1, String value2) {
            addCriterion("DJQMC between", value1, value2, "djqmc");
            return (Criteria) this;
        }

        public Criteria andDjqmcNotBetween(String value1, String value2) {
            addCriterion("DJQMC not between", value1, value2, "djqmc");
            return (Criteria) this;
        }

        public Criteria andDjzqmcIsNull() {
            addCriterion("DJZQMC is null");
            return (Criteria) this;
        }

        public Criteria andDjzqmcIsNotNull() {
            addCriterion("DJZQMC is not null");
            return (Criteria) this;
        }

        public Criteria andDjzqmcEqualTo(String value) {
            addCriterion("DJZQMC =", value, "djzqmc");
            return (Criteria) this;
        }

        public Criteria andDjzqmcNotEqualTo(String value) {
            addCriterion("DJZQMC <>", value, "djzqmc");
            return (Criteria) this;
        }

        public Criteria andDjzqmcGreaterThan(String value) {
            addCriterion("DJZQMC >", value, "djzqmc");
            return (Criteria) this;
        }

        public Criteria andDjzqmcGreaterThanOrEqualTo(String value) {
            addCriterion("DJZQMC >=", value, "djzqmc");
            return (Criteria) this;
        }

        public Criteria andDjzqmcLessThan(String value) {
            addCriterion("DJZQMC <", value, "djzqmc");
            return (Criteria) this;
        }

        public Criteria andDjzqmcLessThanOrEqualTo(String value) {
            addCriterion("DJZQMC <=", value, "djzqmc");
            return (Criteria) this;
        }

        public Criteria andDjzqmcIn(List<String> values) {
            addCriterion("DJZQMC in", values, "djzqmc");
            return (Criteria) this;
        }

        public Criteria andDjzqmcNotIn(List<String> values) {
            addCriterion("DJZQMC not in", values, "djzqmc");
            return (Criteria) this;
        }

        public Criteria andDjzqmcBetween(String value1, String value2) {
            addCriterion("DJZQMC between", value1, value2, "djzqmc");
            return (Criteria) this;
        }

        public Criteria andDjzqmcNotBetween(String value1, String value2) {
            addCriterion("DJZQMC not between", value1, value2, "djzqmc");
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

        public Criteria andLrryIsNull() {
            addCriterion("LRRY is null");
            return (Criteria) this;
        }

        public Criteria andLrryIsNotNull() {
            addCriterion("LRRY is not null");
            return (Criteria) this;
        }

        public Criteria andLrryEqualTo(String value) {
            addCriterion("LRRY =", value, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryNotEqualTo(String value) {
            addCriterion("LRRY <>", value, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryGreaterThan(String value) {
            addCriterion("LRRY >", value, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryGreaterThanOrEqualTo(String value) {
            addCriterion("LRRY >=", value, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryLessThan(String value) {
            addCriterion("LRRY <", value, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryLessThanOrEqualTo(String value) {
            addCriterion("LRRY <=", value, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryIn(List<String> values) {
            addCriterion("LRRY in", values, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryNotIn(List<String> values) {
            addCriterion("LRRY not in", values, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryBetween(String value1, String value2) {
            addCriterion("LRRY between", value1, value2, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryNotBetween(String value1, String value2) {
            addCriterion("LRRY not between", value1, value2, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryidIsNull() {
            addCriterion("LRRYID is null");
            return (Criteria) this;
        }

        public Criteria andLrryidIsNotNull() {
            addCriterion("LRRYID is not null");
            return (Criteria) this;
        }

        public Criteria andLrryidEqualTo(String value) {
            addCriterion("LRRYID =", value, "lrryid");
            return (Criteria) this;
        }

        public Criteria andLrryidNotEqualTo(String value) {
            addCriterion("LRRYID <>", value, "lrryid");
            return (Criteria) this;
        }

        public Criteria andLrryidGreaterThan(String value) {
            addCriterion("LRRYID >", value, "lrryid");
            return (Criteria) this;
        }

        public Criteria andLrryidGreaterThanOrEqualTo(String value) {
            addCriterion("LRRYID >=", value, "lrryid");
            return (Criteria) this;
        }

        public Criteria andLrryidLessThan(String value) {
            addCriterion("LRRYID <", value, "lrryid");
            return (Criteria) this;
        }

        public Criteria andLrryidLessThanOrEqualTo(String value) {
            addCriterion("LRRYID <=", value, "lrryid");
            return (Criteria) this;
        }

        public Criteria andLrryidIn(List<String> values) {
            addCriterion("LRRYID in", values, "lrryid");
            return (Criteria) this;
        }

        public Criteria andLrryidNotIn(List<String> values) {
            addCriterion("LRRYID not in", values, "lrryid");
            return (Criteria) this;
        }

        public Criteria andLrryidBetween(String value1, String value2) {
            addCriterion("LRRYID between", value1, value2, "lrryid");
            return (Criteria) this;
        }

        public Criteria andLrryidNotBetween(String value1, String value2) {
            addCriterion("LRRYID not between", value1, value2, "lrryid");
            return (Criteria) this;
        }

        public Criteria andLrsjIsNull() {
            addCriterion("LRSJ is null");
            return (Criteria) this;
        }

        public Criteria andLrsjIsNotNull() {
            addCriterion("LRSJ is not null");
            return (Criteria) this;
        }

        public Criteria andLrsjEqualTo(Date value) {
            addCriterion("LRSJ =", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjNotEqualTo(Date value) {
            addCriterion("LRSJ <>", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjGreaterThan(Date value) {
            addCriterion("LRSJ >", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjGreaterThanOrEqualTo(Date value) {
            addCriterion("LRSJ >=", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjLessThan(Date value) {
            addCriterion("LRSJ <", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjLessThanOrEqualTo(Date value) {
            addCriterion("LRSJ <=", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjIn(List<Date> values) {
            addCriterion("LRSJ in", values, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjNotIn(List<Date> values) {
            addCriterion("LRSJ not in", values, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjBetween(Date value1, Date value2) {
            addCriterion("LRSJ between", value1, value2, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjNotBetween(Date value1, Date value2) {
            addCriterion("LRSJ not between", value1, value2, "lrsj");
            return (Criteria) this;
        }

        public Criteria andZhxgryIsNull() {
            addCriterion("ZHXGRY is null");
            return (Criteria) this;
        }

        public Criteria andZhxgryIsNotNull() {
            addCriterion("ZHXGRY is not null");
            return (Criteria) this;
        }

        public Criteria andZhxgryEqualTo(String value) {
            addCriterion("ZHXGRY =", value, "zhxgry");
            return (Criteria) this;
        }

        public Criteria andZhxgryNotEqualTo(String value) {
            addCriterion("ZHXGRY <>", value, "zhxgry");
            return (Criteria) this;
        }

        public Criteria andZhxgryGreaterThan(String value) {
            addCriterion("ZHXGRY >", value, "zhxgry");
            return (Criteria) this;
        }

        public Criteria andZhxgryGreaterThanOrEqualTo(String value) {
            addCriterion("ZHXGRY >=", value, "zhxgry");
            return (Criteria) this;
        }

        public Criteria andZhxgryLessThan(String value) {
            addCriterion("ZHXGRY <", value, "zhxgry");
            return (Criteria) this;
        }

        public Criteria andZhxgryLessThanOrEqualTo(String value) {
            addCriterion("ZHXGRY <=", value, "zhxgry");
            return (Criteria) this;
        }

        public Criteria andZhxgryIn(List<String> values) {
            addCriterion("ZHXGRY in", values, "zhxgry");
            return (Criteria) this;
        }

        public Criteria andZhxgryNotIn(List<String> values) {
            addCriterion("ZHXGRY not in", values, "zhxgry");
            return (Criteria) this;
        }

        public Criteria andZhxgryBetween(String value1, String value2) {
            addCriterion("ZHXGRY between", value1, value2, "zhxgry");
            return (Criteria) this;
        }

        public Criteria andZhxgryNotBetween(String value1, String value2) {
            addCriterion("ZHXGRY not between", value1, value2, "zhxgry");
            return (Criteria) this;
        }

        public Criteria andZhxgsjIsNull() {
            addCriterion("ZHXGSJ is null");
            return (Criteria) this;
        }

        public Criteria andZhxgsjIsNotNull() {
            addCriterion("ZHXGSJ is not null");
            return (Criteria) this;
        }

        public Criteria andZhxgsjEqualTo(Date value) {
            addCriterion("ZHXGSJ =", value, "zhxgsj");
            return (Criteria) this;
        }

        public Criteria andZhxgsjNotEqualTo(Date value) {
            addCriterion("ZHXGSJ <>", value, "zhxgsj");
            return (Criteria) this;
        }

        public Criteria andZhxgsjGreaterThan(Date value) {
            addCriterion("ZHXGSJ >", value, "zhxgsj");
            return (Criteria) this;
        }

        public Criteria andZhxgsjGreaterThanOrEqualTo(Date value) {
            addCriterion("ZHXGSJ >=", value, "zhxgsj");
            return (Criteria) this;
        }

        public Criteria andZhxgsjLessThan(Date value) {
            addCriterion("ZHXGSJ <", value, "zhxgsj");
            return (Criteria) this;
        }

        public Criteria andZhxgsjLessThanOrEqualTo(Date value) {
            addCriterion("ZHXGSJ <=", value, "zhxgsj");
            return (Criteria) this;
        }

        public Criteria andZhxgsjIn(List<Date> values) {
            addCriterion("ZHXGSJ in", values, "zhxgsj");
            return (Criteria) this;
        }

        public Criteria andZhxgsjNotIn(List<Date> values) {
            addCriterion("ZHXGSJ not in", values, "zhxgsj");
            return (Criteria) this;
        }

        public Criteria andZhxgsjBetween(Date value1, Date value2) {
            addCriterion("ZHXGSJ between", value1, value2, "zhxgsj");
            return (Criteria) this;
        }

        public Criteria andZhxgsjNotBetween(Date value1, Date value2) {
            addCriterion("ZHXGSJ not between", value1, value2, "zhxgsj");
            return (Criteria) this;
        }

        public Criteria andBtIsNull() {
            addCriterion("BT is null");
            return (Criteria) this;
        }

        public Criteria andBtIsNotNull() {
            addCriterion("BT is not null");
            return (Criteria) this;
        }

        public Criteria andBtEqualTo(String value) {
            addCriterion("BT =", value, "bt");
            return (Criteria) this;
        }

        public Criteria andBtNotEqualTo(String value) {
            addCriterion("BT <>", value, "bt");
            return (Criteria) this;
        }

        public Criteria andBtGreaterThan(String value) {
            addCriterion("BT >", value, "bt");
            return (Criteria) this;
        }

        public Criteria andBtGreaterThanOrEqualTo(String value) {
            addCriterion("BT >=", value, "bt");
            return (Criteria) this;
        }

        public Criteria andBtLessThan(String value) {
            addCriterion("BT <", value, "bt");
            return (Criteria) this;
        }

        public Criteria andBtLessThanOrEqualTo(String value) {
            addCriterion("BT <=", value, "bt");
            return (Criteria) this;
        }

        public Criteria andBtIn(List<String> values) {
            addCriterion("BT in", values, "bt");
            return (Criteria) this;
        }

        public Criteria andBtNotIn(List<String> values) {
            addCriterion("BT not in", values, "bt");
            return (Criteria) this;
        }

        public Criteria andBtBetween(String value1, String value2) {
            addCriterion("BT between", value1, value2, "bt");
            return (Criteria) this;
        }

        public Criteria andBtNotBetween(String value1, String value2) {
            addCriterion("BT not between", value1, value2, "bt");
            return (Criteria) this;
        }

        public Criteria andCcztIsNull() {
            addCriterion("CCZT is null");
            return (Criteria) this;
        }

        public Criteria andCcztIsNotNull() {
            addCriterion("CCZT is not null");
            return (Criteria) this;
        }

        public Criteria andCcztEqualTo(String value) {
            addCriterion("CCZT =", value, "cczt");
            return (Criteria) this;
        }

        public Criteria andCcztNotEqualTo(String value) {
            addCriterion("CCZT <>", value, "cczt");
            return (Criteria) this;
        }

        public Criteria andCcztGreaterThan(String value) {
            addCriterion("CCZT >", value, "cczt");
            return (Criteria) this;
        }

        public Criteria andCcztGreaterThanOrEqualTo(String value) {
            addCriterion("CCZT >=", value, "cczt");
            return (Criteria) this;
        }

        public Criteria andCcztLessThan(String value) {
            addCriterion("CCZT <", value, "cczt");
            return (Criteria) this;
        }

        public Criteria andCcztLessThanOrEqualTo(String value) {
            addCriterion("CCZT <=", value, "cczt");
            return (Criteria) this;
        }

        public Criteria andCcztIn(List<String> values) {
            addCriterion("CCZT in", values, "cczt");
            return (Criteria) this;
        }

        public Criteria andCcztNotIn(List<String> values) {
            addCriterion("CCZT not in", values, "cczt");
            return (Criteria) this;
        }

        public Criteria andCcztBetween(String value1, String value2) {
            addCriterion("CCZT between", value1, value2, "cczt");
            return (Criteria) this;
        }

        public Criteria andCcztNotBetween(String value1, String value2) {
            addCriterion("CCZT not between", value1, value2, "cczt");
            return (Criteria) this;
        }

        public Criteria andDyztIsNull() {
            addCriterion("DYZT is null");
            return (Criteria) this;
        }

        public Criteria andDyztIsNotNull() {
            addCriterion("DYZT is not null");
            return (Criteria) this;
        }

        public Criteria andDyztEqualTo(String value) {
            addCriterion("DYZT =", value, "dyzt");
            return (Criteria) this;
        }

        public Criteria andDyztNotEqualTo(String value) {
            addCriterion("DYZT <>", value, "dyzt");
            return (Criteria) this;
        }

        public Criteria andDyztGreaterThan(String value) {
            addCriterion("DYZT >", value, "dyzt");
            return (Criteria) this;
        }

        public Criteria andDyztGreaterThanOrEqualTo(String value) {
            addCriterion("DYZT >=", value, "dyzt");
            return (Criteria) this;
        }

        public Criteria andDyztLessThan(String value) {
            addCriterion("DYZT <", value, "dyzt");
            return (Criteria) this;
        }

        public Criteria andDyztLessThanOrEqualTo(String value) {
            addCriterion("DYZT <=", value, "dyzt");
            return (Criteria) this;
        }

        public Criteria andDyztIn(List<String> values) {
            addCriterion("DYZT in", values, "dyzt");
            return (Criteria) this;
        }

        public Criteria andDyztNotIn(List<String> values) {
            addCriterion("DYZT not in", values, "dyzt");
            return (Criteria) this;
        }

        public Criteria andDyztBetween(String value1, String value2) {
            addCriterion("DYZT between", value1, value2, "dyzt");
            return (Criteria) this;
        }

        public Criteria andDyztNotBetween(String value1, String value2) {
            addCriterion("DYZT not between", value1, value2, "dyzt");
            return (Criteria) this;
        }

        public Criteria andZhxgryidIsNull() {
            addCriterion("ZHXGRYID is null");
            return (Criteria) this;
        }

        public Criteria andZhxgryidIsNotNull() {
            addCriterion("ZHXGRYID is not null");
            return (Criteria) this;
        }

        public Criteria andZhxgryidEqualTo(String value) {
            addCriterion("ZHXGRYID =", value, "zhxgryid");
            return (Criteria) this;
        }

        public Criteria andZhxgryidNotEqualTo(String value) {
            addCriterion("ZHXGRYID <>", value, "zhxgryid");
            return (Criteria) this;
        }

        public Criteria andZhxgryidGreaterThan(String value) {
            addCriterion("ZHXGRYID >", value, "zhxgryid");
            return (Criteria) this;
        }

        public Criteria andZhxgryidGreaterThanOrEqualTo(String value) {
            addCriterion("ZHXGRYID >=", value, "zhxgryid");
            return (Criteria) this;
        }

        public Criteria andZhxgryidLessThan(String value) {
            addCriterion("ZHXGRYID <", value, "zhxgryid");
            return (Criteria) this;
        }

        public Criteria andZhxgryidLessThanOrEqualTo(String value) {
            addCriterion("ZHXGRYID <=", value, "zhxgryid");
            return (Criteria) this;
        }

        public Criteria andZhxgryidIn(List<String> values) {
            addCriterion("ZHXGRYID in", values, "zhxgryid");
            return (Criteria) this;
        }

        public Criteria andZhxgryidNotIn(List<String> values) {
            addCriterion("ZHXGRYID not in", values, "zhxgryid");
            return (Criteria) this;
        }

        public Criteria andZhxgryidBetween(String value1, String value2) {
            addCriterion("ZHXGRYID between", value1, value2, "zhxgryid");
            return (Criteria) this;
        }

        public Criteria andZhxgryidNotBetween(String value1, String value2) {
            addCriterion("ZHXGRYID not between", value1, value2, "zhxgryid");
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