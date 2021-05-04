package hacker_earth.Trees;

import java.util.LinkedList;
import java.util.List;

public class MeetingPoint {

    int[] newArr = new int[100];

    public static void main(String[] args) {
        int[] arr = {4, 4, 1, 4, 13, 8, 8, 8,
                0, 8, 14, 9, 15, 11, -1, 10,
                15, 22, 22, 22, 22, 22, 21};

          MeetingPoint meetingPoint= new MeetingPoint();
         meetingPoint.meeting(9, arr);

    }

    public void meeting(int node, int[] arr) {
        int[] vis = new int[arr.length];
        vis[node] = 1;
        LinkedList<Integer> list = new LinkedList<>();
        list.add(node);
        while (!list.isEmpty()) {
            int p = list.peekFirst();
            list.pop();
            for (int child : this.newArr) {
                if (vis[child] == 0) {
                    vis[child]=1;
                    list.set(child,arr[p]+1);
                    list.push(child);
                }
            }

        }
        for (int val: vis)
        System.out.println(val);
    }
}