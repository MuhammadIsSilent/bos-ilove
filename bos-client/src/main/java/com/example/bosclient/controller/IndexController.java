package com.example.bosclient.controller;

import com.example.bosclient.common.IndexFuture;
import com.example.bosclient.hystrix.IndexHystrixClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

@RestController
@RequestMapping("/client")
public class IndexController {

   private final Logger logger  = LoggerFactory.getLogger(this.getClass());

   @Autowired
   private IndexHystrixClient indexHystrixClient;

   @Autowired
   private IndexFuture indexFuture;

    @RequestMapping("/server/{name}")
    public String index(@PathVariable("name") String name) {

        logger.info("client");

        return indexHystrixClient.index(name);
    }


    @RequestMapping("/future")
    public CompletableFuture indexFutrue() {


        CompletableFuture  future =  indexFuture.getIndex();



        return future;
    }


}
