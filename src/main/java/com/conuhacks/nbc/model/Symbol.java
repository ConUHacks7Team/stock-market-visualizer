package com.conuhacks.nbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.json.JSONObject;

@Data
@AllArgsConstructor
public class Symbol {

    private String symbol;
    private double price;
    private String exchange;

    public JSONObject toJSONObject(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("symbol" , this.symbol);
        jsonObject.put("price" , this.price);
        jsonObject.put("exchange" , this.exchange);
        return jsonObject;
    }

}
