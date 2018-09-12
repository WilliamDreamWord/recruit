package com.cs.recruit.dto;

import com.cs.recruit.entity.Employ;
import com.cs.recruit.entity.First_try;
import com.cs.recruit.entity.Second_try;

/**
 * Created by asus on 2018/8/10.
 */
public class EvaluateDto {
    private String evaluate_id;
    private String user_id;
    private String rale_name;
    private String dept_id;
    private String dept_name;
    private String post;
    private String firsttry_id; //初试id
    private String first_colligate_text; //综合评价内容
    private String first_colligate; //是否通过
    private String secondtry_id;
    private String second_colligate_text;
    private String second_colligate;
    private String employ_id;
    private String colligate_text;
    private String colligate;
    private String manager_text;
    private String manager;
    private First_try first_try;

    public First_try getFirst_try() {
        return first_try;
    }

    public void setFirst_try(First_try first_try) {
        this.first_try = first_try;
    }

    public Second_try getSecond_try() {
        return second_try;
    }

    public void setSecond_try(Second_try second_try) {
        this.second_try = second_try;
    }

    public Employ getEmploy() {
        return employ;
    }

    public void setEmploy(Employ employ) {
        this.employ = employ;
    }

    private Second_try second_try;
    private Employ employ;

    public String getEvaluate_id() {
        return evaluate_id;
    }

    public void setEvaluate_id(String evaluate_id) {
        this.evaluate_id = evaluate_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getRale_name() {
        return rale_name;
    }

    public void setRale_name(String rale_name) {
        this.rale_name = rale_name;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getFirsttry_id() {
        return firsttry_id;
    }

    public void setFirsttry_id(String firsttry_id) {
        this.firsttry_id = firsttry_id;
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

    public String getSecondtry_id() {
        return secondtry_id;
    }

    public void setSecondtry_id(String secondtry_id) {
        this.secondtry_id = secondtry_id;
    }

    public String getSecond_colligate_text() {
        return second_colligate_text;
    }

    public void setSecond_colligate_text(String second_colligate_text) {
        this.second_colligate_text = second_colligate_text;
    }

    public String getSecond_colligate() {
        return second_colligate;
    }

    public void setSecond_colligate(String second_colligate) {
        this.second_colligate = second_colligate;
    }

    public String getEmploy_id() {
        return employ_id;
    }

    public void setEmploy_id(String employ_id) {
        this.employ_id = employ_id;
    }

    public String getColligate_text() {
        return colligate_text;
    }

    public void setColligate_text(String colligate_text) {
        this.colligate_text = colligate_text;
    }

    public String getColligate() {
        return colligate;
    }

    public void setColligate(String colligate) {
        this.colligate = colligate;
    }

    public String getManager_text() {
        return manager_text;
    }

    public void setManager_text(String manager_text) {
        this.manager_text = manager_text;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

}
