package com.sid.entities;

import com.sid.enums.PaymentType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_payment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long id;
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;
    private String namePayment;
}
