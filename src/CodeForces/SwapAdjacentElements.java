package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @since 21-03-2022
 */

public class SwapAdjacentElements {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[] v = toIntArray(reader.readLine(), n);
        char[] s = reader.readLine().toCharArray();

        int max = 0;
        String ans = "YES";
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '1') {
                max = Math.max(max, v[i]);
            } else {
                max = Math.max(max, v[i]);
                if (max != i + 1) {
                    ans = "NO";
                    break;
                }
            }
        }

        System.out.println(ans);
    }

    private static int[] toIntArray(String string, int n) {
        int[] v = new int[n];

        StringTokenizer tokenizer = new StringTokenizer(string);
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(tokenizer.nextToken());
        }

        return v;
    }
}
