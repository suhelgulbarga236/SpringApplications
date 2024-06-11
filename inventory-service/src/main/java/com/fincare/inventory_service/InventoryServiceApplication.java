package com.fincare.inventory_service;

import com.fincare.inventory_service.model.Inventory;
import com.fincare.inventory_service.repo.InventoryRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class InventoryServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

@Bean
	public CommandLineRunner loadData(InventoryRepo inventoryRepo){
		return  args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("iphone_15");
			inventory.setQuantity(100);

			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("iphone_15");
			inventory1.setQuantity(0);

			inventoryRepo.save(inventory);
			inventoryRepo.save(inventory1);


		};
}
}
