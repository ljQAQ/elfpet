package com.elf.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsSku {
    private Integer id;
    private Integer goodsId;
    private String text;
    private Double price;
    private Integer stock;
    private Date createTime;
}
