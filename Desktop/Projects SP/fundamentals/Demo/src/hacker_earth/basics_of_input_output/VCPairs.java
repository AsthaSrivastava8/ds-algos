package hacker_earth.basics_of_input_output;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VCPairs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        List<Integer> answers = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            int ans = 0;
            int size = Integer.parseInt(scanner.nextLine());
            String str = scanner.nextLine();

            for (int j = 1; j < size; j++) {
                if (str.charAt(j) == 'a'
                        || str.charAt(j) == 'e'
                        || str.charAt(j) == 'i'
                        || str.charAt(j) == 'o'
                        || str.charAt(j) == 'u')
                    if (str.charAt(j - 1) != 'a'
                            && str.charAt(j - 1) != 'e'
                            && str.charAt(j - 1) != 'i'
                            && str.charAt(j - 1) != 'o'
                            && str.charAt(j - 1) != 'u')
                        ans++;
            }
            answers.add(ans);
        }
        for (Integer answer : answers)
            System.out.println(answer);
    }
}