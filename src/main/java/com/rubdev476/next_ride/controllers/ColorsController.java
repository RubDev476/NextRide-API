package com.rubdev476.next_ride.controllers;

import com.rubdev476.next_ride.models.Colors;
import com.rubdev476.next_ride.services.ColorsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/colors")
@Tag(
        name = "Colors (Colores)"
)
public class ColorsController {
    private final ColorsService colorsService;

    public ColorsController(ColorsService colorsService) {
        this.colorsService = colorsService;
    }

    @GetMapping
    @Operation(
            summary = "Listado de todos los colores",
            description = "Esta endpoint devuelve una lista de todos los colores de autos registrados en la base de datos junto con su id"
    )
    public List<Colors> getAllColors() {
        return colorsService.getAllColors();
    }

    @GetMapping("/in-use")
    @Operation(
            summary = "Listado de todos los colores en uso",
            description = "Esta endpoint devuelve una lista de todos los colores de autos que estan en uso en la tabla 'Cars'"
    )
    public List<String> getColorsInUse() {
        return colorsService.getColorsInUse();
    }
}
