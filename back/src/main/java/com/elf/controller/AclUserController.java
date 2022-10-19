package com.elf.controller;

import com.elf.commonutils.Result;
import com.elf.domain.AclUser;
import com.elf.domain.User;
import com.elf.dto.AclUserDto;
import com.elf.service.AclUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/aclUser")
public class AclUserController {

    @Autowired
    AclUserService aclUserService;

    @RequestMapping("/getPageList")
    public Result getPageList(Integer pageNum, Integer pageSize){
        return aclUserService.getPageList(pageNum,pageSize);
    }

    /*用户登录*/
    @GetMapping("/login")
    public Result login(@RequestParam("username")String username, @RequestParam("password")String password, HttpServletRequest request){
        AclUser aclUser = new AclUser();
        aclUser.setPassword(password);
        aclUser.setUsername(username);
        return aclUserService.login(aclUser, request);
    }

    @PostMapping("/createOrUpdate")
    public Result createOrUpdate(@RequestBody AclUserDto aclUserDto){
        return aclUserService.createOrUpdate(aclUserDto);
    }

}
