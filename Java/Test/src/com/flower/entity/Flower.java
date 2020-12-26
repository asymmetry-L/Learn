package com.flower.entity;

import java.math.BigDecimal;

public class Flower {
    private String flower_code;
    private String trade_type;
    private String flower_name;
    private String material;
    private String pack;
    private String descs;
    private BigDecimal price;
    private BigDecimal discount;
    private String image;
    private String deliverarea;
    private int status; //0:上架  1:下架
    private String create_time;
    private String remark;

    public Flower() {
    }

    public Flower(String flower_code, String trade_type, String flower_name, String material, String pack, String descs, BigDecimal price, BigDecimal discount, String image, String deliverarea, int status, String create_time, String remark) {
        this.flower_code = flower_code;
        this.trade_type = trade_type;
        this.flower_name = flower_name;
        this.material = material;
        this.pack = pack;
        this.descs = descs;
        this.price = price;
        this.discount = discount;
        this.image = image;
        this.deliverarea = deliverarea;
        this.status = status;
        this.create_time = create_time;
        this.remark = remark;
    }

    public String getFlower_code() {
        return flower_code;
    }

    public void setFlower_code(String flower_code) {
        this.flower_code = flower_code;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getFlower_name() {
        return flower_name;
    }

    public void setFlower_name(String flower_name) {
        this.flower_name = flower_name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDeliverarea() {
        return deliverarea;
    }

    public void setDeliverarea(String deliverarea) {
        this.deliverarea = deliverarea;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flower_code='" + flower_code + '\'' +
                ", trade_type='" + trade_type + '\'' +
                ", flower_name='" + flower_name + '\'' +
                ", material='" + material + '\'' +
                ", pack='" + pack + '\'' +
                ", descs='" + descs + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", image='" + image + '\'' +
                ", deliverarea='" + deliverarea + '\'' +
                ", status=" + status +
                ", create_time='" + create_time + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
