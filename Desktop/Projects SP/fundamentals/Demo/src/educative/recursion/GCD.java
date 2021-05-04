package educative.recursion;

import java.util.Scanner;

public class GCD {

    private int gcd(int a, int b) {

        if (a == b)
            return a;
        if (a > b)
            return (gcd(a - b, b));
        else
            return gcd(a, b - a);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        GCD gcd = new GCD();
        System.out.println(gcd.gcd(a, b));

    }
}
