package com.yoke.manager.dao;

import com.yoke.manager.pojo.Item;
import com.yoke.manager.pojo.ItemExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ItemMapper extends Mapper<Item> {
    long countByExample(ItemExample example);

    int deleteByExample(ItemExample example);

    List<Item> selectByExampleWithBLOBs(ItemExample example);

    List<Item> selectByExample(ItemExample example);

    int updateByExampleSelective(@Param("record") Item record, @Param("example") ItemExample example);

    int updateByExampleWithBLOBs(@Param("record") Item record, @Param("example") ItemExample example);

    int updateByExample(@Param("record") Item record, @Param("example") ItemExample example);
}