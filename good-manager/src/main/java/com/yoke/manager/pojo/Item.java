package com.yoke.manager.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "db_item")
public class Item {
    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    /**
     * 商品名
     */
    private String title;

    /**
     * 商品卖点
     */
    @Column(name = "sell_point")
    private String sellPoint;

    private BigDecimal price;

    /**
     * 库存数量
     */
    private Integer num;

    /**
     * 限售数量
     */
    @Column(name = "limit_num")
    private Integer limitNum;

    /**
     * 商品图片
     */
    private String image;

    /**
     * 商品分类id
     */
    private Integer cid;

    private Integer status;

    private Date created;

    private Date updated;

    /**
     * 排列序号
     */
    @Column(name = "sort_order")
    private Integer sortOrder;

    /**
     * 备注
     */
    private String remark;

    /**
     * 商品描述
     */
    private String desc;

    public Item(Long itemId, String title, String sellPoint, BigDecimal price, Integer num, Integer limitNum, String image, Integer cid, Integer status, Date created, Date updated, Integer sortOrder, String remark, String desc) {
        this.itemId = itemId;
        this.title = title;
        this.sellPoint = sellPoint;
        this.price = price;
        this.num = num;
        this.limitNum = limitNum;
        this.image = image;
        this.cid = cid;
        this.status = status;
        this.created = created;
        this.updated = updated;
        this.sortOrder = sortOrder;
        this.remark = remark;
        this.desc = desc;
    }

    public Item() {
        super();
    }

    /**
     * @return item_id
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * @param itemId
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取商品名
     *
     * @return title - 商品名
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置商品名
     *
     * @param title 商品名
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取商品卖点
     *
     * @return sell_point - 商品卖点
     */
    public String getSellPoint() {
        return sellPoint;
    }

    /**
     * 设置商品卖点
     *
     * @param sellPoint 商品卖点
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
     * 获取库存数量
     *
     * @return num - 库存数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置库存数量
     *
     * @param num 库存数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取限售数量
     *
     * @return limit_num - 限售数量
     */
    public Integer getLimitNum() {
        return limitNum;
    }

    /**
     * 设置限售数量
     *
     * @param limitNum 限售数量
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
     * 获取商品分类id
     *
     * @return cid - 商品分类id
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 设置商品分类id
     *
     * @param cid 商品分类id
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
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
     * 获取排列序号
     *
     * @return sort_order - 排列序号
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * 设置排列序号
     *
     * @param sortOrder 排列序号
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
     * 获取商品描述
     *
     * @return desc - 商品描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置商品描述
     *
     * @param desc 商品描述
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}