package com.portfolio.gateway.routes;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("notifications", r -> r.path("/notifications/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://NOTIFICATIONS"))

                .route("greeting", r -> r.path("/greeting/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://GREETING"))
                .build();
    }
}
