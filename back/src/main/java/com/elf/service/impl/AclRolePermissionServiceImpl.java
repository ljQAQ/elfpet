package com.elf.service.impl;

import com.elf.commonutils.Result;
import com.elf.commonutils.UUIDUtils;
import com.elf.domain.AclRolePermission;
import com.elf.dto.AclRoleDto;
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

//        if (permissionIdByRoleId==null||permissionIdByRoleId.size()==0){
//            return Result.error().message("查询失败");
//        }else
        return Result.ok().data("permissionIdList",permissionIdByRoleId);
    }

    @Override
    public Result setRolePermission(AclRoleDto aclRoleDto) {
//        排除全部权限
        aclRoleDto.getPermissionIds().remove("1");
        List<AclRolePermission> list = new ArrayList<>();
//        根据roleId查询所有已有的permissionId
        List<String> permissionIdByRoleId = aclRolePermissionMapper.getPermissionIdByRoleId(aclRoleDto.getId());
//        根据已有的permissionId排除掉传过来的数据库中已存在的
        for (String permissionId: aclRoleDto.getPermissionIds()) {
            boolean add = true;
            for (int i = 0; i < permissionIdByRoleId.size(); i++) {
                if (permissionIdByRoleId.get(i).equals(permissionId)){
//                    删除直到查询过来的仅有数据库中有但传过来的数据中没有的，用以删除
                    permissionIdByRoleId.remove(i);
                    add=false;
                }
            }
//            传过来的permissionId且不存在于数据库中
            if (add)
            list.add(new AclRolePermission(UUIDUtils.getUUID(),aclRoleDto.getId(),permissionId,0,new Date(),new Date()));
        }
//        保存所有数据库中未有的
        Integer i =0;
        if (list.size() != 0) {
            i =aclRolePermissionMapper.saveRolePermission(list);
        }

        String ps=permissionIdByRoleId.toString();
        ps=ps.substring(1,ps.length()-1);
        if (permissionIdByRoleId.size() != 0) {
            i =aclRolePermissionMapper.deleteRolePermission(aclRoleDto.getId(),ps);
        }
        if (i>0){
            return Result.ok();
        }else
        return Result.error().message("添加失败");
    }
}
