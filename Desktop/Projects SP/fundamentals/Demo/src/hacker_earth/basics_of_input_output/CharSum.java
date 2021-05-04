package hacker_earth.basics_of_input_output;

import java.util.Scanner;

public class CharSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += (int) str.charAt(i) - 96;
        }
        System.out.println(sum);
    }
}
