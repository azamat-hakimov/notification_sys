package com.portfolio.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain springSecurityWebFilterChain(ServerHttpSecurity http){
        http
            .authorizeExchange(exchanges -> exchanges
                .pathMatchers("/notifications/**").authenticated() // don't allow to use those domains
                .anyExchange().authenticated()  // Secure everything else
            )  
            .oauth2ResourceServer(oauth2 -> oauth2.jwt(jwtSpec -> {}));
        return http.build();
    }
}
