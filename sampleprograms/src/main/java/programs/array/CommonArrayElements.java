package programs.array;

public class CommonArrayElements {


    public static void main(String[] args) {

        int[] arr1 = {3, 23, 79, 45, 66};
        int[] arr2 = {1, 45,76, 32,66};

        for(int i=0; i<arr1.length; i++) {

            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }

        }


    }


}
