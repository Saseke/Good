package com.yoke.manager.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "db_panel")
public class Panel {
    @Id
    @Column(name = "panel_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer panelId;

    /**
     * 版块名称
     */
    private String name;

    /**
     * 版块类型
     */
    private Integer type;

    /**
     * 排列顺序
     */
    @Column(name = "sort_order")
    private Integer sortOrder;

    /**
     * 限制商品数量
     */
    @Column(name = "limit_num")
    private Integer limitNum;

    private Integer status;

    /**
     * 备注
     */
    private String remark;

    private Date created;

    private Date updated;

    public Panel(Integer panelId, String name, Integer type, Integer sortOrder, Integer limitNum, Integer status, String remark, Date created, Date updated) {
        this.panelId = panelId;
        this.name = name;
        this.type = type;
        this.sortOrder = sortOrder;
        this.limitNum = limitNum;
        this.status = status;
        this.remark = remark;
        this.created = created;
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
     * 获取版块名称
     *
     * @return name - 版块名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置版块名称
     *
     * @param name 版块名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取版块类型
     *
     * @return type - 版块类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置版块类型
     *
     * @param type 版块类型
     */
    public void setType(Integer type) {
        this.type = type;
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
     * 获取限制商品数量
     *
     * @return limit_num - 限制商品数量
     */
    public Integer getLimitNum() {
        return limitNum;
    }

    /**
     * 设置限制商品数量
     *
     * @param limitNum 限制商品数量
     */
    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
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