package com.rubdev476.next_ride.models;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Data
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer carId;

    @Column(name = "year", columnDefinition = "YEAR")
    private Integer year;

    private Integer doors;
    private Integer mileage;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    private String imgUrl;

    @Column(name = "model", length = 50)
    private String model;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transmission_id", referencedColumnName = "transmissionId")
    private Transmissions transmissions;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "finish_id", referencedColumnName = "finishId")
    private ColorFinishes colorFinishes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "body_id", referencedColumnName = "bodyId")
    private BodyTypes bodyTypes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fuel_id", referencedColumnName = "fuelId")
    private Fuels fuels;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "color_id", referencedColumnName = "colorId")
    private Colors colors;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id", referencedColumnName = "brandId")
    private Brands brands;
}
