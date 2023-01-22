package com.conuhacks.nbc.messagingwebsocket;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExchangeSocketHandler extends TextWebSocketHandler {
    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws InterruptedException, IOException {
        String payload = message.getPayload();
        JSONObject jsonRequest = new JSONObject(payload);
        JSONObject jsonResponse = new JSONObject();

        jsonResponse.put("response", "exchange");
        jsonResponse.put("exchange", jsonRequest.get("exchange"));
        String[] stockArray = new String[10];

        for (int j = 0; j < stockArray.length; j++) {
            stockArray[j] = "SL" + Integer.toString(j);
        }

        jsonResponse.put("stocks", stockArray);

        session.sendMessage(new TextMessage(jsonResponse.toString()));
    }

}