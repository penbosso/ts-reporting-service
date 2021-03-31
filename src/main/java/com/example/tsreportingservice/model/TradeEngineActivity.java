package com.example.tsreportingservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Entity
public class TradeEngineActivity {
    @NotNull
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String status;
    private String exchange;
    private long orderId;
    private String comment;

    public TradeEngineActivity(String status, String exchange, String comment, long orderId) {
        this.status = status;
        this.exchange = exchange;
        this.orderId = orderId;
        this.comment = comment;
    }

    public TradeEngineActivity() {
    }

    public String getStatus() {
        return status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public long getOrderId() {
        return orderId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "TradeEngineActivity{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", exchange='" + exchange + '\'' +
                ", orderId=" + orderId +
                ", comment='" + comment + '\'' +
                '}';
    }
}
