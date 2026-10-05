package com.rubdev476.next_ride.controllers;

import com.rubdev476.next_ride.models.Transmissions;
import com.rubdev476.next_ride.services.TransmissionsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/transmissions")
@Tag(
        name = "Transmissions (Transmision)"
)
public class TransmissionsController {
    private final TransmissionsService transmissionsService;

    public TransmissionsController(TransmissionsService transmissionsService) {
        this.transmissionsService = transmissionsService;
    }

    @GetMapping()
    @Operation(
            summary = "Listado de todas las transmisiones de auto"
    )
    public List<Transmissions>  getAllTransmissions() {
        return transmissionsService.getAllTransmissions();
    }

    @GetMapping("/in-use")
    @Operation(
            summary = "Listado de todas las transmisiones de auto en uso",
            description = "Esta endpoint devuelve una lista de todas las transmisiones de autos que estan en uso en la tabla 'Cars'"
    )
    public List<String> getTransmissionsInUse() {
        return transmissionsService.getTransmissionsInUse();
    }
}
