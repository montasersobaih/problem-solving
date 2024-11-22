package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @since 21-03-2022
 */

public class PowerWalking {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(reader.readLine());

        int[][] inputs = new int[tc][];
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(reader.readLine());
            inputs[i] = toIntArray(reader.readLine(), n);
            Arrays.sort(inputs[i]);
        }

        for (int i = 0; i < tc; i++) {
            int[] v = inputs[i];

            int count = 1;
            for (int j = 0; j < v.length - 1; j++) {
                if (v[j] != v[j + 1]) {
                    count++;
                }
            }

            StringJoiner joiner = new StringJoiner(" ");
            for (int j = 0; j < count; j++) {
                joiner.add(String.valueOf(count));
            }
            for (int j = count + 1; j <= v.length; j++) {
                joiner.add(String.valueOf(j));
            }

            System.out.println(joiner);
        }
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