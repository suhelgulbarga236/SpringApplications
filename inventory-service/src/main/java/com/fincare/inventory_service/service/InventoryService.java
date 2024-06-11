package com.fincare.inventory_service.service;

import com.fincare.inventory_service.repo.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class InventoryService {
    @Autowired
    InventoryRepo inventoryRepo;
    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode){
      return inventoryRepo.findBySkuCode(skuCode).isPresent();


    }
}
