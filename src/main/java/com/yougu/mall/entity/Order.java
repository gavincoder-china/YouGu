package com.yougu.mall.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    /**
    * id
    */
    private Integer id;

    /**
    * order_no 订单流水号
    */
    private Long orderNo;

    /**
    * user_id 对应用户表的id
    */
    private Integer userId;

    /**
    * shipping_id 对应地址表id
    */
    private Integer shippingId;

    /**
    * payment 支付金额
    */
    private BigDecimal payment;

    /**
    * payment_type 支付平台类型,1:支付宝,2:微信,3:..
    */
    private Integer paymentType;

    /**
    * postage 邮费
    */
    private BigDecimal postage;

    /**
    * status 订单状态,0:已取消,1:未支付,2:已支付
    */
    private Integer status;

    /**
    * payment_time 订单支付时间
    */
    private Date paymentTime;

    /**
    * create_time 订单创建时间
    */
    private Date createTime;

    /**
    * send_time 发货时间
    */
    private Date sendTime;

    /**
    * receive_time 收货时间
    */
    private Date receiveTime;

    /**
    * update_time 订单内容修改时间
    */
    private Date updateTime;

    /**
    * close_time 订单取消时间
    */
    private Date closeTime;

    /**
    * end_time 交易完成时间
    */
    private Date endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShippingId() {
        return shippingId;
    }

    public void setShippingId(Integer shippingId) {
        this.shippingId = shippingId;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public BigDecimal getPostage() {
        return postage;
    }

    public void setPostage(BigDecimal postage) {
        this.postage = postage;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", userId=").append(userId);
        sb.append(", shippingId=").append(shippingId);
        sb.append(", payment=").append(payment);
        sb.append(", paymentType=").append(paymentType);
        sb.append(", postage=").append(postage);
        sb.append(", status=").append(status);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", closeTime=").append(closeTime);
        sb.append(", endTime=").append(endTime);
        sb.append("]");
        return sb.toString();
    }
}