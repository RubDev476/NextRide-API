package com.rubdev476.next_ride.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Transmissions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transmissionId;

    private String type;
}
