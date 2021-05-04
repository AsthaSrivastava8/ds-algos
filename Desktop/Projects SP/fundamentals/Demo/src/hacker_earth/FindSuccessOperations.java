package hacker_earth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FindSuccessOperations {
    /* Two arrays,
    for A[0] to A[i] contains B[i] number of distinct elements,
    then remove them from A. This is successful operation. Count successful operations.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        List<Integer> answers = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            int successOperation = 0;
            int size = Integer.parseInt(scanner.nextLine());
            String[] aStr = scanner.nextLine().split(" ");
            String[] bStr = scanner.nextLine().split(" ");

            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();

            for (int j = 0; j < size; j++) {
                a.add(Integer.parseInt(String.valueOf(aStr[j])));
                b.add(Integer.parseInt(String.valueOf(bStr[j])));
            }

            for (int j = 0; j < size; j++) {
                if (j < b.get(j))
                    continue;
                if (getDistinct(a, j) < b.get(j))
                    continue;
                else {
                    successOperation++;
                }
            }
            answers.add(successOperation);
        }
        for (Integer answer : answers) {
            System.out.println(answer);

        }
    }

    private static int getDistinct(List<Integer> a, int j) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < j; i++) {
            hm.put(a.get(i), i);
        }
        return (hm.keySet().size());
    }
}

