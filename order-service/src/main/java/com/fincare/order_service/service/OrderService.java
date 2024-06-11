package com.fincare.order_service.service;

import com.fincare.order_service.dto.OrderLineItemsDto;
import com.fincare.order_service.dto.OrderRequest;
import com.fincare.order_service.model.Order;
import com.fincare.order_service.model.OrderLineItems;
import com.fincare.order_service.repo.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class OrderService {

 @Autowired
 OrderRepository orderRepository;
    public void placeOrder(OrderRequest orderRequest){
   Order order = new Order();
   order.setOrderNumber(UUID.randomUUID().toString());
   List<OrderLineItems>orderLineItems =orderRequest.getOrderLineItemsDtoList()
           .stream()
           .map(this::mapToDto)
           .toList();
   order.setOrderLineItemsList(orderLineItems);
   orderRepository.save(order);
    }
    private OrderLineItems mapToDto(OrderLineItemsDto orderLineItemsDto){
       OrderLineItems orderLineItems= new OrderLineItems();
       orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
       orderLineItems.setPrice(orderLineItemsDto.getPrice());
       orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());

        return orderLineItems;
    }
}
