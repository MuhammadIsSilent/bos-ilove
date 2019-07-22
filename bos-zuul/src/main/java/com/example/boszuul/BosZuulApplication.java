package com.example.boszuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import java.util.concurrent.CompletableFuture;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class BosZuulApplication {

    public static void main(String[] args) {

        SpringApplication.run(BosZuulApplication.class, args);
    }

}
