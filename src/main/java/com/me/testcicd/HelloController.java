package com.me.testcicd;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final HelloWorldService helloWorldService;

    @GetMapping("/hello")
    public String hello() {
        return helloWorldService.greet();
    }

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name) {
        return helloWorldService.greetName(name);
    }

    @GetMapping("/hello/shout")
    public String shout() {
        return helloWorldService.shout();
    }
}
