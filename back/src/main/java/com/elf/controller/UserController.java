package com.elf.controller;


import com.elf.commonutils.Result;
import com.elf.domain.User;
import com.elf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    /*用户登录*/
    @GetMapping("/login")
    public Result login(@RequestBody User user){
            return userService.login(user);
    }


    /*用户注册*/
    @PostMapping("/register")
    public Result  register(@RequestBody User user){
            return userService.register(user);
    }

    @GetMapping("/getUserPage")
    public Result getUserPage(Integer pageNum,
                              @RequestParam(required = false,defaultValue = "5")Integer pageSize,
                              @RequestParam(required = false) String key){
        return userService.getUserPage(pageNum,pageSize,key);
    }
}
