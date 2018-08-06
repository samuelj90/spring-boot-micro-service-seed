package com.mycrazycodes.springboot.firstclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FirstClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstClientApplication.class, args);
    }
}
