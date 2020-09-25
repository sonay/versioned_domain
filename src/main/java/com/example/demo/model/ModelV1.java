package com.example.demo.model;

import java.util.Objects;

public class ModelV1 implements VersionedModel {

    private final String field1;
    private final Field2Value field2Value;

    public ModelV1(String field1, Field2Value field2Value) {
        this.field2Value = Objects.requireNonNull(field2Value);
        this.field1 = field1;
    }

    @Override
    public String field1() {
        return field1;
    }

    @Override
    public Field2Value field2Val() {
        return field2Value;
    }

    @Override
    public void visit(Object someDomainProcessor) {
        // do your thing on the domainProcessor
        // This class might get fat but let's not get carried atm
    }
}
