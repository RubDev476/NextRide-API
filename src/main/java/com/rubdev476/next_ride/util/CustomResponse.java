package com.rubdev476.next_ride.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rubdev476.next_ride.dtos.CustomResponseDTO;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class CustomResponse {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> void writeResponse(HttpServletResponse response,
                                          boolean error,
                                          String message,
                                          String path,
                                          int status,
                                     T data) throws IOException {
        CustomResponseDTO<T> customResponse = new CustomResponseDTO<>(error, message, path, status, data);

        response.setStatus(status);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        response.getWriter().write(mapper.writeValueAsString(customResponse));
    }
}
