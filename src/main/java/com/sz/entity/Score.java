package com.sz.entity;

public class Score {

    @Override
    public String toString() {
        return "Score{" +
                "scoreid=" + scoreid +
                ", userid=" + userid +
                ", paperid=" + paperid +
                ", score=" + score +
                ", pights=" + pights +
                ", errors=" + errors +
                '}';
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score.scoreid
     *
     * @mbggenerated
     */
    private Integer scoreid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score.userid
     *
     * @mbggenerated
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score.paperid
     *
     * @mbggenerated
     */
    private Integer paperid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score.score
     *
     * @mbggenerated
     */
    private Integer score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score.pights
     *
     * @mbggenerated
     */
    private Integer pights;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score.errors
     *
     * @mbggenerated
     */
    private Integer errors;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score.scoreid
     *
     * @return the value of score.scoreid
     *
     * @mbggenerated
     */
    public Integer getScoreid() {
        return scoreid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score.scoreid
     *
     * @param scoreid the value for score.scoreid
     *
     * @mbggenerated
     */
    public void setScoreid(Integer scoreid) {
        this.scoreid = scoreid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score.userid
     *
     * @return the value of score.userid
     *
     * @mbggenerated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score.userid
     *
     * @param userid the value for score.userid
     *
     * @mbggenerated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score.paperid
     *
     * @return the value of score.paperid
     *
     * @mbggenerated
     */
    public Integer getPaperid() {
        return paperid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score.paperid
     *
     * @param paperid the value for score.paperid
     *
     * @mbggenerated
     */
    public void setPaperid(Integer paperid) {
        this.paperid = paperid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score.score
     *
     * @return the value of score.score
     *
     * @mbggenerated
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score.score
     *
     * @param score the value for score.score
     *
     * @mbggenerated
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score.pights
     *
     * @return the value of score.pights
     *
     * @mbggenerated
     */
    public Integer getPights() {
        return pights;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score.pights
     *
     * @param pights the value for score.pights
     *
     * @mbggenerated
     */
    public void setPights(Integer pights) {
        this.pights = pights;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score.errors
     *
     * @return the value of score.errors
     *
     * @mbggenerated
     */
    public Integer getErrors() {
        return errors;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score.errors
     *
     * @param errors the value for score.errors
     *
     * @mbggenerated
     */
    public void setErrors(Integer errors) {
        this.errors = errors;
    }
}