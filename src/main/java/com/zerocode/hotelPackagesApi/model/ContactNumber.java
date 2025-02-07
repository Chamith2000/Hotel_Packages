package com.zerocode.hotelPackagesApi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "contact_numbers")
public class ContactNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    @ManyToOne
    private Hotel hotel;
}
