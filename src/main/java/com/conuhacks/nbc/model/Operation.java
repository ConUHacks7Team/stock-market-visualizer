package com.conuhacks.nbc.model;

import com.conuhacks.nbc.model.types.DirectionType;
import com.conuhacks.nbc.model.types.MessageType;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.json.JSONObject;

@Data
@AllArgsConstructor
public class Operation {

    private String timeStampEpoch;
    private DirectionType direction;
    private String orderID;
    private MessageType messageType;
    private String symbolName;
    private Double orderPrice;
    private Exchange exchange;

    public JSONObject toJSONObject(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("timeStampEpoch", timeStampEpoch);
        jsonObject.put("direction", this.direction.getName());
        jsonObject.put("orderID", this.orderID);
        jsonObject.put("messageType", this.messageType.getName());
        jsonObject.put("symbolName", this.symbolName);
        jsonObject.put("orderPrice", this.orderPrice);
        jsonObject.put("exchange", this.exchange.getName());

        return jsonObject;
    }
}
