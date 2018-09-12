package com.cs.recruit.dto;

/**
 * Created by asus on 2018/8/10.
 */
public class TeachDto {
    private String teach_id;
    private String begandend;
    private String schoole;
    private String major;
    private String record;
    public String toString(){
        return "[" + teach_id + " " + begandend + " " + schoole + " " + major + " " + record + "]";
    }

    public String getTeach_id() {
        return teach_id;
    }

    public void setTeach_id(String teach_id) {
        this.teach_id = teach_id;
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
