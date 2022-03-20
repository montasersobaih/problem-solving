package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BoyOrGirl {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[26];
        int count = 0;
        String str1 = b.readLine();
        for (int i = 0; i < str1.length(); i++) {
            if (array[str1.charAt(i) - 'a']++ == 0) {
                count++;
            }
        }
        System.out.println((count % 2 == 0) ? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}