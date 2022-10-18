package com.elf.controller;

import com.elf.commonutils.Result;
import com.elf.service.AclRolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("aclRolePermission")
public class AclRolePermissionController {

    @Autowired
    AclRolePermissionService aclRolePermissionService;

    @GetMapping("getPermissionIdList")
    public Result getPermissionIdList(String roleId){
        return aclRolePermissionService.getPermissionIdByRoleId(roleId);
    }

    @GetMapping("setRolePermission")
    public Result setRolePermission(@RequestParam("permissionIds") List<String> permissionIds, @RequestParam("roleId") String roleId){
        return aclRolePermissionService.setRolePermission(permissionIds,roleId);
    }

}
