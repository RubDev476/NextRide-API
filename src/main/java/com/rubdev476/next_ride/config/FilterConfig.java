package com.rubdev476.next_ride.config;

import com.rubdev476.next_ride.security.GlobalRateLimitFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean<GlobalRateLimitFilter> globalRateLimitFilter() {
        FilterRegistrationBean<GlobalRateLimitFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new GlobalRateLimitFilter());
        registrationBean.addUrlPatterns("/api/*");
        registrationBean.setOrder(2);

        return registrationBean;
    }
}
