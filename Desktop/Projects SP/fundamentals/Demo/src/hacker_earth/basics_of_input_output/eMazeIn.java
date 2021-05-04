package hacker_earth.basics_of_input_output;

import java.util.Scanner;

public class eMazeIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
            }
        }
        System.out.println(x + " " + y);
    }
}
