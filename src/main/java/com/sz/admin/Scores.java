package com.sz.admin;

import com.sz.entity.Score;

public class Scores {


        private int scoreid;
        private int   userid;
          private String naem;
          private int  score ;
         private int    pights;
          private int  errors;
          private int paperid;
          private int remarks;

    public int getRemarks() {
        return remarks;
    }

    public void setRemarks(int remarks) {
        this.remarks = remarks;
    }

    public int getPaperid() {
        return paperid;
    }


    public void setPaperid(int paperid) {
        this.paperid = paperid;
    }

    @Override
    public String toString() {
        return "Scores{" +
                "scoreid=" + scoreid +
                ", userid=" + userid +
                ", naem=" + naem +
                ", score=" + score +
                ", pights=" + pights +
                ", errors=" + errors +
                ", paperid=" + paperid +
                ", remarks=" + remarks +
                '}';
    }

    public Scores() {
    }

    public int getScoreid() {
        return scoreid;
    }

    public void setScoreid(int scoreid) {
        this.scoreid = scoreid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getNaem() {
        return naem;
    }

    public void setNaem(String naem) {
        this.naem = naem;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPights() {
        return pights;
    }

    public void setPights(int pights) {
        this.pights = pights;
    }

    public int getErrors() {
        return errors;
    }

    public void setErrors(int errors) {
        this.errors = errors;
    }

    public Scores(int scoreid, int userid, String naem, int score, int pights, int errors, int paperid, int remarks) {
        this.scoreid = scoreid;
        this.userid = userid;
        this.naem = naem;
        this.score = score;
        this.pights = pights;
        this.errors = errors;
        this.paperid = paperid;
        this.remarks = remarks;
    }
}
