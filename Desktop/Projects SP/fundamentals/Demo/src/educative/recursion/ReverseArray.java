package educative.recursion;

public class ReverseArray {

    private void reverseArray(int[] array, int i) {
        if (i < array.length / 2) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
            reverseArray(array, i + 1);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ReverseArray reverseArray = new ReverseArray();
        reverseArray.reverseArray(arr, 0);
        for (int ele : arr)
            System.out.print(ele + " ");
    }
}
