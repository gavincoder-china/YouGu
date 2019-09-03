package com.yougu.mall.entity;

public class Picture {
    private Integer id;

    private String url;

    /**
    * 对应商品id
    */
    private Integer productId;

    /**
    * 图片等级,1是主图,2是副图
    */
    private Integer level;

    /**
    * 商品的类别,颜色
    */
    private Integer colorId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", url=").append(url);
        sb.append(", productId=").append(productId);
        sb.append(", level=").append(level);
        sb.append(", colorId=").append(colorId);
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
        Picture other = (Picture) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getColorId() == null ? other.getColorId() == null : this.getColorId().equals(other.getColorId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getColorId() == null) ? 0 : getColorId().hashCode());
        return result;
    }
}