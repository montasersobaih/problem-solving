package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @link https://codeforces.com/problemset/problem/71/A
 * @since 29-03-2022
 */

public class WayTooLongWords {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        byte words = Byte.parseByte(reader.readLine());
        for (int i = 0; i < words; i++) {
            String x = reader.readLine();

            if (x.length() <= 10) {
                System.out.println(x);
            } else {
                System.out.println(x.substring(0, 1) + (x.length() - 2) + x.substring(x.length() - 1));
            }
        }
    }
}