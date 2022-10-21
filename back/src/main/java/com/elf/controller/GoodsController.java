package com.elf.controller;

import com.elf.commonutils.Result;
import com.elf.dto.GoodsDto;
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

    @GetMapping("/getPetList")
    public Result getPetList(){
        return goodsService.getPetList();
    }

    @PostMapping("/saveOrCreate")
    public Result saveOrCreate(@RequestBody GoodsDto goodsDto){
        return goodsService.saveOrCreate(goodsDto);
    }

    @GetMapping("/getGoodsSkus")
    public Result getGoodsSkus(Integer goodsId){
        return goodsService.getGoodsSkus(goodsId);
    }
    @GetMapping("/deleteById")
    public Result deleteGoodsById(Integer id){
        return goodsService.deleteGoodsById(id);
    }

}
