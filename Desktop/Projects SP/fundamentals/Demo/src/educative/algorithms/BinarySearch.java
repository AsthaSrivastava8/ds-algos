package educative.algorithms;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 10, 20, 47, 59, 63, 75, 88, 99, 107, 12, 133, 155, 162, 176, 188, 199, 200, 210, 222};
        int searchValue = 222;
        System.out.println(search(arr, 0, arr.length - 1, searchValue));

    }

    private static int search(int[] arr, int start, int end, int searchValue) {

        if (start > end)
            return -1;

        int midIndex = start + (end - start) / 2; // important

        if (searchValue == arr[midIndex])
            return midIndex;

        if (searchValue > arr[midIndex])
            return search(arr, midIndex + 1, end, searchValue);

        if (searchValue < arr[midIndex])
            return search(arr, start, midIndex - 1, searchValue);

        return -1;
    }
}

/*
Maybe, you wonder why we are calculating the middle index this way, we can simply add the lower and higher index and divide it by 2.

int mid = (low + high)/2;

But if we calculate the middle index like this means our code is not 100% correct, it contains bugs.

That is, it fails for larger values of int variables low and high. Specifically, it fails if the sum of low and high is greater than the maximum positive int value(231 – 1 ).

The sum overflows to a negative value and the value stays negative when divided by 2. In java, it throws ArrayIndexOutOfBoundException.

int mid = low + (high – low)/2;

So it’s better to use it like this. This bug applies equally to merge sort and other divide and conquer algorithms.
 */