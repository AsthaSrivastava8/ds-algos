package hacker_earth.basics_of_input_output;

import java.util.Scanner;

public class ZOO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        int x = 0, y = 0;
        int i = 0;
        while (input.charAt(i) == 'z') {
            x++;
            i++;
        }
        y = input.length() - x;
        if (2 * x == y)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
