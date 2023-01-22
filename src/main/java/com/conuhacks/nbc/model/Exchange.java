package com.conuhacks.nbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class Exchange {

    private String name;
    private Map<String, Symbol> symbolMap;

}
