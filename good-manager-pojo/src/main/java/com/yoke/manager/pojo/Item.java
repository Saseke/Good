package com.yoke.manager.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "db_item")
public class Item {
    @Id
    private String id;

    /**
     * 商品名称
     */
    private String title;

    /**
     * 卖点
     */
    @Column(name = "sell_point")
    private String sellPoint;

    private BigDecimal price;

    /**
     * 库存
     */
    private Integer num;

    /**
     * 限制售卖的数量
     */
    @Column(name = "limit_num")
    private Integer limitNum;

    /**
     * 商品图片
     */
    private String image;

    /**
     * 分类id
     */
    @Column(name = "c_id")
    private Integer cId;

    /**
     * 状态
     */
    private Integer status;

    private Date created;

    private Date updated;

    /**
     * 排序号码
     */
    @Column(name = "sort_order")
    private Integer sortOrder;

    /**
     * 备注
     */
    private String remark;

    /**
     * 描述
     */
    private String description;

    public Item(String id, String title, String sellPoint, BigDecimal price, Integer num, Integer limitNum, String image, Integer cId, Integer status, Date created, Date updated, Integer sortOrder, String remark, String description) {
        this.id = id;
        this.title = title;
        this.sellPoint = sellPoint;
        this.price = price;
        this.num = num;
        this.limitNum = limitNum;
        this.image = image;
        this.cId = cId;
        this.status = status;
        this.created = created;
        this.updated = updated;
        this.sortOrder = sortOrder;
        this.remark = remark;
        this.description = description;
    }

    public Item() {
        super();
    }

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取商品名称
     *
     * @return title - 商品名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置商品名称
     *
     * @param title 商品名称
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取卖点
     *
     * @return sell_point - 卖点
     */
    public String getSellPoint() {
        return sellPoint;
    }

    /**
     * 设置卖点
     *
     * @param sellPoint 卖点
     */
    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint == null ? null : sellPoint.trim();
    }

    /**
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取库存
     *
     * @return num - 库存
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置库存
     *
     * @param num 库存
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取限制售卖的数量
     *
     * @return limit_num - 限制售卖的数量
     */
    public Integer getLimitNum() {
        return limitNum;
    }

    /**
     * 设置限制售卖的数量
     *
     * @param limitNum 限制售卖的数量
     */
    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    /**
     * 获取商品图片
     *
     * @return image - 商品图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置商品图片
     *
     * @param image 商品图片
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * 获取分类id
     *
     * @return c_id - 分类id
     */
    public Integer getcId() {
        return cId;
    }

    /**
     * 设置分类id
     *
     * @param cId 分类id
     */
    public void setcId(Integer cId) {
        this.cId = cId;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return updated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * @param updated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * 获取排序号码
     *
     * @return sort_order - 排序号码
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * 设置排序号码
     *
     * @param sortOrder 排序号码
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}