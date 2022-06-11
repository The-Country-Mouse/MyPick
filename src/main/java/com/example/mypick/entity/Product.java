package com.example.mypick.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter @Getter
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_NUM")
    private int num;

    @Column(name = "PRODUCT_NAME")
    private String name;
    private String description;
    private int price;
    private int stock;
    private String image;

//    @OneToMany(mappedBy = "product")
//    private List<Order> orders = new ArrayList<>();
//
//    @OneToMany(mappedBy = "product")
//    private List<DetailOrder> detailOrders = new ArrayList<>();
//
//    @OneToMany(mappedBy = "product")
//    private List<Cart> carts = new ArrayList<>();

//    @OneToMany(mappedBy = "product")
//    private List<Review> reviews = new ArrayList<>();

}
