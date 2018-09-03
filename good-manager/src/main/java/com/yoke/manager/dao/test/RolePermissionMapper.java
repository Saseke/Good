package com.yoke.manager.dao.test;

import com.yoke.manager.pojo.RolePermission;
import com.yoke.manager.pojo.RolePermissionExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RolePermissionMapper extends Mapper<RolePermission> {
    long countByExample(RolePermissionExample example);

    int deleteByExample(RolePermissionExample example);

    List<RolePermission> selectByExample(RolePermissionExample example);

    int updateByExampleSelective(@Param("record") RolePermission record, @Param("example") RolePermissionExample example);

    int updateByExample(@Param("record") RolePermission record, @Param("example") RolePermissionExample example);
}