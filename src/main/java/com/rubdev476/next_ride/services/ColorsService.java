package com.rubdev476.next_ride.services;

import com.rubdev476.next_ride.models.Colors;

import java.util.List;

public interface ColorsService {
    List<Colors> getAllColors();

    List<String> getColorsInUse();
}
