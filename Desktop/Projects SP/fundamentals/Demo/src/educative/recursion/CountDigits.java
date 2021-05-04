package educative.recursion;

public class CountDigits {

    int countNumbers(int number) {
        if(number <= 1)
            return 1;
        return 1 + countNumbers(number/10);
    }
    public static void main(String[] args) {

        CountDigits countDigits = new CountDigits();
        System.out.println(countDigits.countNumbers(123456789));

    }
}
