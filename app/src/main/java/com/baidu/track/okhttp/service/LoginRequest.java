package com.wind.carmanager.okhttp.service;

/**
 * 作者：Created by luow on 2018/6/29
 * 注释：登录请求参数
 */
public class LoginRequest {

    private String account;
    private String password;
    private String veri_code;

    public String getPhone() {
        return account;
    }

    public void setPhone(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVeri_code() {
        return veri_code;
    }

    public void setVeri_code(String veri_code) {
        this.veri_code = veri_code;
    }
}

