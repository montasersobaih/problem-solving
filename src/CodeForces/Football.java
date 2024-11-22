package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @link https://codeforces.com/problemset/problem/96/A
 * @since 29-03-2022
 */

public class Football {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        if (str.contains("0000000") || str.contains("1111111")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
