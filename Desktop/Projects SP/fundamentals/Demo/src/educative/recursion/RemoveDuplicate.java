package educative.recursion;

import java.util.Scanner;

public class RemoveDuplicate {

    private String removeDuplicate(String text) {

        if (text.length() == 1) {
            return text;
        }

        if (text.substring(0,1).equals(text.substring(1,2))) {
            return removeDuplicate(text.substring(1));
        }
        else {
            return text.substring(0,1) + removeDuplicate(text.substring(1));
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        System.out.println(removeDuplicate.removeDuplicate(str));

    }
}
