package com.rubdev476.next_ride.controllers;

import com.rubdev476.next_ride.services.CarsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarsController {
    private final CarsService carsService;

    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping("/years")
    public List<Integer> getYearsInUse() {
        return carsService.getYearsInUse();
    }
}
