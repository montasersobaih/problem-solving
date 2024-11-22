package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @link https://codeforces.com/problemset/problem/900/A
 * @since 29-03-2022
 */

public class FindExtraOne {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] FR = new int[2];
        int tc = Integer.parseInt(reader.readLine());
        while (tc-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

            int first = Integer.parseInt(tokenizer.nextToken());
            int second = Integer.parseInt(tokenizer.nextToken());

            if (first < 0) {
                FR[0]++;
            } else {
                FR[1]++;
            }
        }

        System.out.println((FR[0] <= 1 || FR[1] <= 1) ? "YES" : "NO");
    }
}