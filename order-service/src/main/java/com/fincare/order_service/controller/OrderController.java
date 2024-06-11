package com.fincare.order_service.controller;

import com.fincare.order_service.dto.OrderRequest;
import com.fincare.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController {
@Autowired
OrderService orderService;
@PostMapping
@ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
    orderService.placeOrder(orderRequest);
        return "Order Placed Successfully";
    }
}
