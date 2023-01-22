package com.conuhacks.nbc.persistency;

import com.conuhacks.nbc.model.Exchange;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ExchangePersistence {

    private Map<String, Exchange> exchanges;

    public ExchangePersistence() {
        this.exchanges = new HashMap<>();
    }

}
