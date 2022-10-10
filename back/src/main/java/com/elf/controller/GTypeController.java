package com.elf.controller;

import com.elf.commonutils.Result;
import com.elf.service.GTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gtype")
public class GTypeController {

    @Autowired
    GTypeService gTypeService;

    @GetMapping("/getAll")
    public Result getAll(){
        return gTypeService.getTreeList();
    }
}
