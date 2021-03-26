package com.example.tsreportingservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;

@Service
public class QueueProcessingService {
    @Value("${spring.redis.host}")
    private String HOST;
    @Value("${spring.redis.port}")
    private Integer PORT;
    @Value("${spring.redis.password}")
    private String PASSWORD;

    public void processQueue() {
        JedisPool jedisPool = new JedisPool(new JedisPoolConfig(), HOST, PORT, 10000, PASSWORD);
        while(true) {
            List<String> tradeQueue = jedisPool.getResource().blpop(0,"trade-activity");

            if(tradeQueue == null) continue;

            System.out.println("Received -> " +tradeQueue);

            //exchange trade

            reportTradeEngineActivity(tradeQueue.get(1));
        }
    }

    private void reportTradeEngineActivity(String tradeOrder) {

        System.out.println("Trading -> " + tradeOrder);
    }
}
