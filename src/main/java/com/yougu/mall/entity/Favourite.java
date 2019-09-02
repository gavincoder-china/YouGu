package com.yougu.mall.entity;

import java.util.Date;

public class Favourite {
    /**
    * id
    */
    private Integer id;

    /**
    * user_id 对应用户表id
    */
    private Integer userId;

    /**
    * product_id 对应商品表
    */
    private Integer productId;

    /**
    * status 收藏状态,0:取消收藏,1:收藏
    */
    private Integer status;

    /**
    * create_time
    */
    private Date createTime;

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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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
        sb.append(", productId=").append(productId);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append("]");
        return sb.toString();
    }
}