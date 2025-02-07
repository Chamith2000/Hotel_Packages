package com.zerocode.hotelPackagesApi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "hotel_photos")
public class HotelPhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String imageUrl;

    @ManyToOne
    private Hotel hotel;
}