package com.flower.entity;

public class Cart {
    private int cart_id;
    private String user_id;
    private String flower_code;
    private int count;
    private double totalprice;

    public Cart() {
    }

    public Cart(int cart_id, String user_id, String flower_code, int count, double totalprice) {
        this.cart_id = cart_id;
        this.user_id = user_id;
        this.flower_code = flower_code;
        this.count = count;
        this.totalprice = totalprice;
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
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

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cart_id=" + cart_id +
                ", user_id='" + user_id + '\'' +
                ", flower_code='" + flower_code + '\'' +
                ", count=" + count +
                ", totalprice=" + totalprice +
                '}';
    }
}
