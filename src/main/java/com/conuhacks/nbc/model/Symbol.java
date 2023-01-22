package com.conuhacks.nbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Symbol {

    private String symbol;
    private double price;
    private String exchange;

}
