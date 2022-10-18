package com.elf.domain;

public class Orders {
    // id order_no good_no order_name price num
    private int id;
    private int orderNO;
    private int goodNo;
    private String orderName;
    private int price;
    private int num;

    public Orders() {
    }

    public Orders(int id, int orderNO, int goodNo, String orderName, int price, int num) {
        this.id = id;
        this.orderNO = orderNO;
        this.goodNo = goodNo;
        this.orderName = orderName;
        this.price = price;
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderNO() {
        return orderNO;
    }

    public void setOrderNO(int orderNO) {
        this.orderNO = orderNO;
    }

    public int getGoodNo() {
        return goodNo;
    }

    public void setGoodNo(int goodNo) {
        this.goodNo = goodNo;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderNO=" + orderNO +
                ", goodNo=" + goodNo +
                ", orderName='" + orderName + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }
}
