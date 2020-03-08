package com.sandbox.avoidbrittle.service;

import com.sandbox.avoidbrittle.core.AbstractService;
import com.sandbox.avoidbrittle.core.ObjectService;
import com.sandbox.avoidbrittle.core.ObjectRepository;
import org.springframework.stereotype.Service;

@Service
public class SandboxService extends AbstractService implements ObjectService<String, Long> {

    public SandboxService(ObjectRepository<String, Long> repository) {
        super(repository);
    }

    @Override
    public String retrieveHello() {
        return (String) getRepository().retrieveHello();
    }

}
