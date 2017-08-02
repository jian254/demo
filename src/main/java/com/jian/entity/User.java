package com.jian.entity;

import javax.persistence.*;

/**
 * Created by jian on 17/7/28.
 */
@Entity
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "username", length = 50, unique = true, nullable = false)
    private String username;
    @Column(name = "password", length = 50, nullable = false)
    private String password;
    @Column(name = "level")
    private int level;//等级权限

    @Column(name = "info")
    private String info;//介绍

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "email", length = 45)
    private String email;//邮箱

    @Column(name = "realname", length = 45)
    private String realname;//真实名字


    @Column(name = "remark")
    private String remark;//备注


    public User(String username, String password, int level, String info, String phone, String email, String realname, String remark) {
        this.username = username;
        this.password = password;
        this.level = level;
        this.info = info;
        this.phone = phone;
        this.email = email;
        this.realname = realname;
        this.remark = remark;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
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

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
