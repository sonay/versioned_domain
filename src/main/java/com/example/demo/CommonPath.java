package com.example.demo;

import com.example.demo.model.VersionedModel;
import org.springframework.stereotype.Service;

@Service
public class CommonPath {

    private Object someDomainProcessor;

    public void process(VersionedModel domainObject) {
        domainObject.visit(someDomainProcessor);
    }



}
