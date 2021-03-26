package com.example.tsreportingservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ExchangeActivity {
    @Id
    @GeneratedValue

    private long id;
    private String exchange;
    private String side;
    private int quantity;
    private double price;
    private String orderKey;

    public ExchangeActivity(String exchange, String side, int quantity, double price, String orderKey) {
        this.exchange = exchange;
        this.side = side;
        this.quantity = quantity;
        this.price = price;
        this.orderKey = orderKey;
    }

    public ExchangeActivity(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrderKey() {
        return orderKey;
    }

    public void setOrderKey(String orderKey) {
        this.orderKey = orderKey;
    }
}
