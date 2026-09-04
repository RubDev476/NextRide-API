package com.rubdev476.next_ride.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO {
    private Integer carId;
    private Integer year;
    private Integer doors;
    private BigDecimal price;
    private String imgUrl;
    private String model;
    private String transmission;
    private String color;
    private String brand;
}
