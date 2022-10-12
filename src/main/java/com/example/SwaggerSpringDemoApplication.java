package com.example;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.servers.Servers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        servers = {
                @Server(
                        url = "http://localhost:8080",
                        description = "DEV"
                ),
        @Server(
                url = "https://production.com",
                description = "PROD"

        )
        },
        info = @Info(
                title = "Demo Api Document",
                version = "V1.0.0",
                description = "My API",
                contact = @Contact(
                        url = "http://demo.com",
                        name = "Winnie",
                        email = "Winnie@server.com")))
public class SwaggerSpringDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SwaggerSpringDemoApplication.class, args);
    }
}
