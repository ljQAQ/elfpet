package com.elf.service.impl;

import com.elf.commonutils.Result;
import com.elf.domain.AclRole;
import com.elf.domain.AclUser;
import com.elf.dto.AclUserDto;
import com.elf.mapper.AclUserMapper;
import com.elf.service.AclUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class AclUserServiceImpl implements AclUserService {

    @Autowired
    AclUserMapper aclUserMapper;


    @Override
    public Result getPageList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<AclUserDto> aclUsers = aclUserMapper.selectAll();
        if (aclUsers==null){
            return Result.error().message("暂无数据");
        }
        PageInfo<AclUserDto> pageInfo = new PageInfo<>(aclUsers);
        return Result.ok().data("aclUserPage",pageInfo);
    }
}
