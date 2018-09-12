package com.cs.recruit.entity;

/**
 * Created by asus on 2018/8/10.
 */
public class Recruit_evaluate {
    private String evaluate_id; //面试评价id
    private String user_id; //用户id
    private String rale_name; //真实在姓名
    private String dept_id; //部门id
    private String post; //申请职位

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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
