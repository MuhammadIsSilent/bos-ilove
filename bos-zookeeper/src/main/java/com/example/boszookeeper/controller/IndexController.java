package com.example.boszookeeper.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

   private final Logger logger  = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/{name}")
    public String index(@PathVariable("name") String name) {
        logger.info("zookeeper");
        return  " ---> "+name;
    }

}
