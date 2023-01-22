package com.conuhacks.nbc.processor;

import com.conuhacks.nbc.model.Exchange;

import com.conuhacks.nbc.persistency.ExchangePersistence;
import com.conuhacks.nbc.utils.ResourceReader;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResourceProcessor {

    public static final String EXCHANGES_DIRECTORY = "exchanges/";

    public ResourceProcessor(ExchangePersistence exchangePersistence) {
        processExchanges(exchangePersistence);
    }

    private void processExchanges(ExchangePersistence exchangePersistence) {
        ResourceReader resourceReader = new ResourceReader();
        List<Exchange> exchanges = new ArrayList<>();

        List<String> stringExchanges;
        try {
            stringExchanges = resourceReader
                    .getJsonFileListInDirectory(EXCHANGES_DIRECTORY)
                    .stream()
                    .map(s -> s.substring(0, s.length() - 5))
                    .toList();

            for (String exchange : stringExchanges) {
                Exchange exchangeObject = new Exchange(exchange, new HashMap<>());
                processOperations(
                        exchangeObject,
                        resourceReader.readJsonResource(EXCHANGES_DIRECTORY + exchange + ".json"));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void processOperations(Exchange exchange, String content) {
        JSONObject jsonObject = new JSONObject(content);
        List<Object> operations = jsonObject.getJSONArray("operations").toList();
        for (Object objectOperation : operations) {
            Map<String, String> operationMap = (Map<String, String>) objectOperation;
            JSONObject jsonOperation = new JSONObject(operationMap);
            //TODO: to finish implementation
        }
    }
}
