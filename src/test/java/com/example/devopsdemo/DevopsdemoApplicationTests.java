package com.example.devopsdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@ActiveProfiles("test") //pakottaa testit käyttämään application-test.yml tiedostoa
@SpringBootTest
class DevopsdemoApplicationTests {

    @Test
    void contextLoads() {
    }

}