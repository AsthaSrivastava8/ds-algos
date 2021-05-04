package hacker_earth.time_space_complexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class APlusB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> answers = new ArrayList<>();
        String input = "";
        while ((input = br.readLine()) != "") {
            if (input.equalsIgnoreCase(""))
                break;
            String [] numbers = input.split(" ");
            answers.add(Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]));
        }
        for (Integer answer : answers)
            System.out.println(answer);
    }
}
