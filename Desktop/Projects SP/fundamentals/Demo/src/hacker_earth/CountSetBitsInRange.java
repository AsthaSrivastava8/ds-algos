package hacker_earth;

import java.util.Scanner;

public class CountSetBitsInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.print("Total set bit count is ");
        System.out.println(countSetBits(n));
    }

    static int countSetBits(int N) {
        int two = 2, ans = 0;
        int n = N;
        while (n != 0) {
            ans += (N / two) * (two >> 1);
            if ((N & (two - 1)) > (two >> 1) - 1)
                ans += (N & (two - 1)) - (two >> 1) + 1;
            two <<= 1;
            n >>= 1;
        }
        return ans;
    }
}

