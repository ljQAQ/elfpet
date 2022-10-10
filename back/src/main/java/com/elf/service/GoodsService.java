package com.elf.service;

import com.elf.commonutils.Result;
import com.elf.domain.Goods;

import java.util.List;

public interface GoodsService {

    Result getById();

    Result getGoodsByPage(Integer pageNum,Integer pageSize);
}
