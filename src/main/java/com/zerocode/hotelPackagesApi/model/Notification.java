package com.zerocode.hotelPackagesApi.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Data
@Table(name = "notifications")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    private LocalDate sentDate;
    private LocalTime sentTime;
    private boolean status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    @ManyToMany
    @JoinTable(name = "hotel_notifications",
            joinColumns = @JoinColumn(name = "notification_id"),
            inverseJoinColumns = @JoinColumn(name = "hotel_id"))
    private List<Hotel> hotelList;

    @ManyToMany
    @JoinTable(name = "customers_notifications",
            joinColumns = @JoinColumn(name = "notification_id"),
            inverseJoinColumns = @JoinColumn(name = "customer_id"))
    private List<Customer> customers;
}