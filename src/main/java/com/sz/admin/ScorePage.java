package com.sz.admin;

public class ScorePage {

    //成绩表
    private  int scoreid;   //成绩表id
    private  int userid;  //用户id
   private int paperid;   //试卷id
   private int   score;
   private int    pights ;
   private int    errors ;

   //  成绩详情表
      private int dataid;
//      private  int scoreid;  //成绩表id
      private  int eid;  //试题id
      private   String  uanswer;
     private int  upoint;

//     private int  eid; //试题id
    private String    ename;
//    private int     paperid;  //试卷id
    private int    escore;
    private int      etype;
    private int        edegree;
    private String  ea;
    private String     eb;
    private String    ec;
    private String     ed;
    private String    ee;
    private String     ey;
    private String     ekeys;
    private String      ehints;


    //试卷表

//    private int   paperid ; //id
    private String papernames;
    private String    papertype;
    private String    method;
    private String    remarks;
    private String   createtime;


    @Override
    public String toString() {
        return "ScorePage{" +
                "scoreid=" + scoreid +
                ", userid=" + userid +
                ", paperid=" + paperid +
                ", score=" + score +
                ", pights=" + pights +
                ", errors=" + errors +
                ", dataid=" + dataid +
                ", eid=" + eid +
                ", uanswer='" + uanswer + '\'' +
                ", upoint=" + upoint +
                ", ename='" + ename + '\'' +
                ", escore=" + escore +
                ", etype=" + etype +
                ", edegree=" + edegree +
                ", ea='" + ea + '\'' +
                ", eb='" + eb + '\'' +
                ", ec='" + ec + '\'' +
                ", ed='" + ed + '\'' +
                ", ee='" + ee + '\'' +
                ", ey='" + ey + '\'' +
                ", ekeys='" + ekeys + '\'' +
                ", ehints='" + ehints + '\'' +
                ", papernames='" + papernames + '\'' +
                ", papertype='" + papertype + '\'' +
                ", method='" + method + '\'' +
                ", remarks='" + remarks + '\'' +
                ", createtime='" + createtime + '\'' +
                '}';
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

    public int getPaperid() {
        return paperid;
    }

    public void setPaperid(int paperid) {
        this.paperid = paperid;
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

    public int getDataid() {
        return dataid;
    }

    public void setDataid(int dataid) {
        this.dataid = dataid;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getUanswer() {
        return uanswer;
    }

    public void setUanswer(String uanswer) {
        this.uanswer = uanswer;
    }

    public int getUpoint() {
        return upoint;
    }

    public void setUpoint(int upoint) {
        this.upoint = upoint;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEscore() {
        return escore;
    }

    public void setEscore(int escore) {
        this.escore = escore;
    }

    public int getEtype() {
        return etype;
    }

    public void setEtype(int etype) {
        this.etype = etype;
    }

    public int getEdegree() {
        return edegree;
    }

    public void setEdegree(int edegree) {
        this.edegree = edegree;
    }

    public String getEa() {
        return ea;
    }

    public void setEa(String ea) {
        this.ea = ea;
    }

    public String getEb() {
        return eb;
    }

    public void setEb(String eb) {
        this.eb = eb;
    }

    public String getEc() {
        return ec;
    }

    public void setEc(String ec) {
        this.ec = ec;
    }

    public String getEd() {
        return ed;
    }

    public void setEd(String ed) {
        this.ed = ed;
    }

    public String getEe() {
        return ee;
    }

    public void setEe(String ee) {
        this.ee = ee;
    }

    public String getEy() {
        return ey;
    }

    public void setEy(String ey) {
        this.ey = ey;
    }

    public String getEkeys() {
        return ekeys;
    }

    public void setEkeys(String ekeys) {
        this.ekeys = ekeys;
    }

    public String getEhints() {
        return ehints;
    }

    public void setEhints(String ehints) {
        this.ehints = ehints;
    }

    public String getPapernames() {
        return papernames;
    }

    public void setPapernames(String papernames) {
        this.papernames = papernames;
    }

    public String getPapertype() {
        return papertype;
    }

    public void setPapertype(String papertype) {
        this.papertype = papertype;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public ScorePage() {
    }

    public ScorePage(int scoreid, int userid, int paperid, int score, int pights, int errors, int dataid, int eid, String uanswer, int upoint, String ename, int escore, int etype, int edegree, String ea, String eb, String ec, String ed, String ee, String ey, String ekeys, String ehints, String papernames, String papertype, String method, String remarks, String createtime) {
        this.scoreid = scoreid;
        this.userid = userid;
        this.paperid = paperid;
        this.score = score;
        this.pights = pights;
        this.errors = errors;
        this.dataid = dataid;
        this.eid = eid;
        this.uanswer = uanswer;
        this.upoint = upoint;
        this.ename = ename;
        this.escore = escore;
        this.etype = etype;
        this.edegree = edegree;
        this.ea = ea;
        this.eb = eb;
        this.ec = ec;
        this.ed = ed;
        this.ee = ee;
        this.ey = ey;
        this.ekeys = ekeys;
        this.ehints = ehints;
        this.papernames = papernames;
        this.papertype = papertype;
        this.method = method;
        this.remarks = remarks;
        this.createtime = createtime;
    }
}
