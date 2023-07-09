package com.store.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class TestController {


    private static final String[] PREFIXES = { "Alpha", "Beta", "Gamma", "Delta", "Epsilon" };
    private static final String[] SUFFIXES = { "Prime", "Plus", "Max", "Pro", "Ultra" };

    public static String generateRandomName() {
        Random random = new Random();
        String prefix = PREFIXES[random.nextInt(PREFIXES.length)];
        String suffix = SUFFIXES[random.nextInt(SUFFIXES.length)];
        int number = random.nextInt(1000);

        return prefix + "-" + suffix + "-" + number;
    }

    @GetMapping("/")
    public String getHome(){
        return "Home";
    }





    @GetMapping("/person")
    public int[] getPerson() {
        int[] age = {20,34,55,56};
        return age;
    }

}


class Person{
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
