package com.zerocode.hotelPackagesApi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "menus")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double breakfastPrice;
    private double lunchPrice;
    private double dinnerPrice;

    @OneToOne(mappedBy = "menu", cascade = CascadeType.ALL)
    private Hotel hotel;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private List<Package> packages;
}