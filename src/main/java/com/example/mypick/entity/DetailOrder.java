package com.example.mypick.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter @Getter
public class DetailOrder {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DETAIL_NUM")
    private int num;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_NUM")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_NUM")
    private Product product;

    @Column(name = "PRODUCT_NAME")
    private String name;

    private int quantity;
    private int price;

}
