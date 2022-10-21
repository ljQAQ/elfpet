package com.elf.dto;

import com.elf.domain.GoodsSku;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsDto {

    private Integer id;
    private String goodsName;
    private Double goodsPrice;
    private String goodsNo;
    private String goodsDesc;
    private String goodsImg;
    private Integer descId;
    private Integer pv;
    private Integer bizId;
    private Integer gtypeId;
    private Integer state;
    private Date createTime;
    private Integer createUser;
    private Date updateTime;
    private Integer updateUser;
    private Integer isDelete;
    private List<GoodsSku> goodsSkus;
}