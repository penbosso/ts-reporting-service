package com.example.tsreportingservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

@Service
public class QueueProcessingService {
    @Value("${spring.redis.host}")
    private String HOST;
    @Value("${spring.redis.port}")
    private Integer PORT;
    @Value("${spring.redis.password}")
    private String PASSWORD;
    static int requestNumber = 0;

    public void processQueue() {
        Jedis jedis = new Jedis( HOST, PORT,0);
            jedis.auth(PASSWORD);

        while(true) {
            String tradeQueue = jedis.lpop("trade-activity");
            if(tradeQueue == null) continue;
            requestNumber++;;

            System.out.println("Received -> "+requestNumber+" --" +tradeQueue);

            //exchange trade

//            reportTradeEngineActivity(tradeQueue.get(1));
        }
    }

    private void reportTradeEngineActivity(String tradeOrder) {

        System.out.println("Trading -> " + tradeOrder);
    }
}
