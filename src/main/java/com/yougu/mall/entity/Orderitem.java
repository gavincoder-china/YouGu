package com.yougu.mall.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Orderitem {
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
    * product_id 对应商品表id
    */
    private Integer productId;

    /**
    * product_image 对应商品主图链接
    */
    private String productImage;

    /**
    * quantity 商品数量
    */
    private Integer quantity;

    /**
    * total_price 总金额
    */
    private BigDecimal totalPrice;

    /**
    * current_price 折扣后商品单价
    */
    private BigDecimal currentPrice;

    /**
    * cteate_time 订单创建时间
    */
    private Date cteateTime;

    /**
    * update_time 订单更新时间
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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Date getCteateTime() {
        return cteateTime;
    }

    public void setCteateTime(Date cteateTime) {
        this.cteateTime = cteateTime;
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
        sb.append(", productId=").append(productId);
        sb.append(", productImage=").append(productImage);
        sb.append(", quantity=").append(quantity);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", currentPrice=").append(currentPrice);
        sb.append(", cteateTime=").append(cteateTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}