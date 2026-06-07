package com.me.testcicd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloWorldServiceTest {

    private HelloWorldService service;

    @BeforeEach
    void setUp() {
        service = new HelloWorldService();
    }

    @Test
    void greetReturnsHelloWorld() {
        assertThat(service.greet()).isEqualTo("Hello World");
    }

    @Test
    void greetNameReturnsPersonalizedGreeting() {
        assertThat(service.greetName("Roman")).isEqualTo("Hello, Roman!");
    }

    @Test
    void shoutReturnsUpperCase() {
        assertThat(service.shout()).isEqualTo("HELLO WORLD");
    }
}
