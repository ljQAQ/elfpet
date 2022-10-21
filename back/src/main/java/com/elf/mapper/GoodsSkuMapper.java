package com.elf.mapper;

import com.elf.domain.GoodsSku;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsSkuMapper {


    Integer insertGoodsSkus(List<GoodsSku> goodsSkus);

    @Select("select * from goods_sku where goods_id = #{goodsId}")
    List<GoodsSku> selectGoodsSkusByGoodsId(Integer goodsId);

    Integer deleteByGoodsId(Integer goodsId);
}
