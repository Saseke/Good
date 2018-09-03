package com.yoke.manager.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "db_item_cat")
public class ItemCat {
    @Id
    @Column(name = "item_cat_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemCatId;

    private Date created;

    private String icon;

    @Column(name = "is_parent")
    private Byte isParent;

    private String name;

    @Column(name = "parent_id")
    private Long parentId;

    private String remark;

    @Column(name = "sort_order")
    private Integer sortOrder;

    private Integer state;

    private Date updated;

    public ItemCat(Long itemCatId, Date created, String icon, Byte isParent, String name, Long parentId, String remark, Integer sortOrder, Integer state, Date updated) {
        this.itemCatId = itemCatId;
        this.created = created;
        this.icon = icon;
        this.isParent = isParent;
        this.name = name;
        this.parentId = parentId;
        this.remark = remark;
        this.sortOrder = sortOrder;
        this.state = state;
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
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * @return is_parent
     */
    public Byte getIsParent() {
        return isParent;
    }

    /**
     * @param isParent
     */
    public void setIsParent(Byte isParent) {
        this.isParent = isParent;
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
     * @return parent_id
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
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
     * @return state
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
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