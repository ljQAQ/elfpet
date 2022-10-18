package com.elf.service.impl;



import com.elf.domain.Orders;
import com.elf.mapper.OrdersMapper;
import com.elf.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    OrdersMapper ordersMapper;

    @Override
    public Orders findOne(String orderNo) {
        return ordersMapper.findOne(orderNo);
    }

    @Override
    public Integer addOne(Orders orders) {
        return ordersMapper.addOne(orders) ;
    }

    @Override
    public Integer delete(Orders orders) {
        return ordersMapper.delete(orders) ;
    }

    @Override
    public Integer update(Orders orders) {
        return  ordersMapper.delete(orders);
    }

    @Override
    public List<Orders> check() {
        return ordersMapper.check();
    }


}
