package com.cs.recruit.entity;

/**
 * Created by asus on 2018/8/10.
 */
public class Personality_EI_ans {
    private String EI_ans_id; //唯一标识
    private String EI_id; //外键 EI
    private String EI_num; //题号
    private String EI_a_ans;//a答案
    private String EI_b_ans;//b答案
    private String user_id;//user_id

    public String getEI_ans_id() {
        return EI_ans_id;
    }

    public void setEI_ans_id(String EI_ans_id) {
        this.EI_ans_id = EI_ans_id;
    }

    public String getEI_id() {
        return EI_id;
    }

    public void setEI_id(String EI_id) {
        this.EI_id = EI_id;
    }

    public String getEI_num() {
        return EI_num;
    }

    public void setEI_num(String EI_num) {
        this.EI_num = EI_num;
    }

    public String getEI_a_ans() {
        return EI_a_ans;
    }

    public void setEI_a_ans(String EI_a_ans) {
        this.EI_a_ans = EI_a_ans;
    }

    public String getEI_b_ans() {
        return EI_b_ans;
    }

    public void setEI_b_ans(String EI_b_ans) {
        this.EI_b_ans = EI_b_ans;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
