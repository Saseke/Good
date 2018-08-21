package com.yoke.manager.dao;

import com.yoke.manager.pojo.Address;
import com.yoke.manager.pojo.AddressExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AddressMapper extends Mapper<Address> {
    long countByExample(AddressExample example);

    int deleteByExample(AddressExample example);

    List<Address> selectByExample(AddressExample example);

    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);
}