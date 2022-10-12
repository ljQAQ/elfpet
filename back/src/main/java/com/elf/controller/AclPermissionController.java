package com.elf.controller;

import com.elf.commonutils.Result;
import com.elf.domain.AclPermission;
import com.elf.service.AclPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aclPermission")
public class AclPermissionController {

    @Autowired
    AclPermissionService aclPermissionService;

    @GetMapping("/getTreeList")
    public Result getTreeList(){
        return aclPermissionService.getTreeList();
    }
    @GetMapping("/deleteById")
    public Result deleteById(){
        return null;
    }
    @PostMapping("/createOrUpdate")
    public Result createOrUpdate(AclPermission aclPermission){
        System.out.println(aclPermission);
        return aclPermissionService.createOrUpdate(aclPermission);
    }

}
