package com.fincare.order_service.model;


import lombok.*;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "t_order")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {
        @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
private Long id;
private String orderNumber;
@OneToMany(cascade = CascadeType.ALL)
private List<OrderLineItems>orderLineItemsList;


}
