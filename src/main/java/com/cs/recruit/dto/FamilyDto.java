package com.cs.recruit.dto;

/**
 * Created by asus on 2018/8/10.
 */
public class FamilyDto {

    private String family_id;
    private String status;
    private String relay;
    private String name;
    private String address;
    private String post;
    private String phone;
    public String toString(){
        return "[" + family_id + " " + status + " " + relay + " " + name + " " + address + " " + post + " " + phone + "]";
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
    public String getFamily_id() {
        return family_id;
    }

    public void setFamily_id(String family_id) {
        this.family_id = family_id;
    }

}
