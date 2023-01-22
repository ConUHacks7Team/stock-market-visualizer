package com.conuhacks.nbc.processor;

import com.conuhacks.nbc.NbcStockMarketApplication;
import com.conuhacks.nbc.model.Exchange;

import com.conuhacks.nbc.model.Operation;
import com.conuhacks.nbc.model.Symbol;
import com.conuhacks.nbc.model.types.DirectionType;
import com.conuhacks.nbc.model.types.MessageType;
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

        List<String> stringExchanges;
        try {
            stringExchanges = resourceReader
                    .getJsonFileListInDirectory(EXCHANGES_DIRECTORY)
                    .stream()
                    .map(s -> s.substring(0, s.length() - 5))
                    .toList();

            for (String exchangeName : stringExchanges) {
                Exchange exchangeObject = new Exchange(exchangeName, new HashMap<>());
                processOperations(
                        exchangeObject,
                        resourceReader.readJsonResource(EXCHANGES_DIRECTORY + exchangeName + ".json"));
                exchangePersistence.getExchanges().put(exchangeName, exchangeObject);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void processOperations(Exchange exchange, String content) {
        JSONObject jsonObject = new JSONObject(content);
        List<Object> operations = jsonObject.getJSONArray("operations").toList();

        for (Object objectOperation : operations) {
            Map<String, Object> operationMap = (Map<String, Object>) objectOperation;

            String timeStampEpoch = (String) operationMap.get("TimeStampEpoch");
            DirectionType direction = DirectionType.getByName((String) operationMap.get("Direction"));
            String orderID = (String) operationMap.get("OrderID");
            MessageType messageType = MessageType.getByName((String) operationMap.get("MessageType"));
            String symbolName = (String) operationMap.get("Symbol");

            Double orderPrice = messageType.name().equals(MessageType.CANCELLED.name())
                    || messageType.name().equals(MessageType.CANCEL_REQUEST.name())
                    || messageType.name().equals(MessageType.CANCEL_ACKNOWLEDGED.name())
                    ? null : (double) operationMap.get("OrderPrice");

            Operation operation = new Operation(timeStampEpoch, direction, orderID, messageType, symbolName,
                    orderPrice, exchange);

            NbcStockMarketApplication.getOperationPersistence().getOperations().put(timeStampEpoch, operation);
        }
    }
}
