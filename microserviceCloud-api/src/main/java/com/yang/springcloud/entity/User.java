package com.yang.springcloud.entity;

import java.io.Serializable;

public class User implements Serializable{
    private static final long serialVersionUID = -5046972860468900599L;

    private Integer id;
    private String username;
    private String password;
    private String interest;
    private String phone;
    private String email;
    private Integer age;
    private String mark;
    private String sexly;
    private String gender;
    private String modify_date;
    private String inDicSeq;
    private String create_date;
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }



    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSexly() {
        return sexly;
    }

    public void setSexly(String sexly) {
        this.sexly = sexly;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getModify_date() {
        return modify_date;
    }

    public void setModify_date(String modify_date) {
        this.modify_date = modify_date;
    }

    public String getInDicSeq() {
        return inDicSeq;
    }

    public void setInDicSeq(String inDicSeq) {
        this.inDicSeq = inDicSeq;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", interest='" + interest + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", mark='" + mark + '\'' +
                ", sexly='" + sexly + '\'' +
                ", gender='" + gender + '\'' +
                ", modify_date='" + modify_date + '\'' +
                ", inDicSeq='" + inDicSeq + '\'' +
                ", create_date='" + create_date + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
