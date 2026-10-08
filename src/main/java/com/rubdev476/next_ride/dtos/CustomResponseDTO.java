package com.rubdev476.next_ride.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomResponseDTO<T> {
    private boolean error;
    private String message;
    private String path;
    private int status;
    private T data;
}
