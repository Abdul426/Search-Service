package org.hams.searchservice.sender;

import org.hams.productcatalog.dto.ProductDTO;
import org.hams.searchservice.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ProductMessageComsumer {

	@RabbitListener(queues = RabbitMQConfig.SEARCH_SVC_Q)
	public void processOrder(ProductDTO product) {
		System.out.println("\n#### Product Received: " + product);
	}
}
