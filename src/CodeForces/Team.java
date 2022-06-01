package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @link https://codeforces.com/problemset/problem/231/A
 * @since 29-03-2022
 */

public class Team {

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(b.readLine());
        int count = 0;
        while (loop-- > 0) {
            String str = b.readLine().replace(" ", "").replace("0", "");

            if (str.contains("11")) {
                count++;
            }
        }

        System.out.println(count);
    }
}