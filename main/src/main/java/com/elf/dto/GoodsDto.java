package com.elf.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsDto {
    

    private Integer gtypeId;
    private String goodsName;
    private String goodsImg;
    private String goodsIntro;
    private Double goodsPrice;
    private Integer bizId;
    private Integer state;
    private Date createTime;
    private Integer createUser;
    private Date updateTime;
    private Integer updateUser;
    private Integer isDelete;
}