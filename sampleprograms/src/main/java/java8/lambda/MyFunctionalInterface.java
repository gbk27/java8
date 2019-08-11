package java8.lambda;

@FunctionalInterface
public interface MyFunctionalInterface {

    void method();
//    boolean secondMethod(); // no more than one abstract method

    default void justPrint(){
        System.out.println("first functional interface");
    }

    //can have more than one non abstract method
    default void justPrint1() {
        System.out.println("first functional interface");
    }

    // it can have static methods also

    //objects methods are not considered
    boolean equals(Object obj);

}
