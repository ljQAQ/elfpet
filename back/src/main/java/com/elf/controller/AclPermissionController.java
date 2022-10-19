package com.elf.controller;

import com.elf.commonutils.Result;
import com.elf.domain.AclPermission;
import com.elf.service.AclPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/aclPermission")
public class AclPermissionController {

    @Autowired
    AclPermissionService aclPermissionService;

    @GetMapping("/getTreeList")
    public Result getTreeList(String pid){
        return aclPermissionService.getTreeList(pid);
    }
    @GetMapping("/getTreeListByRoleId")
    public Result getTreeListByRoleId(String id){
        return aclPermissionService.getTreeListByRoleId(id);
    }
    @GetMapping("/deleteById")
    public Result deleteById(){
        return null;
    }
    @PostMapping("/createOrUpdate")
    public Result createOrUpdate(@RequestBody AclPermission aclPermission){
        return aclPermissionService.createOrUpdate(aclPermission);
    }

}
