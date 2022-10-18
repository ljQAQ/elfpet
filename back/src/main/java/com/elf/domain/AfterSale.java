package com.elf.domain;

import java.util.Date;

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

    public AfterSale() {
    }

    public AfterSale(int id, int afterNo, int orderNo, String name, String reason, int orderNum, int afterStatus, Date createTime, String remark) {
        this.id = id;
        this.afterNo = afterNo;
        this.orderNo = orderNo;
        this.name = name;
        this.reason = reason;
        this.orderNum = orderNum;
        this.afterStatus = afterStatus;
        this.createTime = createTime;
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAfterNo() {
        return afterNo;
    }

    public void setAfterNo(int afterNo) {
        this.afterNo = afterNo;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getAfterStatus() {
        return afterStatus;
    }

    public void setAfterStatus(int afterStatus) {
        this.afterStatus = afterStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "AfterSale{" +
                "id=" + id +
                ", afterNo=" + afterNo +
                ", orderNo=" + orderNo +
                ", name='" + name + '\'' +
                ", reason='" + reason + '\'' +
                ", orderNum=" + orderNum +
                ", afterStatus=" + afterStatus +
                ", createTime=" + createTime +
                ", remark='" + remark + '\'' +
                '}';
    }
}
