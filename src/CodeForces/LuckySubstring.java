package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @link https://codeforces.com/contest/122/problem/B
 * @since 29-03-2022
 */

public class LuckySubstring {

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String line = b.readLine();

        int[] a = new int[10];
        for (int i = 0; i < line.length(); i++) {
            a[line.charAt(i) - '0']++;
        }

        System.out.println((a[4] == 0 && a[7] == 0) ? -1 : (a[4] >= a[7]) ? 4 : 7);
    }
}