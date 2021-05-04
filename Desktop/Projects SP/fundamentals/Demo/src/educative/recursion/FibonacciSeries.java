package educative.recursion;

import java.util.Scanner;

public class FibonacciSeries {

    private int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return (fibonacci(n - 1) + fibonacci(n - 2));
    }

    public static void main(String[] args) {

        FibonacciSeries fibonacci = new FibonacciSeries();
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        while (i < number) {
            System.out.println(fibonacci.fibonacci(i));
            i++;
        }
    }
}

// f(n) = f(n-1) + f(n-1)