package com.hxm.springeurakeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringEurakeServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEurakeServerApplication.class, args);
    }

}
