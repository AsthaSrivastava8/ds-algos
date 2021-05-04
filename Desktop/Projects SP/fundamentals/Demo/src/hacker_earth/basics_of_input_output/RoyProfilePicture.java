package hacker_earth.basics_of_input_output;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoyProfilePicture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        List<String> answers = new ArrayList<>();
        int testCases = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < testCases; i++) {
            String[] lXh = scanner.nextLine().split(" ");
            int l = Integer.parseInt(lXh[0]);
            int h = Integer.parseInt(lXh[1]);
            if (l < length || h < length)
                answers.add("UPLOAD ANOTHER");
            else if (l == h)
                answers.add("ACCEPTED");
            else
                answers.add("CROP IT");
        }
        for (String answer : answers)
            System.out.println(answer);
    }
}
