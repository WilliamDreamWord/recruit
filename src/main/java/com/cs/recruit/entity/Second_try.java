package com.cs.recruit.entity;

/**
 * Created by asus on 2018/8/10.
 */
public class Second_try {
    private String secondtry_id; //复试评价id
    private String evaluate_id; //面试评价id
    private String second_colligate_text; //综合内容评价
    private String second_colligate; //是否通过

    public String toString(){
        return "[" + secondtry_id + " " + evaluate_id + " " + second_colligate_text + " " + second_colligate + "]";
    }

    public String getSecondtry_id() {
        return secondtry_id;
    }

    public void setSecondtry_id(String secondtry_id) {
        this.secondtry_id = secondtry_id;
    }

    public String getEvaluate_id() {
        return evaluate_id;
    }

    public void setEvaluate_id(String evaluate_id) {
        this.evaluate_id = evaluate_id;
    }

    public String getSecond_colligate_text() {
        return second_colligate_text;
    }

    public void setSecond_colligate_text(String second_colligate_text) {
        this.second_colligate_text = second_colligate_text;
    }

    public String  getSecond_colligate() {
        return second_colligate;
    }

    public void setSecond_colligate(String  second_colligate) {
        this.second_colligate = second_colligate;
    }

}
