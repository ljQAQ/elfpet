package com.elf.service;



import com.elf.domain.Order;

import java.util.List;


public interface OrderService {

    Order findOne(String orderNo);


   Integer addOne(Order order);

    Integer delete(Order order);

    Integer update(Order order);





    List<Order> check();


}
