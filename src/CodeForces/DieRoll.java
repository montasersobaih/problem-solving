package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class DieRoll {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int y = parseInt(tokenizer.nextToken()), w = parseInt(tokenizer.nextToken());
        int max = 6 - Math.max(y, w) + 1;
        int gcd = gcd(max, 6);
        System.out.printf("%d/%d", max / gcd, 6 / gcd);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}
