package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @link https://codeforces.com/problemset/problem/75/A
 * @since 29-03-2022
 */

public class LifeWithoutZeros {

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String first = b.readLine();
        String second = b.readLine();
        String third = Integer.toString(Integer.parseInt(first) + Integer.parseInt(second));

        first = first.replace("0", "");
        second = second.replace("0", "");
        third = third.replace("0", "");

        System.out.println((Integer.parseInt(first) + Integer.parseInt(second) == Integer.parseInt(third)) ? "YES" : "NO");

        b.close();
        System.exit(0);
    }
}
