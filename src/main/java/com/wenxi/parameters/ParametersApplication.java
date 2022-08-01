package com.wenxi.parameters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ParametersApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParametersApplication.class, args);
    }

}
