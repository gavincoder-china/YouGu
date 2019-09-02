package com.yougu.mall.entity;

import java.util.Date;

public class User {
    /**
    * id
    */
    private Integer id;

    /**
    * uername
    */
    private String username;

    /**
    * password
    */
    private String password;

    /**
    * phone
    */
    private String phone;

    /**
    * email
    */
    private String email;

    /**
    * create_time 注册时间
    */
    private Date registerTime;

    /**
    * update_time 最后登录时间
    */
    private Date updateTime;

    /**
    * login_times 登陆次数
    */
    private String loginTimes;

    /**
    * question 找回密码密保问题
    */
    private String question;

    /**
    * answer 找回密码密保答案
    */
    private String answer;

    /**
    * image 头像图片的地址
    */
    private String image;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(String loginTimes) {
        this.loginTimes = loginTimes;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", registerTime=").append(registerTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", loginTimes=").append(loginTimes);
        sb.append(", question=").append(question);
        sb.append(", answer=").append(answer);
        sb.append(", image=").append(image);
        sb.append("]");
        return sb.toString();
    }
}