package com.rubdev476.next_ride.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Fuels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fuelId;

    private String type;
}
