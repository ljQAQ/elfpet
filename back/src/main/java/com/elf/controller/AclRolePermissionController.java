package com.elf.controller;

import com.elf.commonutils.Result;
import com.elf.service.AclRolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aclRolePermission")
public class AclRolePermissionController {

    @Autowired
    AclRolePermissionService aclRolePermissionService;

    @RequestMapping("getPermissionIdList")
    public Result getPermissionIdList(String roleId){
        return aclRolePermissionService.getPermissionIdByRoleId(roleId);
    }
}
