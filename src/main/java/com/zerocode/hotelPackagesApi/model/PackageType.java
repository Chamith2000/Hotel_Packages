package com.zerocode.hotelPackagesApi.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "packgeTypes")
public class PackageType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;

    @ManyToMany
    @JoinTable(name = "packagetype_facilities")
    private List<Facility> facilities;

    @OneToMany(mappedBy = "packageType")
    private List<Package> packages;
}