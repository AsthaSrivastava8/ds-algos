package hacker_earth.basics_of_input_output;

import java.util.Scanner;

public class SplitHouses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grid = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();
        if (str.contains("HH")) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            str = str.replace('.', 'B');
            System.out.println(str);
        }
    }
}
