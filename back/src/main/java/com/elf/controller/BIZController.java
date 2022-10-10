package com.elf.controller;

import com.elf.commonutils.Result;
import com.elf.service.BIZService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/biz")
public class BIZController {

    @Autowired
    BIZService bizService;

    @RequestMapping("/getAll")
    public Result getAll(){
        return bizService.getAll();
    }
}
