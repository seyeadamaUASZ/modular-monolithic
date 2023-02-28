package com.sid.gl.entities;

import com.sid.gl.enums.OrderStatus;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "tb_order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateOrder=new Date();
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
}
