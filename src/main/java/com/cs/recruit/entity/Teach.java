package com.cs.recruit.entity;



/**
 * Created by asus on 2018/8/10.
 */
public class Teach {
    private String teach_id;   //教育信息id
    private String user_id;  //基本信息id
    private String begandend; //教育起止时间
    private String schoole;  //学校或培训机构
    private String major;  //专业
    private String record; //学历或证书
    public String toString(){
        return "[" + teach_id + " " + user_id + " " + begandend + " " + schoole + " " + major + " " + record + "]";
    }

    public String getTeach_id() {
        return teach_id;
    }

    public void setTeach_id(String teach_id) {
        this.teach_id = teach_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getBegandend() {
        return begandend;
    }

    public void setBegandend(String begandend) {
        this.begandend = begandend;
    }

    public String getSchoole() {
        return schoole;
    }

    public void setSchoole(String schoole) {
        this.schoole = schoole;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }
}
