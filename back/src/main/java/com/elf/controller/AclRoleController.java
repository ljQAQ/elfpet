package com.elf.controller;

import com.elf.commonutils.Result;
import com.elf.service.AclRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aclRole")
public class AclRoleController {

    @Autowired
    AclRoleService aclRoleService;

    @GetMapping("/getPageList")
    public Result getPageList(Integer pageNum,Integer pageSize){
        return aclRoleService.gettPageList(pageNum,pageSize);
    }
}
