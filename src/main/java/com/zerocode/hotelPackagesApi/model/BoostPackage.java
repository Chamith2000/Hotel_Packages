package com.zerocode.hotelPackagesApi.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "boost_packages")
public class BoostPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate boostedDate;

    @OneToOne
    @JoinColumn(name = "package_id")
    private Package packages;

    @ManyToOne
    private Hotel hotel;
}