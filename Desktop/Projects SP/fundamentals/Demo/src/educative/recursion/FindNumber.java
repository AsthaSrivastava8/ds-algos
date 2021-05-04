package educative.recursion;

public class FindNumber {

    private int findNumber(int[] arr, int i, int n) {
        if (i < arr.length && arr[i] == n)
            return i + 1;
        if (i >= arr.length)
            return -1;
        return findNumber(arr, i + 1, n);
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 100, 2, 5, 8, 100, 56};
        FindNumber findNumber = new FindNumber();
        System.out.println(findNumber.findNumber(arr, 0, 101));
    }
}
