package java8;

public class RunnableLambda implements Runnable {

    // old way
    @Override
    public void run(){
        System.out.println("Normal Way");
    }


    public static void main(String[] args) {
//        RunnableLambda runnable  = new RunnableLambda();

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Normal way of anonymous class");
//            }
//        };

        Runnable runnable = () -> System.out.println("lambda way");

        Thread thread = new Thread(runnable);
        thread.start();

    }
}
