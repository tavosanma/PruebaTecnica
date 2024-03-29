package com.example.demo.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

// Clase que sirve para mostrar los servicios rest creados de una forma amigable y agradable
@EnableSwagger2
@Configuration
public class SwaggerConfig {

	@Bean
	public Docket ProductApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo"))
				.paths(regex("/api.*"))
				.build();
	}
}
