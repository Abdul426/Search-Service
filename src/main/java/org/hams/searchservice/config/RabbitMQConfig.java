package org.hams.searchservice.config;

import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitMQConfig {

	public static final String SEARCH_SVC_Q = "search-service-queue";
	public static final String PRODUCT_EXCHANGE = "product-exchange";

}
