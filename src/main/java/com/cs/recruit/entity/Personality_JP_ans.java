package com.cs.recruit.entity;

/**
 * Created by asus on 2018/8/10.
 */
public class Personality_JP_ans {
    private String JP_ans_id; //唯一标识
    private String JP_id; //外键 EI
    private String JP_num; //题号
    private String JP_a_ans;//a答案
    private String JP_b_ans;//b答案
    private String user_id;//user_id

    public String getJP_ans_id() {
        return JP_ans_id;
    }

    public void setJP_ans_id(String JP_ans_id) {
        this.JP_ans_id = JP_ans_id;
    }

    public String getJP_id() {
        return JP_id;
    }

    public void setJP_id(String JP_id) {
        this.JP_id = JP_id;
    }

    public String getJP_num() {
        return JP_num;
    }

    public void setJP_num(String JP_num) {
        this.JP_num = JP_num;
    }

    public String getJP_a_ans() {
        return JP_a_ans;
    }

    public void setJP_a_ans(String JP_a_ans) {
        this.JP_a_ans = JP_a_ans;
    }

    public String getJP_b_ans() {
        return JP_b_ans;
    }

    public void setJP_b_ans(String JP_b_ans) {
        this.JP_b_ans = JP_b_ans;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
