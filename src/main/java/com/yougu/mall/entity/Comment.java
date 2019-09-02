package com.yougu.mall.entity;

import java.util.Date;

public class Comment {
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
    * comment 评论
    */
    private String comment;

    /**
    * create_time
    */
    private Date createTime;

    /**
    * update_time
    */
    private Date updateTime;

    /**
    * level 评价等级1-5
    */
    private Integer level;

    /**
    * modify_times 修改次数
    */
    private Integer modifyTimes;

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getModifyTimes() {
        return modifyTimes;
    }

    public void setModifyTimes(Integer modifyTimes) {
        this.modifyTimes = modifyTimes;
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
        sb.append(", comment=").append(comment);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", level=").append(level);
        sb.append(", modifyTimes=").append(modifyTimes);
        sb.append("]");
        return sb.toString();
    }
}