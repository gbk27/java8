package programs;

public class FibonacciNumber {
    public static void main(String[] args) {
        printFibonacciTillNumber(30);
        System.out.println();
        printFibonacciNumberOfTimes(10);
    }

    private static void printFibonacciTillNumber(int num){
        int current = 1;
        int sum = 1;
        int previous = 0;
        while(current <= num && sum+current < num){
            sum = current + previous;
            previous = current;
            current = sum;
            System.out.print(sum + " ");
        }
    }


    private static void printFibonacciNumberOfTimes(int num){

        int currentNum = 1;
        int sum = 0;
        int counter = 1;
        int previousNumber = 0;
        while(counter <= num){
            sum = currentNum + previousNumber;
            previousNumber = currentNum;
            currentNum = sum;
            counter++;
            System.out.print(sum + " ");
        }
    }
}
