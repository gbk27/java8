package programs.array;

public class MissingNumberInArray {

    public static void main(String[] args) {
        int[] arr1={1,2,4};
        System.out.println("Missing number from array arr2: "+missingNumber(arr1));



        //TODO: find  correct logic to print all missing numbers of array
        /*int[] arr2 = {1,2, 5, 7, 8};
        int[] arr3 = new int[arr2.length];

        int j = 0;
        for(int i : arr2){
            arr3[j++] = 1;
        }

        for(int i =1 ; i < arr3.length; i++){
            if(arr3[i] == 0)
            System.out.println(i);
        }*/

    }


    public static int missingNumber(int[] arr)
    {
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int restSum=0;
        for (int i = 0; i < arr.length; i++) {
            restSum+=arr[i];
        }
        int missingNumber=sum-restSum;
        return missingNumber;
    }
}
