package com.example.tsreportingservice.service;

import com.example.tsreportingservice.model.TradeEngineActivity;
import com.example.tsreportingservice.model.TradeEngineActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TradeEngineService {

    @Autowired
    TradeEngineActivityRepository tradeEngineActivityRepository;

    public TradeEngineActivity saveTradeEngineActivity(TradeEngineActivity tradeEngineActivity){

        return tradeEngineActivityRepository.save(tradeEngineActivity);
    }
}
