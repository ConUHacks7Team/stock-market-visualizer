package com.conuhacks.nbc.model.types;

public enum DirectionType {

    NBF_TO_EXCHANGE("NBFToExchange"),
    EXCHANGE_TO_NBF("ExchangeToNBF");

    private String name;

    public static DirectionType getByName(String name) {
        for (DirectionType value : DirectionType.values())
            if (name.equalsIgnoreCase(value.name))
                return value;

        return null;
    }

    DirectionType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
