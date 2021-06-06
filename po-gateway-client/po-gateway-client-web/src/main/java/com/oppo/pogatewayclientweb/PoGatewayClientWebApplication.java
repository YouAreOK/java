package com.oppo.pogatewayclientweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.oppo.*"})
//@MapperScan({"com.oppo.pogatewayclientservice.mapper"})
public class PoGatewayClientWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoGatewayClientWebApplication.class, args);
    }

}
