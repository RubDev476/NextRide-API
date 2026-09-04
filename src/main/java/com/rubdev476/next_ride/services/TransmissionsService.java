package com.rubdev476.next_ride.services;

import com.rubdev476.next_ride.models.Transmissions;

import java.util.List;

public interface TransmissionsService {
    List<Transmissions> getAllTransmissions();

    List<String> getTransmissionsInUse();
}
