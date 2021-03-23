package com.example.tsreportingservice.service;

import com.example.tsreportingservice.model.Order;
import com.example.tsreportingservice.model.OrderActivity;
import com.example.tsreportingservice.model.OrderActivityRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class OrderActivitySubscriber implements MessageListener {
    private static int count = 0;
    ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    OrderActivityRepository orderActivityRepository;

    @Override
    public void onMessage(Message message, byte[] bytes) {
        count = count + 1;
        try {
            Order order = objectMapper.readValue(message.toString(), Order.class);
            orderActivityRepository.save(new OrderActivity(
                    order.isValid() ? "valid" : "invalid", order.getSide(), order.getId()
            ));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Message -> " + count + " received: " + message);
    }
}
