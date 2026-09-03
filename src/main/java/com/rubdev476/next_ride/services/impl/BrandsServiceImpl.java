package com.rubdev476.next_ride.services.impl;

import com.rubdev476.next_ride.models.Brands;
import com.rubdev476.next_ride.repositories.BrandsRepository;
import com.rubdev476.next_ride.services.BrandsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandsServiceImpl implements BrandsService {
    private final BrandsRepository brandsRepository;

    public BrandsServiceImpl(BrandsRepository brandsRepository) {
        this.brandsRepository = brandsRepository;
    }

    @Override
    public List<Brands> getAllBrands() {
        return brandsRepository.findAll();
    }

    @Override
    public List<Brands> getBrandsInUse() {
        return brandsRepository.findBrandsInUse();
    }
}
