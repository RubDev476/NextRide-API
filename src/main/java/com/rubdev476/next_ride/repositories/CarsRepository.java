package com.rubdev476.next_ride.repositories;

import com.rubdev476.next_ride.dtos.CarDTO;
import com.rubdev476.next_ride.models.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarsRepository extends JpaRepository<Cars, Integer> {
    @Query("SELECT DISTINCT c.year FROM Cars c ORDER BY c.year DESC")
    List<Integer> getYearsInUse();

    @Query("SELECT DISTINCT c.doors FROM Cars c ORDER BY c.doors DESC")
    List<Integer> getDoorsInUse();

    @Query("SELECT new com.rubdev476.next_ride.dtos.CarDTO(c.carId, c.year, c.doors, c.price, c.imgUrl, c.model, t.type, co.name, b.name) " +
            "FROM Cars c JOIN c.transmissions t JOIN c.colors co JOIN c.brands b")
    List<CarDTO> getAllCars();

}
