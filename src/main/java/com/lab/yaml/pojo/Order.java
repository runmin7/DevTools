package com.lab.yaml.pojo;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@ToString
public class Order {
    private String orderNo;
    private LocalDate date;
    private String customerName;
    private List<OrderLine> orderLines;

}