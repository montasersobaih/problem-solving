package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://codeforces.com/contest/37/problem/A">A. Towers</a>
 * @algorithm Frequency Array
 * @since 09-11-2022
 */

public class Towers {

    public static void main(String[] args) throws Exception {
        Reader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        int bars = Integer.parseInt(reader.readLine());

        int[] freq = new int[1001];

        int height = 0, towers = 0;
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < bars; i++) {
            int token = Integer.parseInt(tokenizer.nextToken());
            if (freq[token] == 0) {
                towers++;
            }

            height = Math.max(height, ++freq[token]);
        }

        System.out.printf("%d %d\n", height, towers);
    }
}
