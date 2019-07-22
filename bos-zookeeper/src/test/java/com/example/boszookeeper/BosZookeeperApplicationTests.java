package com.example.boszookeeper;

import jdk.nashorn.internal.runtime.options.Option;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BosZookeeperApplicationTests {

    @Test
    public void contextLoads() {

         Map  map   = Arrays.asList("dog", "cat", "pony", "pony", "pony", "dog")
                .stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("map = " + map);



    }

}

