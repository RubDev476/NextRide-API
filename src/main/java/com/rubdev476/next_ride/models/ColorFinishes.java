package com.rubdev476.next_ride.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ColorFinishes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer finishId;

    private String description;
}
