package com.cs.recruit.dto;

import com.cs.recruit.entity.Dept;

/**
 * Created by asus on 2018/8/6.
 */
public class JobDto {
    public String getJob_id() {
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

    public Dept getDept_id() {
        return dept;
    }

    public void setDept_id(Dept dept) {
        this.dept = dept;
    }
    private String job_id;
    private String job_user;
    private String job_password;
    private String job_descript;
    private Dept dept;
    public String toString(){
        return "["  + "job_user" +" " + job_user +  " "
                + "job_descript" + " "+ job_descript + " " + "dept" + " " + dept.getDept_name() + "]";
    }
}
