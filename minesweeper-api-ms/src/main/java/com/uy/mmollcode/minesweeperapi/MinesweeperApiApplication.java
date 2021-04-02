package com.uy.mmollcode.minesweeperapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import lombok.extern.slf4j.Slf4j;


@Configuration
@SpringBootApplication
@EnableSwagger2
@Slf4j
public class MinesweeperApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinesweeperApiApplication.class, args);
    }

    @Bean
    public Docket swaggerDocumentation() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/api/*"))
                .apis(RequestHandlerSelectors.basePackage("com.uy.mmollcode.minesweeperapi"))
                .build();
    }

}
