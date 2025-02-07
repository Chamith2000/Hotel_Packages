package com.zerocode.hotelPackagesApi.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "hotels")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    @Lob
    private String logo;
    @Lob
    private String photo;
    private String boostPackageLimit;
    private String superDealLimit;

    private Address address;

   @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
   private List<HotelPhoto> hotelPhotos;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<Package> packages;

    @ManyToMany(mappedBy = "hotelList")
    private List<Notification> notificationList;

    @OneToOne
    private Menu menu;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<Review> reviews;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<BoostPackage> boostPackages;

    @OneToMany(mappedBy = "hotel")
    private List<SuperDeal> superDeals;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<ContactNumber> contactNumbers;
}