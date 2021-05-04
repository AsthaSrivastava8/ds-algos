package skillenza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tree {
    static boolean path(String s) {
        int c = 0;
        int n = s.length();
        int a = 0;
        int last = -1;
        for (int i = 1; i < n - 1; i++) {

            if (s.charAt(i) == '[')
                ++a;
            else
                --a;
            if (a == 0) {
                boolean x = path(s.substring(last + 1, i));
                last = i;
                if (!x)
                    return false;
                else
                    ++c;

            }


        }
        if (c <= 2)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        List<Integer> answers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String T1 = sc.nextLine();
        int t1 = Integer.parseInt(T1);
        for (int t = 0; t < t1; t++) {
            int n = Integer.parseInt(sc.nextLine());
            String s = sc.nextLine();
            int ans = 0;
            int a = 0;

            int last = -1;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '[')
                    ++a;
                else
                    --a;

                if (a == 0) {
                    boolean x = path(s.substring(last + 1, i + 1));
                    if (x) {
                        ++ans;

                    }
                    last = i;

                }
            }
            answers.add(ans);
        }

        for (Integer ans:
            answers ) {

            System.out.println(ans);
        }
    }
}

/* eg:
1
18
[[][][]][[][[][]]]
 */