package com.cs.recruit.entity;

/**
 * 其他职位题库
 * Created by asus on 2018/8/10.
 */
public class Other_subject {
    private String othsun_id; //其他题库id
    private String first; //第一题
    private String second;  //第二题
    public String toString(){
        return "[" + first + " " + second + "]";
    }

    public String getOthsun_id() {
        return othsun_id;
    }

    public void setOthsun_id(String othsun_id) {
        this.othsun_id = othsun_id;
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

}
