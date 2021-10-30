package com.gnoyuy.tracella;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * starter.
 */
@SpringBootApplication
@EnableEurekaClient
public class AppApplication {
    /**
     * entry.
     * 
     * @param args args
     */
    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }
}
