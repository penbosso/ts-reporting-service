package com.example.tsreportingservice.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchageActivityRepository extends JpaRepository<ExchangeActivity, Long> {
}
