package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediaryAndFinalOperation {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("four", "three", "one", "two", "five");
        List<String> list = new ArrayList<>();

        Predicate<String> p1 = Predicate.isEqual("two");
        Predicate<String> p2 = Predicate.isEqual("three");

        // this does not execute anything becasue all are intermediary operations
//        stringStream
//                .peek(System.out::println)
//                .filter(p1.or(p2))
//                .peek(list::add);

        // this executes becasue forEach is final operation
        stringStream
                .peek(System.out::println)
                .filter(p1.or(p2))
                .forEach(list::add);


        System.out.println("Done");
        System.out.println("Size : " + list.size());

    }
}
