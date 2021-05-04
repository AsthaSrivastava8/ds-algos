package hacker_earth.basics_of_input_output;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        long fact = 1;
        while (number > 0){
            fact *= number;
            number --;
        }
        System.out.println(fact);
    }
}
