package hacker_earth.time_space_complexity;

import java.util.*;

public class VowelRecognition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        List<Long> answers = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            String str = scanner.nextLine().toLowerCase();
            answers.add(vowel_calc(str));
        }
        for (Long answer : answers)
            System.out.println(answer);
    }

    static long vowel_calc(String s) {
        int n = s.length();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {

            if (i == 0)
                // No. of occurrences of 0th character
                // in all the substrings
                arr[i] = n;

            else
                // No. of occurrences of ith character
                // in all the substrings
                arr[i] = (n - i) + arr[i - 1] - i;
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            // Check if ith character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u')
                sum += arr[i];
        }

        // Return the total sum
        // of occurrences of vowels
        return sum;
    }
}
