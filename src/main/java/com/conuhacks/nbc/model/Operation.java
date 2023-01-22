package com.conuhacks.nbc.model;

import com.conuhacks.nbc.model.types.DirectionType;
import com.conuhacks.nbc.model.types.MessageType;
import lombok.AllArgsConstructor;
import lombok.Data;

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

}
