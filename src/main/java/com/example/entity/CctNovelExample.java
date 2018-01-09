package com.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CctNovelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CctNovelExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andNoveltypeIsNull() {
            addCriterion("noveltype is null");
            return (Criteria) this;
        }

        public Criteria andNoveltypeIsNotNull() {
            addCriterion("noveltype is not null");
            return (Criteria) this;
        }

        public Criteria andNoveltypeEqualTo(String value) {
            addCriterion("noveltype =", value, "noveltype");
            return (Criteria) this;
        }

        public Criteria andNoveltypeNotEqualTo(String value) {
            addCriterion("noveltype <>", value, "noveltype");
            return (Criteria) this;
        }

        public Criteria andNoveltypeGreaterThan(String value) {
            addCriterion("noveltype >", value, "noveltype");
            return (Criteria) this;
        }

        public Criteria andNoveltypeGreaterThanOrEqualTo(String value) {
            addCriterion("noveltype >=", value, "noveltype");
            return (Criteria) this;
        }

        public Criteria andNoveltypeLessThan(String value) {
            addCriterion("noveltype <", value, "noveltype");
            return (Criteria) this;
        }

        public Criteria andNoveltypeLessThanOrEqualTo(String value) {
            addCriterion("noveltype <=", value, "noveltype");
            return (Criteria) this;
        }

        public Criteria andNoveltypeLike(String value) {
            addCriterion("noveltype like", value, "noveltype");
            return (Criteria) this;
        }

        public Criteria andNoveltypeNotLike(String value) {
            addCriterion("noveltype not like", value, "noveltype");
            return (Criteria) this;
        }

        public Criteria andNoveltypeIn(List<String> values) {
            addCriterion("noveltype in", values, "noveltype");
            return (Criteria) this;
        }

        public Criteria andNoveltypeNotIn(List<String> values) {
            addCriterion("noveltype not in", values, "noveltype");
            return (Criteria) this;
        }

        public Criteria andNoveltypeBetween(String value1, String value2) {
            addCriterion("noveltype between", value1, value2, "noveltype");
            return (Criteria) this;
        }

        public Criteria andNoveltypeNotBetween(String value1, String value2) {
            addCriterion("noveltype not between", value1, value2, "noveltype");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andNovelstateIsNull() {
            addCriterion("novelstate is null");
            return (Criteria) this;
        }

        public Criteria andNovelstateIsNotNull() {
            addCriterion("novelstate is not null");
            return (Criteria) this;
        }

        public Criteria andNovelstateEqualTo(String value) {
            addCriterion("novelstate =", value, "novelstate");
            return (Criteria) this;
        }

        public Criteria andNovelstateNotEqualTo(String value) {
            addCriterion("novelstate <>", value, "novelstate");
            return (Criteria) this;
        }

        public Criteria andNovelstateGreaterThan(String value) {
            addCriterion("novelstate >", value, "novelstate");
            return (Criteria) this;
        }

        public Criteria andNovelstateGreaterThanOrEqualTo(String value) {
            addCriterion("novelstate >=", value, "novelstate");
            return (Criteria) this;
        }

        public Criteria andNovelstateLessThan(String value) {
            addCriterion("novelstate <", value, "novelstate");
            return (Criteria) this;
        }

        public Criteria andNovelstateLessThanOrEqualTo(String value) {
            addCriterion("novelstate <=", value, "novelstate");
            return (Criteria) this;
        }

        public Criteria andNovelstateLike(String value) {
            addCriterion("novelstate like", value, "novelstate");
            return (Criteria) this;
        }

        public Criteria andNovelstateNotLike(String value) {
            addCriterion("novelstate not like", value, "novelstate");
            return (Criteria) this;
        }

        public Criteria andNovelstateIn(List<String> values) {
            addCriterion("novelstate in", values, "novelstate");
            return (Criteria) this;
        }

        public Criteria andNovelstateNotIn(List<String> values) {
            addCriterion("novelstate not in", values, "novelstate");
            return (Criteria) this;
        }

        public Criteria andNovelstateBetween(String value1, String value2) {
            addCriterion("novelstate between", value1, value2, "novelstate");
            return (Criteria) this;
        }

        public Criteria andNovelstateNotBetween(String value1, String value2) {
            addCriterion("novelstate not between", value1, value2, "novelstate");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterionForJDBCDate("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterionForJDBCDate("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterionForJDBCDate("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startdate not between", value1, value2, "startdate");
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
            addCriterionForJDBCDate("updatedate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("updatedate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("updatedate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updatedate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterionForJDBCDate("updatedate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updatedate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterionForJDBCDate("updatedate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("updatedate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updatedate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updatedate not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andIschargeIsNull() {
            addCriterion("ischarge is null");
            return (Criteria) this;
        }

        public Criteria andIschargeIsNotNull() {
            addCriterion("ischarge is not null");
            return (Criteria) this;
        }

        public Criteria andIschargeEqualTo(String value) {
            addCriterion("ischarge =", value, "ischarge");
            return (Criteria) this;
        }

        public Criteria andIschargeNotEqualTo(String value) {
            addCriterion("ischarge <>", value, "ischarge");
            return (Criteria) this;
        }

        public Criteria andIschargeGreaterThan(String value) {
            addCriterion("ischarge >", value, "ischarge");
            return (Criteria) this;
        }

        public Criteria andIschargeGreaterThanOrEqualTo(String value) {
            addCriterion("ischarge >=", value, "ischarge");
            return (Criteria) this;
        }

        public Criteria andIschargeLessThan(String value) {
            addCriterion("ischarge <", value, "ischarge");
            return (Criteria) this;
        }

        public Criteria andIschargeLessThanOrEqualTo(String value) {
            addCriterion("ischarge <=", value, "ischarge");
            return (Criteria) this;
        }

        public Criteria andIschargeLike(String value) {
            addCriterion("ischarge like", value, "ischarge");
            return (Criteria) this;
        }

        public Criteria andIschargeNotLike(String value) {
            addCriterion("ischarge not like", value, "ischarge");
            return (Criteria) this;
        }

        public Criteria andIschargeIn(List<String> values) {
            addCriterion("ischarge in", values, "ischarge");
            return (Criteria) this;
        }

        public Criteria andIschargeNotIn(List<String> values) {
            addCriterion("ischarge not in", values, "ischarge");
            return (Criteria) this;
        }

        public Criteria andIschargeBetween(String value1, String value2) {
            addCriterion("ischarge between", value1, value2, "ischarge");
            return (Criteria) this;
        }

        public Criteria andIschargeNotBetween(String value1, String value2) {
            addCriterion("ischarge not between", value1, value2, "ischarge");
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