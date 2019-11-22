package datastructure.hash;

import java.util.*;

public class HashMapEqualsHashcode {

    public static void main(String[] args) {
        example1();
//        example2();
    }

    private static void example2() {
        Person p1 = new Person("ritu", 36);
        Person p2 = new Person("ritu", 36);

        System.out.println("p1 hashcode = " + p1.hashCode());
        System.out.println("p2 hashcode = " + p2.hashCode());

        System.out.println("Checking equality between alex1 and alex2 = " + p1.equals(p2));


        // with Arraylist only equals is enough
        List<Person> personList = new ArrayList<Person>();
        personList.add(p1);

        System.out.println("Arraylist size = " + personList.size());
        System.out.println("Arraylist contains ritu = " + personList.contains(new Person("ritu", 36)));





        //with HashSet both hascode and equals is mandatory
        Set<Person> personSet = new HashSet<Person>();
        personSet.add(p1);

        System.out.println("HashSet  size = " + personSet.size());
        System.out.println("HashSet  contains ritu = " + personSet.contains(new Person("ritu", 36)));


    }

    private static void example1() {
        Person p1 = new Person("ritu", 36);
        Person p2 = new Person("ritu", 36);

        Map<Person, String> myHashMap = new HashMap();
        myHashMap.put(p1, "p1");
        myHashMap.put(p2, "p2");

        for (Person person : myHashMap.keySet()) {
            System.out.print(myHashMap.get(person).hashCode() + " - ");
            System.out.println(myHashMap.get(person).toString());
        }
    }


}
