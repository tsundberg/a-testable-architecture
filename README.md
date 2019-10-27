# A testable architecture

An example on how to use configurable dependencies for 

* fast verification using a fake

* slow verification but using the real thing

We need confidence that the system works properly, fast feedback as well a accurate feedback. Using the dependencies 
properly give us.

* Confidence - we verify using the real implementation and therefore we know 
  that we can trust the real thing. Verifying a fake with the same test 
  gives us reason to trust a fake implementation.
  
* Speed - fast feedback so we can know when we broke something even when a fake is used.

* Low cost - chaining the implementation easier with fast feedback and therefore cheap.

## Building

The example uses Gradle, build it with:

    ./gradlew cucumber

This will build the system and verify that the core works as expected. 
That is, that the model works as expected.
