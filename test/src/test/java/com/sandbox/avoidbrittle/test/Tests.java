package com.sandbox.avoidbrittle.test;

import org.mockito.MockitoAnnotations;

public abstract class Tests implements BeforeStartingTest {

    public Tests() {
        MockitoAnnotations.initMocks(this);
    }

}
