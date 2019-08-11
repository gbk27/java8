package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapExample{
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> list2 = Arrays.asList(1,3,5);
        List<Integer> list3 = Arrays.asList(2,3,6);

        List<List<Integer>> result = Arrays.asList(list1,list2,list3);
        System.out.println(result);

        Function<List<Integer>, Integer> f1 = List::size;
        Function<List<Integer>, Stream<Integer>> flatMapper = l -> l.stream();

        result.stream()
//                .map(l -> l.size())
                .map(f1)
                .forEach(System.out::println);


        result.stream()
//                .map(flatMapper)
                .flatMap(flatMapper)
                .forEach(System.out::print);


    }
}
