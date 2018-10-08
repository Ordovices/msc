package com.github.msc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;

//@SpringCloudApplication(包含@SpringBootApplication//@EnableDiscoveryClient//@EnableCircuitBreaker)

//@EnableCircuitBreaker
//@EnableDiscoveryClient
@SpringBootApplication
//@EnableFeignClients
public class MscApplication {

    public static void main(String[] args) {
        SpringApplication.run(MscApplication.class, args);
    }
}
