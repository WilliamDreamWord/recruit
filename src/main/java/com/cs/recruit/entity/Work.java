package com.cs.recruit.entity;

/**
 * Created by asus on 2018/8/10.
 */
public class Work {
    private String work_id; //工作信息id
    private String user_id; //基本信息id
    private String begandend; //起止时间
    private String comname; //公司名称
    private String peoplenum; //人数
    private String post;
    private String money; //月薪
    private String why; //原因
    private String witness; //证明人和联系电话
    public String toString(){
        return "[" + work_id + " " + user_id + " " + begandend + " " + comname + " " + peoplenum + " "+ post + " " + money + " " + why + " " + witness + "]";
    }
    public String getWork_id() {
        return work_id;
    }

    public void setWork_id(String work_id) {
        this.work_id = work_id;
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
