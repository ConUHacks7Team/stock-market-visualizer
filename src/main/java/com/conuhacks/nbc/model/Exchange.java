package com.conuhacks.nbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.json.JSONObject;

import java.util.Map;

@Data
@AllArgsConstructor
public class Exchange {

    private String name;
    private Map<String, Symbol> symbolMap;

    public JSONObject toJSONObject(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", this.name);
        jsonObject.put("symbolMap", this.symbolMap);

        return jsonObject;
    }
}
