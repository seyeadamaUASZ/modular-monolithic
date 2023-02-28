package com.sid.gl.mapper;


import com.sid.gl.dto.OrderLineDTO;
import com.sid.gl.dto.PaymentDTO;
import com.sid.gl.dto.ProductDTO;
import com.sid.gl.entities.OrderLine;
import com.sid.gl.entities.Payment;
import com.sid.gl.entities.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class Mapper {
    public Product mapProduct(ProductDTO productDTO){
        Product product = new Product();
        BeanUtils.copyProperties(productDTO,product);
        return product;
    }

    public ProductDTO mapProductDTO(Product product){
        ProductDTO productDTO = new ProductDTO();
        BeanUtils.copyProperties(product,productDTO);
        return productDTO;
    }

    public Payment mapPayment(PaymentDTO paymentDTO){
        Payment payment = new Payment();
        BeanUtils.copyProperties(paymentDTO,payment);
        return payment;
    }

    public PaymentDTO mapPaymentDTO(Payment payment){
        PaymentDTO paymentDTO = new PaymentDTO();
        BeanUtils.copyProperties(payment,paymentDTO);
        return paymentDTO;
    }

    public  OrderLineDTO mapOrderLineDTO(OrderLine orderLine){
        OrderLineDTO orderLineDTO = new OrderLineDTO();
        BeanUtils.copyProperties(orderLine,orderLineDTO);
        return orderLineDTO;
    }

    public OrderLine mapOrderLine(OrderLineDTO orderLineDTO){
        OrderLine orderLine=new OrderLine();
        BeanUtils.copyProperties(orderLineDTO,orderLine);
        return orderLine;
    }
}
