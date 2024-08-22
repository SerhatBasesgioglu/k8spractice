package com.aydakar.k8spractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String sayGreeting() {
        return "Hello world";
    }

}
