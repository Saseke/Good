package com.yoke.manager.dao.mapper;

import com.yoke.manager.pojo.OrderShipping;
import com.yoke.manager.pojo.OrderShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface OrderShippingMapper extends Mapper<OrderShipping> {
    long countByExample(OrderShippingExample example);

    int deleteByExample(OrderShippingExample example);

    List<OrderShipping> selectByExample(OrderShippingExample example);

    int updateByExampleSelective(@Param("record") OrderShipping record, @Param("example") OrderShippingExample example);

    int updateByExample(@Param("record") OrderShipping record, @Param("example") OrderShippingExample example);
}