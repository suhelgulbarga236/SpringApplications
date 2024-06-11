package com.fincare.order_service.model;


import lombok.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "t_order_line_items")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderLineItems {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
private String skuCode;
private BigDecimal price;
private Integer quantity;


}
