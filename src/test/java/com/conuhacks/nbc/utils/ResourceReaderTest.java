package com.conuhacks.nbc.utils;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ResourceReaderTest {

    @Test
    public void testReadFileListInDirectory() throws IOException {
        ResourceReader resourceReader = new ResourceReader();
        List<String> exchanges = resourceReader.getJsonFileListInDirectory("exchanges/");
        for (String exchange : exchanges)
            assertTrue(exchange.endsWith(".json"));
    }

    @Test
    public void testReadJsonResource() throws IOException {
        ResourceReader resourceReader = new ResourceReader();
        String exchange = resourceReader.readJsonResource("exchanges/TSXData.json");
        System.out.println(exchange);

    }
}
