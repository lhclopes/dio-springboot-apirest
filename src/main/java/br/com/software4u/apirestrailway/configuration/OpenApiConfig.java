package br.com.software4u.apirestrailway.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        System.out.println("Configuracao SWAGGER");
        return new OpenAPI()
            .info(new Info()
                .title("API Rest - Railway")
                .version("1.0.0")
                .description("Documentação da API usando springdoc-openapi"));
    }

}