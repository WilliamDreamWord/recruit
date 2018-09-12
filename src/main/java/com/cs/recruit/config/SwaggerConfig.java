package com.cs.recruit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: William
 * @Description:
 * @Date: 2018/9/10 14:42
 **/
@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig {

    @Bean
    public Docket buildDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInf())
                .host("https://localhost:8080")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cs.recruit.web"))  //web路径
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo buildApiInf() {
        return new ApiInfoBuilder()
                .title("RestAPI Docs")
                .termsOfServiceUrl("http://www.github.com/kongchen/swagger-maven-plugin")
                .build();
    }
}
