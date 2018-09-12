package com.cs.recruit.dto;

/**
 * Created by asus on 2018/8/23.
 */
public class listDto {
    private String user_id;
    private String rale_name;
    private String user_status;
    private String post;
    private String phone;
    private String formdate;

    public String toString(){
        return "[" + user_id + " " + rale_name + " " + user_status + " " + post + " " + phone + " " + formdate + "]";
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

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFormdate() {
        return formdate;
    }

    public void setFormdate(String formdate) {
        this.formdate = formdate;
    }


}
