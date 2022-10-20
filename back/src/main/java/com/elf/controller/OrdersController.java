package com.elf.controller;




import com.elf.domain.Orders;
import com.elf.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.transform.Result;

public class OrdersController {

    @Autowired
    private OrdersService ordersService;



    @PostMapping("/check")
    public Result check(Integer pageNum,@RequestParam(required = false,defaultValue = "3")Integer pageSize){
        return (Result) ordersService.check();
    }

    /*查询单个*/
    @PostMapping("/findOne")
        public Result findOne(String orderNo){
            return (Result) ordersService.findOne(orderNo);

    }

    /*新增*/
    @PostMapping("/addOne")
    public Integer addOne(Orders orders){
        return ordersService.addOne(orders);
    }

   /*删除订单*/
   @PostMapping("/delete")
    public Integer delete(Orders order){
        return ordersService.delete(order);
    }

    /*修改订单*/
    @PostMapping("/update")
    public  Integer update(Orders order){

        return ordersService.update(order);
    }


}
