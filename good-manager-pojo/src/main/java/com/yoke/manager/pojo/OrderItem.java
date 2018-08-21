package com.yoke.manager.pojo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "db_order_item")
public class OrderItem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "item_id")
    private String itemId;

    @Column(name = "order_id")
    private String orderId;

    /**
     * 商品购买的数量
     */
    private Integer num;

    /**
     * 商品名称
     */
    private String title;

    /**
     * 商品单价
     */
    private BigDecimal price;

    /**
     * 总价格
     */
    @Column(name = "total_fee")
    private BigDecimal totalFee;

    /**
     * 商品图片地址
     */
    @Column(name = "pic_path")
    private String picPath;

    public OrderItem(String id, String itemId, String orderId, Integer num, String title, BigDecimal price, BigDecimal totalFee, String picPath) {
        this.id = id;
        this.itemId = itemId;
        this.orderId = orderId;
        this.num = num;
        this.title = title;
        this.price = price;
        this.totalFee = totalFee;
        this.picPath = picPath;
    }

    public OrderItem() {
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
     * @return item_id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * @param itemId
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * @return order_id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * 获取商品购买的数量
     *
     * @return num - 商品购买的数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置商品购买的数量
     *
     * @param num 商品购买的数量
     */
    public void setNum(Integer num) {
        this.num = num;
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
     * 获取商品单价
     *
     * @return price - 商品单价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置商品单价
     *
     * @param price 商品单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取总价格
     *
     * @return total_fee - 总价格
     */
    public BigDecimal getTotalFee() {
        return totalFee;
    }

    /**
     * 设置总价格
     *
     * @param totalFee 总价格
     */
    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * 获取商品图片地址
     *
     * @return pic_path - 商品图片地址
     */
    public String getPicPath() {
        return picPath;
    }

    /**
     * 设置商品图片地址
     *
     * @param picPath 商品图片地址
     */
    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }
}