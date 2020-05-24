package org.hams.searchservice;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//User more elegant way to test
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SearchServiceApplication.class)
public class ProductManagerSenderTest {

//	@Autowired
//	ProductMessageSender productMessageSender;
//
//	@Test
//	public void sendM() {
//		ProductDTO product = new ProductDTO(121L, "P2", "C1", "D1", 22D);
//		productMessageSender.sendProduct(product);
//	}
}
