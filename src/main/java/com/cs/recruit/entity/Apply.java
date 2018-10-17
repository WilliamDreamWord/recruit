package com.cs.recruit.entity;

/**
 * 应聘登记
 * Created by asus on 2018/8/10.
 */
public class Apply {
    private String apply_id; //应聘登记id
    private String user_id; //基本信息id
    private String post; //申请职位
    private String identity; //应聘者身份
    private String money; //期望月薪
    private String formdate; //填表日期
    private String comedate; //到岗日期

    @Override
    public String toString() {
        return "Apply{" +
                "apply_id='" + apply_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", post='" + post + '\'' +
                ", identity='" + identity + '\'' +
                ", money='" + money + '\'' +
                ", formdate='" + formdate + '\'' +
                ", comedate='" + comedate + '\'' +
                '}';
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getApply_id() {
        return apply_id;
    }

    public void setApply_id(String apply_id) {
        this.apply_id = apply_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getFormdate() {
        return formdate;
    }

    public void setFormdate(String formdate) {
        this.formdate = formdate;
    }

    public String getComedate() {
        return comedate;
    }

    public void setComedate(String comedate) {
        this.comedate = comedate;
    }
}
