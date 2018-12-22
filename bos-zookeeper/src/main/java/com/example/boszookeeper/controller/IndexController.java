package com.example.boszookeeper.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

//    private final Logger logger  = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String index() {
//        logger.info("zookeeper");
        return "zookeeper";
    }

}
