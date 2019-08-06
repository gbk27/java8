package algorithms;

public class SelectionSort {

    public static int[] doSelectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i; j < arr.length; j++)
            if (arr[j] < arr[index])
                index = j;

//            System.out.println(arr[i] + ", "+ arr[index]);
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {5,1,12, -5,15};
        int[] arr2 = doSelectionSort(arr1);
        for (int i : arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }


}
