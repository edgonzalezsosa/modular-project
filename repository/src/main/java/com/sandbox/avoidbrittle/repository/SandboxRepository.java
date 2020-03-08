package com.sandbox.avoidbrittle.repository;

import com.sandbox.avoidbrittle.core.ObjectRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SandboxRepository implements ObjectRepository<String, Long> {
    @Override
    public String retrieveHello() {
        return "Hello World!";
    }
}
