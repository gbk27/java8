package algorithms;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5,1,12,-5,16};
        doInsertionSort(arr);
    }

    private static void doInsertionSort(int[] arr) {
        int temp;
        for(int i=1; i<arr.length; i++){
            for(int j =i; j>0; j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i : arr){
            System.out.print(i);
            System.out.print(", ");
        }
    }


}
