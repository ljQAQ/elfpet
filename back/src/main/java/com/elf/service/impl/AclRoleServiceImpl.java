package com.elf.service.impl;

import com.elf.commonutils.PageUtils;
import com.elf.commonutils.Result;
import com.elf.domain.AclRole;
import com.elf.domain.Goods;
import com.elf.mapper.AclRoleMapper;
import com.elf.service.AclRoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AclRoleServiceImpl implements AclRoleService {

    @Autowired
    AclRoleMapper aclRoleMapper;

    @Override
    public Result gettPageList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<AclRole> aclRoles = aclRoleMapper.selectAll();
        if (aclRoles==null){
            return Result.error().message("暂无数据");
        }
        PageInfo<AclRole> pageInfo = new PageInfo<>(aclRoles);
//        System.out.println(pageInfo);
//        PageUtils pageUtils = new PageUtils(pageInfo.getList(),(int)pageInfo.getTotal(),pageSize,pageNum);
        return Result.ok().data("aclRolePage",pageInfo);

    }
}
