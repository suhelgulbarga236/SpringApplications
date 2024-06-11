package com.fincare.inventory_service.model;


import lombok.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Table(name="t_inventory")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Inventory {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   private String skuCode;
   private Integer quantity;


}
