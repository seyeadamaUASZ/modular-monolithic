package com.sid.gl.dto;

import com.sid.gl.entities.Order;
import com.sid.gl.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineDTO {
    private Order order;
    private Product product;
    private int quantityOrdered;
}
