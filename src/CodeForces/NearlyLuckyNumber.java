package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @link https://codeforces.com/problemset/problem/110/A
 * @since 29-03-2022
 */

public class NearlyLuckyNumber {

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String line = b.readLine();

        int[] x = new int[11];
        for (int i = 0; i < line.length(); i++) {
            x[line.charAt(i) - '0']++;
        }

        System.out.println(((x[4] + x[7]) == 4 || (x[4] + x[7]) == 7) ? "YES" : "NO");
    }
}
