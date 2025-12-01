package com.example.mediaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
//@EnableMongoAuditing
@ComponentScan(basePackages = {
        "com.example.mediaservice",
        "com.example.share"
})
@EnableDiscoveryClient
public class MediaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MediaServiceApplication.class, args);
    }

}
