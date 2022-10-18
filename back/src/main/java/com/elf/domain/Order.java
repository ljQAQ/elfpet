package com.elf.domain;

import java.util.Date;

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

    public Order() {
    }

    public Order(int id, String orderNo, int orderStatus, int productCount, int orderTotal, String address, Date createTime, Date payTime, Date goTime, String remark) {
        this.id = id;
        this.orderNo = orderNo;
        this.orderStatus = orderStatus;
        this.productCount = productCount;
        this.orderTotal = orderTotal;
        this.address = address;
        this.createTime = createTime;
        this.payTime = payTime;
        this.goTime = goTime;
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public int getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(int orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getGoTime() {
        return goTime;
    }

    public void setGoTime(Date goTime) {
        this.goTime = goTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", orderStatus=" + orderStatus +
                ", productCount=" + productCount +
                ", orderTotal=" + orderTotal +
                ", address='" + address + '\'' +
                ", createTime=" + createTime +
                ", payTime=" + payTime +
                ", goTime=" + goTime +
                ", remark='" + remark + '\'' +
                '}';
    }
}
