package com.elf.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AfterSale {
    //id after_no order_no user_name reason order_num after_status create_time remark
    private  int id;
    private  int afterNo;
    private  int orderNo;
    private  String name;
    private  String reason;
    private  int orderNum;
    private  int afterStatus;
    private   Date  createTime;
    private  String remark;

}
