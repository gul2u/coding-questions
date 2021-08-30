package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void firstNonrepeatedCharacterLinkedHashmap() {
        FirstNonrepeatedCharacter firstNonrepeatedCharacter = new FirstNonrepeatedCharacter();
        String chars = "swiss";
        System.out.println(firstNonrepeatedCharacter.findCharLinkedHashMap(chars));
    }

    @Test
    void firstNonrepeatedCharacterTraverseHashmap() {
        FirstNonrepeatedCharacter firstNonrepeatedCharacter = new FirstNonrepeatedCharacter();
        String chars = "swiss";
        System.out.println(firstNonrepeatedCharacter.findCharTraverseHashMap(chars));
    }

    @Test
    void firstNonrepeatedCharacterSetList() {
        FirstNonrepeatedCharacter firstNonrepeatedCharacter = new FirstNonrepeatedCharacter();
        String chars = "swiss";
        System.out.println(firstNonrepeatedCharacter.findCharSetList(chars));
    }
}
