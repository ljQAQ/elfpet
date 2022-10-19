package com.elf.service.impl;


import com.elf.commonutils.PageUtils;
import com.elf.commonutils.Result;
import com.elf.domain.Goods;
import com.elf.domain.User;
import com.elf.mapper.UserMapper;
import com.elf.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Result login(User user) {
        User getUser = userMapper.getByUsername(user.getAccount());
        if (getUser==null){
            return Result.error().message("查无此人");
        }else if (getUser.getPassword().equals(user.getPassword())){
            return Result.error().message("账号密码错误");
        }
        return Result.ok();
    }

    @Override
    public Result register(User user) {
        User getUser = userMapper.getByUsername(user.getAccount());
        if (getUser!=null){
            return Result.error().message("账号已存在");
        }
        Integer integer = userMapper.saveUser(user);
        if (integer!=1){
            return Result.error().message("注册失败");
        }
        return Result.ok();
    }

    @Override
    public Result getUserPage(Integer pageNum, Integer pageSize, String key) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = userMapper.getUserList();
        if (users==null){
            return Result.error().message("查询失败");
        }
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return Result.ok().data("userPage",pageInfo);
    }
}
