package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @link https://codeforces.com/problemset/problem/1/A
 * @since 29-03-2022
 */

public class TheatreSquare {

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        String[] x = b.readLine().split(" ");
        long x1 = Long.parseLong(x[0]);
        long x2 = Long.parseLong(x[1]);
        long x3 = Long.parseLong(x[2]);

        System.out.println((long) (Math.ceil(x1 * 1.0 / x3) * Math.ceil(x2 * 1.0 / x3)));
    }
}