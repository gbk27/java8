package algorithms;

public class BubbleSort {


    public static void main(String[] args) {
//        int num[] =  {4,2,9,6,23,12,34,0,1};
        int num[] = {5, 1, 12, -5, 15};
        doBubbleSort(num);
    }

    private static void doBubbleSort(int nums[]) {
        int size = nums.length;
        for (int n = 0; n < nums.length; n++) {
            for (int i = 0; i < size - 1; i++) {
                int k = i + 1;
                if (nums[i] > nums[k]) {
                    swapItems(nums, i, k);
                }
            }
            printNumbers(nums);
        }
    }

    // TO check below logic which algorithm
/*    private static void doBubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    swapItems(nums, i, j);
                }
            }
            printNumbers(nums);
        }
    }*/

    private static void printNumbers(int[] nums) {
        for (int num : nums) {
            System.out.print(num + ", ");
        }
        System.out.println("\n");
    }

    private static void swapItems(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }


}
