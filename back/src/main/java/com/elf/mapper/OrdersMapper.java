package com.elf.mapper;



import com.elf.domain.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface OrdersMapper {

    Orders findOne(@Param("orderNo")String orderNo);



    Integer  addOne(@Param("orders") Orders orders);

    Integer  delete(@Param("orders")Orders order);

    Integer  update(@Param("orders")Orders order);

    List<Orders> check();



}
