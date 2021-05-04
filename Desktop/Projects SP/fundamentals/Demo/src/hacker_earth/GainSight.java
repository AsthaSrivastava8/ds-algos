package hacker_earth;

import java.util.*;

// finding min and max XORs from all the arrays of N/2 size in an array of size N.

public class GainSight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        ArrayList<Integer> minXORArray = new ArrayList<>();
        ArrayList<Integer> maxXORArray = new ArrayList<>();
        int minXOR = 0;
        int maxXOR = 0;
        for (int subArray = 0; subArray < size / 2; subArray++) {
            int i = -1, j = -1, l = -1, J = -1, mn = 1000000, mx = 0;
            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    if (row != col) {
                        int occurrences1 = Collections.frequency(maxXORArray, row);
                        int occurrences2 = Collections.frequency(maxXORArray, col);
                        if (occurrences1 == 0 && occurrences2 == 0) {
                            if ((arr[row] ^ arr[col]) > mx) {
                                mx = arr[row] ^ arr[col];
                                i = row;
                                j = col;
                            }
                        }
                        int occurrences3 = Collections.frequency(minXORArray, row);
                        int occurrences4 = Collections.frequency(minXORArray, col);
                        if (occurrences3 == 0 && occurrences4 == 0) {
                            if ((arr[row] ^ arr[col]) < mn) {
                                mn = arr[row] ^ arr[col];
                                l = row;
                                J = col;
                            }
                        }
                    }
                }
            }
            maxXORArray.add(i);
            maxXORArray.add(j);
            minXORArray.add(l);
            minXORArray.add(J);
            minXOR += mn;
            maxXOR += mx;
        }
        System.out.println(minXOR + " " + maxXOR);
    }

}

/*
4
1
2
3
4

 */