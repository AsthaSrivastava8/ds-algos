package educative.data_structures.arrays;

import java.util.Arrays;

public class findSecondLargest {
    public static void main(String[] args) {
        int[] arr = {-2, -33, -10, -456};

        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println(secondMax);
    }
}
