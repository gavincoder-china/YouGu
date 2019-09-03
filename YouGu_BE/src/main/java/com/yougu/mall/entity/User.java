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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
               && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
               && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
               && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
               && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
               && (this.getRegisterTime() == null ? other.getRegisterTime() == null : this.getRegisterTime().equals(other.getRegisterTime()))
               && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
               && (this.getLoginTimes() == null ? other.getLoginTimes() == null : this.getLoginTimes().equals(other.getLoginTimes()))
               && (this.getQuestion() == null ? other.getQuestion() == null : this.getQuestion().equals(other.getQuestion()))
               && (this.getAnswer() == null ? other.getAnswer() == null : this.getAnswer().equals(other.getAnswer()))
               && (this.getImage() == null ? other.getImage() == null : this.getImage().equals(other.getImage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getRegisterTime() == null) ? 0 : getRegisterTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getLoginTimes() == null) ? 0 : getLoginTimes().hashCode());
        result = prime * result + ((getQuestion() == null) ? 0 : getQuestion().hashCode());
        result = prime * result + ((getAnswer() == null) ? 0 : getAnswer().hashCode());
        result = prime * result + ((getImage() == null) ? 0 : getImage().hashCode());
        return result;
    }
}