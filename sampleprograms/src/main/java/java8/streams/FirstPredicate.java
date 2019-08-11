package java8.streams;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicate {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("four", "three", "one", "two", "five");
        Predicate<String> p1 = p -> p.length() > 3;
        Predicate<String> p2 = p -> p.equals("three");
        Predicate<String> p3 = p -> p.equals("five");

        stringStream
//                .filter(p1)
                .filter(p2.or(p3))
                .forEach(System.out::println);
    }
}
