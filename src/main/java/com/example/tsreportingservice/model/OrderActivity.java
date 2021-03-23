package com.example.tsreportingservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class OrderActivity {
    @Id
    @GeneratedValue
    private long id;
    private String status;
    private String action;
    private long orderId;
    private Date createdAt;

    public OrderActivity() {
    }

    public OrderActivity(String status, String action, long orderId) {
        this.status = status;
        this.action = action;
        this.orderId = orderId;
        this.createdAt = new Timestamp((new Date().getTime()));
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
