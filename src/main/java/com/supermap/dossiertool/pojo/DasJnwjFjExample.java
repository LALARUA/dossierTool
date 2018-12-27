package com.supermap.dossiertool.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DasJnwjFjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DasJnwjFjExample() {
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

        public Criteria andFjidIsNull() {
            addCriterion("FJID is null");
            return (Criteria) this;
        }

        public Criteria andFjidIsNotNull() {
            addCriterion("FJID is not null");
            return (Criteria) this;
        }

        public Criteria andFjidEqualTo(Object value) {
            addCriterion("FJID =", value, "fjid");
            return (Criteria) this;
        }

        public Criteria andFjidNotEqualTo(Object value) {
            addCriterion("FJID <>", value, "fjid");
            return (Criteria) this;
        }

        public Criteria andFjidGreaterThan(Object value) {
            addCriterion("FJID >", value, "fjid");
            return (Criteria) this;
        }

        public Criteria andFjidGreaterThanOrEqualTo(Object value) {
            addCriterion("FJID >=", value, "fjid");
            return (Criteria) this;
        }

        public Criteria andFjidLessThan(Object value) {
            addCriterion("FJID <", value, "fjid");
            return (Criteria) this;
        }

        public Criteria andFjidLessThanOrEqualTo(Object value) {
            addCriterion("FJID <=", value, "fjid");
            return (Criteria) this;
        }

        public Criteria andFjidIn(List<Object> values) {
            addCriterion("FJID in", values, "fjid");
            return (Criteria) this;
        }

        public Criteria andFjidNotIn(List<Object> values) {
            addCriterion("FJID not in", values, "fjid");
            return (Criteria) this;
        }

        public Criteria andFjidBetween(Object value1, Object value2) {
            addCriterion("FJID between", value1, value2, "fjid");
            return (Criteria) this;
        }

        public Criteria andFjidNotBetween(Object value1, Object value2) {
            addCriterion("FJID not between", value1, value2, "fjid");
            return (Criteria) this;
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

        public Criteria andFjmcIsNull() {
            addCriterion("FJMC is null");
            return (Criteria) this;
        }

        public Criteria andFjmcIsNotNull() {
            addCriterion("FJMC is not null");
            return (Criteria) this;
        }

        public Criteria andFjmcEqualTo(Object value) {
            addCriterion("FJMC =", value, "fjmc");
            return (Criteria) this;
        }

        public Criteria andFjmcNotEqualTo(Object value) {
            addCriterion("FJMC <>", value, "fjmc");
            return (Criteria) this;
        }

        public Criteria andFjmcGreaterThan(Object value) {
            addCriterion("FJMC >", value, "fjmc");
            return (Criteria) this;
        }

        public Criteria andFjmcGreaterThanOrEqualTo(Object value) {
            addCriterion("FJMC >=", value, "fjmc");
            return (Criteria) this;
        }

        public Criteria andFjmcLessThan(Object value) {
            addCriterion("FJMC <", value, "fjmc");
            return (Criteria) this;
        }

        public Criteria andFjmcLessThanOrEqualTo(Object value) {
            addCriterion("FJMC <=", value, "fjmc");
            return (Criteria) this;
        }

        public Criteria andFjmcIn(List<Object> values) {
            addCriterion("FJMC in", values, "fjmc");
            return (Criteria) this;
        }

        public Criteria andFjmcNotIn(List<Object> values) {
            addCriterion("FJMC not in", values, "fjmc");
            return (Criteria) this;
        }

        public Criteria andFjmcBetween(Object value1, Object value2) {
            addCriterion("FJMC between", value1, value2, "fjmc");
            return (Criteria) this;
        }

        public Criteria andFjmcNotBetween(Object value1, Object value2) {
            addCriterion("FJMC not between", value1, value2, "fjmc");
            return (Criteria) this;
        }

        public Criteria andFjlxIsNull() {
            addCriterion("FJLX is null");
            return (Criteria) this;
        }

        public Criteria andFjlxIsNotNull() {
            addCriterion("FJLX is not null");
            return (Criteria) this;
        }

        public Criteria andFjlxEqualTo(Long value) {
            addCriterion("FJLX =", value, "fjlx");
            return (Criteria) this;
        }

        public Criteria andFjlxNotEqualTo(Long value) {
            addCriterion("FJLX <>", value, "fjlx");
            return (Criteria) this;
        }

        public Criteria andFjlxGreaterThan(Long value) {
            addCriterion("FJLX >", value, "fjlx");
            return (Criteria) this;
        }

        public Criteria andFjlxGreaterThanOrEqualTo(Long value) {
            addCriterion("FJLX >=", value, "fjlx");
            return (Criteria) this;
        }

        public Criteria andFjlxLessThan(Long value) {
            addCriterion("FJLX <", value, "fjlx");
            return (Criteria) this;
        }

        public Criteria andFjlxLessThanOrEqualTo(Long value) {
            addCriterion("FJLX <=", value, "fjlx");
            return (Criteria) this;
        }

        public Criteria andFjlxIn(List<Long> values) {
            addCriterion("FJLX in", values, "fjlx");
            return (Criteria) this;
        }

        public Criteria andFjlxNotIn(List<Long> values) {
            addCriterion("FJLX not in", values, "fjlx");
            return (Criteria) this;
        }

        public Criteria andFjlxBetween(Long value1, Long value2) {
            addCriterion("FJLX between", value1, value2, "fjlx");
            return (Criteria) this;
        }

        public Criteria andFjlxNotBetween(Long value1, Long value2) {
            addCriterion("FJLX not between", value1, value2, "fjlx");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("PATH is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("PATH is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("PATH =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("PATH <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("PATH >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("PATH >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("PATH <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("PATH <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("PATH like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("PATH not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("PATH in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("PATH not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("PATH between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("PATH not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNull() {
            addCriterion("FILETYPE is null");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNotNull() {
            addCriterion("FILETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFiletypeEqualTo(String value) {
            addCriterion("FILETYPE =", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotEqualTo(String value) {
            addCriterion("FILETYPE <>", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThan(String value) {
            addCriterion("FILETYPE >", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThanOrEqualTo(String value) {
            addCriterion("FILETYPE >=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThan(String value) {
            addCriterion("FILETYPE <", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThanOrEqualTo(String value) {
            addCriterion("FILETYPE <=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLike(String value) {
            addCriterion("FILETYPE like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotLike(String value) {
            addCriterion("FILETYPE not like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeIn(List<String> values) {
            addCriterion("FILETYPE in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotIn(List<String> values) {
            addCriterion("FILETYPE not in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeBetween(String value1, String value2) {
            addCriterion("FILETYPE between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotBetween(String value1, String value2) {
            addCriterion("FILETYPE not between", value1, value2, "filetype");
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

        public Criteria andJnwjFjIdIsNull() {
            addCriterion("JNWJ_FJ_ID is null");
            return (Criteria) this;
        }

        public Criteria andJnwjFjIdIsNotNull() {
            addCriterion("JNWJ_FJ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJnwjFjIdEqualTo(Object value) {
            addCriterion("JNWJ_FJ_ID =", value, "jnwjFjId");
            return (Criteria) this;
        }

        public Criteria andJnwjFjIdNotEqualTo(Object value) {
            addCriterion("JNWJ_FJ_ID <>", value, "jnwjFjId");
            return (Criteria) this;
        }

        public Criteria andJnwjFjIdGreaterThan(Object value) {
            addCriterion("JNWJ_FJ_ID >", value, "jnwjFjId");
            return (Criteria) this;
        }

        public Criteria andJnwjFjIdGreaterThanOrEqualTo(Object value) {
            addCriterion("JNWJ_FJ_ID >=", value, "jnwjFjId");
            return (Criteria) this;
        }

        public Criteria andJnwjFjIdLessThan(Object value) {
            addCriterion("JNWJ_FJ_ID <", value, "jnwjFjId");
            return (Criteria) this;
        }

        public Criteria andJnwjFjIdLessThanOrEqualTo(Object value) {
            addCriterion("JNWJ_FJ_ID <=", value, "jnwjFjId");
            return (Criteria) this;
        }

        public Criteria andJnwjFjIdIn(List<Object> values) {
            addCriterion("JNWJ_FJ_ID in", values, "jnwjFjId");
            return (Criteria) this;
        }

        public Criteria andJnwjFjIdNotIn(List<Object> values) {
            addCriterion("JNWJ_FJ_ID not in", values, "jnwjFjId");
            return (Criteria) this;
        }

        public Criteria andJnwjFjIdBetween(Object value1, Object value2) {
            addCriterion("JNWJ_FJ_ID between", value1, value2, "jnwjFjId");
            return (Criteria) this;
        }

        public Criteria andJnwjFjIdNotBetween(Object value1, Object value2) {
            addCriterion("JNWJ_FJ_ID not between", value1, value2, "jnwjFjId");
            return (Criteria) this;
        }

        public Criteria andIsrkIsNull() {
            addCriterion("ISRK is null");
            return (Criteria) this;
        }

        public Criteria andIsrkIsNotNull() {
            addCriterion("ISRK is not null");
            return (Criteria) this;
        }

        public Criteria andIsrkEqualTo(Long value) {
            addCriterion("ISRK =", value, "isrk");
            return (Criteria) this;
        }

        public Criteria andIsrkNotEqualTo(Long value) {
            addCriterion("ISRK <>", value, "isrk");
            return (Criteria) this;
        }

        public Criteria andIsrkGreaterThan(Long value) {
            addCriterion("ISRK >", value, "isrk");
            return (Criteria) this;
        }

        public Criteria andIsrkGreaterThanOrEqualTo(Long value) {
            addCriterion("ISRK >=", value, "isrk");
            return (Criteria) this;
        }

        public Criteria andIsrkLessThan(Long value) {
            addCriterion("ISRK <", value, "isrk");
            return (Criteria) this;
        }

        public Criteria andIsrkLessThanOrEqualTo(Long value) {
            addCriterion("ISRK <=", value, "isrk");
            return (Criteria) this;
        }

        public Criteria andIsrkIn(List<Long> values) {
            addCriterion("ISRK in", values, "isrk");
            return (Criteria) this;
        }

        public Criteria andIsrkNotIn(List<Long> values) {
            addCriterion("ISRK not in", values, "isrk");
            return (Criteria) this;
        }

        public Criteria andIsrkBetween(Long value1, Long value2) {
            addCriterion("ISRK between", value1, value2, "isrk");
            return (Criteria) this;
        }

        public Criteria andIsrkNotBetween(Long value1, Long value2) {
            addCriterion("ISRK not between", value1, value2, "isrk");
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