package educative.basics;

import java.util.Scanner;

public class GCDNoobs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int big, small;
        if (a > b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }

        int answer = a;
        for (int i = 1; i <= big; i++) {
            if (big % i == 0 && small % i == 0)
                answer = i;
        }
        System.out.println(answer);

    }

}
