package com.example.mypick.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter @Getter
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_NUM")
    private String num;

    private int totalPrice;
    private String orderDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_NUM")
    private Product product;

    @OneToMany(mappedBy = "order")
    private List<DetailOrder> detailOrders = new ArrayList<>();

    @OneToOne(mappedBy = "order")
    private List<Delivery> deliveries = new ArrayList<>();
}
