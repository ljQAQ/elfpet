package com.elf.controller;

import com.elf.commonutils.Result;
import com.elf.service.AclUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aclUser")
public class AclUserController {

    @Autowired
    AclUserService aclUserService;

    @RequestMapping("/getPageList")
    public Result getPageList(Integer pageNum, Integer pageSize){
        return aclUserService.getPageList(pageNum,pageSize);
    }
}
