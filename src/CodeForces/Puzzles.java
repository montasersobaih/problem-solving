package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @link https://codeforces.com/problemset/problem/337/A
 * @since 29-03-2022
 */

public class Puzzles {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int x = Integer.parseInt(tokenizer.nextToken()) - 1;
        int y = Integer.parseInt(tokenizer.nextToken());

        int[] n = new int[y];

        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(n);

        int i = 0, min = Integer.MAX_VALUE;
        do {
            min = Math.min(min, n[i + x] - n[i]);
            i++;
        } while (i + x + 1 <= n.length);

        System.out.println(min);
    }
}
