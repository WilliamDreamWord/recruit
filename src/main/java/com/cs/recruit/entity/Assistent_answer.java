package com.cs.recruit.entity;

/**
 * Created by asus on 2018/8/10.
 */
public class Assistent_answer {

    private String assans_id; //商务助理答案id
    private String user_id; //基本信息id
    private String first_ans; //第一题答案
    private String second_ans; //第二题答案
    private String third_ans; //第三题答案

    public String getAssans_id() {
        return assans_id;
    }

    public void setAssans_id(String assans_id) {
        this.assans_id = assans_id;
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
}
