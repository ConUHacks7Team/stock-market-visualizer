package com.conuhacks.nbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Stock {

    private String symbol;
    private int price;
    private String exchange;

}
