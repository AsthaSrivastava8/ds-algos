package hacker_earth.basics_of_input_output;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Balloon {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> answers = new ArrayList<>();
        int testCases = Integer.parseInt(scanner.nextLine());
        int[] solved = new int[2];
        for (int i = 0; i < testCases; i++) {
            solved[0] = 0;
            solved[1] = 0;
            String[] costsStr = scanner.nextLine().split(" ");
            int cheaper, expensive;
            if (Integer.parseInt(costsStr[0]) > Integer.parseInt(costsStr[1])) {
                cheaper = Integer.parseInt(costsStr[1]);
                expensive = Integer.parseInt(costsStr[0]);
            } else {
                cheaper = Integer.parseInt(costsStr[0]);
                expensive = Integer.parseInt(costsStr[1]);
            }
            int participants = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < participants; j++) {
                String[] problems = scanner.nextLine().split(" ");
                solved[0] += Integer.parseInt(problems[0]);
                solved[1] += Integer.parseInt(problems[1]);
            }
            if (solved[0] > solved[1]) {
                answers.add(cheaper * solved[0] + expensive * solved[1]);
            } else {
                answers.add(cheaper * solved[1] + expensive * solved[0]);
            }
        }
        for (Integer answer : answers)
            System.out.println(answer);
    }
}