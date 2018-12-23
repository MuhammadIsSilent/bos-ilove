package com.example.bosclient.controller;

import com.example.bosclient.hystrix.IndexHystrixClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

   private final Logger logger  = LoggerFactory.getLogger(this.getClass());

   @Autowired
   private IndexHystrixClient indexHystrixClient;

    @RequestMapping("/{name}")
    @ResponseBody
    public String index(@PathVariable("name") String name) {

        logger.info("client");

        return indexHystrixClient.index(name);
    }

}
