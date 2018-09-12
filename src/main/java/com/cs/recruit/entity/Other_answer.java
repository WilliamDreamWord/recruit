package com.cs.recruit.entity;

/**
 * Created by asus on 2018/8/10.
 */
public class Other_answer {
    private String othans_id; //其他题库答案id
    private String user_id; //基本信息id
    private String first_ans; //面试者第一题答案
    private String second_ans; //面试者第二题答案

    public String getOthans_id() {
        return othans_id;
    }

    public void setOthans_id(String othans_id) {
        this.othans_id = othans_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String baser_id) {
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

}
