package com.example.demo.model;

/*
* Mother of all versioned domain objects for a given model
*
* */
public interface VersionedModel {

    default String field1() {
        // Preferably something distinct and not in the domain
        return "defaultValue";
    }
//
//    default int field2() {
//        // Let's hope -1 is not in the domain,
//        // else try Integer maybe with null but that is yikes!
//        // or define a domain value class with a singleton default object
//        // see below
//        return -1;
//    }

    default Field2Value field2Val() {
        return Field2Value.DISTINCT;
    }

    // The actual class type should be here
    // For demo purposes I am keeping class count small
    // visitor pattern is generally messy
    void visit(Object someDomainProcessor);
}
