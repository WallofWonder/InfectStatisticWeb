package com.infect.backend.model;

import java.util.ArrayList;
import java.util.List;

public class NationPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NationPOExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("modifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("modifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Long value) {
            addCriterion("modifyTime =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Long value) {
            addCriterion("modifyTime <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Long value) {
            addCriterion("modifyTime >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Long value) {
            addCriterion("modifyTime >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Long value) {
            addCriterion("modifyTime <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Long value) {
            addCriterion("modifyTime <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Long> values) {
            addCriterion("modifyTime in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Long> values) {
            addCriterion("modifyTime not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Long value1, Long value2) {
            addCriterion("modifyTime between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Long value1, Long value2) {
            addCriterion("modifyTime not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedcountIsNull() {
            addCriterion("currentConfirmedCount is null");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedcountIsNotNull() {
            addCriterion("currentConfirmedCount is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedcountEqualTo(Integer value) {
            addCriterion("currentConfirmedCount =", value, "currentconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedcountNotEqualTo(Integer value) {
            addCriterion("currentConfirmedCount <>", value, "currentconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedcountGreaterThan(Integer value) {
            addCriterion("currentConfirmedCount >", value, "currentconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("currentConfirmedCount >=", value, "currentconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedcountLessThan(Integer value) {
            addCriterion("currentConfirmedCount <", value, "currentconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedcountLessThanOrEqualTo(Integer value) {
            addCriterion("currentConfirmedCount <=", value, "currentconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedcountIn(List<Integer> values) {
            addCriterion("currentConfirmedCount in", values, "currentconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedcountNotIn(List<Integer> values) {
            addCriterion("currentConfirmedCount not in", values, "currentconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedcountBetween(Integer value1, Integer value2) {
            addCriterion("currentConfirmedCount between", value1, value2, "currentconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedcountNotBetween(Integer value1, Integer value2) {
            addCriterion("currentConfirmedCount not between", value1, value2, "currentconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountIsNull() {
            addCriterion("confirmedCount is null");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountIsNotNull() {
            addCriterion("confirmedCount is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountEqualTo(Integer value) {
            addCriterion("confirmedCount =", value, "confirmedcount");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountNotEqualTo(Integer value) {
            addCriterion("confirmedCount <>", value, "confirmedcount");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountGreaterThan(Integer value) {
            addCriterion("confirmedCount >", value, "confirmedcount");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirmedCount >=", value, "confirmedcount");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountLessThan(Integer value) {
            addCriterion("confirmedCount <", value, "confirmedcount");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountLessThanOrEqualTo(Integer value) {
            addCriterion("confirmedCount <=", value, "confirmedcount");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountIn(List<Integer> values) {
            addCriterion("confirmedCount in", values, "confirmedcount");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountNotIn(List<Integer> values) {
            addCriterion("confirmedCount not in", values, "confirmedcount");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountBetween(Integer value1, Integer value2) {
            addCriterion("confirmedCount between", value1, value2, "confirmedcount");
            return (Criteria) this;
        }

        public Criteria andConfirmedcountNotBetween(Integer value1, Integer value2) {
            addCriterion("confirmedCount not between", value1, value2, "confirmedcount");
            return (Criteria) this;
        }

        public Criteria andSuspectedcountIsNull() {
            addCriterion("suspectedCount is null");
            return (Criteria) this;
        }

        public Criteria andSuspectedcountIsNotNull() {
            addCriterion("suspectedCount is not null");
            return (Criteria) this;
        }

        public Criteria andSuspectedcountEqualTo(Integer value) {
            addCriterion("suspectedCount =", value, "suspectedcount");
            return (Criteria) this;
        }

        public Criteria andSuspectedcountNotEqualTo(Integer value) {
            addCriterion("suspectedCount <>", value, "suspectedcount");
            return (Criteria) this;
        }

        public Criteria andSuspectedcountGreaterThan(Integer value) {
            addCriterion("suspectedCount >", value, "suspectedcount");
            return (Criteria) this;
        }

        public Criteria andSuspectedcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("suspectedCount >=", value, "suspectedcount");
            return (Criteria) this;
        }

        public Criteria andSuspectedcountLessThan(Integer value) {
            addCriterion("suspectedCount <", value, "suspectedcount");
            return (Criteria) this;
        }

        public Criteria andSuspectedcountLessThanOrEqualTo(Integer value) {
            addCriterion("suspectedCount <=", value, "suspectedcount");
            return (Criteria) this;
        }

        public Criteria andSuspectedcountIn(List<Integer> values) {
            addCriterion("suspectedCount in", values, "suspectedcount");
            return (Criteria) this;
        }

        public Criteria andSuspectedcountNotIn(List<Integer> values) {
            addCriterion("suspectedCount not in", values, "suspectedcount");
            return (Criteria) this;
        }

        public Criteria andSuspectedcountBetween(Integer value1, Integer value2) {
            addCriterion("suspectedCount between", value1, value2, "suspectedcount");
            return (Criteria) this;
        }

        public Criteria andSuspectedcountNotBetween(Integer value1, Integer value2) {
            addCriterion("suspectedCount not between", value1, value2, "suspectedcount");
            return (Criteria) this;
        }

        public Criteria andCuredcountIsNull() {
            addCriterion("curedCount is null");
            return (Criteria) this;
        }

        public Criteria andCuredcountIsNotNull() {
            addCriterion("curedCount is not null");
            return (Criteria) this;
        }

        public Criteria andCuredcountEqualTo(Integer value) {
            addCriterion("curedCount =", value, "curedcount");
            return (Criteria) this;
        }

        public Criteria andCuredcountNotEqualTo(Integer value) {
            addCriterion("curedCount <>", value, "curedcount");
            return (Criteria) this;
        }

        public Criteria andCuredcountGreaterThan(Integer value) {
            addCriterion("curedCount >", value, "curedcount");
            return (Criteria) this;
        }

        public Criteria andCuredcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("curedCount >=", value, "curedcount");
            return (Criteria) this;
        }

        public Criteria andCuredcountLessThan(Integer value) {
            addCriterion("curedCount <", value, "curedcount");
            return (Criteria) this;
        }

        public Criteria andCuredcountLessThanOrEqualTo(Integer value) {
            addCriterion("curedCount <=", value, "curedcount");
            return (Criteria) this;
        }

        public Criteria andCuredcountIn(List<Integer> values) {
            addCriterion("curedCount in", values, "curedcount");
            return (Criteria) this;
        }

        public Criteria andCuredcountNotIn(List<Integer> values) {
            addCriterion("curedCount not in", values, "curedcount");
            return (Criteria) this;
        }

        public Criteria andCuredcountBetween(Integer value1, Integer value2) {
            addCriterion("curedCount between", value1, value2, "curedcount");
            return (Criteria) this;
        }

        public Criteria andCuredcountNotBetween(Integer value1, Integer value2) {
            addCriterion("curedCount not between", value1, value2, "curedcount");
            return (Criteria) this;
        }

        public Criteria andDeadcountIsNull() {
            addCriterion("deadCount is null");
            return (Criteria) this;
        }

        public Criteria andDeadcountIsNotNull() {
            addCriterion("deadCount is not null");
            return (Criteria) this;
        }

        public Criteria andDeadcountEqualTo(Integer value) {
            addCriterion("deadCount =", value, "deadcount");
            return (Criteria) this;
        }

        public Criteria andDeadcountNotEqualTo(Integer value) {
            addCriterion("deadCount <>", value, "deadcount");
            return (Criteria) this;
        }

        public Criteria andDeadcountGreaterThan(Integer value) {
            addCriterion("deadCount >", value, "deadcount");
            return (Criteria) this;
        }

        public Criteria andDeadcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("deadCount >=", value, "deadcount");
            return (Criteria) this;
        }

        public Criteria andDeadcountLessThan(Integer value) {
            addCriterion("deadCount <", value, "deadcount");
            return (Criteria) this;
        }

        public Criteria andDeadcountLessThanOrEqualTo(Integer value) {
            addCriterion("deadCount <=", value, "deadcount");
            return (Criteria) this;
        }

        public Criteria andDeadcountIn(List<Integer> values) {
            addCriterion("deadCount in", values, "deadcount");
            return (Criteria) this;
        }

        public Criteria andDeadcountNotIn(List<Integer> values) {
            addCriterion("deadCount not in", values, "deadcount");
            return (Criteria) this;
        }

        public Criteria andDeadcountBetween(Integer value1, Integer value2) {
            addCriterion("deadCount between", value1, value2, "deadcount");
            return (Criteria) this;
        }

        public Criteria andDeadcountNotBetween(Integer value1, Integer value2) {
            addCriterion("deadCount not between", value1, value2, "deadcount");
            return (Criteria) this;
        }

        public Criteria andSeriouscountIsNull() {
            addCriterion("seriousCount is null");
            return (Criteria) this;
        }

        public Criteria andSeriouscountIsNotNull() {
            addCriterion("seriousCount is not null");
            return (Criteria) this;
        }

        public Criteria andSeriouscountEqualTo(Integer value) {
            addCriterion("seriousCount =", value, "seriouscount");
            return (Criteria) this;
        }

        public Criteria andSeriouscountNotEqualTo(Integer value) {
            addCriterion("seriousCount <>", value, "seriouscount");
            return (Criteria) this;
        }

        public Criteria andSeriouscountGreaterThan(Integer value) {
            addCriterion("seriousCount >", value, "seriouscount");
            return (Criteria) this;
        }

        public Criteria andSeriouscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("seriousCount >=", value, "seriouscount");
            return (Criteria) this;
        }

        public Criteria andSeriouscountLessThan(Integer value) {
            addCriterion("seriousCount <", value, "seriouscount");
            return (Criteria) this;
        }

        public Criteria andSeriouscountLessThanOrEqualTo(Integer value) {
            addCriterion("seriousCount <=", value, "seriouscount");
            return (Criteria) this;
        }

        public Criteria andSeriouscountIn(List<Integer> values) {
            addCriterion("seriousCount in", values, "seriouscount");
            return (Criteria) this;
        }

        public Criteria andSeriouscountNotIn(List<Integer> values) {
            addCriterion("seriousCount not in", values, "seriouscount");
            return (Criteria) this;
        }

        public Criteria andSeriouscountBetween(Integer value1, Integer value2) {
            addCriterion("seriousCount between", value1, value2, "seriouscount");
            return (Criteria) this;
        }

        public Criteria andSeriouscountNotBetween(Integer value1, Integer value2) {
            addCriterion("seriousCount not between", value1, value2, "seriouscount");
            return (Criteria) this;
        }

        public Criteria andSuspectedincrIsNull() {
            addCriterion("suspectedIncr is null");
            return (Criteria) this;
        }

        public Criteria andSuspectedincrIsNotNull() {
            addCriterion("suspectedIncr is not null");
            return (Criteria) this;
        }

        public Criteria andSuspectedincrEqualTo(Integer value) {
            addCriterion("suspectedIncr =", value, "suspectedincr");
            return (Criteria) this;
        }

        public Criteria andSuspectedincrNotEqualTo(Integer value) {
            addCriterion("suspectedIncr <>", value, "suspectedincr");
            return (Criteria) this;
        }

        public Criteria andSuspectedincrGreaterThan(Integer value) {
            addCriterion("suspectedIncr >", value, "suspectedincr");
            return (Criteria) this;
        }

        public Criteria andSuspectedincrGreaterThanOrEqualTo(Integer value) {
            addCriterion("suspectedIncr >=", value, "suspectedincr");
            return (Criteria) this;
        }

        public Criteria andSuspectedincrLessThan(Integer value) {
            addCriterion("suspectedIncr <", value, "suspectedincr");
            return (Criteria) this;
        }

        public Criteria andSuspectedincrLessThanOrEqualTo(Integer value) {
            addCriterion("suspectedIncr <=", value, "suspectedincr");
            return (Criteria) this;
        }

        public Criteria andSuspectedincrIn(List<Integer> values) {
            addCriterion("suspectedIncr in", values, "suspectedincr");
            return (Criteria) this;
        }

        public Criteria andSuspectedincrNotIn(List<Integer> values) {
            addCriterion("suspectedIncr not in", values, "suspectedincr");
            return (Criteria) this;
        }

        public Criteria andSuspectedincrBetween(Integer value1, Integer value2) {
            addCriterion("suspectedIncr between", value1, value2, "suspectedincr");
            return (Criteria) this;
        }

        public Criteria andSuspectedincrNotBetween(Integer value1, Integer value2) {
            addCriterion("suspectedIncr not between", value1, value2, "suspectedincr");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedincrIsNull() {
            addCriterion("currentConfirmedIncr is null");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedincrIsNotNull() {
            addCriterion("currentConfirmedIncr is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedincrEqualTo(Integer value) {
            addCriterion("currentConfirmedIncr =", value, "currentconfirmedincr");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedincrNotEqualTo(Integer value) {
            addCriterion("currentConfirmedIncr <>", value, "currentconfirmedincr");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedincrGreaterThan(Integer value) {
            addCriterion("currentConfirmedIncr >", value, "currentconfirmedincr");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedincrGreaterThanOrEqualTo(Integer value) {
            addCriterion("currentConfirmedIncr >=", value, "currentconfirmedincr");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedincrLessThan(Integer value) {
            addCriterion("currentConfirmedIncr <", value, "currentconfirmedincr");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedincrLessThanOrEqualTo(Integer value) {
            addCriterion("currentConfirmedIncr <=", value, "currentconfirmedincr");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedincrIn(List<Integer> values) {
            addCriterion("currentConfirmedIncr in", values, "currentconfirmedincr");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedincrNotIn(List<Integer> values) {
            addCriterion("currentConfirmedIncr not in", values, "currentconfirmedincr");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedincrBetween(Integer value1, Integer value2) {
            addCriterion("currentConfirmedIncr between", value1, value2, "currentconfirmedincr");
            return (Criteria) this;
        }

        public Criteria andCurrentconfirmedincrNotBetween(Integer value1, Integer value2) {
            addCriterion("currentConfirmedIncr not between", value1, value2, "currentconfirmedincr");
            return (Criteria) this;
        }

        public Criteria andConfirmedincrIsNull() {
            addCriterion("confirmedIncr is null");
            return (Criteria) this;
        }

        public Criteria andConfirmedincrIsNotNull() {
            addCriterion("confirmedIncr is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmedincrEqualTo(Integer value) {
            addCriterion("confirmedIncr =", value, "confirmedincr");
            return (Criteria) this;
        }

        public Criteria andConfirmedincrNotEqualTo(Integer value) {
            addCriterion("confirmedIncr <>", value, "confirmedincr");
            return (Criteria) this;
        }

        public Criteria andConfirmedincrGreaterThan(Integer value) {
            addCriterion("confirmedIncr >", value, "confirmedincr");
            return (Criteria) this;
        }

        public Criteria andConfirmedincrGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirmedIncr >=", value, "confirmedincr");
            return (Criteria) this;
        }

        public Criteria andConfirmedincrLessThan(Integer value) {
            addCriterion("confirmedIncr <", value, "confirmedincr");
            return (Criteria) this;
        }

        public Criteria andConfirmedincrLessThanOrEqualTo(Integer value) {
            addCriterion("confirmedIncr <=", value, "confirmedincr");
            return (Criteria) this;
        }

        public Criteria andConfirmedincrIn(List<Integer> values) {
            addCriterion("confirmedIncr in", values, "confirmedincr");
            return (Criteria) this;
        }

        public Criteria andConfirmedincrNotIn(List<Integer> values) {
            addCriterion("confirmedIncr not in", values, "confirmedincr");
            return (Criteria) this;
        }

        public Criteria andConfirmedincrBetween(Integer value1, Integer value2) {
            addCriterion("confirmedIncr between", value1, value2, "confirmedincr");
            return (Criteria) this;
        }

        public Criteria andConfirmedincrNotBetween(Integer value1, Integer value2) {
            addCriterion("confirmedIncr not between", value1, value2, "confirmedincr");
            return (Criteria) this;
        }

        public Criteria andCuredincrIsNull() {
            addCriterion("curedIncr is null");
            return (Criteria) this;
        }

        public Criteria andCuredincrIsNotNull() {
            addCriterion("curedIncr is not null");
            return (Criteria) this;
        }

        public Criteria andCuredincrEqualTo(Integer value) {
            addCriterion("curedIncr =", value, "curedincr");
            return (Criteria) this;
        }

        public Criteria andCuredincrNotEqualTo(Integer value) {
            addCriterion("curedIncr <>", value, "curedincr");
            return (Criteria) this;
        }

        public Criteria andCuredincrGreaterThan(Integer value) {
            addCriterion("curedIncr >", value, "curedincr");
            return (Criteria) this;
        }

        public Criteria andCuredincrGreaterThanOrEqualTo(Integer value) {
            addCriterion("curedIncr >=", value, "curedincr");
            return (Criteria) this;
        }

        public Criteria andCuredincrLessThan(Integer value) {
            addCriterion("curedIncr <", value, "curedincr");
            return (Criteria) this;
        }

        public Criteria andCuredincrLessThanOrEqualTo(Integer value) {
            addCriterion("curedIncr <=", value, "curedincr");
            return (Criteria) this;
        }

        public Criteria andCuredincrIn(List<Integer> values) {
            addCriterion("curedIncr in", values, "curedincr");
            return (Criteria) this;
        }

        public Criteria andCuredincrNotIn(List<Integer> values) {
            addCriterion("curedIncr not in", values, "curedincr");
            return (Criteria) this;
        }

        public Criteria andCuredincrBetween(Integer value1, Integer value2) {
            addCriterion("curedIncr between", value1, value2, "curedincr");
            return (Criteria) this;
        }

        public Criteria andCuredincrNotBetween(Integer value1, Integer value2) {
            addCriterion("curedIncr not between", value1, value2, "curedincr");
            return (Criteria) this;
        }

        public Criteria andDeadincrIsNull() {
            addCriterion("deadIncr is null");
            return (Criteria) this;
        }

        public Criteria andDeadincrIsNotNull() {
            addCriterion("deadIncr is not null");
            return (Criteria) this;
        }

        public Criteria andDeadincrEqualTo(Integer value) {
            addCriterion("deadIncr =", value, "deadincr");
            return (Criteria) this;
        }

        public Criteria andDeadincrNotEqualTo(Integer value) {
            addCriterion("deadIncr <>", value, "deadincr");
            return (Criteria) this;
        }

        public Criteria andDeadincrGreaterThan(Integer value) {
            addCriterion("deadIncr >", value, "deadincr");
            return (Criteria) this;
        }

        public Criteria andDeadincrGreaterThanOrEqualTo(Integer value) {
            addCriterion("deadIncr >=", value, "deadincr");
            return (Criteria) this;
        }

        public Criteria andDeadincrLessThan(Integer value) {
            addCriterion("deadIncr <", value, "deadincr");
            return (Criteria) this;
        }

        public Criteria andDeadincrLessThanOrEqualTo(Integer value) {
            addCriterion("deadIncr <=", value, "deadincr");
            return (Criteria) this;
        }

        public Criteria andDeadincrIn(List<Integer> values) {
            addCriterion("deadIncr in", values, "deadincr");
            return (Criteria) this;
        }

        public Criteria andDeadincrNotIn(List<Integer> values) {
            addCriterion("deadIncr not in", values, "deadincr");
            return (Criteria) this;
        }

        public Criteria andDeadincrBetween(Integer value1, Integer value2) {
            addCriterion("deadIncr between", value1, value2, "deadincr");
            return (Criteria) this;
        }

        public Criteria andDeadincrNotBetween(Integer value1, Integer value2) {
            addCriterion("deadIncr not between", value1, value2, "deadincr");
            return (Criteria) this;
        }

        public Criteria andSeriousincrIsNull() {
            addCriterion("seriousIncr is null");
            return (Criteria) this;
        }

        public Criteria andSeriousincrIsNotNull() {
            addCriterion("seriousIncr is not null");
            return (Criteria) this;
        }

        public Criteria andSeriousincrEqualTo(Integer value) {
            addCriterion("seriousIncr =", value, "seriousincr");
            return (Criteria) this;
        }

        public Criteria andSeriousincrNotEqualTo(Integer value) {
            addCriterion("seriousIncr <>", value, "seriousincr");
            return (Criteria) this;
        }

        public Criteria andSeriousincrGreaterThan(Integer value) {
            addCriterion("seriousIncr >", value, "seriousincr");
            return (Criteria) this;
        }

        public Criteria andSeriousincrGreaterThanOrEqualTo(Integer value) {
            addCriterion("seriousIncr >=", value, "seriousincr");
            return (Criteria) this;
        }

        public Criteria andSeriousincrLessThan(Integer value) {
            addCriterion("seriousIncr <", value, "seriousincr");
            return (Criteria) this;
        }

        public Criteria andSeriousincrLessThanOrEqualTo(Integer value) {
            addCriterion("seriousIncr <=", value, "seriousincr");
            return (Criteria) this;
        }

        public Criteria andSeriousincrIn(List<Integer> values) {
            addCriterion("seriousIncr in", values, "seriousincr");
            return (Criteria) this;
        }

        public Criteria andSeriousincrNotIn(List<Integer> values) {
            addCriterion("seriousIncr not in", values, "seriousincr");
            return (Criteria) this;
        }

        public Criteria andSeriousincrBetween(Integer value1, Integer value2) {
            addCriterion("seriousIncr between", value1, value2, "seriousincr");
            return (Criteria) this;
        }

        public Criteria andSeriousincrNotBetween(Integer value1, Integer value2) {
            addCriterion("seriousIncr not between", value1, value2, "seriousincr");
            return (Criteria) this;
        }
    }

    /**
     */
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