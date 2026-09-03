package com.rubdev476.next_ride.controllers;

import com.rubdev476.next_ride.models.Transmissions;
import com.rubdev476.next_ride.services.TransmissionsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/transmissions")
public class TransmissionsController {
    private final TransmissionsService transmissionsService;

    public TransmissionsController(TransmissionsService transmissionsService) {
        this.transmissionsService = transmissionsService;
    }

    @GetMapping()
    public List<Transmissions>  getAllTransmissions() {
        return transmissionsService.getAllTransmissions();
    }

    @GetMapping("/in-use")
    public List<Transmissions> getTransmissionsInUse() {
        return transmissionsService.getTransmissionsInUse();
    }
}
