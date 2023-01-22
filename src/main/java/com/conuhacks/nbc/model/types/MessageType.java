package com.conuhacks.nbc.model.types;


import lombok.Data;

public enum MessageType {

    TRADE("Trade"),
    REJECTED("Rejected"),
    NEW_ORDER_REQUEST("NewOrderRequest"),
    NEW_ORDER_ACKNOWLEDGED("NewOrderAcknowledged"),
    CANCEL_REQUEST("CancelRequest"),
    CANCELLED("Cancelled"),
    CANCEL_ACKNOWLEDGED("CancelAcknowledged");

    private String name;

    MessageType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
