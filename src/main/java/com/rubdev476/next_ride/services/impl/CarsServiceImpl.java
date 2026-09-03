package com.rubdev476.next_ride.services.impl;

import com.rubdev476.next_ride.models.Cars;
import com.rubdev476.next_ride.repositories.CarsRepository;
import com.rubdev476.next_ride.services.CarsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarsServiceImpl implements CarsService {
    private final CarsRepository carsRepository;

    public CarsServiceImpl(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }

    public List<Integer> getYearsInUse() {
        return this.carsRepository.getYearsInUse();
    }

    public List<Integer> getDoorsInUse() {
        return this.carsRepository.getDoorsInUse();
    }

    public List<Cars> getAllCars(){
        return this.carsRepository.findAll();
    }
}
