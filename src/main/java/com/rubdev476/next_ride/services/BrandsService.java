package com.rubdev476.next_ride.services;

import com.rubdev476.next_ride.models.Brands;

import java.util.List;

public interface BrandsService {
    List<Brands> getAllBrands();

    List<Brands> getBrandsInUse();
}
