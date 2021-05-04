package educative.basics;

import java.util.Scanner;

public class SimpleCalculator {

    private static int number1;
    private static int number2;
    private static String operator;

    public static void add() {
        System.out.println(number1 + number2);
    }

    public static void subtract() {
        System.out.println(number1 - number2);
    }

    public static void multiply() {
        System.out.println(number1 * number2);
    }

    public static void divide() {
        System.out.println(number1 / number2);
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Q to exit.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Q"))
                return;
            else
                number1 = Integer.parseInt(input);
            operator = scanner.nextLine();
            number2 = Integer.parseInt(scanner.nextLine());
            switch (operator) {
                case "+":
                    add();
                    break;
                case "-":
                    subtract();
                    break;
                case "*":
                    multiply();
                    break;
                case "/":
                    divide();
                    break;
                default: System.out.println("Please enter valid choice.");
            }
        }
    }
}
