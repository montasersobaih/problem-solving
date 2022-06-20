package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @link https://codeforces.com/problemset/problem/266/B
 * @since 29-03-2022
 */

public class QueueAtTheSchool {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int length = Integer.parseInt(tokenizer.nextToken());
        int loop = Integer.parseInt(tokenizer.nextToken());
        char[] c = reader.readLine().toCharArray();

        for (int i = 0; i < loop; i++) {
            boolean[] bool = new boolean[length];
            for (int j = 0; j < length - 1; j++) {
                if (c[j] == 'B' && c[j + 1] == 'G' && !bool[j]) {
                    char ch = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = ch;
                    bool[j + 1] = true;
                }
            }
        }

        System.out.println(new String(c));
    }
}