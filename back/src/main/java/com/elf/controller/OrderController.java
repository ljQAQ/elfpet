package com.elf.controller;


import com.elf.domain.Order;
import com.elf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.transform.Result;

public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping("/check")
    public Result check(Integer pageNum,@RequestParam(required = false,defaultValue = "3")Integer pageSize){
        return (Result) orderService.check();
    }

    /*查询单个*/
    @PostMapping("/findOne")
        public Result findOne(String orderNo){
            return (Result) orderService.findOne(orderNo);

    }

    /*新增*/
    @PostMapping("/addOne")
    public Integer addOne(Order order){
        return orderService.addOne(order);
    }

   /*删除订单*/
   @PostMapping("/delete")
    public Integer delete(Order order){
        return orderService.delete(order);
    }

    /*修改订单*/
    @PostMapping("/update")
    public  Integer update(Order order){

        return orderService.update(order);
    }


}
