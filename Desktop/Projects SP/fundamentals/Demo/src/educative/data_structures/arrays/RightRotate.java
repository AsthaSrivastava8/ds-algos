package educative.data_structures.arrays;

import java.util.Arrays;

public class RightRotate {
    public static void main(String[] args) {
        int[] arr = {3, 6, 5, 4};
        int nextLoop = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            int temp = nextLoop;
            nextLoop = arr[i + 1];
            arr[i + 1] = temp;
+        }
        arr[0] = nextLoop;

        Arrays.stream(arr).forEach(System.out::println);
    }
}
