package com.example.bosclient.hystrix;

import com.example.bosclient.hystrix.impl.IndexHystrixClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "server-zookeeper",fallback = IndexHystrixClientImpl.class)
public interface IndexHystrixClient {

    @RequestMapping(value = "/{name}")
    String index(@PathVariable("name") String name);

}
