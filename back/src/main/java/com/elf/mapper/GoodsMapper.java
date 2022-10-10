package com.elf.mapper;


import com.elf.domain.BIZ;
import com.elf.domain.Goods;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsMapper {

    Goods getById();

    List<Goods> getGoodsByPage();


}
