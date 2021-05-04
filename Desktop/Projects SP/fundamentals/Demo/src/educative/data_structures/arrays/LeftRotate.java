package educative.data_structures.arrays;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 4, 3, 3, 9, 0, 10};

        int nextLoop = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = nextLoop;
            nextLoop = arr[i - 1];
            arr[i - 1] = temp;
        }

        arr[arr.length - 1] = nextLoop;

        Arrays.stream(arr).forEach(System.out::println);

    }
}
