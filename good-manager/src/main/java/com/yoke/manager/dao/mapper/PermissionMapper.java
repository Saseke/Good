package com.yoke.manager.dao.mapper;

import com.yoke.manager.pojo.Permission;
import com.yoke.manager.pojo.PermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PermissionMapper extends Mapper<Permission> {
    long countByExample(PermissionExample example);

    int deleteByExample(PermissionExample example);

    List<Permission> selectByExample(PermissionExample example);

    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);
}