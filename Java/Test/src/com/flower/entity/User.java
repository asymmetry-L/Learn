package com.flower.entity;

public class User {
    private String user_id;
    private String user_name;
    private String user_pwd;
    private String user_sex;
    private String user_birth;  //date
    private String user_tel;
    private int user_type = 1;   //int

    public User() {
    }

    public User(String user_id, String user_name, String user_pwd, String user_sex, String user_birth, String user_tel, int user_type) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_pwd = user_pwd;
        this.user_sex = user_sex;
        this.user_birth = user_birth;
        this.user_tel = user_tel;
        this.user_type = user_type;
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

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_birth() {
        return user_birth;
    }

    public void setUser_birth(String user_birth) {
        this.user_birth = user_birth;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }

    public int getUser_type() {
        return user_type;
    }

    public void setUser_type(int user_type) {
        this.user_type = user_type;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_pwd='" + user_pwd + '\'' +
                ", user_sex='" + user_sex + '\'' +
                ", user_birth='" + user_birth + '\'' +
                ", user_tel='" + user_tel + '\'' +
                ", user_type=" + user_type +
                '}';
    }
}
