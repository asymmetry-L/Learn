package com.test;

class Atmer{
    private String id;
    private String name;
    private String card;
    private String pwd;
    private float money;

    public Atmer(String id, String name, String card, String pwd, float money) {
        this.id = id;
        this.name = name;
        this.card = card;
        this.pwd = pwd;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }
}