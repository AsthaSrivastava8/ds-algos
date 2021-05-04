package hacker_earth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GainSight2 {
    public static void main(String[] args) {
        long mod = 100000007;
        Scanner sc=new Scanner(System.in);
        List<Long> answers = new ArrayList<>();
        int t1 =Integer.parseInt(sc.nextLine());
        for (int t = 0; t < t1; t++) {
            String s =sc.nextLine();
            int n = s.length();
            HashMap<Character, Integer> hm=new HashMap<>();
            for (int i = 0; i < n; i++) {
                char ch=s.charAt(i);
                if(hm.containsKey(ch))
                    hm.put(ch,hm.get(ch)+1);
                else
                    hm.put(ch,1);
            }
            long ans=1;
            for(Character ch:hm.keySet())
            {
                ans = (ans%mod * hm.get(ch)%mod)%mod;
            }
            answers.add(ans);
        }
        for (Long ans: answers
             ) {
            System.out.println(ans);
        }
    }

}

// find repeated chars
 /*
 1
 abcc
  */