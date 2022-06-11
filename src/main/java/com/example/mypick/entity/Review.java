package com.example.mypick.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter @Getter
public class Review {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REVIEW_NUM")
    private int num;

    private String content;
    private String regDate;
    private float rating;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "PRODUCT_NUM")
//    private Product product;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "USER_ID")
//    private User user;
}
