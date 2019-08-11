package java8.streams;

import java.util.Arrays;
import java.util.List;

public class ReductionExcample {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList();// 0 ->corner case empty list returns identity

//        List<Integer> list = Arrays.asList(10,10,10); // 30 -> returns sum of all integers

        List<Integer> list = Arrays.asList(10); // 10 -> corner case returns 0 + 10

        Integer red = list.stream()
//                        .reduce(0, (i1,i2) -> (i1 + i2));
                        .reduce(0, Integer::sum);


        System.out.println("red : " + red);


    }
}
