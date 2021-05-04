package hacker_earth.basics_of_input_output;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeatingArrangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        int[] odds = {11, 9, 7, 5, 3, 1};
        List<String> answers = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            int oppositeSeat = 0;
            String location = null;
            int seatNumber = Integer.parseInt(scanner.nextLine());
            int originalSeat = seatNumber;
            switch (seatNumber % 6) {
                case 3:
                case 4:
                    location = "AS";
                    break;
                case 2:
                case 5:
                    location = "MS";
                    break;
                case 1:
                case 0:
                    location = "WS";
                    break;
            }

            seatNumber = seatNumber % 12 == 0 ? 12 : seatNumber % 12;

            if (seatNumber > 6) {
                oppositeSeat = originalSeat - odds[6 - (seatNumber - 6)]; // not correct
            } else {
                oppositeSeat = originalSeat + odds[seatNumber - 1];
            }

            answers.add((oppositeSeat) + " " + location);
        }

        for (String answer : answers)
            System.out.println(answer);
    }
}
