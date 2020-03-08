package com.sandbox.avoidbrittle.test;

import com.sandbox.avoidbrittle.core.ObjectRepository;
import com.sandbox.avoidbrittle.service.SandboxService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SandboxServiceTest {

    private SandboxService service;

    public SandboxServiceTest() {
        //this.repository = () -> "Hello World!";
        ObjectRepository<String, Long> repository = new ObjectRepository<String, Long>() {
            @Override
            public String retrieveHello() {
                return "Hello World";
            }
        };
        this.service = new SandboxService(repository);
    }

    @Test
    void retrieveHelloTest() {
        String expected = "Hello World";
        String actual = service.retrieveHello();

        Assertions.assertEquals(expected, actual);

    }

}
