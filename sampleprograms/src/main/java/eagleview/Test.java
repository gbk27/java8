package eagleview;

import java.lang.Number;

public class Test {

    public static void main(String[] args) {

        System.out.println(consecutiveProduct(6,20));
        System.out.println(consecutiveProduct(21,29));
        System.out.println(consecutiveProduct(32,0));
        System.out.println(consecutiveProduct(32,0));
        System.out.println(consecutiveProduct(-3,-1));
    }

    private static int consecutiveProduct(int A, int B){


        if(B==0 || (A >= B)){
            System.out.println("Not Valid Condition");
            return 0;
        }

        int count = 0;

        for(int i=1; i<B; i++){

            int val =  i*(i+1);

            if(val <= B && val >= A){
                count++;
            }
        }

        return count;

    }


}


