package com.store.store.controller;

import com.store.store.model.Age;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeController {


    @GetMapping("/ages")
    public Age[] getAges(){
        Age[] age = new Age[20];

        for(int i = 0; i < age.length; i++){
            age[i] = new Age();
            age[i].setAge(i*2);
        }
        return age;
    }

}
