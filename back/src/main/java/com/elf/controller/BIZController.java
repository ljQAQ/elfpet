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


    //@RequestMapping("/addBIZ")
    //public Result addBIZ( BIZ biz){
    //    System.out.println(biz);
    //    return bizService.addBIZ(biz);
    //}

    @RequestMapping("/updateBIZ")
    public Result updateBIZ(BIZ biz){

        if (biz.getId() != null){

            return bizService.updateBIZ(biz);
        }else {

            return bizService.addBIZ(biz);
        }

    }

    @RequestMapping("/deleteBIZ")
    public Result deleteBIZ(Integer id){

        Long l = id.longValue();
        return bizService.deleteOneBIZ(l);

    }

    @RequestMapping("/deleteBIZs")
    public Result deleteBIZs(String ids){
        System.out.println(ids);
        ids = ids.substring(0, ids.length() - 1);

        return bizService.deleteMany(ids);

    }



    @RequestMapping("/pageBIZ")
    public Result pageBIZ(Integer pageNo,Integer pageSize){
        return bizService.getBIZByPage(pageNo,pageSize);
    }

    @RequestMapping("/searchBIZs")
    public Result searchBIZs(String bizName,Integer pageNo,Integer pageSize){
        System.out.println(bizName);
        return bizService.searchBIZs(bizName,pageNo,pageSize);
    }
}
