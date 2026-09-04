package com.rubdev476.next_ride.repositories;

import com.rubdev476.next_ride.models.Brands;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BrandsRepository extends JpaRepository<Brands, Integer> {
    @Query("SELECT DISTINCT b.name FROM Cars cars JOIN cars.brands b")
    List<String> getBrandsInUse();
}
