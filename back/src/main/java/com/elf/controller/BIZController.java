package com.elf.controller;

import com.elf.commonutils.Result;
import com.elf.domain.BIZ;
import com.elf.service.BIZService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/biz")
public class BIZController {

    @Autowired
    BIZService bizService;


    @RequestMapping("/getAll")
    public Result getAll(){
        return bizService.getAll();
    }


    @RequestMapping("/addBIZ")
    public Result addBIZ(BIZ biz){
        return bizService.addBIZ(biz);
    }

    @RequestMapping("/updateBIZ")
    public Result updateBIZ(BIZ biz){
        return bizService.updateBIZ(biz);
    }

    @RequestMapping("/deleteBIZ")
    public Result deleteBIZ(Long id){
        return bizService.deleteOneBIZ(id);
    }

    @RequestMapping("/deleteBIZs")
    public Result deleteBIZs(String ids){
        return bizService.deleteMany(ids);
    }


    @RequestMapping("/pageBIZ")
    public Result pageBIZ(int pageNo,int pageSize){
        return bizService.getBIZByPage(pageNo,pageSize);
    }
}
