package com.sandbox.avoidbrittle.controller;

import com.sandbox.avoidbrittle.core.ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sandbox")
public class SandboxController {

    private ObjectService<String, Long> service;

    @Autowired
    public SandboxController(ObjectService<String, Long> service) {
        this.service = service;
    }

    @GetMapping
    public String retrieveHello() {
        return service.retrieveHello();
    }

}
