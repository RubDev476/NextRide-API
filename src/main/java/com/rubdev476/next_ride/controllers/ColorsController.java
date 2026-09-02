package com.rubdev476.next_ride.controllers;

import com.rubdev476.next_ride.models.Colors;
import com.rubdev476.next_ride.services.ColorsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/colors")
public class ColorsController {
    private final ColorsService colorsService;

    public ColorsController(ColorsService colorsService) {
        this.colorsService = colorsService;
    }

    @GetMapping
    public List<Colors> getAllColors() {
        return colorsService.getAllColors();
    }

    @GetMapping("/in-use2")
    public List<Colors> getColorsInUse() {
        return colorsService.getColorsInUse();
    }
}
