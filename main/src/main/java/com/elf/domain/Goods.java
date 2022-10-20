package com.elf.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    private Integer id;

    private String goodsName;
    private String goodsNo;
    private String goodsImg;
    private String goodsDesc;
    private Double goodsPrice;
    private Integer pv;

    private Integer state;
    private Date createTime;
    private Integer createUser;
    private Date updateTime;
    private Integer updateUser;
    private Integer isDelete;

    private GType gType;

    private BIZ biz;

    private Integer desc;
}
