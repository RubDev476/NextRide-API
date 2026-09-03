package com.rubdev476.next_ride.controllers;

import com.rubdev476.next_ride.models.Brands;
import com.rubdev476.next_ride.repositories.BrandsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private final BrandsRepository brandsRepository;

    public BrandsController(BrandsRepository brandsRepository) {
        this.brandsRepository = brandsRepository;
    }

    @GetMapping
    public List<Brands> getAllBrands() {
        return brandsRepository.findAll();
    }

    @GetMapping("/in-use")
    public List<Brands> getBrandsInUse() {
        return brandsRepository.findBrandsInUse();
    }
}
