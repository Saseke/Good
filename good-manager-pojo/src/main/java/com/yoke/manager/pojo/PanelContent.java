package com.yoke.manager.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "db_panel_content")
public class PanelContent {
    @Id
    @Column(name = "panel_content_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer panelContentId;

    private Date created;

    @Column(name = "panel_id")
    private Integer panelId;

    @Column(name = "pic_url")
    private String picUrl;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "sort_order")
    private Integer sortOrder;

    private Date updated;

    public PanelContent(Integer panelContentId, Date created, Integer panelId, String picUrl, Long productId, Integer sortOrder, Date updated) {
        this.panelContentId = panelContentId;
        this.created = created;
        this.panelId = panelId;
        this.picUrl = picUrl;
        this.productId = productId;
        this.sortOrder = sortOrder;
        this.updated = updated;
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
     * @return panel_id
     */
    public Integer getPanelId() {
        return panelId;
    }

    /**
     * @param panelId
     */
    public void setPanelId(Integer panelId) {
        this.panelId = panelId;
    }

    /**
     * @return pic_url
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * @param picUrl
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    /**
     * @return product_id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * @return sort_order
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * @param sortOrder
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
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