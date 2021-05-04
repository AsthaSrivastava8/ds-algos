package educative.recursion;

public class PermutationString {

    public static void permutations(char[] array, int length) {
        if (length == 1) {
            System.out.println(array);
            return;
        }
        for (int i = 0; i < length; i++) {
            swap(array, i, length-1);
            permutations(array, length-1);
            swap(array, i, length-1);
        }
    }

    public static void swap(char[] array, int i, int j) {
        char c;
        c = array[i];
        array[i] = array[j];
        array[j] = c;
    }

    public static void main( String args[] ) {
        char[] input = {'a', 'b', 'c', 'd'};
        System.out.println("Permutations of a string");
        permutations(input, input.length);
    }
}
