package com.rubdev476.next_ride.security;

import com.rubdev476.next_ride.util.CustomResponse;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Collections;

@Component
@Order(1)
public class ApiKeyFilter extends OncePerRequestFilter {
    @Value("${api.key}")
    private String apiKey;

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain
    ) throws ServletException, IOException {
        String header = request.getHeader("x-api-key");
        String path = request.getRequestURI();

        if (path.startsWith("/api") && (header == null || !header.equals(apiKey))) {
            CustomResponse.writeResponse(
                    response,
                    true,
                    "Invalid API Key",
                    path,
                    HttpServletResponse.SC_UNAUTHORIZED,
                    Collections.emptyList()
            );

            return;
        }

        filterChain.doFilter(request, response);
    }
}
