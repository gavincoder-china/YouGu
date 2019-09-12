package com.yougu.mall.entity;



import java.util.Date;
import java.util.List;
import java.util.Objects;


public class Cart {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(id, cart.id) &&
               Objects.equals(userId, cart.userId) &&
               Objects.equals(productId, cart.productId) &&
               Objects.equals(quantity, cart.quantity) &&
               Objects.equals(checked, cart.checked) &&
               Objects.equals(createTime, cart.createTime) &&
               Objects.equals(updateTime, cart.updateTime) &&
               Objects.equals(user, cart.user) &&
               Objects.equals(product, cart.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, productId, quantity, checked, createTime, updateTime, user, product);
    }

    // 用户
    private User user;

    //商品类
    private List<Product> product;

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
}