package com.yoke.manager.mapper;

import com.yoke.manager.pojo.Order;
import com.yoke.manager.pojo.OrderExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface OrderMapper extends Mapper<Order> {
    long countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    List<Order> selectByExample(OrderExample example);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);
}