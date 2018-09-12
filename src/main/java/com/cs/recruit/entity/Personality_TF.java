package com.cs.recruit.entity;

/**
 * Created by asus on 2018/8/10.
 */
public class Personality_TF {
    private String TF_id;  //唯一标识
    private String TF_num; //EI类型题号
    private String TF_name; //EI 类型题目
    private String TF_a; //a选项
    private String TF_b; //b选项

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

    public String getTF_name() {
        return TF_name;
    }

    public void setTF_name(String TF_name) {
        this.TF_name = TF_name;
    }

    public String getTF_a() {
        return TF_a;
    }

    public void setTF_a(String TF_a) {
        this.TF_a = TF_a;
    }

    public String getTF_b() {
        return TF_b;
    }

    public void setTF_b(String TF_b) {
        this.TF_b = TF_b;
    }

}
