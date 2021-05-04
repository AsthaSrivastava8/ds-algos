package educative.data_structures.arrays;

import java.util.Arrays;

public class RemoveEvenIntFromArr {

    public static void main(String[] args) {
        // create new array or use stream as follows:

        int[] arr = {1, 6, 3, 4, 7};

        int[] newArr = Arrays.stream(arr).filter(e -> e % 2 != 0).toArray();

        Arrays.stream(newArr).forEach(System.out::println);

    }
}
