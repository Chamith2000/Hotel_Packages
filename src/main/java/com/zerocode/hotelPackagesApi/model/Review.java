package com.zerocode.hotelPackagesApi.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int rating;
    private String comment;
    private LocalDate postedDate;
    private LocalTime postedTime;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Hotel hotel;
}