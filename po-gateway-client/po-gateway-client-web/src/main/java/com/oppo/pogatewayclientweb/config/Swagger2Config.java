package com.oppo.pogatewayclientweb.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Andy on 2021/6/6 12:30
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    // 声明api 文档的属性 构建器
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("marrycode")
                .description("xxgc_hui")
                .termsOfServiceUrl("http://www.baidu.com")
                .contact("000")
                .version("1.0.0")
                .build();
    }

    // 核心配置信息
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.oppo.pogatewayclientweb.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}
