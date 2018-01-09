package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class SysconfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysconfigExample() {
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

        public Criteria andParameterIsNull() {
            addCriterion("parameter is null");
            return (Criteria) this;
        }

        public Criteria andParameterIsNotNull() {
            addCriterion("parameter is not null");
            return (Criteria) this;
        }

        public Criteria andParameterEqualTo(String value) {
            addCriterion("parameter =", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotEqualTo(String value) {
            addCriterion("parameter <>", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterGreaterThan(String value) {
            addCriterion("parameter >", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterGreaterThanOrEqualTo(String value) {
            addCriterion("parameter >=", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLessThan(String value) {
            addCriterion("parameter <", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLessThanOrEqualTo(String value) {
            addCriterion("parameter <=", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLike(String value) {
            addCriterion("parameter like", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotLike(String value) {
            addCriterion("parameter not like", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterIn(List<String> values) {
            addCriterion("parameter in", values, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotIn(List<String> values) {
            addCriterion("parameter not in", values, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterBetween(String value1, String value2) {
            addCriterion("parameter between", value1, value2, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotBetween(String value1, String value2) {
            addCriterion("parameter not between", value1, value2, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameternameIsNull() {
            addCriterion("parametername is null");
            return (Criteria) this;
        }

        public Criteria andParameternameIsNotNull() {
            addCriterion("parametername is not null");
            return (Criteria) this;
        }

        public Criteria andParameternameEqualTo(String value) {
            addCriterion("parametername =", value, "parametername");
            return (Criteria) this;
        }

        public Criteria andParameternameNotEqualTo(String value) {
            addCriterion("parametername <>", value, "parametername");
            return (Criteria) this;
        }

        public Criteria andParameternameGreaterThan(String value) {
            addCriterion("parametername >", value, "parametername");
            return (Criteria) this;
        }

        public Criteria andParameternameGreaterThanOrEqualTo(String value) {
            addCriterion("parametername >=", value, "parametername");
            return (Criteria) this;
        }

        public Criteria andParameternameLessThan(String value) {
            addCriterion("parametername <", value, "parametername");
            return (Criteria) this;
        }

        public Criteria andParameternameLessThanOrEqualTo(String value) {
            addCriterion("parametername <=", value, "parametername");
            return (Criteria) this;
        }

        public Criteria andParameternameLike(String value) {
            addCriterion("parametername like", value, "parametername");
            return (Criteria) this;
        }

        public Criteria andParameternameNotLike(String value) {
            addCriterion("parametername not like", value, "parametername");
            return (Criteria) this;
        }

        public Criteria andParameternameIn(List<String> values) {
            addCriterion("parametername in", values, "parametername");
            return (Criteria) this;
        }

        public Criteria andParameternameNotIn(List<String> values) {
            addCriterion("parametername not in", values, "parametername");
            return (Criteria) this;
        }

        public Criteria andParameternameBetween(String value1, String value2) {
            addCriterion("parametername between", value1, value2, "parametername");
            return (Criteria) this;
        }

        public Criteria andParameternameNotBetween(String value1, String value2) {
            addCriterion("parametername not between", value1, value2, "parametername");
            return (Criteria) this;
        }

        public Criteria andParametervalueIsNull() {
            addCriterion("parametervalue is null");
            return (Criteria) this;
        }

        public Criteria andParametervalueIsNotNull() {
            addCriterion("parametervalue is not null");
            return (Criteria) this;
        }

        public Criteria andParametervalueEqualTo(String value) {
            addCriterion("parametervalue =", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueNotEqualTo(String value) {
            addCriterion("parametervalue <>", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueGreaterThan(String value) {
            addCriterion("parametervalue >", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueGreaterThanOrEqualTo(String value) {
            addCriterion("parametervalue >=", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueLessThan(String value) {
            addCriterion("parametervalue <", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueLessThanOrEqualTo(String value) {
            addCriterion("parametervalue <=", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueLike(String value) {
            addCriterion("parametervalue like", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueNotLike(String value) {
            addCriterion("parametervalue not like", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueIn(List<String> values) {
            addCriterion("parametervalue in", values, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueNotIn(List<String> values) {
            addCriterion("parametervalue not in", values, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueBetween(String value1, String value2) {
            addCriterion("parametervalue between", value1, value2, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueNotBetween(String value1, String value2) {
            addCriterion("parametervalue not between", value1, value2, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueexplainIsNull() {
            addCriterion("parametervalueexplain is null");
            return (Criteria) this;
        }

        public Criteria andParametervalueexplainIsNotNull() {
            addCriterion("parametervalueexplain is not null");
            return (Criteria) this;
        }

        public Criteria andParametervalueexplainEqualTo(String value) {
            addCriterion("parametervalueexplain =", value, "parametervalueexplain");
            return (Criteria) this;
        }

        public Criteria andParametervalueexplainNotEqualTo(String value) {
            addCriterion("parametervalueexplain <>", value, "parametervalueexplain");
            return (Criteria) this;
        }

        public Criteria andParametervalueexplainGreaterThan(String value) {
            addCriterion("parametervalueexplain >", value, "parametervalueexplain");
            return (Criteria) this;
        }

        public Criteria andParametervalueexplainGreaterThanOrEqualTo(String value) {
            addCriterion("parametervalueexplain >=", value, "parametervalueexplain");
            return (Criteria) this;
        }

        public Criteria andParametervalueexplainLessThan(String value) {
            addCriterion("parametervalueexplain <", value, "parametervalueexplain");
            return (Criteria) this;
        }

        public Criteria andParametervalueexplainLessThanOrEqualTo(String value) {
            addCriterion("parametervalueexplain <=", value, "parametervalueexplain");
            return (Criteria) this;
        }

        public Criteria andParametervalueexplainLike(String value) {
            addCriterion("parametervalueexplain like", value, "parametervalueexplain");
            return (Criteria) this;
        }

        public Criteria andParametervalueexplainNotLike(String value) {
            addCriterion("parametervalueexplain not like", value, "parametervalueexplain");
            return (Criteria) this;
        }

        public Criteria andParametervalueexplainIn(List<String> values) {
            addCriterion("parametervalueexplain in", values, "parametervalueexplain");
            return (Criteria) this;
        }

        public Criteria andParametervalueexplainNotIn(List<String> values) {
            addCriterion("parametervalueexplain not in", values, "parametervalueexplain");
            return (Criteria) this;
        }

        public Criteria andParametervalueexplainBetween(String value1, String value2) {
            addCriterion("parametervalueexplain between", value1, value2, "parametervalueexplain");
            return (Criteria) this;
        }

        public Criteria andParametervalueexplainNotBetween(String value1, String value2) {
            addCriterion("parametervalueexplain not between", value1, value2, "parametervalueexplain");
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