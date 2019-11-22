Lambda Expression
------------------
It is another way of writing instances of anonymous classes

* type of lambda expression is functional interface
* lambda expression can be passed as a method parameter
* lambda expression is not an object. But jvm creates an object without identifier

Functional interface is having only one abstract method
static methods are allowed in functional interface

@FuntionalInterface
public interface myInterface {
abstract void myMethod();
boolean equals(Object o);
// and may be one default non abstract method
}

* 4 types of functional interface
Supplier, Consumer (BiConsumer), Predicate (BiPredicate), Function (BiFunction)


Streams
-------

stream is typed interface (type can be integer, string etc)
It is an object on which one can define operations
It is an object that does not hold data
Data will be processed in one pass


* streams are powerful because it can process data in parallel to leverage the computing power or multi core processor
* streams are pipelined, to avoid unnecessary intermediary operation.

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
 can be implemented as below
 Consumer<T> c = p -> System.out.println(p);
 Consumer<T> c = System.out::println;
 
* Filter is intermediary operation and lazy (filters data and returns another stream) - filter(predicate)
* Peek is intermediary operation and lazy (returns another stream) - peek(consumer)
* forEach is final operation and not lazy - forEach(consumer)

* map is a intermediary operation and it returns stream - map (function)

@FunctionalInterface
public void Function<T,R> {
    R apply(T t);
}

* map and flatMap signature
<R> Stream<R> map(Function<T,R>, mapper);
<R> Stream<R> flatMap(Function<T, Stream<R>> flatMapper);

* Reduction - two kinds
1. sequel aggregation = min,max, sum etc...
2. mutable reduction = which are collectors containers

stream.reduce(identity element, binary operation)

Binary Operator is a specia

public interface BiFunction<T,U,R> {
    R apply(T t, U u);
}

Reduction Operation are terminal operation (final operation which triggers operations on stream)

optional : needed because default values cant be always defined



















