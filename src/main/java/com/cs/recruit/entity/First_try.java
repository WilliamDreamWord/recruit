package com.cs.recruit.entity;

/**
 * Created by asus on 2018/8/10.
 */
public class First_try {
    private String firsttry_id; //初试id
    private String evaluate_id; //面试评价表id
    private String first_colligate_text; //综合评价内容
    private String first_colligate; //是否通过

    public String toString(){
        return "[" + firsttry_id + " " + evaluate_id + " " + first_colligate_text + " " + first_colligate + "]";
    }

    public String getFirsttry_id() {
        return firsttry_id;
    }

    public void setFirsttry_id(String firsttry_id) {
        this.firsttry_id = firsttry_id;
    }

    public String getEvaluate_id() {
        return evaluate_id;
    }

    public void setEvaluate_id(String evaluate_id) {
        this.evaluate_id = evaluate_id;
    }

    public String getFirst_colligate_text() {
        return first_colligate_text;
    }

    public void setFirst_colligate_text(String first_colligate_text) {
        this.first_colligate_text = first_colligate_text;
    }

    public String getFirst_colligate() {
        return first_colligate;
    }

    public void setFirst_colligate(String first_colligate) {
        this.first_colligate = first_colligate;
    }
}
