package com.elf.service.impl;

import com.elf.commonutils.Result;
import com.elf.mapper.AclRolePermissionMapper;
import com.elf.service.AclRolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class AclRolePermissionServiceImpl implements AclRolePermissionService {

    @Autowired
    AclRolePermissionMapper aclRolePermissionMapper;

    @Override
    public Result getPermissionIdByRoleId(String id) {
        List<String> permissionIdByRoleId = aclRolePermissionMapper.getPermissionIdByRoleId(id);
        if (permissionIdByRoleId==null||permissionIdByRoleId.size()==0){
            return Result.error().message("查询失败");
        }else
        return Result.ok().data("permissionIdList",permissionIdByRoleId);
    }
}
