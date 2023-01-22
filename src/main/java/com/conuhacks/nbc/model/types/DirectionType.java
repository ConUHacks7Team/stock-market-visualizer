package com.conuhacks.nbc.model.types;

public enum DirectionType {

    NBF_TO_EXCHANGE("NBFToExchange"),
    EXCHANGE_TO_NBF("ExchangeToNBF");

    private String name;

    DirectionType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
