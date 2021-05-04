package educative.basics;

import java.util.Scanner;

public class RemoveDuplicate {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String newStr = str.substring(0, 1);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == newStr.charAt(newStr.length() - 1))
                continue;
            newStr += str.charAt(i);
        }
        System.out.println(newStr);
    }
}
