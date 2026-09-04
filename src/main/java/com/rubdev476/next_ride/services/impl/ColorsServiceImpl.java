package com.rubdev476.next_ride.services.impl;

import com.rubdev476.next_ride.models.Colors;
import com.rubdev476.next_ride.repositories.ColorsRepository;
import com.rubdev476.next_ride.services.ColorsService;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorsServiceImpl implements ColorsService {
    //@Autowired
    private final ColorsRepository colorsRepository;

    public ColorsServiceImpl(ColorsRepository colorsRepository) {
        this.colorsRepository = colorsRepository;
    }

    @Override
    public List<Colors> getAllColors() {
        return colorsRepository.findAll();
    }

    @Override
    public List<String> getColorsInUse() {
        return colorsRepository.getColorsInUse();
    }
}
