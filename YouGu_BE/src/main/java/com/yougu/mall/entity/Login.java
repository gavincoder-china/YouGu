package com.yougu.mall.entity;

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2019-09-09 16:15
 * @description:
 ************************************************************/
public class Login {

    //专为登录操作的实体类
    private String loginName;
    private String password;

    @Override
    public String toString() {
        return "Login{" +
               "loginName='" + loginName + '\'' +
               ", password='" + password + '\'' +
               '}';
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
