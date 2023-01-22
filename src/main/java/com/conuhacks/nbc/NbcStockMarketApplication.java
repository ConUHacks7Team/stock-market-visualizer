package com.conuhacks.nbc;

import com.conuhacks.nbc.persistency.ExchangePersistence;
import com.conuhacks.nbc.processor.ResourceProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NbcStockMarketApplication {

	private static ExchangePersistence exchangePersistence;
	private static ResourceProcessor resourceProcessor;

	public static void main(String[] args) {
		SpringApplication.run(NbcStockMarketApplication.class, args);
		exchangePersistence = new ExchangePersistence();

		resourceProcessor = new ResourceProcessor(exchangePersistence);
	}

	public static ExchangePersistence getExchangePersistence() {
		return exchangePersistence;
	}
}
