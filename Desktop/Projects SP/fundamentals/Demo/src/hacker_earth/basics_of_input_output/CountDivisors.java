package hacker_earth.basics_of_input_output;

import java.util.Scanner;

public class CountDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lrk = scanner.nextLine().split(" ");
        int count = 0;
        int k = Integer.parseInt(lrk[2]);
        int l = Integer.parseInt(lrk[0]);
        int r = Integer.parseInt(lrk[1]);
        for (int i = l; i <= r; i++) {
            if (i % k == 0)
                count++;
        }
        System.out.println(count);
    }
}
