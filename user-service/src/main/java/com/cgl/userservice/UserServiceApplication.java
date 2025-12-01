package com.cgl.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
//@EnableMongoAuditing
@ComponentScan(basePackages = {
        "com.cgl.userservice",
        "com.example.share"
})
@EnableDiscoveryClient
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

}
