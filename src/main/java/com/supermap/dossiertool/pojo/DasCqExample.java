package com.supermap.dossiertool.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DasCqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DasCqExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Object value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Object value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Object value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Object value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Object value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Object value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Object> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Object> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Object value1, Object value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Object value1, Object value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andCbIsNull() {
            addCriterion("CB is null");
            return (Criteria) this;
        }

        public Criteria andCbIsNotNull() {
            addCriterion("CB is not null");
            return (Criteria) this;
        }

        public Criteria andCbEqualTo(Object value) {
            addCriterion("CB =", value, "cb");
            return (Criteria) this;
        }

        public Criteria andCbNotEqualTo(Object value) {
            addCriterion("CB <>", value, "cb");
            return (Criteria) this;
        }

        public Criteria andCbGreaterThan(Object value) {
            addCriterion("CB >", value, "cb");
            return (Criteria) this;
        }

        public Criteria andCbGreaterThanOrEqualTo(Object value) {
            addCriterion("CB >=", value, "cb");
            return (Criteria) this;
        }

        public Criteria andCbLessThan(Object value) {
            addCriterion("CB <", value, "cb");
            return (Criteria) this;
        }

        public Criteria andCbLessThanOrEqualTo(Object value) {
            addCriterion("CB <=", value, "cb");
            return (Criteria) this;
        }

        public Criteria andCbIn(List<Object> values) {
            addCriterion("CB in", values, "cb");
            return (Criteria) this;
        }

        public Criteria andCbNotIn(List<Object> values) {
            addCriterion("CB not in", values, "cb");
            return (Criteria) this;
        }

        public Criteria andCbBetween(Object value1, Object value2) {
            addCriterion("CB between", value1, value2, "cb");
            return (Criteria) this;
        }

        public Criteria andCbNotBetween(Object value1, Object value2) {
            addCriterion("CB not between", value1, value2, "cb");
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

        public Criteria andChIsNull() {
            addCriterion("CH is null");
            return (Criteria) this;
        }

        public Criteria andChIsNotNull() {
            addCriterion("CH is not null");
            return (Criteria) this;
        }

        public Criteria andChEqualTo(Object value) {
            addCriterion("CH =", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChNotEqualTo(Object value) {
            addCriterion("CH <>", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChGreaterThan(Object value) {
            addCriterion("CH >", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChGreaterThanOrEqualTo(Object value) {
            addCriterion("CH >=", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChLessThan(Object value) {
            addCriterion("CH <", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChLessThanOrEqualTo(Object value) {
            addCriterion("CH <=", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChIn(List<Object> values) {
            addCriterion("CH in", values, "ch");
            return (Criteria) this;
        }

        public Criteria andChNotIn(List<Object> values) {
            addCriterion("CH not in", values, "ch");
            return (Criteria) this;
        }

        public Criteria andChBetween(Object value1, Object value2) {
            addCriterion("CH between", value1, value2, "ch");
            return (Criteria) this;
        }

        public Criteria andChNotBetween(Object value1, Object value2) {
            addCriterion("CH not between", value1, value2, "ch");
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

        public Criteria andJcnfIsNull() {
            addCriterion("JCNF is null");
            return (Criteria) this;
        }

        public Criteria andJcnfIsNotNull() {
            addCriterion("JCNF is not null");
            return (Criteria) this;
        }

        public Criteria andJcnfEqualTo(Integer value) {
            addCriterion("JCNF =", value, "jcnf");
            return (Criteria) this;
        }

        public Criteria andJcnfNotEqualTo(Integer value) {
            addCriterion("JCNF <>", value, "jcnf");
            return (Criteria) this;
        }

        public Criteria andJcnfGreaterThan(Integer value) {
            addCriterion("JCNF >", value, "jcnf");
            return (Criteria) this;
        }

        public Criteria andJcnfGreaterThanOrEqualTo(Integer value) {
            addCriterion("JCNF >=", value, "jcnf");
            return (Criteria) this;
        }

        public Criteria andJcnfLessThan(Integer value) {
            addCriterion("JCNF <", value, "jcnf");
            return (Criteria) this;
        }

        public Criteria andJcnfLessThanOrEqualTo(Integer value) {
            addCriterion("JCNF <=", value, "jcnf");
            return (Criteria) this;
        }

        public Criteria andJcnfIn(List<Integer> values) {
            addCriterion("JCNF in", values, "jcnf");
            return (Criteria) this;
        }

        public Criteria andJcnfNotIn(List<Integer> values) {
            addCriterion("JCNF not in", values, "jcnf");
            return (Criteria) this;
        }

        public Criteria andJcnfBetween(Integer value1, Integer value2) {
            addCriterion("JCNF between", value1, value2, "jcnf");
            return (Criteria) this;
        }

        public Criteria andJcnfNotBetween(Integer value1, Integer value2) {
            addCriterion("JCNF not between", value1, value2, "jcnf");
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

        public Criteria andDjdlIsNull() {
            addCriterion("DJDL is null");
            return (Criteria) this;
        }

        public Criteria andDjdlIsNotNull() {
            addCriterion("DJDL is not null");
            return (Criteria) this;
        }

        public Criteria andDjdlEqualTo(Object value) {
            addCriterion("DJDL =", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlNotEqualTo(Object value) {
            addCriterion("DJDL <>", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlGreaterThan(Object value) {
            addCriterion("DJDL >", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlGreaterThanOrEqualTo(Object value) {
            addCriterion("DJDL >=", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlLessThan(Object value) {
            addCriterion("DJDL <", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlLessThanOrEqualTo(Object value) {
            addCriterion("DJDL <=", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlIn(List<Object> values) {
            addCriterion("DJDL in", values, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlNotIn(List<Object> values) {
            addCriterion("DJDL not in", values, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlBetween(Object value1, Object value2) {
            addCriterion("DJDL between", value1, value2, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlNotBetween(Object value1, Object value2) {
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

        public Criteria andDjxlEqualTo(Object value) {
            addCriterion("DJXL =", value, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlNotEqualTo(Object value) {
            addCriterion("DJXL <>", value, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlGreaterThan(Object value) {
            addCriterion("DJXL >", value, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlGreaterThanOrEqualTo(Object value) {
            addCriterion("DJXL >=", value, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlLessThan(Object value) {
            addCriterion("DJXL <", value, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlLessThanOrEqualTo(Object value) {
            addCriterion("DJXL <=", value, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlIn(List<Object> values) {
            addCriterion("DJXL in", values, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlNotIn(List<Object> values) {
            addCriterion("DJXL not in", values, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlBetween(Object value1, Object value2) {
            addCriterion("DJXL between", value1, value2, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlNotBetween(Object value1, Object value2) {
            addCriterion("DJXL not between", value1, value2, "djxl");
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

        public Criteria andFjEqualTo(Object value) {
            addCriterion("FJ =", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjNotEqualTo(Object value) {
            addCriterion("FJ <>", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjGreaterThan(Object value) {
            addCriterion("FJ >", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjGreaterThanOrEqualTo(Object value) {
            addCriterion("FJ >=", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjLessThan(Object value) {
            addCriterion("FJ <", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjLessThanOrEqualTo(Object value) {
            addCriterion("FJ <=", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjIn(List<Object> values) {
            addCriterion("FJ in", values, "fj");
            return (Criteria) this;
        }

        public Criteria andFjNotIn(List<Object> values) {
            addCriterion("FJ not in", values, "fj");
            return (Criteria) this;
        }

        public Criteria andFjBetween(Object value1, Object value2) {
            addCriterion("FJ between", value1, value2, "fj");
            return (Criteria) this;
        }

        public Criteria andFjNotBetween(Object value1, Object value2) {
            addCriterion("FJ not between", value1, value2, "fj");
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

        public Criteria andBzEqualTo(Object value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(Object value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(Object value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(Object value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(Object value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(Object value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<Object> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<Object> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(Object value1, Object value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(Object value1, Object value2) {
            addCriterion("BZ not between", value1, value2, "bz");
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

        public Criteria andZxdbrIsNull() {
            addCriterion("ZXDBR is null");
            return (Criteria) this;
        }

        public Criteria andZxdbrIsNotNull() {
            addCriterion("ZXDBR is not null");
            return (Criteria) this;
        }

        public Criteria andZxdbrEqualTo(Object value) {
            addCriterion("ZXDBR =", value, "zxdbr");
            return (Criteria) this;
        }

        public Criteria andZxdbrNotEqualTo(Object value) {
            addCriterion("ZXDBR <>", value, "zxdbr");
            return (Criteria) this;
        }

        public Criteria andZxdbrGreaterThan(Object value) {
            addCriterion("ZXDBR >", value, "zxdbr");
            return (Criteria) this;
        }

        public Criteria andZxdbrGreaterThanOrEqualTo(Object value) {
            addCriterion("ZXDBR >=", value, "zxdbr");
            return (Criteria) this;
        }

        public Criteria andZxdbrLessThan(Object value) {
            addCriterion("ZXDBR <", value, "zxdbr");
            return (Criteria) this;
        }

        public Criteria andZxdbrLessThanOrEqualTo(Object value) {
            addCriterion("ZXDBR <=", value, "zxdbr");
            return (Criteria) this;
        }

        public Criteria andZxdbrIn(List<Object> values) {
            addCriterion("ZXDBR in", values, "zxdbr");
            return (Criteria) this;
        }

        public Criteria andZxdbrNotIn(List<Object> values) {
            addCriterion("ZXDBR not in", values, "zxdbr");
            return (Criteria) this;
        }

        public Criteria andZxdbrBetween(Object value1, Object value2) {
            addCriterion("ZXDBR between", value1, value2, "zxdbr");
            return (Criteria) this;
        }

        public Criteria andZxdbrNotBetween(Object value1, Object value2) {
            addCriterion("ZXDBR not between", value1, value2, "zxdbr");
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

        public Criteria andQlqssjIsNull() {
            addCriterion("QLQSSJ is null");
            return (Criteria) this;
        }

        public Criteria andQlqssjIsNotNull() {
            addCriterion("QLQSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andQlqssjEqualTo(Date value) {
            addCriterion("QLQSSJ =", value, "qlqssj");
            return (Criteria) this;
        }

        public Criteria andQlqssjNotEqualTo(Date value) {
            addCriterion("QLQSSJ <>", value, "qlqssj");
            return (Criteria) this;
        }

        public Criteria andQlqssjGreaterThan(Date value) {
            addCriterion("QLQSSJ >", value, "qlqssj");
            return (Criteria) this;
        }

        public Criteria andQlqssjGreaterThanOrEqualTo(Date value) {
            addCriterion("QLQSSJ >=", value, "qlqssj");
            return (Criteria) this;
        }

        public Criteria andQlqssjLessThan(Date value) {
            addCriterion("QLQSSJ <", value, "qlqssj");
            return (Criteria) this;
        }

        public Criteria andQlqssjLessThanOrEqualTo(Date value) {
            addCriterion("QLQSSJ <=", value, "qlqssj");
            return (Criteria) this;
        }

        public Criteria andQlqssjIn(List<Date> values) {
            addCriterion("QLQSSJ in", values, "qlqssj");
            return (Criteria) this;
        }

        public Criteria andQlqssjNotIn(List<Date> values) {
            addCriterion("QLQSSJ not in", values, "qlqssj");
            return (Criteria) this;
        }

        public Criteria andQlqssjBetween(Date value1, Date value2) {
            addCriterion("QLQSSJ between", value1, value2, "qlqssj");
            return (Criteria) this;
        }

        public Criteria andQlqssjNotBetween(Date value1, Date value2) {
            addCriterion("QLQSSJ not between", value1, value2, "qlqssj");
            return (Criteria) this;
        }

        public Criteria andQljssjIsNull() {
            addCriterion("QLJSSJ is null");
            return (Criteria) this;
        }

        public Criteria andQljssjIsNotNull() {
            addCriterion("QLJSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andQljssjEqualTo(Date value) {
            addCriterion("QLJSSJ =", value, "qljssj");
            return (Criteria) this;
        }

        public Criteria andQljssjNotEqualTo(Date value) {
            addCriterion("QLJSSJ <>", value, "qljssj");
            return (Criteria) this;
        }

        public Criteria andQljssjGreaterThan(Date value) {
            addCriterion("QLJSSJ >", value, "qljssj");
            return (Criteria) this;
        }

        public Criteria andQljssjGreaterThanOrEqualTo(Date value) {
            addCriterion("QLJSSJ >=", value, "qljssj");
            return (Criteria) this;
        }

        public Criteria andQljssjLessThan(Date value) {
            addCriterion("QLJSSJ <", value, "qljssj");
            return (Criteria) this;
        }

        public Criteria andQljssjLessThanOrEqualTo(Date value) {
            addCriterion("QLJSSJ <=", value, "qljssj");
            return (Criteria) this;
        }

        public Criteria andQljssjIn(List<Date> values) {
            addCriterion("QLJSSJ in", values, "qljssj");
            return (Criteria) this;
        }

        public Criteria andQljssjNotIn(List<Date> values) {
            addCriterion("QLJSSJ not in", values, "qljssj");
            return (Criteria) this;
        }

        public Criteria andQljssjBetween(Date value1, Date value2) {
            addCriterion("QLJSSJ between", value1, value2, "qljssj");
            return (Criteria) this;
        }

        public Criteria andQljssjNotBetween(Date value1, Date value2) {
            addCriterion("QLJSSJ not between", value1, value2, "qljssj");
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

        public Criteria andZqdwIsNull() {
            addCriterion("ZQDW is null");
            return (Criteria) this;
        }

        public Criteria andZqdwIsNotNull() {
            addCriterion("ZQDW is not null");
            return (Criteria) this;
        }

        public Criteria andZqdwEqualTo(Object value) {
            addCriterion("ZQDW =", value, "zqdw");
            return (Criteria) this;
        }

        public Criteria andZqdwNotEqualTo(Object value) {
            addCriterion("ZQDW <>", value, "zqdw");
            return (Criteria) this;
        }

        public Criteria andZqdwGreaterThan(Object value) {
            addCriterion("ZQDW >", value, "zqdw");
            return (Criteria) this;
        }

        public Criteria andZqdwGreaterThanOrEqualTo(Object value) {
            addCriterion("ZQDW >=", value, "zqdw");
            return (Criteria) this;
        }

        public Criteria andZqdwLessThan(Object value) {
            addCriterion("ZQDW <", value, "zqdw");
            return (Criteria) this;
        }

        public Criteria andZqdwLessThanOrEqualTo(Object value) {
            addCriterion("ZQDW <=", value, "zqdw");
            return (Criteria) this;
        }

        public Criteria andZqdwIn(List<Object> values) {
            addCriterion("ZQDW in", values, "zqdw");
            return (Criteria) this;
        }

        public Criteria andZqdwNotIn(List<Object> values) {
            addCriterion("ZQDW not in", values, "zqdw");
            return (Criteria) this;
        }

        public Criteria andZqdwBetween(Object value1, Object value2) {
            addCriterion("ZQDW between", value1, value2, "zqdw");
            return (Criteria) this;
        }

        public Criteria andZqdwNotBetween(Object value1, Object value2) {
            addCriterion("ZQDW not between", value1, value2, "zqdw");
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