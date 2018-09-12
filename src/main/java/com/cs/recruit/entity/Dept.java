package com.cs.recruit.entity;

/**
 * Created by asus on 2018/8/6.
 */
public class Dept {
    private String  dept_id;   //部门id
    private String dept_name;   //部门名称

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

    public String toString(){
            return "Dept{" +
                    "dept_id=" + dept_id +
                    ", dept_name='" + dept_name +
                    "}";
    }
}
