package educative.recursion;

public class SortArray {

    private void sort(int[] arr, int n) {

        if (n == 1)
            return;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        sort(arr, n - 1);

    }

    public static void main(String[] args) {

        int[] arr = {6, 7, 4, 8, 2, 1};
        SortArray sortArray = new SortArray();
        sortArray.sort(arr, arr.length);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
