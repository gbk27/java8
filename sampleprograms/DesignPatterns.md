**Java Association**

In Java, aggregation represents a "has-a" relationship, where one class contains another class as part of its structure, but they can exist independently. 
Example: A university "has" departments. Composition is a stronger relationship, where one class owns another class, and the owned class cannot exist independently

**Composition**:

class Engine {

    // Car specific attributes and methods
    
}

class Car {

    private final Engine carEngine;  // This signifies that Car "owns" Engine.

    Car() {
        carEngine = new Engine();
    }
    // Other Car methods
}

**Aggregation**:

class Department {

    // Department-specific attributes and methods
}

class University {

    private Department[] departments;  // University has departments, but doesn't exclusively "own" them.

    University(Department[] departments) {
        this.departments = departments;
    }
    // Other University methods
}

https://medium.com/@salvipriya97/java-aggregation-and-composition-explained-with-examples-66cbffd21b9c

