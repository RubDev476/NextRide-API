package com.rubdev476.next_ride.services;

import com.rubdev476.next_ride.models.Cars;

import java.util.List;

public interface CarsService {
    List<Integer> getYearsInUse();

    List<Integer> getDoorsInUse();

    List<Cars> getAllCars();
}
