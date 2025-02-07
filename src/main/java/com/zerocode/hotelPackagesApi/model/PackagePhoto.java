package com.zerocode.hotelPackagesApi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "package_photos")
public class PackagePhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imageUrl;

    @ManyToOne
    private Package packages;
}
