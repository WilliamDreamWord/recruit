package com.cs.recruit.entity;

/**
 * Created by asus on 2018/8/10.
 */
public class Personality_SN {
    private String SN_id;  //唯一标识
    private String SN_num; //EI类型题号
    private String SN_name; //EI 类型题目
    private String SN_a; //a选项
    private String SN_b; //b选项

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

    public String getSN_name() {
        return SN_name;
    }

    public void setSN_name(String SN_name) {
        this.SN_name = SN_name;
    }

    public String getSN_a() {
        return SN_a;
    }

    public void setSN_a(String SN_a) {
        this.SN_a = SN_a;
    }

    public String getSN_b() {
        return SN_b;
    }

    public void setSN_b(String SN_b) {
        this.SN_b = SN_b;
    }
}
