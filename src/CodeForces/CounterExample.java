package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Long.parseLong;

public class CounterExample {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        long l = parseLong(tokenizer.nextToken());
        long r = parseLong(tokenizer.nextToken());

        for (long i = l; i <= r - 2; i++) {
            for (long j = l + 1; j <= r - 1; j++) {
                for (long k = j + 1; k <= r; k++) {
                    if (gcd(i, j) == 1 && gcd(j, k) == 1 && gcd(i, k) != 1) {
                        System.out.printf("%d %d %d\n", i, j, k);
                        System.exit(0);
                    }
                }
            }
        }

        System.out.println(-1);
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a;
            a = b;
            b = temp % b;
        }

        return a;
    }
}
