package com.cs.recruit.entity;

/**
 * Created by asus on 2018/8/10.
 */
public class Sale_subject {
    private String salesub_id;//区域销售题库id
    private String first; //第一题
    private String second; //第二题
    private String third; //第三题
    private String fourth; //第三题

    public String getSalesub_id() {
        return salesub_id;
    }

    public void setSalesub_id(String salesub_id) {
        this.salesub_id = salesub_id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }

    public String getFourth() {
        return fourth;
    }

    public void setFourth(String fourth) {
        this.fourth = fourth;
    }
}