package hacker_earth.Trees;

import java.util.HashMap;
import java.util.Map;

public class WeightedNode {
    public static void main(String[] args) {
        int[] arr = {4, 4, 1, 4, 13, 8, 8, 8, 0, 8, 14, 9, 15, 11, -1, 10, 15, 22, 22, 22, 22, 22, 21};
        System.out.println(weightedNodeCalc(arr));
    }

    public static int weightedNodeCalc(int... arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0, max_weight = 0;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], arr[i]+i);
            if (map.get(arr[i]) > max_weight) {
                max_weight = map.get(arr[i]);
                ans = arr[i];
            }
        }
        return ans;
    }
}

