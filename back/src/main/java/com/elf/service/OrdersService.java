package com.elf.service;




import com.elf.domain.Orders;

import java.util.List;


public interface OrdersService {

    Orders findOne(String orderNo);


    Integer addOne(Orders orders);

     Integer delete(Orders orders);

    Integer update(Orders orders);





    List<Orders> check();



}
