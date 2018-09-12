package com.cs.recruit.dto;

import java.util.SimpleTimeZone;

/**
 * Created by asus on 2018/8/10.
 */
public class WorkDto {
    private String work_id;
    private String begandend;
    private String comname;
    private String peoplenum;
    private String post;
    private String money;
    private String why;
    private String witness;
    public String toString(){
        return "[" + work_id + " " + begandend + " " + comname + " " + peoplenum + " " + post + " " + money + " " + why + " " + witness + "]";
    }

    public String getWork_id() {
        return work_id;
    }

    public void setWork_id(String work_id) {
        this.work_id = work_id;
    }

    public String getBegandend() {
        return begandend;
    }

    public void setBegandend(String begandend) {
        this.begandend = begandend;
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public String getPeoplenum() {
        return peoplenum;
    }

    public void setPeoplenum(String peoplenum) {
        this.peoplenum = peoplenum;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getWhy() {
        return why;
    }

    public void setWhy(String why) {
        this.why = why;
    }

    public String getWitness() {
        return witness;
    }

    public void setWitness(String witness) {
        this.witness = witness;
    }


    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }


}
