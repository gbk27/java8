package programs;

public class PrimerNumber {
    public static void main(String[] args) {
        printPrimerNumbers();
        System.out.println(isPrimeNumber(27));
    }

    private static void printPrimerNumbers() {
        String primeNumbers = "";

        for (int i = 1; i <= 20; i++) {
            int counter = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }

    public static boolean isPrimeNumber(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}
