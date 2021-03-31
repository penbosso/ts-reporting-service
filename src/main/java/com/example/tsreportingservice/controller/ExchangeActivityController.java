package com.example.tsreportingservice.controller;

import com.example.tsreportingservice.model.ExchageActivityRepository;
import com.example.tsreportingservice.model.ExchangeActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeActivityController {
    @Autowired
    private ExchageActivityRepository exchageActivityRepository;

    @PostMapping("/exchange-activity-report")
    public ResponseEntity<Object> ReportExchangeActivity(@RequestBody ExchangeActivity exchangeActivity){
        exchageActivityRepository.save(exchangeActivity);


        System.out.println("%%%4***Exchange connectivity:: "+ exchangeActivity.toString());
        return ResponseEntity.ok().build();
    }
}
