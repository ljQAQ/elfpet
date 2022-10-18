package com.elf.service.impl;

import com.elf.commonutils.PageUtils;
import com.elf.commonutils.Result;
import com.elf.commonutils.UUIDUtils;
import com.elf.domain.AclRole;
import com.elf.domain.Goods;
import com.elf.mapper.AclRoleMapper;
import com.elf.service.AclRoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class AclRoleServiceImpl implements AclRoleService {

    @Autowired
    AclRoleMapper aclRoleMapper;

    @Override
    public Result getPageList(Integer pageNum, Integer pageSize) {
        if (pageNum!=null&&pageSize!=null)
        PageHelper.startPage(pageNum,pageSize);
        List<AclRole> aclRoles = aclRoleMapper.selectAll();
        if (aclRoles==null){
            return Result.error().message("暂无数据");
        }
        if (pageNum==null||pageSize==null){
            return Result.ok().data("aclRoleList",aclRoles);
        }else {
            PageInfo<AclRole> pageInfo = new PageInfo<>(aclRoles);
            return Result.ok().data("aclRolePage",pageInfo);
        }
    }

    @Override
    public Result createOrUpdate(AclRole aclRole) {
        if (aclRole.getId()!=null&&aclRole.getId()!=""){
            aclRole.setGmtModified(new Date());
            Integer integer = aclRoleMapper.updateAclRole(aclRole);
            if (integer>0){
                return Result.ok();
            }else
                return Result.error().message("更新失败");
        }else {
            aclRole = new AclRole(UUIDUtils.getUUID(), aclRole.getRoleName(), UUIDUtils.getUUID(), aclRole.getRemark(), 0,new Date(),new Date());
            Integer integer = aclRoleMapper.insertAclRole(aclRole);
            if (integer>0){
                return Result.ok();
            }else {
                return Result.error().message("添加失败");
            }
        }


    }
}
