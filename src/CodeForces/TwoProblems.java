package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoProblems {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int points = parseInt(tokenizer.nextToken()), duration = parseInt(tokenizer.nextToken());
        int p1 = parseInt(tokenizer.nextToken()), p2 = parseInt(tokenizer.nextToken());
        int dp1 = parseInt(tokenizer.nextToken()), dp2 = parseInt(tokenizer.nextToken());

        for (int i = 0, pp1 = p1; i < duration; i++, pp1 -= dp1) {
            for (int j = 0, pp2 = p2; j < duration; j++, pp2 -= dp2) {
                if (points == 0 || pp1 == points || pp2 == points || pp1 + pp2 == points) {
                    System.out.println("YES");
                    System.exit(0);
                }
            }
        }
        System.out.println("NO");
    }

    private static int parseInt(String convert) {
        return Integer.parseInt(convert);
    }
}