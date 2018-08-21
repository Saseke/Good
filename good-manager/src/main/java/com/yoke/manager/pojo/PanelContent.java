package com.yoke.manager.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "db_panel_content")
public class PanelContent {
    @Id
    @Column(name = "panel_content_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer panelContentId;

    /**
     * 所属panel
     */
    @Column(name = "panel_id")
    private Integer panelId;

    /**
     * 关联的商品
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * 排列顺序
     */
    @Column(name = "sort_order")
    private Integer sortOrder;

    private Date created;

    private Date updated;

    /**
     * 图片路径
     */
    @Column(name = "pic_url")
    private String picUrl;

    public PanelContent(Integer panelContentId, Integer panelId, Long productId, Integer sortOrder, Date created, Date updated, String picUrl) {
        this.panelContentId = panelContentId;
        this.panelId = panelId;
        this.productId = productId;
        this.sortOrder = sortOrder;
        this.created = created;
        this.updated = updated;
        this.picUrl = picUrl;
    }

    public PanelContent() {
        super();
    }

    /**
     * @return panel_content_id
     */
    public Integer getPanelContentId() {
        return panelContentId;
    }

    /**
     * @param panelContentId
     */
    public void setPanelContentId(Integer panelContentId) {
        this.panelContentId = panelContentId;
    }

    /**
     * 获取所属panel
     *
     * @return panel_id - 所属panel
     */
    public Integer getPanelId() {
        return panelId;
    }

    /**
     * 设置所属panel
     *
     * @param panelId 所属panel
     */
    public void setPanelId(Integer panelId) {
        this.panelId = panelId;
    }

    /**
     * 获取关联的商品
     *
     * @return product_id - 关联的商品
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置关联的商品
     *
     * @param productId 关联的商品
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 获取排列顺序
     *
     * @return sort_order - 排列顺序
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * 设置排列顺序
     *
     * @param sortOrder 排列顺序
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
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
     * 获取图片路径
     *
     * @return pic_url - 图片路径
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 设置图片路径
     *
     * @param picUrl 图片路径
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }
}