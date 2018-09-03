package com.yoke.manager.dao.test;

import com.yoke.manager.pojo.OrderShipping;
import com.yoke.manager.pojo.OrderShippingExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface OrderShippingMapper extends Mapper<OrderShipping> {
    long countByExample(OrderShippingExample example);

    int deleteByExample(OrderShippingExample example);

    List<OrderShipping> selectByExample(OrderShippingExample example);

    int updateByExampleSelective(@Param("record") OrderShipping record, @Param("example") OrderShippingExample example);

    int updateByExample(@Param("record") OrderShipping record, @Param("example") OrderShippingExample example);
}