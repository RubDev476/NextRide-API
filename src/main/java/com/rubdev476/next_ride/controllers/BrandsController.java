package com.rubdev476.next_ride.controllers;

import com.rubdev476.next_ride.models.Brands;
import com.rubdev476.next_ride.services.BrandsService;
import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@SecurityRequirement(name = "ApiKeyAuth")
@RestController
@RequestMapping("/api/brands")
@Tag(
        name = "Brands (Marcas)"
)
public class BrandsController {
    private final BrandsService brandsService;

    public BrandsController(BrandsService brandsService) {
        this.brandsService = brandsService;
    }

    @GetMapping
    @Operation(
            summary = "Listado de todas las marcas de auto",
            description = "Esta endpoint devuelve una lista de todas las marcas de autos registradas en la base de datos junto con su id"
    )
    public List<Brands> getAllBrands() {
        return brandsService.getAllBrands();
    }

    @GetMapping("/in-use")
    @Operation(
            summary = "Listado de todas las marcas de auto en uso",
            description = "Esta endpoint devuelve una lista de todas las marcas de autos que estan en uso en la tabla 'Cars'"
    )
    public List<String> getBrandsInUse() {
        return brandsService.getBrandsInUse();
    }
}
