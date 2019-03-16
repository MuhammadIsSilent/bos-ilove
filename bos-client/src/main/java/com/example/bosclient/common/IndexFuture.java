package com.example.bosclient.common;

import com.example.bosclient.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;


@Component
public class IndexFuture {

    @Autowired
    private IndexService indexService;



    public CompletableFuture getIndex() {
        Map<String,Object> map = new HashMap<>();
        map.put("name","admin");
        List<String> list = new ArrayList<>();
        list.add("fwefwe");
        list.add("asdfwef");
        map.put("data",list);


        CompletableFuture completableFuture =   CompletableFuture.supplyAsync(()->map);

        return completableFuture;
    }


}
