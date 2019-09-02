package com.yougu.mall.entity;

import java.util.Date;

public class PayInfo {
    /**
    * id
    */
    private Integer id;

    /**
    * user_id 对应用户表id
    */
    private Integer userId;

    /**
    * order_id 对应订单表id
    */
    private Integer orderId;

    /**
    * order_no 对应订单表订单号
    */
    private Integer orderNo;

    /**
    * pay_no 支付流水号
    */
    private Integer payNo;

    /**
    * pay_platform 支付平台类型,1:支付宝,2:微信,3:..
    */
    private Integer payPlatform;

    /**
    * pay_status 支付状态,1:支付成功,2:未支付,3:支付失败
    */
    private Integer payStatus;

    /**
    * create_time
    */
    private Date createTime;

    /**
    * update_time
    */
    private Date updateTime;

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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getPayNo() {
        return payNo;
    }

    public void setPayNo(Integer payNo) {
        this.payNo = payNo;
    }

    public Integer getPayPlatform() {
        return payPlatform;
    }

    public void setPayPlatform(Integer payPlatform) {
        this.payPlatform = payPlatform;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", payNo=").append(payNo);
        sb.append(", payPlatform=").append(payPlatform);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}