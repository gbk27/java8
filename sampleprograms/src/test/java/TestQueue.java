import datastructure.BasicQueue;

public class TestQueue {
    public static void main(String[] args) {
        // Scenario 1
//        BasicQueue<String> basicQueue1 = new BasicQueue<String>(2);
//        basicQueue1.enQueue("1");
//        basicQueue1.enQueue("2");
//
//
//        basicQueue1.deQueue();

//        basicQueue1.enQueue("3");     // this is linear queue, cannot be added if there are still empty space
                                        // linear queue and circular queue

        // Scenario 2
        BasicQueue<String> basicQueue2 = new BasicQueue<String>(3);
        basicQueue2.enQueue("1");
        basicQueue2.enQueue("2");
        basicQueue2.enQueue("3");

        basicQueue2.deQueue();
        System.out.println(basicQueue2.access(0));

    }



}
