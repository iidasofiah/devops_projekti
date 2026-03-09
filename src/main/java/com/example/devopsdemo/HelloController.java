package com.example.devopsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController kertoo, että yämä on web-rajapinta
@RestController

public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from DevOps project!";
    }
}
