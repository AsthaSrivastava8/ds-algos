import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String newStr = "";
        int size = str.length()  -1;
        while (size >= 0) {
            newStr += str.charAt(size--);

        }

        if (str.equalsIgnoreCase(newStr))
            System.out.println("true");
        else
            System.out.println("false");

    }
}
