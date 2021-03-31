package com.example.tsreportingservice.service;

import com.example.tsreportingservice.model.TradeEngineActivity;
import com.example.tsreportingservice.model.TradeEngineActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TradeEngineService {

    @Autowired
    TradeEngineActivityRepository tradeEngineActivityRepository;

    public TradeEngineService(TradeEngineActivityRepository tradeEngineActivityRepository) {
        this.tradeEngineActivityRepository = tradeEngineActivityRepository;
    }

    public TradeEngineActivity saveTradeEngineActivity(TradeEngineActivity tradeEngineActivity){
        TradeEngineActivity tradeEngineActivityToSave = new TradeEngineActivity();
        tradeEngineActivityToSave.setOrderId(tradeEngineActivity.getOrderId());
        tradeEngineActivityToSave.setExchange(tradeEngineActivity.getExchange());
        tradeEngineActivityToSave.setStatus(tradeEngineActivity.getStatus());
        tradeEngineActivityToSave.setComment(tradeEngineActivity.getComment());

        return tradeEngineActivityRepository.save(tradeEngineActivityToSave);
    }
}
