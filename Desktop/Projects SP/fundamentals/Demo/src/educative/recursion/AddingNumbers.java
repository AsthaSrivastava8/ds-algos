package educative.recursion;

public class AddingNumbers {

    private int addAll(int n) {
        if (n == 1)
            return 1;
        return n + addAll(n-1);
    }

    public static void main(String[] args) {

        AddingNumbers numbers = new AddingNumbers();
        System.out.println(numbers.addAll(10));

    }
}
