package com.yougu.mall.entity;

import java.util.Date;

public class Shipping {
    /**
    * id
    */
    private Integer id;

    /**
    * user_id 对应用户表id
    */
    private Integer userId;

    /**
    * receiver_name 收货人姓名
    */
    private String receiverName;

    /**
    * receiver_phone 收货人电话
    */
    private String receiverPhone;

    /**
    * receiver_province 收货人省份
    */
    private String receiverProvince;

    /**
    * receiver_city 收货人城市
    */
    private String receiverCity;

    /**
    * receiver_district 收货人区县
    */
    private String receiverDistrict;

    /**
    * receiver_address 收货人详细地址
    */
    private String receiverAddress;

    /**
    * receiver_zip 收货地址邮编
    */
    private String receiverZip;

    /**
    * status 地址状态0:删除,1:使用
    */
    private Integer status;

    /**
    * create_time
    */
    private Date createTime;

    /**
    * update_time
    */
    private Date updateTime;

    /**
    * delete_time
    */
    private Date deleteTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverProvince() {
        return receiverProvince;
    }

    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverDistrict() {
        return receiverDistrict;
    }

    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverZip() {
        return receiverZip;
    }

    public void setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", receiverName=").append(receiverName);
        sb.append(", receiverPhone=").append(receiverPhone);
        sb.append(", receiverProvince=").append(receiverProvince);
        sb.append(", receiverCity=").append(receiverCity);
        sb.append(", receiverDistrict=").append(receiverDistrict);
        sb.append(", receiverAddress=").append(receiverAddress);
        sb.append(", receiverZip=").append(receiverZip);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append("]");
        return sb.toString();
    }
}