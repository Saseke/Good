package com.yoke.manager.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "db_order_shipping")
public class OrderShipping {
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String orderId;

    /**
     * 收货人名称
     */
    @Column(name = "receiver_name")
    private String receiverName;

    /**
     * 收件人手机号
     */
    @Column(name = "receiver_phone")
    private String receiverPhone;

    /**
     * 省份
     */
    @Column(name = "receiver_state")
    private String receiverState;

    /**
     * 城市
     */
    @Column(name = "receiver_city")
    private String receiverCity;

    /**
     * 区、县
     */
    @Column(name = "receiver_district")
    private String receiverDistrict;

    /**
     * 收货地址
     */
    @Column(name = "receiver_address")
    private String receiverAddress;

    private Date created;

    private Date updated;

    public OrderShipping(String orderId, String receiverName, String receiverPhone, String receiverState, String receiverCity, String receiverDistrict, String receiverAddress, Date created, Date updated) {
        this.orderId = orderId;
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.receiverState = receiverState;
        this.receiverCity = receiverCity;
        this.receiverDistrict = receiverDistrict;
        this.receiverAddress = receiverAddress;
        this.created = created;
        this.updated = updated;
    }

    public OrderShipping() {
        super();
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
     * 获取收货人名称
     *
     * @return receiver_name - 收货人名称
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 设置收货人名称
     *
     * @param receiverName 收货人名称
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * 获取收件人手机号
     *
     * @return receiver_phone - 收件人手机号
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * 设置收件人手机号
     *
     * @param receiverPhone 收件人手机号
     */
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    /**
     * 获取省份
     *
     * @return receiver_state - 省份
     */
    public String getReceiverState() {
        return receiverState;
    }

    /**
     * 设置省份
     *
     * @param receiverState 省份
     */
    public void setReceiverState(String receiverState) {
        this.receiverState = receiverState == null ? null : receiverState.trim();
    }

    /**
     * 获取城市
     *
     * @return receiver_city - 城市
     */
    public String getReceiverCity() {
        return receiverCity;
    }

    /**
     * 设置城市
     *
     * @param receiverCity 城市
     */
    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity == null ? null : receiverCity.trim();
    }

    /**
     * 获取区、县
     *
     * @return receiver_district - 区、县
     */
    public String getReceiverDistrict() {
        return receiverDistrict;
    }

    /**
     * 设置区、县
     *
     * @param receiverDistrict 区、县
     */
    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict == null ? null : receiverDistrict.trim();
    }

    /**
     * 获取收货地址
     *
     * @return receiver_address - 收货地址
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * 设置收货地址
     *
     * @param receiverAddress 收货地址
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
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
}