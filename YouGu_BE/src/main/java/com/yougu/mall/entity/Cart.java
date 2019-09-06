package com.yougu.mall.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;



public class Cart {
    @Override
    public String toString() {
        return "Cart{" +
               "id=" + id +
               ", userId=" + userId +
               ", productId=" + productId +
               ", quantity=" + quantity +
               ", checked=" + checked +
               ", createTime=" + createTime +
               ", updateTime=" + updateTime +
               ", user=" + user +
               ", product=" + product +
               '}';
    }

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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getChecked() {
        return checked;
    }

    public void setChecked(Integer checked) {
        this.checked = checked;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    /**
     * id
     */
    private Integer id;

    /**
     * user_id 对应用户表id
     */
    private Integer userId;

    /**
     * product_id 对应商品表id
     */
    private Integer productId;

    /**
     * quantity 商品数量
     */
    private Integer quantity;

    /**
     * checked 选择状态,0:未选择,1:选择
     */
    private Integer checked;

    /**
     * create_time
     */
    private Date createTime;


    /**
     * update_time
     */
    private Date updateTime;

    // 用户
    private User user;

    //商品类
    private List<Product> product;

}