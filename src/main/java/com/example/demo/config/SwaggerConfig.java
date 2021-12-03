package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2).pathMapping("/").select()
        .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller")).paths(PathSelectors.any()).build()
        .apiInfo(new ApiInfoBuilder().title("grant接口文档").description("描述：交互接口.").version("1.0")
            .contact(new Contact("", "", "")).build());
  }

}