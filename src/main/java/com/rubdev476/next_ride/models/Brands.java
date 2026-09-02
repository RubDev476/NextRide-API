package com.rubdev476.next_ride.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Brands {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer brandId;

    private String name;
}
