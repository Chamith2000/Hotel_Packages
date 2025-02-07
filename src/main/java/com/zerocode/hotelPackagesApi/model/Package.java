package com.zerocode.hotelPackagesApi.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "packages")
public class Package {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private String description;
    private String termsAndCondition;
    private String startDate;
    private LocalDate endDate;
    private int visitorCount;
    private boolean status;

    private GuestCount guestCount;

//    private String name2;
//    private String name3

    @OneToOne(mappedBy = "packages", cascade = CascadeType.ALL)
    private BoostPackage boostPackage;

    @OneToOne(mappedBy = "packages", cascade = CascadeType.ALL)
    private SuperDeal superDeals;

    @ManyToOne
    private Hotel hotel;

    @ManyToOne
    private Menu menu;

    @ManyToOne
    private PackageType packageType;

    @OneToMany(mappedBy = "packages")
    private List<PackagePhoto> packagePhotos;
}