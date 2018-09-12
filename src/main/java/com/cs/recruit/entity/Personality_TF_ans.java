package com.cs.recruit.entity;

/**
 * Created by asus on 2018/8/10.
 */
public class Personality_TF_ans {
    private String TF_ans_id; //唯一标识
    private String TF_id; //外键 EI
    private String TF_num; //题号
    private String TF_a_ans;//a答案
    private String TF_b_ans;//b答案
    private String user_id;//user_id

    public String getTF_ans_id() {
        return TF_ans_id;
    }

    public void setTF_ans_id(String TF_ans_id) {
        this.TF_ans_id = TF_ans_id;
    }

    public String getTF_id() {
        return TF_id;
    }

    public void setTF_id(String TF_id) {
        this.TF_id = TF_id;
    }

    public String getTF_num() {
        return TF_num;
    }

    public void setTF_num(String TF_num) {
        this.TF_num = TF_num;
    }

    public String getTF_a_ans() {
        return TF_a_ans;
    }

    public void setTF_a_ans(String TF_a_ans) {
        this.TF_a_ans = TF_a_ans;
    }

    public String getTF_b_ans() {
        return TF_b_ans;
    }

    public void setTF_b_ans(String TF_b_ans) {
        this.TF_b_ans = TF_b_ans;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
