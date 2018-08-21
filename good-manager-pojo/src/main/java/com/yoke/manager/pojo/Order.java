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
     * 支付类型:1.在线支付,2货到付款
     */
    @Column(name = "payment_type")
    private Integer paymentType;

    /**
     * 邮费
     */
    @Column(name = "post_fee")
    private BigDecimal postFee;

    /**
     * 状态 0未付款 1已付款 2未发货 3已发货 4交易成功 5交易关闭 6交易失败
     */
    private Integer status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 付款时间
     */
    @Column(name = "payment_time")
    private Date paymentTime;

    /**
     * 交易完成时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 交易关闭时间
     */
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

    /**
     * 买家昵称
     */
    @Column(name = "buyer_nick")
    private String buyerNick;

    /**
     * 卖家id
     */
    @Column(name = "seller_id")
    private Long sellerId;

    @Column(name = "seller_nick")
    private String sellerNick;

    /**
     * 买家是否已经评价
     */
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
     * 获取支付类型:1.在线支付,2货到付款
     *
     * @return payment_type - 支付类型:1.在线支付,2货到付款
     */
    public Integer getPaymentType() {
        return paymentType;
    }

    /**
     * 设置支付类型:1.在线支付,2货到付款
     *
     * @param paymentType 支付类型:1.在线支付,2货到付款
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
     * 获取状态 0未付款 1已付款 2未发货 3已发货 4交易成功 5交易关闭 6交易失败
     *
     * @return status - 状态 0未付款 1已付款 2未发货 3已发货 4交易成功 5交易关闭 6交易失败
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 0未付款 1已付款 2未发货 3已发货 4交易成功 5交易关闭 6交易失败
     *
     * @param status 状态 0未付款 1已付款 2未发货 3已发货 4交易成功 5交易关闭 6交易失败
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
     * 获取付款时间
     *
     * @return payment_time - 付款时间
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * 设置付款时间
     *
     * @param paymentTime 付款时间
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * 获取交易完成时间
     *
     * @return end_time - 交易完成时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置交易完成时间
     *
     * @param endTime 交易完成时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取交易关闭时间
     *
     * @return close_time - 交易关闭时间
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * 设置交易关闭时间
     *
     * @param closeTime 交易关闭时间
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
     * 获取买家昵称
     *
     * @return buyer_nick - 买家昵称
     */
    public String getBuyerNick() {
        return buyerNick;
    }

    /**
     * 设置买家昵称
     *
     * @param buyerNick 买家昵称
     */
    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick == null ? null : buyerNick.trim();
    }

    /**
     * 获取卖家id
     *
     * @return seller_id - 卖家id
     */
    public Long getSellerId() {
        return sellerId;
    }

    /**
     * 设置卖家id
     *
     * @param sellerId 卖家id
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
     * 获取买家是否已经评价
     *
     * @return buyer_comment - 买家是否已经评价
     */
    public Byte getBuyerComment() {
        return buyerComment;
    }

    /**
     * 设置买家是否已经评价
     *
     * @param buyerComment 买家是否已经评价
     */
    public void setBuyerComment(Byte buyerComment) {
        this.buyerComment = buyerComment;
    }
}