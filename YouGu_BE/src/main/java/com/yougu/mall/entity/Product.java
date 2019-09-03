package com.yougu.mall.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    /**
     * id
     */
    private Integer id;

    /**
     * category_id 对应商品分类表id
     */
    private Integer category;

    /**
     * name 商品名称
     */
    private String name;

    /**
     * subtitle 商品副标题
     */
    private String subtitle;

    /**
     * main_image 商品主图地址
     */
    private String mainImage;

    /**
     * datail 商品介绍
     */
    private String datail;

    /**
     * price 商品单价,保留两位小数
     */
    private BigDecimal price;

    /**
     * stock 库存数量
     */
    private Long stock;

    /**
     * status 商品状态,1:在售,2:下架,3:删除
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public String getDatail() {
        return datail;
    }

    public void setDatail(String datail) {
        this.datail = datail;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", category=").append(category);
        sb.append(", name=").append(name);
        sb.append(", subtitle=").append(subtitle);
        sb.append(", mainImage=").append(mainImage);
        sb.append(", datail=").append(datail);
        sb.append(", price=").append(price);
        sb.append(", stock=").append(stock);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
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
        Product other = (Product) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
               && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
               && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
               && (this.getSubtitle() == null ? other.getSubtitle() == null : this.getSubtitle().equals(other.getSubtitle()))
               && (this.getMainImage() == null ? other.getMainImage() == null : this.getMainImage().equals(other.getMainImage()))
               && (this.getDatail() == null ? other.getDatail() == null : this.getDatail().equals(other.getDatail()))
               && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
               && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
               && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
               && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
               && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSubtitle() == null) ? 0 : getSubtitle().hashCode());
        result = prime * result + ((getMainImage() == null) ? 0 : getMainImage().hashCode());
        result = prime * result + ((getDatail() == null) ? 0 : getDatail().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}