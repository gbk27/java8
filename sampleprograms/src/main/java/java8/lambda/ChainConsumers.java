package java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumers {
    public static void main(String[] args) {
        List<String> s1 = Arrays.asList("two", "three", "one", "four");


        List<String> result = new ArrayList<>();
//        Consumer<String> c1 = (s -> System.out.println(s));
        Consumer<String> c1 = System.out::println;

        Consumer<String> c2 = s -> result.add(s);
//        Consumer<String> c2 = result::add;

        s1.stream()
                .forEach(c1.andThen(c2));
        System.out.println(result.size());


    }
}
