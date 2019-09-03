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
        Shipping other = (Shipping) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
               && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
               && (this.getReceiverName() == null ? other.getReceiverName() == null : this.getReceiverName().equals(other.getReceiverName()))
               && (this.getReceiverPhone() == null ? other.getReceiverPhone() == null : this.getReceiverPhone().equals(other.getReceiverPhone()))
               && (this.getReceiverProvince() == null ? other.getReceiverProvince() == null : this.getReceiverProvince().equals(other.getReceiverProvince()))
               && (this.getReceiverCity() == null ? other.getReceiverCity() == null : this.getReceiverCity().equals(other.getReceiverCity()))
               && (this.getReceiverDistrict() == null ? other.getReceiverDistrict() == null : this.getReceiverDistrict().equals(other.getReceiverDistrict()))
               && (this.getReceiverAddress() == null ? other.getReceiverAddress() == null : this.getReceiverAddress().equals(other.getReceiverAddress()))
               && (this.getReceiverZip() == null ? other.getReceiverZip() == null : this.getReceiverZip().equals(other.getReceiverZip()))
               && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
               && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
               && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
               && (this.getDeleteTime() == null ? other.getDeleteTime() == null : this.getDeleteTime().equals(other.getDeleteTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getReceiverName() == null) ? 0 : getReceiverName().hashCode());
        result = prime * result + ((getReceiverPhone() == null) ? 0 : getReceiverPhone().hashCode());
        result = prime * result + ((getReceiverProvince() == null) ? 0 : getReceiverProvince().hashCode());
        result = prime * result + ((getReceiverCity() == null) ? 0 : getReceiverCity().hashCode());
        result = prime * result + ((getReceiverDistrict() == null) ? 0 : getReceiverDistrict().hashCode());
        result = prime * result + ((getReceiverAddress() == null) ? 0 : getReceiverAddress().hashCode());
        result = prime * result + ((getReceiverZip() == null) ? 0 : getReceiverZip().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleteTime() == null) ? 0 : getDeleteTime().hashCode());
        return result;
    }
}