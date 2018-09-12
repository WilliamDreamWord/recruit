package com.cs.recruit.dto;

/**
 * Created by asus on 2018/8/13.
 */
public class ApplyDto {
    private String apply_id;
    private String post; //申请职位
    private String formdate;//填表日期
    private String comedate;//到岗日期
    private String money;//期望月薪
    public String toString(){
        return "[" + apply_id + " " + post + " " + formdate + " " + comedate + " " + money + "]";
    }

    public String getApply_id() {
        return apply_id;
    }

    public void setApply_id(String apply_id) {
        this.apply_id = apply_id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
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

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

}
