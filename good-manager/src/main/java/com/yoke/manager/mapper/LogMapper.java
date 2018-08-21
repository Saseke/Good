package com.yoke.manager.mapper;

import com.yoke.manager.pojo.Log;
import com.yoke.manager.pojo.LogExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface LogMapper extends Mapper<Log> {
    long countByExample(LogExample example);

    int deleteByExample(LogExample example);

    List<Log> selectByExample(LogExample example);

    int updateByExampleSelective(@Param("record") Log record, @Param("example") LogExample example);

    int updateByExample(@Param("record") Log record, @Param("example") LogExample example);
}