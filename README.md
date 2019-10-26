# A testable architecture

An example on how to use configurable dependencies for 
* fast verification
* slow but using the real database

We need fast feedback as well a accurate feedback. Using the dependencies 
properly give us
* Speed - fast feedback so we can know when we broke something
* Confidence - we verify using the real database and therefore we know that we can connect to the database
* Low cost - chaning the implementation is not a lot a of work and there cheap

## Building

The example uses Gradle, build it with:

    ./gradlew cucumber

This will build the system and verify that the core works as expected. 
That is, that the model works as expected.
