package com.example.demo.model;


public class ModelV2 implements VersionedModel {
    private final String field1;

    public ModelV2(String field1) {
        this.field1 = field1;
    }

    @Override
    public String field1() {
        return field1;
    }

    @Override
    public void visit(Object someDomainProcessor) {

    }
}
