package com.me.testcicd;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String greet() {
        return "Hello World";
    }

    public String greetName(String name) {
        return "Hello, " + name + "!";
    }

    public String shout() {
        return greet().toUpperCase();
    }
}
