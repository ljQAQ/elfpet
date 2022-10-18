package com.elf.service.impl;

import com.elf.commonutils.Result;
import com.elf.commonutils.UUIDUtils;
import com.elf.domain.AclRolePermission;
import com.elf.mapper.AclRolePermissionMapper;
import com.elf.service.AclRolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
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

    @Override
    public Result setRolePermission(List<String> permissionIds, String roleId) {
        List<AclRolePermission> list = new ArrayList<>();
        for (String permissionId: permissionIds) {
            list.add(new AclRolePermission(UUIDUtils.getUUID(),roleId,permissionId,0,new Date(),new Date()));
        }
        Integer i = aclRolePermissionMapper.saveRolePermission(list);
        if (i>0){
            return Result.ok();
        }else
        return Result.error().message("添加失败");
    }
}
