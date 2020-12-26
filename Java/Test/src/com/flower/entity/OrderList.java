package com.flower.entity;

public class OrderList {
    private int od_id;
    private String order_id;
    private String flower_code;
    private int count;
    private double total_price;

    public OrderList() {
    }

    public OrderList(int od_id, String order_id, String flower_code, int count, double total_price) {
        this.od_id = od_id;
        this.order_id = order_id;
        this.flower_code = flower_code;
        this.count = count;
        this.total_price = total_price;
    }

    public int getOd_id() {
        return od_id;
    }

    public void setOd_id(int od_id) {
        this.od_id = od_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getFlower_code() {
        return flower_code;
    }

    public void setFlower_code(String flower_code) {
        this.flower_code = flower_code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    @Override
    public String toString() {
        return "OrderList{" +
                "od_id=" + od_id +
                ", order_id='" + order_id + '\'' +
                ", flower_code='" + flower_code + '\'' +
                ", count=" + count +
                ", total_price=" + total_price +
                '}';
    }
}
