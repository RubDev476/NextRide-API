package com.rubdev476.next_ride.repositories;

import com.rubdev476.next_ride.models.Colors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ColorsRepository extends JpaRepository<Colors, Integer> {
    @Query("SELECT DISTINCT c.name FROM Cars cars JOIN cars.colors c")
    List<String> getColorsInUse();
}
