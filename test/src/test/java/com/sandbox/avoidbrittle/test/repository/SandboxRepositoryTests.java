package com.sandbox.avoidbrittle.test.repository;

import com.sandbox.avoidbrittle.core.ObjectRepository;
import com.sandbox.avoidbrittle.test.Tests;
import com.sandbox.avoidbrittle.test.BeforeStartingTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class SandboxRepositoryTests extends Tests {

    @Mock
    ObjectRepository<String, Long> sandboxRepository;

    private static String className = SandboxRepositoryTests.class.getName().toUpperCase();

    @BeforeAll
    static void testStartingMessage() {
        BeforeStartingTest.displayStartingMessage(className);
    }

    @Test
    public void instantiationSmokeTest() {
        Assertions.assertNotNull(sandboxRepository);
    }

}
