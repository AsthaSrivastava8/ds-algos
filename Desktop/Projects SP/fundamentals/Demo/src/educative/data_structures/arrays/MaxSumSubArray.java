package educative.data_structures.arrays;

import java.util.Arrays;

// Kadane’s Algorithm

public class MaxSumSubArray {

    public static void main(String args[]) {
        int[] arr = {1, 7, -2, -5, 10, -1};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Sum: " + findMaxSumSubArray(arr));
    }

    private static int findMaxSumSubArray(int[] arr) {
        int currSum = arr[0];
        int globalSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (currSum < 0)
                currSum = arr[i];
            else
                currSum += arr[i];

            if (currSum > globalSum)
                globalSum = currSum;
        }
        return globalSum;
    }
}