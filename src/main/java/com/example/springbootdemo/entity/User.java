package com.example.springbootdemo.entity;


/**
 * 用户表
 */
 public class User {


    private int id;
    private String name;
    private int age;
    private String pwd;

    public User(){}
    public User(String name, int age, String pwd) {
        this.name = name;
        this.age = age;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }




}