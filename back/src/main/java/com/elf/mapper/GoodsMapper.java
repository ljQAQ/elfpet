package com.elf.mapper;


import com.elf.domain.BIZ;
import com.elf.domain.Goods;
import com.elf.dto.GoodsDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsMapper {

    Goods getById();

    List<Goods> getGoodsByPage();


    List<Goods> getPetWithType(Integer gtypeId);

    Integer updateGoods(GoodsDto goodsDto);

    Integer insertGoods(GoodsDto goodsDto);

    @Delete("delete from goods where id = #{id}")
    Integer deleteById(Integer id);
}
