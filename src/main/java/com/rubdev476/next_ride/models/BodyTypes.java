package com.rubdev476.next_ride.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
//@Table(name = "body_types")
public class BodyTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "body_id")
    private Integer bodyId;

    private String type;
}
