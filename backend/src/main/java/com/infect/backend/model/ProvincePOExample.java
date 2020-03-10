package com.infect.backend.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProvincePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProvincePOExample() {
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

        public Criteria andDateIsNull() {
            addCriterion("`date` is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("`date` is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("`date` =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("`date` <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("`date` >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("`date` >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("`date` <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("`date` <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("`date` in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("`date` not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("`date` between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("`date` not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameIsNull() {
            addCriterion("provinceShortName is null");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameIsNotNull() {
            addCriterion("provinceShortName is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameEqualTo(String value) {
            addCriterion("provinceShortName =", value, "provinceshortname");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameNotEqualTo(String value) {
            addCriterion("provinceShortName <>", value, "provinceshortname");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameGreaterThan(String value) {
            addCriterion("provinceShortName >", value, "provinceshortname");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameGreaterThanOrEqualTo(String value) {
            addCriterion("provinceShortName >=", value, "provinceshortname");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameLessThan(String value) {
            addCriterion("provinceShortName <", value, "provinceshortname");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameLessThanOrEqualTo(String value) {
            addCriterion("provinceShortName <=", value, "provinceshortname");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameLike(String value) {
            addCriterion("provinceShortName like", value, "provinceshortname");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameNotLike(String value) {
            addCriterion("provinceShortName not like", value, "provinceshortname");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameIn(List<String> values) {
            addCriterion("provinceShortName in", values, "provinceshortname");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameNotIn(List<String> values) {
            addCriterion("provinceShortName not in", values, "provinceshortname");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameBetween(String value1, String value2) {
            addCriterion("provinceShortName between", value1, value2, "provinceshortname");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameNotBetween(String value1, String value2) {
            addCriterion("provinceShortName not between", value1, value2, "provinceshortname");
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