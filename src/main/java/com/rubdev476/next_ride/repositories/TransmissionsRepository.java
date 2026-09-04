package com.rubdev476.next_ride.repositories;

import com.rubdev476.next_ride.models.Transmissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransmissionsRepository extends JpaRepository<Transmissions, Integer> {
    @Query("SELECT DISTINCT t.type FROM Cars cars JOIN cars.transmissions t")
    List<String> getTransmissionsInUse();
}
