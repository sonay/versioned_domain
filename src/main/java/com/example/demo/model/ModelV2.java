package com.example.demo.controller;

import com.example.demo.model.Field2Value;
import com.example.demo.model.VersionedModel;

public class ModelV2 implements VersionedModel {
    private final String field1;

    public ModelV2(String field1) {
        this.field1 = field1;
    }

    @Override
    public void visit(Object someDomainProcessor) {

    }
}
