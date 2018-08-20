package com.yoke.manager.pojo;

import javax.persistence.*;

@Table(name = "db_permission")
public class Permission {
    @Id
    @Column(name = "permission_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer permissionId;

    /**
     * 权限名
     */
    private String name;

    /**
     * 权限路径
     */
    private String permission;

    public Permission(Integer permissionId, String name, String permission) {
        this.permissionId = permissionId;
        this.name = name;
        this.permission = permission;
    }

    public Permission() {
        super();
    }

    /**
     * @return permission_id
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * @param permissionId
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * 获取权限名
     *
     * @return name - 权限名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置权限名
     *
     * @param name 权限名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取权限路径
     *
     * @return permission - 权限路径
     */
    public String getPermission() {
        return permission;
    }

    /**
     * 设置权限路径
     *
     * @param permission 权限路径
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }
}