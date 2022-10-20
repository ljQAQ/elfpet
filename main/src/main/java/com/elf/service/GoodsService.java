package com.elf.service;

import com.elf.commonutils.Result;

public interface GoodsService {

    Result getById();

    Result getGoodsByPage(Integer pageNum,Integer pageSize);

    Result getPetList();
}
