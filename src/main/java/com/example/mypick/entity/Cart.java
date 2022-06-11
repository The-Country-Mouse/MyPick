package com.example.mypick.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter @Getter
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CART_ID")
    private int id;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "PRODUCT_NUM")
//    private Product product;

    @OneToOne()
    @JoinColumn(name = "USER_ID")
    private User user;

    private String name;
    private int price;
    private int quantity;
}
