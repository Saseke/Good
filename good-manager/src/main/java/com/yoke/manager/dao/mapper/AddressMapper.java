package com.yoke.manager.dao.mapper;

import com.yoke.manager.pojo.Address;
import com.yoke.manager.pojo.AddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface AddressMapper extends Mapper<Address> {
    long countByExample(AddressExample example);

    int deleteByExample(AddressExample example);

    List<Address> selectByExample(AddressExample example);

    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);
}