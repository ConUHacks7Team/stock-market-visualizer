package com.conuhacks.nbc.persistency;

import com.conuhacks.nbc.model.Exchange;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class ExchangePersistence {

    private List<Exchange> exchanges;

}
