package com.elf.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
// id 订单编号 订单状态 订单金额 地址 创建时间 付款时间 发货时间 备注
    private  int id;
    private  String orderNo;
    private  int orderStatus;
    private  int productCount;
    private  int orderTotal;
    private  String address;
    private  Date createTime;
    private  Date payTime;
    private  Date  goTime;
    private  String remark;

}
