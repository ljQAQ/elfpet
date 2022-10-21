package com.elf.service.impl;

import com.elf.commonutils.PageUtils;
import com.elf.commonutils.Result;
import com.elf.commonutils.UUIDUtils;
import com.elf.domain.Goods;
import com.elf.domain.GoodsSku;
import com.elf.dto.GoodsDto;
import com.elf.mapper.GoodsMapper;
import com.elf.mapper.GoodsSkuMapper;
import com.elf.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;
    @Autowired
    GoodsSkuMapper goodsSkuMapper;

    @Override
    public Result getById() {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public Result getGoodsByPage(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Goods> goodsByPage = goodsMapper.getGoodsByPage();
        if (goodsByPage==null){
            return Result.error();
        }
        PageInfo<Goods> pageInfo = new PageInfo<>(goodsByPage);

        PageUtils pageUtils = new PageUtils(pageInfo.getList(),(int)pageInfo.getTotal(),pageSize,pageNum);
        return Result.ok().data("goodsPage",pageUtils);
    }

    @Override
    public Result getPetList() {
        List<Goods> list = goodsMapper.getPetWithType(6);
        List<Goods> l1 = new ArrayList<>();
        for (int i = 0; i <6; i++) {
            l1.add(list.get(i));
        }
        return Result.ok().data("petList",l1);
    }

    @Override
    public Result saveOrCreate(GoodsDto goodsDto) {
        goodsDto.setUpdateTime(new Date());
        if (goodsDto.getId()!=null){
//            更新
            Integer i = goodsMapper.updateGoods(goodsDto);
//            根据goodsId删除所有sku
//            Integer i1 = goodsSkuMapper.deleteByGoodsId(goodsDto.getId());
//            添加新的sku
//            Integer i2 = goodsSkuMapper.insertGoodsSkus(goodsDto.getGoodsSkus());
//
            if (i==0){
                return Result.error().message("商品更新失败");
            }
//            else if (i1==0){
//                return Result.error().message("sku删除失败");
//            }
//            else if (i2==0){
//                return Result.error().message("sku添加失败");
//            }
            else{
                return Result.ok();
            }

        }else {
//            增加
            goodsDto.setGoodsNo(UUIDUtils.getUUID());
            goodsDto.setCreateTime(new Date());
            goodsDto.setState(1);
            goodsDto.setPv(0);
            goodsDto.setIsDelete(0);
            Integer i = goodsMapper.insertGoods(goodsDto);
//            Integer i2 = goodsSkuMapper.insertGoodsSkus(goodsDto.getGoodsSkus());
            if (i==0){
                return Result.error().message("商品添加失败");
            }else{
                return Result.ok();
            }

        }
    }
    @Override
    public Result getGoodsSkus(Integer goodsId) {
        List<GoodsSku> goodsSkus = goodsSkuMapper.selectGoodsSkusByGoodsId(goodsId);
        return Result.ok().data("goodsSkus",goodsSkus);
    }

    @Override
    public Result deleteGoodsById(Integer id) {
        Integer i = goodsMapper.deleteById(id);
        if (i>0){
            return Result.ok();
        }else
        return Result.error();
    }
}
