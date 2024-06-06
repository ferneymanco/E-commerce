package com.ferneymanco.checkout_service.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/checkout/{id}")
                        .hasAnyAuthority("SCOPE_buyer")
                        .anyRequest()
                        .authenticated()
                )
                .oauth2ResourceServer( oauth2 -> oauth2
                        .jwt( jwt -> jwt
                                .jwkSetUri("http://localhost:8000/realms/test_realm/protocol/openid-connect/certs")

                        )

                );
        return http.build();
    }
}
