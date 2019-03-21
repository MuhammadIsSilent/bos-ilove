package com.example.boshystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class BosHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(BosHystrixApplication.class, args);
    }

}
