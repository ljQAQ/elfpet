package com.elf.service;

import com.elf.commonutils.Result;
import com.elf.domain.Goods;
import com.elf.dto.GoodsDto;

import java.util.List;

public interface GoodsService {

    Result getById();

    Result getGoodsByPage(Integer pageNum,Integer pageSize);

    Result getPetList();

    Result saveOrCreate(GoodsDto goodsDto);

    Result getGoodsSkus(Integer goodsId);

    Result deleteGoodsById(Integer id);
}
