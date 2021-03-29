package com.example.tsreportingservice.controller;

import com.example.tsreportingservice.model.OrderActivity;
import com.example.tsreportingservice.model.OrderActivityRepository;
import com.example.tsreportingservice.model.TradeEngineActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradeEngineActivityController {
    @Autowired
    OrderActivityRepository orderActivityRepository;

    private static int requestNumber = 0;
    @PostMapping("/trade-engine-activity")
    public ResponseEntity<Object> tradeEngineActivity(@RequestBody TradeEngineActivity tradeEngineActivity) {

        requestNumber++;;

//        System.out.println("Trade engine activity -> "+requestNumber+" --" + tradeEngineActivity.toString());

        System.out.println("%%%3***Trade engine:: "+ requestNumber +" -> " + tradeEngineActivity.toString());

        //update order activity by order id
        updateOrderActiviy(tradeEngineActivity.getOrderId(), tradeEngineActivity.getStatus());
        return ResponseEntity.ok().build();
    }

    public void updateOrderActiviy(long orderId, String status) {
        OrderActivity orderActivity = orderActivityRepository.findByOrderId(orderId);
        orderActivity.setStatus(status);
        orderActivityRepository.save(orderActivity);
    }
}
