package com.example.bosclient.hystrix.impl;

import com.example.bosclient.hystrix.IndexHystrixClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class IndexHystrixClientImpl implements IndexHystrixClient {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String index( String name) {

        logger.info(">>>>>>>>>>>>>>>>>>>>>>  Hystrix    fei   client  .................... ");

        return name;
    }
}
