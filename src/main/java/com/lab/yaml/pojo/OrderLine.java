package com.lab.yaml.pojo;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class OrderLine {
    private String item;
    private int quantity;
    private BigDecimal unitPrice;

}