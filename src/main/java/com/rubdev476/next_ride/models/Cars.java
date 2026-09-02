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

    private Integer year;
    private Integer doors;
    private Integer mileage;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    private String imgUrl;

    @Column(name = "model", length = 50)
    private String model;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transmission_id", referencedColumnName = "transmission_id")
    private Transmissions transmissions;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "finish_id", referencedColumnName = "finish_id")
    private ColorFinishes colorFinishes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "body_id", referencedColumnName = "body_id")
    private BodyTypes bodyTypes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fuel_id", referencedColumnName = "fuel_id")
    private Fuels fuels;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "color_id", referencedColumnName = "color_id")
    private Colors color;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id", referencedColumnName = "brand_id")
    private Brands brands;
}
