package com.elf.controller;

import com.elf.commonutils.Result;
import com.elf.dto.AclRoleDto;
import com.elf.service.AclRolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aclRolePermission")
public class AclRolePermissionController {

    @Autowired
    AclRolePermissionService aclRolePermissionService;

    @GetMapping("/getPermissionIdList")
    public Result getPermissionIdList(String roleId){
        return aclRolePermissionService.getPermissionIdByRoleId(roleId);
    }

    @PostMapping("/setRolePermission")
    public Result setRolePermission(@RequestBody AclRoleDto aclRoleDto){
        return aclRolePermissionService.setRolePermission(aclRoleDto);
    }

}
