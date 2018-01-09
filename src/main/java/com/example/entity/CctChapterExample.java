package com.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CctChapterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CctChapterExample() {
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

        public Criteria andChapteridIsNull() {
            addCriterion("chapterid is null");
            return (Criteria) this;
        }

        public Criteria andChapteridIsNotNull() {
            addCriterion("chapterid is not null");
            return (Criteria) this;
        }

        public Criteria andChapteridEqualTo(Integer value) {
            addCriterion("chapterid =", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridNotEqualTo(Integer value) {
            addCriterion("chapterid <>", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridGreaterThan(Integer value) {
            addCriterion("chapterid >", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("chapterid >=", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridLessThan(Integer value) {
            addCriterion("chapterid <", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridLessThanOrEqualTo(Integer value) {
            addCriterion("chapterid <=", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridIn(List<Integer> values) {
            addCriterion("chapterid in", values, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridNotIn(List<Integer> values) {
            addCriterion("chapterid not in", values, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridBetween(Integer value1, Integer value2) {
            addCriterion("chapterid between", value1, value2, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridNotBetween(Integer value1, Integer value2) {
            addCriterion("chapterid not between", value1, value2, "chapterid");
            return (Criteria) this;
        }

        public Criteria andNovelidIsNull() {
            addCriterion("novelid is null");
            return (Criteria) this;
        }

        public Criteria andNovelidIsNotNull() {
            addCriterion("novelid is not null");
            return (Criteria) this;
        }

        public Criteria andNovelidEqualTo(Integer value) {
            addCriterion("novelid =", value, "novelid");
            return (Criteria) this;
        }

        public Criteria andNovelidNotEqualTo(Integer value) {
            addCriterion("novelid <>", value, "novelid");
            return (Criteria) this;
        }

        public Criteria andNovelidGreaterThan(Integer value) {
            addCriterion("novelid >", value, "novelid");
            return (Criteria) this;
        }

        public Criteria andNovelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("novelid >=", value, "novelid");
            return (Criteria) this;
        }

        public Criteria andNovelidLessThan(Integer value) {
            addCriterion("novelid <", value, "novelid");
            return (Criteria) this;
        }

        public Criteria andNovelidLessThanOrEqualTo(Integer value) {
            addCriterion("novelid <=", value, "novelid");
            return (Criteria) this;
        }

        public Criteria andNovelidIn(List<Integer> values) {
            addCriterion("novelid in", values, "novelid");
            return (Criteria) this;
        }

        public Criteria andNovelidNotIn(List<Integer> values) {
            addCriterion("novelid not in", values, "novelid");
            return (Criteria) this;
        }

        public Criteria andNovelidBetween(Integer value1, Integer value2) {
            addCriterion("novelid between", value1, value2, "novelid");
            return (Criteria) this;
        }

        public Criteria andNovelidNotBetween(Integer value1, Integer value2) {
            addCriterion("novelid not between", value1, value2, "novelid");
            return (Criteria) this;
        }

        public Criteria andChapternameIsNull() {
            addCriterion("chaptername is null");
            return (Criteria) this;
        }

        public Criteria andChapternameIsNotNull() {
            addCriterion("chaptername is not null");
            return (Criteria) this;
        }

        public Criteria andChapternameEqualTo(String value) {
            addCriterion("chaptername =", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameNotEqualTo(String value) {
            addCriterion("chaptername <>", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameGreaterThan(String value) {
            addCriterion("chaptername >", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameGreaterThanOrEqualTo(String value) {
            addCriterion("chaptername >=", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameLessThan(String value) {
            addCriterion("chaptername <", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameLessThanOrEqualTo(String value) {
            addCriterion("chaptername <=", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameLike(String value) {
            addCriterion("chaptername like", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameNotLike(String value) {
            addCriterion("chaptername not like", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameIn(List<String> values) {
            addCriterion("chaptername in", values, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameNotIn(List<String> values) {
            addCriterion("chaptername not in", values, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameBetween(String value1, String value2) {
            addCriterion("chaptername between", value1, value2, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameNotBetween(String value1, String value2) {
            addCriterion("chaptername not between", value1, value2, "chaptername");
            return (Criteria) this;
        }

        public Criteria andSynopsisIsNull() {
            addCriterion("synopsis is null");
            return (Criteria) this;
        }

        public Criteria andSynopsisIsNotNull() {
            addCriterion("synopsis is not null");
            return (Criteria) this;
        }

        public Criteria andSynopsisEqualTo(String value) {
            addCriterion("synopsis =", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisNotEqualTo(String value) {
            addCriterion("synopsis <>", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisGreaterThan(String value) {
            addCriterion("synopsis >", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisGreaterThanOrEqualTo(String value) {
            addCriterion("synopsis >=", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisLessThan(String value) {
            addCriterion("synopsis <", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisLessThanOrEqualTo(String value) {
            addCriterion("synopsis <=", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisLike(String value) {
            addCriterion("synopsis like", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisNotLike(String value) {
            addCriterion("synopsis not like", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisIn(List<String> values) {
            addCriterion("synopsis in", values, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisNotIn(List<String> values) {
            addCriterion("synopsis not in", values, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisBetween(String value1, String value2) {
            addCriterion("synopsis between", value1, value2, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisNotBetween(String value1, String value2) {
            addCriterion("synopsis not between", value1, value2, "synopsis");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("updatedate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("updatedate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("updatedate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("updatedate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("updatedate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("updatedate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("updatedate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("updatedate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("updatedate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("updatedate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("updatedate not between", value1, value2, "updatedate");
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