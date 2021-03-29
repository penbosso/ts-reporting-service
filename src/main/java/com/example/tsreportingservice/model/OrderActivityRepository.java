package com.example.tsreportingservice.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderActivityRepository  extends JpaRepository<OrderActivity, Long> {
    OrderActivity findByOrderId(long orderId);
}
