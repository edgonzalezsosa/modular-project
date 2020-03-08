package com.sandbox.avoidbrittle.core;


public abstract class AbstractService {

    private ObjectRepository repository;

    public AbstractService(ObjectRepository repository) {
        this.repository = repository;
    }

    public ObjectRepository getRepository() {
        return repository;
    }

}
