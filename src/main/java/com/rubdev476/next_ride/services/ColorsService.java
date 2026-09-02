package com.rubdev476.next_ride.services;

import com.rubdev476.next_ride.models.Colors;
import com.rubdev476.next_ride.repositories.ColorsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorsService {
    private final ColorsRepository colorsRepository;

    public ColorsService(ColorsRepository colorsRepository) {
        this.colorsRepository = colorsRepository;
    }

    public List<Colors> getAllColors() {
        return colorsRepository.findAll();
    }

    public List<Colors> getColorsInUse() {
        return colorsRepository.findColorsInUse();
    }
}
