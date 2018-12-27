package com.supermap.dossiertool.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DasAjjbxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DasAjjbxxExample() {
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

        public Criteria andNdIsNull() {
            addCriterion("ND is null");
            return (Criteria) this;
        }

        public Criteria andNdIsNotNull() {
            addCriterion("ND is not null");
            return (Criteria) this;
        }

        public Criteria andNdEqualTo(Long value) {
            addCriterion("ND =", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdNotEqualTo(Long value) {
            addCriterion("ND <>", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdGreaterThan(Long value) {
            addCriterion("ND >", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdGreaterThanOrEqualTo(Long value) {
            addCriterion("ND >=", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdLessThan(Long value) {
            addCriterion("ND <", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdLessThanOrEqualTo(Long value) {
            addCriterion("ND <=", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdIn(List<Long> values) {
            addCriterion("ND in", values, "nd");
            return (Criteria) this;
        }

        public Criteria andNdNotIn(List<Long> values) {
            addCriterion("ND not in", values, "nd");
            return (Criteria) this;
        }

        public Criteria andNdBetween(Long value1, Long value2) {
            addCriterion("ND between", value1, value2, "nd");
            return (Criteria) this;
        }

        public Criteria andNdNotBetween(Long value1, Long value2) {
            addCriterion("ND not between", value1, value2, "nd");
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

        public Criteria andQzhEqualTo(String value) {
            addCriterion("QZH =", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhNotEqualTo(String value) {
            addCriterion("QZH <>", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhGreaterThan(String value) {
            addCriterion("QZH >", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhGreaterThanOrEqualTo(String value) {
            addCriterion("QZH >=", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhLessThan(String value) {
            addCriterion("QZH <", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhLessThanOrEqualTo(String value) {
            addCriterion("QZH <=", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhLike(String value) {
            addCriterion("QZH like", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhNotLike(String value) {
            addCriterion("QZH not like", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhIn(List<String> values) {
            addCriterion("QZH in", values, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhNotIn(List<String> values) {
            addCriterion("QZH not in", values, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhBetween(String value1, String value2) {
            addCriterion("QZH between", value1, value2, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhNotBetween(String value1, String value2) {
            addCriterion("QZH not between", value1, value2, "qzh");
            return (Criteria) this;
        }

        public Criteria andFlbhIsNull() {
            addCriterion("FLBH is null");
            return (Criteria) this;
        }

        public Criteria andFlbhIsNotNull() {
            addCriterion("FLBH is not null");
            return (Criteria) this;
        }

        public Criteria andFlbhEqualTo(String value) {
            addCriterion("FLBH =", value, "flbh");
            return (Criteria) this;
        }

        public Criteria andFlbhNotEqualTo(String value) {
            addCriterion("FLBH <>", value, "flbh");
            return (Criteria) this;
        }

        public Criteria andFlbhGreaterThan(String value) {
            addCriterion("FLBH >", value, "flbh");
            return (Criteria) this;
        }

        public Criteria andFlbhGreaterThanOrEqualTo(String value) {
            addCriterion("FLBH >=", value, "flbh");
            return (Criteria) this;
        }

        public Criteria andFlbhLessThan(String value) {
            addCriterion("FLBH <", value, "flbh");
            return (Criteria) this;
        }

        public Criteria andFlbhLessThanOrEqualTo(String value) {
            addCriterion("FLBH <=", value, "flbh");
            return (Criteria) this;
        }

        public Criteria andFlbhLike(String value) {
            addCriterion("FLBH like", value, "flbh");
            return (Criteria) this;
        }

        public Criteria andFlbhNotLike(String value) {
            addCriterion("FLBH not like", value, "flbh");
            return (Criteria) this;
        }

        public Criteria andFlbhIn(List<String> values) {
            addCriterion("FLBH in", values, "flbh");
            return (Criteria) this;
        }

        public Criteria andFlbhNotIn(List<String> values) {
            addCriterion("FLBH not in", values, "flbh");
            return (Criteria) this;
        }

        public Criteria andFlbhBetween(String value1, String value2) {
            addCriterion("FLBH between", value1, value2, "flbh");
            return (Criteria) this;
        }

        public Criteria andFlbhNotBetween(String value1, String value2) {
            addCriterion("FLBH not between", value1, value2, "flbh");
            return (Criteria) this;
        }

        public Criteria andMlhIsNull() {
            addCriterion("MLH is null");
            return (Criteria) this;
        }

        public Criteria andMlhIsNotNull() {
            addCriterion("MLH is not null");
            return (Criteria) this;
        }

        public Criteria andMlhEqualTo(String value) {
            addCriterion("MLH =", value, "mlh");
            return (Criteria) this;
        }

        public Criteria andMlhNotEqualTo(String value) {
            addCriterion("MLH <>", value, "mlh");
            return (Criteria) this;
        }

        public Criteria andMlhGreaterThan(String value) {
            addCriterion("MLH >", value, "mlh");
            return (Criteria) this;
        }

        public Criteria andMlhGreaterThanOrEqualTo(String value) {
            addCriterion("MLH >=", value, "mlh");
            return (Criteria) this;
        }

        public Criteria andMlhLessThan(String value) {
            addCriterion("MLH <", value, "mlh");
            return (Criteria) this;
        }

        public Criteria andMlhLessThanOrEqualTo(String value) {
            addCriterion("MLH <=", value, "mlh");
            return (Criteria) this;
        }

        public Criteria andMlhLike(String value) {
            addCriterion("MLH like", value, "mlh");
            return (Criteria) this;
        }

        public Criteria andMlhNotLike(String value) {
            addCriterion("MLH not like", value, "mlh");
            return (Criteria) this;
        }

        public Criteria andMlhIn(List<String> values) {
            addCriterion("MLH in", values, "mlh");
            return (Criteria) this;
        }

        public Criteria andMlhNotIn(List<String> values) {
            addCriterion("MLH not in", values, "mlh");
            return (Criteria) this;
        }

        public Criteria andMlhBetween(String value1, String value2) {
            addCriterion("MLH between", value1, value2, "mlh");
            return (Criteria) this;
        }

        public Criteria andMlhNotBetween(String value1, String value2) {
            addCriterion("MLH not between", value1, value2, "mlh");
            return (Criteria) this;
        }

        public Criteria andAjhIsNull() {
            addCriterion("AJH is null");
            return (Criteria) this;
        }

        public Criteria andAjhIsNotNull() {
            addCriterion("AJH is not null");
            return (Criteria) this;
        }

        public Criteria andAjhEqualTo(String value) {
            addCriterion("AJH =", value, "ajh");
            return (Criteria) this;
        }

        public Criteria andAjhNotEqualTo(String value) {
            addCriterion("AJH <>", value, "ajh");
            return (Criteria) this;
        }

        public Criteria andAjhGreaterThan(String value) {
            addCriterion("AJH >", value, "ajh");
            return (Criteria) this;
        }

        public Criteria andAjhGreaterThanOrEqualTo(String value) {
            addCriterion("AJH >=", value, "ajh");
            return (Criteria) this;
        }

        public Criteria andAjhLessThan(String value) {
            addCriterion("AJH <", value, "ajh");
            return (Criteria) this;
        }

        public Criteria andAjhLessThanOrEqualTo(String value) {
            addCriterion("AJH <=", value, "ajh");
            return (Criteria) this;
        }

        public Criteria andAjhLike(String value) {
            addCriterion("AJH like", value, "ajh");
            return (Criteria) this;
        }

        public Criteria andAjhNotLike(String value) {
            addCriterion("AJH not like", value, "ajh");
            return (Criteria) this;
        }

        public Criteria andAjhIn(List<String> values) {
            addCriterion("AJH in", values, "ajh");
            return (Criteria) this;
        }

        public Criteria andAjhNotIn(List<String> values) {
            addCriterion("AJH not in", values, "ajh");
            return (Criteria) this;
        }

        public Criteria andAjhBetween(String value1, String value2) {
            addCriterion("AJH between", value1, value2, "ajh");
            return (Criteria) this;
        }

        public Criteria andAjhNotBetween(String value1, String value2) {
            addCriterion("AJH not between", value1, value2, "ajh");
            return (Criteria) this;
        }

        public Criteria andAjzhIsNull() {
            addCriterion("AJZH is null");
            return (Criteria) this;
        }

        public Criteria andAjzhIsNotNull() {
            addCriterion("AJZH is not null");
            return (Criteria) this;
        }

        public Criteria andAjzhEqualTo(String value) {
            addCriterion("AJZH =", value, "ajzh");
            return (Criteria) this;
        }

        public Criteria andAjzhNotEqualTo(String value) {
            addCriterion("AJZH <>", value, "ajzh");
            return (Criteria) this;
        }

        public Criteria andAjzhGreaterThan(String value) {
            addCriterion("AJZH >", value, "ajzh");
            return (Criteria) this;
        }

        public Criteria andAjzhGreaterThanOrEqualTo(String value) {
            addCriterion("AJZH >=", value, "ajzh");
            return (Criteria) this;
        }

        public Criteria andAjzhLessThan(String value) {
            addCriterion("AJZH <", value, "ajzh");
            return (Criteria) this;
        }

        public Criteria andAjzhLessThanOrEqualTo(String value) {
            addCriterion("AJZH <=", value, "ajzh");
            return (Criteria) this;
        }

        public Criteria andAjzhLike(String value) {
            addCriterion("AJZH like", value, "ajzh");
            return (Criteria) this;
        }

        public Criteria andAjzhNotLike(String value) {
            addCriterion("AJZH not like", value, "ajzh");
            return (Criteria) this;
        }

        public Criteria andAjzhIn(List<String> values) {
            addCriterion("AJZH in", values, "ajzh");
            return (Criteria) this;
        }

        public Criteria andAjzhNotIn(List<String> values) {
            addCriterion("AJZH not in", values, "ajzh");
            return (Criteria) this;
        }

        public Criteria andAjzhBetween(String value1, String value2) {
            addCriterion("AJZH between", value1, value2, "ajzh");
            return (Criteria) this;
        }

        public Criteria andAjzhNotBetween(String value1, String value2) {
            addCriterion("AJZH not between", value1, value2, "ajzh");
            return (Criteria) this;
        }

        public Criteria andGhIsNull() {
            addCriterion("GH is null");
            return (Criteria) this;
        }

        public Criteria andGhIsNotNull() {
            addCriterion("GH is not null");
            return (Criteria) this;
        }

        public Criteria andGhEqualTo(String value) {
            addCriterion("GH =", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhNotEqualTo(String value) {
            addCriterion("GH <>", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhGreaterThan(String value) {
            addCriterion("GH >", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhGreaterThanOrEqualTo(String value) {
            addCriterion("GH >=", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhLessThan(String value) {
            addCriterion("GH <", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhLessThanOrEqualTo(String value) {
            addCriterion("GH <=", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhLike(String value) {
            addCriterion("GH like", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhNotLike(String value) {
            addCriterion("GH not like", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhIn(List<String> values) {
            addCriterion("GH in", values, "gh");
            return (Criteria) this;
        }

        public Criteria andGhNotIn(List<String> values) {
            addCriterion("GH not in", values, "gh");
            return (Criteria) this;
        }

        public Criteria andGhBetween(String value1, String value2) {
            addCriterion("GH between", value1, value2, "gh");
            return (Criteria) this;
        }

        public Criteria andGhNotBetween(String value1, String value2) {
            addCriterion("GH not between", value1, value2, "gh");
            return (Criteria) this;
        }

        public Criteria andAjbtIsNull() {
            addCriterion("AJBT is null");
            return (Criteria) this;
        }

        public Criteria andAjbtIsNotNull() {
            addCriterion("AJBT is not null");
            return (Criteria) this;
        }

        public Criteria andAjbtEqualTo(String value) {
            addCriterion("AJBT =", value, "ajbt");
            return (Criteria) this;
        }

        public Criteria andAjbtNotEqualTo(String value) {
            addCriterion("AJBT <>", value, "ajbt");
            return (Criteria) this;
        }

        public Criteria andAjbtGreaterThan(String value) {
            addCriterion("AJBT >", value, "ajbt");
            return (Criteria) this;
        }

        public Criteria andAjbtGreaterThanOrEqualTo(String value) {
            addCriterion("AJBT >=", value, "ajbt");
            return (Criteria) this;
        }

        public Criteria andAjbtLessThan(String value) {
            addCriterion("AJBT <", value, "ajbt");
            return (Criteria) this;
        }

        public Criteria andAjbtLessThanOrEqualTo(String value) {
            addCriterion("AJBT <=", value, "ajbt");
            return (Criteria) this;
        }

        public Criteria andAjbtLike(String value) {
            addCriterion("AJBT like", value, "ajbt");
            return (Criteria) this;
        }

        public Criteria andAjbtNotLike(String value) {
            addCriterion("AJBT not like", value, "ajbt");
            return (Criteria) this;
        }

        public Criteria andAjbtIn(List<String> values) {
            addCriterion("AJBT in", values, "ajbt");
            return (Criteria) this;
        }

        public Criteria andAjbtNotIn(List<String> values) {
            addCriterion("AJBT not in", values, "ajbt");
            return (Criteria) this;
        }

        public Criteria andAjbtBetween(String value1, String value2) {
            addCriterion("AJBT between", value1, value2, "ajbt");
            return (Criteria) this;
        }

        public Criteria andAjbtNotBetween(String value1, String value2) {
            addCriterion("AJBT not between", value1, value2, "ajbt");
            return (Criteria) this;
        }

        public Criteria andCdsjIsNull() {
            addCriterion("CDSJ is null");
            return (Criteria) this;
        }

        public Criteria andCdsjIsNotNull() {
            addCriterion("CDSJ is not null");
            return (Criteria) this;
        }

        public Criteria andCdsjEqualTo(Date value) {
            addCriterion("CDSJ =", value, "cdsj");
            return (Criteria) this;
        }

        public Criteria andCdsjNotEqualTo(Date value) {
            addCriterion("CDSJ <>", value, "cdsj");
            return (Criteria) this;
        }

        public Criteria andCdsjGreaterThan(Date value) {
            addCriterion("CDSJ >", value, "cdsj");
            return (Criteria) this;
        }

        public Criteria andCdsjGreaterThanOrEqualTo(Date value) {
            addCriterion("CDSJ >=", value, "cdsj");
            return (Criteria) this;
        }

        public Criteria andCdsjLessThan(Date value) {
            addCriterion("CDSJ <", value, "cdsj");
            return (Criteria) this;
        }

        public Criteria andCdsjLessThanOrEqualTo(Date value) {
            addCriterion("CDSJ <=", value, "cdsj");
            return (Criteria) this;
        }

        public Criteria andCdsjIn(List<Date> values) {
            addCriterion("CDSJ in", values, "cdsj");
            return (Criteria) this;
        }

        public Criteria andCdsjNotIn(List<Date> values) {
            addCriterion("CDSJ not in", values, "cdsj");
            return (Criteria) this;
        }

        public Criteria andCdsjBetween(Date value1, Date value2) {
            addCriterion("CDSJ between", value1, value2, "cdsj");
            return (Criteria) this;
        }

        public Criteria andCdsjNotBetween(Date value1, Date value2) {
            addCriterion("CDSJ not between", value1, value2, "cdsj");
            return (Criteria) this;
        }

        public Criteria andBcqxIsNull() {
            addCriterion("BCQX is null");
            return (Criteria) this;
        }

        public Criteria andBcqxIsNotNull() {
            addCriterion("BCQX is not null");
            return (Criteria) this;
        }

        public Criteria andBcqxEqualTo(Long value) {
            addCriterion("BCQX =", value, "bcqx");
            return (Criteria) this;
        }

        public Criteria andBcqxNotEqualTo(Long value) {
            addCriterion("BCQX <>", value, "bcqx");
            return (Criteria) this;
        }

        public Criteria andBcqxGreaterThan(Long value) {
            addCriterion("BCQX >", value, "bcqx");
            return (Criteria) this;
        }

        public Criteria andBcqxGreaterThanOrEqualTo(Long value) {
            addCriterion("BCQX >=", value, "bcqx");
            return (Criteria) this;
        }

        public Criteria andBcqxLessThan(Long value) {
            addCriterion("BCQX <", value, "bcqx");
            return (Criteria) this;
        }

        public Criteria andBcqxLessThanOrEqualTo(Long value) {
            addCriterion("BCQX <=", value, "bcqx");
            return (Criteria) this;
        }

        public Criteria andBcqxIn(List<Long> values) {
            addCriterion("BCQX in", values, "bcqx");
            return (Criteria) this;
        }

        public Criteria andBcqxNotIn(List<Long> values) {
            addCriterion("BCQX not in", values, "bcqx");
            return (Criteria) this;
        }

        public Criteria andBcqxBetween(Long value1, Long value2) {
            addCriterion("BCQX between", value1, value2, "bcqx");
            return (Criteria) this;
        }

        public Criteria andBcqxNotBetween(Long value1, Long value2) {
            addCriterion("BCQX not between", value1, value2, "bcqx");
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

        public Criteria andWjysIsNull() {
            addCriterion("WJYS is null");
            return (Criteria) this;
        }

        public Criteria andWjysIsNotNull() {
            addCriterion("WJYS is not null");
            return (Criteria) this;
        }

        public Criteria andWjysEqualTo(Long value) {
            addCriterion("WJYS =", value, "wjys");
            return (Criteria) this;
        }

        public Criteria andWjysNotEqualTo(Long value) {
            addCriterion("WJYS <>", value, "wjys");
            return (Criteria) this;
        }

        public Criteria andWjysGreaterThan(Long value) {
            addCriterion("WJYS >", value, "wjys");
            return (Criteria) this;
        }

        public Criteria andWjysGreaterThanOrEqualTo(Long value) {
            addCriterion("WJYS >=", value, "wjys");
            return (Criteria) this;
        }

        public Criteria andWjysLessThan(Long value) {
            addCriterion("WJYS <", value, "wjys");
            return (Criteria) this;
        }

        public Criteria andWjysLessThanOrEqualTo(Long value) {
            addCriterion("WJYS <=", value, "wjys");
            return (Criteria) this;
        }

        public Criteria andWjysIn(List<Long> values) {
            addCriterion("WJYS in", values, "wjys");
            return (Criteria) this;
        }

        public Criteria andWjysNotIn(List<Long> values) {
            addCriterion("WJYS not in", values, "wjys");
            return (Criteria) this;
        }

        public Criteria andWjysBetween(Long value1, Long value2) {
            addCriterion("WJYS between", value1, value2, "wjys");
            return (Criteria) this;
        }

        public Criteria andWjysNotBetween(Long value1, Long value2) {
            addCriterion("WJYS not between", value1, value2, "wjys");
            return (Criteria) this;
        }

        public Criteria andWjjsIsNull() {
            addCriterion("WJJS is null");
            return (Criteria) this;
        }

        public Criteria andWjjsIsNotNull() {
            addCriterion("WJJS is not null");
            return (Criteria) this;
        }

        public Criteria andWjjsEqualTo(Long value) {
            addCriterion("WJJS =", value, "wjjs");
            return (Criteria) this;
        }

        public Criteria andWjjsNotEqualTo(Long value) {
            addCriterion("WJJS <>", value, "wjjs");
            return (Criteria) this;
        }

        public Criteria andWjjsGreaterThan(Long value) {
            addCriterion("WJJS >", value, "wjjs");
            return (Criteria) this;
        }

        public Criteria andWjjsGreaterThanOrEqualTo(Long value) {
            addCriterion("WJJS >=", value, "wjjs");
            return (Criteria) this;
        }

        public Criteria andWjjsLessThan(Long value) {
            addCriterion("WJJS <", value, "wjjs");
            return (Criteria) this;
        }

        public Criteria andWjjsLessThanOrEqualTo(Long value) {
            addCriterion("WJJS <=", value, "wjjs");
            return (Criteria) this;
        }

        public Criteria andWjjsIn(List<Long> values) {
            addCriterion("WJJS in", values, "wjjs");
            return (Criteria) this;
        }

        public Criteria andWjjsNotIn(List<Long> values) {
            addCriterion("WJJS not in", values, "wjjs");
            return (Criteria) this;
        }

        public Criteria andWjjsBetween(Long value1, Long value2) {
            addCriterion("WJJS between", value1, value2, "wjjs");
            return (Criteria) this;
        }

        public Criteria andWjjsNotBetween(Long value1, Long value2) {
            addCriterion("WJJS not between", value1, value2, "wjjs");
            return (Criteria) this;
        }

        public Criteria andQhdmIsNull() {
            addCriterion("QHDM is null");
            return (Criteria) this;
        }

        public Criteria andQhdmIsNotNull() {
            addCriterion("QHDM is not null");
            return (Criteria) this;
        }

        public Criteria andQhdmEqualTo(Long value) {
            addCriterion("QHDM =", value, "qhdm");
            return (Criteria) this;
        }

        public Criteria andQhdmNotEqualTo(Long value) {
            addCriterion("QHDM <>", value, "qhdm");
            return (Criteria) this;
        }

        public Criteria andQhdmGreaterThan(Long value) {
            addCriterion("QHDM >", value, "qhdm");
            return (Criteria) this;
        }

        public Criteria andQhdmGreaterThanOrEqualTo(Long value) {
            addCriterion("QHDM >=", value, "qhdm");
            return (Criteria) this;
        }

        public Criteria andQhdmLessThan(Long value) {
            addCriterion("QHDM <", value, "qhdm");
            return (Criteria) this;
        }

        public Criteria andQhdmLessThanOrEqualTo(Long value) {
            addCriterion("QHDM <=", value, "qhdm");
            return (Criteria) this;
        }

        public Criteria andQhdmIn(List<Long> values) {
            addCriterion("QHDM in", values, "qhdm");
            return (Criteria) this;
        }

        public Criteria andQhdmNotIn(List<Long> values) {
            addCriterion("QHDM not in", values, "qhdm");
            return (Criteria) this;
        }

        public Criteria andQhdmBetween(Long value1, Long value2) {
            addCriterion("QHDM between", value1, value2, "qhdm");
            return (Criteria) this;
        }

        public Criteria andQhdmNotBetween(Long value1, Long value2) {
            addCriterion("QHDM not between", value1, value2, "qhdm");
            return (Criteria) this;
        }

        public Criteria andAjztIsNull() {
            addCriterion("AJZT is null");
            return (Criteria) this;
        }

        public Criteria andAjztIsNotNull() {
            addCriterion("AJZT is not null");
            return (Criteria) this;
        }

        public Criteria andAjztEqualTo(Long value) {
            addCriterion("AJZT =", value, "ajzt");
            return (Criteria) this;
        }

        public Criteria andAjztNotEqualTo(Long value) {
            addCriterion("AJZT <>", value, "ajzt");
            return (Criteria) this;
        }

        public Criteria andAjztGreaterThan(Long value) {
            addCriterion("AJZT >", value, "ajzt");
            return (Criteria) this;
        }

        public Criteria andAjztGreaterThanOrEqualTo(Long value) {
            addCriterion("AJZT >=", value, "ajzt");
            return (Criteria) this;
        }

        public Criteria andAjztLessThan(Long value) {
            addCriterion("AJZT <", value, "ajzt");
            return (Criteria) this;
        }

        public Criteria andAjztLessThanOrEqualTo(Long value) {
            addCriterion("AJZT <=", value, "ajzt");
            return (Criteria) this;
        }

        public Criteria andAjztIn(List<Long> values) {
            addCriterion("AJZT in", values, "ajzt");
            return (Criteria) this;
        }

        public Criteria andAjztNotIn(List<Long> values) {
            addCriterion("AJZT not in", values, "ajzt");
            return (Criteria) this;
        }

        public Criteria andAjztBetween(Long value1, Long value2) {
            addCriterion("AJZT between", value1, value2, "ajzt");
            return (Criteria) this;
        }

        public Criteria andAjztNotBetween(Long value1, Long value2) {
            addCriterion("AJZT not between", value1, value2, "ajzt");
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

        public Criteria andMjEqualTo(Long value) {
            addCriterion("MJ =", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjNotEqualTo(Long value) {
            addCriterion("MJ <>", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjGreaterThan(Long value) {
            addCriterion("MJ >", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjGreaterThanOrEqualTo(Long value) {
            addCriterion("MJ >=", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjLessThan(Long value) {
            addCriterion("MJ <", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjLessThanOrEqualTo(Long value) {
            addCriterion("MJ <=", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjIn(List<Long> values) {
            addCriterion("MJ in", values, "mj");
            return (Criteria) this;
        }

        public Criteria andMjNotIn(List<Long> values) {
            addCriterion("MJ not in", values, "mj");
            return (Criteria) this;
        }

        public Criteria andMjBetween(Long value1, Long value2) {
            addCriterion("MJ between", value1, value2, "mj");
            return (Criteria) this;
        }

        public Criteria andMjNotBetween(Long value1, Long value2) {
            addCriterion("MJ not between", value1, value2, "mj");
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

        public Criteria andLrryEqualTo(Long value) {
            addCriterion("LRRY =", value, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryNotEqualTo(Long value) {
            addCriterion("LRRY <>", value, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryGreaterThan(Long value) {
            addCriterion("LRRY >", value, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryGreaterThanOrEqualTo(Long value) {
            addCriterion("LRRY >=", value, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryLessThan(Long value) {
            addCriterion("LRRY <", value, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryLessThanOrEqualTo(Long value) {
            addCriterion("LRRY <=", value, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryIn(List<Long> values) {
            addCriterion("LRRY in", values, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryNotIn(List<Long> values) {
            addCriterion("LRRY not in", values, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryBetween(Long value1, Long value2) {
            addCriterion("LRRY between", value1, value2, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryNotBetween(Long value1, Long value2) {
            addCriterion("LRRY not between", value1, value2, "lrry");
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

        public Criteria andAjlxIsNull() {
            addCriterion("AJLX is null");
            return (Criteria) this;
        }

        public Criteria andAjlxIsNotNull() {
            addCriterion("AJLX is not null");
            return (Criteria) this;
        }

        public Criteria andAjlxEqualTo(Long value) {
            addCriterion("AJLX =", value, "ajlx");
            return (Criteria) this;
        }

        public Criteria andAjlxNotEqualTo(Long value) {
            addCriterion("AJLX <>", value, "ajlx");
            return (Criteria) this;
        }

        public Criteria andAjlxGreaterThan(Long value) {
            addCriterion("AJLX >", value, "ajlx");
            return (Criteria) this;
        }

        public Criteria andAjlxGreaterThanOrEqualTo(Long value) {
            addCriterion("AJLX >=", value, "ajlx");
            return (Criteria) this;
        }

        public Criteria andAjlxLessThan(Long value) {
            addCriterion("AJLX <", value, "ajlx");
            return (Criteria) this;
        }

        public Criteria andAjlxLessThanOrEqualTo(Long value) {
            addCriterion("AJLX <=", value, "ajlx");
            return (Criteria) this;
        }

        public Criteria andAjlxIn(List<Long> values) {
            addCriterion("AJLX in", values, "ajlx");
            return (Criteria) this;
        }

        public Criteria andAjlxNotIn(List<Long> values) {
            addCriterion("AJLX not in", values, "ajlx");
            return (Criteria) this;
        }

        public Criteria andAjlxBetween(Long value1, Long value2) {
            addCriterion("AJLX between", value1, value2, "ajlx");
            return (Criteria) this;
        }

        public Criteria andAjlxNotBetween(Long value1, Long value2) {
            addCriterion("AJLX not between", value1, value2, "ajlx");
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

        public Criteria andDahbhEqualTo(String value) {
            addCriterion("DAHBH =", value, "dahbh");
            return (Criteria) this;
        }

        public Criteria andDahbhNotEqualTo(String value) {
            addCriterion("DAHBH <>", value, "dahbh");
            return (Criteria) this;
        }

        public Criteria andDahbhGreaterThan(String value) {
            addCriterion("DAHBH >", value, "dahbh");
            return (Criteria) this;
        }

        public Criteria andDahbhGreaterThanOrEqualTo(String value) {
            addCriterion("DAHBH >=", value, "dahbh");
            return (Criteria) this;
        }

        public Criteria andDahbhLessThan(String value) {
            addCriterion("DAHBH <", value, "dahbh");
            return (Criteria) this;
        }

        public Criteria andDahbhLessThanOrEqualTo(String value) {
            addCriterion("DAHBH <=", value, "dahbh");
            return (Criteria) this;
        }

        public Criteria andDahbhLike(String value) {
            addCriterion("DAHBH like", value, "dahbh");
            return (Criteria) this;
        }

        public Criteria andDahbhNotLike(String value) {
            addCriterion("DAHBH not like", value, "dahbh");
            return (Criteria) this;
        }

        public Criteria andDahbhIn(List<String> values) {
            addCriterion("DAHBH in", values, "dahbh");
            return (Criteria) this;
        }

        public Criteria andDahbhNotIn(List<String> values) {
            addCriterion("DAHBH not in", values, "dahbh");
            return (Criteria) this;
        }

        public Criteria andDahbhBetween(String value1, String value2) {
            addCriterion("DAHBH between", value1, value2, "dahbh");
            return (Criteria) this;
        }

        public Criteria andDahbhNotBetween(String value1, String value2) {
            addCriterion("DAHBH not between", value1, value2, "dahbh");
            return (Criteria) this;
        }

        public Criteria andFbbzIsNull() {
            addCriterion("FBBZ is null");
            return (Criteria) this;
        }

        public Criteria andFbbzIsNotNull() {
            addCriterion("FBBZ is not null");
            return (Criteria) this;
        }

        public Criteria andFbbzEqualTo(Long value) {
            addCriterion("FBBZ =", value, "fbbz");
            return (Criteria) this;
        }

        public Criteria andFbbzNotEqualTo(Long value) {
            addCriterion("FBBZ <>", value, "fbbz");
            return (Criteria) this;
        }

        public Criteria andFbbzGreaterThan(Long value) {
            addCriterion("FBBZ >", value, "fbbz");
            return (Criteria) this;
        }

        public Criteria andFbbzGreaterThanOrEqualTo(Long value) {
            addCriterion("FBBZ >=", value, "fbbz");
            return (Criteria) this;
        }

        public Criteria andFbbzLessThan(Long value) {
            addCriterion("FBBZ <", value, "fbbz");
            return (Criteria) this;
        }

        public Criteria andFbbzLessThanOrEqualTo(Long value) {
            addCriterion("FBBZ <=", value, "fbbz");
            return (Criteria) this;
        }

        public Criteria andFbbzIn(List<Long> values) {
            addCriterion("FBBZ in", values, "fbbz");
            return (Criteria) this;
        }

        public Criteria andFbbzNotIn(List<Long> values) {
            addCriterion("FBBZ not in", values, "fbbz");
            return (Criteria) this;
        }

        public Criteria andFbbzBetween(Long value1, Long value2) {
            addCriterion("FBBZ between", value1, value2, "fbbz");
            return (Criteria) this;
        }

        public Criteria andFbbzNotBetween(Long value1, Long value2) {
            addCriterion("FBBZ not between", value1, value2, "fbbz");
            return (Criteria) this;
        }

        public Criteria andYxbzIsNull() {
            addCriterion("YXBZ is null");
            return (Criteria) this;
        }

        public Criteria andYxbzIsNotNull() {
            addCriterion("YXBZ is not null");
            return (Criteria) this;
        }

        public Criteria andYxbzEqualTo(Long value) {
            addCriterion("YXBZ =", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotEqualTo(Long value) {
            addCriterion("YXBZ <>", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzGreaterThan(Long value) {
            addCriterion("YXBZ >", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzGreaterThanOrEqualTo(Long value) {
            addCriterion("YXBZ >=", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzLessThan(Long value) {
            addCriterion("YXBZ <", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzLessThanOrEqualTo(Long value) {
            addCriterion("YXBZ <=", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzIn(List<Long> values) {
            addCriterion("YXBZ in", values, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotIn(List<Long> values) {
            addCriterion("YXBZ not in", values, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzBetween(Long value1, Long value2) {
            addCriterion("YXBZ between", value1, value2, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotBetween(Long value1, Long value2) {
            addCriterion("YXBZ not between", value1, value2, "yxbz");
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

        public Criteria andDagbhEqualTo(String value) {
            addCriterion("DAGBH =", value, "dagbh");
            return (Criteria) this;
        }

        public Criteria andDagbhNotEqualTo(String value) {
            addCriterion("DAGBH <>", value, "dagbh");
            return (Criteria) this;
        }

        public Criteria andDagbhGreaterThan(String value) {
            addCriterion("DAGBH >", value, "dagbh");
            return (Criteria) this;
        }

        public Criteria andDagbhGreaterThanOrEqualTo(String value) {
            addCriterion("DAGBH >=", value, "dagbh");
            return (Criteria) this;
        }

        public Criteria andDagbhLessThan(String value) {
            addCriterion("DAGBH <", value, "dagbh");
            return (Criteria) this;
        }

        public Criteria andDagbhLessThanOrEqualTo(String value) {
            addCriterion("DAGBH <=", value, "dagbh");
            return (Criteria) this;
        }

        public Criteria andDagbhLike(String value) {
            addCriterion("DAGBH like", value, "dagbh");
            return (Criteria) this;
        }

        public Criteria andDagbhNotLike(String value) {
            addCriterion("DAGBH not like", value, "dagbh");
            return (Criteria) this;
        }

        public Criteria andDagbhIn(List<String> values) {
            addCriterion("DAGBH in", values, "dagbh");
            return (Criteria) this;
        }

        public Criteria andDagbhNotIn(List<String> values) {
            addCriterion("DAGBH not in", values, "dagbh");
            return (Criteria) this;
        }

        public Criteria andDagbhBetween(String value1, String value2) {
            addCriterion("DAGBH between", value1, value2, "dagbh");
            return (Criteria) this;
        }

        public Criteria andDagbhNotBetween(String value1, String value2) {
            addCriterion("DAGBH not between", value1, value2, "dagbh");
            return (Criteria) this;
        }

        public Criteria andGdhIsNull() {
            addCriterion("GDH is null");
            return (Criteria) this;
        }

        public Criteria andGdhIsNotNull() {
            addCriterion("GDH is not null");
            return (Criteria) this;
        }

        public Criteria andGdhEqualTo(String value) {
            addCriterion("GDH =", value, "gdh");
            return (Criteria) this;
        }

        public Criteria andGdhNotEqualTo(String value) {
            addCriterion("GDH <>", value, "gdh");
            return (Criteria) this;
        }

        public Criteria andGdhGreaterThan(String value) {
            addCriterion("GDH >", value, "gdh");
            return (Criteria) this;
        }

        public Criteria andGdhGreaterThanOrEqualTo(String value) {
            addCriterion("GDH >=", value, "gdh");
            return (Criteria) this;
        }

        public Criteria andGdhLessThan(String value) {
            addCriterion("GDH <", value, "gdh");
            return (Criteria) this;
        }

        public Criteria andGdhLessThanOrEqualTo(String value) {
            addCriterion("GDH <=", value, "gdh");
            return (Criteria) this;
        }

        public Criteria andGdhLike(String value) {
            addCriterion("GDH like", value, "gdh");
            return (Criteria) this;
        }

        public Criteria andGdhNotLike(String value) {
            addCriterion("GDH not like", value, "gdh");
            return (Criteria) this;
        }

        public Criteria andGdhIn(List<String> values) {
            addCriterion("GDH in", values, "gdh");
            return (Criteria) this;
        }

        public Criteria andGdhNotIn(List<String> values) {
            addCriterion("GDH not in", values, "gdh");
            return (Criteria) this;
        }

        public Criteria andGdhBetween(String value1, String value2) {
            addCriterion("GDH between", value1, value2, "gdh");
            return (Criteria) this;
        }

        public Criteria andGdhNotBetween(String value1, String value2) {
            addCriterion("GDH not between", value1, value2, "gdh");
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

        public Criteria andFajidEqualTo(Short value) {
            addCriterion("FAJID =", value, "fajid");
            return (Criteria) this;
        }

        public Criteria andFajidNotEqualTo(Short value) {
            addCriterion("FAJID <>", value, "fajid");
            return (Criteria) this;
        }

        public Criteria andFajidGreaterThan(Short value) {
            addCriterion("FAJID >", value, "fajid");
            return (Criteria) this;
        }

        public Criteria andFajidGreaterThanOrEqualTo(Short value) {
            addCriterion("FAJID >=", value, "fajid");
            return (Criteria) this;
        }

        public Criteria andFajidLessThan(Short value) {
            addCriterion("FAJID <", value, "fajid");
            return (Criteria) this;
        }

        public Criteria andFajidLessThanOrEqualTo(Short value) {
            addCriterion("FAJID <=", value, "fajid");
            return (Criteria) this;
        }

        public Criteria andFajidIn(List<Short> values) {
            addCriterion("FAJID in", values, "fajid");
            return (Criteria) this;
        }

        public Criteria andFajidNotIn(List<Short> values) {
            addCriterion("FAJID not in", values, "fajid");
            return (Criteria) this;
        }

        public Criteria andFajidBetween(Short value1, Short value2) {
            addCriterion("FAJID between", value1, value2, "fajid");
            return (Criteria) this;
        }

        public Criteria andFajidNotBetween(Short value1, Short value2) {
            addCriterion("FAJID not between", value1, value2, "fajid");
            return (Criteria) this;
        }

        public Criteria andSfzxIsNull() {
            addCriterion("SFZX is null");
            return (Criteria) this;
        }

        public Criteria andSfzxIsNotNull() {
            addCriterion("SFZX is not null");
            return (Criteria) this;
        }

        public Criteria andSfzxEqualTo(Long value) {
            addCriterion("SFZX =", value, "sfzx");
            return (Criteria) this;
        }

        public Criteria andSfzxNotEqualTo(Long value) {
            addCriterion("SFZX <>", value, "sfzx");
            return (Criteria) this;
        }

        public Criteria andSfzxGreaterThan(Long value) {
            addCriterion("SFZX >", value, "sfzx");
            return (Criteria) this;
        }

        public Criteria andSfzxGreaterThanOrEqualTo(Long value) {
            addCriterion("SFZX >=", value, "sfzx");
            return (Criteria) this;
        }

        public Criteria andSfzxLessThan(Long value) {
            addCriterion("SFZX <", value, "sfzx");
            return (Criteria) this;
        }

        public Criteria andSfzxLessThanOrEqualTo(Long value) {
            addCriterion("SFZX <=", value, "sfzx");
            return (Criteria) this;
        }

        public Criteria andSfzxIn(List<Long> values) {
            addCriterion("SFZX in", values, "sfzx");
            return (Criteria) this;
        }

        public Criteria andSfzxNotIn(List<Long> values) {
            addCriterion("SFZX not in", values, "sfzx");
            return (Criteria) this;
        }

        public Criteria andSfzxBetween(Long value1, Long value2) {
            addCriterion("SFZX between", value1, value2, "sfzx");
            return (Criteria) this;
        }

        public Criteria andSfzxNotBetween(Long value1, Long value2) {
            addCriterion("SFZX not between", value1, value2, "sfzx");
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

        public Criteria andSlryIsNull() {
            addCriterion("SLRY is null");
            return (Criteria) this;
        }

        public Criteria andSlryIsNotNull() {
            addCriterion("SLRY is not null");
            return (Criteria) this;
        }

        public Criteria andSlryEqualTo(Object value) {
            addCriterion("SLRY =", value, "slry");
            return (Criteria) this;
        }

        public Criteria andSlryNotEqualTo(Object value) {
            addCriterion("SLRY <>", value, "slry");
            return (Criteria) this;
        }

        public Criteria andSlryGreaterThan(Object value) {
            addCriterion("SLRY >", value, "slry");
            return (Criteria) this;
        }

        public Criteria andSlryGreaterThanOrEqualTo(Object value) {
            addCriterion("SLRY >=", value, "slry");
            return (Criteria) this;
        }

        public Criteria andSlryLessThan(Object value) {
            addCriterion("SLRY <", value, "slry");
            return (Criteria) this;
        }

        public Criteria andSlryLessThanOrEqualTo(Object value) {
            addCriterion("SLRY <=", value, "slry");
            return (Criteria) this;
        }

        public Criteria andSlryIn(List<Object> values) {
            addCriterion("SLRY in", values, "slry");
            return (Criteria) this;
        }

        public Criteria andSlryNotIn(List<Object> values) {
            addCriterion("SLRY not in", values, "slry");
            return (Criteria) this;
        }

        public Criteria andSlryBetween(Object value1, Object value2) {
            addCriterion("SLRY between", value1, value2, "slry");
            return (Criteria) this;
        }

        public Criteria andSlryNotBetween(Object value1, Object value2) {
            addCriterion("SLRY not between", value1, value2, "slry");
            return (Criteria) this;
        }

        public Criteria andSlrqIsNull() {
            addCriterion("SLRQ is null");
            return (Criteria) this;
        }

        public Criteria andSlrqIsNotNull() {
            addCriterion("SLRQ is not null");
            return (Criteria) this;
        }

        public Criteria andSlrqEqualTo(Date value) {
            addCriterion("SLRQ =", value, "slrq");
            return (Criteria) this;
        }

        public Criteria andSlrqNotEqualTo(Date value) {
            addCriterion("SLRQ <>", value, "slrq");
            return (Criteria) this;
        }

        public Criteria andSlrqGreaterThan(Date value) {
            addCriterion("SLRQ >", value, "slrq");
            return (Criteria) this;
        }

        public Criteria andSlrqGreaterThanOrEqualTo(Date value) {
            addCriterion("SLRQ >=", value, "slrq");
            return (Criteria) this;
        }

        public Criteria andSlrqLessThan(Date value) {
            addCriterion("SLRQ <", value, "slrq");
            return (Criteria) this;
        }

        public Criteria andSlrqLessThanOrEqualTo(Date value) {
            addCriterion("SLRQ <=", value, "slrq");
            return (Criteria) this;
        }

        public Criteria andSlrqIn(List<Date> values) {
            addCriterion("SLRQ in", values, "slrq");
            return (Criteria) this;
        }

        public Criteria andSlrqNotIn(List<Date> values) {
            addCriterion("SLRQ not in", values, "slrq");
            return (Criteria) this;
        }

        public Criteria andSlrqBetween(Date value1, Date value2) {
            addCriterion("SLRQ between", value1, value2, "slrq");
            return (Criteria) this;
        }

        public Criteria andSlrqNotBetween(Date value1, Date value2) {
            addCriterion("SLRQ not between", value1, value2, "slrq");
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

        public Criteria andProdefmainidIsNull() {
            addCriterion("PRODEFMAINID is null");
            return (Criteria) this;
        }

        public Criteria andProdefmainidIsNotNull() {
            addCriterion("PRODEFMAINID is not null");
            return (Criteria) this;
        }

        public Criteria andProdefmainidEqualTo(Long value) {
            addCriterion("PRODEFMAINID =", value, "prodefmainid");
            return (Criteria) this;
        }

        public Criteria andProdefmainidNotEqualTo(Long value) {
            addCriterion("PRODEFMAINID <>", value, "prodefmainid");
            return (Criteria) this;
        }

        public Criteria andProdefmainidGreaterThan(Long value) {
            addCriterion("PRODEFMAINID >", value, "prodefmainid");
            return (Criteria) this;
        }

        public Criteria andProdefmainidGreaterThanOrEqualTo(Long value) {
            addCriterion("PRODEFMAINID >=", value, "prodefmainid");
            return (Criteria) this;
        }

        public Criteria andProdefmainidLessThan(Long value) {
            addCriterion("PRODEFMAINID <", value, "prodefmainid");
            return (Criteria) this;
        }

        public Criteria andProdefmainidLessThanOrEqualTo(Long value) {
            addCriterion("PRODEFMAINID <=", value, "prodefmainid");
            return (Criteria) this;
        }

        public Criteria andProdefmainidIn(List<Long> values) {
            addCriterion("PRODEFMAINID in", values, "prodefmainid");
            return (Criteria) this;
        }

        public Criteria andProdefmainidNotIn(List<Long> values) {
            addCriterion("PRODEFMAINID not in", values, "prodefmainid");
            return (Criteria) this;
        }

        public Criteria andProdefmainidBetween(Long value1, Long value2) {
            addCriterion("PRODEFMAINID between", value1, value2, "prodefmainid");
            return (Criteria) this;
        }

        public Criteria andProdefmainidNotBetween(Long value1, Long value2) {
            addCriterion("PRODEFMAINID not between", value1, value2, "prodefmainid");
            return (Criteria) this;
        }

        public Criteria andTypeNumberIsNull() {
            addCriterion("TYPE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTypeNumberIsNotNull() {
            addCriterion("TYPE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNumberEqualTo(String value) {
            addCriterion("TYPE_NUMBER =", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberNotEqualTo(String value) {
            addCriterion("TYPE_NUMBER <>", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberGreaterThan(String value) {
            addCriterion("TYPE_NUMBER >", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_NUMBER >=", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberLessThan(String value) {
            addCriterion("TYPE_NUMBER <", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberLessThanOrEqualTo(String value) {
            addCriterion("TYPE_NUMBER <=", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberLike(String value) {
            addCriterion("TYPE_NUMBER like", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberNotLike(String value) {
            addCriterion("TYPE_NUMBER not like", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberIn(List<String> values) {
            addCriterion("TYPE_NUMBER in", values, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberNotIn(List<String> values) {
            addCriterion("TYPE_NUMBER not in", values, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberBetween(String value1, String value2) {
            addCriterion("TYPE_NUMBER between", value1, value2, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberNotBetween(String value1, String value2) {
            addCriterion("TYPE_NUMBER not between", value1, value2, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andBsmIsNull() {
            addCriterion("BSM is null");
            return (Criteria) this;
        }

        public Criteria andBsmIsNotNull() {
            addCriterion("BSM is not null");
            return (Criteria) this;
        }

        public Criteria andBsmEqualTo(Short value) {
            addCriterion("BSM =", value, "bsm");
            return (Criteria) this;
        }

        public Criteria andBsmNotEqualTo(Short value) {
            addCriterion("BSM <>", value, "bsm");
            return (Criteria) this;
        }

        public Criteria andBsmGreaterThan(Short value) {
            addCriterion("BSM >", value, "bsm");
            return (Criteria) this;
        }

        public Criteria andBsmGreaterThanOrEqualTo(Short value) {
            addCriterion("BSM >=", value, "bsm");
            return (Criteria) this;
        }

        public Criteria andBsmLessThan(Short value) {
            addCriterion("BSM <", value, "bsm");
            return (Criteria) this;
        }

        public Criteria andBsmLessThanOrEqualTo(Short value) {
            addCriterion("BSM <=", value, "bsm");
            return (Criteria) this;
        }

        public Criteria andBsmIn(List<Short> values) {
            addCriterion("BSM in", values, "bsm");
            return (Criteria) this;
        }

        public Criteria andBsmNotIn(List<Short> values) {
            addCriterion("BSM not in", values, "bsm");
            return (Criteria) this;
        }

        public Criteria andBsmBetween(Short value1, Short value2) {
            addCriterion("BSM between", value1, value2, "bsm");
            return (Criteria) this;
        }

        public Criteria andBsmNotBetween(Short value1, Short value2) {
            addCriterion("BSM not between", value1, value2, "bsm");
            return (Criteria) this;
        }

        public Criteria andLcbhIsNull() {
            addCriterion("LCBH is null");
            return (Criteria) this;
        }

        public Criteria andLcbhIsNotNull() {
            addCriterion("LCBH is not null");
            return (Criteria) this;
        }

        public Criteria andLcbhEqualTo(Short value) {
            addCriterion("LCBH =", value, "lcbh");
            return (Criteria) this;
        }

        public Criteria andLcbhNotEqualTo(Short value) {
            addCriterion("LCBH <>", value, "lcbh");
            return (Criteria) this;
        }

        public Criteria andLcbhGreaterThan(Short value) {
            addCriterion("LCBH >", value, "lcbh");
            return (Criteria) this;
        }

        public Criteria andLcbhGreaterThanOrEqualTo(Short value) {
            addCriterion("LCBH >=", value, "lcbh");
            return (Criteria) this;
        }

        public Criteria andLcbhLessThan(Short value) {
            addCriterion("LCBH <", value, "lcbh");
            return (Criteria) this;
        }

        public Criteria andLcbhLessThanOrEqualTo(Short value) {
            addCriterion("LCBH <=", value, "lcbh");
            return (Criteria) this;
        }

        public Criteria andLcbhIn(List<Short> values) {
            addCriterion("LCBH in", values, "lcbh");
            return (Criteria) this;
        }

        public Criteria andLcbhNotIn(List<Short> values) {
            addCriterion("LCBH not in", values, "lcbh");
            return (Criteria) this;
        }

        public Criteria andLcbhBetween(Short value1, Short value2) {
            addCriterion("LCBH between", value1, value2, "lcbh");
            return (Criteria) this;
        }

        public Criteria andLcbhNotBetween(Short value1, Short value2) {
            addCriterion("LCBH not between", value1, value2, "lcbh");
            return (Criteria) this;
        }

        public Criteria andSllxbhIsNull() {
            addCriterion("SLLXBH is null");
            return (Criteria) this;
        }

        public Criteria andSllxbhIsNotNull() {
            addCriterion("SLLXBH is not null");
            return (Criteria) this;
        }

        public Criteria andSllxbhEqualTo(Short value) {
            addCriterion("SLLXBH =", value, "sllxbh");
            return (Criteria) this;
        }

        public Criteria andSllxbhNotEqualTo(Short value) {
            addCriterion("SLLXBH <>", value, "sllxbh");
            return (Criteria) this;
        }

        public Criteria andSllxbhGreaterThan(Short value) {
            addCriterion("SLLXBH >", value, "sllxbh");
            return (Criteria) this;
        }

        public Criteria andSllxbhGreaterThanOrEqualTo(Short value) {
            addCriterion("SLLXBH >=", value, "sllxbh");
            return (Criteria) this;
        }

        public Criteria andSllxbhLessThan(Short value) {
            addCriterion("SLLXBH <", value, "sllxbh");
            return (Criteria) this;
        }

        public Criteria andSllxbhLessThanOrEqualTo(Short value) {
            addCriterion("SLLXBH <=", value, "sllxbh");
            return (Criteria) this;
        }

        public Criteria andSllxbhIn(List<Short> values) {
            addCriterion("SLLXBH in", values, "sllxbh");
            return (Criteria) this;
        }

        public Criteria andSllxbhNotIn(List<Short> values) {
            addCriterion("SLLXBH not in", values, "sllxbh");
            return (Criteria) this;
        }

        public Criteria andSllxbhBetween(Short value1, Short value2) {
            addCriterion("SLLXBH between", value1, value2, "sllxbh");
            return (Criteria) this;
        }

        public Criteria andSllxbhNotBetween(Short value1, Short value2) {
            addCriterion("SLLXBH not between", value1, value2, "sllxbh");
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

        public Criteria andLrrIsNull() {
            addCriterion("LRR is null");
            return (Criteria) this;
        }

        public Criteria andLrrIsNotNull() {
            addCriterion("LRR is not null");
            return (Criteria) this;
        }

        public Criteria andLrrEqualTo(Object value) {
            addCriterion("LRR =", value, "lrr");
            return (Criteria) this;
        }

        public Criteria andLrrNotEqualTo(Object value) {
            addCriterion("LRR <>", value, "lrr");
            return (Criteria) this;
        }

        public Criteria andLrrGreaterThan(Object value) {
            addCriterion("LRR >", value, "lrr");
            return (Criteria) this;
        }

        public Criteria andLrrGreaterThanOrEqualTo(Object value) {
            addCriterion("LRR >=", value, "lrr");
            return (Criteria) this;
        }

        public Criteria andLrrLessThan(Object value) {
            addCriterion("LRR <", value, "lrr");
            return (Criteria) this;
        }

        public Criteria andLrrLessThanOrEqualTo(Object value) {
            addCriterion("LRR <=", value, "lrr");
            return (Criteria) this;
        }

        public Criteria andLrrIn(List<Object> values) {
            addCriterion("LRR in", values, "lrr");
            return (Criteria) this;
        }

        public Criteria andLrrNotIn(List<Object> values) {
            addCriterion("LRR not in", values, "lrr");
            return (Criteria) this;
        }

        public Criteria andLrrBetween(Object value1, Object value2) {
            addCriterion("LRR between", value1, value2, "lrr");
            return (Criteria) this;
        }

        public Criteria andLrrNotBetween(Object value1, Object value2) {
            addCriterion("LRR not between", value1, value2, "lrr");
            return (Criteria) this;
        }

        public Criteria andMlbhIsNull() {
            addCriterion("MLBH is null");
            return (Criteria) this;
        }

        public Criteria andMlbhIsNotNull() {
            addCriterion("MLBH is not null");
            return (Criteria) this;
        }

        public Criteria andMlbhEqualTo(Object value) {
            addCriterion("MLBH =", value, "mlbh");
            return (Criteria) this;
        }

        public Criteria andMlbhNotEqualTo(Object value) {
            addCriterion("MLBH <>", value, "mlbh");
            return (Criteria) this;
        }

        public Criteria andMlbhGreaterThan(Object value) {
            addCriterion("MLBH >", value, "mlbh");
            return (Criteria) this;
        }

        public Criteria andMlbhGreaterThanOrEqualTo(Object value) {
            addCriterion("MLBH >=", value, "mlbh");
            return (Criteria) this;
        }

        public Criteria andMlbhLessThan(Object value) {
            addCriterion("MLBH <", value, "mlbh");
            return (Criteria) this;
        }

        public Criteria andMlbhLessThanOrEqualTo(Object value) {
            addCriterion("MLBH <=", value, "mlbh");
            return (Criteria) this;
        }

        public Criteria andMlbhIn(List<Object> values) {
            addCriterion("MLBH in", values, "mlbh");
            return (Criteria) this;
        }

        public Criteria andMlbhNotIn(List<Object> values) {
            addCriterion("MLBH not in", values, "mlbh");
            return (Criteria) this;
        }

        public Criteria andMlbhBetween(Object value1, Object value2) {
            addCriterion("MLBH between", value1, value2, "mlbh");
            return (Criteria) this;
        }

        public Criteria andMlbhNotBetween(Object value1, Object value2) {
            addCriterion("MLBH not between", value1, value2, "mlbh");
            return (Criteria) this;
        }

        public Criteria andYdahIsNull() {
            addCriterion("YDAH is null");
            return (Criteria) this;
        }

        public Criteria andYdahIsNotNull() {
            addCriterion("YDAH is not null");
            return (Criteria) this;
        }

        public Criteria andYdahEqualTo(String value) {
            addCriterion("YDAH =", value, "ydah");
            return (Criteria) this;
        }

        public Criteria andYdahNotEqualTo(String value) {
            addCriterion("YDAH <>", value, "ydah");
            return (Criteria) this;
        }

        public Criteria andYdahGreaterThan(String value) {
            addCriterion("YDAH >", value, "ydah");
            return (Criteria) this;
        }

        public Criteria andYdahGreaterThanOrEqualTo(String value) {
            addCriterion("YDAH >=", value, "ydah");
            return (Criteria) this;
        }

        public Criteria andYdahLessThan(String value) {
            addCriterion("YDAH <", value, "ydah");
            return (Criteria) this;
        }

        public Criteria andYdahLessThanOrEqualTo(String value) {
            addCriterion("YDAH <=", value, "ydah");
            return (Criteria) this;
        }

        public Criteria andYdahLike(String value) {
            addCriterion("YDAH like", value, "ydah");
            return (Criteria) this;
        }

        public Criteria andYdahNotLike(String value) {
            addCriterion("YDAH not like", value, "ydah");
            return (Criteria) this;
        }

        public Criteria andYdahIn(List<String> values) {
            addCriterion("YDAH in", values, "ydah");
            return (Criteria) this;
        }

        public Criteria andYdahNotIn(List<String> values) {
            addCriterion("YDAH not in", values, "ydah");
            return (Criteria) this;
        }

        public Criteria andYdahBetween(String value1, String value2) {
            addCriterion("YDAH between", value1, value2, "ydah");
            return (Criteria) this;
        }

        public Criteria andYdahNotBetween(String value1, String value2) {
            addCriterion("YDAH not between", value1, value2, "ydah");
            return (Criteria) this;
        }

        public Criteria andAjbmIsNull() {
            addCriterion("AJBM is null");
            return (Criteria) this;
        }

        public Criteria andAjbmIsNotNull() {
            addCriterion("AJBM is not null");
            return (Criteria) this;
        }

        public Criteria andAjbmEqualTo(Object value) {
            addCriterion("AJBM =", value, "ajbm");
            return (Criteria) this;
        }

        public Criteria andAjbmNotEqualTo(Object value) {
            addCriterion("AJBM <>", value, "ajbm");
            return (Criteria) this;
        }

        public Criteria andAjbmGreaterThan(Object value) {
            addCriterion("AJBM >", value, "ajbm");
            return (Criteria) this;
        }

        public Criteria andAjbmGreaterThanOrEqualTo(Object value) {
            addCriterion("AJBM >=", value, "ajbm");
            return (Criteria) this;
        }

        public Criteria andAjbmLessThan(Object value) {
            addCriterion("AJBM <", value, "ajbm");
            return (Criteria) this;
        }

        public Criteria andAjbmLessThanOrEqualTo(Object value) {
            addCriterion("AJBM <=", value, "ajbm");
            return (Criteria) this;
        }

        public Criteria andAjbmIn(List<Object> values) {
            addCriterion("AJBM in", values, "ajbm");
            return (Criteria) this;
        }

        public Criteria andAjbmNotIn(List<Object> values) {
            addCriterion("AJBM not in", values, "ajbm");
            return (Criteria) this;
        }

        public Criteria andAjbmBetween(Object value1, Object value2) {
            addCriterion("AJBM between", value1, value2, "ajbm");
            return (Criteria) this;
        }

        public Criteria andAjbmNotBetween(Object value1, Object value2) {
            addCriterion("AJBM not between", value1, value2, "ajbm");
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

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Object value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Object value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Object value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Object value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Object value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Object value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Object> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Object> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Object value1, Object value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Object value1, Object value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andAjTypeIsNull() {
            addCriterion("AJ_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAjTypeIsNotNull() {
            addCriterion("AJ_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAjTypeEqualTo(Integer value) {
            addCriterion("AJ_TYPE =", value, "ajType");
            return (Criteria) this;
        }

        public Criteria andAjTypeNotEqualTo(Integer value) {
            addCriterion("AJ_TYPE <>", value, "ajType");
            return (Criteria) this;
        }

        public Criteria andAjTypeGreaterThan(Integer value) {
            addCriterion("AJ_TYPE >", value, "ajType");
            return (Criteria) this;
        }

        public Criteria andAjTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AJ_TYPE >=", value, "ajType");
            return (Criteria) this;
        }

        public Criteria andAjTypeLessThan(Integer value) {
            addCriterion("AJ_TYPE <", value, "ajType");
            return (Criteria) this;
        }

        public Criteria andAjTypeLessThanOrEqualTo(Integer value) {
            addCriterion("AJ_TYPE <=", value, "ajType");
            return (Criteria) this;
        }

        public Criteria andAjTypeIn(List<Integer> values) {
            addCriterion("AJ_TYPE in", values, "ajType");
            return (Criteria) this;
        }

        public Criteria andAjTypeNotIn(List<Integer> values) {
            addCriterion("AJ_TYPE not in", values, "ajType");
            return (Criteria) this;
        }

        public Criteria andAjTypeBetween(Integer value1, Integer value2) {
            addCriterion("AJ_TYPE between", value1, value2, "ajType");
            return (Criteria) this;
        }

        public Criteria andAjTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("AJ_TYPE not between", value1, value2, "ajType");
            return (Criteria) this;
        }

        public Criteria andMsgexIsNull() {
            addCriterion("MSGEX is null");
            return (Criteria) this;
        }

        public Criteria andMsgexIsNotNull() {
            addCriterion("MSGEX is not null");
            return (Criteria) this;
        }

        public Criteria andMsgexEqualTo(Object value) {
            addCriterion("MSGEX =", value, "msgex");
            return (Criteria) this;
        }

        public Criteria andMsgexNotEqualTo(Object value) {
            addCriterion("MSGEX <>", value, "msgex");
            return (Criteria) this;
        }

        public Criteria andMsgexGreaterThan(Object value) {
            addCriterion("MSGEX >", value, "msgex");
            return (Criteria) this;
        }

        public Criteria andMsgexGreaterThanOrEqualTo(Object value) {
            addCriterion("MSGEX >=", value, "msgex");
            return (Criteria) this;
        }

        public Criteria andMsgexLessThan(Object value) {
            addCriterion("MSGEX <", value, "msgex");
            return (Criteria) this;
        }

        public Criteria andMsgexLessThanOrEqualTo(Object value) {
            addCriterion("MSGEX <=", value, "msgex");
            return (Criteria) this;
        }

        public Criteria andMsgexIn(List<Object> values) {
            addCriterion("MSGEX in", values, "msgex");
            return (Criteria) this;
        }

        public Criteria andMsgexNotIn(List<Object> values) {
            addCriterion("MSGEX not in", values, "msgex");
            return (Criteria) this;
        }

        public Criteria andMsgexBetween(Object value1, Object value2) {
            addCriterion("MSGEX between", value1, value2, "msgex");
            return (Criteria) this;
        }

        public Criteria andMsgexNotBetween(Object value1, Object value2) {
            addCriterion("MSGEX not between", value1, value2, "msgex");
            return (Criteria) this;
        }

        public Criteria andIsvolumeIsNull() {
            addCriterion("ISVOLUME is null");
            return (Criteria) this;
        }

        public Criteria andIsvolumeIsNotNull() {
            addCriterion("ISVOLUME is not null");
            return (Criteria) this;
        }

        public Criteria andIsvolumeEqualTo(String value) {
            addCriterion("ISVOLUME =", value, "isvolume");
            return (Criteria) this;
        }

        public Criteria andIsvolumeNotEqualTo(String value) {
            addCriterion("ISVOLUME <>", value, "isvolume");
            return (Criteria) this;
        }

        public Criteria andIsvolumeGreaterThan(String value) {
            addCriterion("ISVOLUME >", value, "isvolume");
            return (Criteria) this;
        }

        public Criteria andIsvolumeGreaterThanOrEqualTo(String value) {
            addCriterion("ISVOLUME >=", value, "isvolume");
            return (Criteria) this;
        }

        public Criteria andIsvolumeLessThan(String value) {
            addCriterion("ISVOLUME <", value, "isvolume");
            return (Criteria) this;
        }

        public Criteria andIsvolumeLessThanOrEqualTo(String value) {
            addCriterion("ISVOLUME <=", value, "isvolume");
            return (Criteria) this;
        }

        public Criteria andIsvolumeLike(String value) {
            addCriterion("ISVOLUME like", value, "isvolume");
            return (Criteria) this;
        }

        public Criteria andIsvolumeNotLike(String value) {
            addCriterion("ISVOLUME not like", value, "isvolume");
            return (Criteria) this;
        }

        public Criteria andIsvolumeIn(List<String> values) {
            addCriterion("ISVOLUME in", values, "isvolume");
            return (Criteria) this;
        }

        public Criteria andIsvolumeNotIn(List<String> values) {
            addCriterion("ISVOLUME not in", values, "isvolume");
            return (Criteria) this;
        }

        public Criteria andIsvolumeBetween(String value1, String value2) {
            addCriterion("ISVOLUME between", value1, value2, "isvolume");
            return (Criteria) this;
        }

        public Criteria andIsvolumeNotBetween(String value1, String value2) {
            addCriterion("ISVOLUME not between", value1, value2, "isvolume");
            return (Criteria) this;
        }

        public Criteria andDjdlIsNull() {
            addCriterion("DJDL is null");
            return (Criteria) this;
        }

        public Criteria andDjdlIsNotNull() {
            addCriterion("DJDL is not null");
            return (Criteria) this;
        }

        public Criteria andDjdlEqualTo(String value) {
            addCriterion("DJDL =", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlNotEqualTo(String value) {
            addCriterion("DJDL <>", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlGreaterThan(String value) {
            addCriterion("DJDL >", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlGreaterThanOrEqualTo(String value) {
            addCriterion("DJDL >=", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlLessThan(String value) {
            addCriterion("DJDL <", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlLessThanOrEqualTo(String value) {
            addCriterion("DJDL <=", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlLike(String value) {
            addCriterion("DJDL like", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlNotLike(String value) {
            addCriterion("DJDL not like", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlIn(List<String> values) {
            addCriterion("DJDL in", values, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlNotIn(List<String> values) {
            addCriterion("DJDL not in", values, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlBetween(String value1, String value2) {
            addCriterion("DJDL between", value1, value2, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlNotBetween(String value1, String value2) {
            addCriterion("DJDL not between", value1, value2, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjxlIsNull() {
            addCriterion("DJXL is null");
            return (Criteria) this;
        }

        public Criteria andDjxlIsNotNull() {
            addCriterion("DJXL is not null");
            return (Criteria) this;
        }

        public Criteria andDjxlEqualTo(String value) {
            addCriterion("DJXL =", value, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlNotEqualTo(String value) {
            addCriterion("DJXL <>", value, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlGreaterThan(String value) {
            addCriterion("DJXL >", value, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlGreaterThanOrEqualTo(String value) {
            addCriterion("DJXL >=", value, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlLessThan(String value) {
            addCriterion("DJXL <", value, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlLessThanOrEqualTo(String value) {
            addCriterion("DJXL <=", value, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlLike(String value) {
            addCriterion("DJXL like", value, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlNotLike(String value) {
            addCriterion("DJXL not like", value, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlIn(List<String> values) {
            addCriterion("DJXL in", values, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlNotIn(List<String> values) {
            addCriterion("DJXL not in", values, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlBetween(String value1, String value2) {
            addCriterion("DJXL between", value1, value2, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlNotBetween(String value1, String value2) {
            addCriterion("DJXL not between", value1, value2, "djxl");
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

        public Criteria andDacbhIsNull() {
            addCriterion("DACBH is null");
            return (Criteria) this;
        }

        public Criteria andDacbhIsNotNull() {
            addCriterion("DACBH is not null");
            return (Criteria) this;
        }

        public Criteria andDacbhEqualTo(String value) {
            addCriterion("DACBH =", value, "dacbh");
            return (Criteria) this;
        }

        public Criteria andDacbhNotEqualTo(String value) {
            addCriterion("DACBH <>", value, "dacbh");
            return (Criteria) this;
        }

        public Criteria andDacbhGreaterThan(String value) {
            addCriterion("DACBH >", value, "dacbh");
            return (Criteria) this;
        }

        public Criteria andDacbhGreaterThanOrEqualTo(String value) {
            addCriterion("DACBH >=", value, "dacbh");
            return (Criteria) this;
        }

        public Criteria andDacbhLessThan(String value) {
            addCriterion("DACBH <", value, "dacbh");
            return (Criteria) this;
        }

        public Criteria andDacbhLessThanOrEqualTo(String value) {
            addCriterion("DACBH <=", value, "dacbh");
            return (Criteria) this;
        }

        public Criteria andDacbhLike(String value) {
            addCriterion("DACBH like", value, "dacbh");
            return (Criteria) this;
        }

        public Criteria andDacbhNotLike(String value) {
            addCriterion("DACBH not like", value, "dacbh");
            return (Criteria) this;
        }

        public Criteria andDacbhIn(List<String> values) {
            addCriterion("DACBH in", values, "dacbh");
            return (Criteria) this;
        }

        public Criteria andDacbhNotIn(List<String> values) {
            addCriterion("DACBH not in", values, "dacbh");
            return (Criteria) this;
        }

        public Criteria andDacbhBetween(String value1, String value2) {
            addCriterion("DACBH between", value1, value2, "dacbh");
            return (Criteria) this;
        }

        public Criteria andDacbhNotBetween(String value1, String value2) {
            addCriterion("DACBH not between", value1, value2, "dacbh");
            return (Criteria) this;
        }

        public Criteria andDalbhIsNull() {
            addCriterion("DALBH is null");
            return (Criteria) this;
        }

        public Criteria andDalbhIsNotNull() {
            addCriterion("DALBH is not null");
            return (Criteria) this;
        }

        public Criteria andDalbhEqualTo(String value) {
            addCriterion("DALBH =", value, "dalbh");
            return (Criteria) this;
        }

        public Criteria andDalbhNotEqualTo(String value) {
            addCriterion("DALBH <>", value, "dalbh");
            return (Criteria) this;
        }

        public Criteria andDalbhGreaterThan(String value) {
            addCriterion("DALBH >", value, "dalbh");
            return (Criteria) this;
        }

        public Criteria andDalbhGreaterThanOrEqualTo(String value) {
            addCriterion("DALBH >=", value, "dalbh");
            return (Criteria) this;
        }

        public Criteria andDalbhLessThan(String value) {
            addCriterion("DALBH <", value, "dalbh");
            return (Criteria) this;
        }

        public Criteria andDalbhLessThanOrEqualTo(String value) {
            addCriterion("DALBH <=", value, "dalbh");
            return (Criteria) this;
        }

        public Criteria andDalbhLike(String value) {
            addCriterion("DALBH like", value, "dalbh");
            return (Criteria) this;
        }

        public Criteria andDalbhNotLike(String value) {
            addCriterion("DALBH not like", value, "dalbh");
            return (Criteria) this;
        }

        public Criteria andDalbhIn(List<String> values) {
            addCriterion("DALBH in", values, "dalbh");
            return (Criteria) this;
        }

        public Criteria andDalbhNotIn(List<String> values) {
            addCriterion("DALBH not in", values, "dalbh");
            return (Criteria) this;
        }

        public Criteria andDalbhBetween(String value1, String value2) {
            addCriterion("DALBH between", value1, value2, "dalbh");
            return (Criteria) this;
        }

        public Criteria andDalbhNotBetween(String value1, String value2) {
            addCriterion("DALBH not between", value1, value2, "dalbh");
            return (Criteria) this;
        }

        public Criteria andLshIsNull() {
            addCriterion("LSH is null");
            return (Criteria) this;
        }

        public Criteria andLshIsNotNull() {
            addCriterion("LSH is not null");
            return (Criteria) this;
        }

        public Criteria andLshEqualTo(Object value) {
            addCriterion("LSH =", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshNotEqualTo(Object value) {
            addCriterion("LSH <>", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshGreaterThan(Object value) {
            addCriterion("LSH >", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshGreaterThanOrEqualTo(Object value) {
            addCriterion("LSH >=", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshLessThan(Object value) {
            addCriterion("LSH <", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshLessThanOrEqualTo(Object value) {
            addCriterion("LSH <=", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshIn(List<Object> values) {
            addCriterion("LSH in", values, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshNotIn(List<Object> values) {
            addCriterion("LSH not in", values, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshBetween(Object value1, Object value2) {
            addCriterion("LSH between", value1, value2, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshNotBetween(Object value1, Object value2) {
            addCriterion("LSH not between", value1, value2, "lsh");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Object value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Object value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Object value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Object value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Object value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Object value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Object> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Object> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Object value1, Object value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Object value1, Object value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAjtmIsNull() {
            addCriterion("AJTM is null");
            return (Criteria) this;
        }

        public Criteria andAjtmIsNotNull() {
            addCriterion("AJTM is not null");
            return (Criteria) this;
        }

        public Criteria andAjtmEqualTo(Object value) {
            addCriterion("AJTM =", value, "ajtm");
            return (Criteria) this;
        }

        public Criteria andAjtmNotEqualTo(Object value) {
            addCriterion("AJTM <>", value, "ajtm");
            return (Criteria) this;
        }

        public Criteria andAjtmGreaterThan(Object value) {
            addCriterion("AJTM >", value, "ajtm");
            return (Criteria) this;
        }

        public Criteria andAjtmGreaterThanOrEqualTo(Object value) {
            addCriterion("AJTM >=", value, "ajtm");
            return (Criteria) this;
        }

        public Criteria andAjtmLessThan(Object value) {
            addCriterion("AJTM <", value, "ajtm");
            return (Criteria) this;
        }

        public Criteria andAjtmLessThanOrEqualTo(Object value) {
            addCriterion("AJTM <=", value, "ajtm");
            return (Criteria) this;
        }

        public Criteria andAjtmIn(List<Object> values) {
            addCriterion("AJTM in", values, "ajtm");
            return (Criteria) this;
        }

        public Criteria andAjtmNotIn(List<Object> values) {
            addCriterion("AJTM not in", values, "ajtm");
            return (Criteria) this;
        }

        public Criteria andAjtmBetween(Object value1, Object value2) {
            addCriterion("AJTM between", value1, value2, "ajtm");
            return (Criteria) this;
        }

        public Criteria andAjtmNotBetween(Object value1, Object value2) {
            addCriterion("AJTM not between", value1, value2, "ajtm");
            return (Criteria) this;
        }

        public Criteria andWzjsIsNull() {
            addCriterion("WZJS is null");
            return (Criteria) this;
        }

        public Criteria andWzjsIsNotNull() {
            addCriterion("WZJS is not null");
            return (Criteria) this;
        }

        public Criteria andWzjsEqualTo(Object value) {
            addCriterion("WZJS =", value, "wzjs");
            return (Criteria) this;
        }

        public Criteria andWzjsNotEqualTo(Object value) {
            addCriterion("WZJS <>", value, "wzjs");
            return (Criteria) this;
        }

        public Criteria andWzjsGreaterThan(Object value) {
            addCriterion("WZJS >", value, "wzjs");
            return (Criteria) this;
        }

        public Criteria andWzjsGreaterThanOrEqualTo(Object value) {
            addCriterion("WZJS >=", value, "wzjs");
            return (Criteria) this;
        }

        public Criteria andWzjsLessThan(Object value) {
            addCriterion("WZJS <", value, "wzjs");
            return (Criteria) this;
        }

        public Criteria andWzjsLessThanOrEqualTo(Object value) {
            addCriterion("WZJS <=", value, "wzjs");
            return (Criteria) this;
        }

        public Criteria andWzjsIn(List<Object> values) {
            addCriterion("WZJS in", values, "wzjs");
            return (Criteria) this;
        }

        public Criteria andWzjsNotIn(List<Object> values) {
            addCriterion("WZJS not in", values, "wzjs");
            return (Criteria) this;
        }

        public Criteria andWzjsBetween(Object value1, Object value2) {
            addCriterion("WZJS between", value1, value2, "wzjs");
            return (Criteria) this;
        }

        public Criteria andWzjsNotBetween(Object value1, Object value2) {
            addCriterion("WZJS not between", value1, value2, "wzjs");
            return (Criteria) this;
        }

        public Criteria andTpjsIsNull() {
            addCriterion("TPJS is null");
            return (Criteria) this;
        }

        public Criteria andTpjsIsNotNull() {
            addCriterion("TPJS is not null");
            return (Criteria) this;
        }

        public Criteria andTpjsEqualTo(Object value) {
            addCriterion("TPJS =", value, "tpjs");
            return (Criteria) this;
        }

        public Criteria andTpjsNotEqualTo(Object value) {
            addCriterion("TPJS <>", value, "tpjs");
            return (Criteria) this;
        }

        public Criteria andTpjsGreaterThan(Object value) {
            addCriterion("TPJS >", value, "tpjs");
            return (Criteria) this;
        }

        public Criteria andTpjsGreaterThanOrEqualTo(Object value) {
            addCriterion("TPJS >=", value, "tpjs");
            return (Criteria) this;
        }

        public Criteria andTpjsLessThan(Object value) {
            addCriterion("TPJS <", value, "tpjs");
            return (Criteria) this;
        }

        public Criteria andTpjsLessThanOrEqualTo(Object value) {
            addCriterion("TPJS <=", value, "tpjs");
            return (Criteria) this;
        }

        public Criteria andTpjsIn(List<Object> values) {
            addCriterion("TPJS in", values, "tpjs");
            return (Criteria) this;
        }

        public Criteria andTpjsNotIn(List<Object> values) {
            addCriterion("TPJS not in", values, "tpjs");
            return (Criteria) this;
        }

        public Criteria andTpjsBetween(Object value1, Object value2) {
            addCriterion("TPJS between", value1, value2, "tpjs");
            return (Criteria) this;
        }

        public Criteria andTpjsNotBetween(Object value1, Object value2) {
            addCriterion("TPJS not between", value1, value2, "tpjs");
            return (Criteria) this;
        }

        public Criteria andZlsjIsNull() {
            addCriterion("ZLSJ is null");
            return (Criteria) this;
        }

        public Criteria andZlsjIsNotNull() {
            addCriterion("ZLSJ is not null");
            return (Criteria) this;
        }

        public Criteria andZlsjEqualTo(Date value) {
            addCriterion("ZLSJ =", value, "zlsj");
            return (Criteria) this;
        }

        public Criteria andZlsjNotEqualTo(Date value) {
            addCriterion("ZLSJ <>", value, "zlsj");
            return (Criteria) this;
        }

        public Criteria andZlsjGreaterThan(Date value) {
            addCriterion("ZLSJ >", value, "zlsj");
            return (Criteria) this;
        }

        public Criteria andZlsjGreaterThanOrEqualTo(Date value) {
            addCriterion("ZLSJ >=", value, "zlsj");
            return (Criteria) this;
        }

        public Criteria andZlsjLessThan(Date value) {
            addCriterion("ZLSJ <", value, "zlsj");
            return (Criteria) this;
        }

        public Criteria andZlsjLessThanOrEqualTo(Date value) {
            addCriterion("ZLSJ <=", value, "zlsj");
            return (Criteria) this;
        }

        public Criteria andZlsjIn(List<Date> values) {
            addCriterion("ZLSJ in", values, "zlsj");
            return (Criteria) this;
        }

        public Criteria andZlsjNotIn(List<Date> values) {
            addCriterion("ZLSJ not in", values, "zlsj");
            return (Criteria) this;
        }

        public Criteria andZlsjBetween(Date value1, Date value2) {
            addCriterion("ZLSJ between", value1, value2, "zlsj");
            return (Criteria) this;
        }

        public Criteria andZlsjNotBetween(Date value1, Date value2) {
            addCriterion("ZLSJ not between", value1, value2, "zlsj");
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