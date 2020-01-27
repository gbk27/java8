package eagleview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Test1 {

    //https://www.geeksforgeeks.org/print-all-subarrays-with-0-sum/
    public static void main(String[] args) throws Exception {
        int[] array = new int[] {2,-2,3,0,4,-7};

//        int[] array = new int[] {0,0,0,0,0,0};

        List<int[]> indices = findAllRanges(null);

        System.out.println("Found "+indices.size()+" ranges in the array: "+ Arrays.toString(array));
        for (int i=0; i<indices.size(); i++) {
            int[] pair = indices.get(i);
            System.out.println(i+": From index "+pair[0]+" to "+pair[1]);
        }
    }

    /**
     * Find all the ranges in the given array, where the sum is zero.
     *
     * The return value is a list of int arrays. Each int array has two values which
     * contain the start and end index of the given array.
     *
     * @param array The array to check
     * @return The list of index pairs as int arrays.
     */
    private static List<int[]> findAllRanges(int[] array) {
        List<int[]> result = new ArrayList<int[]>();

        if(isNull(array)){
            return Collections.emptyList();
        }

        for (int i=0; i<array.length; i++) {     // go from 0 to N-1  --> i
            for (int j=i; j<array.length;j++) {  // go from i to N-1  --> j
                int sum = 0;

                // sum the values up from "i" to "j"
                for (int k=i; k<=j; k++) {
                    sum += array[k];
                }

                if (sum == 0) {
                    int[] indices = new int[] {i, j};
                    result.add(indices);
                }
            }
        }
        return result;
    }
}
