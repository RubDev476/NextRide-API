package com.rubdev476.next_ride.security;

import io.github.bucket4j.Bucket;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GlobalRateLimitFilter implements Filter {

    // buckets per client (API Key o IP)
    private final Map<String, Bucket> buckets = new ConcurrentHashMap<>();

    private Bucket createNewBucket() {
        // bucket with capacity 30 tokens and with refilling speed 1 token per each 6 second
        return Bucket.builder()
                .addLimit(limit -> limit.capacity(30).refillGreedy(10, Duration.ofMinutes(1)))
                .build();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        // get API Key
        //String clientId = httpRequest.getHeader("x-api-key");

        //get IP
        String clientIp = httpRequest.getRemoteAddr();

        Bucket bucket = buckets.computeIfAbsent(clientIp, k -> createNewBucket());

        if (bucket.tryConsume(1)) {
            filterChain.doFilter(request, response);
        } else {
            httpResponse.setStatus(429);
            httpResponse.setContentType("application/json");
            httpResponse.getWriter().write("{\"error\":true,\"message\":\"Rate limit exceeded\"}");
        }
    }
}