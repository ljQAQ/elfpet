package com.elf.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsDto {
    

    private Integer gtype_id;
    private String goods_name;
    private String goods_img;
    private String goods_intro;
    private Integer goods_sum;
    private Integer goods_sold;
    private Double goods_price;
    private Integer biz_id;
    private Integer state;
    private Date create_time;
    private Integer create_user;
    private Date update_time;
    private Integer update_user;
    private Integer is_delete;
}