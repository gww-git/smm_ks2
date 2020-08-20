package com.sz.entity;

import java.util.ArrayList;
import java.util.List;

public class ScoreExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table score
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table score
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table score
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated
     */
    public ScoreExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table score
     *
     * @mbggenerated
     */
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

        public Criteria andScoreidIsNull() {
            addCriterion("scoreid is null");
            return (Criteria) this;
        }

        public Criteria andScoreidIsNotNull() {
            addCriterion("scoreid is not null");
            return (Criteria) this;
        }

        public Criteria andScoreidEqualTo(Integer value) {
            addCriterion("scoreid =", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidNotEqualTo(Integer value) {
            addCriterion("scoreid <>", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidGreaterThan(Integer value) {
            addCriterion("scoreid >", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("scoreid >=", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidLessThan(Integer value) {
            addCriterion("scoreid <", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidLessThanOrEqualTo(Integer value) {
            addCriterion("scoreid <=", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidIn(List<Integer> values) {
            addCriterion("scoreid in", values, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidNotIn(List<Integer> values) {
            addCriterion("scoreid not in", values, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidBetween(Integer value1, Integer value2) {
            addCriterion("scoreid between", value1, value2, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("scoreid not between", value1, value2, "scoreid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPaperidIsNull() {
            addCriterion("paperid is null");
            return (Criteria) this;
        }

        public Criteria andPaperidIsNotNull() {
            addCriterion("paperid is not null");
            return (Criteria) this;
        }

        public Criteria andPaperidEqualTo(Integer value) {
            addCriterion("paperid =", value, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidNotEqualTo(Integer value) {
            addCriterion("paperid <>", value, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidGreaterThan(Integer value) {
            addCriterion("paperid >", value, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidGreaterThanOrEqualTo(Integer value) {
            addCriterion("paperid >=", value, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidLessThan(Integer value) {
            addCriterion("paperid <", value, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidLessThanOrEqualTo(Integer value) {
            addCriterion("paperid <=", value, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidIn(List<Integer> values) {
            addCriterion("paperid in", values, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidNotIn(List<Integer> values) {
            addCriterion("paperid not in", values, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidBetween(Integer value1, Integer value2) {
            addCriterion("paperid between", value1, value2, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidNotBetween(Integer value1, Integer value2) {
            addCriterion("paperid not between", value1, value2, "paperid");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andPightsIsNull() {
            addCriterion("pights is null");
            return (Criteria) this;
        }

        public Criteria andPightsIsNotNull() {
            addCriterion("pights is not null");
            return (Criteria) this;
        }

        public Criteria andPightsEqualTo(Integer value) {
            addCriterion("pights =", value, "pights");
            return (Criteria) this;
        }

        public Criteria andPightsNotEqualTo(Integer value) {
            addCriterion("pights <>", value, "pights");
            return (Criteria) this;
        }

        public Criteria andPightsGreaterThan(Integer value) {
            addCriterion("pights >", value, "pights");
            return (Criteria) this;
        }

        public Criteria andPightsGreaterThanOrEqualTo(Integer value) {
            addCriterion("pights >=", value, "pights");
            return (Criteria) this;
        }

        public Criteria andPightsLessThan(Integer value) {
            addCriterion("pights <", value, "pights");
            return (Criteria) this;
        }

        public Criteria andPightsLessThanOrEqualTo(Integer value) {
            addCriterion("pights <=", value, "pights");
            return (Criteria) this;
        }

        public Criteria andPightsIn(List<Integer> values) {
            addCriterion("pights in", values, "pights");
            return (Criteria) this;
        }

        public Criteria andPightsNotIn(List<Integer> values) {
            addCriterion("pights not in", values, "pights");
            return (Criteria) this;
        }

        public Criteria andPightsBetween(Integer value1, Integer value2) {
            addCriterion("pights between", value1, value2, "pights");
            return (Criteria) this;
        }

        public Criteria andPightsNotBetween(Integer value1, Integer value2) {
            addCriterion("pights not between", value1, value2, "pights");
            return (Criteria) this;
        }

        public Criteria andErrorsIsNull() {
            addCriterion("errors is null");
            return (Criteria) this;
        }

        public Criteria andErrorsIsNotNull() {
            addCriterion("errors is not null");
            return (Criteria) this;
        }

        public Criteria andErrorsEqualTo(Integer value) {
            addCriterion("errors =", value, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsNotEqualTo(Integer value) {
            addCriterion("errors <>", value, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsGreaterThan(Integer value) {
            addCriterion("errors >", value, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsGreaterThanOrEqualTo(Integer value) {
            addCriterion("errors >=", value, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsLessThan(Integer value) {
            addCriterion("errors <", value, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsLessThanOrEqualTo(Integer value) {
            addCriterion("errors <=", value, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsIn(List<Integer> values) {
            addCriterion("errors in", values, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsNotIn(List<Integer> values) {
            addCriterion("errors not in", values, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsBetween(Integer value1, Integer value2) {
            addCriterion("errors between", value1, value2, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsNotBetween(Integer value1, Integer value2) {
            addCriterion("errors not between", value1, value2, "errors");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table score
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table score
     *
     * @mbggenerated
     */
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