package com.elf.mapper;

import com.elf.domain.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface OrderMapper {

    Order findOne(@Param("orderNo")String orderNo);



    Integer  addOne(@Param("order")Order order);

    Integer  delete(@Param("order")Order order);

    Integer  update(@Param("order")Order order);

    List<Order> check();



}
