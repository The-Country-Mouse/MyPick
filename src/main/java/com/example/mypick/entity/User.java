package com.example.mypick.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter @Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private int Id;

    private String password;
    private String name;
    private String email;
    private String zipcode;
    private String address;
    private String phone;
    private boolean withdrawal;

    @OneToMany(mappedBy = "user")
    private List<Order> orders = new ArrayList<>();
//
//    @OneToMany(mappedBy = "user")
//    private List<DetailOrder> detailOrders = new ArrayList<>();
//
    @OneToOne(mappedBy = "user")
    private Cart cart;

//    @OneToMany(mappedBy = "user")
//    private List<Delivery> deliveries = new ArrayList<>();

//    @OneToMany(mappedBy = "user")
//    private List<Review> reviews = new ArrayList<>();
}
