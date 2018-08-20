package com.yoke.manager.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "db_item_cat")
public class ItemCat {
    @Id
    @Column(name = "item_cat_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemCatId;

    /**
     * 父id为0表示一级栏目
     */
    @Column(name = "parent_id")
    private Long parentId;

    private String name;

    /**
     * 状态1启用,0禁用
     */
    private Integer state;

    @Column(name = "sort_order")
    private Integer sortOrder;

    /**
     * 是否为父分类
     */
    @Column(name = "is_parent")
    private Byte isParent;

    /**
     * 图标
     */
    private String icon;

    /**
     * 备注
     */
    private String remark;

    private Date created;

    private Date updated;

    public ItemCat(Long itemCatId, Long parentId, String name, Integer state, Integer sortOrder, Byte isParent, String icon, String remark, Date created, Date updated) {
        this.itemCatId = itemCatId;
        this.parentId = parentId;
        this.name = name;
        this.state = state;
        this.sortOrder = sortOrder;
        this.isParent = isParent;
        this.icon = icon;
        this.remark = remark;
        this.created = created;
        this.updated = updated;
    }

    public ItemCat() {
        super();
    }

    /**
     * @return item_cat_id
     */
    public Long getItemCatId() {
        return itemCatId;
    }

    /**
     * @param itemCatId
     */
    public void setItemCatId(Long itemCatId) {
        this.itemCatId = itemCatId;
    }

    /**
     * 获取父id为0表示一级栏目
     *
     * @return parent_id - 父id为0表示一级栏目
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置父id为0表示一级栏目
     *
     * @param parentId 父id为0表示一级栏目
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
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
     * 获取状态1启用,0禁用
     *
     * @return state - 状态1启用,0禁用
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置状态1启用,0禁用
     *
     * @param state 状态1启用,0禁用
     */
    public void setState(Integer state) {
        this.state = state;
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
     * 获取是否为父分类
     *
     * @return is_parent - 是否为父分类
     */
    public Byte getIsParent() {
        return isParent;
    }

    /**
     * 设置是否为父分类
     *
     * @param isParent 是否为父分类
     */
    public void setIsParent(Byte isParent) {
        this.isParent = isParent;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
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