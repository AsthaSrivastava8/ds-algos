package hacker_earth.basics_of_input_output;

import java.math.BigInteger;
import java.util.Scanner;

public class FindProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[] arr = scanner.nextLine().split(" ");
        BigInteger prod = new BigInteger(arr[0]);
        for (int i = 1; i < size; i++) {
            prod = prod.multiply(new BigInteger(arr[i]));
        }
        System.out.println(prod.mod(new BigInteger("1000000007")));
    }

    // OR
    public static void main2(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[] arr = scanner.nextLine().split(" ");
        long prod = 1;
        long div = (long) Math.pow(10, 9) +7;
        for (int i = 1; i < size; i++) {
            prod = (prod * Integer.parseInt(arr[i]))%div;
        }
        System.out.println(prod);
    }
}
