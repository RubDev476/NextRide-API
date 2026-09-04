package com.rubdev476.next_ride.services.impl;

import com.rubdev476.next_ride.models.Transmissions;
import com.rubdev476.next_ride.repositories.TransmissionsRepository;
import com.rubdev476.next_ride.services.TransmissionsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransmissionsServiceImpl implements TransmissionsService {
    private final TransmissionsRepository transmissionsRepository;

    public TransmissionsServiceImpl(TransmissionsRepository transmissionsRepository) {
        this.transmissionsRepository = transmissionsRepository;
    }

    public List<Transmissions> getAllTransmissions() {
        return transmissionsRepository.findAll();
    }

    public List<String> getTransmissionsInUse() {
        return transmissionsRepository.getTransmissionsInUse();
    }
}
