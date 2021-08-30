package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void firstNonrepeatedCharacter() {
        FirstNonrepeatedCharacter firstNonrepeatedCharacter = new FirstNonrepeatedCharacter();
        String chars = "swiss";
        firstNonrepeatedCharacter.findChar(chars);
    }
}
