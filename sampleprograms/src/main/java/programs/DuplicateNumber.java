package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateNumber {

    public static void main(String[] args) {
        Integer[] arr = {1, 15, 69, 35, 66, 25, 69, 25};
        DuplicateNumber duplicateNumber = new DuplicateNumber();
        for (int i : duplicateNumber.findDuplicate(arr)) {
            System.out.print(i + ",");
        }

    }

    private List<Integer> findDuplicate(Integer[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    list.add(arr[i]);
                    break;
                }
            }

        }
        return list;
    }

}
