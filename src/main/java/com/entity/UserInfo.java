package com.entity;

import javax.validation.constraints.NotNull;

public class UserInfo {

    @NotNull(message = "用户名不能为空")
    private String userName;
    @NotNull(message = "用户名不能为空")
    private String password;
    @NotNull(message = "用户名不能为空")
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
