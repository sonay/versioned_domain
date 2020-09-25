# versioned_domain
A solution for a versioned domain model objects problem.


The idea is for each versioned domain class, define a versioned model interface as exampled in com.example.demo.model.VersionedModel.

Thanks to default methods in Java, missing fields can be replaced with distinguished values to signal their absence and visitor pattern
might help manage the complexity a bit but should not be considered a full solution as a complex domain is still a complex domain.
