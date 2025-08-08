package com.distrihub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DistriHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistriHubApplication.class, args);
    }

}
