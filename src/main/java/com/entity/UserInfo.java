package com.entity;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public class UserInfo {

    @NotNull(message = "用户名不能为空")
    private String userName;
    @Length(min=0 ,max = 6,message = "密码必须是0-6")
    private String password;
    private String address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
