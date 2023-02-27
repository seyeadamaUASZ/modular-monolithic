package com.sid.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_product")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "product_name",length = 50)
    private String productName;
    private String description;
    private double price;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;
}
