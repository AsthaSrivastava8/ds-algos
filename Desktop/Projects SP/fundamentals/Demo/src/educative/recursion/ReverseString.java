package educative.recursion;

import java.util.Scanner;

public class ReverseString {

    private String reverse(String string) {

        if (string.isEmpty()) {
            return string;
        }

        // Recursive case
        else {
            return reverse(string.substring(1)) + string.charAt(0);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse(string));
    }
}

