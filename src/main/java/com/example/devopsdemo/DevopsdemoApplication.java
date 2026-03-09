package com.example.devopsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication käynnistää Spring Bootin
@SpringBootApplication
public class DevopsdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevopsdemoApplication.class, args);
        // käynnistää web-palvelimen
    }

}