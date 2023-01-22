package com.conuhacks.nbc.messagingwebsocket;

import org.json.JSONObject;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;

public class StockPriceSocketHandler extends TextWebSocketHandler {
    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws InterruptedException, IOException {
        String payload = message.getPayload();
        JSONObject jsonRequest = new JSONObject(payload);
        JSONObject jsonResponse = new JSONObject();

        jsonResponse.put("response", "stock");
        jsonResponse.put("symbol", jsonRequest.get("symbol"));
        jsonResponse.put("price", 420.69);

        session.sendMessage(new TextMessage(jsonResponse.toString()));
    }

}
