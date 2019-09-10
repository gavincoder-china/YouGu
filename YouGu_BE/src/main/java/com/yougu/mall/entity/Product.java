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


    private Color color;

    private Picture picture;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

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
        return "Product{" +
               "id=" + id +
               ", category=" + category +
               ", name='" + name + '\'' +
               ", subtitle='" + subtitle + '\'' +
               ", mainImage='" + mainImage + '\'' +
               ", datail='" + datail + '\'' +
               ", price=" + price +
               ", stock=" + stock +
               ", status=" + status +
               ", createTime=" + createTime +
               ", updateTime=" + updateTime +
               ", color=" + color +
               ", picture=" + picture +
               '}';
    }
}