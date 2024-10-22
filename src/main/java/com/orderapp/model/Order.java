package com.orderapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Order {


    private String orderId;
    private String customerName;
    private String product;
    private int quantity;
}
