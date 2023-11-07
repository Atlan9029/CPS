package com.cp2.digitalapp.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.List;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI geraDocumentacao() {
        Server devServer = new Server();
        devServer.setUrl("http://localhost:8080");
        devServer.description("Url de desenvolvimento local");
        Contact contact = new Contact();
        contact.setEmail("matheus.santos@gmail.com");
        contact.setName("Matheus");
        Info  info = new Info().title("CP2__Digital Business")
                .version("0.1")
                .contact(contact)
                .description("CP2 Digital Business");
        return new OpenAPI().info(info).servers(List.of(devServer));
    }
}
