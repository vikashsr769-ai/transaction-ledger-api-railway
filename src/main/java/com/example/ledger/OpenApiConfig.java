package com.example.ledger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
    servers = {
        @Server(
            url = "https://transaction-ledger-api-railway-production.up.railway.app",
            description = "Railway Production"
        ),
        @Server(
            url = "http://localhost:8080",
            description = "Local Development"
        )
    }
)
public class OpenApiConfig {
}