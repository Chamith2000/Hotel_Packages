package com.zerocode.hotelPackagesApi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;
    private String email;
    @Lob
    private String profilePhoto;

    @OneToOne
    private LoyaltyPoint loyaltyPoint;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Review> reviews;

    @ManyToMany(mappedBy = "customers", cascade = CascadeType.ALL)
    private List<Notification> notifications;


}