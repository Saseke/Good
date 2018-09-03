package com.yoke.manager.pojo;

import javax.persistence.*;

@Table(name = "db_role_perm")
public class RolePermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "permission_id")
    private Integer permissionId;

    @Column(name = "role_id")
    private Integer roleId;

    public RolePermission(Integer id, Integer permissionId, Integer roleId) {
        this.id = id;
        this.permissionId = permissionId;
        this.roleId = roleId;
    }

    public RolePermission() {
        super();
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
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
     * @return role_id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}