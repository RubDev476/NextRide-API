package com.rubdev476.next_ride.repositories;

import com.rubdev476.next_ride.models.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarsRepository extends JpaRepository<Cars, Integer> {
    @Query("SELECT DISTINCT c.year FROM Cars c ORDER BY c.year DESC")
    List<Integer> getYearsInUse();

    @Query("SELECT DISTINCT c.doors FROM Cars c ORDER BY c.doors DESC")
    List<Integer> getDoorsInUse();
}
