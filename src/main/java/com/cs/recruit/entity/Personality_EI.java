package com.cs.recruit.entity;

/**
 * Created by asus on 2018/8/10.
 */
public class Personality_EI {
    private String EI_id;  //唯一标识
    private String EI_num; //EI类型题号
    private String EI_name; //EI 类型题目
    private String EI_a; //a选项
    private String EI_b; //b选项
    public String toString(){
        return "["+ EI_id + " " + EI_num + " " + EI_name + " " + EI_a + " " + EI_b + "]";
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

    public String getEI_name() {
        return EI_name;
    }

    public void setEI_name(String EI_name) {
        this.EI_name = EI_name;
    }

    public String getEI_a() {
        return EI_a;
    }

    public void setEI_a(String EI_a) {
        this.EI_a = EI_a;
    }

    public String getEI_b() {
        return EI_b;
    }

    public void setEI_b(String EI_b) {
        this.EI_b = EI_b;
    }
}
