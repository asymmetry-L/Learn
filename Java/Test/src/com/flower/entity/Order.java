package com.flower.entity;

public class Order {
    private String order_id;
    private String user_id;
    private String touser_name;
    private String touser_tel;
    private String touser_address;
    private double touser_price;
    private String create_time;
    private int status;
    private String remark;

    public Order() {
    }

    public Order(String order_id, String user_id, String touser_name, String touser_tel, String touser_address, double touser_price, String create_time, int status, String remark) {
        this.order_id = order_id;
        this.user_id = user_id;
        this.touser_name = touser_name;
        this.touser_tel = touser_tel;
        this.touser_address = touser_address;
        this.touser_price = touser_price;
        this.create_time = create_time;
        this.status = status;
        this.remark = remark;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getTouser_name() {
        return touser_name;
    }

    public void setTouser_name(String touser_name) {
        this.touser_name = touser_name;
    }

    public String getTouser_tel() {
        return touser_tel;
    }

    public void setTouser_tel(String touser_tel) {
        this.touser_tel = touser_tel;
    }

    public String getTouser_address() {
        return touser_address;
    }

    public void setTouser_address(String touser_address) {
        this.touser_address = touser_address;
    }

    public double getTouser_price() {
        return touser_price;
    }

    public void setTouser_price(double touser_price) {
        this.touser_price = touser_price;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
                "order_id='" + order_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", touser_name='" + touser_name + '\'' +
                ", touser_tel='" + touser_tel + '\'' +
                ", touser_address='" + touser_address + '\'' +
                ", touser_price=" + touser_price +
                ", create_time='" + create_time + '\'' +
                ", status=" + status +
                ", remark='" + remark + '\'' +
                '}';
    }
}
