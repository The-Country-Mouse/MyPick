package com.example.mypick.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Review {
    @Id
    @GeneratedValue
    @Column(name="review_id")
    private Long id;

    private String rating;

    private LocalDateTime createDate;

}
