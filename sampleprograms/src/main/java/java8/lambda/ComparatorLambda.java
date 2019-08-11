package java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;

public class ComparatorLambda {
    public static void main(String[] args) {
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//                return o2.compareTo(o1);
                return Integer.compare(o1.length(), o2.length());
            }
        };


        Comparator<String> stringComparator1 = (s1, s2) -> Integer.compare(s1.length(), s2.length());
//        Comparator<String> stringComparator2 = Integer::compare;

        List<String> list = asList("**", "***", "*");
        Collections.sort(list, stringComparator1);
        for (String s : list){
            System.out.println(s);
        }

        // Collections will sort in ascending order by default, for custom sorting pass second parameter
        List<Integer> integerList = Arrays.asList(1, -5, 12, 2, 16);
        Collections.sort(integerList);
//        Collections.sort(integerList, Collections.reverseOrder()); // or any other custom comparator

        for (int i : integerList){
            System.out.println(i);
        }



    }






}
