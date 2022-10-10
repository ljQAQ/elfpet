package com.elf.controller;

import com.elf.commonutils.Result;
import com.elf.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    @GetMapping("/getGoodsByPage")
    public Result getUserByPage(Integer pageNum,
                                @RequestParam(required = false,defaultValue = "5")Integer pageSize,
                                @RequestParam(required = false) String key){
        return goodsService.getGoodsByPage(pageNum,pageSize);
    }
}
