package com.rubdev476.next_ride.services;

import com.rubdev476.next_ride.dtos.CarDTO;

import java.util.List;

public interface CarsService {
    List<Integer> getYearsInUse();

    List<Integer> getDoorsInUse();

    List<CarDTO> getAllCars();
}
