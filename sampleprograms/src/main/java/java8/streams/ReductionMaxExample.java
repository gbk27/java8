package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionMaxExample {
    public static void main(String[] args) {

        // max method does not need identity element


        //        List<Integer> list = Arrays.asList();// 0 ->corner case empty list returns identity

        List<Integer> list = Arrays.asList(10,20,30); // 30 -> returns sum of all integers

//        List<Integer> list = Arrays.asList(10); // 10 -> corner case returns 0 + 10

        Optional<Integer> red = list.stream()
                                        .reduce(Integer::max);

        System.out.println("red : " + red);


    }
}
