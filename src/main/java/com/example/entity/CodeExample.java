package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class CodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CodeExample() {
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

        public Criteria andCodeidIsNull() {
            addCriterion("codeid is null");
            return (Criteria) this;
        }

        public Criteria andCodeidIsNotNull() {
            addCriterion("codeid is not null");
            return (Criteria) this;
        }

        public Criteria andCodeidEqualTo(Integer value) {
            addCriterion("codeid =", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidNotEqualTo(Integer value) {
            addCriterion("codeid <>", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidGreaterThan(Integer value) {
            addCriterion("codeid >", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("codeid >=", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidLessThan(Integer value) {
            addCriterion("codeid <", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidLessThanOrEqualTo(Integer value) {
            addCriterion("codeid <=", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidIn(List<Integer> values) {
            addCriterion("codeid in", values, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidNotIn(List<Integer> values) {
            addCriterion("codeid not in", values, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidBetween(Integer value1, Integer value2) {
            addCriterion("codeid between", value1, value2, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidNotBetween(Integer value1, Integer value2) {
            addCriterion("codeid not between", value1, value2, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodetypeIsNull() {
            addCriterion("codetype is null");
            return (Criteria) this;
        }

        public Criteria andCodetypeIsNotNull() {
            addCriterion("codetype is not null");
            return (Criteria) this;
        }

        public Criteria andCodetypeEqualTo(String value) {
            addCriterion("codetype =", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeNotEqualTo(String value) {
            addCriterion("codetype <>", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeGreaterThan(String value) {
            addCriterion("codetype >", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeGreaterThanOrEqualTo(String value) {
            addCriterion("codetype >=", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeLessThan(String value) {
            addCriterion("codetype <", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeLessThanOrEqualTo(String value) {
            addCriterion("codetype <=", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeLike(String value) {
            addCriterion("codetype like", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeNotLike(String value) {
            addCriterion("codetype not like", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeIn(List<String> values) {
            addCriterion("codetype in", values, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeNotIn(List<String> values) {
            addCriterion("codetype not in", values, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeBetween(String value1, String value2) {
            addCriterion("codetype between", value1, value2, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeNotBetween(String value1, String value2) {
            addCriterion("codetype not between", value1, value2, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodeproiceIsNull() {
            addCriterion("codeproice is null");
            return (Criteria) this;
        }

        public Criteria andCodeproiceIsNotNull() {
            addCriterion("codeproice is not null");
            return (Criteria) this;
        }

        public Criteria andCodeproiceEqualTo(String value) {
            addCriterion("codeproice =", value, "codeproice");
            return (Criteria) this;
        }

        public Criteria andCodeproiceNotEqualTo(String value) {
            addCriterion("codeproice <>", value, "codeproice");
            return (Criteria) this;
        }

        public Criteria andCodeproiceGreaterThan(String value) {
            addCriterion("codeproice >", value, "codeproice");
            return (Criteria) this;
        }

        public Criteria andCodeproiceGreaterThanOrEqualTo(String value) {
            addCriterion("codeproice >=", value, "codeproice");
            return (Criteria) this;
        }

        public Criteria andCodeproiceLessThan(String value) {
            addCriterion("codeproice <", value, "codeproice");
            return (Criteria) this;
        }

        public Criteria andCodeproiceLessThanOrEqualTo(String value) {
            addCriterion("codeproice <=", value, "codeproice");
            return (Criteria) this;
        }

        public Criteria andCodeproiceLike(String value) {
            addCriterion("codeproice like", value, "codeproice");
            return (Criteria) this;
        }

        public Criteria andCodeproiceNotLike(String value) {
            addCriterion("codeproice not like", value, "codeproice");
            return (Criteria) this;
        }

        public Criteria andCodeproiceIn(List<String> values) {
            addCriterion("codeproice in", values, "codeproice");
            return (Criteria) this;
        }

        public Criteria andCodeproiceNotIn(List<String> values) {
            addCriterion("codeproice not in", values, "codeproice");
            return (Criteria) this;
        }

        public Criteria andCodeproiceBetween(String value1, String value2) {
            addCriterion("codeproice between", value1, value2, "codeproice");
            return (Criteria) this;
        }

        public Criteria andCodeproiceNotBetween(String value1, String value2) {
            addCriterion("codeproice not between", value1, value2, "codeproice");
            return (Criteria) this;
        }

        public Criteria andCodenameIsNull() {
            addCriterion("codename is null");
            return (Criteria) this;
        }

        public Criteria andCodenameIsNotNull() {
            addCriterion("codename is not null");
            return (Criteria) this;
        }

        public Criteria andCodenameEqualTo(String value) {
            addCriterion("codename =", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotEqualTo(String value) {
            addCriterion("codename <>", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameGreaterThan(String value) {
            addCriterion("codename >", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameGreaterThanOrEqualTo(String value) {
            addCriterion("codename >=", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameLessThan(String value) {
            addCriterion("codename <", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameLessThanOrEqualTo(String value) {
            addCriterion("codename <=", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameLike(String value) {
            addCriterion("codename like", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotLike(String value) {
            addCriterion("codename not like", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameIn(List<String> values) {
            addCriterion("codename in", values, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotIn(List<String> values) {
            addCriterion("codename not in", values, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameBetween(String value1, String value2) {
            addCriterion("codename between", value1, value2, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotBetween(String value1, String value2) {
            addCriterion("codename not between", value1, value2, "codename");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNull() {
            addCriterion("isvalid is null");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNotNull() {
            addCriterion("isvalid is not null");
            return (Criteria) this;
        }

        public Criteria andIsvalidEqualTo(String value) {
            addCriterion("isvalid =", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotEqualTo(String value) {
            addCriterion("isvalid <>", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThan(String value) {
            addCriterion("isvalid >", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThanOrEqualTo(String value) {
            addCriterion("isvalid >=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThan(String value) {
            addCriterion("isvalid <", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThanOrEqualTo(String value) {
            addCriterion("isvalid <=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLike(String value) {
            addCriterion("isvalid like", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotLike(String value) {
            addCriterion("isvalid not like", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidIn(List<String> values) {
            addCriterion("isvalid in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotIn(List<String> values) {
            addCriterion("isvalid not in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidBetween(String value1, String value2) {
            addCriterion("isvalid between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotBetween(String value1, String value2) {
            addCriterion("isvalid not between", value1, value2, "isvalid");
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