package hacker_earth.basics_of_input_output;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                ans += Character.toLowerCase(str.charAt(i));
            } else
                ans += Character.toUpperCase(str.charAt(i));
        }

        System.out.println(ans);

    }
}
