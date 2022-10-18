package com.elf.controller;






import com.elf.domain.AfterSale;
import com.elf.service.AfterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.transform.Result;

public class AfterController {

    @Autowired
    private AfterService afterService;


    @PostMapping("/check")
    public Result check(Integer pageNum,@RequestParam(required = false,defaultValue = "3")Integer pageSize){
        return (Result) afterService.check();
    }


    @PostMapping("/findOne")
        public Result findOne(Integer orderNo){
            return (Result) afterService.findOne(orderNo);

    }


    @PostMapping("/addOne")
    public Integer addOne(AfterSale afterSale){
        return afterService.addOne(afterSale);
    }


   @PostMapping("/delete")
    public Integer delete(AfterSale afterSale){
        return afterService.delete(afterSale);
    }


    @PostMapping("/update")
    public  Integer update(AfterSale afterSale){

        return afterService.update(afterSale);
    }


}
