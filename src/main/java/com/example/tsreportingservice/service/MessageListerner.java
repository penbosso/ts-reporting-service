package com.example.tsreportingservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class MessageListerner {
    @Autowired
    private RedisConnectionFactory redisConnectionFactory;
//    @ServiceActivator(inputChannel = "tradeInputChannel", outputChannel = "senderChannel")
//    public Message<?> receiveFromService(Message<?> message) {
//        return message;
//    }

    @ServiceActivator(inputChannel = "receiverChannel")
    public void receiveFromQueue(Message<?> message) {
        System.out.println(("received form redis queue"+ message));
    }
}
