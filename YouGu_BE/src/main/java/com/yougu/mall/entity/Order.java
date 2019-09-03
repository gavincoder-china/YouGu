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
        Order other = (Order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
               && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
               && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
               && (this.getShippingId() == null ? other.getShippingId() == null : this.getShippingId().equals(other.getShippingId()))
               && (this.getPayment() == null ? other.getPayment() == null : this.getPayment().equals(other.getPayment()))
               && (this.getPaymentType() == null ? other.getPaymentType() == null : this.getPaymentType().equals(other.getPaymentType()))
               && (this.getPostage() == null ? other.getPostage() == null : this.getPostage().equals(other.getPostage()))
               && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
               && (this.getPaymentTime() == null ? other.getPaymentTime() == null : this.getPaymentTime().equals(other.getPaymentTime()))
               && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
               && (this.getSendTime() == null ? other.getSendTime() == null : this.getSendTime().equals(other.getSendTime()))
               && (this.getReceiveTime() == null ? other.getReceiveTime() == null : this.getReceiveTime().equals(other.getReceiveTime()))
               && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
               && (this.getCloseTime() == null ? other.getCloseTime() == null : this.getCloseTime().equals(other.getCloseTime()))
               && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getShippingId() == null) ? 0 : getShippingId().hashCode());
        result = prime * result + ((getPayment() == null) ? 0 : getPayment().hashCode());
        result = prime * result + ((getPaymentType() == null) ? 0 : getPaymentType().hashCode());
        result = prime * result + ((getPostage() == null) ? 0 : getPostage().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPaymentTime() == null) ? 0 : getPaymentTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getSendTime() == null) ? 0 : getSendTime().hashCode());
        result = prime * result + ((getReceiveTime() == null) ? 0 : getReceiveTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCloseTime() == null) ? 0 : getCloseTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return result;
    }
}