package com.cs.recruit.entity;

/**
 * Created by asus on 2018/8/6.
 */
public class Job {


    private String job_id;  //工作人员id
    private String job_user;  //工作人员姓名
    private String job_password;  //工作人员密码
    private String job_descript;   //工作人员描述
    private String dept_id;   //工作人员部门id

    public String  getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getJob_user() {
        return job_user;
    }

    public void setJob_user(String job_user) {
        this.job_user = job_user;
    }

    public String getJob_password() {
        return job_password;
    }

    public void setJob_password(String job_password) {
        this.job_password = job_password;
    }

    public String getJob_descript() {
        return job_descript;
    }

    public void setJob_descript(String job_descript) {
        this.job_descript = job_descript;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }
    public String toString(){
        return "[" + "job_id" + job_id + " " + "job_user" + job_user + " " + "job_password" + job_password + " "
                + "job_descript" + job_descript + " " + "dept_id" + dept_id;
    }
}
