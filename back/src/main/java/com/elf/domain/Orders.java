package com.elf.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
    // id order_no good_no order_name price num
    private int id;
    private int orderNO;
    private int goodNo;
    private String orderName;
    private int price;
    private int num;

}
