package com.fincare.product_service;

import com.fincare.dto.ProductRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigDecimal;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@SpringBootTest
//@Testcontainers
//@AutoConfigureMockMvc
//@ExtendWith(SpringExtension.class)

@SpringBootTest
class ProductServiceApplicationTests {


	@Test
	void contextLoads() {


}
//
//	@Container
//	static MySQLContainer<?> mySQLContainer = new MySQLContainer<>("mysql:8.0.26")
//			.withDatabaseName("products_db")
//			.withUsername("test")
//			.withPassword("test");
//
//	@Autowired
//	private MockMvc mockMvc;

//	@Autowired
//	private ObjectMapper objectMapper;
//
//	@DynamicPropertySource
//	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry){
//		dynamicPropertyRegistry.add("spring.datasource.url", mySQLContainer::getJdbcUrl);
//		dynamicPropertyRegistry.add("spring.datasource.username", mySQLContainer::getUsername);
//		dynamicPropertyRegistry.add("spring.datasource.password", mySQLContainer::getPassword);
//	}

//	@Test
//	void shouldCreateProduct() throws Exception {
//		ProductRequest productRequest = getProductRequest();
//		String productRequestString = objectMapper.writeValueAsString(productRequest);
//
//		mockMvc.perform(MockMvcRequestBuilders.post("/api/product")
//						.contentType(MediaType.APPLICATION_JSON)
//						.content(productRequestString))
//				.andExpect(status().isCreated());
//	}

//	private ProductRequest getProductRequest() {
//		return ProductRequest.builder()
//				.name("iphone15")
//				.description("iphone 15 pro")
//				.price(BigDecimal.valueOf(1200))
//				.build();
//	}
}
