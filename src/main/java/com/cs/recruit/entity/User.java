package com.cs.recruit.entity;

/**
 * Created by asus on 2018/8/6.
 */
public class User {
    private String user_id;//用户id
    private String user_name;//用户姓名
    private String user_card; //用户身份证
    private String user_status;

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }



    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_card() {
        return user_card;
    }

    public void setUser_card(String user_card) {
        this.user_card = user_card;
    }


    public String toString(){
        return "[" + "user_id:" + user_id + " " + "user_name" + user_name + " " + "user_card" + user_card + "]";
    }
}
