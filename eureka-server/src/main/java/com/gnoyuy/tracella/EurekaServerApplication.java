package com.gnoyuy.tracella;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * starter.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    /**
     * starter.
     * 
     * @param args args
     */
    public static void main(final String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
