package hacker_earth.basics_of_input_output;

import java.util.Scanner;

public class PotionBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        if (number.length() != 10) {
            System.out.println("Illegal ISBN");
        } else {
            int i = 1;
            int sum = 0;
            while (i <= 10) {
                sum += Character.getNumericValue(number.charAt(i-1)) * i;
                i++;
            }
            if (sum % 11 == 0)
                System.out.println("Legal ISBN");
            else
                System.out.println("Illegal ISBN");
        }
    }
}
