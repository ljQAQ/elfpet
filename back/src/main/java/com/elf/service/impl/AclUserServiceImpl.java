package com.elf.service.impl;

import com.elf.commonutils.Result;
import com.elf.commonutils.UUIDUtils;
import com.elf.domain.AclUser;
import com.elf.dto.AclUserDto;
import com.elf.mapper.AclUserMapper;
import com.elf.service.AclPermissionService;
import com.elf.service.AclRolePermissionService;
import com.elf.service.AclUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;


@Service
@Transactional
public class AclUserServiceImpl implements AclUserService {

    @Autowired
    AclUserMapper aclUserMapper;
    @Autowired
    AclPermissionService aclPermissionService;

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

    @Override
    public Result login(AclUser aclUser, HttpServletRequest request) {
        AclUser aclUser1 = aclUserMapper.getByUsername(aclUser.getUsername());
        if (aclUser1==null){
            return Result.error().message("查无此人");
        }else if (!aclUser1.getPassword().equals(aclUser.getPassword())){
            return Result.error().message("账号密码错误");
        }
        request.getSession().setAttribute("userId",aclUser1.getId());
        return Result.ok().data("id",aclUser1.getId());
    }

    @Override
    public Result createOrUpdate(AclUserDto aclUserDto) {
        if (aclUserDto.getId()!=null){
            Integer integer = aclUserMapper.updateAclUser(aclUserDto);
            if (integer==0){
                return Result.error().message("更新失败");
            }
            return Result.ok();
        }else {
            aclUserDto.setId(UUIDUtils.getUUID());
            aclUserDto.setPassword("123456");
            aclUserDto.setIsDeleted(0);
            aclUserDto.setGmtCreate(new Date());
            aclUserDto.setGmtModified(new Date());
            Integer integer = aclUserMapper.insertAclUser(aclUserDto);
            Integer integer1 = aclUserMapper.insertAclUserRole(aclUserDto);
            if (integer==0){
                return Result.error().message("用户添加失败");
            }else if (integer1==0){
                return Result.error().message("用户添加角色失败");
            }
            return Result.ok();
        }

    }

    @Override
    public Result getPermissionByUserId(String userId) {
//        根据userId获取roleId
        String s = aclUserMapper.selectRoleIdByUserId(userId);
//        根据role获取Permission
        return aclPermissionService.getTreeList(s);
    }
}
