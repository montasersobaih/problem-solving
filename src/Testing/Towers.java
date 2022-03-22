package Testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Towers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] freq = new int[1001];

        int bars = parseInt(reader.readLine());

        int height = 0, towers = 0;
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < bars; i++) {
            int token = parseInt(tokenizer.nextToken());
            if (freq[token] == 0) {
                towers++;
            }

            height = Math.max(height, ++freq[token]);
        }

        System.out.printf("%d %d\n", height, towers);
    }

    private static int parseInt(String convert) {
        return Integer.parseInt(convert);
    }
}
