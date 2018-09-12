package com.cs.recruit.dto;

import java.util.List;

/**
 * 面试者详情
 * Created by asus on 2018/8/10.
 */
public class DetailsDto {
    private String user_id;
    private String base_id;
    private String rale_name;//姓名
    private String sex;//性别
    private String birthday;
    private String haw;
    private String nation;
    private String phone;
    private String email;
    private String language;
    private String job;
    private String idcard;
    private String certificate;//专业证书
    private String address;
    private String friend;
    private String hobby;
    private String contact_name;
    private String contact_phone;
    private ApplyDto applyDto;
    private List<TeachDto> teachDtoList;
    private List<WorkDto> workDtoList;
    private List<FamilyDto> familyDtoList;
    public String toString(){
        return "[" + user_id + " " + base_id + " " + rale_name + " " + sex + " " + birthday + " " + haw
                + " " + nation + " " + phone + " " + email + " " + language + " " + job + " " + idcard + " " + certificate
                + " " + address + " " + friend + " " + hobby + " " + contact_name + " " + contact_phone + " " +
                applyDto + " " + teachDtoList + " " + workDtoList + " " + familyDtoList + "]";
    }

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

    public ApplyDto getApplyDto() {
        return applyDto;
    }

    public void setApplyDto(ApplyDto applyDto) {
        this.applyDto = applyDto;
    }

    public List<TeachDto> getTeachDtoList() {
        return teachDtoList;
    }

    public void setTeachDtoList(List<TeachDto> teachDtoList) {
        this.teachDtoList = teachDtoList;
    }

    public List<WorkDto> getWorkDtoList() {
        return workDtoList;
    }

    public void setWorkDtoList(List<WorkDto> workDtoList) {
        this.workDtoList = workDtoList;
    }

    public List<FamilyDto> getFamilyDtoList() {
        return familyDtoList;
    }

    public void setFamilyDtoList(List<FamilyDto> familyDtoList) {
        this.familyDtoList = familyDtoList;
    }
    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
