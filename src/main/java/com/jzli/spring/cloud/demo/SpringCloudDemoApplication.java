package com.jzli.spring.cloud.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudDemoApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudDemoApplication.class).web(true).run(args);
    }

}
