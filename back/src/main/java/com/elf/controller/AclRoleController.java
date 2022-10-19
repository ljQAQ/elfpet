package com.elf.controller;

import com.elf.commonutils.Result;
import com.elf.domain.AclRole;
import com.elf.service.AclRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aclRole")
public class AclRoleController {

    @Autowired
    AclRoleService aclRoleService;

    @GetMapping("/getPageList")
    public Result getPageList(Integer pageNum,Integer pageSize){
        return aclRoleService.getPageList(pageNum,pageSize);
    }
    @PostMapping("/createOrUpdate")
    public Result createOrUpdate(@RequestBody AclRole aclRole){
        return aclRoleService.createOrUpdate(aclRole);
    }
}
