package com.sid.gl.dto;

import com.sid.gl.entities.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private String productName;
    private String description;
    private double price;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;
}
