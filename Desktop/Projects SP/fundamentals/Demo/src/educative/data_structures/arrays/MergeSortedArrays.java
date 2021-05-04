package educative.data_structures.arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {3, 7, 9, 10, 45, 66};
        int[] arr2 = {8, 9, 45, 78, 900};

        int[] mergedArr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {

            mergedArr[k++] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
        }

        while (i < arr1.length)
            mergedArr[k++] = arr1[i++];

        while (j < arr2.length)
            mergedArr[k++] = arr2[j++];

        Arrays.stream(mergedArr).forEach(System.out::println);

    }
}
