package com.elf.service.impl;

import com.elf.commonutils.Result;
import com.elf.domain.AclPermission;
import com.elf.dto.AclPermissionDto;
import com.elf.dto.GTypeDto;
import com.elf.mapper.AclPermissionMapper;
import com.elf.mapper.GTypeMapper;
import com.elf.service.AclPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AclPermissionServiceImpl implements AclPermissionService {
    @Autowired
    AclPermissionMapper aclPermissionMapper;

    @Override
    public Result getTreeList(String pid) {
        List<AclPermissionDto> all = aclPermissionMapper.getTreeList(pid);
        for (AclPermissionDto aclPermissionDto : all) {
            if (aclPermissionDto.getChildren().size()!=0){
                for (AclPermissionDto child : aclPermissionDto.getChildren()) {
                    if (child.getChildren().size()!=0){
                        for (AclPermissionDto childChild : child.getChildren()) {
                            childChild.setChildren(null);
                        }
                    }else child.setChildren(null);
                }

            }else aclPermissionDto.setChildren(null);
        }
        return Result.ok().data("aclPermissionOptions", all);
    }

    @Override
    public Result createOrUpdate(AclPermission aclPermission) {
        if (aclPermission.getId()!=null){
            Integer r = aclPermissionMapper.updateById(aclPermission);
            if (r==1){
                return Result.ok();
            }else
                return Result.error().message("权限更新失败");
        }else {
            aclPermission.setId(String.valueOf(System.currentTimeMillis()));
            Integer r = aclPermissionMapper.addPermission(aclPermission);
            if (r==1){
                return Result.ok();
            }else
                return Result.error().message("权限添加失败");
        }

    }
}
