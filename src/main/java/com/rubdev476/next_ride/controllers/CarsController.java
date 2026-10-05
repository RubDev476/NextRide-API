package com.rubdev476.next_ride.controllers;

import com.rubdev476.next_ride.dtos.CarDTO;
import com.rubdev476.next_ride.services.CarsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@Tag(
        name = "Cars (Carros)"
)
public class CarsController {
    private final CarsService carsService;

    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping()
    @Operation(
            summary = "Listado de todos los carros y sus características"
    )
    public List<CarDTO> getCars() {
        return carsService.getAllCars();
    }

    @GetMapping("/years")
    @Operation(
            summary = "Listado de años de los carros (datos unicos)"
    )
    public List<Integer> getYearsInUse() {
        return carsService.getYearsInUse();
    }

    @GetMapping("/doors")
    @Operation(
            summary = "Listado de número de puertas de los carros (datos unicos)"
    )
    public List<Integer> getDoorsInUse() {
        return carsService.getDoorsInUse();
    }
}
