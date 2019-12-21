package com.example.onlineservice;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TomcatController {
 
    @GetMapping("/hello")
    public Collection<String> sayHello() {
    	System.out.println("Some dummy print");
    	System.out.println("Some dummy print2");
    	System.out.println("Some dummy print3");
        return IntStream.range(0, 10)
          .mapToObj(i -> "Hello number " + i)
          .collect(Collectors.toList());
    }
}
