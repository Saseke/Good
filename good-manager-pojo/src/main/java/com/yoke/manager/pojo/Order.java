package com.yoke.manager.pojo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "db_order")
public class Order {
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String orderId;

    /**
     * 实付金额
     */
    private BigDecimal payment;

    /**
     * 支付方式
     */
    @Column(name = "payment_type")
    private Integer paymentType;

    /**
     * 邮费
     */
    @Column(name = "post_fee")
    private BigDecimal postFee;

    private Integer status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "payment_time")
    private Date paymentTime;

    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "close_time")
    private Date closeTime;

    /**
     * 物流名称
     */
    @Column(name = "shipping_name")
    private String shippingName;

    /**
     * 物流单号
     */
    @Column(name = "shipping_code")
    private String shippingCode;

    /**
     * 买家id
     */
    @Column(name = "buyer_id")
    private Long buyerId;

    /**
     * 买家留言
     */
    @Column(name = "buyer_message")
    private String buyerMessage;

    @Column(name = "buyer_nick")
    private String buyerNick;

    @Column(name = "seller_id")
    private Long sellerId;

    @Column(name = "seller_nick")
    private String sellerNick;

    @Column(name = "buyer_comment")
    private Byte buyerComment;

    public Order(String orderId, BigDecimal payment, Integer paymentType, BigDecimal postFee, Integer status, Date createTime, Date updateTime, Date paymentTime, Date endTime, Date closeTime, String shippingName, String shippingCode, Long buyerId, String buyerMessage, String buyerNick, Long sellerId, String sellerNick, Byte buyerComment) {
        this.orderId = orderId;
        this.payment = payment;
        this.paymentType = paymentType;
        this.postFee = postFee;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.paymentTime = paymentTime;
        this.endTime = endTime;
        this.closeTime = closeTime;
        this.shippingName = shippingName;
        this.shippingCode = shippingCode;
        this.buyerId = buyerId;
        this.buyerMessage = buyerMessage;
        this.buyerNick = buyerNick;
        this.sellerId = sellerId;
        this.sellerNick = sellerNick;
        this.buyerComment = buyerComment;
    }

    public Order() {
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
     * 获取实付金额
     *
     * @return payment - 实付金额
     */
    public BigDecimal getPayment() {
        return payment;
    }

    /**
     * 设置实付金额
     *
     * @param payment 实付金额
     */
    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    /**
     * 获取支付方式
     *
     * @return payment_type - 支付方式
     */
    public Integer getPaymentType() {
        return paymentType;
    }

    /**
     * 设置支付方式
     *
     * @param paymentType 支付方式
     */
    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * 获取邮费
     *
     * @return post_fee - 邮费
     */
    public BigDecimal getPostFee() {
        return postFee;
    }

    /**
     * 设置邮费
     *
     * @param postFee 邮费
     */
    public void setPostFee(BigDecimal postFee) {
        this.postFee = postFee;
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
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return payment_time
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * @param paymentTime
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * @return end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return close_time
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * @param closeTime
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * 获取物流名称
     *
     * @return shipping_name - 物流名称
     */
    public String getShippingName() {
        return shippingName;
    }

    /**
     * 设置物流名称
     *
     * @param shippingName 物流名称
     */
    public void setShippingName(String shippingName) {
        this.shippingName = shippingName == null ? null : shippingName.trim();
    }

    /**
     * 获取物流单号
     *
     * @return shipping_code - 物流单号
     */
    public String getShippingCode() {
        return shippingCode;
    }

    /**
     * 设置物流单号
     *
     * @param shippingCode 物流单号
     */
    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode == null ? null : shippingCode.trim();
    }

    /**
     * 获取买家id
     *
     * @return buyer_id - 买家id
     */
    public Long getBuyerId() {
        return buyerId;
    }

    /**
     * 设置买家id
     *
     * @param buyerId 买家id
     */
    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * 获取买家留言
     *
     * @return buyer_message - 买家留言
     */
    public String getBuyerMessage() {
        return buyerMessage;
    }

    /**
     * 设置买家留言
     *
     * @param buyerMessage 买家留言
     */
    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage == null ? null : buyerMessage.trim();
    }

    /**
     * @return buyer_nick
     */
    public String getBuyerNick() {
        return buyerNick;
    }

    /**
     * @param buyerNick
     */
    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick == null ? null : buyerNick.trim();
    }

    /**
     * @return seller_id
     */
    public Long getSellerId() {
        return sellerId;
    }

    /**
     * @param sellerId
     */
    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * @return seller_nick
     */
    public String getSellerNick() {
        return sellerNick;
    }

    /**
     * @param sellerNick
     */
    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick == null ? null : sellerNick.trim();
    }

    /**
     * @return buyer_comment
     */
    public Byte getBuyerComment() {
        return buyerComment;
    }

    /**
     * @param buyerComment
     */
    public void setBuyerComment(Byte buyerComment) {
        this.buyerComment = buyerComment;
    }
}