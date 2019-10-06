package algorithms;

// Divide and Conquer algorithm.... divide into each element which is sorted and repeatedly  merge all elements
public class MergeSort {
    private int[] array;
    private int[] tempMergeArr;
    private int length;

    public static void main(String[] args) {
//        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
        int[] inputArr = {5,1,12,-5,15};
        MergeSort ms = new MergeSort();
        ms.sort(inputArr);
        for (int i : inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }

    private void sort(int[] inputArr){
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergeArr = new int[length];
        doMergeSort(0, length-1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {
        if(lowerIndex < higherIndex){
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            //Below step sorts the right side of the array
            doMergeSort(middle+1, higherIndex);
            //Now merge both sides
            mergeParts(lowerIndex,middle,higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex){
        for (int i = lowerIndex; i<= higherIndex; i++){
            tempMergeArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle+1;
        int k = lowerIndex;
        while (i <= middle && j <=higherIndex){
            if(tempMergeArr[i] <= tempMergeArr[j]){
                array[k] = tempMergeArr[i];
                i++;

            } else {
                array[k] = tempMergeArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle){
            array[k] = tempMergeArr[i];
            k++;
            i++;
        }

    }


}
