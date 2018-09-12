package com.cs.recruit.entity;

import java.util.SimpleTimeZone;

/**
 * Created by asus on 2018/8/10.
 */
public class Employ {
    private String employ_id;  //录用审批id
    private String evaluate_id; //面试评价id
    private String colligate_text; //用人部门意见
    private String  colligate; //是否通过
    private String manager_text; //总经理意见
    private String  manager; //是否通过

    public String toString(){
        return "[" + employ_id + " " + evaluate_id + " " + colligate_text + " " + colligate + " " + manager_text + " " + manager + "]";
    }

    public String getEmploy_id() {
        return employ_id;
    }

    public void setEmploy_id(String employ_id) {
        this.employ_id = employ_id;
    }

    public String getEvaluate_id() {
        return evaluate_id;
    }

    public void setEvaluate_id(String evaluate_id) {
        this.evaluate_id = evaluate_id;
    }

    public String getColligate_text() {
        return colligate_text;
    }

    public void setColligate_text(String colligate_text) {
        this.colligate_text = colligate_text;
    }

    public String  getColligate() {
        return colligate;
    }

    public void setColligate(String  colligate) {
        this.colligate = colligate;
    }

    public String getManager_text() {
        return manager_text;
    }

    public void setManager_text(String manager_text) {
        this.manager_text = manager_text;
    }

    public String  getManager() {
        return manager;
    }

    public void setManager(String  manager) {
        this.manager = manager;
    }
}
