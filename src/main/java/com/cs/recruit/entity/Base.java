package com.cs.recruit.entity;

/**
 * Created by asus on 2018/8/8.
 */
public class Base {
    private String base_id; //基本信息id
    private String rale_name; //姓名
    private String sex; //性别
    private String birthday; //生日
    private String haw; //身高和体重
    private String nation; //民族和籍贯
    private String phone;  //电话
    private String email;  //邮箱
    private String language; //语言
    private String job;  //是否在职
    private String idcard; //身份证号
    private String certificate;  //专业证书
    private String address; //地址
    private String friend; //是否有亲人或朋友在本公司
    private String hobby;  //兴趣
    private String contact_name; //紧急联系人姓名
    private String contact_phone; //紧急联系人电话
    private String user_id;  //用户id
    private String dept_id; //部门id

    public String getBase_id() {
        return base_id;
    }

    public void setBase_id(String base_id) {
        this.base_id = base_id;
    }

    public String getRale_name() {
        return rale_name;
    }

    public void setRale_name(String rale_name) {
        this.rale_name = rale_name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHaw() {
        return haw;
    }

    public void setHaw(String haw) {
        this.haw = haw;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String toString(){
        return "[" + "base_id:" + base_id + " " + "rale_name:" + rale_name + " " + "sex:" + sex + " "
                + "birthday:" + birthday + " " + "haw:" + haw + " " + "nation:" + nation + " " + "phone:" + phone + " "+
                "emain:" + email + " " + "language:" + language + " " + "job:" + job + " " + "idcard:" + idcard + " " +
                "certificate:" + certificate + " " + "address:" + address + " " + "friend:" + friend + " " + "hobby:" + hobby + " " +
                "contact_name:" + contact_name + " " + "contact_phone" + contact_phone + " " + "user_id" + user_id + " " + "dept_id" + dept_id + "]";
    }
}
