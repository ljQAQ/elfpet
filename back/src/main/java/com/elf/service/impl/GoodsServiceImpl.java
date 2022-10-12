package com.elf.service.impl;

import com.elf.commonutils.PageUtils;
import com.elf.commonutils.Result;
import com.elf.domain.Goods;
import com.elf.mapper.GoodsMapper;
import com.elf.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;

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
}
