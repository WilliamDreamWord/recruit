package com.cs.recruit.entity;

/**
 * Created by asus on 2018/8/10.
 */
public class Personality_SN_ans {
    private String SN_ans_id; //唯一标识
    private String SN_id; //外键 EI
    private String SN_num; //题号
    private String SN_a_ans;//a答案
    private String SN_b_ans;//b答案
    private String user_id;//user_id

    public String getSN_ans_id() {
        return SN_ans_id;
    }

    public void setSN_ans_id(String SN_ans_id) {
        this.SN_ans_id = SN_ans_id;
    }

    public String getSN_id() {
        return SN_id;
    }

    public void setSN_id(String SN_id) {
        this.SN_id = SN_id;
    }

    public String getSN_num() {
        return SN_num;
    }

    public void setSN_num(String SN_num) {
        this.SN_num = SN_num;
    }

    public String getSN_a_ans() {
        return SN_a_ans;
    }

    public void setSN_a_ans(String SN_a_ans) {
        this.SN_a_ans = SN_a_ans;
    }

    public String getSN_b_ans() {
        return SN_b_ans;
    }

    public void setSN_b_ans(String SN_b_ans) {
        this.SN_b_ans = SN_b_ans;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
