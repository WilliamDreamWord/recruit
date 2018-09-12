package com.cs.recruit.entity;

/**
 * Created by asus on 2018/8/10.
 */
public class Family {
    private String family_id; //家庭信息id
    private String user_id; //基本信息id
    private String status; //婚姻状况
    private String relay; //关系
    private String name; //姓名
    private String address; //工作单位
    private String post; //职务
    private String phone; //联系电话
    public String toString(){
        return "[" + family_id + " " + user_id + " " + status + " " + relay + " " + name + " " + address + " " + post + " "
                + phone + "]";
    }

    public String getFamily_id() {
        return family_id;
    }

    public void setFamily_id(String family_id) {
        this.family_id = family_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRelay() {
        return relay;
    }

    public void setRelay(String relay) {
        this.relay = relay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

}
