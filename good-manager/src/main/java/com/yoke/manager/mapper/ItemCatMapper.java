package com.yoke.manager.mapper;

import com.yoke.manager.pojo.ItemCat;
import com.yoke.manager.pojo.ItemCatExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ItemCatMapper extends Mapper<ItemCat> {
    long countByExample(ItemCatExample example);

    int deleteByExample(ItemCatExample example);

    List<ItemCat> selectByExample(ItemCatExample example);

    int updateByExampleSelective(@Param("record") ItemCat record, @Param("example") ItemCatExample example);

    int updateByExample(@Param("record") ItemCat record, @Param("example") ItemCatExample example);
}