package com.cs.recruit.entity;

/**
 * Created by asus on 2018/8/10.
 */
public class Sale_answer {
    private String saleans_id;//区域销售答案id
    private String user_id; //基本信息id
    private String first_ans; //第一题答案
    private String second_ans; //第二题答案
    private String third_ans; //第三题答案
    private String fourth_ans; //第四题答案

    public String getSaleans_id() {
        return saleans_id;
    }

    public void setSaleans_id(String saleans_id) {
        this.saleans_id = saleans_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getFirst_ans() {
        return first_ans;
    }

    public void setFirst_ans(String first_ans) {
        this.first_ans = first_ans;
    }

    public String getSecond_ans() {
        return second_ans;
    }

    public void setSecond_ans(String second_ans) {
        this.second_ans = second_ans;
    }

    public String getThird_ans() {
        return third_ans;
    }

    public void setThird_ans(String third_ans) {
        this.third_ans = third_ans;
    }

    public String getFourth_ans() {
        return fourth_ans;
    }

    public void setFourth_ans(String fourth_ans) {
        this.fourth_ans = fourth_ans;
    }
}
