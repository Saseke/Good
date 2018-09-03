package com.yoke.manager.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "db_panel")
public class Panel {
    @Id
    @Column(name = "panel_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer panelId;

    private Date created;

    @Column(name = "limit_num")
    private Integer limitNum;

    private String name;

    private String remark;

    @Column(name = "sort_order")
    private Integer sortOrder;

    private Integer status;

    private Integer type;

    private Date updated;

    public Panel(Integer panelId, Date created, Integer limitNum, String name, String remark, Integer sortOrder, Integer status, Integer type, Date updated) {
        this.panelId = panelId;
        this.created = created;
        this.limitNum = limitNum;
        this.name = name;
        this.remark = remark;
        this.sortOrder = sortOrder;
        this.status = status;
        this.type = type;
        this.updated = updated;
    }

    public Panel() {
        super();
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
     * @return limit_num
     */
    public Integer getLimitNum() {
        return limitNum;
    }

    /**
     * @param limitNum
     */
    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
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