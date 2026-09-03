package com.rubdev476.next_ride.controllers;

import com.rubdev476.next_ride.models.Brands;
import com.rubdev476.next_ride.repositories.BrandsRepository;
import com.rubdev476.next_ride.services.BrandsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private final BrandsService brandsService;

    public BrandsController(BrandsService brandsService) {
        this.brandsService = brandsService;
    }

    @GetMapping
    public List<Brands> getAllBrands() {
        return brandsService.getAllBrands();
    }

    @GetMapping("/in-use")
    public List<Brands> getBrandsInUse() {
        return brandsService.getBrandsInUse();
    }
}
