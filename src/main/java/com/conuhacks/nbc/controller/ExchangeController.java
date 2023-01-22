package com.conuhacks.nbc.controller;

import com.conuhacks.nbc.NbcStockMarketApplication;
import com.conuhacks.nbc.model.Exchange;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exchange")
public class ExchangeController {

    @GetMapping
    public List<String> getExchanges() {
        return NbcStockMarketApplication.getExchangePersistence()
                .getExchanges()
                .keySet()
                .stream()
                .toList();
    }

}
