package programs;

import java.util.*;

public class HashMapSort {

    public static void main(String[] args) {
        HashMapSort hashMapSort = new HashMapSort();

        hashMapSort.sortByKey();

        System.out.println();
        hashMapSort.sortByKeyCustom();

        System.out.println();
        hashMapSort.sortByValue();

    }


    private void sortByKey() {
        Map<String, String> unsortedMap = Map.of("Z", "z", "B", "b", "F", "f");

        System.out.print("Unsorted Map : ");

        for (String s : unsortedMap.keySet()) {
            System.out.print(unsortedMap.get(s));
        }

        System.out.println();
        System.out.print("Sorted Map : ");

        Map<String, String> sortedMap = new TreeMap<>(unsortedMap);
        for (String s : sortedMap.keySet()) {
            System.out.print(unsortedMap.get(s));
        }
    }

    private void sortByKeyCustom() {
        Map<Integer, String> unsortedMap = Map.of(66, "z", 15, "b", 5, "f", 84, "m");

        // Before Java 8
        Map<Integer, String> sortedMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        //Java 8
//        Map<Integer, String> sortedMapJava8 = new TreeMap<>(Integer::compareTo); // natural order
        Map<Integer, String> sortedMapJava8 = new TreeMap<>((o1, o2) -> o2.compareTo(o1)); // reverse order


        sortedMapJava8.putAll(unsortedMap);

        for (Map.Entry<Integer, String> entry : sortedMapJava8.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }


    }

    private void sortByValue() {
        Map<Integer, String> unsortedMap = Map.of(66, "z", 15, "b", 5, "f", 84, "m");

        List<Map.Entry<Integer, String>> list = new ArrayList<>(unsortedMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<Integer, String> entry : list) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }

    }


}
