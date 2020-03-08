package com.sandbox.avoidbrittle.test;

import com.sandbox.avoidbrittle.core.ObjectRepository;
import com.sandbox.avoidbrittle.service.SandboxService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class MockSandboxServiceTest {

    @Mock
    ObjectRepository<String, Long> repository;

    @InjectMocks
    SandboxService service;

    @BeforeAll
    static void displayStartingMessage() {
        System.out.println("--------------------TESTING FOR SANDBOXSERVICE IN PROGRESS--------------------");
    }

    public MockSandboxServiceTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void retrieveHelloTest() {
        String expected = "Hello World";
        Mockito.when(repository.retrieveHello()).thenReturn(expected);
        String actual = service.retrieveHello();

        Assertions.assertEquals(expected, actual);

    }

}
