package com.conuhacks.nbc.model;

import com.conuhacks.nbc.model.types.DirectionType;
import com.conuhacks.nbc.model.types.MessageType;

public class Operation {

    private String timeStampEpoch;
    private DirectionType direction;
    private String orderID;
    private MessageType messageType;
    private Symbol symbol;
    private double orderPrice;
    private Exchange exchange;

}
